package com.etao.feimagesearch.capture.scan;

/* loaded from: classes3.dex */
public enum ScanFromEnum {
    SYS_CAMERA("sys_camera"),
    SYS_ALBUM("sys_album"),
    SYS_HISTORY("sys_history"),
    PLT_CAMERA("plt_camera"),
    PLT_ALBUM("plt_album"),
    PLT_HISTORY("plt_history"),
    PLT_OUTER_ALBUM("plt_outer_album"),
    SMART_LENS("smart_lens");
    
    private final String scanFrom;

    ScanFromEnum(String str) {
        this.scanFrom = str;
    }

    public final String getScanFrom() {
        return this.scanFrom;
    }
}
