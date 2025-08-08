package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.status.NetworkStatusHelper;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.perf.b;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.sku.utils.g;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dyo;

/* loaded from: classes4.dex */
public class dym implements e.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27110a;
    private WeakReference<dya> b;
    private boolean c;
    private String d;
    private dyi e;
    private kxb f;

    /* renamed from: tb.dym$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27114a = new int[NetworkStatusHelper.NetworkStatus.values().length];

        static {
            try {
                f27114a[NetworkStatusHelper.NetworkStatus.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27114a[NetworkStatusHelper.NetworkStatus.G2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27114a[NetworkStatusHelper.NetworkStatus.G3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27114a[NetworkStatusHelper.NetworkStatus.G4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27114a[NetworkStatusHelper.NetworkStatus.G5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(1567021357);
        kge.a(2143501070);
    }

    public static /* synthetic */ void a(dym dymVar, DetailCoreActivity detailCoreActivity, dyo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc48594", new Object[]{dymVar, detailCoreActivity, aVar});
        } else {
            dymVar.a(detailCoreActivity, aVar);
        }
    }

    public static /* synthetic */ void b(dym dymVar, DetailCoreActivity detailCoreActivity, dyo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b560b3", new Object[]{dymVar, detailCoreActivity, aVar});
        } else {
            dymVar.b(detailCoreActivity, aVar);
        }
    }

    public dym(dya dyaVar) {
        this.b = new WeakReference<>(dyaVar);
        a();
        emu.a("com.taobao.android.detail.core.detail.controller.StartupMainRequestDataHandler");
    }

    public void a(dyi dyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61363e4", new Object[]{this, dyiVar});
        } else {
            this.e = dyiVar;
        }
    }

    public void a(kxb kxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f40a23", new Object[]{this, kxbVar});
        } else {
            this.f = kxbVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", "enable_normalized_h5_downgrade", "true"));
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.e.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.d = b(jSONObject);
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.e.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f27110a = str;
        }
    }

    private String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("item")) != null) {
            return jSONObject2.getString("h5ItemUrl");
        }
        return null;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : (!this.c || StringUtils.isEmpty(this.d) || !this.d.contains("hybrid=true")) ? str : this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b1  */
    /* JADX WARN: Type inference failed for: r0v61, types: [tb.dym$1] */
    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.enh r25) {
        /*
            Method dump skipped, instructions count: 1651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dym.a(tb.enh):void");
    }

    private String a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{this, activity});
        }
        if (activity == null) {
            return null;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data != null) {
                return data.toString();
            }
            return null;
        } catch (Exception e) {
            i.a("StartupMainRequestDataHandler", "getUri error", e);
            return null;
        }
    }

    private void a(final DetailCoreActivity detailCoreActivity, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48302a2c", new Object[]{this, detailCoreActivity, cVar});
        } else if (detailCoreActivity == null || cVar == null || cVar.f10055a == null || cVar.f10055a.a() == null || cVar.f10055a.a().isEmpty()) {
        } else {
            String a2 = ecs.a(cVar);
            if (StringUtils.isEmpty(a2)) {
                i.d("StartupMainRequestDataHandler", "preloadWeexInstance, weex url is empty");
                dyo.a b = dyo.b(dyo.b(detailCoreActivity));
                if (b != null && !StringUtils.isEmpty(b.d)) {
                    i.d("StartupMainRequestDataHandler", "preloadWeexInstance, stream data is ready");
                    a(detailCoreActivity, b);
                    return;
                }
                dyo.a(new dyo.b() { // from class: tb.dym.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.dyo.b
                    public void a(dyo.a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b7dc06c1", new Object[]{this, aVar});
                            return;
                        }
                        i.d("StartupMainRequestDataHandler", "preloadWeexInstance, stream data is added");
                        if (StringUtils.isEmpty(aVar.d)) {
                            return;
                        }
                        dyo.b(this);
                        dym.a(dym.this, detailCoreActivity, aVar);
                    }
                });
                return;
            }
            ecs.a(detailCoreActivity, a2, cVar.f10055a.a());
        }
    }

    private void a(final DetailCoreActivity detailCoreActivity, final dyo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c613b8c", new Object[]{this, detailCoreActivity, aVar});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            Coordinator.execute(new Runnable() { // from class: tb.dym.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dym.b(dym.this, detailCoreActivity, aVar);
                    }
                }
            });
        } else {
            b(detailCoreActivity, aVar);
        }
    }

    private void b(DetailCoreActivity detailCoreActivity, dyo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b12a5ab", new Object[]{this, detailCoreActivity, aVar});
            return;
        }
        JSONObject a2 = g.a(aVar.d);
        String a3 = ecs.a(a2);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        ecs.a(detailCoreActivity, a3, a2);
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        dya dyaVar = this.b.get();
        if (dyaVar == null) {
            i.a("StartupMainRequestDataHandler", "controller == null");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str3);
        Intent intent = new Intent();
        intent.setAction("TBDidEnterDetailNotification");
        intent.putExtra("itemId", str);
        intent.putExtra("title", str2);
        intent.putStringArrayListExtra("images", arrayList);
        LocalBroadcastManager.getInstance(dyaVar.f27083a).sendBroadcast(intent);
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
    public void a(MtopResponse mtopResponse) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        String a2 = com.taobao.android.detail.core.performance.i.a(j.a("StartupMainRequestDataHandler"), BTags.MainRequestTag);
        i.a(a2, "onFailure:" + mtopResponse.toString());
        dya dyaVar = this.b.get();
        if (dyaVar == null) {
            i.a(com.taobao.android.detail.core.performance.i.a(j.a("StartupMainRequestDataHandler"), BTags.MainRequestTag), "controller == null");
            return;
        }
        String str = mtopResponse.getMtopStat() != null ? mtopResponse.getMtopStat().fullTraceId : "";
        ecb.a(dyaVar.f27083a, dyaVar.f.f27180a, str, mtopResponse.toString());
        eqc.b(dyaVar.f27083a, "mReq");
        b.b((Context) dyaVar.f27083a, "errorNet", String.format("%s:%s", mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        eqc.b(dyaVar.f27083a, "load");
        epu.a(dyaVar.f.f27180a, "");
        ecc.a(dyaVar.f27083a, dyaVar.f.f27180a, mtopResponse);
        eho c = ehk.c();
        if (c != null) {
            dyaVar.r();
        }
        if (c != null && c.a(dyaVar.d, mtopResponse)) {
            dyaVar.s();
            if (dyaVar != null && dyaVar.f != null) {
                ecb.b(dyaVar.f27083a, dyaVar.f.f27180a, str, mtopResponse.toString());
            }
            i.a(com.taobao.android.detail.core.performance.i.a(j.a("StartupMainRequestDataHandler"), BTags.MainRequestTag), "onFailure 限流、防刷和网络异常显示error view");
            return;
        }
        dyaVar.b.setVisibility(8);
        dyaVar.c.setVisibility(8);
        dyaVar.e.setVisibility(0);
        String str2 = dyaVar.f.f27180a != null ? dyaVar.f.f27180a : "";
        if (!StringUtils.isEmpty(this.f27110a)) {
            dyaVar.a(str2, this.f27110a, "onFailure tcloud常态化降级");
        } else if (!StringUtils.isEmpty(dyaVar.f.f27180a)) {
            String str3 = dyaVar.f.f27180a;
            if (god.t) {
                sb = new StringBuilder();
                sb.append(god.q);
                sb.append(str3);
            } else {
                sb = new StringBuilder();
                sb.append(egn.NAV_URL_DETAIL[2]);
                sb.append("?id=");
                sb.append(str3);
                sb.append("&hybrid=true");
            }
            dyaVar.a(str3, b(sb.toString()), "onFailure 容灾跳h5");
            HashMap hashMap = new HashMap();
            hashMap.put("errorMsg", "data数据为空");
            ecg.c((Context) null, str3);
            hashMap.put("itemId", str3);
            eps.a("Page_Detail", "90025", hashMap);
        } else {
            i.a(com.taobao.android.detail.core.performance.i.a(j.a("StartupMainRequestDataHandler"), BTags.MainRequestTag), "onFailure no itemId");
            eca.a(dyaVar.f27083a, "", "onFailure no itemId", eca.TYPE_UNKNOW);
            if (dyaVar.f27083a.isFinishing() || dyaVar.f27083a.a(mtopResponse)) {
                return;
            }
            dyaVar.f27083a.finish();
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        dya dyaVar = this.b.get();
        if (dyaVar == null || dyaVar.f27083a == null || bVar == null || bVar.f() == null || ((dcb) AliAdaptServiceManager.getInstance().findAliAdaptService(dcb.class)) == null) {
            return;
        }
        Map<String, String> f = bVar.f();
        for (String str : f.keySet()) {
            dyaVar.f27083a.ab();
            f.get(str);
        }
    }

    private void a(dya dyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60fc0ec", new Object[]{this, dyaVar});
        } else if (!epv.c || dyaVar == null) {
        } else {
            dyaVar.u().a();
        }
    }

    private static String b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("411e1bbd", new Object[]{bVar});
        }
        PriceNode m = eqb.m(bVar);
        JSONObject jSONObject = new JSONObject(4);
        ArrayList<Pair> arrayList = new ArrayList(3);
        arrayList.add(new Pair("price", m.price));
        arrayList.add(new Pair("subPrice", m.subPrice));
        arrayList.add(new Pair("sugPromPrice", m.sugPromPrice));
        for (Pair pair : arrayList) {
            String str = (String) pair.first;
            PriceNode.PriceData priceData = (PriceNode.PriceData) pair.second;
            if (priceData != null) {
                JSONObject jSONObject2 = new JSONObject(4);
                jSONObject2.put("priceMoney", (Object) Long.valueOf(priceData.priceMoney));
                jSONObject2.put("priceText", (Object) priceData.priceText);
                jSONObject2.put("priceUnit", (Object) priceData.priceUnit);
                jSONObject.put(str, (Object) jSONObject2);
            }
        }
        return jSONObject.toJSONString();
    }

    private HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        int i = bax.a().f25741a;
        hashMap.put("device_level", i != 1 ? i != 2 ? i != 3 ? "unknown" : "high" : "medium" : "low");
        if (NetworkStatusHelper.getStatus() == null) {
            hashMap.put("network_status", "unknown");
            return hashMap;
        }
        int i2 = AnonymousClass4.f27114a[NetworkStatusHelper.getStatus().ordinal()];
        hashMap.put("network_status", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "notreachable" : "5g" : "4g" : "3g" : "2g" : "wifi");
        return hashMap;
    }
}
