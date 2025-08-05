package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class eru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-689021475);
    }

    public void a(bi biVar, bi biVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc334d99", new Object[]{this, biVar, biVar2, dXRuntimeContext});
        } else if ((biVar != null || biVar2 != null) && biVar2 != null) {
            z zVar = (z) biVar2;
            if (biVar == null) {
                erw.a(dXRuntimeContext, zVar.d());
                return;
            }
            z zVar2 = (z) biVar;
            int g = zVar.g();
            int g2 = zVar2.g();
            if (g == 0 && g2 == 0) {
                return;
            }
            if (g == 0 && g2 > 0) {
                return;
            }
            if (g > 0 && g2 == 0) {
                erw.a(zVar.d(), dXRuntimeContext);
                return;
            }
            HashMap hashMap = new HashMap(g2);
            for (int i = 0; i < zVar2.g(); i++) {
                hashMap.put(Integer.valueOf(zVar2.c(i).h()), Integer.valueOf(i));
            }
            ArrayList arrayList = new ArrayList(g2);
            for (int i2 = 0; i2 < g2; i2++) {
                arrayList.add(-1);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < zVar.g(); i4++) {
                z c = zVar.c(i4);
                int h = c.h();
                if (!hashMap.containsKey(Integer.valueOf(h))) {
                    erw.a(dXRuntimeContext, c.d());
                } else {
                    arrayList.set(((Integer) hashMap.get(Integer.valueOf(h))).intValue(), Integer.valueOf(i3));
                }
                i3++;
            }
            for (int i5 = 0; i5 < g2; i5++) {
                int intValue = ((Integer) arrayList.get(i5)).intValue();
                z c2 = zVar2.c(i5);
                if (intValue != -1) {
                    z c3 = zVar.c(intValue);
                    if (c2 != null && c3.getClass() != c2.getClass()) {
                        erw.a(dXRuntimeContext, c3.d());
                    } else {
                        c2.a(c3.d());
                        if (c2.d() != null) {
                            gbh.a(c2, c2.d());
                        }
                        if (c2.g() > 0 || c3.g() > 0) {
                            a(c2, c3, dXRuntimeContext);
                        }
                    }
                }
            }
        }
    }
}
