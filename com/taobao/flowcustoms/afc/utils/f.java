package com.taobao.flowcustoms.afc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile f b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f17189a;

    static {
        kge.a(-1194764456);
        b = null;
    }

    public static f a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fb9deddc", new Object[]{context});
        }
        f fVar = b;
        if (fVar == null) {
            synchronized (f.class) {
                fVar = b;
                if (fVar == null) {
                    fVar = new f(context, "afc_sp");
                    b = fVar;
                }
            }
        }
        return fVar;
    }

    private f(Context context, String str) {
        this.f17189a = context.getSharedPreferences(str, 0);
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
                c.b("linkx", "SharedPreferencesUtil == putMapData === 异常了：" + e.getMessage());
            }
        }
        jSONArray.put(jSONObject);
        SharedPreferences.Editor edit = this.f17189a.edit();
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
            JSONArray jSONArray = new JSONArray(this.f17189a.getString(str, ""));
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
            c.b("linkx", "SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }

    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        SharedPreferences.Editor edit = this.f17189a.edit();
        String simpleName = obj.getClass().getSimpleName();
        char c = 65535;
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_String)) {
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
                    if (simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_Boolean)) {
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
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        edit.apply();
        return z;
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
                    if (simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_String)) {
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
                    if (simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return Boolean.valueOf(this.f17189a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (c == 1) {
                return Long.valueOf(this.f17189a.getLong(str, ((Long) obj).longValue()));
            }
            if (c == 2) {
                return Float.valueOf(this.f17189a.getFloat(str, ((Float) obj).floatValue()));
            }
            if (c == 3) {
                return this.f17189a.getString(str, (String) obj);
            }
            if (c == 4) {
                return Integer.valueOf(this.f17189a.getInt(str, ((Integer) obj).intValue()));
            }
            String string = this.f17189a.getString(str, "");
            return (string.equals("") || string.length() <= 0) ? obj : JSON.parseObject(string, obj.getClass());
        } catch (Exception unused) {
            return obj;
        }
    }
}
