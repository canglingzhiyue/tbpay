package anet.channel.statist;

import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "PublicNetworkErrorStatistic")
/* loaded from: classes2.dex */
public class PublicNetworkErrorStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String scene;
    @Dimension
    public volatile String url;
    @Dimension
    public volatile String strArg1 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg2 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg3 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg4 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg5 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg6 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg7 = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public volatile String strArg8 = BuildConfig.RPC_TYPE_DEF;
    @Measure
    public volatile long val1 = -1;
    @Measure
    public volatile long val2 = -1;
    @Measure
    public volatile long val3 = -1;
    @Measure
    public volatile long val4 = -1;
    @Measure
    public volatile long val5 = -1;
    @Measure
    public volatile long val6 = -1;
    @Measure
    public volatile long val7 = -1;
    @Measure
    public volatile long val8 = -1;
    @Measure
    public volatile long val9 = -1;

    static {
        kge.a(104128277);
    }

    public PublicNetworkErrorStatistic(String str, String str2, String str3) {
        this.url = str2;
        this.host = str;
        this.scene = str3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[PublicNetworkErrorStatistic] url=");
        sb.append(this.url);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",scene=");
        sb.append(this.scene);
        sb.append(",arg1=");
        sb.append(this.strArg1);
        sb.append(",arg2=");
        sb.append(this.strArg2);
        sb.append(",arg3=");
        sb.append(this.strArg3);
        sb.append(",arg4=");
        sb.append(this.strArg4);
        sb.append(",arg5=");
        sb.append(this.strArg5);
        sb.append(",arg6=");
        sb.append(this.strArg6);
        sb.append(",arg7=");
        sb.append(this.strArg7);
        sb.append(",arg8=");
        sb.append(this.strArg8);
        sb.append(",val1=");
        sb.append(this.val1);
        sb.append(",val2=");
        sb.append(this.val2);
        sb.append(",val3=");
        sb.append(this.val3);
        sb.append(",val4=");
        sb.append(this.val4);
        sb.append(",val5=");
        sb.append(this.val5);
        sb.append(",val6=");
        sb.append(this.val6);
        sb.append(",val7=");
        sb.append(this.val7);
        sb.append(",val8=");
        sb.append(this.val8);
        sb.append(",val9=");
        sb.append(this.val9);
        return sb.toString();
    }
}
