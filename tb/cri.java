package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.module.CameraMuiseModule;
import com.etao.feimagesearch.capture.dynamic.module.PltToolModule;
import com.taobao.android.weex_framework.MUSEngine;
import kotlin.jvm.JvmStatic;

/* loaded from: classes3.dex */
public final class cri {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cri INSTANCE;

    static {
        kge.a(958703023);
        INSTANCE = new cri();
    }

    private cri() {
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        MUSEngine.registerModule(CameraMuiseModule.MODULE_NAME, CameraMuiseModule.class);
        MUSEngine.registerModule(PltToolModule.MODULE_NAME, PltToolModule.class);
    }
}
