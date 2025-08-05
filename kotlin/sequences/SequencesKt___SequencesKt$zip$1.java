package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.pqe;
import tb.ruw;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "R", pqe.STAGE_T1, pqe.STAGE_T2, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$zip$1 extends Lambda implements ruw<T, R, Pair<? extends T, ? extends R>> {
    public static final SequencesKt___SequencesKt$zip$1 INSTANCE = new SequencesKt___SequencesKt$zip$1();

    SequencesKt___SequencesKt$zip$1() {
        super(2);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2423invoke(Object obj, Object obj2) {
        return mo2423invoke((SequencesKt___SequencesKt$zip$1) obj, obj2);
    }

    @Override // tb.ruw
    /* renamed from: invoke  reason: collision with other method in class */
    public final Pair<T, R> mo2423invoke(T t, R r) {
        return kotlin.j.a(t, r);
    }
}
