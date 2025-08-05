package com.taobao.tao.remotebusiness;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface InteractOption {
    public static final String ANTI_ATTACK = "anti_attack";
    public static final String INTERACT_FINISH = "interact_finish";
    public static final String LOGIN = "login";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Definition {
    }
}
