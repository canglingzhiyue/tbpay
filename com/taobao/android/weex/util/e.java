package com.taobao.android.weex.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.util.g;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Object d;

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f15900a = new ByteArrayOutputStream(128);
    private final d b = new d(this.f15900a);
    private final LinkedHashMap<Object, Integer> c = new LinkedHashMap<>();
    private boolean e = false;

    static {
        kge.a(-996289193);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        }
    }

    public e(Object obj) {
        this.d = obj;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            b(this.d);
            this.e = false;
        } catch (Throwable th) {
            this.e = true;
            try {
                g.c("WeexValue", "Error when convert WeexValue to Cpp: " + JSON.toJSONString(this.d), th);
            } catch (Throwable unused) {
                g.c("WeexValue", "Error when convert WeexValue to Cpp", th);
            }
        }
        return !this.e;
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        if (!this.e) {
            return this.f15900a.toByteArray();
        }
        return null;
    }

    public Object[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("69114b4b", new Object[]{this});
        }
        if (!this.e) {
            return this.c.keySet().toArray();
        }
        return null;
    }

    public void a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b.write(8);
        this.b.writeInt(a((Object) str));
    }

    private int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
        }
        Integer num = this.c.get(obj);
        if (num == null) {
            int size = this.c.size();
            this.c.put(obj, Integer.valueOf(size));
            num = Integer.valueOf(size);
        }
        return num.intValue();
    }

    public void a(int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.write(2);
        this.b.writeInt(i);
    }

    public void a(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.b.write(3);
        this.b.writeLong(j);
    }

    public void a(float f) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.b.write(4);
        this.b.writeFloat(f);
    }

    public void a(double d) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        this.b.write(5);
        this.b.writeDouble(d);
    }

    public void a(boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b.write(6);
        } else {
            this.b.write(7);
        }
    }

    private void b(Object obj) throws Exception {
        String valueOf;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        d dVar = this.b;
        LinkedHashMap<Object, Integer> linkedHashMap = this.c;
        if (obj == null) {
            dVar.writeByte(1);
        } else if (obj instanceof WeexValue) {
            WeexValue weexValue = (WeexValue) obj;
            switch (weexValue.getType()) {
                case UNDEFINED:
                    dVar.writeByte(0);
                    return;
                case NULL:
                    dVar.writeByte(1);
                    return;
                case LONG:
                    a(weexValue.getLong());
                    return;
                case DOUBLE:
                    a(weexValue.getDouble());
                    return;
                case BOOL:
                    a(weexValue.getBool());
                    return;
                case STRING:
                    a(weexValue.getString());
                    return;
                case ARRAY:
                    JSONArray<Object> array = weexValue.getArray();
                    dVar.writeByte(9);
                    int size = array.size();
                    dVar.writeInt(size);
                    for (Object obj2 : array) {
                        i++;
                        b(obj2);
                    }
                    if (i == size) {
                        return;
                    }
                    throw new IllegalStateException("ConcurrentModified WeexValue" + obj);
                case OBJECT:
                    JSONObject object = weexValue.getObject();
                    dVar.writeByte(10);
                    int size2 = object.size();
                    dVar.writeInt(size2);
                    for (Map.Entry<String, Object> entry : object.entrySet()) {
                        i++;
                        dVar.writeInt(a((Object) entry.getKey()));
                        b(entry.getValue());
                    }
                    if (i == size2) {
                        return;
                    }
                    throw new IllegalStateException("ConcurrentModified WeexValue" + obj);
                case ARRAY_BUFFER:
                    dVar.write(11);
                    dVar.writeInt(a(weexValue.getArrayBuffer()));
                    return;
                case FUNCTION:
                    dVar.writeByte(0);
                    return;
                default:
                    dVar.writeByte(0);
                    return;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (String.class == cls) {
                dVar.writeByte(8);
                String str = (String) obj;
                Integer num = linkedHashMap.get(str);
                if (num == null) {
                    int size3 = linkedHashMap.size();
                    linkedHashMap.put(str, Integer.valueOf(size3));
                    num = Integer.valueOf(size3);
                }
                dVar.writeInt(num.intValue());
            } else if (Integer.class == cls) {
                a(((Integer) obj).intValue());
            } else if (Boolean.class == cls) {
                a(((Boolean) obj).booleanValue());
            } else if (Map.class.isAssignableFrom(cls)) {
                Map map = (Map) obj;
                dVar.writeByte(10);
                int size4 = map.size();
                dVar.writeInt(size4);
                for (Map.Entry entry2 : map.entrySet()) {
                    i++;
                    Object key = entry2.getKey();
                    if (key instanceof String) {
                        valueOf = (String) key;
                    } else {
                        valueOf = String.valueOf(key);
                    }
                    dVar.writeInt(a((Object) valueOf));
                    b(entry2.getValue());
                }
                if (i == size4) {
                    return;
                }
                throw new IllegalStateException("ConcurrentModified WeexValue: " + obj);
            } else if (List.class.isAssignableFrom(cls)) {
                List<Object> list = (List) obj;
                dVar.writeByte(9);
                int size5 = list.size();
                dVar.writeInt(size5);
                for (Object obj3 : list) {
                    i++;
                    b(obj3);
                }
                if (i == size5) {
                    return;
                }
                throw new IllegalStateException("ConcurrentModified WeexValue" + obj);
            } else if (Float.class == cls) {
                a(((Float) obj).floatValue());
            } else if (Double.class == cls) {
                a(((Double) obj).doubleValue());
            } else if (BigInteger.class == cls) {
                a(((BigInteger) obj).longValue());
            } else if (Long.class == cls) {
                a(((Long) obj).longValue());
            } else if (BigDecimal.class == cls) {
                a(((BigDecimal) obj).doubleValue());
            } else if (byte[].class == cls) {
                dVar.write(11);
                dVar.writeInt(a(obj));
            } else {
                try {
                    Object json = JSON.toJSON(obj);
                    if (!(json instanceof JSONObject) && !(json instanceof JSONArray)) {
                        dVar.writeByte(0);
                    } else {
                        b(json);
                    }
                } catch (Exception unused) {
                    dVar.writeByte(0);
                }
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            this.b.close();
        } catch (Exception e) {
            g.a(e);
        }
    }

    private static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2713f1a7", new Object[]{bArr, new Integer(i)})).intValue() : (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    private static long b(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ef51e87", new Object[]{bArr, new Integer(i)})).longValue() : (bArr[i] & 255) | (bArr[i + 7] << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    private static double c(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f6d64b60", new Object[]{bArr, new Integer(i)})).doubleValue() : Double.longBitsToDouble(b(bArr, i));
    }

    private static float d(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb77841", new Object[]{bArr, new Integer(i)})).floatValue() : Float.intBitsToFloat(a(bArr, i));
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f15902a;
        public int b;

        static {
            kge.a(1808959494);
        }

        private a() {
            this.b = 0;
        }
    }

    private static Object a(a aVar, String[] strArr, Object[] objArr) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("75edbb39", new Object[]{aVar, strArr, objArr});
        }
        byte[] bArr = aVar.f15902a;
        int i2 = aVar.b;
        aVar.b = i2 + 1;
        switch (bArr[i2]) {
            case 0:
            case 1:
                return null;
            case 2:
                int a2 = a(aVar.f15902a, aVar.b);
                aVar.b += 4;
                return Integer.valueOf(a2);
            case 3:
                long b = b(aVar.f15902a, aVar.b);
                aVar.b += 8;
                return Long.valueOf(b);
            case 4:
                float d = d(aVar.f15902a, aVar.b);
                aVar.b += 4;
                return Float.valueOf(d);
            case 5:
                double c = c(aVar.f15902a, aVar.b);
                aVar.b += 8;
                return Double.valueOf(c);
            case 6:
                return true;
            case 7:
                return false;
            case 8:
                int a3 = a(aVar.f15902a, aVar.b);
                aVar.b += 4;
                if ((a3 & Integer.MIN_VALUE) != 0) {
                    return com.taobao.android.weex_framework.util.a.a(a3 & Integer.MAX_VALUE);
                }
                if (strArr != null) {
                    return strArr[a3];
                }
                return null;
            case 9:
                int a4 = a(aVar.f15902a, aVar.b);
                aVar.b += 4;
                JSONArray jSONArray = new JSONArray(a4);
                while (i < a4) {
                    jSONArray.add(a(aVar, strArr, objArr));
                    i++;
                }
                return jSONArray;
            case 10:
                int a5 = a(aVar.f15902a, aVar.b);
                aVar.b += 4;
                JSONObject jSONObject = new JSONObject(a5);
                while (i < a5) {
                    int a6 = a(aVar.f15902a, aVar.b);
                    aVar.b += 4;
                    if ((a6 & Integer.MIN_VALUE) != 0) {
                        str = com.taobao.android.weex_framework.util.a.a(a6 & Integer.MAX_VALUE);
                    } else {
                        str = strArr == null ? "" : strArr[a6];
                    }
                    jSONObject.put(str, a(aVar, strArr, objArr));
                    i++;
                }
                return jSONObject;
            case 11:
                int a7 = a(aVar.f15902a, aVar.b);
                aVar.b += 4;
                if (objArr != null && (objArr[a7] instanceof byte[])) {
                    return objArr[a7];
                }
                return null;
            default:
                return null;
        }
    }

    public static WeexValueImpl a(byte[] bArr, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("3af829d", new Object[]{bArr, strArr, objArr});
        }
        try {
            switch (bArr[0]) {
                case 0:
                    return WeexValueImpl.ofUndefined();
                case 1:
                    return WeexValueImpl.ofNull();
                case 2:
                    return WeexValueImpl.ofInt(a(bArr, 1));
                case 3:
                    return WeexValueImpl.ofLong(b(bArr, 1));
                case 4:
                    return WeexValueImpl.ofDouble(d(bArr, 1));
                case 5:
                    return WeexValueImpl.ofDouble(c(bArr, 1));
                case 6:
                    return WeexValueImpl.ofBool(true);
                case 7:
                    return WeexValueImpl.ofBool(false);
                case 8:
                    int a2 = a(bArr, 1);
                    if ((Integer.MIN_VALUE & a2) != 0) {
                        return WeexValueImpl.ofString(com.taobao.android.weex_framework.util.a.a(a2 & Integer.MAX_VALUE));
                    }
                    if (strArr == null) {
                        return WeexValueImpl.ofUndefined();
                    }
                    return WeexValueImpl.ofString(strArr[a2]);
                case 9:
                    a aVar = new a();
                    aVar.f15902a = bArr;
                    return WeexValueImpl.ofJSONArray((JSONArray) a(aVar, strArr, objArr));
                case 10:
                    a aVar2 = new a();
                    aVar2.f15902a = bArr;
                    return WeexValueImpl.ofJSONObject((JSONObject) a(aVar2, strArr, objArr));
                case 11:
                    int a3 = a(bArr, 1);
                    if (objArr != null && (objArr[a3] instanceof byte[])) {
                        return WeexValueImpl.ofArrayBuffer((byte[]) objArr[a3]);
                    }
                    return WeexValueImpl.ofUndefined();
                default:
                    return WeexValueImpl.ofUndefined();
            }
        } catch (Throwable th) {
            g.c("WeexValuePack", "CppToJavaConvertError", th);
            return WeexValueImpl.ofUndefined();
        }
    }
}
