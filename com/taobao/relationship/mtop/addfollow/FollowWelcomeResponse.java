package com.taobao.relationship.mtop.addfollow;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class FollowWelcomeResponse extends BaseOutDo implements Serializable {
    public FollowWelcomeData data;

    /* loaded from: classes7.dex */
    public static class FollowWelcomeData implements Serializable {
        private static final long serialVersionUID = -511206989537194788L;
        public String content;
        public String nick;
        public String richContent;
        public int tabIconType;

        static {
            kge.a(-141634615);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1060071854);
        kge.a(1028243835);
    }

    public void setData(FollowWelcomeData followWelcomeData) {
        this.data = followWelcomeData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FollowWelcomeData mo2429getData() {
        return this.data;
    }
}
