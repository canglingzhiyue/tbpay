package kotlin.jvm.internal;

/* loaded from: classes9.dex */
public abstract class PropertyReference extends CallableReference implements kotlin.reflect.k {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && q.a(getBoundReceiver(), propertyReference.getBoundReceiver());
        } else if (!(obj instanceof kotlin.reflect.k)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    /* renamed from: getReflected  reason: collision with other method in class */
    public kotlin.reflect.k mo2411getReflected() {
        if (!this.syntheticJavaProperty) {
            return (kotlin.reflect.k) super.mo2411getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.k
    public boolean isConst() {
        return mo2411getReflected().isConst();
    }

    @Override // kotlin.reflect.k
    public boolean isLateinit() {
        return mo2411getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
