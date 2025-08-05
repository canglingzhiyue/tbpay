package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface UserMotionEventType {
    public static final String COMPONENT_APPEAR = "componentAppear";
    public static final String COMPONENT_CLICK = "componentClick";
    public static final String COMPONENT_DISAPPEAR = "componentDisappear";
    public static final String SCROLL = "scroll";
    public static final String UNDEFINE = "undefine";
}
