package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile rkk b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f33207a;

    static {
        kge.a(1780539220);
        b = null;
    }

    public static rkk a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkk) ipChange.ipc$dispatch("34c8b714", new Object[]{context});
        }
        rkk rkkVar = b;
        if (rkkVar == null) {
            synchronized (rkk.class) {
                rkkVar = b;
                if (rkkVar == null) {
                    rkkVar = new rkk(context, "link_in_sp");
                    b = rkkVar;
                }
            }
        }
        return rkkVar;
    }

    private rkk(Context context, String str) {
        if (context == null) {
            return;
        }
        this.f33207a = context.getSharedPreferences(str, 0);
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                rkg.b("link_tag", "SharedPreferencesUtil == putMapData === 异常了：" + e.getMessage());
            }
        }
        jSONArray.put(jSONObject);
        SharedPreferences.Editor edit = this.f33207a.edit();
        edit.putString(str, jSONArray.toString());
        edit.apply();
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(this.f33207a.getString(str, ""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string = names.getString(i2);
                        hashMap.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (Exception e) {
            rkg.b("link_tag", "SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }

    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = this.f33207a.edit();
            String simpleName = obj.getClass().getSimpleName();
            char c = 65535;
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(a.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals(a.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (c == 1) {
                edit.putLong(str, ((Long) obj).longValue());
            } else if (c == 2) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if (c == 3) {
                edit.putString(str, (String) obj);
            } else if (c == 4) {
                edit.putInt(str, ((Integer) obj).intValue());
            } else {
                edit.putString(str, JSON.toJSONString(obj));
            }
            edit.apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public Object b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cfa9a883", new Object[]{this, str, obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        char c = 65535;
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(a.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals(a.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return Boolean.valueOf(this.f33207a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (c == 1) {
                return Long.valueOf(this.f33207a.getLong(str, ((Long) obj).longValue()));
            }
            if (c == 2) {
                return Float.valueOf(this.f33207a.getFloat(str, ((Float) obj).floatValue()));
            }
            if (c == 3) {
                return this.f33207a.getString(str, (String) obj);
            }
            if (c == 4) {
                return Integer.valueOf(this.f33207a.getInt(str, ((Integer) obj).intValue()));
            }
            String string = this.f33207a.getString(str, "");
            return (string.equals("") || string.length() <= 0) ? obj : JSON.parseObject(string, obj.getClass());
        } catch (Throwable unused) {
            return obj;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f33207a.edit().remove(str).commit();
        }
    }
}
