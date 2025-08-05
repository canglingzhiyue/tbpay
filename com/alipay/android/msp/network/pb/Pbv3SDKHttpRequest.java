package com.alipay.android.msp.network.pb;

import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.network.pb.v3.MspReqV3;
import com.alipay.android.msp.network.pb.v3.MspResV3;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.GzipUtils;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.net.LogicHeaderUtil;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Pbv3SDKHttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PBV3_GZIP_LIMIT = 160;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4939a = false;

    public ResData<Map<String, String>> requestData(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("124352d3", new Object[]{this, reqData, requestConfig});
        }
        ReqData<byte[]> reqData2 = new ReqData<>(a(reqData.toMapData()));
        reqData2.mBizId = reqData.mBizId;
        reqData2.mHeaders = LogicHeaderUtil.generatePbv3Headers(reqData.toMapData(), this.f4939a);
        ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(reqData2, requestConfig);
        String header = requestData.getHeader(MspNetConstants.Request.MSP_PARAM);
        ResData<Map<String, String>> resData = new ResData<>(a(requestData.toBytesData(), header));
        int i = reqData.mBizId;
        try {
            String str = resData.mData.get("trade_no");
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null) {
                if (!TextUtils.isEmpty(str)) {
                    tradeContextByBizId.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", str);
                } else {
                    String tradeNo = OrderInfoUtil.getTradeNo(tradeContextByBizId);
                    if (!TextUtils.isEmpty(tradeNo)) {
                        tradeContextByBizId.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", tradeNo);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    tradeContextByBizId.updateTradeNo(str);
                }
            }
            StEvent statisticEvent = requestConfig.getStatisticEvent();
            if (statisticEvent != null) {
                statisticEvent.onStatistic("actionType", "http_pbv3");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        resData.mStatusCode = requestData.mStatusCode;
        resData.mHeaders = requestData.mHeaders;
        resData.mReqData = requestData.mReqData;
        if (!TextUtils.isEmpty(header)) {
            try {
                for (String str2 : header.split(";")) {
                    if (str2.startsWith("user_id=")) {
                        String substring = str2.substring(8);
                        if (TextUtils.isEmpty(substring)) {
                            break;
                        }
                        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                        if (mspContextByBizId != null) {
                            mspContextByBizId.getStatisticInfo().updateAttr(Vector.Id, "userId", substring);
                        }
                        LoggerFactory.getLogContext().setUserId(substring);
                    }
                }
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
        return resData;
    }

    private static Map<String, String> a(byte[] bArr, String str) throws NetErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6363dae", new Object[]{bArr, str});
        }
        try {
            MspResV3 mspResV3 = (MspResV3) PluginManager.getProtobufCodec().deserialize(MspResV3.class, bArr);
            HashMap hashMap = new HashMap();
            hashMap.put("code", mspResV3.code);
            hashMap.put("err_msg", mspResV3.err_msg);
            hashMap.put("memo", mspResV3.memo);
            hashMap.put("result", mspResV3.result);
            hashMap.put("end_code", mspResV3.end_code);
            hashMap.put("synch", mspResV3.synch);
            hashMap.put("mspParam", str);
            hashMap.put("trade_no", mspResV3.trade_no);
            if (mspResV3.wpage != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(mspResV3.wpage);
                hashMap.put("wpage", sb.toString());
            }
            if (mspResV3.noBack != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(mspResV3.noBack);
                hashMap.put(MspFlybirdDefine.FLYBIRD_NOBACK, sb2.toString());
            }
            hashMap.put(MspGlobalDefine.UNAME, mspResV3.uname);
            hashMap.put(MspGlobalDefine.UURL, mspResV3.uurl);
            hashMap.put("tpl", mspResV3.tpl);
            hashMap.put("data", mspResV3.data);
            if (mspResV3.time != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(mspResV3.time);
                hashMap.put("time", sb3.toString());
            }
            if (mspResV3.uac != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(mspResV3.uac);
                hashMap.put(MspGlobalDefine.UAC, sb4.toString());
            }
            if (mspResV3.dg != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(mspResV3.dg);
                hashMap.put("dg", sb5.toString());
            }
            hashMap.put("wnd", mspResV3.wnd);
            hashMap.put("page", mspResV3.page);
            hashMap.put(MspGlobalDefine.SESSION, mspResV3.session);
            hashMap.put("tid", mspResV3.tid);
            hashMap.put(MspFlybirdDefine.FLYBIRD_CLIENT_KEY, mspResV3.client_key);
            if (mspResV3.ajax != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(mspResV3.ajax);
                hashMap.put(MspFlybirdDefine.FLYBIRD_AJAX, sb6.toString());
            }
            if (mspResV3.iajax != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(mspResV3.iajax);
                hashMap.put("iajax", sb7.toString());
            }
            if (mspResV3.uname != null) {
                hashMap.put(MspGlobalDefine.UNAME, mspResV3.uname);
            }
            if (mspResV3.uurl != null) {
                hashMap.put(MspGlobalDefine.UURL, mspResV3.uurl);
            }
            hashMap.put(MspFlybirdDefine.FLYBIRD_ONLOAD, mspResV3.onload);
            hashMap.put("user_id", mspResV3.user_id);
            hashMap.put(MspFlybirdDefine.FLYBIRD_PKEY, mspResV3.pkey);
            hashMap.put(MspFlybirdDefine.EXTINFO, mspResV3.extinfo);
            JsonUtil.addExtInfo(mspResV3.extinfo, hashMap);
            String str2 = mspResV3.tplid;
            if (TextUtils.equals(str2, "0")) {
                str2 = "QUICKPAY@cashier-pre-confirm-flex";
            } else if (TextUtils.equals(str2, "1")) {
                str2 = MspFlybirdDefine.CASHIER_CHANNEL_LOGO_TPL;
            } else if (TextUtils.equals(str2, "2")) {
                str2 = "QUICKPAY@frontpay-channel-logo-flex";
            } else if (TextUtils.equals(str2, "3")) {
                str2 = MspFlybirdDefine.FLYBIRD_RESULT_TPL;
            }
            hashMap.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, str2);
            if (mspResV3.tplv2 != null) {
                hashMap.put("tpl", mspResV3.tplv2.format(str2));
            }
            if (mspResV3.preConfirm != null) {
                hashMap.put("data", mspResV3.preConfirm.format());
            } else if (mspResV3.channelLogo != null) {
                hashMap.put("data", mspResV3.channelLogo.format(mspResV3.tplid.equals("2")));
            }
            LogUtil.record(2, "", "Pbv3DataRequest::parseFromMspRes", "resultMap:" + hashMap.toString());
            return hashMap;
        } catch (Throwable th) {
            PluginManager.getTransChannel().shutdown();
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, "PbV3DeserializeEx", th);
            NetErrorException netErrorException = new NetErrorException("人气太旺啦，稍候再试试。");
            netErrorException.setStatErrorCode(301);
            throw netErrorException;
        }
    }

    private byte[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ee003260", new Object[]{this, map});
        }
        byte[] bArr = null;
        try {
            bArr = PluginManager.getProtobufCodec().serialize(b(map));
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, "PbV3SerializeEx", th);
        }
        if (bArr == null || bArr.length <= 160) {
            return bArr;
        }
        try {
            bArr = GzipUtils.toGzip(bArr);
            this.f4939a = true;
            return bArr;
        } catch (Throwable th2) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, "PbV3GzipEx", th2);
            return bArr;
        }
    }

    private static MspReqV3 b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspReqV3) ipChange.ipc$dispatch("6edd67ca", new Object[]{map});
        }
        MspReqV3 mspReqV3 = new MspReqV3();
        mspReqV3.api_nsp = map.get("api_nsp");
        mspReqV3.api_nm = map.get("api_nm");
        mspReqV3.action = map.get("action");
        mspReqV3.synch = map.get("synch");
        mspReqV3.decay = map.get(MspGlobalDefine.DECAY);
        mspReqV3.external_info = map.get(MspGlobalDefine.EXTERNAL_INFO);
        mspReqV3.user_id = map.get("user_id");
        mspReqV3.session = map.get(MspGlobalDefine.SESSION);
        mspReqV3.trid = map.get(MspGlobalDefine.TRID);
        try {
            if (!TextUtils.isEmpty(map.get(MspFlybirdDefine.TRDFROM))) {
                mspReqV3.trdfrom = Integer.valueOf(Integer.parseInt(map.get(MspFlybirdDefine.TRDFROM)));
            }
        } catch (NumberFormatException e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            if (!TextUtils.isEmpty(map.get(MspFlybirdDefine.FLYBIRD_LOGIN))) {
                mspReqV3.locLoginOnce = Integer.valueOf(Integer.parseInt(map.get(MspFlybirdDefine.FLYBIRD_LOGIN)));
            }
        } catch (NumberFormatException e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        try {
            if (!TextUtils.isEmpty(map.get("hasAlipay"))) {
                mspReqV3.hasAlipay = Integer.valueOf(Integer.parseInt(map.get("hasAlipay")));
            }
            if (!TextUtils.isEmpty(map.get(MspGlobalDefine.CERTPAY))) {
                mspReqV3.certpay = Integer.valueOf(Integer.parseInt(map.get(MspGlobalDefine.CERTPAY)));
            }
        } catch (NumberFormatException e3) {
            LogUtil.printExceptionStackTrace(e3);
        }
        mspReqV3.subua1 = map.get("subua1");
        mspReqV3.subua2 = map.get("subua2");
        mspReqV3.subua3 = map.get("subua3");
        mspReqV3.app_key = map.get(MspGlobalDefine.APP_KEY);
        mspReqV3.extinfo = map.get(MspFlybirdDefine.EXTINFO);
        mspReqV3.secData = map.get("secData");
        return mspReqV3;
    }
}
