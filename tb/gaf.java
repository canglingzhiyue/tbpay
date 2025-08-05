package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.ac;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class gaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1240000249);
    }

    public abstract boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject);

    public abstract boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar);

    public abstract boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, n nVar);

    public abstract boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject);

    public abstract boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar);

    public abstract boolean c(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar);

    public boolean d(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8899ed86", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        return false;
    }

    public List<Object> a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c4ea7143", new Object[]{this, dXRecyclerLayout}) : dXRecyclerLayout.c();
    }

    public fzy b(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzy) ipChange.ipc$dispatch("f4495ffe", new Object[]{this, dXRecyclerLayout}) : dXRecyclerLayout.z();
    }

    public DXWidgetNode a(DXRecyclerLayout dXRecyclerLayout, Object obj, List<DXWidgetNode> list, int i, n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("149b3a84", new Object[]{this, dXRecyclerLayout, obj, list, new Integer(i), nVar}) : dXRecyclerLayout.a(obj, list, i, nVar);
    }

    public ac a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac) ipChange.ipc$dispatch("8a80441e", new Object[]{this, dXWidgetNode}) : fzx.a(dXWidgetNode);
    }

    public void a(DXRecyclerLayout dXRecyclerLayout, String str, int i, int i2, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e60e95c", new Object[]{this, dXRecyclerLayout, str, new Integer(i), new Integer(i2), str2, new Boolean(z)});
        } else {
            dXRecyclerLayout.a(false, str, i, i2, str2, z);
        }
    }

    public void c(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2502f6c2", new Object[]{this, dXRecyclerLayout});
        } else {
            dXRecyclerLayout.a(false, "all", -1, 0, (String) null, true);
        }
    }

    public ArrayList<DXWidgetNode> d(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1ec2373b", new Object[]{this, dXRecyclerLayout}) : dXRecyclerLayout.x();
    }

    public void a(DXRecyclerLayout dXRecyclerLayout, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e872c309", new Object[]{this, dXRecyclerLayout, new Integer(i), str});
        } else {
            dXRecyclerLayout.a(i, str);
        }
    }

    public void a(DXRecyclerLayout dXRecyclerLayout, Object obj, gah gahVar, int i, n nVar) {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c338d4", new Object[]{this, dXRecyclerLayout, obj, gahVar, new Integer(i), nVar});
        } else if (!fqi.F()) {
            dXRecyclerLayout.a(obj, i, nVar);
        } else {
            List<Object> c = dXRecyclerLayout.c();
            if (c != null && i >= 0 && i < c.size()) {
                c.set(i, obj);
            }
            fzy b2 = b(dXRecyclerLayout);
            if (b2 == null || b2.f() || i < 0 || i >= b2.g()) {
                return;
            }
            if (gahVar == null || gahVar.a() == 0) {
                DXWidgetNode a2 = a(dXRecyclerLayout, obj, dXRecyclerLayout.x(), i, nVar);
                if (a2 == null) {
                    return;
                }
                b2.c(i, a2);
            } else if ((gahVar.a() != 1 && gahVar.a() != 2) || (b = b2.b(i)) == null) {
            } else {
                DXWidgetRefreshOption.a b3 = new DXWidgetRefreshOption.a().a(true).b(true);
                if (gahVar.a() == 1) {
                    i2 = 1;
                }
                DXWidgetRefreshOption a3 = b3.a(i2).a();
                if (gahVar.b() == 0) {
                    b.setNeedParse(a3);
                } else if (gahVar.b() != 1) {
                } else {
                    b.setNeedLayout(a3);
                }
            }
        }
    }

    public ArrayList<DXWidgetNode> a(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("16906e33", new Object[]{this, dXRecyclerLayout, list, list2, new Integer(i), new Integer(i2), nVar}) : dXRecyclerLayout.a(list, list2, i, i2, nVar);
    }
}
