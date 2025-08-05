package tb;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class nvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(676580843);
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.iv_btn_background);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(a(52, context), a(52, context), 17));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.homepage_tab_tao_background);
        frameLayout.addView(imageView);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(40, context), a(40, context), 48);
        layoutParams.topMargin = a(8, context);
        layoutParams.leftMargin = a(6, context);
        frameLayout2.setLayoutParams(layoutParams);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.iv_image);
        imageView2.setContentDescription(b.a(R.string.taobao_app_1000_1_16132));
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(a(40, context), a(80, context)));
        imageView2.setImageResource(R.drawable.homepage_tab_tao_button);
        frameLayout2.addView(imageView2);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    private int a(int i, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7afdac80", new Object[]{this, new Integer(i), context})).intValue() : DensityUtil.dip2px(context, i);
    }
}
