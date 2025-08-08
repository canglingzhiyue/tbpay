package com.etao.feimagesearch.capture.dynamic.hybrid;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.h;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;
import tb.ctb;
import tb.ctc;
import tb.cte;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class e extends ctc<a, com.etao.feimagesearch.model.b, CaptureManager> implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f6558a;
    private p f;
    private boolean g;
    private boolean h;
    private volatile String i;

    static {
        kge.a(359285213);
        kge.a(-1765150492);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case 93762283:
                super.d();
                return null;
            case 95609325:
                super.f();
                return null;
            case 1978668644:
                super.B_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void l();

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.capture.dynamic.hybrid.a, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : u();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> parent) {
        super(activity, parent);
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.i = "";
    }

    public final p a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("8088e5e5", new Object[]{this}) : this.f;
    }

    public final void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.f = pVar;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.h;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.i;
    }

    public final FrameLayout r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        FrameLayout frameLayout = this.f6558a;
        if (frameLayout == null) {
            q.b("rootViewContainer");
        }
        return frameLayout;
    }

    public a u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2bfeac37", new Object[]{this}) : new a();
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        manager.a(this);
        View findViewById = this.d.findViewById(R.id.fl_capture_ui);
        q.a((Object) findViewById, "activity.findViewById(R.id.fl_capture_ui)");
        this.f6558a = (FrameLayout) findViewById;
        this.g = false;
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        try {
            p pVar = this.f;
            if (pVar != null) {
                pVar.onActivityStart();
            }
            p pVar2 = this.f;
            if (pVar2 == null) {
                return;
            }
            pVar2.onActivityResume();
        } catch (Exception unused) {
        }
    }

    @Override // tb.ctc
    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        super.B_();
        try {
            p pVar = this.f;
            if (pVar != null) {
                pVar.onActivityPause();
            }
            p pVar2 = this.f;
            if (pVar2 == null) {
                return;
            }
            pVar2.onActivityStop();
        } catch (Exception unused) {
        }
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.h) {
        } else {
            this.h = true;
            super.f();
            p pVar = this.f;
            if (pVar != null && !pVar.isDestroyed()) {
                pVar.destroy();
            }
            this.f = null;
        }
    }

    @Override // tb.ctc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        if (this.h) {
            return;
        }
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        if (manager.a()) {
            return;
        }
        p pVar = this.f;
        if (pVar != null) {
            FrameLayout frameLayout = this.f6558a;
            if (frameLayout == null) {
                q.b("rootViewContainer");
            }
            frameLayout.removeView(pVar.getRenderRoot());
            pVar.destroy();
            this.f = null;
            this.g = false;
        }
        l();
    }

    @Override // com.etao.feimagesearch.structure.capture.h
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(String target, com.etao.feimagesearch.capture.dynamic.msg.b bVar) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e92575", new Object[]{this, target, bVar});
            return;
        }
        q.c(target, "target");
        if (bVar == null || StringUtils.isEmpty(bVar.e()) || (pVar = this.f) == null) {
            return;
        }
        pVar.sendInstanceMessage(target, bVar.e(), bVar.f());
    }

    @Override // com.etao.feimagesearch.structure.capture.h
    public void a(com.etao.feimagesearch.capture.dynamic.msg.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bb572b", new Object[]{this, bVar});
        } else {
            a(com.taobao.android.weex_framework.util.a.ATOM_EXT_window, bVar);
        }
    }
}
