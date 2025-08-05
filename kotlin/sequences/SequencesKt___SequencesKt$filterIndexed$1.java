package kotlin.sequences;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.collections.ad;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", AdvanceSetting.NETWORK_TYPE, "Lkotlin/collections/IndexedValue;", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements rul<ad<? extends T>, Boolean> {
    final /* synthetic */ ruw<Integer, T, Boolean> $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$filterIndexed$1(ruw<? super Integer, ? super T, Boolean> ruwVar) {
        super(1);
        this.$predicate = ruwVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public final Boolean mo2421invoke(ad<? extends T> it) {
        q.d(it, "it");
        return this.$predicate.mo2423invoke(Integer.valueOf(it.a()), it.b());
    }
}
