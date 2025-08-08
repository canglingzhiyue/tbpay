package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class qqz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_SKU_NEW_MTOP = "enableSkuNewMtop";

    static {
        kge.a(-2140752712);
    }

    public static void a(Context context, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381e885a", new Object[]{context, jSONObject, str});
        } else if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || jSONObject2.isEmpty()) {
        } else {
            String str2 = KEY_ENABLE_SKU_NEW_MTOP;
            String string = jSONObject2.getString(str2);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            if (!StringUtils.isEmpty(str)) {
                str2 = str2 + str;
            }
            qrf.a(context, str2, string);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        boolean isEmpty = StringUtils.isEmpty(str);
        String str2 = KEY_ENABLE_SKU_NEW_MTOP;
        if (!isEmpty) {
            str2 = str2 + str;
        }
        String a2 = qrf.a(context, str2);
        return "true".equals(a2) || StringUtils.isEmpty(a2);
    }
}
