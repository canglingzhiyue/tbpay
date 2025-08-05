package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.a;
import com.etao.feimagesearch.structure.capture.d;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;
import tb.cpe;
import tb.cpj;

/* loaded from: classes3.dex */
public final class cpl extends ctc<cpk, b, CaptureManager> implements cpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ctk f26406a;
    public ViewGroup f;

    static {
        kge.a(-1405972521);
        kge.a(-1840647425);
    }

    public static /* synthetic */ Object ipc$super(cpl cplVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.cpk, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ cpk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpl(Activity activity, cte<b, CaptureManager> cteVar) {
        super(activity, cteVar);
        q.c(activity, "activity");
    }

    public final ViewGroup g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this});
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            q.b("rootView");
        }
        return viewGroup;
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View findViewById = this.d.findViewById(R.id.root_layout);
        q.a((Object) findViewById, "activity.findViewById(R.id.root_layout)");
        this.f = (ViewGroup) findViewById;
    }

    public cpk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpk) ipChange.ipc$dispatch("f035740", new Object[]{this}) : new cpk();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            j().a((cth) this.b);
            CaptureManager manager = j();
            q.a((Object) manager, "manager");
            manager.a((d) this.b);
            m();
        } else {
            j().b((cth) this.b);
        }
        cpk cpkVar = (cpk) this.b;
        if (cpkVar == null) {
            return;
        }
        cpkVar.a(z);
    }

    @Override // tb.cpo
    public void a(MusOuterAlbumBean outerAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d1b01", new Object[]{this, outerAlbumBean});
            return;
        }
        q.c(outerAlbumBean, "outerAlbumBean");
        cpk cpkVar = (cpk) this.b;
        if (cpkVar == null) {
            return;
        }
        cpkVar.a(outerAlbumBean);
    }

    @Override // tb.cpo
    public void a(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2482dd", new Object[]{this, oVar, new Boolean(z)});
            return;
        }
        cpk cpkVar = (cpk) this.b;
        if (cpkVar == null) {
            return;
        }
        cpkVar.a(oVar, z);
    }

    @Override // tb.cpo
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            m();
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
        if (i != 2 && i != 1) {
            return;
        }
        ctk ctkVar = this.f26406a;
        if (ctkVar != null && ctkVar.c()) {
            ctkVar.a();
        }
        cpk cpkVar = (cpk) this.b;
        if (cpkVar == null) {
            return;
        }
        cpkVar.b(i);
    }

    public final void a(ctj scanCodeFoundEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4188a1f", new Object[]{this, scanCodeFoundEvent});
            return;
        }
        q.c(scanCodeFoundEvent, "scanCodeFoundEvent");
        ctk ctkVar = this.f26406a;
        if (ctkVar != null) {
            ctkVar.a(a.f6987a, scanCodeFoundEvent);
            return;
        }
        ctk ctkVar2 = new ctk(this.d);
        this.f26406a = ctkVar2;
        ctkVar2.a(a.f6987a, scanCodeFoundEvent);
    }

    public final Rect l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("65b437fc", new Object[]{this});
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            q.b("rootView");
        }
        int width = viewGroup.getWidth();
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 == null) {
            q.b("rootView");
        }
        return new Rect(0, 0, width, viewGroup2.getHeight());
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        Object obj = this.c;
        if (!(obj instanceof cph)) {
            return;
        }
        ((cph) obj).f(z);
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!com.etao.feimagesearch.config.b.N()) {
        } else {
            cpj.a aVar = cpj.Companion;
            CaptureManager manager = j();
            q.a((Object) manager, "manager");
            TipShowMsg tipShowMsg = new TipShowMsg(aVar.a(manager), 0L, cpe.a.SCENE_AUTO_DETECT, TipShowMsg.TipShowType.TEXT_TYPE);
            CaptureManager manager2 = j();
            q.a((Object) manager2, "manager");
            if (manager2.y() == null) {
                return;
            }
            CaptureManager manager3 = j();
            q.a((Object) manager3, "manager");
            manager3.y().a(tipShowMsg);
        }
    }
}
