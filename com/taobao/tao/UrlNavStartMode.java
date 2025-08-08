package com.taobao.tao;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.tao.util.NavUrls;
import tb.kge;
import tb.mbn;

/* loaded from: classes8.dex */
public class UrlNavStartMode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FEATURE_1010 = "feature1010";
    private static final String GROUP_NAME = "client_wswitch_12278902";
    private static final String MODE_CART = "cart";
    private static final String MODE_DETAIL = "detail";
    private static final String MODE_SEARCH = "search";
    public static final String TAG = "UrlNavStartMode";

    static {
        kge.a(946289841);
    }

    public static void startSearchHome(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aeff624", new Object[]{bundle});
            return;
        }
        Uri parse = Uri.parse(NavUrls.NAV_URL_SEARCH_HOME);
        if (!Nav.from(Globals.getApplication()).withExtras(bundle).toUri(parse)) {
            NavToBrowser(Globals.getApplication(), parse);
        }
        TBS.Ext.commitEvent("Page_Nav", Constants.EventID_STAT_1010, "startSearchHome:");
    }

    public static void startSearchList(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1812912a", new Object[]{str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
            android.taobao.util.k.a(TAG, "startSearchList key error");
        } else {
            String format = String.format(i == 1 ? NavUrls.nav_urls_auction_search[1] : NavUrls.nav_urls_shop_search[1], MyUrlEncoder.encod(str, "UTF-8"));
            Uri parse = Uri.parse(format);
            if (!Nav.from(Globals.getApplication()).toUri(format)) {
                NavToBrowser(Globals.getApplication(), parse);
            }
            int i2 = Constants.EventID_STAT_1010;
            TBS.Ext.commitEvent("Page_Nav", i2, "startSearchLis:" + format);
        }
    }

    public static void startSearchListWithFinish(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a2df1", new Object[]{str, new Integer(i)});
        } else {
            startSearchList(str, i);
        }
    }

    public static boolean startDetailActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82d99897", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            android.taobao.util.k.a(TAG, "startDetailActivity detail id error");
            return false;
        }
        String format = String.format(NavUrls.nav_urls_detail[3], str);
        Uri parse = Uri.parse(format);
        if (!Nav.from(Globals.getApplication()).toUri(parse)) {
            NavToBrowser(Globals.getApplication(), parse);
        }
        int i = Constants.EventID_STAT_1010;
        TBS.Ext.commitEvent("Page_Nav", i, "startDetailActivity：" + format);
        return true;
    }

    public static boolean startDetailActivity(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a43ee3a1", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            android.taobao.util.k.a(TAG, "startDetailActivity detail id error");
            return false;
        }
        if (StringUtils.isEmpty(str2)) {
            startDetailActivity(str);
        }
        String format = String.format(NavUrls.nav_urls_detail[4], str, str2);
        Uri parse = Uri.parse(format);
        if (!Nav.from(Globals.getApplication()).toUri(parse)) {
            NavToBrowser(Globals.getApplication(), parse);
        }
        int i = Constants.EventID_STAT_1010;
        TBS.Ext.commitEvent("Page_Nav", i, "startDetailActivity：" + format);
        return true;
    }

    public static void startWithUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca08b58", new Object[]{str});
            return;
        }
        Uri parse = Uri.parse(str);
        if (!Nav.from(Globals.getApplication()).toUri(parse)) {
            NavToBrowser(Globals.getApplication(), parse);
        }
        int i = Constants.EventID_STAT_1010;
        TBS.Ext.commitEvent("Page_Nav", i, "startWithUrl：" + str);
    }

    public static void startCart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e51629", new Object[0]);
            return;
        }
        String str = NavUrls.NAV_URL_CART_BASE[0] + "?ttid=" + TaoPackageInfo.getTTID() + "#!/awp/base/cart.htm";
        Uri parse = Uri.parse(str);
        if (!Nav.from(Globals.getApplication()).toUri(parse)) {
            NavToBrowser(Globals.getApplication(), parse);
        }
        TBS.Ext.commitEvent("Page_Nav", Constants.EventID_STAT_1010, "startCart：" + str);
    }

    public static boolean checkSearchMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2117199e", new Object[0])).booleanValue();
        }
        boolean checkConfig = checkConfig("search");
        TBS.Ext.commitEvent(FEATURE_1010, 29007, Integer.valueOf(checkConfig ? 1 : 0));
        return checkConfig;
    }

    public static boolean checkDetailMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ee21347", new Object[0])).booleanValue();
        }
        boolean checkConfig = checkConfig("detail");
        TBS.Ext.commitEvent(FEATURE_1010, 29008, Integer.valueOf(checkConfig ? 1 : 0));
        return checkConfig;
    }

    public static boolean checkCartMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c0e116", new Object[0])).booleanValue();
        }
        boolean checkConfig = checkConfig("cart");
        TBS.Ext.commitEvent(FEATURE_1010, 29006, Integer.valueOf(checkConfig ? 1 : 0));
        return checkConfig;
    }

    private static boolean checkConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29f89d7f", new Object[]{str})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", str, "false");
            if (StringUtils.isEmpty(config)) {
                return false;
            }
            return "true".equals(config);
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    public static void NavToBrowser(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330b3b30", new Object[]{context, uri});
        } else {
            Nav.from(context).skipPreprocess().withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(uri);
        }
    }
}
