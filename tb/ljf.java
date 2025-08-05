package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class ljf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(383207502);
    }

    public static void a(Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fa073", new Object[]{map, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("nextPageUtBlackListKeys");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            for (String str : string.split(",")) {
                map.remove(str);
            }
        }
    }
}
