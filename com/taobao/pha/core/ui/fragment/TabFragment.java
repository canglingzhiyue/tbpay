package com.taobao.pha.core.ui.fragment;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
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
public class TabFragment extends PHABaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private ValueAnimator mAnimator;
    private AppController mAppController;
    private TabBar.a mOnTabChangeListener;
    public FrameLayout mPageFragmentContainer;
    private View mRootView;
    private int mTabBarHeight;
    private TabBar mTabBarView;

    public static /* synthetic */ Object ipc$super(TabFragment tabFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        } else {
            if (hashCode != 462397159) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDestroyView();
            return null;
        }
    }

    public static /* synthetic */ TabBar access$000(TabFragment tabFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("ec7ba07", new Object[]{tabFragment}) : tabFragment.mTabBarView;
    }

    public static /* synthetic */ void access$100(TabFragment tabFragment, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc05e50", new Object[]{tabFragment, view, new Integer(i)});
        } else {
            tabFragment.setUIHeight(view, i);
        }
    }

    static {
        kge.a(2064679658);
        TAG = TabFragment.class.getSimpleName();
    }

    public void setOnTabChangeListener(TabBar.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d2e4fb", new Object[]{this, aVar});
        } else {
            this.mOnTabChangeListener = aVar;
        }
    }

    public TabBar getTabBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("d6bc5bc2", new Object[]{this}) : this.mTabBarView;
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
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.TabFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (TabFragment.access$000(TabFragment.this) == null) {
                    } else {
                        TabFragment.access$000(TabFragment.this).setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                }
            });
            this.mAnimator.setDuration(i2);
            this.mAnimator.start();
        } else if (i == 2) {
            this.mTabBarView.setVisibility(0);
            this.mTabBarView.setAlpha(1.0f);
            this.mAnimator = ValueAnimator.ofInt(this.mTabBarView.getHeight(), this.mTabBarHeight);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.TabFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (TabFragment.access$000(TabFragment.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        TabFragment tabFragment = TabFragment.this;
                        TabFragment.access$100(tabFragment, TabFragment.access$000(tabFragment), intValue);
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
                    this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.TabFragment.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                            } else if (TabFragment.access$000(TabFragment.this) == null) {
                            } else {
                                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                TabFragment tabFragment = TabFragment.this;
                                TabFragment.access$100(tabFragment, TabFragment.access$000(tabFragment), intValue);
                                if (intValue != 0) {
                                    return;
                                }
                                TabFragment.access$000(TabFragment.this).setAlpha(0.0f);
                                TabFragment.access$000(TabFragment.this).setVisibility(8);
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
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.ui.fragment.TabFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (TabFragment.access$000(TabFragment.this) == null) {
                    } else {
                        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        TabFragment.access$000(TabFragment.this).setAlpha(floatValue);
                        if (floatValue != 0.0f) {
                            return;
                        }
                        TabFragment.access$000(TabFragment.this).setVisibility(8);
                        TabFragment tabFragment = TabFragment.this;
                        TabFragment.access$100(tabFragment, TabFragment.access$000(tabFragment), 0);
                    }
                }
            });
            this.mAnimator.setDuration(i2);
            this.mAnimator.start();
        }
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
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

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Context context = getContext();
        Bundle arguments = getArguments();
        if (context == null || arguments == null) {
            ngr.b(TAG, "TabFragment onCreateView failed.");
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        View view = this.mRootView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.endViewTransition(this.mRootView);
                viewGroup2.removeAllViews();
            }
            return this.mRootView;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mAppController = AppController.b(arguments.getLong("AppControllerInstanceId"));
        AppController appController = this.mAppController;
        if (appController == null) {
            ngr.b(TAG, "appController is null");
            return frameLayout;
        }
        ManifestModel u = appController.u();
        if (u == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        boolean shouldShowTabBar = shouldShowTabBar(u.tabBar);
        FrameLayout frameLayout2 = null;
        if (shouldShowTabBar) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.mTabBarView = new TabBar(context);
            this.mTabBarView.setAppController(this.mAppController);
            this.mTabBarView.init(u);
            this.mTabBarView.setSelected(u.tabBar.selectedIndex);
            this.mTabBarView.setId(R.id.pha_tab_bar_view);
            this.mTabBarView.setOnTabChangeListener(this.mOnTabChangeListener);
            this.mTabBarHeight = u.tabBar.height > 0 ? ngn.a(context, u.tabBar.height) : ngn.c(49);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mTabBarHeight);
            layoutParams.gravity = 80;
            if (this.mTabBarView.getTabPageView() == null && this.mAppController != null) {
                this.mAppController.P().a((String) null, new a(PHAErrorType.REFERENCE_ERROR, "tab bar page view is null"));
            }
            frameLayout3.setId(R.id.pha_tab_bar_container);
            frameLayout3.addView(this.mTabBarView, layoutParams);
            frameLayout2 = frameLayout3;
        }
        this.mPageFragmentContainer = new FrameLayout(context);
        this.mPageFragmentContainer.setId(R.id.pha_page_container);
        if (!StringUtils.isEmpty(u.backgroundColor)) {
            frameLayout.setBackgroundColor(ngn.f(u.backgroundColor));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        TabBar tabBar = this.mTabBarView;
        if (tabBar != null && tabBar.mPosition == 1) {
            layoutParams2.setMargins(0, 0, 0, this.mTabBarHeight);
        }
        frameLayout.addView(this.mPageFragmentContainer, layoutParams2);
        if (shouldShowTabBar) {
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        this.mRootView = frameLayout;
        return frameLayout;
    }

    private boolean shouldShowTabBar(TabBarModel tabBarModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c667e82", new Object[]{this, tabBarModel})).booleanValue() : (tabBarModel == null || tabBarModel.items == null || tabBarModel.items.size() < 2) ? false : true;
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
}
