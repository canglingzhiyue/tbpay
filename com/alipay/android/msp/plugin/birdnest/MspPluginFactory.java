package com.alipay.android.msp.plugin.birdnest;

import android.content.Context;
import com.alipay.android.app.template.FBPlugin;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspPluginFactory implements FBPluginFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f4954a;

    public void setmBusinessId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dddf376", new Object[]{this, new Integer(i)});
        } else {
            this.f4954a = i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r11.equals("MQPBNNavBar") != false) goto L13;
     */
    @Override // com.alipay.android.app.template.FBPluginFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.app.template.FBPlugin createPluginInstance(android.content.Context r9, com.alipay.android.app.template.FBPluginCtx r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.plugin.birdnest.MspPluginFactory.createPluginInstance(android.content.Context, com.alipay.android.app.template.FBPluginCtx, java.util.Map):com.alipay.android.app.template.FBPlugin");
    }

    public static FBPlugin getFBPluginByClassName(String str, Context context, FBPluginCtx fBPluginCtx, int i) {
        try {
            Class<?> cls = Class.forName(str);
            Object newInstance = cls != null ? cls.getConstructor(Context.class, FBPluginCtx.class, Integer.TYPE).newInstance(context, fBPluginCtx, Integer.valueOf(i)) : null;
            if (newInstance != null) {
                return (FBPlugin) newInstance;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "FBPluginClzNotFound_".concat(String.valueOf(str)), th);
            }
        }
        return null;
    }
}
