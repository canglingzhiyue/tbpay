package android.taobao.windvane.config;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class s implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile s f1571a;
    private String b = "";
    private AtomicBoolean c = new AtomicBoolean(false);

    static {
        kge.a(-1789670167);
        kge.a(638153698);
        f1571a = null;
    }

    public static s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("f8254833", new Object[0]);
        }
        if (f1571a == null) {
            synchronized (s.class) {
                if (f1571a == null) {
                    f1571a = new s();
                }
            }
        }
        return f1571a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public void c() {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            j.a();
            if (j.commonConfig.bg) {
                b = android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data");
            } else {
                b = android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data");
            }
            b(b);
        }
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            android.taobao.windvane.util.m.e("WVURLConfig", android.taobao.windvane.util.a.a(e));
        }
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("url_patterns", "");
        String optString2 = jSONObject.optString("url_rules", "");
        String optString3 = jSONObject.optString("api_group", "");
        this.b = jSONObject.optString("forbiddenDomainRedirectURL", "https://h5.m.taobao.com/forbidden_error.html");
        t.a().a(optString, optString2, optString3, false);
        if (!StringUtils.isEmpty(this.b) && t.a().h(this.b)) {
            this.b = "";
        }
        return true;
    }

    @Override // android.taobao.windvane.config.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        j.a();
        if (j.commonConfig.bg) {
            android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data", str);
        } else {
            android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data", str);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c.get();
    }
}
