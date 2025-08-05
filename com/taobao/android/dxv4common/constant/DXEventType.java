package com.taobao.android.dxv4common.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface DXEventType {
    public static final byte TYPE_CALL_JS = 1;
    public static final byte TYPE_CALL_NATIVE = 2;
    public static final byte TYPE_CALL_NATIVE_DYNAMIC = 4;
    public static final byte TYPE_CALL_NATIVE_EXPR = 3;
}
