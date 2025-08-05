package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Stack;

/* loaded from: classes4.dex */
public final class dnb implements dnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Stack<dnm> f26864a;

    static {
        kge.a(743163024);
        kge.a(-926701115);
    }

    public dnb(Stack<dnm> stack) {
        this.f26864a = stack;
    }

    @Override // tb.dnc
    public dnd a(DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        dnm pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("aea5966", new Object[]{this, dXEvent, objArr, dmzVar});
        }
        Stack<dnm> stack = this.f26864a;
        if (stack == null || stack.empty() || (pop = this.f26864a.pop()) == null) {
            return dnd.a();
        }
        return pop.a(new dnb(this.f26864a), dXEvent, objArr, dmzVar);
    }
}
