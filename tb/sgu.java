package tb;

import android.util.Base64;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.http.HttpType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes9.dex */
public final class sgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sgu INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f33564a;

    static {
        kge.a(-1111378721);
        INSTANCE = new sgu();
        Pattern compile = Pattern.compile("charset=([a-z0-9-]+)");
        q.b(compile, "Pattern.compile(\"charset=([a-z0-9-]+)\")");
        f33564a = compile;
    }

    private sgu() {
    }

    public final Map<String, String> a(qpz response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35f14e32", new Object[]{this, response});
        }
        q.d(response, "response");
        HashMap hashMap = new HashMap();
        if (response.b() != null) {
            for (Map.Entry<String, List<String>> entry : response.b().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!value.isEmpty()) {
                    if (key == null) {
                        key = "_";
                    }
                    hashMap.put(key, value.get(0));
                }
            }
        }
        return hashMap;
    }

    public final Object a(String data, HttpType httpType) throws JSONException {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ac6727bd", new Object[]{this, data, httpType});
        }
        q.d(data, "data");
        if (httpType == HttpType.json) {
            return JSONObject.parse(data);
        }
        if (httpType != HttpType.jsonp) {
            return data;
        }
        String str = data;
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return new JSONObject();
        }
        int a2 = n.a((CharSequence) str, riy.BRACKET_START_STR, 0, false, 6, (Object) null) + 1;
        int b = n.b((CharSequence) str, riy.BRACKET_END_STR, 0, false, 6, (Object) null);
        if (a2 == 0 || a2 >= b || b <= 0) {
            return new JSONObject();
        }
        String substring = data.substring(a2, b);
        q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return JSONObject.parse(substring);
    }

    public final byte[] a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{this, inputStream});
        }
        q.d(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (UnsupportedEncodingException e) {
            TMSLogger.b("HttpUtils", e.getMessage(), e);
            return null;
        } catch (IOException e2) {
            TMSLogger.b("HttpUtils", e2.getMessage(), e2);
            return null;
        }
    }

    public final String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str});
        }
        if (map == null || str == null) {
            return null;
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Locale locale = Locale.ROOT;
        q.b(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        q.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return map.get(lowerCase);
    }

    public final String b(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc678f96", new Object[]{this, inputStream});
        }
        q.d(inputStream, "inputStream");
        byte[] a2 = a(inputStream);
        if (a2 == null) {
            return null;
        }
        String str = null;
        try {
            return Base64.encodeToString(a2, 2);
        } catch (Exception e) {
            TMSLogger.b("HttpUtils", e.getMessage(), e);
            return str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(2:8|(9:10|(1:12)|13|14|15|(2:16|(1:18)(1:19))|20|21|22))|39|(0)|13|14|15|(3:16|(0)(0)|18)|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.b("HttpUtils", "http channel readAsString error", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.b("HttpUtils", r10.getMessage(), r10);
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.b("HttpUtils", r10.getMessage(), r10);
        r10 = r2.toString();
        kotlin.jvm.internal.q.b(r10, "result.toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r9.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[Catch: all -> 0x007e, IOException -> 0x0080, UnsupportedEncodingException -> 0x0090, LOOP:0: B:16:0x005e->B:18:0x0065, LOOP_END, TryCatch #2 {IOException -> 0x0080, blocks: (B:15:0x005c, B:16:0x005e, B:18:0x0065, B:19:0x0069), top: B:41:0x005c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[EDGE_INSN: B:43:0x0069->B:19:0x0069 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.io.InputStream r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "http channel readAsString error"
            java.lang.String r1 = "HttpUtils"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.sgu.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1f
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r8
            r0[r4] = r9
            r9 = 2
            r0[r9] = r10
            java.lang.String r9 = "967c10b"
            java.lang.Object r9 = r2.ipc$dispatch(r9, r0)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1f:
            java.lang.String r2 = "inputStream"
            kotlin.jvm.internal.q.d(r9, r2)
            java.lang.String r2 = "utf-8"
            if (r10 == 0) goto L51
            java.util.regex.Pattern r3 = tb.sgu.f33564a
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r7 = "Locale.ROOT"
            kotlin.jvm.internal.q.b(r6, r7)
            java.lang.String r10 = r10.toLowerCase(r6)
            java.lang.String r6 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.q.b(r10, r6)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.util.regex.Matcher r10 = r3.matcher(r10)
            java.lang.String r3 = "CHARSET_PATTERN.matcher(…toLowerCase(Locale.ROOT))"
            kotlin.jvm.internal.q.b(r10, r3)
            boolean r3 = r10.find()
            if (r3 == 0) goto L51
            java.lang.String r10 = r10.group(r4)
            goto L52
        L51:
            r10 = r2
        L52:
            if (r10 != 0) goto L55
            r10 = r2
        L55:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80 java.io.UnsupportedEncodingException -> L90
        L5e:
            int r4 = r9.read(r3)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80 java.io.UnsupportedEncodingException -> L90
            r6 = -1
            if (r4 == r6) goto L69
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80 java.io.UnsupportedEncodingException -> L90
            goto L5e
        L69:
            java.lang.String r10 = r2.toString(r10)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80 java.io.UnsupportedEncodingException -> L90
            java.lang.String r3 = "result.toString(charset)"
            kotlin.jvm.internal.q.b(r10, r3)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80 java.io.UnsupportedEncodingException -> L90
            r9.close()     // Catch: java.lang.Exception -> L77
            goto La7
        L77:
            r9 = move-exception
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.taobao.themis.kernel.basic.TMSLogger.b(r1, r0, r9)
            goto La7
        L7e:
            r10 = move-exception
            goto La8
        L80:
            r10 = move-exception
            java.lang.String r2 = r10.getMessage()     // Catch: java.lang.Throwable -> L7e
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> L7e
            com.taobao.themis.kernel.basic.TMSLogger.b(r1, r2, r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r10 = ""
            r9.close()     // Catch: java.lang.Exception -> L77
            goto La7
        L90:
            r10 = move-exception
            java.lang.String r3 = r10.getMessage()     // Catch: java.lang.Throwable -> L7e
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> L7e
            com.taobao.themis.kernel.basic.TMSLogger.b(r1, r3, r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "result.toString()"
            kotlin.jvm.internal.q.b(r10, r2)     // Catch: java.lang.Throwable -> L7e
            r9.close()     // Catch: java.lang.Exception -> L77
        La7:
            return r10
        La8:
            r9.close()     // Catch: java.lang.Exception -> Lac
            goto Lb2
        Lac:
            r9 = move-exception
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.taobao.themis.kernel.basic.TMSLogger.b(r1, r0, r9)
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sgu.a(java.io.InputStream, java.lang.String):java.lang.String");
    }
}
