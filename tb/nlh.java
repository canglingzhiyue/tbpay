package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.TrafficCardModel;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.ui.LiveCustomToast;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.utils.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class nlh implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TelephonyManager f31553a;
    private static SubscriptionManager b;
    private static Method c;
    private static String d;
    private static volatile boolean g;
    private static Handler l;
    private static volatile int n;
    private WeakReference<Context> e;
    private String f;
    private NetworkStatusHelper.NetworkStatus h;
    private NetworkStatusHelper.INetworkStatusChangeListener i;
    private TrafficCardModel j;
    private volatile boolean k;
    private WeakReference<com.taobao.alilive.aliliveframework.frame.a> m;
    private boolean o;
    private String p;

    /* loaded from: classes6.dex */
    public static class b {
        public static final nlh INSTANCE;

        static {
            kge.a(1101652017);
            INSTANCE = new nlh();
        }
    }

    static {
        kge.a(309900126);
        kge.a(-797454141);
    }

    public static /* synthetic */ Context a(nlh nlhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e2ca6926", new Object[]{nlhVar}) : nlhVar.b();
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus a(nlh nlhVar, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("dc12a22c", new Object[]{nlhVar, networkStatus});
        }
        nlhVar.h = networkStatus;
        return networkStatus;
    }

    public static /* synthetic */ void a(nlh nlhVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b1c75a", new Object[]{nlhVar, context});
        } else {
            nlhVar.a(context);
        }
    }

    public static /* synthetic */ void a(nlh nlhVar, Context context, TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37fb60ef", new Object[]{nlhVar, context, trafficCardModel});
        } else {
            nlhVar.a(context, trafficCardModel);
        }
    }

    public static /* synthetic */ void a(nlh nlhVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0198ea4", new Object[]{nlhVar, context, str});
        } else {
            nlhVar.a(context, str);
        }
    }

    public static /* synthetic */ void a(nlh nlhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a9ee78", new Object[]{nlhVar, str});
        } else {
            nlhVar.b(str);
        }
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus b(nlh nlhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("65cda8f4", new Object[]{nlhVar}) : nlhVar.h;
    }

    public static /* synthetic */ void b(nlh nlhVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390463f9", new Object[]{nlhVar, context});
        } else {
            nlhVar.b(context);
        }
    }

    public static /* synthetic */ Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[0]) : l;
    }

    public static /* synthetic */ WeakReference c(nlh nlhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("4cc905fe", new Object[]{nlhVar}) : nlhVar.m;
    }

    private nlh() {
        this.o = hkk.l();
        if (phg.d() != null && phg.d().a()) {
            this.o = false;
            q.b("TrafficCardManager", "TrafficCardManager diantaoApp avoid");
        }
        q.b("TrafficCardManager", "TrafficCardManager mEnableFreeFlow:" + this.o);
        if (!this.o) {
            return;
        }
        d();
    }

    private Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        l = new Handler(Looper.getMainLooper());
        NetworkSdkSetting.init(pmd.a().u().c());
        NetworkStatusHelper.startListener(pmd.a().u().c());
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        this.h = status;
        q.b("TrafficCardManager", "status:" + status);
        boolean isConnected = NetworkStatusHelper.isConnected();
        q.b("TrafficCardManager", "connected:" + isConnected);
    }

    public static nlh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nlh) ipChange.ipc$dispatch("f0847f4", new Object[0]) : b.INSTANCE;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof QueryOperatorResponse) {
            QueryOperatorRealResponse queryOperatorRealResponse = (QueryOperatorRealResponse) netBaseOutDo.mo1437getData();
            if (queryOperatorRealResponse.model == null || queryOperatorRealResponse.model.urlMap == null) {
                return;
            }
            if (StringUtils.equals(this.f, Constant.CMCC)) {
                str = queryOperatorRealResponse.model.urlMap.CMCC;
            } else if (StringUtils.equals(this.f, "CUC")) {
                str = queryOperatorRealResponse.model.urlMap.CUC;
            } else {
                str = StringUtils.equals(queryOperatorRealResponse.model.urlMap.CTC, "CTC") ? queryOperatorRealResponse.model.urlMap.CTC : "";
            }
            q.b("TrafficCardManager", "QueryOperatorRealResponse url :" + str);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            a(str);
        } else if (!(netBaseOutDo instanceof QueryTrafficCardResponse)) {
        } else {
            g = false;
            QueryTrafficCardRealResponse mo1437getData = ((QueryTrafficCardResponse) netBaseOutDo).mo1437getData();
            if (mo1437getData == null || mo1437getData.model == null) {
                return;
            }
            this.j = mo1437getData.model;
            if ((b() instanceof Activity) && ((Activity) b()).isDestroyed()) {
                q.b("TrafficCardManager", "realResponse Activity destroyed");
            } else {
                a(mo1437getData.model);
            }
        }
    }

    private void a(final TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5754ae7d", new Object[]{this, trafficCardModel});
            return;
        }
        if (trafficCardModel != null) {
            q.b("TrafficCardManager", "start processTrafficCardData:" + trafficCardModel.state);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (StringUtils.equals(trafficCardModel.state, "CAN_APPLY")) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long c2 = ae.c("traffic_card_fatigue_key");
            long k = hkk.k();
            if (currentTimeMillis2 - c2 <= 60 * k * 1000) {
                q.b("TrafficCardManager", "startRequestCarrier isp hit fatigue fatigueTime:" + k);
                return;
            }
            l.post(new Runnable() { // from class: tb.nlh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    nlh nlhVar = nlh.this;
                    nlh.a(nlhVar, nlh.a(nlhVar), trafficCardModel);
                    ae.a("traffic_card_fatigue_key", currentTimeMillis);
                }
            });
        } else if (StringUtils.equals(trafficCardModel.state, "CAN_NOT_APPLY") || StringUtils.equals(trafficCardModel.state, "UNKNOWN")) {
            long currentTimeMillis3 = System.currentTimeMillis();
            long c3 = ae.c("traffic_card_fatigue_key");
            long k2 = hkk.k();
            if (currentTimeMillis3 - c3 <= 60 * k2 * 1000) {
                q.b("TrafficCardManager", "startRequestCarrier isp hit fatigue fatigueTime:" + k2);
                return;
            }
            l.post(new Runnable() { // from class: tb.nlh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    nlh nlhVar = nlh.this;
                    nlh.a(nlhVar, nlh.a(nlhVar));
                    ae.a("traffic_card_fatigue_key", currentTimeMillis);
                }
            });
        } else if (!StringUtils.equals(trafficCardModel.state, "SUBSCRIBING")) {
            return;
        } else {
            l.post(new Runnable() { // from class: tb.nlh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    nlh nlhVar = nlh.this;
                    nlh.a(nlhVar, nlh.a(nlhVar), "免流观看中");
                }
            });
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("traffic_card_state", trafficCardModel.state);
        phl a2 = phg.a();
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = this.m;
        a2.a(weakReference == null ? null : weakReference.get(), "taolive_traffic_card", hashMap);
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (context == null) {
        } else {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText(str);
            liveCustomToast.setBottomText("");
            liveCustomToast.show();
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText("当前为非WiFi网络环境");
            liveCustomToast.setTopIconRes("https://gw.alicdn.com/imgextra/i4/O1CN01MQVlSX1IfrfsUcPEA_!!6000000000921-2-tps-68-56.png");
            liveCustomToast.setBottomText("注意流量消耗");
            liveCustomToast.show();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            new DegradableNetwork(b()).asyncSend(new RequestImpl(str), null, null, new a());
            q.b("TrafficCardManager", "startRequestOperator:" + str);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        g = false;
        q.a("TrafficCardManager", "onError");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        g = false;
        q.a("TrafficCardManager", "onSystemError");
    }

    public void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df1065", new Object[]{this, context, aVar});
        } else if (!this.o) {
        } else {
            this.e = new WeakReference<>(context);
            this.m = new WeakReference<>(aVar);
            if (!this.k) {
                e();
                this.k = true;
            }
            this.p = aVar.j();
            this.h = NetworkStatusHelper.getStatus();
            if (this.h == NetworkStatusHelper.NetworkStatus.WIFI || this.h == NetworkStatusHelper.NetworkStatus.NO || this.h == NetworkStatusHelper.NetworkStatus.NONE) {
                q.b("TrafficCardManager", "enterLive not 4G mode");
            } else if (n >= 2) {
            } else {
                n++;
                if (g) {
                    return;
                }
                g = true;
                this.f = "";
                b(context);
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str != null) {
            String str2 = this.p;
            if (str2 == null || str2.equals(str)) {
            }
        } else if (!this.o) {
        } else {
            if (this.k) {
                this.k = false;
                NetworkStatusHelper.removeStatusChangeListener(this.i);
                this.i = null;
                q.b("TrafficCardManager", "removeStatusChangeListener");
            }
            this.e = null;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.i = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: tb.nlh.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    return;
                }
                q.b("TrafficCardManager", "onNetworkStatusChanged:" + networkStatus);
                if ((nlh.b(nlh.this) == NetworkStatusHelper.NetworkStatus.NO || nlh.b(nlh.this) == NetworkStatusHelper.NetworkStatus.WIFI) && (networkStatus == NetworkStatusHelper.NetworkStatus.G3 || networkStatus == NetworkStatusHelper.NetworkStatus.G4 || networkStatus == NetworkStatusHelper.NetworkStatus.G5)) {
                    nlh.c().postDelayed(new Runnable() { // from class: tb.nlh.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!(nlh.a(nlh.this) instanceof Activity) || ((Activity) nlh.a(nlh.this)).isDestroyed()) {
                            } else {
                                nlh.b(nlh.this, nlh.a(nlh.this));
                            }
                        }
                    }, 1000L);
                }
                nlh.a(nlh.this, networkStatus);
            }
        };
        NetworkStatusHelper.addStatusChangeListener(this.i);
        q.b("TrafficCardManager", "registerListener");
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (context == null) {
        } else {
            c(context);
            if (StringUtils.isEmpty(this.f)) {
                q.b("TrafficCardManager", "startRequestCarrier isp null");
                return;
            }
            new com.taobao.android.live.plugin.atype.flexalocal.traffic.request.a(this).a(this.f);
            q.a("TrafficCardManager", "startRequestCarrier isp:" + this.f);
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        String d2 = d(context);
        if (d2.contains(Constant.CMCC) || d2.contains("中国移动")) {
            this.f = Constant.CMCC;
        } else if (d2.contains("CUC") || d2.contains("中国联通")) {
            this.f = "CUC";
        } else if (d2.contains("CTC") || d2.contains("中国电信")) {
            this.f = "CTC";
        }
        q.b("TrafficCardManager", "getCarrierInfo isp:" + this.f);
    }

    private void a(Context context, final TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6318d875", new Object[]{this, context, trafficCardModel});
        } else if (context == null) {
        } else {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText("当前为非WiFi网络环境");
            liveCustomToast.setTopIconRes("https://gw.alicdn.com/imgextra/i4/O1CN01MQVlSX1IfrfsUcPEA_!!6000000000921-2-tps-68-56.png");
            liveCustomToast.setBottomText("办理免流量观看");
            liveCustomToast.setBottomIcon("https://gw.alicdn.com/imgextra/i4/O1CN01vQGePQ1JWzcvGtJlZ_!!6000000001037-2-tps-22-40.png");
            liveCustomToast.setBottomClickCallback(new View.OnClickListener() { // from class: tb.nlh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (StringUtils.isEmpty(trafficCardModel.jumpUrl) || nlh.a(nlh.this) == null) {
                    } else {
                        phg.a().a(nlh.c(nlh.this) == null ? null : (com.taobao.alilive.aliliveframework.frame.a) nlh.c(nlh.this).get(), "taolive_traffic_card", (Map<String, String>) new HashMap());
                        Nav.from(nlh.a(nlh.this)).toUri(trafficCardModel.jumpUrl);
                        q.b("TrafficCardManager", "click to nav:" + trafficCardModel.jumpUrl);
                    }
                }
            });
            liveCustomToast.show();
        }
    }

    private static String d(Context context) {
        try {
            if (f31553a == null) {
                f31553a = (TelephonyManager) context.getSystemService("phone");
            }
            d = f31553a.getSimOperator();
            if (Build.VERSION.SDK_INT < 22) {
                return "";
            }
            if (b == null && context != null && context.getApplicationContext() != null) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getApplicationContext().getSystemService("telephony_subscription_service");
                b = subscriptionManager;
                c = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
            }
            return c != null ? ((SubscriptionInfo) c.invoke(b, new Object[0])).getCarrierName().toString() : "";
        } catch (Exception e) {
            q.b("TrafficCardManager", "e:" + e.getMessage());
            return ("46001".equals(d) || "46006".equals(d) || "46009".equals(d)) ? "CUC" : ("46000".equals(d) || "46002".equals(d) || "46004".equals(d) || "46007".equals(d)) ? Constant.CMCC : ("46003".equals(d) || "46005".equals(d) || "46011".equals(d)) ? "CTC" : "";
        }
    }

    /* loaded from: classes6.dex */
    public class a implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1280193724);
            kge.a(-501869850);
            kge.a(1776397793);
            kge.a(-324998464);
        }

        public a() {
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            q.b("TrafficCardManager", " NetCallBack onFinished:" + obj);
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                return;
            }
            q.b("TrafficCardManager", " NetCallBack onDataReceived:" + progressEvent.getFragmentIndex());
            byte[] bArr = new byte[progressEvent.getSize()];
            System.arraycopy(progressEvent.getBytedata(), 0, bArr, 0, progressEvent.getSize());
            String str = new String(bArr);
            q.b("TrafficCardManager", " NetCallBack str:" + str);
            nlh.a(nlh.this, str);
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            q.b("TrafficCardManager", " NetCallBack onResponseCode:" + i);
            return false;
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        new com.taobao.android.live.plugin.atype.flexalocal.traffic.request.b(this).a(this.f, str);
        q.b("TrafficCardManager", " startQueryTrafficCard isp:" + this.f + " str：" + str);
    }
}
