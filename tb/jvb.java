package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.h;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.instance.WeexScriptOnlyInstance;
import com.taobao.android.weex.n;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.e;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.k;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.r;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.a;
import com.taobao.android.weex_framework.util.o;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.mto;

/* loaded from: classes6.dex */
public class jvb extends MUSDKInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexInstanceImpl f29799a;
    private final k b;
    private Object c;
    private volatile f d;
    private h h;
    private g i;
    private e j;
    private volatile boolean n;
    private boolean o;
    private jwc q;
    private final MUSInstanceConfig s;
    private final jvc e = new jvc(this);
    private final Handler f = new Handler(Looper.getMainLooper());
    private final Map<String, MUSModule> g = new HashMap();
    private volatile int k = 0;
    private volatile int l = 0;
    private volatile boolean m = false;
    private volatile boolean p = false;
    private volatile float r = 1.0f;
    private final Object t = new Object();

    static {
        kge.a(1396178050);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(jvb jvbVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -598262597:
                super.setJSBridgeEnv((String) objArr[0], (Map) objArr[1]);
                return null;
            case -495030542:
                return super.getJustCreateTagName();
            case 931981515:
                return super.getJSBridgeEnv((String) objArr[0]);
            case 1791915820:
                super.setJustCreateTagName((String) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void debugHideInstIdTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ec1dab", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void debugShowInstIdTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccac87d0", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void forceBeginFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6556496", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public int getCurrentPhase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2433a72", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public double getPerformance(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4037490", new Object[]{this, new Integer(i)})).doubleValue() : mto.a.GEO_NOT_SUPPORT;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void inspect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1215a5", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void invokeCallbackSync(int i, MUSValue[] mUSValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31a5396", new Object[]{this, new Integer(i), mUSValueArr, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isDisplayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331b7fe2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isUseExternalHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a8bacd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isWeexInstanceAdaptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c77fcc70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setForceQuickJS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11e4b40", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void switchToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58790d64", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean switchToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1270efd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ g a(jvb jvbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("1d37f5e8", new Object[]{jvbVar}) : jvbVar.i;
    }

    public static /* synthetic */ boolean a(jvb jvbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("143e0096", new Object[]{jvbVar, new Boolean(z)})).booleanValue();
        }
        jvbVar.m = z;
        return z;
    }

    public static /* synthetic */ e b(jvb jvbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1cc18fab", new Object[]{jvbVar}) : jvbVar.j;
    }

    public static /* synthetic */ boolean b(jvb jvbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f61bca35", new Object[]{jvbVar, new Boolean(z)})).booleanValue();
        }
        jvbVar.p = z;
        return z;
    }

    public static /* synthetic */ boolean c(jvb jvbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f993d4", new Object[]{jvbVar, new Boolean(z)})).booleanValue();
        }
        jvbVar.n = z;
        return z;
    }

    public jvb(Context context, MUSInstanceConfig mUSInstanceConfig) {
        this.b = new k(context);
        if (mUSInstanceConfig != null) {
            this.s = mUSInstanceConfig;
            this.d = mUSInstanceConfig.o();
            if (mUSInstanceConfig.q() == null) {
                return;
            }
            a(mUSInstanceConfig.q().floatValue());
            return;
        }
        this.s = new MUSInstanceConfig();
    }

    public void a(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ec586", new Object[]{this, weexInstance});
            return;
        }
        this.f29799a = (WeexInstanceImpl) weexInstance;
        d();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            this.d.onCreateView(this.f29799a.getRootView());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void initWithURL(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34a3da7", new Object[]{this, uri});
            return;
        }
        this.f29799a.updateBundleUrl(uri.toString());
        this.f29799a.initWithURL(uri.toString());
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public k getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("50c5e62", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public Context getUIContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6bf62ae4", new Object[]{this}) : this.b.a();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerJSBindingPlugin(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabbbdb", new Object[]{this, new Long(j), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void prepare(byte[] bArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3355c790", new Object[]{this, bArr, map});
            return;
        }
        jug jugVar = (jug) this.f29799a.getExtend(jug.class);
        this.f29799a.initWithData(bArr, jugVar != null ? jugVar.a().i() : "<default>");
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void execute(MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1294c5c6", new Object[]{this, mUSValueArr});
            return;
        }
        c.a(this.f29799a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f29799a).a(jvd.a(mUSValueArr));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void register(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea7341c", new Object[]{this, jSONArray, str});
            return;
        }
        c.a(this.f29799a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f29799a).a(jSONArray, str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeScript(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d3e78", new Object[]{this, bArr, str});
        } else {
            this.f29799a.execute(bArr, str);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeScript(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1cba42", new Object[]{this, bArr, str, str2});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void render(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2436dfb2", new Object[]{this, jSONObject, map});
            return;
        }
        this.o = true;
        this.n = false;
        this.f29799a.render(WeexValueImpl.ofJSON(jSONObject));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void renderByUrl(String str, String str2, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44053652", new Object[]{this, str, str2, jSONObject, map});
            return;
        }
        this.f29799a.updateBundleUrl(str2);
        this.f29799a.initWithURL(str);
        this.f29799a.render(WeexValueImpl.ofJSON(jSONObject));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void initWithData(byte[] bArr, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4665cb9", new Object[]{this, bArr, uri});
        } else {
            this.f29799a.initWithData(bArr, uri.toString());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void updateContainerSize(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c562c0f4", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
        } else {
            this.f29799a.updateContainerSize(f, f2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void updateContainerSize(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd13ade0", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f29799a.updateContainerSize(f, f2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void updateBaseFontSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc2000f", new Object[]{this, new Float(f)});
            return;
        }
        a(f);
        this.f29799a.updateBaseFontSize(f);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void refresh(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa198877", new Object[]{this, jSONObject, map});
        } else {
            this.f29799a.render(WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void invokeCallback(int i, MUSValue[] mUSValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f797b1", new Object[]{this, new Integer(i), mUSValueArr, new Boolean(z)});
        } else {
            this.f29799a.invokeCallback(i, jvd.a(mUSValueArr), z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void addInstanceEnv(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb9e7d2", new Object[]{this, str, str2});
            return;
        }
        if ("bundleUrl".equals(str)) {
            this.f29799a.updateBundleUrl(str2);
        }
        this.f29799a.updateInstanceEnv(str, WeexValueImpl.ofString(str2));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Set<String> getInstanceEnvs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("af38d3c7", new Object[]{this});
        }
        c.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getInstanceEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("921bf50d", new Object[]{this, str});
        }
        if ("bundleUrl".equals(str)) {
            return this.f29799a.getBundleUrl();
        }
        WeexValue instanceEnv = this.f29799a.getInstanceEnv(str);
        if (instanceEnv == null) {
            return "";
        }
        if (instanceEnv.isString()) {
            return instanceEnv.getString();
        }
        return instanceEnv.toStringValue();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8389e805", new Object[]{this, str, obj});
        } else {
            this.f29799a.setTag(str, obj);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public Object getTag(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d763d7dd", new Object[]{this, str}) : this.f29799a.getTag(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isPrepared() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59e1a492", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public boolean isUIReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97cd8510", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public boolean isRenderCalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("130e3d08", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public boolean isInvalid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73123f78", new Object[]{this})).booleanValue() : this.p;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public View getRenderRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("220b9e17", new Object[]{this}) : this.f29799a.getRootView();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue() : this.f29799a.isDestroyed();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f29799a.destroy();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public int getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue() : this.f29799a.getInstanceId();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void registerRenderListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5afb5c2", new Object[]{this, gVar});
            return;
        }
        this.i = gVar;
        d();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerExecuteListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dacceb", new Object[]{this, eVar});
            return;
        }
        this.j = eVar;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h != null) {
        } else {
            this.h = new h() { // from class: tb.jvb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.h
                public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onInitSuccess(WeexInstance weexInstance, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                        return;
                    }
                    jvb.a(jvb.this, true);
                    if (jvb.a(jvb.this) == null) {
                        return;
                    }
                    jvb.a(jvb.this).onPrepareSuccess(jvb.this);
                }

                @Override // com.taobao.android.weex.h
                public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                        return;
                    }
                    jvb.b(jvb.this, true);
                    if (jvb.a(jvb.this) == null) {
                        return;
                    }
                    jvb.a(jvb.this).onRenderFailed(jvb.this, weexErrorType.ordinal(), str, true);
                }

                @Override // com.taobao.android.weex.h
                public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                        return;
                    }
                    jvb.c(jvb.this, true);
                    if (z) {
                        if (jvb.a(jvb.this) == null) {
                            return;
                        }
                        jvb.a(jvb.this).onRefreshSuccess(jvb.this);
                    } else if (jvb.a(jvb.this) == null) {
                    } else {
                        jvb.a(jvb.this).onRenderSuccess(jvb.this);
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                    } else if (z) {
                        if (jvb.a(jvb.this) == null) {
                            return;
                        }
                        jvb.a(jvb.this).onRefreshFailed(jvb.this, weexErrorType.ordinal(), str, false);
                    } else {
                        jvb.b(jvb.this, true);
                        if (jvb.a(jvb.this) == null) {
                            return;
                        }
                        jvb.a(jvb.this).onRenderFailed(jvb.this, weexErrorType.ordinal(), str, false);
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteSuccess(WeexInstance weexInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
                    } else if (jvb.b(jvb.this) == null) {
                    } else {
                        jvb.b(jvb.this);
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                    } else if (jvb.b(jvb.this) == null) {
                    } else {
                        jvb.b(jvb.this);
                        weexErrorType.ordinal();
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                    } else if (jvb.a(jvb.this) == null) {
                    } else {
                        jvb.a(jvb.this).onJSException(jvb.this, weexErrorType.ordinal(), str);
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onDestroyed(WeexInstance weexInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                    } else if (jvb.a(jvb.this) == null) {
                    } else {
                        jvb.a(jvb.this).onDestroyed(jvb.this);
                    }
                }
            };
            this.f29799a.addInstanceListener(this.h);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public g getRenderListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8515facd", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void removeRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f756cf95", new Object[]{this});
        } else {
            this.i = null;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void dispatchEvent(MUSEventTarget mUSEventTarget, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af32d4", new Object[]{this, mUSEventTarget, str, jSONObject});
        } else {
            fireEvent(mUSEventTarget.ordinal(), str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void dispatchDOMEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c605389c", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            fireEventOnNode(i, str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void fireEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b5af8e", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            this.f29799a.dispatchEvent(WeexEventTarget.convertWeexEvent(i), str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void fireEventOnNode(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93cda2f", new Object[]{this, new Integer(i), str, jSONObject});
        } else {
            this.f29799a.dispatchNodeEvent(i, str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void fireEventOnNode(int i, String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5f1e85", new Object[]{this, new Integer(i), str, jSONObject, new Boolean(z)});
        } else {
            this.f29799a.dispatchNodeEvent(i, str, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void sendInstanceMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb28ea35", new Object[]{this, str, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f29799a;
        if (!(weexInstanceImpl instanceof WeexMUSInstance)) {
            return;
        }
        ((WeexMUSInstance) weexInstanceImpl).a(a.ATOM_EXT_window, str, jSONObject);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void sendInstanceMessage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bc3a6b", new Object[]{this, str, str2, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f29799a;
        if (!(weexInstanceImpl instanceof WeexMUSInstance)) {
            return;
        }
        ((WeexMUSInstance) weexInstanceImpl).a(str, str2, jSONObject);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        } else {
            this.f29799a.onActivityStart();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            this.f29799a.onActivityResume();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            this.f29799a.onActivityPause();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        } else {
            this.f29799a.onActivityStop();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.f29799a.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public int getRootHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b682199", new Object[]{this})).intValue() : this.k;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public int getRootWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe7d98c8", new Object[]{this})).intValue() : this.l;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18731f91", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992c5cda", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void updateNativeState(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820dbf4c", new Object[]{this, str, str2});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).a(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str}) : ((jug) this.f29799a.getExtend(jug.class)).a(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerNativeStateListener(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d56813", new Object[]{this, str, bVar});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).a(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void unregisterNativeStateListener(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154033ac", new Object[]{this, str, bVar});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).b(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void registerNativeEventCallback(String str, p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df5295a", new Object[]{this, str, aVar});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).a(str, aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void removeNativeEventCallback(String str, p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e893b", new Object[]{this, str, aVar});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).b(str, aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).b(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public r getMonitorInfo() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("56ede0b4", new Object[]{this});
        }
        if (this.f29799a.getExtend(jug.class) != null) {
            z = true;
        }
        c.a(z);
        return ((jug) this.f29799a.getExtend(jug.class)).a();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSMonitor getMonitor() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MUSMonitor) ipChange.ipc$dispatch("80fd497a", new Object[]{this});
        }
        if (this.f29799a.getExtend(jug.class) != null) {
            z = true;
        }
        c.a(z);
        return ((jug) this.f29799a.getExtend(jug.class)).b();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setMonitorDetailTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1117f61d", new Object[]{this, str, new Long(j)});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).a(str, j);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setMonitorDetailDims(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6eebaf", new Object[]{this, str, str2});
        } else {
            ((jug) this.f29799a.getExtend(jug.class)).c(str, str2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setExecuteContext(final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb291f", new Object[]{this, obj});
        } else {
            this.f29799a.getJSThreadHandler().post(new o() { // from class: tb.jvb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        jvb.this.setExecuteContextInternal(obj);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setExecuteContextInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a098e43c", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public Object getExecuteContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ee72d21b", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void dispatchEvent(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867d29fe", new Object[]{this, str, mUSValue});
            return;
        }
        c.a(this.f29799a instanceof WeexScriptOnlyInstance);
        ((WeexScriptOnlyInstance) this.f29799a).a(str, mUSValue == null ? null : mUSValue.convertWeex());
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public Map<String, Object> getInstanceTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5acbf240", new Object[]{this}) : this.f29799a.getInstanceTags();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setJSBridgeEnv(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc573cbb", new Object[]{this, str, map});
        } else {
            super.setJSBridgeEnv(str, map);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, Object> getJSBridgeEnv(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("378ce8cb", new Object[]{this, str}) : super.getJSBridgeEnv(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void addEventListener(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19128435", new Object[]{this, str, bVar});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void removeEventListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void callNativeUINode(int i, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6acc2e7", new Object[]{this, new Integer(i), str, mUSValueArr});
        } else {
            this.f29799a.legacyCallNativeUINode(i, str, jvd.a(mUSValueArr));
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isIncremental() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f8f0db", new Object[]{this})).booleanValue();
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f29799a).c();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isPreciseExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a92b00", new Object[]{this})).booleanValue();
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f29799a).d();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRootNode(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf382d0", new Object[]{this, iNode});
            return;
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f29799a).a(iNode);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setRenderManager(com.taobao.android.weex_framework.ui.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1bf885", new Object[]{this, eVar});
            return;
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f29799a).a(eVar);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void enqueueTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b19e232", new Object[]{this, runnable});
            return;
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f29799a).a(runnable);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void enqueueTaskToJS(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747970d6", new Object[]{this, runnable});
            return;
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        ((WeexMUSInstance) this.f29799a).b(runnable);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public com.taobao.android.weex_framework.ui.e getRenderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.ui.e) ipChange.ipc$dispatch("c1a8ee57", new Object[]{this});
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        return ((WeexMUSInstance) this.f29799a).e();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void bindRenderComponent(com.taobao.android.weex_framework.ui.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec71ec37", new Object[]{this, hVar});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public com.taobao.android.weex_framework.ui.h getRenderComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.ui.h) ipChange.ipc$dispatch("1dbaf464", new Object[]{this}) : ((juk) ((juh) this.f29799a.getExtend(juh.class))).e();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerCSSRule(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d00f83", new Object[]{this, str, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f29799a;
        if (!(weexInstanceImpl instanceof WeexDOMInstance)) {
            return;
        }
        ((WeexDOMInstance) weexInstanceImpl).a(str, WeexValueImpl.ofJSON(jSONObject));
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setGestureConsumptionView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1261d72", new Object[]{this, view});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(view);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setWeexScrollListener(jvs jvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9038cf4", new Object[]{this, jvsVar});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(jvsVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).b(z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void scrollToDecelerate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c3c958", new Object[]{this, new Integer(i)});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(i);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setGestureStateListener(com.taobao.android.weex_framework.ui.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db32b70", new Object[]{this, cVar});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(cVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setGestureEventListener(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb918d9", new Object[]{this, jvqVar});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(jvqVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public jvw getWeexInstanceApm() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (jvw) ipChange.ipc$dispatch("8c1dc542", new Object[]{this});
        }
        jtz jtzVar = (jtz) this.f29799a.getExtend(jtz.class);
        if (jtzVar != null) {
            z = true;
        }
        c.a(z);
        return jtzVar.a();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public View getRenderView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("16d4539a", new Object[]{this}) : ((juh) this.f29799a.getExtend(juh.class)).d();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void onPreRendering(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdc67cf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(i, i2);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c11ba8", new Object[]{this});
        } else {
            this.f29799a.getExtend(juh.class);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void offScreenRendering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4db218", new Object[]{this});
        } else {
            this.f29799a.getExtend(juh.class);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void updateViewport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe86196", new Object[]{this});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).c();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else {
            this.f29799a.onViewAppear();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else {
            this.f29799a.onViewDisappear();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void setConstrainedSize(com.taobao.android.weex_framework.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a19bc9", new Object[]{this, aVar});
        } else {
            this.f29799a.updateContainerSize(aVar.a(), aVar.b());
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue() : this.f29799a.canGoBack();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else {
            this.f29799a.goBack();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void dispatchExternalEvent(n nVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e109872", new Object[]{this, nVar});
        } else {
            this.f29799a.dispatchExternalEvent(nVar);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean resetCorePropsOnPreInit(f fVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ae91ae", new Object[]{this, fVar, context})).booleanValue();
        }
        c.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else {
            this.f29799a.resetContext(context);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance, com.taobao.android.weex_framework.p
    public void registerReportInfoListener(jvr jvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492476ea", new Object[]{this, jvrVar});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = this.f29799a;
        if (weexInstanceImpl == null || weexInstanceImpl.getExtend(juh.class) == null) {
            return;
        }
        ((juh) this.f29799a.getExtend(juh.class)).a(jvrVar);
    }

    public WeexValue a(String str, String str2, WeexValue[] weexValueArr) {
        MUSValue[] mUSValueArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("26083d0f", new Object[]{this, str, str2, weexValueArr});
        }
        if (TextUtils.isEmpty(str2)) {
            com.taobao.android.weex_framework.util.g.b(this, "[MUSDKInstance] callModuleMethod methodName is empty");
            return null;
        }
        if (weexValueArr != null) {
            mUSValueArr = new MUSValue[weexValueArr.length];
            for (int i = 0; i < weexValueArr.length; i++) {
                if (weexValueArr[i].getType() == WeexValue.Type.FUNCTION) {
                    mUSValueArr[i] = MUSValue.ofFunction(Integer.valueOf(weexValueArr[i].getFunctionID()).intValue());
                } else if (weexValueArr[i].getValue() == null) {
                    mUSValueArr[i] = null;
                } else {
                    mUSValueArr[i] = ((WeexValueImpl) weexValueArr[i]).convertMUSValue();
                }
            }
        } else {
            mUSValueArr = null;
        }
        Object a2 = com.taobao.android.weex_framework.module.a.a(this, str, str2, mUSValueArr, this.e);
        if (a2 != null) {
            return WeexValueImpl.convert(a2);
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSValue callModuleMethod(MUSValue mUSValue, MUSValue mUSValue2, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("a02c584d", new Object[]{this, mUSValue, mUSValue2, mUSValueArr});
        }
        if (mUSValue2 == null || TextUtils.isEmpty(mUSValue2.getStringValue())) {
            com.taobao.android.weex_framework.util.g.b(this, "[MUSDKInstance] callModuleMethod methodName is empty");
            return null;
        }
        Object a2 = com.taobao.android.weex_framework.module.a.a(this, mUSValue.getStringValue(), mUSValue2.getStringValue(), mUSValueArr, this.e);
        if (a2 != null) {
            return ((WeexValueImpl) a2).convertMUSValue();
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b473fe", new Object[]{this, runnable});
        } else {
            this.f.post(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSModule getModule(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSModule) ipChange.ipc$dispatch("1620ed62", new Object[]{this, str}) : this.g.get(str);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addModule(String str, MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff56d59d", new Object[]{this, str, mUSModule});
        } else {
            this.g.put(str, mUSModule);
        }
    }

    public WeexInstance a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("a4315c0c", new Object[]{this}) : this.f29799a;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToJs(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32dbb8e", new Object[]{this, runnable});
        } else {
            getWorkHandler().a(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public jwc getWorkHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwc) ipChange.ipc$dispatch("596fc486", new Object[]{this});
        }
        if (this.q == null) {
            final Handler jSThreadHandler = this.f29799a.getJSThreadHandler();
            this.q = new jwc() { // from class: tb.jvb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jwc
                public void a(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("39112e6", new Object[]{this, runnable});
                    } else {
                        jSThreadHandler.post(runnable);
                    }
                }
            };
        }
        return this.q;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void createAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9b8df1", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public float getRpxPerRem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d90bde18", new Object[]{this})).floatValue() : this.r;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.r = f;
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void fireGlobalEvent(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f2457f", new Object[]{this, str, objArr});
            return;
        }
        int length = objArr != null ? objArr.length : 0;
        WeexValue[] weexValueArr = new WeexValue[length];
        for (int i = 0; i < length; i++) {
            weexValueArr[i] = WeexValueImpl.convert(objArr[i]);
        }
        this.f29799a.legacyFireGlobalEvent(str, weexValueArr);
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public long getNativePtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755f1c9c", new Object[]{this})).longValue();
        }
        c.a(false);
        return 0L;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public INode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INode) ipChange.ipc$dispatch("45dd4e8a", new Object[]{this, new Integer(i)});
        }
        c.a(this.f29799a instanceof WeexMUSInstance);
        com.taobao.android.weex_framework.ui.e e = ((WeexMUSInstance) this.f29799a).e();
        if (e != null) {
            return e.a(i);
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addGoBackEventCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ebe174", new Object[]{this, runnable});
        } else {
            this.f29799a.addGoBackEventCallback(runnable);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void clearGoBackEventCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a83197", new Object[]{this});
        } else {
            this.f29799a.clearGoBackEventCallbacks();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getOriginURLString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5feb1d5", new Object[]{this});
        }
        if (this.f29799a != null) {
            z = true;
        }
        c.a(z);
        return this.f29799a.getOriginURLString();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public MUSInstanceConfig getInstanceConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSInstanceConfig) ipChange.ipc$dispatch("fb09c49f", new Object[]{this}) : this.s;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean useDomAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("980b06ea", new Object[]{this})).booleanValue() : this.s.e();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean useXRAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fffa4", new Object[]{this})).booleanValue() : this.s.f();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void init(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerJSPlugin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bcfc9a", new Object[]{this, str, str2});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportErrorToExceptionManager(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de337ecd", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isUnicornRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("215e71cf", new Object[]{this})).booleanValue();
        }
        c.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean isNativeDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d629c3", new Object[]{this})).booleanValue();
        }
        c.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void beginUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748659", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void endUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678800b", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void renderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reloadSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab567b1", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void prepareSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263a0b83", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b915592f", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a25f055", new Object[]{this});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void executeFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a20093", new Object[]{this, new Integer(i), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void renderFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8369d2", new Object[]{this, new Integer(i), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a568756d", new Object[]{this, new Integer(i), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportJsException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c982b4", new Object[]{this, new Integer(i), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void reportFatalError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc6b6e", new Object[]{this, new Integer(i), str});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getExtConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31aafb82", new Object[]{this, str});
        }
        c.a(false);
        return "";
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Set<String> getExtConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cda1e6bc", new Object[]{this});
        }
        c.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, String> getInstanceEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfb868de", new Object[]{this});
        }
        c.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Map<String, Object> getExtEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4554bfe", new Object[]{this});
        }
        c.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public jvt getApmGenerator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvt) ipChange.ipc$dispatch("a47642cc", new Object[]{this});
        }
        c.a(false);
        return null;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void addWeexStats(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a5836", new Object[]{this, str, new Long(j)});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public boolean enabledPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684ea063", new Object[]{this})).booleanValue();
        }
        c.a(false);
        return false;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setIgnoreWhiteScreenReport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89084b38", new Object[]{this, new Boolean(z)});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).a(z);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void dumpEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cac2dd", new Object[]{this});
        } else {
            this.f29799a.dumpEngine();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void refreshPixelCheckTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951fff51", new Object[]{this});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).g();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void stopPixelCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5969124b", new Object[]{this});
        } else {
            ((juh) this.f29799a.getExtend(juh.class)).h();
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public HashMap<String, String> getPerformanceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("2afa2f2", new Object[]{this}) : ((juh) this.f29799a.getExtend(juh.class)).i();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void registerRenderComponentListener(MUSDKInstance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af3dfa", new Object[]{this, aVar});
        } else {
            c.a(false);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void postTaskToMainDelay(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735acd95", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f.postDelayed(runnable, j);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public d getImageAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6b6a2ba", new Object[]{this}) : l.a().f();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public com.taobao.android.weex_framework.d getActivityNav() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.d) ipChange.ipc$dispatch("34a3d96e", new Object[]{this}) : l.a().h();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void setJustCreateTagName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ace772c", new Object[]{this, str});
        } else {
            super.setJustCreateTagName(str);
        }
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public String getJustCreateTagName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e27e6ef2", new Object[]{this}) : super.getJustCreateTagName();
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public void removeTaskFromMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df83d951", new Object[]{this, runnable});
        } else {
            this.f.removeCallbacks(runnable);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f29799a.getBundleUrl();
    }

    public Map<String, MUSModule> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.weex_framework.MUSDKInstance
    public Object getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b2cfc928", new Object[]{this}) : this.t;
    }
}
