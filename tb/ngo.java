package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.pha.core.p;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes7.dex */
public class ngo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31448a;
    private final Uri b;
    private final JSONObject c;

    static {
        kge.a(-1422233045);
        f31448a = ngo.class.getSimpleName();
    }

    public ngo(Uri uri, JSONObject jSONObject) {
        this.b = uri;
        this.c = jSONObject;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null || str.length() <= 3) {
            ngr.a("PHADataPrefetch datasource error");
            return "";
        }
        String[] split = str.substring(2, str.length() - 1).split("\\.");
        String str2 = null;
        if (split.length == 0) {
            ngr.b(f31448a, "length of split array cannot be less 1");
        } else if (split.length == 1) {
            String str3 = split[0];
            if (str3 != null) {
                str2 = b(str3);
            }
        } else if (split.length == 2) {
            String str4 = split[0];
            String str5 = split[1];
            if (str4 != null && str5 != null) {
                str2 = a(str4, str5);
                String str6 = f31448a;
                ngr.b(str6, str4 + "." + str5 + ResponseProtocolType.COMMENT + str2);
            }
        }
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r9.equals("queryParams") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ngo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r8
            r1[r3] = r9
            java.lang.String r9 = "6111438d"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L18:
            r0 = 0
            android.net.Uri r1 = r8.b
            java.lang.String r1 = r1.toString()
            r5 = -1
            int r6 = r9.hashCode()
            r7 = -1364506514(0xffffffffaeab486e, float:-7.789046E-11)
            if (r6 == r7) goto L49
            r2 = -1354757532(0xffffffffaf400a64, float:-1.746599E-10)
            if (r6 == r2) goto L3f
            r2 = 116079(0x1c56f, float:1.62661E-40)
            if (r6 == r2) goto L34
            goto L53
        L34:
            java.lang.String r2 = "url"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L53
            r2 = 1
            goto L54
        L3f:
            java.lang.String r2 = "cookie"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L53
            r2 = 2
            goto L54
        L49:
            java.lang.String r6 = "queryParams"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L53
            goto L54
        L53:
            r2 = -1
        L54:
            if (r2 == 0) goto Lbd
            if (r2 == r3) goto Lbb
            if (r2 == r4) goto L63
            java.lang.String r9 = tb.ngo.f31448a
            java.lang.String r1 = "unsupported method"
            tb.ngr.b(r9, r1)
            goto Lc3
        L63:
            java.util.Map r9 = r8.c(r1)
            java.lang.String r0 = ""
            if (r9 == 0) goto Lc3
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto Lc3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L7e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "="
            r1.append(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            goto L7e
        La7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = r1.toString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            goto Lc3
        Lbb:
            r0 = r1
            goto Lc3
        Lbd:
            android.net.Uri r9 = r8.b
            java.lang.String r0 = r9.getEncodedQuery()
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ngo.b(java.lang.String):java.lang.String");
    }

    public String a(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1884274053:
                if (str.equals(WXStorageModule.NAME)) {
                    c = 3;
                    break;
                }
                break;
            case -1364506514:
                if (str.equals("queryParams")) {
                    c = 0;
                    break;
                }
                break;
            case -1354757532:
                if (str.equals("cookie")) {
                    c = 1;
                    break;
                }
                break;
            case 100589:
                if (str.equals("env")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return this.b.getQueryParameter(str2);
        }
        if (c == 1) {
            Map<String, String> c2 = c(this.b.toString());
            if (c2 != null && c2.containsKey(str2)) {
                return c2.get(str2);
            }
            return null;
        } else if (c == 2) {
            if (this.c.containsKey(str2) && (obj = this.c.get(str2)) != null) {
                return obj.toString();
            }
            return null;
        } else if (c == 3) {
            nfu h = p.b().h();
            if (h == null) {
                return null;
            }
            return h.a(this.b.toString()).a(str2);
        } else {
            ngr.b(f31448a, "unsupported method");
            return null;
        }
    }

    private Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        if (TextUtils.isEmpty(cookie)) {
            return null;
        }
        String[] split = cookie.replace("\"", "\\\\\"").split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String[] split2 = str2.split("=");
            if (split2.length > 1) {
                hashMap.put(split2[0].trim(), split2[1].trim());
            }
        }
        return hashMap;
    }
}
