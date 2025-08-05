package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.wire.ExtendableMessage;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public final class Extension<T extends ExtendableMessage<?>, E> implements Comparable<Extension<?, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f4890a;
    private final Class<? extends Message> b;
    private final Class<? extends ProtoEnum> c;
    private final String d;
    private final int e;
    private final Message.Datatype f;
    private final Message.Label g;

    /* loaded from: classes3.dex */
    public static final class Builder<T extends ExtendableMessage<?>, E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f4891a;
        private final Class<? extends Message> b;
        private final Class<? extends ProtoEnum> c;
        private final Message.Datatype d;
        private String e;
        private int f;
        private Message.Label g;

        private Builder(Class<T> cls, Message.Datatype datatype) {
            this.e = null;
            this.f = -1;
            this.g = null;
            this.f4891a = cls;
            this.b = null;
            this.c = null;
            this.d = datatype;
        }

        private Builder(Class<T> cls, Class<? extends Message> cls2, Class<? extends ProtoEnum> cls3, Message.Datatype datatype) {
            this.e = null;
            this.f = -1;
            this.g = null;
            this.f4891a = cls;
            this.b = cls2;
            this.c = cls3;
            this.d = datatype;
        }

        public final Builder<T, E> setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eac44076", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public final Builder<T, E> setTag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ac2ef81c", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public final Extension<T, E> buildOptional() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Extension) ipChange.ipc$dispatch("7ece3d04", new Object[]{this});
            }
            this.g = Message.Label.OPTIONAL;
            a();
            return new Extension<>(this.f4891a, this.b, this.c, this.e, this.f, this.g, this.d);
        }

        public final Extension<T, E> buildRequired() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Extension) ipChange.ipc$dispatch("91d6cbc3", new Object[]{this});
            }
            this.g = Message.Label.REQUIRED;
            a();
            return new Extension<>(this.f4891a, this.b, this.c, this.e, this.f, this.g, this.d);
        }

        public final Extension<T, List<E>> buildRepeated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Extension) ipChange.ipc$dispatch("f49f381e", new Object[]{this});
            }
            this.g = Message.Label.REPEATED;
            a();
            return new Extension<>(this.f4891a, this.b, this.c, this.e, this.f, this.g, this.d);
        }

        public final Extension<T, List<E>> buildPacked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Extension) ipChange.ipc$dispatch("86bd6d9c", new Object[]{this});
            }
            this.g = Message.Label.PACKED;
            a();
            return new Extension<>(this.f4891a, this.b, this.c, this.e, this.f, this.g, this.d);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.f4891a == null) {
                throw new IllegalArgumentException("extendedType == null");
            } else {
                if (this.e == null) {
                    throw new IllegalArgumentException("name == null");
                }
                Message.Datatype datatype = this.d;
                if (datatype == null) {
                    throw new IllegalArgumentException("datatype == null");
                }
                if (this.g == null) {
                    throw new IllegalArgumentException("label == null");
                }
                if (this.f <= 0) {
                    throw new IllegalArgumentException("tag == " + this.f);
                } else if (datatype == Message.Datatype.MESSAGE) {
                    if (this.b != null && this.c == null) {
                        return;
                    }
                    throw new IllegalStateException("Message w/o messageType or w/ enumType");
                } else if (this.d == Message.Datatype.ENUM) {
                    if (this.b == null && this.c != null) {
                        return;
                    }
                    throw new IllegalStateException("Enum w/ messageType or w/o enumType");
                } else if (this.b != null || this.c != null) {
                    throw new IllegalStateException("Scalar w/ messageType or enumType");
                }
            }
        }
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Integer> int32Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("7cb48bd4", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.INT32);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Integer> sint32Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1b06f381", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.SINT32);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Integer> uint32Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1954123f", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.UINT32);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Integer> fixed32Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("ba563459", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.FIXED32);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Integer> sfixed32Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("dad64c6", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.SFIXED32);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Long> int64Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("80d3f2f3", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.INT64);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Long> sint64Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1f265aa0", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.SINT64);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Long> uint64Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1d73795e", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.UINT64);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Long> fixed64Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("be759b78", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.FIXED64);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Long> sfixed64Extending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("11cccbe5", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.SFIXED64);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Boolean> boolExtending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("20c49b30", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.BOOL);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, String> stringExtending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("83da117", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.STRING);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, ByteString> bytesExtending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("befa11f1", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.BYTES);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Float> floatExtending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("585cf122", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.FLOAT);
    }

    public static <T extends ExtendableMessage<?>> Builder<T, Double> doubleExtending(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("dcfe6cd7", new Object[]{cls}) : new Builder<>(cls, Message.Datatype.DOUBLE);
    }

    public static <T extends ExtendableMessage<?>, E extends Enum & ProtoEnum> Builder<T, E> enumExtending(Class<E> cls, Class<T> cls2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("78369146", new Object[]{cls, cls2}) : new Builder<>(cls2, null, cls, Message.Datatype.ENUM);
    }

    public static <T extends ExtendableMessage<?>, M extends Message> Builder<T, M> messageExtending(Class<M> cls, Class<T> cls2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("c30d9b80", new Object[]{cls, cls2}) : new Builder<>(cls2, cls, null, Message.Datatype.MESSAGE);
    }

    private Extension(Class<T> cls, Class<? extends Message> cls2, Class<? extends ProtoEnum> cls3, String str, int i, Message.Label label, Message.Datatype datatype) {
        this.f4890a = cls;
        this.d = str;
        this.e = i;
        this.f = datatype;
        this.g = label;
        this.b = cls2;
        this.c = cls3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Extension<?, ?> extension) {
        int value;
        int value2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1f8fbab", new Object[]{this, extension})).intValue();
        }
        if (extension == this) {
            return 0;
        }
        int i = this.e;
        int i2 = extension.e;
        if (i != i2) {
            return i - i2;
        }
        Message.Datatype datatype = this.f;
        if (datatype != extension.f) {
            value = datatype.value();
            value2 = extension.f.value();
        } else {
            Message.Label label = this.g;
            if (label != extension.g) {
                value = label.value();
                value2 = extension.g.value();
            } else {
                Class<T> cls = this.f4890a;
                if (cls != null && !cls.equals(extension.f4890a)) {
                    return this.f4890a.getName().compareTo(extension.f4890a.getName());
                }
                Class<? extends Message> cls2 = this.b;
                if (cls2 != null && !cls2.equals(extension.b)) {
                    return this.b.getName().compareTo(extension.b.getName());
                }
                Class<? extends ProtoEnum> cls3 = this.c;
                if (cls3 != null && !cls3.equals(extension.c)) {
                    return this.c.getName().compareTo(extension.c.getName());
                }
                return 0;
            }
        }
        return value - value2;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : (obj instanceof Extension) && compareTo((Extension) obj) == 0;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int value = ((((((this.e * 37) + this.f.value()) * 37) + this.g.value()) * 37) + this.f4890a.hashCode()) * 37;
        Class<? extends Message> cls = this.b;
        int hashCode = (value + (cls != null ? cls.hashCode() : 0)) * 37;
        Class<? extends ProtoEnum> cls2 = this.c;
        if (cls2 != null) {
            i = cls2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("[%s %s %s = %d]", this.g, this.f, this.d, Integer.valueOf(this.e));
    }

    public final Class<T> getExtendedType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("8d6473d", new Object[]{this}) : this.f4890a;
    }

    public final Class<? extends Message> getMessageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("844125f", new Object[]{this}) : this.b;
    }

    public final Class<? extends ProtoEnum> getEnumType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("3c69c205", new Object[]{this}) : this.c;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.d;
    }

    public final int getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue() : this.e;
    }

    public final Message.Datatype getDatatype() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message.Datatype) ipChange.ipc$dispatch("99745d46", new Object[]{this}) : this.f;
    }

    public final Message.Label getLabel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message.Label) ipChange.ipc$dispatch("b6e0a59c", new Object[]{this}) : this.g;
    }
}
