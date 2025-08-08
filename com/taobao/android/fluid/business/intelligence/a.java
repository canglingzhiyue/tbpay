package com.taobao.android.fluid.business.intelligence;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.search.common.util.i;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import com.taobao.tbmobilesmartapi.core.SceneContext;
import com.taobao.tbmobilesmartapi.core.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ihi;
import tb.jcs;
import tb.kge;
import tb.obu;
import tb.oeb;
import tb.ohd;
import tb.psw;
import tb.ptk;
import tb.shm;
import tb.snd;
import tb.son;
import tb.spx;
import tb.spy;
import tb.spz;
import tb.svm;
import tb.svn;
import tb.svo;
import tb.svp;
import tb.svq;
import tb.sxa;

/* loaded from: classes5.dex */
public final class a extends ptk implements SceneContext.a, snd, svn.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private svm f12397a;
    private svn b;
    private svo c;
    private svp d;
    private final FluidContext e;
    private sxa k = null;
    private String l = "-1";
    private boolean m = false;
    private String m_;

    static {
        kge.a(-82682804);
        kge.a(1755210026);
        kge.a(1570898053);
        kge.a(162974293);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -13334628) {
            super.a((spy) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ svm a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (svm) ipChange.ipc$dispatch("54849a2d", new Object[]{aVar}) : aVar.f12397a;
    }

    public static /* synthetic */ void a(a aVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d80a7e", new Object[]{aVar, cVar});
        } else {
            aVar.a(cVar);
        }
    }

    public static /* synthetic */ void b(a aVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8353201d", new Object[]{aVar, cVar});
        } else {
            aVar.b(cVar);
        }
    }

    public a(FluidContext fluidContext) {
        this.e = fluidContext;
        if (obu.i()) {
            return;
        }
        IMessageService iMessageService = (IMessageService) this.e.getService(IMessageService.class);
        if (iMessageService != null) {
            iMessageService.registerMessageHandler(this);
        }
        ((ILifecycleService) this.e.getService(ILifecycleService.class)).addPageLifecycleListener(this);
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue() : "VSMSG_getMobileInfo".equals(spyVar.c);
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
            return;
        }
        super.a(spyVar);
        if (!"VSMSG_getMobileInfo".equals(spyVar.c)) {
            return;
        }
        spz.c("Tab2MobileAI", "handle getHandInfo Message");
        if (spyVar.g == null || this.k == null) {
            return;
        }
        spyVar.g.a(this, this.k.b());
        spz.c("Tab2MobileAI", "messageReturn" + this.k.b().toJSONString());
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        try {
            this.m_ = ((ISceneConfigService) this.e.getService(ISceneConfigService.class)).getSessionParams().c;
            if (StringUtils.isEmpty(this.m_)) {
                this.m_ = "fluid";
            }
            d();
            c();
            m();
            this.b = (svn) this.f12397a.a(svn.class);
            cu_();
            this.c = (svo) this.f12397a.a(svo.class);
            this.d = (svp) this.f12397a.a(svp.class);
            g();
            if (oeb.a("ShortVideo.enableHandleRecognize", true)) {
                this.k = (sxa) this.f12397a.a(sxa.class);
                l();
            }
            this.f12397a.a();
        } catch (Exception e) {
            spz.c("Tab2MobileAI", "initMobileContext error");
            IntelligenceService.throwErrorCode(this.e, 1005, "端智能服务初始化异常", e);
        }
    }

    private JSONObject a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3729093d", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
        }
        return jSONObject;
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c("Tab2MobileAI", "MobileAiBridge" + System.identityHashCode(this) + "onResume");
        svm svmVar = this.f12397a;
        if (svmVar != null) {
            svmVar.b();
        }
        svo svoVar = this.c;
        if (svoVar == null || svoVar.e()) {
            return;
        }
        e();
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c("Tab2MobileAI", "MobileAiBridge" + System.identityHashCode(this) + "onPause");
        svm svmVar = this.f12397a;
        if (svmVar == null) {
            return;
        }
        svmVar.c();
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        svm svmVar = this.f12397a;
        if (svmVar != null) {
            svmVar.d();
        }
        IMessageService iMessageService = (IMessageService) this.e.getService(IMessageService.class);
        if (iMessageService == null) {
            return;
        }
        iMessageService.unRegisterMessageHandler(this);
    }

    private void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5eda45", new Object[]{this, cVar});
            return;
        }
        cv_();
        c(cVar);
        spz.a("Tab2MobileAI", "onCardActive");
        svp svpVar = this.d;
        if (svpVar == null) {
            return;
        }
        svpVar.k();
    }

    private void b(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b362a5a4", new Object[]{this, cVar});
            return;
        }
        spz.a("Tab2MobileAI", "onCardDisActive");
        svp svpVar = this.d;
        if (svpVar == null) {
            return;
        }
        svpVar.l();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            ((ICardService) this.e.getService(ICardService.class)).addCardLifecycleListener(new shm.a() { // from class: com.taobao.android.fluid.business.intelligence.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.shm.a, tb.shm
                public void onActive(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    } else {
                        a.a(a.this, pswVar.D());
                    }
                }

                @Override // tb.shm.a, tb.shm
                public void onDisActive(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
                    } else {
                        a.b(a.this, pswVar.D());
                    }
                }
            });
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SceneContext sceneContext = new SceneContext();
        sceneContext.f22196a = this.m_;
        sceneContext.b = obu.e();
        sceneContext.d = this;
        spz.c("Tab2MobileAI", "mobileAIBridge:" + System.identityHashCode(this) + ",initMobileContext:" + this.m_);
        this.f12397a = svm.b(sceneContext);
    }

    @Override // com.taobao.tbmobilesmartapi.core.SceneContext.a
    public JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9490f01e", new Object[]{this, str, jSONObject});
        }
        spz.a("ReorderContentBridge", "回调打印" + str);
        if (!str.equals(SceneContext.a.COMMON_TRACK_PARAMS)) {
            return null;
        }
        JSONObject a2 = a(((ITrackService) this.e.getService(ITrackService.class)).getActiveCardCommonTrack());
        if (a2.isEmpty()) {
            IntelligenceService.throwErrorCode(this.e, 1011, "获取公共参数为空", null);
        }
        return a2;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DefaultGestureCollectorDelegateLayout mainContentView = ((IContainerService) this.e.getService(IContainerService.class)).getMainContentView();
        svo svoVar = this.c;
        if (svoVar == null || mainContentView == null) {
            return;
        }
        com.taobao.tbmobilesmartapi.collector.a h = svoVar.h();
        mainContentView.setGestureCollector(h);
        int[] e = jcs.e();
        h.a(this.m);
        h.a(e[1]);
        this.c.a(ohd.c(mainContentView.getContext()), ohd.b(mainContentView.getContext()), ohd.e(mainContentView.getContext()));
    }

    private void cu_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42002834", new Object[]{this});
            return;
        }
        svn svnVar = this.b;
        if (svnVar == null) {
            return;
        }
        svnVar.a(this);
    }

    @Override // tb.svn.c
    public boolean a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : ((IDataService) this.e.getService(IDataService.class)).reOrderTailUnExposeList(list);
    }

    @Override // tb.svn.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ((ISceneConfigService) this.e.getService(ISceneConfigService.class)).getSessionParams();
        if (this.e.getService(IDataService.class) != null) {
            if (oeb.a("ShortVideo.enableSmartRecommendAvoid", true) && System.currentTimeMillis() - ((IDataService) this.e.getService(IDataService.class)).getStartRecommendtime() < 2000) {
                return false;
            }
            ((IDataService) this.e.getService(IDataService.class)).requestList(false, new HashMap(), null);
        }
        return true;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        svp svpVar = this.d;
        if (svpVar == null) {
            return;
        }
        svpVar.e();
        this.d.h();
        this.d.i();
        if (!oeb.a("ShortVideo.enableSensorCollection", true)) {
            return;
        }
        this.d.j();
    }

    private void l() {
        svo svoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        sxa sxaVar = this.k;
        if (sxaVar == null || (svoVar = this.c) == null) {
            return;
        }
        sxaVar.a(svoVar);
        spz.c("Tab2MobileAI", "initHandleRecognizeService,uiLayout" + this.l);
        this.k.a(this.l);
    }

    private void c(final a.c cVar) {
        IMessageService iMessageService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9667103", new Object[]{this, cVar});
            return;
        }
        try {
            if (!FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableNewSmartExposure", true) || (iMessageService = (IMessageService) this.e.getService(IMessageService.class)) == null) {
                return;
            }
            iMessageService.sendMessage(new spy("VSMSG_getNextListInfo", cVar.c, null, new spy.a() { // from class: com.taobao.android.fluid.business.intelligence.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -162361891) {
                        return new Boolean(super.a((spx) objArr[0], objArr[1]));
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.spy.a
                public boolean a(spx spxVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
                    }
                    if (a.a(a.this) != null && a.a(a.this).a(svq.class) != null) {
                        a.a(a.this).a(svq.class);
                    }
                    return super.a(spxVar, obj);
                }
            }));
        } catch (Throwable th) {
            spz.c("Tab2MobileAI", "cardExposure error");
            IntelligenceService.throwErrorCode(this.e, 1008, "动态推荐曝光埋点异常", th);
        }
    }

    private void cv_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b500d3", new Object[]{this});
        } else if (son.K()) {
            ihi.a(new Runnable() { // from class: com.taobao.android.fluid.business.intelligence.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.this.bX_();
                    }
                }
            }, 3001, 500L, "smartmodel");
        } else {
            bX_();
        }
    }

    public void bX_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9d62f0", new Object[]{this});
            return;
        }
        try {
            c cVar = new c();
            HashMap<String, Object> hashMap = new HashMap<>();
            a(hashMap);
            cVar.f22197a = hashMap;
            if (this.f12397a.a(svn.class) == null) {
                return;
            }
            ((svn) this.f12397a.a(svn.class)).a(cVar);
        } catch (Throwable th) {
            spz.c("Tab2MobileAI", "sendDataToSmartModel error");
            IntelligenceService.throwErrorCode(this.e, 1007, "发送端重排数据异常", th);
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (((IFeedsListService) this.e.getService(IFeedsListService.class)) == null) {
        } else {
            List<a.c> unExposedItems = ((IDataService) this.e.getService(IDataService.class)).getUnExposedItems();
            a.c currentMediaDetail = ((IDataService) this.e.getService(IDataService.class)).getCurrentMediaDetail();
            int currentMediaPosition = ((IDataService) this.e.getService(IDataService.class)).getCurrentMediaPosition();
            if (currentMediaDetail == null) {
                return;
            }
            String g = currentMediaDetail.g();
            String[] d = d(currentMediaDetail);
            JSONArray a_ = a_(unExposedItems);
            hashMap.put("contentId", g);
            hashMap.put("index", Integer.valueOf(currentMediaPosition));
            hashMap.put(i.b.MEASURE_PARSEDATA, d);
            hashMap.put("unExposeListData", a_);
            spz.c("Tab2MobileAI", "sendDataToSmartModel jsonObject:" + unExposedItems.size());
        }
    }

    private String[] d(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("799c7bb1", new Object[]{this, cVar});
        }
        String[] strArr = {"", "", ""};
        if (cVar == null) {
            return strArr;
        }
        JSONObject jSONObject = cVar.d;
        JSONObject jSONObject2 = null;
        MediaContentDetailData.Content f = cVar.f();
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            jSONObject2 = jSONObject.getJSONObject("extraData");
        }
        if (jSONObject2 != null) {
            strArr[1] = jSONObject2.getString("bxModelData");
        }
        if (f != null) {
            strArr[0] = f.id;
            strArr[2] = cVar.G();
        }
        return strArr;
    }

    private JSONArray a_(List<a.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36712e8", new Object[]{this, list});
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (a.c cVar : list) {
                String[] d = d(cVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("contentId", (Object) d[0]);
                jSONObject.put("bxScoreData", (Object) d[1]);
                jSONObject.put("type", (Object) d[2]);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        JSONObject jSONObject = (JSONObject) oeb.a(IIntelligenceService.KEY_ABTEST_UI_RELAYOUT, new JSONObject());
        if (jSONObject.containsKey("uiLayoutStrategy")) {
            String obj = jSONObject.get("uiLayoutStrategy").toString();
            spz.c("Tab2MobileAI", "initHandleRecognizeService info:" + jSONObject.toJSONString());
            this.l = obj;
        } else {
            this.l = "-1";
        }
        if (!jSONObject.containsKey("enableHandCollect")) {
            return;
        }
        if (!jSONObject.get("enableHandCollect").equals(true) && !jSONObject.get("enableHandCollect").equals("true")) {
            return;
        }
        this.m = true;
    }
}
