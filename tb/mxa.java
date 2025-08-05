package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class mxa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_CONTENT_GROUP = "mtb_switch";
    public static final String NEW_CONTENT_KEY = "mtb_new_content";
    public static final String TAG;
    private static final boolean b;

    static {
        kge.a(1659973729);
        TAG = mxa.class.getSimpleName();
        b = d();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE);
        }
    }

    public static void a(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fef851", new Object[]{str, str2, bool});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(str, 0).edit();
            if (bool == null) {
                edit.remove(str2);
            } else {
                edit.putBoolean(str2, bool.booleanValue());
            }
            edit.apply();
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b;
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        j.a();
        boolean b2 = j.b();
        if (!b2) {
            b.a().a("canUseThemeManager");
        }
        return b2;
    }
}
