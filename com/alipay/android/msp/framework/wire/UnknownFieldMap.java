package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class UnknownFieldMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, List<FieldValue>> f4902a;

    /* renamed from: com.alipay.android.msp.framework.wire.UnknownFieldMap$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4903a = new int[WireType.values().length];

        static {
            try {
                f4903a[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4903a[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4903a[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4903a[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    enum UnknownFieldType {
        VARINT,
        FIXED32,
        FIXED64,
        LENGTH_DELIMITED;

        public static UnknownFieldType of(String str) {
            if ("varint".equals(str)) {
                return VARINT;
            }
            if ("fixed32".equals(str)) {
                return FIXED32;
            }
            if ("fixed64".equals(str)) {
                return FIXED64;
            }
            if (!"length-delimited".equals(str)) {
                throw new IllegalArgumentException("Unknown type ".concat(String.valueOf(str)));
            }
            return LENGTH_DELIMITED;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f4904a;
        private final WireType b;

        public abstract int getSerializedSize();

        public abstract void write(int i, WireOutput wireOutput) throws IOException;

        public FieldValue(int i, WireType wireType) {
            this.f4904a = i;
            this.b = wireType;
        }

        public static VarintFieldValue varint(int i, Long l) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VarintFieldValue) ipChange.ipc$dispatch("141b33fe", new Object[]{new Integer(i), l}) : new VarintFieldValue(i, l);
        }

        public static Fixed32FieldValue fixed32(int i, Integer num) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fixed32FieldValue) ipChange.ipc$dispatch("e9864f2a", new Object[]{new Integer(i), num}) : new Fixed32FieldValue(i, num);
        }

        public static Fixed64FieldValue fixed64(int i, Long l) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fixed64FieldValue) ipChange.ipc$dispatch("34737ea6", new Object[]{new Integer(i), l}) : new Fixed64FieldValue(i, l);
        }

        public static LengthDelimitedFieldValue lengthDelimited(int i, ByteString byteString) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LengthDelimitedFieldValue) ipChange.ipc$dispatch("f4647e1b", new Object[]{new Integer(i), byteString}) : new LengthDelimitedFieldValue(i, byteString);
        }

        public int getTag() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue() : this.f4904a;
        }

        public WireType getWireType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WireType) ipChange.ipc$dispatch("2db53a4d", new Object[]{this}) : this.b;
        }

        public Integer getAsInteger() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("14baf564", new Object[]{this});
            }
            throw new IllegalStateException();
        }

        public Long getAsLong() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this});
            }
            throw new IllegalStateException();
        }

        public ByteString getAsBytes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteString) ipChange.ipc$dispatch("fe8373e2", new Object[]{this});
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class VarintFieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Long f4908a;

        public VarintFieldValue(int i, Long l) {
            super(i, WireType.VARINT);
            this.f4908a = l;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue() : WireOutput.a(this.f4908a.longValue());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.a(i, WireType.VARINT);
            wireOutput.b(this.f4908a.longValue());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Long getAsLong() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this}) : this.f4908a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Fixed32FieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Integer f4905a;

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return 4;
        }

        public Fixed32FieldValue(int i, Integer num) {
            super(i, WireType.FIXED32);
            this.f4905a = num;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.a(i, WireType.FIXED32);
            wireOutput.f(this.f4905a.intValue());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Integer getAsInteger() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("14baf564", new Object[]{this}) : this.f4905a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Fixed64FieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Long f4906a;

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return 8;
        }

        public Fixed64FieldValue(int i, Long l) {
            super(i, WireType.FIXED64);
            this.f4906a = l;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.a(i, WireType.FIXED64);
            wireOutput.c(this.f4906a.longValue());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Long getAsLong() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this}) : this.f4906a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LengthDelimitedFieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ByteString f4907a;

        public LengthDelimitedFieldValue(int i, ByteString byteString) {
            super(i, WireType.LENGTH_DELIMITED);
            this.f4907a = byteString;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue() : WireOutput.b(this.f4907a.size()) + this.f4907a.size();
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.a(i, WireType.LENGTH_DELIMITED);
            wireOutput.e(this.f4907a.size());
            wireOutput.b(this.f4907a.toByteArray());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final ByteString getAsBytes() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("fe8373e2", new Object[]{this}) : this.f4907a;
        }
    }

    public UnknownFieldMap() {
    }

    public UnknownFieldMap(UnknownFieldMap unknownFieldMap) {
        if (unknownFieldMap.f4902a != null) {
            b().putAll(unknownFieldMap.f4902a);
        }
    }

    public final void a(int i, Long l) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3535da", new Object[]{this, new Integer(i), l});
        } else {
            a(b(), i, l, WireType.VARINT);
        }
    }

    public final void a(int i, Integer num) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8eff2fc", new Object[]{this, new Integer(i), num});
        } else {
            a(b(), i, num, WireType.FIXED32);
        }
    }

    public final void b(int i, Long l) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70baf079", new Object[]{this, new Integer(i), l});
        } else {
            a(b(), i, l, WireType.FIXED64);
        }
    }

    public final void a(int i, ByteString byteString) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f332f9d1", new Object[]{this, new Integer(i), byteString});
        } else {
            a(b(), i, byteString, WireType.LENGTH_DELIMITED);
        }
    }

    private Map<Integer, List<FieldValue>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        if (this.f4902a == null) {
            this.f4902a = new TreeMap();
        }
        return this.f4902a;
    }

    private static <T> void a(Map<Integer, List<FieldValue>> map, int i, T t, WireType wireType) throws IOException {
        FieldValue varint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641f7fb5", new Object[]{map, new Integer(i), t, wireType});
            return;
        }
        List<FieldValue> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        int i2 = AnonymousClass1.f4903a[wireType.ordinal()];
        if (i2 == 1) {
            varint = FieldValue.varint(i, (Long) t);
        } else if (i2 == 2) {
            varint = FieldValue.fixed32(i, (Integer) t);
        } else if (i2 == 3) {
            varint = FieldValue.fixed64(i, (Long) t);
        } else if (i2 == 4) {
            varint = FieldValue.lengthDelimited(i, (ByteString) t);
        } else {
            throw new IllegalArgumentException("Unsupported wireType = ".concat(String.valueOf(wireType)));
        }
        if (list.size() > 0 && list.get(0).getWireType() != varint.getWireType()) {
            throw new IOException(String.format("Wire type %s differs from previous type %s for tag %s", varint.getWireType(), list.get(0).getWireType(), Integer.valueOf(i)));
        }
        list.add(varint);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        Map<Integer, List<FieldValue>> map = this.f4902a;
        if (map != null) {
            for (Map.Entry<Integer, List<FieldValue>> entry : map.entrySet()) {
                for (FieldValue fieldValue : entry.getValue()) {
                    i = i + WireOutput.a(entry.getKey().intValue()) + fieldValue.getSerializedSize();
                }
            }
        }
        return i;
    }

    public final void a(WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891aced4", new Object[]{this, wireOutput});
            return;
        }
        Map<Integer, List<FieldValue>> map = this.f4902a;
        if (map == null) {
            return;
        }
        for (Map.Entry<Integer, List<FieldValue>> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            for (FieldValue fieldValue : entry.getValue()) {
                fieldValue.write(intValue, wireOutput);
            }
        }
    }
}
