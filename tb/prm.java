package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class prm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1409411650);
    }

    public static void a(RecyclerView recyclerView, int i, LinearSmoothScroller linearSmoothScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac521b2", new Object[]{recyclerView, new Integer(i), linearSmoothScroller});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        linearSmoothScroller.setTargetPosition(i);
        ((LinearLayoutManager) layoutManager).startSmoothScroll(linearSmoothScroller);
    }

    /* loaded from: classes8.dex */
    public static class a extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1213088567);
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : 500.0f / displayMetrics.densityDpi;
        }
    }
}
