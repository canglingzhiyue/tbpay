package com.taobao.pha.core.ui.fragment;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.TabBarModel;
import com.taobao.pha.core.tabcontainer.TabBar;
import com.taobao.taobao.R;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class AppFragment extends PHABaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_FRAGMENT = "isFragment";
    private static final String TAG;
    public static final String TOP_MARGIN_FRAGMENT = "fragment_top_margin";
    private ValueAnimator mAnimator;
    private AppController mAppController;
    private TabBar.a mOnTabChangeListener;
    private FrameLayout mPageFragmentContainer;
    private ViewGroup mRootView;
    private FrameLayout mSubPageContainer;
    private int mTabBarHeight;
    private TabBar mTabBarView;
    private final int mStatusBarColor = Color.argb(48, 0, 0, 0);
    private int mBackgroundColor = -1;
    private int mTopMargin = 0;

    public static /* synthetic */ Object ipc$super(AppFragment appFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ TabBar access$000(AppFragment appFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("e7062bfb", new Object[]{appFragment}) : appFragment.mTabBarView;
    }

    public static /* synthetic */ void access$100(AppFragment appFragment, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ac5244", new Object[]{appFragment, view, new Integer(i)});
        } else {
            appFragment.setUIHeight(view, i);
        }
    }

    static {
        kge.a(-635244170);
        TAG = AppFragment.class.getSimpleName();
    }

    public void setOnTabChangeListener(TabBar.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d2e4fb", new Object[]{this, aVar});
            return;
        }
        this.mOnTabChangeListener = aVar;
        TabBar tabBar = this.mTabBarView;
        if (tabBar == null) {
            return;
        }
        tabBar.setOnTabChangeListener(this.mOnTabChangeListener);
    }

    public TabBar getTabBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("d6bc5bc2", new Object[]{this}) : this.mTabBarView;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        ManifestModel u;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Context context = getContext();
        if (context == null) {
            ngr.b(TAG, "AppFragment onCreateView failed.");
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        ViewGroup viewGroup2 = this.mRootView;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        this.mRootView = new FrameLayout(context);
        try {
            Bundle arguments = getArguments();
            z = arguments.getBoolean("isFragment", false);
            try {
                this.mTopMargin = arguments.getInt(TOP_MARGIN_FRAGMENT, 0);
                z2 = arguments.getBoolean("key_load_sub_page", false);
                this.mAppController = AppController.b(arguments.getLong("AppControllerInstanceId", -1L));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            z = false;
        }
        this.mRootView.setBackgroundColor(this.mBackgroundColor);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setId(R.id.tab_page_container);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (this.mTopMargin != 0) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.mTopMargin);
                linearLayout3.setBackgroundColor(this.mStatusBarColor);
                linearLayout.addView(linearLayout3, layoutParams2);
            }
            linearLayout.addView(linearLayout2, layoutParams);
            this.mRootView.addView(linearLayout, layoutParams);
        } else {
            this.mRootView.setId(R.id.tab_page_container);
        }
        AppController appController = this.mAppController;
        if (appController != null && (u = appController.u()) != null) {
            this.mAppController.b(u);
        }
        if (z2) {
            addSubPageContainer();
        }
        return this.mRootView;
    }

    public void loadTabBar(Context context, ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871bae87", new Object[]{this, context, manifestModel});
            return;
        }
        boolean shouldShowTabBar = shouldShowTabBar(manifestModel.tabBar);
        FrameLayout frameLayout = null;
        if (shouldShowTabBar) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.mTabBarView = new TabBar(context);
            this.mTabBarView.setAppController(this.mAppController);
            this.mTabBarView.init(manifestModel);
            this.mTabBarView.setSelected(manifestModel.tabBar.selectedIndex);
            this.mTabBarView.setId(R.id.pha_tab_bar_view);
            this.mTabBarView.setOnTabChangeListener(this.mOnTabChangeListener);
            this.mTabBarHeight = manifestModel.tabBar.height > 0 ? ngn.a(context, manifestModel.tabBar.height) : ngn.c(49);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mTabBarHeight);
            layoutParams.gravity = 80;
            if (this.mTabBarView.getTabPageView() == null && this.mAppController != null) {
                this.mAppController.P().a((String) null, new a(PHAErrorType.REFERENCE_ERROR, "tab bar page view is null"));
            }
            frameLayout2.setId(R.id.pha_tab_bar_container);
            frameLayout2.addView(this.mTabBarView, layoutParams);
            frameLayout = frameLayout2;
        }
        this.mPageFragmentContainer = new FrameLayout(context);
        this.mPageFragmentContainer.setId(R.id.pha_page_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        TabBar tabBar = this.mTabBarView;
        if (tabBar != null && tabBar.mPosition == 1) {
            layoutParams2.setMargins(0, 0, 0, this.mTabBarHeight);
        }
        this.mRootView.addView(this.mPageFragmentContainer, layoutParams2);
        if (!shouldShowTabBar) {
            return;
        }
        this.mRootView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyTabBar();
        this.mOnTabChangeListener = null;
    }

    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBackgroundColor = i;
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setBackgroundColor(i);
    }

    public void addSubPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e4321a", new Object[]{this});
        } else if (this.mSubPageContainer != null) {
        } else {
            Context context = getContext();
            if (context == null || this.mRootView == null) {
                ngr.b(TAG, "add subPage container failed.");
                return;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.pha_sub_page_container);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i = this.mTopMargin;
            if (i != 0) {
                layoutParams.topMargin = i;
            }
            this.mRootView.addView(frameLayout, layoutParams);
            this.mSubPageContainer = frameLayout;
            ngr.c(TAG, "add subPage container");
        }
    }

    public void removeSubPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a19e27d", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mSubPageContainer;
        if (frameLayout == null) {
            return;
        }
        this.mRootView.removeView(frameLayout);
        this.mSubPageContainer = null;
        ngr.c(TAG, "remove subPage container");
    }

    public boolean showTabWithAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f85d391", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String str = TAG;
        ngr.c(str, "showTabWithAnimation(" + i + ", " + i2 + ");");
        if (this.mTabBarView == null) {
            ngr.c(TAG, "tab bar is null");
            return false;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ngr.c(TAG, "animation is running");
            this.mAnimator.cancel();
        }
        if (this.mTabBarView.getVisibility() == 0 && this.mTabBarView.getHeight() == this.mTabBarHeight && Math.abs(this.mTabBarView.getAlpha() - 1.0f) < 1.0E-6d) {
            ngr.c(TAG, "tab bar has shown");
            return true;
        }
        if (i == 0) {
            this.mTabBarView.setVisibility(0);
            this.mTabBarView.setAlpha(1.0f);
            setUIHeight(this.mTabBarView, this.mTabBarHeight);
        } else if (i == 1) {
            this.mTabBarView.setVisibility(0);
            setUIHeight(this.mTabBarView, this.mTabBarHeight);
            this.mAnimator = ValueAnimator.ofFloat(this.mTabBarView.getAlpha(), 1.0f);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.AppFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (AppFragment.access$000(AppFragment.this) == null) {
                    } else {
                        AppFragment.access$000(AppFragment.this).setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                }
            });
            this.mAnimator.setDuration(i2);
            this.mAnimator.start();
        } else if (i == 2) {
            this.mTabBarView.setVisibility(0);
            this.mTabBarView.setAlpha(1.0f);
            this.mAnimator = ValueAnimator.ofInt(this.mTabBarView.getHeight(), this.mTabBarHeight);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.AppFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (AppFragment.access$000(AppFragment.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        AppFragment appFragment = AppFragment.this;
                        AppFragment.access$100(appFragment, AppFragment.access$000(appFragment), intValue);
                    }
                }
            });
            this.mAnimator.setDuration(i2);
            this.mAnimator.start();
        } else {
            ngr.b(TAG, "unexpected animation type.");
            return false;
        }
        return true;
    }

    public boolean hideTabWithAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d1a416", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String str = TAG;
        ngr.c(str, "hideTabWithAnimation(" + i + ", " + i2 + ");");
        if (this.mTabBarView == null) {
            ngr.c(TAG, "tab bar is null");
            return false;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ngr.c(TAG, "animation is running");
            this.mAnimator.cancel();
        }
        if (this.mTabBarView.getVisibility() == 8 || this.mTabBarView.getHeight() == 0 || Math.abs(this.mTabBarView.getAlpha()) < 1.0E-6d) {
            ngr.c(TAG, "tab bar has gone");
            return true;
        }
        if (i == 0) {
            this.mTabBarView.setVisibility(8);
            this.mTabBarView.setAlpha(0.0f);
            setUIHeight(this.mTabBarView, 0);
        } else if (i != 1) {
            if (i == 2) {
                if (this.mTabBarView.getHeight() != 0) {
                    this.mAnimator = ValueAnimator.ofInt(this.mTabBarView.getHeight(), 0);
                    this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.AppFragment.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                            } else if (AppFragment.access$000(AppFragment.this) == null) {
                            } else {
                                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                AppFragment appFragment = AppFragment.this;
                                AppFragment.access$100(appFragment, AppFragment.access$000(appFragment), intValue);
                                if (intValue != 0) {
                                    return;
                                }
                                AppFragment.access$000(AppFragment.this).setAlpha(0.0f);
                                AppFragment.access$000(AppFragment.this).setVisibility(8);
                            }
                        }
                    });
                    this.mAnimator.setDuration(i2);
                    this.mAnimator.start();
                }
            } else {
                ngr.b(TAG, "unexpected animation type.");
                return false;
            }
        } else if (this.mTabBarView.getAlpha() != 0.0f) {
            this.mAnimator = ValueAnimator.ofFloat(this.mTabBarView.getAlpha(), 0.0f);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.AppFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (AppFragment.access$000(AppFragment.this) == null) {
                    } else {
                        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        AppFragment.access$000(AppFragment.this).setAlpha(floatValue);
                        if (floatValue != 0.0f) {
                            return;
                        }
                        AppFragment.access$000(AppFragment.this).setVisibility(8);
                        AppFragment appFragment = AppFragment.this;
                        AppFragment.access$100(appFragment, AppFragment.access$000(appFragment), 0);
                    }
                }
            });
            this.mAnimator.setDuration(i2);
            this.mAnimator.start();
        }
        return true;
    }

    private void destroyTabBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce7215f", new Object[]{this});
            return;
        }
        TabBar tabBar = this.mTabBarView;
        if (tabBar != null) {
            tabBar.destory();
            this.mTabBarView = null;
        }
        this.mPageFragmentContainer = null;
    }

    private void setUIHeight(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7297abb5", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
                view.requestLayout();
            }
            TabBar tabBar = this.mTabBarView;
            if (tabBar == null || this.mPageFragmentContainer == null || tabBar.mPosition != 1) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.mPageFragmentContainer.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, i);
            this.mPageFragmentContainer.requestLayout();
        }
    }

    private boolean shouldShowTabBar(TabBarModel tabBarModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c667e82", new Object[]{this, tabBarModel})).booleanValue() : (tabBarModel == null || tabBarModel.items == null || tabBarModel.items.size() < 2) ? false : true;
    }
}
