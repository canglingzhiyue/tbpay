package com.taobao.themis.open.permission.auth;

import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import com.taobao.weex.common.Constants;
import com.vivo.push.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u00015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J&\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\bJ\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!H\u0002J2\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050$H\u0002J(\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!2\u0006\u0010\t\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aJ\u0010\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005H\u0002J \u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u0005J$\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00052\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010!JD\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050$2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J6\u00102\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b04R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/taobao/themis/open/permission/auth/AuthUtils;", "", "()V", "LOCAL_SCOPE_MAP", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "apiNeedAuth", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "checkTokenExpired", "", "errorCode", "data", "Lcom/alibaba/fastjson/JSONObject;", "clearAccountAuthStorage", "doCheckMtopApiList", "generateAuthRequestParams", "", "requestModel", "Lcom/taobao/themis/open/permission/auth/model/AuthRequestModel;", "generateRequestParamsWithAppKey", "appKey", "appId", "getAuthStatus", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeSettingEntity;", "invokeType", "Lcom/taobao/themis/open/permission/auth/AuthUtils$InvokeType;", "getAuthStatusForSettings", "withSubscription", "getDefaultScopeMap", "", "getLocalScopeStatus", "scopes", "", "getScopeTypeMap", "requestScopeNicks", "getValidAccessToken", "ignorePermissionCheckMtopApi", "api", "isAddISVHeader", MtopJSBridge.MtopJSParam.ACCOUNT_SITE, "isDeviceScope", Constants.Name.SCOPE, "scopeTypeMap", "requestAuthServerCheck", "scopeStatus", "requestScopeList", "updateAuthStatus", "scopeList", "", "InvokeType", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class AuthUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AuthUtils INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f22678a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/open/permission/auth/AuthUtils$InvokeType;", "", "name", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TYPE_ORIGIN", "TYPE_CLIENT", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum InvokeType {
        TYPE_ORIGIN("miniapp-vision"),
        TYPE_CLIENT("client-vision");

        InvokeType(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22679a;
        public final /* synthetic */ String b;
        public final /* synthetic */ f c;
        public final /* synthetic */ String d;
        public final /* synthetic */ InvokeType e;

        public a(List list, String str, f fVar, String str2, InvokeType invokeType) {
            this.f22679a = list;
            this.b = str;
            this.c = fVar;
            this.d = str2;
            this.e = invokeType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IMtopInnerAdapter.Response response;
            List<ScopeEntity> scopes;
            List<ScopeEntity> scopes2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            ArrayList<DomainItemEntity> arrayList = new ArrayList();
            boolean z = false;
            boolean z2 = false;
            for (ScopeSettingEntity scopeSettingEntity : p.g((Iterable) this.f22679a)) {
                String type = scopeSettingEntity.getType();
                if (type != null) {
                    int hashCode = type.hashCode();
                    if (hashCode != -341064690) {
                        if (hashCode != 115029) {
                            if (hashCode == 1874684019 && type.equals("platform")) {
                                String sceneCode = scopeSettingEntity.getSceneCode();
                                if (!(sceneCode == null || sceneCode.length() == 0)) {
                                    com.taobao.themis.open.permission.auth.a aVar = com.taobao.themis.open.permission.auth.a.INSTANCE;
                                    String sceneCode2 = scopeSettingEntity.getSceneCode();
                                    q.a((Object) sceneCode2);
                                    aVar.d(sceneCode2);
                                }
                                if (!z && (scopes = scopeSettingEntity.getScopes()) != null) {
                                    for (ScopeEntity scopeEntity : scopes) {
                                        if (scopeEntity.isChanged()) {
                                            z = true;
                                        }
                                    }
                                    t tVar = t.INSTANCE;
                                }
                            }
                        } else if (type.equals("top") && (scopes2 = scopeSettingEntity.getScopes()) != null) {
                            for (ScopeEntity scopeEntity2 : scopes2) {
                                if (scopeEntity2.getScope() != null) {
                                    if (q.a((Object) scopeEntity2.getAuthRange(), (Object) MspDBHelper.BizEntry.COLUMN_NAME_DEVICE)) {
                                        com.taobao.themis.open.permission.auth.a aVar2 = com.taobao.themis.open.permission.auth.a.INSTANCE;
                                        String str = this.b;
                                        String scope = scopeEntity2.getScope();
                                        q.a((Object) scope);
                                        aVar2.b(str, scope, scopeEntity2.getStatus());
                                    }
                                    if (q.a((Object) scopeEntity2.getAuthRange(), (Object) "taobaoAccount")) {
                                        if (scopeEntity2.isChanged()) {
                                            z = true;
                                        }
                                        String scope2 = scopeEntity2.getScope();
                                        q.a((Object) scope2);
                                        hashMap.put(scope2, Boolean.valueOf(scopeEntity2.getStatus()));
                                    }
                                }
                            }
                            t tVar2 = t.INSTANCE;
                        }
                    } else if (type.equals("resource") && scopeSettingEntity.getDomainItems() != null) {
                        List<DomainItemEntity> domainItems = scopeSettingEntity.getDomainItems();
                        q.a(domainItems);
                        arrayList.addAll(domainItems);
                        this.f22679a.remove(scopeSettingEntity);
                        if (!z2) {
                            List<DomainItemEntity> domainItems2 = scopeSettingEntity.getDomainItems();
                            q.a(domainItems2);
                            for (DomainItemEntity domainItemEntity : domainItems2) {
                                if (domainItemEntity.isChanged()) {
                                    z2 = true;
                                } else {
                                    List<ResourceItemEntity> resourceItems = domainItemEntity.getResourceItems();
                                    if (resourceItems != null) {
                                        for (ResourceItemEntity resourceItemEntity : resourceItems) {
                                            if (resourceItemEntity.isChanged()) {
                                                z2 = true;
                                            }
                                        }
                                        t tVar3 = t.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                Map a2 = AuthUtils.a(AuthUtils.INSTANCE, this.c, this.b, this.d);
                a2.put("scopeParam", JSON.toJSONString(this.f22679a));
                a2.put("origin", this.e.name());
                IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
                JSONObject jSONObject = null;
                if (iMtopInnerAdapter != null) {
                    f fVar = this.c;
                    response = IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.taobao.openlink.miniapp.auth.scope.update.status", "1.0", a2, null, true, fVar != null ? k.q(fVar) : null, null, null, null, 456, null);
                } else {
                    response = null;
                }
                if (response != null && response.getSuccess()) {
                    JSONObject data = response.getData();
                    if (data != null) {
                        jSONObject = data.getJSONObject("data");
                    }
                    if (jSONObject != null) {
                        JSONObject data2 = response.getData();
                        q.a(data2);
                        JSONObject jSONObject2 = data2.getJSONObject("data");
                        for (Map.Entry entry : hashMap.entrySet()) {
                            com.taobao.themis.open.permission.auth.a.INSTANCE.a(this.b, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                        }
                        Boolean bool = jSONObject2.getBoolean("invalidToken");
                        if (bool != null ? bool.booleanValue() : false) {
                            com.taobao.themis.open.permission.auth.a.INSTANCE.a(this.b);
                            if (this.c != null) {
                                AuthUtils.INSTANCE.c(this.c);
                                t tVar4 = t.INSTANCE;
                            }
                        } else {
                            String string = jSONObject2.getString("expirationTime");
                            String string2 = jSONObject2.getString("accessToken");
                            if (string2 != null && string != null) {
                                com.taobao.themis.open.permission.auth.a.INSTANCE.a(this.b, string2, string);
                            }
                        }
                        JSONArray jSONArray = jSONObject2.getJSONArray("platformScopes");
                        if (jSONArray != null) {
                            for (Object obj : jSONArray) {
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                }
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String sceneCode3 = jSONObject3.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
                                JSONObject dataKeyDiffs = jSONObject3.getJSONObject("dataKeyDiffs");
                                ArrayList arrayList2 = new ArrayList();
                                q.b(dataKeyDiffs, "dataKeyDiffs");
                                for (Map.Entry<String, Object> entry2 : dataKeyDiffs.entrySet()) {
                                    ScopeEntity scopeEntity3 = new ScopeEntity();
                                    scopeEntity3.setScope(entry2.getKey());
                                    scopeEntity3.setStatus(q.a(entry2.getValue(), (Object) true));
                                    arrayList2.add(scopeEntity3);
                                }
                                com.taobao.themis.open.permission.auth.a aVar3 = com.taobao.themis.open.permission.auth.a.INSTANCE;
                                q.b(sceneCode3, "sceneCode");
                                aVar3.b(sceneCode3, arrayList2);
                            }
                            t tVar5 = t.INSTANCE;
                        }
                    }
                }
            }
            if (!z2 || this.e != InvokeType.TYPE_ORIGIN) {
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (DomainItemEntity domainItemEntity2 : arrayList) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = j.a("domainKey", domainItemEntity2.getDomainKey());
                pairArr[1] = j.a("status", domainItemEntity2.isAuthed() ? "accept" : "reject");
                JSONObject a3 = com.taobao.themis.kernel.utils.f.a(pairArr);
                List<ResourceItemEntity> resourceItems2 = domainItemEntity2.getResourceItems();
                if (resourceItems2 != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (ResourceItemEntity resourceItemEntity2 : resourceItems2) {
                        Pair[] pairArr2 = new Pair[2];
                        pairArr2[0] = j.a("resourceKey", resourceItemEntity2.getResourceKey());
                        pairArr2[1] = j.a("status", resourceItemEntity2.isAuthed() ? "accept" : "reject");
                        jSONArray3.add(com.taobao.themis.kernel.utils.f.a(pairArr2));
                    }
                    a3.put((JSONObject) "resourceItems", (String) jSONArray3);
                    t tVar6 = t.INSTANCE;
                }
                jSONArray2.add(a3);
            }
            Map a4 = AuthUtils.a(AuthUtils.INSTANCE, this.c, this.b, this.d);
            a4.put("domainItems", jSONArray2.toJSONString());
            IMtopInnerAdapter iMtopInnerAdapter2 = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
            if (iMtopInnerAdapter2 == null) {
                return;
            }
            IMtopInnerAdapter.a.a(iMtopInnerAdapter2, "mtop.taobao.openlink.miniapp.resource.authChange", "1.0", a4, null, true, null, null, null, null, BuildConfig.VERSION_CODE, null);
        }
    }

    static {
        kge.a(158579059);
        INSTANCE = new AuthUtils();
        f22678a = ai.c(j.a("scope.getStepsStatus", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a(b.CONST_SCOPE_CAMERA, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a("scope.skinCamera", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a("scope.clipboard", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a(b.CONST_SCOPE_RECORD, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a(b.CONST_SCOPE_WRITE_PHOTOS_ALBUM, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a("scope.addCalenderPlan", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), j.a(b.CONST_SCOPE_USERLOCATION, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE));
    }

    private AuthUtils() {
    }

    public static final /* synthetic */ Map a(AuthUtils authUtils, f fVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8c5d7ad2", new Object[]{authUtils, fVar, str, str2}) : authUtils.b(fVar, str, str2);
    }

    public final boolean a(f fVar) {
        TMSMetaInfoWrapper v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb8a31", new Object[]{this, fVar})).booleanValue();
        }
        if (fVar != null && (v = fVar.v()) != null) {
            return v.f();
        }
        return false;
    }

    public final boolean a(f instance, String str, String api) {
        String j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e431ecc5", new Object[]{this, instance, str, api})).booleanValue();
        }
        q.d(instance, "instance");
        q.d(api, "api");
        TMSMetaInfoWrapper v = instance.v();
        Object obj = null;
        if (v == null || (j = v.j()) == null) {
            TMSMetaInfoWrapper v2 = instance.v();
            if (v2 != null) {
                obj = v2.k();
            }
            return obj != null;
        }
        TMSMetaInfoWrapper v3 = instance.v();
        if (v3 != null) {
            obj = v3.i();
        }
        if (q.a((Object) j, (Object) "thirdParty")) {
            return !a(instance, api);
        } else if (d(instance) && !a(instance, api)) {
            return true;
        } else {
            String str2 = str;
            if (!(str2 == null || str2.length() == 0)) {
                CharSequence charSequence = (CharSequence) obj;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    return !q.a((Object) str, obj);
                }
            }
            return false;
        }
    }

    private final boolean a(f fVar, String str) {
        PermissionModel k;
        Set<String> ignorePermissionCheckMtopApi;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67562bb", new Object[]{this, fVar, str})).booleanValue();
        }
        TMSMetaInfoWrapper v = fVar.v();
        return (v == null || (k = v.k()) == null || (ignorePermissionCheckMtopApi = k.getIgnorePermissionCheckMtopApi()) == null || !ignorePermissionCheckMtopApi.contains(str)) ? false : true;
    }

    private final boolean d(f fVar) {
        JSONObject l;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a52be34", new Object[]{this, fVar})).booleanValue();
        }
        TMSMetaInfoWrapper v = fVar.v();
        return q.a((Object) ((v == null || (l = v.l()) == null || (jSONObject = l.getJSONObject("moreControl")) == null) ? null : jSONObject.getBoolean("mtopApiListCheck")), (Object) true);
    }

    public final Map<String, String> a(f instance, List<String> requestScopeNicks) {
        PermissionModel k;
        JSONObject nativeApiScopeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e233e2d3", new Object[]{this, instance, requestScopeNicks});
        }
        q.d(instance, "instance");
        q.d(requestScopeNicks, "requestScopeNicks");
        HashMap hashMap = new HashMap();
        TMSMetaInfoWrapper v = instance.v();
        if (v != null && (k = v.k()) != null && (nativeApiScopeConfig = k.getNativeApiScopeConfig()) != null) {
            for (String str : requestScopeNicks) {
                if (nativeApiScopeConfig.get(str) != null) {
                    String string = nativeApiScopeConfig.getJSONObject(str).getString("authRange");
                    q.b(string, "nativeApiScopeConfig.get…k).getString(\"authRange\")");
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap.isEmpty() ? a() : hashMap;
    }

    private final Map<String, String> a() {
        List<String> b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String B = n.B();
        if (B.length() > 0) {
            z = true;
        }
        t tVar = null;
        if (!z) {
            B = null;
        }
        try {
            Result.a aVar = Result.Companion;
            if (B != null && (b = kotlin.text.n.b((CharSequence) B, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                for (String str : b) {
                    linkedHashMap.put(str, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
                }
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        return linkedHashMap.isEmpty() ? f22678a : linkedHashMap;
    }

    public final boolean a(String scope, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{this, scope, map})).booleanValue();
        }
        q.d(scope, "scope");
        return q.a((Object) MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) (map != null ? map.get(scope) : null));
    }

    public final String b(f instance) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb021032", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        JSONObject a2 = com.taobao.themis.kernel.utils.f.a(com.taobao.themis.open.permission.auth.a.INSTANCE.b(k.o(instance)));
        String string = a2 != null ? a2.getString("accessToken") : null;
        long longValue = (a2 == null || (l = a2.getLong("expirationTime")) == null) ? -1L : l.longValue();
        if (!TextUtils.isEmpty(string) && longValue > System.currentTimeMillis()) {
            return string;
        }
        c(instance);
        return null;
    }

    public final void c(f instance) {
        PermissionModel k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7b022f", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        TMSMetaInfoWrapper v = instance.v();
        JSONObject nativeApiScopeConfig = (v == null || (k = v.k()) == null) ? null : k.getNativeApiScopeConfig();
        if (nativeApiScopeConfig == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : nativeApiScopeConfig.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            if (q.a((Object) ((JSONObject) value).getString("authRange"), (Object) "taobaoAccount")) {
                com.taobao.themis.open.permission.auth.a aVar = com.taobao.themis.open.permission.auth.a.INSTANCE;
                String o = k.o(instance);
                String key = entry.getKey();
                q.b(key, "it.key");
                aVar.a(o, key);
            }
        }
    }

    public final Map<String, Object> a(f instance, com.taobao.themis.open.permission.auth.model.c requestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d0861ca", new Object[]{this, instance, requestModel});
        }
        q.d(instance, "instance");
        q.d(requestModel, "requestModel");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mainAppId", k.r(instance));
        linkedHashMap.put("invokerAppId", k.a(instance, requestModel.e()));
        String c = o.c(instance);
        if (c != null) {
            linkedHashMap.put("sceneId", c);
        }
        return linkedHashMap;
    }

    public final List<ScopeSettingEntity> a(f fVar, InvokeType invokeType, String appKey, String appId) {
        Set<String> a2;
        TMSMetaInfoWrapper v;
        PermissionModel k;
        JSONObject nativeApiScopeConfig;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a1ac82", new Object[]{this, fVar, invokeType, appKey, appId});
        }
        q.d(invokeType, "invokeType");
        q.d(appKey, "appKey");
        q.d(appId, "appId");
        if (invokeType == InvokeType.TYPE_ORIGIN) {
            a2 = null;
            Set<String> keySet = (fVar == null || (v = fVar.v()) == null || (k = v.k()) == null || (nativeApiScopeConfig = k.getNativeApiScopeConfig()) == null) ? null : nativeApiScopeConfig.keySet();
            Set<String> set = keySet;
            if (set == null || set.isEmpty()) {
                z = true;
            }
            if (!z) {
                a2 = keySet;
            }
            if (a2 == null) {
                a2 = a(appId, appKey);
            }
        } else {
            a2 = a(appId, appKey);
        }
        return a(fVar, a(appKey, appId, a2), invokeType, appKey, appId);
    }

    private final Map<String, Object> b(f fVar, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5bfdf2f7", new Object[]{this, fVar, str, str2});
        }
        if (fVar == null || (str3 = k.a(fVar, null, 1, null)) == null) {
            str3 = str2;
        }
        String h = fVar != null ? k.h(fVar) : null;
        String str4 = h;
        if (!(!(str4 == null || str4.length() == 0))) {
            h = null;
        }
        if (h == null) {
            h = str;
        }
        return ai.b(j.a("mainAppId", str2), j.a("mainAppKey", str), j.a("invokerAppId", str3), j.a("invokeAppKey", h));
    }

    private final List<ScopeSettingEntity> a(f fVar, Map<String, Boolean> map, InvokeType invokeType, String str, String str2) {
        IMtopInnerAdapter.Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a475fa0d", new Object[]{this, fVar, map, invokeType, str, str2});
        }
        Map<String, Object> b = b(fVar, str, str2);
        b.put("withSubscriptions", "true");
        b.put("topScopes", JSON.toJSONString(map));
        b.put("origin", invokeType.name());
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        JSONObject jSONObject = null;
        if (iMtopInnerAdapter != null) {
            response = IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.taobao.openlink.miniapp.auth.scope.check.status", "1.0", b, null, true, fVar != null ? k.q(fVar) : null, null, null, null, 456, null);
        } else {
            response = null;
        }
        if (response != null && response.getSuccess()) {
            JSONObject data = response.getData();
            if (data != null) {
                jSONObject = data.getJSONObject("data");
            }
            if (jSONObject != null) {
                JSONObject data2 = response.getData();
                q.a(data2);
                List<ScopeSettingEntity> a2 = com.taobao.themis.kernel.utils.f.a(data2.getJSONObject("data").getString("result"), ScopeSettingEntity.class);
                return a2 == null ? p.a() : a2;
            }
        }
        return p.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject a(com.taobao.themis.kernel.f r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.AuthUtils.a(com.taobao.themis.kernel.f, java.lang.String, java.lang.String, boolean):com.alibaba.fastjson.JSONObject");
    }

    public final void a(f instance, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a24b19", new Object[]{this, instance, str, jSONObject});
            return;
        }
        q.d(instance, "instance");
        if (!q.a((Object) "FAIL_SYS_TOPAUTH_ACCESSTOKENEXPIRED_ERROR", (Object) str)) {
            if (!q.a((Object) (jSONObject != null ? jSONObject.getString(com.taobao.mtop.wvplugin.a.RESULT_KEY) : null), (Object) "[\"FAIL_SYS_AUTH_CHECK_FAILED::TOPAUTH_ACCESSTOKEN_EXPIRED\"]")) {
                return;
            }
        }
        com.taobao.themis.open.permission.auth.a.INSTANCE.a(k.o(instance));
        c(instance);
    }

    private final Map<String, Boolean> a(String str, String str2, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a35aab8", new Object[]{this, str, str2, set});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : set) {
            Boolean b = com.taobao.themis.open.permission.auth.a.INSTANCE.b(str, str3);
            if (b != null) {
                linkedHashMap.put(str3, Boolean.valueOf(b.booleanValue()));
            } else {
                Boolean c = com.taobao.themis.open.permission.auth.a.INSTANCE.c(str, str3);
                if (c != null) {
                    linkedHashMap.put(str3, Boolean.valueOf(c.booleanValue()));
                } else if (com.taobao.themis.open.permission.auth.a.INSTANCE.c(str2).contains(str3) && !linkedHashMap.containsKey(str3)) {
                    linkedHashMap.put(str3, false);
                }
            }
        }
        return linkedHashMap;
    }

    private final Set<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c279206b", new Object[]{this, str, str2});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map b = ai.b(j.a("mainAppId", str), j.a("mainAppKey", str2), j.a("invokerAppId", str), j.a("invokerAppKey", str2));
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        JSONObject jSONObject = null;
        IMtopInnerAdapter.Response a2 = iMtopInnerAdapter != null ? IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.com.taobao.miniapp.scope.config.get", "1.0", b, null, false, null, null, null, null, BuildConfig.VERSION_CODE, null) : null;
        if (a2 != null && a2.getSuccess()) {
            JSONObject data = a2.getData();
            if (data != null) {
                jSONObject = data.getJSONObject("data");
            }
            if (jSONObject != null) {
                JSONObject data2 = a2.getData();
                q.a(data2);
                Set<String> keySet = data2.getJSONObject("data").keySet();
                q.b(keySet, "response.data!!.getJSONObject(\"data\").keys");
                linkedHashSet.addAll(keySet);
            }
        }
        return linkedHashSet;
    }

    public final void a(f fVar, InvokeType invokeType, String appId, String appKey, List<ScopeSettingEntity> scopeList) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74dfa16", new Object[]{this, fVar, invokeType, appId, appKey, scopeList});
            return;
        }
        q.d(invokeType, "invokeType");
        q.d(appId, "appId");
        q.d(appKey, "appKey");
        q.d(scopeList, "scopeList");
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
            return;
        }
        executor.execute(new a(scopeList, appKey, fVar, appId, invokeType));
    }
}
