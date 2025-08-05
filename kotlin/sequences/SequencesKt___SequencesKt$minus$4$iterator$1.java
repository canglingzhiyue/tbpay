package kotlin.sequences;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.rul;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", AdvanceSetting.NETWORK_TYPE, "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements rul<T, Boolean> {
    final /* synthetic */ List<T> $other;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$minus$4$iterator$1(List<? extends T> list) {
        super(1);
        this.$other = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.rul
    /* renamed from: invoke */
    public final Boolean mo2421invoke(T t) {
        return Boolean.valueOf(this.$other.contains(t));
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Boolean mo2421invoke(Object obj) {
        return mo2421invoke((SequencesKt___SequencesKt$minus$4$iterator$1) obj);
    }
}
