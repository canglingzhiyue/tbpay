package com.taobao.android.weex;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;

/* loaded from: classes6.dex */
public interface WeexValue extends Serializable {

    /* loaded from: classes6.dex */
    public enum Type {
        UNDEFINED,
        NULL,
        LONG,
        DOUBLE,
        BOOL,
        STRING,
        ARRAY,
        OBJECT,
        ARRAY_BUFFER,
        FUNCTION
    }

    JSONArray getArray();

    byte[] getArrayBuffer();

    boolean getBool();

    double getDouble();

    int getFunctionID();

    int getInt();

    long getLong();

    JSONObject getObject();

    String getString();

    Type getType();

    Object getValue();

    boolean isArray();

    boolean isArrayBuffer();

    boolean isBool();

    boolean isDouble();

    boolean isInt();

    boolean isLong();

    boolean isNull();

    boolean isObject();

    boolean isString();

    boolean isUndefined();

    boolean isUndefinedOrNull();

    byte[] toArrayBufferOrNull();

    boolean toBoolValue() throws Exception;

    boolean toBoolValueSafe(boolean z);

    double toDoubleValue() throws Exception;

    double toDoubleValueSafe(double d);

    float toFloatValue() throws Exception;

    float toFloatValueSafe(float f);

    b toFunctionOrNull(WeexInstance weexInstance) throws Exception;

    int toIntValue() throws Exception;

    int toIntValueSafe(int i);

    JSONArray toJSONArrayOrNulSafe();

    JSONArray toJSONArrayOrNull() throws Exception;

    JSONObject toJSONObjectOrNull() throws Exception;

    JSONObject toJSONObjectOrNullSafe();

    String toJSONString();

    long toLongValue() throws Exception;

    long toLongValueSafe(long j);

    String toStringValue();

    String toStringValueOrNull();
}
