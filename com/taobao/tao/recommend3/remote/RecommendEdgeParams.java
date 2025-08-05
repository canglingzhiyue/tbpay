package com.taobao.tao.recommend3.remote;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class RecommendEdgeParams implements Serializable, IMTOPDataObject {
    public String containerParams;
    public String countryCode;
    public String edition;
    public String encryptUserId;
    public String gatewayVersion;
    public String nick;
    public String userId;
    public String utdid;

    static {
        kge.a(1920984238);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    private RecommendEdgeParams(a aVar) {
        this.nick = "";
        this.userId = "";
        this.utdid = "";
        this.encryptUserId = "";
        this.countryCode = "";
        this.edition = "";
        this.containerParams = "";
        this.gatewayVersion = "2.0";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("requestInfo", (Object) a.a(aVar));
        jSONObject2.put(i.CDN_REQUEST_TYPE, (Object) a.b(aVar));
        jSONObject2.put("bizParams", (Object) jSONObject3);
        jSONObject.put(a.c(aVar), (Object) jSONObject2);
        this.containerParams = jSONObject.toJSONString();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20950a;
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private String g = "";
        private String h = "";
        private String i = "";

        static {
            kge.a(1233530245);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("32f6bdd4", new Object[]{aVar}) : aVar.f20950a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bf80f73", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64f96112", new Object[]{aVar}) : aVar.g;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2bc66e88", new Object[]{this, str});
            }
            this.f20950a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("44c7c027", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5dc911c6", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("76ca6365", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8fcbb504", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8cd06a3", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1ce5842", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dacfa9e1", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3d0fb80", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public RecommendEdgeParams a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecommendEdgeParams) ipChange.ipc$dispatch("931443af", new Object[]{this});
            }
            RecommendEdgeParams recommendEdgeParams = new RecommendEdgeParams(this);
            recommendEdgeParams.countryCode = this.e;
            recommendEdgeParams.edition = this.f;
            recommendEdgeParams.encryptUserId = this.d;
            recommendEdgeParams.nick = this.b;
            recommendEdgeParams.utdid = this.c;
            recommendEdgeParams.userId = this.i;
            return recommendEdgeParams;
        }
    }
}
