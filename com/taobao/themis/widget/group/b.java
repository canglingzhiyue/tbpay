package com.taobao.themis.widget.group;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.widget.e;
import com.taobao.themis.widget.kernal.a;
import com.taobao.themis.widget.kernal.b;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqn;
import tb.qqo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/taobao/themis/widget/group/IsomorphicWidgetRender;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "Lcom/taobao/themis/widget/kernal/IWidgetPageExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "renderListener", "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "destroy", "", "execJSToRender", "script", "", "name", "", e.RECORD_FIREEVENT, "event", "params", "Lcom/alibaba/fastjson/JSON;", "fireEventOld", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getMonitorData", "callback", "Lcom/taobao/themis/widget/IWidgetControllerExtension$DataCallback;", "getRenderType", "getView", "Landroid/view/View;", "onRenderError", "errorCode", "errorMsg", "render", DataReceiveMonitor.CB_LISTENER, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b extends qqn implements com.taobao.themis.widget.kernal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private qqo c;
    private final ITMSPage d;

    static {
        kge.a(-132048804);
        kge.a(1352955228);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -69967319) {
            super.a((qqo) objArr[0]);
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    @Override // com.taobao.themis.widget.e
    public void a(e.a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a23e8a", new Object[]{this, callback});
        } else {
            q.d(callback, "callback");
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
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "IsomorphicWidget";
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
    public b(ITMSPage page) {
        super(page);
        q.d(page, "page");
        this.d = page;
        this.d.a(this);
    }

    @Override // tb.qqn, tb.qqq
    public void a(qqo listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        super.a(listener);
        this.c = listener;
        b.c cVar = (b.c) this.f33035a.a(b.c.class);
        if (cVar == null) {
            return;
        }
        b.c.a(cVar, (ViewGroup) null, 1, (Object) null);
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        b.c cVar = (b.c) this.f33035a.a(b.c.class);
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
        b.c cVar = (b.c) this.f33035a.a(b.c.class);
        if (cVar == null) {
            return;
        }
        cVar.a(event, json);
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        f fVar = this.f33035a;
        if (fVar != null && (cVar = (b.c) fVar.a(b.c.class)) != null) {
            cVar.a();
        }
        super.f();
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
        qqo qqoVar = this.c;
        if (qqoVar == null) {
            return;
        }
        qqoVar.a(errorCode, errorMsg);
    }
}
