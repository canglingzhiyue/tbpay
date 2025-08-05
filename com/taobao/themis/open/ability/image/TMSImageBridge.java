package com.taobao.themis.open.ability.image;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.toh;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/open/ability/image/TMSImageBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "getImageInfo", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "src", "", "getImageInfoWithStream", "Lcom/alibaba/fastjson/JSONObject;", "inputStream", "Ljava/io/InputStream;", "onFinalized", "onInitialized", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSImageBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSImageBridge";

    static {
        kge.a(1590878130);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/image/TMSImageBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1130605446);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @APIMethod
    public final void getImageInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"src"}) String src) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceab0ef", new Object[]{this, apiContext, bridgeCallback, src});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        q.d(src, "src");
        if (TextUtils.isEmpty(src)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "error", "src is empty");
            t tVar = t.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        } else if (!n.b(src, k.HTTPS_PREFIX, false, 2, (Object) null) && !n.b(src, k.HTTP_PREFIX, false, 2, (Object) null) && !n.b(src, "apml", false, 2, (Object) null)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "error", "src is not support!");
            t tVar2 = t.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject2);
        } else {
            if ((apiContext != null ? apiContext.c() : null) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else if (n.b(src, "https://resource/", false, 2, (Object) null)) {
                f c = apiContext.c();
                q.a(c);
                q.b(c, "apiContext.invokeInstance!!");
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(toh.a(com.taobao.themis.kernel.utils.o.e(c), src, null, 4, null)));
                    JSONObject a2 = a(fileInputStream);
                    a2.put((JSONObject) "success", "true");
                    a2.put((JSONObject) "path", src);
                    bridgeCallback.sendJSONResponse(a2);
                    fileInputStream.close();
                } catch (Exception e) {
                    TMSLogger.c(TAG, Log.getStackTraceString(e));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "error", "parse error!");
                    t tVar3 = t.INSTANCE;
                    bridgeCallback.sendJSONResponse(jSONObject3);
                }
            } else {
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        URLConnection openConnection = new URL(src).openConnection();
                        if (openConnection == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                        }
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                        try {
                            httpURLConnection2.setRequestMethod("GET");
                            httpURLConnection2.setConnectTimeout(5000);
                            int responseCode = httpURLConnection2.getResponseCode();
                            if (responseCode == 200) {
                                InputStream inputStream = httpURLConnection2.getInputStream();
                                q.b(inputStream, "inputStream");
                                JSONObject a3 = a(inputStream);
                                a3.put((JSONObject) "success", "true");
                                a3.put((JSONObject) "path", src);
                                bridgeCallback.sendJSONResponse(a3);
                                inputStream.close();
                                httpURLConnection2.disconnect();
                            } else {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put((JSONObject) "error", "network error , code is " + responseCode);
                                t tVar4 = t.INSTANCE;
                                bridgeCallback.sendJSONResponse(jSONObject4);
                            }
                            if (httpURLConnection2 == null) {
                                return;
                            }
                            httpURLConnection2.disconnect();
                        } catch (MalformedURLException unused) {
                            httpURLConnection = httpURLConnection2;
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put((JSONObject) "error", "url error");
                            t tVar5 = t.INSTANCE;
                            bridgeCallback.sendJSONResponse(jSONObject5);
                            if (httpURLConnection == null) {
                                return;
                            }
                            httpURLConnection.disconnect();
                        } catch (IOException unused2) {
                            httpURLConnection = httpURLConnection2;
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put((JSONObject) "error", "io error");
                            t tVar6 = t.INSTANCE;
                            bridgeCallback.sendJSONResponse(jSONObject6);
                            if (httpURLConnection == null) {
                                return;
                            }
                            httpURLConnection.disconnect();
                        } catch (Exception e2) {
                            e = e2;
                            httpURLConnection = httpURLConnection2;
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put((JSONObject) "error", "unknown error : " + e.getMessage());
                            t tVar7 = t.INSTANCE;
                            bridgeCallback.sendJSONResponse(jSONObject7);
                            if (httpURLConnection == null) {
                                return;
                            }
                            httpURLConnection.disconnect();
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (MalformedURLException unused3) {
                    } catch (IOException unused4) {
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.fastjson.JSONObject a(java.io.InputStream r17) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.image.TMSImageBridge.a(java.io.InputStream):com.alibaba.fastjson.JSONObject");
    }
}
