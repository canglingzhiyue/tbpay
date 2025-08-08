package com.taobao.themis.open.permission.check;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.h;
import com.taobao.themis.kernel.utils.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/open/permission/check/PermissionUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "convertPermissionInfo", "Lcom/taobao/themis/open/permission/check/ApiPermissionInfo;", "permissionModel", "Lcom/alibaba/ariver/resource/api/models/PermissionModel;", "hasPermission", "Lcom/taobao/themis/open/permission/check/PermissionResult;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "apiPermissionInfo", "checkKey", "checkValue", "needCheck", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final String TAG = "PermissionUtils";

    static {
        kge.a(-2045762934);
        INSTANCE = new b();
    }

    private b() {
    }

    public final boolean a(f fVar) {
        TMSMetaInfoWrapper v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb8a31", new Object[]{this, fVar})).booleanValue();
        }
        if (fVar != null && (v = fVar.v()) != null) {
            return v.g();
        }
        return true;
    }

    public final a a(PermissionModel permissionModel) {
        JSONArray jSONArray;
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("eb377617", new Object[]{this, permissionModel});
        }
        q.d(permissionModel, "permissionModel");
        a aVar = new a();
        aVar.b().put(a.ENABLE_PROXY, permissionModel.getEnableProxy());
        aVar.b().put(a.FORCE_USE_SSL, permissionModel.getForceUseSsl());
        Map<String, List<String>> a2 = aVar.a();
        Set<String> jsapiList = permissionModel.getJsapiList();
        List<String> list = null;
        a2.put(a.JS_API_LIST, jsapiList != null ? p.d((Collection) jsapiList) : null);
        Map<String, List<String>> a3 = aVar.a();
        Set<String> eventList = permissionModel.getEventList();
        a3.put(a.EVENT_LIST, eventList != null ? p.d((Collection) eventList) : null);
        Map<String, List<String>> a4 = aVar.a();
        Set<String> validDomains = permissionModel.getValidDomains();
        a4.put(a.VALID_DOMAIN, validDomains != null ? p.d((Collection) validDomains) : null);
        Map<String, List<String>> a5 = aVar.a();
        Set<String> validSubResMimeList = permissionModel.getValidSubResMimeList();
        a5.put(a.VALID_SUB_RES_MIME_LIST, validSubResMimeList != null ? p.d((Collection) validSubResMimeList) : null);
        Map<String, List<String>> a6 = aVar.a();
        Set<String> httpLinkSubResMimeList = permissionModel.getHttpLinkSubResMimeList();
        if (httpLinkSubResMimeList != null) {
            list = p.d((Collection) httpLinkSubResMimeList);
        }
        a6.put(a.HTTP_LINK_SUB_RES_MIME_LIST, list);
        JSONObject specialConfigs = permissionModel.getSpecialConfigs();
        if (specialConfigs != null && (keySet = specialConfigs.keySet()) != null) {
            for (String str : keySet) {
                JSONObject jSONObject = permissionModel.getSpecialConfigs().getJSONObject(str);
                if (jSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Set<String> keySet2 = jSONObject.keySet();
                    q.b(keySet2, "spValue.keys");
                    for (String str2 : keySet2) {
                        arrayList.add(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
                        if (jSONArray2 != null) {
                            for (Object obj : jSONArray2) {
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                arrayList2.add((String) obj);
                            }
                            continue;
                        }
                        Map<String, List<String>> a7 = aVar.a();
                        a7.put("JSAPI_SP_Config_" + str + '_' + str2, arrayList2);
                    }
                    Map<String, List<String>> a8 = aVar.a();
                    a8.put("JSAPI_SP_Config_" + str, arrayList);
                }
            }
        }
        JSONObject webviewConfigs = permissionModel.getWebviewConfigs();
        if (webviewConfigs != null && (jSONArray = webviewConfigs.getJSONArray(a.ALLOWED_DOMAIN)) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : jSONArray) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                arrayList3.add((String) obj2);
            }
            aVar.a().put("Webview_Config_allowedDomain", arrayList3);
        }
        return aVar;
    }

    public final PermissionResult a(f fVar, a apiPermissionInfo, String checkKey, String checkValue) {
        String str;
        Matcher matcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("1bede2c2", new Object[]{this, fVar, apiPermissionInfo, checkKey, checkValue});
        }
        q.d(apiPermissionInfo, "apiPermissionInfo");
        q.d(checkKey, "checkKey");
        q.d(checkValue, "checkValue");
        TMSLogger.b(TMSPermissionManager.TAG, "checkPermission, key: " + checkKey + ", value: " + checkValue);
        if (fVar != null && k.t(fVar)) {
            return PermissionResult.IGNORE;
        }
        String str2 = checkKey;
        if (StringUtils.equals(str2, a.VALID_SUB_RES_MIME_LIST) || n.b(checkKey, a.JS_API_SP_CONFIG, false, 2, (Object) null) || StringUtils.equals(str2, a.EVENT_LIST) || StringUtils.equals(str2, a.HTTP_LINK_SUB_RES_MIME_LIST) || n.b(checkKey, a.WEB_VIEW_CONFIG, false, 2, (Object) null) || StringUtils.equals(str2, a.VALID_DOMAIN)) {
            List<String> list = apiPermissionInfo.a().get(checkKey);
            if (list != null) {
                for (String str3 : list) {
                    try {
                        h hVar = h.INSTANCE;
                        if (str3 == null) {
                            str = null;
                        } else if (str3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        } else {
                            str = n.b((CharSequence) str3).toString();
                        }
                        Pattern a2 = hVar.a(str);
                        if (a2 != null && (matcher = a2.matcher(checkValue)) != null) {
                            if (matcher.find()) {
                                TMSLogger.b(TMSPermissionManager.TAG, "checkPermission match regex, ignore");
                                return PermissionResult.IGNORE;
                            }
                        }
                    } catch (Throwable th) {
                        TMSLogger.b(TAG, "", th);
                    }
                }
            }
            TMSLogger.b(TAG, checkKey + " not have permssion ,not match regex");
            if (StringUtils.equals(str2, a.VALID_SUB_RES_MIME_LIST)) {
                return PermissionResult.DENY_N22105;
            }
            if (n.b(checkKey, a.JS_API_SP_CONFIG, false, 2, (Object) null)) {
                return PermissionResult.DENY_N22106;
            }
            if (StringUtils.equals(str2, a.EVENT_LIST)) {
                return PermissionResult.DENY_N22107;
            }
            if (StringUtils.equals(str2, a.HTTP_LINK_SUB_RES_MIME_LIST)) {
                return PermissionResult.DENY_N22108;
            }
            if (n.b(checkKey, a.WEB_VIEW_CONFIG, false, 2, (Object) null)) {
                return PermissionResult.DENY_N22109;
            }
            if (StringUtils.equals(str2, a.VALID_DOMAIN)) {
                return PermissionResult.DENY_N22110;
            }
            return PermissionResult.DENY;
        }
        List<String> list2 = apiPermissionInfo.a().get(checkKey);
        if (list2 != null && list2.contains(checkValue)) {
            return PermissionResult.IGNORE;
        }
        TMSLogger.b(TAG, checkKey + " not have permssion");
        return PermissionResult.DENY_N22104;
    }
}
