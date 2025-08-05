package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class tim {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String S_ARGS_IS_CLIENT_CACHE = "isClientCache";

    static {
        kge.a(1000104001);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(S_ARGS_IS_CLIENT_CACHE) || !jSONObject.containsKey("argsScmFlag") || jSONObject.getIntValue("argsScmFlag") != 0) {
        } else {
            String string = jSONObject.getString("scm");
            if (string != null) {
                jSONObject.put("scm_backup", (Object) string);
                jSONObject.remove("scm");
            }
            b(jSONObject);
        }
    }

    private static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        String string = jSONObject.getString("ifs");
        if (!TextUtils.isEmpty(string)) {
            jSONObject.put("ifs_backup", (Object) string);
            jSONObject.remove("ifs");
        }
        String string2 = jSONObject.getString("ifsArr");
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        jSONObject.put("ifsArr_backup", (Object) string2);
        jSONObject.remove("ifsArr");
    }
}
