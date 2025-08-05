package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class nmu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 29;
    public static final int CANCELLATION = 8;
    public static final int FAILURE = 16;
    public static final int LAST_RESULT = 2;
    public static final int NEW_RESULT = 1;
    public static final int PROGRESS_UPDATE = 4;
    public static final int SKIP = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f31579a;

    public nmu(int i) {
        this.f31579a = i;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : (i & this.f31579a) > 0;
    }
}
