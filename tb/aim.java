package tb;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
abstract class aim<V, O> implements ail<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<akm<V>> f25352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aim(List<akm<V>> list) {
        this.f25352a = list;
    }

    @Override // tb.ail
    public boolean b() {
        return this.f25352a.isEmpty() || (this.f25352a.size() == 1 && this.f25352a.get(0).e());
    }

    @Override // tb.ail
    public List<akm<V>> c() {
        return this.f25352a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f25352a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f25352a.toArray()));
        }
        return sb.toString();
    }
}
