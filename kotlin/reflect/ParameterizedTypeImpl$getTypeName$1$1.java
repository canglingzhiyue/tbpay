package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.rul;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements rul<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, t.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo2421invoke(Type p0) {
        String b;
        kotlin.jvm.internal.q.d(p0, "p0");
        b = t.b(p0);
        return b;
    }
}
