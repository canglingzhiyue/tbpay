package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.exception.GzipException;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.utils.GzipUtils;
import com.alipay.android.msp.utils.net.LogicUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;

/* loaded from: classes3.dex */
public class BytesEncryptDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BytesEncryptDecorator() {
    }

    public BytesEncryptDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f4923a);
        try {
            bArr = GzipUtils.toGzip(bArr);
            this.c.isSupportGzip(true);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(WeexZipModule.NAME, "1", ""));
            }
        } catch (GzipException unused) {
            this.c.isSupportGzip(false);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(WeexZipModule.NAME, "0", ""));
            }
        }
        byte[] encryptedData = LogicUtil.getEncryptedData(this.c.getTridesKey(), bArr);
        if (this.b == null) {
            return encryptedData;
        }
        this.b.setRequestConfig(this.c);
        return this.b.todo(encryptedData, str);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /* renamed from: undo */
    public Object mo541undo(Object obj) throws Exception {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            string = jSONObject.getJSONObject("data").getJSONObject("params").getString("res_data");
        } catch (Exception unused) {
            this.c.isSupportGzip(false);
        }
        if (TextUtils.isEmpty(string)) {
            return jSONObject;
        }
        byte[] decrypt = TriDesCBC.decrypt(this.c.getTridesKey(), Base64.decode(string, 2));
        if (this.c.ismResponseHeaderGzipFlag()) {
            JSONObject parseObject = JSON.parseObject(new String(GzipUtils.unGZip(decrypt), "utf-8"));
            if (parseObject.containsKey(MspGlobalDefine.SESSION)) {
                this.c.setSessionId(parseObject.getString(MspGlobalDefine.SESSION));
            }
            if (parseObject.containsKey(MspGlobalDefine.UAC)) {
                this.c.setmUac(parseObject.getIntValue(MspGlobalDefine.UAC));
            } else {
                this.c.setmUac(0);
            }
            if (parseObject.containsKey("trade_no")) {
                this.c.setmTradeNo(parseObject.getString("trade_no"));
            }
            jSONObject = parseObject;
        } else {
            this.c.isSupportGzip(false);
        }
        if (this.b != null) {
            this.b.setRequestConfig(this.c);
            return this.b.mo541undo(jSONObject);
        }
        return jSONObject.toString();
    }
}
