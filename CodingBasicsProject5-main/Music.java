public class Music extends ServiceCommunicator{
    public String music;
    public String serviceURL;

    public Music(String serviceURL) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.music = music;
    }
    public String getMusic() {
        return this.serviceURL + this.music;
    }

    public static void main(String[] args) {
        Music i = new Music("https://itunes.apple.com/search?term=" + "bbking" + "\\&limit=1");
    }
}
