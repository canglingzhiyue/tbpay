package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.mytaobao.base.c;

/* loaded from: classes7.dex */
public class mxf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f31308a = null;
    public static final String beforeMainApi = "beforeMainApi";
    public static final String beforeOverSeaApi = "beforeOverSeaApi";
    public static final String initSnapshot = "initSnapshot";
    public static final String initView = "initView";
    public static final String initWindWeexBasement = "initWindWeexBasement";
    public static final String outerFragmentOnCreate = "outerFragOnCreate";
    public static final String outerFragmentOnCreateView = "outerFragOnCreateView";
    public static final String outerFragmentOnResume = "outerFragOnResume";
    public static final String processMainData = "processMainData";
    public static final String renderMainApiData = "renderMainApiData";
    public static final String viewInflate = "inflateView";

    static {
        kge.a(-1482015938);
        f31308a = "";
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            f31308a = str;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (c.i()) {
        } else {
            s.f18233a.a(f31308a).a(str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (c.i()) {
        } else {
            s.f18233a.a(f31308a).e(str, null);
        }
    }
}
