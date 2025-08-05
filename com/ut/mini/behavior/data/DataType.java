package com.ut.mini.behavior.data;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;

/* loaded from: classes9.dex */
public enum DataType {
    Begin(TplMsg.VALUE_T_NATIVE_RETURN),
    Event("e");
    
    private final String value;

    DataType(String str) {
        this.value = str;
    }

    public static DataType getDataType(String str) {
        DataType[] values;
        if (TextUtils.isEmpty(str)) {
            return Event;
        }
        for (DataType dataType : values()) {
            if (dataType.getValue().equals(str)) {
                return dataType;
            }
        }
        return Event;
    }

    public String getValue() {
        return this.value;
    }
}
