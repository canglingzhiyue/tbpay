package com.taobao.monitor.procedure;

import java.util.Map;

/* loaded from: classes.dex */
public interface g {
    public static final g DEFAULT = new b();

    g a(String str);

    g a(String str, long j);

    @Deprecated
    g a(String str, long j, long j2);

    g a(String str, long j, String str2, Map<String, Object> map);

    g a(String str, long j, Map<String, Object> map);

    g a(String str, Object obj);

    g a(String str, String str2, Map<String, Object> map);

    g a(String str, Map<String, Object> map);

    g a(boolean z);

    String a();

    g b();

    g b(String str, long j);

    g b(String str, Object obj);

    g b(String str, Map<String, Object> map);

    g c(String str, long j);

    g c(String str, Object obj);

    g c(String str, Map<String, Object> map);

    boolean c();

    g d();

    g d(String str, Map<String, Object> map);

    g e(String str, Map<String, Object> map);
}
