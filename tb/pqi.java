package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.l;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static volatile pqi f32817a;

    static {
        kge.a(1989369619);
        TAG = pqi.class.getSimpleName();
    }

    public static pqi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqi) ipChange.ipc$dispatch("f094396", new Object[0]);
        }
        if (f32817a == null) {
            synchronized (pqi.class) {
                if (f32817a == null) {
                    f32817a = new pqi();
                }
            }
        }
        return f32817a;
    }

    private pqi() {
    }

    public void a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{this, str, new Double(d)});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str, d);
        }
    }

    public void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{this, str, str2, new Double(d)});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str, str2, d);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str, str2);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            a(str, null, null, null);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(str, null, str2, str3);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (l.e(str3)) {
            str3 = "UnknownError";
        }
        if (l.e(str4)) {
            str4 = "UnknownCode";
        }
        if (pmd.a().n() != null) {
            if (StringUtils.isEmpty(str2)) {
                pmd.a().n().a("taolive", str, str3, str4);
            } else {
                pmd.a().n().a("taolive", str, str2, str3, str4);
            }
        }
        c(str, "args:" + str2 + ",errorMsg:" + str3 + ",errorCode:" + str4);
    }

    public void a(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        b(str + ":" + str2, JSON.toJSONString(map));
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> b = b();
        b.put("pointString", str2);
        if (pmd.a().m() != null && c()) {
            pmd.a().m().a(str, JSON.toJSONString(b));
        }
        String str3 = str + ":" + str2 + ":" + JSON.toJSONString(b);
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (pmd.a().e() == null) {
        } else {
            if (e() && !str.startsWith("Page_TaobaoLiveWatch")) {
                str = "Page_TaobaoLiveWatch-Button-" + str;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", 19999, str, "", "", map);
        }
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        return hashMap;
    }

    public Map<String, String> a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ff1dad6", new Object[]{this, tLiveMsg});
        }
        Map<String, String> b = b();
        if (tLiveMsg != null) {
            b.put("messageId", tLiveMsg.messageId);
            b.put("msgType", String.valueOf(tLiveMsg.type));
            b.put("timestamp", String.valueOf(tLiveMsg.timestamp));
        }
        return b;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            c("unknown", str);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> b = b();
        b.put("errorString", str2);
        if (pmd.a().m() != null && c()) {
            pmd.a().m().a(str, pqj.b(b));
        }
        if (pmd.a().e() != null && d()) {
            a(str, b);
        }
        String str3 = TAG;
        Log.e(str3, "error:" + str2);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        pmi d = pmd.a().d();
        return d != null && l.d(d.a("tblive", "enableXTrackTLog", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        pmi d = pmd.a().d();
        return d != null && l.d(d.a("tblive", "enableXTrackClick", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTrackInfoAutofill", "true"));
    }

    public String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        return stringWriter.toString();
    }
}
