package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "next"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements ruw<f<? super R>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ e<T> $this_zipWithNext;
    final /* synthetic */ ruw<T, T, R> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$zipWithNext$2(e<? extends T> eVar, ruw<? super T, ? super T, ? extends R> ruwVar, kotlin.coroutines.a<? super SequencesKt___SequencesKt$zipWithNext$2> aVar) {
        super(2, aVar);
        this.$this_zipWithNext = eVar;
        this.$transform = ruwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, aVar);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super R> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2;
        Object obj2;
        Object obj3;
        Iterator it;
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        int i = this.label;
        if (i == 0) {
            kotlin.i.a(obj);
            f fVar2 = (f) this.L$0;
            Iterator a3 = this.$this_zipWithNext.a();
            if (!a3.hasNext()) {
                return t.INSTANCE;
            }
            Object next = a3.next();
            fVar = fVar2;
            sequencesKt___SequencesKt$zipWithNext$2 = this;
            obj2 = a2;
            obj3 = next;
            it = a3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            Object obj4 = this.L$2;
            it = (Iterator) this.L$1;
            fVar = (f) this.L$0;
            kotlin.i.a(obj);
            sequencesKt___SequencesKt$zipWithNext$2 = this;
            obj2 = a2;
            obj3 = obj4;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            sequencesKt___SequencesKt$zipWithNext$2.L$0 = fVar;
            sequencesKt___SequencesKt$zipWithNext$2.L$1 = it;
            sequencesKt___SequencesKt$zipWithNext$2.L$2 = next2;
            sequencesKt___SequencesKt$zipWithNext$2.label = 1;
            if (fVar.a((f) sequencesKt___SequencesKt$zipWithNext$2.$transform.mo2423invoke(obj3, next2), (kotlin.coroutines.a<? super t>) sequencesKt___SequencesKt$zipWithNext$2) == obj2) {
                return obj2;
            }
            obj3 = next2;
        }
        return t.INSTANCE;
    }
}
