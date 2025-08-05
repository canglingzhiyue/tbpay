package tb;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;

/* loaded from: classes8.dex */
public class ogt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_DSL_LOAD = "dsl_load";
    public static final String TASK_DSL_RENDER = "dsl_render";
    public static final String TASK_FRAGMENT_CREATE = "gg_home_fragment_create";
    public static final String TASK_ICON_CLICK = "gg_home_icon_click";
    public static final String TASK_PAGE_INIT = "tnodepage_init";
    public static final String TASK_TAB_SELECT = "tab_select";

    /* renamed from: a  reason: collision with root package name */
    public static long f32045a;

    static {
        kge.a(-197856804);
        f32045a = 0L;
    }

    private static g a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("dfc1d73", new Object[]{abVar});
        }
        Object g = abVar.g();
        if (g instanceof Activity) {
            return s.f18233a.b((Activity) g);
        }
        if (g instanceof Fragment) {
            return s.f18233a.b((Fragment) g);
        }
        if (g instanceof f) {
            return s.f18233a.b(((f) g).getContentView());
        }
        return s.f18233a.c();
    }

    private static String b(ab abVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1820ffa6", new Object[]{abVar, str});
        }
        if (abVar.A() != null && abVar.A().c() != null && abVar.A().c().a() != null && !TextUtils.isEmpty(abVar.A().c().a().h)) {
            return "gg_" + abVar.A().c().a().h + "_" + str;
        }
        return "gg_" + b(abVar.f()) + "_" + str;
    }

    private static String b(ab.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df88db6a", new Object[]{hVar, str});
        }
        if (hVar.a() != null && !TextUtils.isEmpty(hVar.a().h)) {
            return "gg_" + hVar.a().h + "_" + str;
        }
        return "gg_" + c(hVar.b) + "_" + str;
    }

    public static void a(ab abVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cbaa0b9", new Object[]{abVar, str});
            return;
        }
        String b = b(abVar, str);
        a(abVar).a(b);
        String str2 = " subTaskBegin: " + b;
        a(b);
    }

    public static void a(ab abVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bc5557", new Object[]{abVar, str, jSONObject});
            return;
        }
        String b = b(abVar, str);
        a(abVar).e(b, jSONObject);
        String str2 = " onSubTaskSuccess: " + b;
        a(b, jSONObject);
    }

    public static void a(ab abVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190be10d", new Object[]{abVar, str, str2, jSONObject});
            return;
        }
        String b = b(abVar, str);
        a(abVar).a(b, str2, jSONObject);
        String str3 = " onSubTaskFail: " + b;
        a(b, str2, jSONObject);
    }

    public static void a(ab.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b310b5", new Object[]{hVar, str});
            return;
        }
        String b = b(hVar, str);
        String str2 = " subTaskBegin: " + b;
        a(b);
    }

    public static void a(ab.h hVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c312d4db", new Object[]{hVar, str, jSONObject});
            return;
        }
        String b = b(hVar, str);
        String str2 = " onSubTaskSuccess: " + b;
        a(b, jSONObject);
    }

    public static void a(ab.h hVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3b0791", new Object[]{hVar, str, str2, jSONObject});
            return;
        }
        String b = b(hVar, str);
        String str3 = " onSubTaskFail: " + b;
        a(b, str2, jSONObject);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        ogg.c("APMLogger:", " subTaskBeginRaw: " + str);
        s.f18233a.d().a(str);
        a.a().a((String) null, str);
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        ogg.c("APMLogger:", " subTaskSuccessRaw: " + str);
        s.f18233a.d().e(str, jSONObject);
        a.a().a(null, str, jSONObject);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
            return;
        }
        ogg.c("APMLogger:", " subTaskFailRaw: " + str);
        s.f18233a.d().a(str, str2, jSONObject);
        a.a().a(null, str, str2, jSONObject);
    }

    public static String a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65b96e50", new Object[]{aaVar});
        }
        if (aaVar == null) {
            return "TNodeDefaultPageName";
        }
        Object e = aaVar.e("page");
        if (e instanceof String) {
            return (String) e;
        }
        Object e2 = aaVar.e(Component.KEY_PAGE_NAME);
        if (e2 instanceof String) {
            return (String) e2;
        }
        String str = (String) aaVar.a(1);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ab.h c = aaVar.c();
        return c != null ? b(c.b) : "TNodeDefaultPageName";
    }

    public static String b(String str) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "TNodeDefaultPageName";
        }
        Uri parse = Uri.parse(str);
        if (parse != null && (queryParameter = parse.getQueryParameter("tnode")) != null) {
            String[] split = queryParameter.split("\\?");
            if (split.length > 0) {
                return split[0];
            }
        }
        return c(str);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "TNodeDefaultPageName";
        }
        String[] split = str.split("\\/");
        return split.length > 3 ? split[split.length - 3] : "TNodeDefaultPageName";
    }
}
