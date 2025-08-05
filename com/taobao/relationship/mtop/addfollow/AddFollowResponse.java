package com.taobao.relationship.mtop.addfollow;

import com.taobao.relationship.mtop.BasicOperationResponse;
import com.taobao.relationship.mtop.BasicResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class AddFollowResponse extends BasicResponse {
    public AddFollowData data;

    /* loaded from: classes7.dex */
    public static class AddFollowData extends BasicOperationResponse {
        public boolean followAccount;
        public boolean subscribe;
        public String accountName = "";
        public String toastMsg = "";
        public String followExtra = "";

        static {
            kge.a(-216107509);
        }
    }

    static {
        kge.a(-1379775853);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AddFollowData mo2429getData() {
        return this.data;
    }
}
