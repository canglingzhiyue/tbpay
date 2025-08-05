package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.a;
import com.taobao.android.behavir.b;
import com.taobao.android.behavix.j;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* loaded from: classes5.dex */
public class jcr implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f29460a;
    private final FluidContext b;

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
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

    static {
        kge.a(227381611);
        kge.a(1755210026);
        f29460a = null;
    }

    public jcr(FluidContext fluidContext) {
        this.b = fluidContext;
        ((ILifecycleService) this.b.getService(ILifecycleService.class)).addPageLifecycleListener(this);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (f29460a == null) {
            f29460a = Boolean.valueOf(oec.a((Object) FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableBehaviorX", "true"), false));
        }
        return f29460a.booleanValue();
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            bY_();
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            b();
        }
    }

    public void bY_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd523b8f", new Object[]{this});
            return;
        }
        try {
            if (!c()) {
                return;
            }
            a a2 = b.a();
            sps sessionParams = ((ISceneConfigService) this.b.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams == null) {
                return;
            }
            a2.commitEnter("Page_videointeract", sessionParams.d != null ? sessionParams.d : "", this.b.getContext(), j.c(sessionParams.f33820a));
        } catch (Throwable th) {
            spz.a("BehaviorXManager", "", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (!c()) {
                return;
            }
            a a2 = b.a();
            sps sessionParams = ((ISceneConfigService) this.b.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams == null) {
                return;
            }
            a2.commitLeave("Page_videointeract", sessionParams.d != null ? sessionParams.d : "", this.b.getContext(), new String[0]);
        } catch (Throwable th) {
            spz.a("BehaviorXManager", "", th);
        }
    }
}
