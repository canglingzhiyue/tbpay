package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PackageManager$starLoadAppPackage$finishCall$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $alreadyFailed;
    public final /* synthetic */ ruk $checkCountFunction;
    public final /* synthetic */ Ref.IntRef $finishCount;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageManager$starLoadAppPackage$finishCall$1(a aVar, Ref.BooleanRef booleanRef, Ref.IntRef intRef, ruk rukVar) {
        super(0);
        this.this$0 = aVar;
        this.$alreadyFailed = booleanRef;
        this.$finishCount = intRef;
        this.$checkCountFunction = rukVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        synchronized (this.this$0) {
            if (!this.$alreadyFailed.element) {
                this.$finishCount.element++;
                this.$checkCountFunction.mo2427invoke();
            }
            t tVar = t.INSTANCE;
        }
    }
}
