package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes9.dex */
public class ExpressionException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Throwable mRootCause;

    static {
        kge.a(-1683835641);
    }

    public ExpressionException() {
    }

    public ExpressionException(String str) {
        super(str);
    }

    public ExpressionException(Throwable th) {
        this.mRootCause = th;
    }

    public ExpressionException(String str, Throwable th) {
        super(str);
        this.mRootCause = th;
    }

    public Throwable getRootCause() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("6725fedd", new Object[]{this}) : this.mRootCause;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getMessage() == null) {
            return this.mRootCause.toString();
        }
        if (this.mRootCause == null) {
            return getMessage();
        }
        return getMessage() + ResponseProtocolType.COMMENT + this.mRootCause;
    }
}
