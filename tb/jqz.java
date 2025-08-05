package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class jqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1170979623);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        FscrmidFavorFrameLayout fscrmidFavorFrameLayout = new FscrmidFavorFrameLayout(context);
        fscrmidFavorFrameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        fscrmidFavorFrameLayout.addView(b(context));
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bottom_label_frame_short);
        viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        fscrmidFavorFrameLayout.addView(viewStub);
        fscrmidFavorFrameLayout.addView(d(context));
        return fscrmidFavorFrameLayout;
    }

    private View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.vg_content);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(c(context));
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bottom_label_frame_long);
        viewStub.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(viewStub);
        return linearLayout;
    }

    private View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb04e860", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.favor_frame);
        if (sjt.h()) {
            frameLayout.setBackgroundColor(Color.parseColor("#111111"));
        }
        frameLayout.setLayoutParams(b());
        VideoRoundCornerLayout videoRoundCornerLayout = new VideoRoundCornerLayout(context);
        videoRoundCornerLayout.setId(R.id.video_host);
        frameLayout.addView(videoRoundCornerLayout, a());
        View view = new View(context);
        view.setId(R.id.v_graymask_top);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, obx.a(context, 50.0f), 48));
        view.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
        frameLayout.addView(view);
        View view2 = new View(context);
        view2.setId(R.id.v_graymask_bottom);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, obx.a(context, 285.0f), 80));
        view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_bottom);
        frameLayout.addView(view2);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.imv_play_public_pause);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        imageView.setImageResource(R.drawable.fluid_sdk_video_play_public_pause);
        imageView.setVisibility(8);
        frameLayout.addView(imageView);
        return frameLayout;
    }

    private View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34cf8a3f", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.seek_bar_layout);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        relativeLayout.setGravity(15);
        RangeSeekBar rangeSeekBar = new RangeSeekBar(context);
        rangeSeekBar.setId(R.id.seek_bar);
        rangeSeekBar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int b = ohd.b(context, 9);
        int b2 = ohd.b(context, 20);
        rangeSeekBar.setPadding(b, b2, b, b2);
        rangeSeekBar.setBackgroundDrawable(null);
        relativeLayout.addView(rangeSeekBar);
        return relativeLayout;
    }

    public static View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e9a2c1e", new Object[]{context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.time_layout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, 0, 0, obx.a(context, 55.0f));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        TextView textView = new TextView(context);
        textView.setId(R.id.current_time);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int a2 = obx.a(context, 12.0f);
        layoutParams2.setMargins(0, 0, a2, 0);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(21);
        textView.setTextSize(1, 22.0f);
        textView.setTextColor(-1);
        textView.setText("00:00");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, a2, 0);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(16);
        textView2.setTextSize(1, 22.0f);
        textView2.setTextColor(-1711276033);
        textView2.setText("/");
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setId(R.id.total_time);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView3.setGravity(16);
        textView3.setTextSize(1, 22.0f);
        textView3.setTextColor(-1711276033);
        textView3.setText("00:00");
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textView3);
        return linearLayout;
    }

    public static FrameLayout.LayoutParams a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("1aeba7b1", new Object[0]);
        }
        if (sjt.h()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            return layoutParams;
        }
        return new FrameLayout.LayoutParams(-1, -2);
    }

    public static LinearLayout.LayoutParams b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout.LayoutParams) ipChange.ipc$dispatch("2bda4dc2", new Object[0]) : new LinearLayout.LayoutParams(-1, 0, 1.0f);
    }
}
