package com.alipay.security.mobile.ifaa.message;

import android.os.Bundle;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.ByteUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.enums.EnumIfaaOperationType;
import org.ifaa.ifaf.message.IFAFMessage;
import org.ifaa.ifaf.message.IFAFSignedData;

/* loaded from: classes3.dex */
public class Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Bundle constructResultBundle(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("70426a1", new Object[]{new Integer(i), new Integer(i2)}) : constructResultBundle(i, i2, null);
    }

    public static Bundle constructResultBundle(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("793854ab", new Object[]{new Integer(i), new Integer(i2), str});
        }
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, i);
        bundle.putInt(AuthenticatorMessage.KEY_RESULT, i2);
        if (str != null && str.length() != 0) {
            bundle.putString(AuthenticatorMessage.KEY_MESSAGE, str);
        }
        return bundle;
    }

    public static String makeResponseData(String str, OperationHeader operationHeader, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("293d7b", new Object[]{str, operationHeader, result});
        }
        operationHeader.setOpType(EnumIfaaOperationType.RESPONSE.getValue());
        operationHeader.setDeviceModel(str);
        IFAFMessage iFAFMessage = new IFAFMessage();
        iFAFMessage.setHeader(operationHeader);
        byte[] bArr = new byte[result.getData().length];
        ByteUtils.copy(result.getData(), 0, result.getData().length, bArr, 0);
        IFAFSignedData iFAFSignedData = new IFAFSignedData();
        iFAFSignedData.setScheme("IFAFV1TLV");
        iFAFSignedData.setIdentifyData(Base64.encodeToString(bArr, 8));
        iFAFMessage.setSignedData(iFAFSignedData);
        return IFAFMessage.toJsonString(iFAFMessage);
    }
}
