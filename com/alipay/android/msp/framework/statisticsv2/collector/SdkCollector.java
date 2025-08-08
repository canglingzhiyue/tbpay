package com.alipay.android.msp.framework.statisticsv2.collector;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class SdkCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f4857a = "";
    private static String b = "";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if (r6.equals("com.alipay.weibopay") != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String collectData(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.SdkCollector.collectData(java.lang.String):java.lang.String");
    }

    private static String a() {
        IChannelInfo channelInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (StringUtils.isEmpty(b)) {
            MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
            b = ((sdkInstance == null || (channelInfo = sdkInstance.getChannelInfo()) == null) ? "com.alipay.quickpay" : channelInfo.getApiName()).toLowerCase(Locale.CHINA);
        }
        return b;
    }

    private static synchronized String b() {
        synchronized (SdkCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            String str = Grammar.ATTR_DEFAULT_VALUE;
            String string = PrefUtils.getString(PersistStorage.FILE_STATISTICS_V2, "seqFirstTime", "");
            Integer num = PrefUtils.getInt(PersistStorage.FILE_STATISTICS_V2, "seqCount", 0);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() + 1 <= 0 || StringUtils.isEmpty(string)) {
                string = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() + 1);
            String str2 = string + Constants.WAVE_SEPARATOR + valueOf;
            PrefUtils.putString(PersistStorage.FILE_STATISTICS_V2, "seqFirstTime", string);
            PrefUtils.putInt(PersistStorage.FILE_STATISTICS_V2, "seqCount", valueOf);
            return str2;
        }
    }
}
