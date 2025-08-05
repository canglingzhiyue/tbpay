package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class u {
    public String a(Lambda lambda) {
        return a((p) lambda);
    }

    public String a(p pVar) {
        String obj = pVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public kotlin.reflect.c a(Class cls) {
        return new m(cls);
    }

    public kotlin.reflect.e a(Class cls, String str) {
        return new s(cls, str);
    }

    public kotlin.reflect.f a(FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.h a(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.i a(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.j a(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public kotlin.reflect.l a(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.m a(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.n a(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
