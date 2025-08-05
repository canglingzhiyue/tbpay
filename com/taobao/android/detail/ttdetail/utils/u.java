package com.taobao.android.detail.ttdetail.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1666864441);
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
            i.a("SystemUtil", "copyToClipboard", e);
        }
    }
}
