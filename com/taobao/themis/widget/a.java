package com.taobao.themis.widget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.widget.e;
import com.taobao.themis.widget.kernal.a;
import com.taobao.themis.widget.kernal.b;
import com.taobao.weex.ui.flat.widget.Widget;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqn;
import tb.qqo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0011H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020\u0011H\u0016J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetRender;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "Lcom/taobao/themis/widget/kernal/IWidgetPageExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "curEngine", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "renderInstance", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance;", "renderListener", "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "rootView", "Lcom/taobao/themis/widget/WidgetRootView;", "destroy", "", "execJSToRender", "script", "", "name", "", com.taobao.android.weex_framework.adapter.e.RECORD_FIREEVENT, "event", "params", "Lcom/alibaba/fastjson/JSON;", "fireEventOld", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getMonitorData", "callback", "Lcom/taobao/themis/widget/IWidgetControllerExtension$DataCallback;", "getRenderType", "getView", "Landroid/view/View;", "needReloadForNativePlugins", "", "onPause", "onRenderError", "errorCode", "errorMsg", "onResume", "onViewAppear", "onViewDisappear", "render", DataReceiveMonitor.CB_LISTENER, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends qqn implements com.taobao.themis.widget.kernal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WidgetRootView c;
    private b.c d;
    private com.taobao.themis.widget.kernal.b e;
    private qqo f;
    private final ITMSPage g;

    static {
        kge.a(2075251679);
        kge.a(1352955228);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 108538619:
                super.t();
                return null;
            case 109462140:
                super.u();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qqq
    public void a(String script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public void a(byte[] script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : Widget.TAG;
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a.C0984a.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        a.C0984a.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            a.C0984a.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ITMSPage page) {
        super(page);
        q.d(page, "page");
        this.g = page;
        Activity o = this.f33035a.o();
        q.b(o, "mInstance.activity");
        this.c = new WidgetRootView(o, this.f33035a);
        this.g.a(this);
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(event, json);
    }

    @Override // tb.qqn, tb.qqq
    public void b(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(event, json);
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        com.taobao.themis.widget.kernal.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b.c cVar = this.d;
        if (cVar != null && (bVar = this.e) != null) {
            bVar.a(cVar);
        }
        com.taobao.themis.widget.kernal.c.INSTANCE.b();
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (k() == false) goto L32;
     */
    @Override // tb.qqn, tb.qqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.qqo r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.widget.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "fbd46229"
            r0.ipc$dispatch(r8, r1)
            return
        L15:
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.q.d(r8, r0)
            super.a(r8)
            r7.f = r8
            com.taobao.themis.widget.kernal.c r0 = com.taobao.themis.widget.kernal.c.INSTANCE
            com.taobao.themis.widget.kernal.b r0 = r0.a()
            r7.e = r0
            com.taobao.themis.kernel.f r0 = r7.f33035a
            com.taobao.themis.kernel.entity.InstanceStartParams r0 = r0.q()
            java.lang.String r0 = r0.getStartUrl()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "debugServerUrl"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r4 = "jsfm"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.String r5 = "apifm"
            java.lang.String r5 = r0.getQueryParameter(r5)
            java.lang.String r6 = "apifmext"
            java.lang.String r0 = r0.getQueryParameter(r6)
            r6 = r1
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L5d
            boolean r6 = kotlin.text.n.a(r6)
            if (r6 == 0) goto L5b
            goto L5d
        L5b:
            r6 = 0
            goto L5e
        L5d:
            r6 = 1
        L5e:
            if (r6 == 0) goto L97
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L6e
            boolean r6 = kotlin.text.n.a(r6)
            if (r6 == 0) goto L6c
            goto L6e
        L6c:
            r6 = 0
            goto L6f
        L6e:
            r6 = 1
        L6f:
            if (r6 == 0) goto L97
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L7f
            boolean r6 = kotlin.text.n.a(r6)
            if (r6 == 0) goto L7d
            goto L7f
        L7d:
            r6 = 0
            goto L80
        L7f:
            r6 = 1
        L80:
            if (r6 == 0) goto L97
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L8f
            boolean r6 = kotlin.text.n.a(r6)
            if (r6 == 0) goto L8e
            goto L8f
        L8e:
            r2 = 0
        L8f:
            if (r2 == 0) goto L97
            boolean r2 = r7.k()
            if (r2 == 0) goto L9f
        L97:
            com.taobao.themis.widget.kernal.b r2 = r7.e
            kotlin.jvm.internal.q.a(r2)
            r2.a(r4, r5, r0, r1)
        L9f:
            com.taobao.themis.widget.kernal.b r0 = r7.e
            kotlin.jvm.internal.q.a(r0)
            com.taobao.themis.kernel.f r1 = r7.f33035a
            android.app.Activity r1 = r1.o()
            java.lang.String r2 = "mInstance.activity"
            kotlin.jvm.internal.q.b(r1, r2)
            com.taobao.themis.kernel.f r2 = r7.f33035a
            com.taobao.themis.kernel.page.ITMSPage r3 = r7.g
            com.taobao.themis.widget.kernal.b$c r8 = r0.a(r1, r2, r3, r8)
            r7.d = r8
            com.taobao.themis.widget.kernal.b$c r8 = r7.d
            kotlin.jvm.internal.q.a(r8)
            com.taobao.themis.widget.WidgetRootView r0 = r7.c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.widget.a.a(tb.qqo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0.a() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean k() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.widget.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "5f95776"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            com.taobao.themis.widget.kernal.b r0 = r4.e
            if (r0 != 0) goto L1e
            return r3
        L1e:
            com.taobao.themis.kernel.f r0 = r4.f33035a
            boolean r0 = com.taobao.themis.kernel.utils.o.j(r0)
            if (r0 == 0) goto L31
            com.taobao.themis.widget.kernal.b r0 = r4.e
            kotlin.jvm.internal.q.a(r0)
            boolean r0 = r0.a()
            if (r0 == 0) goto L44
        L31:
            com.taobao.themis.kernel.f r0 = r4.f33035a
            boolean r0 = com.taobao.themis.kernel.utils.o.k(r0)
            if (r0 == 0) goto L45
            com.taobao.themis.widget.kernal.b r0 = r4.e
            kotlin.jvm.internal.q.a(r0)
            boolean r0 = r0.b()
            if (r0 != 0) goto L45
        L44:
            return r3
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.widget.a.k():boolean");
    }

    @Override // tb.qqn, tb.qqq
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    @Override // tb.qqn, tb.qqq
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(true);
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        b.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    @Override // com.taobao.themis.widget.kernal.a
    public void b(String errorCode, String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, errorCode, errorMsg});
            return;
        }
        q.d(errorCode, "errorCode");
        q.d(errorMsg, "errorMsg");
        qqo qqoVar = this.f;
        if (qqoVar == null) {
            return;
        }
        qqoVar.a(errorCode, errorMsg);
    }

    @Override // com.taobao.themis.widget.e
    public void a(e.a callback) {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a23e8a", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        if (!n.ak() || (cVar = this.d) == null) {
            return;
        }
        cVar.a(new TMSWidgetRender$getMonitorData$1(this, callback));
    }
}
