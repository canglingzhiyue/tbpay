package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class sjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33638a;
    private boolean b;
    private boolean c;
    private String d;
    private int g;
    private boolean e = false;
    private boolean h = false;
    private int f = 0;

    static {
        kge.a(-270452);
    }

    public sjv(FluidContext fluidContext) {
        this.g = fluidContext.getContext().getResources().getDimensionPixelSize(R.dimen.fluid_sdk_private_list_margin_top);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        try {
            if (spj.f(fluidContext) && oeb.bH() && ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().h()) {
                if (i.a(obu.e(), i.FEATURE_OPT_LOADING, true)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            spz.a("ContainerServiceConfig", "", th);
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableNewContentErrorStatus", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTopTitle", true);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : oeb.a("ShortVideo.errorContentAutoScrollDelay", 1000);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue() : ((IContainerService) fluidContext.getService(IContainerService.class)).isTab3GuideShoppingVersion();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f33638a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f33638a = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.b;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public static boolean c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ed73ba0", new Object[]{fluidContext})).booleanValue() : spj.d(fluidContext) && FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCloseGlobalH5AtTab3", true);
    }
}
