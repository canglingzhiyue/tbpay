package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.b;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class sjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f33633a;
    private final FluidContext b;
    private final Context c;
    private FrameLayout d;

    static {
        kge.a(-281054115);
    }

    public sjo(FluidContext fluidContext, ViewGroup viewGroup) {
        this.b = fluidContext;
        this.c = viewGroup.getContext();
        this.f33633a = viewGroup;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new FrameLayout(this.c);
            this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f33633a.addView(this.d);
            if (sjt.u()) {
                View view = new View(this.c);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, ohd.a(this.c, 220), 80));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{0, Color.argb(76, 14, 17, 25)});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                this.d.addView(view);
            }
            LinearLayout linearLayout = new LinearLayout(this.c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            if (sjt.u()) {
                layoutParams.bottomMargin = ((IContainerService) this.b.getService(IContainerService.class)).getActionBarHeight() + ohd.a(this.c, 52);
            } else if (((IContainerService) this.b.getService(IContainerService.class)).isHighActionbar() || spj.d(this.b)) {
                layoutParams.bottomMargin = b.a(this.c, 30.0f);
            } else {
                layoutParams.bottomMargin = b.a(this.c, 6.0f);
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(17);
            this.d.addView(linearLayout);
            TextView textView = new TextView(this.c);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setText("2x 快进中");
            textView.setTextColor(Color.parseColor("#ffffff"));
            textView.setTextSize(0, ohd.a(this.c, 26));
            textView.setShadowLayer(ohd.a(this.c, 4), 0.0f, ohd.a(this.c, 2), Color.parseColor("#59000000"));
            linearLayout.addView(textView);
            TUrlImageView tUrlImageView = new TUrlImageView(this.c);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ohd.a(this.c, 22), ohd.a(this.c, 13));
            layoutParams2.leftMargin = ohd.a(this.c, 10);
            tUrlImageView.setLayoutParams(layoutParams2);
            tUrlImageView.setSkipAutoSize(true);
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01v0FRTI1CyHudGP16o_!!6000000000149-54-tps-45-27.apng");
            linearLayout.addView(tUrlImageView);
        }
        this.d.setVisibility(0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }
}
