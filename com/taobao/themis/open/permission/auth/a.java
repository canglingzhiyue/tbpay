package com.taobao.themis.open.permission.auth;

import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import kotlin.text.n;
import tb.kge;
import tb.qpt;
import tb.tlp;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005J\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010#\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J,\u0010$\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010&\u001a\u00020\u000eJ\u001e\u0010'\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000eJ\u001c\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006J\u001e\u0010)\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005J\u001e\u0010,\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000eJ\u001c\u0010-\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/themis/open/permission/auth/AuthStorageCenter;", "", "()V", "shareSceneScopes", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeEntity;", "addAuthedApp", "", "appId", "clearSceneScope", ParamsConstants.Key.PARAM_SCENE_CODE, "getAccountScope", "", "appKey", Constants.Name.SCOPE, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "getAccountScopeKey", "getAppRefusedScopes", "getAuthToken", "getAuthTokenKey", "getAuthedAppKey", "getAuthedApps", "Lcom/alibaba/fastjson/JSONArray;", "getDeviceScope", "getDeviceScopeKey", "getRefusedScopesKey", "getSceneScope", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getUserId", "removeAccountScope", "removeAuthToken", "removeAuthedApp", "removeDeviceScope", "updateShareSceneScope", "scopes", "status", "writeAccountScope", "writeAppRefusedScopes", "writeAuthToken", "accessToken", "expireTime", "writeDeviceScope", "writeSceneScope", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<ScopeEntity>> f22682a;

    public final List<ScopeEntity> a(f instance, String sceneCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a5cab0", new Object[]{this, instance, sceneCode});
        }
        q.d(instance, "instance");
        q.d(sceneCode, "sceneCode");
        return null;
    }

    public final void a(f instance, String sceneCode, List<String> scopes, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e7462c", new Object[]{this, instance, sceneCode, scopes, new Boolean(z)});
            return;
        }
        q.d(instance, "instance");
        q.d(sceneCode, "sceneCode");
        q.d(scopes, "scopes");
    }

    public final void b(String sceneCode, List<ScopeEntity> scopes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{this, sceneCode, scopes});
            return;
        }
        q.d(sceneCode, "sceneCode");
        q.d(scopes, "scopes");
    }

    public final void d(String sceneCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, sceneCode});
        } else {
            q.d(sceneCode, "sceneCode");
        }
    }

    static {
        kge.a(86882674);
        INSTANCE = new a();
        f22682a = new ConcurrentHashMap<>();
    }

    private a() {
    }

    private final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        return INSTANCE.b() + "_appid_" + str + "_key_" + str + "token";
    }

    public final void a(String appKey, String accessToken, String expireTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, appKey, accessToken, expireTime});
            return;
        }
        q.d(appKey, "appKey");
        q.d(accessToken, "accessToken");
        q.d(expireTime, "expireTime");
        tlp tlpVar = tlp.INSTANCE;
        String f = INSTANCE.f(appKey);
        String jSONString = com.taobao.themis.kernel.utils.f.a(j.a("accessToken", accessToken), j.a("expirationTime", expireTime)).toJSONString();
        q.b(jSONString, "buildJSONObject(\n       …         ).toJSONString()");
        tlpVar.a(f, jSONString);
    }

    public final void a(String appKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, appKey});
            return;
        }
        q.d(appKey, "appKey");
        tlp.INSTANCE.b(INSTANCE.f(appKey));
    }

    public final String b(String appKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, appKey});
        }
        q.d(appKey, "appKey");
        return tlp.INSTANCE.a(INSTANCE.f(appKey));
    }

    private final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        return "key_auth_failure" + str + INSTANCE.b();
    }

    public final void a(String appId, List<String> scopes) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, appId, scopes});
            return;
        }
        q.d(appId, "appId");
        q.d(scopes, "scopes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(INSTANCE.c(appId));
        linkedHashSet.addAll(scopes);
        StringBuilder sb = new StringBuilder();
        for (Object obj : linkedHashSet) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            sb.append((String) obj);
            if (i != linkedHashSet.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        tlp tlpVar = tlp.INSTANCE;
        String g = INSTANCE.g(appId);
        String sb2 = sb.toString();
        q.b(sb2, "stringBuilder.toString()");
        tlpVar.a(g, sb2);
    }

    public final List<String> c(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, appId});
        }
        q.d(appId, "appId");
        String a2 = tlp.INSTANCE.a(INSTANCE.g(appId));
        String str = a2;
        if (!TextUtils.isEmpty(str)) {
            q.a((Object) a2);
            Object[] array = new Regex(",").split(str, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return new ArrayList(p.b((String[]) Arrays.copyOf(strArr, strArr.length)));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return p.a();
    }

    private final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2});
        }
        return INSTANCE.b() + "_appid_" + str + "_key_" + str2 + Constants.Name.SCOPE;
    }

    public final void a(String appKey, String scope, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, appKey, scope, new Boolean(z)});
            return;
        }
        q.d(appKey, "appKey");
        q.d(scope, "scope");
        tlp.INSTANCE.a(INSTANCE.d(appKey, scope), String.valueOf(z));
    }

    public final void a(String appKey, String scope) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, appKey, scope});
            return;
        }
        q.d(appKey, "appKey");
        q.d(scope, "scope");
        tlp.INSTANCE.b(INSTANCE.d(appKey, scope));
    }

    public final Boolean b(String appKey, String scope) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b2484ba", new Object[]{this, appKey, scope});
        }
        q.d(appKey, "appKey");
        q.d(scope, "scope");
        String a2 = tlp.INSTANCE.a(INSTANCE.d(appKey, scope));
        if (a2 != null) {
            if (!(!n.a((CharSequence) a2))) {
                a2 = null;
            }
            if (a2 != null) {
                return Boolean.valueOf(a2.equals("true"));
            }
        }
        return null;
    }

    private final String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8cbeb20", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        int a2 = n.a((CharSequence) str2, ".", 0, false, 6, (Object) null) + 1;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(a2);
        q.b(substring, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public final void b(String appKey, String scope, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552009f7", new Object[]{this, appKey, scope, new Boolean(z)});
            return;
        }
        q.d(appKey, "appKey");
        q.d(scope, "scope");
        tlp.INSTANCE.a(INSTANCE.e(appKey, scope), z ? "1" : "0");
    }

    public final Boolean c(String appKey, String scope) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1bda517b", new Object[]{this, appKey, scope});
        }
        q.d(appKey, "appKey");
        q.d(scope, "scope");
        String a2 = tlp.INSTANCE.a(INSTANCE.e(appKey, scope));
        if (a2 != null) {
            if (!(!n.a((CharSequence) a2))) {
                a2 = null;
            }
            if (a2 != null) {
                return Boolean.valueOf(a2.equals("1"));
            }
        }
        return null;
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return INSTANCE.b() + "auth_app";
    }

    public final void e(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, appId});
            return;
        }
        q.d(appId, "appId");
        JSONArray b = com.taobao.themis.kernel.utils.f.b(tlp.INSTANCE.a(INSTANCE.a()));
        if (b == null) {
            b = new JSONArray();
        }
        b.add(com.taobao.themis.kernel.utils.f.a(j.a("appId", appId)));
        tlp tlpVar = tlp.INSTANCE;
        String a2 = INSTANCE.a();
        String jSONString = b.toJSONString();
        q.b(jSONString, "list.toJSONString()");
        tlpVar.a(a2, jSONString);
    }

    private final String b() {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        IAccountAdapter iAccountAdapter = (IAccountAdapter) qpt.b(IAccountAdapter.class);
        return (iAccountAdapter == null || (userId = iAccountAdapter.getUserId(null)) == null) ? "null" : userId;
    }
}
