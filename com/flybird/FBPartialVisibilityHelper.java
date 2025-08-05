package com.flybird;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.WeakHashMap;
import tb.cun;

/* loaded from: classes4.dex */
public class FBPartialVisibilityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FBDocument f7167a;
    public final int b;
    public WeakHashMap<FBView, NodeVisibility> c;
    public long d = 0;

    /* loaded from: classes4.dex */
    public final class CalculateVisibilityChangeRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f7169a;

        public CalculateVisibilityChangeRunnable(long j) {
            this.f7169a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            FBPartialVisibilityHelper fBPartialVisibilityHelper = FBPartialVisibilityHelper.this;
            long j = fBPartialVisibilityHelper.d;
            if (j > this.f7169a) {
                this.f7169a = elapsedRealtime;
                fBPartialVisibilityHelper.f7167a.b0.postDelayed(this, (int) ((elapsedRealtime - j) + 100));
                return;
            }
            fBPartialVisibilityHelper.d = 0L;
            synchronized (fBPartialVisibilityHelper) {
                WeakHashMap<FBView, NodeVisibility> weakHashMap = fBPartialVisibilityHelper.c;
                if (weakHashMap == null) {
                    return;
                }
                try {
                    for (Map.Entry<FBView, NodeVisibility> entry : weakHashMap.entrySet()) {
                        fBPartialVisibilityHelper.a(entry.getKey(), entry.getValue());
                    }
                } catch (ConcurrentModificationException e) {
                    cun.a("concurrent modification while calculate visibility change", e);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum NodeVisibility {
        TOTAL_VISIBLE,
        TOTAL_INVISIBLE,
        PARTIAL_VISIBLE
    }

    public FBPartialVisibilityHelper(FBDocument fBDocument) {
        this.f7167a = fBDocument;
        this.b = fBDocument.mRoot.getInnerViewTag();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.d;
        if (j == 0) {
            this.d = elapsedRealtime;
            this.f7167a.b0.postDelayed(new CalculateVisibilityChangeRunnable(elapsedRealtime), 100);
        } else if (j >= elapsedRealtime) {
        } else {
            this.d = elapsedRealtime;
        }
    }

    public final void a(FBView fBView) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3d84c5", new Object[]{this, fBView});
            return;
        }
        View innerView = fBView.getInnerView();
        while (innerView != null) {
            ViewParent parent = innerView.getParent();
            if ((parent instanceof FBRootFrameLayout) || !(parent instanceof View)) {
                break;
            }
            if ((parent instanceof ScrollView) || (parent instanceof HorizontalScrollView)) {
                Object tag = ((View) parent).getTag(this.b);
                if ((tag instanceof FBView) && ((FBView) tag).mScrollVisibleDetectEnabled) {
                    break;
                }
            }
            innerView = (View) parent;
        }
        z = false;
        if (!z) {
            return;
        }
        synchronized (this) {
            WeakHashMap<FBView, NodeVisibility> weakHashMap = this.c;
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.c = weakHashMap;
            }
            weakHashMap.put(fBView, NodeVisibility.TOTAL_INVISIBLE);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.flybird.FBView r10, com.flybird.FBPartialVisibilityHelper.NodeVisibility r11) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBPartialVisibilityHelper.a(com.flybird.FBView, com.flybird.FBPartialVisibilityHelper$NodeVisibility):void");
    }
}
