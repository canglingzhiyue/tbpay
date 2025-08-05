package com.taobao.homepage.view.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.n;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.utils.DisplayUtil;
import com.taobao.uikit.extend.utils.NavigationBarUtils;
import tb.kge;

/* loaded from: classes7.dex */
public class HomeSwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeSwipeRefreshLayout";
    private Boolean mEnablePreRender;

    static {
        kge.a(370973766);
    }

    public static /* synthetic */ Object ipc$super(HomeSwipeRefreshLayout homeSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1376037801) {
            super.initContentHeight();
            return null;
        } else if (hashCode == -172423314) {
            super.initNavBarHeight();
            return null;
        } else if (hashCode != 2108156838) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.isChildScrollToTop());
        }
    }

    public HomeSwipeRefreshLayout(Context context) {
        super(context);
    }

    public HomeSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public void initNavBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b9076e", new Object[]{this});
        } else if (enablePreRender()) {
            if (this.mNavigationBarHeight != -1) {
                return;
            }
            this.mNavigationBarHeight = getNavigationBarHeightWithContext(getContext());
        } else {
            super.initNavBarHeight();
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public void initContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfb5457", new Object[]{this});
        } else if (enablePreRender()) {
            if (this.mContentHeight != -1) {
                return;
            }
            this.mContentHeight = getContentHeightWithContext(getContext());
        } else {
            super.initContentHeight();
        }
    }

    public void reCalculateHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288b8193", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            this.mNavigationBarHeight = NavigationBarUtils.getNavigationBarHeight(activity);
            this.mContentHeight = NavigationBarUtils.getContentHeight(activity);
        }
    }

    private static int getNavigationBarHeightWithContext(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fdf2ffb", new Object[]{context})).intValue();
        }
        if (context != null && context.getResources() != null && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private int getContentHeightWithContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97739515", new Object[]{this, context})).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        DisplayMetrics displayMetrics = null;
        if (Build.VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        if (displayMetrics != null) {
            if (enablePreRender()) {
                return displayMetrics.heightPixels;
            }
            return displayMetrics.heightPixels - getNavigationBarHeightWithContext(context);
        }
        return DisplayUtil.getScreenHeight(context);
    }

    public void setCurrentTargetOffsetTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186a7622", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentTargetOffsetTop = i;
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public boolean isChildScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
        }
        try {
            return super.isChildScrollToTop();
        } catch (Throwable th) {
            e.e(TAG, "TBSwipeRefreshLayout isChildScrollToTop error " + th);
            return false;
        }
    }

    private boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[]{this})).booleanValue();
        }
        if (this.mEnablePreRender == null) {
            this.mEnablePreRender = Boolean.valueOf(n.n().v());
        }
        return this.mEnablePreRender.booleanValue();
    }
}
