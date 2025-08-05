package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.AInteractLifeCycle;
import com.taobao.tab2interact.core.data.baseinfo.a;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public abstract class sjc extends AInteractLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-324882881);
    }

    public static /* synthetic */ Object ipc$super(sjc sjcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 104844535) {
            super.p();
            return null;
        } else if (hashCode != 1708636285) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public abstract boolean a(String str);

    public abstract boolean q();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjc(Context context, FrameLayout interactHostView, sus messageCenter, a baseInfoManager) {
        super(context, interactHostView, messageCenter, baseInfoManager);
        q.d(context, "context");
        q.d(interactHostView, "interactHostView");
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
    }

    @Override // tb.suv
    public void a(String tabId, String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        super.a(tabId, changeType);
        if (!a(tabId)) {
            return;
        }
        i();
        j();
    }

    @Override // tb.suv
    public void b(String tabId, String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        super.b(tabId, changeType);
        if (!a(tabId)) {
            return;
        }
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
