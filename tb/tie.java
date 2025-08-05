package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;

/* loaded from: classes8.dex */
public class tie implements tib {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OTHER_CHANNEL_VIEW_MARGIN_BOTTOM = 5;
    public static final int OTHER_CHANNEL_VIEW_MARGIN_TOP = 14;

    static {
        kge.a(-1596217797);
        kge.a(608989980);
    }

    @Override // tb.tib
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, a aVar, thv thvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bdb70103", new Object[]{this, viewGroup, new Integer(i), aVar, thvVar}) : a(viewGroup.getContext(), thvVar, aVar, i);
    }

    private RecyclerView.ViewHolder a(Context context, thv thvVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("6e04c1ba", new Object[]{this, context, thvVar, aVar, new Integer(i)});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.topMargin = f.a(context, 11.0f);
        layoutParams.bottomMargin = f.a(context, 5.0f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        if (i == 3) {
            b(linearLayout);
        } else {
            a(linearLayout);
        }
        return new tid(linearLayout, thvVar, aVar);
    }

    private void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
            return;
        }
        TextView a2 = a(linearLayout.getContext(), true);
        a2.setTag(b.TITLE_MAIN_TAG);
        linearLayout.addView(a2);
        TextView a3 = a(linearLayout.getContext(), false);
        a3.setTag(b.TITLE_SUB_TAG);
        linearLayout.addView(a3);
    }

    private void b(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2f199e", new Object[]{this, linearLayout});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(linearLayout.getContext());
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setTag(b.DEFAULT_TITLE_TAG);
        frameLayout.addView(textView);
        linearLayout.addView(frameLayout);
    }

    private TextView a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("690d66e8", new Object[]{this, context, new Boolean(z)});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(f.a(context, 8.0f));
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        if (z) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        return textView;
    }
}
