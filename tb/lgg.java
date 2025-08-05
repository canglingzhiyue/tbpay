package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lgg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String R_EXT_LOAD_MORE_ERROR_TITLE = "loadingErrorTitle";
    public static final String R_EXT_LOAD_MORE_TITLE = "loadingTitle";

    /* renamed from: a  reason: collision with root package name */
    private final String f30561a;
    private final String b;

    static {
        kge.a(443323025);
    }

    public lgg(String str, String str2) {
        this.f30561a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30561a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
