package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import com.taobao.taobao.R;
import tb.fjl;
import tb.kge;

/* loaded from: classes5.dex */
public class NDFeedsPullEndLayout extends PullLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1276653786);
    }

    public NDFeedsPullEndLayout(Context context, PullBase.Mode mode, int i) {
        super(context, mode, i, null);
    }

    @Override // com.taobao.ptr.PullLayout
    public void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, fjl.a(context, 10.0f), 0, fjl.a(context, 10.0f));
        linearLayout.setId(R.id.new_detail_feeds_pull_end_ll);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.new_detail_feeds_pull_end_icon);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(fjl.a(context, 20.0f), fjl.a(context, 20.0f)));
        imageView.setPadding(fjl.a(context, 10.0f), 0, 0, 0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.detail_feeds_pull_end_icon);
        TextView textView = new TextView(context);
        textView.setId(R.id.new_detail_feeds_pull_end_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setPadding(fjl.a(context, 6.0f), 0, fjl.a(context, 10.0f), 0);
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.0f);
        textView.setText("释放加载更多");
        textView.setTextColor(Color.parseColor("#3d4245"));
        textView.setTextSize(1, 12.0f);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        addView(linearLayout);
    }
}
