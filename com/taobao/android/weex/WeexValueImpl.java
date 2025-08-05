package com.taobao.android.weex;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex_framework.MUSValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import tb.jur;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public abstract class WeexValueImpl implements WeexValue, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "WeexValueImpl";
    private static final WeexValueImpl NULL;
    private static final WeexValueImpl UNDEFINED;
    private final WeexValue.Type mType;

    static {
        kge.a(-1336930667);
        kge.a(1960356565);
        kge.a(1028243835);
        UNDEFINED = new WeexValueUndefinedImpl();
        NULL = new WeexValueNullImpl();
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
            return;
        }
        WeexValueUndefinedImpl.preloadClass();
        WeexValueNullImpl.preloadClass();
        WeexValueObjectImpl.preloadClass();
        WeexValueStringImpl.preloadClass();
        WeexValueArrayImpl.preloadClass();
        WeexValueArrayBufferImpl.preloadClass();
        WeexValueLongImpl.preloadClass();
        WeexValueDoubleImpl.preloadClass();
        WeexValueBoolImpl.preloadClass();
        WeexValue.Type.values();
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueUndefinedImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1203396977);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : "undefined";
        }

        public WeexValueUndefinedImpl() {
            super(WeexValue.Type.UNDEFINED);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert undefined to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert undefined to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert undefined to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert undefined to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert undefined to double");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueNullImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(867847656);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : "null";
        }

        public WeexValueNullImpl() {
            super(WeexValue.Type.NULL);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert null to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert null to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert null to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert null to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert null to double");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueObjectImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final JSONObject mValue;

        static {
            kge.a(204778336);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public WeexValueObjectImpl(JSONObject jSONObject) {
            super(WeexValue.Type.OBJECT);
            this.mValue = jSONObject;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert JSONObject to JSONArray");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueStringImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String mValue;

        static {
            kge.a(1859825458);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public WeexValueStringImpl(String str) {
            super(WeexValue.Type.STRING);
            this.mValue = str;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : JSON.toJSONString(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue() : Boolean.parseBoolean(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue() : Integer.parseInt(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue() : Long.parseLong(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue() : Float.parseFloat(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue() : Double.parseDouble(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this}) : JSON.parseObject(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this}) : JSON.parseArray(this.mValue);
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueArrayImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final JSONArray mValue;

        static {
            kge.a(-1314497896);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public WeexValueArrayImpl(JSONArray jSONArray) {
            super(WeexValue.Type.ARRAY);
            this.mValue = jSONArray;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert JSONArray to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this}) : this.mValue;
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueArrayBufferImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final byte[] mValue;

        static {
            kge.a(291571960);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : "[WeexValue ArrayBuffer]";
        }

        public WeexValueArrayBufferImpl(byte[] bArr) {
            super(WeexValue.Type.ARRAY_BUFFER);
            this.mValue = bArr;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to JSONArray");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueLongImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final long mValue;

        static {
            kge.a(699780189);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public WeexValueLongImpl(WeexValue.Type type, long j) {
            super(type);
            this.mValue = j;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : Long.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : String.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : JSON.toJSONString(Long.valueOf(this.mValue));
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue() : this.mValue != 0;
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue() : (int) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue() : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue() : (float) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue() : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert long to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert long to JSONArray");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueDoubleImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double mValue;

        static {
            kge.a(-83301646);
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public WeexValueDoubleImpl(double d) {
            super(WeexValue.Type.DOUBLE);
            this.mValue = d;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : Double.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : String.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : JSON.toJSONString(Double.valueOf(this.mValue));
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue() : this.mValue != mto.a.GEO_NOT_SUPPORT;
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue() : (int) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue() : (long) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue() : (float) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue() : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert double to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert double to JSONArray");
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeexValueBoolImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final WeexValueBoolImpl FALSE;
        public static final WeexValueBoolImpl TRUE;
        public boolean mValue;

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        static {
            kge.a(484792779);
            TRUE = new WeexValueBoolImpl(true);
            FALSE = new WeexValueBoolImpl(false);
        }

        public WeexValueBoolImpl(boolean z) {
            super(WeexValue.Type.BOOL);
            this.mValue = z;
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : Boolean.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this}) : String.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : String.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue() : this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert bool to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert bool to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert bool to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert bool to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert bool to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert bool to JSONArray");
        }
    }

    private WeexValueImpl(WeexValue.Type type) {
        this.mType = type;
    }

    public static WeexValueImpl ofUndefined() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("712280fc", new Object[0]) : UNDEFINED;
    }

    public static WeexValueImpl ofNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("45c1a981", new Object[0]) : NULL;
    }

    public static WeexValueImpl ofInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("f1d75880", new Object[]{new Integer(i)}) : new WeexValueLongImpl(WeexValue.Type.LONG, i);
    }

    public static WeexValueImpl ofLong(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("f6576246", new Object[]{new Long(j)}) : new WeexValueLongImpl(WeexValue.Type.LONG, j);
    }

    public static WeexValueImpl ofDouble(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("3e6e18b", new Object[]{new Double(d)}) : new WeexValueDoubleImpl(d);
    }

    public static WeexValueImpl ofString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("5bffa255", new Object[]{str});
        }
        if (str == null) {
            return ofNull();
        }
        return new WeexValueStringImpl(str);
    }

    public static WeexValueImpl ofBool(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("92d36528", new Object[]{new Boolean(z)}) : z ? WeexValueBoolImpl.TRUE : WeexValueBoolImpl.FALSE;
    }

    public static WeexValueImpl ofJSON(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("89549ba6", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return ofNull();
        }
        return new WeexValueObjectImpl(jSONObject);
    }

    public static WeexValueImpl ofJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("9f5db627", new Object[]{jSONObject}) : ofJSON(jSONObject);
    }

    public static WeexValueImpl ofJSONArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("cbe66c05", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return ofNull();
        }
        return new WeexValueArrayImpl(jSONArray);
    }

    public static WeexValueImpl ofArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("befcf36c", new Object[]{bArr});
        }
        if (bArr == null) {
            return ofNull();
        }
        return new WeexValueArrayBufferImpl(bArr);
    }

    public static WeexValueImpl ofFunction(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValueImpl) ipChange.ipc$dispatch("19818be9", new Object[]{new Integer(i)}) : new WeexValueLongImpl(WeexValue.Type.FUNCTION, i);
    }

    @Override // com.taobao.android.weex.WeexValue
    public final WeexValue.Type getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue.Type) ipChange.ipc$dispatch("57b208c5", new Object[]{this}) : this.mType;
    }

    public final boolean isFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.FUNCTION;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int getFunctionID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98ec86e3", new Object[]{this})).intValue();
        }
        if (this.mType != WeexValue.Type.FUNCTION) {
            throw new IllegalStateException("Cant't getFunctionValue from " + toString());
        }
        return Long.valueOf(((WeexValueLongImpl) this).mValue).intValue();
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isUndefinedOrNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9500ad7b", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.UNDEFINED || this.mType == WeexValue.Type.NULL;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isUndefined() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("774314d1", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.UNDEFINED;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int getInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
        }
        if (this.mType != WeexValue.Type.LONG) {
            throw new IllegalStateException("Cant't getIntValue from " + toString());
        }
        return (int) ((WeexValueLongImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isLong() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55005451", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.LONG;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final long getLong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[]{this})).longValue();
        }
        if (this.mType != WeexValue.Type.LONG) {
            throw new IllegalStateException("Cant't getLongValue from " + toString());
        }
        return ((WeexValueLongImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isDouble() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afc3aca6", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.DOUBLE;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final double getDouble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c9967bc", new Object[]{this})).doubleValue();
        }
        if (this.mType != WeexValue.Type.DOUBLE) {
            throw new IllegalStateException("Cant't getDoubleValue from " + toString());
        }
        return ((WeexValueDoubleImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isBool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("482fe1bf", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.BOOL;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean getBool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35277eb", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.BOOL) {
            return this == WeexValueBoolImpl.TRUE;
        }
        throw new IllegalStateException("Cant't getBool from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.STRING;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final String getString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        if (this.mType != WeexValue.Type.STRING) {
            throw new IllegalStateException("Cant't getStringValue from " + toString());
        }
        return ((WeexValueStringImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.ARRAY;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONArray getArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d4a9154", new Object[]{this});
        }
        if (this.mType != WeexValue.Type.ARRAY) {
            throw new IllegalStateException("Cant't getJSONArrayValue from " + toString());
        }
        return ((WeexValueArrayImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0ef6d14", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.OBJECT;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONObject getObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f3e35c", new Object[]{this});
        }
        if (this.mType != WeexValue.Type.OBJECT) {
            throw new IllegalStateException("Cant't getJSONArrayValue from " + toString());
        }
        return ((WeexValueObjectImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isArrayBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue() : this.mType != WeexValue.Type.ARRAY_BUFFER;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final byte[] getArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("deaefc53", new Object[]{this});
        }
        if (this.mType != WeexValue.Type.ARRAY_BUFFER) {
            throw new IllegalStateException("Cant't getArrayBuffer from " + toString());
        }
        return ((WeexValueArrayBufferImpl) this).mValue;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.NULL;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isInt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue() : this.mType == WeexValue.Type.LONG;
    }

    public static String ConvertAtomToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c7220d4", new Object[]{new Integer(i)});
        }
        try {
            if (i < com.taobao.android.weex_framework.util.a.ARRAY.length && i >= 0) {
                return com.taobao.android.weex_framework.util.a.ARRAY[i];
            }
            com.taobao.android.weex_framework.util.g.f(LOG_TAG, "Construct MUSValue of error id: " + i);
            return null;
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c(LOG_TAG, th);
            return null;
        }
    }

    public static void ConvertJavaToCpp(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa14dd4e", new Object[]{obj, new Long(j)});
            return;
        }
        try {
            createCppValue(obj, j);
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c(LOG_TAG, th);
        }
    }

    private static void createCppValue(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9106b497", new Object[]{obj, new Long(j)});
        } else if (obj == null) {
            WeexPlatformCommonBridge.createCppNull(j);
        } else if (obj instanceof WeexValue) {
            WeexValue weexValue = (WeexValue) obj;
            switch (weexValue.getType()) {
                case UNDEFINED:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
                case NULL:
                    WeexPlatformCommonBridge.createCppNull(j);
                    return;
                case LONG:
                    WeexPlatformCommonBridge.createCppLong(weexValue.getInt(), j);
                    return;
                case DOUBLE:
                    WeexPlatformCommonBridge.createCppDouble(weexValue.getDouble(), j);
                    return;
                case BOOL:
                    WeexPlatformCommonBridge.createCppBoolean(weexValue.getBool(), j);
                    return;
                case STRING:
                    WeexPlatformCommonBridge.createCppString(weexValue.getString(), j);
                    return;
                case ARRAY:
                    com.taobao.android.weex.util.e eVar = new com.taobao.android.weex.util.e(weexValue.getArray());
                    if (eVar.a()) {
                        WeexPlatformCommonBridge.createCppValuePack(eVar.b(), eVar.c(), j);
                    } else {
                        WeexPlatformCommonBridge.createCppNull(j);
                    }
                    eVar.d();
                    return;
                case OBJECT:
                    com.taobao.android.weex.util.e eVar2 = new com.taobao.android.weex.util.e(weexValue.getObject());
                    if (eVar2.a()) {
                        WeexPlatformCommonBridge.createCppValuePack(eVar2.b(), eVar2.c(), j);
                    } else {
                        WeexPlatformCommonBridge.createCppNull(j);
                    }
                    eVar2.d();
                    return;
                case ARRAY_BUFFER:
                    WeexPlatformCommonBridge.createCppArrayBuffer(weexValue.getArrayBuffer(), j);
                    return;
                case FUNCTION:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
                default:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (String.class == cls) {
                WeexPlatformCommonBridge.createCppString((String) obj, j);
            } else if (Integer.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((Integer) obj).intValue(), j);
            } else if (BigInteger.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((BigInteger) obj).longValue(), j);
            } else if (Long.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((Long) obj).longValue(), j);
            } else if (BigDecimal.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((BigDecimal) obj).doubleValue(), j);
            } else if (Float.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((Float) obj).floatValue(), j);
            } else if (Double.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((Double) obj).doubleValue(), j);
            } else if (Boolean.class == cls) {
                WeexPlatformCommonBridge.createCppBoolean(((Boolean) obj).booleanValue(), j);
            } else if (Map.class.isAssignableFrom(cls)) {
                com.taobao.android.weex.util.e eVar3 = new com.taobao.android.weex.util.e(obj);
                if (eVar3.a()) {
                    WeexPlatformCommonBridge.createCppValuePack(eVar3.b(), eVar3.c(), j);
                } else {
                    WeexPlatformCommonBridge.createCppNull(j);
                }
                eVar3.d();
            } else if (List.class.isAssignableFrom(cls)) {
                com.taobao.android.weex.util.e eVar4 = new com.taobao.android.weex.util.e(obj);
                if (eVar4.a()) {
                    WeexPlatformCommonBridge.createCppValuePack(eVar4.b(), eVar4.c(), j);
                } else {
                    WeexPlatformCommonBridge.createCppNull(j);
                }
                eVar4.d();
            } else if (byte[].class == cls) {
                WeexPlatformCommonBridge.createCppArrayBuffer((byte[]) obj, j);
            } else {
                try {
                    Object json = JSON.toJSON(obj);
                    if (!(json instanceof JSONObject) && !(json instanceof JSONArray)) {
                        WeexPlatformCommonBridge.createCppUndefined(j);
                    } else {
                        createCppValue(json, j);
                    }
                } catch (Exception unused) {
                    WeexPlatformCommonBridge.createCppUndefined(j);
                }
            }
        }
    }

    public static WeexValueImpl convert(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("79456152", new Object[]{obj});
        }
        if (obj == null) {
            return ofNull();
        }
        if (obj instanceof WeexValueImpl) {
            return (WeexValueImpl) obj;
        }
        Class<?> cls = obj.getClass();
        if (String.class == cls) {
            return ofString((String) obj);
        }
        if (Integer.class == cls) {
            return ofInt(((Integer) obj).intValue());
        }
        if (Long.class == cls) {
            return ofLong(((Long) obj).longValue());
        }
        if (Float.class == cls) {
            return ofDouble(((Float) obj).floatValue());
        }
        if (Double.class == cls) {
            return ofDouble(((Double) obj).doubleValue());
        }
        if (Boolean.class == cls) {
            return ofBool(((Boolean) obj).booleanValue());
        }
        if (Map.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    jSONObject.put((String) key, value);
                }
            }
            return ofJSONObject(jSONObject);
        } else if (List.class.isAssignableFrom(cls)) {
            return ofJSONArray(new JSONArray((List) obj));
        } else {
            if (byte[].class == cls) {
                return ofArrayBuffer((byte[]) obj);
            }
            if (MUSValue.class == cls) {
                return (WeexValueImpl) ((MUSValue) obj).convertWeex();
            }
            return ofUndefined();
        }
    }

    public final MUSValue convertMUSValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("95c35143", new Object[]{this});
        }
        switch (this.mType) {
            case UNDEFINED:
            case NULL:
                return null;
            case LONG:
                return MUSValue.ofInt(getLong());
            case DOUBLE:
                return MUSValue.ofFloat(getDouble());
            case BOOL:
                return MUSValue.ofBool(getBool());
            case STRING:
                return MUSValue.ofString(getString());
            case ARRAY:
                return MUSValue.ofJSONArray(getArray());
            case OBJECT:
                return MUSValue.ofJSONObject(getObject());
            case ARRAY_BUFFER:
                return MUSValue.ofArrayBuffer(getArrayBuffer());
            case FUNCTION:
                return MUSValue.ofFunction(getFunctionID());
            default:
                return null;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final byte[] toArrayBufferOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c0fc180e", new Object[]{this});
        }
        if (!isUndefinedOrNull()) {
            return getArrayBuffer();
        }
        return null;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final b toFunctionOrNull(WeexInstance weexInstance) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("54d04e2c", new Object[]{this, weexInstance});
        }
        if (!isUndefinedOrNull()) {
            return new jur(weexInstance, getFunctionID());
        }
        return null;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final String toStringValueOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("836a398a", new Object[]{this});
        }
        if (!isNull() && !isUndefined()) {
            return toStringValue();
        }
        return null;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean toBoolValueSafe(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1434b8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            return toBoolValue();
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int toIntValueSafe(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ec9fa05", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return toIntValue();
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final long toLongValueSafe(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8ebdcaa", new Object[]{this, new Long(j)})).longValue();
        }
        try {
            return toLongValue();
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final float toFloatValueSafe(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95c0992c", new Object[]{this, new Float(f)})).floatValue();
        }
        try {
            return toFloatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final double toDoubleValueSafe(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9160f7f3", new Object[]{this, new Double(d)})).doubleValue();
        }
        try {
            return toDoubleValue();
        } catch (Exception unused) {
            return d;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONObject toJSONObjectOrNullSafe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("174b3080", new Object[]{this});
        }
        try {
            return toJSONObjectOrNull();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONArray toJSONArrayOrNulSafe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9327967e", new Object[]{this});
        }
        try {
            return toJSONArrayOrNull();
        } catch (Exception unused) {
            return null;
        }
    }
}
