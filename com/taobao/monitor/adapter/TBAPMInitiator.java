package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;
import tb.lsk;
import tb.mpd;
import tb.mpe;

/* loaded from: classes.dex */
public class TBAPMInitiator extends AbsAPMInitiator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBAPMInitiator tBAPMInitiator, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public /* bridge */ /* synthetic */ void init(Application application, HashMap hashMap) {
        super.init(application, hashMap);
    }

    @Override // com.taobao.monitor.adapter.AbsAPMInitiator
    public void initPage(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41f20d9", new Object[]{this, application});
            return;
        }
        mpe.a("com.taobao.tao.welcome.Welcome");
        mpe.a("com.taobao.bootimage.activity.BootImageActivity");
        mpe.a("com.taobao.linkmanager.afc.TbFlowInActivity");
        mpe.a("com.taobao.tao.detail.activity.DetailActivity");
        mpe.a("com.taobao.tao.ocean.dispatcher.DispatcherManager");
        mpe.a("com.taobao.android.shop.activity.ShopUrlRouterActivity");
        mpe.a("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity");
        mpe.a("com.taobao.message.notification.NotifyJumpActivity");
        mpe.a("com.taobao.android.remoteso.component.RemoActivity");
        mpe.a("com.taobao.appbundle.remote.activity.RemoteLoadingActivity");
        mpe.a("com.taobao.tao.tbmainfragment.TBMainFragment");
        mpe.d("com.taobao.tao.homepage.MainActivity3");
        mpe.d(lsk.BIZ_NAME);
        mpe.d("com.taobao.search.sf.MainSearchResultActivity");
        mpe.d("com.taobao.browser.BrowserActivity");
        mpe.d("com.taobao.android.detail.wrapper.activity.DetailActivity");
        mpe.d("com.taobao.order.detail.ui.OrderDetailActivity");
        mpe.d("com.taobao.message.accounts.activity.AccountActivity");
        mpe.d("com.alibaba.triver.triver_shop.newShop.NativeShopActivity");
        mpe.d("com.alibaba.triver.container.TriverMainActivity");
        mpe.d("com.taobao.android.shop.activity.ShopHomePageActivity");
        mpe.d("com.taobao.weex.WXActivity");
        mpe.d("com.taobao.android.trade.cart.CartActivity");
        mpe.d(e.TAO_LIVE_VIDEO_ACTIVITY);
        mpe.d("com.taobao.android.layoutmanager.container.CommonContainerActivity");
        mpe.d("com.taobao.android.layoutmanager.container.MultiPageContainerActivity");
        mpe.d(e.TAO_LIVE_HOME_ACTIVITY);
        mpe.d("com.taobao.themis.container.app.TMSActivity");
        mpe.j("com.taobao.android.purchase.TBPurchaseActivity");
        mpe.j("com.taobao.order.detail.ui.OrderDetailActivity");
        mpe.a("com.taobao.android.searchbaseframe.business.srp.viewpager.fragment.SearchNativeFragment", true);
        mpe.a("com.taobao.search.sf.MainSearchResultActivity", true);
        mpe.a("com.taobao.order.list.OrderListActivity", true);
        mpe.a("com.taobao.message.category.MsgCenterCategoryFragment", true);
        mpe.a("com.taobao.message.conversation.MessageTabFragment", true);
        mpe.a("com.taobao.android.trade.cart.TabCartFragment", true);
        mpe.a("com.taobao.android.trade.cart.CartActivity", true);
        mpe.a("com.taobao.mytaobao.homepage.MyTaobaoFragment", true);
        mpe.a("TNodeDefaultPageName", true);
        mpe.a("com.taobao.weex.WXActivity", true);
        mpe.a("com.alibaba.aliweex.bundle.WeexPageFragment", true);
        mpe.a("com.taobao.android.detail2.core.framework.NewDetailActivity", true);
        mpe.a("Page_DingYueIndexAll", false);
        mpe.a("com.taobao.search.searchdoor.SearchDoorActivity", true);
        mpe.a("com.etao.feimagesearch.IrpActivity", true);
        mpe.a(e.TAO_LIVE_VIDEO_ACTIVITY, true);
        mpe.a("com.taobao.android.layoutmanager.container.CommonContainerActivity", true);
        mpe.a("com.taobao.android.layoutmanager.container.MultiPageContainerActivity", true);
        mpd.a("com.taobao.android.purchase.TBPurchaseActivity", 0.28f);
        mpd.a("com.taobao.order.detail.ui.OrderDetailActivity", 0.35f);
        mpe.f("com.taobao.tao.tbmainfragment.TBMainFragment");
        mpe.h("com.taobao.tao.welcome.Welcome");
        mpe.h(lsk.BIZ_NAME);
        mpe.h("com.taobao.browser.BrowserActivity");
        mpe.h(BundleSplitUtil.ACTIVITY_NAME);
        mpe.h("com.taobao.android.detail.wrapper.activity.DetailActivity");
        mpe.h("com.alibaba.triver.container.TriverMainActivity");
        mpe.h("com.taobao.android.order.bundle.TBOrderListActivity");
        mpe.h("com.taobao.android.order.bundle.TBOrderDetailActivity");
        mpe.h("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity");
        mpe.h("com.alibaba.triver.triver_shop.newShop.NativeShopActivity");
        mpe.h(e.TAO_LIVE_HOME_ACTIVITY);
        mpe.h("com.taobao.themis.container.app.TMSActivity");
        mpe.h("com.taobao.pha.tb.tabcontainer.TabFrameActivity");
        mpe.h("com.taobao.android.auth.AuthEntranceActivity");
        mpe.h("com.alibaba.triver.triver_shop.newShop.ShopActivity");
        mpe.n("Page_DingYueIndexAll");
        mpe.n("com.taobao.tao.homepage.HomepageFragment");
        mpe.n("com.taobao.android.icart.UltronICartFragment");
        mpe.n("com.taobao.mytaobao.homepage.MyTaobaoFragment");
        mpe.n("com.taobao.message.conversation.MessageTabFragment");
    }
}
