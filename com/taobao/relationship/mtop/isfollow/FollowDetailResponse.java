package com.taobao.relationship.mtop.isfollow;

import com.taobao.relationship.mtop.BasicResponse;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class FollowDetailResponse extends BasicResponse {
    public FollowDetail data;

    /* loaded from: classes7.dex */
    public static class FollowDetail implements Serializable {
        public long accountId;
        public boolean dynamic;
        public boolean follow;
        public String followExtra = "";
        public boolean quiet;

        static {
            kge.a(366251378);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1893199028);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FollowDetail mo2429getData() {
        return this.data;
    }
}
