package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class siy extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;
    private View d;

    static {
        kge.a(-2040055010);
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "VideoLayer";
    }

    public static /* synthetic */ sii a(siy siyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("a7df9f5e", new Object[]{siyVar}) : siyVar.c;
    }

    public siy(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.d;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(R.id.fluid_sdk_tag_is_preload_video, true);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (!this.c.X().c()) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: tb.siy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        siy.a(siy.this).X().a(view2.getPivotX(), view2.getPivotY());
                    }
                }
            });
        }
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18835af", new Object[]{this, view, layoutParams});
        } else if (view == null) {
        } else {
            spz.c("VideoLayer", "onCoverViewUpdate, view: " + view);
            layoutParams.gravity = 1;
            this.c.Z().c().addView(view, 0, layoutParams);
        }
    }

    public void b(final View view, final FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff47adb0", new Object[]{this, view, layoutParams});
        } else if (view == null) {
        } else {
            a(view, new Runnable() { // from class: tb.siy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    spz.c("VideoLayer", "videoLayer,update, view: " + view + " ,layoutParams width:" + layoutParams.width + " height:" + layoutParams.height);
                    layoutParams.gravity = 1;
                    siy.a(siy.this).Z().c().addView(view, 0, layoutParams);
                }
            });
        }
    }

    public void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f6f4e8", new Object[]{this, view, runnable});
            return;
        }
        boolean j = sjt.j();
        ViewGroup viewGroup = (ViewGroup) this.c.B().getParent();
        if (viewGroup instanceof LockableRecycerView) {
            z = ((LockableRecycerView) viewGroup).isDuringLayout();
        }
        spz.c("VideoLayer", "onVideoViewUpdated, view: " + view + " duringLayout:" + z);
        if (j && z) {
            oec.a(runnable);
            b.a(getClass().getSimpleName(), this.c.w());
            return;
        }
        runnable.run();
    }
}
