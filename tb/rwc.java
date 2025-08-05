package tb;

import kotlin.Metadata;
import kotlin.collections.af;
import kotlin.internal.c;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", com.taobao.android.weex_framework.util.a.ATOM_EXT_last, "getLast", "getStep", eau.PARSER_TAG, "", "other", "", "hashCode", "", "isEmpty", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class rwc implements Iterable<Long>, rvh {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f33396a;
    private final long b;
    private final long c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public rwc(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            }
            this.f33396a = j;
            this.b = c.a(j, j2, j3);
            this.c = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long a() {
        return this.f33396a;
    }

    public final long b() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: c */
    public af iterator() {
        return new rwd(this.f33396a, this.b, this.c);
    }

    public boolean d() {
        return this.c > 0 ? this.f33396a > this.b : this.f33396a < this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof rwc) {
            if (d() && ((rwc) obj).d()) {
                return true;
            }
            rwc rwcVar = (rwc) obj;
            return this.f33396a == rwcVar.f33396a && this.b == rwcVar.b && this.c == rwcVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f33396a;
        long j3 = this.b;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.f33396a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            j = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33396a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            j = -this.c;
        }
        sb.append(j);
        return sb.toString();
    }
}
