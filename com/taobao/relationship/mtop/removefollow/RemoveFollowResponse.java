package com.taobao.relationship.mtop.removefollow;

import com.taobao.relationship.mtop.BasicOperationResponse;
import com.taobao.relationship.mtop.BasicResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class RemoveFollowResponse extends BasicResponse {
    public RemoveFollowData data;

    /* loaded from: classes7.dex */
    public static class RemoveFollowData extends BasicOperationResponse {
        public String toastMsg = "";
        public String followExtra = "";

        static {
            kge.a(-871247626);
        }
    }

    static {
        kge.a(-541510259);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RemoveFollowData mo2429getData() {
        return this.data;
    }
}
