package com.google.protobuf.nano;

import com.google.protobuf.nano.c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import tb.mto;

/* loaded from: classes4.dex */
public final class b {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;

    /* renamed from: a  reason: collision with root package name */
    protected static final Charset f7244a = Charset.forName("UTF-8");
    protected static final Charset b = Charset.forName(android.taobao.util.b.ISO88591);
    public static final Object LAZY_INIT_LOCK = new Object();

    public static <K, V> int a(Map<K, V> map, int i, int i2, int i3) {
        int n = CodedOutputByteBufferNano.n(i);
        int i4 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int a2 = CodedOutputByteBufferNano.a(1, i2, key) + CodedOutputByteBufferNano.a(2, i3, value);
            i4 += n + a2 + CodedOutputByteBufferNano.p(a2);
        }
        return i4;
    }

    private static Object a(int i) {
        switch (i) {
            case 1:
                return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Type: " + i + " is not a primitive type.");
            case 12:
                return e.EMPTY_BYTES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    public static final <K, V> Map<K, V> a(a aVar, Map<K, V> map, c.b bVar, int i, int i2, V v, int i3, int i4) throws IOException {
        Map<K, V> a2 = bVar.a(map);
        int d = aVar.d(aVar.s());
        Object obj = null;
        while (true) {
            int a3 = aVar.a();
            if (a3 != 0) {
                if (a3 != i3) {
                    if (a3 != i4) {
                        if (!aVar.b(a3)) {
                            break;
                        }
                    } else if (i2 == 11) {
                        aVar.a((MessageNano) v);
                    } else {
                        v = aVar.i(i2);
                    }
                } else {
                    obj = aVar.i(i);
                }
            } else {
                break;
            }
        }
        aVar.a(0);
        aVar.e(d);
        if (obj == null) {
            obj = a(i);
        }
        if (v == 0) {
            v = (V) a(i2);
        }
        a2.put(obj, (Object) v);
        return a2;
    }

    public static <K, V> void a(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i, int i2, int i3) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            codedOutputByteBufferNano.m(i, 2);
            codedOutputByteBufferNano.o(CodedOutputByteBufferNano.a(1, i2, key) + CodedOutputByteBufferNano.a(2, i3, value));
            codedOutputByteBufferNano.b(1, i2, key);
            codedOutputByteBufferNano.b(2, i3, value);
        }
    }
}
