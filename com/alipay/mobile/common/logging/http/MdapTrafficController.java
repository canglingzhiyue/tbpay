package com.alipay.mobile.common.logging.http;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MdapTrafficController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class MdapTrafficException extends IllegalStateException {
        public MdapTrafficException(String str) {
            super(str);
        }
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
            return;
        }
        String concat = LoggingSPCache.KEY_CUR_UPLOAD_DAY.concat(String.valueOf(str));
        String concat2 = LoggingSPCache.KEY_CUR_UPLOAD_TRAFIC.concat(String.valueOf(str));
        long currentTimeMillis = System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1L);
        long j = LoggingSPCache.getInstance().getLong(concat, 0L);
        String networkType = NetUtil.getNetworkType(context);
        boolean z2 = !TextUtils.isEmpty(networkType);
        boolean isPositiveDiagnose = LogStrategyManager.getInstance().isPositiveDiagnose();
        if (!isPositiveDiagnose && !"WIFI".equals(networkType)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" upload");
        if (currentTimeMillis != j) {
            sb.append(" on the new day");
            LoggingSPCache.getInstance().putLongCommit(concat, currentTimeMillis);
            LoggingSPCache.getInstance().putIntCommit(concat2, 0);
            a(z2, z, concat2, i);
        } else {
            int i2 = LoggingSPCache.getInstance().getInt(concat2, 0);
            int i3 = i2 + i;
            sb.append(", todayByte: ");
            sb.append(i3);
            if (i2 <= 2097152) {
                a(z2, z, concat2, i3);
            } else if (!z) {
                throw new MdapTrafficException(str + " upload trafic limited ! todayByte: " + i2);
            } else {
                LoggerFactory.getTraceLogger().info("MdapTraffic", "checkAndUpdateConsume, do not check by positive.");
            }
        }
        sb.append(", contentPeek: #");
        sb.append("");
        sb.append("#");
        sb.append(", contentSize: ");
        sb.append(i);
        sb.append(", traficByte: ");
        sb.append(i);
        sb.append(", network: ");
        sb.append(networkType);
        sb.append(", connected: ");
        sb.append(z2);
        sb.append(", positive: ");
        sb.append(isPositiveDiagnose);
        LoggerFactory.getTraceLogger().info("MdapTraffic", sb.toString());
    }

    private static void a(boolean z, boolean z2, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df75fc91", new Object[]{new Boolean(z), new Boolean(z2), str, new Integer(i)});
        } else if (!z) {
            LoggerFactory.getTraceLogger().info("MdapTraffic", "doUpdateConsume, do not update by disconnected.");
        } else if (z2) {
            LoggerFactory.getTraceLogger().info("MdapTraffic", "doUpdateConsume, do not update by positive.");
        } else {
            LoggingSPCache.getInstance().putIntCommit(str, i);
        }
    }
}
