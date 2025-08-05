package com.taobao.message.sp.category.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbelder.b;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstance;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItem;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItemType;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.wangxin.app.WxApplication;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.mxw;
import tb.noa;

/* loaded from: classes7.dex */
public class NewCategoryPageInstance extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NewCategoryPageInstance";
    private TUrlImageView bgImageView;
    private BroadcastReceiver broadcastReceiver;
    private SectionListWidgetInstance contentWidgetInstance;
    private BroadcastReceiver elderFontChangeReceiver;
    private FrameLayout frameLayout;
    private WidgetInstance headWidgetInstance;
    private ThemeFrameLayout navigatorBackground;
    private FrameLayout navigatorLayout;
    private WidgetInstance navigatorWidgetInstance;
    private int platformUnreadCont;
    private TRecyclerView recyclerView;
    private TBRefreshHeader refreshHeader;
    private ThemeFrameLayout skin;
    private StickyHeaderOnScrollListener stickyHeaderOnScrollListener;
    private FrameLayout swipeRefreshFrameLayout;
    private TBSwipeRefreshLayout swipeRefreshLayout;
    private int systemBarAndNavigatorHeight;
    private int systemBarHeight;
    private BroadcastReceiver themeBroadcastReceiver;
    private int useTheme = 1;
    private int enablePullToRefresh = 1;
    private boolean isCrowd = true;
    private boolean stickyHeader = false;

    static {
        kge.a(937874225);
    }

    public static /* synthetic */ Object ipc$super(NewCategoryPageInstance newCategoryPageInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1468187837) {
            super.onRefresh((NewCategoryPageInstance) ((Serializable) objArr[0]), (EventDispatcher) objArr[1]);
            return null;
        } else if (hashCode != 577536806) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.dispose();
            return null;
        }
    }

    public static /* synthetic */ void access$000(NewCategoryPageInstance newCategoryPageInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485fd74a", new Object[]{newCategoryPageInstance, new Integer(i)});
        } else {
            newCategoryPageInstance.setupOldBackground(i);
        }
    }

    public static /* synthetic */ TRecyclerView access$100(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TRecyclerView) ipChange.ipc$dispatch("5f0c3f22", new Object[]{newCategoryPageInstance}) : newCategoryPageInstance.recyclerView;
    }

    public static /* synthetic */ TBSwipeRefreshLayout access$200(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("82d3aba", new Object[]{newCategoryPageInstance}) : newCategoryPageInstance.swipeRefreshLayout;
    }

    public static /* synthetic */ FrameLayout access$300(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ea43ae63", new Object[]{newCategoryPageInstance}) : newCategoryPageInstance.swipeRefreshFrameLayout;
    }

    public static /* synthetic */ ThemeFrameLayout access$400(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeFrameLayout) ipChange.ipc$dispatch("6e83bfd8", new Object[]{newCategoryPageInstance}) : newCategoryPageInstance.navigatorBackground;
    }

    public static /* synthetic */ int access$500(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f159e7", new Object[]{newCategoryPageInstance})).intValue() : newCategoryPageInstance.systemBarHeight;
    }

    public static /* synthetic */ SectionListWidgetInstance access$600(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SectionListWidgetInstance) ipChange.ipc$dispatch("9600daf5", new Object[]{newCategoryPageInstance}) : newCategoryPageInstance.contentWidgetInstance;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        TraceUtil.beginSection("NewCategoryPageView");
        this.systemBarHeight = DisplayUtil.getStatusBarHeight(context);
        this.systemBarAndNavigatorHeight = this.systemBarHeight + DisplayUtil.ap2DesignScalePx(context, ValueUtil.getInteger(renderTemplate.renderData, "navigatorHeight", 48));
        this.frameLayout = new FrameLayout(context);
        this.swipeRefreshFrameLayout = new FrameLayout(context);
        if (j.b()) {
            this.isCrowd = false;
            if (renderTemplate != null && renderTemplate.renderData != null && noa.KEY_SHOP_SEARCH_ELDER.equals(renderTemplate.renderData.get("pageType"))) {
                this.isCrowd = true;
            }
            boolean equals = "1".equals(ConfigUtil.getValue("mpm_business_switch", "newCategoryBgOpen", "1"));
            if (!FestivalMgr.a().a("mytaobao") && equals && this.isCrowd) {
                this.bgImageView = new TUrlImageView(context);
                this.bgImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.bgImageView.setImageUrl(null);
                this.bgImageView.setImageDrawable(null);
                this.bgImageView.setBackgroundColor(Color.parseColor("#FFFFFF"));
                if (ApplicationUtil.isDebug()) {
                    Logger.e(TAG, "bgImageView.setBackgroundColor(Color.parseColor(\"#FFFFFF\"));");
                }
                this.frameLayout.addView(this.bgImageView, -1, DisplayUtil.dip2px(310.0f));
                IntentFilter intentFilter = new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE);
                this.themeBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        NewCategoryPageInstance.access$000(NewCategoryPageInstance.this, Color.parseColor("#FFFFFF"));
                        NewCategoryPageInstance.this.refreshView();
                    }
                };
                ApplicationUtil.getApplication().registerReceiver(this.themeBroadcastReceiver, intentFilter);
                LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).registerReceiver(this.themeBroadcastReceiver, intentFilter);
            } else {
                g gVar = new g("message", DisplayUtil.getScreenHeight());
                gVar.d = DisplayUtil.ap2DesignScalePx(context, 210.0f);
                gVar.i = true;
                gVar.j = DisplayUtil.ap2DesignScalePx(context, 20.0f);
                this.skin = j.a().a(context, gVar);
                ThemeFrameLayout themeFrameLayout = this.skin;
                if (themeFrameLayout != null) {
                    this.frameLayout.addView(themeFrameLayout, -1, -1);
                }
                if (ApplicationUtil.isDebug()) {
                    Logger.e(TAG, "use FestivalMgr");
                }
                new g("message", 1, this.systemBarAndNavigatorHeight).e = this.systemBarAndNavigatorHeight;
                this.navigatorBackground = j.a().a(context, gVar);
                ThemeFrameLayout themeFrameLayout2 = this.navigatorBackground;
                if (themeFrameLayout2 != null) {
                    this.frameLayout.addView(themeFrameLayout2, -1, -1);
                }
            }
        } else {
            this.bgImageView = new TUrlImageView(context);
            this.bgImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "canUseThemeManager: false");
            }
            setupOldBackground(Color.parseColor("#FAFAFA"));
            this.frameLayout.addView(this.bgImageView, -1, DisplayUtil.dip2px(310.0f));
            IntentFilter intentFilter2 = new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE);
            this.themeBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    NewCategoryPageInstance.access$000(NewCategoryPageInstance.this, Color.parseColor("#FAFAFA"));
                    NewCategoryPageInstance.this.refreshView();
                }
            };
            ApplicationUtil.getApplication().registerReceiver(this.themeBroadcastReceiver, intentFilter2);
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).registerReceiver(this.themeBroadcastReceiver, intentFilter2);
        }
        considerSubscribeElderFontChange();
        this.swipeRefreshLayout = new TBSwipeRefreshLayout(context) { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
            public boolean isChildScrollToTop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
                }
                try {
                    if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildLayoutPosition(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0)) == 0) {
                        if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getMeasuredHeight() == 0) {
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    TLog.loge("MPMSGS.NewCategoryPageInstance", th.getMessage());
                }
                try {
                    if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildLayoutPosition(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0)) == 0) {
                        if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getTop() == 0) {
                            return true;
                        }
                    }
                } catch (Throwable th2) {
                    TLog.loge("MPMSGS.NewCategoryPageInstance", th2.getMessage());
                }
                return false;
            }
        };
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = this.systemBarAndNavigatorHeight;
        this.frameLayout.addView(this.swipeRefreshLayout, layoutParams);
        this.swipeRefreshLayout.addView(this.swipeRefreshFrameLayout, -1, -2);
        this.navigatorLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.navigatorLayout.setPadding(0, this.systemBarHeight, 0, 0);
        this.frameLayout.addView(this.navigatorLayout, marginLayoutParams);
        this.swipeRefreshLayout.setSoundEffectsEnabled(true);
        this.refreshHeader = new TBOldRefreshHeader(context);
        this.refreshHeader.setBackgroundColor(0);
        this.swipeRefreshLayout.setHeaderView(this.refreshHeader);
        this.swipeRefreshLayout.enablePullRefresh(true);
        this.swipeRefreshLayout.setDragRate(0.75f);
        setupTheme();
        IntentFilter intentFilter3 = new IntentFilter(j.ACTION_THEME_CHANGE);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    NewCategoryPageInstance.this.refreshView();
                }
            }
        };
        LocalBroadcastManager.getInstance(context).registerReceiver(this.broadcastReceiver, intentFilter3);
        TraceUtil.endTrace();
        return this.frameLayout;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void onRefresh(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cd0ab9", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        super.onRefresh((NewCategoryPageInstance) jSONObject, eventDispatcher);
        setupTheme();
    }

    private void setupOldBackground(int i) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1867f24", new Object[]{this, new Integer(i)});
        } else if (this.bgImageView == null) {
            if (!ApplicationUtil.isDebug()) {
                return;
            }
            Logger.e(TAG, "setupOldBackground null");
        } else {
            if (FestivalMgr.a().a("mytaobao")) {
                String d = FestivalMgr.a().d("mytaobao", mxw.KEY_SKIN_PIC);
                if (!TextUtils.isEmpty(d)) {
                    this.bgImageView.setImageUrl(d);
                    this.bgImageView.setBackgroundColor(0);
                    if (!ApplicationUtil.isDebug()) {
                        return;
                    }
                    Logger.e(TAG, "setupOldBackground bgImageView.setBackgroundColor(Color.TRANSPARENT);");
                    return;
                }
            }
            if (FestivalMgr.a().a("global") && -1 != (a2 = FestivalMgr.a().a("actionBarBackgroundColor", -1))) {
                this.bgImageView.setImageUrl(null);
                this.bgImageView.setImageDrawable(null);
                this.bgImageView.setBackgroundColor(a2);
                if (!ApplicationUtil.isDebug()) {
                    return;
                }
                Logger.e(TAG, "setupOldBackground bgImageView.setBackgroundColor(bgColor);" + a2);
                return;
            }
            this.bgImageView.setImageUrl(null);
            this.bgImageView.setImageDrawable(null);
            this.bgImageView.setBackgroundColor(i);
            if (!ApplicationUtil.isDebug()) {
                return;
            }
            Logger.e(TAG, "setupOldBackground bgImageView.setBackgroundColor(Color.parseColor(\"#FAFAFA\"));");
        }
    }

    private void setupTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e24fd3", new Object[]{this});
        } else if (this.useTheme == 1) {
            int parseColor = Color.parseColor("#EEEEEE");
            ThemeData b = j.a().b("mytaobao");
            if (b != null && "1".equals(b.naviStyle)) {
                parseColor = Color.parseColor("#111111");
            }
            this.refreshHeader.setRefreshTipColor(parseColor);
            ((RefreshHeadView) this.refreshHeader.getRefreshView()).setRefreshViewColor(parseColor);
        } else {
            ThemeFrameLayout themeFrameLayout = this.skin;
            if (themeFrameLayout != null) {
                themeFrameLayout.setVisibility(8);
            }
            ThemeFrameLayout themeFrameLayout2 = this.navigatorBackground;
            if (themeFrameLayout2 != null) {
                themeFrameLayout2.setVisibility(8);
            }
            TUrlImageView tUrlImageView = this.bgImageView;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(8);
            }
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "setupTheme bgImageView.setVisibility(View.GONE);");
            }
            this.frameLayout.setBackgroundColor(-1);
            int parseColor2 = Color.parseColor("#111111");
            this.refreshHeader.setRefreshTipColor(parseColor2);
            ((RefreshHeadView) this.refreshHeader.getRefreshView()).setRefreshViewColor(parseColor2);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        int i = this.useTheme;
        this.useTheme = ValueUtil.getInteger(jSONObject, "useTheme", i);
        if (i != this.useTheme) {
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "bindData setupTheme");
            }
            setupTheme();
        }
        this.enablePullToRefresh = ValueUtil.getInteger(jSONObject, "enablePullToRefresh", this.enablePullToRefresh);
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.swipeRefreshLayout;
        if (this.enablePullToRefresh == 1) {
            z = true;
        }
        tBSwipeRefreshLayout.enablePullRefresh(z);
        this.stickyHeader = ValueUtil.getBoolean(jSONObject, "stickyHeader");
        this.swipeRefreshLayout.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setRefreshing(true);
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setRefreshing(false);
                        }
                    }
                }, 1500L);
                eventDispatcher.dispatch(new Event.Build("refresh").build());
                if (!ApplicationUtil.isDebug()) {
                    return;
                }
                UIHandler.post(new Runnable() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.5.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference("testPlatform7days", -1);
                        int intSharedPreference2 = SharedPreferencesUtil.getIntSharedPreference("messageAuraBC", -1);
                        int intSharedPreference3 = SharedPreferencesUtil.getIntSharedPreference("messageOldFrmPanel", -1);
                        int intSharedPreference4 = SharedPreferencesUtil.getIntSharedPreference("messageAuraGroup", -1);
                        TBSimpleListItem[] tBSimpleListItemArr = new TBSimpleListItem[17];
                        tBSimpleListItemArr[0] = new TBSimpleListItem("全部重置默认", TBSimpleListItemType.NORMAL);
                        if (intSharedPreference == -1) {
                            tBSimpleListItemArr[1] = new TBSimpleListItem("平台通知7天弱化/开/当前: 默认", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[2] = new TBSimpleListItem("平台通知7天弱化/关/当前: 默认", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference == 0) {
                            tBSimpleListItemArr[1] = new TBSimpleListItem("平台通知7天弱化/开/当前: 关", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[2] = new TBSimpleListItem("平台通知7天弱化/关/当前: 关", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference == 1) {
                            tBSimpleListItemArr[1] = new TBSimpleListItem("平台通知7天弱化/开/当前: 开", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[2] = new TBSimpleListItem("平台通知7天弱化/关/当前: 开", TBSimpleListItemType.NORMAL);
                        }
                        if (intSharedPreference2 == -1) {
                            tBSimpleListItemArr[3] = new TBSimpleListItem("BC/新/当前: 默认", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[4] = new TBSimpleListItem("BC/老/当前: 默认", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference2 == 0) {
                            tBSimpleListItemArr[3] = new TBSimpleListItem("BC/新/当前: 老", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[4] = new TBSimpleListItem("BC/老/当前: 老", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference2 == 1) {
                            tBSimpleListItemArr[3] = new TBSimpleListItem("BC/新/当前: 新", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[4] = new TBSimpleListItem("BC/老/当前: 新", TBSimpleListItemType.NORMAL);
                        }
                        if (intSharedPreference3 == -1) {
                            tBSimpleListItemArr[5] = new TBSimpleListItem("panel/新/当前: 默认", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[6] = new TBSimpleListItem("panel/老/当前: 默认", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference3 == 0) {
                            tBSimpleListItemArr[5] = new TBSimpleListItem("panel/新/当前: 老", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[6] = new TBSimpleListItem("panel/老/当前: 老", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference3 == 1) {
                            tBSimpleListItemArr[5] = new TBSimpleListItem("panel/新/当前: 新", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[6] = new TBSimpleListItem("panel/老/当前: 新", TBSimpleListItemType.NORMAL);
                        }
                        if (intSharedPreference4 == -1) {
                            tBSimpleListItemArr[7] = new TBSimpleListItem("群聊/新/当前: 默认", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[8] = new TBSimpleListItem("群聊/老/当前: 默认", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference4 == 0) {
                            tBSimpleListItemArr[7] = new TBSimpleListItem("群聊/新/当前: 老", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[8] = new TBSimpleListItem("群聊/老/当前: 老", TBSimpleListItemType.NORMAL);
                        } else if (intSharedPreference4 == 1) {
                            tBSimpleListItemArr[7] = new TBSimpleListItem("群聊/新/当前: 新", TBSimpleListItemType.NORMAL);
                            tBSimpleListItemArr[8] = new TBSimpleListItem("群聊/老/当前: 新", TBSimpleListItemType.NORMAL);
                        }
                        tBSimpleListItemArr[9] = new TBSimpleListItem("messageTabV2 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "messageTabV2"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[10] = new TBSimpleListItem("headerTopLocationSimple 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "headerTopLocationSimple"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[11] = new TBSimpleListItem("msgAsyncDx 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "msgAsyncDx"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[12] = new TBSimpleListItem("uiASyncSdkV2 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), WxApplication.KEY_ASYNC_SDK), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[13] = new TBSimpleListItem("closeMessageSdkInit 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "closeMessageSdkInit"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[14] = new TBSimpleListItem("msgChatPreload 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "msgChatPreload"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[15] = new TBSimpleListItem("loadMessageSpeed 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "loadMessageSpeed"), TBSimpleListItemType.NORMAL);
                        tBSimpleListItemArr[16] = new TBSimpleListItem("useLSDBCache 开关值:" + ABGlobal.isFeatureOpened(NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).getContext(), "useLSDBCache"), TBSimpleListItemType.NORMAL);
                        new TBMaterialDialog.Builder(NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).getContext()).items(tBSimpleListItemArr).itemsCallback(new TBMaterialDialog.ListCallback() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.5.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.ListCallback
                            public void onSelection(TBMaterialDialog tBMaterialDialog, View view, int i2, TBSimpleListItem tBSimpleListItem) {
                                IpChange ipChange4 = $ipChange;
                                if (ipChange4 instanceof IpChange) {
                                    ipChange4.ipc$dispatch("72c1a54f", new Object[]{this, tBMaterialDialog, view, new Integer(i2), tBSimpleListItem});
                                    return;
                                }
                                if (i2 == 0) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraCC", -1);
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraPlatform", -1);
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraBC", -1);
                                    SharedPreferencesUtil.addIntSharedPreference("messageOldFrmPanel", -1);
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraGroup", -1);
                                } else if (i2 == 1) {
                                    SharedPreferencesUtil.addIntSharedPreference("testPlatform7days", 1);
                                } else if (i2 == 2) {
                                    SharedPreferencesUtil.addIntSharedPreference("testPlatform7days", 0);
                                } else if (i2 == 3) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraBC", 1);
                                } else if (i2 == 4) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraBC", 0);
                                } else if (i2 == 5) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageOldFrmPanel", 1);
                                } else if (i2 == 6) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageOldFrmPanel", 0);
                                } else if (i2 == 7) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraGroup", 1);
                                } else if (i2 == 8) {
                                    SharedPreferencesUtil.addIntSharedPreference("messageAuraGroup", 0);
                                }
                                tBMaterialDialog.dismiss();
                            }
                        }).show();
                    }
                });
            }
        });
        this.swipeRefreshLayout.setOnPushLoadMoreListener(new TBSwipeRefreshLayout.OnPushLoadMoreListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onPushDistance(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMore() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4a87be1", new Object[]{this});
                } else {
                    NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setLoadMore(true);
                }
            }
        });
        WidgetInstance widgetInstance = this.navigatorWidgetInstance;
        if (widgetInstance == null) {
            this.navigatorWidgetInstance = createSlotWidgetIfNotExist("navigator");
            WidgetInstance widgetInstance2 = this.navigatorWidgetInstance;
            if (widgetInstance2 != null) {
                bindSubViewData(widgetInstance2, "navigator");
                if (this.navigatorWidgetInstance.getView() != null) {
                    this.navigatorWidgetInstance.getView().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            }
                        }
                    });
                    this.navigatorLayout.addView(this.navigatorWidgetInstance.getView(), -1, -2);
                }
            }
        } else {
            bindSubViewData(widgetInstance, "navigator");
        }
        SectionListWidgetInstance sectionListWidgetInstance = this.contentWidgetInstance;
        if (sectionListWidgetInstance == null) {
            this.contentWidgetInstance = (SectionListWidgetInstance) createSlotWidgetIfNotExist("content");
            SectionListWidgetInstance sectionListWidgetInstance2 = this.contentWidgetInstance;
            if (sectionListWidgetInstance2 != null) {
                bindSubViewData(sectionListWidgetInstance2, "content");
                if (this.contentWidgetInstance.getView() != null) {
                    this.headWidgetInstance = this.contentWidgetInstance.getHeader();
                    View view = this.contentWidgetInstance.getView();
                    this.swipeRefreshFrameLayout.addView(view, -1, -1);
                    if (view instanceof TRecyclerView) {
                        this.recyclerView = (TRecyclerView) view;
                        final PaddingSupportDrawable paddingSupportDrawable = new PaddingSupportDrawable();
                        this.recyclerView.setBackgroundDrawable(paddingSupportDrawable);
                        this.recyclerView.setOverScrollMode(2);
                        this.recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.message.sp.category.widget.-$$Lambda$NewCategoryPageInstance$X20HKSoNjabF-fRxTesuWbiMkHU
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                NewCategoryPageInstance.this.lambda$bindData$0$NewCategoryPageInstance(paddingSupportDrawable, view2, i2, i3, i4, i5, i6, i7, i8, i9);
                            }
                        });
                        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i2)});
                                }
                            }

                            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                                } else if (NewCategoryPageInstance.access$400(NewCategoryPageInstance.this) == null) {
                                } else {
                                    float computeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() / NewCategoryPageInstance.access$500(NewCategoryPageInstance.this)) + 0.7f;
                                    if (computeVerticalScrollOffset > 1.0f) {
                                        computeVerticalScrollOffset = 1.0f;
                                    }
                                    NewCategoryPageInstance.access$400(NewCategoryPageInstance.this).setAlpha(computeVerticalScrollOffset);
                                    if (recyclerView.computeVerticalScrollOffset() <= 0) {
                                        return;
                                    }
                                    NewCategoryPageInstance.access$400(NewCategoryPageInstance.this).setVisibility(0);
                                }
                            }
                        });
                        if (this.isCrowd && this.stickyHeader && "1".equals(ConfigUtil.getValue("mpm_business_switch", "msgTabStickyHeader", "1"))) {
                            this.stickyHeaderOnScrollListener = new StickyHeaderOnScrollListener(this.swipeRefreshFrameLayout, this.recyclerView, this.headWidgetInstance);
                            this.recyclerView.addOnScrollListener(this.stickyHeaderOnScrollListener);
                        }
                    }
                }
            }
        } else {
            bindSubViewData(sectionListWidgetInstance, "content");
        }
        dealStickyHead();
    }

    public /* synthetic */ void lambda$bindData$0$NewCategoryPageInstance(PaddingSupportDrawable paddingSupportDrawable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d00f219", new Object[]{this, paddingSupportDrawable, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            considerRefreshBgDrawable(this.recyclerView, paddingSupportDrawable);
        }
    }

    private void considerRefreshBgDrawable(TRecyclerView tRecyclerView, PaddingSupportDrawable paddingSupportDrawable) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a903f0", new Object[]{this, tRecyclerView, paddingSupportDrawable});
        } else if (!(tRecyclerView.getLayoutManager() instanceof LinearLayoutManager) || (findViewHolderForAdapterPosition = tRecyclerView.findViewHolderForAdapterPosition(((LinearLayoutManager) tRecyclerView.getLayoutManager()).findLastVisibleItemPosition())) == null || findViewHolderForAdapterPosition.itemView == null) {
        } else {
            paddingSupportDrawable.setPaddingTop(findViewHolderForAdapterPosition.itemView.getBottom());
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        if (this.broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.frameLayout.getContext()).unregisterReceiver(this.broadcastReceiver);
            this.broadcastReceiver = null;
        }
        if (this.themeBroadcastReceiver != null) {
            ApplicationUtil.getApplication().unregisterReceiver(this.themeBroadcastReceiver);
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).unregisterReceiver(this.themeBroadcastReceiver);
            this.themeBroadcastReceiver = null;
        }
        if (this.elderFontChangeReceiver != null) {
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).unregisterReceiver(this.elderFontChangeReceiver);
            this.elderFontChangeReceiver = null;
        }
        StickyHeaderOnScrollListener stickyHeaderOnScrollListener = this.stickyHeaderOnScrollListener;
        if (stickyHeaderOnScrollListener == null) {
            return;
        }
        stickyHeaderOnScrollListener.onDispose();
    }

    private void considerSubscribeElderFontChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123e0b3f", new Object[]{this});
        } else if (!TextUtils.equals("1", ConfigUtil.getValue("mpm_business_switch", "subscribeElderFontChangeEnableV2", "0"))) {
        } else {
            this.elderFontChangeReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (NewCategoryPageInstance.access$600(NewCategoryPageInstance.this) == null) {
                    } else {
                        NewCategoryPageInstance.access$600(NewCategoryPageInstance.this).refreshView();
                    }
                }
            };
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).registerReceiver(this.elderFontChangeReceiver, new IntentFilter(b.ACTION_TBELDER_VALUE_CHANGED));
        }
    }

    private void dealStickyHead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bd9afc", new Object[]{this});
        } else if (this.stickyHeaderOnScrollListener != null) {
            try {
                JSONArray jSONArray = ((JSONObject) ((JSONObject) ((ViewObject) ((List) ((ViewObject) this.contentWidgetInstance.getViewObject().children.get("header")).children.get(Constants.Slot.DEF_SLOT)).get(0)).data).getJSONObject("operationArea").getJSONArray("subContainerList").get(0)).getJSONArray(BaseWVApiPlugin.RESOURCE_LIST_KEY).getJSONObject(0).getJSONObject("resData").getJSONArray("list");
                int i = 0;
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int intValue = jSONObject.getInteger("tipNumber").intValue();
                    if (jSONObject.getInteger("tipType").intValue() == 0) {
                        i += intValue;
                    }
                }
                if (i > 0 && i > this.platformUnreadCont) {
                    TLog.loge(TAG, " count " + i);
                    this.stickyHeaderOnScrollListener.stickyHeaderTop();
                } else if (this.platformUnreadCont != 0 && i == 0) {
                    this.stickyHeaderOnScrollListener.cancelStickyHeader();
                }
                this.platformUnreadCont = i;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
