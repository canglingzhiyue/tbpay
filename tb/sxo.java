package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes9.dex */
public final class sxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sxo INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<String> f33929a;

    static {
        kge.a(1919192659);
        INSTANCE = new sxo();
        f33929a = p.d("*.taobao.com", "*.tmall.com", "*.alicdn.com", "*.alibaba-inc.com");
    }

    private sxo() {
    }

    private final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (q.a((Object) str2, (Object) "*")) {
            return true;
        }
        if (n.b(str2, "*.", false, 2, (Object) null)) {
            String c = n.c(str2, 2);
            return n.c(str, c, false, 2, (Object) null) && str.length() > c.length() && str.charAt((str.length() - c.length()) - 1) == '.';
        }
        return q.a((Object) str, (Object) str2);
    }

    private final boolean a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue();
        }
        for (String str2 : list) {
            if (a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final sxn a(String str) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxn) ipChange.ipc$dispatch("7c75648b", new Object[]{this, str});
        }
        if (str == null) {
            return new sxn(false);
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null && (host = parse.getHost()) != null) {
                q.b(host, "uri.host ?: return PermissionInfo(false)");
                String aa = com.taobao.themis.kernel.utils.n.aa();
                if (StringUtils.isEmpty(aa)) {
                    return new sxn(a(host, f33929a));
                }
                return new sxn(a(host, n.b((CharSequence) aa, new String[]{","}, false, 0, 6, (Object) null)));
            }
            return new sxn(false);
        } catch (Exception unused) {
            return new sxn(false);
        }
    }
}
