package kotlin.jvm.internal;

import kotlin.reflect.h;
import kotlin.reflect.l;

/* loaded from: classes9.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.h {
    public MutablePropertyReference0() {
    }

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.l
    public Object getDelegate() {
        return ((kotlin.reflect.h) mo2411getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.l
    /* renamed from: getGetter  reason: collision with other method in class */
    public l.a mo2412getGetter() {
        return ((kotlin.reflect.h) mo2411getReflected()).mo2412getGetter();
    }

    @Override // kotlin.reflect.h
    /* renamed from: getSetter  reason: collision with other method in class */
    public h.a mo2406getSetter() {
        return ((kotlin.reflect.h) mo2411getReflected()).mo2406getSetter();
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public Object mo2427invoke() {
        return get();
    }
}
