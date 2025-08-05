package com.taobao.android.fluid.framework.data.remote.newmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import tb.kge;
import tb.skk;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASAC_VALUE = "2A239181Y5Q46U3PS790AH";
    public static final String KEY_ASAC = "asac";
    public static final String KEY_BIZ_PARAMS = "bizParams";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";

    static {
        kge.a(-845215245);
    }

    public static JSONObject a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62e9ad64", new Object[]{obj});
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return JSONObject.parseObject(JSON.parseObject(JSON.parseObject((String) obj).getString("bizParams")).getString("queryParams"));
        } catch (Throwable unused) {
            spz.c("NewRecommendRequestParam", "getQueryParams failed " + obj);
            return null;
        }
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : jSONObject.getString(com.taobao.android.fluid.framework.data.remote.a.KEY_DETAIL_PARAMETERS);
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : jSONObject.getString(com.taobao.android.fluid.framework.data.remote.a.KEY_EXTEND_PARAMETERS);
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject}) : jSONObject.getString("contentId");
    }

    public a a(sps spsVar, NewRecommendRequest newRecommendRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9f552010", new Object[]{this, spsVar, newRecommendRequest}) : new a(spsVar, newRecommendRequest);
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.android.fluid.framework.data.remote.base.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f12538a = new JSONObject();
        public final JSONObject b = new JSONObject();
        public final JSONObject c = new JSONObject();
        public final JSONObject d = new JSONObject();
        public final JSONObject e = new JSONObject();
        public final sps f;
        public final NewRecommendRequest g;

        static {
            kge.a(-1181142757);
            kge.a(1563199716);
        }

        public a(sps spsVar, NewRecommendRequest newRecommendRequest) {
            this.f = spsVar;
            this.g = newRecommendRequest;
        }

        @Override // com.taobao.android.fluid.framework.data.remote.base.a
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f12538a;
        }

        @Override // com.taobao.android.fluid.framework.data.remote.base.a
        public IMTOPRequest b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMTOPRequest) ipChange.ipc$dispatch("219fd62d", new Object[]{this}) : this.g;
        }

        public a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dbaa7ad5", new Object[]{this});
            }
            this.d.put("queryParams", (Object) JSONObject.toJSONString(this.e));
            this.c.put("bizParams", (Object) JSONObject.toJSONString(this.d));
            this.c.put("enableUnderageMode", (Object) Boolean.valueOf(com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()));
            this.g.params = JSONObject.toJSONString(this.c);
            this.b.put("params", (Object) this.g.params);
            this.f12538a.put("data", (Object) this.b);
            return this;
        }

        public a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2969f2d6", new Object[]{this});
            }
            this.f12538a.put("api", (Object) this.g.getApi());
            this.f12538a.put("v", (Object) this.g.getVersion());
            this.f12538a.put(SessionConstants.ECODE, (Object) Integer.valueOf(this.g.isNeedEcode() ? 1 : 0));
            this.f12538a.put(MspGlobalDefine.SESSION, (Object) Integer.valueOf(this.g.isNeedSession() ? 1 : 0));
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("82858f9d", new Object[]{this, str});
            }
            this.g.appId = str;
            this.b.put("appId", (Object) str);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a01695e", new Object[]{this, str});
            }
            this.e.put("appVersion", (Object) str);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d17d431f", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = this.f12538a.getJSONObject("headers");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("asac", (Object) str);
                this.f12538a.put("headers", (Object) jSONObject);
            }
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78f91ce0", new Object[]{this, str});
            }
            this.e.put("bizParameters", (Object) str);
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2074f6a1", new Object[]{this, str});
            }
            this.e.put("contentId", (Object) str);
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c7f0d062", new Object[]{this, str});
            }
            this.e.put("countryCode", (Object) str);
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f6caa23", new Object[]{this, str});
            }
            this.e.put(com.taobao.android.fluid.framework.data.remote.a.KEY_DETAIL_PARAMETERS, (Object) str);
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16e883e4", new Object[]{this, str});
            }
            this.e.put(com.taobao.android.fluid.framework.data.remote.a.KEY_EXTEND_PARAMETERS, (Object) str);
            return this;
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be645da5", new Object[]{this, str});
            }
            this.e.put("guideExp", (Object) str);
            return this;
        }

        public a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("65e03766", new Object[]{this, str});
            }
            this.e.put("lowDevice", (Object) str);
            this.c.put("lowDevice", (Object) str);
            return this;
        }

        public a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d5c1127", new Object[]{this, str});
            }
            this.e.put("ndExp", (Object) str);
            return this;
        }

        public a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b4d7eae8", new Object[]{this, str});
            }
            this.e.put(d.KEY_ND_OPEN_TYPE, (Object) str);
            return this;
        }

        public a m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c53c4a9", new Object[]{this, str});
            }
            this.e.put("networkQuality", (Object) str);
            return this;
        }

        public a n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3cf9e6a", new Object[]{this, str});
            }
            this.e.put("newDetailChannel", (Object) str);
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab4b782b", new Object[]{this, str});
            }
            this.e.put("newType", (Object) str);
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e432b86", new Object[]{this, new Integer(i)});
            }
            this.e.put(MtopModule.KEY_PAGE_INDEX, (Object) Integer.valueOf(i));
            return this;
        }

        public a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("52c751ec", new Object[]{this, str});
            }
            this.e.put("pageSize", (Object) str);
            return this;
        }

        public a q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa432bad", new Object[]{this, str});
            }
            this.e.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, (Object) str);
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d872b3a5", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                JSONObject jSONObject = this.f12538a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f12538a.put("options", (Object) jSONObject);
                }
                jSONObject.put("prefetchTimeout", (Object) Integer.valueOf(i));
            }
            return this;
        }

        public a r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1bf056e", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.f12538a.put("type", (Object) str);
            }
            return this;
        }

        public a u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("983292b1", new Object[]{this, str});
            }
            if (str != null && skk.p()) {
                spz.c("NewRecommendRequestParam", "setBizTopic - bizTopic= " + str);
                JSONObject jSONObject = this.f12538a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f12538a.put("options", (Object) jSONObject);
                }
                jSONObject.put(MtopModule.KEY_MTOP_BIZ_TOPIC, (Object) str);
                jSONObject.put("bizId", (Object) com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_ID_TAB2);
            }
            return this;
        }

        public a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("493adf2f", new Object[]{this, str});
            }
            this.e.put("sceneId", (Object) str);
            return this;
        }

        public a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0b6b8f0", new Object[]{this, str});
            }
            this.e.put("source", (Object) str);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9acaf3d7", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                JSONObject jSONObject = this.f12538a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f12538a.put("options", (Object) jSONObject);
                }
                jSONObject.put("prefetch", (Object) true);
            }
            return this;
        }
    }
}
