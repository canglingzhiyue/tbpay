package com.taobao.monitor.adapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.mpe;

/* loaded from: classes7.dex */
public class TMAPMInitiator extends AbsAPMInitiator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TMAPMInitiator tMAPMInitiator, String str, Object... objArr) {
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
        mpe.a("com.tmall.wireless.splash.TMSplashActivity");
        mpe.a("com.taobao.bootimage.activity.BootImageActivity");
        mpe.a("com.taobao.linkmanager.AlibcEntranceActivity");
        mpe.a("com.taobao.linkmanager.AlibcOpenActivity");
        mpe.a("com.taobao.linkmanager.AlibcTransparentActivity");
        mpe.a("com.taobao.linkmanager.AlibcWindvaneCompatActivity");
        mpe.a("com.taobao.linkmanager.AlibcAuthActivity");
        mpe.d("com.tmall.wireless.homepage.activity.TMHomePageActivity");
        mpe.d("com.tmall.wireless.detail.ui.TMItemDetailsActivity");
        mpe.d("com.tmall.wireless.maintab.module.TMMainTabActivity");
        mpe.d("com.tmall.wireless.mytmall.ui.TMMtmallActivityA");
        mpe.d("com.tmall.wireless.messagebox.activity.TMMsgboxCategoryActivity");
        mpe.d("com.tmall.wireless.shop.TMShopActivity");
        mpe.d("com.tmall.wireless.minidetail.activity.TMMiniDetailActivity");
        mpe.d("com.taobao.message.accounts.activity.AccountActivity");
        mpe.d("com.taobao.android.shop.activity.ShopHomePageActivity");
        mpe.d("com.taobao.weex.WXActivity");
        mpe.d("com.taobao.android.trade.cart.CartActivity");
        mpe.d("com.tmall.wireless.login.TMLoginActivity");
    }
}
