package kotlin.collections;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.rue;
import tb.rul;

/* JADX WARN: Incorrect field signature: TK; */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "K", "", AdvanceSetting.NETWORK_TYPE, "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: classes9.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements rul<T, Integer> {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ rul<T, K> $selector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ltb/rul<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(rul rulVar, Comparable comparable) {
        super(1);
        this.$selector = rulVar;
        this.$key = comparable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.rul
    /* renamed from: invoke */
    public final Integer mo2421invoke(T t) {
        return Integer.valueOf(rue.a((Comparable) this.$selector.mo2421invoke(t), this.$key));
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Integer mo2421invoke(Object obj) {
        return mo2421invoke((CollectionsKt__CollectionsKt$binarySearchBy$1) obj);
    }
}
