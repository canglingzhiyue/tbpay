package com.taobao.themis.open.ability.network;

import android.taobao.windvane.connect.HttpConnector;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.network.http.HttpType;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.ability.network.a;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.utils.io.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import kotlin.text.n;
import tb.fxb;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpt;
import tb.qpy;
import tb.qpz;
import tb.sgu;
import tb.toh;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002ABB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002Jf\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u0012J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0015H\u0002JT\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010,2\u0006\u0010-\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010.2\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\"\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u0010$\u001a\u0004\u0018\u000108H\u0002J6\u00109\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010:\u001a\u00020;2\b\u0010$\u001a\u0004\u0018\u0001082\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0002JR\u0010<\u001a\u00020\u00102\u0018\u0010=\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010,2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkAbility;", "", "()V", "BOUNDARY", "", "ERROR_CODE_DOWNLOAD_FAILED", "", "ERROR_CODE_DOWNLOAD_NO_PERMISSION", "ERROR_CODE_UPLOAD_FILE_FAILED", "ERROR_CODE_UPLOAD_FILE_NOT_EXIT", "ERROR_CODE_UPLOAD_FILE_NO_PERMISSION", "REQUEST_FROM_MINI_APP_CACHE", "STATUS", "STATUS_TEXT", RPCDataItems.SWITCH_TAG_LOG, "downloadFile", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "url", "header", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "extractHeaders", "headers", "builder", "Lcom/taobao/themis/open/ability/network/NetworkOptions$Builder;", "fetch", "appId", qpy.PLUGIN_ID, "method", "data", "timeout", "", "dataType", "callback", "Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$FetchResultListener;", "page", "getFileTypeByPath", "path", "json2StringForUrlencoded", "json", "parseResponse", "", "statusCode", "Ljava/io/InputStream;", "type", "Lcom/taobao/themis/kernel/network/http/HttpType;", "fromCache", "", "sendHttpRequestAndCallback", "httpService", "Lcom/taobao/themis/kernel/adapter/ITransportAdapter;", "request", "Lcom/taobao/themis/kernel/network/http/RVHttpRequest;", "Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$ResponseCallback;", "sendRequest", "options", "Lcom/taobao/themis/open/ability/network/NetworkOptions;", "uploadFileByHttp", "formData", "filePath", "fileName", com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_TYPE, "FetchResultListener", "ResponseCallback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_DOWNLOAD_FAILED = 12;
    public static final int ERROR_CODE_DOWNLOAD_NO_PERMISSION = 13;
    public static final int ERROR_CODE_UPLOAD_FILE_FAILED = 12;
    public static final int ERROR_CODE_UPLOAD_FILE_NOT_EXIT = 11;
    public static final int ERROR_CODE_UPLOAD_FILE_NO_PERMISSION = 13;
    public static final c INSTANCE;
    public static final String REQUEST_FROM_MINI_APP_CACHE = "fromMiniAppLocalCache";
    public static final String STATUS = "status";
    public static final String STATUS_TEXT = "statusText";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$FetchResultListener;", "", "onFetchResult", "", "result", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bb\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$ResponseCallback;", "", "onResponse", "", "statusCode", "", "stream", "Ljava/io/InputStream;", "headers", "", "", "fromCache", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void a(int i, InputStream inputStream, Map<String, String> map, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.network.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0958c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ android.taobao.windvane.connect.e f22663a;
        public final /* synthetic */ BridgeCallback b;
        public final /* synthetic */ String c;
        public final /* synthetic */ com.taobao.themis.kernel.f d;

        public RunnableC0958c(android.taobao.windvane.connect.e eVar, BridgeCallback bridgeCallback, String str, com.taobao.themis.kernel.f fVar) {
            this.f22663a = eVar;
            this.b = bridgeCallback;
            this.c = str;
            this.d = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new HttpConnector().a(this.f22663a, new android.taobao.windvane.connect.d<android.taobao.windvane.connect.f>() { // from class: com.taobao.themis.open.ability.network.c.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "megaData", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
                    /* renamed from: com.taobao.themis.open.ability.network.c$c$1$a */
                    /* loaded from: classes9.dex */
                    public static final class a implements qox {
                        public static volatile transient /* synthetic */ IpChange $ipChange;
                        public final /* synthetic */ String b;

                        public a(String str) {
                            this.b = str;
                        }

                        @Override // tb.qox
                        public final void a(qoy megaData, boolean z) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, megaData, new Boolean(z)});
                                return;
                            }
                            q.b(megaData, "megaData");
                            if (megaData.d()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put((JSONObject) "apFilePath", toh.b(o.e(RunnableC0958c.this.d), this.b, ApPathType.AP_PATH_TYPE_TEMP));
                                RunnableC0958c.this.b.sendJSONResponse(jSONObject);
                                return;
                            }
                            RunnableC0958c.this.b.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                            JSONObject a2 = megaData.a();
                            JSONObject jSONObject2 = a2 != null ? a2.getJSONObject("errorMessage") : null;
                            if (jSONObject2 == null) {
                                TMSLogger.d("TMSNetworkAbility", "mega fail! no error message");
                                RunnableC0958c.this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                                return;
                            }
                            int intValue = jSONObject2.getIntValue("statusCode");
                            String string = jSONObject2.getString("msg");
                            if (string == null) {
                                string = "";
                            }
                            TMSLogger.d("TMSNetworkAbility", "mega fail! code:" + intValue + " msg:" + string);
                        }
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == 2053577885) {
                            super.onError(((Number) objArr[0]).intValue(), (String) objArr[1]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.taobao.windvane.connect.d
                    public /* synthetic */ void onFinish(android.taobao.windvane.connect.f fVar, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("33e8872e", new Object[]{this, fVar, new Integer(i)});
                        } else {
                            a(fVar, i);
                        }
                    }

                    public void a(android.taobao.windvane.connect.f fVar, int i) {
                        File parentFile;
                        IpChange ipChange2 = $ipChange;
                        boolean z = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("518578c7", new Object[]{this, fVar, new Integer(i)});
                        } else if (fVar == null || fVar.d() == null) {
                            RunnableC0958c.this.b.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                            TMSLogger.d("TMSNetworkAbility", "downloadFile, data is null");
                        } else {
                            String str = RunnableC0958c.this.c;
                            int b = n.b((CharSequence) RunnableC0958c.this.c, "/", 0, false, 6, (Object) null) + 1;
                            if (str == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String substring = str.substring(b);
                            q.b(substring, "(this as java.lang.String).substring(startIndex)");
                            String e = o.e(RunnableC0958c.this.d);
                            String a2 = toh.a(e, "https://tmp/download/" + g.a(RunnableC0958c.this.c) + fxb.DIR + substring, ApPathType.AP_PATH_TYPE_TEMP);
                            String str2 = a2;
                            if (str2 == null || str2.length() == 0) {
                                z = true;
                            }
                            if (z) {
                                RunnableC0958c.this.b.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                                TMSLogger.d("TMSNetworkAbility", "downloadFile, path is null");
                                return;
                            }
                            File file = new File(a2);
                            File parentFile2 = file.getParentFile();
                            if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
                                parentFile.mkdirs();
                            }
                            com.taobao.themis.open.ability.file.a aVar = com.taobao.themis.open.ability.file.a.INSTANCE;
                            com.taobao.themis.kernel.f fVar2 = RunnableC0958c.this.d;
                            ByteBuffer wrap = ByteBuffer.wrap(fVar.d());
                            q.b(wrap, "ByteBuffer.wrap(data.data)");
                            aVar.a(fVar2, a2, wrap, "ArrayBuffer", new a(a2));
                        }
                    }

                    @Override // android.taobao.windvane.connect.d
                    public void onError(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                            return;
                        }
                        RunnableC0958c.this.b.sendBridgeResponse(BridgeResponse.newError(12, str));
                        super.onError(i, str);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/taobao/themis/open/ability/network/TMSNetworkAbility$fetch$1", "Lcom/taobao/themis/open/ability/network/TMSNetworkAbility$ResponseCallback;", "onResponse", "", "statusCode", "", "data", "Ljava/io/InputStream;", "headers", "", "", "fromCache", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22666a;
        public final /* synthetic */ com.taobao.themis.open.ability.network.a b;

        public d(a aVar, com.taobao.themis.open.ability.network.a aVar2) {
            this.f22666a = aVar;
            this.b = aVar2;
        }

        @Override // com.taobao.themis.open.ability.network.c.b
        public void a(int i, InputStream inputStream, Map<String, String> map, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6619adc7", new Object[]{this, new Integer(i), inputStream, map, new Boolean(z)});
                return;
            }
            a aVar = this.f22666a;
            if (aVar == null) {
                return;
            }
            aVar.a(c.INSTANCE.a(i, inputStream, map, this.b.e(), z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITransportAdapter f22667a;
        public final /* synthetic */ qpy b;
        public final /* synthetic */ b c;

        public e(ITransportAdapter iTransportAdapter, qpy qpyVar, b bVar) {
            this.f22667a = iTransportAdapter;
            this.b = qpyVar;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            try {
                try {
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        try {
                            c.a(c.INSTANCE, this.f22667a, this.b, this.c);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e2) {
                            e2.printStackTrace();
                        }
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                } catch (IOException e4) {
                    TMSLogger.b("TMSNetworkAbility", e4.getMessage(), e4);
                } catch (InterruptedException e5) {
                    TMSLogger.b("TMSNetworkAbility", e5.getMessage(), e5);
                } catch (ExecutionException e6) {
                    TMSLogger.b("TMSNetworkAbility", e6.getMessage(), e6);
                }
            } catch (Throwable unused) {
                c.a(c.INSTANCE, this.f22667a, this.b, this.c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22668a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONObject f;
        public final /* synthetic */ BridgeCallback g;

        public f(String str, Map map, String str2, String str3, String str4, JSONObject jSONObject, BridgeCallback bridgeCallback) {
            this.f22668a = str;
            this.b = map;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = jSONObject;
            this.g = bridgeCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x039d  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x03bd  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03de  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 1002
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.network.c.f.run():void");
        }
    }

    static {
        kge.a(-1364577151);
        INSTANCE = new c();
    }

    private c() {
    }

    public static final /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c70020d", new Object[]{cVar, str}) : cVar.a(str);
    }

    public static final /* synthetic */ void a(c cVar, ITransportAdapter iTransportAdapter, qpy qpyVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87da9b9e", new Object[]{cVar, iTransportAdapter, qpyVar, bVar});
        } else {
            cVar.a(iTransportAdapter, qpyVar, bVar);
        }
    }

    public final void a(com.taobao.themis.kernel.f instance, String url, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Executor executor;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec55503", new Object[]{this, instance, url, jSONObject, bridgeCallback});
            return;
        }
        q.d(instance, "instance");
        q.d(url, "url");
        q.d(bridgeCallback, "bridgeCallback");
        if (url.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSNetworkAbility", "downloadFile, url is empty");
        }
        android.taobao.windvane.connect.e eVar = new android.taobao.windvane.connect.e(url);
        eVar.a(JosStatusCodes.RTN_CODE_COMMON_ERROR);
        try {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            eVar.a(hashMap);
            RunnableC0958c runnableC0958c = new RunnableC0958c(eVar, bridgeCallback, url, instance);
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
                return;
            }
            executor.execute(runnableC0958c);
        } catch (Exception unused) {
            TMSLogger.d("TMSNetworkAbility", "downloadFile, header is invalid");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        }
    }

    public final void a(Map<String, ? extends Object> map, String filePath, String fileName, String fileType, String url, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fc7791", new Object[]{this, map, filePath, fileName, fileType, url, jSONObject, bridgeCallback});
            return;
        }
        q.d(filePath, "filePath");
        q.d(fileName, "fileName");
        q.d(fileType, "fileType");
        q.d(url, "url");
        q.d(bridgeCallback, "bridgeCallback");
        f fVar = new f(filePath, map, fileName, fileType, url, jSONObject, bridgeCallback);
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
            return;
        }
        executor.execute(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: Exception -> 0x007b, TryCatch #2 {Exception -> 0x007b, blocks: (B:8:0x0052, B:19:0x0082, B:20:0x0092, B:22:0x009e, B:24:0x00a7, B:26:0x00b0, B:28:0x00b9, B:30:0x00c2, B:33:0x00cc, B:9:0x0058, B:11:0x0064), top: B:37:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.alibaba.fastjson.JSONObject r18, java.lang.String r19, java.lang.String r20, float r21, java.lang.String r22, com.taobao.themis.open.ability.network.c.a r23, com.taobao.themis.kernel.f r24) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.network.c.a(java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, float, java.lang.String, com.taobao.themis.open.ability.network.c$a, com.taobao.themis.kernel.f):void");
    }

    public final Map<String, Object> a(int i, InputStream inputStream, Map<String, String> map, HttpType httpType, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b4f0779", new Object[]{this, new Integer(i), inputStream, map, httpType, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (-1 == i) {
            hashMap.put("ok", false);
            hashMap.put("status", -1);
            hashMap.put("statusText", "ERR_CONNECT_FAILED");
        } else {
            hashMap.put("status", Integer.valueOf(i));
            if (200 <= i && 299 >= i) {
                z2 = true;
            }
            hashMap.put("ok", Boolean.valueOf(z2));
            if (inputStream == null) {
                hashMap.put("data", null);
            } else {
                try {
                    if (HttpType.arraybuffer == httpType) {
                        hashMap.put("data", sgu.INSTANCE.a(inputStream));
                    } else if (HttpType.base64 == httpType) {
                        hashMap.put("data", sgu.INSTANCE.b(inputStream));
                    } else {
                        hashMap.put("data", sgu.INSTANCE.a(sgu.INSTANCE.a(inputStream, map != null ? sgu.INSTANCE.a(map, "Content-Type") : ""), httpType));
                    }
                } catch (JSONException e2) {
                    TMSLogger.b("TMSNetworkAbility", e2.getMessage(), e2);
                    hashMap.put("ok", false);
                    hashMap.put("data", "{'err':'Data parse failed!'}");
                }
            }
            hashMap.put("statusText", com.taobao.themis.open.ability.network.b.a(String.valueOf(i)));
        }
        hashMap.put("headers", map);
        if (z) {
            hashMap.put(REQUEST_FROM_MINI_APP_CACHE, true);
        }
        return hashMap;
    }

    private final void a(String str, String str2, com.taobao.themis.open.ability.network.a aVar, b bVar, com.taobao.themis.kernel.f fVar) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebca8047", new Object[]{this, str, str2, aVar, bVar, fVar});
            return;
        }
        ITransportAdapter iTransportAdapter = (ITransportAdapter) qpt.b(ITransportAdapter.class);
        if (iTransportAdapter == null) {
            TMSLogger.d("TMSNetworkAbility", "sendRequest, httpService is null");
            return;
        }
        byte[] bArr = null;
        if (!TextUtils.isEmpty(aVar.d())) {
            String d2 = aVar.d();
            q.b(d2, "options.body");
            Charset charset = kotlin.text.d.UTF_8;
            if (d2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            bArr = d2.getBytes(charset);
            q.b(bArr, "(this as java.lang.String).getBytes(charset)");
        }
        qpy a2 = qpy.a().a(aVar.b()).a(aVar.c()).b(aVar.a()).a(aVar.f()).a(bArr).a();
        q.b(a2, "RVHttpRequest.newBuilder…ata)\n            .build()");
        a2.a("appId", str);
        a2.a(qpy.PLUGIN_ID, str2);
        e eVar = new e(iTransportAdapter, a2, bVar);
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
            return;
        }
        executor.execute(eVar);
    }

    private final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        String str = "";
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                String obj = entry.getValue().toString();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i >= jSONObject.size() - 1 ? key + "=" + URLEncoder.encode(obj, "UTF-8") : key + "=" + URLEncoder.encode(obj, "UTF-8") + "&");
                str = sb.toString();
                i++;
            }
        } catch (Exception e2) {
            TMSLogger.b("TMSNetworkAbility", e2.getMessage(), e2);
        }
        return str;
    }

    private final void a(JSONObject jSONObject, a.C0957a c0957a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc2452e", new Object[]{this, jSONObject, c0957a});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                c0957a.a(str, jSONObject.getString(str));
            }
        }
    }

    private final void a(ITransportAdapter iTransportAdapter, qpy qpyVar, b bVar) throws InterruptedException, ExecutionException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f860f9d", new Object[]{this, iTransportAdapter, qpyVar, bVar});
            return;
        }
        qpz httpRequest = iTransportAdapter.httpRequest(qpyVar);
        if (httpRequest == null || bVar == null) {
            return;
        }
        bVar.a(httpRequest.a(), httpRequest.c(), sgu.INSTANCE.a(httpRequest), false);
    }

    private final String a(String str) {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        List<String> split = new Regex("\\.").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    a2 = p.c(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        a2 = p.a();
        Object[] array = a2.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            return length < 2 ? "" : strArr[length - 1];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
