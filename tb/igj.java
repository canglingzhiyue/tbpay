package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class igj<ROOT_VIEW extends View, MODEL> extends hon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f29011a;
    private volatile ROOT_VIEW b;
    private volatile ViewGroup c;
    private MODEL d;
    private igi e;
    private Handler f;

    static {
        kge.a(-625413612);
    }

    public abstract ROOT_VIEW k();

    public final MODEL m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MODEL) ipChange.ipc$dispatch("b78c73e", new Object[]{this}) : this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igj(Activity activity, Object obj, MODEL model, igi igiVar) {
        super(activity, obj);
        q.c(activity, "activity");
        this.d = model;
        this.e = igiVar;
        this.f = new Handler(Looper.getMainLooper());
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f29011a;
    }

    public final ROOT_VIEW O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ROOT_VIEW) ipChange.ipc$dispatch("e1e2f418", new Object[]{this}) : this.b;
    }

    public final ViewGroup P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8e8fbb5e", new Object[]{this}) : this.c;
    }

    public static /* synthetic */ void a(igj igjVar, igi igiVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca18ae", new Object[]{igjVar, igiVar, new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachToContainer");
        } else {
            if ((i & 1) != 0) {
                igiVar = null;
            }
            igjVar.a(igiVar);
        }
    }

    public final void a(igi igiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9df7ed", new Object[]{this, igiVar});
        } else if (this.f29011a) {
        } else {
            if (igiVar != null) {
                this.e = igiVar;
            }
            igi igiVar2 = this.e;
            if (igiVar2 == null) {
                return;
            }
            ROOT_VIEW root_view = this.b;
            if (root_view == null) {
                root_view = k();
            }
            if (root_view == null) {
                return;
            }
            this.c = igiVar2.a(root_view);
            this.f29011a = true;
            this.b = root_view;
        }
    }

    public final void l() {
        igi igiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ROOT_VIEW root_view = this.b;
        if (!this.f29011a || root_view == null || (igiVar = this.e) == null) {
            return;
        }
        igiVar.b(root_view);
        this.f29011a = false;
    }
}
