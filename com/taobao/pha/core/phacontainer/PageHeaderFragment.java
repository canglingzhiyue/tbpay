package com.taobao.pha.core.phacontainer;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabHeaderModel;
import com.taobao.pha.core.phacontainer.c;
import com.taobao.pha.core.tabcontainer.PenetrateLinearLayout;
import java.util.List;
import tb.kge;
import tb.nfz;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class PageHeaderFragment extends AbstractPageFragment implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG;
    public static final String TAG_FRAGMENT = "tag_tab_header_fragment";
    private ValueAnimator animator;
    private TabHeaderModel mPageHeaderModel;
    private nfz mPageHeaderWebView;
    private ViewGroup mRootView;
    private int mPageHeaderHeight = 0;
    private int mPageIndex = -1;

    public static /* synthetic */ Object ipc$super(PageHeaderFragment pageHeaderFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageAppearListener(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368f0c51", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageDisappearListener(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705c621a", new Object[]{this, bVar});
        }
    }

    public static /* synthetic */ void access$000(PageHeaderFragment pageHeaderFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09da485", new Object[]{pageHeaderFragment, new Integer(i)});
        } else {
            pageHeaderFragment.setRenderViewHeight(i);
        }
    }

    static {
        kge.a(1454684268);
        kge.a(415810824);
        TAG = PageHeaderFragment.class.getSimpleName();
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment
    public void evaluateSourceCodeToPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103dd97c", new Object[]{this, str});
            return;
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.evaluateJavaScript(str);
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.a(configuration);
    }

    public int getPageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue() : this.mPageIndex;
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            this.mPageIndex = i;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void updatePageModel(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747200c", new Object[]{this, pageModel});
        } else if (!(pageModel instanceof TabHeaderModel)) {
        } else {
            this.mPageHeaderModel = (TabHeaderModel) pageModel;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    /* renamed from: getPageModel  reason: collision with other method in class */
    public TabHeaderModel mo1202getPageModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabHeaderModel) ipChange.ipc$dispatch("fabf0b6", new Object[]{this}) : this.mPageHeaderModel;
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public nfz getPageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("e6918913", new Object[]{this}) : this.mPageHeaderWebView;
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("key_tab_header_model")) {
                this.mPageHeaderModel = (TabHeaderModel) arguments.getSerializable("key_tab_header_model");
            }
            if (arguments.containsKey("key_tab_header_page_index")) {
                this.mPageIndex = arguments.getInt("key_tab_header_page_index");
            }
        }
        AppController appController = getAppController();
        TabHeaderModel tabHeaderModel = this.mPageHeaderModel;
        if (tabHeaderModel == null || appController == null) {
            return;
        }
        if (StringUtils.isEmpty(tabHeaderModel.html) && StringUtils.isEmpty(this.mPageHeaderModel.getUrl())) {
            return;
        }
        if (StringUtils.isEmpty(this.mPageHeaderModel.getUrl())) {
            TabHeaderModel tabHeaderModel2 = this.mPageHeaderModel;
            tabHeaderModel2.setUrl("https://pha_pageheader_" + this.mPageIndex);
        }
        if (this.mPageHeaderModel.firstPage) {
            appController.P().c(19);
        }
        this.mPageHeaderWebView = ngn.a(appController, this.mPageHeaderModel);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.o();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.n();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ViewGroup viewGroup2 = this.mRootView;
        if (viewGroup2 != null) {
            ViewParent parent = viewGroup2.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup3 = (ViewGroup) parent;
                viewGroup3.endViewTransition(this.mRootView);
                viewGroup3.removeAllViews();
            }
            return this.mRootView;
        }
        if (this.mPageHeaderModel.penetrate) {
            this.mRootView = new PenetrateLinearLayout(getContext());
        } else {
            this.mRootView = new FrameLayout(getContext());
        }
        View renderView = getRenderView();
        if (this.mPageHeaderModel != null && renderView != null) {
            renderView.setBackgroundColor(0);
            if (!StringUtils.isEmpty(this.mPageHeaderModel.backgroundColor)) {
                renderView.setBackgroundColor(ngn.f(this.mPageHeaderModel.backgroundColor));
            }
            TabHeaderModel tabHeaderModel = this.mPageHeaderModel;
            if (tabHeaderModel != null && this.mPageHeaderHeight == 0) {
                setHeightWithAnimation(0, tabHeaderModel.height, this.mPageHeaderModel.heightUnit, this.mPageHeaderModel.includedSafeArea, 0);
            }
            this.mRootView.addView(renderView);
        }
        return this.mRootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            setWebViewVisible();
        } else {
            setWebViewInVisible();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        setWebViewVisible();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        setWebViewInVisible();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        destroy();
        super.onDestroy();
        ngr.a(TAG, "Page Header Fragment destroy");
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.a(i, i2, intent);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.g();
        this.mPageHeaderWebView = null;
    }

    public void setWebViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2345ee22", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            return;
        }
        this.mPageHeaderWebView.j().setVisibility(0);
    }

    public void setWebViewInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca697d", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            return;
        }
        this.mPageHeaderWebView.j().setVisibility(4);
    }

    public boolean hideHeaderWithAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdff331a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            ngr.b(TAG, "page header view is null");
            return false;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ngr.b(TAG, "animation is running");
            return false;
        }
        final View j = this.mPageHeaderWebView.j();
        if (j == null || j.getVisibility() == 8 || j.getAlpha() == 0.0f || j.getHeight() == 0) {
            ngr.b(TAG, "page header has gone");
            return true;
        } else if (i == 0) {
            setRenderViewHeight(0);
            j.setVisibility(8);
            return true;
        } else if (i == 1) {
            j.setVisibility(0);
            setRenderViewHeight(this.mPageHeaderHeight);
            this.animator = ValueAnimator.ofFloat(j.getAlpha(), 0.0f);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.PageHeaderFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    j.setAlpha(floatValue);
                    if (floatValue != 0.0f) {
                        return;
                    }
                    PageHeaderFragment.access$000(PageHeaderFragment.this, 0);
                    j.setVisibility(8);
                }
            });
            this.animator.setDuration(i2);
            this.animator.start();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            j.setVisibility(0);
            j.setAlpha(1.0f);
            this.animator = ValueAnimator.ofInt(j.getHeight(), 0);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.PageHeaderFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    PageHeaderFragment.access$000(PageHeaderFragment.this, intValue);
                    if (intValue != 0) {
                        return;
                    }
                    j.setVisibility(8);
                }
            });
            this.animator.setDuration(i2);
            this.animator.start();
            return true;
        }
    }

    public boolean showHeaderWithAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b608dbf", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            ngr.b(TAG, "page header view is null");
            return false;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ngr.b(TAG, "animation is running");
            return false;
        }
        final View j = this.mPageHeaderWebView.j();
        if (j == null) {
            ngr.b(TAG, "page header view is null");
            return false;
        } else if (j.getVisibility() == 0 && j.getAlpha() != 0.0f && j.getHeight() == this.mPageHeaderHeight) {
            ngr.a(TAG, "page header has shown");
            return true;
        } else if (i == 0) {
            j.setVisibility(0);
            j.setAlpha(1.0f);
            setRenderViewHeight(this.mPageHeaderHeight);
            return true;
        } else if (i == 1) {
            j.setVisibility(0);
            setRenderViewHeight(this.mPageHeaderHeight);
            this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.PageHeaderFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else {
                        j.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                }
            });
            this.animator.setDuration(i2);
            this.animator.start();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            j.setVisibility(0);
            j.setAlpha(1.0f);
            this.animator = ValueAnimator.ofInt(0, this.mPageHeaderHeight);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.PageHeaderFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else {
                        PageHeaderFragment.access$000(PageHeaderFragment.this, ((Integer) valueAnimator2.getAnimatedValue()).intValue());
                    }
                }
            });
            this.animator.setDuration(i2);
            this.animator.start();
            return true;
        }
    }

    public boolean setHeightWithAnimation(int i, int i2, String str, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d717a0d", new Object[]{this, new Integer(i), new Integer(i2), str, new Boolean(z), num})).booleanValue();
        }
        View renderView = getRenderView();
        if ("rpx".equals(str) || StringUtils.isEmpty(str)) {
            i2 = ngn.a(getContext(), i2);
        }
        if (!z && getAppController() != null) {
            int R = getAppController().R();
            String str2 = TAG;
            ngr.c(str2, "Notch height is " + R);
            i2 += R;
        }
        this.mPageHeaderHeight = i2;
        if (renderView == null) {
            return false;
        }
        if (i == 2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(renderView.getHeight(), i2);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.PageHeaderFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        PageHeaderFragment.access$000(PageHeaderFragment.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
            ofInt.setDuration(num == null ? 500L : num.intValue());
            ofInt.start();
        } else {
            setRenderViewHeight(i2);
        }
        return true;
    }

    private View getRenderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16d4539a", new Object[]{this});
        }
        nfz nfzVar = this.mPageHeaderWebView;
        if (nfzVar == null) {
            return null;
        }
        return nfzVar.j();
    }

    private void setRenderViewHeight(int i) {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece02ef8", new Object[]{this, new Integer(i)});
            return;
        }
        View renderView = getRenderView();
        if (renderView == null) {
            return;
        }
        renderView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = renderView.getLayoutParams();
        if (layoutParams == null) {
            renderView.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        } else {
            layoutParams.height = i;
            renderView.requestLayout();
        }
        TabHeaderModel tabHeaderModel = this.mPageHeaderModel;
        if (tabHeaderModel != null && !tabHeaderModel.includedSafeArea && getAppController() != null) {
            i -= getAppController().R();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || (fragments = fragmentManager.getFragments()) == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof LazyPageFragment) {
                ((LazyPageFragment) fragment).setTabHeaderHeight(ngn.b(getContext(), i));
            }
        }
    }
}
