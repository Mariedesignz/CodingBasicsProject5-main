public class Zipcode extends ServiceCommunicator {
    public String zipcode;
    public String serviceURL;

    public Zipcode(String url, String serviceURL) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return this.serviceURL + this.zipcode;
    }

    public static void main(String[] args) {
        Zipcode i = new Zipcode("http://api.zippopotam.us/us/", "10011");
        System.out.println(i.getZipcode());
    }
}
