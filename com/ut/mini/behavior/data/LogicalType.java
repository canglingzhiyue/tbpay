package com.ut.mini.behavior.data;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public enum LogicalType {
    AND("and"),
    OR("or");
    
    private final String value;

    LogicalType(String str) {
        this.value = str;
    }

    public static LogicalType getLogicalType(String str) {
        LogicalType[] values;
        if (TextUtils.isEmpty(str)) {
            return AND;
        }
        for (LogicalType logicalType : values()) {
            if (logicalType.getValue().equals(str)) {
                return logicalType;
            }
        }
        return AND;
    }

    public static boolean isLogicalType(String str) {
        return AND.getValue().equals(str) || OR.getValue().equals(str);
    }

    public String getValue() {
        return this.value;
    }
}
