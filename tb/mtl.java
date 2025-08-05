package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile mtl b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f31248a;

    public static mtl a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtl) ipChange.ipc$dispatch("34c69321", new Object[]{context});
        }
        mtl mtlVar = b;
        if (mtlVar == null) {
            synchronized (mtl.class) {
                mtlVar = b;
                if (mtlVar == null) {
                    mtlVar = new mtl(context, "mtop_ssr_adapter");
                    b = mtlVar;
                }
            }
        }
        return mtlVar;
    }

    private mtl(Context context, String str) {
        this.f31248a = context.getSharedPreferences(str, 0);
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (map != null && map.size() != 0 && !TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    Log.e("SsrSPUtil", "SharedPreferencesUtil == putMapData === 异常了：" + e.getMessage());
                }
            }
            jSONArray.put(jSONObject);
            SharedPreferences.Editor edit = this.f31248a.edit();
            edit.putString(str, jSONArray.toString());
            edit.apply();
        }
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        String string = this.f31248a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string2 = names.getString(i2);
                        hashMap.put(string2, jSONObject.getString(string2));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("SsrSPUtil", "SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }
}
