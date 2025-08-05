package kotlin.jvm.internal;

import kotlin.reflect.l;

/* loaded from: classes9.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.l {
    public PropertyReference0() {
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.l
    public Object getDelegate() {
        return ((kotlin.reflect.l) mo2411getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.l
    /* renamed from: getGetter  reason: collision with other method in class */
    public l.a mo2412getGetter() {
        return ((kotlin.reflect.l) mo2411getReflected()).mo2412getGetter();
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public Object mo2427invoke() {
        return get();
    }
}
