package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001b\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseContinuationImpl implements Serializable, kotlin.coroutines.a<Object>, c {
    private final kotlin.coroutines.a<Object> completion;

    public BaseContinuationImpl(kotlin.coroutines.a<Object> aVar) {
        this.completion = aVar;
    }

    public kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> completion) {
        q.d(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public kotlin.coroutines.a<t> create(kotlin.coroutines.a<?> completion) {
        q.d(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public c getCallerFrame() {
        kotlin.coroutines.a<Object> aVar = this.completion;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    public final kotlin.coroutines.a<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return d.a(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.a<java.lang.Object>, java.lang.Object, kotlin.coroutines.a] */
    @Override // kotlin.coroutines.a
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object obj2 = obj;
        BaseContinuationImpl baseContinuationImpl = this;
        while (true) {
            e.a(baseContinuationImpl);
            BaseContinuationImpl baseContinuationImpl2 = baseContinuationImpl;
            ?? r1 = baseContinuationImpl2.completion;
            q.a((Object) r1);
            try {
                invokeSuspend = baseContinuationImpl2.invokeSuspend(obj2);
            } catch (Throwable th) {
                Result.a aVar = Result.Companion;
                obj2 = Result.m2371constructorimpl(i.a(th));
            }
            if (invokeSuspend == kotlin.coroutines.intrinsics.a.a()) {
                return;
            }
            Result.a aVar2 = Result.Companion;
            obj2 = Result.m2371constructorimpl(invokeSuspend);
            baseContinuationImpl2.releaseIntercepted();
            if (!(r1 instanceof BaseContinuationImpl)) {
                r1.resumeWith(obj2);
                return;
            }
            baseContinuationImpl = r1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
