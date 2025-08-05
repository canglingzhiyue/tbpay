package anet.channel;

import tb.kge;

/* loaded from: classes2.dex */
public class SessionParamStat {
    public boolean isRetry;
    public String req;
    public int sessionFlag;

    static {
        kge.a(149201738);
    }

    public SessionParamStat(int i) {
        this.req = "";
        this.isRetry = false;
        this.sessionFlag = 0;
        this.sessionFlag = i;
    }

    public SessionParamStat(String str, boolean z) {
        this.req = "";
        this.isRetry = false;
        this.sessionFlag = 0;
        this.req = str;
        this.isRetry = z;
    }
}
