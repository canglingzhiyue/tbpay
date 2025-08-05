package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

@AURAExtensionImpl(code = "aura.impl.parse.stateTree.async.component")
/* loaded from: classes2.dex */
public final class avt extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private s e;
    private avx f;
    private HandlerThread g;
    private Handler h;
    private boolean i;

    static {
        kge.a(-1599757450);
    }

    public static /* synthetic */ Object ipc$super(avt avtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ avx a(avt avtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (avx) ipChange.ipc$dispatch("5e2f164a", new Object[]{avtVar}) : avtVar.f;
    }

    @Override // tb.aso, tb.asq
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (this.e == null || this.f == null) {
            arc.a().c("AURAAsyncModuleParseExtension", "onFinishParseWithRoot", "mAuraInstance or mAsyncModuleDispatcher is null");
        } else {
            a(multiTreeNode);
        }
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        avx avxVar = (avx) aURAGlobalData.get("asyncModuleDispatcher", avx.class);
        if (avxVar == null) {
            avxVar = new avv(this.e);
            aURAGlobalData.update("asyncModuleDispatcher", avxVar);
        }
        this.f = avxVar;
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.e = qVar.b();
        this.i = baz.a("enableThreadPerf", true);
        if (this.i) {
            return;
        }
        this.g = new HandlerThread("asyncModuleParser");
        this.g.start();
        this.h = new Handler(this.g.getLooper());
    }

    @Override // tb.aso, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.g == null) {
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.g.quitSafely();
                } else {
                    this.g.quit();
                }
            } catch (Exception unused) {
            }
        }
    }

    private void a(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d067f872", new Object[]{this, multiTreeNode});
            return;
        }
        final Iterator<TreeNode<RenderComponent>> it = multiTreeNode.preOrdered().iterator();
        Runnable runnable = new Runnable() { // from class: tb.avt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (it.hasNext()) {
                    TreeNode treeNode = (TreeNode) it.next();
                    if (treeNode != null && treeNode.data() != null) {
                        avt.a(avt.this).a((RenderComponent) treeNode.data());
                    }
                }
            }
        };
        if (this.i) {
            bbh.a(runnable);
            return;
        }
        Handler handler = this.h;
        if (handler == null) {
            return;
        }
        handler.post(runnable);
    }
}
