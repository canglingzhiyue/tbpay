package kotlin.text;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.k;
import tb.rul;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", AdvanceSetting.NETWORK_TYPE, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements rul<Integer, g> {
    final /* synthetic */ k.a this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatcherMatchResult$groups$1$iterator$1(k.a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ g mo2421invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final g invoke(int i) {
        return this.this$0.a(i);
    }
}
