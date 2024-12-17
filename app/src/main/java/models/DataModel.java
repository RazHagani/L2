package models;

public class DataModel {

    private String name;
    private String version;
    private int image; // Integer
    private int id_;

    public DataModel(String name, String version, int image, int id_) {
        this.name = name;
        this.version = version;
        this.image = image;
        this.id_ = id_;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }
}








