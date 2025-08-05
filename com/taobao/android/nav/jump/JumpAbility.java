package com.taobao.android.nav.jump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public interface JumpAbility {
    public static final String JUMP_ABILITY_DEFAULT = "jump_ability_default";
    public static final String JUMP_ABILITY_FLOATING_WINDOW = "jump_ability_floating_window";
    public static final String KEY_JUMP_ABILITY = "jump_ability";
    public static final String NAV_JUMP_ABILITY_FRAGMENT = "nav_jump_ability_fragment";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Type {
    }

    String a();

    boolean a(b bVar);
}
