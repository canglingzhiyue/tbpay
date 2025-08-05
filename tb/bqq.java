package tb;

import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.delta.d;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqq extends bqs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "insert";

    static {
        kge.a(-955129723);
    }

    @Override // tb.bqs
    public void a(TreeNode<RenderComponent> treeNode, bqu bquVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837e346f", new Object[]{this, treeNode, bquVar});
        } else if (bquVar.a() == null || bquVar.a().getTarget() == null || bquVar.b() == null || bquVar.b().getData() == null || bquVar.b().getData().get(bquVar.a().getTarget()) == null) {
            bqe.a().a(d.TAG, "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Map<String, Object> fields = bquVar.b().getData().get(bquVar.a().getTarget()).getFields();
            if (treeNode.data().component.getFields() != null && fields != null) {
                treeNode.data().component.getFields().putAll(fields);
            } else {
                bqe.a().a(d.TAG, "状态树未找到对应的节点");
            }
        }
    }
}
