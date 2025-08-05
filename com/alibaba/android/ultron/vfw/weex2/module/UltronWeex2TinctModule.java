package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2TinctModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeTinct";
    private static final String TINCT_BIZ_NAME = "trade_weex2";

    static {
        kge.a(544615260);
    }

    public UltronWeex2TinctModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public void tinct(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2b3ae5", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.d("UltronWeex2TinctModule.tinct", "changeType or configType invalid");
        } else {
            bga.c.b(TINCT_BIZ_NAME, str, str2, "default");
        }
    }

    @MUSMethod(uiThread = false)
    public void tinctAsync(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb0bded", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.d("UltronWeex2TinctModule.tinctAsync", "changeType or configType invalid");
        } else {
            a.a().e().a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TinctModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bga.c.b(UltronWeex2TinctModule.TINCT_BIZ_NAME, str, str2, "default");
                    }
                }
            });
        }
    }
}
