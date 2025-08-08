package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Stack;

@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.asyncModuleEntry.build")
/* loaded from: classes2.dex */
public final class avq extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f25637a;
    private avx b;

    static {
        kge.a(-377757624);
    }

    public static /* synthetic */ Object ipc$super(avq avqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1372880223) {
            super.afterServiceExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        if (!StringUtils.equals(aVar.c(), com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE)) {
            return;
        }
        a(cVar);
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f25637a = qVar.b();
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        avx avxVar = (avx) aURAGlobalData.get("asyncModuleDispatcher", avx.class);
        if (avxVar == null) {
            avxVar = new avv(this.f25637a);
            aURAGlobalData.update("asyncModuleDispatcher", avxVar);
        }
        this.b = avxVar;
    }

    private void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            return;
        }
        Serializable b = cVar.b();
        if (!(b instanceof AURARenderIO)) {
            return;
        }
        AURARenderComponent renderTree = ((AURARenderIO) b).getRenderTree();
        Stack stack = new Stack();
        stack.push(renderTree);
        while (!stack.isEmpty()) {
            AURARenderComponent aURARenderComponent = (AURARenderComponent) stack.pop();
            if (aURARenderComponent != null) {
                if (!aURARenderComponent.isLeaf()) {
                    for (AURARenderComponent aURARenderComponent2 : aURARenderComponent.children) {
                        stack.push(aURARenderComponent2);
                    }
                } else if (aURARenderComponent.isLeaf() && aURARenderComponent.isAsync()) {
                    this.b.b(aURARenderComponent);
                }
            }
        }
    }
}
