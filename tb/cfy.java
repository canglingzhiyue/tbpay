package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static cfy f26277a = new cfy();
    }

    public static cfy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfy) ipChange.ipc$dispatch("f033368", new Object[0]) : a.f26277a;
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        SharedPreferences f = f();
        if (f != null) {
            f.edit().putString("permission_config", str).apply();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        synchronized (cfy.class) {
            SharedPreferences f = f();
            if (f != null) {
                f.edit().clear().apply();
            }
        }
    }

    private SharedPreferences f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("2c15d781", new Object[]{this});
        }
        if (cfw.a() == null) {
            return null;
        }
        return cfw.a().getSharedPreferences("permission_config", 0);
    }

    private SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("f516cec2", new Object[]{this});
        }
        if (cfw.a() == null) {
            return null;
        }
        return cfw.a().getSharedPreferences("permission_config_with_scene", 0);
    }

    public synchronized JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("71733358", new Object[]{this});
        }
        SharedPreferences f = f();
        if (f != null) {
            String string = f.getString("permission_config", null);
            if (StringUtils.isEmpty(string)) {
                return null;
            }
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                e.printStackTrace();
                Log.e("PermissionSP", "Could not parse malformed JSON: \"" + string + "\"");
            }
        }
        return null;
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        SharedPreferences.Editor edit = g.edit();
        edit.putString("permission_" + str, str2).apply();
        return true;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        SharedPreferences g = g();
        if (g == null) {
            return null;
        }
        return g.getString("permission_" + str, null);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        SharedPreferences g = g();
        if (g != null) {
            return g.getBoolean("permission_permission_clip_board", true);
        }
        return true;
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        g.edit().putBoolean("permission_permission_clip_board", z).apply();
        return true;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        SharedPreferences g = g();
        if (g != null) {
            return g.getString("permission_granted_record", "");
        }
        return null;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        g.edit().putString("permission_granted_record", str).apply();
        return true;
    }
}
