package tb;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.RoundCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.view.b;

/* loaded from: classes5.dex */
public class snq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33750a;
    private final RecyclerView b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    static {
        kge.a(1638374104);
        f33750a = null;
    }

    public snq(RecyclerView recyclerView) {
        this.b = recyclerView;
        this.c = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f33750a == null) {
            f33750a = Boolean.valueOf(oec.a((Object) FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableH5InterceptScroll", "true"), false));
        }
        ogg.a("TestConfig", "AB_fullscreen.web优化---enableH5InterceptScroll : " + f33750a);
        return f33750a.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r5 != 5) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.snq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            r1[r4] = r9
            java.lang.String r9 = "5f37b481"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1c:
            android.support.v7.widget.RecyclerView r0 = r8.b
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r0 = r0.canScrollHorizontally()
            android.support.v7.widget.RecyclerView r1 = r8.b
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            boolean r1 = r1.canScrollVertically()
            int r5 = r9.getActionMasked()
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto Lc1
            java.lang.String r7 = "RecyclerViewTouchHelper"
            if (r5 == r4) goto Lbb
            if (r5 == r2) goto L43
            r0 = 5
            if (r5 == r0) goto Lc1
            goto Lc0
        L43:
            boolean r2 = r8.b(r9)
            if (r2 == 0) goto L4a
            return r3
        L4a:
            boolean r2 = r8.c(r9)
            if (r2 == 0) goto L51
            return r3
        L51:
            int r2 = r8.d
            int r2 = r9.findPointerIndex(r2)
            if (r2 >= 0) goto L75
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.d
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            tb.spz.c(r7, r9)
            return r4
        L75:
            float r3 = r9.getX(r2)
            float r3 = r3 + r6
            int r3 = (int) r3
            float r9 = r9.getY(r2)
            float r9 = r9 + r6
            int r9 = (int) r9
            boolean r2 = r8.g
            if (r2 != 0) goto Lba
            int r2 = r8.e
            int r3 = r3 - r2
            int r2 = r8.f
            int r9 = r9 - r2
            if (r0 == 0) goto La1
            int r0 = java.lang.Math.abs(r3)
            int r2 = r8.c
            if (r0 <= r2) goto La1
            int r0 = java.lang.Math.abs(r3)
            int r2 = java.lang.Math.abs(r9)
            if (r0 <= r2) goto La1
            r8.g = r4
        La1:
            if (r1 == 0) goto Lb7
            int r0 = java.lang.Math.abs(r9)
            int r1 = r8.c
            if (r0 <= r1) goto Lb7
            int r9 = java.lang.Math.abs(r9)
            int r0 = java.lang.Math.abs(r3)
            if (r9 <= r0) goto Lb7
            r8.g = r4
        Lb7:
            boolean r9 = r8.g
            return r9
        Lba:
            return r4
        Lbb:
            java.lang.String r9 = "onActionUP"
            tb.spz.c(r7, r9)
        Lc0:
            return r4
        Lc1:
            boolean r0 = r8.b(r9)
            if (r0 == 0) goto Lc8
            return r3
        Lc8:
            java.lang.String r0 = "weexStateConsume"
            r8.a(r0)
            r8.g = r3
            int r0 = r9.getPointerId(r3)
            r8.d = r0
            float r0 = r9.getX()
            float r0 = r0 + r6
            int r0 = (int) r0
            r8.e = r0
            float r9 = r9.getY()
            float r9 = r9 + r6
            int r9 = (int) r9
            r8.f = r9
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.snq.a(android.view.MotionEvent):boolean");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof RoundCornerLayout) {
                RoundCornerLayout roundCornerLayout = (RoundCornerLayout) childAt;
                if (!obw.WEEX_STATE_NOT_EXIST.equals(roundCornerLayout.getWeexConsume())) {
                    roundCornerLayout.setWeexConsume(str);
                    roundCornerLayout.setAcceptGestureType(b.PULL_INIT);
                }
            }
        }
    }

    private boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!a()) {
            return false;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof FscrmidFavorFrameLayout) {
                return ((FscrmidFavorFrameLayout) childAt).isTouchOnWebViewValidArea(motionEvent);
            }
        }
        return false;
    }

    private boolean c(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = 0;
        boolean z2 = true;
        while (true) {
            if (i >= this.b.getChildCount()) {
                z = true;
                break;
            }
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof RoundCornerLayout) {
                RoundCornerLayout roundCornerLayout = (RoundCornerLayout) childAt;
                if (!obw.WEEX_STATE_CONSUME.equals(roundCornerLayout.getWeexConsume())) {
                    z = false;
                    break;
                } else if (!roundCornerLayout.isLockList()) {
                    z2 = iqw.k() ? false : roundCornerLayout.canInterceptVertical();
                }
            }
            i++;
        }
        return z && z2;
    }
}
