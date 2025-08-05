package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "okhttp_available")
/* loaded from: classes.dex */
public class OkHttpAvailableStat extends StatObject {
    @Dimension
    public String error;
    @Dimension
    public int ret;

    static {
        kge.a(1542099617);
    }

    public OkHttpAvailableStat(int i) {
        this.ret = i;
    }
}
