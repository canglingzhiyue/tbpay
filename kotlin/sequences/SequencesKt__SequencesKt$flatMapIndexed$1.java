package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.rul;
import tb.ruw;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {350}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
/* loaded from: classes9.dex */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements ruw<f<? super R>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ rul<C, Iterator<R>> $iterator;
    final /* synthetic */ e<T> $source;
    final /* synthetic */ ruw<Integer, T, C> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$flatMapIndexed$1(e<? extends T> eVar, ruw<? super Integer, ? super T, ? extends C> ruwVar, rul<? super C, ? extends Iterator<? extends R>> rulVar, kotlin.coroutines.a<? super SequencesKt__SequencesKt$flatMapIndexed$1> aVar) {
        super(2, aVar);
        this.$source = eVar;
        this.$transform = ruwVar;
        this.$iterator = rulVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, aVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super R> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator a2;
        f fVar;
        Object a3 = kotlin.coroutines.intrinsics.a.a();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.i.a(obj);
            i = 0;
            a2 = this.$source.a();
            fVar = (f) this.L$0;
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            a2 = (Iterator) this.L$1;
            fVar = (f) this.L$0;
            kotlin.i.a(obj);
        }
        while (a2.hasNext()) {
            Object next = a2.next();
            ruw<Integer, T, C> ruwVar = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                p.b();
            }
            Object mo2423invoke = ruwVar.mo2423invoke(kotlin.coroutines.jvm.internal.a.a(i), next);
            this.L$0 = fVar;
            this.L$1 = a2;
            this.I$0 = i3;
            this.label = 1;
            if (fVar.a((Iterator) this.$iterator.mo2421invoke(mo2423invoke), (kotlin.coroutines.a<? super t>) this) == a3) {
                return a3;
            }
            i = i3;
        }
        return t.INSTANCE;
    }
}
