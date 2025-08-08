package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jkx extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 12;
    private static String b;

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(-747236775);
        b = "TSBizinfoAldExpression";
    }

    private jkx(String str) {
        this.f29616a = str;
    }

    public static jkx b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkx) ipChange.ipc$dispatch("e2617d71", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@bizinfo_ald")) {
            return null;
        }
        return new jkx(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            Uri b2 = aVar.b();
            if (b2 == null) {
                return null;
            }
            String a2 = a(b2);
            String str = b;
            jkq.a(str, "parse bizinfo_ald params = " + a2);
            return a2;
        } catch (Throwable th) {
            jkq.a(b, "parse bizinfo_ald params error", th);
            return null;
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        String b2 = b(uri);
        return b2 == null ? c(uri) : b2;
    }

    public static String b(Uri uri) {
        String str;
        int indexOf;
        int i;
        int indexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{uri});
        }
        String path = uri.getPath();
        String substring = (StringUtils.isEmpty(path) || (indexOf = path.indexOf("/wow/a/act/")) < 0 || (indexOf2 = path.indexOf("/", (i = indexOf + 11))) <= i) ? null : path.substring(i, indexOf2);
        String queryParameter = uri.getQueryParameter("wh_pid");
        if (!StringUtils.isEmpty(queryParameter)) {
            String[] split = queryParameter.split("-");
            if (split.length > 0) {
                str = split[split.length - 1];
                if (!StringUtils.isEmpty(substring) || StringUtils.isEmpty(str)) {
                    return null;
                }
                return "business=" + substring + ";page=" + str;
            }
        }
        str = null;
        if (!StringUtils.isEmpty(substring)) {
        }
        return null;
    }

    public static String c(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6767f723", new Object[]{uri});
        }
        String host = uri.getHost();
        if (host != null) {
            String[] split = host.split("\\.");
            if (split.length >= 2) {
                str = split[split.length - 2];
                String path = uri.getPath();
                if (!StringUtils.isEmpty(str) || StringUtils.isEmpty(path)) {
                    return null;
                }
                return "business=" + str + ";page=" + path;
            }
        }
        str = null;
        String path2 = uri.getPath();
        if (!StringUtils.isEmpty(str)) {
        }
        return null;
    }
}
