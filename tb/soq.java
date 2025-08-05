package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.tao.flexbox.layoutmanager.container.i;

/* loaded from: classes5.dex */
public class soq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_KEY_OPT_P2FF_VIEW = "enableP2ffPreAddview";
    public static final String AB_KEY_OPT_VIDEO_PRELOADCACHE = "enablePreloadCacher";

    /* renamed from: a  reason: collision with root package name */
    private Pair<String, String> f33777a;
    private sor b;
    private boolean c;

    static {
        kge.a(-1521023028);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l();
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue() : !z || c.a(obu.e());
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean a2 = a();
        boolean z = sop.a().b().k;
        spz.c("PickPreloadController", "isEnableDownloadExposedVideo,disableBgDownload:" + z);
        return a2 && !z;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean z = sop.a().b().i;
        spz.c("PickPreloadController_PreloadServiceConfig", "isEnableDelayInitInteractiveView--,enableWeexDelay:" + z);
        return z;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : !c.b();
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        boolean z = sop.a().b().f33774a;
        spz.c("PickPreloadControllerNew", "enablePreload:" + z);
        return z;
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue() : spj.i(fluidContext);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : oeb.a("ShortVideo.fixFailPlay", true);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : i.a(context, "launcher_can_use_unexposed_cache_render", false);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        return spj.d(fluidContext) && ((IPreloadService) fluidContext.getService(IPreloadService.class)).isInactiveUnexposedCacheVideo();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : oeb.a("ShortVideo.newUnexposeStrategy", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : oeb.a("ShortVideo.enablePredownloadUnexposedStrategy", true) && g();
    }

    public sor i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("4c97c540", new Object[]{this}) : this.b;
    }

    public void a(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff234182", new Object[]{this, sorVar});
        } else {
            this.b = sorVar;
        }
    }

    public Pair<String, String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("790d77fb", new Object[]{this}) : this.f33777a;
    }

    public void a(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a82db72", new Object[]{this, pair});
        } else {
            this.f33777a = pair;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.c;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableKeepPreloadVideoData", true);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableGetVideoCacheState", true);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : oeb.a("ShortVideo.enableOptPreloadFirstOpen", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableCacheValidWhenVerticalNull", true);
    }
}
