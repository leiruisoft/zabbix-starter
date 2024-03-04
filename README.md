# zabbix-starter

#### 介绍
二次封装zabbix的starter，基于springboot

#### 使用说明

1.  pom.xml引入依赖

            <dependency>
                <groupId>com.arcvideo</groupId>
                <artifactId>zabbix-starter</artifactId>
                <version>1.0-SNAPSHOT</version>
            </dependency>

2.  application.yml配置参数
  
  url：zabbix的服务地址
  auth:zabbix超级管理员登录zabbix管理后台，新增一个对接账号并且设置账号永久登录（不退出）。
  此时账号登录之后在数据库对应的用户表中即可获取到永不过期的token（即该auth）

            zabbix:
              url: http://172.17.22.111/zabbix/api_jsonrpc.php
              auth: dd871337c5638a8ed4369d032b2cbf9c

3.  代码

公共抽象类

        public abstract class ZabbixService {
        
            @Autowired
            protected ZabbixTemplate zabbixTemplate;
        
            protected Object call(ZabbixRequest zabbixRequest) {
                Object execute = zabbixTemplate.execute(connection -> {
                    ZabbixResponse response = connection.execute(zabbixRequest);
                    return response.getResult();
                });
        
                return execute;
            }
        }
        
主机操作方法

        @Service
        public class ZbHostService extends ZabbixService {
        
            public List<String> hostCreate(HostCreateRequest hostCreateRequest) {
                Object execute = call(hostCreateRequest);
                JSONObject jsonObject = new JSONObject(execute);
                if (jsonObject.containsKey("hostids")) {
                    return (List<String>) jsonObject.get("hostids");
                }
        
                return null;
            }
        
        
            public List<String> hostDelete(String zbHostid) {
                HostDeleteRequest hostDeleteRequest = new HostDeleteRequest();
                hostDeleteRequest.getParams().add(zbHostid);
                Object execute = call(hostDeleteRequest);
                JSONObject jsonObject = new JSONObject(execute);
                if (jsonObject.containsKey("hostids")) {
                    return (List<String>) jsonObject.get("hostids");
                }
        
                return null;
            }
        
        
            public List<String> hostUpdate(HostUpdateRequest hostUpdateRequest) {
                Object execute = call(hostUpdateRequest);
                JSONObject jsonObject = new JSONObject(execute);
                if (jsonObject.containsKey("hostids")) {
                    return (List<String>) jsonObject.get("hostids");
                }
        
                return null;
            }
        }
        
        
历史记录操作方法

        @Service
        public class ZbHistoryService extends ZabbixService {
        
            /**
             * 历史信息
             *
             * @param historyGetRequest
             * @param type
             * @return
             */
            public List<IntegerHistory> integerHistoryGetBean(HistoryGetRequest historyGetRequest, int type) {
                Object execute = call(historyGetRequest);
                JSONArray array = new JSONArray(execute);
                List<IntegerHistory> list = new ArrayList<>();
                for (int i = 0; i < array.size(); i++) {
                    JSONObject data = array.getJSONObject(i);
                    IntegerHistory record = new IntegerHistory();
                    record.setClock(data.getStr("clock"));
                    record.setItemid(data.getStr("itemid"));
                    record.setNs(data.getInt("ns"));
                    record.setValue(data.getInt("value"));
                    record.setType(type);
                    list.add(record);
                }
        
                return list;
            }
        
            /**
             * 历史信息
             *
             * @param historyGetRequest
             * @param type
             * @return
             */
            public List<History> historyGetBean(HistoryGetRequest historyGetRequest, int type) {
                Object execute = call(historyGetRequest);
                JSONArray array = new JSONArray(execute);
                List<History> list = new ArrayList<>();
                for (int i = 0; i < array.size(); i++) {
                    JSONObject data = array.getJSONObject(i);
                    History record = new History();
                    record.setClock(data.getStr("clock"));
                    record.setItemid(data.getStr("itemid"));
                    record.setNs(data.getInt("ns"));
                    record.setValue(data.getStr("value"));
                    record.setType(type);
                    list.add(record);
                }
        
                return list;
            }
        }
