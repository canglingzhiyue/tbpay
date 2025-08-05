package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class ctv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26525a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private JSONObject g;
    private List<String> h;

    static {
        kge.a(476197442);
    }

    public ctv(JSONObject jSONObject) {
        this.h = new ArrayList();
        this.f26525a = fkt.c("enable_newdetail_optimize_when_nav", "true");
        if (!this.f26525a) {
            return;
        }
        String d = fkt.d("enable_newdetail_optimize_when_nav_blacklist", "");
        if (!TextUtils.isEmpty(d)) {
            Collections.addAll(this.h, d.split(","));
        }
        if (jSONObject == null) {
            return;
        }
        this.g = jSONObject;
        this.b = "true".equals(jSONObject.getString("enableAllOptimize"));
        this.c = "true".equals(jSONObject.getString("enableNavPreloadRequest"));
        this.d = "true".equals(jSONObject.getString("enableNavNormalRequest"));
        this.e = "true".equals(jSONObject.getString("enableRequestZstd"));
        this.f = "true".equals(jSONObject.getString("enableFcpViewAsync"));
    }

    public ctv() {
        this.h = new ArrayList();
        this.g = new JSONObject();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b && this.f26525a && !this.h.contains(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.b && this.f26525a && !this.h.contains(str)) {
            return this.c;
        }
        return false;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (this.b && this.f26525a && !this.h.contains(str)) {
            return this.d;
        }
        return false;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (this.b && this.f26525a && !this.h.contains(str)) {
            return this.e;
        }
        return false;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        if (this.b && this.f26525a && !this.h.contains(str)) {
            return this.f;
        }
        return false;
    }

    public JSONObject f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("427d5997", new Object[]{this, str});
        }
        if (this.b && this.f26525a && !this.h.contains(str)) {
            return this.g;
        }
        return null;
    }
}
