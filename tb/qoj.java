package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbugc.adapter.a;
import com.taobao.tbugc.adapter.b;
import com.taobao.tbugc.adapter.c;
import com.taobao.tbugc.adapter.d;
import com.taobao.tbugc.adapter.e;

/* loaded from: classes9.dex */
public class qoj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32986a;

    static {
        kge.a(-1422518622);
        f32986a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32986a) {
        } else {
            jmr.a().a(new c());
            jmr.a().a(new b());
            jmr.a().a(new a());
            jmr.a().a(new e());
            jmr.a().a(new d());
            f32986a = true;
        }
    }
}
