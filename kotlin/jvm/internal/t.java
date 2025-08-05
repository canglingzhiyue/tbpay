package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final u f24948a;
    private static final kotlin.reflect.c[] b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f24948a = uVar;
        b = new kotlin.reflect.c[0];
    }

    public static String a(Lambda lambda) {
        return f24948a.a(lambda);
    }

    public static String a(p pVar) {
        return f24948a.a(pVar);
    }

    public static kotlin.reflect.e a(Class cls) {
        return f24948a.a(cls, "");
    }

    public static kotlin.reflect.e a(Class cls, String str) {
        return f24948a.a(cls, str);
    }

    public static kotlin.reflect.f a(FunctionReference functionReference) {
        return f24948a.a(functionReference);
    }

    public static kotlin.reflect.h a(MutablePropertyReference0 mutablePropertyReference0) {
        return f24948a.a(mutablePropertyReference0);
    }

    public static kotlin.reflect.i a(MutablePropertyReference1 mutablePropertyReference1) {
        return f24948a.a(mutablePropertyReference1);
    }

    public static kotlin.reflect.j a(MutablePropertyReference2 mutablePropertyReference2) {
        return f24948a.a(mutablePropertyReference2);
    }

    public static kotlin.reflect.l a(PropertyReference0 propertyReference0) {
        return f24948a.a(propertyReference0);
    }

    public static kotlin.reflect.m a(PropertyReference1 propertyReference1) {
        return f24948a.a(propertyReference1);
    }

    public static kotlin.reflect.n a(PropertyReference2 propertyReference2) {
        return f24948a.a(propertyReference2);
    }

    public static kotlin.reflect.c b(Class cls) {
        return f24948a.a(cls);
    }
}
