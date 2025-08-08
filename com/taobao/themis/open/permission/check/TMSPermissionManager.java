package com.taobao.themis.open.permission.check;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.n;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\"\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/permission/check/TMSPermissionManager;", "", "()V", "JSAPI_WHITE_LIST", "", "", RPCDataItems.SWITCH_TAG_LOG, "checkInvokePermission", "Lcom/taobao/themis/open/permission/check/PermissionResult;", "apiName", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_PERMISSION_CHECK, "params", "Lcom/alibaba/fastjson/JSONObject;", "checkSpecialPermission", "checkUrlDomainValid", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "url", "configType", "Lcom/taobao/themis/open/permission/check/TMSPermissionManager$SpecialConfigType;", "needCheckPermission", "SpecialConfigType", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSPermissionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TMSPermissionManager INSTANCE;
    public static final String TAG = "TMSPermissionManager";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f22714a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/open/permission/check/TMSPermissionManager$SpecialConfigType;", "", OConstant.DIMEN_CONFIG_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getConfigName", "()Ljava/lang/String;", "HTTPREQUET", "WEBSOCKET", "RESOURCE", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum SpecialConfigType {
        HTTPREQUET(a.HTTPREQUET),
        WEBSOCKET(a.WEBSOCKET),
        RESOURCE("resource");
        
        private final String configName;

        SpecialConfigType(String str) {
            this.configName = str;
        }

        public final String getConfigName() {
            return this.configName;
        }
    }

    static {
        kge.a(-1389369476);
        INSTANCE = new TMSPermissionManager();
        f22714a = p.c("showNetWorkCheckActivity", "showUCFailDialog", "setKeyboardType", "monitorH5Performance", "monitorH5Performance", "getStartupParams", "inputBlurEvent", "hideCustomKeyBoard", "hideCustomInputMethod4NativeInput", "updateNativeKeyBoardInput", "setInputTextChanged", "tinyAppStandardLog", "tinyDebugConsole", "needShowAuthSettingEntry", "sendMtop", "remoteLog", "tyroRequest", "showRemoteDebugMask", "needShowAuthSettingEntry", "reportCicadaStatus", com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_GETPREFETCHDATA, "checkTinyAppPermission", "checkJSPermission");
        try {
            Result.a aVar = Result.Companion;
            List it = JSON.parseArray(n.ba(), String.class);
            List<String> list = f22714a;
            q.b(it, "it");
            Result.m2371constructorimpl(Boolean.valueOf(list.addAll(it)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    private TMSPermissionManager() {
    }

    public final PermissionResult a(String str, JSONObject jSONObject, ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("6bdea786", new Object[]{this, str, jSONObject, apiContext});
        }
        f c = apiContext != null ? apiContext.c() : null;
        if (StringUtils.isEmpty(str) || c == null) {
            TMSLogger.d(TAG, "checkPermission,instance is null");
            return PermissionResult.DENY_N22101;
        }
        q.a((Object) str);
        PermissionResult a2 = a(str, apiContext);
        return a2 == PermissionResult.ALLOW ? b(str, jSONObject, apiContext) : a2;
    }

    private final PermissionResult a(String str, ApiContext apiContext) {
        TMSMetaInfoWrapper v;
        PermissionModel k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("4c67bfd2", new Object[]{this, str, apiContext});
        }
        f c = apiContext.c();
        apiContext.d();
        if (f22714a.contains(str)) {
            TMSLogger.b(TAG, "checkInvokePermission is in white list, ignore");
            return PermissionResult.IGNORE;
        } else if (apiContext.b() == ApiContext.Source.FRAMEWORK) {
            TMSLogger.b(TAG, "checkInvokePermission is from framework, ignore");
            return PermissionResult.IGNORE;
        } else if (!b.INSTANCE.a(c)) {
            TMSLogger.b(TAG, "checkInvokePermission do not need check, ignore");
            return PermissionResult.IGNORE;
        } else {
            Set<String> jsapiList = (c == null || (v = c.v()) == null || (k = v.k()) == null) ? null : k.getJsapiList();
            if (jsapiList != null) {
                for (String str2 : jsapiList) {
                    if (q.a((Object) str, (Object) str2)) {
                        TMSLogger.b(TAG, "checkInvokePermission in jsapi list, allow");
                        return PermissionResult.ALLOW;
                    }
                }
            }
            TMSLogger.c(TAG, "checkInvokePermission deny");
            return PermissionResult.DENY_N22104;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r8.equals(com.taobao.themis.open.permission.check.a.HTTPREQUET) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
        if (r8.equals("request") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r8.equals(com.taobao.themis.open.permission.check.a.UPLOAD_FILE) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        r8 = r9.getString("url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r8 = android.net.Uri.parse(r8);
        kotlin.jvm.internal.q.b(r8, "Uri.parse(url)");
        r8 = r8.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r8 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        return com.taobao.themis.open.permission.check.PermissionResult.IGNORE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        kotlin.jvm.internal.q.b(r8, "Uri.parse(url).host ?: r…n PermissionResult.IGNORE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
        return com.taobao.themis.open.permission.check.b.INSTANCE.a(r10, r0, "JSAPI_SP_Config_httpRequest_allowedDomain", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
        return com.taobao.themis.open.permission.check.PermissionResult.IGNORE;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.themis.open.permission.check.PermissionResult b(java.lang.String r8, com.alibaba.fastjson.JSONObject r9, com.taobao.themis.kernel.ability.base.ApiContext r10) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.check.TMSPermissionManager.b(java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.themis.kernel.ability.base.ApiContext):com.taobao.themis.open.permission.check.PermissionResult");
    }

    public final boolean a(f fVar, String apiName, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5a24b1d", new Object[]{this, fVar, apiName, jSONObject})).booleanValue();
        }
        q.d(apiName, "apiName");
        n nVar = n.INSTANCE;
        if (fVar == null || (str = fVar.h()) == null) {
            str = "null";
        }
        return nVar.b(str);
    }

    public final boolean a(f instance, String url, SpecialConfigType configType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3294e5d", new Object[]{this, instance, url, configType})).booleanValue();
        }
        q.d(instance, "instance");
        q.d(url, "url");
        q.d(configType, "configType");
        if (!n.aD()) {
            return true;
        }
        Uri parse = Uri.parse(url);
        q.b(parse, "Uri.parse(url)");
        String host = parse.getHost();
        if (host == null) {
            return false;
        }
        q.b(host, "Uri.parse(url).host ?: return false");
        String str = "JSAPI_SP_Config_" + configType.getConfigName() + "_allowedDomain";
        a a2 = c.a(instance);
        return a2 == null || b.INSTANCE.a(instance, a2, str, host) == PermissionResult.IGNORE;
    }
}
