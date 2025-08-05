package com.taobao.alivfssdk.cache;

import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface h extends Closeable {
    public static final int CACHE_KEY_NO_ENCRYPTION = 268435456;
    public static final int ENCRYPTED = 1;
    public static final int NAME_MD5 = 8;
    public static final int PERSIST = 4;
    public static final int VERIFY = 2;

    /* loaded from: classes.dex */
    public interface a {
        void onAllObjectRemoveCallback(boolean z);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(String str, Object obj);
    }

    /* loaded from: classes4.dex */
    public interface c<T> {
        void a(String str, String str2, Object obj);
    }

    /* loaded from: classes.dex */
    public interface d {
        void onObjectRemoveCallback(String str, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(String str, String str2, boolean z);
    }

    /* loaded from: classes.dex */
    public interface f {
        void onObjectSetCallback(String str, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface g {
        void a(String str, String str2, boolean z);
    }

    <T> T a(String str, Class<T> cls);

    <T> T a(String str, String str2, Class<T> cls);

    Set<String> a();

    void a(a aVar);

    void a(String str, d dVar);

    <T> void a(String str, Class<T> cls, b<T> bVar);

    void a(String str, Object obj, f fVar);

    boolean a(String str);

    boolean a(String str, InputStream inputStream);

    boolean a(String str, Object obj);

    boolean a(String str, String str2);

    boolean a(String str, String str2, InputStream inputStream);

    boolean a(String str, String str2, InputStream inputStream, int i);

    boolean a(String str, String str2, Object obj, int i);

    <T> T b(String str);

    <T> T b(String str, String str2);

    boolean b();

    void c();

    boolean c(String str);

    boolean c(String str, String str2);

    InputStream d(String str);

    InputStream d(String str, String str2);

    long e(String str);

    long e(String str, String str2);

    List<String> f(String str);
}
