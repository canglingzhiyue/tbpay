package tb;

import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.preload.PreloadService;
import com.taobao.android.fluid.framework.preload.dwinstance.b;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.skv;

/* loaded from: classes5.dex */
public class skw implements skx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAKE_CONTENT_ID = "88888888";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33668a;
    private final skv b;
    private final IContainerService c;
    private final ISceneConfigService e;
    private final IUsePreloadService f;
    private com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>> h;
    private Map j;
    private boolean m;
    private int n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private int s;
    private long u;
    private long v;
    private long w;
    private final List<com.taobao.android.fluid.framework.data.datamodel.a> d = new ArrayList(2);
    private Map<String, Object> g = new HashMap();
    private boolean x = true;
    private boolean i = false;
    private boolean k = false;
    private boolean l = false;
    private String t = "normal";
    private String y = null;
    private int z = -1;

    static {
        kge.a(352627618);
        kge.a(-7193546);
    }

    public static /* synthetic */ FluidContext a(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("be404f4f", new Object[]{skwVar}) : skwVar.f33668a;
    }

    public static /* synthetic */ Map a(skw skwVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36de0241", new Object[]{skwVar, map});
        }
        skwVar.j = map;
        return map;
    }

    public static /* synthetic */ void a(skw skwVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5aed57", new Object[]{skwVar, runnable});
        } else {
            skwVar.a(runnable);
        }
    }

    public static /* synthetic */ void a(skw skwVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96739f48", new Object[]{skwVar, map, new Boolean(z)});
        } else {
            skwVar.a(map, z);
        }
    }

    public static /* synthetic */ boolean a(skw skwVar, d dVar, sor sorVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef080caa", new Object[]{skwVar, dVar, sorVar, str})).booleanValue() : skwVar.a(dVar, sorVar, str);
    }

    public static /* synthetic */ boolean a(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb8b49f", new Object[]{skwVar, new Boolean(z)})).booleanValue();
        }
        skwVar.k = z;
        return z;
    }

    public static /* synthetic */ boolean b(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed702fde", new Object[]{skwVar})).booleanValue() : skwVar.c();
    }

    public static /* synthetic */ boolean b(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0967e3e", new Object[]{skwVar, new Boolean(z)})).booleanValue();
        }
        skwVar.i = z;
        return z;
    }

    public static /* synthetic */ int c(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf3364e", new Object[]{skwVar})).intValue() : skwVar.n;
    }

    public static /* synthetic */ void c(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27447d9", new Object[]{skwVar, new Boolean(z)});
        } else {
            skwVar.b(z);
        }
    }

    public static /* synthetic */ com.taobao.android.fluid.core.a d(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("69c5de04", new Object[]{skwVar}) : skwVar.h;
    }

    public static /* synthetic */ boolean d(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8452117c", new Object[]{skwVar, new Boolean(z)})).booleanValue();
        }
        skwVar.o = z;
        return z;
    }

    public static /* synthetic */ IContainerService e(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerService) ipChange.ipc$dispatch("b39a11c2", new Object[]{skwVar}) : skwVar.c;
    }

    public static /* synthetic */ boolean e(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("662fdb1b", new Object[]{skwVar, new Boolean(z)})).booleanValue();
        }
        skwVar.r = z;
        return z;
    }

    public static /* synthetic */ IUsePreloadService f(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUsePreloadService) ipChange.ipc$dispatch("c9ce9cf6", new Object[]{skwVar}) : skwVar.f;
    }

    public static /* synthetic */ List g(skw skwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("571dd808", new Object[]{skwVar}) : skwVar.d;
    }

    public static /* synthetic */ boolean g(skw skwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29eb6e59", new Object[]{skwVar, new Boolean(z)})).booleanValue();
        }
        skwVar.x = z;
        return z;
    }

    public skw(FluidContext fluidContext) {
        this.f33668a = fluidContext;
        this.b = new skv(fluidContext);
        this.c = (IContainerService) fluidContext.getService(IContainerService.class);
        this.f = (IUsePreloadService) this.f33668a.getService(IUsePreloadService.class);
        this.e = (ISceneConfigService) this.f33668a.getService(ISceneConfigService.class);
        d();
    }

    @Override // tb.skx
    public void fetchContentDetail(a.C0494a c0494a, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf5de4a", new Object[]{this, c0494a, aVar});
        } else {
            this.b.a(c0494a, aVar);
        }
    }

    @Override // tb.skx
    public void fetchContentDetail(Map map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b69b8e", new Object[]{this, map, new Boolean(z), new Boolean(z2)});
        } else {
            fetchContentDetail(map, z, false, z2, null);
        }
    }

    @Override // tb.skx
    public void fetchContentDetail(Map map, final boolean z, boolean z2, final boolean z3, final skd skdVar) {
        sor i;
        String str;
        int i2;
        String str2;
        String str3;
        a.C0494a c0494a;
        String str4;
        boolean z4;
        a.C0494a c0494a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf624ea", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3), skdVar});
            return;
        }
        ((IAnalysisService) this.f33668a.getService(IAnalysisService.class)).getFluidInstanceAnalysis().c(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name());
        final sps sessionParams = ((ISceneConfigService) this.f33668a.getService(ISceneConfigService.class)).getSessionParams();
        final Map a2 = a(sessionParams, map);
        boolean isLaunchCodeRequest = this.f.isLaunchCodeRequest();
        this.f.setIsLaunchCodeRequest(false);
        if (a(a2)) {
            spz.c("IRecommendRequestManager", "isLoadingWithSameArgs, return, args:" + a2);
            return;
        }
        this.n++;
        int i3 = this.n;
        String rawId = TextUtils.isEmpty(this.c.getRawId()) ? sessionParams.d : this.c.getRawId();
        if (!this.l) {
            rawId = sov.a(this.f33668a);
        }
        this.l = true;
        if (z3 && a(z)) {
            this.f.getConfig().a((sor) null);
            i = null;
        } else {
            i = this.f.getConfig().i();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("请求开始，preloadedVideo：");
        sb.append(i != null ? i.toString() : null);
        spz.c("IRecommendRequestManager", sb.toString());
        String str5 = this.t;
        String tab3ComponentSource = this.f33668a.getInstanceConfig().getTab3ComponentSource();
        boolean f = spj.f(this.f33668a);
        if (i != null) {
            boolean z5 = i.p;
            if (c.a(i, sop.a().b(), f)) {
                String str6 = i.b;
                str4 = rawId;
                Map map2 = i.i;
                c0494a2 = slq.a(sessionParams, str6, map2);
                String a3 = slq.a(sessionParams, map2);
                i2 = i3;
                c.a a4 = slq.a(sessionParams, tab3ComponentSource, false, false, str5);
                str = "IRecommendRequestManager";
                z4 = true;
                a4.a(true).d(!TextUtils.isEmpty(i.j));
                c0494a2.c(JSON.toJSONString(a4.a())).b(a3);
                str3 = str6;
            } else {
                str4 = rawId;
                str = "IRecommendRequestManager";
                i2 = i3;
                z4 = true;
                str3 = null;
                c0494a2 = null;
            }
            if (!ogv.a(a2) || !i.s || z5) {
                z4 = false;
            }
            if (!z4 || TextUtils.isEmpty(i.b)) {
                c0494a = c0494a2;
                str2 = str4;
            } else {
                c0494a = c0494a2;
                str2 = i.b;
            }
        } else {
            str = "IRecommendRequestManager";
            i2 = i3;
            str2 = rawId;
            str3 = null;
            c0494a = null;
        }
        String a5 = slq.a(sessionParams, a2);
        c.a a6 = slq.a(sessionParams, tab3ComponentSource, f, false, str5);
        a6.d(z2);
        a.C0494a a7 = slq.a(sessionParams, str2, a2);
        a7.c(JSON.toJSONString(a6.a())).b(a5);
        if (isLaunchCodeRequest) {
            a7.f(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_LAUNCH);
        } else if (z) {
            a7.f(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_ICONSTREAM);
        } else {
            a7.f(TextUtils.equals("normal", str5) ? com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_NORMAL : com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_REFRESH);
        }
        a(i, z);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PickPreloadControllerNew,fetchContentDetail方法调用，needCacheRequest：");
        sb2.append(TextUtils.isEmpty(str3) ? "false" : "true");
        sb2.append(",contentId:");
        sb2.append(str2);
        spz.c(str, sb2.toString());
        final int i4 = i2;
        final sor sorVar = i;
        final String str7 = str2;
        this.b.a(c0494a, a7, new skv.b() { // from class: tb.skw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skv.b
            public void onResult(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94e8df43", new Object[]{this, dVar, dVar2});
                    return;
                }
                ogh.a("detailcallback");
                skw.a(skw.this, false);
                skw.this.a(dVar2);
                if (skdVar != null) {
                    smk.a(skw.a(skw.this), skdVar);
                }
                if (skw.b(skw.this) && skw.c(skw.this) != i4) {
                    spz.c("IRecommendRequestManager", "PickPreloadControllerNew,discard fetchContentDetail onSuccess detailMtopId" + i4 + "mCurrentDetailMtopId" + skw.c(skw.this) + "，请求的Mtop对应不上，响应后面的请求，前面请求的返回未返回的情况下return掉不处理");
                    return;
                }
                boolean a8 = d.f12462a.a((d) dVar);
                boolean a9 = d.f12462a.a((d) dVar2);
                ((IDataService) skw.a(skw.this).getService(IDataService.class)).setTab3CacheEnable(false);
                try {
                    if (dVar == null) {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail，只响应真实请求的回调");
                        if (a9) {
                            skw.this.a(skw.d(skw.this), (d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>) null, dVar2, sessionParams);
                        } else if (skw.a(skw.this, dVar2, sorVar, str7)) {
                            spz.c("IRecommendRequestManager", "autoRefresh，contentId:" + str7);
                            skw.e(skw.this).refreshWithCallback(null);
                        } else {
                            skw.this.a(skw.d(skw.this), dVar2);
                        }
                    } else if (a8 && a9) {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，上翻");
                        ((IDataService) skw.a(skw.this).getService(IDataService.class)).setTab3CacheHadExposedNeedPlayNextVideo(true);
                        ((IDataService) skw.a(skw.this).getService(IDataService.class)).setTab3CacheEnable(true);
                        skw.this.a(skw.d(skw.this), dVar, dVar2, sessionParams);
                    } else if (a9) {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，使用真实detail重新创建播放器");
                        skw.this.a(skw.d(skw.this), (d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>) null, dVar2, sessionParams);
                    } else if (a8) {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，cache请求recommend 接口 不上翻");
                        skw.this.a(skw.d(skw.this), dVar, (d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>) null, sessionParams);
                    } else {
                        spz.c("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail失败，显示错误页");
                        skw.this.a(skw.d(skw.this), dVar2);
                    }
                } catch (Throwable th) {
                    spz.a("IRecommendRequestManager", "", th);
                    skw skwVar = skw.this;
                    skwVar.a(skw.d(skwVar), (d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>) null);
                }
                ogh.b();
            }

            @Override // tb.skv.b
            public void onStartRequest(int i5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i5)});
                    return;
                }
                skw.b(skw.this, true);
                skw.a(skw.this, true);
                skw.a(skw.this, a2);
                skw.c(skw.this, skdVar != null);
                skw.a(skw.this, a2, z3);
                if (ogv.b(a2) && z) {
                    skw.e(skw.this, true);
                    if (skw.f(skw.this).enableTab3UseCacheData() && !com.taobao.android.fluid.framework.preload.dwinstance.c.d()) {
                        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.c(skw.a(skw.this), "1");
                    }
                } else if (z3) {
                    skw.e(skw.this, false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put(e.KEY_TAB_ID, skw.a(skw.this).getInstanceConfig().getTab3CardType());
                hashMap.put("isDefaultTab", Boolean.valueOf(((ISceneConfigService) skw.a(skw.this).getService(ISceneConfigService.class)).getSessionParams().a().f()));
                pil.a(skw.a(skw.this).getContext(), spj.j(skw.a(skw.this)), pio.GG_VIDEOTAB_PAGE_INIT, hashMap);
            }
        });
        e();
    }

    private boolean a(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar, sor sorVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f65971fb", new Object[]{this, dVar, sorVar, str})).booleanValue() : oeb.a("ShortVideo.autoRefresh", true) && (dVar == null || !sls.a(dVar.d)) && a(sorVar, str);
    }

    private boolean a(sor sorVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d27fced0", new Object[]{this, sorVar, str})).booleanValue() : sorVar != null && !sorVar.p && !sorVar.q && TextUtils.equals(str, sorVar.b);
    }

    public void a(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6a2f53", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.y = dVar.d;
            if (dVar.e == null || dVar.e.second == null) {
                this.z = 4;
            } else if (ogv.a(((MediaMixContentDetail) dVar.e.second).list) && ogv.a(((MediaMixContentDetail) dVar.e.second).pitList)) {
                this.z = 3;
            } else {
                this.z = 0;
            }
        } else {
            this.z = 4;
        }
    }

    private void a(sor sorVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e545a192", new Object[]{this, sorVar, new Boolean(z)});
            return;
        }
        if (sorVar == null) {
            str = "-1";
        } else if (sorVar.s) {
            str = sorVar.p ? "4" : "3";
        } else {
            str = "1";
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tab3_use_cache_from", TextUtils.isEmpty(str) ? null : str);
        String str2 = "0";
        hashMap.put("tab3_use_cache_data", TextUtils.equals("-1", str) ? str2 : "1");
        if (z) {
            str2 = "1";
        }
        hashMap.put("tab3_use_cache_icon_backflow", str2);
        this.f.setTab3CacheTrackParams(hashMap);
    }

    @Override // tb.skx
    public long getBeforeDetailMtopTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f128d8f6", new Object[]{this})).longValue() : this.u;
    }

    @Override // tb.skx
    public void setBeforeDetailMtopTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf1676", new Object[]{this, new Long(j)});
        } else {
            this.u = j;
        }
    }

    public com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("ba3add90", new Object[]{this}) : this.h;
    }

    public slb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slb) ipChange.ipc$dispatch("16bc3274", new Object[]{this}) : this.b.b();
    }

    @Override // tb.skx
    public List<com.taobao.android.fluid.framework.data.datamodel.a> getDetailMediaSetDataList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("61b878f3", new Object[]{this}) : this.d;
    }

    @Override // tb.skx
    public long getDetailMtopCost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b127cc97", new Object[]{this})).longValue() : this.w;
    }

    @Override // tb.skx
    public void setDetailMtopCost(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c216fdf5", new Object[]{this, new Long(j)});
        } else {
            this.w = j;
        }
    }

    @Override // tb.skx
    public long getDetailMtopSuccessTIme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86ff741c", new Object[]{this})).longValue() : this.v;
    }

    @Override // tb.skx
    public void setDetailMtopSuccessTIme(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ae3da8", new Object[]{this, new Long(j)});
        } else {
            this.v = j;
        }
    }

    @Override // tb.skx
    public String getDetailRequestRefreshType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27c8b6cc", new Object[]{this}) : this.t;
    }

    @Override // tb.skx
    public slu getDetailUnlikeRecorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slu) ipChange.ipc$dispatch("ac424d8e", new Object[]{this}) : this.b.c();
    }

    @Override // tb.skx
    public jqu getDetailVideoPositiveFeedbackIdsModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqu) ipChange.ipc$dispatch("a2e4ba4e", new Object[]{this}) : this.b.d();
    }

    @Override // tb.skx
    public String getPreloadUseCacheValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f21ddf6", new Object[]{this}) : this.p;
    }

    @Override // tb.skx
    public void setPreloadUseCacheValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49638940", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    @Override // tb.skx
    public boolean isDetailLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8c036ac", new Object[]{this})).booleanValue() : this.i;
    }

    @Override // tb.skx
    public boolean isDetailMTopSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87a218ab", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // tb.skx
    public boolean isHasPageErrorShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d79f1b1", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // tb.skx
    public boolean isTab3FirstCellIconStreamRequestDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("931ef808", new Object[]{this})).booleanValue() : this.r;
    }

    @Override // tb.skx
    public boolean isTab3LauncherHitMtopPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d4a7235", new Object[]{this})).booleanValue() : this.q;
    }

    @Override // tb.skx
    public void setTab3LauncherHitMtopPrefetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bb55fb", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    @Override // tb.skx
    public String getDetailRequestRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a668ef3", new Object[]{this}) : this.y;
    }

    @Override // tb.skx
    public int getDetailRequestStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5064ed4", new Object[]{this})).intValue();
        }
        if (!this.k) {
            return this.z;
        }
        return 1;
    }

    public void a(com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>> aVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
        String str;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9412db2b", new Object[]{this, aVar, dVar});
            return;
        }
        com.taobao.android.fluid.framework.analysis.analysis.a fluidInstanceAnalysis = ((IAnalysisService) this.f33668a.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.a(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name(), IDataService.ERROR_CODE_REQUEST_DATA);
        fluidInstanceAnalysis.a("failed");
        if (aVar == null) {
            return;
        }
        if (dVar != null) {
            str = dVar.d;
            obj = dVar.f;
        } else {
            str = "";
            obj = null;
        }
        d<List<com.taobao.android.fluid.framework.data.datamodel.a>> a2 = d.b.a(str, null);
        a2.f = obj;
        aVar.a(a2);
    }

    public void a(com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>> aVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar2, sps spsVar) {
        MediaMixContentDetail mediaMixContentDetail;
        String str;
        com.taobao.android.fluid.framework.data.datamodel.a aVar2;
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0030aa", new Object[]{this, aVar, dVar, dVar2, spsVar});
            return;
        }
        ogh.a("detailhandlerSuccess");
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            mediaMixContentDetail = (MediaMixContentDetail) dVar.e.second;
            str = dVar.d;
            com.taobao.android.fluid.framework.data.datamodel.a aVar3 = (com.taobao.android.fluid.framework.data.datamodel.a) dVar.e.first;
            if (aVar3 != null) {
                aVar3.a().A();
                arrayList.add(aVar3);
            }
        } else {
            mediaMixContentDetail = null;
            str = null;
        }
        if (dVar2 != null) {
            aVar2 = (com.taobao.android.fluid.framework.data.datamodel.a) dVar2.e.first;
            mediaMixContentDetail = (MediaMixContentDetail) dVar2.e.second;
            str = dVar2.d;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        } else {
            aVar2 = null;
        }
        this.m = true;
        this.g = mediaMixContentDetail.config;
        ((IDataService) this.f33668a.getService(IDataService.class)).getConfig().j().b(this.g);
        if (aVar != null) {
            aVar.a(d.f12462a.a(str, arrayList));
        }
        if (this.f.enableTab3UseCacheData() && aVar2 != null && (a2 = aVar2.a()) != null && a2.z() && a2.E() != null && this.f33668a.getInstanceConfig().getFluidUrl() != null) {
            spz.c("IRecommendRequestManager", "首坑请求来自网络请求，存入首坑detail数据 new flage");
            pil.a(this.f33668a.getContext(), spj.j(this.f33668a), pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL);
            ogh.a("saveMediaDataAndDownloadVideo");
            sou.a(this.f33668a, aVar2);
            ogh.b();
            pil.a(this.f33668a.getContext(), spj.j(this.f33668a), pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL, null);
        }
        ((IInteractionService) this.f33668a.getService(IInteractionService.class)).initGlobalInteractHandler();
        ((IAnalysisService) this.f33668a.getService(IAnalysisService.class)).getFluidInstanceAnalysis().b(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name());
        ogh.b();
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (oeb.a("ShortVideo.awaitVideoPlayToRun", true)) {
            sor findPreAttachedPreloadedVideo = this.f.findPreAttachedPreloadedVideo();
            if (findPreAttachedPreloadedVideo != null && ((findPreAttachedPreloadedVideo.k || findPreAttachedPreloadedVideo.s) && findPreAttachedPreloadedVideo.f33778a != null && findPreAttachedPreloadedVideo.f33778a.f() != null && (findPreAttachedPreloadedVideo.f33778a.e() == 8 || findPreAttachedPreloadedVideo.f33778a.e() == 5 || findPreAttachedPreloadedVideo.f33778a.e() == 0))) {
                spz.c("IRecommendRequestManager", "awaitVideoPlayToRun");
                ViewGroup f = findPreAttachedPreloadedVideo.f33778a.f();
                final a aVar = new a(runnable);
                f.setTag(R.id.fluid_sdk_tag_video_state_callback, new PreloadService.a() { // from class: tb.skw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.fluid.framework.preload.PreloadService.a
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        spz.c("IRecommendRequestManager", "onVideoStateChanged: " + i);
                        aVar.run();
                    }
                });
                oec.a((Runnable) aVar, 1000L);
                return;
            }
            runnable.run();
        } else {
            runnable.run();
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableCancelResponseWithDetailMtopId", true);
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : !z || oeb.a("ShortVideo.enableIconStreamRefreshClearPreload", false);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.h = new com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>>() { // from class: tb.skw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.core.a
                public void a(final d<List<com.taobao.android.fluid.framework.data.datamodel.a>> dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf6a2f53", new Object[]{this, dVar});
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: tb.skw.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            spz.c("IRecommendRequestManager", "IdleTaskHelper detailback run --");
                            skw.e(skw.this).setRotateAnimation(null);
                            if (d.f12462a.a(dVar)) {
                                skw.g(skw.this).clear();
                                spz.c("IRecommendRequestManager", "PickPreloadControllerNew，成功回调。target.ext：" + dVar.f + ",mMediaSetDataList清空");
                                skw.g(skw.this).addAll((Collection) dVar.e);
                                skw.e(skw.this).updateView(true, (List) dVar.e);
                                skw.e(skw.this).hideErrorView();
                                if (!skk.c()) {
                                    return;
                                }
                                skw.d(skw.this, false);
                                return;
                            }
                            spz.c("IRecommendRequestManager", "fetchContentDetail callback FAIL。");
                            ((IUsePreloadService) skw.a(skw.this).getService(IUsePreloadService.class)).removePreAttachedDWInstance(true);
                            ((IUsePreloadService) skw.a(skw.this).getService(IUsePreloadService.class)).removePreAttachedWeexInstance();
                            skw.e(skw.this).hideCacheLoading();
                            if (!ogv.a(skw.g(skw.this))) {
                                return;
                            }
                            if (((ISharePlayerService) skw.a(skw.this).getService(ISharePlayerService.class)).getDWInstance() != null) {
                                ((ISharePlayerService) skw.a(skw.this).getService(ISharePlayerService.class)).setDWInstance(null);
                            }
                            spz.c("IRecommendRequestManager", "请求失败_hideLoading");
                            skw.e(skw.this).hideLoading();
                            skw.e(skw.this).hideExposedLoadingLayout();
                            ((ISharePlayerService) skw.a(skw.this).getService(ISharePlayerService.class)).clearSharePlayer(skw.a(skw.this).getInstanceConfig().getPreCoverKey());
                            skw.e(skw.this).initErrorAndRefresh();
                            if (skk.c()) {
                                skw.d(skw.this, true);
                                smj.a(skw.a(skw.this));
                            }
                            if (!skv.ERROR_CODE_I_007.equalsIgnoreCase(dVar.d)) {
                                return;
                            }
                            skw.e(skw.this).showNoPermissionError(dVar.f);
                        }
                    };
                    if (spj.e(skw.a(skw.this)) && ((ILifecycleService) skw.a(skw.this).getService(ILifecycleService.class)).getPageState() < 2 && !skw.e(skw.this).isHasPreRender()) {
                        skw.e(skw.this).setPendingRunnable(runnable);
                    } else {
                        skw.a(skw.this, runnable);
                    }
                    skw.g(skw.this, false);
                }
            };
        }
    }

    private boolean a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (!oeb.a("ShortVideo.fixSameDetailArgs", true)) {
            return this.k;
        }
        return this.k && oec.a((Object) map, (Object) this.j);
    }

    private Map a(sps spsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("711de6d8", new Object[]{this, spsVar, map});
        }
        if (spsVar != null && spsVar.b() != null) {
            if (map == null) {
                map = new HashMap();
            }
            map.putAll(spsVar.b());
        }
        return map;
    }

    private void a(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
        } else if (ogv.a(map) && z) {
            this.s = 2;
        } else if (!ogv.a(map) && z) {
            this.s = 3;
        } else {
            this.s = 0;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HashMap<String, String> tab3CacheTrackParams = this.f.getTab3CacheTrackParams();
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this.f33668a, ogv.a(tab3CacheTrackParams) ? null : tab3CacheTrackParams.get("tab3_use_cache_from"));
        if (ogv.a(tab3CacheTrackParams)) {
            return;
        }
        String str = tab3CacheTrackParams.get("tab3_use_cache_from");
        String str2 = tab3CacheTrackParams.get("tab3_use_cache_data");
        String str3 = tab3CacheTrackParams.get("tab3_use_cache_icon_backflow");
        boolean b = snf.b(this.f33668a);
        IPreloadService iPreloadService = (IPreloadService) this.f33668a.getService(IPreloadService.class);
        if (iPreloadService == null || iPreloadService.getPreloadVideoTrackerManager() == null) {
            return;
        }
        b preloadVideoTrackerManager = iPreloadService.getPreloadVideoTrackerManager();
        preloadVideoTrackerManager.a("ggpick_cache_hit3", str2, str3, str, preloadVideoTrackerManager.a(this.f33668a, b));
    }

    private void b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN;
        } else {
            String c = ((IContainerService) this.f33668a.getService(IContainerService.class)).getConfig().c();
            if ("back".equalsIgnoreCase(c)) {
                str = "back";
            } else {
                str = "clickicon".equalsIgnoreCase(c) ? "clickicon" : "normal";
            }
            ((IContainerService) this.f33668a.getService(IContainerService.class)).getConfig().a((String) null);
        }
        ((IContainerService) this.f33668a.getService(IContainerService.class)).setFirstCardFromRefresh(!TextUtils.equals(str, "normal"));
        this.t = str;
        com.taobao.android.fluid.business.usertrack.track.b.d(this.f33668a, str);
        IPreCacheService iPreCacheService = (IPreCacheService) this.f33668a.getService(IPreCacheService.class);
        if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
            iPreCacheService.downloadCacheVideo(str);
        }
        com.taobao.android.fluid.business.intelligence.netpredict.a.a().b();
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f33673a;
        private boolean b = false;

        static {
            kge.a(1691257774);
            kge.a(-1390502639);
        }

        public a(Runnable runnable) {
            this.f33673a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b) {
            } else {
                this.b = true;
                this.f33673a.run();
            }
        }
    }
}
