package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.stream")
/* loaded from: classes4.dex */
public final class jco extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-204195231);
    }

    public static /* synthetic */ Object ipc$super(jco jcoVar, String str, Object... objArr) {
        if (str.hashCode() == -1435706478) {
            super.afterFlowExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arn, tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(cVar, aVar, z);
        if (z) {
            return;
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        tcy tcyVar = (tcy) c().get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        if (tcyVar == null) {
            return;
        }
        arc.a().a("stream", "流程结束");
        if (tcyVar.e()) {
            return;
        }
        arc.a().a("stream", "流式数据返回，执行pending事件");
        tcyVar.a(a().b());
    }
}
