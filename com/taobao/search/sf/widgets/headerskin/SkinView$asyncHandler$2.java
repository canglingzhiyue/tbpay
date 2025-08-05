package com.taobao.search.sf.widgets.headerskin;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes8.dex */
public final class SkinView$asyncHandler$2 extends Lambda implements ruk<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkinView$asyncHandler$2(d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Handler mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this});
        }
        d dVar = this.this$0;
        d.$ipChange.start();
        d dVar2 = this.this$0;
        HandlerThread thread = d.$ipChange;
        q.a((Object) thread, "thread");
        return new Handler(thread.getLooper());
    }
}
