package com.taobao.share.copy.process;

import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class StorebackFlowData {

    /* loaded from: classes8.dex */
    public static class Data implements IMTOPDataObject {
        static {
            kge.a(70295845);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes8.dex */
    public static final class StoreRedirectUrlRequest implements IMTOPDataObject {
        public List<String> redirectUrlList;
        public String targetUrl;
        public final String API_NAME = "mtop.taobao.sharepassword.storeRedirectUrl";
        public final String VERSION = "1.0";
        public final boolean NEED_ECODE = false;
        public final boolean NEED_SESSION = true;

        static {
            kge.a(129603714);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes8.dex */
    public static final class StorebackflowdataRequest implements IMTOPDataObject {
        public final String API_NAME = "mtop.taobao.sharepassword.storebackflowdata";
        public final String VERSION = "1.0";
        public final boolean NEED_ECODE = false;
        public final boolean NEED_SESSION = true;
        public String shareUrl = "";

        static {
            kge.a(-1653873334);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(971123305);
    }

    /* loaded from: classes8.dex */
    public static class Response extends BaseOutDo {
        public Data data;

        static {
            kge.a(-868380612);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public Object mo2429getData() {
            return this.data;
        }
    }
}
