package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.MenuContract;
import com.taobao.uikit.actionbar.PublicMenuAdapterV2;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.actionbar.util.Tools;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class PublicMenuPresenter implements MenuContract.ActionBarBasePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_TOGETHER_NOT_FIRST_TIME_NAME = "shop_together_first_time";
    private static final String TAG = "PublicMenuPresenter";
    private static final String TITLE_REG = "[^一-龥]";
    private final PublicMenuAdapterV2 defaultAdapter = new PublicMenuAdapterV2();
    private final PublicMenuAdapterV2 externAdapter;
    private final PublicMenuAdapterV2.ItemAction itemAction;
    private final WeakReference<Activity> mActivity;
    private final TBPublicMenu mMenu;
    public ShareContentCallBack mShareContentCallBack;
    public final TBPublicMenuData mTbPublicMenuData;
    private final MenuContract.ActionBarBaseView mView;
    private MenuItemActions onMenuItemActions;
    private final PublicMenuAdapterV2 shareAdapter;

    /* loaded from: classes9.dex */
    public interface MenuItemActions {
        boolean isItemVisible(int i);

        void onItemExposed(TBPublicMenuItem tBPublicMenuItem, String str);

        void onMenuHidden();

        void onMenuShown();

        void onShareMenuClear();
    }

    static {
        kge.a(-1265608594);
        kge.a(-1316428101);
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdadffec", new Object[]{this, shareContentCallBack, new Boolean(z)});
        }
    }

    public void showMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1e758d", new Object[]{this, new Integer(i)});
        }
    }

    public void showMenuItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf4c80", new Object[]{this, str});
        }
    }

    public static /* synthetic */ MenuItemActions access$000(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItemActions) ipChange.ipc$dispatch("3e3ccaf8", new Object[]{publicMenuPresenter}) : publicMenuPresenter.onMenuItemActions;
    }

    public static /* synthetic */ void access$100(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f27839", new Object[]{publicMenuPresenter});
        } else {
            publicMenuPresenter.notifyMenuHidden();
        }
    }

    public static /* synthetic */ void access$200(PublicMenuPresenter publicMenuPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f346cd7a", new Object[]{publicMenuPresenter});
        } else {
            publicMenuPresenter.clearExternalObserver();
        }
    }

    public void setOnMenuItemActions(MenuItemActions menuItemActions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100b5a4b", new Object[]{this, menuItemActions});
        } else {
            this.onMenuItemActions = menuItemActions;
        }
    }

    public PublicMenuPresenter(TBPublicMenuData tBPublicMenuData, MenuContract.ActionBarBaseView actionBarBaseView, TBPublicMenu tBPublicMenu, Activity activity, ShareContentCallBack shareContentCallBack) {
        this.mTbPublicMenuData = tBPublicMenuData;
        this.mView = actionBarBaseView;
        this.mMenu = tBPublicMenu;
        this.mActivity = new WeakReference<>(activity);
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem == null || !tBPublicMenuItem.isMenuNeedToBeClosed()) {
                } else {
                    PublicMenuPresenter.this.close();
                    MenuMonitor.countSucceed("item_nav");
                }
            }
        };
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem == null) {
                } else {
                    MenuMonitor.countSucceed(Tools.subTitle(tBPublicMenuItem.getTitle()) + "_item_clicked");
                }
            }
        };
        this.defaultAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        this.defaultAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener2);
        this.shareAdapter = new PublicMenuAdapterV2();
        this.shareAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        this.externAdapter = new PublicMenuAdapterV2();
        addOnExternMenuClickListener(tBOnPublicMenuClickListener);
        this.externAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener2);
        this.mView.addMenuAdapter(1, this.defaultAdapter);
        this.mView.addMenuAdapter(0, this.shareAdapter);
        this.mView.addMenuAdapter(2, this.externAdapter);
        this.mShareContentCallBack = shareContentCallBack;
        this.itemAction = new PublicMenuAdapterV2.ItemAction() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.PublicMenuAdapterV2.ItemAction
            public void onItemExposure(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6a42d0a6", new Object[]{this, tBPublicMenuItem});
                } else if (PublicMenuPresenter.access$000(PublicMenuPresenter.this) == null) {
                } else {
                    PublicMenuPresenter.access$000(PublicMenuPresenter.this).onItemExposed(tBPublicMenuItem, PublicMenuPresenter.this.mTbPublicMenuData.getMenuIdentifies());
                }
            }
        };
    }

    private void notifyMenuShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88b35b0", new Object[]{this});
            return;
        }
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions == null) {
            return;
        }
        menuItemActions.onMenuShown();
    }

    private void notifyMenuHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61b399", new Object[]{this});
            return;
        }
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions == null) {
            return;
        }
        menuItemActions.onMenuHidden();
    }

    private void clearExternalObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4f9db5", new Object[]{this});
        } else {
            this.externAdapter.removeAllExternalObservers();
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void notifyMenuChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ec3d3", new Object[]{this});
            return;
        }
        dealWithMenuData();
        this.mView.notifyMenuChanged();
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mView.onPause();
        }
    }

    public void initShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
            return;
        }
        Object obj = null;
        ShareContentCallBack shareContentCallBack = this.mShareContentCallBack;
        if (shareContentCallBack != null) {
            obj = shareContentCallBack.getQueryShareParameters();
        } else if (this.mActivity.get() instanceof ShareContentCallBack) {
            obj = ((ShareContentCallBack) this.mActivity.get()).getQueryShareParameters();
        }
        TBPublicMenu.InitShareCallBack initShareCallBack = TBPublicMenu.getInitShareCallBack();
        if (initShareCallBack == null) {
            return;
        }
        initShareCallBack.callBack(this.mActivity.get(), this.mMenu, obj);
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void show(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde08a02", new Object[]{this, tBActionView});
            return;
        }
        MenuMonitor.countSucceed("presenter_show_menu");
        initShare();
        dealWithMenuData();
        messageTrack(this.mTbPublicMenuData.getDefaultPublicMenus());
        this.defaultAdapter.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    if (i == 1) {
                        return;
                    }
                    return;
                }
                String currentPageName = l.getInstance().getCurrentPageName();
                if (StringUtils.isEmpty(currentPageName)) {
                    return;
                }
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_Access_toolslide");
                uTCustomHitBuilder.setEventPage(currentPageName);
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            }
        });
        this.shareAdapter.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    if (i == 1) {
                        return;
                    }
                    return;
                }
                String currentPageName = l.getInstance().getCurrentPageName();
                if (StringUtils.isEmpty(currentPageName)) {
                    return;
                }
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_Access_shareslide");
                uTCustomHitBuilder.setEventPage(currentPageName);
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            }
        });
        this.mView.registerOnDismissListener(new MenuContract.OnDismissListener() { // from class: com.taobao.uikit.actionbar.PublicMenuPresenter.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.MenuContract.OnDismissListener
            public void onDismiss(MenuContract.ActionBarBaseView actionBarBaseView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d0f549d", new Object[]{this, actionBarBaseView});
                    return;
                }
                PublicMenuPresenter.this.deleteShareIconIfNeed();
                PublicMenuPresenter.access$100(PublicMenuPresenter.this);
                PublicMenuPresenter.access$200(PublicMenuPresenter.this);
            }
        });
        this.mView.show(tBActionView);
        UTWrapper.newMenuExposure(this.mTbPublicMenuData);
        notifyMenuShown();
        this.mTbPublicMenuData.setMenuIdentifies();
    }

    public boolean hasShareMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cd45eef", new Object[]{this})).booleanValue() : (this.mActivity.get() instanceof ShareContentCallBack) || this.mShareContentCallBack != null;
    }

    public boolean isShareItem(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63114fbb", new Object[]{this, tBPublicMenuItem})).booleanValue();
        }
        String title = tBPublicMenuItem.getTitle();
        return !StringUtils.isEmpty(title) && title.contains(b.a(R.string.app_share));
    }

    private void dealWithMenuData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b952e22", new Object[]{this});
            return;
        }
        this.mTbPublicMenuData.resetDefaultMenusUrl();
        List<TBPublicMenuItem> defaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        deleteShareIconIfNeed();
        ArrayList arrayList = new ArrayList(this.mTbPublicMenuData.getCustomMenus());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem tBPublicMenuItem = (TBPublicMenuItem) it.next();
            if (!tBPublicMenuItem.isAddByUikit()) {
                String title = tBPublicMenuItem.getTitle();
                if (isShareItem(tBPublicMenuItem)) {
                    if (!hasShareMenu()) {
                        tBPublicMenuItem.setTitle("ꄪ:" + b.a(R.string.app_share));
                        tBPublicMenuItem.setMessageMode(TBPublicMenuItem.MessageMode.NONE);
                        tBPublicMenuItem.setIconUrl(null);
                        tBPublicMenuItem.setOrder(3);
                        tBPublicMenuItem.setIconDrawable(null);
                        defaultPublicMenus.add(2, tBPublicMenuItem);
                        it.remove();
                        this.defaultAdapter.notifyDataSetChanged();
                    } else {
                        it.remove();
                    }
                }
                String replaceAll = title.replaceAll(TITLE_REG, "");
                if (!StringUtils.isEmpty(replaceAll) && replaceAll.equals(b.a(R.string.taobao_app_1012_1_16460))) {
                    it.remove();
                }
            }
        }
        if (!defaultPublicMenus.isEmpty()) {
            this.defaultAdapter.setDataSet(defaultPublicMenus);
        }
        this.externAdapter.setDataSet(arrayList, true);
        this.shareAdapter.setDataSet(this.mTbPublicMenuData.getShareMenus());
        this.shareAdapter.setItemAction(this.itemAction);
    }

    private void messageTrack(List<TBPublicMenuItem> list) {
        String currentPageName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227226fc", new Object[]{this, list});
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem.getId() == R.id.uik_menu_wangxin) {
                String message = tBPublicMenuItem.getMessage();
                if (message == null || (currentPageName = l.getInstance().getCurrentPageName()) == null) {
                    return;
                }
                TBS.Ext.commitEvent(currentPageName, 2201, "Page_Access_window_messagenumber", null, null, "message=" + message);
                return;
            }
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBasePresenter
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.mView.close();
        }
    }

    public void deleteShareIconIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708429c7", new Object[]{this});
            return;
        }
        List<TBPublicMenuItem> defaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        if (defaultPublicMenus == null) {
            return;
        }
        Iterator<TBPublicMenuItem> it = defaultPublicMenus.iterator();
        while (it.hasNext()) {
            String title = it.next().getTitle();
            if (!StringUtils.isEmpty(title) && title.contains(b.a(R.string.app_share))) {
                it.remove();
            }
        }
    }

    public void addOnDefaultMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb863f3", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.defaultAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void addOnShareMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea6411", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.shareAdapter.addCustomizeCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void clearShareMenuListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9bf0b5", new Object[]{this});
            return;
        }
        this.shareAdapter.clearCustomizeClickListeners();
        MenuItemActions menuItemActions = this.onMenuItemActions;
        if (menuItemActions == null) {
            return;
        }
        menuItemActions.onShareMenuClear();
    }

    public void addOnExternMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db34192", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.externAdapter.addOnItemCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void clearAllExternMenuClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb20c51", new Object[]{this});
            return;
        }
        this.externAdapter.clearOnItemClickListeners();
        this.externAdapter.clearCustomizeClickListeners();
    }

    public void addCustomizeExternalMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559797bf", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.externAdapter.addCustomizeCLickListener(tBOnPublicMenuClickListener);
        }
    }

    public void clearCustomizeExternalMenuClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32198a1e", new Object[]{this});
        } else {
            this.externAdapter.clearCustomizeClickListeners();
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
        } else {
            this.mTbPublicMenuData.addShareMenus(list);
        }
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mTbPublicMenuData.cleanShareMenus();
        }
    }

    public void addExternalMenuCustomiseItems(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0f3759", new Object[]{this, list});
        } else {
            this.mTbPublicMenuData.addCustomMenus(list);
        }
    }

    public void cleanExternMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96ffc32", new Object[]{this});
        } else {
            this.mTbPublicMenuData.cleanExternMenus();
        }
    }

    public void clearExternalCustomiseItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be1755", new Object[]{this});
        } else {
            this.mTbPublicMenuData.clearExternalCustomiseItems();
        }
    }

    public TBPublicMenuData getMenuData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenuData) ipChange.ipc$dispatch("9512e905", new Object[]{this}) : this.mTbPublicMenuData;
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68afe8", new Object[]{this, shareContentCallBack});
        } else {
            this.mShareContentCallBack = shareContentCallBack;
        }
    }
}
