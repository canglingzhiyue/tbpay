package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class tcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f34017a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "netType=" + this.f34017a + ", apn=" + this.b + ", wifiSsid=" + this.c + ", carrier=" + this.d + ", isAirplaneMode=" + this.e + ", isWifiEnabled=" + this.f + ", isWifiRestricted=" + this.g + ", isCellularRestricted=" + this.h + ", proxyType=" + this.i + ", ipStack=" + this.j;
    }
}
