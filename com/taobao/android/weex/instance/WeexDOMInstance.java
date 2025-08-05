package com.taobao.android.weex.instance;

import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex.g;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.r;
import com.taobao.android.weex_framework.util.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.juh;
import tb.jui;
import tb.juk;
import tb.jvb;
import tb.jvv;
import tb.jvw;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexDOMInstance extends WeexInstanceImpl implements jui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final juk f15869a;
    private View.OnAttachStateChangeListener c;
    private boolean d;
    private jui.a e;
    private boolean mApmAware;

    static {
        kge.a(766674935);
        kge.a(-973984866);
    }

    public static /* synthetic */ Object ipc$super(WeexDOMInstance weexDOMInstance, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2088493082:
                super.onViewDisappear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1265876613:
                super.onActivityStart();
                return null;
            case -507069837:
                super.onInitCalled();
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case 51270883:
                super.updateScreenSize(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                return null;
            case 397619558:
                return super.getRootView();
            case 474982114:
                super.onActivityResume();
                return null;
            case 684718647:
                super.reportEngineException(((Number) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2]);
                return null;
            case 743373420:
                return super.getExtend((Class) objArr[0]);
            case 939513102:
                super.onDestroyStart();
                return null;
            case 1073542112:
                super.onViewAppear();
                return null;
            case 1400366827:
                super.reportUnicornScreenInfo((JSONObject) objArr[0]);
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static /* synthetic */ void a(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23be200", new Object[]{weexDOMInstance});
        } else {
            weexDOMInstance.registerCrashTrack();
        }
    }

    public static /* synthetic */ void access$100(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63238450", new Object[]{weexDOMInstance});
        } else {
            weexDOMInstance.registerApmCallback();
        }
    }

    public WeexDOMInstance(g gVar) {
        super(gVar);
        this.mApmAware = true;
        if (getInstanceConfig().g() != null) {
            this.mApmAware = getInstanceConfig().g().booleanValue();
            int instanceId = getInstanceId();
            r.a(instanceId, "Apm", "setApmAware: " + this.mApmAware + " in context: " + getContext()).a();
        }
        this.f15869a = new juk(this, gVar.i, gVar.j, gVar.g);
    }

    public static WeexDOMInstance create(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDOMInstance) ipChange.ipc$dispatch("3740b4fc", new Object[]{gVar});
        }
        WeexDOMInstance weexDOMInstance = new WeexDOMInstance(gVar);
        postInstanceCreate(weexDOMInstance, gVar.l);
        return weexDOMInstance;
    }

    public static WeexDOMInstance createEmbed(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDOMInstance) ipChange.ipc$dispatch("8e08e53d", new Object[]{gVar});
        }
        WeexDOMInstance weexDOMInstance = new WeexDOMInstance(gVar);
        postInstanceCreate(weexDOMInstance, new jvb(gVar.f15864a, null));
        return weexDOMInstance;
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onInitCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c6ba73", new Object[]{this});
            return;
        }
        super.onInitCalled();
        if (Build.VERSION.SDK_INT < 19 || getRootViewWithoutCreate() == null || !getRootViewWithoutCreate().isAttachedToWindow()) {
            return;
        }
        this.f15869a.w();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View rootView = super.getRootView();
        if (this.c == null) {
            s.a("WeexFirstGetRootView");
            if (Build.VERSION.SDK_INT >= 19 && rootView.isAttachedToWindow()) {
                s.a("WeexFirstAttachRootView");
                registerCrashTrack();
                registerApmCallback();
                s.b("WeexFirstAttachRootView");
            }
            this.c = new View.OnAttachStateChangeListener() { // from class: tb.jun.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    }
                }

                {
                    WeexDOMInstance.this = this;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                        return;
                    }
                    s.a("WeexFirstAttachRootView");
                    WeexDOMInstance.a(WeexDOMInstance.this);
                    WeexDOMInstance.access$100(WeexDOMInstance.this);
                    WeexDOMInstance weexDOMInstance = WeexDOMInstance.this;
                    WeexDOMInstance.$ipChange.v();
                    s.b("WeexFirstAttachRootView");
                }
            };
            rootView.addOnAttachStateChangeListener(this.c);
            s.b("WeexFirstGetRootView");
        }
        return rootView;
    }

    private void registerCrashTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acee1ee", new Object[]{this});
        } else {
            this.f15869a.w();
        }
    }

    private void registerApmCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3439a67", new Object[]{this});
        } else if (this.d || !this.mApmAware || this.mApmExtend == null) {
        } else {
            this.mApmExtend.a(getInstanceId(), getRootView(), new jvv() { // from class: tb.jun.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    WeexDOMInstance.this = this;
                }

                @Override // tb.jvv
                public HashMap<String, String> a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (HashMap) ipChange2.ipc$dispatch("be7c57cb", new Object[]{this});
                    }
                    if (!f.q()) {
                        WeexDOMInstance weexDOMInstance = WeexDOMInstance.this;
                        return WeexDOMInstance.$ipChange.f();
                    }
                    WeexDOMInstance weexDOMInstance2 = WeexDOMInstance.this;
                    try {
                        JSONObject jSONObject = WeexDOMInstance.$ipChange.E().get(5L, TimeUnit.SECONDS).getJSONObject("first-screen");
                        if (jSONObject == null) {
                            com.taobao.android.weex_framework.util.g.c("WeexFirstScreenInfoAsync fail, no first-screen");
                            return new HashMap<>();
                        }
                        HashMap<String, String> hashMap = new HashMap<>();
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            hashMap.put(entry.getKey(), jSONObject.getString(entry.getKey()));
                        }
                        return hashMap;
                    } catch (Throwable unused) {
                        com.taobao.android.weex_framework.util.g.c("WeexFirstScreenInfoAsync fail, return empty map");
                        return new HashMap<>();
                    }
                }
            });
            this.d = true;
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == juh.class) {
            return (T) this.f15869a;
        }
        return cls == jui.class ? this : (T) super.getExtend(cls);
    }

    public void a(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034fd1a", new Object[]{this, str, weexValue});
        } else if (isDestroyed()) {
        } else {
            if (Looper.myLooper() != getJSThreadHandler().getLooper()) {
                z = false;
            }
            c.a(z);
            WeexPlatformInstanceBridge.registerCSSRuleInJSThread(this.mNativePtr, str, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        super.onDestroyStart();
        if (f.l()) {
            return;
        }
        this.f15869a.a(this.mApmExtend, getBundleUrl());
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void reportUnicornScreenInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5377e6eb", new Object[]{this, jSONObject});
            return;
        }
        super.reportUnicornScreenInfo(jSONObject);
        if (!f.l() || jSONObject == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        this.f15869a.a(this.mApmExtend, hashMap, getBundleUrl());
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f15869a.o();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        super.onActivityStart();
        this.f15869a.p();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        this.f15869a.q();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        this.f15869a.r();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        this.f15869a.s();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        super.onViewAppear();
        this.f15869a.t();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        super.onViewDisappear();
        this.f15869a.u();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void updateScreenSize(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e54e3", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        super.updateScreenSize(f, f2, f3);
        this.f15869a.a(f, f2);
    }

    @Override // tb.jui
    public void a(jui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494d133d", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    @Override // tb.jui
    public void a(int i, HashMap<String, String> hashMap) {
        jui.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17cea38", new Object[]{this, new Integer(i), hashMap});
        } else if (isDestroyed() || (aVar = this.e) == null) {
        } else {
            aVar.a(i, hashMap);
        }
    }

    @Override // tb.jui
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        jui.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void reportEngineException(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cffa37", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        super.reportEngineException(i, str, str2);
        juk jukVar = this.f15869a;
        if (jukVar == null) {
            return;
        }
        jukVar.a(i, str, 0, str2);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void setApmAware(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff36fb0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mApmAware = z;
        int instanceId = getInstanceId();
        r.a(instanceId, "Apm", "setApmAware: " + z + " in context: " + getContext()).a();
        if (!z || this.d || Build.VERSION.SDK_INT < 19 || getRootViewWithoutCreate() == null || !getRootViewWithoutCreate().isAttachedToWindow()) {
            return;
        }
        registerApmCallback();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void setWeexApmCustomData(WeexApmCustomData weexApmCustomData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4043a86", new Object[]{this, weexApmCustomData});
        } else if (weexApmCustomData == null) {
        } else {
            if (weexApmCustomData.getWxCustomStartTimeStamp() > 0 && this.mApmExtend != null) {
                this.mApmExtend.a(jvw.KEY_PAGE_STAGES_CUSTOM_START_TIME, weexApmCustomData.getWxCustomStartTimeStamp());
                this.mApmExtend.a(getInstanceId(), jvw.KEY_PAGE_STAGES_CUSTOM_START_TIME, generateUptimeFromCurrentTime(weexApmCustomData.getWxCustomStartTimeStamp()));
            }
            if (weexApmCustomData.getWxCustomContainerStartTimeStamp() <= 0 || this.mApmExtend == null) {
                return;
            }
            this.mApmExtend.a(jvw.KEY_PAGE_STAGES_STANDARD_CONTAINER_START, weexApmCustomData.getWxCustomContainerStartTimeStamp());
        }
    }

    private long generateUptimeFromCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{this, new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
    }
}
