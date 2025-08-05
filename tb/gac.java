package tb;

import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ah;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.y;
import com.taobao.android.fluid.framework.data.remote.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class gac extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Object> b;
    public List c;
    public Map<Integer, List<Integer>> d;
    public Map<Integer, Integer> e;

    static {
        kge.a(806384866);
    }

    public static /* synthetic */ Object ipc$super(gac gacVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public gac() {
        this(null);
    }

    public gac(gaa gaaVar) {
        super(gaaVar);
        this.c = new JSONArray();
        this.e = new HashMap();
        this.d = new HashMap();
    }

    public List<ac> a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, DXWidgetNode dXWidgetNode, Object obj, List<Object> list, int i, int i2, n nVar) {
        ac a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed2f74bb", new Object[]{this, dXAbsContainerBaseLayout, dXWidgetNode, obj, list, new Integer(i), new Integer(i2), nVar});
        }
        if (dXWidgetNode instanceof y) {
            DXRuntimeContext a3 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
            a3.a(obj);
            a3.b(i);
            HashMap hashMap = new HashMap();
            a3.a((Map<String, f>) hashMap);
            hashMap.put(q.MSGTYPE_INTERVAL, f.a(i));
            if (list instanceof JSONArray) {
                hashMap.put(c.KEY_DATA_SOURCE, f.a((JSONArray) list));
            } else if (a3.M() != null && (list instanceof Object)) {
                hashMap.put(c.KEY_DATA_SOURCE, f.a(list));
            }
            if (!fzx.a(dXWidgetNode, a3) || dXWidgetNode.getChildrenCount() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = i2;
            for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                if ((dXWidgetNode2 instanceof ac) && (a2 = a(dXAbsContainerBaseLayout, dXWidgetNode2, obj, list, i3, nVar, true)) != null) {
                    this.c.add(obj);
                    a(i, i3);
                    i3++;
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }
        return null;
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<Integer> list = this.d.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            this.d.put(Integer.valueOf(i), list);
        }
        if (list.indexOf(Integer.valueOf(i2)) == -1) {
            list.add(Integer.valueOf(i2));
        }
        this.e.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    @Override // tb.fzy
    public ArrayList<DXWidgetNode> a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2ac5a0f2", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), nVar});
        }
        this.b = list;
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            for (int i3 = i; i3 < i2; i3++) {
                Object obj = list.get(i3);
                int size = this.c.size();
                List<ac> list3 = null;
                int i4 = 0;
                while (i4 < list2.size()) {
                    int i5 = i4;
                    list3 = a(dXAbsContainerBaseLayout, list2.get(i4), obj, list, i3, size, nVar);
                    if (list3 != null) {
                        break;
                    }
                    i4 = i5 + 1;
                }
                if (list3 == null || list3.size() == 0) {
                    ah ahVar = new ah();
                    ahVar.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().a((DXWidgetNode) ahVar));
                    ahVar.setVisibility(2);
                    arrayList.add(ahVar);
                    this.c.add(list);
                } else {
                    arrayList.addAll(list3);
                }
            }
        }
        return arrayList;
    }
}
