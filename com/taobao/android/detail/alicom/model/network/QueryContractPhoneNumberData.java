package com.taobao.android.detail.alicom.model.network;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryContractPhoneNumberData implements IMTOPDataObject {
    public String error;
    public String errorMsg;
    public List<PhoneNumberList> module;

    /* loaded from: classes4.dex */
    public static class PhoneNumberList implements Serializable {
        public String isp;
        public int minConsumeAmount;
        public String minConsumeMonth;
        public String phoneNum;
        public int preDepositAmount;

        static {
            kge.a(2098858912);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(294109903);
        kge.a(-350052935);
    }
}
