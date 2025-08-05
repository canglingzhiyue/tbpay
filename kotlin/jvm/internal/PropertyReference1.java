package kotlin.jvm.internal;

import kotlin.reflect.m;

/* loaded from: classes9.dex */
public abstract class PropertyReference1 extends PropertyReference implements kotlin.reflect.m {
    public PropertyReference1() {
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.m
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.m) mo2411getReflected()).getDelegate(obj);
    }

    @Override // kotlin.reflect.m
    /* renamed from: getGetter  reason: collision with other method in class */
    public m.a mo2413getGetter() {
        return ((kotlin.reflect.m) mo2411getReflected()).mo2413getGetter();
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public Object mo2421invoke(Object obj) {
        return get(obj);
    }
}
