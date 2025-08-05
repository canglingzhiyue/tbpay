package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class LVBridgeEngine$Companion$sExecutors$2$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ThreadPoolExecutor $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LVBridgeEngine$Companion$sExecutors$2$1$1(ThreadPoolExecutor threadPoolExecutor) {
        super(0);
        this.$this_apply = threadPoolExecutor;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final t mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("a0e370c0", new Object[]{this});
        }
        ThreadPoolExecutor threadPoolExecutor = this.$this_apply;
        if (!(threadPoolExecutor instanceof ThreadPoolExecutor)) {
            threadPoolExecutor = null;
        }
        if (threadPoolExecutor == null) {
            return null;
        }
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return t.INSTANCE;
    }
}
