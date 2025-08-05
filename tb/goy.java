package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class goy extends gow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(779169482);
    }

    public goy(bbz bbzVar) {
        super(bbzVar);
    }

    @Override // tb.gok
    public void a(IDMComponent iDMComponent, IDMComponent iDMComponent2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c52b91b", new Object[]{this, iDMComponent, iDMComponent2, new Integer(i)});
        } else if (gof.d(iDMComponent)) {
            e(iDMComponent, iDMComponent2);
        } else if (gof.c(iDMComponent, iDMComponent2)) {
            if (i == 1) {
                b(iDMComponent, iDMComponent2);
            } else if (i == 2) {
                d(iDMComponent, iDMComponent2);
            } else if (gof.m(iDMComponent2)) {
                d(iDMComponent, iDMComponent2);
            } else {
                b(iDMComponent, iDMComponent2);
            }
        } else if (i == 1) {
            c(iDMComponent, iDMComponent2);
        } else if (i == 2) {
            d(iDMComponent, iDMComponent2);
        } else if (gof.m(iDMComponent2)) {
            d(iDMComponent, iDMComponent2);
        } else if (i == 4) {
            d(iDMComponent, iDMComponent2);
        } else {
            c(iDMComponent, iDMComponent2);
        }
    }
}
