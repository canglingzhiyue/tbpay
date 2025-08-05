package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class DidIdpRpcResponse implements Serializable {
    public String errMessage;
    public DocumentSignData signDocument;
    public boolean success = false;
    public int errCode = 0;
}
