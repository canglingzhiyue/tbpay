package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* loaded from: classes6.dex */
public class hxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-352146910);
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        String str = null;
        if (intent == null) {
            return null;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
                if (TextUtils.isEmpty(str)) {
                    str = intent.getStringExtra("orderId");
                }
            }
        } catch (Exception unused) {
        }
        Uri data = intent.getData();
        if (data == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
        }
        String str2 = queryParameter;
        return TextUtils.isEmpty(str2) ? data.getQueryParameter("orderId") : str2;
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        } catch (Exception unused) {
        }
        if (intent.getData() == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(queryParameter) ? intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : queryParameter;
    }

    public static String c(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("249b0259", new Object[]{intent}) : intent == null ? "" : intent.getStringExtra("from");
    }

    public static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de128ff8", new Object[]{intent}) : intent == null ? "" : intent.getStringExtra("downgradeType");
    }
}
