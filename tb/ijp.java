package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class ijp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_COMBINED_RESOLVE = "combined_resolve";
    public static final String FROM_EXIST = "exist";
    public static final String FROM_LAST_CACHE = "cache";
    public static final String FROM_RESOLVE = "resolve";
    public static final String FROM_RESTRICTIVE = "restrictive";

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : ikw.a((CharSequence) str, (CharSequence) FROM_EXIST) || ikw.a((CharSequence) str, (CharSequence) "cache") || ikw.a((CharSequence) str, (CharSequence) FROM_RESTRICTIVE);
    }
}
