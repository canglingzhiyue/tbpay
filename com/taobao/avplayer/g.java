package com.taobao.avplayer;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.media.MediaConstant;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aks;
import tb.kce;
import tb.kcj;
import tb.kck;
import tb.kge;
import tb.sku;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f16504a;
    private static volatile boolean v;
    private static volatile String w;
    private static volatile float x;
    private static volatile String y;
    private DWContext b;
    private a c;
    private a d;
    private a e;
    private a f;
    private a g;
    private a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean u;
    private List<com.taobao.avplayer.common.w> o = new ArrayList();
    private List<com.taobao.avplayer.common.w> p = new ArrayList();
    private List<com.taobao.avplayer.common.w> q = new ArrayList();
    private List<com.taobao.avplayer.common.w> t = new ArrayList();
    private List<com.taobao.avplayer.common.w> r = new ArrayList();
    private List<com.taobao.avplayer.common.w> s = new ArrayList();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public DWResponse f16511a;
        public boolean b;

        static {
            kge.a(-1299285518);
        }
    }

    static {
        kge.a(1803253002);
        f16504a = !g.class.desiredAssertionStatus();
        v = false;
    }

    public static /* synthetic */ a a(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("55b4aa9e", new Object[]{gVar, aVar});
        }
        gVar.d = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8fff9c", new Object[]{gVar})).booleanValue() : gVar.u;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1770a640", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.l = z;
        return z;
    }

    public static /* synthetic */ a b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("165590a", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ a b(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5683291f", new Object[]{gVar, aVar});
        }
        gVar.e = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean b(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c08ac1", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.m = z;
        return z;
    }

    public static /* synthetic */ a c(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5751a7a0", new Object[]{gVar, aVar});
        }
        gVar.h = aVar;
        return aVar;
    }

    public static /* synthetic */ List c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bb368d31", new Object[]{gVar}) : gVar.o;
    }

    public static /* synthetic */ boolean c(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a106f42", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.i = z;
        return z;
    }

    public static /* synthetic */ a d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5d168dc8", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ a d(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("58202621", new Object[]{gVar, aVar});
        }
        gVar.g = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean d(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("936053c3", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.j = z;
        return z;
    }

    public static /* synthetic */ a e(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("58eea4a2", new Object[]{gVar, aVar});
        }
        gVar.c = aVar;
        return aVar;
    }

    public static /* synthetic */ List e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("85b96ab3", new Object[]{gVar}) : gVar.p;
    }

    public static /* synthetic */ boolean e(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb03844", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.n = z;
        return z;
    }

    public static /* synthetic */ a f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b8c7c286", new Object[]{gVar}) : gVar.h;
    }

    public static /* synthetic */ a f(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("59bd2323", new Object[]{gVar, aVar});
        }
        gVar.f = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean f(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6001cc5", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.k = z;
        return z;
    }

    public static /* synthetic */ List g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("503c4835", new Object[]{gVar}) : gVar.s;
    }

    public static /* synthetic */ void h(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0473331", new Object[]{gVar});
        } else {
            gVar.c();
        }
    }

    public static /* synthetic */ a i(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("425191a3", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ List j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9478", new Object[]{gVar}) : gVar.r;
    }

    public static /* synthetic */ a k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9e02c661", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ List l(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ca8371fa", new Object[]{gVar}) : gVar.q;
    }

    public static /* synthetic */ a m(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f9b3fb1f", new Object[]{gVar}) : gVar.f;
    }

    public static /* synthetic */ List n(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("95064f7c", new Object[]{gVar}) : gVar.t;
    }

    public g(DWContext dWContext) {
        this.b = dWContext;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.u = true;
        this.o.clear();
        this.p.clear();
        this.q.clear();
        this.t.clear();
    }

    public void a(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0856c76", new Object[]{this, wVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || this.u || this.b.mInteractiveId == -1) {
            if (kck.a() && this.b.mInteractiveId != -1) {
                throw new RuntimeException("queryInteractiveData error");
            }
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            wVar.onError(dWResponse);
        } else {
            a aVar = this.d;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.d.f16511a);
                    return;
                } else {
                    wVar.onError(this.d.f16511a);
                    return;
                }
            }
            this.o.add(wVar);
            if (this.l) {
                return;
            }
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            if ("detailmain".equalsIgnoreCase(this.b.mFrom)) {
                dWRequest.apiName = h.INTERACTIVE_API_NAME_FOR_DETAIL;
                dWRequest.apiVersion = "1.0";
            } else {
                dWRequest.apiName = h.INTERACTIVE_API_NAME;
                dWRequest.apiVersion = h.INTERACTIVE_API_VERSION;
            }
            dWRequest.paramMap = new HashMap();
            dWRequest.paramMap.put("userId", Long.toString(this.b.mUserId));
            dWRequest.paramMap.put("sdkVersion", h.f16513a);
            dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.b.mInteractiveId));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", this.b.mScene);
            if ("taowa".equals(this.b.mScene)) {
                hashMap.put("interactiveType", "taowa");
            }
            if (this.b.mInteractiveParms != null && this.b.mInteractiveParms.size() > 0) {
                hashMap.putAll(this.b.mInteractiveParms);
            }
            if (!StringUtils.isEmpty(this.b.getSourcePageName())) {
                hashMap.put("sourcePageName", this.b.getSourcePageName());
            }
            dWRequest.paramMap.put("extendParamsStr", JSON.toJSONString(hashMap));
            if (!StringUtils.isEmpty(this.b.mFrom)) {
                dWRequest.paramMap.put("from", this.b.mFrom);
            }
            this.l = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.a(g.this, false);
                        g.a(g.this, new a());
                        g.b(g.this).b = true;
                        g.b(g.this).f16511a = dWResponse2;
                        int size = g.c(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.c(g.this).get(i)).onSuccess(dWResponse2);
                        }
                        g.c(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.a(g.this, false);
                        int size = g.c(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.c(g.this).get(i)).onError(dWResponse2);
                        }
                        g.c(g.this).clear();
                    }
                }
            });
        }
    }

    public void b(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c4a4d5", new Object[]{this, wVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || this.u || StringUtils.isEmpty(this.b.mCid)) {
            if (kck.a() && StringUtils.isEmpty(this.b.mCid)) {
                throw new RuntimeException("queryInteractiveData error");
            }
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            wVar.onError(dWResponse);
        } else {
            a aVar = this.e;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.e.f16511a);
                    return;
                } else {
                    wVar.onError(this.e.f16511a);
                    return;
                }
            }
            this.p.add(wVar);
            if (this.m) {
                return;
            }
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.HIV_INTERACTIVE_API_NAME;
            dWRequest.apiVersion = "1.0";
            dWRequest.paramMap = new HashMap();
            dWRequest.paramMap.put("contentId", this.b.mCid);
            dWRequest.paramMap.put("sourceId", this.b.mFrom);
            this.m = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.b(g.this, false);
                        g.b(g.this, new a());
                        g.d(g.this).b = true;
                        g.d(g.this).f16511a = dWResponse2;
                        int size = g.e(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.e(g.this).get(i)).onSuccess(dWResponse2);
                        }
                        g.e(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.b(g.this, false);
                        int size = g.e(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.e(g.this).get(i)).onError(dWResponse2);
                        }
                        g.e(g.this).clear();
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.u) {
        } else {
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.VIDEOCONFIG_API_NAME;
            dWRequest.apiVersion = "3.0";
            dWRequest.paramMap = new HashMap();
            a(dWRequest);
            dWRequest.paramMap.put(MusLiveVideo.ATTR_PLAY_SCENES, this.b.mPlayScenes);
            dWRequest.paramMap.put("expectedCodec", this.b.mPlayContext.isH265() ? "h265" : "h264");
            dWRequest.paramMap.put("expectedDefPriority", this.b.mPlayContext.getRateAdaptePriority());
            dWRequest.paramMap.put("netSpeed", String.valueOf(this.b.mPlayContext.getNetSpeed()));
            if (!StringUtils.isEmpty(this.b.getPanoTyeStr())) {
                dWRequest.paramMap.put("panoType", this.b.getPanoTyeStr());
            }
            this.i = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    } else if (!g.a(g.this)) {
                        g.c(g.this, false);
                        g.c(g.this, new a());
                        g.f(g.this).b = true;
                        g.f(g.this).f16511a = dWResponse;
                        int size = g.g(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.g(g.this).get(i)).onSuccess(dWResponse);
                        }
                        g.g(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                    } else if (!g.a(g.this)) {
                        g.c(g.this, false);
                        int size = g.g(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.g(g.this).get(i)).onError(dWResponse);
                        }
                        g.g(g.this).clear();
                    }
                }
            });
        }
    }

    /* loaded from: classes6.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1346614174);
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Void r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, r4});
            } else {
                a(r4);
            }
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            g.this.b();
            return null;
        }

        public void a(Void r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f8d528f", new Object[]{this, r4});
            } else {
                g.h(g.this);
            }
        }
    }

    public void c(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c903dd34", new Object[]{this, wVar, new Boolean(z)});
        } else if (this.u) {
        } else {
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                if (kck.a()) {
                    throw new RuntimeException("queryVideoConfigData2 error");
                }
                DWResponse dWResponse = new DWResponse();
                dWResponse.errorMsg = "error";
                wVar.onError(dWResponse);
                return;
            }
            a aVar = this.h;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.h.f16511a);
                    return;
                } else {
                    wVar.onError(this.h.f16511a);
                    return;
                }
            }
            this.s.add(wVar);
            if (this.i) {
                return;
            }
            if (!v) {
                if (!f16504a && Looper.myLooper() == null) {
                    throw new AssertionError();
                }
                new b().execute(new Void[0]);
                return;
            }
            c();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!v) {
            w = com.taobao.taobaoavsdk.util.b.a();
            x = 0.0f;
            int a2 = kce.a();
            for (int i = 0; i < a2; i++) {
                try {
                    float b2 = kcj.b(kce.a(i)) / 1000000.0f;
                    if (b2 > x) {
                        x = b2;
                    }
                } catch (Exception e) {
                    AVSDKLog.e("DWDataManager", "Get MaxCpuFreq Error " + e);
                }
            }
            y = String.format("%.2f", Double.valueOf((aks.a().f().f25406a / 1000.0d) / 1000.0d));
            v = true;
        }
    }

    public void a(DWRequest dWRequest) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86558c6b", new Object[]{this, dWRequest});
            return;
        }
        dWRequest.paramMap.put("userId", Long.toString(this.b.mUserId));
        dWRequest.paramMap.put("sdkVersion", h.f16513a);
        dWRequest.paramMap.put("videoId", this.b.getVideoId());
        dWRequest.paramMap.put(MergeUtil.KEY_RID, this.b.getRID());
        if (!StringUtils.isEmpty(this.b.mFrom)) {
            dWRequest.paramMap.put("from", this.b.mFrom);
        }
        Map<String, String> uTParams = this.b.getUTParams();
        if (uTParams != null) {
            String str = uTParams.get("product_type");
            if (!StringUtils.isEmpty(str)) {
                dWRequest.paramMap.put("videoChannel", str);
            }
        }
        dWRequest.paramMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        dWRequest.paramMap.put("cpuModel", w);
        Map<String, String> map = dWRequest.paramMap;
        map.put("cpuHz", "" + x);
        dWRequest.paramMap.put("deviceMemory", y);
        Map<String, String> map2 = dWRequest.paramMap;
        map2.put("aliHARuntimeEvaluationLevel", "" + aks.a().g().f25407a);
        Map<String, String> map3 = dWRequest.paramMap;
        map3.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        if (this.b.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(this.b.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_USE_SERVER_DEFINITIONPRIORITY, "false"))) {
            z = false;
        }
        dWRequest.paramMap.put("useServerPriority", z ? "1" : "0");
    }

    public void d(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d431593", new Object[]{this, wVar, new Boolean(z)});
        } else if (this.u) {
        } else {
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                if (kck.a()) {
                    throw new RuntimeException("queryVideoConfigData error");
                }
                DWResponse dWResponse = new DWResponse();
                dWResponse.errorMsg = "error";
                wVar.onError(dWResponse);
                return;
            }
            a aVar = this.g;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.g.f16511a);
                    return;
                } else {
                    wVar.onError(this.g.f16511a);
                    return;
                }
            }
            this.r.add(wVar);
            if (this.j) {
                return;
            }
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.VIDEOCONFIG_API_NAME;
            dWRequest.apiVersion = "2.0";
            dWRequest.paramMap = new HashMap();
            a(dWRequest);
            dWRequest.paramMap.put("netSpeed", "0");
            this.j = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.d(g.this, false);
                        g.d(g.this, new a());
                        g.i(g.this).b = true;
                        g.i(g.this).f16511a = dWResponse2;
                        int size = g.j(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.j(g.this).get(i)).onSuccess(dWResponse2);
                        }
                        g.j(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.d(g.this, false);
                        int size = g.j(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.j(g.this).get(i)).onError(dWResponse2);
                        }
                        g.j(g.this).clear();
                    }
                }
            });
        }
    }

    public void e(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1824df2", new Object[]{this, wVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || this.u) {
            if (kck.a()) {
                throw new RuntimeException("queryConfigData error");
            }
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            wVar.onError(dWResponse);
        } else {
            a aVar = this.c;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.c.f16511a);
                    return;
                } else {
                    wVar.onError(this.c.f16511a);
                    return;
                }
            }
            this.q.add(wVar);
            if (this.k) {
                return;
            }
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.FRONTCOVER_API_NAME;
            dWRequest.apiVersion = "1.0";
            dWRequest.paramMap = new HashMap();
            dWRequest.paramMap.put("userId", Long.toString(this.b.mUserId));
            dWRequest.paramMap.put("sdkVersion", h.f16513a);
            dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.b.mInteractiveId));
            dWRequest.paramMap.put("includeAd", "1");
            dWRequest.paramMap.put("includeVideoSize", "1");
            dWRequest.paramMap.put("sysOS", "Android");
            dWRequest.paramMap.put("videoId", this.b.getVideoId());
            if (!StringUtils.isEmpty(this.b.mFrom)) {
                dWRequest.paramMap.put("from", this.b.mFrom);
            }
            this.k = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.e(g.this, false);
                        g.e(g.this, new a());
                        g.k(g.this).b = true;
                        g.k(g.this).f16511a = dWResponse2;
                        int size = g.l(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.l(g.this).get(i)).onSuccess(dWResponse2);
                        }
                        g.l(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.f(g.this, false);
                        int size = g.l(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.l(g.this).get(i)).onError(dWResponse2);
                        }
                        g.l(g.this).clear();
                    }
                }
            });
        }
    }

    public void a(com.taobao.avplayer.common.w wVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808ad60d", new Object[]{this, wVar, map, new Boolean(z)});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || this.u) {
            if (kck.a()) {
                throw new RuntimeException("queryBackCoverData error");
            }
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            wVar.onError(dWResponse);
        } else {
            a aVar = this.f;
            if (aVar != null && !z) {
                if (aVar.b) {
                    wVar.onSuccess(this.f.f16511a);
                    return;
                } else {
                    wVar.onError(this.f.f16511a);
                    return;
                }
            }
            this.t.add(wVar);
            if (this.n) {
                return;
            }
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.BACKCOVER_API_NAME;
            dWRequest.apiVersion = "1.0";
            dWRequest.paramMap = new HashMap();
            dWRequest.paramMap.put("userId", Long.toString(this.b.mUserId));
            dWRequest.paramMap.put("sdkVersion", h.f16513a);
            dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.b.mInteractiveId));
            dWRequest.paramMap.put("videoId", this.b.mVideoId);
            dWRequest.paramMap.put(sku.KEY_VIDEO_SOURCE, this.b.mVideoSource);
            dWRequest.paramMap.put("contentId", this.b.mContentId);
            if (map != null) {
                dWRequest.paramMap.putAll(map);
            }
            if (!StringUtils.isEmpty(this.b.mFrom)) {
                dWRequest.paramMap.put("from", this.b.mFrom);
            }
            this.n = true;
            a(dWRequest, new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.g.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.e(g.this, false);
                        g.f(g.this, new a());
                        g.m(g.this).b = true;
                        g.m(g.this).f16511a = dWResponse2;
                        int size = g.n(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.n(g.this).get(i)).onSuccess(dWResponse2);
                        }
                        g.n(g.this).clear();
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse2});
                    } else if (!g.a(g.this)) {
                        g.e(g.this, false);
                        int size = g.n(g.this).size();
                        for (int i = 0; i < size; i++) {
                            ((com.taobao.avplayer.common.w) g.n(g.this).get(i)).onError(dWResponse2);
                        }
                        g.n(g.this).clear();
                    }
                }
            });
        }
    }

    public void a(Map<String, String> map, com.taobao.avplayer.common.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c90513", new Object[]{this, map, wVar});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || this.u) {
            if (kck.a()) {
                throw new RuntimeException("queryConfigData error");
            }
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            wVar.onError(dWResponse);
        } else {
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = h.TAOKE_ITEM_CHECK;
            dWRequest.apiVersion = "1.0";
            dWRequest.paramMap = new HashMap();
            dWRequest.paramMap.putAll(map);
            a(dWRequest, wVar);
        }
    }

    private void a(DWRequest dWRequest, com.taobao.avplayer.common.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf802e1", new Object[]{this, dWRequest, wVar});
        } else if (dWRequest == null || this.b.mNetworkAdapter == null) {
            wVar.onError(null);
        } else {
            this.b.mNetworkAdapter.sendRequest(wVar, dWRequest);
        }
    }
}
