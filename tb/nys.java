package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareConstants;

/* loaded from: classes8.dex */
public class nys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2103153559);
    }

    private static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : nym.a().getSharedPreferences(ShareConstants.SP_SHARE, 0);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null) {
        } else {
            SharedPreferences.Editor edit = a().edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.apply();
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        String a2 = a(str);
        return StringUtils.isEmpty(a2) ? str2 : a2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a().getString(str, null);
    }
}
