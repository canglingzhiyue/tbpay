package com.taobao.bootimage;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.autosize.l;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.data.GatwaySplashRequest;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.itk;
import tb.kej;
import tb.kel;
import tb.kem;
import tb.keo;
import tb.kep;
import tb.keq;
import tb.ket;
import tb.kge;
import tb.mto;
import tb.noa;

/* loaded from: classes6.dex */
public class BootImageDataMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE = "bootimage";
    public static final String IMAGE_MODULE_NAME = "boot-image";

    /* renamed from: a  reason: collision with root package name */
    private static BootImageDataMgr f16640a;
    private static a h;
    private BootImageData c;
    private BootImageData d;
    private com.taobao.bootimage.data.a g;
    private volatile boolean f = false;
    private Map<String, FatigueInfo> b = new HashMap();
    private AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public interface a {
    }

    public static /* synthetic */ void a(BootImageDataMgr bootImageDataMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf6d25b", new Object[]{bootImageDataMgr});
        } else {
            bootImageDataMgr.j();
        }
    }

    public static /* synthetic */ com.taobao.alivfssdk.cache.h b(BootImageDataMgr bootImageDataMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alivfssdk.cache.h) ipChange.ipc$dispatch("b7788c5d", new Object[]{bootImageDataMgr}) : bootImageDataMgr.l();
    }

    public static /* synthetic */ Map c(BootImageDataMgr bootImageDataMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a32a578e", new Object[]{bootImageDataMgr}) : bootImageDataMgr.b;
    }

    static {
        kge.a(-2031305602);
        f16640a = new BootImageDataMgr();
    }

    private BootImageDataMgr() {
    }

    public static BootImageDataMgr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageDataMgr) ipChange.ipc$dispatch("21c1095b", new Object[0]) : f16640a;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28609fbe", new Object[]{aVar});
        } else {
            h = aVar;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            h = null;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!kel.c) {
        } else {
            synchronized (this) {
                if (!this.f) {
                    com.taobao.alivfssdk.cache.h l = l();
                    if (l == null) {
                        return;
                    }
                    try {
                        Object b2 = l.b("fatigue_info");
                        if (b2 != null) {
                            this.b = (Map) JSONObject.parseObject((String) b2, new TypeReference<Map<String, FatigueInfo>>() { // from class: com.taobao.bootimage.BootImageDataMgr.1
                            }.getType(), new Feature[0]);
                            this.f = true;
                        }
                    } catch (JSONException e) {
                        kej.a("BootImageDataMgr", "initColdStartOnlyFatigue", e);
                    }
                }
            }
        }
    }

    public void d() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!kel.c || this.d != null || (string = kel.e.getString("bootimage_info_coldstart", null)) == null) {
        } else {
            try {
                this.d = (BootImageData) JSONObject.parseObject(string, BootImageData.class);
            } catch (JSONException e) {
                kej.a("BootImageDataMgr", "initColdStartOnlyBootInfo", e);
            }
        }
    }

    public void e() {
        com.taobao.alivfssdk.cache.h l;
        Object b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.e.getAndSet(true) && (l = l()) != null) {
            synchronized (this) {
                if (!this.f) {
                    Object b3 = l.b("fatigue_info");
                    if (b3 == null) {
                        return;
                    }
                    try {
                        this.b = (Map) JSONObject.parseObject((String) b3, new TypeReference<Map<String, FatigueInfo>>() { // from class: com.taobao.bootimage.BootImageDataMgr.2
                        }.getType(), new Feature[0]);
                        this.f = true;
                    } catch (JSONException e) {
                        kej.a("BootImageDataMgr", "init", e);
                    }
                }
                if (this.b != null && this.b.size() > 0) {
                    kej.a("BootImageDataMgr", "Cached fatigueInfo size is " + this.b.size());
                    HashMap hashMap = new HashMap(this.b);
                    long b4 = keo.b();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        FatigueInfo fatigueInfo = (FatigueInfo) entry.getValue();
                        if (fatigueInfo != null && fatigueInfo.expireTimeMs < b4) {
                            this.b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    if (z) {
                        if (this.b.size() > 0) {
                            l.a("fatigue_info", (Object) JSONObject.toJSONString(this.b));
                        } else {
                            l.c("fatigue_info");
                        }
                    }
                }
                if (this.c == null && (b2 = l.b("bootimage_info")) != null) {
                    try {
                        this.c = (BootImageData) JSONObject.parseObject((String) b2, BootImageData.class);
                    } catch (JSONException e2) {
                        kej.a("BootImageDataMgr", "init", e2);
                    }
                }
                if (l.a("hot_start_times")) {
                    com.taobao.bootimage.data.a k = k();
                    Object b5 = l.b("hot_start_times");
                    if (b5 instanceof Integer) {
                        k.c = ((Integer) b5).intValue();
                    } else {
                        k.c = -1;
                    }
                }
                ket.a();
            }
        }
    }

    public BootImageData f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageData) ipChange.ipc$dispatch("79d47717", new Object[]{this}) : this.c;
    }

    public BootImageData g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageData) ipChange.ipc$dispatch("14753998", new Object[]{this}) : this.d;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            Coordinator.postTask(new b());
        }
    }

    /* loaded from: classes6.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1630919347);
        }

        public b() {
            super("bootimageDownloadRes");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BootImageDataMgr.a(BootImageDataMgr.this);
            }
        }
    }

    public Map<String, String> i() {
        Object b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        com.taobao.alivfssdk.cache.h l = l();
        if (l != null && (b2 = l.b("bootimage_configs")) != null) {
            return (Map) JSONObject.parseObject((String) b2, new TypeReference<HashMap<String, String>>() { // from class: com.taobao.bootimage.BootImageDataMgr.3
            }.getType(), new Feature[0]);
        }
        return null;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.alivfssdk.cache.h l = l();
        if (l == null) {
            return;
        }
        l.a("bootimage_configs", (Object) JSONObject.toJSONString(map));
    }

    private com.taobao.alivfssdk.cache.h l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alivfssdk.cache.h) ipChange.ipc$dispatch("cf776fc4", new Object[]{this});
        }
        com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(CACHE_MODULE);
        if (cacheForModule != null) {
            return cacheForModule.b();
        }
        return null;
    }

    public boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        if (bootImageInfo == null || StringUtils.isEmpty(bootImageInfo.itemId)) {
            return false;
        }
        FatigueInfo a2 = a().a(bootImageInfo.itemId);
        if (a2 == null) {
            return true;
        }
        if (bootImageInfo.times > 0 && bootImageInfo.times <= a2.times) {
            return false;
        }
        return keo.b() >= a2.lastTimeMs + (((long) (bootImageInfo.periodSeconds <= 0 ? kem.a().f() : bootImageInfo.periodSeconds)) * 1000);
    }

    public void a(String str, boolean z, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec822121", new Object[]{this, str, new Boolean(z), l});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            FatigueInfo a2 = a(str);
            if (a2 == null) {
                a2 = new FatigueInfo();
            }
            a2.expireTimeMs = keo.b() + 259200000;
            if (z) {
                a2.times++;
            }
            if (l != null && l.longValue() > 0) {
                a2.lastTimeMs = l.longValue();
            }
            this.b.put(str, a2);
            Coordinator.postTask(new Coordinator.TaggedRunnable(kem.TAG) { // from class: com.taobao.bootimage.BootImageDataMgr.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.alivfssdk.cache.h b2 = BootImageDataMgr.b(BootImageDataMgr.this);
                    if (b2 == null) {
                        return;
                    }
                    b2.a("fatigue_info", (Object) JSONObject.toJSONString(BootImageDataMgr.c(BootImageDataMgr.this)));
                }
            });
        }
    }

    public FatigueInfo a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FatigueInfo) ipChange.ipc$dispatch("b6ea7374", new Object[]{this, str}) : this.b.get(str);
    }

    /* loaded from: classes6.dex */
    public static class FatigueInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long expireTimeMs;
        public long lastTimeMs;
        public int times;

        static {
            kge.a(1575000271);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FatigueInfo{times=" + this.times + ", lastTimeMs=" + this.lastTimeMs + ", expireTimeMs=" + this.expireTimeMs + '}';
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        kej.a("BootImageDataMgr", "requestSplashData: start");
        try {
            MtopResponse syncRequest = RemoteBusiness.build((IMTOPDataObject) m(), TaoPackageInfo.getTTID()).syncRequest();
            keq h2 = com.taobao.bootimage.linked.h.a("").h();
            if (syncRequest == null) {
                h2.a("Market", "HotStart", keq.SPLASH_REQUEST_ERROR, null, "responseNull", "responseNull");
                return;
            }
            org.json.JSONObject dataJsonObject = syncRequest.getDataJsonObject();
            if (dataJsonObject == null) {
                h2.a("Market", "HotStart", keq.SPLASH_REQUEST_ERROR, null, "dataJsonObjectNull", "");
                return;
            }
            com.taobao.bootimage.linked.h.a("").j().b(JSON.parseObject(dataJsonObject.toString()));
            com.taobao.bootimage.linked.h.a("").j().a(1001);
        } catch (Exception e) {
            kej.a("BootImageDataMgr", "requestSplashData error", e);
        }
    }

    private GatwaySplashRequest m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatwaySplashRequest) ipChange.ipc$dispatch("8abbd29e", new Object[]{this});
        }
        GatwaySplashRequest gatwaySplashRequest = new GatwaySplashRequest();
        Double[] o = o();
        gatwaySplashRequest.sid = Login.getSid();
        gatwaySplashRequest.userId = Login.getUserId();
        gatwaySplashRequest.latitude = o[0].doubleValue();
        gatwaySplashRequest.longitude = o[1].doubleValue();
        gatwaySplashRequest.nick = Login.getNick();
        gatwaySplashRequest.utdid = UTDevice.getUtdid(f.b());
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        gatwaySplashRequest.deviceScore = a2 == null ? -1 : a2.a(com.taobao.tbdeviceevaluator.c.KEY_OLD_SCORE, -1);
        PositionInfo b2 = com.taobao.android.editionswitcher.b.b(Globals.getApplication());
        if (b2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(noa.KEY_EDITION_CODE, (Object) b2.editionCode);
            gatwaySplashRequest.extension = jSONObject.toString();
            kej.a(kem.TAG, "createRequestParams editionCode is : " + b2.editionCode);
            str = b2.editionCode;
        } else {
            str = null;
        }
        String[] a3 = keo.a(f.b());
        gatwaySplashRequest.setContainerParams(keo.c(), a3[0], a3[1], str, a2 == null ? "-1" : String.valueOf(a2.a("deviceLevel", -1)));
        gatwaySplashRequest.setCommonBizParams(n());
        return gatwaySplashRequest;
    }

    private String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Application b2 = f.b();
        if (l.d(b2)) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            jSONObject.put("foldStatus", (Object) (com.taobao.android.autosize.h.a().b((Context) b2) ? itk.TYPE_FOLD : AbsListWidgetInstance.KEY_SECTION_EXPAND));
        } else if (l.b(b2)) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
        } else {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
        }
        kej.a("BootImageDataMgr", "上行设备参数: " + jSONObject);
        return jSONObject.toJSONString();
    }

    private Double[] o() {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double[]) ipChange.ipc$dispatch("b448b405", new Object[]{this});
        }
        TBLocationDTO b2 = TBLocationClient.b();
        double d2 = mto.a.GEO_NOT_SUPPORT;
        if (b2 != null) {
            try {
                d = !StringUtils.isEmpty(b2.getLatitude()) ? Double.parseDouble(b2.getLatitude()) : 0.0d;
            } catch (NumberFormatException e) {
                e = e;
                d = 0.0d;
            }
            try {
                if (!StringUtils.isEmpty(b2.getLongitude())) {
                    d2 = Double.parseDouble(b2.getLongitude());
                }
            } catch (NumberFormatException e2) {
                e = e2;
                kej.a(kem.TAG, "requestSplashData createLocationParam: getLocation error.", e);
                return new Double[]{Double.valueOf(d), Double.valueOf(d2)};
            }
        } else {
            d = 0.0d;
        }
        return new Double[]{Double.valueOf(d), Double.valueOf(d2)};
    }

    public void a(final com.taobao.bootimage.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300aba24", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable(kem.TAG) { // from class: com.taobao.bootimage.BootImageDataMgr.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.alivfssdk.cache.h b2 = BootImageDataMgr.b(BootImageDataMgr.this);
                    if (b2 == null) {
                        return;
                    }
                    b2.a("total_fatigue_info", (Object) JSONObject.toJSONString(aVar));
                }
            });
        }
    }

    public com.taobao.bootimage.data.a k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.bootimage.data.a) ipChange.ipc$dispatch("eed6d3ae", new Object[]{this});
        }
        if (this.g == null) {
            com.taobao.alivfssdk.cache.h l = l();
            if (l != null) {
                String str = (String) l.b("total_fatigue_info");
                if (!StringUtils.isEmpty(str)) {
                    this.g = (com.taobao.bootimage.data.a) JSONObject.parseObject(str, com.taobao.bootimage.data.a.class);
                }
            }
            if (this.g == null) {
                this.g = new com.taobao.bootimage.data.a();
            }
        }
        if (!this.g.b()) {
            this.g.c();
        }
        return this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.bootimage.data.a aVar = this.g;
        if (aVar != null) {
            aVar.a(z);
        }
        if (z) {
            return;
        }
        kep.a().b();
    }
}
