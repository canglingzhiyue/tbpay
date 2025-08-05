package com.taobao.relationship.mtop;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class OperationResult implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = -7405719299395506387L;
    private long id;
    private boolean isSuccess;
    private String success;

    static {
        kge.a(1724613025);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public boolean isIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(boolean z) {
        this.isSuccess = z;
    }

    public String getSuccess() {
        return this.success;
    }

    public void setSuccess(String str) {
        this.success = str;
    }
}
