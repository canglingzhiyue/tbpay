package com.taobao.update.types;

import tb.rfx;

/* loaded from: classes9.dex */
public enum PatchType {
    INSTANTPATCH(0, rfx.HOTPATCH),
    CPPINLINEPATCH(1, rfx.CPPINLINEPATCH),
    MAIN(2, "main"),
    DYNAMICUPDATE(3, rfx.DYNAMICUPDATE),
    TESTURL(4, rfx.TEST_URL),
    PRELOAD(5, "preload");
    
    private String key;
    private int priority;

    PatchType(int i, String str) {
        this.priority = i;
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public int getPriority() {
        return this.priority;
    }
}
