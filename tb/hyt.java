package tb;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.g;

/* loaded from: classes6.dex */
public class hyt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZZB_BUNDLE_KEY = "ZSUserHelper";
    public static final String ZZB_PARAM_DETAIL_VALUE = "orderId";
    public static final String ZZB_PARAM_LIST_TAB_KEY = "tab";
    public static final String ZZB_PARAM_LIST_TAB_VALUE = "all";
    public static final String ZZB_PARAM_PAGE_KEY = "pageName";
    public static final String ZZB_PARAM_PAGE_VALUE = "n_Page_%s";

    static {
        kge.a(1750461424);
    }

    public static Bundle a(g.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("5fc8d3", new Object[]{aVar, str});
        }
        Bundle bundle = new Bundle();
        if (StringUtils.isEmpty(str)) {
            if (aVar == null) {
                return bundle;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", String.format(ZZB_PARAM_PAGE_VALUE, "OrderList"));
            bundle2.putString("tab", aVar.g());
            bundle.putBundle(ZZB_BUNDLE_KEY, bundle2);
            return bundle;
        }
        try {
            Bundle bundle3 = new Bundle();
            JSONObject parseObject = JSONObject.parseObject(str);
            for (String str2 : parseObject.keySet()) {
                bundle3.putString(str2, parseObject.getString(str2));
            }
            bundle.putBundle(ZZB_BUNDLE_KEY, bundle3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bundle;
    }

    public static Bundle a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("af8b1c6e", new Object[]{context, str});
        }
        Bundle bundle = new Bundle();
        if (context != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", String.format(ZZB_PARAM_PAGE_VALUE, "OrderDetail"));
            bundle2.putString("orderId", str);
            bundle.putBundle(ZZB_BUNDLE_KEY, bundle2);
        }
        return bundle;
    }
}
