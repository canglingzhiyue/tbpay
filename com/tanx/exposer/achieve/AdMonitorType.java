package com.tanx.exposer.achieve;

/* loaded from: classes4.dex */
public enum AdMonitorType {
    CLICK("点击"),
    EXPOSE("曝光"),
    INTERACT("互动");
    
    String description;

    AdMonitorType(String str) {
        this.description = str;
    }

    public static boolean inSystemTypes(AdMonitorType adMonitorType) {
        if (adMonitorType != null) {
            return adMonitorType == CLICK || adMonitorType == EXPOSE || adMonitorType == INTERACT;
        }
        return false;
    }
}
