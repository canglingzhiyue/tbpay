package kotlin.jvm.internal;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import tb.rul;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeReference$asString$args$1 extends Lambda implements rul<kotlin.reflect.p, CharSequence> {
    final /* synthetic */ y this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(y yVar) {
        super(1);
        this.this$0 = yVar;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence mo2421invoke(kotlin.reflect.p it) {
        String a2;
        q.d(it, "it");
        a2 = this.this$0.a(it);
        return a2;
    }
}
