package com.alibaba.security.ccrc.enums;

/* loaded from: classes3.dex */
public enum InitState {
    UNINIT(-1, "未初始化"),
    INIT_ING(0, "初始化中..."),
    INITED(1, "已经初始化"),
    INIT_SUCCESS(2, "初始化成功"),
    INIT_FAIL(3, "初始化失败");
    
    public final String msg;
    public final int state;

    InitState(int i, String str) {
        this.state = i;
        this.msg = str;
    }

    public int getState() {
        return this.state;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.msg;
    }
}
