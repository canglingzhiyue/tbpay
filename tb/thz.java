package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class thz implements tib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1272113186);
        kge.a(608989980);
    }

    @Override // tb.tib
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, a aVar, thv thvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bdb70103", new Object[]{this, viewGroup, new Integer(i), aVar, thvVar}) : new tic(a(viewGroup.getContext(), i), thvVar, aVar);
    }

    private View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a97f025", new Object[]{this, context, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, f.a(context, 48.0f));
        layoutParams.topMargin = f.a(context, 2.0f);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(a(context));
        frameLayout.addView(b(context, i));
        return frameLayout;
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, f.a(context, 40.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = f.a(context, 4.0f);
        layoutParams.rightMargin = f.a(context, 4.0f);
        GradientDrawable gradientDrawable = (GradientDrawable) frameLayout.getBackground();
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setCornerRadius(f.a(context, 6.0f));
        frameLayout.setTag(b.ITEM_PARENT_TAG);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setTag(b.ITEM_TV_TAG);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        frameLayout.addView(textView);
        return frameLayout;
    }

    private View b(Context context, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a218a26", new Object[]{this, context, new Integer(i)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setTag(b.ITEM_IV_TAG);
        if (i == 2) {
            i2 = 8;
        }
        tUrlImageView.setVisibility(i2);
        int a2 = f.a(context, 18.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 8388661;
        tUrlImageView.setLayoutParams(layoutParams);
        return tUrlImageView;
    }
}
