package com.taobao.themis.canvas.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.f;
import com.taobao.themis.canvas.extension.page.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class GameQkingJSRuntimeExtension$connectDebugServer$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b.C0927b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameQkingJSRuntimeExtension$connectDebugServer$1$1(b.C0927b c0927b) {
        super(0);
        this.this$0 = c0927b;
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
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (this.this$0.b.length() > 0) {
            z = true;
        }
        if (!z) {
            return;
        }
        b bVar = b.this;
        if (b.$ipChange != null) {
            return;
        }
        b.a(b.this, new f(this.this$0.c, this.this$0.b, "GM"));
        b bVar2 = b.this;
        f fVar = b.$ipChange;
        q.a(fVar);
        com.taobao.android.riverlogger.inspector.a.a(fVar, "Qking");
    }
}
