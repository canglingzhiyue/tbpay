package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.utils.o;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.lcu;
import tb.lkk;
import tb.lkn;
import tb.lnv;
import tb.mpa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002$%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J&\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\"\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u001d\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J3\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "getEnableAddIconButton", "", "homePagePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "getEnableIconChangeGuide", "getHomePageIsSingleRow", "getHomePagePopData", "delta", "Lcom/alibaba/fastjson/JSONObject;", "getIconChangeData", "", "context", "Landroid/content/Context;", "appId", "callback", "Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$IconChangeDataCallback;", "getIsAlgorithm", "getPopType", "type", "getTBHomeInfo", "action", "params", "Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$GetTBHomeInfoCallback;", "isHaveAllChannelsBiz", "isHaveMiniAppBiz", "jumpToTBHome", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "Landroid/graphics/Bitmap;", "iconAnimDuration", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/Integer;)V", "GetTBHomeInfoCallback", "IconChangeDataCallback", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$GetTBHomeInfoCallback;", "", "onFailed", "", "s", "", "onSuccess", "data", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$IconChangeDataCallback;", "", "onResult", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(1657759371);
        INSTANCE = new h();
    }

    private h() {
    }

    @JvmStatic
    public static final void a(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12390540", new Object[]{context, str, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "guideReplaceMiniAppId", str);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "miniAppBizParam", jSONObject.toJSONString());
        jSONObject3.put((JSONObject) "business", "miniApp");
        INSTANCE.a("miniApp.request", jSONObject2, new c(context, bVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/pub_kit/utils/TBHomeUtilsNew$getIconChangeData$1", "Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$GetTBHomeInfoCallback;", "onFailed", "", "s", "", "onSuccess", "data", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22811a;
        public final /* synthetic */ b b;

        public c(Context context, b bVar) {
            this.f22811a = context;
            this.b = bVar;
        }

        @Override // com.taobao.themis.pub_kit.utils.h.a
        public void a(JSONObject data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
                return;
            }
            q.d(data, "data");
            if (com.taobao.themis.utils.f.a(this.f22811a)) {
                TMSLogger.d("TBHomeUtils", "miniApp.request: " + data.toJSONString());
            }
            b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.a(data);
        }

        @Override // com.taobao.themis.pub_kit.utils.h.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            TMSLogger.d("TBHomeUtils", "miniApp.request error: " + str);
            b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.a(null);
        }
    }

    @JvmStatic
    public static final boolean a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad9ea594", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return q.a((Object) "true", (Object) (jSONObject2 != null ? jSONObject2.getString("isHaveAllChannelsBiz") : null));
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final boolean b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1467915", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return q.a((Object) "true", (Object) (jSONObject2 != null ? jSONObject2.getString("isHaveMiniAppBiz") : null));
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final boolean c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4ee4c96", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return q.a((Object) com.taobao.search.mmd.datasource.bean.f.TEMPLATE_SINGLE_ROW, (Object) (jSONObject2 != null ? jSONObject2.getString("iconVersion") : null));
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final JSONArray a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b99aadb6", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("homePagePopDatas");
    }

    @JvmStatic
    public static final boolean d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8962017", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return q.a((Object) "true", (Object) (jSONObject2 != null ? jSONObject2.getString("isAlogrim") : null));
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final String a(JSONArray jSONArray, String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1ef4886", new Object[]{jSONArray, type});
        }
        q.d(type, "type");
        if (jSONArray == null) {
            return null;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) type, (Object) "iconChangeGuidePopup") && q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "replaceIconBusiness")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    if (jSONObject2 == null) {
                        return null;
                    }
                    return jSONObject2.getString("miniGuideReplacePopType");
                } else if (q.a((Object) type, (Object) "userActiveIconChangeGuidePopup") && q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "replaceIconCustomBusiness")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
                    if (jSONObject3 == null) {
                        return null;
                    }
                    return jSONObject3.getString("miniGuideReplacePopType");
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return null;
    }

    public final boolean e(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc3df398", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "replaceIconBusiness")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    public final boolean f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5c719", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (q.a((Object) jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), (Object) "replaceIconCustomBusiness")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    public static /* synthetic */ void a(Context context, String str, Bitmap bitmap, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742488c", new Object[]{context, str, bitmap, num, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            num = 500;
        }
        a(context, str, bitmap, num);
    }

    @JvmStatic
    public static final void a(Context context, String appId, Bitmap bitmap, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba00e4b3", new Object[]{context, appId, bitmap, num});
            return;
        }
        q.d(context, "context");
        q.d(appId, "appId");
        Uri.Builder buildUpon = o.b("http://m.taobao.com/index.htm?scrollto=recmd&target=guess").buildUpon();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) 0);
        t tVar = t.INSTANCE;
        buildUpon.appendQueryParameter("_afc_params_json", jSONObject.toJSONString());
        buildUpon.appendQueryParameter("launchType", mpa.COLD);
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("isNeedHome", "0");
        q.b(appendQueryParameter, "\"http://m.taobao.com/ind…Home\", \"0\")\n            }");
        if (bitmap == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "jump_ani", "scrollToAFace");
            t tVar2 = t.INSTANCE;
            appendQueryParameter.appendQueryParameter("recmdparams", jSONObject2.toJSONString());
            Nav.from(context).toUri(appendQueryParameter.build());
            return;
        }
        String valueOf = String.valueOf(bitmap.hashCode());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("bitmapSession", (Object) valueOf);
        jSONObject3.put("bitmapValue", (Object) bitmap);
        INSTANCE.a("iconBackAnime.setBitmap", jSONObject3, new f());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "jump_ani", "scrollToAFace");
        jSONObject4.put(lnv.a.ICON_CONTAINER_SECTION_BIZ_CODE, (Object) "icon_and_miniapp_nomore_2019_v1");
        jSONObject4.put(lnv.a.TARGET_MINI_APP_ID, (Object) appId);
        jSONObject4.put(lnv.a.DEFAULT_SECTION_BIZ_CODE, (Object) "qbpd");
        jSONObject4.put(lnv.a.ICON_ANIME_PARENT_IMG, (Object) valueOf);
        jSONObject4.put(lnv.a.ICON_ANIME_DURATION, (Object) num);
        t tVar3 = t.INSTANCE;
        appendQueryParameter.appendQueryParameter("recmdparams", jSONObject4.toJSONString());
        Uri build = appendQueryParameter.build();
        TMSLogger.a("TBHomeUtils", build.toString());
        Nav.from(context).toUri(build);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/pub_kit/utils/TBHomeUtilsNew$jumpToTBHome$2", "Lcom/taobao/themis/pub_kit/utils/TBHomeUtilsNew$GetTBHomeInfoCallback;", "onFailed", "", "s", "", "onSuccess", "data", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.pub_kit.utils.h.a
        public void a(JSONObject data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
            } else {
                q.d(data, "data");
            }
        }

        @Override // com.taobao.themis.pub_kit.utils.h.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            TMSLogger.d("TBHomeUtils", "iconBackAnime.setBitmap error: " + str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/themis/pub_kit/utils/TBHomeUtilsNew$getTBHomeInfo$pluginParam$1", "Lcom/taobao/infoflow/protocol/engine/invoke/globalbiz/IBridgeInvoker$IPluginParam;", "getAction", "", "getContainerId", "getParams", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements lkn.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22813a;
        public final /* synthetic */ JSONObject b;

        @Override // tb.lkn.b
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "newface_home_sub";
        }

        public e(String str, JSONObject jSONObject) {
            this.f22813a = str;
            this.b = jSONObject;
        }

        @Override // tb.lkn.b
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f22813a;
        }

        @Override // tb.lkn.b
        public JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.b;
        }
    }

    private final void a(String str, JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177e7e8d", new Object[]{this, str, jSONObject, aVar});
            return;
        }
        lkk a2 = lcu.a();
        q.b(a2, "InfoFlowEngine.getGlobalBizInvoker()");
        a2.a().a(com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.b.INFO_FLOW_WV_PLUGIN_NAME, new e(str, jSONObject), new d(str, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/pub_kit/utils/TBHomeUtilsNew$getTBHomeInfo$jsCallback$1", "Lcom/taobao/infoflow/protocol/subservice/base/IJsBridgeService$IJsNativeFeature$JsCallback;", "error", "", "s", "", "success", "map", "", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements IJsBridgeService.a.InterfaceC0670a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22812a;
        public final /* synthetic */ a b;

        public d(String str, a aVar) {
            this.f22812a = str;
            this.b = aVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            TMSLogger.d("TBHomeUtils", "action: " + this.f22812a + ", result: " + str);
            a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(str);
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null || this.b == null) {
            } else {
                Object obj = map.get("data");
                if (obj == null) {
                    this.b.a((String) null);
                }
                if (obj instanceof JSONObject) {
                    TMSLogger.b("TBHomeUtils", "action: " + this.f22812a + ", result: " + obj);
                    this.b.a((JSONObject) obj);
                    return;
                }
                TMSLogger.b("TBHomeUtils", "action: " + this.f22812a + ", result: " + obj);
                TMSLogger.b("TBHomeUtils", map.toString());
                a aVar = this.b;
                JSONObject parseObject = JSON.parseObject(String.valueOf(obj));
                q.b(parseObject, "JSON.parseObject(dataObj.toString())");
                aVar.a(parseObject);
            }
        }
    }
}
