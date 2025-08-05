package tb;

import android.content.Context;
import com.alibaba.android.umf.datamodel.protocol.ultron.Container;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class jdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(157426603);
    }

    public static bd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd) ipChange.ipc$dispatch("6a370b68", new Object[0]);
        }
        bd bdVar = new bd(new DXEngineConfig.a("purchase").b(2).a("purchase").d(88).a());
        bdVar.d().a(new dsz());
        return bdVar;
    }

    public static void a(bd bdVar, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd0e154", new Object[]{bdVar, container});
        } else if (container == null) {
            arc.a().b("containerCache is null");
        } else {
            List<ComponentView> data = container.getData();
            if (bau.a(data)) {
                return;
            }
            bdVar.d().c(a(data));
        }
    }

    public static void a(Context context, bd bdVar, UltronProtocol ultronProtocol) {
        Container container;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc86c07", new Object[]{context, bdVar, ultronProtocol});
        } else if (ultronProtocol == null) {
            arc.a().b("protocol is null");
        } else {
            Map<String, Component> data = ultronProtocol.getData();
            if (bau.a(data) || (container = ultronProtocol.getContainer()) == null) {
                return;
            }
            List<ComponentView> data2 = container.getData();
            if (bau.a(data2)) {
                return;
            }
            for (String str : data.keySet()) {
                Component component = data.get(str);
                if (component != null) {
                    bdVar.a(context, a(component.getType(), data2), (JSONObject) JSONObject.toJSON(component.getFields()), -1, (DXRenderOptions) null);
                }
            }
        }
    }

    private static DXTemplateItem a(String str, List<ComponentView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c5375b7c", new Object[]{str, list});
        }
        if (str == null) {
            return null;
        }
        for (ComponentView componentView : list) {
            if (componentView.getType() != null && componentView.getType().contains(str)) {
                return a(componentView);
            }
        }
        return null;
    }

    private static List<DXTemplateItem> a(List<ComponentView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentView componentView : list) {
            if (componentView != null) {
                arrayList.add(a(componentView));
            }
        }
        return arrayList;
    }

    private static DXTemplateItem a(ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12f654a2", new Object[]{componentView});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.c = componentView.getUrl();
        dXTemplateItem.f11925a = componentView.getName();
        try {
            dXTemplateItem.b = Long.parseLong(componentView.getVersion());
        } catch (Exception e) {
            dXTemplateItem.b = 1L;
            ard a2 = arc.a();
            a2.c("AliBuyDXEngineWrapper", "convert for template:" + componentView.getName(), e.getMessage());
        }
        return dXTemplateItem;
    }
}
