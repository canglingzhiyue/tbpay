package com.taobao.android.tbuprofen;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.common.b;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import com.taobao.android.tbuprofen.mock.ARTUtil;
import com.taobao.android.tbuprofen.mock.JDWPMockUtils;
import com.taobao.android.tbuprofen.mock.RuntimeMockUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f15488a;
    private Context b;
    private final b c;
    private TBPEngineNative d;
    private f e;
    private e f;

    static {
        kge.a(1361835652);
    }

    public static /* synthetic */ b a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f428a863", new Object[]{gVar}) : gVar.c;
    }

    private g(Context context) {
        this.f15488a = new AtomicInteger(0);
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
        this.d = null;
        this.c = new b();
        this.f = null;
    }

    public static a a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("667563c6", new Object[]{context, new Boolean(z)}) : new a(context, z);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final g f15489a;

        static {
            kge.a(952502619);
        }

        public a(Context context, boolean z) {
            this.f15489a = new g(context);
            g.a(this.f15489a).f15482a = z;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c45c070", new Object[]{this, fVar});
            }
            g.a(this.f15489a).e = fVar;
            return this;
        }

        public a a(TBPLogLevel tBPLogLevel, TBPLogLevel tBPLogLevel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cd1d34b0", new Object[]{this, tBPLogLevel, tBPLogLevel2});
            }
            g.a(this.f15489a).d = tBPLogLevel;
            g.a(this.f15489a).c = tBPLogLevel2;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("36c869ce", new Object[]{this, new Boolean(z)});
            }
            g.a(this.f15489a).g = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ffc9610f", new Object[]{this, new Boolean(z)});
            }
            g.a(this.f15489a).i = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8ca5850", new Object[]{this, new Boolean(z)});
            }
            g.a(this.f15489a).j = z;
            return this;
        }

        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7a0f0a6f", new Object[]{this}) : this.f15489a;
        }
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            if (!com.taobao.android.tbuprofen.common.d.a()) {
                return false;
            }
            if (!this.c.f15482a) {
                Log.e("TBPManager", "TBP is disable by launchConfig");
                return false;
            } else if (this.f15488a.get() == 2) {
                return true;
            } else {
                this.f15488a.set(1);
                if (this.c.e == null) {
                    this.e = new com.taobao.android.tbuprofen.log.a();
                } else {
                    this.e = this.c.e;
                }
                this.e.a();
                this.d = b();
                if (this.d == null) {
                    this.f15488a.set(3);
                    return false;
                }
                this.f15488a.set(2);
                this.e.b();
                return true;
            }
        } catch (Exception e) {
            this.e.a(f.ERR_INIT_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(e));
            com.taobao.android.tbuprofen.log.c.a("TBPManager", e, "Failed to attachAgent", new Object[0]);
            return false;
        }
    }

    public synchronized boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f39a42f", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar != null && this.d != null) {
            if (this.f != null) {
                com.taobao.android.tbuprofen.log.c.b("TBPManager", "The plugin %s had loaded!", this.f.a());
                return false;
            }
            this.f = eVar;
            String a2 = this.f.a();
            this.e.a(a2);
            String b = h.b().b(a2);
            if (TextUtils.isEmpty(b)) {
                String format = String.format("Can't find plugin %s. RemoteSo:%b", a2, Boolean.valueOf(h.b().a()));
                this.e.a(a2, f.ERR_LOAD_PLUGIN_EXCEPTION, format);
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "loadPlugin %s error. %s", a2, format);
                return false;
            }
            int loadPluginNative = this.d.loadPluginNative(b, eVar.b());
            if (loadPluginNative == 0) {
                try {
                    String a3 = h.b().a(a2);
                    if (!TextUtils.isEmpty(a3)) {
                        this.e.a(f.ERR_LOAD_PLUGIN_EXCEPTION, a3);
                        com.taobao.android.tbuprofen.log.c.a("TBPManager", "loadPlugin % error. %s", a2, a3);
                        return false;
                    }
                    this.e.b(a2);
                    return true;
                } catch (Exception e) {
                    this.e.a(a2, f.ERR_LOAD_PLUGIN_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(e));
                    com.taobao.android.tbuprofen.log.c.a("TBPManager", e, "loadPlugin %s", a2);
                }
            } else {
                this.e.a(a2, f.ERR_LOAD_PLUGIN_ERROR, String.valueOf(loadPluginNative));
            }
            return false;
        }
        return false;
    }

    public synchronized boolean a(TBPEvent tBPEvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c8a9e4", new Object[]{this, tBPEvent, new Boolean(z)})).booleanValue();
        } else if (this.d == null) {
            return false;
        } else {
            return this.d.monitorEventNative(tBPEvent.getIndex(), z) == 0;
        }
    }

    private TBPEngineNative b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPEngineNative) ipChange.ipc$dispatch("2785867a", new Object[]{this});
        }
        boolean a2 = com.taobao.android.tbuprofen.common.d.a(this.b);
        com.taobao.android.tbuprofen.log.c.c("TBPManager", "Load Engine..... Debuggable: %b, SDKVer: %d", Boolean.valueOf(a2), Integer.valueOf(Build.VERSION.SDK_INT));
        try {
            if (this.c.g && com.taobao.android.tbuprofen.common.d.b(this.b)) {
                this.e.a(f.ERR_VIRTUAL, "");
                com.taobao.android.tbuprofen.log.c.b("TBPManager", "Is On Virtual Env", new Object[0]);
                return null;
            } else if (!a2 && !b(this.b)) {
                if (!a2 && this.c.h) {
                    c();
                }
                return null;
            } else if (!a(this.b)) {
                if (!a2 && this.c.h) {
                    c();
                }
                return null;
            } else {
                TBPEngineNative d = d();
                if (!a2 && this.c.h) {
                    c();
                }
                return d;
            }
        } finally {
            if (!a2 && this.c.h) {
                c();
            }
        }
    }

    private boolean a(Context context) {
        File a2 = com.taobao.android.tbuprofen.common.c.a(context);
        if (a2 == null || !a2.exists()) {
            this.e.a(f.ERR_MISS_AGENT_SO, "");
            com.taobao.android.tbuprofen.log.c.a("TBPManager", "Can't find the agent so.", new Object[0]);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            com.taobao.android.tbuprofen.log.c.c("TBPManager", "attachTBPAgent....", new Object[0]);
            try {
                if (!e()) {
                    return false;
                }
                Debug.attachJvmtiAgent(a2.getAbsolutePath(), null, context.getClassLoader());
            } catch (IOException e) {
                f fVar = this.e;
                fVar.a(f.ERR_ATTACH_AGNET_EXCEPTION, "IOException: " + e.getMessage());
                e.printStackTrace();
                com.taobao.android.tbuprofen.log.c.a("TBPManager", e, "Failed to attachTBPAgent", new Object[0]);
                return false;
            } catch (SecurityException e2) {
                f fVar2 = this.e;
                fVar2.a(f.ERR_ATTACH_AGNET_EXCEPTION, "SecurityException: " + e2.getMessage());
                e2.printStackTrace();
                com.taobao.android.tbuprofen.log.c.a("TBPManager", e2, "Failed to attachTBPAgent", new Object[0]);
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            com.taobao.android.tbuprofen.log.c.c("TBPManager", "Reflect attachTBPAgent....", new Object[0]);
            try {
                Method method = Class.forName("dalvik.system.VMDebug").getMethod("attachAgent", String.class);
                method.setAccessible(true);
                if (!e()) {
                    return false;
                }
                method.invoke(null, a2.getAbsolutePath());
            } catch (Exception e3) {
                this.e.a(f.ERR_ATTACH_AGNET_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(e3));
                com.taobao.android.tbuprofen.log.c.a("TBPManager", e3, "Failed to reflect attachTBPAgent", new Object[0]);
                return false;
            }
        }
        com.taobao.android.tbuprofen.log.c.c("TBPManager", "attachTBPAgent Successfully!", new Object[0]);
        return true;
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        com.taobao.android.tbuprofen.log.c.c("TBPManager", "mockNoneDebuggable", new Object[0]);
        try {
            String a2 = h.b().a("tbuprofen-util");
            if (!TextUtils.isEmpty(a2)) {
                this.e.a(f.ERR_SYS_LOAD_MOCK_EXCEPTION, a2);
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "Failed to load tbuprofen-util. %s", a2);
                return false;
            }
            int a3 = RuntimeMockUtils.a(context, this.c.c, this.e);
            if (a3 != 0) {
                this.e.a(f.ERR_RUNTIME_MOCK_INIT, String.valueOf(a3));
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "Failed to init RuntimeMockUtils!", new Object[0]);
                return false;
            } else if (!JDWPMockUtils.a(this.e)) {
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "Failed to mock jdwp!", new Object[0]);
                return false;
            } else if (Build.VERSION.SDK_INT >= 28 && this.c.f != 805372417) {
                return true;
            } else {
                return RuntimeMockUtils.b();
            }
        } catch (Throwable th) {
            this.e.a(f.ERR_SYS_LOAD_MOCK_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(th));
            com.taobao.android.tbuprofen.log.c.a("TBPManager", th, "Couldn't load tbuprofen-util Library.", new Object[0]);
            return false;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        JDWPMockUtils.c();
        RuntimeMockUtils.c();
    }

    private TBPEngineNative d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPEngineNative) ipChange.ipc$dispatch("ad8d2b8", new Object[]{this});
        }
        try {
            com.taobao.android.tbuprofen.log.c.c("TBPManager", "Init TBP engine!", new Object[0]);
            TBPEngineNative tBPEngineNative = new TBPEngineNative();
            if (!tBPEngineNative.a(this.c)) {
                return null;
            }
            return tBPEngineNative;
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a("TBPManager", "initEngine", e);
            return null;
        }
    }

    private boolean e() {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.c.i) {
            if (!ARTUtil.a()) {
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "ARTUtil have not init.", new Object[0]);
                return false;
            }
            int i = 3;
            do {
                b = ARTUtil.b();
                if (b == 0) {
                    break;
                }
                i--;
                try {
                    Thread.sleep(50L);
                    continue;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    continue;
                }
            } while (i > 0);
            if (b != 0) {
                com.taobao.android.tbuprofen.log.c.a("TBPManager", "mutator_lock_ is shared held, do not attachTBPAgent..", new Object[0]);
                this.e.a(f.ERR_MUTATOR_HELD, String.valueOf(b));
                return false;
            }
        }
        return true;
    }
}
