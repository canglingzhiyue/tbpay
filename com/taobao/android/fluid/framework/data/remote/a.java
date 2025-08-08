package com.taobao.android.fluid.framework.data.remote;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.Map;
import tb.kge;
import tb.skk;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public final class a {
    public static final String KEY_DETAIL_PARAMETERS = "detailParameters";
    public static final String KEY_EXTEND_PARAMETERS = "extendParameters";
    public static final String KEY_NEED_REQUEST_CDN = "needRequestCDN";
    public static final String MTOP_BIZ_ID_TAB2 = "TBVideoSDK";
    public static final String MTOP_BIZ_TOPIC_ICONSTREAM = "detail_iconstream";
    public static final String MTOP_BIZ_TOPIC_LAUNCH = "detail_launch";
    public static final String MTOP_BIZ_TOPIC_NORMAL = "detail_normal";
    public static final String MTOP_BIZ_TOPIC_PRELOAD = "detail_preload";
    public static final String MTOP_BIZ_TOPIC_RECOMMOND = "rec";
    public static final String MTOP_BIZ_TOPIC_REFRESH = "detail_refresh";
    public static final String MTOP_BIZ_TOPIC_RELOAD_CELL = "detail_reload-cell";

    static {
        kge.a(-665506052);
    }

    /* renamed from: com.taobao.android.fluid.framework.data.remote.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0494a implements com.taobao.android.fluid.framework.data.remote.base.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f12534a = new JSONObject();
        public final JSONObject b = new JSONObject();
        public final sps c;
        public final MediaContentDetailRequest d;
        private String e;
        private Map f;

        static {
            kge.a(1564357639);
            kge.a(1563199716);
        }

        public C0494a(sps spsVar) {
            this.f12534a.put("data", (Object) this.b);
            this.c = spsVar;
            if (spsVar != null && spsVar.c() != null) {
                this.b.putAll(spsVar.c());
            }
            this.d = new MediaContentDetailRequest();
        }

        @Override // com.taobao.android.fluid.framework.data.remote.base.a
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f12534a;
        }

        @Override // com.taobao.android.fluid.framework.data.remote.base.a
        public IMTOPRequest b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMTOPRequest) ipChange.ipc$dispatch("219fd62d", new Object[]{this}) : this.d;
        }

        public C0494a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("9fc3972a", new Object[]{this});
            }
            this.f12534a.put("api", (Object) this.d.getApi());
            this.f12534a.put("v", (Object) this.d.getVersion());
            this.f12534a.put(SessionConstants.ECODE, (Object) Integer.valueOf(this.d.isNeedEcode() ? 1 : 0));
            this.f12534a.put(MspGlobalDefine.SESSION, (Object) Integer.valueOf(this.d.isNeedSession() ? 1 : 0));
            return this;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
        }

        public C0494a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("29e08162", new Object[]{this, str});
            }
            this.d.contentId = str;
            this.e = str;
            this.b.put("contentId", (Object) str);
            return this;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d.detailParameters;
        }

        public C0494a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("44517a81", new Object[]{this, str});
            }
            this.d.detailParameters = str;
            this.b.put(a.KEY_DETAIL_PARAMETERS, (Object) str);
            return this;
        }

        public Map f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
        }

        public C0494a a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("40065197", new Object[]{this, map});
            }
            this.f = map;
            return this;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d.extendParameters;
        }

        public C0494a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("5ec273a0", new Object[]{this, str});
            }
            this.d.extendParameters = str;
            this.b.put(a.KEY_EXTEND_PARAMETERS, (Object) str);
            return this;
        }

        public C0494a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("ae155efd", new Object[]{this, str});
            }
            if (str != null && skk.p()) {
                spz.c("RequestParam", "setBizTopic - bizTopic= " + str);
                JSONObject jSONObject = this.f12534a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f12534a.put("options", (Object) jSONObject);
                }
                jSONObject.put(MtopModule.KEY_MTOP_BIZ_TOPIC, (Object) str);
                jSONObject.put("bizId", (Object) a.MTOP_BIZ_ID_TAB2);
            }
            return this;
        }

        public C0494a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("79336cbf", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(str)) {
                this.f12534a.put("type", (Object) str);
            }
            return this;
        }

        public C0494a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0494a) ipChange.ipc$dispatch("93a465de", new Object[]{this, str});
            }
            this.d.source = str;
            this.b.put("source", (Object) str);
            return this;
        }
    }
}
