package indi.joynic.joodoo.websupport.support;

public class RequestPath {
    private String val;

    public RequestPath(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public static RequestPath valueOf(final String val) {
        return new RequestPath(val);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RequestPath)) {
            return false;
        }

        RequestPath thatPath = (RequestPath) obj;
        return thatPath.getVal().equals(val);
    }
}