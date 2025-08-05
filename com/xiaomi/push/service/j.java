package com.xiaomi.push.service;

import com.xiaomi.push.jb;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static a f24712a;

    /* renamed from: a  reason: collision with other field name */
    private static b f1003a;

    /* loaded from: classes9.dex */
    public interface a {
        boolean a(jb jbVar);
    }

    /* loaded from: classes9.dex */
    public interface b {
    }

    public static void a(b bVar) {
        f1003a = bVar;
    }

    public static boolean a(jb jbVar) {
        String str;
        if (f24712a == null || jbVar == null) {
            str = "rc params is null, not cpra";
        } else if (com.xiaomi.push.j.m2118a(com.xiaomi.push.r.m2212a())) {
            return f24712a.a(jbVar);
        } else {
            str = "rc app not permission to cpra";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
        return false;
    }
}
