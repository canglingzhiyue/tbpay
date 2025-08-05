package tb;

import com.alibaba.android.split.access.AbstractAccessSplitDetector;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class bid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f25921a;

    static {
        kge.a(-1509919413);
        f25921a = new ArrayList();
        try {
            f25921a = Arrays.asList(((AbstractAccessSplitDetector) Class.forName("com.alibaba.android.split.access.AccessSplitDetectorImpl").newInstance()).getAccessClasses());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : f25921a.contains(str);
    }
}
