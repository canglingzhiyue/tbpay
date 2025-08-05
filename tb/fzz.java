package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.ah;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class fzz extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1308473575);
    }

    public fzz() {
    }

    public fzz(gaa gaaVar) {
        super(gaaVar);
    }

    @Override // tb.fzy
    public DXWidgetNode a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, Object obj, List<Object> list, List<DXWidgetNode> list2, int i, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("58b9e94", new Object[]{this, dXAbsContainerBaseLayout, obj, list, list2, new Integer(i), nVar});
        }
        ac acVar = null;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < list2.size() && (acVar = a(dXAbsContainerBaseLayout, list2.get(i2), obj, list, i, nVar, false)) == null; i2++) {
            }
        }
        if (acVar != null) {
            return acVar;
        }
        ah ahVar = new ah();
        ahVar.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().a((DXWidgetNode) dXAbsContainerBaseLayout));
        ahVar.setVisibility(2);
        return ahVar;
    }

    @Override // tb.fzy
    public ArrayList<DXWidgetNode> a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2ac5a0f2", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), nVar});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            for (int i3 = i; i3 < i2; i3++) {
                Object obj = list.get(i3);
                ac acVar = null;
                int i4 = 0;
                while (i4 < list2.size()) {
                    int i5 = i4;
                    acVar = a(dXAbsContainerBaseLayout, list2.get(i4), obj, list, i3, nVar, false);
                    if (acVar != null) {
                        break;
                    }
                    i4 = i5 + 1;
                }
                if (acVar == null) {
                    ah ahVar = new ah();
                    ahVar.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().a((DXWidgetNode) ahVar));
                    ahVar.setVisibility(2);
                    arrayList.add(ahVar);
                } else {
                    arrayList.add(acVar);
                }
            }
        }
        return arrayList;
    }
}
