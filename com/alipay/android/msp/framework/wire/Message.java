package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.wire.MessageAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Wire f4894a = new Wire(new Class[0]);
    public transient int b = 0;
    private transient UnknownFieldMap c;
    private transient boolean d;
    private transient int e;

    /* loaded from: classes3.dex */
    public enum Datatype {
        INT32(1),
        INT64(2),
        UINT32(3),
        UINT64(4),
        SINT32(5),
        SINT64(6),
        BOOL(7),
        ENUM(8),
        STRING(9),
        BYTES(10),
        MESSAGE(11),
        FIXED32(12),
        SFIXED32(13),
        FIXED64(14),
        SFIXED64(15),
        FLOAT(16),
        DOUBLE(17);
        
        public static final Comparator<Datatype> ORDER_BY_NAME = new Comparator<Datatype>() { // from class: com.alipay.android.msp.framework.wire.Message.Datatype.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Datatype datatype, Datatype datatype2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26eb55c1", new Object[]{this, datatype, datatype2})).intValue() : datatype.name().compareTo(datatype2.name());
            }
        };
        private static final Map<String, Datatype> TYPES_BY_NAME;
        private final int value;

        static {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TYPES_BY_NAME = linkedHashMap;
            linkedHashMap.put("int32", INT32);
            TYPES_BY_NAME.put("int64", INT64);
            TYPES_BY_NAME.put("uint32", UINT32);
            TYPES_BY_NAME.put("uint64", UINT64);
            TYPES_BY_NAME.put("sint32", SINT32);
            TYPES_BY_NAME.put("sint64", SINT64);
            TYPES_BY_NAME.put("bool", BOOL);
            TYPES_BY_NAME.put(a.ATOM_enum, ENUM);
            TYPES_BY_NAME.put("string", STRING);
            TYPES_BY_NAME.put("bytes", BYTES);
            TYPES_BY_NAME.put("message", MESSAGE);
            TYPES_BY_NAME.put("fixed32", FIXED32);
            TYPES_BY_NAME.put("sfixed32", SFIXED32);
            TYPES_BY_NAME.put("fixed64", FIXED64);
            TYPES_BY_NAME.put("sfixed64", SFIXED64);
            TYPES_BY_NAME.put(PopStrategy.IDENTIFIER_FLOAT, FLOAT);
            TYPES_BY_NAME.put("double", DOUBLE);
        }

        Datatype(int i) {
            this.value = i;
        }

        public static Datatype of(String str) {
            return TYPES_BY_NAME.get(str);
        }

        public final int value() {
            return this.value;
        }

        public final WireType wireType() {
            switch (this) {
                case INT32:
                case INT64:
                case UINT32:
                case UINT64:
                case SINT32:
                case SINT64:
                case BOOL:
                case ENUM:
                    return WireType.VARINT;
                case FIXED32:
                case SFIXED32:
                case FLOAT:
                    return WireType.FIXED32;
                case FIXED64:
                case SFIXED64:
                case DOUBLE:
                    return WireType.FIXED64;
                case STRING:
                case BYTES:
                case MESSAGE:
                    return WireType.LENGTH_DELIMITED;
                default:
                    throw new AssertionError("No wiretype for datatype ".concat(String.valueOf(this)));
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum Label {
        REQUIRED(32),
        OPTIONAL(64),
        REPEATED(128),
        PACKED(256);
        
        public static final Comparator<Label> ORDER_BY_NAME = new Comparator<Label>() { // from class: com.alipay.android.msp.framework.wire.Message.Label.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Label label, Label label2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22aae23f", new Object[]{this, label, label2})).intValue() : label.name().compareTo(label2.name());
            }
        };
        private final int value;

        Label(int i) {
            this.value = i;
        }

        public final boolean isPacked() {
            return this == PACKED;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }

        public final int value() {
            return this.value;
        }
    }

    public static /* synthetic */ UnknownFieldMap a(Message message) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UnknownFieldMap) ipChange.ipc$dispatch("7f1ce671", new Object[]{message}) : message.c;
    }

    public static /* synthetic */ Wire c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Wire) ipChange.ipc$dispatch("dc859919", new Object[0]) : f4894a;
    }

    public Message(Message message) {
        UnknownFieldMap unknownFieldMap;
        if (message == null || (unknownFieldMap = message.c) == null) {
            return;
        }
        this.c = new UnknownFieldMap(unknownFieldMap);
    }

    public Message() {
    }

    public static <T> List<T> a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static <T> List<T> b(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{list});
        }
        if (list == null) {
            return Collections.emptyList();
        }
        return list instanceof MessageAdapter.ImmutableList ? list : Collections.unmodifiableList(new ArrayList(list));
    }

    public static <E extends Enum & ProtoEnum> int intFromEnum(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d62d9dee", new Object[]{e})).intValue() : f4894a.d(e.getClass()).toInt(e);
    }

    public static <E extends Enum & ProtoEnum> E enumFromInt(Class<E> cls, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ((Enum) ipChange.ipc$dispatch("c31c9e3f", new Object[]{cls, new Integer(i)})) : (E) ((Enum) f4894a.d(cls).fromInt(i));
    }

    public byte[] toByteArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("89c82500", new Object[]{this});
        }
        checkAvailability();
        return f4894a.a(getClass()).toByteArray(this);
    }

    public void writeTo(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ab66c8", new Object[]{this, bArr});
            return;
        }
        checkAvailability();
        writeTo(bArr, 0, bArr.length);
    }

    public void writeTo(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677b3528", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        checkAvailability();
        try {
            f4894a.a(getClass()).write(this, WireOutput.a(bArr, i, i2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeUnknownFieldMap(WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17b1400", new Object[]{this, wireOutput});
            return;
        }
        UnknownFieldMap unknownFieldMap = this.c;
        if (unknownFieldMap == null) {
            return;
        }
        unknownFieldMap.a(wireOutput);
    }

    public int getSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
        }
        if (!this.d) {
            this.e = f4894a.a(getClass()).getSerializedSize(this);
            this.d = true;
        }
        return this.e;
    }

    public int getUnknownFieldsSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b899006c", new Object[]{this})).intValue();
        }
        UnknownFieldMap unknownFieldMap = this.c;
        if (unknownFieldMap != null) {
            return unknownFieldMap.a();
        }
        return 0;
    }

    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean a(List<?> list, List<?> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        if (list != null && list.isEmpty()) {
            list = null;
        }
        if (list2 != null && list2.isEmpty()) {
            list2 = null;
        }
        return list == list2 || (list != null && list.equals(list2));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : f4894a.a(getClass()).toString(this);
    }

    public void addVarint(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f8c391", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            b().a(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed32(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adf1a99", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            b().a(i, Integer.valueOf(i2));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed64(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4f1b79", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            b().b(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addLengthDelimited(int i, ByteString byteString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cfd840", new Object[]{this, new Integer(i), byteString});
            return;
        }
        try {
            b().a(i, byteString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public UnknownFieldMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnknownFieldMap) ipChange.ipc$dispatch("1e4fa7eb", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new UnknownFieldMap();
        }
        return this.c;
    }

    public void checkAvailability() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42628d8a", new Object[]{this});
            return;
        }
        AvailabilityChecker c = f4894a.c(getClass());
        c.checkRequiredFields(this);
        c.a(this);
    }

    /* loaded from: classes3.dex */
    public static abstract class Builder<T extends Message> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public UnknownFieldMap b;

        public abstract T build();

        public Builder() {
        }

        public Builder(Message message) {
            if (message == null || Message.a(message) == null) {
                return;
            }
            this.b = new UnknownFieldMap(Message.a(message));
        }

        public void addVarint(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f8c391", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            try {
                a().a(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addFixed32(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9adf1a99", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                a().a(i, Integer.valueOf(i2));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addFixed64(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c4f1b79", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            try {
                a().b(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addLengthDelimited(int i, ByteString byteString) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38cfd840", new Object[]{this, new Integer(i), byteString});
                return;
            }
            try {
                a().a(i, byteString);
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public UnknownFieldMap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownFieldMap) ipChange.ipc$dispatch("d99db2a", new Object[]{this});
            }
            if (this.b == null) {
                this.b = new UnknownFieldMap();
            }
            return this.b;
        }

        public void checkRequiredFields() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecfabae7", new Object[]{this});
            } else {
                Message.c().b(getClass()).checkRequiredFields(this);
            }
        }
    }
}
