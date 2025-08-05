package tb;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26844a;
    private Object b;
    private Long c;
    private Animator d;

    static {
        kge.a(-2049838834);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof dly) {
                dly dlyVar = (dly) obj;
                if (!q.a((Object) this.f26844a, (Object) dlyVar.f26844a) || !q.a(this.b, dlyVar.b) || !q.a(this.c, dlyVar.c) || !q.a(this.d, dlyVar.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f26844a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Animator animator = this.d;
        if (animator != null) {
            i = animator.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AnimatorWrapper(propertyName=" + this.f26844a + ", animateValues=" + this.b + ", duration=" + this.c + ", originAnimator=" + this.d + riy.BRACKET_END_STR;
    }

    public dly(String str, Object obj, Long l, Animator animator) {
        this.f26844a = str;
        this.b = obj;
        this.c = l;
        this.d = animator;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26844a;
    }

    public final Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    public final Long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("98f9dc6b", new Object[]{this}) : this.c;
    }
}
