package com.taobao.themis.canvas.extension.instance;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.ui.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.xph;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/taobao/themis/canvas/extension/instance/TMSGameForceUpdateExtension$1$onUpdate$1$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSGameForceUpdateExtension$1$onUpdate$$inlined$runCatching$lambda$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AppModel $appInfo$inlined;
    public final /* synthetic */ xph.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameForceUpdateExtension$1$onUpdate$$inlined$runCatching$lambda$1(xph.AnonymousClass1 anonymousClass1, AppModel appModel) {
        super(0);
        this.this$0 = anonymousClass1;
        this.$appInfo$inlined = appModel;
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
        a a2 = xph.a(xph.this);
        q.a(a2);
        Activity o = xph.this.a().o();
        q.b(o, "instance.activity");
        Window window = o.getWindow();
        q.b(window, "instance.activity.window");
        View decorView = window.getDecorView();
        q.b(decorView, "instance.activity.window.decorView");
        a2.a(decorView);
    }
}
