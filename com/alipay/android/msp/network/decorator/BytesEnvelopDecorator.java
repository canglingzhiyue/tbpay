package com.alipay.android.msp.network.decorator;

import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class BytesEnvelopDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BytesEnvelopDecorator() {
    }

    public BytesEnvelopDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] todo(byte[] r6, java.lang.String r7) throws com.alibaba.fastjson.JSONException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.decorator.BytesEnvelopDecorator.todo(byte[], java.lang.String):byte[]");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /* renamed from: undo */
    public Object mo541undo(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        byte[] bArr = new byte[5];
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) obj);
            byteArrayInputStream.read(bArr);
            byte[] bArr2 = new byte[Integer.parseInt(new String(bArr))];
            byteArrayInputStream.read(bArr2);
            JSONObject parseObject = JSON.parseObject(new String(bArr2));
            JSONObject jSONObject = parseObject.getJSONObject("data");
            byteArrayInputStream.read(bArr);
            int parseInt = Integer.parseInt(new String(bArr));
            byte[] bArr3 = new byte[parseInt];
            byteArrayInputStream.read(bArr3);
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "DataSourceDecorator.undo", " params length ".concat(String.valueOf(parseInt)));
            String encodeToString = Base64.encodeToString(bArr3, 2);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("res_data", (Object) encodeToString);
            jSONObject.put("params", (Object) jSONObject2);
            if (this.b == null) {
                return parseObject;
            }
            this.b.setRequestConfig(this.c);
            return this.b.mo541undo(parseObject);
        } catch (IOException e) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f4923a);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.DATA_DATASOURCE_DECORATOR_UNDO_EXCEPTION, e);
            }
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 204));
        }
    }
}
