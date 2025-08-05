package com.taobao.homepage.speed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes7.dex */
public class SpeedFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicBoolean isFirstLayout;

    public static /* synthetic */ Object ipc$super(SpeedFrameLayout speedFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1316764614);
        isFirstLayout = new AtomicBoolean(true);
    }

    public SpeedFrameLayout(Context context) {
        super(context);
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.speed.SpeedFrameLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r5)
            r1[r2] = r3
            r5 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r1[r5] = r2
            r5 = 3
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r5] = r6
            r5 = 4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            r1[r5] = r6
            r5 = 5
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1[r5] = r6
            java.lang.String r5 = "f167cda4"
            r0.ipc$dispatch(r5, r1)
            return
        L3a:
            super.onLayout(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3e
            goto L4c
        L3e:
            r5 = move-exception
            java.lang.String r6 = "SpeedFrameLayout"
            java.lang.String r7 = "onLayout"
            com.taobao.android.home.component.utils.e.a(r6, r7, r5)
            boolean r6 = com.taobao.android.behavix.utils.Debuggable.isDebug()
            if (r6 != 0) goto L70
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r5 = com.taobao.homepage.speed.SpeedFrameLayout.isFirstLayout
            boolean r5 = r5.compareAndSet(r2, r3)
            if (r5 == 0) goto L6f
            com.taobao.tao.recommend3.tracelog.b r5 = com.taobao.tao.recommend3.tracelog.b.a()
            java.lang.String r6 = "homeViewLayout"
            r5.b(r6)
            com.taobao.tao.recommend3.tracelog.b r5 = com.taobao.tao.recommend3.tracelog.b.a()
            java.lang.String r6 = "homeRenderFinish"
            r5.d(r6)
            com.taobao.tao.recommend3.tracelog.b r5 = com.taobao.tao.recommend3.tracelog.b.a()
            java.lang.String r6 = "Home_Render"
            r5.f(r6)
        L6f:
            return
        L70:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.speed.SpeedFrameLayout.onLayout(boolean, int, int, int, int):void");
    }
}
