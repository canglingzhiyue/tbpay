package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jln extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 12;
    private static String c;
    public String b;

    public static /* synthetic */ Object ipc$super(jln jlnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(1425785189);
        c = "TSWVCookieKVExpression";
    }

    private jln(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(12, str.length() - 1);
        } catch (Throwable th) {
            jkq.a(c, "parse TSWVCookieKVExpression error", th);
        }
    }

    public static jln b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jln) ipChange.ipc$dispatch("e2617ffc", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@wvKVCookie(")) {
            return null;
        }
        return new jln(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            String c2 = aVar.c();
            if (!StringUtils.isEmpty(this.b) && !StringUtils.isEmpty(c2)) {
                String[] split = this.b.split(",");
                Map<String, String> a2 = a(c2);
                StringBuilder sb = new StringBuilder();
                if (a2 != null && split.length > 0) {
                    boolean z = true;
                    for (String str : split) {
                        String decode = Uri.decode(a2.get(str));
                        if (decode != null) {
                            if (z) {
                                sb.append(str);
                                sb.append("=");
                                sb.append(decode);
                                z = false;
                            } else {
                                sb.append(";");
                                sb.append(str);
                                sb.append("=");
                                sb.append(decode);
                            }
                        }
                    }
                }
                jkq.a(c, "parse TSWVCookieKVExpression params = " + ((Object) sb));
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            jkq.a(c, "parse TSWVCookieKVExpression params error", th);
            return null;
        }
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        String a2 = android.taobao.windvane.a.a(str);
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        try {
            jkq.a(c, "all wvCookies = " + a2);
            String[] split = a2.replace("\"", "\\\\\"").split(";");
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                String[] split2 = str2.split("=");
                if (split2.length > 1) {
                    hashMap.put(split2[0].trim(), split2[1].trim());
                }
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
