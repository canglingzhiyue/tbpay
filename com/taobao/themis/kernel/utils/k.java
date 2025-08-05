package com.taobao.themis.kernel.utils;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.List;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0002\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001e\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u001f\u001a\u0004\u0018\u00010 *\u00020\u0002\u001a\f\u0010!\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\"\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010#\u001a\u00020\u0014*\u00020\u0002\u001a\n\u0010$\u001a\u00020\u0014*\u00020\u0002\u001a\n\u0010%\u001a\u00020\u0014*\u00020\u0002\u001a\u0011\u0010&\u001a\u0004\u0018\u00010\u0014*\u00020\u0002¢\u0006\u0002\u0010'\u001a\n\u0010(\u001a\u00020\u0014*\u00020\u0002\u001a\n\u0010)\u001a\u00020\u0014*\u00020\u0002¨\u0006*"}, d2 = {"getAccountSite", "", "Lcom/taobao/themis/kernel/TMSInstance;", "getAppDesc", "getAppFrameType", "getAppKey", "getAppLogo", "getAppName", "getAppNaviStyle", "getAppSubType", "getAppVersion", "getAuthKey", "getBizType", "getDeveloper", "getDeviceOrientation", "getDowngradeUrl", "getFrameworkPlugins", "", "Lcom/alibaba/ariver/resource/api/models/PluginModel;", "getHideAboutPageButton", "", "getInvokeAppId", "isvAppId", "getInvokeAppKey", "getMainAppId", "getOpenMode", "getSearchGuideKeyword", "getSellerIdFromAppInfo", "getTemplateId", "getTemplateKey", "getTemplateVersion", "getWidgetCacheInfo", "Lcom/alibaba/fastjson/JSONObject;", "getWidgetPackageUrl", "getWidgetRuntimeVersion", "hasAuth", "isFavorEnable", com.taobao.tao.log.statistics.d.PARAM_IS_INNER, "isSpecialFavor", "(Lcom/taobao/themis/kernel/TMSInstance;)Ljava/lang/Boolean;", "isTemplateValid", "isThirdParty", "themis_kernel_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-380565317);
    }

    public static final String a(com.taobao.themis.kernel.f getAppFrameType) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9586a13", new Object[]{getAppFrameType});
        }
        kotlin.jvm.internal.q.d(getAppFrameType, "$this$getAppFrameType");
        TMSMetaInfoWrapper v = getAppFrameType.v();
        String string = (v == null || (m = v.m()) == null) ? null : m.getString("frameTempType");
        return TextUtils.isEmpty(string) ? getAppFrameType.q().getAppFrameType() : string;
    }

    public static final String b(com.taobao.themis.kernel.f getBizType) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb021032", new Object[]{getBizType});
        }
        kotlin.jvm.internal.q.d(getBizType, "$this$getBizType");
        TMSMetaInfoWrapper v = getBizType.v();
        String string = (v == null || (m = v.m()) == null) ? null : m.getString("bizType");
        return TextUtils.isEmpty(string) ? getBizType.q().getBizType() : string;
    }

    public static final String c(com.taobao.themis.kernel.f getAppSubType) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcabb651", new Object[]{getAppSubType});
        }
        kotlin.jvm.internal.q.d(getAppSubType, "$this$getAppSubType");
        String str = null;
        String str2 = null;
        if (com.taobao.themis.utils.f.a(getAppSubType.o())) {
            str2 = getAppSubType.q().getAppSubType();
        }
        if (TextUtils.isEmpty(str2)) {
            TMSMetaInfoWrapper v = getAppSubType.v();
            if (v != null && (m = v.m()) != null) {
                str = m.getString(com.taobao.tao.tbmainfragment.i.SUB_KEY_FRAGMENT_JUMP);
            }
            str2 = str;
        }
        return TextUtils.isEmpty(str2) ? getAppSubType.q().getAppSubType() : str2;
    }

    public static final String e(com.taobao.themis.kernel.f getOpenMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fff028f", new Object[]{getOpenMode});
        }
        kotlin.jvm.internal.q.d(getOpenMode, "$this$getOpenMode");
        return getOpenMode.q().getOpenModel();
    }

    public static final String d(com.taobao.themis.kernel.f getAppVersion) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae555c70", new Object[]{getAppVersion});
        }
        kotlin.jvm.internal.q.d(getAppVersion, "$this$getAppVersion");
        TMSMetaInfoWrapper v = getAppVersion.v();
        return (v == null || (b = v.b()) == null) ? "-1" : b;
    }

    public static final String g(com.taobao.themis.kernel.f getTemplateId) {
        TemplateConfigModel n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83524ecd", new Object[]{getTemplateId});
        }
        kotlin.jvm.internal.q.d(getTemplateId, "$this$getTemplateId");
        TMSMetaInfoWrapper v = getTemplateId.v();
        if (v != null && (n = v.n()) != null) {
            return n.getTemplateId();
        }
        return null;
    }

    public static final boolean f(com.taobao.themis.kernel.f isTemplateValid) {
        TemplateConfigModel n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66023636", new Object[]{isTemplateValid})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isTemplateValid, "$this$isTemplateValid");
        TMSMetaInfoWrapper v = isTemplateValid.v();
        return (v == null || (n = v.n()) == null || !n.isTemplateValid()) ? false : true;
    }

    public static final String h(com.taobao.themis.kernel.f getTemplateKey) {
        TemplateConfigModel n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74fbf4ec", new Object[]{getTemplateKey});
        }
        kotlin.jvm.internal.q.d(getTemplateKey, "$this$getTemplateKey");
        TMSMetaInfoWrapper v = getTemplateKey.v();
        if (v != null && (n = v.n()) != null) {
            return n.getAppKey();
        }
        return null;
    }

    public static final String i(com.taobao.themis.kernel.f getTemplateVersion) {
        TemplateConfigModel n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a59b0b", new Object[]{getTemplateVersion});
        }
        kotlin.jvm.internal.q.d(getTemplateVersion, "$this$getTemplateVersion");
        TMSMetaInfoWrapper v = getTemplateVersion.v();
        if (v != null && (n = v.n()) != null) {
            return n.getTemplateVersion();
        }
        return null;
    }

    public static final String j(com.taobao.themis.kernel.f getAppName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("584f412a", new Object[]{getAppName});
        }
        kotlin.jvm.internal.q.d(getAppName, "$this$getAppName");
        TMSMetaInfoWrapper v = getAppName.v();
        if (v == null) {
            return null;
        }
        return v.c();
    }

    public static final String k(com.taobao.themis.kernel.f getAppLogo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f8e749", new Object[]{getAppLogo});
        }
        kotlin.jvm.internal.q.d(getAppLogo, "$this$getAppLogo");
        TMSMetaInfoWrapper v = getAppLogo.v();
        if (v == null) {
            return null;
        }
        return v.d();
    }

    public static final String l(com.taobao.themis.kernel.f getAppDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ba28d68", new Object[]{getAppDesc});
        }
        kotlin.jvm.internal.q.d(getAppDesc, "$this$getAppDesc");
        TMSMetaInfoWrapper v = getAppDesc.v();
        if (v == null) {
            return null;
        }
        return v.e();
    }

    public static final String n(com.taobao.themis.kernel.f getDeviceOrientation) {
        Window b;
        Window.Orientation k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ef5d9a6", new Object[]{getDeviceOrientation});
        }
        kotlin.jvm.internal.q.d(getDeviceOrientation, "$this$getDeviceOrientation");
        TMSSolutionType j = getDeviceOrientation.j();
        if (j != null && l.$EnumSwitchMapping$0[j.ordinal()] == 1) {
            TMSMetaInfoWrapper v = getDeviceOrientation.v();
            if (v == null) {
                return null;
            }
            return v.w();
        }
        com.taobao.themis.kernel.container.a x = getDeviceOrientation.x();
        if (x != null && (b = x.b()) != null && (k = b.k()) != null) {
            return k.getOrientation();
        }
        return null;
    }

    public static final String o(com.taobao.themis.kernel.f getAuthKey) {
        JSONObject m;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("109f7fc5", new Object[]{getAuthKey});
        }
        kotlin.jvm.internal.q.d(getAuthKey, "$this$getAuthKey");
        TMSMetaInfoWrapper v = getAuthKey.v();
        return (v == null || (m = v.m()) == null || (jSONObject = m.getJSONObject(BlobManager.META_COLL_KEY_AUTH_INFO)) == null || (string = jSONObject.getString("authAppkey")) == null) ? p(getAuthKey) : string;
    }

    public static final String p(com.taobao.themis.kernel.f getAppKey) {
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24925e4", new Object[]{getAppKey});
        }
        kotlin.jvm.internal.q.d(getAppKey, "$this$getAppKey");
        TMSMetaInfoWrapper v = getAppKey.v();
        return (v == null || (h = v.h()) == null) ? "" : h;
    }

    public static final String q(com.taobao.themis.kernel.f getAccountSite) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3f2cc03", new Object[]{getAccountSite});
        }
        kotlin.jvm.internal.q.d(getAccountSite, "$this$getAccountSite");
        TMSMetaInfoWrapper v = getAccountSite.v();
        if (v != null && (m = v.m()) != null) {
            return m.getString("instanceSite");
        }
        return null;
    }

    public static final String r(com.taobao.themis.kernel.f getMainAppId) {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e59c7222", new Object[]{getMainAppId});
        }
        kotlin.jvm.internal.q.d(getMainAppId, "$this$getMainAppId");
        TMSMetaInfoWrapper v = getMainAppId.v();
        String string = (v == null || (m = v.m()) == null || (jSONObject = m.getJSONObject(BlobManager.META_COLL_KEY_AUTH_INFO)) == null) ? null : jSONObject.getString("authAppId");
        if (string != null) {
            return string;
        }
        String appId = getMainAppId.h();
        kotlin.jvm.internal.q.b(appId, "appId");
        return appId;
    }

    public static /* synthetic */ String a(com.taobao.themis.kernel.f fVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0c52198", new Object[]{fVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return a(fVar, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r5 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(com.taobao.themis.kernel.f r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.kernel.utils.k.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r4 = "c83d76c9"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.String r0 = "$this$getInvokeAppId"
            kotlin.jvm.internal.q.d(r4, r0)
            if (r5 == 0) goto L2d
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.n.a(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 != 0) goto L31
        L2d:
            java.lang.String r5 = g(r4)
        L31:
            if (r5 != 0) goto L3c
            java.lang.String r5 = r4.h()
            java.lang.String r4 = "appId"
            kotlin.jvm.internal.q.b(r5, r4)
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.utils.k.a(com.taobao.themis.kernel.f, java.lang.String):java.lang.String");
    }

    public static final String y(com.taobao.themis.kernel.f getInvokeAppKey) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("813ffcfb", new Object[]{getInvokeAppKey});
        }
        kotlin.jvm.internal.q.d(getInvokeAppKey, "$this$getInvokeAppKey");
        String h = h(getInvokeAppKey);
        String str = h;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            h = null;
        }
        return h == null ? p(getInvokeAppKey) : h;
    }

    public static final String s(com.taobao.themis.kernel.f getAppNaviStyle) {
        JSONObject m;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7461841", new Object[]{getAppNaviStyle});
        }
        kotlin.jvm.internal.q.d(getAppNaviStyle, "$this$getAppNaviStyle");
        TMSMetaInfoWrapper v = getAppNaviStyle.v();
        return (v == null || (m = v.m()) == null || (jSONObject = m.getJSONObject("appNaviConfig")) == null || (string = jSONObject.getString("style")) == null) ? "" : string;
    }

    public static final boolean t(com.taobao.themis.kernel.f isInner) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47ce7e44", new Object[]{isInner})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isInner, "$this$isInner");
        TMSMetaInfoWrapper v = isInner.v();
        return (v == null || (m = v.m()) == null || m.getIntValue("appChannel") != 5) ? false : true;
    }

    public static final String u(com.taobao.themis.kernel.f getDowngradeUrl) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba99647f", new Object[]{getDowngradeUrl});
        }
        kotlin.jvm.internal.q.d(getDowngradeUrl, "$this$getDowngradeUrl");
        TMSMetaInfoWrapper v = getDowngradeUrl.v();
        if (v != null && (m = v.m()) != null) {
            return m.getString("downgradeUrl");
        }
        return null;
    }

    public static final String v(com.taobao.themis.kernel.f getDeveloper) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac430a9e", new Object[]{getDeveloper});
        }
        kotlin.jvm.internal.q.d(getDeveloper, "$this$getDeveloper");
        TMSMetaInfoWrapper v = getDeveloper.v();
        if (v != null && (m = v.m()) != null) {
            return m.getString("developer");
        }
        return null;
    }

    public static final List<PluginModel> w(com.taobao.themis.kernel.f getFrameworkPlugins) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8002f1a4", new Object[]{getFrameworkPlugins});
        }
        kotlin.jvm.internal.q.d(getFrameworkPlugins, "$this$getFrameworkPlugins");
        TMSMetaInfoWrapper w = getFrameworkPlugins.w();
        if (w == null) {
            return null;
        }
        return w.p();
    }

    public static final String x(com.taobao.themis.kernel.f getSellerIdFromAppInfo) {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9656dc", new Object[]{getSellerIdFromAppInfo});
        }
        kotlin.jvm.internal.q.d(getSellerIdFromAppInfo, "$this$getSellerIdFromAppInfo");
        TMSMetaInfoWrapper v = getSellerIdFromAppInfo.v();
        if (v != null && (m = v.m()) != null && (jSONObject = m.getJSONObject("sellerInfo")) != null) {
            return jSONObject.getString("sellerId");
        }
        return null;
    }

    public static final String z(com.taobao.themis.kernel.f getSearchGuideKeyword) {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72e9a31a", new Object[]{getSearchGuideKeyword});
        }
        kotlin.jvm.internal.q.d(getSearchGuideKeyword, "$this$getSearchGuideKeyword");
        TMSMetaInfoWrapper v = getSearchGuideKeyword.v();
        if (v != null && (m = v.m()) != null && (jSONObject = m.getJSONObject("bizInfo")) != null) {
            return jSONObject.getString("searchGuideKeyword");
        }
        return null;
    }

    public static final String A(com.taobao.themis.kernel.f getWidgetPackageUrl) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a423a633", new Object[]{getWidgetPackageUrl});
        }
        kotlin.jvm.internal.q.d(getWidgetPackageUrl, "$this$getWidgetPackageUrl");
        TMSMetaInfoWrapper v = getWidgetPackageUrl.v();
        if (v != null && (m = v.m()) != null) {
            return m.getString("widgetPackageUrl");
        }
        return null;
    }

    public static final JSONObject B(com.taobao.themis.kernel.f getWidgetCacheInfo) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd1eb92e", new Object[]{getWidgetCacheInfo});
        }
        kotlin.jvm.internal.q.d(getWidgetCacheInfo, "$this$getWidgetCacheInfo");
        TMSMetaInfoWrapper v = getWidgetCacheInfo.v();
        if (v != null && (m = v.m()) != null) {
            return m.getJSONObject("widgetCacheInfo");
        }
        return null;
    }

    public static final boolean C(com.taobao.themis.kernel.f getHideAboutPageButton) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31838213", new Object[]{getHideAboutPageButton})).booleanValue();
        }
        kotlin.jvm.internal.q.d(getHideAboutPageButton, "$this$getHideAboutPageButton");
        TMSMetaInfoWrapper v = getHideAboutPageButton.v();
        return kotlin.jvm.internal.q.a((Object) ((v == null || (m = v.m()) == null) ? null : m.getString("hideAboutPageButton")), (Object) "true");
    }

    public static final String D(com.taobao.themis.kernel.f getWidgetRuntimeVersion) {
        JSONObject m;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79209890", new Object[]{getWidgetRuntimeVersion});
        }
        kotlin.jvm.internal.q.d(getWidgetRuntimeVersion, "$this$getWidgetRuntimeVersion");
        TMSMetaInfoWrapper v = getWidgetRuntimeVersion.v();
        return (v == null || (m = v.m()) == null || (string = m.getString("widgetRuntimeVersion")) == null) ? "" : string;
    }
}
