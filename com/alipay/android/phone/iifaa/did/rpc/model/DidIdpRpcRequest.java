package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import com.alipay.android.phone.iifaa.did.model.VerificationMethod;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class DidIdpRpcRequest implements Serializable {
    public static final String ACTION_ADD_VM = "ADD_VM";
    public static final String ACTION_CREATE = "NEW_DID";
    public static final String ACTION_SYNC = "SYNC_DID";
    public String action;
    public String alias;
    public String did;
    public List<VerificationMethod> methods;
    public DocumentSignData signDocument;
}
