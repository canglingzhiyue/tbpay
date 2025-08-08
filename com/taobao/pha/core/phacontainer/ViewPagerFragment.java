package com.taobao.pha.core.phacontainer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.h;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabHeaderModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.c;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nfj;
import tb.nfz;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class ViewPagerFragment extends AbstractPageFragment implements c, d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private PageModel mPageModel;
    private ViewGroup mRootView;
    private ViewPager mViewPager;
    private FragmentPagerAdapter mViewPagerAdapter;
    private ArrayList<ViewPager.SimpleOnPageChangeListener> mPageChangeListeners = new ArrayList<>();
    private int mPageIndex = -1;
    private int mPageHeaderIndex = -1;
    private PageHeaderFragment mPageHeaderFragment = null;
    private int mPageScrollState = 0;
    private boolean mPreloadEnable = false;
    private float mSwiperThreshold = 0.0f;
    private List<Integer> mHasPreloaded = new ArrayList();

    public static /* synthetic */ Object ipc$super(ViewPagerFragment viewPagerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
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
            case 1430753462:
                super.setAppearNavigationType((String) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ int access$102(ViewPagerFragment viewPagerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c76247bb", new Object[]{viewPagerFragment, new Integer(i)})).intValue();
        }
        viewPagerFragment.mPageHeaderIndex = i;
        return i;
    }

    public static /* synthetic */ PageModel access$200(ViewPagerFragment viewPagerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("6198632e", new Object[]{viewPagerFragment}) : viewPagerFragment.mPageModel;
    }

    public static /* synthetic */ ArrayList access$300(ViewPagerFragment viewPagerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("52af4e75", new Object[]{viewPagerFragment}) : viewPagerFragment.mPageChangeListeners;
    }

    public static /* synthetic */ void access$400(ViewPagerFragment viewPagerFragment, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32dc60f9", new Object[]{viewPagerFragment, new Integer(i), new Float(f)});
        } else {
            viewPagerFragment.triggerPreload(i, f);
        }
    }

    public static /* synthetic */ int access$502(ViewPagerFragment viewPagerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df717537", new Object[]{viewPagerFragment, new Integer(i)})).intValue();
        }
        viewPagerFragment.mPageScrollState = i;
        return i;
    }

    static {
        kge.a(-1050146674);
        kge.a(415810824);
        kge.a(68685277);
        TAG = ViewPagerFragment.class.getSimpleName();
    }

    public boolean enableTabBarControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316a7907", new Object[]{this})).booleanValue();
        }
        h c = p.c();
        if (!(c instanceof h.a)) {
            return true;
        }
        return ((h.a) c).D();
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPageModel = (PageModel) arguments.getSerializable("key_page_model");
            this.mSwiperThreshold = arguments.getFloat("key_swiper_threshold", 1.0f);
        }
        float f = this.mSwiperThreshold;
        if (f <= 0.0f || f >= 1.0f) {
            z = false;
        }
        this.mPreloadEnable = z;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.pha_view_pager_root_view);
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
        PHAViewPager pHAViewPager = new PHAViewPager(getContext());
        this.mViewPager = pHAViewPager;
        pHAViewPager.setId(R.id.pha_view_pager);
        pHAViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null) {
            if (!StringUtils.isEmpty(pageModel2.backgroundColor)) {
                frameLayout.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
                pHAViewPager.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
            }
            Iterator<PageModel> it = this.mPageModel.frames.iterator();
            while (it.hasNext()) {
                PageModel next = it.next();
                if (StringUtils.isEmpty(next.backgroundColor)) {
                    next.backgroundColor = this.mPageModel.backgroundColor;
                }
            }
        }
        AppController appController = getAppController();
        if (this.mPageModel != null) {
            this.mViewPagerAdapter = new g(getChildFragmentManager(), this.mPageModel, appController);
            ((g) this.mViewPagerAdapter).a(this.mSubPageAppearNavigationType);
            pHAViewPager.setAdapter(this.mViewPagerAdapter);
            pHAViewPager.setOffscreenPageLimit(1);
            pHAViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.pha.core.phacontainer.ViewPagerFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -188663035) {
                        super.onPageScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 407727923) {
                        super.onPageSelected(((Number) objArr[0]).intValue());
                        return null;
                    } else if (hashCode != 1703005214) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                        return null;
                    }
                }

                @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    super.onPageSelected(i);
                    String access$000 = ViewPagerFragment.access$000();
                    ngr.a(access$000, "view pager fragment page selected " + i);
                    ViewPagerFragment.access$102(ViewPagerFragment.this, i);
                    if (ViewPagerFragment.access$200(ViewPagerFragment.this) != null && ViewPagerFragment.access$200(ViewPagerFragment.this).frames.size() > i) {
                        PageModel pageModel3 = ViewPagerFragment.access$200(ViewPagerFragment.this).frames.get(i);
                        AppController appController2 = ViewPagerFragment.this.getAppController();
                        if (pageModel3 != null && appController2 != null) {
                            if (!StringUtils.isEmpty(pageModel3._type) && pageModel3._type.contains("_video") && ViewPagerFragment.this.enableTabBarControl() && appController2.v() != null) {
                                appController2.v().b(0, 0);
                            }
                            if (appController2.q() != null) {
                                appController2.q().a(pageModel3);
                            }
                        }
                    }
                    Iterator it2 = ViewPagerFragment.access$300(ViewPagerFragment.this).iterator();
                    while (it2.hasNext()) {
                        ((ViewPager.SimpleOnPageChangeListener) it2.next()).onPageSelected(i);
                    }
                    if (ViewPagerFragment.this.getActivity() == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    AppController appController3 = ViewPagerFragment.this.getAppController();
                    if (appController3 != null && appController3.E() != null) {
                        appController3.E().a("swiperchange", jSONObject, "native", "AppWorker");
                    }
                    PageHeaderFragment pageHeaderFragment = (PageHeaderFragment) ViewPagerFragment.this.getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
                    if (pageHeaderFragment == null) {
                        return;
                    }
                    pageHeaderFragment.sendEventToPageView("swiperchange", jSONObject, null);
                }

                @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    PageModel mo1202getPageModel;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                        return;
                    }
                    super.onPageScrolled(i, f, i2);
                    ViewPagerFragment.access$400(ViewPagerFragment.this, i, f);
                    if (ViewPagerFragment.access$200(ViewPagerFragment.this) == null || ViewPagerFragment.access$200(ViewPagerFragment.this).getPageHeader() == null || !ViewPagerFragment.access$200(ViewPagerFragment.this).getPageHeader().enableSwiperListener) {
                        return;
                    }
                    Iterator it2 = ViewPagerFragment.access$300(ViewPagerFragment.this).iterator();
                    while (it2.hasNext()) {
                        ((ViewPager.SimpleOnPageChangeListener) it2.next()).onPageScrolled(i, f, i2);
                    }
                    PageHeaderFragment pageHeaderFragment = (PageHeaderFragment) ViewPagerFragment.this.getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
                    if (pageHeaderFragment == null || pageHeaderFragment.getView() == null || (mo1202getPageModel = ViewPagerFragment.this.mo1202getPageModel()) == null || mo1202getPageModel.frames.size() <= i) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) Integer.valueOf(mo1202getPageModel.frames.get(i).pageIndex));
                    jSONObject.put("left", (Object) Integer.valueOf(ngn.c((pageHeaderFragment.getView().getMeasuredWidth() * i) + i2)));
                    jSONObject.put("top", (Object) 0);
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    ViewPagerFragment.this.sendEventToPageView("swiperscroll", jSONObject, null);
                }

                @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                        return;
                    }
                    super.onPageScrollStateChanged(i);
                    ViewPagerFragment.access$502(ViewPagerFragment.this, i);
                }
            });
            int activeIndex = this.mPageModel.getActiveIndex();
            for (int i = 0; i < this.mPageModel.frames.size(); i++) {
                this.mPageModel.frames.get(i).pageIndex = i;
            }
            this.mViewPager.setCurrentItem(activeIndex, false);
            this.mPageHeaderIndex = activeIndex;
            if (activeIndex >= 0 && activeIndex < this.mPageModel.frames.size() && (pageModel = this.mPageModel.frames.get(activeIndex)) != null && !StringUtils.isEmpty(pageModel._type) && pageModel._type.contains("_video") && appController != null && appController.v() != null) {
                appController.v().b(0, 0);
            }
        }
        addTabHeaderView();
        frameLayout.addView(pHAViewPager, new ViewGroup.LayoutParams(-1, -1));
        this.mRootView = frameLayout;
        return this.mRootView;
    }

    private void triggerPreload(int i, float f) {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6dbc55", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.mPageScrollState == 1 && this.mPreloadEnable) {
            if (this.mHasPreloaded.contains(Integer.valueOf(i)) && this.mHasPreloaded.contains(Integer.valueOf(i + 1))) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (f >= this.mSwiperThreshold) {
                int i2 = i + 1;
                if (!this.mHasPreloaded.contains(Integer.valueOf(i2))) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (1.0f - f >= this.mSwiperThreshold && !this.mHasPreloaded.contains(Integer.valueOf(i))) {
                arrayList.add(Integer.valueOf(i));
            }
            if (arrayList.size() <= 0) {
                return;
            }
            this.mHasPreloaded.addAll(arrayList);
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager == null || (fragments = childFragmentManager.getFragments()) == null) {
                return;
            }
            for (Fragment fragment : fragments) {
                if (fragment instanceof nfj) {
                    ((nfj) fragment).preload(arrayList);
                }
            }
        }
    }

    public void setViewPagerEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15665488", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            return;
        }
        ((PHAViewPager) viewPager).setAcceptTouchEvent(z);
    }

    public void registerViewPagerChangeListener(ViewPager.SimpleOnPageChangeListener simpleOnPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a495ef2", new Object[]{this, simpleOnPageChangeListener});
            return;
        }
        ngr.a(TAG, "view pager register page change listener");
        this.mPageChangeListeners.add(simpleOnPageChangeListener);
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
            return;
        }
        this.mPageIndex = i;
        PageHeaderFragment pageHeaderFragment = this.mPageHeaderFragment;
        if (pageHeaderFragment == null) {
            return;
        }
        pageHeaderFragment.setPageIndex(i);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    /* renamed from: getPageModel */
    public PageModel mo1202getPageModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("dd6442ff", new Object[]{this}) : this.mPageModel;
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageAppearListener(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368f0c51", new Object[]{this, aVar});
            return;
        }
        ngr.c(TAG, "registerPageAppearListener in view pager");
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        currentFragment.registerPageAppearListener(aVar);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageDisappearListener(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705c621a", new Object[]{this, bVar});
            return;
        }
        ngr.c(TAG, "registerPageDisappearListener in view pager");
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        currentFragment.registerPageDisappearListener(bVar);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public nfz getPageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("e6918913", new Object[]{this});
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return null;
        }
        return currentFragment.getPageView();
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void updatePageModel(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747200c", new Object[]{this, pageModel});
            return;
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 == null || pageModel == null) {
            return;
        }
        pageModel2.setPageHeader(pageModel.getPageHeader());
        if (pageModel.getPageHeader() != null) {
            Fragment fragment = null;
            PageModel pageModel3 = this.mPageModel.frames.size() > 0 ? this.mPageModel.frames.get(0) : null;
            int defaultFrameIndex = pageModel.getDefaultFrameIndex();
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments.size() > 0) {
                fragment = fragments.get(0);
            }
            if (pageModel.frames.size() > 1 && this.mPageModel.frames.size() < pageModel.frames.size()) {
                for (int i = 0; i < pageModel.frames.size(); i++) {
                    if (i != defaultFrameIndex) {
                        PageModel pageModel4 = pageModel.frames.get(i);
                        pageModel4.pageIndex = i;
                        this.mPageModel.frames.add(pageModel4);
                    } else if (pageModel3 != null) {
                        pageModel3.pageIndex = i;
                        if (fragment instanceof c) {
                            ((c) fragment).setPageIndex(i);
                        }
                    }
                }
            }
        }
        Iterator<PageModel> it = this.mPageModel.frames.iterator();
        while (it.hasNext()) {
            PageModel next = it.next();
            if (StringUtils.isEmpty(next.backgroundColor)) {
                next.backgroundColor = pageModel.backgroundColor;
            }
        }
        if (this.mViewPager != null) {
            for (Fragment fragment2 : getChildFragmentManager().getFragments()) {
                if (fragment2 instanceof LazyPageFragment) {
                    LazyPageFragment lazyPageFragment = (LazyPageFragment) fragment2;
                    int pageIndex = lazyPageFragment.getPageIndex();
                    Iterator<PageModel> it2 = pageModel.frames.iterator();
                    while (it2.hasNext()) {
                        PageModel next2 = it2.next();
                        if (next2.pageIndex == pageIndex) {
                            lazyPageFragment.updatePageModel(next2);
                        }
                    }
                    if (this.mPageModel.getPageHeader() != null) {
                        lazyPageFragment.setEnableScrollListener(this.mPageModel.getPageHeader().enableScrollListener);
                    }
                }
                if (fragment2 instanceof PageHeaderFragment) {
                    ((c) fragment2).setPageIndex(this.mPageIndex);
                }
            }
        }
        this.mPageModel.setUrl(pageModel.getUrl());
        this.mPageModel.backgroundColor = pageModel.backgroundColor;
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.mViewPager.getAdapter().notifyDataSetChanged();
        }
        addTabHeaderView();
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
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
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

    @Override // com.taobao.pha.core.phacontainer.c
    public void destroy() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (isAdded() && (fragments = getChildFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof c) {
                    ((c) fragment).destroy();
                }
            }
        }
    }

    public void setWebViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2345ee22", new Object[]{this});
            return;
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        currentFragment.setUserVisibleHint(true);
    }

    public void setWebViewInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca697d", new Object[]{this});
            return;
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        currentFragment.setUserVisibleHint(false);
    }

    public void setCurrentViewPagerItem(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230d60c", new Object[]{this, new Integer(i), str});
        } else {
            setCurrentViewPagerItem(i, "translate".equals(str));
        }
    }

    public void setCurrentViewPagerItem(int i, boolean z) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b703252", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mPageModel != null) {
            for (int i2 = 0; i2 < this.mPageModel.frames.size(); i2++) {
                if (this.mPageModel.frames.get(i2).pageIndex == i && (viewPager = this.mViewPager) != null) {
                    viewPager.setCurrentItem(i2, z);
                }
            }
        }
    }

    public LazyPageFragment getCurrentFragment() {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LazyPageFragment) ipChange.ipc$dispatch("595d7eb8", new Object[]{this});
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            return null;
        }
        int currentItem = viewPager.getCurrentItem();
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 == null || pageModel2.frames.size() <= currentItem || (pageModel = this.mPageModel.frames.get(currentItem)) == null) {
            return null;
        }
        int i = pageModel.pageIndex;
        for (Fragment fragment : getChildFragmentManager().getFragments()) {
            if (fragment instanceof LazyPageFragment) {
                LazyPageFragment lazyPageFragment = (LazyPageFragment) fragment;
                if (i == lazyPageFragment.getPageIndex()) {
                    return lazyPageFragment;
                }
            }
        }
        return null;
    }

    public PageHeaderFragment getPageHeaderFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageHeaderFragment) ipChange.ipc$dispatch("9c2dadae", new Object[]{this}) : this.mPageHeaderFragment;
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        FragmentPagerAdapter fragmentPagerAdapter = this.mViewPagerAdapter;
        if (fragmentPagerAdapter == null) {
            return;
        }
        fragmentPagerAdapter.notifyDataSetChanged();
    }

    public void addFrame(int i, PageModel pageModel, a.InterfaceC0751a interfaceC0751a) {
        Uri uri;
        ManifestModel manifestModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373892b", new Object[]{this, new Integer(i), pageModel, interfaceC0751a});
            return;
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null && pageModel2.frames != null) {
            if (i >= 0 && i <= this.mPageModel.frames.size()) {
                pageModel.pageIndex = this.mPageModel.frames.size();
                this.mPageModel.frames.add(i, pageModel);
                AppController appController = getAppController();
                if (appController != null) {
                    manifestModel = appController.u();
                    uri = appController.t();
                } else {
                    uri = null;
                    manifestModel = null;
                }
                ManifestModel.setUpLayoutIndex(manifestModel, this.mPageModel, uri);
                this.mViewPagerAdapter.notifyDataSetChanged();
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.RANGE_ERROR, "addFrame index error");
            return;
        }
        interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "addFrame data error");
    }

    public void addFrames(PageModel pageModel, a.InterfaceC0751a interfaceC0751a) {
        Uri uri;
        ManifestModel manifestModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a137a74d", new Object[]{this, pageModel, interfaceC0751a});
            return;
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null && pageModel2.frames != null) {
            if (pageModel != null && pageModel.frames != null) {
                for (int i = 0; i < pageModel.frames.size(); i++) {
                    PageModel pageModel3 = pageModel.frames.get(i);
                    if (pageModel3 != null) {
                        pageModel3.offlineResources = this.mPageModel.offlineResources;
                        this.mPageModel.frames.add(pageModel3);
                    }
                }
                AppController appController = getAppController();
                if (appController != null) {
                    manifestModel = appController.u();
                    uri = appController.t();
                } else {
                    uri = null;
                    manifestModel = null;
                }
                ManifestModel.setUpLayoutIndex(manifestModel, this.mPageModel, uri);
                this.mViewPagerAdapter.notifyDataSetChanged();
                int i2 = this.mPageHeaderIndex;
                if (i2 != -1) {
                    setCurrentViewPagerItem(i2, false);
                }
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "addFrames, frames data error");
            return;
        }
        interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "addFrames data error");
    }

    public void removeFrame(int i, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee82a28a", new Object[]{this, new Integer(i), interfaceC0751a});
        } else if (this.mPageIndex != i) {
            PageModel pageModel = this.mPageModel;
            if (pageModel != null && i >= 0 && pageModel.frames != null && this.mPageModel.frames.size() > i) {
                this.mPageModel.frames.remove(i);
                this.mViewPagerAdapter.notifyDataSetChanged();
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.RANGE_ERROR, "removeFrame, remove index fail");
        } else {
            interfaceC0751a.a(PHAErrorType.RANGE_ERROR, "removeFrame remove current index fail");
        }
    }

    private void addTabHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0176ead", new Object[]{this});
            return;
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel == null || pageModel.getPageHeader() == null) {
            return;
        }
        TabHeaderModel pageHeader = this.mPageModel.getPageHeader();
        pageHeader.setSubPage(this.mPageModel.isSubPage());
        if (StringUtils.isEmpty(pageHeader.html) && StringUtils.isEmpty(pageHeader.getUrl())) {
            return;
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
        AppController appController = getAppController();
        if (findFragmentByTag != null || appController == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("AppControllerInstanceId", appController.L());
        bundle.putSerializable("key_tab_header_model", pageHeader);
        bundle.putInt("key_tab_header_page_index", this.mPageIndex);
        Fragment instantiate = Fragment.instantiate(getContext(), PageHeaderFragment.class.getName(), bundle);
        this.mPageHeaderFragment = (PageHeaderFragment) instantiate;
        if (instantiate != null) {
            try {
                ((c) instantiate).setPageIndex(getPageIndex());
                appController.a((c) instantiate, pageHeader.key);
            } catch (Exception unused) {
                ngr.b(TAG, "cast type error");
            }
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (beginTransaction == null) {
            return;
        }
        beginTransaction.add(R.id.pha_view_pager_root_view, instantiate, PageHeaderFragment.TAG_FRAGMENT).commitAllowingStateLoss();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean startPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b9619f", new Object[]{this})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.startPullRefresh();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean stopPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cea69ff", new Object[]{this})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.stopPullRefresh();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c04712d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.setBackgroundColor(i);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean setColorScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be4ef3b", new Object[]{this, str})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.setColorScheme(str);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public IPullRefreshLayout getPullRefreshLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout) ipChange.ipc$dispatch("829d84b2", new Object[]{this});
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return null;
        }
        return currentFragment.getPullRefreshLayout();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean enablePullRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388183be", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.enablePullRefresh(z);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean disablePullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36186659", new Object[]{this})).booleanValue();
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        return currentFragment.disablePullRefresh();
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, com.taobao.pha.core.phacontainer.e
    public void setAppearNavigationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554790b6", new Object[]{this, str});
            return;
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof LazyPageFragment) {
            currentFragment.setAppearNavigationType(str);
        } else {
            super.setAppearNavigationType(str);
        }
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, com.taobao.pha.core.phacontainer.e
    public void setDisappearNavigationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3eb080", new Object[]{this, str});
            return;
        }
        LazyPageFragment currentFragment = getCurrentFragment();
        if (!(currentFragment instanceof LazyPageFragment)) {
            return;
        }
        currentFragment.setDisappearNavigationType(str);
    }
}
