package com.alipay.android.msp.network.decorator;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ChannelRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context d;

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /* renamed from: undo  reason: collision with other method in class */
    public String mo541undo(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    public ChannelRequestDecorator(Context context, int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
        this.d = context;
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        String str2 = new String(bArr);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(this.d));
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(this.d);
        if (StringUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
        }
        jSONObject.put("utdid", (Object) GlobalHelper.getInstance().getUtdid(this.d));
        jSONObject.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str2);
        String engineParams = PluginManager.getRender().getEngineParams();
        if (engineParams.contains("||") && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f4923a)) != null) {
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_BP_ARGS_ERROR, "bp:".concat(String.valueOf(engineParams)));
        }
        jSONObject.put("bp", (Object) engineParams);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) this.c.getType());
        jSONObject2.put("method", (Object) this.c.getMethod());
        jSONObject.put("action", (Object) jSONObject2);
        if (this.b != null) {
            this.b.setRequestConfig(this.c);
            return this.b.todo(jSONObject.toString().getBytes(), str);
        }
        return jSONObject.toString().getBytes();
    }
}
