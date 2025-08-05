package tb;

import com.taobao.android.weex_framework.util.a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", a.ATOM_EXT_last, "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class rvv extends o {

    /* renamed from: a  reason: collision with root package name */
    private final int f33389a;
    private boolean b;
    private int c;
    private final int d;

    public rvv(char c, char c2, int i) {
        this.d = i;
        this.f33389a = c2;
        boolean z = true;
        if (this.d <= 0 ? q.a((int) c, (int) c2) < 0 : q.a((int) c, (int) c2) > 0) {
            z = false;
        }
        this.b = z;
        this.c = !this.b ? this.f33389a : c;
    }

    @Override // kotlin.collections.o
    public char b() {
        int i = this.c;
        if (i != this.f33389a) {
            this.c = this.d + i;
        } else if (!this.b) {
            throw new NoSuchElementException();
        } else {
            this.b = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }
}
