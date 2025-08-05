package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.bj;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class tpd extends qpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1686072095);
    }

    public static /* synthetic */ Object ipc$super(tpd tpdVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -864972674) {
            if (hashCode != 1271836742) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.a((a) objArr[0]);
        }
        return super.b((a) objArr[0]);
    }

    public tpd(JSONObject jSONObject, plc plcVar) {
        super(jSONObject, plcVar);
        a(jSONObject, plcVar);
    }

    private void a(JSONObject jSONObject, plc plcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5d0eb1", new Object[]{this, jSONObject, plcVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                a(new qms(jSONObject2, plcVar));
            }
        }
    }

    @Override // tb.qms
    public synchronized d a(a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4bceb046", new Object[]{this, aVar});
        }
        List h = h();
        if (h != null) {
            i = h.size();
        }
        for (int i2 = i - 1; i2 > -1; i2--) {
            d a2 = ((qms) h.get(i2)).a(aVar);
            if (a2 != null) {
                return a2;
            }
        }
        return super.a(aVar);
    }

    @Override // tb.qms
    public View b(a aVar) {
        View componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc71907e", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        List h = h();
        if (h == null) {
            return super.b(aVar);
        }
        if (this.p == null || !(this.p instanceof LinearLayout)) {
            LinearLayout linearLayout = new LinearLayout(aVar.a());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.p = linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.p;
        List<View> a2 = a(linearLayout2);
        int size = h.size();
        for (int i = 0; i < size; i++) {
            d a3 = ((qms) h.get(i)).a(aVar);
            if (a3 != null && (componentView = a3.getComponentView(a(a2, a3))) != null) {
                bj.a(componentView);
                componentView.setTag(R.id.tt_detail_bottom_bar_layout_node_child_id, Integer.valueOf(a3.hashCode()));
                ViewGroup.LayoutParams layoutParams = componentView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                linearLayout2.addView(componentView, layoutParams);
            }
        }
        return this.p;
    }

    private List<View> a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc92ec0", new Object[]{this, viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        viewGroup.removeAllViews();
        return arrayList;
    }

    private View a(List<View> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d531e3e4", new Object[]{this, list, dVar});
        }
        for (View view : list) {
            Object tag = view.getTag(R.id.tt_detail_bottom_bar_layout_node_child_id);
            int hashCode = dVar.hashCode();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hashCode) {
                return view;
            }
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List h = h();
        int size = h != null ? h.size() : 0;
        for (int i = 0; i < size; i++) {
            d g = ((qms) h.get(i)).g();
            if (g != null) {
                g.create();
            }
        }
        d g2 = g();
        if (g2 == null) {
            return;
        }
        g2.create();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List h = h();
        int size = h != null ? h.size() : 0;
        for (int i = 0; i < size; i++) {
            d g = ((qms) h.get(i)).g();
            if (g != null) {
                g.willAppear();
            }
        }
        d g2 = g();
        if (g2 == null) {
            return;
        }
        g2.willAppear();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List h = h();
        int size = h != null ? h.size() : 0;
        for (int i = 0; i < size; i++) {
            d g = ((qms) h.get(i)).g();
            if (g != null) {
                g.didAppear();
            }
        }
        d g2 = g();
        if (g2 == null) {
            return;
        }
        g2.didAppear();
    }
}
