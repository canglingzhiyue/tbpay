package com.taobao.share.taopassword.querypassword.check.mtop;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class AplatformWeakGet {

    /* loaded from: classes8.dex */
    public static class Data implements IMTOPDataObject {
        public List<Result> result;

        static {
            kge.a(278921669);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Request implements IMTOPDataObject {
        public String bizParam;
        public String bizType;
        public final String API_NAME = "mtop.taobao.aplatform.weakGet";
        public final String VERSION = "1.0";
        public final boolean NEED_ECODE = false;
        public final boolean NEED_SESSION = true;

        static {
            kge.a(-1753684332);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Result implements Serializable {
        private static final long serialVersionUID = 1;
        public boolean isPassword;

        static {
            kge.a(-2134720648);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-163519031);
    }

    /* loaded from: classes8.dex */
    public static class Response extends BaseOutDo {
        public Data data;

        static {
            kge.a(1523294428);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public Object mo2429getData() {
            return this.data;
        }
    }
}
