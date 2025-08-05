package kotlin.collections;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.rul;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", AdvanceSetting.NETWORK_TYPE, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class AbstractMap$toString$1 extends Lambda implements rul<Map.Entry<? extends K, ? extends V>, CharSequence> {
    final /* synthetic */ e<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMap$toString$1(e<K, ? extends V> eVar) {
        super(1);
        this.this$0 = eVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public final CharSequence mo2421invoke(Map.Entry<? extends K, ? extends V> it) {
        String b;
        kotlin.jvm.internal.q.d(it, "it");
        b = this.this$0.b(it);
        return b;
    }
}
