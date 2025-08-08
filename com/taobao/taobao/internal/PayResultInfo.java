package com.taobao.taobao.internal;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.riy;

/* loaded from: classes8.dex */
public class PayResultInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHARE_TYPE = "share_pp";
    private static final String SIGN_AGREEMENT_NO = "sign_agreement_no";
    private static final String SIGN_AGREEMENT_SWITCH = "sign_agreement_switch";
    public String alipayResult;
    public String alipaySignResp;
    public ExtendInfo extendInfo;
    public String extendInfoStr;
    public String from;
    public String memo;
    public String openTime;
    public PayRequest payRequest;
    public String renderTime;
    public Result result;
    public String resultStatus;
    public String resultString;
    public SharePayData sharePayData;

    /* loaded from: classes8.dex */
    public static class ExtendInfo implements Serializable {
        public Long payerUserId;
        public String sharepayData;
    }

    /* loaded from: classes8.dex */
    public static class Result implements Serializable {
        public String biz_type;
    }

    /* loaded from: classes8.dex */
    public static class SharePayData implements Serializable {
        public String action;
        public String amount;
        public String desc;
        public String payurl;
    }

    public PayResultInfo(String str, String str2, PayRequest payRequest) {
        this.resultStatus = str;
        this.resultString = str2;
        this.payRequest = payRequest;
    }

    public PayResultInfo(String str, String str2, String str3, PayRequest payRequest) {
        this.resultStatus = str;
        this.memo = str2;
        this.resultString = str3;
        this.payRequest = payRequest;
        this.alipayResult = "{\"result\":\"" + str3 + "\",\"memo\":\"" + str2 + "\",\"ResultStatus\":\"" + str + "\"" + riy.BLOCK_END_STR;
    }

    public PayResultInfo(Intent intent) {
        String[] split;
        try {
            this.resultStatus = intent.getStringExtra("resultStatus");
            this.memo = intent.getStringExtra("memo");
            this.resultString = intent.getStringExtra("result");
            this.openTime = intent.getStringExtra(MspGlobalDefine.OPEN_TIME);
            this.extendInfoStr = intent.getStringExtra(MspGlobalDefine.EXTENDINFO);
            this.renderTime = intent.getStringExtra("renderTime");
            this.alipayResult = "{\"result\":\"" + this.resultString + "\",\"memo\":\"" + this.memo + "\",\"ResultStatus\":\"" + this.resultStatus + "\"" + riy.BLOCK_END_STR;
            if (!StringUtils.isEmpty(this.resultString)) {
                try {
                    this.result = (Result) JSON.parseObject(this.resultString, Result.class);
                } catch (Exception e) {
                    PayResultInfo.class.getSimpleName();
                    String str = "Result parse error!=" + e.getMessage();
                }
            }
            if (this.result == null && !StringUtils.isEmpty(this.resultString) && this.resultString.contains(SIGN_AGREEMENT_SWITCH)) {
                this.alipaySignResp = "";
                for (String str2 : this.resultString.split("&")) {
                    if (!StringUtils.isEmpty(str2) && (str2.contains(SIGN_AGREEMENT_SWITCH) || str2.contains(SIGN_AGREEMENT_NO))) {
                        if (StringUtils.isEmpty(this.alipaySignResp)) {
                            this.alipaySignResp = str2;
                        } else {
                            this.alipaySignResp += "&" + str2;
                        }
                    }
                }
            }
            if (intent.getExtras() == null || this.result == null || !SHARE_TYPE.equals(this.result.biz_type)) {
                return;
            }
            String string = intent.getExtras().getString(MspGlobalDefine.EXTENDINFO);
            if (!StringUtils.isEmpty(string)) {
                this.extendInfo = (ExtendInfo) JSON.parseObject(string, ExtendInfo.class);
            }
            if (this.extendInfo == null || StringUtils.isEmpty(this.extendInfo.sharepayData)) {
                return;
            }
            this.sharePayData = (SharePayData) JSON.parseObject(this.extendInfo.sharepayData, SharePayData.class);
        } catch (Exception e2) {
            PayResultInfo.class.getSimpleName();
            String str3 = "Result parse error!=" + e2.getMessage();
        }
    }

    public boolean isShareType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("541aa2ba", new Object[]{this})).booleanValue() : isShareMsmType() || isSharePayType();
    }

    public boolean isShareMsmType() {
        ExtendInfo extendInfo;
        SharePayData sharePayData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66e3f57", new Object[]{this})).booleanValue();
        }
        if (this.result != null && (extendInfo = this.extendInfo) != null && extendInfo.payerUserId != null && 0 != this.extendInfo.payerUserId.longValue() && (sharePayData = this.sharePayData) != null && !StringUtils.isEmpty(sharePayData.payurl)) {
            return SHARE_TYPE.equals(this.result.biz_type);
        }
        return false;
    }

    public boolean isSharePayType() {
        SharePayData sharePayData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b279778", new Object[]{this})).booleanValue();
        }
        if (this.result != null && this.extendInfo != null && (sharePayData = this.sharePayData) != null && !StringUtils.isEmpty(sharePayData.payurl)) {
            return SHARE_TYPE.equals(this.result.biz_type);
        }
        return false;
    }
}
