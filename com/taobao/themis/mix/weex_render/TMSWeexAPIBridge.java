package com.taobao.themis.mix.weex_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.k;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.g;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/mix/weex_render/TMSWeexAPIBridge;", "Lcom/taobao/android/weex_framework/module/MUSModule;", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "", "weexInstance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "(Ljava/lang/String;Lcom/taobao/android/weex_framework/MUSDKInstance;)V", "call", "", "apiName", "args", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/android/weex_framework/bridge/MUSCallback;", "callSync", "getInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "context", "Landroid/content/Context;", "Companion", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWeexAPIBridge extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "TMSWeexAPIBridge";
    private final MUSDKInstance weexInstance;

    static {
        kge.a(-1204034708);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(TMSWeexAPIBridge tMSWeexAPIBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWeexAPIBridge(String moduleName, MUSDKInstance weexInstance) {
        super(moduleName, weexInstance);
        q.d(moduleName, "moduleName");
        q.d(weexInstance, "weexInstance");
        this.weexInstance = weexInstance;
    }

    @MUSMethod(uiThread = false)
    public final void call(String str, JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b callback) {
        TMSJSAPIHandler d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292a3cf8", new Object[]{this, str, jSONObject, callback});
            return;
        }
        q.d(callback, "callback");
        k context = this.weexInstance.getContext();
        q.b(context, "weexInstance.context");
        Context a2 = context.a();
        if (a2 == null) {
            return;
        }
        f tMSWeexAPIBridge = getInstance(a2);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (tMSWeexAPIBridge == null) {
            callback.a(TMSWeexAPIBridge$call$1.INSTANCE);
            TMSLogger.d(TAG, "can't find instance");
            return;
        }
        TMSLogger.a(TAG, "Weex call api: " + str + ", params: " + jSONObject);
        ITMSPage c = tMSWeexAPIBridge.b().c();
        if (c == null || (d = c.d()) == null) {
            return;
        }
        d.callTMSAbilityAsync(str, jSONObject, new b(callback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/mix/weex_render/TMSWeexAPIBridge$call$2", "Lcom/taobao/themis/kernel/ability/TMSJSAPIHandler$CallTMSAbilityCallback;", "onArrayBufferCallBack", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "", "onCallBack", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements TMSJSAPIHandler.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.bridge.b f22588a;

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
        public void a(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4acae4f", new Object[]{this, jSONObject, bArr});
            }
        }

        public b(com.taobao.android.weex_framework.bridge.b bVar) {
            this.f22588a = bVar;
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
                this.f22588a.a();
            } else {
                this.f22588a.a(jSONObject);
            }
        }
    }

    @MUSMethod(uiThread = false)
    public final JSONObject callSync(String str, JSONObject jSONObject) {
        TMSJSAPIHandler d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fecd9766", new Object[]{this, str, jSONObject});
        }
        k context = this.weexInstance.getContext();
        q.b(context, "weexInstance.context");
        Context a2 = context.a();
        if (a2 == null) {
            return null;
        }
        f tMSWeexAPIBridge = getInstance(a2);
        if (tMSWeexAPIBridge == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", (Object) "-1");
            jSONObject2.put("errorMessage", (Object) "当前环境不支持openApi");
            TMSLogger.d(TAG, "can't find instance");
            return jSONObject2;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        TMSLogger.a(TAG, "Weex callSync api: " + str + ", params: " + jSONObject);
        ITMSPage c = tMSWeexAPIBridge.b().c();
        if (c != null && (d = c.d()) != null) {
            return d.callTMSAbilitySync(str, jSONObject);
        }
        return null;
    }

    private final f getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a15702e5", new Object[]{this, context});
        }
        g gVar = null;
        if (context instanceof MutableContextWrapper) {
            try {
                Context baseContext = ((MutableContextWrapper) context).getBaseContext();
                if (baseContext == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.TMSInstanceBinder");
                }
                gVar = (g) baseContext;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (context instanceof g) {
            gVar = (g) context;
        }
        if (gVar == null) {
            return null;
        }
        return gVar.b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/mix/weex_render/TMSWeexAPIBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(50821044);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
