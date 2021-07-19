package apollo;


public class Data {

    private String sid;

    private String pid;

    private String dat;

    public Data(String sid, String pid, String dat) {
        this.sid = sid;
        this.pid = pid;
        this.dat = dat;
    }

    @Override
    public String toString() {
        return "{" +
                "sid:" + sid +
                ", pid:" + pid +
                ", dat:" + dat +
                '}';
    }
}
