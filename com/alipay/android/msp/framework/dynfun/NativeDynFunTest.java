package com.alipay.android.msp.framework.dynfun;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NativeDynFunTest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void doDynFunTestOnNewThread(final MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8037c5", new Object[]{mspContext});
        } else if (!NativeDynFunManager.drmEnabled() || !NativeDynFunManager.drmVerifyEnabled()) {
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunTest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!(MspContext.this instanceof MspTradeContext)) {
                            return;
                        }
                        int bizId = MspContext.this.getBizId();
                        Integer read = ((MspTradeContext) MspContext.this).dynDataStub.read();
                        LogUtil.record(1, "DynFunVerify", "expect 2: ".concat(String.valueOf(read)));
                        String str = null;
                        NativeDynFunManager.antEvent(NativeDynFunManager.EventId.EV_ID_ANS, "data1", null, null, null, read.intValue() == 2 ? null : String.valueOf(read), Integer.valueOf(bizId));
                        ((MspTradeContext) MspContext.this).dynDataStub.write(Integer.valueOf(read.intValue() + 10));
                        LogUtil.record(1, "DynFunVerify", "dyn write");
                        Integer read2 = ((MspTradeContext) MspContext.this).dynDataStub.read();
                        LogUtil.record(1, "DynFunVerify", "expect 12: ".concat(String.valueOf(read2)));
                        NativeDynFunManager.antEvent(NativeDynFunManager.EventId.EV_ID_ANS, "data2", null, null, null, read2.intValue() == 12 ? null : String.valueOf(read2), Integer.valueOf(bizId));
                        String str2 = (String) NativeDynFunManager.processWithFallbackSync(MspContext.this.getBizId(), DynConstants.DynFunNames.F_APPEND_VALUE_TO_STR, new Object[]{"a", TplMsg.VALUE_T_NATIVE_RETURN}, new NativeDynFunManager.FallbackFunction<String>() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunTest.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
                            public String call() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("5fe77b5b", new Object[]{this});
                                }
                                try {
                                    String str3 = "NATIVE-a-b-" + ((MspTradeContext) MspContext.this).dynDataStub.read();
                                    LogUtil.record(1, "DynFunVerify", "fallback ".concat(String.valueOf(str3)));
                                    return str3;
                                } catch (Exception e) {
                                    LogUtil.record(1, "DynFunVerify", "exception while fallback!");
                                    e.printStackTrace();
                                    return "";
                                }
                            }
                        });
                        LogUtil.record(1, "DynFunVerify", "result: append_val_to_str(a, b) => ".concat(String.valueOf(str2)));
                        if (!StringUtils.equals(str2, "TPL-a-b-12")) {
                            str = String.valueOf(str2);
                        }
                        NativeDynFunManager.antEvent(NativeDynFunManager.EventId.EV_ID_ANS, "biz1", null, null, null, str, Integer.valueOf(bizId));
                    } catch (Exception e) {
                        LogUtil.record(8, "DynFunVerify", "test failed with exception:");
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            }, 3000L);
        }
    }
}
