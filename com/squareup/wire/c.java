package com.squareup.wire;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;

/* loaded from: classes4.dex */
public final class c<T extends ExtendableMessage<?>, E> implements Comparable<c<?, ?>> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f8127a;
    private final Class<? extends Message> b;
    private final Class<? extends g> c;
    private final String d;
    private final int e;
    private final Message.Datatype f;
    private final Message.Label g;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c<?, ?> cVar) {
        String name;
        Class cls;
        int value;
        int value2;
        if (cVar == this) {
            return 0;
        }
        int i = this.e;
        int i2 = cVar.e;
        if (i != i2) {
            return i - i2;
        }
        Message.Datatype datatype = this.f;
        if (datatype != cVar.f) {
            value = datatype.value();
            value2 = cVar.f.value();
        } else {
            Message.Label label = this.g;
            if (label == cVar.g) {
                Class<T> cls2 = this.f8127a;
                if (cls2 == null || cls2.equals(cVar.f8127a)) {
                    Class<? extends Message> cls3 = this.b;
                    if (cls3 == null || cls3.equals(cVar.b)) {
                        Class<? extends g> cls4 = this.c;
                        if (cls4 == null || cls4.equals(cVar.c)) {
                            return 0;
                        }
                        name = this.c.getName();
                        cls = cVar.c;
                    } else {
                        name = this.b.getName();
                        cls = cVar.b;
                    }
                } else {
                    name = this.f8127a.getName();
                    cls = cVar.f8127a;
                }
                return name.compareTo(cls.getName());
            }
            value = label.value();
            value2 = cVar.g.value();
        }
        return value - value2;
    }

    public Class<T> a() {
        return this.f8127a;
    }

    public Class<? extends Message> b() {
        return this.b;
    }

    public Class<? extends g> c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public Message.Datatype f() {
        return this.f;
    }

    public Message.Label g() {
        return this.g;
    }

    public int hashCode() {
        int value = ((((((this.e * 37) + this.f.value()) * 37) + this.g.value()) * 37) + this.f8127a.hashCode()) * 37;
        Class<? extends Message> cls = this.b;
        int i = 0;
        int hashCode = (value + (cls != null ? cls.hashCode() : 0)) * 37;
        Class<? extends g> cls2 = this.c;
        if (cls2 != null) {
            i = cls2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return String.format("[%s %s %s = %d]", this.g, this.f, this.d, Integer.valueOf(this.e));
    }
}
