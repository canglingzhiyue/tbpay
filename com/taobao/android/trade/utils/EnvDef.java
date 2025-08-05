package com.taobao.android.trade.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class EnvDef {
    public static final int DAILY = 2;
    public static final int ONLINE = 0;
    public static final int PRE = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface EnvType {
    }

    static {
        kge.a(1406549492);
    }
}
