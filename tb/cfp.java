package tb;

import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cfp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int API_CODE_INVALID = -1;
    public static final int API_CODE_NO_CHECK = 0;
    public static final int API_CODE_SYSTEM = 1;
    public static final String SP_API_CODE_KEY = "checkStatusApiCode";
    public static final String SP_NAME = "aliprivacy_sp";

    /* renamed from: a  reason: collision with root package name */
    private int f26268a;

    /* loaded from: classes3.dex */
    public static class a {
        public static final cfp INSTANCE = new cfp();
    }

    private cfp() {
        this.f26268a = -1;
    }

    public static cfp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfp) ipChange.ipc$dispatch("f033251", new Object[0]) : a.INSTANCE;
    }

    private void b(String str) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        c.a("CheckerFactory", str);
        try {
            try {
                JSONObject optJSONObject2 = new JSONObject(str).optJSONObject(cge.a().b);
                if (optJSONObject2 == null) {
                    this.f26268a = 1;
                    return;
                }
                String optString = optJSONObject2.optString("versionProp");
                if (!StringUtils.isEmpty(optString) && (optJSONObject = optJSONObject2.optJSONObject(cge.a().a(optString))) != null) {
                    this.f26268a = optJSONObject.optInt(SP_API_CODE_KEY);
                    return;
                }
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("default");
                if (optJSONObject3 != null) {
                    this.f26268a = optJSONObject3.optInt(SP_API_CODE_KEY);
                }
            } finally {
                c();
            }
        } catch (Throwable unused) {
            c.b("CheckerFactory", "update config failed");
            this.f26268a = 1;
        }
    }

    public cfq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("16b4d7cf", new Object[]{this});
        }
        if (this.f26268a == -1) {
            d();
        }
        c.a("CheckerFactory", "obtainChecker:" + this.f26268a);
        if (Build.VERSION.SDK_INT >= 23 && this.f26268a != 0) {
            return new cfr();
        }
        return new cfs();
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (cfw.a() != null) {
                SharedPreferences.Editor edit = cfw.a().getSharedPreferences(SP_NAME, 0).edit();
                if (this.f26268a != -1) {
                    i = this.f26268a;
                }
                edit.putInt(SP_API_CODE_KEY, i).apply();
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (cfw.a() != null) {
                this.f26268a = cfw.a().getSharedPreferences(SP_NAME, 0).getInt(SP_API_CODE_KEY, 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a().b(str);
        }
    }
}
