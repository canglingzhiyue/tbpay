package com.alipay.android.msp.framework.hardwarepay.old;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.MspFingerprintCashierManager;
import com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay;
import com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPay;
import com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.taskscheduler.ConditionVariableUtil;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspHardwarePayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MspHardwarePayUtil f4753a;
    private IHardwarePay b;
    private IHardwarePay c;

    public static MspHardwarePayUtil getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspHardwarePayUtil) ipChange.ipc$dispatch("383c1a67", new Object[0]);
        }
        if (f4753a == null) {
            synchronized (MspHardwarePayUtil.class) {
                if (f4753a == null) {
                    f4753a = new MspHardwarePayUtil();
                }
            }
        }
        return f4753a;
    }

    private MspHardwarePayUtil() {
    }

    private void a(Context context, int i, Object... objArr) {
        IHardwarePay iHardwarePay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bffafae", new Object[]{this, context, new Integer(i), objArr});
            return;
        }
        a(i);
        if (i != 1) {
            if (i != 2 || (iHardwarePay = this.b) == null) {
                return;
            }
            iHardwarePay.init(context, i, objArr);
            return;
        }
        IHardwarePay iHardwarePay2 = this.c;
        if (iHardwarePay2 == null) {
            return;
        }
        iHardwarePay2.init(context, i, objArr);
    }

    public void execute(Context context, int i, Object... objArr) {
        IHardwarePay iHardwarePay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7630931a", new Object[]{this, context, new Integer(i), objArr});
            return;
        }
        a(i);
        GlobalConstant.loadProperties(context);
        Object[] objArr2 = null;
        if (objArr != null) {
            objArr2 = new Object[objArr.length];
            int i2 = 0;
            for (Object obj : objArr) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        if (i != 1) {
            if (i != 2 || (iHardwarePay = this.b) == null) {
                return;
            }
            iHardwarePay.execute(context, i, objArr2);
            return;
        }
        IHardwarePay iHardwarePay2 = this.c;
        if (iHardwarePay2 == null) {
            return;
        }
        iHardwarePay2.execute(context, i, objArr2);
    }

    public String createRequestJson(int i, int i2, int i3, String str, MspContext mspContext) {
        IHardwarePay iHardwarePay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f28df4df", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str, mspContext});
        }
        mspContext.getContext();
        a(i);
        if (i != 1) {
            if (i != 2 || (iHardwarePay = this.b) == null) {
                return null;
            }
            return iHardwarePay.createRequestJson(i2, i3, str);
        }
        IHardwarePay iHardwarePay2 = this.c;
        if (iHardwarePay2 == null) {
            return null;
        }
        return iHardwarePay2.createRequestJson(i2, i3, str);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            if (this.c != null) {
                return;
            }
            this.c = new MspFingerPrintPay();
        } else if (i != 2 || this.b != null) {
        } else {
            this.b = new BraceletPay();
        }
    }

    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
            return;
        }
        b(1);
        b(2);
        destroy();
    }

    private void b(int i) {
        IHardwarePay iHardwarePay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        a(i);
        if (i != 1) {
            if (i != 2 || (iHardwarePay = this.b) == null) {
                return;
            }
            iHardwarePay.cancel();
            return;
        }
        IHardwarePay iHardwarePay2 = this.c;
        if (iHardwarePay2 == null) {
            return;
        }
        iHardwarePay2.cancel();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
    }

    public void initHardwarePay(final Context context, final int i, final JSONObject jSONObject) {
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68898be", new Object[]{this, context, new Integer(i), jSONObject});
            return;
        }
        boolean contains = jSONObject == null ? false : jSONObject.getString(MspGlobalDefine.EXTERNAL_INFO).contains("biz_type=\"fingerprint\"");
        boolean contains2 = jSONObject == null ? false : jSONObject.getString(MspGlobalDefine.EXTERNAL_INFO).contains("biz_type=\"setting\"");
        final boolean z = contains || contains2;
        long j = contains ? 60000L : 3000L;
        LogUtil.record(1, "MspHardwarePayUtil.initHardwarePay", "checkpoint9", "isFingerprintDegrade:false,isFingerprintRegBiz:" + z + ",isFingerprintBiz:" + contains + ",isSettingBiz:" + contains2 + ",timeout:" + j);
        boolean run = ConditionVariableUtil.run(j, new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MspHardwarePayUtil.a(MspHardwarePayUtil.this, context, i, jSONObject, z);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(i);
                    if (mspContextByBizId2 == null) {
                        return;
                    }
                    mspContextByBizId2.getStatisticInfo().addEvent(new StEvent(mspContextByBizId2.getCurrentWinTpName(), "fp", ErrorCode.FP_HARDWAREPAYUTIL_INIT_EX));
                }
            }
        });
        if (!run && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i)) != null) {
            mspContextByBizId.getStatisticInfo().addEvent(new StEvent(mspContextByBizId.getCurrentWinTpName(), "fp", ErrorCode.FP_HARDWAREPAYUTIL_INIT_TIMEOUT));
        }
        LogUtil.record(2, "MspHardwarePayUtil::initHardwarePay", "complete:".concat(String.valueOf(run)));
    }

    public static /* synthetic */ void a(MspHardwarePayUtil mspHardwarePayUtil, Context context, int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3fd5dc", new Object[]{mspHardwarePayUtil, context, new Integer(i), jSONObject, new Boolean(z)});
            return;
        }
        GlobalConstant.loadProperties(context);
        if (!StringUtils.isEmpty(GlobalConstant.HARDWARE_PAY_TYPES)) {
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspHardwarePayUtil.init", "fp startPay msms");
            if (z) {
                MspFingerprintCashierManager.getInstance().initFingerprint(context, jSONObject);
            } else {
                MspFingerprintCashierManager.getInstance().prepareFingerprintData(context, jSONObject);
                mspHardwarePayUtil.a(context, 1, jSONObject);
                LogUtil.record(1, "MspHardwarePayUtil:init", "checkpoint10:new", "isFingerprintDegrade:false");
            }
            LogUtil.record(1, "MspHardwarePayUtil:init", "checkpoint10:new", "isFingerprintDegrade:false");
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspHardwarePayUtil.init", "fp end msms");
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspHardwarePayUtil.init", "bl startPay msms");
            mspHardwarePayUtil.a(context, 2, jSONObject);
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspHardwarePayUtil.init", "bl end msms");
        }
        if (!z) {
            JsonUtil.addUniqueItem(jSONObject, "secData", PluginManager.getSmartPayPlugin().getFastPayAuthData(MspContextUtil.getUserId()));
        } else {
            JsonUtil.addUniqueItem(jSONObject, "secData", PluginManager.getSmartPayPlugin().getRegAuthData(1, 0, MspContextUtil.getUserId()));
        }
        mspHardwarePayUtil.c = null;
        mspHardwarePayUtil.b = null;
    }
}
