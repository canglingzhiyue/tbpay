package com.squareup.wire;

import com.squareup.wire.Message;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    final e f8131a;
    private final Map<Class<? extends Message>, MessageAdapter<? extends Message>> b;
    private final Map<Class<? extends Message.a>, Object<? extends Message.a>> c;
    private final Map<Class<? extends g>, b<? extends g>> d;
    private final Map<Class<? extends Message>, a<? extends Message>> e;

    public i(List<Class<?>> list) {
        Field[] declaredFields;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f8131a = new e();
        for (Class<?> cls : list) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().equals(c.class)) {
                    try {
                        this.f8131a.a((c) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
    }

    public i(Class<?>... clsArr) {
        this(Arrays.asList(clsArr));
    }

    private <M extends Message> M a(j jVar, Class<M> cls) throws IOException {
        return a(cls).a(jVar);
    }

    public <M extends Message> M a(byte[] bArr, Class<M> cls) throws IOException {
        f.a(bArr, "bytes");
        f.a(cls, "messageClass");
        M m = (M) a(j.a(bArr), cls);
        m.checkAvailability();
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <M extends Message> MessageAdapter<M> a(Class<M> cls) {
        MessageAdapter<M> messageAdapter;
        messageAdapter = (MessageAdapter<M>) this.b.get(cls);
        if (messageAdapter == null) {
            messageAdapter = new MessageAdapter<>(this, cls);
            this.b.put(cls, messageAdapter);
        }
        return messageAdapter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <T extends Message> a<T> b(Class<T> cls) {
        a<T> aVar;
        aVar = (a<T>) this.e.get(cls);
        if (aVar == null) {
            aVar = new a<>(cls);
            this.e.put(cls, aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <E extends g> b<E> c(Class<E> cls) {
        b<E> bVar;
        bVar = (b<E>) this.d.get(cls);
        if (bVar == null) {
            bVar = new b<>(cls);
            this.d.put(cls, bVar);
        }
        return bVar;
    }
}
