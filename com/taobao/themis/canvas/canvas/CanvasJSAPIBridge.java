package com.taobao.themis.canvas.canvas;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.g;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.i;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class CanvasJSAPIBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<String> ARRAY_BUFFER_API_LIST;
    private volatile boolean mActive = true;
    private WeakReference<ITMSPage> mRenderRef;

    public static /* synthetic */ boolean access$000(CanvasJSAPIBridge canvasJSAPIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("920b16a2", new Object[]{canvasJSAPIBridge})).booleanValue() : canvasJSAPIBridge.mActive;
    }

    static {
        kge.a(-964840308);
        kge.a(1028243835);
        ArrayList arrayList = new ArrayList();
        ARRAY_BUFFER_API_LIST = arrayList;
        arrayList.add("readFile");
    }

    public CanvasJSAPIBridge(ITMSPage iTMSPage) {
        this.mRenderRef = new WeakReference<>(iTMSPage);
    }

    public void callAriverAPI(JSONObject jSONObject, final JNIBridge.a aVar) {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd4d3ca", new Object[]{this, jSONObject, aVar});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        try {
            ITMSPage iTMSPage = this.mRenderRef.get();
            if (this.mRenderRef != null && iTMSPage != null && iTMSPage.b().o() != null) {
                if (!this.mActive) {
                    return;
                }
                String string = jSONObject.getString("callbackId");
                String string2 = jSONObject.getString("handlerName");
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject2.put(g.ResponseId, (Object) string);
                JSONObject a2 = i.a(jSONObject, "data", (JSONObject) null);
                if (a2 != null && a2.containsKey("keepAlive")) {
                    z = a2.getBoolean("keepAlive").booleanValue();
                }
                if (iTMSPage == null) {
                    return;
                }
                iTMSPage.d().callTMSAbilityAsync(string2, jSONObject3, new TMSJSAPIHandler.a() { // from class: com.taobao.themis.canvas.canvas.CanvasJSAPIBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
                    public void a(JSONObject jSONObject4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject4});
                            return;
                        }
                        try {
                            if (!CanvasJSAPIBridge.access$000(CanvasJSAPIBridge.this)) {
                                return;
                            }
                            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject4);
                            aVar.a(jSONObject2, null, z);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
                    public void a(JSONObject jSONObject4, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4acae4f", new Object[]{this, jSONObject4, bArr});
                            return;
                        }
                        try {
                            if (!CanvasJSAPIBridge.access$000(CanvasJSAPIBridge.this)) {
                                return;
                            }
                            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject4);
                            aVar.a(jSONObject2, bArr, z);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("success", (Object) false);
            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject4);
            aVar.a(jSONObject2, null, false);
        } catch (Throwable unused) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("success", (Object) false);
            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject5);
            try {
                aVar.a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public JSONObject callAriverAPISync(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edf8649d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        ITMSPage iTMSPage = this.mRenderRef.get();
        if (iTMSPage == null || iTMSPage.b().o() == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", (Object) false);
            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject3);
            return jSONObject2;
        } else if (!this.mActive) {
            return jSONObject2;
        } else {
            String string = jSONObject.getString("callbackId");
            String string2 = jSONObject.getString("handlerName");
            JSONObject jSONObject4 = jSONObject.getJSONObject("data");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            jSONObject2.put(g.ResponseId, (Object) string);
            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) iTMSPage.d().callTMSAbilitySync(string2, jSONObject4));
            return jSONObject2;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mActive = false;
        }
    }
}
