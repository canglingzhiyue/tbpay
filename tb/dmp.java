package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.StringTokenizer;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes4.dex */
public final class dmp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELIMITER = " .[]";
    public static final dmp INSTANCE;

    static {
        kge.a(148452411);
        INSTANCE = new dmp();
    }

    private dmp() {
    }

    @JvmStatic
    public static final Object a(String keyPath, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{keyPath, obj});
        }
        q.d(keyPath, "keyPath");
        return a(new StringTokenizer(keyPath, DELIMITER, false), obj, false, null);
    }

    @JvmStatic
    public static final boolean a(String keyPath, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1adbbee", new Object[]{keyPath, obj, obj2})).booleanValue();
        }
        q.d(keyPath, "keyPath");
        return q.a(a(new StringTokenizer(keyPath, DELIMITER, false), obj, true, obj2), (Object) true);
    }

    @JvmStatic
    public static final Object a(StringTokenizer tokens, Object obj, boolean z, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f7178d1", new Object[]{tokens, obj, new Boolean(z), obj2});
        }
        q.d(tokens, "tokens");
        if (obj != null && tokens.hasMoreTokens()) {
            do {
                String token = tokens.nextToken();
                if (obj instanceof JSONObject) {
                    if (z && !tokens.hasMoreTokens()) {
                        ((Map) obj).put(token, obj2);
                        return true;
                    }
                    obj = ((JSONObject) obj).get(token);
                } else {
                    if (obj instanceof JSONArray) {
                        q.b(token, "token");
                        Integer d = n.d(token);
                        if (d != null) {
                            JSONArray jSONArray = (JSONArray) obj;
                            if (jSONArray.size() > d.intValue()) {
                                if (z && !tokens.hasMoreTokens()) {
                                    jSONArray.set(d.intValue(), obj2);
                                    return true;
                                }
                                obj = jSONArray.get(d.intValue());
                            }
                        }
                    }
                    obj = null;
                }
                if (obj == null) {
                    break;
                }
            } while (tokens.hasMoreTokens());
            if (z) {
                return false;
            }
        }
        return obj;
    }
}
