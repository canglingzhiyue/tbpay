package tb;

import android.app.Activity;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.android.mediapick.c;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class gyp extends c<VideoMedia> implements hcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f28560a;
    public TextView b;
    public View c;
    public AppCompatCheckedTextView d;
    public hhb<VideoMedia, hcp> e = new hhb<>();
    public hhe f = new hhe();

    static {
        kge.a(-1546956396);
        kge.a(-345030430);
    }

    @Override // com.taobao.android.mediapick.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.mediapick.c
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.mediapick.c
    public View a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d922471a", new Object[]{this, activity, view});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f28560a = new SqTUrlImageView(activity);
        this.f28560a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f28560a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f28560a.setFadeIn(true);
        this.b = new TextView(activity);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, f.a(23.0f), 80));
        this.b.setBackgroundResource(R.drawable.dw_lc_mediapick_video_duration_bg);
        this.b.setGravity(8388629);
        this.b.setPadding(0, 0, f.a(6.0f), 0);
        this.b.setMaxLines(1);
        this.b.setTextColor(-1);
        this.b.setTextSize(1, 12.0f);
        this.c = new View(activity);
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c.setBackgroundResource(R.drawable.dw_lc_mediapick_cellview_disable);
        int a2 = f.a(6.0f);
        int a3 = f.a(6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f.a(23.0f), f.a(23.0f), 8388661);
        layoutParams.setMargins(a2, a2, a2, a2);
        this.d = new AppCompatCheckedTextView(activity);
        this.d.setLayoutParams(layoutParams);
        this.d.setBackgroundResource(R.drawable.dw_lc_mediapick_select_cb);
        this.d.setGravity(17);
        this.d.setMaxLines(1);
        this.d.setPadding(a3, 0, a3, 0);
        this.d.setTextColor(-1);
        this.d.setTextSize(1, 13.0f);
        this.d.setVisibility(0);
        this.d.setTextAlignment(4);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(f.a(60.0f), f.a(60.0f), 8388661));
        frameLayout2.addView(this.d);
        frameLayout.addView(this.f28560a);
        frameLayout.addView(this.b);
        frameLayout.addView(this.c);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // com.taobao.android.mediapick.c
    public void a(VideoMedia videoMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866aa0c", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        this.e.a((hhb<VideoMedia, hcp>) videoMedia, (VideoMedia) this);
        this.f.a(videoMedia, this.b);
        if (z) {
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            AppCompatCheckedTextView appCompatCheckedTextView = this.d;
            appCompatCheckedTextView.setBackgroundDrawable(appCompatCheckedTextView.getResources().getDrawable(R.drawable.common_item_confirm_icon));
        } else {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setBackgroundDrawable(null);
        }
        this.d.setChecked(z);
    }

    @Override // tb.hcp
    public ImageView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3b72af66", new Object[]{this}) : this.f28560a;
    }
}
