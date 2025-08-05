package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "cookieMonitor")
/* loaded from: classes2.dex */
public class CookieMonitorStat extends StatObject {
    @Dimension
    public String cookieName;
    @Dimension
    public String cookieText;
    @Dimension
    public int missType;
    @Dimension
    public String setCookie;
    @Dimension
    public String url;

    static {
        kge.a(-1981807662);
    }

    public CookieMonitorStat(String str) {
        this.url = str;
    }
}
