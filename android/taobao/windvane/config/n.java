package android.taobao.windvane.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class n implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f1567a;
    private String b = "";
    private AtomicBoolean c = new AtomicBoolean(false);

    static {
        kge.a(-253487410);
        kge.a(638153698);
        f1567a = null;
    }

    public static n a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f8254798", new Object[0]);
        }
        if (f1567a == null) {
            synchronized (n.class) {
                if (f1567a == null) {
                    f1567a = new n();
                }
            }
        }
        return f1567a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            b(android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, "domainwv-data"));
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c.get();
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("v") && !TextUtils.equals(a.a().i(), jSONObject.optString("appVersion"))) {
            return false;
        }
        android.taobao.windvane.util.m.c("WVConfig", "当前更新orange配置，是否有v=[" + jSONObject.has("v") + riy.ARRAY_END_STR);
        String optString = jSONObject.optString("aliDomain", "");
        String optString2 = jSONObject.optString("thirdPartyDomain", "");
        String optString3 = jSONObject.optString("supportDownloadDomain", "");
        String optString4 = jSONObject.optString("forbiddenDomain", "");
        String optString5 = jSONObject.optString("allowAccessDomain", "");
        String optString6 = jSONObject.optString("embedDomain", "");
        this.b = jSONObject.optString("forbiddenDomainRedirectURL", "");
        if (!TextUtils.isEmpty(optString)) {
            p.e = optString;
            try {
                p.f = Pattern.compile(optString, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern domainPat rule, " + optString);
            } catch (PatternSyntaxException e) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString2)) {
            p.i = optString2;
            try {
                p.j = Pattern.compile(optString2, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern thirdPartyDomain rule, " + optString2);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString3)) {
            p.k = optString3;
            try {
                p.l = Pattern.compile(optString3, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern supportDownloadDomain rule, " + optString3);
            } catch (PatternSyntaxException e3) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e3.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString5)) {
            p.m = optString5;
            try {
                p.n = Pattern.compile(optString5, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern allowAccessDomain rule, " + optString5);
            } catch (PatternSyntaxException e4) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e4.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString6)) {
            p.o = optString6;
            try {
                p.n = Pattern.compile(optString6, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern allowAccessDomain rule, " + optString5);
            } catch (PatternSyntaxException e5) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e5.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString4)) {
            p.g = optString4;
            try {
                p.h = Pattern.compile(optString4, 2);
                android.taobao.windvane.util.m.b("WVDomainConfig", "compile pattern blackDomain rule, " + optString4);
            } catch (PatternSyntaxException e6) {
                android.taobao.windvane.util.m.e("WVDomainConfig", " PatternSyntaxException pattern:" + e6.getMessage());
            }
            if (!TextUtils.isEmpty(this.b) && p.e(this.b)) {
                this.b = "";
            }
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
        android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, "domainwv-data", str);
    }
}
