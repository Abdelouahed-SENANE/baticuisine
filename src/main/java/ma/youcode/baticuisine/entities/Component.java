package ma.youcode.baticuisine.entities;

import java.util.UUID;

public abstract class Component {

    private String componentId;
    private String componentName;
    private Project project;
    private Double vat;

    public Component(){}
    public String getComponentId() {
        return componentId;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }
    public Double getVat() {
        return vat;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }
}
