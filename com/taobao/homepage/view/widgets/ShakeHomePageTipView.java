package com.taobao.homepage.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.phenix.request.d;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.Timer;
import java.util.TimerTask;
import tb.iwx;
import tb.kge;
import tb.lbo;
import tb.lbq;
import tb.ldf;
import tb.ljd;
import tb.mto;
import tb.ohv;
import tb.oiy;

/* loaded from: classes7.dex */
public class ShakeHomePageTipView extends FrameLayout implements iwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static lbo homePageManager;
    private int animHeight;
    private ValueAnimator bgAnim;
    private HImageView imageView;
    private TextView textView;
    private Timer timer;

    static {
        kge.a(74819912);
        kge.a(-1141057680);
    }

    public static /* synthetic */ Object ipc$super(ShakeHomePageTipView shakeHomePageTipView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode != 348684699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public void setColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703eebf2", new Object[]{this, str});
        }
    }

    public ShakeHomePageTipView(Context context) {
        super(context);
    }

    public ShakeHomePageTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeHomePageTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.homepage_shake_tip_view, (ViewGroup) this, true);
        bringToFront();
        this.imageView = (HImageView) findViewById(R.id.iv_icon_shake);
        this.imageView.setImageUrl(d.a(R.drawable.homepage_icon_shake_reg));
        ((HImageView) findViewById(R.id.iv_shakebar_bg)).setImageUrl(d.a(R.drawable.homepage_bg_shakebar));
        this.textView = (TextView) findViewById(R.id.tip_text_view);
        this.bgAnim = ObjectAnimator.ofFloat(this.textView, "alpha", 1.0f, 0.3f);
        this.bgAnim.setRepeatMode(2);
        this.bgAnim.setRepeatCount(-1);
        this.bgAnim.setDuration(1000L);
        this.animHeight = DensityUtil.dip2px(getContext(), 40.0f);
    }

    @Override // tb.iwx
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        setText(str, mto.a.GEO_NOT_SUPPORT, null);
        this.imageView.setVisibility(0);
    }

    @Override // tb.iwx
    public void setText(String str, double d, final iwx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1efc87", new Object[]{this, str, new Double(d), aVar});
            return;
        }
        this.imageView.setVisibility(8);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.textView.setText(str);
        if (d > mto.a.GEO_NOT_SUPPORT && aVar != null) {
            final Handler handler = new Handler();
            this.timer = new Timer("shakeHomePageTipViewTimer");
            this.timer.schedule(new TimerTask() { // from class: com.taobao.homepage.view.widgets.ShakeHomePageTipView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        handler.post(new Runnable() { // from class: com.taobao.homepage.view.widgets.ShakeHomePageTipView.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                aVar.a();
                                ShakeHomePageTipView.this.hide();
                            }
                        });
                    }
                }
            }, (int) (d * 1000.0d));
        }
        show();
        setBackgroundColor(0);
    }

    private void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (getVisibility() == 0) {
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            lbq b = oiy.a().b();
            if (b == null) {
                return;
            }
            ohv e = b.getHomePageManager().e();
            if (e == null) {
                ldf.d("ShakeHomePageTipView", "show shakeHomepageTipView failed，searchBar Not init.");
                return;
            }
            layoutParams.topMargin = e.i();
            setLayoutParams(layoutParams);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", -this.animHeight, 0.0f);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.homepage.view.widgets.ShakeHomePageTipView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    } else {
                        ShakeHomePageTipView.this.setVisibility(0);
                    }
                }
            });
            ofFloat.setDuration(500L);
            ofFloat.start();
            this.bgAnim.start();
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (getTranslationY() < 0.0f) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, -this.animHeight);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.homepage.view.widgets.ShakeHomePageTipView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        ShakeHomePageTipView.this.setVisibility(8);
                    }
                }
            });
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
    }

    @Override // tb.iwx
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ljd.a().b(new Runnable() { // from class: com.taobao.homepage.view.widgets.ShakeHomePageTipView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ShakeHomePageTipView.this.hide();
                }
            }
        });
        try {
            if (this.timer == null) {
                return;
            }
            this.timer.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (view != this || i == 0 || (valueAnimator = this.bgAnim) == null || !valueAnimator.isRunning()) {
            return;
        }
        this.bgAnim.cancel();
    }
}
