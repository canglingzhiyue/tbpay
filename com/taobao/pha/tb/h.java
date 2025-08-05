package com.taobao.pha.tb;

import android.content.Context;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.webview.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import tb.kge;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1845913602);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (WVCore.getInstance().isUCSupport()) {
                return;
            }
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "PHASetUp", "WVCore is not inited");
            WVCore.getInstance().initUCCore(context, new a() { // from class: com.taobao.pha.tb.h.1
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
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "PHASetUp", "WVCore onUCCorePrepared");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
