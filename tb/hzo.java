package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.h;

/* loaded from: classes6.dex */
public class hzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-719951789);
    }

    public static jnw a(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("9098fdde", new Object[]{context, hVar});
        }
        if (hVar != null && context != null) {
            return new jnw(context).a(hVar.b()).b(hVar.d()).a(hVar.l()).b(hVar.n()).a(hVar.j()).e(hVar.o()).d(hVar.h()).c(hVar.g()).c(hVar.k()).e(hVar.f()).g(hVar.q()).h(hVar.p()).i(hVar.r()).f(hVar.c()).d(hVar.e()).a(hVar.i()).g(hVar.t());
        }
        return null;
    }
}
