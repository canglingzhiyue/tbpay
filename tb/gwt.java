package tb;

import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.g;
import com.taobao.android.litecreator.util.u;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f28545a;
    private static final Map<String, gwt> b;
    private static JSONObject c;
    private final String d;
    private final JSONObject e = new JSONObject();

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : f28545a;
    }

    public static /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            g(str);
        }
    }

    static {
        kge.a(1549359813);
        f28545a = g.a();
        b = new HashMap();
        c = new JSONObject();
    }

    public static synchronized gwt a(String str) {
        synchronized (gwt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gwt) ipChange.ipc$dispatch("7c6fed10", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                u.d("LCABTestDeciderManager", "LCABTestDeciderManager.get: empty session id, please check!");
                str = "single_session";
            }
            if (!b.containsKey(str)) {
                b.put(str, new gwt(str));
            }
            return b.get(str);
        }
    }

    public static synchronized void b(String str) {
        synchronized (gwt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
                return;
            }
            if (!StringUtils.isEmpty(str) && b.containsKey(str)) {
                b.remove(str);
            }
        }
    }

    public static synchronized void a() {
        synchronized (gwt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                b.clear();
            }
        }
    }

    public static void a(final String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = c;
        if (jSONObject != null && jSONObject.size() > 0) {
            return;
        }
        au.a(new Runnable() { // from class: tb.gwt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    gwt.f(str);
                }
            }
        }, z);
    }

    private static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
            return;
        }
        String a2 = at.a(Globals.getApplication(), str);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(a2);
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            jSONObject = c;
        }
        c = jSONObject;
    }

    private gwt(String str) {
        this.d = str;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.e;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        a a2 = a.a(c, str);
        boolean a3 = at.a(a2.f28547a, false);
        if (a2.b != null) {
            a3 = a2.b.getValueAsBoolean(a3);
        }
        this.e.put(str, (Object) String.valueOf(a3));
        return a3;
    }

    public int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        a a2 = a.a(c, str);
        int a3 = at.a(a2.f28547a, 0);
        if (a2.b != null) {
            a3 = a2.b.getValueAsInt(a3);
        }
        this.e.put(str, (Object) String.valueOf(a3));
        return a3;
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        a a2 = a.a(c, str);
        String str2 = a2.f28547a;
        if (a2.b != null) {
            str2 = a2.b.getValueAsString(str2);
        }
        this.e.put(str, (Object) str2);
        return str2;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28547a = "";
        public Variation b;

        static {
            kge.a(-1051609781);
        }

        private a() {
        }

        public static a a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b42d9b93", new Object[]{jSONObject, str});
            }
            a aVar = new a();
            if (!b(jSONObject, str)) {
                return aVar;
            }
            String string = jSONObject.getJSONObject(str).getString("orangeGroupName");
            String string2 = jSONObject.getJSONObject(str).getString("orangeKey");
            String string3 = jSONObject.getJSONObject(str).getString("orangeDefaultConfig");
            aVar.b = UTABTest.activate(jSONObject.getJSONObject(str).getString("testComponent"), jSONObject.getJSONObject(str).getString("testModule")).getVariation(jSONObject.getJSONObject(str).getString("testKey"));
            aVar.f28547a = OrangeConfig.getInstance().getConfig(string, string2, string3);
            return aVar;
        }

        private static boolean b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("493da635", new Object[]{jSONObject, str})).booleanValue();
            }
            if (a(jSONObject, str)) {
                return a(jSONObject.getJSONObject(str), "testComponent", "testModule", "testKey", "orangeGroupName", "orangeKey", "orangeDefaultConfig");
            }
            return false;
        }

        private static boolean a(JSONObject jSONObject, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b724c9b", new Object[]{jSONObject, strArr})).booleanValue();
            }
            for (String str : strArr) {
                if (!jSONObject.containsKey(str)) {
                    if (gwt.c()) {
                        Toast.makeText(Globals.getApplication(), "配置信息缺少key: = " + str + ", 请检查！！！", 1).show();
                    }
                    u.d("LCABTestDeciderManager", "DecisionBean.isContainsKeys: invalid config, missing key: " + str);
                    return false;
                }
            }
            return true;
        }
    }
}
