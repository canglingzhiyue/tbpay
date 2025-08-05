package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class tjm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f34153a;

    static {
        kge.a(1451970707);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (f34153a == null) {
            f34153a = Global.getApplication().getSharedPreferences("mmAdBiz", 0);
        }
        return f34153a.getString(str, str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        if (f34153a == null) {
            f34153a = Global.getApplication().getSharedPreferences("mmAdBiz", 0);
        }
        f34153a.edit().putString(str, str2).apply();
    }
}
