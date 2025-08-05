package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class esa extends eru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1823721086);
    }

    @Override // tb.eru
    public void a(bi biVar, bi biVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc334d99", new Object[]{this, biVar, biVar2, dXRuntimeContext});
            return;
        }
        fqi.V();
        if (biVar == null && biVar2 == null) {
            return;
        }
        z zVar = (z) biVar2;
        if (biVar2 == null) {
            return;
        }
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
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zVar2.g(); i++) {
            DXWidgetNode l = zVar2.c(i).l();
            if (l != null) {
                int autoId = l.getAutoId();
                List list = (List) sparseArray.get(autoId);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i));
                    sparseArray.put(autoId, arrayList);
                } else {
                    list.add(Integer.valueOf(i));
                }
            } else if (fqi.Y()) {
                int j = zVar2.c(i).j();
                List list2 = (List) sparseArray.get(j);
                if (list2 == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(i));
                    sparseArray.put(j, arrayList2);
                } else {
                    list2.add(Integer.valueOf(i));
                }
            }
        }
        int[] iArr = new int[g2];
        for (int i2 = 0; i2 < g2; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < zVar.g(); i3++) {
            z c = zVar.c(i3);
            if (c.e().getSourceWidget() != null && sparseArray.size() != 0) {
                List list3 = (List) sparseArray.get(c.l().getAutoId());
                if (list3 == null || list3.isEmpty()) {
                    erw.a(dXRuntimeContext, c.d());
                } else {
                    iArr[((Integer) list3.get(0)).intValue()] = i3;
                    list3.remove(0);
                }
            } else if (fqi.Y() && c.j() >= 0 && sparseArray.size() != 0) {
                List list4 = (List) sparseArray.get(c.j());
                if (list4 == null || list4.isEmpty()) {
                    erw.a(dXRuntimeContext, c.d());
                } else {
                    iArr[((Integer) list4.get(0)).intValue()] = i3;
                    list4.remove(0);
                }
            } else {
                erw.a(dXRuntimeContext, c.d());
            }
        }
        for (int i4 = 0; i4 < g2; i4++) {
            int i5 = iArr[i4];
            z c2 = zVar2.c(i4);
            if (i5 != -1) {
                z c3 = zVar.c(i5);
                if (c2 != null && c3.k() != c2.k()) {
                    erw.a(dXRuntimeContext, c3.d());
                } else {
                    c2.a(c3.d());
                    if (c2.d() != null) {
                        gbh.a(c2.d(), c2);
                    }
                    if (c2.g() > 0 || c3.g() > 0) {
                        a(c2, c3, dXRuntimeContext);
                    }
                }
            }
        }
    }
}
