package tb;

import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iyj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.SNSBusiness";

    /* renamed from: a  reason: collision with root package name */
    private static iyj f29411a;

    private iyj() {
    }

    public static iyj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyj) ipChange.ipc$dispatch("f063324", new Object[0]);
        }
        if (f29411a == null) {
            synchronized (iyj.class) {
                if (f29411a == null) {
                    f29411a = new iyj();
                }
            }
        }
        return f29411a;
    }

    public void a(SNSSignInAccount sNSSignInAccount, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347717a", new Object[]{this, sNSSignInAccount, rpcRequestCallback});
        } else if (sNSSignInAccount == null) {
        } else {
            LoginBaseParam loginBaseParam = new LoginBaseParam();
            loginBaseParam.snsType = sNSSignInAccount.snsType;
            loginBaseParam.snsTrustLoginToken = sNSSignInAccount.token;
            UserLoginServiceImpl.getInstance().snslogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
