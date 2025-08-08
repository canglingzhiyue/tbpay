package tb;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.lzc;
import tb.skv;

/* loaded from: classes5.dex */
public class slk implements sli {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33696a;
    private String d;
    private long e;
    private JSONObject f;
    private boolean l;
    private String m;
    private boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private c r;
    private b s;
    private com.taobao.android.fluid.core.a<a> t;
    private com.taobao.android.fluid.core.a<a> u;
    private Map<String, Object> w;
    private Map<String, Object> x;
    private int y;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final List<com.taobao.android.fluid.framework.data.datamodel.a> c = new ArrayList();
    private int g = 0;
    private String z = null;
    private int h = 0;
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    private int v = -1;
    private Runnable A = new Runnable() { // from class: tb.slk.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState 兜底恢复isLoading=false");
            slk.this.a(true, false);
        }
    };
    private Runnable B = new Runnable() { // from class: tb.slk.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState 兜底恢复isLoading=false");
            slk.this.a(false, false);
        }
    };

    /* loaded from: classes5.dex */
    public static class d extends a {
        static {
            kge.a(1173135705);
        }

        public d(String str) {
            super(null, null, null, null, null);
            this.f = false;
            this.g = false;
            this.h = str;
        }
    }

    static {
        kge.a(1695910475);
        kge.a(2117190944);
    }

    public static /* synthetic */ FluidContext a(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("76512622", new Object[]{slkVar}) : slkVar.f33696a;
    }

    public static /* synthetic */ com.taobao.android.fluid.core.a a(slk slkVar, com.taobao.android.fluid.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("407c607a", new Object[]{slkVar, aVar});
        }
        slkVar.t = aVar;
        return aVar;
    }

    public static /* synthetic */ void a(slk slkVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4a134a", new Object[]{slkVar, jSONObject});
        } else {
            slkVar.b(jSONObject);
        }
    }

    public static /* synthetic */ void a(slk slkVar, IDataService iDataService, MediaMixContentDetail mediaMixContentDetail, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb79f430", new Object[]{slkVar, iDataService, mediaMixContentDetail, new Boolean(z)});
        } else {
            slkVar.a(iDataService, mediaMixContentDetail, z);
        }
    }

    public static /* synthetic */ void a(slk slkVar, IDataService iDataService, MtopResponse mtopResponse, MediaMixContentDetail mediaMixContentDetail, boolean z, long j, com.taobao.android.fluid.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd80b69", new Object[]{slkVar, iDataService, mtopResponse, mediaMixContentDetail, new Boolean(z), new Long(j), aVar});
        } else {
            slkVar.a(iDataService, mtopResponse, mediaMixContentDetail, z, j, aVar);
        }
    }

    public static /* synthetic */ void a(slk slkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4642e8b0", new Object[]{slkVar, str});
        } else {
            slkVar.a(str);
        }
    }

    public static /* synthetic */ void a(slk slkVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13113d87", new Object[]{slkVar, aVar});
        } else {
            slkVar.a(aVar);
        }
    }

    public static /* synthetic */ void a(slk slkVar, boolean z, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df53c1a", new Object[]{slkVar, new Boolean(z), new Integer(i), mtopResponse});
        } else {
            slkVar.a(z, i, mtopResponse);
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
    }

    public static /* synthetic */ boolean a(slk slkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfc47332", new Object[]{slkVar, new Boolean(z)})).booleanValue();
        }
        slkVar.o = z;
        return z;
    }

    public static /* synthetic */ com.taobao.android.fluid.core.a b(slk slkVar, com.taobao.android.fluid.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("597db219", new Object[]{slkVar, aVar});
        }
        slkVar.u = aVar;
        return aVar;
    }

    public static /* synthetic */ String b(slk slkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23a23cf", new Object[]{slkVar, str});
        }
        slkVar.p = str;
        return str;
    }

    public static /* synthetic */ void b(slk slkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed78d2e7", new Object[]{slkVar});
        } else {
            slkVar.d();
        }
    }

    public static /* synthetic */ boolean b(slk slkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a23cd1", new Object[]{slkVar, new Boolean(z)})).booleanValue();
        }
        slkVar.l = z;
        return z;
    }

    public static /* synthetic */ String c(slk slkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc04c5ae", new Object[]{slkVar, str});
        }
        slkVar.m = str;
        return str;
    }

    public static /* synthetic */ void c(slk slkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfbd968", new Object[]{slkVar});
        } else {
            slkVar.c();
        }
    }

    public static /* synthetic */ int d(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca7edfdc", new Object[]{slkVar})).intValue() : slkVar.y;
    }

    public static /* synthetic */ boolean e(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b901e66e", new Object[]{slkVar})).booleanValue() : slkVar.l;
    }

    public static /* synthetic */ com.taobao.android.fluid.core.a f(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("3fb89213", new Object[]{slkVar}) : slkVar.t;
    }

    public static /* synthetic */ List g(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9ac3195b", new Object[]{slkVar}) : slkVar.c;
    }

    public static /* synthetic */ boolean h(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("848af9f1", new Object[]{slkVar})).booleanValue() : slkVar.o;
    }

    public static /* synthetic */ com.taobao.android.fluid.core.a i(slk slkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("f9ad996", new Object[]{slkVar}) : slkVar.u;
    }

    public slk(FluidContext fluidContext) {
        this.f33696a = fluidContext;
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService != null) {
            spz.c("IRecommendRequestManager", "RecommendRequestManager addDetailRequestListener add callback");
            iDataService.addDetailRequestListener(new skv.a() { // from class: tb.slk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.skv.a
                public void onResult(com.taobao.android.fluid.framework.adapter.mtop.d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("1227a278", new Object[]{this, dVar});
                    }
                }

                @Override // tb.skv.a
                public void onStartRequest() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
                        return;
                    }
                    spz.c("IRecommendRequestManager", "DetailRequestListener callback, onStartRequest");
                    slk.a(slk.this, (a) null);
                }
            });
        }
    }

    @Override // tb.sli
    public void setTransmission(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ff92f8", new Object[]{this, map});
        } else {
            this.w = map;
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableDxRelatedInterceptLoadMore", true);
    }

    @Override // tb.sli
    public void setTransmissionUp(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69391dd", new Object[]{this, map});
        } else {
            this.x = map;
        }
    }

    private IMTOPRequest a(boolean z, boolean z2, String str, com.taobao.android.fluid.framework.data.datamodel.b bVar, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("817f3b1b", new Object[]{this, new Boolean(z), new Boolean(z2), str, bVar, new Boolean(z3)});
        }
        sps sessionParams = ((ISceneConfigService) this.f33696a.getService(ISceneConfigService.class)).getSessionParams();
        String str2 = sessionParams.j;
        if (StringUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        String str3 = str2;
        if (z) {
            this.i++;
        } else {
            this.h++;
        }
        return com.taobao.android.fluid.framework.data.remote.newmodel.a.a(this.f33696a, sessionParams, str, bVar.c(), str3, z ? this.i : this.h, StringUtils.isEmpty(sessionParams.u) ? "0" : sessionParams.u, z2, z3);
    }

    @Override // tb.sli
    public Map<String, Object> getTransmission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3c695056", new Object[]{this}) : this.w;
    }

    @Override // tb.sli
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState isloading=" + z2 + ", isUp=" + z);
        if (z) {
            this.k = z2;
            this.b.removeCallbacks(this.A);
        } else {
            this.j = z2;
            this.b.removeCallbacks(this.B);
        }
        if (!z2 || !sjt.I()) {
            return;
        }
        this.b.postDelayed(z ? this.A : this.B, 10000L);
    }

    @Override // tb.sli
    public void removeLoadingRequestCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fbf1", new Object[]{this, new Boolean(z)});
        } else if (z) {
            d();
        } else {
            c();
        }
    }

    @Override // tb.sli
    public Map<String, Object> getTransmissionUP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("803efbb1", new Object[]{this}) : this.x;
    }

    private void a(boolean z, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ceb831c", new Object[]{this, new Boolean(z), new Integer(i), mtopResponse});
        } else if (z) {
        } else {
            this.g = i;
            this.z = mtopResponse != null ? mtopResponse.getRetCode() : null;
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    @Override // tb.sli
    public void updateAppendRecommenParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb62578", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = this.f;
            if (jSONObject2 == null) {
                a(jSONObject);
            } else {
                jSONObject2.putAll(jSONObject);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<MediaContentDetailData> f33700a;
        public final Map<String, Object> b;
        public final JSONArray c;
        public final List<MediaContentDetailData> d;
        public final JSONArray e;
        public boolean f;
        public String h = null;
        public boolean g = true;

        static {
            kge.a(592190363);
        }

        public a(Map<String, Object> map, List<MediaContentDetailData> list, JSONArray jSONArray, List<MediaContentDetailData> list2, JSONArray jSONArray2) {
            this.b = map;
            this.f33700a = list;
            this.c = jSONArray;
            this.d = list2;
            this.e = jSONArray2;
        }

        public Map<String, Object> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
        }

        public int b() {
            MediaContentDetailData mediaContentDetailData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            List<MediaContentDetailData> list = this.f33700a;
            if (list != null && !list.isEmpty() && (mediaContentDetailData = this.f33700a.get(0)) != null) {
                return mediaContentDetailData.relativeIndex;
            }
            return 0;
        }

        public int a(boolean z) {
            MediaContentDetailData mediaContentDetailData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue();
            }
            List<MediaContentDetailData> list = this.f33700a;
            if (list == null || list.isEmpty()) {
                return -1;
            }
            int size = this.f33700a.size();
            if (z) {
                mediaContentDetailData = this.f33700a.get(size - 1);
            } else {
                mediaContentDetailData = this.f33700a.get(0);
            }
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.sequenceNumber;
            }
            return -1;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.f33700a;
            boolean z = list == null || list.size() == 0;
            List<MediaContentDetailData> list2 = this.d;
            return z && (list2 == null || list2.size() == 0);
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.f33700a;
            return (list == null || this.c == null || (list.isEmpty() && this.c.isEmpty()) || this.f33700a.size() != this.c.size()) ? false : true;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.d;
            return (list == null || this.e == null || list.size() != this.e.size()) ? false : true;
        }
    }

    @Override // tb.sli
    public void requestForCommendData(final boolean z, boolean z2, boolean z3, int i, String str, com.taobao.android.fluid.framework.data.datamodel.b bVar, final com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e11312c", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), str, bVar, aVar});
        } else if (spj.e(this.f33696a)) {
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData return isShopLoft=true");
            aVar.a(null);
        } else if (((IDataService) this.f33696a.getService(IDataService.class)).getLoadingState(z) && !((ICollectionService) this.f33696a.getService(ICollectionService.class)).isCollectionPagingEnable()) {
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData return isloading=true, isUp=" + z);
            a aVar2 = new a(null, null, null, null, null);
            aVar2.f = true;
            aVar.a(aVar2);
        } else {
            a(z, true);
            if (bVar != null) {
                bVar.f();
                bVar.b();
                bVar.g();
                bVar.d(this.f33696a);
                bVar.b(this.f33696a);
                if (z2 && sll.a(this.f33696a)) {
                    bVar.a();
                }
                if (sll.a(((ISceneConfigService) this.f33696a.getService(ISceneConfigService.class)).getSessionParams())) {
                    bVar.d();
                }
                if (skk.d()) {
                    bVar.e();
                }
                bVar.h();
                bVar.c(this.f33696a);
                JSONObject jSONObject = this.f;
                if (jSONObject != null) {
                    bVar.c(jSONObject);
                }
                bVar.a(this.f33696a);
                if (i >= 0) {
                    bVar.a(i);
                }
            }
            boolean z4 = skk.g() && !z3;
            IMTOPRequest a2 = a(z, z2, str, bVar, z4);
            final int a3 = skk.a();
            a(UUID.randomUUID().toString() + "_" + System.currentTimeMillis());
            a(System.currentTimeMillis());
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this.f33696a, "rec_mtop_start", a2.getApi(), a3, ((IDataService) this.f33696a.getService(IDataService.class)).getRecommendRequestId());
            final lzc.a d2 = ljq.d(this.f33696a);
            this.y = this.y + 1;
            final int i2 = this.y;
            final IDataService iDataService = (IDataService) this.f33696a.getService(IDataService.class);
            final int currentDetailSuccessMtopId = iDataService.getCurrentDetailSuccessMtopId();
            final long currentTimeMillis = System.currentTimeMillis();
            final boolean a4 = skk.a(this.f33696a);
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData发送,PickPreloadControllerNew");
            com.taobao.android.fluid.framework.adapter.mtop.b<MediaMixContentDetailResponse> bVar2 = new com.taobao.android.fluid.framework.adapter.mtop.b<MediaMixContentDetailResponse>() { // from class: tb.slk.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("PickPreloadControllerNew,VideoProcess PublicCardListController.requestForCommendData onError推荐接口失败 ");
                    sb.append(mtopResponse);
                    spz.c("IRecommendRequestManager", sb.toString() != null ? mtopResponse.getRetCode() : "null");
                    iDataService.setLoopOnceRequestRecommend(false);
                    slk.this.a(z, false);
                    pio.a(slk.a(slk.this), mtopResponse, currentTimeMillis, false);
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(slk.a(slk.this), "rec_mtop_error", mtopResponse, System.currentTimeMillis() - currentTimeMillis, a3, iDataService.getRecommendRequestId());
                    slk.a(slk.this, (String) null);
                    ljq.a(true, d2, mtopResponse);
                    if (iDataService.getCurrentDetailSuccessMtopId() != currentDetailSuccessMtopId) {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew discard requestForCommendData onError detailMtopId" + currentDetailSuccessMtopId + "mCurrentDetailSuccessMtopId" + iDataService.getCurrentDetailSuccessMtopId());
                        aVar.a(new d(mtopResponse.getRetCode()));
                        slk.a(slk.this, z, 1, mtopResponse);
                        return;
                    }
                    aVar.a(new d(mtopResponse.getRetCode()));
                    slk.a(slk.this, z, 2, mtopResponse);
                }

                @Override // com.taobao.android.fluid.framework.adapter.mtop.b
                public void a(MtopResponse mtopResponse, JSONObject jSONObject2, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e08a2d2c", new Object[]{this, mtopResponse, jSONObject2, mediaMixContentDetailResponse});
                        return;
                    }
                    spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData onSuccess推荐接口成功 cost=" + (System.currentTimeMillis() - currentTimeMillis) + ",PickPreloadControllerNew");
                    MediaMixContentDetailResponse a5 = (jSONObject2 == null || mediaMixContentDetailResponse != null) ? mediaMixContentDetailResponse : slr.a(a4, jSONObject2);
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.b(slk.a(slk.this), "rec_mtop_end", mtopResponse, System.currentTimeMillis() - currentTimeMillis, a3, iDataService.getRecommendRequestId());
                    slk.a(slk.this, (String) null);
                    slk.this.a(z, false);
                    slk.c(slk.this);
                    slk.b(slk.this);
                    if ((skk.n() && iDataService.canLoopOnceRequestRecommend()) && slk.d(slk.this) != i2) {
                        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData请求前和请求后的MtopId不一致，响应后续的请求，当前请求结果被舍弃，" + i2 + "，mCurrentRecommendMtopId:" + slk.d(slk.this));
                        slk.a(slk.this, z, 1, mtopResponse);
                    } else if (iDataService.getCurrentDetailSuccessMtopId() != currentDetailSuccessMtopId) {
                        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData PickPreloadControllerNew，discard requestForCommendData onSuccess detailMtopId" + currentDetailSuccessMtopId + "mCurrentDetailSuccessMtopId" + iDataService.getCurrentDetailSuccessMtopId());
                        aVar.a(null);
                        slk.a(slk.this, z, 1, mtopResponse);
                    } else if (a5 == null || a5.data == 0) {
                        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData PickPreloadControllerNew,推荐接口，推荐失败");
                        oce.c(slk.a(slk.this).getContext(), "推荐失败");
                        pio.a(slk.a(slk.this), mtopResponse, currentTimeMillis, false);
                        ljq.a(true, d2, mtopResponse);
                        aVar.a(null);
                        slk.a(slk.this, z, 2, mtopResponse);
                    } else {
                        ljq.a(false, d2, mtopResponse);
                        MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) a5.data;
                        if (z) {
                            slk.a(slk.this, Boolean.parseBoolean(mediaMixContentDetail.noMoreData));
                            slk.b(slk.this, mediaMixContentDetail.noMoreMsg);
                        } else {
                            slk.b(slk.this, Boolean.parseBoolean(mediaMixContentDetail.noMoreData));
                            slk.c(slk.this, mediaMixContentDetail.noMoreMsg);
                        }
                        iDataService.getConfig().j().c(mediaMixContentDetail.edgeComputeConfig);
                        JSONArray a6 = slm.a(jSONObject2, "data", sku.a(slk.a(slk.this)));
                        List<MediaContentDetailData> list = mediaMixContentDetail.pitList;
                        JSONArray a7 = slm.a(jSONObject2, "data", "pitList");
                        a aVar3 = new a(mediaMixContentDetail.config, mediaMixContentDetail.list, a6, list, a7);
                        StringBuilder sb = new StringBuilder();
                        sb.append("VideoProcess PublicCardListController.requestForCommendData, back,isUp=");
                        sb.append(z);
                        sb.append(", mixcontent.noMoreData=");
                        sb.append(mediaMixContentDetail.noMoreData);
                        sb.append(", mixcontent.noMoreMsg=");
                        sb.append(mediaMixContentDetail.noMoreMsg);
                        sb.append(", listsize=");
                        Object obj = "null";
                        sb.append(mediaMixContentDetail.list != null ? Integer.valueOf(mediaMixContentDetail.list.size()) : obj);
                        sb.append(", arraysize=");
                        sb.append(a6 != null ? Integer.valueOf(a6.size()) : obj);
                        sb.append(", , pitList=");
                        sb.append(list != null ? Integer.valueOf(list.size()) : obj);
                        sb.append(", , pitArray=");
                        if (a7 != null) {
                            obj = Integer.valueOf(a7.size());
                        }
                        sb.append(obj);
                        spz.c("IRecommendRequestManager", sb.toString());
                        slk.a(slk.this, iDataService, mediaMixContentDetail, z);
                        slk.a(slk.this, jSONObject2);
                        if (!aVar3.d() && !aVar3.e()) {
                            slk.a(slk.this, iDataService, mtopResponse, mediaMixContentDetail, z, currentTimeMillis, aVar);
                            return;
                        }
                        iDataService.setLoopOnceRequestRecommend(false);
                        aVar.a(aVar3);
                        if (aVar3.c()) {
                            slk.a(slk.this, z, 3, mtopResponse);
                        } else {
                            slk.a(slk.this, z, 5, mtopResponse);
                        }
                        pio.a(slk.a(slk.this), mtopResponse, currentTimeMillis, true);
                    }
                }
            };
            IMTopAdapter.a<MediaMixContentDetailResponse> aVar3 = new IMTopAdapter.a<MediaMixContentDetailResponse>() { // from class: tb.slk.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v5, types: [mtopsdk.mtop.domain.BaseOutDo, com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse] */
                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.a
                public /* synthetic */ MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseOutDo) ipChange2.ipc$dispatch("954600f8", new Object[]{this, bArr, cls}) : b(bArr, cls);
                }

                public MediaMixContentDetailResponse b(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MediaMixContentDetailResponse) ipChange2.ipc$dispatch("55fce272", new Object[]{this, bArr, cls});
                    }
                    spz.c("IRecommendRequestManager", "PickPreloadControllerNew动态解析，parseResponseListener");
                    if (!skk.f()) {
                        return slr.a(a4, bArr);
                    }
                    return null;
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put("asac", com.taobao.android.fluid.framework.data.remote.newmodel.b.ASAC_VALUE);
            c.a a5 = c.a.a().a(a2);
            if (!z4) {
                hashMap = null;
            }
            FluidSDK.getMTopAdapter().send(a5.a(hashMap).a(bVar2).a(aVar3).a(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_RECOMMOND).b(a3 == 2).a(MediaMixContentDetailResponse.class).a(new MtopModule.a() { // from class: tb.slk.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.module.MtopModule.a
                public void a(MtopBuilder mtopBuilder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("befc7114", new Object[]{this, mtopBuilder});
                    } else {
                        ljq.a(d2, mtopBuilder);
                    }
                }
            }).b());
            iDataService.getDetailUnlikeRecorder().a();
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        Object b2 = slm.b(jSONObject, "data", "grayParamsSession");
        if (!(b2 instanceof Map)) {
            return;
        }
        t trackTint = ((ITrackService) this.f33696a.getService(ITrackService.class)).getTrackTint();
        for (Map.Entry entry : ((Map) b2).entrySet()) {
            trackTint.a((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
    }

    private void a(IDataService iDataService, MtopResponse mtopResponse, MediaMixContentDetail mediaMixContentDetail, boolean z, long j, com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102faa6b", new Object[]{this, iDataService, mtopResponse, mediaMixContentDetail, new Boolean(z), new Long(j), aVar});
            return;
        }
        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData PickPreloadControllerNew,推荐接口，推荐视频为空");
        if (!iDataService.canLoopOnceRequestRecommend() || this.l) {
            z2 = false;
        }
        if (z2) {
            iDataService.setLoopOnceRequestRecommend(false);
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData needLoopRecommendRequest,推荐接口，轮询一次请求");
            iDataService.requestList(z, null, aVar);
            return;
        }
        oce.c(this.f33696a.getContext(), "推荐视频为空");
        pio.a(this.f33696a, mtopResponse, j, false);
        if (aVar != null) {
            aVar.a(null);
        }
        a(z, 3, mtopResponse);
    }

    private void a(IDataService iDataService, MediaMixContentDetail mediaMixContentDetail, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6e7432", new Object[]{this, iDataService, mediaMixContentDetail, new Boolean(z)});
        } else if (mediaMixContentDetail == null || ogv.a(mediaMixContentDetail.transmission)) {
        } else {
            if (z) {
                iDataService.setTransmissionUp(mediaMixContentDetail.transmission);
            } else {
                iDataService.setTransmission(mediaMixContentDetail.transmission);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.s == null) {
        } else {
            spz.c("IRecommendRequestManager", "MSG_REQUEST_RECOMMEND removeLoadMoreCallback，移除加载更多callback");
            this.b.removeCallbacks(this.s);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.r == null) {
        } else {
            spz.c("IRecommendRequestManager", "MSG_REQUEST_RECOMMEND removeLoadupCallback，移除向上加载callback");
            this.b.removeCallbacks(this.r);
        }
    }

    private void a(a aVar) {
        sno mediaCardListAdapter;
        krk i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17894309", new Object[]{this, aVar});
            return;
        }
        spz.c("IRecommendRequestManager", "hideLoadingMore");
        IFeedsListService iFeedsListService = (IFeedsListService) this.f33696a.getService(IFeedsListService.class);
        if (iFeedsListService == null || (mediaCardListAdapter = iFeedsListService.getMediaCardListAdapter()) == null || (i = mediaCardListAdapter.i()) == null) {
            return;
        }
        if ((sjt.I() || aVar == null) && !i.d()) {
            spz.c("IRecommendRequestManager", "hideLoadingMore 返回刷新 且 无loading时，不处理");
            return;
        }
        int i2 = krk.f30278a;
        if (aVar == null) {
            i2 = krk.d;
        } else if (!aVar.g) {
            i2 = krk.c;
        }
        iFeedsListService.getMediaCardListAdapter().i().a(i2, aVar == null ? null : aVar.h);
        int findLastVisibleItemPosition = iFeedsListService.getLayoutManager().findLastVisibleItemPosition();
        if (aVar == null || !aVar.g) {
            findLastVisibleItemPosition--;
        }
        iFeedsListService.smoothScrollToPosition(findLastVisibleItemPosition);
        StringBuilder sb = new StringBuilder();
        sb.append("hideLoadingMore requestForCommendData onCall 收起 loading footer, smoothScrollToPosition:");
        sb.append(findLastVisibleItemPosition);
        sb.append("; has target:");
        if (aVar != null) {
            z = true;
        }
        sb.append(z);
        spz.c("IRecommendRequestManager", sb.toString());
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final com.taobao.android.fluid.core.a<a> b;
        private int c = -1;
        private Map d;

        static {
            kge.a(1682943729);
            kge.a(-1390502639);
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1789b768", new Object[]{bVar});
            } else {
                bVar.a();
            }
        }

        public static /* synthetic */ com.taobao.android.fluid.core.a b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("c1e64ed1", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb408bdd", new Object[]{bVar})).intValue() : bVar.c;
        }

        public b(com.taobao.android.fluid.core.a<a> aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run()");
            if (((ILifecycleService) slk.a(slk.this).getService(ILifecycleService.class)).getPageState() == 5) {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return-- page destroy");
                a();
            } else if (((IDataService) slk.a(slk.this).getService(IDataService.class)).getMediaSetList().isEmpty()) {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return-- getMediaSetList().isEmpty()");
                a();
            } else if (((IDataService) slk.a(slk.this).getService(IDataService.class)).getConfig().j().o) {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return--disableRecommend");
                a();
            } else if (slk.e(slk.this) && !((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable() && !((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionRecommendEnable()) {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return--mNoMoreData");
                a();
            } else if (slk.a() && ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).getConfig().a() && this.d == null && !((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable() && ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionRecommendEnable()) {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return--mNoMoreData with dx");
                a();
            } else if (((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable() && this.c >= 0 && ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).LoadFromCollectionPagingCache(this.c + 1, this.b, false)) {
                slk.a(slk.this, (a) null);
            } else {
                spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable do requestForCommendData");
                sps sessionParams = ((ISceneConfigService) slk.a(slk.this).getService(ISceneConfigService.class)).getSessionParams();
                slk slkVar = slk.this;
                slkVar.requestForCommendData(false, true, false, this.c, null, com.taobao.android.fluid.framework.data.datamodel.b.a(sessionParams, ((IDataService) slk.a(slkVar).getService(IDataService.class)).getConfig().j()).f(((IDataService) slk.a(slk.this).getService(IDataService.class)).getTransmission()).a(((IDataService) slk.a(slk.this).getService(IDataService.class)).getDetailUnlikeRecorder()).a(jct.a(slk.a(slk.this))).a(false).c(this.d), new com.taobao.android.fluid.core.a<a>() { // from class: tb.slk.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.fluid.core.a
                    public void a(a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                            return;
                        }
                        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onCall end");
                        if (((IFeedsListService) slk.a(slk.this).getService(IFeedsListService.class)).getRecyclerView() != null) {
                            slk.a(slk.this, aVar);
                        }
                        if (aVar == null || !aVar.g) {
                            b.a(b.this);
                            if (slk.f(slk.this) != null) {
                                slk.f(slk.this).a(null);
                                slk.a(slk.this, (com.taobao.android.fluid.core.a) null);
                            }
                            spz.c("IRecommendRequestManager", "PickPreloadController,target 为null");
                        } else if (aVar.f) {
                            slk.a(slk.this, b.b(b.this));
                        } else {
                            boolean isCollectionPagingEnable = ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable();
                            boolean a2 = obo.a(aVar);
                            spz.c("IRecommendRequestManager", "请求结果，相关合集? " + a2 + " 是否分页：" + isCollectionPagingEnable);
                            if (a2) {
                                LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> convertToMediaSetDataList = ((IDataService) slk.a(slk.this).getService(IDataService.class)).convertToMediaSetDataList(aVar.f33700a, aVar.c);
                                slk.g(slk.this).addAll(convertToMediaSetDataList);
                                spz.c("IRecommendRequestManager", "相关合集 本次list=" + convertToMediaSetDataList.size() + "；总相关合集ist=" + slk.g(slk.this).size());
                            }
                            if (isCollectionPagingEnable && b.c(b.this) >= 0) {
                                ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).collectionPagingInsertData(b.c(b.this), aVar, aVar.a(false));
                            } else {
                                ((IDataService) slk.a(slk.this).getService(IDataService.class)).appendDetailListAtLast(aVar);
                                if (((IUsePreloadService) slk.a(slk.this).getService(IUsePreloadService.class)).enableTab3UseCacheData() && soq.g()) {
                                    sou.a(((IDataService) slk.a(slk.this).getService(IDataService.class)).getMediaSetList(), ((IFeedsListService) slk.a(slk.this).getService(IFeedsListService.class)).getActivePosition() + 1);
                                }
                                IPreCacheService iPreCacheService = (IPreCacheService) slk.a(slk.this).getService(IPreCacheService.class);
                                if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
                                    iPreCacheService.saveUnExposeDetailCache(((IDataService) slk.a(slk.this).getService(IDataService.class)).getMediaSetList(), ((IFeedsListService) slk.a(slk.this).getService(IFeedsListService.class)).getActivePosition());
                                }
                            }
                            smi.a(slk.a(slk.this), aVar, false);
                            if (b.b(b.this) != null) {
                                b.b(b.this).a(aVar);
                            }
                            if (slk.f(slk.this) != null) {
                                slk.f(slk.this).a(aVar);
                                slk.a(slk.this, (com.taobao.android.fluid.core.a) null);
                            }
                            spz.c("IRecommendRequestManager", "PickPreloadController,target 不为null");
                        }
                    }
                });
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public void a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            this.d = map;
            spz.c("IRecommendRequestManager", "PublicCardListController.mLoadMoreRunnable setParams：" + map);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            slk.a(slk.this, (a) null);
            com.taobao.android.fluid.core.a<a> aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(null);
        }
    }

    @Override // tb.sli
    public void requestDetailDataAndRefresh(skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c810699", new Object[]{this, skdVar});
        } else {
            ((IContainerService) this.f33696a.getService(IContainerService.class)).refreshWithCallback(skdVar);
        }
    }

    /* loaded from: classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final com.taobao.android.fluid.core.a<a> b;
        private int c = -1;

        static {
            kge.a(1147578359);
            kge.a(-1390502639);
        }

        public static /* synthetic */ void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("178a2bc7", new Object[]{cVar});
            } else {
                cVar.a();
            }
        }

        public static /* synthetic */ com.taobao.android.fluid.core.a b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("36258730", new Object[]{cVar}) : cVar.b;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb41003c", new Object[]{cVar})).intValue() : cVar.c;
        }

        public c(com.taobao.android.fluid.core.a<a> aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            spz.c("IRecommendRequestManager", "VideoProcess LoadUpRunnable run()" + this.c);
            if (!((IDataService) slk.a(slk.this).getService(IDataService.class)).getConfig().j().R) {
                spz.c("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--enableUpAction" + this.c);
                a();
            } else if (((ILifecycleService) slk.a(slk.this).getService(ILifecycleService.class)).getPageState() == 5) {
                spz.c("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--enableUpAction" + this.c);
                a();
            } else if (((IDataService) slk.a(slk.this).getService(IDataService.class)).getMediaSetList().isEmpty()) {
                spz.c("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--isEmpty" + this.c);
                a();
            } else if (slk.h(slk.this) && !((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable()) {
                spz.c("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--mNoMoreDataUp" + this.c);
                a();
            } else if (((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable() && this.c > 0 && ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).LoadFromCollectionPagingCache(this.c - 1, this.b, true)) {
            } else {
                sps sessionParams = ((ISceneConfigService) slk.a(slk.this).getService(ISceneConfigService.class)).getSessionParams();
                slk slkVar = slk.this;
                slkVar.requestForCommendData(true, true, false, this.c, null, com.taobao.android.fluid.framework.data.datamodel.b.a(sessionParams, ((IDataService) slk.a(slkVar).getService(IDataService.class)).getConfig().j()).f(((IDataService) slk.a(slk.this).getService(IDataService.class)).getTransmissionUP()).a(((IDataService) slk.a(slk.this).getService(IDataService.class)).getDetailUnlikeRecorder()).a(jct.a(slk.a(slk.this))).a(true), new com.taobao.android.fluid.core.a<a>() { // from class: tb.slk.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.fluid.core.a
                    public void a(a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                            return;
                        }
                        spz.b("IRecommendRequestManager", "requestForCommendData onCall up");
                        if (aVar == null) {
                            c.a(c.this);
                            if (slk.i(slk.this) == null) {
                                return;
                            }
                            slk.i(slk.this).a(aVar);
                            slk.b(slk.this, (com.taobao.android.fluid.core.a) null);
                        } else if (aVar.f) {
                            slk.b(slk.this, c.b(c.this));
                        } else {
                            if (((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).isCollectionPagingEnable()) {
                                ((ICollectionService) slk.a(slk.this).getService(ICollectionService.class)).collectionPagingInsertData(c.c(c.this), aVar, aVar.a(true));
                            } else {
                                ((IDataService) slk.a(slk.this).getService(IDataService.class)).appendDetailListAtFirst(aVar);
                            }
                            smi.a(slk.a(slk.this), aVar, true);
                            if (c.b(c.this) != null) {
                                c.b(c.this).a(aVar);
                            }
                            if (slk.i(slk.this) == null) {
                                return;
                            }
                            slk.i(slk.this).a(aVar);
                            slk.b(slk.this, (com.taobao.android.fluid.core.a) null);
                        }
                    }
                });
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            com.taobao.android.fluid.core.a<a> aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(null);
        }
    }

    @Override // tb.sli
    public String getRecommendRequestId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("993fa4d5", new Object[]{this}) : this.d;
    }

    @Override // tb.sli
    public long getStartRecommendtime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76844038", new Object[]{this})).longValue() : this.e;
    }

    @Override // tb.sli
    public int getNoRecReason() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15258af7", new Object[]{this})).intValue() : this.g;
    }

    @Override // tb.sli
    public String getRequestRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee1a0884", new Object[]{this}) : this.z;
    }

    @Override // tb.sli
    public boolean isDownNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de829217", new Object[]{this})).booleanValue() : this.l;
    }

    @Override // tb.sli
    public boolean isLoadingMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2ac832", new Object[]{this})).booleanValue() : this.j;
    }

    @Override // tb.sli
    public boolean isLoadingUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0a514f8", new Object[]{this})).booleanValue() : this.k;
    }

    @Override // tb.sli
    public boolean isNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b47f59d5", new Object[]{this})).booleanValue() : this.l;
    }

    @Override // tb.sli
    public String getNoMoreMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f44e9e4", new Object[]{this}) : this.m;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // tb.sli
    public void setHasShowNoMoreMsg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d802c77", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    @Override // tb.sli
    public boolean isHasShowNoMoreMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60df62c9", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // tb.sli
    public boolean isNoMoreDataUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8956490", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // tb.sli
    public String getNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94bb6349", new Object[]{this}) : this.p;
    }

    @Override // tb.sli
    public void setHasShowNoMoreMsgUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aa741c", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    @Override // tb.sli
    public boolean ismHasShowNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fcc931d", new Object[]{this})).booleanValue() : this.q;
    }

    @Override // tb.sli
    public boolean isUpNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3ac3ed0", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // tb.sli
    public boolean getLoadingState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06616e6", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return this.k;
        }
        return this.j;
    }

    @Override // tb.sli
    public boolean enableRecommendMtopNew() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67139b0a", new Object[]{this})).booleanValue() : skk.a(this.f33696a);
    }

    @Override // tb.sli
    public void resetNoMoreDataFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36a342", new Object[]{this});
            return;
        }
        this.o = false;
        this.p = "";
        this.l = false;
        this.m = "";
    }

    @Override // tb.sli
    public void postLoadUpRunnable() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b46a5", new Object[]{this});
            return;
        }
        c cVar = this.r;
        if (cVar != null) {
            this.b.removeCallbacks(cVar);
        }
        this.r = new c(null);
        if (((ICollectionService) this.f33696a.getService(ICollectionService.class)).isCollectionPagingEnable() && (a2 = obo.a(((IDataService) this.f33696a.getService(IDataService.class)).getMediaSetList(), 0)) > 1) {
            this.r.a(a2);
        }
        this.b.post(this.r);
    }

    @Override // tb.sli
    public void postLoadDownRunnable() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642ed0ac", new Object[]{this});
            return;
        }
        spz.c("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable postLoadDownRunnable");
        b bVar = this.s;
        if (bVar != null) {
            this.b.removeCallbacks(bVar);
        }
        this.s = new b(null);
        if (((ICollectionService) this.f33696a.getService(ICollectionService.class)).isCollectionPagingEnable() && (a2 = obo.a(((IDataService) this.f33696a.getService(IDataService.class)).getMediaSetList(), ((IDataService) this.f33696a.getService(IDataService.class)).getMediaSetList().size() - 1)) > 0) {
            this.s.a(a2);
        }
        this.b.post(this.s);
    }

    @Override // tb.sli
    public void postLoadMoreRunnable(int i, Map map, com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402c6c17", new Object[]{this, new Integer(i), map, aVar});
            return;
        }
        b bVar = new b(aVar);
        if (i != -1) {
            bVar.a(i - 1);
        }
        bVar.a(map);
        this.b.post(bVar);
    }

    @Override // tb.sli
    public void requestListInternal(boolean z, Map map, com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bca69d6", new Object[]{this, new Boolean(z), map, aVar});
            return;
        }
        removeLoadingRequestCallback(z);
        if (z) {
            this.b.post(new c(aVar));
            return;
        }
        b bVar = new b(aVar);
        bVar.a(map);
        this.b.post(bVar);
    }

    @Override // tb.sli
    public void requestListForCollectionPaging(boolean z, int i, Map map, com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eef82af", new Object[]{this, new Boolean(z), new Integer(i), map, aVar});
            return;
        }
        spz.c("IRecommendRequestManager", "H5分页合集请求的剧集" + i + "istop:" + z);
        if (z) {
            c cVar = new c(aVar);
            cVar.a(i + 1);
            this.b.post(cVar);
            return;
        }
        b bVar = new b(aVar);
        bVar.a(map);
        bVar.a(i - 1);
        this.b.post(bVar);
    }

    @Override // tb.sli
    public void postLoadUpRunnable(int i, com.taobao.android.fluid.core.a<a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884ed5ba", new Object[]{this, new Integer(i), aVar});
            return;
        }
        c cVar = new c(aVar);
        if (i != -1) {
            cVar.a(i + 1);
        }
        this.b.post(cVar);
    }

    @Override // tb.sli
    public List<com.taobao.android.fluid.framework.data.datamodel.a> getRelatedCollectionData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("56b3ad03", new Object[]{this}) : this.c;
    }

    @Override // tb.sli
    public int getLastDataSequenceNumber() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55cb555a", new Object[]{this})).intValue();
        }
        a.c currentMediaDetail = ((IDataService) this.f33696a.getService(IDataService.class)).getCurrentMediaDetail();
        if (currentMediaDetail != null && currentMediaDetail.d != null && (jSONObject = (JSONObject) currentMediaDetail.d.get("extraData")) != null && jSONObject.get("collectionData") != null) {
            this.v = oec.a(((JSONObject) jSONObject.get("collectionData")).get("count"), -1);
        }
        return this.v;
    }
}
