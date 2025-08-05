package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* loaded from: classes5.dex */
public class szd extends szc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDENTITY = "empty";

    static {
        kge.a(509770651);
    }

    @Override // tb.szc
    public boolean c(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24278273", new Object[]{this, stack})).booleanValue();
        }
        return false;
    }

    @Override // tb.szc
    public Stack a(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("4c9e883a", new Object[]{this, stack});
        }
        stack.push(Boolean.valueOf(b(stack.pop())));
        return stack;
    }

    @Override // tb.szc
    public boolean b(Stack stack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9da1c7d4", new Object[]{this, stack})).booleanValue() : stack != null && stack.size() > 0;
    }
}
