package com.alipay.android.msp.pay.results;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogAgent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import tb.riy;

/* loaded from: classes3.dex */
public class MspPayResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MspTradeContext f4952a;
    private final DynDataWrapper<String> b;
    private final DynDataWrapper<String> c;
    private final DynDataWrapper<String> d;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private JSONObject e = new JSONObject();
    private boolean l = false;
    private final Object k = new Object();
    private String m = "";
    private boolean n = false;

    public MspPayResult(MspTradeContext mspTradeContext) {
        int i = 0;
        this.f4952a = mspTradeContext;
        i = mspTradeContext != null ? mspTradeContext.getBizId() : i;
        this.c = new DynDataWrapper<>(i, "resultStatus", "6001");
        this.d = new DynDataWrapper<>(i, DynConstants.DynDataNames.D_RESULT_RESULT, "");
        this.b = new DynDataWrapper<>(i, DynConstants.DynDataNames.D_RESULT_MEMO, "");
        this.c.write(String.valueOf(ResultStatus.CANCELED.getStatus()));
        this.b.write("");
        this.d.write("");
    }

    public void setHKRawResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5df4591", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String getHkRawResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd09cf0d", new Object[]{this}) : this.i;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : StringUtils.equals(this.c.read(), String.valueOf(ResultStatus.SUCCEEDED.getStatus()));
    }

    public String getEndCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4acb4107", new Object[]{this}) : this.c.read();
    }

    public void setEndCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a068b7", new Object[]{this, str});
            return;
        }
        synchronized (this.k) {
            LogUtil.record(2, "MspPayResult:setEndCode", "endcode=".concat(String.valueOf(str)));
            if (!StringUtils.isEmpty(str)) {
                this.c.write(str);
                this.l = true;
            }
        }
    }

    public String getMemo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29191f49", new Object[]{this}) : this.b.read();
    }

    public void setMemo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8a0a4d", new Object[]{this, str});
        } else {
            this.b.write(str);
        }
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this}) : this.d.read();
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.d.write(str);
        }
    }

    public void setExtendInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be34c9f", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public String getTrade_no() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d9fe647", new Object[]{this}) : this.h;
    }

    public void setTrade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113a3d0f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public boolean isWontCallbackUrlJump() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff8042bb", new Object[]{this})).booleanValue() : this.n;
    }

    public void setWontCallbackUrlJump(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbe4e35", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void setSourceResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0594ab", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void addExtendInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c1e680", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.e = JsonUtil.merge(this.e, jSONObject);
            LogUtil.record(4, "phonecashiermsp#MspPayResult", "MspPayResult.addExtendInfo", "extendInfo:".concat(String.valueOf(jSONObject)));
        }
    }

    public void addExtendInfoByKeyAndValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34a15b4", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return;
        }
        jSONObject.put(str, (Object) str2);
        LogUtil.record(4, "phonecashiermsp#MspPayResult", "MspPayResult.addExtendInfoByKeyAndValue", str + " " + str2);
    }

    public JSONObject getExtendInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b3e5ef85", new Object[]{this}) : this.e;
    }

    public String formatResult(int i) {
        TradeLogicData tradeLogicData;
        TradeLogicData tradeLogicData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2cbc0b8", new Object[]{this, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this.k) {
            MspTradeContext mspTradeContext = this.f4952a;
            String str = null;
            Context context = mspTradeContext != null ? mspTradeContext.getContext() : null;
            if (context != null) {
                str = context.getPackageName();
            }
            if (StringUtils.equals(str, "hk.alipay.wallet") && !StringUtils.isEmpty(this.i)) {
                return this.i;
            }
            if (!StringUtils.isEmpty(this.m)) {
                LogUtil.record(4, "MspPayResult.formatResult", "sourceResult=" + this.m);
                return this.m;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ResultStatus.START_ACTIVITY_FAILED.getStatus());
            if (StringUtils.equals(this.c.read(), sb2.toString())) {
                return "failed";
            }
            if (!this.l) {
                LogUtil.record(4, "MspPayResult:formatResult", "not set endcode, this=".concat(String.valueOf(this)));
                try {
                    if (this.f4952a != null) {
                        this.c.write(this.f4952a.getMspNetHandler().getErrorCode());
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    DynDataWrapper<String> dynDataWrapper = this.c;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ResultStatus.PAY_NETWORK_ERROR.getStatus());
                    dynDataWrapper.write(sb3.toString());
                }
                if (StringUtils.isEmpty(this.c.read())) {
                    DynDataWrapper<String> dynDataWrapper2 = this.c;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(ResultStatus.CANCELED.getStatus());
                    dynDataWrapper2.write(sb4.toString());
                }
                if (StringUtils.isEmpty(this.b.read())) {
                    this.b.write(MspConfig.getInstance().getMemoUserCancel());
                }
                this.l = true;
                if (this.f4952a != null && (tradeLogicData2 = this.f4952a.getTradeLogicData()) != null && !StringUtils.isEmpty(tradeLogicData2.getTradeNo()) && OrderInfoUtil.isCreateOrderRequest(this.f4952a)) {
                    this.h = tradeLogicData2.getTradeNo();
                    LogUtil.record(4, "MspPayResult:formatResultModel", "trade_no=" + this.h);
                }
            } else {
                int indexOf = this.d.read().indexOf(MspGlobalDefine.CALL_BACK_URL);
                if (indexOf != -1) {
                    int indexOf2 = this.d.read().indexOf("\"", indexOf) + 1;
                    int indexOf3 = this.d.read().indexOf("\"", indexOf2);
                    if (indexOf2 > 0 && indexOf3 > indexOf2) {
                        this.g = this.d.read().substring(indexOf2, indexOf3);
                    }
                }
                if (!StringUtils.isEmpty(this.d.read())) {
                    this.d.write(this.d.read().replaceAll("(\".*);(.*\")", "$1-$2"));
                }
                if (this.f4952a != null && this.f4952a.getContext() != null && OrderInfoUtil.isCreateOrderRequest(this.f4952a) && (tradeLogicData = this.f4952a.getTradeLogicData()) != null && !StringUtils.isEmpty(tradeLogicData.getTradeNo())) {
                    this.h = tradeLogicData.getTradeNo();
                }
                long openTime = LogAgent.getOpenTime();
                if (openTime > 0) {
                    this.f = String.valueOf(openTime);
                }
                long renderTime = LogAgent.getRenderTime();
                if (renderTime > 0) {
                    this.j = String.valueOf(renderTime);
                }
            }
            try {
                sb.append("resultStatus={");
                sb.append(this.c.read());
                sb.append(riy.BLOCK_END_STR);
                sb.append(";");
                sb.append("memo={");
                sb.append(this.b.read());
                sb.append(riy.BLOCK_END_STR);
                sb.append(";");
                sb.append("result={");
                sb.append(this.d.read());
                sb.append(riy.BLOCK_END_STR);
                if (!StringUtils.isEmpty(this.g)) {
                    try {
                        if (this.g.startsWith("http%3A%2F%2F") || this.g.startsWith("https%3A%2F%2F")) {
                            this.g = URLDecoder.decode(this.g, "utf-8");
                        }
                    } catch (Exception e2) {
                        LogUtil.printExceptionStackTrace(e2);
                    }
                    sb.append(";callBackUrl={");
                    sb.append(this.g);
                    sb.append(riy.BLOCK_END_STR);
                }
                if (!StringUtils.isEmpty(this.h)) {
                    sb.append(";trade_no={");
                    sb.append(this.h);
                    sb.append(riy.BLOCK_END_STR);
                }
                if (!StringUtils.isEmpty(this.f)) {
                    sb.append(";openTime={");
                    sb.append(this.f);
                    sb.append(riy.BLOCK_END_STR);
                }
                if (!StringUtils.isEmpty(this.j)) {
                    sb.append(";renderTime={");
                    sb.append(this.j);
                    sb.append(riy.BLOCK_END_STR);
                }
                if (this.e.keySet().iterator().hasNext()) {
                    sb.append(";extendInfo={");
                    sb.append(this.e.toJSONString());
                    sb.append(riy.BLOCK_END_STR);
                    LogUtil.record(4, "MspPayResult:formatResult", "extendInfo:" + this.e);
                }
            } catch (Exception e3) {
                StringBuilder sb5 = new StringBuilder(this.d.read());
                LogUtil.printExceptionStackTrace(e3);
                sb = sb5;
            }
            LogUtil.record(4, "MspPayResult.retVal", "where=" + i + " retVal:" + ((Object) sb));
            return sb.toString();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("<MspPayResult bizId=");
        MspTradeContext mspTradeContext = this.f4952a;
        sb.append(mspTradeContext == null ? -1 : mspTradeContext.getBizId());
        sb.append(" endCode=");
        sb.append(this.c.read());
        sb.append(" memo=");
        sb.append(this.b.read());
        sb.append(" result=");
        sb.append(this.d.read());
        sb.append(">");
        return sb.toString();
    }
}
