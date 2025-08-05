package com.taobao.themis.widget;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.riverlogger.inspector.g;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.i;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetAPIBridge;", "Lcom/taobao/android/weex/WeexModule;", "()V", "mJSHandler", "Lcom/taobao/themis/kernel/ability/TMSJSAPIHandler;", "callAriverAPI", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/android/weex/WeexCallback;", "callAriverAPISync", "onInit", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "", "api", "Lcom/taobao/android/weex/WeexModuleInterface;", "onJSThreadDestroy", "onMainThreadDestroy", "Companion", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWidgetAPIBridge implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSWidgetAPIBridge";
    private TMSJSAPIHandler mJSHandler;

    static {
        kge.a(1046734682);
        kge.a(396540296);
        Companion = new a(null);
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetAPIBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(300280354);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @WeexMethod(uiThread = false)
    public final void callAriverAPI(JSONObject jSONObject, com.taobao.android.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb78e2", new Object[]{this, jSONObject, bVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("callbackId");
                if (string != null) {
                    String string2 = jSONObject.getString("handlerName");
                    if (string2 == null) {
                        TMSLogger.d(TAG, "handlerName is null");
                        return;
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    Boolean bool = jSONObject3.getBoolean("keepAlive");
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    jSONObject2.put((JSONObject) g.ResponseId, string);
                    TMSJSAPIHandler tMSJSAPIHandler = this.mJSHandler;
                    if (tMSJSAPIHandler == null) {
                        return;
                    }
                    tMSJSAPIHandler.callTMSAbilityAsync(string2, jSONObject3, new b(jSONObject2, booleanValue, bVar));
                    return;
                }
            } catch (Throwable unused) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put((JSONObject) "success", (String) false);
                t tVar = t.INSTANCE;
                jSONObject2.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) jSONObject4);
                if (bVar == null) {
                    return;
                }
                bVar.a(jSONObject2);
                return;
            }
        }
        TMSLogger.d(TAG, "callbackId is null");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/widget/TMSWidgetAPIBridge$callAriverAPI$1", "Lcom/taobao/themis/kernel/ability/TMSJSAPIHandler$CallTMSAbilityCallback;", "onArrayBufferCallBack", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "", "onCallBack", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements TMSJSAPIHandler.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f22904a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ com.taobao.android.weex.b c;

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
        public void a(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4acae4f", new Object[]{this, jSONObject, bArr});
            }
        }

        public b(JSONObject jSONObject, boolean z, com.taobao.android.weex.b bVar) {
            this.f22904a = jSONObject;
            this.b = z;
            this.c = bVar;
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            this.f22904a.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) jSONObject);
            if (this.b) {
                com.taobao.android.weex.b bVar = this.c;
                if (bVar == null) {
                    return;
                }
                bVar.b(this.f22904a);
                return;
            }
            com.taobao.android.weex.b bVar2 = this.c;
            if (bVar2 == null) {
                return;
            }
            bVar2.a(this.f22904a);
        }
    }

    @WeexMethod(uiThread = false)
    public final JSONObject callAriverAPISync(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edf8649d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("callbackId");
            } catch (Throwable th) {
                TMSLogger.b(TAG, "", th);
            }
            if (string != null) {
                jSONObject2.put((JSONObject) g.ResponseId, string);
                String string2 = jSONObject.getString("handlerName");
                if (string2 == null) {
                    TMSLogger.d(TAG, "handlerName is null");
                    return jSONObject2;
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObject4 = jSONObject2;
                TMSJSAPIHandler tMSJSAPIHandler = this.mJSHandler;
                jSONObject4.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) (tMSJSAPIHandler != null ? tMSJSAPIHandler.callTMSAbilitySync(string2, jSONObject3) : null));
                return jSONObject2;
            }
        }
        TMSLogger.d(TAG, "callbackId is null");
        return jSONObject2;
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        WeexInstance a2;
        ITMSPage a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
        } else {
            this.mJSHandler = (iVar == null || (a2 = iVar.a()) == null || (a3 = c.a(a2)) == null) ? null : a3.d();
        }
    }
}
