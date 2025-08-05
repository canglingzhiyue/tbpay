package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(915969252);
    }

    public static void a(imn imnVar, jyw jywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e56d36", new Object[]{imnVar, jywVar});
        } else {
            imnVar.o().a(new jyy(new jyv(imnVar, jywVar), jywVar));
        }
    }

    public static void a(imn imnVar, jyx jyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5e195", new Object[]{imnVar, jyxVar});
        } else {
            imnVar.o().a(jyxVar);
        }
    }
}
