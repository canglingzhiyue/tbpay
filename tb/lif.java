package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f30649a;

    static {
        kge.a(-1498577157);
    }

    public lif(RecyclerView recyclerView) {
        this.f30649a = recyclerView;
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view != null) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.addView(view);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            view = frameLayout;
        }
        b(view);
        return view;
    }

    private void b(View view) {
        RecyclerView.LayoutParams generateDefaultLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                generateDefaultLayoutParams = this.f30649a.getLayoutManager().generateLayoutParams(layoutParams);
            } else {
                generateDefaultLayoutParams = this.f30649a.getLayoutManager().generateDefaultLayoutParams();
            }
            view.setLayoutParams(generateDefaultLayoutParams);
        }
    }
}
