package com.taobao.android.weex_framework;

import android.os.AsyncTask;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.util.a;
import java.io.Serializable;
import tb.fne;
import tb.kge;
import tb.mto;
import tb.riy;

@Deprecated
/* loaded from: classes6.dex */
public final class MUSValue implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARRAY_BUFFER = 9;
    public static final int FALSE = 6;
    public static final int FLOAT = 3;
    public static final int FUNCTION = 7;
    public static final int ID = 1;
    public static final int INT = 2;
    public static final int JSON_VALUE = 8;
    private static final String LOG_TAG = "MUSValue";
    public static final int NILL = 0;
    private static final Runnable OOM_DETECTOR;
    public static final int STRING = 4;
    private static final String STRING_CACHE_MARK;
    public static final int TRUE = 5;
    private static final int TYPE_MAX = 10;
    private static String[] TYPE_NAMES;
    private volatile JSON mCachedJSON;
    private final double mFloatValue;
    private final long mIntValue;
    private final Object mObjValue;
    private final int mType;

    public static /* synthetic */ Runnable access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("fae3e4bd", new Object[0]) : OOM_DETECTOR;
    }

    static {
        kge.a(-1233859006);
        kge.a(1028243835);
        TYPE_NAMES = new String[]{"NILL", "ID", fne.TYPE_INT, "FLOAT", fne.TYPE_STRING, "TRUE", "FALSE", "FUNCTION", "JSON", "ARRAY_BUFFER"};
        STRING_CACHE_MARK = new String();
        OOM_DETECTOR = new Runnable() { // from class: com.taobao.android.weex_framework.MUSValue.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                System.gc();
                Log.e(com.taobao.android.weex_framework.util.g.TAG, "Weex OOM WTF detector alloc: " + new Object());
                synchronized (MUSValue.access$000()) {
                    MUSValue.access$000().notify();
                }
                Log.e(com.taobao.android.weex_framework.util.g.TAG, "Weex OOM WTF detector finished");
            }
        };
    }

    public static MUSValue ofNill() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("33f6586a", new Object[0]) : new MUSValue(0, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofID(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("eeefecd9", new Object[]{new Integer(i)}) : new MUSValue(1, i, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("bf54fa3f", new Object[]{new Integer(i)}) : new MUSValue(2, i, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofInt(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("78cc87de", new Object[]{new Long(j)}) : new MUSValue(2, j, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofFloat(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("1b29e78f", new Object[]{new Float(f)}) : new MUSValue(3, 0L, f, null);
    }

    public static MUSValue ofFloat(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("a83acc51", new Object[]{new Double(d)}) : new MUSValue(3, 0L, d, null);
    }

    public static MUSValue ofString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("6b6a8d8a", new Object[]{str});
        }
        if (str == null) {
            return ofNill();
        }
        return new MUSValue(4, 0L, mto.a.GEO_NOT_SUPPORT, str);
    }

    public static MUSValue ofFunction(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("8c3f8076", new Object[]{new Integer(i)}) : new MUSValue(7, i, mto.a.GEO_NOT_SUPPORT, "");
    }

    public static MUSValue ofBool(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("f4ae9697", new Object[]{new Boolean(z)});
        }
        return new MUSValue(z ? 5 : 6, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("479c24a1", new Object[]{obj});
        }
        if (obj == null) {
            return ofNill();
        }
        return new MUSValue(8, 0L, mto.a.GEO_NOT_SUPPORT, JSON.toJSONString(obj));
    }

    public static MUSValue ofJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("653a0cf8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return ofNill();
        }
        MUSValue mUSValue = new MUSValue(8, 0L, mto.a.GEO_NOT_SUPPORT, STRING_CACHE_MARK);
        mUSValue.mCachedJSON = jSONObject;
        return mUSValue;
    }

    public static MUSValue ofJSONArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("25ae51da", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return ofNill();
        }
        MUSValue mUSValue = new MUSValue(8, 0L, mto.a.GEO_NOT_SUPPORT, STRING_CACHE_MARK);
        mUSValue.mCachedJSON = jSONArray;
        return mUSValue;
    }

    public static MUSValue ofArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("be5752d3", new Object[]{bArr});
        }
        if (bArr == null) {
            return ofNill();
        }
        return new MUSValue(9, 0L, mto.a.GEO_NOT_SUPPORT, bArr);
    }

    public static MUSValue ofJSONStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("c0099520", new Object[]{str});
        }
        if (str == null) {
            return ofNill();
        }
        return new MUSValue(8, 0L, mto.a.GEO_NOT_SUPPORT, str);
    }

    public MUSValue(int i, long j, double d, Object obj) {
        String str;
        int i2 = i;
        int i3 = 0;
        if (i2 >= 10 || i2 < 0) {
            com.taobao.android.weex_framework.util.g.f(LOG_TAG, "Construct MUSValue of error type: " + i2);
            this.mType = 0;
            this.mIntValue = 0L;
            this.mFloatValue = mto.a.GEO_NOT_SUPPORT;
            this.mObjValue = null;
            return;
        }
        if (i2 != 1) {
            str = obj;
        } else if (j >= a.ARRAY.length || j < 0) {
            com.taobao.android.weex_framework.util.g.f(LOG_TAG, "Construct MUSValue of error id: " + j);
            this.mType = 0;
            this.mIntValue = 0L;
            this.mFloatValue = mto.a.GEO_NOT_SUPPORT;
            this.mObjValue = null;
            return;
        } else {
            str = a.ARRAY[(int) j];
            i2 = 4;
        }
        this.mType = ((i2 == 4 || i2 == 8 || i2 == 9) && str == null) ? i3 : i2;
        this.mIntValue = j;
        this.mFloatValue = d;
        this.mObjValue = str;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mType;
    }

    public boolean isID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df2d8dd0", new Object[]{this})).booleanValue() : this.mType == 1;
    }

    public boolean isFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue() : this.mType == 7;
    }

    public boolean isInt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue() : this.mType == 2;
    }

    public boolean isFloat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8525add", new Object[]{this})).booleanValue() : this.mType == 3;
    }

    public boolean isString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue() : this.mType == 4;
    }

    public boolean isNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue() : this.mType == 0;
    }

    public boolean isArrayBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue() : this.mType == 9;
    }

    public static boolean isNill(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e677d", new Object[]{mUSValue})).booleanValue() : mUSValue == null || mUSValue.getType() == 0;
    }

    public boolean getBoolValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49703dfc", new Object[]{this})).booleanValue();
        }
        int i = this.mType;
        if (i == 5 || i == 6) {
            return this.mType == 5;
        }
        throw new IllegalStateException("Cant't getBool from " + toString());
    }

    public int getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c17beeb", new Object[]{this})).intValue();
        }
        if (this.mType != 1) {
            throw new IllegalStateException("Cant't getID from " + toString());
        }
        return (int) this.mIntValue;
    }

    public int getFunctionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aaf7703", new Object[]{this})).intValue();
        }
        if (this.mType != 7) {
            throw new IllegalStateException("Cant't getFunctionId from " + toString());
        }
        return (int) this.mIntValue;
    }

    public String getStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a666728f", new Object[]{this});
        }
        if (this.mType != 4) {
            throw new IllegalStateException("Cant't getStringValue from " + toString());
        }
        return (String) this.mObjValue;
    }

    public String getJSONStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76041c77", new Object[]{this});
        }
        if (this.mType != 8) {
            throw new IllegalStateException("Cant't getJSONStringValue from " + toString());
        }
        Object obj = this.mObjValue;
        if (obj == STRING_CACHE_MARK) {
            return this.mCachedJSON.toJSONString();
        }
        return (String) obj;
    }

    public int getIntValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
        }
        if (this.mType != 2) {
            throw new IllegalStateException("Cant't getIntValue from " + toString());
        }
        return (int) this.mIntValue;
    }

    public long getLongValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("403a969a", new Object[]{this})).longValue();
        }
        if (this.mType != 2) {
            throw new IllegalStateException("Cant't getIntValue from " + toString());
        }
        return this.mIntValue;
    }

    public float getFloatValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47eea762", new Object[]{this})).floatValue();
        }
        if (this.mType != 3) {
            throw new IllegalStateException("Cant't getFloatValue from " + toString());
        }
        return (float) this.mFloatValue;
    }

    public float getDoubleValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c562661", new Object[]{this})).floatValue();
        }
        if (this.mType != 3) {
            throw new IllegalStateException("Cant't getFloatValue from " + toString());
        }
        return (float) this.mFloatValue;
    }

    public byte[] getArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("deaefc53", new Object[]{this});
        }
        if (this.mType != 9) {
            throw new IllegalStateException("Cant't getArrayBuffer from " + toString());
        }
        return (byte[]) this.mObjValue;
    }

    public String UNSAFE_getStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("480ad076", new Object[]{this});
        }
        if (this.mObjValue == STRING_CACHE_MARK && this.mCachedJSON != null) {
            return this.mCachedJSON.toJSONString();
        }
        return (String) this.mObjValue;
    }

    public byte[] UNSAFE_getArrayBufferValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("96d7de01", new Object[]{this}) : (byte[]) this.mObjValue;
    }

    public long UNSAFE_getLongValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec126c13", new Object[]{this})).longValue() : this.mIntValue;
    }

    public double UNSAFE_getDoubleValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("718e8198", new Object[]{this})).doubleValue() : this.mFloatValue;
    }

    public Object getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return null;
            case 1:
            case 2:
            case 7:
                return Long.valueOf(this.mIntValue);
            case 3:
                return Double.valueOf(this.mFloatValue);
            case 4:
                return this.mObjValue;
            case 5:
                return true;
            case 6:
                return false;
            case 8:
                return getJSONValue();
            case 9:
                return getArrayBuffer();
            default:
                throw new IllegalStateException("Invalid MUSValue type " + this.mType);
        }
    }

    private JSON getJSONValue() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("f967aef9", new Object[]{this});
        }
        if (this.mType != 8) {
            throw new IllegalStateException("Cant't getJSONValue from " + toString());
        }
        if (this.mCachedJSON == null) {
            try {
                if (((String) this.mObjValue).startsWith(riy.ARRAY_START_STR)) {
                    try {
                        this.mCachedJSON = JSON.parseArray((String) this.mObjValue);
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        try {
                            if (z) {
                                this.mCachedJSON = JSON.parseObject((String) this.mObjValue);
                            } else {
                                this.mCachedJSON = JSON.parseArray((String) this.mObjValue);
                            }
                        } catch (Exception unused) {
                            com.taobao.android.weex_framework.util.g.c(LOG_TAG, "getJSONValue err", e);
                        }
                        return this.mCachedJSON;
                    }
                } else {
                    this.mCachedJSON = JSON.parseObject((String) this.mObjValue);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return this.mCachedJSON;
    }

    public float convertToFloat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a450e5", new Object[]{this})).floatValue();
        }
        int i = this.mType;
        if (i == 2) {
            return (float) this.mIntValue;
        }
        if (i == 3) {
            return (float) this.mFloatValue;
        }
        if (i == 4) {
            return Float.parseFloat((String) this.mObjValue);
        }
        throw new IllegalStateException("MUSValue can't convert to float, type: " + this.mType);
    }

    public int convertToInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05da17b", new Object[]{this})).intValue();
        }
        int i = this.mType;
        if (i == 2) {
            return (int) this.mIntValue;
        }
        if (i == 3) {
            return (int) this.mFloatValue;
        }
        if (i == 4) {
            return (int) Float.parseFloat((String) this.mObjValue);
        }
        throw new IllegalStateException("MUSValue can't convert to float, type: " + this.mType);
    }

    public String convertToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("819f4b1a", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
            case 7:
                return "";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return (String) this.mObjValue;
            case 5:
                return "true";
            case 6:
                return "false";
            case 8:
                Object obj = this.mObjValue;
                if (obj == STRING_CACHE_MARK) {
                    return this.mCachedJSON.toJSONString();
                }
                return (String) obj;
            case 9:
                return this.mObjValue.toString();
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public String printToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("452fd060", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
                return "ID(not support yet)";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return "\"" + ((String) this.mObjValue) + "\"";
            case 5:
                return "true";
            case 6:
                return "false";
            case 7:
                return String.format("function(%d)", Long.valueOf(this.mIntValue));
            case 8:
                Object obj = this.mObjValue;
                if (obj == STRING_CACHE_MARK) {
                    return this.mCachedJSON.toJSONString();
                }
                return (String) obj;
            case 9:
                return "array_buffer";
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.mType;
        switch (i) {
            case 0:
            case 5:
            case 6:
                return String.format("{%s}", TYPE_NAMES[i]);
            case 1:
            case 2:
            case 7:
                return String.format("{%s, %d}", TYPE_NAMES[i], Long.valueOf(this.mIntValue));
            case 3:
                return String.format("{%s : %f}", TYPE_NAMES[i], Double.valueOf(this.mFloatValue));
            case 4:
                return String.format("{%s : %s}", TYPE_NAMES[i], this.mObjValue);
            case 8:
                Object obj = this.mObjValue;
                return obj == STRING_CACHE_MARK ? String.format("{%s : %s}", TYPE_NAMES[i], this.mCachedJSON.toJSONString()) : String.format("{%s : %s}", TYPE_NAMES[i], obj);
            case 9:
                return String.format("{%s : %s}", TYPE_NAMES[i], this.mObjValue.toString());
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public String toShortString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a01007", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
                return "ID(not support yet)";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return "\"" + this.mObjValue + "\"";
            case 5:
                return "true";
            case 6:
                return "false";
            case 7:
                return String.format("func(%d)", Long.valueOf(this.mIntValue));
            case 8:
                Object obj = this.mObjValue;
                return obj == STRING_CACHE_MARK ? String.format("json(%s)", this.mCachedJSON.toJSONString()) : String.format("json(%s)", obj);
            case 9:
                return String.format("array_buffer(%s)", Integer.valueOf(((byte[]) this.mObjValue).length));
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public static MUSValue CreateMUSValue(int i, long j, double d, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("85e20933", new Object[]{new Integer(i), new Long(j), new Double(d), obj});
        }
        try {
            try {
                return new MUSValue(i, j, d, obj);
            } catch (OutOfMemoryError unused) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(OOM_DETECTOR);
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return null;
                }
                synchronized (OOM_DETECTOR) {
                    OOM_DETECTOR.wait(10000L);
                    return null;
                }
            }
        } catch (Throwable th) {
            Log.e(com.taobao.android.weex_framework.util.g.TAG, "throwable", th);
            return null;
        }
    }

    public WeexValue convertWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("faa51697", new Object[]{this});
        }
        try {
            switch (this.mType) {
                case 0:
                    return WeexValueImpl.ofNull();
                case 1:
                case 2:
                    return WeexValueImpl.ofInt((int) this.mIntValue);
                case 3:
                    return WeexValueImpl.ofDouble(this.mFloatValue);
                case 4:
                    return WeexValueImpl.ofString((String) this.mObjValue);
                case 5:
                    return WeexValueImpl.ofBool(true);
                case 6:
                    return WeexValueImpl.ofBool(false);
                case 7:
                    return WeexValueImpl.ofFunction((int) this.mIntValue);
                case 8:
                    JSON jSONValue = getJSONValue();
                    if (jSONValue instanceof JSONArray) {
                        return WeexValueImpl.ofJSONArray((JSONArray) jSONValue);
                    }
                    return WeexValueImpl.ofJSONObject((JSONObject) jSONValue);
                case 9:
                    return WeexValueImpl.ofArrayBuffer(getArrayBuffer());
                default:
                    throw new IllegalStateException("convertWeex Invalid MUSValue type " + this.mType);
            }
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c(LOG_TAG, "convertWeex err", th);
            return WeexValueImpl.ofNull();
        }
    }
}
