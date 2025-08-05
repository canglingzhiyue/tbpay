package com.taobao.tao.flexbox.layoutmanager.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f20535a;
    private float b;
    private int c = -1;

    static {
        kge.a(-552354828);
    }

    public c(View view) {
        this.f20535a = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r11
            r1[r3] = r12
            java.lang.String r12 = "5f37b481"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1c:
            int r0 = r12.getActionMasked()
            if (r0 == 0) goto L64
            r1 = -1
            if (r0 == r3) goto L61
            if (r0 == r2) goto L2b
            r12 = 3
            if (r0 == r12) goto L61
            goto L82
        L2b:
            android.view.View r0 = r11.f20535a
            boolean r0 = r11.a(r0)
            if (r0 == 0) goto L34
            return r4
        L34:
            int r0 = r11.c
            if (r0 != r1) goto L39
            return r4
        L39:
            int r0 = r12.findPointerIndex(r0)
            if (r0 >= 0) goto L40
            return r4
        L40:
            float r1 = r12.getX(r0)
            float r12 = r12.getY(r0)
            float r0 = r11.b
            float r0 = r1 - r0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L82
            android.view.View r6 = r11.f20535a
            r7 = 0
            int r8 = (int) r0
            int r9 = (int) r1
            int r10 = (int) r12
            r5 = r11
            boolean r12 = r5.a(r6, r7, r8, r9, r10)
            if (r12 == 0) goto L82
            r11.b = r1
            return r4
        L61:
            r11.c = r1
            goto L82
        L64:
            android.view.View r0 = r11.f20535a
            boolean r0 = r11.a(r0)
            if (r0 == 0) goto L6d
            return r4
        L6d:
            int r0 = r12.getPointerId(r4)
            r11.c = r0
            int r0 = r11.c
            int r0 = r12.findPointerIndex(r0)
            if (r0 >= 0) goto L7c
            return r4
        L7c:
            float r12 = r12.getX()
            r11.b = r12
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.c.a(android.view.MotionEvent):boolean");
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof b) {
            b bVar = (b) view;
            if (bVar.canPullIntercept(b.PULL_HORIZONTAL_DRAG) || bVar.canPullIntercept(b.PULL_VERTICAL_DRAG)) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (a(childAt)) {
                        return true;
                    }
                    if (childAt instanceof b) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436a9bd", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt == null || (i5 = i2 + scrollX) < childAt.getLeft() || i5 >= childAt.getRight() * childAt.getScaleX() || (i6 = i3 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        } else if (view instanceof SeekBar) {
            return true;
        }
        return z && view.canScrollHorizontally(-i);
    }
}
