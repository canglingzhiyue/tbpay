package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqr extends bqs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "merge";

    static {
        kge.a(-730510504);
    }

    @Override // tb.bqs
    public void a(TreeNode<RenderComponent> treeNode, bqu bquVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837e346f", new Object[]{this, treeNode, bquVar});
        } else if (bquVar.a() == null || bquVar.a().getTarget() == null || bquVar.b() == null || bquVar.b().getData() == null || bquVar.b().getData().get(bquVar.a().getTarget()) == null) {
            bqe.a().a("MergeOperation", "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Component component = bquVar.b().getData().get(bquVar.a().getTarget());
            RenderComponent data = treeNode.data();
            if (data == null) {
                return;
            }
            Component component2 = data.getComponent();
            Map<String, Object> fields = component.getFields();
            if (fields != null) {
                if (component2.getFields() == null) {
                    component2.fields = new HashMap();
                }
                component2.getFields().putAll(fields);
            } else {
                bqe.a().a("MergeOperation", "fields 节点为null");
            }
            Map<String, List<Event>> events = component.getEvents();
            if (events != null) {
                if (component2.getEvents() == null) {
                    component2.events = new HashMap();
                }
                component2.getEvents().putAll(events);
            } else {
                bqe.a().a("MergeOperation", "events 节点为null");
            }
            Map<String, Object> localFields = component.getLocalFields();
            if (localFields != null) {
                if (component2.getLocalFields() == null) {
                    component2.localFields = new HashMap();
                }
                component2.getLocalFields().putAll(localFields);
            } else {
                bqe.a().a("MergeOperation", "localFields 节点为null");
            }
            Object features = component.getFeatures();
            if (features instanceof JSONObject) {
                if (component2.getFeatures() == null) {
                    component2.features = new JSONObject();
                }
                ((JSONObject) component2.getFeatures()).putAll((JSONObject) features);
                return;
            }
            bqe.a().a("MergeOperation", "features 节点为null");
        }
    }
}
