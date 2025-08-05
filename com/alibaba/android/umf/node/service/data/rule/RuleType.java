package com.alibaba.android.umf.node.service.data.rule;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface RuleType {
    public static final String GROUP_SELECT = "group_select";
    public static final String KV_MAPPING = "kvmap";
    public static final String LOCAL_ADJUST = "local_adjust";
    public static final String PROPS_WRITE_BACK = "props_writeback";
    public static final String SWITCH_SELECT = "switch_select";
}
