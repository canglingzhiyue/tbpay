package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.m;

/* loaded from: classes9.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements kotlin.reflect.i {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    @Override // kotlin.reflect.m
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.i) mo2411getReflected()).getDelegate(obj);
    }

    @Override // kotlin.reflect.m
    /* renamed from: getGetter  reason: collision with other method in class */
    public m.a mo2413getGetter() {
        return ((kotlin.reflect.i) mo2411getReflected()).mo2413getGetter();
    }

    @Override // kotlin.reflect.i
    /* renamed from: getSetter  reason: collision with other method in class */
    public i.a mo2408getSetter() {
        return ((kotlin.reflect.i) mo2411getReflected()).mo2408getSetter();
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public Object mo2421invoke(Object obj) {
        return get(obj);
    }
}
