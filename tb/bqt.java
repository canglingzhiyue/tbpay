package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.delta.h;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqt extends bqs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "replace";

    static {
        kge.a(520690204);
    }

    @Override // tb.bqs
    public void a(TreeNode<RenderComponent> treeNode, bqu bquVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837e346f", new Object[]{this, treeNode, bquVar});
        } else if (bquVar.a() == null || bquVar.a().getTarget() == null || bquVar.b() == null || bquVar.b().getData() == null || bquVar.b().getData().get(bquVar.a().getTarget()) == null) {
            bqe.a().a(h.TAG, "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Component component = bquVar.b().getData().get(bquVar.a().getTarget());
            Component component2 = treeNode.data().getComponent();
            Map<String, Object> fields = component.getFields();
            if (fields != null) {
                component2.fields = fields;
            }
            Map<String, List<Event>> events = component.getEvents();
            if (events != null) {
                component2.events = events;
            }
            Map<String, Object> localFields = component.getLocalFields();
            if (localFields != null) {
                component2.localFields = localFields;
            }
            Object features = component.getFeatures();
            if (!(features instanceof JSONObject)) {
                return;
            }
            component2.features = features;
        }
    }
}
