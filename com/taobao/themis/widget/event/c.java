package com.taobao.themis.widget.event;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"isTouchPointInView", "", "Landroid/view/View;", "rawX", "", "rawY", "", "themis_widget_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-219219953);
    }

    public static final boolean a(View isTouchPointInView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{isTouchPointInView, new Integer(i), new Integer(i2)})).booleanValue();
        }
        q.d(isTouchPointInView, "$this$isTouchPointInView");
        int[] iArr = new int[2];
        isTouchPointInView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 <= isTouchPointInView.getMeasuredHeight() + i4 && i2 >= i4 && i <= isTouchPointInView.getMeasuredWidth() + i3 && i >= i3;
    }

    public static final boolean a(View isTouchPointInView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c23a8ee", new Object[]{isTouchPointInView, new Float(f), new Float(f2)})).booleanValue();
        }
        q.d(isTouchPointInView, "$this$isTouchPointInView");
        return a(isTouchPointInView, (int) f, (int) f2);
    }
}
