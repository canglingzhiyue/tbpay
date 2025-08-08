package com.taobao.search.sf.util.tlog;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.iml;
import tb.imn;
import tb.imo;
import tb.kge;
import tb.noa;
import tb.qtd;

/* loaded from: classes8.dex */
public final class TLogTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT = "default";
    public static final TLogTracker INSTANCE;
    public static final String LEVEL_DEBUG = "D";
    public static final String LEVEL_ERROR = "E";
    public static final String LEVEL_INFO = "I";
    public static final String LEVEL_WARNING = "W";
    public static final String SCENE_EXCEPTION = "Exception";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19487a;
    private static String b;
    private static String c;

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes8.dex */
    public @interface LogLevel {
    }

    @JvmStatic
    public static final void a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            a((String) null, map, 1, (Object) null);
        }
    }

    static {
        kge.a(-341358802);
        INSTANCE = new TLogTracker();
        f19487a = true;
        b = i.MODULE_NAME;
        c = "unknown";
    }

    private TLogTracker() {
    }

    @JvmStatic
    public static final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f19487a = z;
        }
    }

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        if (str == null || StringUtils.isEmpty(str)) {
            str = "unknown";
        }
        c = str;
    }

    public static /* synthetic */ void a(String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871c2c2c", new Object[]{str, map, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            str = "Default";
        }
        a(str, map);
    }

    @JvmStatic
    public static final void a(String scene, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{scene, map});
            return;
        }
        q.c(scene, "scene");
        b(scene, "PageCreate", INSTANCE.c(map));
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b("Default", "PageEnter", "");
        }
    }

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b("Default", "PageLeave", "");
        }
    }

    @JvmStatic
    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            b("Default", "PageDestroy", "");
        }
    }

    @JvmStatic
    public static final void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.b(c, SCENE_EXCEPTION, str, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.b(c, str, str2, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        INSTANCE.b(c, "default", str, "\"errCode\":" + str2 + ",\"errMsg\":" + str3);
    }

    @JvmStatic
    public static final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            INSTANCE.b(c, "default", str, str2);
        }
    }

    @JvmStatic
    public static final void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        TLogTracker tLogTracker = INSTANCE;
        tLogTracker.a(c, str, str2, tLogTracker.b(map));
    }

    @JvmStatic
    public static final void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            INSTANCE.a(c, str, str2, str3);
        }
    }

    @JvmStatic
    public static final void a(String str, qtd qtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be41e61", new Object[]{str, qtdVar});
        } else {
            INSTANCE.a(c, str, "default", qtdVar != null ? qtdVar.a() : null);
        }
    }

    public final String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            z = false;
        }
        if (z) {
            return "";
        }
        String jSONString = JSON.toJSONString(map);
        q.a((Object) jSONString, "JSON.toJSONString(paramsMap)");
        return jSONString;
    }

    public final String c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            z = false;
        }
        return z ? "" : JSON.toJSONString(map);
    }

    public final void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            a(LEVEL_INFO, str, str2, str3, str4);
        }
    }

    public final void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
        } else {
            a("E", str, str2, str3, str4);
        }
    }

    public final void a(String logLevel, String str, String str2, String str3, String str4) {
        iml a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, logLevel, str, str2, str3, str4});
            return;
        }
        q.c(logLevel, "logLevel");
        if (!f19487a) {
            return;
        }
        StringBuilder sb = new StringBuilder(logLevel);
        sb.append("|");
        sb.append(noa.SERVER_VERSION_VALUE);
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        if (!StringUtils.isEmpty(str4)) {
            sb.append("|");
            sb.append(str4);
        }
        String str5 = b;
        TLog.loge(str5, str5, sb.toString());
        imn b2 = imo.b();
        if (b2 == null || (a2 = b2.a()) == null || !a2.c()) {
            return;
        }
        int hashCode = logLevel.hashCode();
        if (hashCode == 69) {
            if (logLevel.equals("E")) {
                k.f(b, sb.toString(), new Object[0]);
                return;
            }
        } else if (hashCode == 87 && logLevel.equals("W")) {
            k.e(b, sb.toString(), new Object[0]);
            return;
        }
        k.d(b, sb.toString(), new Object[0]);
    }
}
