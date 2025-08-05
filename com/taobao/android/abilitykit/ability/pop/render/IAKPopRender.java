package com.taobao.android.abilitykit.ability.pop.render;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.abilitykit.ability.pop.model.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dle;

/* loaded from: classes4.dex */
public interface IAKPopRender<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, ABILITY_CONTEXT extends dle> {
    public static final String BLOCK_CLOSE_TYPE = "type";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CloseType {
        public static final String CLICK_OUT = "tapToDismiss";
        public static final String ERROR_CLOSE = "errorToDismiss";
        public static final String NATIVE_CLOSE = "nativeCloseToDismiss";
        public static final String PAN_CLOSE = "panToDismiss";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LifecycleType {
        public static final String ANIMATION_POSITION_CHANGE = "std_pop_did_anim_change_position";
        public static final String BEFORE_CLOSE = "std_pop_did_close";
        public static final String BLOCK_CLOSE = "std_pop_should_close";
        public static final String CHANGE_POSITION = "std_pop_did_change_position";
        public static final String CHANGE_SIZE_END = "std_pop_change_size_end";
        public static final String CHANGE_SIZE_START = "std_pop_change_size_start";
        public static final String IN_ANIMATION_END = "std_pop_in_animation_end";
        public static final String IN_ANIMATION_START = "std_pop_in_animation_start";
        public static final String OFFSET_DISABLE = "std_pop_offset_disable";
        public static final String OFFSET_ENABLE = "std_pop_offset_enable";
        public static final String OUT_ANIMATION_END = "std_pop_out_animation_end";
        public static final String OUT_ANIMATION_START = "std_pop_out_animation_start";
        public static final String PAN_ANIMATION_RECOVER_END = "std_pop_recover_animation_end";
        public static final String PAN_ANIMATION_RECOVER_START = "std_pop_recover_animation_start";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface WindowState {
        public static final String STD_POP_FULL_SCREEN = "std_pop_full_screen";
        public static final String STD_POP_HALF = "std_pop_half";
        public static final String STD_POP_UNDEFINED = "std_pop_undefined";
    }

    void a(int i, int i2);

    void a(View view);

    void a(String str, JSONObject jSONObject);

    void a(ABILITY_CONTEXT ability_context, PARAMS params, View view, d dVar);

    boolean a(View view, int i);

    void b(View view);

    void b(String str, JSONObject jSONObject);

    void dW_();
}
