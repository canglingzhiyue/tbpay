package org.ifaa.ifaf.message;

import com.alibaba.fastjson.JSON;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import org.ifaa.ifaf.Extension;
import org.ifaa.ifaf.OperationHeader;

/* loaded from: classes9.dex */
public class IFAFMessage {
    private Extension[] exts;
    private OperationHeader header;
    private IFAFSignedData signedData;

    public static synchronized IFAFMessage parseIFAFMessage(String str) {
        IFAFMessage iFAFMessage;
        synchronized (IFAFMessage.class) {
            AuthenticatorLOG.fpInfo("IFAFMessage parseIFAFMessage Fastjson:" + str);
            iFAFMessage = (IFAFMessage) JSON.parseObject(str, IFAFMessage.class);
        }
        return iFAFMessage;
    }

    public static synchronized String toJsonString(IFAFMessage iFAFMessage) {
        String jSONString;
        synchronized (IFAFMessage.class) {
            jSONString = JSON.toJSONString(iFAFMessage);
            AuthenticatorLOG.fpInfo("IFAFMessage toJsonString Fastjson:" + jSONString);
        }
        return jSONString;
    }

    public Extension[] getExts() {
        return this.exts;
    }

    public OperationHeader getHeader() {
        return this.header;
    }

    public IFAFSignedData getSignedData() {
        return this.signedData;
    }

    public void setExts(Extension[] extensionArr) {
        this.exts = extensionArr;
    }

    public void setHeader(OperationHeader operationHeader) {
        this.header = operationHeader;
    }

    public void setSignedData(IFAFSignedData iFAFSignedData) {
        this.signedData = iFAFSignedData;
    }
}
