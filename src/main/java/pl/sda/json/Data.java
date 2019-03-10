package pl.sda.json;


/**
 * @author Jarek Czaplicki
 */


public class Data {
    private String fall;
    private String computed_region_cbhk_fwbd;
    private String computed_region_nnqa_25f4;
    private Geolocation geolocation;
    private String id;
    private String mass;
    private String name;
    private String nametype;
    private String recclass;
    private String reclat;
    private String reclong;
    private String year;

    public Data(String fall, String computed_region_cbhk_fwbd,
                String computed_region_nnqa_25f4, Geolocation geolocation, String id,
                String mass, String name, String nametype, String recclass, String reclat,
                String reclong, String year) {
        this.fall = fall;
        this.computed_region_cbhk_fwbd = computed_region_cbhk_fwbd;
        this.computed_region_nnqa_25f4 = computed_region_nnqa_25f4;
        this.geolocation = geolocation;
        this.id = id;
        this.mass = mass;
        this.name = name;
        this.nametype = nametype;
        this.recclass = recclass;
        this.reclat = reclat;
        this.reclong = reclong;
        this.year = year;
    }

    public Data() {}

    public String getFall() {
        return fall;
    }

    public void setFall(String fall) {
        this.fall = fall;
    }

    public String getComputed_region_cbhk_fwbd() {
        return computed_region_cbhk_fwbd;
    }

    public void setComputed_region_cbhk_fwbd(String computed_region_cbhk_fwbd) {
        this.computed_region_cbhk_fwbd = computed_region_cbhk_fwbd;
    }

    public String getComputed_region_nnqa_25f4() {
        return computed_region_nnqa_25f4;
    }

    public void setComputed_region_nnqa_25f4(String computed_region_nnqa_25f4) {
        this.computed_region_nnqa_25f4 = computed_region_nnqa_25f4;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNametype() {
        return nametype;
    }

    public void setNametype(String nametype) {
        this.nametype = nametype;
    }

    public String getRecclass() {
        return recclass;
    }

    public void setRecclass(String recclass) {
        this.recclass = recclass;
    }

    public String getReclat() {
        return reclat;
    }

    public void setReclat(String reclat) {
        this.reclat = reclat;
    }

    public String getReclong() {
        return reclong;
    }

    public void setReclong(String reclong) {
        this.reclong = reclong;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
