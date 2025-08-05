package com.etao.feimagesearch.capture.scan;

/* loaded from: classes3.dex */
public enum ScanMode {
    ACCURATE_MODE("accurate"),
    TOUGH_MODE("tough");
    
    private final String mode;

    ScanMode(String str) {
        this.mode = str;
    }

    public String getScanMode() {
        return this.mode;
    }
}
