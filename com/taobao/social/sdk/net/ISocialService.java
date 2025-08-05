package com.taobao.social.sdk.net;

import java.util.Map;
import tb.oci;
import tb.ocj;
import tb.ock;
import tb.ocl;

/* loaded from: classes8.dex */
public interface ISocialService {

    /* loaded from: classes8.dex */
    public enum SocialAction {
        QUERY_LIKE("doLike", 1),
        QUERY_REMOVE_LIKE("removeLike", 2),
        QUERY_COUNT_STATUS("count_status", 3),
        QUERY_REPORT("doReport", 4),
        QUERY_REPORT_NEW("doReport", 5);
        
        private int intCode;
        private String name;

        SocialAction(String str, int i) {
            this.name = str;
            this.intCode = i;
        }

        public int getIntCode() {
            return this.intCode;
        }
    }

    int doLike(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener);

    int doLike(Map map, ISocialBusinessListener iSocialBusinessListener);

    int doLike(ocj ocjVar, ISocialBusinessListener iSocialBusinessListener);

    int doLike(ock ockVar, ISocialBusinessListener iSocialBusinessListener);

    int getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener);

    int getCountAndStatus(oci ociVar, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(Map map, ISocialBusinessListener iSocialBusinessListener);

    int report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener);

    int report(long j, long j2, ISocialBusinessListener iSocialBusinessListener);

    int report(Map map, ISocialBusinessListener iSocialBusinessListener);

    int report(ocl oclVar, ISocialBusinessListener iSocialBusinessListener);
}
