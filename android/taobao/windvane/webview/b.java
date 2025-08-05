package android.taobao.windvane.webview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CORE_FAILED_CUSTOM_START = 1000;
    public static final int CORE_FAILED_TYPE_ARCH_X86_NOT_SUPPORT = 4;
    public static final int CORE_FAILED_TYPE_PARAM_INVALID = 1;
    public static final int CORE_FAILED_TYPE_UC_CORE_INIT_U4_ERROR = 7;
    public static final int CORE_FAILED_TYPE_UC_CORE_NO_INIT_METHOD = 6;
    public static final int CORE_FAILED_TYPE_UC_CORE_PROCESS_NO_INIT = 5;
    public static final int CORE_FAILED_TYPE_UC_CORE_WINDVANE = 8;
    public static final int CORE_FAILED_TYPE_UC_DISABLED = 2;
    public static final int CORE_FAILED_TYPE_UC_DOWNLOAD_FAIL = 3;

    static {
        kge.a(336129356);
    }

    public void onUCCoreInitFailed(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c7d7d8", new Object[]{this, cVar});
        }
    }
}
