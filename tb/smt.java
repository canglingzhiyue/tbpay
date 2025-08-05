package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.AInteractLifeCycle;
import com.taobao.tab2interact.core.data.baseinfo.a;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public abstract class smt extends AInteractLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-48388033);
    }

    public static /* synthetic */ Object ipc$super(smt smtVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740468243) {
            super.c_((String) objArr[0]);
            return null;
        } else if (hashCode == 104844535) {
            super.p();
            return null;
        } else if (hashCode != 1037559155) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((String) objArr[0]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smt(Context context, FrameLayout interactHostView, sus messageCenter, a baseInfoManager) {
        super(context, interactHostView, messageCenter, baseInfoManager);
        q.d(context, "context");
        q.d(interactHostView, "interactHostView");
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
    }

    @Override // tb.suv
    public void c_(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dd59ed", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        super.c_(changeType);
        i();
        j();
    }

    @Override // tb.suv
    public void b(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        super.b(changeType);
        k();
    }

    @Override // tb.suv
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        super.p();
        l();
    }
}
