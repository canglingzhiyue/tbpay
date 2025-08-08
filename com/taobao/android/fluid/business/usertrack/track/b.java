package com.taobao.android.fluid.business.usertrack.track;

import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.TrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import com.ut.mini.internal.f;
import java.util.HashMap;
import java.util.Map;
import tb.juo;
import tb.kge;
import tb.ljp;
import tb.obw;
import tb.ocb;
import tb.oeb;
import tb.psw;
import tb.sij;
import tb.skl;
import tb.slm;
import tb.spj;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AI_PAGE_NAME = "ClientAI";
    public static final int EVENT_ID_19997 = 19997;
    public static final String KEY_IS_NATIVE_AD = "is_nativeAd";
    public static final String PAGE_NAME = "Page_videointeract";
    public static final String PRODUCT_NAME = "videointeract";
    public static final String PROPERTY_CLICK_ID = "clickid";
    public static final String PROPERTY_COLD_DISAPPEAR_TIME = "cold_disappear_times";
    public static final String PROPERTY_COLD_FIRST_FRAME_TYPE = "cold_first_frame_type";
    public static final String PROPERTY_CURRENT_VIDEO_TIME = "current_video_time";
    public static final String PROPERTY_DISAPPEAR_TIME = "disappear_times";
    public static final String PROPERTY_FEED_ID = "feed_id";
    public static final String PROPERTY_HIT_MTOP_PREFETCH = "hit_mtop_prefetch";
    public static final String PROPERTY_IS_FINISH = "isFinish";
    public static final String PROPERTY_IS_FROM_LAUNCHER = "isFromLauncher";
    public static final String PROPERTY_LAUNCHER_NODE_URL = "launcherNodeUrl";
    public static final String PROPERTY_MAX_INDEX_FOCUS = "maxIndexFocus";
    public static final String PROPERTY_MAX_INDEX_NORMAL = "maxIndexNormal";
    public static final String PROPERTY_PAGENAME = "pageName";
    public static final String PROPERTY_PROCESS_LAUNCHER_FLAG = "processLauncherFlag";
    public static final String PROPERTY_REDPOINT_FIRST_FRAME_TYPE = "redpoint_first_frame_type";
    public static final String PROPERTY_UCM = "ucm";
    public static final String PROPERTY_VIDEO_ID = "video_id";

    static {
        kge.a(-926045232);
    }

    public static void b(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d774e240", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Click("Page_videointeract", str, map);
        }
    }

    public static void c(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6264c5f", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Show("Page_videointeract", str, map);
        }
    }

    public static void a(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c37821", new Object[]{fluidContext, str, map});
        } else {
            a(fluidContext, str, map, 19997);
        }
    }

    public static void a(FluidContext fluidContext, String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fabff02", new Object[]{fluidContext, str, map, new Integer(i)});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.putAll(j(fluidContext));
        if (map2.containsKey("videoid")) {
            map2.put("contentId", map2.get("videoid"));
        }
        FluidSDK.getUTAdapter().withFluidContext(fluidContext).trackCustom(AI_PAGE_NAME, i, str, null, null, map2);
    }

    private static void d(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d7b67e", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Show2202("Page_videointeract", str, map);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b(null, "Button-GrantPermission", null);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b(null, "Button-DenyPermission", null);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!d()) {
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.track.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        spz.c("TrackUtils", "refreshUTIfNeeded");
                        f.getInstance().saveCacheDataToLocal();
                        Thread.sleep(oeb.bX());
                        f.getInstance().dispatchLocalHits();
                    } catch (Throwable th) {
                        spz.c("TrackUtils", "refreshUTIfNeeded " + th.getMessage());
                    }
                }
            });
        }
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : i.b("video") && i.a(ab.a(), "flush_ut", false);
    }

    private static Map<String, String> j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc676a98", new Object[]{fluidContext});
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            return new HashMap(activeCardCommonTrack);
        }
        return new HashMap();
    }

    public static void b(FluidContext fluidContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53f708a", new Object[]{fluidContext, map});
            return;
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        Map<String, String> map2 = sessionParams.L;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, String> map3 = sessionParams.M;
        if (map3 != null) {
            map.putAll(map3);
        }
        map.put("topicId", sessionParams.g);
        map.put("utExtParams", sessionParams.K);
        map.put("version", AfcCustomSdk.SDK_VERSION);
        map.put("spm-cnt", obw.f31903a);
        if (!StringUtils.isEmpty(sessionParams.e)) {
            map.put("spm-url", sessionParams.e);
        }
        map.put("source", sessionParams.c);
        map.put("scm", sessionParams.D);
        map.put("sourceType", sessionParams.b);
        if (!StringUtils.isEmpty(sessionParams.A) && !map.containsKey("trackInfo")) {
            map.put("trackInfo", sessionParams.A);
        }
        map.put("sourcePageName", sessionParams.w);
        map.put("product_type", PRODUCT_NAME);
        map.put("xubo", ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableSharePlayer() ? "1" : "0");
        t trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            spz.c("TrackUtils", "initCommonTrack add tint properties");
            map.put("tintInfo", JSON.toJSONString(trackTint.a()));
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null && j.d != null) {
            map.put(IStorage.TYPE_DSL, j.d.replace("/", "@"));
        }
        ab sharedTNodeEngine = ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getSharedTNodeEngine();
        if (sharedTNodeEngine != null) {
            map.put("tnode_dsl_md5", sharedTNodeEngine.F());
        }
        map.put("dsl_is_orange", "" + oeb.bb());
        map.put("is_underage_mode", String.valueOf(com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()));
        ITrackService iTrackService = (ITrackService) fluidContext.getService(ITrackService.class);
        map.put("entryUtparam", iTrackService.getUtparamUrl());
        map.put("entryUtparamPre", iTrackService.getUtparamPre());
        String tab3CardType = fluidContext.getInstanceConfig().getTab3CardType();
        map.put("tnode_tab_id", String.valueOf(tab3CardType));
        spz.c("TrackUtils", "initCommonTrack tnodeTabId=" + tab3CardType);
        map.put(FluidSDK.FLUID_SDK_FLAG, "1");
        map.put(com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION, com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION_VALUE);
    }

    public static void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            map.put("svm_pid", str);
        }
    }

    public static void a(Map<String, String> map, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2149f0e", new Object[]{map, new Integer(i), new Boolean(z)});
            return;
        }
        map.put("index", String.valueOf(i));
        if (z) {
            i--;
        }
        map.put("realIndex", String.valueOf(i));
    }

    public static void a(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd5ea9", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack == null) {
            return;
        }
        activeCardCommonTrack.put("current_play_time", String.valueOf(i));
    }

    public static void a(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd9e7a", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack == null) {
            return;
        }
        activeCardCommonTrack.put("xubo", z ? "1" : "0");
    }

    public static void b(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a674499", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack == null) {
            return;
        }
        activeCardCommonTrack.put("is_hscreen", z ? "1" : "0");
    }

    public static int a(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fc4078d", new Object[]{fluidContext})).intValue();
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null && (str = activeCardCommonTrack.get("index")) != null) {
            return ocb.a(str);
        }
        return 0;
    }

    public static void a(HashMap<String, String> hashMap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24329fda", new Object[]{hashMap, map});
        } else if (hashMap == null || map == null) {
        } else {
            hashMap.putAll(map);
        }
    }

    public static void a(FluidContext fluidContext, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01c1fd9", new Object[]{fluidContext, hashMap});
        } else {
            a(fluidContext, hashMap, (Boolean) null);
        }
    }

    public static void a(FluidContext fluidContext, HashMap<String, String> hashMap, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a806d4", new Object[]{fluidContext, hashMap, bool});
            return;
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        a.c a2 = currentMediaSetData == null ? null : currentMediaSetData.a();
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack == null || sessionParams == null) {
            return;
        }
        hashMap.clear();
        hashMap.putAll(activeCardCommonTrack);
        hashMap.put("clickid", sessionParams.E);
        JSONObject jSONObject = new JSONObject();
        if (a2 != null) {
            if (a2.z()) {
                jSONObject.put(PROPERTY_VIDEO_ID, (Object) a2.I());
            }
            jSONObject.put("feed_id", (Object) a2.g());
        }
        jSONObject.put("page", (Object) sessionParams.c);
        hashMap.put(PROPERTY_UCM, jSONObject.toJSONString());
        hashMap.put("pageName", "Page_videointeract");
        hashMap.put(PROPERTY_MAX_INDEX_NORMAL, String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getMaxSlideIndexPublicMode()));
        hashMap.put(PROPERTY_CURRENT_VIDEO_TIME, String.valueOf(((IMediaService) fluidContext.getService(IMediaService.class)).getVideoLength()));
        hashMap.put(PROPERTY_HIT_MTOP_PREFETCH, String.valueOf(((IDataService) fluidContext.getService(IDataService.class)).isTab3LauncherHitMtopPrefetch()));
        hashMap.put("isFromLauncher", String.valueOf(spj.f(fluidContext)));
        hashMap.put("processLauncherFlag", juo.a(fluidContext) ? "1" : "0");
        String c = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().c();
        if (!StringUtils.isEmpty(c)) {
            hashMap.put("launcherNodeUrl", c);
        }
        if (bool != null) {
            hashMap.put(PROPERTY_IS_FINISH, String.valueOf(bool));
        }
        if (spj.d(fluidContext)) {
            String valueOf = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getTab3ComponentDisappearTimes());
            String valueOf2 = String.valueOf(TrackService.sTab3ColdDisAppearTimes);
            String valueOf3 = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().g());
            String valueOf4 = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().h());
            hashMap.put(PROPERTY_DISAPPEAR_TIME, valueOf);
            hashMap.put(PROPERTY_COLD_DISAPPEAR_TIME, valueOf2);
            hashMap.put(PROPERTY_COLD_FIRST_FRAME_TYPE, valueOf3);
            hashMap.put(PROPERTY_REDPOINT_FIRST_FRAME_TYPE, valueOf4);
            spz.c("PickPreloadController2001h", "disappear_times:" + valueOf + ",cold_disappear_times:" + valueOf2 + ",cold_first_frame_type:" + valueOf3 + ",redpoint_first_frame_type:" + valueOf4);
        }
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        hashMap.put(com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION, com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION_VALUE);
        t trackTint = ((ITrackService) fluidContext.getService(ITrackService.class)).getTrackTint();
        if (trackTint == null) {
            return;
        }
        spz.c("TrackUtils", "updateAllPageUtProperties add tint properties");
        hashMap.putAll(trackTint.a());
    }

    public static void a(FluidContext fluidContext, Map<String, String> map, a.c cVar) {
        MediaContentDetailData i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e48aa2", new Object[]{fluidContext, map, cVar});
            return;
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (cVar != null && (i = cVar.i()) != null) {
            map.put("id", cVar.g());
            if (cVar.z()) {
                map.put("videoid", cVar.I());
            } else {
                map.remove("videoid");
            }
            map.put("cid", cVar.g());
            if (StringUtils.isEmpty(cVar.e())) {
                map.put("content_account_id", cVar.c());
            } else {
                map.put("content_account_id", cVar.d());
                map.put("keyname", cVar.e());
            }
            map.put("content_type", cVar.H());
            cVar.r();
            if (slm.a(i.trackInfo)) {
                map.put("trackInfo", i.trackInfo);
            } else if (sessionParams != null && !StringUtils.isEmpty(sessionParams.A)) {
                map.put("trackInfo", sessionParams.A);
            } else {
                map.remove("trackInfo");
            }
            map.remove("item_id");
            if (i.content != null && i.content.itemIds != null && i.content.itemIds.size() > 0) {
                String str = i.content.itemIds.get(0);
                if (!StringUtils.isEmpty(str)) {
                    map.put("item_id", str);
                }
            }
            if (i.utPairs != null && !i.utPairs.isEmpty()) {
                map.putAll(i.utPairs);
            }
        }
        if (sij.a(j.q)) {
            map.put("auto_play", "1");
        } else {
            map.put("auto_play", "0");
        }
        map.put("UI_type", "1");
    }

    public static void c(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c10eab8", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        if (z) {
            j.put("gesture_type", "speedup");
        } else {
            j.put("gesture_type", "showmore");
        }
        b(fluidContext, "Button-LongClick", j);
    }

    public static void d(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dba90d7", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            hashMap.putAll(activeCardCommonTrack);
        }
        hashMap.put("type", z ? "up" : "down");
        if (((IFeedsListService) fluidContext.getService(IFeedsListService.class)).isPublicAutoCut()) {
            hashMap.put(Constants.KEY_CONTROL, "auto");
        } else {
            hashMap.put(Constants.KEY_CONTROL, BizTaskData.MANUAL_TIME);
        }
        ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).setPublicAutoCut(false);
        hashMap.put("is_automanual", sij.a() == 0 ? "0" : "1");
        if (hashMap.containsKey("videoid")) {
            String str = (String) hashMap.get("videoid");
            String recordContentId = ((ITrackService) fluidContext.getService(ITrackService.class)).getRecordContentId();
            if (str != null && str.equals(recordContentId)) {
                Integer valueOf = Integer.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getRecordCount());
                if (valueOf != null) {
                    i = valueOf.intValue();
                }
                Integer valueOf2 = Integer.valueOf(i);
                hashMap.put("replayCount", "" + valueOf2);
            } else {
                hashMap.put("replayCount", "0");
            }
            ((ITrackService) fluidContext.getService(ITrackService.class)).setRecordContentId("");
        }
        b(fluidContext, "Button-cut", hashMap);
    }

    public static void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
        } else {
            b(fluidContext, "Button-slide", j(fluidContext));
        }
    }

    public static void a(FluidContext fluidContext, Map<String, String> map, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc29513", new Object[]{fluidContext, map, new Boolean(z), str});
            return;
        }
        map.put("go", z ? "1" : "2");
        c(fluidContext, "videoshow", map);
    }

    public static void a(FluidContext fluidContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{fluidContext, map});
        } else {
            c(fluidContext, "contentshow", map);
        }
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else {
            c(null, "ggGame", map);
        }
    }

    public static void a(psw pswVar, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a9df63", new Object[]{pswVar, map, new Long(j)});
        } else if (j <= 0) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            long j2 = j / 1000000;
            hashMap.put("play_time", String.valueOf(j2));
            if (pswVar instanceof com.taobao.android.fluid.framework.card.cards.web.a) {
                String valueOf = String.valueOf(ljp.a((com.taobao.android.fluid.framework.card.cards.web.a) pswVar));
                hashMap.put("current_play_time", valueOf);
                spz.c("[webcomponent_trackerUtils]", "showContentEnd埋点，play_time：" + j2 + ",current_play_time:" + valueOf);
            }
            c(pswVar.z(), "Show-content_end", hashMap);
        }
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
        } else {
            b(null, "Button-livemodegotolive", map);
        }
    }

    public static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("type", "0");
        b(null, "Button-Dig", hashMap);
    }

    public static void c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed73b9c", new Object[]{fluidContext});
        } else {
            b(fluidContext, "Button-search", j(fluidContext));
        }
    }

    public static void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e60d59d", new Object[]{fluidContext});
        } else {
            b(fluidContext, "Button-picturecut", j(fluidContext));
        }
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
            return;
        }
        Map<String, String> j = j(fluidContext);
        if (!StringUtils.isEmpty(str)) {
            j.put("itemid", str);
        }
        b(fluidContext, "Button-picturemaodian", j);
    }

    public static void b(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6704c8", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("pic_index", String.valueOf(i));
        c(fluidContext, "show-picture", j);
    }

    public static void b(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6675baa5", new Object[]{fluidContext, str});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("itemid", str);
        j.put("is_push", "4");
        c(fluidContext, "itemshow", j);
    }

    public static void e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dea6f9e", new Object[]{fluidContext});
        } else {
            b(fluidContext, "backtovideo", j(fluidContext));
        }
    }

    public static void f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74099f", new Object[]{fluidContext});
        } else {
            b(fluidContext, "closewin", j(fluidContext));
        }
    }

    public static void e(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6436f6", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        if (z) {
            j.put("controlType", "pause");
        } else {
            j.put("controlType", "play");
        }
        b(fluidContext, "controlwin", j);
    }

    public static void g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfda3a0", new Object[]{fluidContext});
        } else {
            c(fluidContext, "winplay_show", j(fluidContext));
        }
    }

    public static void c(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42373666", new Object[]{fluidContext, str});
            return;
        }
        b(fluidContext, "Button-video-pause", j(fluidContext));
        a(fluidContext, "video-pause", (Map<String, String>) null);
        e(fluidContext, str);
    }

    private static void e(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ba2de8", new Object[]{fluidContext, str});
            return;
        }
        Map<String, String> j = j(fluidContext);
        if (!StringUtils.isEmpty(str)) {
            j.put(KEY_IS_NATIVE_AD, "1");
        } else {
            j.put(KEY_IS_NATIVE_AD, "0");
        }
        b(fluidContext, "Button-native-video-pause-ad", j);
    }

    public static void h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c873da1", new Object[]{fluidContext});
            return;
        }
        b(fluidContext, "Button-video-play", j(fluidContext));
        a(fluidContext, "video-play", (Map<String, String>) null);
    }

    public static void f(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210ddd15", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("pausestate", z ? "0" : "1");
        b(fluidContext, "Button-video-pause-dragprogressbar", j);
    }

    public static void a(FluidContext fluidContext, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1249e8e", new Object[]{fluidContext, new Boolean(z), str, str2});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("succeed", String.valueOf(z));
        j.put("url", str);
        j.put("error", str2);
        b(fluidContext, "Button-cdnload", j);
    }

    public static void g(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b78334", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("hs_stype", z ? "quit-left" : "quit-right");
        b(fluidContext, "Button-Horizontal_screen", j);
    }

    public static void h(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4612953", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("dragtype", z ? "1" : "2");
        b(fluidContext, "Button-video-pause-dragprogressbar", j);
    }

    public static void i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c10d7a2", new Object[]{fluidContext});
        } else {
            b(fluidContext, "Button-video-Horizontal_screen-operate", j(fluidContext));
        }
    }

    public static void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{fluidContext, str, str2});
            return;
        }
        Map<String, String> j = j(fluidContext);
        j.put("blackScreenType", str);
        j.put("blackScreenUtpairs", str2);
        d(fluidContext, "Page_videointeract_Show-VideoError", j);
    }

    public static void a(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeee97a", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            Map<String, String> j = j(fluidContext);
            if (j != null) {
                j.put("seekstart", String.valueOf(i));
                j.put("seekend", String.valueOf(i2));
                j.put("seekdirection", i > i2 ? "back" : "forward");
            }
            b(fluidContext, "Button-videoseek", j);
            a(fluidContext, "Button-videoseek", j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df8b227", new Object[]{fluidContext, str});
            return;
        }
        try {
            Map<String, String> j = j(fluidContext);
            if (j != null) {
                j.put(c.KEY_REFRESH_TYPE, str);
            }
            b(fluidContext, "Button-RefreshData", j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(FluidContext fluidContext, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef6e39a", new Object[]{fluidContext, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            Map<String, String> j = j(fluidContext);
            if (j != null) {
                j.put("playnextfinal", String.valueOf(z));
                String str = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().q;
                j.put("playnextserver", str);
                String str2 = "none";
                int a2 = sij.a();
                if (a2 == 1) {
                    str2 = "true";
                } else if (a2 == 2) {
                    str2 = "false";
                }
                j.put("playnextlocal", str2);
                j.put("playnextbreak", String.valueOf(z2));
                spz.c("TrackUitls", "trackPlayCompleted playnextfinal=" + z + ",palynextserver=" + str + ",playnextlocal=" + str2 + ",playnextbreak=" + z2);
            }
            b(fluidContext, "Button-VideoPlayCompleted", j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("contentId", str2);
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "AddViewDuringLayout", null, null, hashMap);
    }

    public static HashMap<String, String> a(boolean z, String str, ViewGroup viewGroup, ViewGroup viewGroup2) {
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f37df217", new Object[]{new Boolean(z), str, viewGroup, viewGroup2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", z ? "video" : "live");
        hashMap.put("contentId", str);
        ViewGroup viewGroup5 = null;
        if (viewGroup == null) {
            viewGroup3 = null;
            viewGroup4 = null;
        } else if (z) {
            viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.video_host);
            viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.favor_frame);
            viewGroup3 = null;
        } else {
            viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.live_host);
            viewGroup4 = null;
        }
        a(viewGroup, "cell", hashMap);
        a(viewGroup5, "favorFrame", hashMap);
        a(viewGroup4, "videoHost", hashMap);
        a(viewGroup3, "liveHost", hashMap);
        a(viewGroup2, "video", hashMap);
        return hashMap;
    }

    private static void a(View view, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5500c67f", new Object[]{view, str, hashMap});
        } else if (view == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 29 && (view instanceof ViewGroup)) {
                hashMap.put(str + "Suppressed", String.valueOf(((ViewGroup) view).isLayoutSuppressed()));
            }
            hashMap.put(str + "InLayout", String.valueOf(view.isInLayout()));
            hashMap.put(str + "LaidOut", String.valueOf(view.isLaidOut()));
        }
    }

    public static void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
        } else {
            FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "ZeroSizeOnStart", null, null, hashMap);
        }
    }

    public static void a(int i, int i2, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afafdfc6", new Object[]{new Integer(i), new Integer(i2), new Long(j), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i));
        hashMap.put("failScrollToNextReason", String.valueOf(i2));
        hashMap.put("shownTime", String.valueOf(j));
        hashMap.put("apiErrorCode", String.valueOf(str));
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "cannot_scroll_loading_shown", null, null, hashMap);
    }
}
