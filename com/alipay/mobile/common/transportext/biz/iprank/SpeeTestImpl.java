package com.alipay.mobile.common.transportext.biz.iprank;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.iprank.mng.speedtest.BaseSpeedTest;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData;
import com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestManager;

/* loaded from: classes3.dex */
public class SpeeTestImpl implements BaseSpeedTest {
    public int getPriority() {
        return 100;
    }

    public boolean isActivate() {
        return true;
    }

    public int speedTest(String str, int i) {
        try {
            SpeedTestLinkData diagnoseByLink = SpeedTestManager.instance().diagnoseByLink(str, false);
            if (TextUtils.equals(diagnoseByLink.result, "y")) {
                return (int) diagnoseByLink.connTime;
            }
            int i2 = diagnoseByLink.errCode;
            if (i2 != -1 && i2 != -2) {
                LogCatUtil.debug("IPR_SpeeTestImpl", "speedTest fail,ip: " + str);
                return -1;
            }
            LogCatUtil.error("IPR_SpeeTestImpl", "speedTest fake wifi,ip: " + str);
            return -1000;
        } catch (Exception e) {
            LogCatUtil.error("IPR_SpeeTestImpl", "SpeeTestImpl exception", e);
            return -1;
        }
    }
}
