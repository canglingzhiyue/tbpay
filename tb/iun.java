package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iuh;
import tb.iuj;

/* loaded from: classes6.dex */
public abstract class iun<V extends View, IV extends iuj, IP extends iuh, MODEL, BEAN> extends ius<BEAN, V, MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IV f29320a;
    private IP b;

    static {
        kge.a(-1506861618);
    }

    public static /* synthetic */ Object ipc$super(iun iunVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract IP d();

    public abstract IV f();

    public iun(Activity activity, ium iumVar, MODEL model, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, model, viewGroup, iurVar);
        this.b = d();
        this.f29320a = f();
        this.b.bind(this.f29320a, this, c());
        this.f29320a.a(this.b, c());
        this.f29320a.a(activity);
        this.b.init();
    }

    public IV J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IV) ipChange.ipc$dispatch("5e104897", new Object[]{this}) : this.f29320a;
    }

    public IP K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IP) ipChange.ipc$dispatch("65c1edb8", new Object[]{this}) : this.b;
    }

    @Override // tb.ius
    public V onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : (V) this.f29320a.b(getActivity(), getContainer());
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.b.destroy();
        this.f29320a.c();
    }
}
