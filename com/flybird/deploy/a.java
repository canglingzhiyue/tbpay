package com.flybird.deploy;

import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cum;
import tb.ieb;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated
    public static void a(final String str, final com.flybird.deploy.model.e eVar, final cum<FBTemplateDecider, Void, Void> cumVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b384ce", new Object[]{str, eVar, cumVar});
            return;
        }
        Platform.i();
        if (ieb.b()) {
            ieb.f28958a.submit(new Runnable() { // from class: com.flybird.deploy.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        cum.this.apply(FBTemplateDecider.a(str, eVar));
                    }
                }
            });
        } else {
            cumVar.apply(FBTemplateDecider.a(str, eVar));
        }
    }
}
