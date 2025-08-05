package com.taobao.falco;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface FalcoLoadActionTransitionType {
    public static final String POP_OVER = "popOver";
    public static final String PUSH = "push";
    public static final String TAB_SELECTED = "tabSelected";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Definition {
    }
}
