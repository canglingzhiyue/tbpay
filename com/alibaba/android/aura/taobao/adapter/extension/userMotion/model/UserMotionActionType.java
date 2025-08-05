package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface UserMotionActionType {
    public static final String COMPONENT_APPEAR = "motion_appear";
    public static final String COMPONENT_CLICK = "motion_click";
    public static final String COMPONENT_DISAPPEAR = "motion_disappear";
    public static final String COMPONENT_SCROLL = "motion_scroll";
}
