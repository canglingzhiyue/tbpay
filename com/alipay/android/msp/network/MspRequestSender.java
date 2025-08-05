package com.alipay.android.msp.network;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MspRequestSender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MspTradeContext f4919a;

    /* renamed from: com.alipay.android.msp.network.MspRequestSender$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4921a = new int[Protocol.values().length];

        static {
            try {
                f4921a[Protocol.RPC_V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4921a[Protocol.RPC_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4921a[Protocol.RPC_V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4921a[Protocol.RPC_SDK_V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4921a[Protocol.HTTP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static /* synthetic */ MspTradeContext a(MspRequestSender mspRequestSender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("fd4c8892", new Object[]{mspRequestSender}) : mspRequestSender.f4919a;
    }

    public MspRequestSender(MspTradeContext mspTradeContext) {
        LogUtil.record(2, "MspRequestSender", "MspRequestSender", String.format("constructed with %s", mspTradeContext));
        this.f4919a = mspTradeContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024e A[Catch: Throwable -> 0x0362, TryCatch #5 {Throwable -> 0x0362, blocks: (B:98:0x0210, B:117:0x0254, B:124:0x0282, B:128:0x0293, B:127:0x028f, B:112:0x0246, B:115:0x024e), top: B:231:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262 A[Catch: Throwable -> 0x0241, TRY_ENTER, TryCatch #4 {Throwable -> 0x0241, blocks: (B:106:0x022f, B:108:0x0237, B:119:0x0262, B:121:0x026c, B:100:0x021f), top: B:229:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028f A[Catch: Throwable -> 0x0362, TryCatch #5 {Throwable -> 0x0362, blocks: (B:98:0x0210, B:117:0x0254, B:124:0x0282, B:128:0x0293, B:127:0x028f, B:112:0x0246, B:115:0x024e), top: B:231:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0397 A[Catch: Throwable -> 0x0419, TryCatch #14 {Throwable -> 0x0419, blocks: (B:183:0x0378, B:186:0x037f, B:187:0x0386, B:189:0x0397, B:191:0x03a4, B:193:0x03a8, B:196:0x03b1, B:198:0x03b5, B:200:0x03b9, B:203:0x03be, B:205:0x03f1, B:207:0x03f5, B:209:0x0401, B:211:0x0412, B:204:0x03d8), top: B:247:0x0378 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b5 A[Catch: Throwable -> 0x0419, TryCatch #14 {Throwable -> 0x0419, blocks: (B:183:0x0378, B:186:0x037f, B:187:0x0386, B:189:0x0397, B:191:0x03a4, B:193:0x03a8, B:196:0x03b1, B:198:0x03b5, B:200:0x03b9, B:203:0x03be, B:205:0x03f1, B:207:0x03f5, B:209:0x0401, B:211:0x0412, B:204:0x03d8), top: B:247:0x0378 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03f5 A[Catch: Throwable -> 0x0419, TryCatch #14 {Throwable -> 0x0419, blocks: (B:183:0x0378, B:186:0x037f, B:187:0x0386, B:189:0x0397, B:191:0x03a4, B:193:0x03a8, B:196:0x03b1, B:198:0x03b5, B:200:0x03b9, B:203:0x03be, B:205:0x03f1, B:207:0x03f5, B:209:0x0401, B:211:0x0412, B:204:0x03d8), top: B:247:0x0378 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0436 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[Catch: Throwable -> 0x041b, TRY_ENTER, TryCatch #1 {Throwable -> 0x041b, blocks: (B:7:0x003c, B:10:0x0065, B:12:0x006b, B:24:0x008d, B:26:0x009d, B:29:0x00a4, B:31:0x00aa, B:45:0x00e4, B:47:0x00e8, B:49:0x00ec, B:52:0x00f1, B:54:0x0124, B:55:0x012b, B:53:0x010b, B:32:0x00af, B:34:0x00b5, B:35:0x00ba, B:37:0x00c0, B:38:0x00c5, B:40:0x00cb, B:41:0x00d0, B:42:0x00db, B:14:0x006f, B:16:0x0075, B:17:0x0078, B:19:0x007e, B:20:0x0081, B:22:0x0087, B:23:0x008a), top: B:223:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202 A[Catch: Throwable -> 0x01c5, TRY_LEAVE, TryCatch #6 {Throwable -> 0x01c5, blocks: (B:82:0x01b2, B:89:0x01ea, B:91:0x01ee, B:93:0x01f4, B:95:0x0202), top: B:233:0x01b2 }] */
    /* JADX WARN: Type inference failed for: r8v14, types: [long] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alipay.android.msp.network.model.NetRequestData r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.MspRequestSender.a(com.alipay.android.msp.network.model.NetRequestData, boolean):void");
    }

    private ResData a(ReqData reqData, Protocol protocol, int i, RequestConfig requestConfig) throws Exception {
        StEvent stEvent;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("8beef2b4", new Object[]{this, reqData, protocol, new Integer(i), requestConfig});
        }
        if (requestConfig != null) {
            try {
                if (requestConfig.isFirstRequest()) {
                    PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_doSendReqData");
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        ResData resData = null;
        if (requestConfig != null) {
            stEvent = requestConfig.getStatisticEvent();
            if (stEvent != null) {
                stEvent.onStatistic("actionType", requestConfig.getMiniDispatchType());
            }
        } else {
            stEvent = null;
        }
        if (requestConfig != null && requestConfig.isFirstRequest()) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_doSendReqData");
        }
        int i2 = AnonymousClass2.f4921a[protocol.ordinal()];
        if (i2 == 1) {
            resData = a(reqData, i, stEvent);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            if (requestConfig != null && requestConfig.isFirstRequest()) {
                z = true;
            }
            resData = a(reqData, i, z, stEvent);
        } else if (i2 != 5) {
            throw new RuntimeException("Unknown protocol: ".concat(String.valueOf(protocol)));
        } else {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null && tradeContextByBizId.getTradeLogicData() != null) {
                resData = PluginManager.getTransChannel().requestData(reqData, tradeContextByBizId.getTradeLogicData().getRequestConfig());
            }
        }
        if (resData != null) {
            resData.mReqData = reqData;
        }
        return resData;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:22|23|(3:104|105|(18:107|(1:27)|61|62|63|64|65|66|67|68|69|(2:74|(1:76)(5:77|78|79|80|81))|85|(1:90)|91|17|(1:20)|21))|25|(0)|61|62|63|64|65|66|67|68|69|(3:71|74|(0)(0))|85|(2:87|90)|91|17|(1:20)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ce, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d0, code lost:
        r0 = com.alipay.android.msp.core.context.MspContextManager.getInstance().getTradeContextByBizId(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01da, code lost:
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dc, code lost:
        r0.setSubmitState(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
        r18 = com.alipay.android.msp.constants.MspFlybirdDefine.SYNC_MUTEX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
        r18 = com.alipay.android.msp.constants.MspFlybirdDefine.SYNC_MUTEX;
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0140, code lost:
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016f, code lost:
        com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet().endSpiderSection(com.alipay.android.msp.constants.MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_doMsgSourceFetchRpcV2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
        r23.onStatistic(com.alipay.android.msp.framework.statisticsv2.model.StEvent.NET_COST, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0182, code lost:
        r0 = com.alibaba.fastjson.JSON.parseObject(r16.getRequestConfig().getActionJson());
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
        if (r0.containsKey(r4) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0196, code lost:
        r5 = com.alipay.android.msp.core.context.MspContextManager.getInstance().getMspContextByBizId(r16.getRequestConfig().getBizId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
        if (r0.getBooleanValue(r4) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ac, code lost:
        if (r5 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
        if (r5.getMspNetHandler().isShowSyncPayResult() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
        if (r19.f4919a != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c4, code lost:
        if (r19.f4919a.isExit() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c8, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: Throwable -> 0x0084, TRY_LEAVE, TryCatch #5 {Throwable -> 0x0084, blocks: (B:20:0x0075, B:27:0x008d), top: B:116:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd A[Catch: Throwable -> 0x013b, TryCatch #0 {Throwable -> 0x013b, blocks: (B:41:0x00d7, B:43:0x00dd, B:46:0x00e9, B:49:0x010a, B:52:0x0115, B:55:0x0119, B:57:0x011f, B:60:0x0126, B:61:0x0132, B:40:0x00d4), top: B:107:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a A[Catch: Throwable -> 0x013b, TRY_LEAVE, TryCatch #0 {Throwable -> 0x013b, blocks: (B:41:0x00d7, B:43:0x00dd, B:46:0x00e9, B:49:0x010a, B:52:0x0115, B:55:0x0119, B:57:0x011f, B:60:0x0126, B:61:0x0132, B:40:0x00d4), top: B:107:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f A[Catch: Throwable -> 0x013b, TryCatch #0 {Throwable -> 0x013b, blocks: (B:41:0x00d7, B:43:0x00dd, B:46:0x00e9, B:49:0x010a, B:52:0x0115, B:55:0x0119, B:57:0x011f, B:60:0x0126, B:61:0x0132, B:40:0x00d4), top: B:107:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alipay.android.msp.network.model.ResData<java.util.Map<java.lang.String, java.lang.String>> a(com.alipay.android.msp.network.model.ReqData<java.util.Map<java.lang.String, java.lang.String>> r20, int r21, boolean r22, com.alipay.android.msp.framework.statisticsv2.model.StEvent r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.MspRequestSender.a(com.alipay.android.msp.network.model.ReqData, int, boolean, com.alipay.android.msp.framework.statisticsv2.model.StEvent):com.alipay.android.msp.network.model.ResData");
    }

    private static ResData<Map<String, String>> a(ReqData<Map<String, String>> reqData, int i, StEvent stEvent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("dac0455e", new Object[]{reqData, new Integer(i), stEvent});
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null && tradeContextByBizId.getTradeLogicData() != null) {
                return PluginManager.getPbChannel().requestByPbv1(reqData, tradeContextByBizId.getTradeLogicData().getRequestConfig());
            }
            return null;
        } catch (Throwable th) {
            if (stEvent != null) {
                stEvent.onStatistic(StEvent.NET_COST, "");
            }
            throw th;
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<MspRequestSender of trade %s>", Integer.valueOf(this.f4919a.getBizId()));
    }
}
