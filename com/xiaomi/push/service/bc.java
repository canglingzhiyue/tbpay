package com.xiaomi.push.service;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes9.dex */
public class bc {

    /* renamed from: a  reason: collision with root package name */
    private static long f24659a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static String f946a = "";

    public static String a() {
        if (StringUtils.isEmpty(f946a)) {
            f946a = com.xiaomi.push.bm.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f946a);
        long j = f24659a;
        f24659a = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    public static String a(String str) {
        if (StringUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }

    public static String b() {
        return com.xiaomi.push.bm.a(32);
    }
}
