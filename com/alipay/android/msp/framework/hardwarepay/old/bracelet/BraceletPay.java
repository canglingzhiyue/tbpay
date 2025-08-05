package com.alipay.android.msp.framework.hardwarepay.old.bracelet;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.hardwarepay.old.base.AbstractHardwarePay;
import com.alipay.android.msp.framework.hardwarepay.old.base.HardwareConstants;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class BraceletPay extends AbstractHardwarePay {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean isCallBack = false;
    private Object callBack = null;
    private int supportHardwarePay;

    public static /* synthetic */ int access$000(BraceletPay braceletPay) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f29b7040", new Object[]{braceletPay})).intValue() : braceletPay.supportHardwarePay;
    }

    public static /* synthetic */ int access$002(BraceletPay braceletPay, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6270094b", new Object[]{braceletPay, new Integer(i)})).intValue();
        }
        braceletPay.supportHardwarePay = i;
        return i;
    }

    public static /* synthetic */ Object access$100(BraceletPay braceletPay) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a850eac6", new Object[]{braceletPay}) : braceletPay.callBack;
    }

    public BraceletPay() {
        EventLogUtil.SpecificEvent.wearableUsage("bracePayCons");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void init(Context context, int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcb5adf", new Object[]{this, context, new Integer(i), objArr});
        } else if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONObject)) {
        } else {
            LogUtil.record(2, "phonecashiermsp#bracelet", "BraceletPay.init", "BraceletPayHelper startPay msms");
            this.supportHardwarePay = BraceletPayHelper.getInstance().initHardwarePay(context, i, PhoneCashierMspEngine.getMspWallet().getUserId());
            LogUtil.record(2, "phonecashiermsp#bracelet", "BraceletPay.init", "BraceletPayHelper end msms");
            LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPay.init", "支付请求手环初始化结果：" + this.supportHardwarePay);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void execute(final Context context, final int i, Object... objArr) {
        JSONObject jSONObject;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7630931a", new Object[]{this, context, new Integer(i), objArr});
            return;
        }
        EventLogUtil.SpecificEvent.wearableUsage("bracePayExc");
        try {
            final BraceletPayHelper braceletPayHelper = BraceletPayHelper.getInstance();
            if (braceletPayHelper == null) {
                return;
            }
            String str3 = null;
            if (objArr == null || objArr.length <= 0) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = null;
                for (Object obj : objArr) {
                    if (obj != null) {
                        if (obj instanceof JSONObject) {
                            jSONObject2 = (JSONObject) obj;
                        } else if (obj instanceof String) {
                            jSONObject2 = JSON.parseObject((String) obj);
                        } else {
                            this.callBack = obj;
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            if (jSONObject == null) {
                return;
            }
            int intValue = jSONObject.getIntValue("type");
            final int intValue2 = jSONObject.getIntValue("authType");
            final int intValue3 = jSONObject.getIntValue(MspGlobalDefine.WEAR_TYPE);
            if (intValue != 0) {
                if (intValue != 500) {
                    if (intValue == 503) {
                        jSONObject.remove("type");
                        jSONObject.put("type", (Object) Integer.valueOf(HardwareConstants.getReqRespCodeMap().get(AbstractHardwarePay.CURRENT_BL_REQUEST)));
                        toCallback(braceletPayHelper, this.callBack, i, jSONObject.toString());
                        isCallBack = true;
                    } else if (intValue != 506) {
                        if (intValue == 2 || intValue == 3 || intValue == 4) {
                            if (jSONObject.containsKey("extraPara")) {
                                str3 = jSONObject.getString("extraPara");
                            }
                            String string = jSONObject.getString("data");
                            if (str3 != null) {
                                string = string + "[extraPara:" + str3 + riy.ARRAY_END_STR;
                            }
                            braceletPayHelper.process(intValue, jSONObject.getIntValue("version"), string, 2, this.callBack, context);
                        }
                    } else if (!isCallBack) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", (Object) Integer.valueOf(HardwareConstants.getReqRespCodeMap().get(AbstractHardwarePay.CURRENT_BL_REQUEST)));
                        jSONObject3.put("result", (Object) (-1));
                        LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPay.execute", "[BraceletPay-execute-MSG_MSP_EXIT]:".concat(String.valueOf(jSONObject3)));
                        toCallback(braceletPayHelper, this.callBack, i, jSONObject3.toString());
                        isCallBack = true;
                    }
                }
                str = "phonecashiermsp#bracelet";
                str2 = "BraceletPay.execute";
            } else {
                str = "phonecashiermsp#bracelet";
                str2 = "BraceletPay.execute";
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPay.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BraceletPay.access$002(BraceletPay.this, braceletPayHelper.initHardwarePay(context, i, MspContextUtil.getUserId()));
                        if (AbstractHardwarePay.CURRENT_BL_REQUEST == 0) {
                            if (BraceletPay.access$000(BraceletPay.this) == 100 || BraceletPay.access$000(BraceletPay.this) == 105 || BraceletPay.access$000(BraceletPay.this) == 106 || BraceletPay.access$000(BraceletPay.this) == 123 || BraceletPay.access$000(BraceletPay.this) == 127 || BraceletPay.access$000(BraceletPay.this) == 126) {
                                BraceletPay.access$002(BraceletPay.this, 100);
                            }
                            BraceletPay braceletPay = BraceletPay.this;
                            BraceletPayHelper braceletPayHelper2 = braceletPayHelper;
                            Object access$100 = BraceletPay.access$100(braceletPay);
                            int i2 = i;
                            BraceletPay braceletPay2 = BraceletPay.this;
                            braceletPay.toCallback(braceletPayHelper2, access$100, i2, braceletPay2.createInitReplyJson(BraceletPay.access$000(braceletPay2), intValue2, intValue3));
                        }
                        LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPay.execute", "钱包发起请求手环初始化结果：" + BraceletPay.access$000(BraceletPay.this));
                    }
                });
            }
            LogUtil.record(1, str, str2, "[BraceletPay-execute]:" + jSONObject + "[isCallBack]=>" + isCallBack);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            EventLogUtil.SpecificEvent.wearableUsage("bracePayCancel");
        }
    }
}
