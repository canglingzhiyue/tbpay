package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.Source;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Wire {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExtensionRegistry f4909a;
    private final Map<Class<? extends Message.Builder>, BuilderAdapter<? extends Message.Builder>> b;
    private final Map<Class<? extends ProtoEnum>, EnumAdapter<? extends ProtoEnum>> c;
    private final Map<Class<? extends Message>, AvailabilityChecker<? extends Message>> d;
    private final Map<Class<? extends Message>, MessageAdapter<? extends Message>> e;

    public static <T> T get(T t, T t2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9a6354bd", new Object[]{t, t2}) : t != null ? t : t2;
    }

    public Wire(Class<?>... clsArr) {
        this(Arrays.asList(clsArr));
    }

    public Wire(List<Class<?>> list) {
        Field[] declaredFields;
        this.e = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f4909a = new ExtensionRegistry();
        for (Class<?> cls : list) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().equals(Extension.class)) {
                    try {
                        this.f4909a.add((Extension) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
    }

    public final synchronized <M extends Message> MessageAdapter<M> a(Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageAdapter) ipChange.ipc$dispatch("e7e1556b", new Object[]{this, cls});
        }
        MessageAdapter<M> messageAdapter = (MessageAdapter<M>) this.e.get(cls);
        if (messageAdapter == null) {
            messageAdapter = new MessageAdapter<>(this, cls);
            this.e.put(cls, messageAdapter);
        }
        return messageAdapter;
    }

    public final synchronized <B extends Message.Builder> BuilderAdapter<B> b(Class<B> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BuilderAdapter) ipChange.ipc$dispatch("33999bc0", new Object[]{this, cls});
        }
        BuilderAdapter<B> builderAdapter = (BuilderAdapter<B>) this.b.get(cls);
        if (builderAdapter == null) {
            builderAdapter = new BuilderAdapter<>(cls);
            this.b.put(cls, builderAdapter);
        }
        return builderAdapter;
    }

    public final synchronized <T extends Message> AvailabilityChecker<T> c(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailabilityChecker) ipChange.ipc$dispatch("6f97eae7", new Object[]{this, cls});
        }
        AvailabilityChecker<T> availabilityChecker = (AvailabilityChecker<T>) this.d.get(cls);
        if (availabilityChecker == null) {
            availabilityChecker = new AvailabilityChecker<>(cls);
            this.d.put(cls, availabilityChecker);
        }
        return availabilityChecker;
    }

    public final synchronized <E extends ProtoEnum> EnumAdapter<E> d(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnumAdapter) ipChange.ipc$dispatch("5f45f12", new Object[]{this, cls});
        }
        EnumAdapter<E> enumAdapter = (EnumAdapter<E>) this.c.get(cls);
        if (enumAdapter == null) {
            enumAdapter = new EnumAdapter<>(cls);
            this.c.put(cls, enumAdapter);
        }
        return enumAdapter;
    }

    public final <M extends Message> M parseFrom(byte[] bArr, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("d7842bd9", new Object[]{this, bArr, cls});
        }
        Preconditions.a(bArr, "bytes");
        Preconditions.a(cls, "messageClass");
        M m = (M) a(WireInput.newInstance(bArr), cls);
        m.checkAvailability();
        return m;
    }

    public final <M extends Message> M parseFrom(byte[] bArr, int i, int i2, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("e50b9e39", new Object[]{this, bArr, new Integer(i), new Integer(i2), cls});
        }
        Preconditions.a(bArr, "bytes");
        Preconditions.a(i >= 0, "offset < 0");
        Preconditions.a(i2 >= 0, "count < 0");
        if (i + i2 > bArr.length) {
            z = false;
        }
        Preconditions.a(z, "offset + count > bytes");
        Preconditions.a(cls, "messageClass");
        return (M) a(WireInput.newInstance(bArr, i, i2), cls);
    }

    public final <M extends Message> M parseFrom(InputStream inputStream, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("ca0ea815", new Object[]{this, inputStream, cls});
        }
        Preconditions.a(inputStream, "input");
        Preconditions.a(cls, "messageClass");
        return (M) a(WireInput.newInstance(inputStream), cls);
    }

    public final <M extends Message> M parseFrom(Source source, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("61e87eac", new Object[]{this, source, cls});
        }
        Preconditions.a(source, "input");
        Preconditions.a(cls, "messageClass");
        return (M) a(WireInput.newInstance(source), cls);
    }

    private <M extends Message> M a(WireInput wireInput, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M) ipChange.ipc$dispatch("620f2173", new Object[]{this, wireInput, cls}) : a(cls).read(wireInput);
    }
}
