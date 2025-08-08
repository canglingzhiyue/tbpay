package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.mnn.j;

/* loaded from: classes3.dex */
public class cof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26351a;

    /* loaded from: classes3.dex */
    public interface a {
        String a(String str);

        String b(String str);
    }

    static {
        kge.a(-1872521619);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa0ebc1", new Object[]{aVar});
        } else {
            f26351a = aVar;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        a aVar = f26351a;
        return aVar == null ? "" : aVar.a(str);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String a2 = a(str);
        return StringUtils.isEmpty(a2) ? str2 : a2;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c(b.bB());
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        String b = j.Companion.a().b();
        if (StringUtils.isEmpty(str)) {
            return b;
        }
        if (StringUtils.isEmpty(b)) {
            return str;
        }
        return str + "," + b;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        a aVar = f26351a;
        return aVar == null ? "" : aVar.b(str);
    }
}
