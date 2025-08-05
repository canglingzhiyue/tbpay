package com.taobao.themis.open.ability.network;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.log.statistics.d;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.ability.network.c;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpy;
import tb.toh;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007Jx\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016Jx\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007JZ\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002JD\u0010!\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002Jp\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "mRequestId", "Ljava/util/concurrent/atomic/AtomicInteger;", "downloadFile", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "url", "", "header", "Lcom/alibaba/fastjson/JSONObject;", "appXDomain", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", com.taobao.themis.open.permission.check.a.HTTPREQUET, "headers", "", "method", "data", "timeout", "", "dataType", qpy.PLUGIN_ID, "isPrefetch", "", "onFinalized", "onInitialized", "request", "sendHttp", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "submitHttpResponse", "result", "extra", "start", "", e.REQUEST_ID, "", com.taobao.themis.open.permission.check.a.UPLOAD_FILE, "filePath", "localId", "fileName", d.PARAM_UPLOAD_FILE_TYPE, "formData", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSNetworkBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile AtomicInteger f22657a = new AtomicInteger(0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f22658a;
        public final /* synthetic */ File b;
        public final /* synthetic */ BridgeCallback c;

        public b(f fVar, File file, BridgeCallback bridgeCallback) {
            this.f22658a = fVar;
            this.b = file;
            this.c = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy data, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, data, new Boolean(z)});
                return;
            }
            q.b(data, "data");
            if (data.d()) {
                JSONObject jSONObject = new JSONObject();
                String e = o.e(this.f22658a);
                String path = this.b.getPath();
                q.b(path, "dest.path");
                jSONObject.put((JSONObject) "apFilePath", toh.b(e, path, ApPathType.AP_PATH_TYPE_TEMP));
                this.c.sendJSONResponse(jSONObject);
                return;
            }
            this.c.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            StringBuilder sb = new StringBuilder();
            sb.append("mega fail! code:");
            JSONObject a2 = data.a();
            Object obj = null;
            sb.append(a2 != null ? a2.getString("code") : null);
            sb.append(" msg:");
            JSONObject a3 = data.a();
            if (a3 != null) {
                obj = a3.get("msg");
            }
            sb.append(obj);
            TMSLogger.d("TMSNetworkBridge", sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/open/ability/network/TMSNetworkBridge$sendHttp$2", "Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$FetchResultListener;", "onFetchResult", "", "result", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ BridgeCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;

        public c(String str, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
            this.b = str;
            this.c = bridgeCallback;
            this.d = str2;
            this.e = j;
            this.f = i;
            this.g = str3;
        }

        @Override // com.taobao.themis.open.ability.network.c.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                TMSNetworkBridge.access$submitHttpResponse(TMSNetworkBridge.this, this.b, obj, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    static {
        kge.a(1800494418);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    public static final /* synthetic */ void access$submitHttpResponse(TMSNetworkBridge tMSNetworkBridge, String str, Object obj, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c50582", new Object[]{tMSNetworkBridge, str, obj, bridgeCallback, str2, new Long(j), new Integer(i), str3});
        } else {
            tMSNetworkBridge.a(str, obj, bridgeCallback, str2, j, i, str3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r20.sendBridgeResponse(com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.FORBIDDEN_ERROR);
        com.taobao.themis.kernel.basic.TMSLogger.d("TMSNetworkBridge", "downloadFile, local save path is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        return;
     */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.NETWORK)
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void downloadFile(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r16, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"url"}) java.lang.String r17, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"header"}) com.alibaba.fastjson.JSONObject r18, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"__appxDomain"}) java.lang.String r19, @com.taobao.themis.kernel.ability.base.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r20) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.network.TMSNetworkBridge.downloadFile(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void uploadFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"filePath"}) String str2, @BindingParam(name = {"localId"}) String str3, @BindingParam(name = {"name"}) String str4, @BindingParam(name = {"type"}) String str5, @BindingParam(name = {"header"}) JSONObject jSONObject, @BindingParam(name = {"formData"}) JSONObject jSONObject2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8e1749", new Object[]{this, apiContext, str, str2, str3, str4, str5, jSONObject, jSONObject2, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        String str6 = str2;
        String str7 = str6 == null || str6.length() == 0 ? str3 : str2;
        String str8 = str7;
        if (str8 == null || str8.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(11, "filePath is null"));
            TMSLogger.d("TMSNetworkBridge", "UploadFile filePath null or error");
            return;
        }
        String str9 = str4;
        if (str9 == null || str9.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "fileName is null"));
            TMSLogger.d("TMSNetworkBridge", "UploadFile fileName null");
            return;
        }
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSNetworkBridge", "uploadFile, instance is not a TMSInstance");
            return;
        }
        String a2 = toh.a(o.e(c2), str7, null, 4, null);
        String str10 = a2;
        if (!(str10 == null || str10.length() == 0)) {
            String str11 = str5;
            if (!(str11 == null || str11.length() == 0)) {
                String str12 = str;
                if (str12 != null && str12.length() != 0) {
                    z = false;
                }
                if (!z) {
                    if (c2.o() == null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "activity is null"));
                        TMSLogger.d("TMSNetworkBridge", "UploadFile activity is null");
                        return;
                    }
                    com.taobao.themis.open.ability.network.c.INSTANCE.a(jSONObject2, a2, str4, str5, str, jSONObject, bridgeCallback);
                    return;
                }
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "arguments error"));
        TMSLogger.d("TMSNetworkBridge", "UploadFile arguments error");
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void httpRequest(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) float f, @BindingParam(name = {"dataType"}) String str4, @BindingParam(name = {"__appxDomain"}) String str5, @BindingParam({"isPrefetch"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef315b7", new Object[]{this, apiContext, str, obj, str2, str3, new Float(f), str4, str5, new Boolean(z), bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSNetworkBridge", "downloadFile, instance is not a TMSInstance");
            return;
        }
        q.a((Object) str5);
        q.a((Object) str);
        q.a((Object) str2);
        a(c2, str5, str, obj, str2, str3, f, str4, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void request(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) float f, @BindingParam(name = {"dataType"}) String str4, @BindingParam(name = {"__appxDomain"}) String str5, @BindingParam(name = {"isPrefetch"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57eb9b0f", new Object[]{this, apiContext, str, obj, str2, str3, new Float(f), str4, str5, new Boolean(z), bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSNetworkBridge", "downloadFile, instance is not a TMSInstance");
            return;
        }
        q.a((Object) str5);
        q.a((Object) str);
        q.a((Object) str2);
        a(c2, str5, str, obj, str2, str3, f, str4, bridgeCallback);
    }

    private final void a(f fVar, String str, String str2, Object obj, String str3, String str4, float f, String str5, BridgeCallback bridgeCallback) {
        JSONObject jSONObject;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da690b23", new Object[]{this, fVar, str, str2, obj, str3, str4, new Float(f), str5, bridgeCallback});
            return;
        }
        String str6 = " url = [" + str2 + "], headers = [" + obj + "], method = [" + str3 + "], data = [" + str4 + "], timeout = [" + f + "], dataType = [" + str5 + ']';
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject2 = null;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            if (obj instanceof JSONArray) {
                jSONObject2 = new JSONObject();
                int size = ((Collection) obj).size();
                for (int i = 0; i < size; i++) {
                    JSONObject temp = ((JSONArray) obj).getJSONObject(i);
                    q.b(temp, "temp");
                    for (Map.Entry<String, Object> entry : temp.entrySet()) {
                        jSONObject2.put((JSONObject) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            jSONObject = jSONObject2;
        }
        String h = fVar.h();
        q.b(h, "instance.appId");
        if (com.taobao.themis.utils.f.a(fVar.o())) {
            synchronized (TMSNetworkBridge.class) {
                HashMap hashMap = new HashMap();
                if (jSONObject != null) {
                    for (String key : jSONObject.keySet()) {
                        Object obj3 = jSONObject.get(key);
                        String str7 = "";
                        if (obj3 != null) {
                            if (obj3 instanceof String) {
                                obj2 = (String) obj3;
                            } else {
                                obj2 = obj3.toString();
                            }
                            str7 = obj2;
                        }
                        q.b(key, "key");
                        hashMap.put(key, str7);
                    }
                }
                t tVar = t.INSTANCE;
            }
        }
        com.taobao.themis.open.ability.network.c.INSTANCE.a(h, str, str2, jSONObject, str3, str4, f, str5, new c(str2, bridgeCallback, str6, currentTimeMillis, this.f22657a.get(), str), fVar);
    }

    private final void a(String str, Object obj, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f667d01", new Object[]{this, str, obj, bridgeCallback, str2, new Long(j), new Integer(i), str3});
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey("ok")) {
                Boolean bool = (Boolean) map.get("ok");
                q.a(bool);
                z = bool.booleanValue();
            }
            if (!z) {
                String valueOf = String.valueOf(map.get("status"));
                String.valueOf(map.get("statusText"));
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, "Error" + valueOf));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            Object obj2 = map.get("data");
            if (obj2 instanceof JSONObject) {
                obj2 = ((JSONObject) obj2).toJSONString();
            } else if (obj2 instanceof JSONArray) {
                obj2 = ((JSONArray) obj2).toJSONString();
            } else if (!(obj2 instanceof String) && !(obj2 instanceof byte[])) {
                obj2 = obj2 instanceof Object ? obj2.toString() : null;
            }
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "data", (String) obj2);
            jSONObject2.put((JSONObject) "headers", (String) map.get("headers"));
            jSONObject2.put((JSONObject) "status", (String) map.get("status"));
            if (map.containsKey(com.taobao.themis.open.ability.network.c.REQUEST_FROM_MINI_APP_CACHE)) {
                jSONObject2.put((JSONObject) com.taobao.themis.open.ability.network.c.REQUEST_FROM_MINI_APP_CACHE, (String) map.get(com.taobao.themis.open.ability.network.c.REQUEST_FROM_MINI_APP_CACHE));
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            new HashMap().put("status", "PARSE_RESPONSE_FAILED");
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, "Error"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(2110933530);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
