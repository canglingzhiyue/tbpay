package com.network.diagnosis.model;

import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.alm;
import tb.aln;
import tb.czd;

/* loaded from: classes4.dex */
public class NetworkAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_QUALITY_EVENT_LISTENER = "addQualityEventListener";
    public static final String API_ADD_TYPE_EVENT_LISTENER = "addTypeEventListener";
    public static final String API_GET_DOWNLINK = "getDownlink";
    public static final String API_GET_NETWORK_STATUS = "getNetStatus";
    public static final String API_GET_PREDICT_DOWNLINK = "getPredictDownlink";
    public static final String API_GET_QUALITY_LEVEL = "getQualityLevel";
    public static final String API_GET_TYPE = "getType";
    public static final String API_REGISTER_NETWORK_LISTENER = "registerNetStatusListener";
    public static final String API_REMOVE_QUALITY_EVENT_LISTENER = "removeQualityEventListener";
    public static final String API_REMOVE_TYPE_EVENT_LISTENER = "removeTypeEventListener";

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f8026a = new AtomicBoolean(false);
    private List<aln> b = new CopyOnWriteArrayList();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private List<aln> d = new CopyOnWriteArrayList();
    private Map<String, List<aln>> e = new HashMap();
    private Map<String, a> f = new HashMap();
    private c g;
    private b h;

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? "unknow" : "excellent" : "normal" : "poor";
    }

    public static /* synthetic */ Object ipc$super(NetworkAbility networkAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(NetworkAbility networkAbility, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("927cc8a5", new Object[]{networkAbility, new Integer(i)}) : networkAbility.a(i);
    }

    public static /* synthetic */ String a(NetworkAbility networkAbility, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61a84e13", new Object[]{networkAbility, networkStatus}) : networkAbility.a(networkStatus);
    }

    public static /* synthetic */ List a(NetworkAbility networkAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e13c929f", new Object[]{networkAbility}) : networkAbility.b;
    }

    public static /* synthetic */ void a(NetworkAbility networkAbility, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14adde43", new Object[]{networkAbility, new Integer(i), new Double(d)});
        } else {
            networkAbility.a(i, d);
        }
    }

    public static /* synthetic */ void a(NetworkAbility networkAbility, String str, int i, double d, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba104d7", new Object[]{networkAbility, str, new Integer(i), new Double(d), new Long(j)});
        } else {
            networkAbility.a(str, i, d, j);
        }
    }

    public static /* synthetic */ List b(NetworkAbility networkAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5f9d967e", new Object[]{networkAbility}) : networkAbility.d;
    }

    public static /* synthetic */ void b(NetworkAbility networkAbility, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90e9f0c", new Object[]{networkAbility, networkStatus});
        } else {
            networkAbility.b(networkStatus);
        }
    }

    private void a(aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03fee55", new Object[]{this, alnVar});
            return;
        }
        if (this.f8026a.compareAndSet(false, true)) {
            this.g = new c(this);
            NetworkStatusHelper.addStatusChangeListener(this.g);
        }
        this.b.add(alnVar);
    }

    private String a(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa7d5fd3", new Object[]{this, networkStatus});
        }
        if (networkStatus == NetworkStatusHelper.NetworkStatus.NO) {
            return "NoNetwork";
        }
        if (networkStatus.isMobile()) {
            return networkStatus.getType();
        }
        return networkStatus.isWifi() ? "WiFi" : "NETWORK_UNKNOWN";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r9.equals(com.network.diagnosis.model.NetworkAbility.API_REMOVE_TYPE_EVENT_LISTENER) != false) goto L15;
     */
    @Override // com.alibaba.ability.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r9, tb.als r10, java.util.Map<java.lang.String, ?> r11, tb.aln r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.model.NetworkAbility.execute(java.lang.String, tb.als, java.util.Map, tb.aln):com.alibaba.ability.result.ExecuteResult");
    }

    private void b(final NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c127cc", new Object[]{this, networkStatus});
        } else if (this.b.isEmpty()) {
        } else {
            e.a(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, NetworkAbility.a(NetworkAbility.this, networkStatus));
                    for (aln alnVar : NetworkAbility.a(NetworkAbility.this)) {
                        alnVar.a(new ExecutingResult(hashMap));
                        alnVar.a(new ExecutingResult(hashMap, "onChange"));
                    }
                }
            }, -1L);
        }
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f8026a.compareAndSet(true, false)) {
        } else {
            NetworkStatusHelper.removeStatusChangeListener(this.g);
            this.b.clear();
            this.g = null;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.c.compareAndSet(true, false)) {
            NetworkQualityMonitor.getInstance().unregisterGlobalNetworkQualityListener(this.h);
            this.d.clear();
            this.h = null;
        }
        for (String str : this.f.keySet()) {
            NetworkQualityMonitor.getInstance().unregisterDomainNetworkQualityListener(str, this.f.get(str));
        }
        this.f.clear();
        this.e.clear();
    }

    private FinishResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("fc57c9df", new Object[]{this});
        }
        String a2 = a(NetworkStatusHelper.getStatus());
        HashMap hashMap = new HashMap();
        hashMap.put("result", a2);
        return new FinishResult(hashMap);
    }

    private FinishResult a(Map<String, ?> map) {
        int globalNetworkQuality;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("8be15192", new Object[]{this, map});
        }
        String a2 = e.a((Map<String, ? extends Object>) map, "host", (String) null);
        if (a2 == null || a2.isEmpty()) {
            globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        } else {
            globalNetworkQuality = NetworkQualityMonitor.getDomainNetworkQuality(a2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", a(globalNetworkQuality));
        return new FinishResult(hashMap);
    }

    private void a(Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80030f0a", new Object[]{this, map, alnVar});
            return;
        }
        List<aln> list = null;
        String a2 = e.a((Map<String, ? extends Object>) map, "host", (String) null);
        if (a2 == null || a2.isEmpty()) {
            if (this.c.compareAndSet(false, true)) {
                this.h = new b(this);
                if (!NetworkQualityMonitor.getInstance().registerGlobalNetworkQualityListener(this.h)) {
                    alnVar.a(new ErrorResult("1001", com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14027)));
                    return;
                }
            }
            this.d.add(alnVar);
            return;
        }
        if (this.f.get(a2) == null) {
            a aVar = new a(this);
            if (!NetworkQualityMonitor.getInstance().registerDomainNetworkQualityListener(a2, aVar)) {
                alnVar.a(new ErrorResult("1002", com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14032)));
                return;
            }
            this.f.put(a2, aVar);
        }
        if (this.e.containsKey(a2)) {
            list = this.e.get(a2);
        }
        if (list == null) {
            list = new ArrayList<>();
            this.e.put(a2, list);
        }
        list.add(alnVar);
    }

    private void a(final int i, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114003", new Object[]{this, new Integer(i), new Double(d)});
        } else if (this.d.isEmpty()) {
        } else {
            e.a(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("level", NetworkAbility.a(NetworkAbility.this, i));
                    hashMap.put("downlink", Double.valueOf(d));
                    for (aln alnVar : NetworkAbility.b(NetworkAbility.this)) {
                        alnVar.a(new ExecutingResult(hashMap, "onChange"));
                    }
                }
            }, -1L);
        }
    }

    private void a(String str, final int i, final double d, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f8cb17", new Object[]{this, str, new Integer(i), new Double(d), new Long(j)});
            return;
        }
        final List<aln> list = this.e.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        e.a(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("level", NetworkAbility.a(NetworkAbility.this, i));
                hashMap.put("downlink", Double.valueOf(d));
                hashMap.put("srtt", Long.valueOf(j));
                for (aln alnVar : list) {
                    alnVar.a(new ExecutingResult(hashMap, "onChange"));
                }
            }
        }, -1L);
    }

    private FinishResult b(Map<String, ?> map) {
        double globalCurrentBandwidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("91e51cf1", new Object[]{this, map});
        }
        String a2 = e.a((Map<String, ? extends Object>) map, "host", (String) null);
        if (a2 == null || a2.isEmpty()) {
            globalCurrentBandwidth = NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth();
        } else {
            globalCurrentBandwidth = NetworkQualityMonitor.getInstance().getDomainCurrentBandwidth(a2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Double.valueOf(globalCurrentBandwidth));
        return new FinishResult(hashMap);
    }

    private FinishResult c(Map<String, ?> map) {
        double globalPredictBandWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("97e8e850", new Object[]{this, map});
        }
        String a2 = e.a((Map<String, ? extends Object>) map, "host", (String) null);
        if (a2 == null || a2.isEmpty()) {
            globalPredictBandWidth = NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
        } else {
            globalPredictBandWidth = NetworkQualityMonitor.getInstance().getDomainPredictBandwidth(a2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Double.valueOf(globalPredictBandWidth));
        return new FinishResult(hashMap);
    }

    /* loaded from: classes4.dex */
    public static final class c implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<NetworkAbility> f8034a;

        public static /* synthetic */ WeakReference a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("91eaa6d7", new Object[]{cVar}) : cVar.f8034a;
        }

        public c(NetworkAbility networkAbility) {
            this.f8034a = new WeakReference<>(networkAbility);
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(final NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else {
                czd.b(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        NetworkAbility networkAbility = (NetworkAbility) c.a(c.this).get();
                        if (networkAbility == null) {
                            return;
                        }
                        NetworkAbility.b(networkAbility, networkStatus);
                    }
                });
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements NetworkQualityMonitor.IGlobalNetworkQualityListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<NetworkAbility> f8032a;

        public static /* synthetic */ WeakReference a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("9ba66f8", new Object[]{bVar}) : bVar.f8032a;
        }

        public b(NetworkAbility networkAbility) {
            this.f8032a = new WeakReference<>(networkAbility);
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IGlobalNetworkQualityListener
        public void onNetworkQualityChanged(final int i, final double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d676f46", new Object[]{this, new Integer(i), new Double(d)});
            } else {
                czd.b(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        NetworkAbility networkAbility = (NetworkAbility) b.a(b.this).get();
                        if (networkAbility == null) {
                            return;
                        }
                        NetworkAbility.a(networkAbility, i, d);
                    }
                });
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements NetworkQualityMonitor.IDomainNetworkQualityListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<NetworkAbility> f8030a;

        public static /* synthetic */ WeakReference a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("818a2719", new Object[]{aVar}) : aVar.f8030a;
        }

        public a(NetworkAbility networkAbility) {
            this.f8030a = new WeakReference<>(networkAbility);
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IDomainNetworkQualityListener
        public void onNetworkQualityChanged(final String str, final int i, final double d, final long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f9956f4", new Object[]{this, str, new Integer(i), new Double(d), new Long(j)});
            } else {
                czd.b(new Runnable() { // from class: com.network.diagnosis.model.NetworkAbility.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        NetworkAbility networkAbility = (NetworkAbility) a.a(a.this).get();
                        if (networkAbility == null) {
                            return;
                        }
                        NetworkAbility.a(networkAbility, str, i, d, j);
                    }
                });
            }
        }
    }
}
