package com.taobao.android.detail.sdk.model.network.hot;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class HotAnswerCheckModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean answerRight;
    public int errCode;
    public String errMsg;
    public boolean success;

    /* loaded from: classes4.dex */
    public enum ErrorType {
        SUCCESS(0),
        NOLOGIN(1),
        GAMEOVER(2),
        EANSWER(3),
        LIMIT(4),
        UNKNOWN(5);
        
        int code;

        ErrorType(int i) {
            this.code = i;
        }
    }

    static {
        kge.a(-1281010269);
        kge.a(1028243835);
    }

    public HotAnswerCheckModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.hot.HotAnswerCheckModel");
    }

    public ErrorType getErrType() {
        ErrorType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorType) ipChange.ipc$dispatch("2f9a2460", new Object[]{this});
        }
        for (ErrorType errorType : ErrorType.values()) {
            if (errorType.code == this.errCode) {
                return errorType;
            }
        }
        return ErrorType.UNKNOWN;
    }

    public boolean isDegreade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99a0939e", new Object[]{this})).booleanValue() : this.errCode == ErrorType.GAMEOVER.code;
    }
}
