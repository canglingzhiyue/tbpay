package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.a;
import com.taobao.tao.remotebusiness.login.h;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes9.dex */
public class rzz implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOGIN_CANCEL = 911103;
    public static final int LOGIN_FAILED = 911102;
    public static final int LOGIN_SUCCESS = 911101;
    public static final int LOGIN_TIMEOUT = 911104;

    /* renamed from: a  reason: collision with root package name */
    private static volatile rzy f33447a;

    public static rzy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rzy) ipChange.ipc$dispatch("f0a500d", new Object[0]);
        }
        if (f33447a == null) {
            synchronized (rzz.class) {
                if (f33447a == null) {
                    f33447a = new rzy();
                }
            }
        }
        return f33447a;
    }

    @Override // com.taobao.tao.remotebusiness.a
    public void a(int i, Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1759334", new Object[]{this, new Integer(i), mtop});
            return;
        }
        switch (i) {
            case 911101:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login success");
                }
                a().a(mtop);
                return;
            case 911102:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login failed");
                }
                a().a(mtop, "SSRE_LOGIN_FAIL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
                return;
            case 911103:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login cancel");
                }
                a().a(mtop, "SSRE_LOGIN_CANCEL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_CANCEL);
                return;
            case 911104:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "login timeout");
                }
                if (!h.a(mtop, (String) null)) {
                    return;
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("ssr.SsrRequestPoolManager", "Session valid, Broadcast may missed!");
                }
                a().a(mtop);
                return;
            default:
                return;
        }
    }
}
