package com.lrsoft.starter.zabbix.domain.configuration;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;

public class ConfigurationImportRequest extends ZabbixRequest {
  public ConfigurationImportRequest() {
    super("configuration.import");
  }

  private ConfigurationImportParams params = new ConfigurationImportParams();

  public void setParams(ConfigurationImportParams params) {
    this.params = params;
  }

  public ConfigurationImportParams getParams() {
    return params;
  }

  public static class ConfigurationImportParams {
    private String format;
    private String source;
    private Rules rules = new Rules();

    public String getFormat() {
      return format;
    }

    public void setFormat(String format) {
      this.format = format;
    }

    public String getSource() {
      return source;
    }

    public void setSource(String source) {
      this.source = source;
    }

    public Rules getRules() {
      return rules;
    }

    public void setRules(Rules rules) {
      this.rules = rules;
    }
  }

  public static class Rules {
    private Applications applications;
    private DiscoveryRules discoveryRules;
    private Graphs graphs;
    private Groups groups;
    private Hosts hosts;
    private Images images;
    private Items items;
    private Maps maps;
    private Screens screens;
    private TemplateLinkage templateLinkage;
    private Templates templates;
    private TemplateScreens templateScreens;
    private Triggers triggers;
    private ValueMaps valueMaps;

    public Applications getApplications() {
      if (null == applications) {
        applications = new Applications();
      }
      return applications;
    }

    public void setApplications(Applications applications) {
      this.applications = applications;
    }

    public DiscoveryRules getDiscoveryRules() {
      if (null == discoveryRules) {
        discoveryRules = new DiscoveryRules();
      }
      return discoveryRules;
    }

    public void setDiscoveryRules(DiscoveryRules discoveryRules) {
      this.discoveryRules = discoveryRules;
    }

    public Graphs getGraphs() {
      return graphs;
    }

    public void setGraphs(Graphs graphs) {
      this.graphs = graphs;
    }

    public Groups getGroups() {
      if (null == groups) {
        groups = new Groups();
      }
      return groups;
    }

    public void setGroups(Groups groups) {
      this.groups = groups;
    }

    public Hosts getHosts() {
      if (null == hosts) {
        hosts = new Hosts();
      }
      return hosts;
    }

    public void setHosts(Hosts hosts) {
      this.hosts = hosts;
    }

    public Images getImages() {
      return images;
    }

    public void setImages(Images images) {
      this.images = images;
    }

    public Items getItems() {
      if (null == items) {
        items = new Items();
      }
      return items;
    }

    public void setItems(Items items) {
      this.items = items;
    }

    public Maps getMaps() {
      return maps;
    }

    public void setMaps(Maps maps) {
      this.maps = maps;
    }

    public Screens getScreens() {
      return screens;
    }

    public void setScreens(Screens screens) {
      this.screens = screens;
    }

    public TemplateLinkage getTemplateLinkage() {
      return templateLinkage;
    }

    public void setTemplateLinkage(TemplateLinkage templateLinkage) {
      this.templateLinkage = templateLinkage;
    }

    public Templates getTemplates() {
      if (null == templates) {
        templates = new Templates();
      }
      return templates;
    }

    public void setTemplates(Templates templates) {
      this.templates = templates;
    }

    public TemplateScreens getTemplateScreens() {
      return templateScreens;
    }

    public void setTemplateScreens(TemplateScreens templateScreens) {
      this.templateScreens = templateScreens;
    }

    public Triggers getTriggers() {
      return triggers;
    }

    public void setTriggers(Triggers triggers) {
      this.triggers = triggers;
    }

    public ValueMaps getValueMaps() {
      return valueMaps;
    }

    public void setValueMaps(ValueMaps valueMaps) {
      this.valueMaps = valueMaps;
    }
  }


  public static class Applications {
    private Boolean createMissing;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class DiscoveryRules {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class Graphs {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class Groups {
    private Boolean createMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }
  }

  public static class Hosts {
    private Boolean createMissing;
    private Boolean updateExisting;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }
  }

  public static class Images {
    private Boolean createMissing;
    private Boolean updateExisting;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }
  }

  public static class Items {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class Maps {
    private Boolean createMissing;
    private Boolean updateExisting;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }
  }

  public static class Screens {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class TemplateLinkage {
    private Boolean createMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }
  }

  public static class Templates {
    private Boolean createMissing;
    private Boolean updateExisting;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }
  }

  public static class TemplateScreens {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class Triggers {
    private Boolean createMissing;
    private Boolean updateExisting;
    private Boolean deleteMissing;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }

    public Boolean getDeleteMissing() {
      return deleteMissing;
    }

    public void setDeleteMissing(Boolean deleteMissing) {
      this.deleteMissing = deleteMissing;
    }
  }

  public static class ValueMaps {
    private Boolean createMissing;
    private Boolean updateExisting;

    public Boolean getCreateMissing() {
      return createMissing;
    }

    public void setCreateMissing(Boolean createMissing) {
      this.createMissing = createMissing;
    }

    public Boolean getUpdateExisting() {
      return updateExisting;
    }

    public void setUpdateExisting(Boolean updateExisting) {
      this.updateExisting = updateExisting;
    }
  }
}
