package com.taobao.tao.combo;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.application.ShopApplication;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Properties;
import tb.kge;

/* loaded from: classes8.dex */
public class ShopComboActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ShopComboController f19864a;

    static {
        kge.a(358774662);
    }

    public static /* synthetic */ Object ipc$super(ShopComboActivity shopComboActivity, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ShopApplication.a();
        super.onCreate(bundle);
        setContentView(R.layout.shop_combo_main_activity_layout);
        this.f19864a = new ShopComboController(this);
        a("Page_ShopcollocationDetail");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ShopComboController shopComboController = this.f19864a;
        if (shopComboController == null) {
            return;
        }
        shopComboController.onResume();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ShopComboController shopComboController = this.f19864a;
        if (shopComboController != null) {
            shopComboController.onPause();
        }
        super.onPause();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ShopComboController shopComboController = this.f19864a;
        if (shopComboController != null) {
            shopComboController.onDestory();
        }
        this.f19864a = null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, str);
            setUTPageName(str);
        }
    }

    public void a(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbb9964", new Object[]{this, properties});
            return;
        }
        TBS.Page.updatePageProperties(getUTClassName(), properties);
        TBS.EasyTrace.updateEasyTraceActivityProperties(getActivity(), properties);
    }
}
