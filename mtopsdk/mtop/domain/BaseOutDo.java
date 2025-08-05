package mtopsdk.mtop.domain;

import java.util.Arrays;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public abstract class BaseOutDo implements IMTOPDataObject {
    private String api;
    private String[] ret;
    private String v;

    static {
        kge.a(-654177017);
        kge.a(-350052935);
    }

    /* renamed from: getData */
    public abstract Object mo2429getData();

    public String getApi() {
        return this.api;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public String getV() {
        return this.v;
    }

    public void setV(String str) {
        this.v = str;
    }

    public String[] getRet() {
        return this.ret;
    }

    public void setRet(String[] strArr) {
        this.ret = strArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("BaseOutDo [api=");
        sb.append(this.api);
        sb.append(", v=");
        sb.append(this.v);
        sb.append(", ret=");
        sb.append(Arrays.toString(this.ret));
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
