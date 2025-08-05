package com.alibaba.wireless.aliprivacy;

/* loaded from: classes3.dex */
public enum PrivacyCode {
    SUCCESS(0),
    ERROR_INPUT_PARAMS(-1),
    ERROR_EMPTY_SCENE_CODE(-2),
    ERROR_EMPTY_PERMISSIONS(-3),
    ERROR_WRITE_CACHE(-4);
    
    private final int code;

    PrivacyCode(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
