package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jlm extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 10;
    private static String c;
    public String b;

    public static /* synthetic */ Object ipc$super(jlm jlmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(-1017570758);
        c = "TSWVCookieExpression";
    }

    private jlm(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(10, str.length() - 1);
        } catch (Throwable th) {
            jkq.a(c, "parse TSWVCookieExpression error", th);
        }
    }

    public static jlm b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlm) ipChange.ipc$dispatch("e2617fdd", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@wvCookie(")) {
            return null;
        }
        return new jlm(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            String c2 = aVar.c();
            if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(c2)) {
                String[] split = this.b.split(",");
                Map<String, String> a2 = a(c2);
                StringBuilder sb = new StringBuilder();
                if (a2 != null && split.length > 0) {
                    boolean z = true;
                    for (String str : split) {
                        String decode = Uri.decode(a2.get(str));
                        if (decode != null) {
                            if (z) {
                                sb.append(decode);
                                z = false;
                            } else {
                                sb.append(";");
                                sb.append(decode);
                            }
                        }
                    }
                }
                jkq.a(c, "parse TSWVCookieExpression params = " + ((Object) sb));
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            jkq.a(c, "parse TSWVCookieExpression params error", th);
            return null;
        }
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        String a2 = android.taobao.windvane.a.a(str);
        if (TextUtils.isEmpty(a2)) {
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
