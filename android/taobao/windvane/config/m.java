package android.taobao.windvane.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class m implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile m b;
    private AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public String f1566a = "";

    static {
        kge.a(-1067871122);
        kge.a(638153698);
        b = null;
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("f8254779", new Object[0]);
        }
        if (b == null) {
            synchronized (m.class) {
                if (b == null) {
                    b = new m();
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            String b2 = android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, WVConfigManager.CONFIGNAME_COOKIE);
            android.taobao.windvane.util.m.c("WVCookieConfig", "get cookie config local = [" + b2 + riy.ARRAY_END_STR);
            b(b2);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            if (jSONObject == null) {
                return;
            }
            this.f1566a = jSONObject.optString("cookieBlackList", this.f1566a);
        }
    }

    @Override // android.taobao.windvane.config.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        android.taobao.windvane.util.m.c("WVCookieConfig", "receive cookie config = [" + str + riy.ARRAY_END_STR);
        b(str);
        android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, WVConfigManager.CONFIGNAME_COOKIE, str);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c.get();
    }
}
