package com.flybird.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.alipay.birdnest.api.FBOverView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class APDefaultPullRefreshOverView extends FBOverView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f7235a;
    public View b;
    public ProgressBar c;
    public ImageView d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public Animation h;
    public Animation i;
    public Animation.AnimationListener j;

    public APDefaultPullRefreshOverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(APDefaultPullRefreshOverView aPDefaultPullRefreshOverView, String str, Object... objArr) {
        if (str.hashCode() == -436676516) {
            super.onFinishInflate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1cb915", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.framework_pullrefresh_overview, i, R.style.framework_pullrefresh_overview);
        this.e = obtainStyledAttributes.getDrawable(R.styleable.framework_pullrefresh_overview_framework_pullrefresh_indicator_upDrawable);
        this.f = obtainStyledAttributes.getDrawable(R.styleable.framework_pullrefresh_overview_framework_pullrefresh_indicator_downDrawable);
        this.g = obtainStyledAttributes.getDrawable(R.styleable.framework_pullrefresh_overview_framework_pullrefresh_progressDrawable);
        obtainStyledAttributes.recycle();
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public View getLoadingShadowView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9473a054", new Object[]{this}) : findViewById(R.id.framework_pullrefresh_shadow_loading);
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public View getNormalShadowView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("da5a472b", new Object[]{this}) : findViewById(R.id.framework_pullrefresh_shadow_normal);
    }

    public View getNormalView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("22825bab", new Object[]{this}) : this.f7235a;
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public int getOverViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42655e90", new Object[]{this})).intValue();
        }
        View findViewById = findViewById(R.id.framework_pullrefresh_loading);
        int measuredHeight = findViewById.getMeasuredHeight();
        if (measuredHeight > 0) {
            return measuredHeight;
        }
        findViewById.measure(0, 0);
        return findViewById.getMeasuredHeight();
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.j = new Animation.AnimationListener() { // from class: com.flybird.view.APDefaultPullRefreshOverView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                APDefaultPullRefreshOverView aPDefaultPullRefreshOverView = APDefaultPullRefreshOverView.this;
                if (animation == aPDefaultPullRefreshOverView.i) {
                    Drawable drawable = aPDefaultPullRefreshOverView.e;
                    if (drawable == null) {
                        return;
                    }
                    aPDefaultPullRefreshOverView.d.setImageDrawable(drawable);
                    return;
                }
                Drawable drawable2 = aPDefaultPullRefreshOverView.f;
                if (drawable2 == null) {
                    return;
                }
                aPDefaultPullRefreshOverView.d.setImageDrawable(drawable2);
                APDefaultPullRefreshOverView.this.f.setLevel(10000);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        };
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.h = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.h.setDuration(250L);
        this.h.setAnimationListener(this.j);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        this.i = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.i.setDuration(250L);
        this.i.setAnimationListener(this.j);
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        this.f7235a.setVisibility(0);
        this.b.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        ProgressBar progressBar;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        if (getId() != -1) {
            this.f7235a = findViewById(R.id.framework_pullrefresh_normal);
            this.b = findViewById(R.id.framework_pullrefresh_loading);
            this.c = (ProgressBar) findViewById(R.id.framework_pullrefresh_progress);
            this.d = (ImageView) findViewById(R.id.framework_pullrefresh_indicator);
            if (this.e == null) {
                this.e = getResources().getDrawable(R.drawable.framework_pull_arrow_up);
            }
            if (this.f == null) {
                this.f = getResources().getDrawable(R.drawable.framework_pull_arrow_down);
            }
            Drawable drawable = this.e;
            if (drawable != null && (imageView = this.d) != null) {
                imageView.setImageDrawable(drawable);
            }
            Drawable drawable2 = this.g;
            if (drawable2 == null || (progressBar = this.c) == null) {
                return;
            }
            progressBar.setIndeterminateDrawable(drawable2);
            return;
        }
        throw new RuntimeException("must set id");
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public void onLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
            return;
        }
        this.f7235a.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
            return;
        }
        this.d.clearAnimation();
        this.d.startAnimation(this.h);
    }

    @Override // com.alipay.birdnest.api.FBOverView
    public void onOver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4915a5a", new Object[]{this});
            return;
        }
        this.d.clearAnimation();
        this.d.startAnimation(this.i);
    }

    public APDefaultPullRefreshOverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public APDefaultPullRefreshOverView(Context context) {
        super(context);
    }
}
