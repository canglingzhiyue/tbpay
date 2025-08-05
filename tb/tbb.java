package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* loaded from: classes5.dex */
public class tbb extends tbd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDENTITY = "and";

    static {
        kge.a(557932417);
    }

    @Override // tb.tbd
    public Stack a(Stack stack) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("4c9e883a", new Object[]{this, stack});
        }
        Object pop = stack.pop();
        Object pop2 = stack.pop();
        if (!a(pop) || !a(pop2)) {
            z = false;
        }
        stack.push(Boolean.valueOf(z));
        return stack;
    }

    @Override // tb.tbd
    public boolean b(Stack stack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9da1c7d4", new Object[]{this, stack})).booleanValue() : stack != null && stack.size() >= 2;
    }

    @Override // tb.tbd
    public boolean c(Stack stack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24278273", new Object[]{this, stack})).booleanValue() : !a(stack.peek());
    }
}
