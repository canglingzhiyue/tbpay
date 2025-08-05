package com.taobao.android.detail.sdk.utils.ocr;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1309007811);
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.OCRHelper");
    }

    public static AccessibilityManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityManager) ipChange.ipc$dispatch("11e6a107", new Object[]{context});
        }
        try {
            return (AccessibilityManager) context.getSystemService("accessibility");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
