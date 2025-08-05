package com.squareup.wire;

import com.squareup.wire.Message;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
import okio.ByteString;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MessageAdapter<M extends Message> {

    /* renamed from: a  reason: collision with root package name */
    private final i f8114a;
    private final Class<M> b;
    private final Map<String, Integer> c = new LinkedHashMap();
    private final h<a> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class ImmutableList<T> extends AbstractList<T> implements Serializable, Cloneable, RandomAccess {
        private final List<T> list = new ArrayList();

        ImmutableList() {
        }

        public Object clone() {
            return this;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.list.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f8116a;
        final String b;
        final Message.Datatype c;
        final Message.Label d;
        final Class<? extends g> e;
        final Class<? extends Message> f;
        final boolean g;
        MessageAdapter<? extends Message> h;
        com.squareup.wire.b<? extends g> i;
        private final Field j;
        private final Field k;

        /* JADX WARN: Multi-variable type inference failed */
        private a(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class<?> cls, Field field, Field field2) {
            this.f8116a = i;
            this.b = str;
            this.c = datatype;
            this.d = label;
            this.g = z;
            if (datatype == Message.Datatype.ENUM) {
                this.e = cls;
            } else if (datatype == Message.Datatype.MESSAGE) {
                this.f = cls;
                this.e = null;
                this.j = field;
                this.k = field2;
            } else {
                this.e = null;
            }
            this.f = null;
            this.j = field;
            this.k = field2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Map<Integer, ImmutableList<Object>> f8117a;

        private b() {
        }

        List<Object> a(int i) {
            Map<Integer, ImmutableList<Object>> map = this.f8117a;
            if (map == null) {
                return null;
            }
            return map.get(Integer.valueOf(i));
        }

        Set<Integer> a() {
            Map<Integer, ImmutableList<Object>> map = this.f8117a;
            return map == null ? Collections.emptySet() : map.keySet();
        }

        void a(int i, Object obj) {
            Map<Integer, ImmutableList<Object>> map = this.f8117a;
            ImmutableList<Object> immutableList = map == null ? null : map.get(Integer.valueOf(i));
            if (immutableList == null) {
                immutableList = new ImmutableList<>();
                if (this.f8117a == null) {
                    this.f8117a = new LinkedHashMap();
                }
                this.f8117a.put(Integer.valueOf(i), immutableList);
            }
            ((ImmutableList) immutableList).list.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAdapter(i iVar, Class<M> cls) {
        Field[] fieldArr;
        this.f8114a = iVar;
        this.b = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
            if (protoField != null) {
                int tag = protoField.tag();
                String name = field.getName();
                this.c.put(name, Integer.valueOf(tag));
                Class cls2 = null;
                Message.Datatype type = protoField.type();
                if (type == Message.Datatype.ENUM) {
                    cls2 = b(field);
                } else if (type == Message.Datatype.MESSAGE) {
                    cls2 = a(field);
                }
                fieldArr = declaredFields;
                linkedHashMap.put(Integer.valueOf(tag), new a(tag, name, type, protoField.label(), protoField.redacted(), cls2, field, a(name)));
            } else {
                fieldArr = declaredFields;
            }
            i++;
            declaredFields = fieldArr;
        }
        this.d = h.a(linkedHashMap);
    }

    private int a(int i, Object obj, Message.Datatype datatype) {
        return k.b(i) + a(obj, datatype);
    }

    private <T extends ExtendableMessage<?>> int a(d<T> dVar) {
        int i = 0;
        for (int i2 = 0; i2 < dVar.a(); i2++) {
            c<T, ?> a2 = dVar.a(i2);
            Object b2 = dVar.b(i2);
            int e = a2.e();
            Message.Datatype f = a2.f();
            Message.Label g = a2.g();
            i += g.isRepeated() ? g.isPacked() ? b((List) b2, e, f) : a((List) b2, e, f) : a(e, b2, f);
        }
        return i;
    }

    private <E extends g> int a(E e) {
        return k.c(this.f8114a.c(e.getClass()).a((com.squareup.wire.b<E>) e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int a(Object obj, Message.Datatype datatype) {
        int b2;
        switch (datatype) {
            case INT32:
                return k.a(((Integer) obj).intValue());
            case INT64:
            case UINT64:
                return k.a(((Long) obj).longValue());
            case UINT32:
                return k.c(((Integer) obj).intValue());
            case SINT32:
                return k.c(k.h(((Integer) obj).intValue()));
            case SINT64:
                return k.a(k.d(((Long) obj).longValue()));
            case BOOL:
                return 1;
            case ENUM:
                return a((MessageAdapter<M>) ((g) obj));
            case STRING:
                b2 = b((String) obj);
                break;
            case BYTES:
                b2 = ((ByteString) obj).size();
                break;
            case MESSAGE:
                return d((MessageAdapter<M>) ((Message) obj));
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
        return k.c(b2) + b2;
    }

    private int a(List<?> list, int i, Message.Datatype datatype) {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += a(i, it.next(), datatype);
        }
        return i2;
    }

    private Message a(j jVar, int i) throws IOException {
        int d = jVar.d();
        if (jVar.f8132a < 64) {
            int d2 = jVar.d(d);
            jVar.f8132a++;
            Message a2 = a(i).a(jVar);
            jVar.a(0);
            jVar.f8132a--;
            jVar.e(d2);
            return a2;
        }
        throw new IOException("Wire recursion limit exceeded");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MessageAdapter<? extends Message> a(int i) {
        a a2 = this.d.a(i);
        if (a2 == null || a2.h == null) {
            MessageAdapter<? extends Message> a3 = this.f8114a.a(c(i));
            if (a2 != null) {
                a2.h = a3;
            }
            return a3;
        }
        return a2.h;
    }

    private Class<Message> a(Field field) {
        Class type = field.getType();
        if (Message.class.isAssignableFrom(type)) {
            return type;
        }
        if (!List.class.isAssignableFrom(type)) {
            return null;
        }
        Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class<Message> cls = (Class) type2;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return cls;
    }

    private Object a(j jVar, int i, Message.Datatype datatype) throws IOException {
        switch (datatype) {
            case INT32:
            case UINT32:
                return Integer.valueOf(jVar.d());
            case INT64:
            case UINT64:
                return Long.valueOf(jVar.e());
            case SINT32:
                return Integer.valueOf(j.c(jVar.d()));
            case SINT64:
                return Long.valueOf(j.a(jVar.e()));
            case BOOL:
                return Boolean.valueOf(jVar.d() != 0);
            case ENUM:
                com.squareup.wire.b<? extends g> b2 = b(i);
                int d = jVar.d();
                try {
                    return b2.a(d);
                } catch (IllegalArgumentException unused) {
                    return Integer.valueOf(d);
                }
            case STRING:
                return jVar.b();
            case BYTES:
                return jVar.c();
            case MESSAGE:
                return a(jVar, i);
            case FIXED32:
            case SFIXED32:
                return Integer.valueOf(jVar.f());
            case FLOAT:
                return Float.valueOf(Float.intBitsToFloat(jVar.f()));
            case FIXED64:
            case SFIXED64:
                return Long.valueOf(jVar.g());
            case DOUBLE:
                return Double.valueOf(Double.longBitsToDouble(jVar.g()));
            default:
                throw new RuntimeException();
        }
    }

    private Field a(String str) {
        try {
            return this.b.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + this.b.getName() + "." + str);
        }
    }

    private void a(ExtendableMessage extendableMessage, c<?, ?> cVar, Object obj) {
        extendableMessage.setExtension(cVar, obj);
    }

    private void a(Message message, j jVar, int i, WireType wireType) throws IOException {
        switch (wireType) {
            case VARINT:
                message.ensureUnknownFieldMap().a(i, Long.valueOf(jVar.e()));
                return;
            case FIXED32:
                message.ensureUnknownFieldMap().a(i, Integer.valueOf(jVar.f()));
                return;
            case FIXED64:
                message.ensureUnknownFieldMap().b(i, Long.valueOf(jVar.g()));
                return;
            case LENGTH_DELIMITED:
                message.ensureUnknownFieldMap().a(i, jVar.b(jVar.d()));
                return;
            case START_GROUP:
                jVar.i();
                return;
            case END_GROUP:
                return;
            default:
                throw new RuntimeException("Unsupported wire type: " + wireType);
        }
    }

    private <E extends g> void a(E e, k kVar) throws IOException {
        kVar.f(this.f8114a.c(e.getClass()).a((com.squareup.wire.b<E>) e));
    }

    private void a(k kVar, int i, Object obj, Message.Datatype datatype) throws IOException {
        kVar.b(i, datatype.wireType());
        a(kVar, obj, datatype);
    }

    private <T extends ExtendableMessage<?>> void a(k kVar, d<T> dVar) throws IOException {
        for (int i = 0; i < dVar.a(); i++) {
            c<T, ?> a2 = dVar.a(i);
            Object b2 = dVar.b(i);
            int e = a2.e();
            Message.Datatype f = a2.f();
            Message.Label g = a2.g();
            if (!g.isRepeated()) {
                a(kVar, e, b2, f);
            } else if (g.isPacked()) {
                b(kVar, (List) b2, e, f);
            } else {
                a(kVar, (List) b2, e, f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(k kVar, Object obj, Message.Datatype datatype) throws IOException {
        switch (datatype) {
            case INT32:
                kVar.e(((Integer) obj).intValue());
                return;
            case INT64:
            case UINT64:
                kVar.b(((Long) obj).longValue());
                return;
            case UINT32:
                kVar.f(((Integer) obj).intValue());
                return;
            case SINT32:
                kVar.f(k.h(((Integer) obj).intValue()));
                return;
            case SINT64:
                kVar.b(k.d(((Long) obj).longValue()));
                return;
            case BOOL:
                kVar.d(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case ENUM:
                a((MessageAdapter<M>) ((g) obj), kVar);
                return;
            case STRING:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                kVar.f(bytes.length);
                kVar.b(bytes);
                return;
            case BYTES:
                ByteString byteString = (ByteString) obj;
                kVar.f(byteString.size());
                kVar.b(byteString.toByteArray());
                return;
            case MESSAGE:
                b((Message) obj, kVar);
                return;
            case FIXED32:
            case SFIXED32:
                kVar.g(((Integer) obj).intValue());
                return;
            case FLOAT:
                kVar.g(Float.floatToIntBits(((Float) obj).floatValue()));
                return;
            case FIXED64:
            case SFIXED64:
                kVar.c(((Long) obj).longValue());
                return;
            case DOUBLE:
                kVar.c(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
    }

    private void a(k kVar, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            a(kVar, i, it.next(), datatype);
        }
    }

    private int b(String str) {
        int length = str.length();
        int i = 0;
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

    private int b(List<?> list, int i, Message.Datatype datatype) {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        return k.c(k.a(i, WireType.LENGTH_DELIMITED)) + k.c(i2) + i2;
    }

    private com.squareup.wire.b<? extends g> b(int i) {
        a a2 = this.d.a(i);
        if (a2 == null || a2.i == null) {
            com.squareup.wire.b<? extends g> c = this.f8114a.c(e(i));
            if (a2 != null) {
                a2.i = c;
            }
            return c;
        }
        return a2.i;
    }

    private Class<Enum> b(Field field) {
        Class type = field.getType();
        if (Enum.class.isAssignableFrom(type)) {
            return type;
        }
        if (!List.class.isAssignableFrom(type)) {
            return null;
        }
        Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
        if (!(type2 instanceof Class)) {
            return null;
        }
        Class<Enum> cls = (Class) type2;
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        return cls;
    }

    private <M extends Message> void b(M m, k kVar) throws IOException {
        kVar.f(m.getSerializedSize());
        this.f8114a.a(m.getClass()).a((MessageAdapter<M>) m, kVar);
    }

    private void b(k kVar, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        kVar.b(i, WireType.LENGTH_DELIMITED);
        kVar.f(i2);
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            a(kVar, it2.next(), datatype);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Class<Message> c(int i) {
        c<ExtendableMessage<?>, ?> d;
        a a2 = this.d.a(i);
        Class<Message> cls = a2 == null ? 0 : a2.f;
        return (cls != 0 || (d = d(i)) == null) ? cls : d.b();
    }

    private <M extends Message> int d(M m) {
        int serializedSize = m.getSerializedSize();
        return k.c(serializedSize) + serializedSize;
    }

    private c<ExtendableMessage<?>, ?> d(int i) {
        e eVar = this.f8114a.f8131a;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this.b, i);
    }

    private Class<? extends g> e(int i) {
        c<ExtendableMessage<?>, ?> d;
        a a2 = this.d.a(i);
        Class<? extends g> cls = a2 == null ? null : a2.e;
        return (cls != null || (d = d(i)) == null) ? cls : d.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(M m) {
        int i = 0;
        for (a aVar : a()) {
            Object a2 = a((MessageAdapter<M>) m, aVar);
            if (a2 != null) {
                int i2 = aVar.f8116a;
                Message.Datatype datatype = aVar.c;
                Message.Label label = aVar.d;
                i += label.isRepeated() ? label.isPacked() ? b((List) a2, i2, datatype) : a((List) a2, i2, datatype) : a(i2, a2, datatype);
            }
        }
        if (m instanceof ExtendableMessage) {
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.extensionMap != null) {
                i += a(extendableMessage.extensionMap);
            }
        }
        return i + m.getUnknownFieldsSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M a(j jVar) throws IOException {
        Message.Datatype datatype;
        Message.Label label;
        c<?, ?> cVar;
        long j;
        try {
            M newInstance = this.b.newInstance();
            b bVar = new b();
            while (true) {
                int a2 = jVar.a();
                int i = a2 >> 3;
                WireType valueOf = WireType.valueOf(a2);
                if (i == 0) {
                    for (Integer num : bVar.a()) {
                        int intValue = num.intValue();
                        if (this.d.b(intValue)) {
                            a((MessageAdapter<M>) newInstance, intValue, bVar.a(intValue));
                        } else {
                            a((ExtendableMessage) newInstance, d(intValue), bVar.a(intValue));
                        }
                    }
                    return newInstance;
                }
                a a3 = this.d.a(i);
                if (a3 != null) {
                    datatype = a3.c;
                    label = a3.d;
                    cVar = null;
                } else {
                    c<?, ?> d = d(i);
                    if (d == null) {
                        a(newInstance, jVar, i, valueOf);
                    } else {
                        datatype = d.f();
                        cVar = d;
                        label = d.g();
                    }
                }
                if (!label.isPacked() || valueOf != WireType.LENGTH_DELIMITED) {
                    Object a4 = a(jVar, i, datatype);
                    if (datatype == Message.Datatype.ENUM && (a4 instanceof Integer)) {
                        newInstance.addVarint(i, ((Integer) a4).intValue());
                    } else if (label.isRepeated()) {
                        bVar.a(i, a4);
                    } else if (cVar != null) {
                        a((ExtendableMessage) newInstance, cVar, a4);
                    } else {
                        a((MessageAdapter<M>) newInstance, i, a4);
                    }
                } else {
                    int d2 = jVar.d();
                    long h = jVar.h();
                    int d3 = jVar.d(d2);
                    while (true) {
                        j = d2 + h;
                        if (jVar.h() >= j) {
                            break;
                        }
                        Object a5 = a(jVar, i, datatype);
                        if (datatype != Message.Datatype.ENUM || !(a5 instanceof Integer)) {
                            bVar.a(i, a5);
                        } else {
                            newInstance.addVarint(i, ((Integer) a5).intValue());
                        }
                    }
                    jVar.e(d3);
                    if (jVar.h() != j) {
                        throw new IOException("Packed data had wrong length!");
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    Object a(M m, a aVar) {
        if (aVar.j != null) {
            try {
                return aVar.j.get(m);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
        throw new AssertionError("Field is not of type \"Message\"");
    }

    Collection<a> a() {
        return this.d.a();
    }

    public void a(M m, int i, Object obj) {
        try {
            this.d.a(i).k.set(m, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(M m, k kVar) throws IOException {
        for (a aVar : a()) {
            Object a2 = a((MessageAdapter<M>) m, aVar);
            if (a2 != null) {
                int i = aVar.f8116a;
                Message.Datatype datatype = aVar.c;
                Message.Label label = aVar.d;
                if (!label.isRepeated()) {
                    a(kVar, i, a2, datatype);
                } else if (label.isPacked()) {
                    b(kVar, (List) a2, i, datatype);
                } else {
                    a(kVar, (List) a2, i, datatype);
                }
            }
        }
        if (m instanceof ExtendableMessage) {
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.extensionMap != null) {
                a(kVar, extendableMessage.extensionMap);
            }
        }
        m.writeUnknownFieldMap(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b(M m) {
        byte[] bArr = new byte[a((MessageAdapter<M>) m)];
        try {
            a((MessageAdapter<M>) m, k.a(bArr));
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c(M m) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getSimpleName());
        sb.append(riy.BLOCK_START_STR);
        String str = "";
        for (a aVar : a()) {
            Object a2 = a((MessageAdapter<M>) m, aVar);
            if (a2 != null) {
                sb.append(str);
                sb.append(aVar.b);
                sb.append("=");
                if (aVar.g) {
                    a2 = "██";
                }
                sb.append(a2);
                str = ", ";
            }
        }
        if (m instanceof ExtendableMessage) {
            sb.append(str);
            sb.append("{extensions=");
            sb.append(((ExtendableMessage) m).extensionsToString());
            sb.append(riy.BLOCK_END_STR);
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
