package kotlin.collections;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.rul;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", AdvanceSetting.NETWORK_TYPE, "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class AbstractCollection$toString$1 extends Lambda implements rul<E, CharSequence> {
    final /* synthetic */ a<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractCollection$toString$1(a<? extends E> aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.rul
    /* renamed from: invoke */
    public final CharSequence mo2421invoke(E e) {
        return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ CharSequence mo2421invoke(Object obj) {
        return mo2421invoke((AbstractCollection$toString$1) obj);
    }
}
