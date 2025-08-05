package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.receiver.a;
import com.taobao.login4android.api.Login;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class hya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28840a;
    private static String b;
    private static int c;
    private static hya e;
    private static String f;
    private Context d;
    private SharedPreferences.OnSharedPreferenceChangeListener g = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: tb.hya.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac13492", new Object[]{this, sharedPreferences, str});
            } else {
                a.a(hya.a(hya.this));
            }
        }
    };

    public static /* synthetic */ Context a(hya hyaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6215ca60", new Object[]{hyaVar}) : hyaVar.d;
    }

    static {
        kge.a(1894730123);
        f28840a = hya.class.getSimpleName();
        b = "orderSearchHistoryKey";
        c = 6;
        e = null;
        f = ">>#>>";
    }

    private hya(Context context) {
        this.d = null;
        this.d = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e = null;
        this.d = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e().edit().remove(f()).commit();
        this.g.onSharedPreferenceChanged(e(), "");
    }

    public static hya a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hya) ipChange.ipc$dispatch("34c45eb6", new Object[]{context});
        }
        hya hyaVar = e;
        return hyaVar == null ? new hya(context) : hyaVar;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        SharedPreferences e2 = e();
        if (e2 == null) {
            return null;
        }
        String string = e2.getString(f(), null);
        String str = f28840a;
        StringBuilder sb = new StringBuilder();
        sb.append("getSearchHistory() searchKeys:");
        sb.append(string == null ? "is null" : string);
        hyn.a(str, sb.toString(), new String[0]);
        return string;
    }

    public hxm c() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hxm) ipChange.ipc$dispatch("1e69061f", new Object[]{this});
        }
        String d = d();
        if (TextUtils.isEmpty(d) || (split = d.split(f)) == null || split.length == 0 || (split.length == 1 && TextUtils.isEmpty(split[0]))) {
            return null;
        }
        hxm hxmVar = new hxm();
        hxmVar.f28834a = Arrays.asList(split);
        return hxmVar;
    }

    public boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            hyn.a(f28840a, "search key is null", new String[0]);
            return false;
        }
        hyn.a(f28840a, "search key is:" + str, new String[0]);
        String d = d();
        String str3 = "";
        if (TextUtils.isEmpty(d)) {
            str2 = str + f;
        } else {
            if (d.indexOf(str + f) != -1) {
                d = d.replace(str + f, str3).trim();
            }
            str2 = str + f + d;
        }
        hyn.a(f28840a, "saveSearchHistory() newSearchKeyString no subString:" + str2, new String[0]);
        String[] split = str2.split(f);
        if (split.length > c) {
            for (int i = 0; i < split.length && i < c; i++) {
                str3 = str3 + split[i] + f;
            }
            str2 = str3;
        }
        hyn.a(f28840a, "saveSearchHistory() newSearchKeyString subString:" + str2, new String[0]);
        SharedPreferences e2 = e();
        if (e2 != null) {
            return e2.edit().putString(f(), str2).commit();
        }
        return false;
    }

    private SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6314e040", new Object[]{this});
        }
        Context context = this.d;
        if (context == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return Login.getUserId() + b;
    }
}
