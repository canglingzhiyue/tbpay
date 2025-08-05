package com.squareup.wire;

import com.squareup.wire.MessageAdapter;
import com.squareup.wire.UnknownFieldMap;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* loaded from: classes4.dex */
public abstract class Message {
    private static final i WIRE = new i(new Class[0]);
    private transient int cachedSerializedSize;
    protected transient int hashCode = 0;
    private transient boolean haveCachedSerializedSize;
    private transient UnknownFieldMap unknownFields;

    /* loaded from: classes4.dex */
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
        
        public static final Comparator<Datatype> ORDER_BY_NAME = new Comparator<Datatype>() { // from class: com.squareup.wire.Message.Datatype.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Datatype datatype, Datatype datatype2) {
                return datatype.name().compareTo(datatype2.name());
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
            TYPES_BY_NAME.put(com.taobao.android.weex_framework.util.a.ATOM_enum, ENUM);
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

        public int value() {
            return this.value;
        }

        public WireType wireType() {
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
                    throw new AssertionError("No wiretype for datatype " + this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum Label {
        REQUIRED(32),
        OPTIONAL(64),
        REPEATED(128),
        PACKED(256);
        
        public static final Comparator<Label> ORDER_BY_NAME = new Comparator<Label>() { // from class: com.squareup.wire.Message.Label.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Label label, Label label2) {
                return label.name().compareTo(label2.name());
            }
        };
        private final int value;

        Label(int i) {
            this.value = i;
        }

        public boolean isPacked() {
            return this == PACKED;
        }

        public boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }

        public int value() {
            return this.value;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a<T extends Message> {
        UnknownFieldMap b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Message() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Message(Message message) {
        UnknownFieldMap unknownFieldMap;
        if (message == null || (unknownFieldMap = message.unknownFields) == null) {
            return;
        }
        this.unknownFields = new UnknownFieldMap(unknownFieldMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> List<T> copyOf(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static <E extends Enum & g> E enumFromInt(Class<E> cls, int i) {
        return (E) ((Enum) WIRE.c(cls).a(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> List<T> immutableCopyOf(List<T> list) {
        return list == null ? Collections.emptyList() : list instanceof MessageAdapter.ImmutableList ? list : Collections.unmodifiableList(new ArrayList(list));
    }

    public static <E extends Enum & g> int intFromEnum(E e) {
        return WIRE.c(e.getClass()).a((b) e);
    }

    private void write(k kVar) {
        try {
            WIRE.a(getClass()).a((MessageAdapter) this, kVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addFixed32(int i, int i2) {
        try {
            ensureUnknownFieldMap().a(i, Integer.valueOf(i2));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed64(int i, long j) {
        try {
            ensureUnknownFieldMap().b(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addLengthDelimited(int i, ByteString byteString) {
        try {
            ensureUnknownFieldMap().a(i, byteString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addVarint(int i, long j) {
        try {
            ensureUnknownFieldMap().a(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void checkAvailability() {
        com.squareup.wire.a b = WIRE.b(getClass());
        b.a(this);
        b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnknownFieldMap ensureUnknownFieldMap() {
        if (this.unknownFields == null) {
            this.unknownFields = new UnknownFieldMap();
        }
        return this.unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean equals(List<?> list, List<?> list2) {
        if (list != null && list.isEmpty()) {
            list = null;
        }
        if (list2 != null && list2.isEmpty()) {
            list2 = null;
        }
        if (list != list2) {
            return list != null && list.equals(list2);
        }
        return true;
    }

    public int getSerializedSize() {
        if (!this.haveCachedSerializedSize) {
            this.cachedSerializedSize = WIRE.a(getClass()).a((MessageAdapter) this);
            this.haveCachedSerializedSize = true;
        }
        return this.cachedSerializedSize;
    }

    public int getUnknownFieldsSerializedSize() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap == null) {
            return 0;
        }
        return unknownFieldMap.a();
    }

    public void invalidCachedSerializedSize() {
        this.haveCachedSerializedSize = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setBuilder(a aVar) {
        if (aVar.b != null) {
            this.unknownFields = new UnknownFieldMap(aVar.b);
        }
    }

    public byte[] toByteArray() {
        checkAvailability();
        return WIRE.a(getClass()).b((MessageAdapter) this);
    }

    public String toString() {
        return WIRE.a(getClass()).c((MessageAdapter) this);
    }

    protected Collection<List<UnknownFieldMap.a>> unknownFields() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        return unknownFieldMap == null ? Collections.emptySet() : unknownFieldMap.f8118a.values();
    }

    public void writeTo(byte[] bArr) {
        checkAvailability();
        writeTo(bArr, 0, bArr.length);
    }

    public void writeTo(byte[] bArr, int i, int i2) {
        checkAvailability();
        write(k.a(bArr, i, i2));
    }

    public void writeUnknownFieldMap(k kVar) throws IOException {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap != null) {
            unknownFieldMap.a(kVar);
        }
    }
}
