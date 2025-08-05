package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(kotlin.reflect.e eVar, String str, String str2) {
        super(NO_RECEIVER, ((l) eVar).a(), str, str2, eVar instanceof kotlin.reflect.c ? 0 : 1);
    }

    @Override // kotlin.reflect.m
    public Object get(Object obj) {
        return mo2413getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        mo2408getSetter().call(obj, obj2);
    }
}
