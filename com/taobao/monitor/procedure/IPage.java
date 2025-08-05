package com.taobao.monitor.procedure;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: classes.dex */
public interface IPage {
    public static final IPage DEFAULT_PAGE = new com.taobao.monitor.procedure.c();
    public static final int STATUS_BACK = -4;
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_F2B = -3;
    public static final int STATUS_JUMP_NEXT_PAGE = -5;
    public static final int STATUS_LIFECYCLE_MISS = -6;
    public static final int STATUS_MOVE = -2;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_TIME_OUT = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PageRenderError {
    }

    /* loaded from: classes7.dex */
    public interface a {
        public static final long CALCULATE_FAIL = -1;

        com.taobao.monitor.procedure.a a(IPage iPage);
    }

    /* loaded from: classes.dex */
    public interface b {
        void i(long j);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(String str, long j);

        void a(String str, Object obj);

        void a(String str, Map<String, Object> map);

        void b(String str, Object obj);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(String str, String str2, Map<String, Object> map);

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    void a(View view, a aVar);

    String c();

    d d();

    b e();

    c g();

    String i();
}
