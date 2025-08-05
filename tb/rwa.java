package tb;

import com.taobao.android.weex_framework.util.a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ae;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", a.ATOM_EXT_last, "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class rwa extends ae {

    /* renamed from: a  reason: collision with root package name */
    private final int f33394a;
    private boolean b;
    private int c;
    private final int d;

    public rwa(int i, int i2, int i3) {
        this.d = i3;
        this.f33394a = i2;
        boolean z = true;
        if (this.d <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.b = z;
        this.c = !this.b ? this.f33394a : i;
    }

    @Override // kotlin.collections.ae
    public int b() {
        int i = this.c;
        if (i != this.f33394a) {
            this.c = this.d + i;
        } else if (!this.b) {
            throw new NoSuchElementException();
        } else {
            this.b = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }
}
