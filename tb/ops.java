package tb;

import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ops {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPTIMIZATION_CONFIG = "optimizationConfig";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f32267a;

    static {
        kge.a(-1639622247);
        HashMap hashMap = new HashMap();
        f32267a = hashMap;
        hashMap.put("wait_to_pay", "waitPay");
        f32267a.put("wait_to_shipments", "waitSend");
        f32267a.put("wait_to_confirm", "waitConfirm");
    }

    public static JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{new Integer(i)});
        }
        if (i > 0) {
            JSONObject a2 = oqb.a(ksk.REC_ORDER_LIST_CATAPULT.f30287a);
            if (a2 != null) {
                return a2.getJSONObject(OPTIMIZATION_CONFIG);
            }
            return null;
        }
        JSONObject a3 = oqb.a(ksk.REC_ORDER_LIST.f30287a);
        if (a3 != null) {
            return a3.getJSONObject(OPTIMIZATION_CONFIG);
        }
        return null;
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (TextUtils.equals(ksk.REC_ORDER_LIST_CATAPULT.f30287a, str)) {
            return a(1);
        }
        if (!TextUtils.equals(ksk.REC_ORDER_LIST.f30287a, str)) {
            return null;
        }
        return a(0);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        JSONObject a2 = a();
        if (a2 == null) {
            return 0;
        }
        return a2.getIntValue(str);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).getString("MyTaobaoOrderNumberCache", null);
            if (!TextUtils.isEmpty(string)) {
                return JSONObject.parseObject(string);
            }
            return null;
        } catch (Throwable th) {
            e.a("home.TSParserUtils", "getOrderCache error", th);
            return null;
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        return c(uri.getQueryParameter(g.IN_PARAM_ORDER_LIST_TYPE));
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return f32267a.get(str);
        }
        return null;
    }
}
