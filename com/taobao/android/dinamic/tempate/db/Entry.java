package com.taobao.android.dinamic.tempate.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes.dex */
public abstract class Entry {
    public static final String[] ID_PROJECTION;
    @Column("_id")

    /* renamed from: a  reason: collision with root package name */
    public long f11761a = 0;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Column {
        String defaultValue() default "";

        boolean fullText() default false;

        boolean indexed() default false;

        String value();
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Table {
        String value();
    }

    static {
        kge.a(117986757);
        ID_PROJECTION = new String[]{"_id"};
    }
}
