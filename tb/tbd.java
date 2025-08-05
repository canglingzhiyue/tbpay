package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes5.dex */
public abstract class tbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Object f34008a;

    public abstract Stack a(Stack stack);

    public abstract boolean b(Stack stack);

    public abstract boolean c(Stack stack);

    static {
        kge.a(-1932694107);
        f34008a = new Object();
    }

    public final Stack d(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("70965e17", new Object[]{this, stack});
        }
        try {
            return !b(stack) ? stack : a(stack);
        } catch (Throwable unused) {
            return stack;
        }
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj == null || obj == f34008a) {
            return false;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            if (!(obj instanceof String)) {
                return obj instanceof List ? !((List) obj).isEmpty() : obj.getClass().isArray() ? Array.getLength(obj) > 0 : !(obj instanceof Map) || !((Map) obj).isEmpty();
            }
            String trim = ((String) obj).trim();
            if ("true".equalsIgnoreCase(trim)) {
                return true;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return false;
            }
            try {
                return Integer.parseInt(trim) != 0;
            } catch (Exception unused) {
                return trim.length() > 0;
            }
        }
    }

    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null || obj == f34008a) {
            return true;
        }
        if (obj instanceof String) {
            String trim = ((String) obj).trim();
            if ("true".equalsIgnoreCase(trim)) {
                return false;
            }
            return "false".equalsIgnoreCase(trim) || trim.length() <= 0;
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() == 0;
        } else if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        } else if (obj instanceof List) {
            return ((List) obj).isEmpty();
        } else if (!obj.getClass().isArray()) {
            return (obj instanceof Map) && ((Map) obj).isEmpty();
        } else {
            try {
                return Array.getLength(obj) <= 0;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
