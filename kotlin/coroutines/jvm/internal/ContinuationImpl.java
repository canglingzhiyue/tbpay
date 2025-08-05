package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final kotlin.coroutines.c _context;
    private transient kotlin.coroutines.a<Object> intercepted;

    public ContinuationImpl(kotlin.coroutines.a<Object> aVar) {
        this(aVar, aVar != null ? aVar.getContext() : null);
    }

    public ContinuationImpl(kotlin.coroutines.a<Object> aVar, kotlin.coroutines.c cVar) {
        super(aVar);
        this._context = cVar;
    }

    @Override // kotlin.coroutines.a
    public kotlin.coroutines.c getContext() {
        kotlin.coroutines.c cVar = this._context;
        q.a(cVar);
        return cVar;
    }

    public final kotlin.coroutines.a<Object> intercepted() {
        ContinuationImpl continuationImpl = this.intercepted;
        if (continuationImpl == null) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) getContext().get(kotlin.coroutines.b.Key);
            if (bVar == null || (continuationImpl = bVar.a(this)) == null) {
                continuationImpl = this;
            }
            this.intercepted = continuationImpl;
        }
        return continuationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
        kotlin.coroutines.a<Object> aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            q.a(getContext().get(kotlin.coroutines.b.Key));
        }
        this.intercepted = b.INSTANCE;
    }
}
