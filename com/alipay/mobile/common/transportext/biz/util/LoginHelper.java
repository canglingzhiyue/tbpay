package com.alipay.mobile.common.transportext.biz.util;

import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class LoginHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f5704a = new AtomicBoolean(false);
    private static int b = 0;
    private static long c = -1;

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]) : f5704a;
    }

    public static final boolean tryDoLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb4caa6e", new Object[0])).booleanValue();
        }
        try {
            return UserInfoUtil.login();
        } catch (Exception e) {
            LogCatUtil.error("LoginUtils", e);
            return false;
        }
    }

    public static final void tryLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f2b7f5", new Object[0]);
            return;
        }
        LogCatUtil.info("net_LoginHelper", "session invalid, go to login !");
        if (AppInfoUtil.isBackgroundRunning()) {
            LogCatUtil.info("net_LoginHelper", "Wallet not at front desk. return.");
        } else if (!MiscUtils.isAtFrontDesk(ExtTransportEnv.getAppContext())) {
            LogCatUtil.info("net_LoginHelper", "Wallet not at front desk. return.");
        } else {
            LogCatUtil.info("net_LoginHelper", "Wallet at front desk.");
            if (f5704a.get()) {
                LogCatUtil.info("net_LoginHelper", "doing loging.");
                return;
            }
            f5704a.set(true);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > c) {
                c = currentTimeMillis + 60000;
                b = 1;
                LogCatUtil.debug("net_LoginHelper", "reset inCycleLoginCount");
            } else if (b > 3) {
                LogCatUtil.debug("net_LoginHelper", "login count more than 3");
                return;
            }
            LogCatUtil.debug("net_LoginHelper", " inCycleLoginCount=【“" + b + "”】");
            b = b + 1;
            try {
                NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.util.LoginHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        boolean tryDoLogin = LoginHelper.tryDoLogin();
                        LoginHelper.access$000().set(false);
                        LogCatUtil.debug("net_LoginHelper", "tryDoLogin result=[" + tryDoLogin + riy.ARRAY_END_STR);
                    }
                });
            } catch (Exception e) {
                LogCatUtil.error("net_LoginHelper", e);
                f5704a.set(false);
            }
        }
    }
}
