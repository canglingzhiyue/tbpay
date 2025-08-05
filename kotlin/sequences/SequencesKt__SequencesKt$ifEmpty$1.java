package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.ruk;
import tb.ruw;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements ruw<f<? super T>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ ruk<e<T>> $defaultValue;
    final /* synthetic */ e<T> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$ifEmpty$1(e<? extends T> eVar, ruk<? extends e<? extends T>> rukVar, kotlin.coroutines.a<? super SequencesKt__SequencesKt$ifEmpty$1> aVar) {
        super(2, aVar);
        this.$this_ifEmpty = eVar;
        this.$defaultValue = rukVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, aVar);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super T> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        int i = this.label;
        if (i == 0) {
            kotlin.i.a(obj);
            f fVar = (f) this.L$0;
            Iterator a3 = this.$this_ifEmpty.a();
            if (a3.hasNext()) {
                this.label = 1;
                if (fVar.a(a3, (kotlin.coroutines.a<? super t>) this) == a2) {
                    return a2;
                }
            } else {
                this.label = 2;
                if (fVar.a((e) this.$defaultValue.mo2427invoke(), (kotlin.coroutines.a<? super t>) this) == a2) {
                    return a2;
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            kotlin.i.a(obj);
        }
        return t.INSTANCE;
    }
}
