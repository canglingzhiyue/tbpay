package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.android.revisionswitch.core.a;
import com.taobao.android.revisionswitch.core.f;
import com.taobao.android.revisionswitch.utils.b;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ily implements ilz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEW_DISCOVERY_ORANGE = "newDiscovery";
    public static final String KEY_ORANGE = "orange";
    public static final String KEY_SIMPLE_SWITCH_ORANGE = "simpleOrange";

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f29144a;
    private SharedPreferences b;

    public ily(Context context) {
        this.b = context.getSharedPreferences("kv_rvision_switch", 0);
        this.f29144a = context.getSharedPreferences("rvision_switch", 0);
    }

    @Override // tb.ilz
    public f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a294a930", new Object[]{this, str});
        }
        f a2 = b.a(this.f29144a.getString(str, null));
        return a2 == null ? f.DefaultOrangeAllOpenSwitch : a2;
    }

    @Override // tb.ilz
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.f29144a.getString(str, null);
    }

    @Override // tb.ilz
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        this.f29144a.edit().putString(str, str2).commit();
        return true;
    }

    @Override // tb.ilz
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fd8bbd1f", new Object[]{this}) : b.a(this.f29144a.getString("dosa", null), true);
    }

    @Override // tb.ilz
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        this.f29144a.edit().putString("dosa", str).commit();
        return true;
    }

    @Override // tb.ilz
    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        this.f29144a.edit().putString("dosa_overseas", str).commit();
        return true;
    }

    @Override // tb.ilz
    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b7034abe", new Object[]{this}) : b.a(this.f29144a.getString("dosa_overseas", null), false);
    }

    @Override // tb.ilz
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        this.f29144a.edit().putString("windvane", str).commit();
        return true;
    }

    @Override // tb.ilz
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : b.c(this.f29144a.getString("windvane", null));
    }

    @Override // tb.ilz
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : this.f29144a.getString(str, str2);
    }

    @Override // tb.ilz
    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        SharedPreferences.Editor edit = this.f29144a.edit();
        edit.putString(str, str2);
        edit.commit();
        return true;
    }

    @Override // tb.ilz
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            this.b.edit().putString(str, str2).commit();
        }
    }

    @Override // tb.ilz
    public Map<String, ?> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.b.getAll();
    }

    @Override // tb.ilz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Set<String> keySet = this.b.getAll().keySet();
        SharedPreferences.Editor edit = this.b.edit();
        for (String str : keySet) {
            if (!StringUtils.equals("elderHome", str) && !StringUtils.equals(LocationCallBack.ORIGIN_ELDER_HOME, str)) {
                edit.remove(str);
            }
        }
        edit.commit();
    }

    @Override // tb.ilz
    public String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str}) : this.b.getString(str, null);
    }
}
