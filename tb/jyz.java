package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* loaded from: classes6.dex */
public final class jyz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jyz INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static String f29875a;

    static {
        kge.a(2099574354);
        INSTANCE = new jyz();
    }

    private jyz() {
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f29875a;
    }
}
