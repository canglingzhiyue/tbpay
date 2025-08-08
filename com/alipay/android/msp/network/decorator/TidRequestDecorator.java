package com.alipay.android.msp.network.decorator;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TidRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /* renamed from: undo  reason: collision with other method in class */
    public String mo541undo(Object obj) throws AppErrorException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    public TidRequestDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        JSONObject jSONObject = new JSONObject();
        GlobalHelper globalHelper = GlobalHelper.getInstance();
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(globalHelper.getContext()));
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(globalHelper.getContext());
        if (StringUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(true, 2, true));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(true, 1, true));
        }
        jSONObject.put("utdid", (Object) globalHelper.getUtdid(globalHelper.getContext()));
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
