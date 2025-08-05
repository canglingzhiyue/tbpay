package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;

/* loaded from: classes4.dex */
public abstract class eyx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-267481749);
    }

    public abstract eyz a();

    public abstract ezr b();

    public abstract ezl c();

    public abstract a d();

    public abstract ezv e();

    public abstract ezh f();

    public abstract Context g();

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a().d();
        b().d();
        c().b();
        d();
        e();
        f().a();
    }
}
