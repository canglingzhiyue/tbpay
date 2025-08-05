package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public abstract class rrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f33342a;

    static {
        kge.a(578027851);
    }

    public abstract void b();

    public abstract void c();

    public rrs(View view) {
        this.f33342a = view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f33342a == null) {
        } else {
            c();
            b();
        }
    }
}
