package com.taobao.weaver.log;

/* loaded from: classes9.dex */
public interface IWMLog {

    /* loaded from: classes9.dex */
    public enum WMLogLevel {
        WMLogLevelError("Error"),
        WMLogLevelWarn("Warn"),
        WMLogLevelInfo("Info"),
        WMLogLevelDebug("Debug"),
        WMLogLevelVerbose("Verbose");
        
        private String description;

        WMLogLevel(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }
}
