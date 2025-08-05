package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public class FunctionReference extends CallableReference implements p, kotlin.reflect.f {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.b computeReflected() {
        return t.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && q.a(getBoundReceiver(), functionReference.getBoundReceiver()) && q.a(getOwner(), functionReference.getOwner());
        } else if (!(obj instanceof kotlin.reflect.f)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // kotlin.jvm.internal.p
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    /* renamed from: getReflected  reason: collision with other method in class */
    public kotlin.reflect.f mo2411getReflected() {
        return (kotlin.reflect.f) super.mo2411getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.f
    public boolean isExternal() {
        return mo2411getReflected().isExternal();
    }

    @Override // kotlin.reflect.f
    public boolean isInfix() {
        return mo2411getReflected().isInfix();
    }

    @Override // kotlin.reflect.f
    public boolean isInline() {
        return mo2411getReflected().isInline();
    }

    @Override // kotlin.reflect.f
    public boolean isOperator() {
        return mo2411getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.b
    public boolean isSuspend() {
        return mo2411getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
