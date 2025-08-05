package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.b;

/* loaded from: classes5.dex */
public final class iys implements iyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final FluidContext f29412a;
    private SeekBarScrollInterceptView b;

    static {
        kge.a(-658291992);
        kge.a(73680757);
    }

    public static /* synthetic */ void lambda$ZKakgJ6TkreJL9SfpJKIrpKE0ms(iys iysVar, View view) {
        iysVar.a(view);
    }

    public iys(FluidContext fluidContext) {
        this.f29412a = fluidContext;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("SeekBarScrollInterceptManager", "初始化SeekBarScrollInterceptView");
        if (!d()) {
            return;
        }
        this.b = new SeekBarScrollInterceptView(this.f29412a.getContext());
        this.b.init();
    }

    public void b() {
        final ViewGroup g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("SeekBarScrollInterceptManager", "添加SeekBarScrollInterceptView到视图树上");
        if (!d() || (g = obu.g()) == null) {
            return;
        }
        g.post(new Runnable() { // from class: tb.-$$Lambda$iys$ZKakgJ6TkreJL9SfpJKIrpKE0ms
            @Override // java.lang.Runnable
            public final void run() {
                iys.lambda$ZKakgJ6TkreJL9SfpJKIrpKE0ms(iys.this, g);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.b == null || !(view.getParent() instanceof FrameLayout)) {
        } else {
            if (this.b.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            int a2 = b.a(this.f29412a.getContext(), f());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), a2);
            layoutParams.topMargin = view.getTop();
            layoutParams.leftMargin = view.getLeft();
            spz.c("SeekBarScrollInterceptManager", "添加SeekBarScrollInterceptView到视图树上，height=" + a2 + "，topMargin=" + layoutParams.topMargin + "，leftMargin=" + layoutParams.leftMargin);
            ((FrameLayout) view.getParent()).addView(this.b, layoutParams);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c("SeekBarScrollInterceptManager", "从视图树上移除SeekBarScrollInterceptView");
        if (!d()) {
            return;
        }
        SeekBarScrollInterceptView seekBarScrollInterceptView = this.b;
        if (seekBarScrollInterceptView != null && (seekBarScrollInterceptView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
        ViewGroup g = obu.g();
        if (g == null || !(g.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) g.getParent();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SeekBarScrollInterceptView) {
                viewGroup.removeView(childAt);
            }
        }
    }

    @Override // tb.iyr
    public SeekBarScrollInterceptView getScrollInterceptView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SeekBarScrollInterceptView) ipChange.ipc$dispatch("fbca515b", new Object[]{this}) : this.b;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : e() && spj.l(this.f29412a) && sjt.u();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDragSeekBarOnTabBar", false);
    }

    private int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("seekBarDraggableHeightOnTabBar", 20);
    }
}
