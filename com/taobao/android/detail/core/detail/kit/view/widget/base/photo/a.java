package com.taobao.android.detail.core.detail.kit.view.widget.base.photo;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1308640394);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.photo.Compat");
    }

    public static void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f6f4e8", new Object[]{view, runnable});
        } else {
            view.postDelayed(runnable, 16L);
        }
    }
}
