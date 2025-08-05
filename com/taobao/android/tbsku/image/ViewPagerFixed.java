package com.taobao.android.tbsku.image;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ViewPagerFixed extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;

    static {
        kge.a(416099453);
    }

    public static /* synthetic */ Object ipc$super(ViewPagerFixed viewPagerFixed, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public ViewPagerFixed(Context context) {
        super(context);
    }

    public ViewPagerFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbsku.image.ViewPagerFixed.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            if (r1 == 0) goto L20
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r10
            r1[r5] = r11
            java.lang.String r11 = "e7b587fe"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L20:
            int r0 = r11.getActionMasked()
            if (r0 == 0) goto L8b
            if (r0 == r5) goto L7c
            if (r0 == r2) goto L2f
            r1 = 3
            if (r0 == r1) goto L7c
            goto La4
        L2f:
            float r0 = r11.getY()
            float r1 = r11.getX()
            float r2 = r10.mLastMotionX
            float r2 = r1 - r2
            float r6 = r10.mLastMotionY
            float r6 = r0 - r6
            float r7 = r10.mInitialMotionY
            float r7 = r0 - r7
            float r7 = java.lang.Math.abs(r7)
            float r8 = r10.mInitialMotionX
            float r8 = r1 - r8
            float r8 = java.lang.Math.abs(r8)
            float r2 = java.lang.Math.abs(r2)
            float r6 = java.lang.Math.abs(r6)
            r9 = 1051931443(0x3eb33333, float:0.35)
            float r6 = r6 * r9
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L6d
            float r7 = r7 * r9
            int r2 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r2 <= 0) goto L67
            goto L6d
        L67:
            int r2 = com.taobao.taobao.R.id.sku_child_first_intercept
            r10.setTag(r2, r4)
            goto L77
        L6d:
            android.view.ViewParent r2 = r10.getParent()
            if (r2 == 0) goto L76
            r2.requestDisallowInterceptTouchEvent(r5)
        L76:
            r3 = 1
        L77:
            r10.mLastMotionY = r0
            r10.mLastMotionX = r1
            goto La4
        L7c:
            r0 = 0
            r10.mInitialMotionY = r0
            r10.mLastMotionY = r0
            r10.mInitialMotionX = r0
            r10.mLastMotionX = r0
            int r0 = com.taobao.taobao.R.id.sku_child_first_intercept
            r10.setTag(r0, r4)
            goto La4
        L8b:
            float r0 = r11.getY()
            r10.mInitialMotionY = r0
            r10.mLastMotionY = r0
            float r0 = r11.getX()
            r10.mInitialMotionX = r0
            r10.mLastMotionX = r0
            int r0 = com.taobao.taobao.R.id.sku_child_first_intercept
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r10.setTag(r0, r1)
        La4:
            boolean r11 = super.onInterceptTouchEvent(r11)     // Catch: java.lang.Throwable -> La9
            r3 = r3 | r11
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.ViewPagerFixed.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
