package com.etao.feimagesearch.newresult.widget.titlebar;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.newresult.widget.titlebar.c;
import com.etao.feimagesearch.result.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class Irp2024TitleBarWidget$onCreateView$2 extends Lambda implements ruw<d, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Irp2024TitleBarWidget$onCreateView$2(i iVar) {
        super(2);
        this.this$0 = iVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(d dVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, dVar, num});
        }
        invoke(dVar, num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(d bean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b7b1c2", new Object[]{this, bean, new Integer(i)});
            return;
        }
        q.c(bean, "bean");
        if (bean.a()) {
            b.a a2 = this.this$0.m().a(bean.c);
            if (a2 == null) {
                return;
            }
            b.a().a((FragmentActivity) this.this$0.g(), a2);
            return;
        }
        c.a eG_ = this.this$0.eG_();
        if (eG_ != null) {
            eG_.a(bean);
        }
        i.a(this.this$0, bean.b);
    }
}
