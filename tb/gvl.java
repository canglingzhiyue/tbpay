package tb;

import android.content.Context;
import com.ali.user.mobile.utils.DeviceUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes4.dex */
public class gvl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_LARGESCREENSTYLE_VAL = "address_largescreenstyle";
    public static final String ORANGE_POP_LARGESCREENSTYLE_VAL = "more_address_largescreenstyle";
    public static final String TAG = "address.AddressNavUtils";

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : a(context, ORANGE_LARGESCREENSTYLE_VAL, str);
    }

    public static String a(Context context, String str, String str2) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        try {
            String str3 = e.LARGE_SCREEN_STYLE_KEY + "=" + OrangeConfig.getInstance().getConfig("receiverAddressConfig", str, DeviceUtils.isPortraitStatus(context) ? "fullscreen" : "split");
            if (str2.contains("?")) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("&");
                sb.append(str3);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("?");
                sb.append(str3);
            }
            str2 = sb.toString();
            AdapterForTLog.logd(TAG, "preHandleUri " + str2);
            dof.a("addressUrl", str2, "", null);
            return str2;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "preHandleUri error dump", th);
            return str2;
        }
    }
}
