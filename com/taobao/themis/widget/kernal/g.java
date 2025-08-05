package com.taobao.themis.widget.kernal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import com.taobao.themis.open.extension.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetFrameworkExtension;", "Lcom/taobao/themis/open/extension/IFrameworkExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "getFrameworkId", "", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g implements com.taobao.themis.open.extension.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.themis.kernel.f f22944a;

    static {
        kge.a(1948934846);
        kge.a(-625013045);
    }

    @Override // com.taobao.themis.open.extension.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : i.WIDGET_FRAMEWORK_ID;
    }

    public g(com.taobao.themis.kernel.f instance) {
        q.d(instance, "instance");
        this.f22944a = instance;
    }

    @Override // tb.sud
    public void a(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        a.C0959a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            a.C0959a.b(this);
        }
    }
}
