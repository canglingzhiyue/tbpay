package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.c;
import com.taobao.location.client.TBLocationClient;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import com.taobao.tao.homepage.a;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes4.dex */
public class dod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f26879a = "AddressUtil";
    public static String b = "member_address";
    public static String c = "TB_SHOPPING_PROCESS";

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        try {
            boolean c2 = TBLocationClient.c();
            if (a()) {
                String str2 = f26879a;
                AdapterForTLog.loge(str2, "address checkBizPermissionUtil:  old=" + c2);
                return c2;
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                d a2 = f.a(context, str, new String[]{a.ACCESS_FINE_LOCATION});
                if (a2.b[0] == 0) {
                    String str3 = f26879a;
                    AdapterForTLog.loge(str3, "address checkBizPermissionUtil PERMISSION_GRANTED:  old=" + c2);
                    return c2;
                }
                String str4 = f26879a;
                AdapterForTLog.loge(str4, "address checkBizPermission: denied with msg " + a2.c[0]);
                return false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "false".equals(Integer.valueOf(c.a("addressPermission", "true")));
    }
}
