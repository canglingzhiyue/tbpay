package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Redactor<T extends Message> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Redactor<?> f4899a = new Redactor<Message>(null, null, null, null) { // from class: com.alipay.android.msp.framework.wire.Redactor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.framework.wire.Redactor
        public Message redact(Message message) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("a0f60a36", new Object[]{this, message}) : message;
        }
    };
    private static final Map<Class<? extends Message>, Redactor> b = new LinkedHashMap();
    private final Constructor<?> c;
    private final List<Field> d;
    private final List<Field> e;
    private final List<Redactor<?>> f;

    public Redactor(Constructor<?> constructor, List<Field> list, List<Field> list2, List<Redactor<?>> list3) {
        this.c = constructor;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized <T extends Message> Redactor<T> get(Class<T> cls) {
        Field[] declaredFields;
        Redactor redactor;
        Redactor<?> redactor2;
        synchronized (Redactor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Redactor) ipChange.ipc$dispatch("16a15ca4", new Object[]{cls});
            }
            Redactor<T> redactor3 = b.get(cls);
            if (redactor3 != null) {
                return redactor3;
            }
            FutureRedactor futureRedactor = new FutureRedactor();
            b.put(cls, futureRedactor);
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                        if (protoField != null && protoField.redacted()) {
                            if (protoField.label() == Message.Label.REQUIRED) {
                                throw new IllegalArgumentException(String.format("Field %s is REQUIRED and cannot be redacted.", field));
                            }
                            arrayList.add(field);
                        } else if (Message.class.isAssignableFrom(field.getType()) && (redactor2 = get(field.getType())) != f4899a) {
                            arrayList2.add(field);
                            arrayList3.add(redactor2);
                        }
                    }
                }
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    redactor = f4899a;
                } else {
                    redactor = new Redactor(cls.getConstructor(cls), arrayList, arrayList2, arrayList3);
                }
                futureRedactor.setDelegate(redactor);
                b.put(cls, redactor);
                return redactor;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public T redact(T t) {
        if (t == null) {
            return null;
        }
        try {
            T t2 = (T) this.c.newInstance(t);
            for (Field field : this.d) {
                field.set(t2, null);
            }
            for (int i = 0; i < this.e.size(); i++) {
                Field field2 = this.e.get(i);
                field2.set(t2, this.f.get(i).redact((Message) field2.get(t2)));
            }
            return t2;
        } catch (Exception e) {
            throw new AssertionError(e.getMessage());
        }
    }

    /* loaded from: classes3.dex */
    public static class FutureRedactor<T extends Message> extends Redactor<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Redactor<T> f4900a;

        public FutureRedactor() {
            super(null, null, null, null);
        }

        public void setDelegate(Redactor<T> redactor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e85ee51c", new Object[]{this, redactor});
            } else {
                this.f4900a = redactor;
            }
        }

        @Override // com.alipay.android.msp.framework.wire.Redactor
        public T redact(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("a0f60a36", new Object[]{this, t});
            }
            Redactor<T> redactor = this.f4900a;
            if (redactor == null) {
                throw new IllegalStateException("Delegate was not set.");
            }
            return redactor.redact(t);
        }
    }
}
