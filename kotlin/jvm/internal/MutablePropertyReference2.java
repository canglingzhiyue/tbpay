package kotlin.jvm.internal;

import kotlin.reflect.j;
import kotlin.reflect.n;

/* loaded from: classes9.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements kotlin.reflect.j {
    public MutablePropertyReference2() {
    }

    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.n
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.j) mo2411getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.n
    /* renamed from: getGetter  reason: collision with other method in class */
    public n.a mo2414getGetter() {
        return ((kotlin.reflect.j) mo2411getReflected()).mo2414getGetter();
    }

    @Override // kotlin.reflect.j
    /* renamed from: getSetter  reason: collision with other method in class */
    public j.a mo2410getSetter() {
        return ((kotlin.reflect.j) mo2411getReflected()).mo2410getSetter();
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public Object mo2423invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
