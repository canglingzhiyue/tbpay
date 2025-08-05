package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.s;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.c;
import com.taobao.weex.common.Constants;
import java.util.Date;

/* loaded from: classes7.dex */
public class nqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1836626025);
    }

    public static boolean a(c cVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f27a5d7", new Object[]{cVar})).booleanValue();
        }
        SharedPreferences a2 = s.a();
        String str = "cameraAnim_" + cVar.c + "_" + Login.getNick() + "_";
        String a3 = a();
        boolean a4 = a(a2, str, a3);
        if (a4) {
            i = a2.getInt(str + "total", 0);
        } else {
            i = 0;
        }
        if (i >= cVar.f19367a) {
            return false;
        }
        int i2 = -1;
        if (a4) {
            i2 = a2.getInt(str + Constants.Name.INTERVAL, -1);
        }
        if (i2 < cVar.b - 1 && i2 >= 0) {
            a2.edit().putString(str + "date", a3).putInt(str + Constants.Name.INTERVAL, i2 + 1).apply();
            return false;
        }
        a2.edit().putString(str + "date", a3).putInt(str + "total", i + 1).putInt(str + Constants.Name.INTERVAL, 0).apply();
        return true;
    }

    private static boolean a(SharedPreferences sharedPreferences, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2743094", new Object[]{sharedPreferences, str, str2})).booleanValue();
        }
        return str2.equals(sharedPreferences.getString(str + "date", ""));
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Date date = new Date();
        return date.getYear() + "." + date.getMonth() + "." + date.getDate();
    }
}
