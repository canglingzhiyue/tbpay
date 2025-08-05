package com.taobao.share.taopassword.querypassword.check.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class Checkistaopassword {

    /* loaded from: classes8.dex */
    public static final class Request implements IMTOPDataObject {
        public boolean openHash;
        public String passwordContent;
        public String passwordKeyList;
        public final String API_NAME = "mtop.taobao.sharepassword.checkistaopasswordHash";
        public final String VERSION = "1.0";
        public final boolean NEED_ECODE = false;
        public final boolean NEED_SESSION = true;

        static {
            kge.a(-2035754923);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(322644106);
    }
}
