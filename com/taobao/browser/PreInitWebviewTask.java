package com.taobao.browser;

import android.app.Application;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.biz.task.k;
import java.io.Serializable;
import java.util.HashMap;
import tb.kfc;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class PreInitWebviewTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCHER_WEB = "launcher_web";
    public Application application;

    static {
        kge.a(-1953656923);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        kfc.a("exchain.FullTrace", "PreInitWebviewTask");
        this.application = application;
        long currentTimeMillis = System.currentTimeMillis();
        WVCoreSettings.getInstance().setCoreEventCallback(new android.taobao.windvane.webview.a() { // from class: com.taobao.browser.PreInitWebviewTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1847240272) {
                    super.onUCCorePrepared();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.webview.a
            public void onUCCorePrepared() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                    return;
                }
                super.onUCCorePrepared();
                kfc.a("exchain.FullTrace", "defferTask");
                k.a("DefferPreWebView", new com.taobao.android.launcher.biz.task.i() { // from class: com.taobao.browser.PreInitWebviewTask.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.launcher.biz.task.i
                    public void a(Application application2, HashMap<String, Object> hashMap2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f47168dc", new Object[]{this, application2, hashMap2});
                        } else if (!WVCore.getInstance().isUCSupport()) {
                            kfc.a("exchain.FullTrace", "uc sdk not support!!");
                        } else {
                            g.a().addPreInitWeb(PreInitWebviewTask.LAUNCHER_WEB, application2, null);
                            kfc.a("exchain.FullTrace", "pre init webview success");
                        }
                    }
                });
            }
        });
        kfc.a("exchain.FullTrace", "do preInit task=[false], cost=[" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
    }
}
