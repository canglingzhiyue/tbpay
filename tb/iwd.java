package tb;

import android.content.Context;
import android.net.wifi.WifiManager;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.Inet64Util;
import anetwork.channel.monitor.NetworkMetricsHelper;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.i;
import com.taobao.falco.FalcoEnvironment;

/* loaded from: classes7.dex */
public class iwd implements NetworkStatusHelper.INetworkStatusChangeListener, NetworkStatusHelper.IVpnProxyStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FalcoEnvironment f29360a;
    private volatile a b = new a(new tcc());
    private volatile boolean c;
    private boolean d;

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29364a = tmt.a();
        public final tcc b;

        public a(tcc tccVar) {
            this.b = tccVar;
        }
    }

    private static int b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90ff881c", new Object[]{new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 2;
        }
        return z2 ? 1 : 0;
    }

    public static /* synthetic */ void a(iwd iwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7d2a22", new Object[]{iwdVar});
        } else {
            iwdVar.c();
        }
    }

    public static /* synthetic */ void a(iwd iwdVar, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1543573", new Object[]{iwdVar, networkStatus});
        } else {
            iwdVar.a(networkStatus);
        }
    }

    public static /* synthetic */ void a(iwd iwdVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f18422", new Object[]{iwdVar, new Boolean(z), new Boolean(z2)});
        } else {
            iwdVar.a(z, z2);
        }
    }

    public iwd(FalcoEnvironment falcoEnvironment) {
        this.f29360a = falcoEnvironment;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        dit.g(new Runnable() { // from class: tb.iwd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    iwd.a(iwd.this);
                }
            }
        });
        NetworkStatusHelper.addStatusChangeListener(this);
        NetworkStatusHelper.registerVpnProxyStatusListener(this);
    }

    public tcc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcc) ipChange.ipc$dispatch("f0adfca", new Object[]{this}) : this.b.b;
    }

    public tcd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcd) ipChange.ipc$dispatch("16bc8548", new Object[]{this});
        }
        double srttAvgCDN = NetworkMetricsHelper.getSrttAvgCDN();
        double srttMaxCDN = NetworkMetricsHelper.getSrttMaxCDN();
        double srttMinCDN = NetworkMetricsHelper.getSrttMinCDN();
        double srttAvgIDC = NetworkMetricsHelper.getSrttAvgIDC();
        double srttMaxIDC = NetworkMetricsHelper.getSrttMaxIDC();
        double srttMinIDC = NetworkMetricsHelper.getSrttMinIDC();
        double frttAvgCDN = NetworkMetricsHelper.getFrttAvgCDN();
        double frttMaxCDN = NetworkMetricsHelper.getFrttMaxCDN();
        double frttMinCDN = NetworkMetricsHelper.getFrttMinCDN();
        double frttAvgIDC = NetworkMetricsHelper.getFrttAvgIDC();
        double frttMaxIDC = NetworkMetricsHelper.getFrttMaxIDC();
        double frttMinIDC = NetworkMetricsHelper.getFrttMinIDC();
        double lossratioAvgCDN = NetworkMetricsHelper.getLossratioAvgCDN();
        double lossratioMaxCDN = NetworkMetricsHelper.getLossratioMaxCDN();
        double lossratioAvgIDC = NetworkMetricsHelper.getLossratioAvgIDC();
        double lossratioMaxIDC = NetworkMetricsHelper.getLossratioMaxIDC();
        tcd tcdVar = new tcd();
        if (Double.isNaN(srttAvgCDN)) {
            srttAvgCDN = -1.0d;
        }
        tcdVar.f34018a = srttAvgCDN;
        if (Double.isNaN(srttMaxCDN)) {
            srttMaxCDN = -1.0d;
        }
        tcdVar.b = srttMaxCDN;
        if (Double.isNaN(srttMinCDN)) {
            srttMinCDN = -1.0d;
        }
        tcdVar.c = srttMinCDN;
        if (Double.isNaN(srttAvgIDC)) {
            srttAvgIDC = -1.0d;
        }
        tcdVar.d = srttAvgIDC;
        if (Double.isNaN(srttMaxIDC)) {
            srttMaxIDC = -1.0d;
        }
        tcdVar.e = srttMaxIDC;
        if (Double.isNaN(srttMinIDC)) {
            srttMinIDC = -1.0d;
        }
        tcdVar.f = srttMinIDC;
        if (Double.isNaN(frttAvgCDN)) {
            frttAvgCDN = -1.0d;
        }
        tcdVar.g = frttAvgCDN;
        tcdVar.h = Double.isNaN(frttMaxCDN) ? -1.0d : frttMaxCDN;
        tcdVar.i = Double.isNaN(frttMinCDN) ? -1.0d : frttMinCDN;
        tcdVar.j = Double.isNaN(frttAvgIDC) ? -1.0d : frttAvgIDC;
        tcdVar.k = Double.isNaN(frttMaxIDC) ? -1.0d : frttMaxIDC;
        tcdVar.l = Double.isNaN(frttMinIDC) ? -1.0d : frttMinIDC;
        tcdVar.m = Double.isNaN(lossratioAvgCDN) ? -1.0d : lossratioAvgCDN;
        tcdVar.n = Double.isNaN(lossratioMaxCDN) ? -1.0d : lossratioMaxCDN;
        tcdVar.o = Double.isNaN(lossratioAvgIDC) ? -1.0d : lossratioAvgIDC;
        tcdVar.p = Double.isNaN(lossratioMaxIDC) ? -1.0d : lossratioMaxIDC;
        tcdVar.q = NetworkMetricsHelper.getRecentWinCount();
        tcdVar.r = NetworkMetricsHelper.getRecentWinFail();
        tcdVar.s = NetworkMetricsHelper.getRecentWinBWE();
        tcdVar.t = NetworkMetricsHelper.getMtuCDN();
        tcdVar.u = NetworkMetricsHelper.getMtuIDC();
        tcdVar.v = NetworkMetricsHelper.getSignalDBM();
        tcdVar.w = NetworkMetricsHelper.getSignalRSSI();
        tcdVar.x = NetworkMetricsHelper.getSignalSINR();
        tcdVar.y = NetworkMetricsHelper.getSore();
        return tcdVar;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(final NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else {
            dit.g(new Runnable() { // from class: tb.iwd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwd.a(iwd.this, networkStatus);
                    }
                }
            });
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
    public void onVpnProxyStatusChanged(final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            dit.g(new Runnable() { // from class: tb.iwd.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwd.a(iwd.this, z, z2);
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        tcc b = b(NetworkStatusHelper.getStatus());
        a aVar = new a(b);
        a(aVar, "NetworkInfo Init|" + b);
    }

    private void a(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbd5c6d", new Object[]{this, networkStatus});
            return;
        }
        tcc b = b(networkStatus);
        a aVar = new a(b);
        a(aVar, "NetworkInfo Update|" + b);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        tcc tccVar = this.b.b;
        tcc tccVar2 = new tcc();
        tccVar2.f34017a = tccVar.f34017a;
        tccVar2.b = tccVar.b;
        tccVar2.c = tccVar.c;
        tccVar2.d = tccVar.d;
        tccVar2.e = tccVar.e;
        tccVar2.f = tccVar.f;
        tccVar2.g = tccVar.h;
        tccVar2.h = tccVar.h;
        tccVar2.i = b(z, z2);
        tccVar2.j = tccVar.j;
        a aVar = new a(tccVar2);
        a(aVar, "NetworkInfo Update|proxyType=" + tccVar2.i);
    }

    private void a(a aVar, String str) {
        String str2;
        iwd iwdVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42c444f", new Object[]{iwdVar, aVar, str});
            return;
        }
        iwdVar.b = aVar;
        if (iwdVar.d) {
            if (!iwdVar.c) {
                iwdVar.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("isAirplaneMode");
                create.addMeasure("isWifiEnabled");
                create.addMeasure("isWifiRestricted");
                create.addMeasure("isCellularRestricted");
                create.addMeasure("proxyType");
                create.addMeasure("ipStack");
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                create2.addDimension("netType");
                create2.addDimension("apn");
                create2.addDimension("wifiSsid");
                create2.addDimension(DispatchConstants.CARRIER);
                str2 = DispatchConstants.CARRIER;
                AppMonitor.register("falco", "falco_network", create, create2, true);
            } else {
                str2 = DispatchConstants.CARRIER;
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            create3.setValue("isAirplaneMode", aVar.b.e);
            create3.setValue("isWifiEnabled", aVar.b.f);
            create3.setValue("isWifiRestricted", aVar.b.g);
            create3.setValue("isCellularRestricted", aVar.b.h);
            create3.setValue("proxyType", aVar.b.i);
            create3.setValue("ipStack", aVar.b.j);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue("falcoId", aVar.f29364a);
            create4.setValue("netType", aVar.b.f34017a);
            create4.setValue("apn", aVar.b.b);
            create4.setValue("wifiSsid", aVar.b.c);
            create4.setValue(str2, aVar.b.d);
            AppMonitor.Stat.commit("falco", "falco_network", create4, create3);
            iwdVar = this;
            iwdVar.f29360a.a(FalcoEnvironment.Category.NETWORK, aVar.f29364a);
        }
        iwdVar.f29360a.a(str);
    }

    private static tcc b(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcc) ipChange.ipc$dispatch("47f34be6", new Object[]{networkStatus});
        }
        String type = networkStatus.getType();
        tcc tccVar = new tcc();
        if ("NONE".equals(type) || "NO".equals(type)) {
            type = "NoNetwork";
        }
        tccVar.f34017a = type;
        tccVar.b = NetworkStatusHelper.getApn();
        tccVar.c = NetworkStatusHelper.getWifiSSID();
        tccVar.d = NetworkStatusHelper.getCarrier();
        tccVar.e = NetworkStatusHelper.isAirplaneMode();
        tccVar.f = d();
        tccVar.g = NetworkStatusHelper.isWifiRestricted();
        tccVar.h = NetworkStatusHelper.isCellularRestricted();
        tccVar.i = b(NetworkStatusHelper.isVpn(), NetworkStatusHelper.isProxy());
        tccVar.j = Inet64Util.getStackType();
        return tccVar;
    }

    private static int d() {
        WifiManager wifiManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        Context a2 = i.a();
        if (a2 == null || (wifiManager = (WifiManager) a2.getApplicationContext().getSystemService("wifi")) == null) {
            return -1;
        }
        return wifiManager.isWifiEnabled() ? 1 : 0;
    }
}
