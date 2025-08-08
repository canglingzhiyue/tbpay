package com.taobao.android.shop.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.taobao.TBActionBar;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.application.ShopApplication;
import com.taobao.android.shop.features.category.MCategoryController;
import com.taobao.android.shop.features.category.d;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselViewFragment;
import com.taobao.vessel.utils.VesselType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import tb.hyt;
import tb.ixk;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopCategoryActivity extends CustomBaseActivity implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f15072a;
    private MCategoryController b;
    private String c;
    private String d;
    private String e;
    private String f;

    public static /* synthetic */ Object ipc$super(ShopCategoryActivity shopCategoryActivity, String str, Object... objArr) {
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    static {
        kge.a(-715577059);
        kge.a(783735063);
        f15072a = !ShopCategoryActivity.class.desiredAssertionStatus();
    }

    public static /* synthetic */ void a(ShopCategoryActivity shopCategoryActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86cf626", new Object[]{shopCategoryActivity, str});
        } else {
            shopCategoryActivity.b(str);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ShopApplication.a();
        super.onCreate(bundle);
        getSupportActionBar().a("宝贝分类");
        setContentView(R.layout.tshop_cat_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.d = extras.getString("shop_id");
            this.c = extras.getString("user_id");
            this.f = extras.getString("searchTips");
            this.e = extras.getString("searchWord");
        }
        a(getIntent().getData());
        this.b = new MCategoryController(this, (ViewGroup) findViewById(R.id.shop_category_root_view), this.c, this.d);
        this.b.setCategorySelectionListener(this);
        this.b.startRequest();
        getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.android.shop.activity.ShopCategoryActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    new Handler().post(new Runnable() { // from class: com.taobao.android.shop.activity.ShopCategoryActivity.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ShopCategoryActivity.a(ShopCategoryActivity.this, "Page_Shop_Category");
                            ixk.a("a2141.7666909");
                        }
                    });
                }
            }
        });
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (FestivalMgr.a().a("global")) {
            a();
        }
        b("Page_Shop_Category");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FestivalMgr a2 = FestivalMgr.a();
        ActionBar supportActionBar = getSupportActionBar();
        if (!f15072a && supportActionBar == null) {
            throw new AssertionError();
        }
        a2.a(this, TBActionBar.ActionBarStyle.NORMAL);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MCategoryController mCategoryController = this.b;
        if (mCategoryController != null) {
            mCategoryController.destroy();
        }
        super.onDestroy();
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle.putString("pageName", "n_shopgoodscategory");
        String str = this.d;
        if (str == null) {
            str = "0";
        }
        bundle.putString("shopId", str);
        bundle2.putBundle(hyt.ZZB_BUNDLE_KEY, bundle);
        return bundle2;
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        if (this.d == null) {
            this.d = uri.getQueryParameter("shop_id");
        }
        if (this.c != null) {
            return;
        }
        this.c = uri.getQueryParameter("user_id");
    }

    @Override // com.taobao.android.shop.features.category.d
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b(str, str2);
        }
    }

    @Override // com.taobao.android.shop.features.category.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            c(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            setUTPageName(str);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.updatePageName(this, str);
            HashMap hashMap = new HashMap();
            hashMap.put("shop_id", this.d);
            hashMap.put("seller_id", this.c);
            hashMap.put("spm-cnt", "a2141.7666909");
            defaultTracker.updatePageProperties(this, hashMap);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("user_id", this.c);
        bundle.putString("shop_id", this.d);
        bundle.putString("catId", str);
        bundle.putString("catText", str2);
        bundle.putString("searchTips", this.f);
        bundle.putString("searchWord", this.e);
        bundle.putString("from", "category");
        Nav.from(this).withExtras(bundle).toUri("https://shop.m.taobao.com/goods/index.htm");
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        VesselViewFragment newInstance = VesselViewFragment.newInstance();
        newInstance.loadUrl(VesselType.Weex, str, null);
        a(newInstance, R.id.weex_container);
    }

    private void a(Fragment fragment, int i) {
        FragmentTransaction beginTransaction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1a4af9", new Object[]{this, fragment, new Integer(i)});
        } else if (fragment == null || (beginTransaction = getSupportFragmentManager().beginTransaction()) == null) {
        } else {
            beginTransaction.replace(i, fragment);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
