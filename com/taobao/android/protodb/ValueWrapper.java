package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class ValueWrapper implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final short VALUE_TYPE_BINARY = 6;
    public static final short VALUE_TYPE_DOUBLE = 4;
    public static final short VALUE_TYPE_FLOAT = 3;
    public static final short VALUE_TYPE_INT = 1;
    public static final short VALUE_TYPE_LONG = 2;
    public static final short VALUE_TYPE_STRING = 5;
    public byte[] binaryValue;
    public double doubleValue;
    public float floatValue;
    public int intValue;
    public long longValue;
    public String stringValue;
    private short type;

    public static ValueWrapper stringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWrapper) ipChange.ipc$dispatch("727f9704", new Object[]{str});
        }
        ValueWrapper valueWrapper = new ValueWrapper();
        valueWrapper.stringValue = str;
        valueWrapper.type = (short) 5;
        return valueWrapper;
    }

    public static ValueWrapper intValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWrapper) ipChange.ipc$dispatch("1fbd456d", new Object[]{new Integer(i)});
        }
        ValueWrapper valueWrapper = new ValueWrapper();
        valueWrapper.intValue = i;
        valueWrapper.type = (short) 1;
        return valueWrapper;
    }

    public static ValueWrapper longValue(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWrapper) ipChange.ipc$dispatch("e9e7c57b", new Object[]{new Long(j)});
        }
        ValueWrapper valueWrapper = new ValueWrapper();
        valueWrapper.longValue = j;
        valueWrapper.type = (short) 2;
        return valueWrapper;
    }

    public static ValueWrapper floatValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWrapper) ipChange.ipc$dispatch("e68cae57", new Object[]{new Float(f)});
        }
        ValueWrapper valueWrapper = new ValueWrapper();
        valueWrapper.floatValue = f;
        valueWrapper.type = (short) 3;
        return valueWrapper;
    }

    public static ValueWrapper doubleValue(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWrapper) ipChange.ipc$dispatch("cb5d830a", new Object[]{new Double(d)});
        }
        ValueWrapper valueWrapper = new ValueWrapper();
        valueWrapper.doubleValue = d;
        valueWrapper.type = (short) 4;
        return valueWrapper;
    }
}
