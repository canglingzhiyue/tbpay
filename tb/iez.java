package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.ieq;

/* loaded from: classes3.dex */
public abstract class iez<V extends View, IP extends ieq<?>, MODEL> extends igj<V, MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IP f28985a;

    static {
        kge.a(-1628333344);
    }

    public static /* synthetic */ Object ipc$super(iez iezVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1698944896:
                super.ek_();
                return null;
            case 69750737:
                super.J();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract IP i();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iez(Activity activity, Object obj, MODEL model, igi igiVar) {
        super(activity, obj, model, igiVar);
        q.c(activity, "activity");
        this.f28985a = i();
        IP ip = this.f28985a;
        if (ip == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.struct.IPresenter<com.etao.feimagesearch.struct.AbsWidget>");
        }
        ip.a(this);
        this.f28985a.init();
    }

    public final IP h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IP) ipChange.ipc$dispatch("44e16e82", new Object[]{this}) : this.f28985a;
    }

    @Override // tb.hon
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else {
            super.J();
        }
    }

    @Override // tb.hon
    public void ek_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abc2880", new Object[]{this});
            return;
        }
        super.ek_();
        this.f28985a.a();
    }

    @Override // tb.hon
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.f28985a.u();
    }

    @Override // tb.hon
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.f28985a.b();
    }

    @Override // tb.hon
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        this.f28985a.c();
    }

    @Override // tb.hon
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        this.f28985a.v();
    }

    @Override // tb.hon
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.f28985a.d();
    }
}
