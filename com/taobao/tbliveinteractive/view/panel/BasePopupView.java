package com.taobao.tbliveinteractive.view.panel;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class BasePopupView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int TRANSLATE_DURATION = 250;
    public ViewGroup mContentView;
    public Context mContext;
    public boolean mIsInit;
    private a mOnDismissListener;
    public ViewGroup mViewGroup;
    public boolean mbPopFromRight;

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(-326671707);
    }

    public static /* synthetic */ Object ipc$super(BasePopupView basePopupView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean isLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d5a9c4f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract View onCreateContentView(ViewGroup viewGroup);

    public BasePopupView(Context context, ViewGroup viewGroup) {
        this(context, viewGroup, false);
    }

    public BasePopupView(Context context, ViewGroup viewGroup, boolean z) {
        super(context);
        this.mbPopFromRight = false;
        this.mIsInit = false;
        this.mContext = context;
        this.mbPopFromRight = z;
        this.mViewGroup = viewGroup;
        if (!isLazyLoad()) {
            this.mIsInit = true;
            init();
        }
    }

    public ViewGroup.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("24d7a7e0", new Object[]{this, view, displayMetrics});
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (this.mbPopFromRight) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 53;
            }
            layoutParams.width = displayMetrics.heightPixels;
            layoutParams.height = displayMetrics.heightPixels;
        } else {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 83;
            }
            layoutParams.width = displayMetrics.widthPixels;
        }
        return layoutParams;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mContentView = (ViewGroup) onCreateContentView(this.mViewGroup);
        if (this.mContentView == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        this.mContentView.setLayoutParams(onCreateLayoutParams(this.mContentView, displayMetrics));
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        setVisibility(0);
        if (!this.mIsInit) {
            this.mIsInit = true;
            init();
        }
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
        this.mContentView.startAnimation(createTranslationInAnimation());
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        setVisibility(4);
        if (this.mContentView == null) {
            return;
        }
        Animation createTranslationOutAnimation = createTranslationOutAnimation();
        createTranslationOutAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tbliveinteractive.view.panel.BasePopupView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

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

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    BasePopupView.this.mContentView.setVisibility(4);
                }
            }
        });
        this.mContentView.startAnimation(createTranslationOutAnimation);
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        setVisibility(8);
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void setOnDismissListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684b509b", new Object[]{this, aVar});
        } else {
            this.mOnDismissListener = aVar;
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.mContentView;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    private Animation createTranslationInAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private Animation createTranslationOutAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }
}
