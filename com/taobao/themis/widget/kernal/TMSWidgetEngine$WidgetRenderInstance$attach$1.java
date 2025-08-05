package com.taobao.themis.widget.kernal;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.widget.kernal.b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.juh;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWidgetEngine$WidgetRenderInstance$attach$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetEngine$WidgetRenderInstance$attach$1(b.c cVar) {
        super(0);
        this.this$0 = cVar;
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
        WeexInstance weexInstance;
        juh juhVar;
        com.taobao.android.weex_framework.ui.h e;
        WeexInstance weexInstance2;
        juh juhVar2;
        com.taobao.android.weex_framework.ui.h e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        b.c cVar = this.this$0;
        if (!b.c.$ipChange) {
            return;
        }
        b.c cVar2 = this.this$0;
        if (!b.c.$ipChange) {
            return;
        }
        b.c.c(this.this$0, false);
        b.c cVar3 = this.this$0;
        if (b.c.$ipChange == WeexUnicornConfig.RenderMode.texture) {
            b.c cVar4 = this.this$0;
            if (b.c.$ipChange == null) {
                return;
            }
            b.c cVar5 = this.this$0;
            if (b.c.$ipChange == null) {
                return;
            }
            b.c cVar6 = this.this$0;
            ViewGroup viewGroup = b.c.$ipChange;
            q.a(viewGroup);
            if (viewGroup.getChildCount() > 0) {
                b.c cVar7 = this.this$0;
                ViewGroup viewGroup2 = b.c.$ipChange;
                q.a(viewGroup2);
                viewGroup2.removeAllViews();
            }
            TMSLogger.b(b.TAG, "onAttach! add View");
            b.c cVar8 = this.this$0;
            ViewGroup viewGroup3 = b.c.$ipChange;
            q.a(viewGroup3);
            b.c cVar9 = this.this$0;
            viewGroup3.addView(b.c.$ipChange);
        } else {
            try {
                WeakReference h = b.c.h(this.this$0);
                if (h != null && (weexInstance = (WeexInstance) h.get()) != null && (juhVar = (juh) weexInstance.getExtend(juh.class)) != null && (e = juhVar.e()) != null) {
                    e.o();
                }
                TMSLogger.b(b.TAG, "onAttach! recover surface");
            } catch (Throwable th) {
                TMSLogger.a(b.TAG, th);
            }
        }
        try {
            Result.a aVar = Result.Companion;
            WeakReference h2 = b.c.h(this.this$0);
            if (h2 != null && (weexInstance2 = (WeexInstance) h2.get()) != null && (juhVar2 = (juh) weexInstance2.getExtend(juh.class)) != null && (e2 = juhVar2.e()) != null) {
                e2.n();
            }
            TMSLogger.b(b.TAG, "onAttach! recover images");
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th2));
        }
    }
}
