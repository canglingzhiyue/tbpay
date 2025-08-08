package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.sku.data.a;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.presenter.d;
import com.taobao.android.sku.utils.o;
import java.util.HashMap;
import tb.iyg;

/* loaded from: classes6.dex */
public class iyg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private a f29408a;
    private c b;

    static {
        kge.a(-1616165552);
    }

    public static /* synthetic */ a a(iyg iygVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5c7284d1", new Object[]{iygVar}) : iygVar.f29408a;
    }

    public iyg(a aVar, c cVar) {
        this.f29408a = aVar;
        this.b = cVar;
    }

    public boolean a(String str) {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!a() || (b = b(str)) == null) {
            return false;
        }
        o.a(19999, "Open_Sku_Native", new HashMap<String, String>() { // from class: com.taobao.android.sku.silence.SilentNextActionCore$1
            {
                put("id", iyg.a(iyg.this).b());
                put("reason", "silentAction");
            }
        });
        return b.postEvent(new DXEvent(18903999933159L));
    }

    private DXWidgetNode b(String str) {
        c cVar;
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7315d092", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (cVar = this.b) != null && (a2 = cVar.a()) != null) {
            return a(a2.k(), str);
        }
        return null;
    }

    private DXWidgetNode a(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4c6685d0", new Object[]{this, viewGroup, str});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        DXWidgetNode dXWidgetNode = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXWidgetNode expandWidgetNode = ((DXRootView) childAt).getExpandWidgetNode();
                if (expandWidgetNode != null) {
                    dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str);
                }
            } else if (childAt instanceof ViewGroup) {
                dXWidgetNode = a((ViewGroup) childAt, str);
            }
            if (dXWidgetNode != null) {
                return dXWidgetNode;
            }
        }
        return null;
    }

    private boolean a() {
        JSONObject o;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        a aVar = this.f29408a;
        if (aVar != null && (o = aVar.o()) != null && (jSONObject = o.getJSONObject("id_biz_bottom")) != null) {
            return jSONObject.getBooleanValue("supportSilentAction");
        }
        return false;
    }
}
