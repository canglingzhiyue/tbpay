package tb;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.speed.SpeedFrameLayout;
import com.taobao.homepage.utils.n;
import com.taobao.homepage.view.manager.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.homepage.view.manager.searchbar.impl.searchview.SearchBarView;
import com.taobao.homepage.view.widgets.HomeSwipeRefreshLayout;
import com.taobao.homepage.view.widgets.bgcontainer.BGContainerView;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class nvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1140579982);
    }

    public FrameLayout a(Context context) {
        FrameLayout frameLayout;
        ViewStub viewStub;
        ViewStub viewStub2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context});
        }
        boolean D = n.n().D();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout a2 = a(context, layoutParams);
        lar.e("layoutHomeWeexContainer");
        FrameLayout b = b(context, layoutParams);
        lar.f("layoutHomeWeexContainer");
        lar.e("homeBgContainer");
        BGContainerView c = c(context, layoutParams);
        lar.f("homeBgContainer");
        lar.e("layoutSecondFloorCover");
        FrameLayout d = d(context, layoutParams);
        lar.f("layoutSecondFloorCover");
        lar.e("homeSwipeRefreshLayout");
        HomeSwipeRefreshLayout e = e(context, layoutParams);
        lar.f("homeSwipeRefreshLayout");
        LinearLayout linearLayout = null;
        if (!D) {
            lar.e("homepageFloatHeader");
            frameLayout = b(context);
            lar.f("homepageFloatHeader");
        } else {
            frameLayout = null;
        }
        lar.e("svSearchView");
        RelativeLayout c2 = c(context);
        lar.f("svSearchView");
        if (!D) {
            lar.e("editionTipsBase");
            viewStub = d(context);
            lar.f("editionTipsBase");
            lar.e("homeEditionTipsOld");
            viewStub2 = e(context);
            lar.f("homeEditionTipsOld");
        } else {
            viewStub = null;
            viewStub2 = null;
        }
        if (!D) {
            lar.e("homepageBottomContainer");
            linearLayout = f(context);
            lar.f("homepageBottomContainer");
        }
        lar.e("homepageTip");
        ViewStub g = g(context);
        lar.f("homepageTip");
        a2.addView(b);
        a2.addView(c);
        a2.addView(d);
        a2.addView(e);
        if (frameLayout != null) {
            a2.addView(frameLayout);
        }
        a2.addView(c2);
        if (viewStub != null) {
            a2.addView(viewStub);
            a2.addView(viewStub2);
        }
        if (linearLayout != null) {
            a2.addView(linearLayout);
        }
        a2.addView(g);
        return a2;
    }

    private FrameLayout a(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("221623c0", new Object[]{this, context, layoutParams});
        }
        SpeedFrameLayout speedFrameLayout = new SpeedFrameLayout(context);
        speedFrameLayout.setLayoutParams(layoutParams);
        speedFrameLayout.setId(R.id.homepage_root_layout);
        speedFrameLayout.setImportantForAccessibility(1);
        speedFrameLayout.setBackgroundResource(R.color.homepage_background);
        return speedFrameLayout;
    }

    private FrameLayout b(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e9456fdf", new Object[]{this, context, layoutParams});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.layout_home_weex_container);
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setId(R.id.homepage_container_second_floor);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    private BGContainerView c(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BGContainerView) ipChange.ipc$dispatch("7782ae78", new Object[]{this, context, layoutParams});
        }
        BGContainerView bGContainerView = new BGContainerView(context);
        bGContainerView.setLayoutParams(layoutParams);
        bGContainerView.setId(R.id.home_bg_container);
        e.e("optimize", "设置 R.id.home_bg_container");
        return bGContainerView;
    }

    private FrameLayout d(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("77a4081d", new Object[]{this, context, layoutParams});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.layout_second_floor_cover);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    private HomeSwipeRefreshLayout e(Context context, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSwipeRefreshLayout) ipChange.ipc$dispatch("fd418628", new Object[]{this, context, layoutParams});
        }
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = new HomeSwipeRefreshLayout(context);
        homeSwipeRefreshLayout.setLayoutParams(layoutParams);
        homeSwipeRefreshLayout.setId(R.id.home_swipe_refresh);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.rv_main_container_wrapper);
        homeSwipeRefreshLayout.addView(frameLayout);
        return homeSwipeRefreshLayout;
    }

    private FrameLayout b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("de12f17a", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.homepage_float_header);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    private RelativeLayout c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("ba4cb02e", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        relativeLayout.setId(R.id.search_bar_container);
        relativeLayout.setBackgroundResource(17170445);
        HomeSearchBarBgView homeSearchBarBgView = new HomeSearchBarBgView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(8, R.id.multi_tab_container_wrapper);
        homeSearchBarBgView.setLayoutParams(layoutParams);
        homeSearchBarBgView.setId(R.id.search_bg_view);
        homeSearchBarBgView.setVisibility(8);
        relativeLayout.addView(homeSearchBarBgView);
        SearchBarView searchBarView = new SearchBarView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        searchBarView.setLayoutParams(layoutParams2);
        searchBarView.setId(R.id.search_view);
        relativeLayout.addView(searchBarView);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        frameLayout.setId(R.id.multi_tab_container);
        FrameLayout frameLayout2 = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, R.id.search_view);
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout2.setId(R.id.multi_tab_container_wrapper);
        frameLayout2.addView(frameLayout);
        relativeLayout.addView(frameLayout2);
        return relativeLayout;
    }

    private ViewStub d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d2fb0531", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 5;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 40.0f);
        layoutParams.topMargin = DensityUtil.dip2px(context, 40.0f);
        layoutParams.rightMargin = DensityUtil.dip2px(context, 24.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setId(R.id.home_edition_tips_base);
        viewStub.setLayoutResource(R.layout.home_edition_tips_base);
        viewStub.setVisibility(8);
        return viewStub;
    }

    private ViewStub e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d39f90", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.home_edition_tips_old);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 70.0f);
        layoutParams.topMargin = DensityUtil.dip2px(context, 45.0f);
        layoutParams.rightMargin = DensityUtil.dip2px(context, 50.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setLayoutResource(R.layout.home_edition_tips_old);
        viewStub.setVisibility(8);
        return viewStub;
    }

    private LinearLayout f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("f2327952", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.homepage_bottom_container);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private ViewStub g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("5c84d44e", new Object[]{this, context});
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.homepage_tip);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, DensityUtil.dip2px(context, 52.0f));
        layoutParams.topMargin = DensityUtil.dip2px(context, 48.0f);
        viewStub.setLayoutParams(layoutParams);
        viewStub.setLayoutResource(R.layout.home_shake_view);
        viewStub.setVisibility(8);
        return viewStub;
    }
}
