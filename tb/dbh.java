package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.services.a;

/* loaded from: classes4.dex */
public class dbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(511990966);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else {
            a(ConnectionResult.SERVICE_UPDATING, str, "", "", a(strArr));
        }
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr}) : (strArr == null || strArr.length <= 0) ? "" : TextUtils.join(",", strArr);
    }

    private static void a(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27e0c3", new Object[]{new Integer(i), str, str2, str3, str4});
        } else {
            a.d().a().a("O2OAdSDK", i, str, str2, str3, String.format("sdkversion=%s", "5.15.6"), str4);
        }
    }
}
