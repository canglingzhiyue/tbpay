package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class mna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f31126a = new ArrayList();
    private static final Map<String, Float> b = new HashMap();

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f31126a.add(str);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f31126a.clear();
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && (f31126a.contains(str) || c(str));
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        Float f = b.get(str);
        if (f == null) {
            return false;
        }
        boolean z = new Random(System.currentTimeMillis()).nextFloat() < f.floatValue();
        mpi.c("SamplingConfig", "pageName", str, "computeRandomResult", Boolean.valueOf(z));
        return z;
    }
}
