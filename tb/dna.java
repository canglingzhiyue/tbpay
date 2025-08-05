package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.List;
import java.util.Stack;

/* loaded from: classes4.dex */
public class dna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dnl f26863a = new dnl();
    private dnk b = new dnk();

    static {
        kge.a(-917771815);
    }

    public dnd a(List<dnm> list, DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("d97f8b57", new Object[]{this, list, dXEvent, objArr, dmzVar});
        }
        Stack stack = new Stack();
        stack.push(this.f26863a);
        if (list != null) {
            for (dnm dnmVar : list) {
                stack.push(dnmVar);
            }
        }
        stack.push(this.b);
        return new dnb(stack).a(dXEvent, objArr, dmzVar);
    }

    public dnd a(dnm dnmVar, DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("26a500d3", new Object[]{this, dnmVar, dXEvent, objArr, dmzVar});
        }
        Stack stack = new Stack();
        stack.push(this.f26863a);
        if (dnmVar != null) {
            stack.push(dnmVar);
        }
        stack.push(this.b);
        return new dnb(stack).a(dXEvent, objArr, dmzVar);
    }
}
