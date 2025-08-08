package com.alipay.android.msp.framework.statisticsv2.collector;

import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TradeCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_PAY_AND_SIGN_FROM_OUT_SDK = "payandsign_sdk";
    public static final String KEY_BIZ_TYPE = "biz_type";
    public static final String KEY_TRADE_NO = "trade_no";
    public static final String KEY_TRADE_OUT_TRADE_NO = "out_trade_no";
    public static final String KEY_TRADE_PARTNER = "partner";

    /* renamed from: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MspTradeContext f4858a;
        public final /* synthetic */ String b;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f4858a.getContext(), this.b, 1).show();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.equals("outTradeNo") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String collectData(java.lang.String r6, int r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r2] = r6
            java.lang.String r6 = "ae92bc42"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L1d:
            java.lang.String r0 = com.alipay.android.msp.framework.statisticsv2.Grammar.ATTR_DEFAULT_VALUE
            r1 = -1
            int r5 = r6.hashCode()
            switch(r5) {
                case -1795632125: goto L68;
                case -1205441776: goto L5d;
                case -1067371963: goto L52;
                case -786908336: goto L47;
                case -457119977: goto L3d;
                case -97599763: goto L33;
                case 202511836: goto L28;
                default: goto L27;
            }
        L27:
            goto L73
        L28:
            java.lang.String r2 = "processTime"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 4
            goto L74
        L33:
            java.lang.String r2 = "bizType"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 5
            goto L74
        L3d:
            java.lang.String r3 = "outTradeNo"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L73
            goto L74
        L47:
            java.lang.String r2 = "payerId"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 2
            goto L74
        L52:
            java.lang.String r2 = "tradeNo"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 0
            goto L74
        L5d:
            java.lang.String r2 = "outTradeType"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 6
            goto L74
        L68:
            java.lang.String r2 = "partnerId"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L73
            r2 = 3
            goto L74
        L73:
            r2 = -1
        L74:
            switch(r2) {
                case 0: goto L96;
                case 1: goto L91;
                case 2: goto L8c;
                case 3: goto L87;
                case 4: goto L82;
                case 5: goto L7d;
                case 6: goto L78;
                default: goto L77;
            }
        L77:
            goto L9a
        L78:
            java.lang.String r0 = f(r7)
            goto L9a
        L7d:
            java.lang.String r0 = getBizType(r7)
            goto L9a
        L82:
            java.lang.String r0 = e(r7)
            goto L9a
        L87:
            java.lang.String r0 = d(r7)
            goto L9a
        L8c:
            java.lang.String r0 = c(r7)
            goto L9a
        L91:
            java.lang.String r0 = b(r7)
            goto L9a
        L96:
            java.lang.String r0 = a(r7)
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.collectData(java.lang.String, int):java.lang.String");
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            return (mspContextByBizId == null || StringUtils.isEmpty(mspContextByBizId.getTradeNo())) ? str : mspContextByBizId.getTradeNo();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String str2 = tradeContextByBizId.getOrderInfoMap().get("out_trade_no");
            try {
                String str3 = !StringUtils.isEmpty(tradeContextByBizId.getOrderInfoMap().get("ord_id_ext")) ? tradeContextByBizId.getOrderInfoMap().get("ord_id_ext") : str2;
                return (!StringUtils.isEmpty(str3) || tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT) == null) ? str3 : new JSONObject(URLDecoder.decode(tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT), "utf-8")).optString("out_trade_no", Grammar.ATTR_DEFAULT_VALUE);
            } catch (Throwable th) {
                th = th;
                str = str2;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            return tradeContextByBizId != null ? tradeContextByBizId.getOrderInfoMap().get("user_id") : str;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }

    private static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String str2 = tradeContextByBizId.getOrderInfoMap().get("partner");
            try {
                return (!StringUtils.isEmpty(str2) || tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT) == null) ? str2 : new JSONObject(URLDecoder.decode(tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT), "utf-8")).optString("seller_id", Grammar.ATTR_DEFAULT_VALUE);
            } catch (Throwable th) {
                th = th;
                str = str2;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92b0f69", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspContextManager.getInstance().getTradeContextByBizId(i);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
        if (r9.contains("out_trade_no") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getBizType(int r11) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.getBizType(int):java.lang.String");
    }

    private static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ca8aa", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String orderInfo = tradeContextByBizId.getOrderInfo();
            return orderInfo.contains("h5_route_token") ? "3" : orderInfo.contains("and_lite") ? orderInfo.contains(MspGlobalDefine.H5_TO_NATIVE) ? "2" : "1" : str;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }
}
