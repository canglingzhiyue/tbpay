package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(736913731);
    }

    public static String[] a(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1bd1fd57", new Object[]{jSONObject});
        }
        if (jSONObject == null || (obj = jSONObject.get("containers")) == null || !(obj instanceof String[])) {
            return null;
        }
        String[] strArr = (String[]) obj;
        if (strArr.length != 0) {
            return strArr;
        }
        return null;
    }

    public static String a(lwz lwzVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("804450a", new Object[]{lwzVar, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            if (a(lwzVar, str)) {
                return str;
            }
        }
        return strArr[0];
    }

    public static boolean a(lwz lwzVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("742f85b7", new Object[]{lwzVar, str})).booleanValue() : StringUtils.equals(lwzVar.h(), str);
    }
}
