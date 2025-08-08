package com.loc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.loc.o;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class al {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7657a = x.c("SRFZHZUVZT3BOa0ZiemZRQQ");
    private static final String b = x.c("FbGJzX3Nkaw");
    private static final String c = x.c("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");
    private static final String d = x.c("FQU5EU0RLMTA");
    private static final String e = x.c("FMTAw");
    private static boolean f = false;
    private String g = "";

    public static o.a a() {
        return new o.a() { // from class: com.loc.al.1

            /* renamed from: a  reason: collision with root package name */
            private al f7658a = new al();

            @Override // com.loc.o.a
            public final bt a(byte[] bArr, Map<String, String> map) {
                return new bn(bArr, map);
            }

            @Override // com.loc.o.a
            public final String a() {
                return al.c();
            }

            @Override // com.loc.o.a
            public final String a(Context context, String str) {
                return al.a(context, str);
            }

            @Override // com.loc.o.a
            public final String a(String str, String str2, String str3, String str4) {
                return this.f7658a.a(str, str2, str3, str4);
            }

            @Override // com.loc.o.a
            public final Map<String, String> b() {
                return this.f7658a.b();
            }
        };
    }

    public static String a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(x.c("UY29kZQ")) != 1) {
                return "";
            }
            String optString = new JSONObject(jSONObject.optString(x.c("FZGF0YQ"))).optString(x.c("FYWRpdQ"));
            if (StringUtils.isEmpty(optString)) {
                return "";
            }
            am.a(optString);
            ah.a(context).a(optString);
            return optString;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String c() {
        return am.a();
    }

    private String d() {
        if (!StringUtils.isEmpty(this.g)) {
            return this.g;
        }
        String a2 = p.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < a2.length(); i++) {
            stringBuffer.append((char) (a2.charAt(i) - (i % 48)));
        }
        String stringBuffer2 = stringBuffer.toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i2 = 0; i2 < stringBuffer2.length() / 2; i2++) {
            stringBuffer3.append((char) ((stringBuffer2.charAt(i2) + stringBuffer2.charAt((stringBuffer2.length() - 1) - i2)) / 2));
        }
        this.g = stringBuffer3.toString();
        return this.g;
    }

    public final String a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(x.c("LdGlk"), str);
            jSONObject.put(x.c("FZGl1"), str2);
            jSONObject.put(x.c("AZGl1Mg"), str3);
            jSONObject.put(x.c("EZGl1Mw"), str4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        if (StringUtils.isEmpty(jSONObject2)) {
            return null;
        }
        String a2 = ao.a();
        if (!StringUtils.isEmpty(a2)) {
            String a3 = aj.a(bk.a((jSONObject2 + "\u0000").getBytes(), a2.getBytes()));
            if (!StringUtils.isEmpty(a3)) {
                try {
                    String a4 = aj.a(an.a(a2.getBytes("utf-8"), an.a(d())));
                    return x.c("Fa2V5PQ") + URLEncoder.encode(a4) + x.c("SJmRhdGE9") + URLEncoder.encode(a3);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public final synchronized Map<String, String> b() {
        if (f) {
            return null;
        }
        f = true;
        HashMap hashMap = new HashMap();
        hashMap.put(x.c("FZW50"), x.c("FMg"));
        StringBuilder sb = new StringBuilder();
        sb.append(x.c("SY2hhbm5lbD0"));
        sb.append(b);
        sb.append(x.c("SJmRpdj0"));
        sb.append(d);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(b);
        stringBuffer.append(d);
        stringBuffer.append(x.c("FQA"));
        stringBuffer.append(c);
        String a2 = ao.a(stringBuffer.toString());
        sb.append(x.c("FJnNpZ249"));
        sb.append(a2.toUpperCase(Locale.US));
        sb.append(x.c("SJm91dHB1dD1qc29u") + "\u0000");
        hashMap.put(x.c("FaW4"), aj.a(bk.a(sb.toString().getBytes(), f7657a.getBytes())));
        hashMap.put(x.c("Sa2V5dA"), e);
        return hashMap;
    }
}
