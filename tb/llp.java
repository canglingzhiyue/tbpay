package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.lcv;

/* loaded from: classes.dex */
public class llp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30696a;

    static {
        kge.a(1745764715);
        f30696a = false;
    }

    public static void a(lcv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770e427c", new Object[]{aVar});
        } else if (f30696a) {
        } else {
            f30696a = true;
            if (aVar.b() == null) {
                aVar.a(new llz());
            }
            if (aVar.a() == null) {
                aVar.a(new lmb());
            }
            if (aVar.c() == null) {
                aVar.a(new lmc());
            }
            if (aVar.e() == null) {
                aVar.a(new llq());
            }
            if (aVar.f() == null) {
                aVar.a(new llw());
            }
            if (aVar.g() == null) {
                aVar.a(new lma());
            }
            if (aVar.h() == null) {
                aVar.a(new llt());
            }
            if (aVar.i() == null) {
                aVar.a(new llv());
            }
            if (aVar.j() == null) {
                aVar.a(new llx());
            }
            if (aVar.k() == null) {
                aVar.a(new lly());
            }
            lcu.a(aVar.l());
        }
    }
}
