import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Codes {

    @SerializedName("admin_district")
    @Expose
    private String adminDistrict;
    @SerializedName("admin_county")
    @Expose
    private String adminCounty;
    @SerializedName("admin_ward")
    @Expose
    private String adminWard;
    @SerializedName("parish")
    @Expose
    private String parish;
    @SerializedName("parliamentary_constituency")
    @Expose
    private String parliamentaryConstituency;
    @SerializedName("ccg")
    @Expose
    private String ccg;
    @SerializedName("ccg_id")
    @Expose
    private String ccgId;
    @SerializedName("ced")
    @Expose
    private String ced;
    @SerializedName("nuts")
    @Expose
    private String nuts;
    @SerializedName("lsoa")
    @Expose
    private String lsoa;
    @SerializedName("msoa")
    @Expose
    private String msoa;
    @SerializedName("lau2")
    @Expose
    private String lau2;

    public String getAdminDistrict() {
        return adminDistrict;
    }

    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    public String getAdminCounty() {
        return adminCounty;
    }

    public void setAdminCounty(String adminCounty) {
        this.adminCounty = adminCounty;
    }

    public String getAdminWard() {
        return adminWard;
    }

    public void setAdminWard(String adminWard) {
        this.adminWard = adminWard;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    public void setParliamentaryConstituency(String parliamentaryConstituency) {
        this.parliamentaryConstituency = parliamentaryConstituency;
    }

    public String getCcg() {
        return ccg;
    }

    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    public String getCcgId() {
        return ccgId;
    }

    public void setCcgId(String ccgId) {
        this.ccgId = ccgId;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public String getLsoa() {
        return lsoa;
    }

    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    public String getLau2() {
        return lau2;
    }

    public void setLau2(String lau2) {
        this.lau2 = lau2;
    }

}
