package com.taobao.tao.flexbox.layoutmanager.container;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.Kb;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohc;
import tb.ohe;
import tb.ohg;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_SHORT_LINK = "page_guangguang";
    public static final String TAB2_VIDEO_LINK = "page_tab2video";

    /* renamed from: a  reason: collision with root package name */
    private static String f20259a;
    private static HashMap<String, a> b;
    private static String c;
    private static String d;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20260a = "weitao_switch";
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(340103012);
        }
    }

    static {
        kge.a(-8551075);
        b = new HashMap<>();
        try {
            Class<?> cls = Class.forName("com.taobao.wetao.utils.TNodeUtils");
            ohc.a("injectShortLinkMap", (Class) cls, (Class<?>[]) new Class[]{HashMap.class}).invoke(null, b);
            f20259a = (String) ohc.c("ENGINE_VERSION", cls);
            d = (String) ohc.c("PAD_VERSION", cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        a aVar = new a();
        aVar.b = str2;
        aVar.c = str + f20259a;
        aVar.e = str3;
        aVar.d = str3;
        b.put(str, aVar);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20261a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        static {
            kge.a(318982912);
        }

        public b(String str, String str2, String str3, boolean z) {
            this.f20261a = str;
            this.b = str2;
            this.c = str3;
            this.e = z;
            this.d = oec.d(str3);
        }

        public String a() {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            String str = this.c;
            if (str == null || (parse = Uri.parse(str)) == null) {
                return null;
            }
            String queryParameter = parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_VERSION);
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return queryParameter;
        }

        public String b() {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            String str = this.c;
            if (str == null || (parse = Uri.parse(str)) == null) {
                return null;
            }
            String queryParameter = parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH);
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return queryParameter;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    String b2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().D().b(str, GUANGGUANG_SHORT_LINK);
                    Iterator<Map.Entry<String, a>> it = b.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, a> next = it.next();
                        if (TextUtils.equals(next.getKey(), b2)) {
                            a value = next.getValue();
                            c = a(c(value.c), value.f20260a, value.b, false);
                            c = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().D().a(c, str);
                            break;
                        }
                    }
                }
            }
        }
        return c;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        for (Map.Entry<String, a> entry : b.entrySet()) {
            if (TextUtils.equals(entry.getKey(), TAB2_VIDEO_LINK)) {
                a value = entry.getValue();
                return a(c(value.c), value.f20260a, value.b, false);
            }
        }
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        String str2 = c;
        if (str2 == null || str == null || !TextUtils.equals(oec.c(oec.d(str2)), oec.c(oec.d(str)))) {
            return;
        }
        c = null;
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!oeb.q()) {
            return str;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.b v = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().v();
        String valueOf = String.valueOf(v.a("tnodeandroid." + str + ".orangekey", str));
        ogg.c("TPU", "abKey:" + str + " abtest结果:" + valueOf);
        return valueOf;
    }

    private static String a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c6f18d", new Object[]{uri, str, str2});
        }
        int indexOf = str.indexOf(f20259a);
        if (indexOf < 0) {
            indexOf = str.indexOf(d);
        }
        String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
        if (uri == null) {
            return str;
        }
        ohg a2 = ohg.a();
        String a3 = a2.a(str2, substring + "_redirectkey", (String) null);
        if (TextUtils.isEmpty(a3)) {
            return str;
        }
        String queryParameter = uri.getQueryParameter(a3);
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        String replace = str.replace(substring, substring + "_" + queryParameter);
        ogg.c("TPU", "redirect:" + queryParameter + " 结果:" + replace);
        return replace;
    }

    public static b a(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4690742c", new Object[]{uri, str, new Boolean(z)}) : a(uri, str, z, true);
    }

    public static b b(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("45b7038b", new Object[]{uri, str, new Boolean(z)}) : a(uri, str, z, false);
    }

    private static b a(Uri uri, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        a aVar;
        String str5;
        String str6;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("44be4b4e", new Object[]{uri, str, new Boolean(z), new Boolean(z2)});
        }
        if (TextUtils.isEmpty(str)) {
            return new b(str, str, str, false);
        }
        int indexOf = str.indexOf("?");
        String str7 = null;
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            if (TextUtils.equals(str2, GUANGGUANG_SHORT_LINK)) {
                str2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().D().b(uri != null ? uri.toString() : null, str2);
            }
            str3 = str.substring(indexOf + 1);
        } else {
            str2 = str;
            str3 = null;
        }
        Iterator<Map.Entry<String, a>> it = b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str4 = "weitao_switch";
                aVar = null;
                str5 = null;
                str6 = str2;
                break;
            }
            Map.Entry<String, a> next = it.next();
            str5 = next.getKey();
            aVar = next.getValue();
            if (str5.equals(str2)) {
                str4 = aVar.f20260a;
                str6 = aVar.c != null ? aVar.c : str5;
            }
        }
        int indexOf2 = str6.indexOf("@");
        if (indexOf2 > 0 && indexOf2 < str6.length() - 1) {
            str4 = str6.substring(indexOf2 + 1) + Kb.g;
            str6 = str6.substring(0, indexOf2);
        }
        if (!str6.endsWith(f20259a) && !str6.endsWith(d)) {
            str6 = str6 + f20259a;
        }
        String c2 = c(a(uri, str6, str4));
        if (aVar != null) {
            if (TextUtils.equals(str5, GUANGGUANG_SHORT_LINK) || TextUtils.equals(str5, TAB2_VIDEO_LINK)) {
                if (!z2 || !TextUtils.equals(str5, TAB2_VIDEO_LINK)) {
                    if (uri != null) {
                        str7 = uri.toString();
                    }
                    a2 = a(str7);
                } else {
                    a2 = a();
                }
            } else {
                a2 = a(c2, str4, aVar.b, z);
            }
            if (TextUtils.isEmpty(a2) || c2.equals(a2)) {
                ogg.c("TPU", "打底映射获取短链失败, 入参url:" + str + "  返回:" + a2);
                return new b(str2, c2, str, false);
            } else if (aVar.d != null && !a2.startsWith("null")) {
                a2 = a2 + d(a2) + "localPath=" + aVar.d + "&localVersion=" + aVar.e;
            }
        } else {
            a2 = a(c2, str4, (String) null, z);
            if (TextUtils.isEmpty(a2) || c2.equals(a2)) {
                ogg.c("TPU", "获取短链失败, 入参url:" + str + "  返回:" + a2);
                return new b(str2, c2, str, false);
            }
        }
        if (str3 != null) {
            a2 = a2 + d(a2) + str3;
        }
        ogg.c("TPU", "获取短链成功, 入参url:" + str + "  返回:" + a2);
        return new b(str2, c2, a2, true);
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : (str == null || !str.contains("?")) ? "?" : "&";
    }

    private static String a(String str, String str2, String str3, boolean z) {
        String e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d604f12", new Object[]{str, str2, str3, new Boolean(z)});
        }
        ohg a2 = ohg.a();
        if (str3 != null) {
            e = str3;
        } else {
            e = z ? e(str) : str;
        }
        String a3 = a2.a(str2, str, e);
        ohe.a a4 = ohe.a();
        a4.a("最终URL:").a(a3).a("  ");
        a4.a("groupName:").a(str2).a("  ");
        a4.a("pageName:").a(str).a("  ");
        if (str3 != null) {
            a4.a("打底默认URL:").a(str3).a("  ");
        }
        if (z) {
            a4.a("兜底URL:").a(e(str));
        } else {
            a4.a("兜底URL:").a(str);
        }
        ogg.c("TPU", a4.toString());
        return a3;
    }

    private static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        return "https://g.alicdn.com/tnode/tnodemapper/" + str + "@.json.json";
    }
}
