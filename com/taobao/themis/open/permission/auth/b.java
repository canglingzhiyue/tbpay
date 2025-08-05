package com.taobao.themis.open.permission.auth;

import android.app.Activity;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.permission.auth.ui.d;
import com.taobao.weex.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010'\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/themis/open/permission/auth/LocalAuthManager;", "", "()V", "ALBUM_DESCRIPTION", "", "AUDIORECORD_DESCRIPTION", "BLUETOOTH_DESCRIPTION", "CAMERA_DESCRIPTION", "CLIPBOARD_DESCRIPTION", "CONST_SCOPE_ADDRESS", "CONST_SCOPE_ALI_RUN", "CONST_SCOPE_BLUETOOTH", "CONST_SCOPE_CAMERA", "CONST_SCOPE_CLIPBOARD", "CONST_SCOPE_CONTACT", "CONST_SCOPE_INVOICE_TITLE", "CONST_SCOPE_MAINCITY", "CONST_SCOPE_RECORD", "CONST_SCOPE_TB_AUTH", "CONST_SCOPE_USERINFO", "CONST_SCOPE_USERLOCATION", "CONST_SCOPE_WRITE_PHOTOS_ALBUM", "CONTACT_DESCRIPTION", "LOCATION_DESCRIPTION", RPCDataItems.SWITCH_TAG_LOG, "checkLocalPermission", "", "apiName", "params", "Lcom/alibaba/fastjson/JSONObject;", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "callback", "Lcom/taobao/themis/open/permission/auth/LocalAuthManager$PermissionCallback;", "getScopeByAction", "action", "model", "Lcom/alibaba/ariver/resource/api/models/PermissionModel;", "getScopeDes", Constants.Name.SCOPE, "PermissionCallback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONST_SCOPE_ADDRESS = "scope.address";
    public static final String CONST_SCOPE_ALI_RUN = "scope.alirun";
    public static final String CONST_SCOPE_BLUETOOTH = "scope.bluetooth";
    public static final String CONST_SCOPE_CAMERA = "scope.camera";
    public static final String CONST_SCOPE_CLIPBOARD = "scope.clipBoard";
    public static final String CONST_SCOPE_CONTACT = "scope.contact";
    public static final String CONST_SCOPE_INVOICE_TITLE = "scope.invoiceTitle";
    public static final String CONST_SCOPE_MAINCITY = "scope.mainCity";
    public static final String CONST_SCOPE_RECORD = "scope.audioRecord";
    public static final String CONST_SCOPE_TB_AUTH = "scope.ta_tb_auth";
    public static final String CONST_SCOPE_USERINFO = "scope.userInfo";
    public static final String CONST_SCOPE_USERLOCATION = "scope.location";
    public static final String CONST_SCOPE_WRITE_PHOTOS_ALBUM = "scope.album";
    public static final b INSTANCE;
    public static final String TAG = "LocalAuthManager";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/permission/auth/LocalAuthManager$PermissionCallback;", "", "onFail", "", "onSuccess", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1360951376);
        INSTANCE = new b();
    }

    private b() {
    }

    public final void a(String apiName, JSONObject jSONObject, ApiContext apiContext, a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49792a41", new Object[]{this, apiName, jSONObject, apiContext, callback});
            return;
        }
        q.d(apiName, "apiName");
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c = apiContext.c();
        if (c != null) {
            q.b(c, "apiContext.invokeInstanc…         return\n        }");
            if (k.t(c)) {
                TMSLogger.b(TAG, "instance is inner, callback success");
                callback.a();
                return;
            }
            TMSMetaInfoWrapper v = c.v();
            JSONArray jSONArray = null;
            String b = b(apiName, v != null ? v.k() : null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (b.length() > 0) {
                TMSMetaInfoWrapper v2 = c.v();
                linkedHashMap.put(b, a(b, v2 != null ? v2.k() : null));
            }
            if (q.a((Object) apiName, (Object) "chooseImage") || q.a((Object) apiName, (Object) "chooseVideo")) {
                if (jSONObject != null) {
                    jSONArray = jSONObject.getJSONArray("sourceType");
                }
                if (jSONArray == null) {
                    linkedHashMap.put(CONST_SCOPE_WRITE_PHOTOS_ALBUM, "访问你的相册");
                    linkedHashMap.put(CONST_SCOPE_CAMERA, "使用你的摄像头");
                } else {
                    if (jSONArray.contains(ChatInputConstant.PANEL_ID_ALBUM)) {
                        linkedHashMap.put(CONST_SCOPE_WRITE_PHOTOS_ALBUM, "访问你的相册");
                    }
                    if (jSONArray.contains(BlobManager.BLOB_ELEM_TYPE_CAMERA)) {
                        linkedHashMap.put(CONST_SCOPE_CAMERA, "使用你的摄像头");
                    }
                }
            }
            for (String str : p.g(linkedHashMap.keySet())) {
                TMSLogger.b(TAG, "check local auth status for : " + str);
                if (q.a((Object) com.taobao.themis.open.permission.auth.a.INSTANCE.c(k.o(c), str), (Object) true)) {
                    TMSLogger.b(TAG, str + " has local auth");
                    linkedHashMap.remove(str);
                }
            }
            if (linkedHashMap.isEmpty()) {
                callback.a();
                TMSLogger.b(TAG, "all permission has been authed");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    if (str2.length() > 0) {
                        sb.append((String) entry.getValue());
                        sb.append("，");
                    }
                }
            }
            StringBuilder sb2 = sb;
            if (!n.a((CharSequence) sb2)) {
                sb.deleteCharAt(n.e(sb2));
            }
            if (n.a((CharSequence) sb2)) {
                TMSLogger.b(TAG, "dialogContent is blank, callback success");
                callback.a();
                return;
            }
            Activity o = c.o();
            q.b(o, "instance.activity");
            String sb3 = sb.toString();
            q.b(sb3, "dialogContent.toString()");
            new d(o, sb3, new C0964b(linkedHashMap, c, callback)).a();
            return;
        }
        callback.a();
        TMSLogger.b(TAG, "instance is null, callback success");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/open/permission/auth/LocalAuthManager$checkLocalPermission$3", "Lcom/taobao/themis/open/permission/auth/ui/LocalAuthDialog$Callback;", "onCancel", "", "onConfirm", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.permission.auth.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0964b implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f22683a;
        public final /* synthetic */ f b;
        public final /* synthetic */ a c;

        public C0964b(Map map, f fVar, a aVar) {
            this.f22683a = map;
            this.b = fVar;
            this.c = aVar;
        }

        @Override // com.taobao.themis.open.permission.auth.ui.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TMSLogger.b(b.TAG, "LocalAuthDialog confirm, callback success");
            for (String str : this.f22683a.keySet()) {
                com.taobao.themis.open.permission.auth.a.INSTANCE.b(k.o(this.b), str, true);
            }
            this.c.a();
        }

        @Override // com.taobao.themis.open.permission.auth.ui.d.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TMSLogger.b(b.TAG, "LocalAuthDialog cancel, callback failed");
            for (String str : this.f22683a.keySet()) {
                com.taobao.themis.open.permission.auth.a.INSTANCE.b(k.o(this.b), str, false);
            }
            this.c.b();
        }
    }

    private final String a(String str, PermissionModel permissionModel) {
        JSONObject nativeApiScopeConfig;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43c12807", new Object[]{this, str, permissionModel});
        }
        if (permissionModel != null && (nativeApiScopeConfig = permissionModel.getNativeApiScopeConfig()) != null && (jSONObject = nativeApiScopeConfig.getJSONObject(str)) != null) {
            return jSONObject.getString("desc");
        }
        return null;
    }

    private final String b(String str, PermissionModel permissionModel) {
        JSONObject nativeApiUserAuth;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2442efe6", new Object[]{this, str, permissionModel});
        }
        String string = (permissionModel == null || (nativeApiUserAuth = permissionModel.getNativeApiUserAuth()) == null) ? null : nativeApiUserAuth.getString(str);
        String str2 = string;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z) {
            return string;
        }
        if (q.a((Object) "scan", (Object) str)) {
            string = CONST_SCOPE_CAMERA;
        } else if (q.a((Object) "saveImage", (Object) str) || q.a((Object) "saveVideoToPhotosAlbum", (Object) str) || q.a((Object) "shareTokenImageSilent", (Object) str)) {
            string = CONST_SCOPE_WRITE_PHOTOS_ALBUM;
        } else {
            String str3 = str;
            if (n.b((CharSequence) str3, (CharSequence) HttpConstant.LOCATION, false, 2, (Object) null) || q.a((Object) "getMainSelectedCity", (Object) str)) {
                string = CONST_SCOPE_USERLOCATION;
            } else if (n.b((CharSequence) str3, (CharSequence) "AudioRecord", false, 2, (Object) null)) {
                string = CONST_SCOPE_RECORD;
            } else if (q.a((Object) str, (Object) "enableBluetooth") || q.a((Object) str, (Object) "openBluetoothAdapter") || q.a((Object) str, (Object) "connectBLEDevice") || q.a((Object) str, (Object) "getBeacons")) {
                string = CONST_SCOPE_BLUETOOTH;
            } else if (q.a((Object) "contact", (Object) str) || q.a((Object) "chooseContact", (Object) str) || q.a((Object) "APSocialNebulaPlugin.selectContactJSAPI", (Object) str)) {
                string = CONST_SCOPE_CONTACT;
            } else if (q.a((Object) "getClipboard", (Object) str)) {
                string = CONST_SCOPE_CLIPBOARD;
            }
        }
        return string == null ? "" : string;
    }
}
