package com.taobao.android.detail.core.detail.kit.utils;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f9552a;

    static {
        kge.a(-946923428);
        f9552a = null;
        emu.a("com.taobao.android.detail.core.detail.kit.utils.ViewUtils");
    }

    public static boolean a(TextView textView) {
        Layout layout;
        int lineCount;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92d3ee0", new Object[]{textView})).booleanValue() : textView == null || (layout = textView.getLayout()) == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0;
    }

    public static View a(ViewGroup viewGroup, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f96e038", new Object[]{viewGroup, cls});
        }
        if (viewGroup != null && cls != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getClass().equals(cls)) {
                    return childAt;
                }
            }
        }
        return null;
    }
}
