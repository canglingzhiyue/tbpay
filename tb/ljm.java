package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.flexbox.layoutmanager.ac.f;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.hni;
import tb.jwh;
import tb.shm;
import tb.snz;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes5.dex */
public final class ljm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f30683a;
    private final sii h;
    private long i;
    private int j;
    private boolean k;
    private boolean l = false;

    static {
        kge.a(-1234152016);
    }

    public static /* synthetic */ sii a(ljm ljmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("2f43b62a", new Object[]{ljmVar}) : ljmVar.h;
    }

    public static /* synthetic */ boolean a(ljm ljmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a2b522f", new Object[]{ljmVar, new Boolean(z)})).booleanValue();
        }
        ljmVar.k = z;
        return z;
    }

    public static /* synthetic */ long b(ljm ljmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e16ba03e", new Object[]{ljmVar})).longValue() : ljmVar.i;
    }

    public static /* synthetic */ boolean b(ljm ljmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c091bce", new Object[]{ljmVar, new Boolean(z)})).booleanValue();
        }
        ljmVar.l = z;
        return z;
    }

    public static /* synthetic */ FluidContext c(ljm ljmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("f3599e9d", new Object[]{ljmVar}) : ljmVar.f30683a;
    }

    public static /* synthetic */ boolean d(ljm ljmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be71ad50", new Object[]{ljmVar})).booleanValue() : ljmVar.l;
    }

    public static /* synthetic */ boolean e(ljm ljmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acf4b3d1", new Object[]{ljmVar})).booleanValue() : ljmVar.k;
    }

    public ljm(FluidContext fluidContext, sii siiVar) {
        this.f30683a = fluidContext;
        this.h = siiVar;
        b(siiVar);
        c(siiVar);
        a(siiVar);
    }

    public static HashMap<String, String> a(FluidContext fluidContext, HashMap<String, String> hashMap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ca3492be", new Object[]{fluidContext, hashMap, new Boolean(z)});
        }
        if (hashMap == null) {
            return null;
        }
        String detailRequestRefreshType = ((IDataService) fluidContext.getService(IDataService.class)).getDetailRequestRefreshType();
        boolean a2 = a(fluidContext, detailRequestRefreshType);
        spz.c("VideoCardTrackManager", "wrapExpUtParamsWithFirstFrame,refreshType: " + detailRequestRefreshType + ", isFromRefresh: " + a2);
        if (a2) {
            hashMap.put("videoActionType", obw.VIDEO_ACTION_TYPE_REFRESH_INIT);
        } else if (z) {
            snu.a(fluidContext, hashMap);
            hashMap.put("videoActionType", "init");
        } else {
            hashMap.put("videoActionType", obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
        }
        return hashMap;
    }

    private static boolean a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab43ee8", new Object[]{fluidContext, str})).booleanValue();
        }
        try {
            if (((IContainerService) fluidContext.getService(IContainerService.class)).isFirstCardFromRefresh() && !TextUtils.equals(str, "normal")) {
                ((IContainerService) fluidContext.getService(IContainerService.class)).setFirstCardFromRefresh(false);
                return true;
            }
        } catch (Throwable th) {
            spz.a("VideoCardTrackManager", "isFirstCardFromRefresh error", th);
        }
        return false;
    }

    public static HashMap<String, String> a(FluidContext fluidContext, int i, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7e827747", new Object[]{fluidContext, new Integer(i), cVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (cVar == null) {
            return hashMap;
        }
        String str = "Android_" + cVar.g() + "_" + UUID.randomUUID();
        String str2 = Integer.valueOf(((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex()).intValue() == 1 ? "follow" : "recommend";
        hashMap.put(snv.EXP_KEY_FULL_PAGE_UID, str);
        hashMap.put(snv.EXP_KEY_FULL_PAGE_TITLE, cVar.C());
        hashMap.put(snv.EXP_KEY_FULL_PAGE_INDEX, String.valueOf(i));
        hashMap.put(snv.EXP_KEY_FULL_PAGE_TAB_NAME, str2);
        hashMap.put(snv.EXP_KEY_FULL_PAGE_CONTENT_TYPE, cVar.H());
        hashMap.put("isFromLauncher", String.valueOf(spj.f(fluidContext)));
        hashMap.put("processLauncherFlag", juo.a(fluidContext) ? "1" : "0");
        String c = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().c();
        if (!TextUtils.isEmpty(c)) {
            hashMap.put("launcherNodeUrl", c);
        }
        t trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            hashMap.putAll(trackTint.a());
        }
        hashMap.put(snv.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(false));
        String e = tdg.e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put(snv.EXP_KEY_GG_LIVE_WARMUP_BUCKET_ID, e);
        }
        if (cVar.N()) {
            hashMap.put("isLocalPreCacheVideo", "true");
        }
        String a2 = com.taobao.android.fluid.business.intelligence.netpredict.a.a().a(cVar.I());
        if (a2 != null) {
            hashMap.put("predictInfo", a2);
        }
        return hashMap;
    }

    public static HashMap<String, String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1ef85cf", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(snv.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(z));
        hashMap.put(snv.EXP_KEY_PRELOAD_REAL_PLAY, String.valueOf(z));
        return hashMap;
    }

    public static HashMap<String, String> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bdf114ae", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(snv.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(z));
        return hashMap;
    }

    public static void a(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeee97a", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        if (i2 == 0) {
            if (!((IDataService) fluidContext.getService(IDataService.class)).isTab3FirstCellIconStreamRequestDetail()) {
                ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().b(-1);
            } else {
                ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().b(i);
            }
        }
        if (((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().g() > 0) {
            return;
        }
        ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().a(i);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.i;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.j;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public HashMap<String, String> a(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ac29a307", new Object[]{this, dVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        sps sessionParams = ((ISceneConfigService) this.h.z().getService(ISceneConfigService.class)).getSessionParams();
        Map<String, String> thisCardCommonTrack = ((ITrackService) this.h.z().getService(ITrackService.class)).getThisCardCommonTrack(this.h);
        skl j = ((IDataService) this.h.z().getService(IDataService.class)).getConfig().j();
        if (thisCardCommonTrack != null) {
            hashMap.putAll(thisCardCommonTrack);
        }
        HashMap hashMap2 = new HashMap();
        noi.a(this.h.z(), hashMap2, dVar.f12530a);
        noi.a(hashMap2, this.h.v().a());
        noi.a(hashMap, hashMap2);
        hashMap.put("spm", obw.f31903a);
        hashMap.put(b.PROPERTY_VIDEO_ID, dVar.l());
        if (TextUtils.isEmpty(dVar.f12530a.e())) {
            hashMap.put("taoke_accountId", dVar.f12530a.c());
        } else {
            hashMap.put("taoke_accountId", dVar.f12530a.d());
            hashMap.put("keyname", dVar.f12530a.e());
        }
        if (j != null && !TextUtils.isEmpty(j.w)) {
            hashMap.put(com.taobao.tao.content.business.b.BIZ_TYPE, j.w);
        }
        Map<String, String> c = sessionParams.c();
        String str = sessionParams.c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.PROPERTY_VIDEO_ID, (Object) dVar.l());
        jSONObject.put("feed_id", (Object) dVar.a());
        jSONObject.put("page", (Object) str);
        hashMap.put(b.PROPERTY_UCM, jSONObject.toJSONString());
        hashMap.put("page", str);
        hashMap.put("content_id", dVar.a());
        hashMap.put("platform", "phone");
        if (c != null) {
            hashMap.putAll(c);
        }
        a(this.h, hashMap);
        hashMap.put("isFromLauncher", String.valueOf(spj.f(this.f30683a)));
        hashMap.put("processLauncherFlag", juo.a(this.f30683a) ? "1" : "0");
        String c2 = ((ISceneConfigService) this.f30683a.getService(ISceneConfigService.class)).getSessionExtParams().c();
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put("launcherNodeUrl", c2);
        }
        if (dVar.f12530a.N()) {
            hashMap.put("isLocalPreCacheVideo", "true");
        }
        if (dVar.f12530a.u()) {
            hashMap.put("isCache", "true");
        }
        t trackTint = ((ITrackService) this.f30683a.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            hashMap.putAll(trackTint.a());
        }
        return hashMap;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (this.h.D().i().account != null && this.h.D().i().account.preLiveVO != null) {
                return Boolean.parseBoolean(this.h.D().i().account.preLiveVO.living);
            }
        } catch (Exception e) {
            spz.a("VideoCardTrackManager", sii.TAG, e);
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            return f.a(this.h.y());
        } catch (Throwable th) {
            spz.a("VideoCardTrackManager", "", th);
            return false;
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        spz.c("VideoCardTrackManager", "videoplaystate oprogressloading onVideoLoadingEnd " + j + " ; id=" + this.h.w());
        d.a(this.h, j);
        ljq.d(this.h, "stallend");
        com.taobao.android.fluid.business.intelligence.netpredict.a.a().a(this.h.r(), j);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        spz.c("VideoCardTrackManager", "videoplaystate oprogressloading onVideoLoadingStart ; id=" + this.h.w());
        d.g(this.h);
        ljq.d(this.h, "stall");
    }

    private void a(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca9d25", new Object[]{this, siiVar});
        } else {
            siiVar.t().a(new shm.a() { // from class: tb.ljm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.shm.a, tb.shm
                public void onBindData(psw pswVar, a aVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
                        return;
                    }
                    d.a(ljm.a(ljm.this).z(), ljm.a(ljm.this));
                    RenderTrackUtils.a(ljm.a(ljm.this).z(), "renderStart");
                    pio.a(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA);
                }

                @Override // tb.shm.a, tb.shm
                public void onActive(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                        return;
                    }
                    d.b(ljm.a(ljm.this));
                    b.a(ljm.a(ljm.this).z(), ((ITrackService) ljm.a(ljm.this).z().getService(ITrackService.class)).getThisCardCommonTrack(ljm.a(ljm.this)), ljm.this.d(), (ljm.a(ljm.this).D() == null || !ljm.a(ljm.this).D().s()) ? "" : "1");
                }

                @Override // tb.shm.a, tb.shm
                public void onDisActive(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
                    } else {
                        d.c(ljm.a(ljm.this));
                    }
                }
            });
        }
    }

    private void a(sii siiVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfad06e", new Object[]{this, siiVar, hashMap});
        } else if (siiVar.r() != 0 || !juo.f() || !snf.b(siiVar.z())) {
        } else {
            spz.c("VideoCardTrackManager", "PickPreloadController,addExposedCellTrackPoint,首坑数据已经曝光");
            hashMap.put("tab3_exposed", "1");
        }
    }

    private void b(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed4da3a6", new Object[]{this, siiVar});
        } else {
            siiVar.P().addVideoPlayerListener(new hni.a() { // from class: tb.ljm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hni.a, tb.hni
                public void onVideoStart(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("862ef89", new Object[]{this, pswVar});
                        return;
                    }
                    d.d(ljm.a(ljm.this));
                    pio.b(ljm.a(ljm.this).z());
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoPause(psw pswVar, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
                    } else {
                        d.b(ljm.a(ljm.this), "pause");
                    }
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoSeekTo(psw pswVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
                        return;
                    }
                    d.a((psw) ljm.a(ljm.this), i);
                    ljq.d(ljm.a(ljm.this), "seek");
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoPrepared(psw pswVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
                        return;
                    }
                    snv f = ljm.a(ljm.this).k().f();
                    d.a(ljm.a(ljm.this), f != null ? f.h() : "");
                    ljq.d(ljm.a(ljm.this), "prepared");
                    long currentTimeMillis = System.currentTimeMillis();
                    pio.c(ljm.a(ljm.this).z(), currentTimeMillis - ljm.b(ljm.this));
                    pio.a(ljm.a(ljm.this).z(), currentTimeMillis - ljm.b(ljm.this), true);
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoError(psw pswVar, Object obj, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
                        return;
                    }
                    String playUrl = obj instanceof TaobaoMediaPlayer ? ((TaobaoMediaPlayer) obj).getPlayUrl() : "";
                    spz.c("VideoCardTrackManager", "APMdata videoplaystate IDWVideoLifecycleListener onVideoError,; videoid=" + ljm.a(ljm.this).w() + "; videoUrl=" + playUrl);
                    sii a2 = ljm.a(ljm.this);
                    ljq.d(a2, "error(" + i + riy.BRACKET_END_STR);
                    com.taobao.android.fluid.business.intelligence.netpredict.a.a().a(ljm.a(ljm.this).r(), String.valueOf(i));
                    boolean e = ljm.this.e();
                    if (ljm.a(ljm.this).k().g().contains(ljm.a(ljm.this).k().f()) || !e) {
                        pio.a(ljm.a(ljm.this).z(), System.currentTimeMillis() - ljm.b(ljm.this), false);
                        d.c(ljm.a(ljm.this), i);
                        ljq.a(ljm.a(ljm.this), String.valueOf(i), "");
                    } else {
                        ljm.a(ljm.this).k().g().add(ljm.a(ljm.this).k().f());
                        d.b(ljm.a(ljm.this), i);
                        snv f = ljm.a(ljm.this).k().f();
                        if (f != null) {
                            f.a();
                        }
                        ljq.d(ljm.a(ljm.this), "retry");
                    }
                    pio.a(ljm.c(ljm.this), new jwh.a().a(ljm.a(ljm.this).y()).a(ljm.a(ljm.this).k().f()).a(i).b(i2).a(ljm.a(ljm.this).w()).b(playUrl).a());
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                        return;
                    }
                    if (obj instanceof TaobaoMediaPlayer) {
                        str = ((TaobaoMediaPlayer) obj).getPlayUrl();
                        sjm.b = str;
                    } else {
                        str = "";
                    }
                    if (3 != j) {
                        long j4 = 0;
                        if (4 == j) {
                            spz.a("VideoCardTrackManager", "onVideoInfo 第二帧加载成功");
                            return;
                        } else if (701 == j) {
                            ljm ljmVar = ljm.this;
                            ljm.b(ljmVar, ljm.a(ljmVar).g().a());
                            if (!ljm.d(ljm.this)) {
                                return;
                            }
                            ljm.this.f();
                            return;
                        } else if (702 == j) {
                            if (obj2 instanceof Map) {
                                try {
                                    Object obj3 = ((Map) obj2).get("buffered_duration");
                                    j4 = obj3 instanceof String ? Long.parseLong((String) obj3) : 0L;
                                } catch (Exception unused) {
                                }
                            }
                            if (ljm.d(ljm.this)) {
                                skl j5 = ((IDataService) ljm.a(ljm.this).z().getService(IDataService.class)).getConfig().j();
                                if (j5 != null && j4 > j5.ah) {
                                    ljm.a(ljm.this).ab().a("1");
                                }
                                ljm.this.b(j4);
                            }
                            ljm.b(ljm.this, false);
                            return;
                        } else if (13000 != j) {
                            return;
                        } else {
                            spz.c("VideoCardTrackManager", "[preloadvideo] p2ff finish, " + System.currentTimeMillis() + ", this=" + this);
                            try {
                                ViewGroup f = ljm.a(ljm.this).k().f().f();
                                if (f == null) {
                                    return;
                                }
                                f.setTag(R.id.fluid_sdk_tag_play_p2ff_finish_time, Long.valueOf(System.currentTimeMillis()));
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                    ljm.a(ljm.this).o().b = true;
                    spz.c("VideoCardTrackManager", "APMdata videoplaystate IDWVideoLifecycleListener onVideoFirstFrame首帧 videoUrl=" + str);
                    if (obj2 instanceof Map) {
                        try {
                            String valueOf = String.valueOf(((Map) obj2).get("is_cache_hit"));
                            if ("1".equals(valueOf)) {
                                ljm.a(ljm.this).v().a(true);
                            }
                            spz.c("VideoCardTrackManager", "videotrack 2 preDownloadCurrent video onVideoInfo cached=" + valueOf + " ; contentId=" + ljm.a(ljm.this).w());
                            long longValue = ((Long) ((Map) obj2).get("RENDER_START_TIME")).longValue();
                            long longValue2 = ((Long) ((Map) obj2).get("RENDER_END_TIME")).longValue();
                            long j6 = longValue2 - longValue;
                            ljm.a(ljm.this).v().b(j6);
                            com.taobao.android.fluid.business.intelligence.netpredict.a.a().b(ljm.a(ljm.this).r(), j6);
                            pio.a(ljm.c(ljm.this), new jwh.a().a(ljm.a(ljm.this).y()).a(ljm.a(ljm.this).k().f()).a(true).a(longValue2).b(longValue).c(j6).a((Map) obj2).b("1".equals(valueOf)).a(ljm.a(ljm.this).w()).b(str).c(true).a());
                            spz.a("重置时间戳", "onVideoInforenderEndTime:" + longValue2);
                            if (ljm.c(ljm.this).getInstanceConfig().isTab3FromLauncher() && c.a() > 0 && !pio.a(3)) {
                                pio.b(3);
                                spz.a("PickPreloadController", "启动到首帧时间：" + (System.currentTimeMillis() - c.a()));
                                ljm.a(ljm.this).v().a(System.currentTimeMillis() - c.a());
                                pio.b(pio.GG_VIDEOTAB_VIDEO_PRELOAD);
                            }
                            ljm.a(ljm.this).o().a(false);
                            spz.a("VideoCardTrackManager", "onVideoInfo 首帧加载成功，endTime：" + longValue2 + ",startTime:" + longValue + ",renderTime:" + j6);
                        } catch (Exception unused2) {
                        }
                    }
                    d.a((psw) ljm.a(ljm.this), false);
                    pio.a(ljm.a(ljm.this).z());
                    ljq.d(ljm.a(ljm.this), ImageLoader.Scene.FIRST_FRAME);
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    if (ljm.a(ljm.this).o().c()) {
                        pio.a(ljm.c(ljm.this), new jwh.a().a(ljm.a(ljm.this).y()).a(ljm.a(ljm.this).k().f()).a(true).a(0L).b(0L).c(0L).a());
                    }
                    d.a(ljm.a(ljm.this), i, i3, i2);
                    if (!ljm.e(ljm.this) && ((ISharePlayerService) ljm.a(ljm.this).z().getService(ISharePlayerService.class)).isEnableSharePlayer() && !ljm.a(ljm.this).o().b) {
                        spz.c("VideoCardTrackManager", "videotrack video againReportFirstFrame ");
                        d.a((psw) ljm.a(ljm.this), true);
                        ljm.a(ljm.this, true);
                    }
                    if (ljm.a(ljm.this).ab().c == i / 1000) {
                        return;
                    }
                    b.a(ljm.a(ljm.this).z(), ljm.a(ljm.this).ab().c);
                }
            });
        }
    }

    private void c(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd0aa27", new Object[]{this, siiVar});
        } else {
            siiVar.O().a((snz) new snz.a() { // from class: tb.ljm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snz.a, tb.snz
                public void onDataUpdate(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
                    } else {
                        d.a(ljm.a(ljm.this), ljm.a(ljm.this).af());
                    }
                }

                @Override // tb.snz.a, tb.snz
                public void onRecyclePlayer(psw pswVar, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
                    } else {
                        d.a(ljm.a(ljm.this), ljm.a(ljm.this).k().f());
                    }
                }

                @Override // tb.snz.a, tb.snz
                public void onRequestMediaPlayer(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
                        return;
                    }
                    pil.a(ljm.a(ljm.this).y(), spj.j(ljm.a(ljm.this).z()), "gg_videoMutiTab_createDWInstance");
                    ljq.a(ljm.a(ljm.this), ljm.a(ljm.this).af().l());
                    d.a(ljm.a(ljm.this));
                    b.a(ljm.a(ljm.this).z(), false);
                    ((ISharePlayerService) ljm.a(ljm.this).z().getService(ISharePlayerService.class)).setEnableSharePlayer(false);
                    spz.c("VideoCardTrackManager", "创建播放器，width:" + ljm.a(ljm.this).ah().b().d + ",height:" + ljm.a(ljm.this).ah().b().f33635a + ",id:" + ljm.a(ljm.this).w());
                    b.a(ljm.a(ljm.this).z(), 0);
                }
            });
        }
    }
}
