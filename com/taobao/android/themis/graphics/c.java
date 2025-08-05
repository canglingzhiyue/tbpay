package com.taobao.android.themis.graphics;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.android.themis.graphics.inspector.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class c implements IRiverBackend {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JNIBridge f15550a;
    private g b;
    private String c;
    private Application d;
    private boolean e;
    private com.taobao.android.themis.graphics.inspector.a f;
    private String g;
    private IRiverBackend.EngineType h;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f15555a;
        public JNIBridge.b b;
        public JNIBridge.c c;
        public JNIBridge.d d;
        public float e;
        public Application f;
        public JNIBridge.f h;
        public JNIBridge.g i;
        public AudioContextFactory.a j;
        public JNIBridge.h k;
        public boolean m;
        public boolean g = false;
        public IRiverBackend.EngineType l = IRiverBackend.EngineType.Qking;
    }

    public static /* synthetic */ JNIBridge a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JNIBridge) ipChange.ipc$dispatch("b02e6283", new Object[]{cVar}) : cVar.f15550a;
    }

    public static /* synthetic */ Application b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("e5a1472", new Object[]{cVar}) : cVar.d;
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JNIBridge.b f15556a;
        public JNIBridge.c b;
        public JNIBridge.d c;
        public final String d;
        private float e;
        private boolean f;
        private Application g;
        public JNIBridge.f h;
        public JNIBridge.g i;
        public AudioContextFactory.a j;
        public JNIBridge.h k;
        private IRiverBackend.EngineType l;
        private boolean m;

        public b(Application application, String str) {
            this.d = str;
            this.g = application;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("913d40b", new Object[]{this});
            }
            a aVar = new a();
            aVar.b = this.f15556a;
            aVar.c = this.b;
            aVar.d = this.c;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.f15555a = this.d;
            aVar.e = this.e;
            aVar.f = this.g;
            aVar.g = this.f;
            aVar.j = this.j;
            aVar.l = this.l;
            aVar.k = this.k;
            aVar.m = this.m;
            return aVar;
        }

        public b a(AudioContextFactory.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b2349482", new Object[]{this, aVar});
            }
            this.j = aVar;
            return this;
        }

        public b a(JNIBridge.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("408b35b9", new Object[]{this, bVar});
            }
            this.f15556a = bVar;
            return this;
        }

        public b a(JNIBridge.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("25cca47a", new Object[]{this, cVar});
            }
            this.b = cVar;
            return this;
        }

        public b a(JNIBridge.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b0e133b", new Object[]{this, dVar});
            }
            this.c = dVar;
            return this;
        }

        public b a(JNIBridge.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d590f0bd", new Object[]{this, fVar});
            }
            this.h = fVar;
            return this;
        }

        public b a(JNIBridge.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bad25f7e", new Object[]{this, gVar});
            }
            this.i = gVar;
            return this;
        }

        public b a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("49382a3a", new Object[]{this, new Float(f)});
            }
            this.e = f;
            return this;
        }

        public b a(IRiverBackend.EngineType engineType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("56f83b16", new Object[]{this, engineType});
            }
            this.l = engineType;
            return this;
        }

        public b a(JNIBridge.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a013ce3f", new Object[]{this, hVar});
            }
            this.k = hVar;
            return this;
        }

        public b a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dd2050a6", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("77c11327", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }
    }

    public c(a aVar) {
        boolean z = false;
        this.e = false;
        this.h = IRiverBackend.EngineType.Qking;
        JNIBridge.setOnLibraryLoadedListener(new JNIBridge.e() { // from class: com.taobao.android.themis.graphics.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.themis.graphics.JNIBridge.e
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:runtime", "onLibraryLoaded!");
                }
            }
        });
        this.h = aVar.l;
        if (this.h == IRiverBackend.EngineType.V8 && !d()) {
            throw new Error("failed to init themis graphics with V8 engine because of jsi not available!");
        }
        this.f15550a = new JNIBridge(aVar.b, aVar.m);
        this.f15550a.setOnJSErrorListener(aVar.c);
        this.f15550a.setOnJSMemoryListener(aVar.d);
        this.f15550a.setOnJSNotResponseListener(aVar.h);
        this.f15550a.setOnAPIStatsListener(aVar.i);
        this.f15550a.setOnSourceMapListener(aVar.k);
        this.f15550a.setAudioContextFactory(new AudioContextFactory(aVar.j));
        this.c = aVar.f15555a;
        this.b = new g(this.f15550a, aVar.e);
        if (aVar.g) {
            this.f = new com.taobao.android.themis.graphics.inspector.a(new WeakReference(this));
        }
        if (aVar.f != null) {
            try {
                com.taobao.android.riverlogger.e.a(aVar.f);
            } catch (Throwable th) {
                Log.e("themis:runtime", "setup river logger failed:" + th.getMessage());
            }
            try {
                this.d = aVar.f;
                ApplicationInfo applicationInfo = aVar.f.getApplicationInfo();
                this.g = applicationInfo.dataDir;
                this.e = (applicationInfo.flags & 2) != 0 ? true : z;
            } catch (Throwable th2) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "failed to get application info: " + th2.getMessage());
            }
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:runtime", "themis runtime create success!");
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IRiverBackend.EngineType engineType = this.h;
        if (engineType == null) {
            engineType = IRiverBackend.EngineType.Qking;
        }
        JNIBridge jNIBridge = this.f15550a;
        String str = this.c;
        String str2 = this.g;
        if (this.f != null) {
            z = true;
        }
        return jNIBridge.attach(str, engineType, str2, z);
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
        } else {
            try {
                this.f15550a.updateOrangeConfigs(JSON.toJSONString(map));
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "failed to update orange config because of " + th.getMessage());
            }
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>(1);
        }
        this.f15550a.createAppContext(hashMap);
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f15550a.executeScriptInMainContext(str, str2);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, bArr, str});
        } else {
            this.f15550a.executeBytecodeInMainContext(bArr, str);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            a(str, str2, "");
        }
    }

    public void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        com.taobao.android.themis.graphics.inspector.a aVar = this.f;
        if (aVar != null) {
            aVar.a(new a.InterfaceC0601a() { // from class: com.taobao.android.themis.graphics.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.themis.graphics.inspector.a.InterfaceC0601a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this).executeScriptInAppContext(str, str2, str3);
                    }
                }
            });
        } else {
            this.f15550a.executeScriptInAppContext(str, str2, str3);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void b(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6b103a", new Object[]{this, bArr, str});
        } else {
            a(bArr, str, "");
        }
    }

    public void a(final byte[] bArr, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e4f0c3", new Object[]{this, bArr, str, str2});
            return;
        }
        com.taobao.android.themis.graphics.inspector.a aVar = this.f;
        if (aVar != null) {
            aVar.a(new a.InterfaceC0601a() { // from class: com.taobao.android.themis.graphics.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.themis.graphics.inspector.a.InterfaceC0601a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this).executeBytecodeInAppContext(bArr, str, str2);
                    }
                }
            });
        } else {
            this.f15550a.executeBytecodeInAppContext(bArr, str, str2);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.f15550a.executeScriptInCurrentThread(str, str2, "");
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            this.f15550a.executeScriptInCurrentThread(str, str2, str3);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void c(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29b5d3b", new Object[]{this, bArr, str});
        } else {
            this.f15550a.executeByteCodeInCurrentThread(bArr, str, "");
        }
    }

    public void b(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b265f84", new Object[]{this, bArr, str, str2});
        } else {
            this.f15550a.executeByteCodeInCurrentThread(bArr, str, str2);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
        } else {
            this.f15550a.fireGlobalEventInMainContext(str, jSONObject, z);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f15550a.hasRegisterGlobalEventInMainContext(str);
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        g gVar = this.b;
        if (gVar != null) {
            try {
                return gVar.a(motionEvent);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "failed to dispatch touch event because of " + th.getMessage());
            }
        }
        return false;
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:runtime", "themis runtime will be detached");
        if (this.f15550a.detach() && this.e && this.d != null) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Toast.makeText(this.d.getApplicationContext(), "js memory leaked!", 1).show();
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.themis.graphics.c.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Toast.makeText(c.b(c.this).getApplicationContext(), "js memory leaked!", 1).show();
                            } catch (Throwable th) {
                                Log.e("themis:runtime", "unexpected error: " + th.getMessage());
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "unexpected error: " + th.getMessage());
            }
        }
        this.f15550a = null;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.h == IRiverBackend.EngineType.Qking) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return JSEngine.startRemoteInspect(str);
            }
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.h == IRiverBackend.EngineType.Qking) {
        } else {
            try {
                JSEngine.stopRemoteInspect();
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
            }
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            return JSEngine.isEngineReady(1);
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
            return false;
        }
    }
}
