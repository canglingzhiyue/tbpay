package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.homepage.utils.d;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.a;
import com.taobao.tao.homepage.windvane.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class por implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f32784a = Arrays.asList("getMiniAppRelation", "setNativeStorage", "getNativeStorage", "setNativeMemoryCache", "getNativeMemoryCache", "getHomeLocalValue");
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;

    static {
        kge.a(294372871);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f32784a;
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, "getMiniAppRelation")) {
            return a(wVCallBackContext);
        }
        if (StringUtils.equals(str, "getHomeLocalValue")) {
            return a(str2, wVCallBackContext);
        }
        return b(str, str2, wVCallBackContext);
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        String b = a.a().b(a.MINI_APP_RELATION, "null");
        r rVar = new r();
        rVar.a(a.MINI_APP_RELATION, b);
        wVCallBackContext.success(rVar);
        return true;
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        Application application;
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str) || (application = Globals.getApplication()) == null || (sharedPreferences = application.getSharedPreferences("home_dx_data", 0)) == null) {
                return false;
            }
            String string = JSONObject.parseObject(str).getString("key");
            r rVar = new r();
            rVar.a("homeLocalValue", StringUtils.isEmpty(string) ? sharedPreferences.getAll() : sharedPreferences.getString(string, null));
            wVCallBackContext.success(rVar);
            lap.a("Bridge", "getHomeLocalValue", "success; homeLocalValue:" + rVar.b("homeLocalValue", FactoryType.TYPE_INVALID));
            return true;
        } catch (Exception e) {
            lap.a("Bridge", "getHomeLocalValue", "parse params exception:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.success();
            return true;
        }
    }

    private boolean b(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d83cb3e", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!b(str2, wVCallBackContext)) {
            b(wVCallBackContext);
            return false;
        }
        r rVar = new r();
        char c = 65535;
        switch (str.hashCode()) {
            case -1495419614:
                if (str.equals("setNativeStorage")) {
                    c = 0;
                    break;
                }
                break;
            case 336023214:
                if (str.equals("getNativeStorage")) {
                    c = 2;
                    break;
                }
                break;
            case 1532215848:
                if (str.equals("setNativeMemoryCache")) {
                    c = 1;
                    break;
                }
                break;
            case 2143139252:
                if (str.equals("getNativeMemoryCache")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            rVar.a("result", StringUtils.equals(str, "setNativeStorage") ? d.a(this.b, this.c, this.f, this.e) : d.b(this.b, this.c, this.f, this.e) ? "存储成功" : "存储失败");
            wVCallBackContext.success(rVar);
            return true;
        } else if (c == 2 || c == 3) {
            String a2 = StringUtils.equals(str, "getNativeStorage") ? d.a(this.b, this.c, this.f) : d.b(this.b, this.c, this.f);
            rVar.a("bizName", this.b);
            rVar.a("key", this.c);
            rVar.a("withUser", this.d);
            rVar.a("value", a2);
            wVCallBackContext.success(rVar);
            return true;
        } else {
            b(wVCallBackContext);
            return false;
        }
    }

    private boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        a();
        if (StringUtils.isEmpty(str)) {
            b(wVCallBackContext);
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Exception e) {
            lap.a("Bridge", "checkParamsAndNotifyIfInvalid", "parse params exception:" + e.getMessage());
        }
        if (jSONObject == null) {
            b(wVCallBackContext);
            return false;
        }
        a(jSONObject);
        return !StringUtils.isEmpty(this.b) && !StringUtils.isEmpty(this.c);
    }

    private void b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9f8a6", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("result", "存储失败，bizName或者key为空");
        wVCallBackContext.error(rVar);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject.getString("bizName");
        this.c = jSONObject.getString("key");
        this.d = jSONObject.getString("withUser");
        this.e = jSONObject.getString("value");
        this.f = !StringUtils.equals(this.d, "NO");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = null;
        this.d = null;
        this.c = null;
        this.b = null;
        this.f = false;
    }
}
