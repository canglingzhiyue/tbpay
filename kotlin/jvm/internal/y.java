package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.eau;
import tb.riy;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\bH\u0002J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\f\u0010\"\u001a\u00020\u001e*\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", com.taobao.android.weex_framework.util.a.ATOM_arguments, "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "flags", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getFlags$kotlin_stdlib$annotations", "()V", "getFlags$kotlin_stdlib", "()I", "()Z", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "convertPrimitiveToWrapper", eau.PARSER_TAG, "other", "", "hashCode", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class y implements kotlin.reflect.o {
    public static final a Companion = new a(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.d f24950a;
    private final List<kotlin.reflect.p> b;
    private final kotlin.reflect.o c;
    private final int d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final String a(Class<?> cls) {
        return q.a(cls, boolean[].class) ? "kotlin.BooleanArray" : q.a(cls, char[].class) ? "kotlin.CharArray" : q.a(cls, byte[].class) ? "kotlin.ByteArray" : q.a(cls, short[].class) ? "kotlin.ShortArray" : q.a(cls, int[].class) ? "kotlin.IntArray" : q.a(cls, float[].class) ? "kotlin.FloatArray" : q.a(cls, long[].class) ? "kotlin.LongArray" : q.a(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(kotlin.reflect.p pVar) {
        String valueOf;
        StringBuilder sb;
        String str;
        if (pVar.a() == null) {
            return "*";
        }
        kotlin.reflect.o b = pVar.b();
        y yVar = b instanceof y ? (y) b : null;
        if (yVar == null || (valueOf = yVar.a(true)) == null) {
            valueOf = String.valueOf(pVar.b());
        }
        int i = z.$EnumSwitchMapping$0[pVar.a().ordinal()];
        if (i == 1) {
            return valueOf;
        }
        if (i == 2) {
            sb = new StringBuilder();
            str = "in ";
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            sb = new StringBuilder();
            str = "out ";
        }
        sb.append(str);
        sb.append(valueOf);
        return sb.toString();
    }

    private final String a(boolean z) {
        String name;
        kotlin.reflect.d a2 = a();
        Class<?> cls = null;
        kotlin.reflect.c cVar = a2 instanceof kotlin.reflect.c ? (kotlin.reflect.c) a2 : null;
        if (cVar != null) {
            cls = kotlin.jvm.a.a(cVar);
        }
        if (cls == null) {
            name = a().toString();
        } else if ((this.d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            name = a(cls);
        } else if (!z || !cls.isPrimitive()) {
            name = cls.getName();
        } else {
            kotlin.reflect.d a3 = a();
            q.e(a3, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = kotlin.jvm.a.b((kotlin.reflect.c) a3).getName();
        }
        String str = "";
        String a4 = b().isEmpty() ? str : kotlin.collections.p.a(b(), ", ", "<", ">", 0, null, new TypeReference$asString$args$1(this), 24, null);
        if (c()) {
            str = "?";
        }
        String str2 = name + a4 + str;
        kotlin.reflect.o oVar = this.c;
        if (oVar instanceof y) {
            String a5 = ((y) oVar).a(true);
            if (q.a((Object) a5, (Object) str2)) {
                return str2;
            }
            if (q.a((Object) a5, (Object) (str2 + riy.CONDITION_IF))) {
                return str2 + '!';
            }
            return '(' + str2 + ".." + a5 + ')';
        }
        return str2;
    }

    public kotlin.reflect.d a() {
        return this.f24950a;
    }

    public List<kotlin.reflect.p> b() {
        return this.b;
    }

    public boolean c() {
        return (this.d & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return q.a(a(), yVar.a()) && q.a(b(), yVar.b()) && q.a(this.c, yVar.c) && this.d == yVar.d;
        }
        return false;
    }

    @Override // kotlin.reflect.a
    public List<Annotation> getAnnotations() {
        return kotlin.collections.p.a();
    }

    public int hashCode() {
        int hashCode;
        hashCode = Integer.valueOf(this.d).hashCode();
        return (((a().hashCode() * 31) + b().hashCode()) * 31) + hashCode;
    }

    public String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
