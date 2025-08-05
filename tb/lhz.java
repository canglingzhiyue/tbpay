package tb;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lhz extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30643a;

    static {
        kge.a(1931309639);
    }

    public lhz(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013e5a", new Object[]{this, view, state, action});
            return;
        }
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, -1);
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, -1);
        int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
        if (calculateTimeForDeceleration <= 0) {
            return;
        }
        action.update(-calculateDxToMakeVisible, (-calculateDyToMakeVisible) - this.f30643a, calculateTimeForDeceleration, this.mDecelerateInterpolator);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f30643a = i;
        }
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : ldj.a("scroll_speed", 50) / displayMetrics.densityDpi;
    }
}
