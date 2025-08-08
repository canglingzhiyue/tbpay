package com.taobao.login4android.uti;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.helper.INavHelper;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.alibaba.wireless.aliprivacyext.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PrivacyUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG;

    static {
        kge.a(-1052411033);
        TAG = "login.Privacy";
    }

    public static Map<String, String> showPrivacy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5358db87", new Object[0]);
        }
        try {
            d.a a2 = new d().a(DataProviderFactory.getApplicationContext());
            if (a2 == null) {
                LoginTLogAdapter.e(TAG, "config is null");
                return null;
            }
            String a3 = a2.a();
            String c = a2.c();
            boolean b = a2.b();
            HashMap hashMap = new HashMap();
            LoginTLogAdapter.e(TAG, a2.toString());
            hashMap.put("isShow", String.valueOf(b));
            hashMap.put("entranceName", a3);
            hashMap.put("h5Url", c);
            return hashMap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list, final BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f19027", new Object[]{bottomMenuFragment, list, baseLoginFragment});
            return;
        }
        Map<String, String> showPrivacy = showPrivacy();
        if (showPrivacy == null) {
            return;
        }
        String str = showPrivacy.get("entranceName");
        final String str2 = showPrivacy.get("h5Url");
        if (!"true".equals(showPrivacy.get("isShow")) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || list == null || bottomMenuFragment == null || baseLoginFragment == null) {
            return;
        }
        MenuItem menuItem = new MenuItem();
        menuItem.setText(str);
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.taobao.login4android.uti.PrivacyUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem2) {
                if (baseLoginFragment.isActive()) {
                    Context applicationContext = DataProviderFactory.getApplicationContext();
                    if (AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().getNavHelper() == null) {
                        PrivacyUtil.startUrl(applicationContext, str2);
                        return;
                    }
                    try {
                        ((INavHelper) AliUserLogin.getAppreanceExtentions().getNavHelper().newInstance()).navTo(applicationContext, str2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        PrivacyUtil.startUrl(applicationContext, str2);
                    }
                }
            }
        });
        list.add(menuItem);
    }

    public static void startUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4190f5e", new Object[]{context, str});
            return;
        }
        try {
            if (ServiceFactory.getService(NavigatorService.class) == null) {
                return;
            }
            UrlParam urlParam = new UrlParam();
            urlParam.url = str;
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
