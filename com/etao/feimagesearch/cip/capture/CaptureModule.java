package com.etao.feimagesearch.cip.capture;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class CaptureModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String NAME = "TBSImageCaptureModule";

    static {
        kge.a(1920461781);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1504104669);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureModule(String moduleName, MUSDKInstance instance) {
        super(moduleName, instance);
        q.c(moduleName, "moduleName");
        q.c(instance, "instance");
    }

    @MUSMethod
    public final void dismissPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e7c6e", new Object[]{this});
            return;
        }
        p captureModule = getInstance();
        if (captureModule == null) {
            return;
        }
        captureModule.getUIContext();
    }
}
