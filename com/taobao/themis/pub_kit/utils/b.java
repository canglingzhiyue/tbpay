package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.config.PubRecommendClient;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/PubKitCommonUtils;", "", "()V", "getShowRecommendGuideRunnable", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "appId", "", "userId", "delta", "Lcom/alibaba/fastjson/JSONObject;", "homePagePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "userGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "pubContainerContext", "Lcom/taobao/themis/pub_kit/config/PubContainerContext;", "pageTraceId", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    static {
        kge.a(1188746974);
        INSTANCE = new b();
    }

    private b() {
    }

    public static /* synthetic */ Runnable a(b bVar, Context context, String str, String str2, JSONObject jSONObject, JSONArray jSONArray, PubUserGuideModule pubUserGuideModule, PubContainerContext pubContainerContext, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ad448326", new Object[]{bVar, context, str, str2, jSONObject, jSONArray, pubUserGuideModule, pubContainerContext, str3, new Integer(i), obj});
        }
        return bVar.a(context, str, str2, jSONObject, jSONArray, pubUserGuideModule, pubContainerContext, (i & 128) != 0 ? null : str3);
    }

    public final Runnable a(Context context, String appId, String userId, JSONObject delta, JSONArray homePagePopDataList, PubUserGuideModule userGuideModule, PubContainerContext pubContainerContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("b99bc081", new Object[]{this, context, appId, userId, delta, homePagePopDataList, userGuideModule, pubContainerContext, str});
        }
        q.d(context, "context");
        q.d(appId, "appId");
        q.d(userId, "userId");
        q.d(delta, "delta");
        q.d(homePagePopDataList, "homePagePopDataList");
        q.d(userGuideModule, "userGuideModule");
        q.d(pubContainerContext, "pubContainerContext");
        return new a(str, homePagePopDataList, userGuideModule, pubContainerContext, appId, delta, context, userId);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/pub_kit/utils/PubKitCommonUtils$getShowRecommendGuideRunnable$1", "Ljava/lang/Runnable;", "run", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22803a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ PubUserGuideModule c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ PubContainerContext e;
        public final /* synthetic */ String f;
        public final /* synthetic */ JSONObject g;
        public final /* synthetic */ String h;

        public a(String str, JSONArray jSONArray, PubUserGuideModule pubUserGuideModule, PubContainerContext pubContainerContext, String str2, JSONObject jSONObject, Context context, String str3) {
            this.f22803a = str;
            this.b = jSONArray;
            this.c = pubUserGuideModule;
            this.e = pubContainerContext;
            this.f = str2;
            this.g = jSONObject;
            this.d = context;
            this.h = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.kernel.utils.a.b(this);
            String a2 = com.taobao.themis.kernel.logger.a.a("PubRecommendClient");
            com.taobao.themis.kernel.logger.a.a("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_INIT, this.f22803a, a2, new JSONObject());
            if (!h.d(this.b)) {
                String str = this.f22803a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "errorMsg", "首页侧未开启算法推荐弹窗");
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str, a2, jSONObject);
            } else if (h.b(this.b)) {
                String str2 = this.f22803a;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "errorMsg", "当前轻应用在首页");
                t tVar2 = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str2, a2, jSONObject2);
            } else {
                Integer b = com.taobao.themis.pub_kit.guide.model.a.b(this.c);
                Integer c = com.taobao.themis.pub_kit.guide.model.a.c(this.c);
                if (b == null && c == null) {
                    String str3 = this.f22803a;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "errorMsg", "strongGuideAlgorithmUserStayTime or strongGuideAlgorithmUserClickTime is null");
                    t tVar3 = t.INSTANCE;
                    com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str3, a2, jSONObject3);
                }
                PubRecommendClient.PubRecommendRequestParam pubRecommendRequestParam = new PubRecommendClient.PubRecommendRequestParam(this.f, this.g, b != null ? b.intValue() : 0, c != null ? c.intValue() : 0, (int) ((System.currentTimeMillis() - this.e.getUserEnterTime()) / 1000), this.e.getUserClickedCount() - 1);
                com.taobao.themis.kernel.logger.a.a("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_START, this.f22803a, a2, new JSONObject(pubRecommendRequestParam.toMap()));
                if (this.e.isRecommendGuideShowing()) {
                    return;
                }
                this.e.setRecommendGuideShowing(true);
                new PubRecommendClient(pubRecommendRequestParam, new C0973a(a2)).a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/pub_kit/utils/PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4", "Lcom/taobao/themis/kernel/network/CommonListener;", "Lcom/alibaba/fastjson/JSONObject;", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "onSuccess", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.pub_kit.utils.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0973a implements com.taobao.themis.kernel.network.b<JSONObject, JSONObject> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public C0973a(String str) {
                this.b = str;
            }

            @Override // com.taobao.themis.kernel.network.b
            public /* synthetic */ void onFailure(String str, String str2, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, jSONObject});
                } else {
                    a(str, str2, jSONObject);
                }
            }

            @Override // com.taobao.themis.kernel.network.b
            public /* synthetic */ void onSuccess(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, jSONObject});
                } else {
                    a(jSONObject);
                }
            }

            public void a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                com.taobao.themis.kernel.logger.a.a("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_SUCCESS, a.this.f22803a, this.b, jSONObject);
                if (q.a((Object) (jSONObject != null ? jSONObject.getBoolean("isReplace") : null), (Object) true) && jSONObject.getJSONObject("delta") != null) {
                    com.taobao.themis.kernel.utils.a.a(new PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1(this, jSONObject));
                    return;
                }
                String str = a.this.f22803a;
                String str2 = this.b;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "errorMsg", "response isReplace is false or delta is null");
                jSONObject3.put((JSONObject) InputFrame3.TYPE_RESPONSE, (String) jSONObject);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str, str2, jSONObject2);
            }

            public void a(String str, String str2, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
                    return;
                }
                String str3 = a.this.f22803a;
                String str4 = this.b;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "errorCode", str);
                jSONObject3.put((JSONObject) "errorMsg", str2);
                jSONObject3.put((JSONObject) InputFrame3.TYPE_RESPONSE, (String) jSONObject);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str3, str4, jSONObject2);
            }
        }
    }
}
