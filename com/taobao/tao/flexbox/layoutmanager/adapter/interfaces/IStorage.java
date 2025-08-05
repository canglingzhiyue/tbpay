package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface IStorage {
    public static final String TYPE_CONFIG = "config";
    public static final String TYPE_DSL = "dsl";
    public static final String TYPE_FILE = "file";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Type {
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj);
    }

    File a(String str);

    Object a(String str, String str2);

    void a(String str, Object obj);

    void a(String str, String str2, Object obj);

    void a(String str, byte[] bArr);

    boolean a(long j);

    Object b(String str);

    boolean b(String str, String str2);
}
