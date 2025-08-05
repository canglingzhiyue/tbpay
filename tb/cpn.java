package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.d;
import com.etao.feimagesearch.structure.capture.h;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpn extends ctc<cpm, b, CaptureManager> implements cpo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "CaptureScanPresenterV2";

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f26409a;
    private ctk f;
    private String g;

    static {
        kge.a(1976917888);
        kge.a(-1840647425);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cpn cpnVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.ctb, tb.cpm] */
    @Override // tb.ctc
    public /* synthetic */ cpm b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpn(Activity activity, cte<b, CaptureManager> cteVar) {
        super(activity, cteVar);
        q.c(activity, "activity");
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        this.g = com.etao.feimagesearch.config.b.b(manager.W());
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1110185272);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final ViewGroup g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this});
        }
        ViewGroup viewGroup = this.f26409a;
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
        this.f26409a = (ViewGroup) findViewById;
    }

    public cpm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpm) ipChange.ipc$dispatch("f03577e", new Object[]{this}) : new cpm();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            m();
            j().a((cth) this.b);
            CaptureManager manager = j();
            q.a((Object) manager, "manager");
            if (manager.m() > 0) {
                CaptureManager manager2 = j();
                q.a((Object) manager2, "manager");
                manager2.a((d) this.b);
            }
        } else {
            j().b((cth) this.b);
        }
        cpm cpmVar = (cpm) this.b;
        if (cpmVar == null) {
            return;
        }
        cpmVar.a(z);
    }

    @Override // tb.cpo
    public void a(MusOuterAlbumBean outerAlbumBean) {
        cpm cpmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d1b01", new Object[]{this, outerAlbumBean});
            return;
        }
        q.c(outerAlbumBean, "outerAlbumBean");
        if (TextUtils.isEmpty(outerAlbumBean.getImgKey()) || (cpmVar = (cpm) this.b) == null) {
            return;
        }
        cpmVar.a(outerAlbumBean);
    }

    @Override // tb.cpo
    public void a(com.etao.feimagesearch.album.o oVar, boolean z) {
        cpm cpmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2482dd", new Object[]{this, oVar, new Boolean(z)});
        } else if (oVar == null || (cpmVar = (cpm) this.b) == null) {
        } else {
            cpmVar.a(oVar, z);
        }
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

    public final void a(ctj scanCodeFoundEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4188a1f", new Object[]{this, scanCodeFoundEvent});
            return;
        }
        q.c(scanCodeFoundEvent, "scanCodeFoundEvent");
        if (scanCodeFoundEvent.a() == null || scanCodeFoundEvent.b() == null) {
            return;
        }
        cot.c("CaptureScanPresenterV2", "showMultiScanCodes");
        ctk ctkVar = this.f;
        if (ctkVar != null) {
            ctkVar.a(com.etao.feimagesearch.structure.capture.a.f6987a, scanCodeFoundEvent);
            return;
        }
        ctk ctkVar2 = new ctk(this.d);
        ctkVar2.a(com.etao.feimagesearch.structure.capture.a.f6987a, scanCodeFoundEvent);
        this.f = ctkVar2;
    }

    public final Rect l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("65b437fc", new Object[]{this});
        }
        ViewGroup viewGroup = this.f26409a;
        if (viewGroup == null) {
            q.b("rootView");
        }
        int width = viewGroup.getWidth();
        ViewGroup viewGroup2 = this.f26409a;
        if (viewGroup2 == null) {
            q.b("rootView");
        }
        return new Rect(0, 0, width, viewGroup2.getHeight());
    }

    private final void m() {
        h y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TipShowMsg tipShowMsg = new TipShowMsg(this.g, 0L, "scan", TipShowMsg.TipShowType.TEXT_TYPE);
        CaptureManager j = j();
        if (j == null || (y = j.y()) == null) {
            return;
        }
        y.a(tipShowMsg);
    }
}
