package com.alibaba.motu.tbrest.rest;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import tb.anz;
import tb.byz;
import tb.bzb;
import tb.bzd;
import tb.bzh;
import tb.kge;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f3159a;

    static {
        kge.a(1391888288);
        f3159a = System.currentTimeMillis();
    }

    private static String a(String str) {
        if (bzh.a((CharSequence) str)) {
            return "-";
        }
        if (str == null || "".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\n' && charArray[i] != '\r' && charArray[i] != '\t' && charArray[i] != '|') {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }

    public static String a(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        String str3 = null;
        if (i == 0) {
            return null;
        }
        try {
            String d = bzb.d(com.alibaba.motu.tbrest.d.a().f3151a);
            if (d == null) {
                bzd.c("get utdid failure, so build report failure, now return");
                return null;
            }
            String[] b = bzb.b(com.alibaba.motu.tbrest.d.a().f3151a);
            String str4 = b[0];
            if (b.length > 1 && str4 != null && !"Wi-Fi".equals(str4)) {
                str3 = b[1];
            }
            String str5 = "" + (j > 0 ? j : System.currentTimeMillis());
            String a2 = a(str2);
            String a3 = a(String.valueOf(i));
            String a4 = a(bzh.a(obj));
            String a5 = a(bzh.a(obj2));
            String a6 = a(bzh.a(obj3));
            String a7 = a(bzh.a(map));
            String a8 = a(bzb.f(com.alibaba.motu.tbrest.d.a().f3151a));
            String a9 = a(bzb.e(com.alibaba.motu.tbrest.d.a().f3151a));
            String a10 = a(Build.BRAND);
            a(bzb.a());
            a(a8);
            String a11 = a(Build.MODEL);
            String a12 = a(bzb.c(com.alibaba.motu.tbrest.d.a().f3151a));
            String a13 = a(bzb.a(com.alibaba.motu.tbrest.d.a().f3151a));
            String a14 = a(str4);
            String a15 = a(str3);
            String a16 = a(str);
            String a17 = a(com.alibaba.motu.tbrest.d.a().e);
            String a18 = a(com.alibaba.motu.tbrest.d.a().f);
            String a19 = a(com.alibaba.motu.tbrest.d.a().g);
            String a20 = a(com.alibaba.motu.tbrest.d.a().g);
            String a21 = StringUtils.isEmpty(com.alibaba.motu.tbrest.d.a().j) ? a(bzb.c()) : com.alibaba.motu.tbrest.d.a().j;
            String a22 = a(bzb.b());
            String str6 = com.alibaba.motu.tbrest.d.a().b;
            String str7 = "a";
            String a23 = a(Build.VERSION.RELEASE);
            String str8 = "" + f3159a;
            String a24 = a(d);
            String a25 = a("_app_build_id=" + com.alibaba.motu.tbrest.d.a().k);
            String a26 = a("country=" + a21);
            String a27 = a("aliab=" + com.alibaba.motu.tbrest.d.a().l);
            String a28 = a("utabtestpage=" + com.alibaba.motu.tbrest.d.a().m);
            String a29 = a("dosa_revision_ab=" + com.alibaba.motu.tbrest.d.a().o);
            String a30 = a("languageInfo=" + com.alibaba.motu.tbrest.d.a().r);
            String str9 = com.alibaba.motu.tbrest.d.a().n;
            if (!StringUtils.isEmpty(str9)) {
                str9 = byz.b(str9.getBytes());
            }
            String a31 = a(a26 + "," + a25 + "," + a27 + "," + a28 + "," + a("utabtest=" + str9) + "," + a29 + "," + a30);
            bzh.a((CharSequence) "");
            if (str6 != null && str6.contains("aliyunos")) {
                str7 = "y";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(RestFieldsScheme.IMEI.toString(), a8);
            hashMap.put(RestFieldsScheme.IMSI.toString(), a9);
            hashMap.put(RestFieldsScheme.BRAND.toString(), a10);
            hashMap.put(RestFieldsScheme.DEVICE_MODEL.toString(), a11);
            hashMap.put(RestFieldsScheme.RESOLUTION.toString(), a12);
            hashMap.put(RestFieldsScheme.CARRIER.toString(), a13);
            hashMap.put(RestFieldsScheme.ACCESS.toString(), a14);
            hashMap.put(RestFieldsScheme.ACCESS_SUBTYPE.toString(), a15);
            hashMap.put(RestFieldsScheme.CHANNEL.toString(), a18);
            hashMap.put(RestFieldsScheme.APPKEY.toString(), a16);
            hashMap.put(RestFieldsScheme.APPVERSION.toString(), a17);
            hashMap.put(RestFieldsScheme.LL_USERNICK.toString(), a19);
            hashMap.put(RestFieldsScheme.USERNICK.toString(), a20);
            hashMap.put(RestFieldsScheme.LL_USERID.toString(), "-");
            hashMap.put(RestFieldsScheme.USERID.toString(), "-");
            hashMap.put(RestFieldsScheme.LANGUAGE.toString(), a22);
            hashMap.put(RestFieldsScheme.OS.toString(), str7);
            hashMap.put(RestFieldsScheme.OSVERSION.toString(), a23);
            hashMap.put(RestFieldsScheme.SDKVERSION.toString(), "1.0");
            hashMap.put(RestFieldsScheme.START_SESSION_TIMESTAMP.toString(), "" + f3159a);
            hashMap.put(RestFieldsScheme.UTDID.toString(), a24);
            hashMap.put(RestFieldsScheme.SDKTYPE.toString(), anz.SDK_TYPE);
            hashMap.put(RestFieldsScheme.RESERVE2.toString(), a24);
            hashMap.put(RestFieldsScheme.RESERVE3.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVE4.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVE5.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVES.toString(), a31);
            hashMap.put(RestFieldsScheme.RECORD_TIMESTAMP.toString(), str5);
            hashMap.put(RestFieldsScheme.PAGE.toString(), a2);
            hashMap.put(RestFieldsScheme.EVENTID.toString(), a3);
            hashMap.put(RestFieldsScheme.ARG1.toString(), a4);
            hashMap.put(RestFieldsScheme.ARG2.toString(), a5);
            hashMap.put(RestFieldsScheme.ARG3.toString(), a6);
            hashMap.put(RestFieldsScheme.ARGS.toString(), a7);
            return a(hashMap);
        } catch (Exception e) {
            bzd.b("UTRestAPI buildTracePostReqDataObj catch!", e);
            return "";
        }
    }

    public static String a(Map<String, String> map) {
        boolean z;
        RestFieldsScheme restFieldsScheme;
        StringBuffer stringBuffer = new StringBuffer();
        RestFieldsScheme[] values = RestFieldsScheme.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length || (restFieldsScheme = values[i]) == RestFieldsScheme.ARGS) {
                break;
            }
            if (map.containsKey(restFieldsScheme.toString())) {
                str = bzh.a((Object) map.get(restFieldsScheme.toString()));
                map.remove(restFieldsScheme.toString());
            }
            stringBuffer.append(a(str));
            stringBuffer.append("||");
            i++;
        }
        if (map.containsKey(RestFieldsScheme.ARGS.toString())) {
            stringBuffer.append(a(bzh.a((Object) map.get(RestFieldsScheme.ARGS.toString()))));
            map.remove(RestFieldsScheme.ARGS.toString());
            z = false;
        } else {
            z = true;
        }
        for (String str2 : map.keySet()) {
            String a2 = map.containsKey(str2) ? bzh.a((Object) map.get(str2)) : null;
            if (z) {
                if ("StackTrace".equals(str2)) {
                    stringBuffer.append("StackTrace=====>");
                } else {
                    stringBuffer.append(a(str2));
                    stringBuffer.append("=");
                }
                stringBuffer.append(a2);
                z = false;
            } else {
                if ("StackTrace".equals(str2)) {
                    stringBuffer.append(",");
                    stringBuffer.append("StackTrace=====>");
                } else {
                    stringBuffer.append(",");
                    stringBuffer.append(a(str2));
                    stringBuffer.append("=");
                }
                stringBuffer.append(a2);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        if (bzh.a(stringBuffer2) || !stringBuffer2.endsWith("||")) {
            return stringBuffer2;
        }
        return stringBuffer2 + "-";
    }
}
