package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mvx extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA = -8285438766287101424L;
    public static final String KEY_DECIMAL = "decimalAssets";
    public static final String KEY_INTEGER = "integerAssets";
    public static final String KEY_OPERATE_CHECK_LAST_WORD = "cheekLastChr";
    public static final String KEY_OPERATE_READ_DATA = "read";
    public static final String KEY_OPERATE_SPILT_STR = "split";
    public static final String KEY_OPERATE_WRITE_DATA = "write";
    private final JSONObject b = new JSONObject();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f31291a = new HashMap();

    static {
        kge.a(416290571);
    }

    public static /* synthetic */ Object ipc$super(mvx mvxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            String valueOf = String.valueOf(objArr[0]);
            if ("write".equals(valueOf) && objArr.length >= 4) {
                return a(String.valueOf(objArr[1]), String.valueOf(objArr[2]), String.valueOf(objArr[3]));
            }
            if ("read".equals(valueOf) && objArr.length >= 3) {
                return a(String.valueOf(objArr[1]), String.valueOf(objArr[2]));
            }
            if ("split".equals(valueOf) && objArr.length >= 2) {
                return b(String.valueOf(objArr[1]));
            }
            if (KEY_OPERATE_CHECK_LAST_WORD.equals(valueOf) && objArr.length >= 3) {
                return a(objArr[1], String.valueOf(objArr[2]));
            }
        }
        return null;
    }

    private Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{this, obj, str});
        }
        if (!a(str) && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getJSONObject(jSONArray.size() - 1).getString("text");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            for (String str2 : str.split(",")) {
                if (string.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c254b136", new Object[]{this, str, str2});
        }
        if (!this.b.containsKey(str)) {
            return null;
        }
        JSONObject jSONObject = this.b.getJSONObject(str);
        Object obj = jSONObject.get(str2);
        jSONObject.remove(str2);
        return obj;
    }

    public Object a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("52ba1bac", new Object[]{this, str, str2, str3});
        }
        if (!a(str) && !a(str2)) {
            float d = d(str2, str3);
            Object obj = this.f31291a.get(str);
            if (!(obj instanceof Float)) {
                a(str, d);
                return null;
            }
            float floatValue = ((Float) obj).floatValue();
            if (d > floatValue) {
                JSONObject jSONObject = new JSONObject();
                String a2 = a(d, !a(str3));
                String a3 = a(floatValue, true ^ a(str3));
                int length = a2.length() - a3.length();
                int c = c(a2, a3);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < str2.length(); i++) {
                    String valueOf = String.valueOf(str2.charAt(i));
                    if (i >= length && i < c) {
                        jSONArray.add(b(valueOf, null));
                    } else if (i < c) {
                        jSONArray.add(b("0", valueOf));
                    } else {
                        jSONArray.add(b(String.valueOf(a3.charAt(i - length)), valueOf));
                    }
                }
                jSONObject.put(KEY_INTEGER, (Object) jSONArray);
                if (!a(str3)) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        String valueOf2 = String.valueOf(str3.charAt(i2));
                        int length2 = str2.length() + i2;
                        if (length2 < c) {
                            jSONArray2.add(b(valueOf2, null));
                        } else {
                            jSONArray2.add(b(String.valueOf(a3.charAt(length2 - length)), valueOf2));
                        }
                    }
                    jSONObject.put(KEY_DECIMAL, (Object) jSONArray2);
                }
                this.b.put(str, (Object) jSONObject);
                a(str, d);
                return jSONObject;
            }
            a(str, d);
        }
        return null;
    }

    private String a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9a3e6a4", new Object[]{this, new Float(f), new Boolean(z)});
        }
        String[] split = String.valueOf(f).split("\\.");
        if (!z) {
            return split[0];
        }
        if (split.length == 1) {
            return split[0].concat("\\.00");
        }
        String str = split[1];
        int length = str.length();
        String str2 = ".";
        for (int i = 0; i < 2; i++) {
            if (i < length) {
                str2 = str2.concat(String.valueOf(str.charAt(i)));
            } else {
                str2 = str2.concat("0");
            }
        }
        return split[0].concat(str2);
    }

    private JSONArray b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ad3f9221", new Object[]{this, str, str2});
        }
        JSONArray jSONArray = new JSONArray();
        if (".".equals(str) || TextUtils.isEmpty(str2)) {
            jSONArray.add(c(str));
        } else {
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt >= parseInt2) {
                    parseInt2 += 10;
                }
                while (parseInt <= parseInt2) {
                    jSONArray.add(c(parseInt >= 10 ? String.valueOf(parseInt - 10) : String.valueOf(parseInt)));
                    parseInt++;
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    private JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{this, str});
        }
        int length = str.length();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) String.valueOf(str.charAt(i)));
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    private JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) str);
        return jSONObject;
    }

    private int c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f277e371", new Object[]{this, str, str2})).intValue();
        }
        int length = str.length() - str2.length();
        if (length > 0) {
            return length;
        }
        int i = 0;
        for (int i2 = 0; i2 < str2.length() && str2.charAt(i2) == str.charAt(i2); i2++) {
            i++;
        }
        return i;
    }

    private void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{this, str, new Float(f)});
        } else {
            this.f31291a.put(str, Float.valueOf(f));
        }
    }

    private float d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f180e6f", new Object[]{this, str, str2})).floatValue();
        }
        float f = 0.0f;
        try {
            f = 0.0f + Integer.parseInt(str);
            return (a(str2) || str2.length() < 3) ? f : f + ((Integer.parseInt(str2.substring(1, 3)) * 1.0f) / 100.0f);
        } catch (Exception unused) {
            return f;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : TextUtils.isEmpty(str) || "null".equals(str);
    }
}
