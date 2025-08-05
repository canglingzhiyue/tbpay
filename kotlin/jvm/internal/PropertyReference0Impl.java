package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public PropertyReference0Impl(kotlin.reflect.e eVar, String str, String str2) {
        super(NO_RECEIVER, ((l) eVar).a(), str, str2, eVar instanceof kotlin.reflect.c ? 0 : 1);
    }

    @Override // kotlin.reflect.l
    public Object get() {
        return mo2412getGetter().call(new Object[0]);
    }
}
