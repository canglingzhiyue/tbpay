package com.taobao.android.detail.core.detail.kit.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1136771711);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.SystemUtil");
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("剪贴板内容", str));
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("SystemUtil", "copyToClipboard", e);
        }
    }
}
