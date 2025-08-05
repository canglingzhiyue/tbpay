package com.taobao.android.detail.wrapper.fragment.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.a;
import com.taobao.android.detail.core.event.params.e;
import com.taobao.android.trade.event.f;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.HashMap;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SDKConfig;
import tb.edx;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class WXAppInfoModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ONLINE = "online";
    public static final String PRE = "pre";
    public static final String TEST = "test";
    public static int floatWeexFragmentHeight;

    /* renamed from: com.taobao.android.detail.wrapper.fragment.weex.module.WXAppInfoModule$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11408a = new int[EnvModeEnum.values().length];

        static {
            try {
                f11408a[EnvModeEnum.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11408a[EnvModeEnum.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11408a[EnvModeEnum.ONLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1067344755);
        floatWeexFragmentHeight = 0;
    }

    public WXAppInfoModule() {
        emu.a("com.taobao.android.detail.wrapper.fragment.weex.module.WXAppInfoModule");
    }

    @WXModuleAnno
    public void getDetailAppInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7935b9", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        int i = AnonymousClass1.f11408a[SDKConfig.getInstance().getGlobalEnvMode().ordinal()];
        hashMap.put("networkEnv", i != 1 ? i != 2 ? "online" : "test" : "pre");
        WXSDKEngine.callback(this.mWXSDKInstance.N(), str, hashMap);
    }

    @WXModuleAnno
    public void disappear(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fabdf4", new Object[]{this, str});
            return;
        }
        f.a(a.b().f9418a, new edx(new e("", true)));
        WXSDKEngine.callback(this.mWXSDKInstance.N(), str, null);
    }

    @WXModuleAnno
    public void getContainerHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3349e7e3", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("height", Integer.valueOf(floatWeexFragmentHeight));
        WXSDKEngine.callback(this.mWXSDKInstance.N(), str, hashMap);
    }
}
