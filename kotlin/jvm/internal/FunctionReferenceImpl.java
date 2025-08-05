package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, kotlin.reflect.e eVar, String str, String str2) {
        super(i, NO_RECEIVER, ((l) eVar).a(), str, str2, eVar instanceof kotlin.reflect.c ? 0 : 1);
    }
}
