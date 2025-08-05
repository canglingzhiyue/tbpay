package com.alibaba.alibity.container.ssr;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.alibity.container.ssr.FirstChunkCacheAbility;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$setFirstChunkCache$1$1$1$1", "com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$setFirstChunkCache$1$1$$special$$inlined$runCatching$lambda$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $success;
    public final /* synthetic */ FirstChunkCacheAbility.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1$1(boolean z, FirstChunkCacheAbility.b bVar) {
        super(0);
        this.$success = z;
        this.this$0 = bVar;
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
        try {
            Result.a aVar = Result.Companion;
            if (this.$success) {
                this.this$0.d.a(new FinishResult(null, null, 3, null));
            } else {
                this.this$0.d.a(new ErrorResult("500", "内部未知错误", (Map) null, 4, (o) null));
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }
}
