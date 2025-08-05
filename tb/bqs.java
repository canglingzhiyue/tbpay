package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.a;
import com.alibaba.android.umf.node.service.parse.state.b;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1166774146);
    }

    public abstract void a(TreeNode<RenderComponent> treeNode, bqu bquVar);

    public a a(bqu bquVar, a aVar, b.a aVar2) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("64201695", new Object[]{this, bquVar, aVar, aVar2});
        }
        MultiTreeNode d = aVar.d();
        if (d == null) {
            return a.a();
        }
        Map<String, RenderComponent> f = aVar.f();
        TreeNode<RenderComponent> find = d.find(f.get(bquVar.a().getTarget()));
        if (find != null && bquVar != null) {
            a(aVar, find, bquVar);
            a(find, bquVar);
            if (aVar2 != null) {
                aVar2.a(find);
            }
        }
        return a.a(aVar.k(), aVar.j(), aVar.i(), aVar.e(), d, f, aVar.g(), aVar.h());
    }

    private void a(a aVar, TreeNode<RenderComponent> treeNode, bqu bquVar) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30f369c", new Object[]{this, aVar, treeNode, bquVar});
            return;
        }
        UltronDeltaProtocol b = bquVar.b();
        RenderComponent data = treeNode.data();
        if (b == null || data == null || TextUtils.isEmpty(data.key)) {
            return;
        }
        aVar.a(bquVar.c(), data.key);
    }
}
