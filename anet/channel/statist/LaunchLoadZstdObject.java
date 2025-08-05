package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "launch_load_zstd")
/* loaded from: classes2.dex */
public class LaunchLoadZstdObject extends StatObject {
    @Dimension
    public String dictFile;
    @Dimension
    public String indexList;
    @Dimension
    public String type;
    @Dimension
    public int ret = 0;
    public int flag = -2;

    static {
        kge.a(1241601305);
    }

    public LaunchLoadZstdObject(String str) {
        this.type = str;
    }
}
