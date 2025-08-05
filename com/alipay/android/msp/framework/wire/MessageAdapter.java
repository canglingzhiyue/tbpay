package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import tb.riy;

/* loaded from: classes3.dex */
public final class MessageAdapter<M extends Message> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Wire kc;
    private final Map<String, Integer> kd = new LinkedHashMap();
    private final TagMap<FieldInfo> ke;
    private final Class<M> messageType;

    /* loaded from: classes3.dex */
    public static final class FieldInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f4897a;
        public final String b;
        public final Message.Datatype c;
        public final Message.Label d;
        public final Class<? extends ProtoEnum> e;
        public final Class<? extends Message> f;
        public final boolean g;
        public MessageAdapter<? extends Message> h;
        public EnumAdapter<? extends ProtoEnum> i;
        private final Field j;
        private final Field k;

        public static /* synthetic */ Field a(FieldInfo fieldInfo) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("9dd67c2b", new Object[]{fieldInfo}) : fieldInfo.j;
        }

        public static /* synthetic */ Field b(FieldInfo fieldInfo) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("8381d8ac", new Object[]{fieldInfo}) : fieldInfo.k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private FieldInfo(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class<?> cls, Field field, Field field2) {
            this.f4897a = i;
            this.b = str;
            this.c = datatype;
            this.d = label;
            this.g = z;
            if (datatype == Message.Datatype.ENUM) {
                this.e = cls;
                this.f = null;
            } else if (datatype == Message.Datatype.MESSAGE) {
                this.f = cls;
                this.e = null;
            } else {
                this.e = null;
                this.f = null;
            }
            this.j = field;
            this.k = field2;
        }
    }

    public final Collection<FieldInfo> getFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("624ef3d1", new Object[]{this}) : this.ke.values();
    }

    public final FieldInfo getField(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FieldInfo) ipChange.ipc$dispatch("976c35e7", new Object[]{this, str});
        }
        Integer num = this.kd.get(str);
        if (num != null) {
            return this.ke.get(num.intValue());
        }
        return null;
    }

    public final Object getFieldValue(M m, FieldInfo fieldInfo) {
        if (FieldInfo.a(fieldInfo) == null) {
            throw new AssertionError("Field is not of type \"Message\"");
        }
        try {
            return FieldInfo.a(fieldInfo).get(m);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void setBuilderField(M m, int i, Object obj) {
        try {
            FieldInfo.b(this.ke.get(i)).set(m, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (java.lang.Enum.class.isAssignableFrom(r10) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (com.alipay.android.msp.framework.wire.Message.class.isAssignableFrom(r10) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageAdapter(com.alipay.android.msp.framework.wire.Wire r19, java.lang.Class<M> r20) {
        /*
            r18 = this;
            r0 = r18
            r18.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.kd = r1
            r1 = r19
            r0.kc = r1
            r1 = r20
            r0.messageType = r1
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.reflect.Field[] r1 = r20.getDeclaredFields()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L20:
            if (r5 >= r3) goto Ldd
            r13 = r1[r5]
            java.lang.Class<com.alipay.android.msp.framework.wire.ProtoField> r6 = com.alipay.android.msp.framework.wire.ProtoField.class
            java.lang.annotation.Annotation r6 = r13.getAnnotation(r6)
            com.alipay.android.msp.framework.wire.ProtoField r6 = (com.alipay.android.msp.framework.wire.ProtoField) r6
            if (r6 == 0) goto Ld4
            int r7 = r6.tag()
            java.lang.String r8 = r13.getName()
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r0.kd
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9.put(r8, r10)
            com.alipay.android.msp.framework.wire.Message$Datatype r9 = r6.type()
            com.alipay.android.msp.framework.wire.Message$Datatype r10 = com.alipay.android.msp.framework.wire.Message.Datatype.ENUM
            r11 = 0
            if (r9 != r10) goto L7b
            java.lang.Class r10 = r13.getType()
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L55
            goto L79
        L55:
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r10 = r12.isAssignableFrom(r10)
            if (r10 == 0) goto L78
            java.lang.reflect.Type r10 = r13.getGenericType()
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type[] r10 = r10.getActualTypeArguments()
            r10 = r10[r4]
            boolean r12 = r10 instanceof java.lang.Class
            if (r12 == 0) goto L78
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L78
            goto L79
        L78:
            r10 = r11
        L79:
            r12 = r10
            goto Lb0
        L7b:
            com.alipay.android.msp.framework.wire.Message$Datatype r10 = com.alipay.android.msp.framework.wire.Message.Datatype.MESSAGE
            if (r9 != r10) goto Laf
            java.lang.Class r10 = r13.getType()
            java.lang.Class<com.alipay.android.msp.framework.wire.Message> r12 = com.alipay.android.msp.framework.wire.Message.class
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L8c
            goto L79
        L8c:
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r10 = r12.isAssignableFrom(r10)
            if (r10 == 0) goto L78
            java.lang.reflect.Type r10 = r13.getGenericType()
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type[] r10 = r10.getActualTypeArguments()
            r10 = r10[r4]
            boolean r12 = r10 instanceof java.lang.Class
            if (r12 == 0) goto L78
            java.lang.Class<com.alipay.android.msp.framework.wire.Message> r12 = com.alipay.android.msp.framework.wire.Message.class
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L78
            goto L79
        Laf:
            r12 = r11
        Lb0:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            com.alipay.android.msp.framework.wire.MessageAdapter$FieldInfo r14 = new com.alipay.android.msp.framework.wire.MessageAdapter$FieldInfo
            com.alipay.android.msp.framework.wire.Message$Label r10 = r6.label()
            boolean r11 = r6.redacted()
            java.lang.reflect.Field r16 = r0.E(r8)
            r17 = 0
            r6 = r14
            r4 = r14
            r14 = r16
            r20 = r1
            r1 = r15
            r15 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.put(r1, r4)
            goto Ld6
        Ld4:
            r20 = r1
        Ld6:
            int r5 = r5 + 1
            r1 = r20
            r4 = 0
            goto L20
        Ldd:
            com.alipay.android.msp.framework.wire.TagMap r1 = com.alipay.android.msp.framework.wire.TagMap.of(r2)
            r0.ke = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.wire.MessageAdapter.<init>(com.alipay.android.msp.framework.wire.Wire, java.lang.Class):void");
    }

    private Field E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("8070b213", new Object[]{this, str});
        }
        try {
            return this.messageType.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + this.messageType.getName() + "." + str);
        }
    }

    public final int getSerializedSize(M m) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5554868", new Object[]{this, m})).intValue();
        }
        int i = 0;
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                int i2 = fieldInfo.f4897a;
                Message.Datatype datatype = fieldInfo.c;
                Message.Label label = fieldInfo.d;
                if (label.isRepeated()) {
                    if (label.isPacked()) {
                        a3 = b((List) fieldValue, i2, datatype);
                    } else {
                        a3 = a((List) fieldValue, i2, datatype);
                    }
                } else {
                    a3 = a(i2, fieldValue, datatype);
                }
                i += a3;
            }
        }
        if (m instanceof ExtendableMessage) {
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.f4888a != null) {
                ExtensionMap<T> extensionMap = extendableMessage.f4888a;
                int i3 = 0;
                for (int i4 = 0; i4 < extensionMap.size(); i4++) {
                    Extension extension = extensionMap.getExtension(i4);
                    Object extensionValue = extensionMap.getExtensionValue(i4);
                    int tag = extension.getTag();
                    Message.Datatype datatype2 = extension.getDatatype();
                    Message.Label label2 = extension.getLabel();
                    if (label2.isRepeated()) {
                        if (label2.isPacked()) {
                            a2 = b((List) extensionValue, tag, datatype2);
                        } else {
                            a2 = a((List) extensionValue, tag, datatype2);
                        }
                    } else {
                        a2 = a(tag, extensionValue, datatype2);
                    }
                    i3 += a2;
                }
                i += i3;
            }
        }
        return i + m.getUnknownFieldsSerializedSize();
    }

    private int a(List<?> list, int i, Message.Datatype datatype) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ec2cdae", new Object[]{this, list, new Integer(i), datatype})).intValue();
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(i, it.next(), datatype);
        }
        return i2;
    }

    private int b(List<?> list, int i, Message.Datatype datatype) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c41f4d", new Object[]{this, list, new Integer(i), datatype})).intValue();
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        return WireOutput.b(WireOutput.makeTag(i, WireType.LENGTH_DELIMITED)) + WireOutput.b(i2) + i2;
    }

    public final void write(M m, WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7942a4dd", new Object[]{this, m, wireOutput});
            return;
        }
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                int i = fieldInfo.f4897a;
                Message.Datatype datatype = fieldInfo.c;
                Message.Label label = fieldInfo.d;
                if (label.isRepeated()) {
                    if (label.isPacked()) {
                        b(wireOutput, (List) fieldValue, i, datatype);
                    } else {
                        a(wireOutput, (List) fieldValue, i, datatype);
                    }
                } else {
                    a(wireOutput, i, fieldValue, datatype);
                }
            }
        }
        if (m instanceof ExtendableMessage) {
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.f4888a != null) {
                ExtensionMap<T> extensionMap = extendableMessage.f4888a;
                for (int i2 = 0; i2 < extensionMap.size(); i2++) {
                    Extension extension = extensionMap.getExtension(i2);
                    Object extensionValue = extensionMap.getExtensionValue(i2);
                    int tag = extension.getTag();
                    Message.Datatype datatype2 = extension.getDatatype();
                    Message.Label label2 = extension.getLabel();
                    if (label2.isRepeated()) {
                        if (label2.isPacked()) {
                            b(wireOutput, (List) extensionValue, tag, datatype2);
                        } else {
                            a(wireOutput, (List) extensionValue, tag, datatype2);
                        }
                    } else {
                        a(wireOutput, tag, extensionValue, datatype2);
                    }
                }
            }
        }
        m.writeUnknownFieldMap(wireOutput);
    }

    private void a(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dbc4cf", new Object[]{this, wireOutput, list, new Integer(i), datatype});
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            a(wireOutput, i, it.next(), datatype);
        }
    }

    private void b(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46e50ae", new Object[]{this, wireOutput, list, new Integer(i), datatype});
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        wireOutput.a(i, WireType.LENGTH_DELIMITED);
        wireOutput.e(i2);
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            a(wireOutput, it2.next(), datatype);
        }
    }

    public final byte[] toByteArray(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cac1dce3", new Object[]{this, m});
        }
        byte[] bArr = new byte[getSerializedSize(m)];
        try {
            write(m, WireOutput.a(bArr));
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731bca1c", new Object[]{this, m});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append(riy.BLOCK_START_STR);
        String str = "";
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                sb.append(str);
                sb.append(fieldInfo.b);
                sb.append("=");
                if (fieldInfo.g) {
                    fieldValue = "██";
                }
                sb.append(fieldValue);
                str = ", ";
            }
        }
        if (m instanceof ExtendableMessage) {
            sb.append(str);
            sb.append("{extensions=");
            sb.append(((ExtendableMessage) m).a());
            sb.append(riy.BLOCK_END_STR);
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    private int a(int i, Object obj, Message.Datatype datatype) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4203a09b", new Object[]{this, new Integer(i), obj, datatype})).intValue() : WireOutput.a(i) + a(obj, datatype);
    }

    private int a(Object obj, Message.Datatype datatype) {
        int F;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1158b528", new Object[]{this, obj, datatype})).intValue();
        }
        switch (datatype) {
            case INT32:
                return WireOutput.int32Size(((Integer) obj).intValue());
            case INT64:
            case UINT64:
                return WireOutput.a(((Long) obj).longValue());
            case UINT32:
                return WireOutput.b(((Integer) obj).intValue());
            case SINT32:
                return WireOutput.b(WireOutput.g(((Integer) obj).intValue()));
            case SINT64:
                return WireOutput.a(WireOutput.d(((Long) obj).longValue()));
            case BOOL:
                return 1;
            case ENUM:
                return a((MessageAdapter<M>) ((ProtoEnum) obj));
            case STRING:
                F = F((String) obj);
                b = WireOutput.b(F);
                break;
            case BYTES:
                F = ((ByteString) obj).size();
                b = WireOutput.b(F);
                break;
            case MESSAGE:
                return a((Message) obj);
            case FIXED32:
            case SFIXED32:
            case FLOAT:
                return 4;
            case FIXED64:
            case SFIXED64:
            case DOUBLE:
                return 8;
            default:
                throw new RuntimeException();
        }
        return b + F;
    }

    private static int F(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("206b224a", new Object[]{str})).intValue();
        }
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    private <E extends ProtoEnum> int a(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd86c120", new Object[]{this, e})).intValue() : WireOutput.b(this.kc.d(e.getClass()).toInt(e));
    }

    private static <M extends Message> int a(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e0302e2", new Object[]{m})).intValue();
        }
        int serializedSize = m.getSerializedSize();
        return WireOutput.b(serializedSize) + serializedSize;
    }

    private void a(WireOutput wireOutput, int i, Object obj, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bb22bc", new Object[]{this, wireOutput, new Integer(i), obj, datatype});
            return;
        }
        wireOutput.a(i, datatype.wireType());
        a(wireOutput, obj, datatype);
    }

    private void a(WireOutput wireOutput, Object obj, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5ea0a1", new Object[]{this, wireOutput, obj, datatype});
            return;
        }
        switch (datatype) {
            case INT32:
                wireOutput.d(((Integer) obj).intValue());
                return;
            case INT64:
            case UINT64:
                wireOutput.b(((Long) obj).longValue());
                return;
            case UINT32:
                wireOutput.e(((Integer) obj).intValue());
                return;
            case SINT32:
                wireOutput.e(WireOutput.g(((Integer) obj).intValue()));
                return;
            case SINT64:
                wireOutput.b(WireOutput.d(((Long) obj).longValue()));
                return;
            case BOOL:
                wireOutput.c(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case ENUM:
                a((MessageAdapter<M>) ((ProtoEnum) obj), wireOutput);
                return;
            case STRING:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                wireOutput.e(bytes.length);
                wireOutput.b(bytes);
                return;
            case BYTES:
                ByteString byteString = (ByteString) obj;
                wireOutput.e(byteString.size());
                wireOutput.b(byteString.toByteArray());
                return;
            case MESSAGE:
                a((MessageAdapter<M>) ((Message) obj), wireOutput);
                return;
            case FIXED32:
            case SFIXED32:
                wireOutput.f(((Integer) obj).intValue());
                return;
            case FLOAT:
                wireOutput.f(Float.floatToIntBits(((Float) obj).floatValue()));
                return;
            case FIXED64:
            case SFIXED64:
                wireOutput.c(((Long) obj).longValue());
                return;
            case DOUBLE:
                wireOutput.c(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
    }

    private <M extends Message> void a(M m, WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fc959b", new Object[]{this, m, wireOutput});
            return;
        }
        wireOutput.e(m.getSerializedSize());
        this.kc.a(m.getClass()).write(m, wireOutput);
    }

    private <E extends ProtoEnum> void a(E e, WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26860859", new Object[]{this, e, wireOutput});
        } else {
            wireOutput.e(this.kc.d(e.getClass()).toInt(e));
        }
    }

    public final M read(WireInput wireInput) throws IOException {
        Message.Datatype datatype;
        Message.Label label;
        Extension<ExtendableMessage<?>, ?> extension;
        try {
            M newInstance = this.messageType.newInstance();
            Storage storage = new Storage();
            while (true) {
                int readTag = wireInput.readTag();
                int i = readTag >> 3;
                WireType valueOf = WireType.valueOf(readTag);
                if (i == 0) {
                    for (Integer num : storage.a()) {
                        int intValue = num.intValue();
                        if (this.ke.containsKey(intValue)) {
                            setBuilderField(newInstance, intValue, storage.a(intValue));
                        } else {
                            ((ExtendableMessage) newInstance).setExtension(getExtension(intValue), storage.a(intValue));
                        }
                    }
                    return newInstance;
                }
                FieldInfo fieldInfo = this.ke.get(i);
                if (fieldInfo != null) {
                    datatype = fieldInfo.c;
                    label = fieldInfo.d;
                    extension = null;
                } else {
                    Extension<ExtendableMessage<?>, ?> extension2 = getExtension(i);
                    if (extension2 != null) {
                        datatype = extension2.getDatatype();
                        extension = extension2;
                        label = extension2.getLabel();
                    } else {
                        switch (valueOf) {
                            case VARINT:
                                newInstance.b().a(i, Long.valueOf(wireInput.readVarint64()));
                                continue;
                            case FIXED32:
                                newInstance.b().a(i, Integer.valueOf(wireInput.readFixed32()));
                                continue;
                            case FIXED64:
                                newInstance.b().b(i, Long.valueOf(wireInput.readFixed64()));
                                continue;
                            case LENGTH_DELIMITED:
                                newInstance.b().a(i, wireInput.readBytes(wireInput.readVarint32()));
                                continue;
                            case START_GROUP:
                                wireInput.skipGroup();
                                continue;
                            case END_GROUP:
                                break;
                            default:
                                throw new RuntimeException("Unsupported wire type: ".concat(String.valueOf(valueOf)));
                        }
                    }
                }
                if (label.isPacked() && valueOf == WireType.LENGTH_DELIMITED) {
                    int readVarint32 = wireInput.readVarint32();
                    long position = wireInput.getPosition();
                    int pushLimit = wireInput.pushLimit(readVarint32);
                    while (true) {
                        long j = readVarint32 + position;
                        if (wireInput.getPosition() < j) {
                            Object a2 = a(wireInput, i, datatype);
                            if (datatype == Message.Datatype.ENUM && (a2 instanceof Integer)) {
                                newInstance.addVarint(i, ((Integer) a2).intValue());
                            } else {
                                storage.a(i, a2);
                            }
                        } else {
                            wireInput.popLimit(pushLimit);
                            if (wireInput.getPosition() != j) {
                                throw new IOException("Packed data had wrong length!");
                            }
                        }
                    }
                } else {
                    Object a3 = a(wireInput, i, datatype);
                    if (datatype == Message.Datatype.ENUM && (a3 instanceof Integer)) {
                        newInstance.addVarint(i, ((Integer) a3).intValue());
                    } else if (label.isRepeated()) {
                        storage.a(i, a3);
                    } else if (extension == null) {
                        setBuilderField(newInstance, i, a3);
                    } else {
                        ((ExtendableMessage) newInstance).setExtension(extension, a3);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object a(WireInput wireInput, int i, Message.Datatype datatype) throws IOException {
        EnumAdapter<? extends ProtoEnum> d;
        Extension<ExtendableMessage<?>, ?> extension;
        MessageAdapter<? extends Message> a2;
        Extension<ExtendableMessage<?>, ?> extension2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5d2ab3ef", new Object[]{this, wireInput, new Integer(i), datatype});
        }
        GenericDeclaration genericDeclaration = null;
        switch (datatype) {
            case INT32:
            case UINT32:
                return Integer.valueOf(wireInput.readVarint32());
            case INT64:
            case UINT64:
                return Long.valueOf(wireInput.readVarint64());
            case SINT32:
                return Integer.valueOf(WireInput.decodeZigZag32(wireInput.readVarint32()));
            case SINT64:
                return Long.valueOf(WireInput.decodeZigZag64(wireInput.readVarint64()));
            case BOOL:
                if (wireInput.readVarint32() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ENUM:
                FieldInfo fieldInfo = this.ke.get(i);
                if (fieldInfo != null && fieldInfo.i != null) {
                    d = fieldInfo.i;
                } else {
                    Wire wire = this.kc;
                    FieldInfo fieldInfo2 = this.ke.get(i);
                    if (fieldInfo2 != null) {
                        genericDeclaration = fieldInfo2.e;
                    }
                    if (genericDeclaration == null && (extension = getExtension(i)) != null) {
                        genericDeclaration = extension.getEnumType();
                    }
                    d = wire.d(genericDeclaration);
                    if (fieldInfo != null) {
                        fieldInfo.i = d;
                    }
                }
                int readVarint32 = wireInput.readVarint32();
                try {
                    return d.fromInt(readVarint32);
                } catch (IllegalArgumentException unused) {
                    return Integer.valueOf(readVarint32);
                }
            case STRING:
                return wireInput.readString();
            case BYTES:
                return wireInput.readBytes();
            case MESSAGE:
                int readVarint322 = wireInput.readVarint32();
                if (wireInput.recursionDepth >= 64) {
                    throw new IOException("Wire recursion limit exceeded");
                }
                int pushLimit = wireInput.pushLimit(readVarint322);
                wireInput.recursionDepth++;
                FieldInfo fieldInfo3 = this.ke.get(i);
                if (fieldInfo3 != null && fieldInfo3.h != null) {
                    a2 = fieldInfo3.h;
                } else {
                    Wire wire2 = this.kc;
                    FieldInfo fieldInfo4 = this.ke.get(i);
                    if (fieldInfo4 != null) {
                        genericDeclaration = fieldInfo4.f;
                    }
                    if (genericDeclaration == null && (extension2 = getExtension(i)) != null) {
                        genericDeclaration = extension2.getMessageType();
                    }
                    a2 = wire2.a(genericDeclaration);
                    if (fieldInfo3 != null) {
                        fieldInfo3.h = a2;
                    }
                }
                Message read = a2.read(wireInput);
                wireInput.checkLastTagWas(0);
                wireInput.recursionDepth--;
                wireInput.popLimit(pushLimit);
                return read;
            case FIXED32:
            case SFIXED32:
                return Integer.valueOf(wireInput.readFixed32());
            case FLOAT:
                return Float.valueOf(Float.intBitsToFloat(wireInput.readFixed32()));
            case FIXED64:
            case SFIXED64:
                return Long.valueOf(wireInput.readFixed64());
            case DOUBLE:
                return Double.valueOf(Double.longBitsToDouble(wireInput.readFixed64()));
            default:
                throw new RuntimeException();
        }
    }

    /* loaded from: classes3.dex */
    public static class Storage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<Integer, ImmutableList<Object>> f4898a;

        private Storage() {
        }

        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
                return;
            }
            Map<Integer, ImmutableList<Object>> map = this.f4898a;
            ImmutableList<Object> immutableList = map == null ? null : map.get(Integer.valueOf(i));
            if (immutableList == null) {
                immutableList = new ImmutableList<>();
                if (this.f4898a == null) {
                    this.f4898a = new LinkedHashMap();
                }
                this.f4898a.put(Integer.valueOf(i), immutableList);
            }
            ImmutableList.access$400(immutableList).add(obj);
        }

        public Set<Integer> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
            }
            Map<Integer, ImmutableList<Object>> map = this.f4898a;
            return map == null ? Collections.emptySet() : map.keySet();
        }

        public List<Object> a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
            }
            Map<Integer, ImmutableList<Object>> map = this.f4898a;
            if (map != null) {
                return map.get(Integer.valueOf(i));
            }
            return null;
        }
    }

    private Extension<ExtendableMessage<?>, ?> getExtension(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("c4620302", new Object[]{this, new Integer(i)});
        }
        ExtensionRegistry extensionRegistry = this.kc.f4909a;
        if (extensionRegistry != null) {
            return extensionRegistry.getExtension(this.messageType, i);
        }
        return null;
    }

    public final Extension<ExtendableMessage<?>, ?> getExtension(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("805a04e9", new Object[]{this, str});
        }
        ExtensionRegistry extensionRegistry = this.kc.f4909a;
        if (extensionRegistry != null) {
            return extensionRegistry.getExtension(this.messageType, str);
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static class ImmutableList<T> extends AbstractList<T> implements Serializable, Cloneable, RandomAccess {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final List<T> list = new ArrayList();

        public Object clone() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : this;
        }

        public static /* synthetic */ List access$400(ImmutableList immutableList) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e32567de", new Object[]{immutableList}) : immutableList.list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)}) : this.list.get(i);
        }
    }
}
