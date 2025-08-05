package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    public PropertyReference2Impl(kotlin.reflect.e eVar, String str, String str2) {
        super(((l) eVar).a(), str, str2, eVar instanceof kotlin.reflect.c ? 0 : 1);
    }

    @Override // kotlin.reflect.n
    public Object get(Object obj, Object obj2) {
        return mo2414getGetter().call(obj, obj2);
    }
}
