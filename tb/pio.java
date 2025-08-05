package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.s;
import com.taobao.monitor.procedure.v;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mto;

/* loaded from: classes5.dex */
public class pio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APM_PRELOAD_VIDEO_BEGIN = 2;
    public static final int APM_PRELOAD_VIDEO_SUCCESS = 3;
    public static final int APM_VIDEO_BEGIN = 0;
    public static final int APM_VIDEO_PLAYTIME_BEGIN = 4;
    public static final int APM_VIDEO_PLAYTIME_SUCCESS = 5;
    public static final int APM_VIDEO_SUCCESS = 1;
    public static final String GG_INTERACTIVE_RENDER = "gg_interactive_render";
    public static final String GG_VIDEOTAB_DATA_COMMIT = "gg_videoTab_data_commit";
    public static final String GG_VIDEOTAB_DATA_PARSE = "gg_videoTab_data_parse";
    public static final String GG_VIDEOTAB_MTOP_REQUEST = "gg_videoTab_mtop_request";
    public static final String GG_VIDEOTAB_PAGE_INIT = "gg_videoTab_page_init";
    public static final String GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND = "gg_videotab_video_app_enter_background";
    public static final String GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED = "gg_videotab_video_app_foreground_changed";
    public static final String GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE = "gg_videotab_video_create_dw_instance";
    public static final String GG_VIDEOTAB_VIDEO_DECRYPT = "gg_videoTab_video_decrypt";
    public static final String GG_VIDEOTAB_VIDEO_LEAVE_UT = "gg_videotab_video_leave_ut";
    public static final String GG_VIDEOTAB_VIDEO_LOADSO = "gg_videoTab_video_loadso";
    public static final String GG_VIDEOTAB_VIDEO_NEW_DW_INSTANCE = "gg_videotab_video_new_dw_instance";
    public static final String GG_VIDEOTAB_VIDEO_PLAY = "gg_videoTab_video_play";
    public static final String GG_VIDEOTAB_VIDEO_PLAY_END_UT = "gg_videotab_video_play_end_ut";
    public static final String GG_VIDEOTAB_VIDEO_PLAY_TIME = "gg_videoTab_video_playtime";
    public static final String GG_VIDEOTAB_VIDEO_PREDOWNLAOD = "gg_videotab_video_predownlaod";
    public static final String GG_VIDEOTAB_VIDEO_PREFETCH_MTOP = "gg_videotab_video_prefetch_mtop";
    public static final String GG_VIDEOTAB_VIDEO_PRELOAD = "gg_videoTab_video_preload";
    public static final String TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER = "trace_trace_videotab_onRequestMediaPlayer";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE = "trace_trace_videotab_shortVideoCard_onActive";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR = "trace_trace_videotab_shortVideoCard_onAppear";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA = "trace_trace_videotab_shortVideoCard_onBindData";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT = "trace_trace_videotab_shortVideoCard_onInit";
    public static final String TRACE_VIDEOTAB_TABLIST_APPLYATTRFORVIEW = "trace_videotab_tablist_applyAttrForView";
    public static final String TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW = "trace_videotab_tablist_initVideoControllerNew";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW = "trace_videotab_tablist_MultiTabVideoController_new";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER = "trace_videotab_tablist_MultiTabVideoController_onRender";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL = "trace_videotab_tablist_MultiTabVideoController_save_detail";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART = "trace_videotab_tablist_MultiTabVideoController_trackPageStart";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW = "trace_videotab_tablist_MultiTabVideoController_updateView";
    public static final String TRACE_VIDEOTAB_TABLIST_ONCREATEVIEW = "trace_videotab_tablist_onCreateView";
    public static final String TRACE_VIDEOTAB_VIDEO_LAUNCHER_INIT = "trace_videotab_video_launcher_init";

    /* renamed from: a  reason: collision with root package name */
    private static final boolean[] f32690a;
    private static volatile boolean b;
    private static volatile boolean c;
    private static boolean d;
    private static WeakReference<Context> e;
    private static long f;

    static {
        kge.a(156086262);
        f32690a = new boolean[6];
        b = false;
        c = false;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            boolean[] zArr = f32690a;
            if (i < zArr.length) {
                return zArr[i];
            }
        }
        return false;
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else if (i < 0) {
        } else {
            boolean[] zArr = f32690a;
            if (i >= zArr.length) {
                return;
            }
            zArr[i] = true;
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            SystemClock.uptimeMillis();
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }

    public static void a(FluidContext fluidContext, long j) {
        IHostTNodeService iHostTNodeService;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd626a", new Object[]{fluidContext, new Long(j)});
            return;
        }
        if (f <= 0 && j > 0) {
            f = j;
        }
        spz.c("VideoMonitorUtils", "APMdata setAPMFirstFrameTime uptimeMillis=" + j + "; apmFirstFrameTime=" + f);
        if (f <= 0 || (iHostTNodeService = (IHostTNodeService) fluidContext.getService(IHostTNodeService.class)) == null) {
            return;
        }
        aa tNode = iHostTNodeService.getTNode();
        spz.c("VideoMonitorUtils", "APMdata setAPMFirstFrameTime apmFirstFrameTime=" + f + " ; tNode=" + tNode);
        if (tNode == null || oec.a(tNode.a(203), false)) {
            return;
        }
        aa a2 = tNode.a(Component.class, (aa.c) new aa.c<aa>() { // from class: tb.pio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue();
                }
                aa J = aaVar.J();
                return J != null && (J.I() instanceof TabBarControllerComponent);
            }
        }, true);
        IPage al = a2 != null ? a2.al() : null;
        spz.c("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime 。find... pageTnode=" + a2 + "; page=" + al);
        if (al == null) {
            return;
        }
        String str2 = "";
        try {
            str2 = fluidContext.getInstanceConfig().getFluidOriginUrl();
            str = str2 + "&tab3IsDefault=" + ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams().a().f();
        } catch (Throwable th) {
            th.printStackTrace();
            spz.c("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime 。 error: " + th.getMessage());
            str = str2;
        }
        spz.c("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime 。 firstFrameTime=" + f + "; fluidOriginUrl = " + str);
        al.g().a("videoFirstFrameTime", f);
        al.g().a("videoTabUrl", str);
        tNode.a(203, "true");
        f = 0L;
    }

    private static boolean a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff16fb81", new Object[]{snvVar})).booleanValue();
        }
        if (a(0)) {
            return false;
        }
        b(0);
        if (snvVar != null && snvVar.f() != null) {
            snvVar.f().setTag(R.id.fluid_sdk_tag_video_play_tag, 0);
        }
        return true;
    }

    private static boolean b(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed9a0202", new Object[]{snvVar})).booleanValue();
        }
        boolean a2 = a(1);
        boolean z = (snvVar == null || snvVar.f() == null || oec.a(snvVar.f().getTag(R.id.fluid_sdk_tag_video_play_tag), -1) != 0) ? false : true;
        if (a2 || !z) {
            return false;
        }
        b(1);
        e = new WeakReference<>(snvVar.f().getContext());
        return true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : a(1) && context == e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.fluid.core.FluidContext r38, tb.jwh r39) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pio.a(com.taobao.android.fluid.core.FluidContext, tb.jwh):void");
    }

    public static void a(Context context, snv snvVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1137727", new Object[]{context, snvVar, fluidContext});
        } else if (!a(snvVar)) {
        } else {
            spz.c("VideoMonitorUtils", "beginFirstFrameAPMTask");
            String j = spj.j(fluidContext);
            pil.a(context, j, GG_VIDEOTAB_VIDEO_PLAY);
            a(GG_VIDEOTAB_VIDEO_PLAY_END_UT);
            pil.a(context, j, "gg_videoMutiTab_videoPlay");
            if (fluidContext == null) {
                return;
            }
            ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).setTab3LauncherPrePlayerStartTime(System.currentTimeMillis());
            ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).setPlayerPlayToken(snvVar.h());
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b) {
        } else {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("mtop_error");
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("source");
            arrayList2.add("api");
            AppMonitor.register("ShortVideo", "mtop_api", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
        }
    }

    public static void a(String str, String str2, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699678d2", new Object[]{str, str2, new Double(d2), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mtop_error", Double.valueOf(z ? mto.a.GEO_NOT_SUPPORT : 1.0d));
        hashMap.put("time", Double.valueOf(d2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", str);
        hashMap2.put("api", str2);
        AppMonitor.Stat.commit("ShortVideo", "mtop_api", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        spz.c("VideoMonitorUtils", "mtopApiMonitor, source: " + str + ", api: " + str2 + ", time: " + d2 + ",isSuccess: " + z);
    }

    public static void a(FluidContext fluidContext, MtopResponse mtopResponse, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3d75af", new Object[]{fluidContext, mtopResponse, new Long(j), new Boolean(z)});
            return;
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        String str = null;
        String str2 = sessionParams != null ? sessionParams.b : null;
        if (TextUtils.isEmpty(str2)) {
            str2 = "-";
        }
        if (mtopResponse != null) {
            str = mtopResponse.getApi();
        }
        if (TextUtils.isEmpty(str)) {
            str = "-";
        }
        a(str2, str, System.currentTimeMillis() - j, z);
    }

    public static void a(FluidContext fluidContext, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeece370", new Object[]{fluidContext, new Double(d2), new Boolean(z)});
        } else {
            a(d(fluidContext), "dwInstance", d2, z);
        }
    }

    private static String d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35756ca3", new Object[]{fluidContext});
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        return (sessionParams == null || TextUtils.isEmpty(sessionParams.b)) ? "-" : sessionParams.b;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (c) {
        } else {
            c = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("source");
            arrayList2.add("phase");
            AppMonitor.register("ShortVideo", "video_time", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
        }
    }

    private static void b(String str, String str2, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed7e793", new Object[]{str, str2, new Double(d2), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Double.valueOf(d2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", str);
        hashMap2.put("phase", str2);
        AppMonitor.Stat.commit("ShortVideo", "video_time", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        spz.c("VideoMonitorUtils", "videoTimeMonitor, source: " + str + ", phase: " + str2 + ", time: " + d2);
    }

    private static void a(FluidContext fluidContext, String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd3fdda", new Object[]{fluidContext, str, new Double(d2)});
        } else {
            b(d(fluidContext), str, d2, false);
        }
    }

    public static void a(FluidContext fluidContext, Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1b6f6c", new Object[]{fluidContext, activity});
        } else if (activity == null || (intent = activity.getIntent()) == null) {
        } else {
            long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
            if (longExtra < 1) {
                return;
            }
            a(fluidContext, "navToOnCreate", System.currentTimeMillis() - longExtra);
        }
    }

    public static void a(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd4be4", new Object[]{fluidContext, new Double(d2)});
        } else {
            a(fluidContext, "dwBuild", d2);
        }
    }

    public static void b(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a66f203", new Object[]{fluidContext, new Double(d2)});
        } else {
            a(fluidContext, "dwStart", d2);
        }
    }

    public static void c(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c109822", new Object[]{fluidContext, new Double(d2)});
        } else {
            a(fluidContext, "dwStartToPrepare", d2);
        }
    }

    public static void d(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dba3e41", new Object[]{fluidContext, new Double(d2)});
        } else {
            a(fluidContext, "dwDestroy", d2);
        }
    }

    public static void a(FluidContext fluidContext) {
        double d2;
        long a2;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
        } else if (Boolean.valueOf(((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().d()).booleanValue()) {
            ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().a(false);
            if (a.a(fluidContext) <= 0) {
                return;
            }
            if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).isRetryFetchContent()) {
                a(fluidContext, "onCreateToFirstFrameInRetry", System.currentTimeMillis() - a2);
                return;
            }
            a(fluidContext, "onCreateToFirstFrame", System.currentTimeMillis() - a2);
            spz.a("changfeng", "VideoProcess onCreateToFirstFrame cost= " + (System.currentTimeMillis() - a2));
        } else {
            Long valueOf = Long.valueOf(((ICardService) fluidContext.getService(ICardService.class)).getCardPrivateViewForegroundTime());
            if (valueOf.longValue() > 0) {
                d2 = System.currentTimeMillis() - valueOf.longValue();
            } else {
                if (valueOf.longValue() != 0) {
                    i = 0;
                }
                d2 = i;
            }
            a(fluidContext, "cutToFirstFrame", d2);
        }
    }

    public static void b(FluidContext fluidContext) {
        double d2;
        long a2;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
        } else if (Boolean.valueOf(((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().e()).booleanValue()) {
            ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().b(false);
            if (a.a(fluidContext) <= 0) {
                return;
            }
            if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).isRetryFetchContent()) {
                a(fluidContext, "onCreateToOnStartInRetry", System.currentTimeMillis() - a2);
            } else {
                a(fluidContext, "onCreateToOnStart", System.currentTimeMillis() - a2);
            }
        } else {
            Long valueOf = Long.valueOf(((ICardService) fluidContext.getService(ICardService.class)).getCardPrivateViewForegroundTime());
            if (valueOf.longValue() > 0) {
                d2 = System.currentTimeMillis() - valueOf.longValue();
            } else {
                if (valueOf.longValue() != 0) {
                    i = 0;
                }
                d2 = i;
            }
            a(fluidContext, "cutToOnStart", d2);
        }
    }

    public static float c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ed73b8c", new Object[]{fluidContext})).floatValue() : ((IDeviceService) fluidContext.getService(IDeviceService.class)).getDeviceScore();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            s.f18233a.d().a(str);
        }
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, GG_VIDEOTAB_VIDEO_PREFETCH_MTOP)) {
            if (d) {
                return false;
            }
            d = true;
        }
        return true;
    }

    private static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, GG_VIDEOTAB_VIDEO_PREFETCH_MTOP)) {
            if (d) {
                return false;
            }
            d = true;
        }
        return true;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, (Map<String, Object>) null);
        }
    }

    public static void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (!d(str)) {
        } else {
            s.f18233a.d().e(str, map);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (!c(str)) {
        } else {
            s.f18233a.d().a(str, str2, map);
        }
    }
}
