package tb;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.android.mediapick.c;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class gxk extends c<ImageMedia> implements hcp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float SCALE_WHEN_PICKED = 1.1f;
    private static final AccelerateDecelerateInterpolator f;

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f28555a;
    public ViewGroup b;
    public AppCompatCheckedTextView c;
    public View d;
    public hhb<ImageMedia, hcp> e = new hhb<>();
    private ImageMedia g;
    private boolean h;

    @Override // com.taobao.android.mediapick.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(86181492);
        kge.a(-345030430);
        f = new AccelerateDecelerateInterpolator();
    }

    @Override // com.taobao.android.mediapick.c
    public View a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d922471a", new Object[]{this, activity, view});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f28555a = new SqTUrlImageView(activity);
        this.f28555a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f28555a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f28555a.setFadeIn(true);
        this.d = new View(activity);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d.setBackgroundColor(Color.argb(128, 0, 0, 0));
        this.b = new FrameLayout(activity);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(f.a(60.0f), f.a(60.0f), 8388661));
        int a2 = f.a(6.0f);
        int a3 = f.a(6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f.a(23.0f), f.a(23.0f), 8388661);
        layoutParams.setMargins(a2, a2, a2, a2);
        this.c = new AppCompatCheckedTextView(activity);
        this.c.setLayoutParams(layoutParams);
        this.c.setBackgroundResource(R.drawable.dw_lc_mediapick_select_cb);
        this.c.setGravity(17);
        this.c.setMaxLines(1);
        this.c.setPadding(a3, 0, a3, 0);
        this.c.setTextColor(-1);
        this.c.setTextSize(1, 13.0f);
        this.c.setVisibility(0);
        this.c.setTextAlignment(4);
        this.b.addView(this.c);
        frameLayout.addView(this.f28555a);
        frameLayout.addView(this.d);
        frameLayout.addView(this.b);
        return frameLayout;
    }

    @Override // com.taobao.android.mediapick.c
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.mediapick.c
    public void a(ImageMedia imageMedia, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d205912c", new Object[]{this, imageMedia, new Boolean(z)});
            return;
        }
        this.e.a((hhb<ImageMedia, hcp>) imageMedia, (ImageMedia) this);
        this.c.setChecked(z);
        View view = this.d;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        int indexOf = this.l.d().indexOf(imageMedia);
        this.c.setText(indexOf != -1 ? String.valueOf(indexOf + 1) : "");
        float f2 = !z ? 1.0f : 1.1f;
        this.f28555a.setScaleX(f2);
        this.f28555a.setScaleY(f2);
        b(imageMedia, z);
    }

    public void b(ImageMedia imageMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4042ad", new Object[]{this, imageMedia, new Boolean(z)});
            return;
        }
        if (imageMedia == this.g && z != this.h) {
            a(z);
        }
        this.g = imageMedia;
        this.h = z;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            d();
        } else {
            e();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.3f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.3f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.1f);
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.1f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.c, ofFloat, ofFloat2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f28555a, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        ofPropertyValuesHolder.setDuration(500L);
        ofFloat5.setDuration(300L);
        ofPropertyValuesHolder2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofFloat5);
        animatorSet.setInterpolator(f);
        animatorSet.start();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleY", 1.1f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleX", 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f28555a, ofFloat2, ofFloat);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.d, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat3, ofPropertyValuesHolder, ofFloat4);
        animatorSet.setInterpolator(f);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // tb.hcp
    public ImageView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3b72af66", new Object[]{this}) : this.f28555a;
    }
}
