package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.behavix.j;
import com.taobao.statistic.TBS;

/* loaded from: classes7.dex */
public class lxu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient String AD_VAL_MATCH_TYPE = "AD";

    /* renamed from: a  reason: collision with root package name */
    public static String f30977a;

    static {
        kge.a(-1086102415);
        f30977a = "Page_Home";
    }

    public static void a(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb465b5", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, a(str, jSONObject));
            if (i != 2101) {
                return;
            }
            h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, j.b(jSONObject));
        } catch (Exception unused) {
        }
    }

    private static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str2 : jSONObject.keySet()) {
            String string = jSONObject.getString(str2);
            if (!TextUtils.isEmpty(string)) {
                if (string.length() > 2048) {
                    TBS.Ext.commitEvent(str, 19999, "super_long_args", str2);
                }
                sb.append(str2);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
