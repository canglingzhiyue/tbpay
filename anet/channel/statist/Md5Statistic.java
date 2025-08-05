package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "md5Statistic")
/* loaded from: classes2.dex */
public class Md5Statistic extends StatObject {
    @Dimension
    public int md5Ret = -1;
    @Dimension
    public volatile String refer;
    @Dimension
    public volatile int retryTimes;
    @Dimension
    public volatile String url;

    static {
        kge.a(877333098);
    }

    public Md5Statistic(int i, String str, String str2) {
        this.retryTimes = i;
        this.refer = str;
        this.url = str2;
    }
}
