package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class amd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f25442a;
    private final Activity b;
    private final CaptureManager c;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ViewGroup a2 = amd.a(amd.this);
            if (a2 == null) {
                return;
            }
            a2.setVisibility(8);
        }
    }

    static {
        kge.a(980678071);
    }

    public amd(Activity activity, CaptureManager captureManager) {
        q.c(activity, "activity");
        q.c(captureManager, "captureManager");
        this.b = activity;
        this.c = captureManager;
    }

    public static final /* synthetic */ ViewGroup a(amd amdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("fe543bf5", new Object[]{amdVar}) : amdVar.f25442a;
    }

    public final void a() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.c.l()) {
        } else {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.scan_loading_view);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                if (inflate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                viewGroup = (ViewGroup) inflate;
            } else {
                viewGroup = (ViewGroup) this.b.findViewById(R.id.scan_loading_view_inflated_id);
            }
            this.f25442a = viewGroup;
            ViewGroup viewGroup2 = this.f25442a;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setOnClickListener(new a());
            viewGroup2.setVisibility(0);
        }
    }

    public final void b() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c.l() || (viewGroup = this.f25442a) == null) {
        } else {
            viewGroup.setVisibility(8);
        }
    }
}
