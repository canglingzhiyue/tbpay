package com.taobao.themis.open.permission.check;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/taobao/themis/open/permission/check/ApiPermissionInfo;", "", "()V", "apiLevelList", "", "", "", "getApiLevelList", "()Ljava/util/Map;", "apiLevelStr", "getApiLevelStr", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REQUEST = "request";
    public static final String ALLOWED_DOMAIN = "allowedDomain";
    public static final String CONNECT_WEB_SOCKET = "connectWebSocket";
    public static final C0966a Companion;
    public static final String ENABLE_PROXY = "Enable_Proxy";
    public static final String EVENT_LIST = "EVENT_List";
    public static final String FORCE_USE_SSL = "ForceUseSSL";
    public static final String HTTPREQUET = "httpRequest";
    public static final String HTTP_LINK_SUB_RES_MIME_LIST = "HttpLink_SubResMimeList";
    public static final String JS_API_LIST = "JSAPI_List";
    public static final String JS_API_SP_CONFIG = "JSAPI_SP_Config";
    public static final String RESOURCE = "resource";
    public static final String START_APP = "startApp";
    public static final String UPLOAD_FILE = "uploadFile";
    public static final String VALID_DOMAIN = "validDomain";
    public static final String VALID_SUB_RES_MIME_LIST = "Valid_SubResMimeList";
    public static final String WEBSOCKET = "connectSocket";
    public static final String WEB_VIEW_CONFIG = "Webview_Config";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<String>> f22715a = new HashMap();
    private final Map<String, String> b = new HashMap();

    static {
        kge.a(-1374407617);
        Companion = new C0966a(null);
    }

    public final Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f22715a;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/open/permission/check/ApiPermissionInfo$Companion;", "", "()V", "ACTION_REQUEST", "", "ALLOWED_DOMAIN", "CONNECT_WEB_SOCKET", "ENABLE_PROXY", "EVENT_LIST", "FORCE_USE_SSL", "HTTPREQUET", "HTTP_LINK_SUB_RES_MIME_LIST", "JS_API_LIST", "JS_API_SP_CONFIG", "RESOURCE", "START_APP", "UPLOAD_FILE", "VALID_DOMAIN", "VALID_SUB_RES_MIME_LIST", "WEBSOCKET", "WEB_VIEW_CONFIG", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.permission.check.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0966a {
        static {
            kge.a(-1153753913);
        }

        private C0966a() {
        }

        public /* synthetic */ C0966a(o oVar) {
            this();
        }
    }
}
