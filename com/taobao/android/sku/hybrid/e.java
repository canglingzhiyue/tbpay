package com.taobao.android.sku.hybrid;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.hybrid.c;
import com.taobao.android.sku.utils.k;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1395371554);
    }

    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("addParams".equals(str)) {
            wVCallBackContext.success(a(str2));
            return true;
        } else if ("closeView".equals(str)) {
            wVCallBackContext.success(b(str2));
            return true;
        } else if ("updateView".equals(str)) {
            wVCallBackContext.success(c(str2));
            return true;
        } else if ("doBuyNow".equals(str)) {
            wVCallBackContext.success(a());
            return true;
        } else if ("doAddCart".equals(str)) {
            wVCallBackContext.success(b());
            return true;
        } else if ("doConfirm".equals(str)) {
            wVCallBackContext.success(c());
            return true;
        } else if ("doBuy".equals(str)) {
            return d(str2);
        } else {
            if ("getInputData".equals(str)) {
                wVCallBackContext.success(d());
                return true;
            } else if ("clearParams".equals(str)) {
                wVCallBackContext.success(e());
                return true;
            } else if ("downgrade2Native".equals(str)) {
                wVCallBackContext.success(f());
                return true;
            } else {
                if ("getDetail".equals(str)) {
                    wVCallBackContext.success(g());
                    return true;
                }
                return false;
            }
        }
    }

    private String a(String str) {
        c.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Map<String, String> a3 = k.a(str);
        if (a3 == null || a3.isEmpty() || (a2 = c.a()) == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(5, a3);
        return "{\"success\":true}";
    }

    private String b(String str) {
        c.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (!"sku".equals(str) || (a2 = c.a()) == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(4, null);
        return "{\"success\":true}";
    }

    private String c(String str) {
        c.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        Map<String, String> a3 = k.a(str);
        if (a3 == null || a3.isEmpty() || (a2 = c.a()) == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(6, a3);
        return "{\"success\":true}";
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(1, null);
        return "{\"success\":true}";
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(2, null);
        return "{\"success\":true}";
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(3, null);
        return "{\"success\":true}";
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return false;
        }
        a2.f15181a.a(5, k.a(str));
        a2.f15181a.a(1, null);
        return true;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        c.a a2 = c.a();
        return (a2 == null || a2.f15181a == null) ? "{}" : a2.f15181a.a(7, null);
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(8, null);
        return "{\"success\":true}";
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a == null) {
            return "{\"success\":false}";
        }
        a2.f15181a.a(9, null);
        return "{\"success\":true}";
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        c.a a2 = c.a();
        return (a2 == null || a2.f15181a == null) ? "{\"success\":false}" : a2.f15181a.a(10, null);
    }
}
