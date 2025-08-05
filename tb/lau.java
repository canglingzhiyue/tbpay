package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.homepage.utils.d;
import com.taobao.tao.homepage.launcher.g;
import java.util.Map;

/* loaded from: classes7.dex */
public class lau {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_VALUE = "standard_version";
    public static final String SWITCHER_VERSION = "switcherVersion";
    public static final String USER_GROWTH_DAU = "UserGrowthDAU";

    /* renamed from: a  reason: collision with root package name */
    private String f30437a = d.b("switcherVersion", "standard_version");
    private String b = l.b(g.a()).editionCode;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static lau f30438a;

        static {
            kge.a(-217926303);
            f30438a = new lau();
        }

        public static /* synthetic */ lau a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lau) ipChange.ipc$dispatch("f07377e", new Object[0]) : f30438a;
        }
    }

    static {
        kge.a(-1302415785);
    }

    public static lau a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lau) ipChange.ipc$dispatch("f07377e", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coldStart", (Object) this.f30437a);
            jSONObject.put(noa.KEY_EDITION_CODE, (Object) this.b);
            kss.a("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", (Object) str);
            jSONObject.put("to", (Object) str2);
            jSONObject.put(noa.KEY_EDITION_CODE, (Object) this.b);
            kss.a("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fromEditionCode", (Object) this.b);
            this.b = l.b(g.a()).editionCode;
            jSONObject.put("toEditionCode", (Object) this.b);
            jSONObject.put("currentVersion", (Object) this.f30437a);
            kss.a("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("switcherVersion");
            if (TextUtils.isEmpty(string)) {
                string = "standard_version";
            }
            if (string.equals(this.f30437a)) {
                return;
            }
            a(this.f30437a, string);
            this.f30437a = string;
            d.a("switcherVersion", string);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.put("switcherVersion", this.f30437a);
        }
    }
}
