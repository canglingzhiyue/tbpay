package com.taobao.android.detail.core.open;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1787700504);
        emu.a("com.taobao.android.detail.core.open.DetailSdkUtils");
    }

    public static com.taobao.android.detail.core.detail.kit.view.holder.desc.b a(Activity activity, epf epfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) ipChange.ipc$dispatch("f7bcaee7", new Object[]{activity, epfVar});
        }
        g a2 = n.a(activity);
        if (a2 == null) {
            throw new IllegalArgumentException("detailSdk not create");
        }
        return a2.a(activity, epfVar);
    }

    public static g a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("16890924", new Object[]{activity});
        }
        g a2 = n.a(activity);
        if (a2 == null) {
            throw new IllegalArgumentException("detailSdk not create");
        }
        return a2;
    }
}
