package com.taobao.themis.utils;

import android.os.Bundle;
import android.os.Parcel;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1534782685);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    public static JSONObject a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9797964f", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(bArr, "UTF-8"));
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    public static <T> T a(byte[] bArr, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("55405d04", new Object[]{bArr, cls});
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (T) JSON.parseObject(bArr, cls, new Feature[0]);
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    public static Bundle a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("2604864c", new Object[]{jSONObject}) : a((Bundle) null, jSONObject);
    }

    public static Bundle a(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d647ecc8", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                try {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(str, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
                    } else if (obj instanceof JSON) {
                        bundle.putString(str, ((JSON) obj).toJSONString());
                    } else if (obj instanceof BigDecimal) {
                        bundle.putDouble(str, ((BigDecimal) obj).doubleValue());
                    }
                } catch (Exception e) {
                    Log.e("JSONUtils", "toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    public static String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str}) : a(jSONObject, str, "");
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return str2;
        }
        try {
            String string = jSONObject.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            Log.e("JSONUtils", "getString exception!", th);
            return str2;
        }
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return z;
        }
        try {
            return jSONObject.getBooleanValue(str);
        } catch (Throwable unused) {
            return z;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6f9ccfe", new Object[]{jSONObject, str, jSONObject2});
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return jSONObject2;
        }
        try {
            return jSONObject.getJSONObject(str);
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    public static JSONArray a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("33bda684", new Object[]{jSONObject, str, jSONArray});
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return jSONArray;
        }
        try {
            return jSONObject.getJSONArray(str);
        } catch (Throwable unused) {
            return jSONArray;
        }
    }

    public static <T> Map<String, T> a(JSONObject jSONObject, Map<String, T> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f680f272", new Object[]{jSONObject, map});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            map = new HashMap();
            for (String str : jSONObject.keySet()) {
                try {
                    map.put(str, jSONObject.get(str));
                } catch (Throwable th) {
                    Log.e("JSONUtils", "jsonToMap error", th);
                }
            }
        }
        return map;
    }

    public static byte[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("13796d96", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new byte[0];
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeSerializable(jSONObject);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static JSONObject b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60988d90", new Object[]{bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return new JSONObject();
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (JSONObject) obtain.readSerializable();
        } catch (Throwable th) {
            try {
                Log.e("JSONUtils", "unmarshallJSONObject error!", th);
                return null;
            } finally {
                obtain.recycle();
            }
        }
    }
}
