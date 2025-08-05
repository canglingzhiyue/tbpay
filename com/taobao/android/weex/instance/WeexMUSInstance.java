package com.taobao.android.weex.instance;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.c;
import com.taobao.android.weex.g;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.ui.e;
import com.taobao.android.weex_framework.ui.f;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_framework.util.s;
import java.util.ArrayList;
import tb.juf;
import tb.jug;
import tb.juj;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexMUSInstance extends WeexInstanceImpl implements juf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean f;

    /* renamed from: a  reason: collision with root package name */
    private final juj f15870a;
    private final c b;
    private ArrayList<Runnable> c;
    private boolean d;
    private long e;

    public static /* synthetic */ Object ipc$super(WeexMUSInstance weexMUSInstance, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1759510815:
                super.renderSucceed(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -71850121:
                super.bindMUSAdapterInstance((jvb) objArr[0]);
                return null;
            case 461490009:
                super.engineException(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 566312527:
                super.render((WeexValue) objArr[0]);
                return null;
            case 743373420:
                return super.getExtend((Class) objArr[0]);
            case 939513102:
                super.onDestroyStart();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            case 1810293299:
                super.renderFailed(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case 1852520930:
                super.scriptException(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void updateContainerSizeOnLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b8ad9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    static {
        kge.a(-1659891328);
        kge.a(261917589);
        f = false;
    }

    private static synchronized void f() {
        synchronized (WeexMUSInstance.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            } else if (f) {
            } else {
                System.loadLibrary("MuiseCore");
                f = true;
            }
        }
    }

    public static WeexMUSInstance create(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexMUSInstance) ipChange.ipc$dispatch("b3945c93", new Object[]{gVar});
        }
        f();
        WeexMUSInstance weexMUSInstance = new WeexMUSInstance(gVar);
        postInstanceCreate(weexMUSInstance, gVar.l);
        return weexMUSInstance;
    }

    private WeexMUSInstance(g gVar) {
        super(gVar);
        c cVar;
        this.d = false;
        s.a("updateLayoutParams");
        MUSEngine.updateLayoutParams(gVar.f15864a);
        MUSEngine.updateDelayedNativeRegister();
        s.b("updateLayoutParams");
        if (gVar.g == null || gVar.g.b() == null) {
            cVar = new c();
        } else {
            cVar = gVar.g.b();
        }
        this.b = cVar;
        this.f15870a = new juj(this);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void bindMUSAdapterInstance(jvb jvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb7a777", new Object[]{this, jvbVar});
            return;
        }
        super.bindMUSAdapterInstance(jvbVar);
        this.f15870a.c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = new ArrayList<>();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        final ArrayList<Runnable> arrayList = this.c;
        if (arrayList == null) {
            return;
        }
        this.c = null;
        o oVar = new o() { // from class: tb.juo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!WeexMUSInstance.this.isDestroyed()) {
                    for (Runnable runnable : arrayList) {
                        runnable.run();
                    }
                    if (Looper.myLooper() != Looper.getMainLooper() || WeexMUSInstance.this.getRootView() == null) {
                        return;
                    }
                    WeexMUSInstance.this.getRootView().requestLayout();
                }
            }
        };
        if (this.d) {
            j.a(oVar);
        } else {
            oVar.run();
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == jug.class) {
            return (T) this.f15870a;
        }
        return cls == juf.class ? this : (T) super.getExtend(cls);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        super.onDestroyStart();
        View d = this.f15870a.d();
        if (!(d instanceof f)) {
            return;
        }
        ((f) d).release(true);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f15870a.a(this.mInitDoneSuccess, this.mRenderDoneSuccess);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void render(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
            return;
        }
        if (this.e == 0) {
            this.e = System.currentTimeMillis();
        }
        updateInstanceScreenSize(getContext(), true);
        super.render(weexValue);
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.sendInstanceMessage(this.mNativePtr, str, str2, WeexValueImpl.ofJSON(jSONObject));
        }
    }

    public void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            this.f15870a.a(i, str, j);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f15870a.d(str, str2);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void renderSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971ffee1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.f15870a.b().a(1, MUSMonitor.KEY_MAIN_TIME_ALL, System.currentTimeMillis() - this.e);
        }
        super.renderSucceed(z);
        MUSAppMonitor.b(this.f15870a.a());
        e e = this.f15870a.e();
        if (e == null) {
            return;
        }
        e.a(getAdapterMUSInstance());
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void renderFailed(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be6e233", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        super.renderFailed(z, i, str);
        MUSAppMonitor.g(this.f15870a.a(), String.valueOf(i), str);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void scriptException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b39e2", new Object[]{this, new Integer(i), str});
            return;
        }
        super.scriptException(i, str);
        MUSAppMonitor.d(this.f15870a.a(), String.valueOf(i), str);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void engineException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b81c759", new Object[]{this, new Integer(i), str});
            return;
        }
        super.engineException(i, str);
        MUSAppMonitor.e(this.f15870a.a(), String.valueOf(i), str);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View d = this.f15870a.d();
        addOnLayoutChangeListener(d);
        return d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            this.d = true;
            e e = this.f15870a.e();
            if (e == null) {
                return;
            }
            e.a(getContext());
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eca52f1", new Object[]{this, eVar});
        } else {
            this.f15870a.a(eVar);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (!this.d || this.f15870a.e() == null) {
            return;
        }
        this.f15870a.e().a();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        if (!this.d || this.f15870a.e() == null) {
            return;
        }
        this.f15870a.e().b();
    }

    public void a(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937240ab", new Object[]{this, iNode});
            return;
        }
        e e = this.f15870a.e();
        if (e == null) {
            return;
        }
        e.a(iNode);
        e.a(this.b.a());
        e.b(this.b.b());
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.a();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b.b();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.c;
        if (arrayList != null) {
            arrayList.add(runnable);
        } else if (this.d) {
            j.a(runnable);
        } else {
            Handler jSThreadHandler = getJSThreadHandler();
            if (jSThreadHandler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                jSThreadHandler.post(runnable);
            }
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.c;
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        Handler jSThreadHandler = getJSThreadHandler();
        if (jSThreadHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            jSThreadHandler.post(runnable);
        }
    }

    public e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c706d4f3", new Object[]{this}) : this.f15870a.e();
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.musDirtyNodeAndReLayout(this.mNativePtr, i, z);
        }
    }
}
