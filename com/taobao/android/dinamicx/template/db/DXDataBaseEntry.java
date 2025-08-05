package com.taobao.android.dinamicx.template.db;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes.dex */
public abstract class DXDataBaseEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] ID_PROJECTION;
    @Column("_id")
    public long id = 0;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Column {
        String defaultValue() default "";

        boolean indexed() default false;

        boolean notNull() default false;

        boolean primaryKey() default false;

        String value();
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Table {
        String value();
    }

    static {
        kge.a(914071508);
        ID_PROJECTION = new String[]{"_id"};
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.id = 0L;
        }
    }
}
