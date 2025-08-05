package kotlin.jvm.internal;

import kotlin.reflect.n;

/* loaded from: classes9.dex */
public abstract class PropertyReference2 extends PropertyReference implements kotlin.reflect.n {
    public PropertyReference2() {
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.n
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.n) mo2411getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.n
    /* renamed from: getGetter  reason: collision with other method in class */
    public n.a mo2414getGetter() {
        return ((kotlin.reflect.n) mo2411getReflected()).mo2414getGetter();
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public Object mo2423invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
