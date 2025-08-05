package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.j;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.taolive.room.utils.ag;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.psw;
import tb.snf;
import tb.snv;
import tb.son;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2088228642);
    }

    public static /* synthetic */ VideoTracker c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoTracker) ipChange.ipc$dispatch("d90bbb20", new Object[]{fluidContext}) : d(fluidContext);
    }

    private static VideoTracker h(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("89bf9d1", new Object[]{pswVar});
        }
        if (pswVar != null && pswVar.v() != null) {
            return pswVar.v().c();
        }
        return null;
    }

    public static void a(FluidContext fluidContext, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a229a4b6", new Object[]{fluidContext, pswVar});
        } else if (!a()) {
        } else {
            VideoTracker videoTracker = new VideoTracker(fluidContext, pswVar);
            sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                videoTracker.a(sessionParams.b);
            }
            videoTracker.d(((IDataService) fluidContext.getService(IDataService.class)).getPreloadUseCacheValue());
            pswVar.v().a(videoTracker);
        }
    }

    public static void a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{pswVar});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.d();
    }

    public static void b(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c26205", new Object[]{pswVar});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.b(true);
        h.i("cell_active");
    }

    public static void c(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7456886", new Object[]{pswVar});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.l();
        h.j();
        h.b();
        h.c();
        h.b(false);
    }

    public static void a(psw pswVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c9008", new Object[]{pswVar, dVar});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a(dVar);
    }

    public static void d(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c86f07", new Object[]{pswVar});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoStart name=");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.g();
    }

    public static void a(psw pswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7de2c4e", new Object[]{pswVar, str});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoPrepared name=");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.e(str);
        h.c(true);
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
            return;
        }
        spz.a("changfeng", "videotrack tab3 cache=");
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.b(str, ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f() ? "1" : "0");
    }

    public static void b(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6675baa5", new Object[]{fluidContext, str});
            return;
        }
        spz.a("changfeng", "videotrack tab3CacheScene=");
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        spz.c("PickPreloadController", "PickPreloadController,当前tab3缓存场景:" + str);
        d.f(str);
    }

    public static void c(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42373666", new Object[]{fluidContext, str});
            return;
        }
        spz.a("changfeng", "videotrack tab3IsColdRed=");
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        spz.c("VideoTrackUtil", "PickPreloadController,tab3IsColdRed:" + str);
        d.h(str);
    }

    public static void d(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df8b227", new Object[]{fluidContext, str});
            return;
        }
        spz.a("changfeng", "videotrack usePreloadDW=");
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        spz.c("VideoTrackUtil", "PickPreloadController,usePreloadDW:" + str);
        d.g(str);
    }

    public static void a(FluidContext fluidContext, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef6e39a", new Object[]{fluidContext, new Boolean(z), new Boolean(z2)});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(z, z2);
    }

    public static Map e(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e271ca1d", new Object[]{fluidContext, str});
        }
        spz.a("changfeng", "videotrack gettab3CachePoint=");
        HashMap hashMap = new HashMap();
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return hashMap;
        }
        boolean b = snf.b(fluidContext);
        spz.c("PickPreloadController", "PickPreloadController,gettab3CachePoint:" + b);
        return d.a(fluidContext, str, b);
    }

    public static void a(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd5ea9", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        spz.a("changfeng", "videotrack preCreteAutoAcroll=");
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.b(i);
    }

    public static void a(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dacc7d0", new Object[]{pswVar, new Boolean(z)});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoFirstFrame");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        c.a f = h.f();
        if (z) {
            f.b(0L);
        }
        long d = pswVar.v().d();
        if (d > 0) {
            h.a(d);
        }
        h.a("first_frame_rendered", f);
        h.a(z);
    }

    public static void a(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b8e49f", new Object[]{pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a(i, i2, i3);
    }

    public static void a(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dac87ff", new Object[]{pswVar, new Integer(i)});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoSeekTo=" + i);
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a(i);
    }

    public static void e(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44b7588", new Object[]{pswVar});
            return;
        }
        spz.a("changfeng", "videotrack onVideoReplay video onVideoPreComplete");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.i("end");
    }

    public static void f(psw pswVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ce7c09", new Object[]{pswVar});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoReplay");
        VideoTracker h = h(pswVar);
        if (h != null) {
            h.c(false);
            h.d();
            h.i();
            h.i(ag.CLICK_REPLAY);
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) pswVar.z().getService(IDataService.class)).getCurrentMediaSetData();
        String str = null;
        a.c a2 = currentMediaSetData != null ? currentMediaSetData.a() : null;
        if (a2 != null) {
            str = a2.I();
        }
        if (str == null) {
            return;
        }
        if (str.equals(((ITrackService) pswVar.z().getService(ITrackService.class)).getRecordContentId())) {
            Integer valueOf = Integer.valueOf(((ITrackService) pswVar.z().getService(ITrackService.class)).getRecordCount());
            if (valueOf != null) {
                i = valueOf.intValue();
            }
            ((ITrackService) pswVar.z().getService(ITrackService.class)).setRecordCount(Integer.valueOf(i).intValue() + 1);
            return;
        }
        ((ITrackService) pswVar.z().getService(ITrackService.class)).setRecordContentId(str);
        ((ITrackService) pswVar.z().getService(ITrackService.class)).setRecordCount(1);
    }

    public static void g(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9151828a", new Object[]{pswVar});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoStallStart");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.h();
    }

    public static void a(psw pswVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dac8bc0", new Object[]{pswVar, new Long(j)});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoStallEnd duration=" + j);
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.b(j);
    }

    public static void b(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8a519e", new Object[]{pswVar, new Integer(i)});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoPlayFail code=" + i);
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a("fail", i);
        h.d(false);
        h.d();
        h.i();
        h.i("play");
    }

    public static void c(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11681b3d", new Object[]{pswVar, new Integer(i)});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoPlayError code=" + i);
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a("error", i);
    }

    public static void a(psw pswVar, snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d070e99", new Object[]{pswVar, snvVar});
            return;
        }
        spz.a("changfeng", "videotrack video onVideoDestroy ");
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        if (snvVar != null) {
            spz.a("changfeng", "videotrack video videoQoS ");
            h.a(snvVar.i());
        }
        h.e();
        h.i("destroy_player");
    }

    public static void b(psw pswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc6f48f", new Object[]{pswVar, str});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.i(str);
    }

    private static VideoTracker d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoTracker) ipChange.ipc$dispatch("c79e46ff", new Object[]{fluidContext}) : ((ITrackService) fluidContext.getService(ITrackService.class)).getPageVideoTracker();
    }

    public static void a(FluidContext fluidContext, sps spsVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71c1694", new Object[]{fluidContext, spsVar});
        } else if (!a()) {
        } else {
            c.b bVar = new c.b();
            bVar.e = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableSharePlayer() ? 1 : 0;
            ((ITrackService) fluidContext.getService(ITrackService.class)).setVideoTrackerPageInfo(bVar);
            VideoTracker videoTracker = new VideoTracker(fluidContext, null);
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageVideoTracker(videoTracker);
            if (spsVar != null) {
                videoTracker.a(spsVar.b);
                str = j.a(spsVar.f33820a);
            } else {
                str = "";
            }
            videoTracker.b(str);
        }
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
            return;
        }
        spz.a("changfeng", "videotrack video enter ");
        if (!Boolean.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).isPageFirstEnter()).booleanValue()) {
            return;
        }
        ((ITrackService) fluidContext.getService(ITrackService.class)).setPageFirstEnter(true);
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a();
    }

    public static void f(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57ba9a9", new Object[]{fluidContext, str});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.c(str);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i != -1) {
            return String.valueOf(i);
        }
        return null;
    }

    private static String e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9fa4f4c2", new Object[]{fluidContext}) : ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).getPageState() == 5 ? "1" : "0";
    }

    public static void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{fluidContext, str, str2});
        } else {
            a(fluidContext, str, str2, -1);
        }
    }

    public static void a(FluidContext fluidContext, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ba7115", new Object[]{fluidContext, str, str2, new Integer(i)});
        } else {
            a(fluidContext, str, str2, i, (String) null);
        }
    }

    public static void a(FluidContext fluidContext, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11f5f9f", new Object[]{fluidContext, str, str2, new Integer(i), str3});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, str2, a(i), str3);
    }

    public static void a(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e474aa3b", new Object[]{fluidContext, str, mtopResponse, new Long(j)});
        } else {
            a(fluidContext, str, mtopResponse, j, -1);
        }
    }

    public static void a(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa211028", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i)});
        } else {
            b(fluidContext, str, mtopResponse, j, i, null);
        }
    }

    public static void b(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed877f69", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i)});
        } else {
            a(fluidContext, str, mtopResponse, j, i, (String) null);
        }
    }

    public static void a(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f617ff2", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i), str2});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, mtopResponse, j, a(i), e(fluidContext), str2);
    }

    public static void b(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ded00f3", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i), str2});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null || mtopResponse == null) {
            return;
        }
        String str3 = "";
        if ("videoinfo_mtop_end".equals(str)) {
            Long valueOf = Long.valueOf(((IDataService) fluidContext.getService(IDataService.class)).getDetailMtopCost());
            if (valueOf.longValue() > 0) {
                str3 = String.valueOf(valueOf);
            }
        } else if ("detail_mtop_end".equals(str) || "rec_mtop_end".equals(str)) {
            str3 = String.valueOf(((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().m());
        }
        d.a(str, mtopResponse.getApi(), j, str3, a(i), e(fluidContext), str2);
    }

    public static void b(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd1652f", new Object[]{fluidContext, str, str2});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, str2);
    }

    public static void a(FluidContext fluidContext, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ba74d6", new Object[]{fluidContext, str, str2, new Long(j)});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, str2, j);
    }

    public static void a(FluidContext fluidContext, String str, String str2, int i, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cd0b05", new Object[]{fluidContext, str, str2, new Integer(i), str3, new Long(j)});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, str2, i, str3, j);
    }

    public static void b(final FluidContext fluidContext, final String str, final String str2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5bb775", new Object[]{fluidContext, str, str2, new Long(j)});
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VideoTracker c = d.c(FluidContext.this);
                    if (c == null) {
                        return;
                    }
                    c.b(str, str2, j);
                }
            });
        }
    }

    public static void a(psw pswVar, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5efe76", new Object[]{pswVar, str, str2, str3, str4, str5});
            return;
        }
        VideoTracker h = h(pswVar);
        if (h == null) {
            return;
        }
        h.a(str, str2, str3, str4, str5);
    }

    public static void a(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26c6b0c", new Object[]{fluidContext, str, str2, str3, str4, str5});
            return;
        }
        VideoTracker d = d(fluidContext);
        if (d == null) {
            return;
        }
        d.a(str, str2, str3, str4, str5);
    }

    public static String b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61165c65", new Object[]{fluidContext});
        }
        c.b videoTrackerPageInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getVideoTrackerPageInfo();
        if (videoTrackerPageInfo != null) {
            return videoTrackerPageInfo.d;
        }
        return null;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        try {
            if (!b()) {
                runnable.run();
            } else {
                com.taobao.android.fluid.framework.performance.b.a(runnable);
            }
        } catch (Exception unused) {
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            if (son.n()) {
                a(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoTracker", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableVideoTrackerThread", true);
    }
}
