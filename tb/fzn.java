package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fzn extends fzl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_EVENT_PIPELINE_SCHEDULE = "DX_EVENT_PIPELINE_SCHEDULE";
    public int d;
    public int e;
    public boolean f;

    static {
        kge.a(-1586109984);
    }

    public static /* synthetic */ Object ipc$super(fzn fznVar, String str, Object... objArr) {
        if (str.hashCode() == -376665660) {
            return new Boolean(super.a((fzl) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fzn() {
        this.b = DX_EVENT_PIPELINE_SCHEDULE;
    }

    @Override // tb.fzl
    public boolean a(fzl fzlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98c89c4", new Object[]{this, fzlVar})).booleanValue();
        }
        if (fzlVar == null || !(fzlVar instanceof fzn) || this.d != ((fzn) fzlVar).d) {
            return false;
        }
        return super.a(fzlVar);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXPipelineScheduleEvent{stage=" + this.d + ", sender=" + this.f28239a + ", eventName='" + this.b + "', args=" + this.c + '}';
    }
}
