package kotlin.sequences;

import com.alipay.mobile.verifyidentity.common.Constants;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rvh;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", Constants.VI_ENGINE_FAST_MODULENAME, "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", com.taobao.android.weex_framework.util.a.ATOM_yield, "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class o<T> extends f<T> implements Iterator<T>, kotlin.coroutines.a<t>, rvh {

    /* renamed from: a  reason: collision with root package name */
    private int f24980a;
    private T b;
    private Iterator<? extends T> c;
    private kotlin.coroutines.a<? super t> d;

    private final T a() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable b() {
        Throwable noSuchElementException;
        int i = this.f24980a;
        if (i == 4) {
            noSuchElementException = new NoSuchElementException();
        } else if (i != 5) {
            noSuchElementException = new IllegalStateException("Unexpected state of the iterator: " + this.f24980a);
        } else {
            noSuchElementException = new IllegalStateException("Iterator has failed.");
        }
        return noSuchElementException;
    }

    @Override // kotlin.sequences.f
    public Object a(T t, kotlin.coroutines.a<? super t> aVar) {
        this.b = t;
        this.f24980a = 3;
        this.d = aVar;
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        if (a2 == kotlin.coroutines.intrinsics.a.a()) {
            kotlin.coroutines.jvm.internal.e.c(aVar);
        }
        return a2 == kotlin.coroutines.intrinsics.a.a() ? a2 : t.INSTANCE;
    }

    @Override // kotlin.sequences.f
    public Object a(Iterator<? extends T> it, kotlin.coroutines.a<? super t> aVar) {
        if (!it.hasNext()) {
            return t.INSTANCE;
        }
        this.c = it;
        this.f24980a = 2;
        this.d = aVar;
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        if (a2 == kotlin.coroutines.intrinsics.a.a()) {
            kotlin.coroutines.jvm.internal.e.c(aVar);
        }
        return a2 == kotlin.coroutines.intrinsics.a.a() ? a2 : t.INSTANCE;
    }

    public final void a(kotlin.coroutines.a<? super t> aVar) {
        this.d = aVar;
    }

    @Override // kotlin.coroutines.a
    public kotlin.coroutines.c getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f24980a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i != 4) {
                        throw b();
                    }
                    return false;
                }
                Iterator<? extends T> it = this.c;
                q.a(it);
                if (it.hasNext()) {
                    this.f24980a = 2;
                    return true;
                }
                this.c = null;
            }
            this.f24980a = 5;
            kotlin.coroutines.a<? super t> aVar = this.d;
            q.a(aVar);
            this.d = null;
            Result.a aVar2 = Result.Companion;
            aVar.resumeWith(Result.m2371constructorimpl(t.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f24980a;
        if (i == 0 || i == 1) {
            return a();
        }
        if (i == 2) {
            this.f24980a = 1;
            Iterator<? extends T> it = this.c;
            q.a(it);
            return it.next();
        } else if (i != 3) {
            throw b();
        } else {
            this.f24980a = 0;
            T t = this.b;
            this.b = null;
            return t;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.a
    public void resumeWith(Object obj) {
        kotlin.i.a(obj);
        this.f24980a = 4;
    }
}
