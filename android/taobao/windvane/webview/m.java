package android.taobao.windvane.webview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.taobao.windvane.view.AbstractNaviBar;
import android.taobao.windvane.view.WebErrorView;
import android.taobao.windvane.view.WebWaitingView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.sad;

/* loaded from: classes2.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private LinearLayout errorLayout;
    private Context mContext;
    private View mView;
    private View loadingView = null;
    private View errorView = null;
    private AbstractNaviBar naviBar = null;
    private TextView mWarningView = null;
    private boolean showLoading = false;
    private boolean cancelNoti = true;
    private AtomicBoolean isError = new AtomicBoolean(false);
    private boolean errorShow = false;

    public static /* synthetic */ TextView access$000(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f83b34ab", new Object[]{mVar}) : mVar.mWarningView;
    }

    public static /* synthetic */ TextView access$002(m mVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("b68cdc63", new Object[]{mVar, textView});
        }
        mVar.mWarningView = textView;
        return textView;
    }

    public static /* synthetic */ boolean access$100(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2eea365a", new Object[]{mVar})).booleanValue() : mVar.cancelNoti;
    }

    public static /* synthetic */ boolean access$102(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c79d9d44", new Object[]{mVar, new Boolean(z)})).booleanValue();
        }
        mVar.cancelNoti = z;
        return z;
    }

    static {
        kge.a(-545144996);
        TAG = m.class.getSimpleName();
    }

    public m(Context context, View view) {
        this.mContext = context;
        this.mView = view;
        this.errorLayout = new LinearLayout(context);
    }

    public void enableShowLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6e083", new Object[]{this});
        } else {
            this.showLoading = true;
        }
    }

    public void disableShowLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3070cc7e", new Object[]{this});
        } else {
            this.showLoading = false;
        }
    }

    public boolean isShowLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a258d600", new Object[]{this})).booleanValue() : this.showLoading;
    }

    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            android.taobao.windvane.util.m.e(TAG, "context can not be application");
            return;
        }
        if (this.loadingView == null) {
            this.loadingView = new WebWaitingView(context);
            setLoadingView(this.loadingView);
        }
        this.loadingView.bringToFront();
        if (this.loadingView.getVisibility() == 0) {
            return;
        }
        this.loadingView.setVisibility(0);
    }

    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        View view = this.loadingView;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.loadingView.setVisibility(8);
    }

    public void setLoadingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198d1dcc", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.loadingView = view;
            this.loadingView.setVisibility(8);
            ViewParent parent = this.loadingView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.loadingView);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(14, 1);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 == null) {
                return;
            }
            try {
                ((ViewGroup) parent2).addView(this.loadingView, layoutParams);
            } catch (Exception unused) {
                ViewParent parent3 = parent2.getParent();
                if (parent3 == null) {
                    return;
                }
                ((ViewGroup) parent3).addView(this.loadingView, layoutParams);
            }
        }
    }

    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            android.taobao.windvane.util.m.e(TAG, "context can not be application");
            return;
        }
        if (this.errorView == null) {
            this.errorView = new WebErrorView(context);
            setErrorView(this.errorView);
        }
        this.errorLayout.bringToFront();
        if (this.errorLayout.getVisibility() == 0) {
            return;
        }
        this.errorLayout.setVisibility(0);
        this.errorShow = true;
    }

    public void hideErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.errorLayout;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return;
        }
        this.errorLayout.setVisibility(8);
        this.errorShow = false;
    }

    public boolean isErrorShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37cb9e26", new Object[]{this})).booleanValue() : this.errorShow;
    }

    public void setErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36812600", new Object[]{this, view});
        } else if (view == null || !this.isError.compareAndSet(false, true)) {
        } else {
            this.errorView = view;
            this.errorLayout.setVisibility(8);
            ViewParent parent = this.errorView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.errorView);
            }
            ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(14, 1);
            }
            this.errorLayout.addView(this.errorView, layoutParams);
            this.errorLayout.setBackgroundColor(-1);
            this.errorLayout.setAlpha(1.0f);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 == null) {
                return;
            }
            try {
                if (this.errorLayout.getParent() == null) {
                    ((ViewGroup) parent2).addView(this.errorLayout, layoutParams);
                }
                this.isError.set(false);
            } catch (Exception unused) {
                ViewParent parent3 = parent2.getParent();
                if (parent3 != null && this.errorLayout.getParent() == null) {
                    ((ViewGroup) parent3).addView(this.errorLayout, layoutParams);
                }
                this.isError.set(false);
            }
        }
    }

    public View getErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6c59be0", new Object[]{this});
        }
        if (!(android.taobao.windvane.util.n.a(this.mContext) instanceof Activity)) {
            throw new RuntimeException("context can not be application");
        }
        if (this.errorView == null) {
            setErrorView(new WebErrorView(this.mContext));
        }
        return this.errorView;
    }

    public void setNaviBar(AbstractNaviBar abstractNaviBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b01595c", new Object[]{this, abstractNaviBar});
            return;
        }
        AbstractNaviBar abstractNaviBar2 = this.naviBar;
        if (abstractNaviBar2 != null) {
            abstractNaviBar2.setVisibility(8);
            this.naviBar = null;
        }
        if (abstractNaviBar == null) {
            return;
        }
        this.naviBar = abstractNaviBar;
    }

    public void resetNaviBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fe07c5", new Object[]{this});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar == null) {
            return;
        }
        abstractNaviBar.resetState();
    }

    public void hideNaviBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8905e1f2", new Object[]{this});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar == null || abstractNaviBar.getVisibility() == 8) {
            return;
        }
        this.naviBar.setVisibility(8);
    }

    public void switchNaviBar(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be04e43", new Object[]{this, new Integer(i)});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar == null || i != 1) {
            return;
        }
        abstractNaviBar.startLoading();
    }

    private void setNotiView(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f87811", new Object[]{this, drawable, str, new Integer(i)});
        } else if (!(android.taobao.windvane.util.n.a(this.mContext) instanceof Activity)) {
            throw new RuntimeException("context can not be application");
        } else {
            this.mWarningView = new TextView(this.mContext);
            this.mWarningView.setTextColor(Color.parseColor("#666666"));
            this.mWarningView.setBackgroundColor(Color.parseColor("#ffe7b3"));
            this.mWarningView.setText(str);
            this.mWarningView.setTextAlignment(4);
            this.mWarningView.setGravity(16);
            ViewParent parent = this.mWarningView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.mWarningView);
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.mWarningView.setCompoundDrawables(drawable, null, null, null);
                int i2 = i / 10;
                this.mWarningView.setCompoundDrawablePadding(i2);
                this.mWarningView.setPadding(i2, 0, 0, 0);
            }
            try {
                this.mWarningView.setElevation(2.0f);
            } catch (Throwable unused) {
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 == null) {
                return;
            }
            try {
                ((ViewGroup) parent2).addView(this.mWarningView, layoutParams);
            } catch (Exception unused2) {
                ViewParent parent3 = parent2.getParent();
                if (parent3 == null) {
                    return;
                }
                ((ViewGroup) parent3).addView(this.mWarningView, layoutParams);
            }
        }
    }

    public void showNotiView(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106f6796", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        TextView textView = this.mWarningView;
        if (textView == null || (str != null && !str.equals(textView.getText()))) {
            setNotiView(drawable, str, i);
        }
        this.mWarningView.bringToFront();
        this.mWarningView.setTranslationY(0.0f);
        float f = -i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWarningView, "translationY", f, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(1000L);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mWarningView, "translationY", 0.0f, f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).after(sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: android.taobao.windvane.webview.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (m.access$000(m.this) == null) {
                } else {
                    ViewParent parent = m.access$000(m.this).getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(m.access$000(m.this));
                    }
                    m.access$002(m.this, null);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (m.access$000(m.this) == null) {
                } else {
                    ViewParent parent = m.access$000(m.this).getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(m.access$000(m.this));
                    }
                    m.access$002(m.this, null);
                }
            }
        });
        animatorSet.start();
        this.mWarningView.setOnClickListener(new View.OnClickListener() { // from class: android.taobao.windvane.webview.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!m.access$100(m.this)) {
                } else {
                    animatorSet.cancel();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(ofFloat2);
                    animatorSet2.start();
                    m.access$102(m.this, false);
                }
            }
        });
    }
}
