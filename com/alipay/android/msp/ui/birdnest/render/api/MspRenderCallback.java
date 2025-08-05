package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import android.os.Build;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback3;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspRenderCallback implements ICashierRenderCallback3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f4984a;
    private final Context b;
    private final IRenderCallback c;

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    public void onAsyncEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1266b8e", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    public void onEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
        }
    }

    public MspRenderCallback(int i, Context context, IRenderCallback iRenderCallback) {
        this.f4984a = i;
        this.b = context;
        this.c = iRenderCallback;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r12.equals(tb.rrv.APDIDTOKEN) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        if (r12.equals("fpInfo") != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onGetCustomAttr(java.lang.Object r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.birdnest.render.api.MspRenderCallback.onGetCustomAttr(java.lang.Object, java.lang.String):java.lang.String");
    }

    public static String onGetGlobalCustomAttr(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d585bf7", new Object[]{obj, str});
        }
        LogUtil.record(2, "MspRenderCallback::onGetGlobalCustomAttr", "params：".concat(String.valueOf(str)));
        char c = 65535;
        switch (str.hashCode()) {
            case -1962630338:
                if (str.equals("sdkVersion")) {
                    c = 0;
                    break;
                }
                break;
            case -1210167495:
                if (str.equals("scaleFactor")) {
                    c = 3;
                    break;
                }
                break;
            case 1352062436:
                if (str.equals("mspType")) {
                    c = 2;
                    break;
                }
                break;
            case 1458635954:
                if (str.equals("currentTplId")) {
                    c = 1;
                    break;
                }
                break;
            case 1812004436:
                if (str.equals("osVersion")) {
                    c = 4;
                    break;
                }
                break;
        }
        String str2 = "";
        if (c == 0) {
            str2 = GlobalSdkConstant.getMspVersion();
        } else if (c != 1) {
            if (c == 2) {
                str2 = "6";
            } else if (c == 3) {
                str2 = String.valueOf(FlybirdUtil.getSizeGear());
            } else if (c == 4) {
                str2 = Build.VERSION.RELEASE;
            } else {
                LogUtil.record(8, "MspRenderCallback::onGetGlobalCustomAttr", "error-params：".concat(String.valueOf(str)));
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "onGetGlobalCustomAttr", "params:".concat(String.valueOf(str)));
            }
        }
        LogUtil.record(2, "MspRenderCallback::onGetGlobalCustomAttr", "res：".concat(String.valueOf(str2)));
        return str2;
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public void onEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str});
        } else {
            this.c.onEvent(obj, str);
        }
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str});
        } else {
            this.c.onAsyncEvent(iTemplateClickCallback, obj, str);
        }
    }

    @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback3
    public Object getStatisticAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3d5eade0", new Object[]{this});
        }
        Object obj = StatisticCollector.GLOBAL_AGENT;
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f4984a);
        return mspContextByBizId != null ? mspContextByBizId.getStatisticInfo().getStatisticAgent() : obj;
    }
}
