package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ndq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ndq f31371a;
    private String i;
    private String b = "false";
    private String c = "20";
    private String d = "60";
    private String e = "100";
    private String f = "false";
    private String g = "true";
    private String h = "DEFAULT_OFF";
    private String j = "30";
    private String k = "60";
    private String l = "off";
    private String m = "off";
    private String n = "off";
    private String o = "off";
    private String p = "06:00";
    private String q = "06:00";

    static {
        kge.a(91308911);
        f31371a = null;
    }

    public static ndq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ndq) ipChange.ipc$dispatch("f082b03", new Object[0]);
        }
        if (f31371a == null) {
            f31371a = new ndq();
        }
        return f31371a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.g;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.h;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConfigParams [gatherSwitch=" + this.b + ", gatherNormalRate=" + this.c + ", gatherDemoteRate=" + this.d + ", accuracy=" + this.e + ", channelSwitch=" + this.f + ", reportSwitch=" + this.g + ", clientSwitchStatus=" + this.h + ", timeTap=" + this.i + ", reportNormalRate=" + this.j + ", reportDemoteRate=" + this.k + ", no_network_navigation_switch=" + this.l + ", geo_fencing_switch=" + this.m + ", gaode_navigation_switch=" + this.n + ", location_report_switch=" + this.o + ", no_network_navigation_pull_data_time=" + this.p + ", geo_fencing_pull_data_time=" + this.q + riy.ARRAY_END_STR;
    }
}
