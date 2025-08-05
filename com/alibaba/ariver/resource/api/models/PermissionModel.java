package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class PermissionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PermissionModel> CREATOR = new Parcelable.Creator<PermissionModel>() { // from class: com.alibaba.ariver.resource.api.models.PermissionModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public PermissionModel mo196createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PermissionModel) ipChange.ipc$dispatch("dfa018c6", new Object[]{this, parcel}) : new PermissionModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public PermissionModel[] mo197newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PermissionModel[]) ipChange.ipc$dispatch("850c34af", new Object[]{this, new Integer(i)}) : new PermissionModel[i];
        }
    };
    private static final String KEY_ENABLE_PROXY = "enableProxy";
    private static final String KEY_ENABLE_PROXY_LEGACY = "Enable_Proxy";
    private static final String KEY_EVENT_LIST = "eventList";
    private static final String KEY_EVENT_LIST_LEGACY = "EVENT_List";
    private static final String KEY_FORCE_USE_SSL = "forceUseSsl";
    private static final String KEY_FORCE_USE_SSL_LEGACY = "ForceUseSSL";
    private static final String KEY_HTTP_RES_MIME_LIST = "httpLinkSubResMimeList";
    private static final String KEY_HTTP_RES_MIME_LIST_LEGACY = "HttpLink_SubResMimeList";
    private static final String KEY_IGNORECHECK_MTOP_API = "ignorePermissionCheckMtopApi";
    private static final String KEY_IGNORE_PERMISSION_CHECK = "ignorePermissionCheck";
    private static final String KEY_JSAPI_LIST = "jsapiNameList";
    private static final String KEY_JSAPI_LIST_LEGACY = "JSAPI_List";
    private static final String KEY_JSAPI_SP_CONFIG = "jsapiSpConfig";
    private static final String KEY_JSAPI_SP_CONFIG_LEGACY = "JSAPI_SP_Config";
    private static final String KEY_NATIVE_API_SCOPE_CONFIG = "nativeApiScopeConfig";
    private static final String KEY_NATIVE_API_USER_AUTH = "nativeApiUserAuth";
    private static final String KEY_SUB_RES_MIME_LIST = "validSubResMimeList";
    private static final String KEY_SUB_RES_MIME_LIST_LEGACY = "Valid_SubResMimeList";
    private static final String KEY_VALID_DOMAIN = "validDomain";
    private static final String KEY_WEBVIEW_CONFIG = "webViewConfig";
    private static final String KEY_WEBVIEW_CONFIG_LEGACY = "Webview_Config";
    private static final long serialVersionUID = 7945824571470124314L;
    @JSONField(name = KEY_ENABLE_PROXY)
    private String enableProxy;
    @JSONField(name = "eventList")
    private Set<String> eventList;
    @JSONField(name = KEY_FORCE_USE_SSL)
    private String forceUseSsl;
    @JSONField(name = KEY_HTTP_RES_MIME_LIST)
    private Set<String> httpLinkSubResMimeList;
    @JSONField(name = KEY_IGNORE_PERMISSION_CHECK)
    private Set<String> ignorePermissionCheck;
    @JSONField(name = KEY_IGNORECHECK_MTOP_API)
    private Set<String> ignorePermissionCheckMtopApi;
    @JSONField(name = KEY_JSAPI_LIST)
    private Set<String> jsapiList;
    @JSONField(name = KEY_NATIVE_API_SCOPE_CONFIG)
    private JSONObject nativeApiScopeConfig;
    @JSONField(name = KEY_NATIVE_API_USER_AUTH)
    private JSONObject nativeApiUserAuth;
    @JSONField(deserialize = false, serialize = false)
    private Map<String, PermissionModel> pluginPermissions;
    @JSONField(name = KEY_JSAPI_SP_CONFIG)
    private JSONObject specialConfigs;
    @JSONField(name = "validDomain")
    private Set<String> validDomains;
    @JSONField(name = KEY_SUB_RES_MIME_LIST)
    private Set<String> validSubResMimeList;
    @JSONField(name = KEY_WEBVIEW_CONFIG)
    private JSONObject webviewConfigs;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static PermissionModel generateFromJSON(byte[] bArr) {
        return generateFromJSON(i.a(bArr));
    }

    public static PermissionModel generateFromJSON(String str) {
        return generateFromJSON(i.a(str));
    }

    public static PermissionModel generateFromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        PermissionModel permissionModel = new PermissionModel();
        JSONArray a2 = i.a(jSONObject, "validDomain", (JSONArray) null);
        if (a2 != null) {
            HashSet hashSet = new HashSet();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                hashSet.add(a2.getString(i));
            }
            permissionModel.setValidDomains(hashSet);
        }
        JSONObject a3 = i.a(jSONObject, KEY_JSAPI_SP_CONFIG, (JSONObject) null);
        if (a3 == null) {
            a3 = i.a(jSONObject, "JSAPI_SP_Config", (JSONObject) null);
        }
        if (a3 != null) {
            permissionModel.setSpecialConfigs(a3);
        }
        JSONObject a4 = i.a(jSONObject, KEY_WEBVIEW_CONFIG, (JSONObject) null);
        if (a4 == null) {
            a4 = i.a(jSONObject, "Webview_Config", (JSONObject) null);
        }
        if (a4 != null) {
            permissionModel.setWebviewConfigs(a4);
        }
        JSONArray a5 = i.a(jSONObject, KEY_JSAPI_LIST, (JSONArray) null);
        if (a5 == null) {
            a5 = i.a(jSONObject, "JSAPI_List", (JSONArray) null);
        }
        if (a5 != null) {
            HashSet hashSet2 = new HashSet();
            int size2 = a5.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet2.add(a5.getString(i2));
            }
            permissionModel.setJsapiList(hashSet2);
        }
        JSONArray a6 = i.a(jSONObject, KEY_IGNORE_PERMISSION_CHECK, (JSONArray) null);
        if (a6 != null) {
            HashSet hashSet3 = new HashSet();
            int size3 = a6.size();
            for (int i3 = 0; i3 < size3; i3++) {
                hashSet3.add(a6.getString(i3));
            }
            permissionModel.setIgnorePermissionCheck(hashSet3);
        }
        JSONObject a7 = i.a(jSONObject, KEY_NATIVE_API_USER_AUTH, (JSONObject) null);
        if (a7 != null) {
            permissionModel.setNativeApiUserAuth(a7);
        }
        JSONObject a8 = i.a(jSONObject, KEY_NATIVE_API_SCOPE_CONFIG, (JSONObject) null);
        if (a8 != null) {
            permissionModel.setNativeApiScopeConfig(a8);
        }
        JSONArray a9 = i.a(jSONObject, "eventList", (JSONArray) null);
        if (a9 == null) {
            a9 = i.a(jSONObject, "EVENT_List", (JSONArray) null);
        }
        if (a9 != null) {
            HashSet hashSet4 = new HashSet();
            int size4 = a9.size();
            for (int i4 = 0; i4 < size4; i4++) {
                hashSet4.add(a9.getString(i4));
            }
            permissionModel.setEventList(hashSet4);
        }
        String a10 = i.a(jSONObject, KEY_ENABLE_PROXY, (String) null);
        if (a10 == null) {
            a10 = i.a(jSONObject, "Enable_Proxy", (String) null);
        }
        if (a10 != null) {
            permissionModel.setEnableProxy(a10);
        }
        JSONArray a11 = i.a(jSONObject, KEY_SUB_RES_MIME_LIST, (JSONArray) null);
        if (a11 == null) {
            a11 = i.a(jSONObject, "Valid_SubResMimeList", (JSONArray) null);
        }
        if (a11 != null) {
            HashSet hashSet5 = new HashSet();
            int size5 = a11.size();
            for (int i5 = 0; i5 < size5; i5++) {
                hashSet5.add(a11.getString(i5));
            }
            permissionModel.setValidSubResMimeList(hashSet5);
        }
        JSONArray a12 = i.a(jSONObject, KEY_HTTP_RES_MIME_LIST, (JSONArray) null);
        if (a12 == null) {
            a12 = i.a(jSONObject, "HttpLink_SubResMimeList", (JSONArray) null);
        }
        if (a12 != null) {
            HashSet hashSet6 = new HashSet();
            int size6 = a12.size();
            for (int i6 = 0; i6 < size6; i6++) {
                hashSet6.add(a12.getString(i6));
            }
            permissionModel.setHttpLinkSubResMimeList(hashSet6);
        }
        String a13 = i.a(jSONObject, KEY_FORCE_USE_SSL, (String) null);
        if (a13 == null) {
            a13 = i.a(jSONObject, "ForceUseSSL", (String) null);
        }
        if (a13 != null) {
            permissionModel.setForceUseSsl(a13);
        }
        return permissionModel;
    }

    public PermissionModel() {
    }

    protected PermissionModel(Parcel parcel) {
        this.validDomains = new HashSet();
        readToArray(this.validDomains, parcel);
        this.specialConfigs = (JSONObject) parcel.readSerializable();
        this.webviewConfigs = (JSONObject) parcel.readSerializable();
        this.jsapiList = new HashSet();
        readToArray(this.jsapiList, parcel);
        this.ignorePermissionCheck = new HashSet();
        readToArray(this.ignorePermissionCheck, parcel);
        this.ignorePermissionCheckMtopApi = new HashSet();
        readToArray(this.ignorePermissionCheckMtopApi, parcel);
        this.nativeApiUserAuth = (JSONObject) parcel.readSerializable();
        this.nativeApiScopeConfig = (JSONObject) parcel.readSerializable();
        this.validSubResMimeList = new HashSet();
        readToArray(this.validSubResMimeList, parcel);
        this.enableProxy = parcel.readString();
        this.httpLinkSubResMimeList = new HashSet();
        readToArray(this.httpLinkSubResMimeList, parcel);
        this.eventList = new HashSet();
        readToArray(this.eventList, parcel);
        this.forceUseSsl = parcel.readString();
        this.pluginPermissions = new HashMap();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(PermissionModel.class.getClassLoader());
            for (int i = 0; i < readInt; i++) {
                if (readParcelableArray[i] instanceof PermissionModel) {
                    this.pluginPermissions.put(strArr[i], (PermissionModel) readParcelableArray[i]);
                }
            }
        }
    }

    private void readToArray(Set<String> set, Parcel parcel) {
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        if (z) {
            for (Object obj : parcel.readArray(PermissionModel.class.getClassLoader())) {
                set.add((String) obj);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.validDomains != null ? 1 : 0));
        Set<String> set = this.validDomains;
        if (set != null) {
            parcel.writeArray(set.toArray());
        }
        parcel.writeSerializable(this.specialConfigs);
        parcel.writeSerializable(this.webviewConfigs);
        parcel.writeByte((byte) (this.jsapiList != null ? 1 : 0));
        Set<String> set2 = this.jsapiList;
        if (set2 != null) {
            parcel.writeArray(set2.toArray());
        }
        parcel.writeByte((byte) (this.ignorePermissionCheck != null ? 1 : 0));
        Set<String> set3 = this.ignorePermissionCheck;
        if (set3 != null) {
            parcel.writeArray(set3.toArray());
        }
        parcel.writeByte((byte) (this.ignorePermissionCheckMtopApi != null ? 1 : 0));
        Set<String> set4 = this.ignorePermissionCheckMtopApi;
        if (set4 != null) {
            parcel.writeArray(set4.toArray());
        }
        parcel.writeSerializable(this.nativeApiUserAuth);
        parcel.writeSerializable(this.nativeApiScopeConfig);
        parcel.writeByte((byte) (this.validSubResMimeList != null ? 1 : 0));
        Set<String> set5 = this.validSubResMimeList;
        if (set5 != null) {
            parcel.writeArray(set5.toArray());
        }
        parcel.writeString(this.enableProxy);
        parcel.writeByte((byte) (this.httpLinkSubResMimeList != null ? 1 : 0));
        Set<String> set6 = this.httpLinkSubResMimeList;
        if (set6 != null) {
            parcel.writeArray(set6.toArray());
        }
        parcel.writeByte((byte) (this.eventList != null ? 1 : 0));
        Set<String> set7 = this.eventList;
        if (set7 != null) {
            parcel.writeArray(set7.toArray());
        }
        parcel.writeString(this.forceUseSsl);
        Map<String, PermissionModel> map = this.pluginPermissions;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size > 0) {
            String[] strArr = new String[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            int i2 = 0;
            for (Map.Entry<String, PermissionModel> entry : this.pluginPermissions.entrySet()) {
                strArr[i2] = entry.getKey();
                parcelableArr[i2] = entry.getValue();
                i2++;
            }
            parcel.writeStringArray(strArr);
            parcel.writeParcelableArray(parcelableArr, 0);
        }
    }

    public Set<String> getValidDomains() {
        return this.validDomains;
    }

    public void setValidDomains(Set<String> set) {
        this.validDomains = set;
    }

    public JSONObject getSpecialConfigs() {
        return this.specialConfigs;
    }

    public void setSpecialConfigs(JSONObject jSONObject) {
        this.specialConfigs = jSONObject;
    }

    public JSONObject getWebviewConfigs() {
        return this.webviewConfigs;
    }

    public void setWebviewConfigs(JSONObject jSONObject) {
        this.webviewConfigs = jSONObject;
    }

    public Set<String> getJsapiList() {
        return this.jsapiList;
    }

    public void setJsapiList(Set<String> set) {
        this.jsapiList = set;
    }

    public JSONObject getNativeApiUserAuth() {
        return this.nativeApiUserAuth;
    }

    public void setNativeApiUserAuth(JSONObject jSONObject) {
        this.nativeApiUserAuth = jSONObject;
    }

    public JSONObject getNativeApiScopeConfig() {
        return this.nativeApiScopeConfig;
    }

    public void setNativeApiScopeConfig(JSONObject jSONObject) {
        this.nativeApiScopeConfig = jSONObject;
    }

    public Set<String> getValidSubResMimeList() {
        return this.validSubResMimeList;
    }

    public void setValidSubResMimeList(Set<String> set) {
        this.validSubResMimeList = set;
    }

    public Set<String> getHttpLinkSubResMimeList() {
        return this.httpLinkSubResMimeList;
    }

    public void setHttpLinkSubResMimeList(Set<String> set) {
        this.httpLinkSubResMimeList = set;
    }

    public String getEnableProxy() {
        return this.enableProxy;
    }

    public void setEnableProxy(String str) {
        this.enableProxy = str;
    }

    public Set<String> getEventList() {
        return this.eventList;
    }

    public void setEventList(Set<String> set) {
        this.eventList = set;
    }

    public Set<String> getIgnorePermissionCheckMtopApi() {
        return this.ignorePermissionCheckMtopApi;
    }

    public void setIgnorePermissionCheckMtopApi(Set<String> set) {
        this.ignorePermissionCheckMtopApi = set;
    }

    public String getForceUseSsl() {
        return this.forceUseSsl;
    }

    public void setForceUseSsl(String str) {
        this.forceUseSsl = str;
    }

    public Set<String> getIgnorePermissionCheck() {
        return this.ignorePermissionCheck;
    }

    public void setIgnorePermissionCheck(Set<String> set) {
        this.ignorePermissionCheck = set;
    }

    @JSONField(deserialize = false, serialize = false)
    public Map<String, PermissionModel> getPluginPermissions() {
        return this.pluginPermissions;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setPluginPermissions(Map<String, PermissionModel> map) {
        this.pluginPermissions = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PermissionModel{validDomains=");
        sb.append(this.validDomains);
        sb.append(", ignorePermissionCheckMtopApi=");
        sb.append(this.ignorePermissionCheckMtopApi);
        sb.append(", specialConfigs=");
        sb.append(this.specialConfigs);
        sb.append(", webviewConfigs=");
        sb.append(this.webviewConfigs);
        sb.append(", jsapiList=$list(");
        Set<String> set = this.jsapiList;
        sb.append(set == null ? 0 : set.size());
        sb.append("), ignorePermissionCheck=");
        sb.append(this.ignorePermissionCheck);
        sb.append(", nativeApiUserAuth=");
        sb.append(this.nativeApiUserAuth);
        sb.append(", nativeApiScopeConfig=");
        sb.append(this.nativeApiScopeConfig);
        sb.append(", validSubResMimeList=");
        sb.append(this.validSubResMimeList);
        sb.append(", httpLinkSubResMimeList=");
        sb.append(this.httpLinkSubResMimeList);
        sb.append(", enableProxy='");
        sb.append(this.enableProxy);
        sb.append('\'');
        sb.append(", eventList=");
        sb.append(this.eventList);
        sb.append(", forceUseSsl=");
        sb.append(this.forceUseSsl);
        sb.append('}');
        return sb.toString();
    }
}
