package com.taobao.bootimage.linked;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kdz;
import tb.kej;
import tb.ket;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile f d;
    private volatile LinkedSplashData e;
    private final String i;

    /* renamed from: a  reason: collision with root package name */
    private final a f16705a = new a();
    private final Map<String, b> b = new ConcurrentHashMap();
    private final List<com.taobao.bootimage.linked.a> c = new CopyOnWriteArrayList();
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private Map<String, b> k = new HashMap();
    private final Map<String, kdz> j = new ConcurrentHashMap();

    static {
        kge.a(601998445);
    }

    public c(String str) {
        this.i = str;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64067f74", new Object[]{this, bVar});
        } else if (bVar == null) {
            kej.a("LinkedSplashCooperator", "addCallback = null");
        } else {
            this.b.put(bVar.a(), bVar);
            kej.a("LinkedSplashCooperator", "addCallback, type = " + bVar.a() + ", callback = " + bVar);
            if (this.k.get(bVar.a()) != this.f16705a) {
                return;
            }
            this.k.remove(bVar.a());
            bVar.c(this.e);
        }
    }

    public void a(com.taobao.bootimage.linked.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64060b15", new Object[]{this, aVar});
        } else {
            this.c.add(aVar);
        }
    }

    public void b(com.taobao.bootimage.linked.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8454374", new Object[]{this, aVar});
        } else {
            this.c.remove(aVar);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d845b7d3", new Object[]{this, bVar});
        } else if (bVar == null) {
            kej.a("LinkedSplashCooperator", "removeCallback = null");
        } else {
            this.b.remove(bVar.a());
            kej.a("LinkedSplashCooperator", "removeCallback, type = " + bVar.a() + ", callback = " + bVar);
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640850f0", new Object[]{this, fVar});
            return;
        }
        this.d = fVar;
        kej.a("LinkedSplashCooperator", "setEnvCallback, envCallback = " + fVar);
    }

    public f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("47cb4630", new Object[]{this}) : this.d;
    }

    public LinkedSplashData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedSplashData) ipChange.ipc$dispatch("e6d29ed5", new Object[]{this}) : this.e;
    }

    public void a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
            return;
        }
        try {
            d(linkedSplashData).a(linkedSplashData);
            kej.a("LinkedSplashCooperator", "notifyReceiveData, linkedDataType = " + linkedSplashData);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "notifyReceiveData", th);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e = null;
        this.f = false;
        this.g = false;
        kej.a("LinkedSplashCooperator", "resetSelected,  finish");
    }

    public boolean b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue();
        }
        try {
            boolean b = d(linkedSplashData).b(linkedSplashData);
            if (b) {
                this.e = linkedSplashData;
                com.taobao.bootimage.linked.ext.a.a(linkedSplashData, false);
            } else {
                this.e = null;
            }
            kej.a("LinkedSplashCooperator", "shouldShow, data = " + linkedSplashData + ",   shouldShow = " + b);
            return b;
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "shouldShow", th);
            return false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (this.e == null) {
                kej.a("LinkedSplashCooperator", "shouldColdStartShow, data is null ");
                return false;
            }
            b d = d(this.e);
            if (d == this.f16705a) {
                kej.a("LinkedSplashCooperator", "shouldColdStartShow linked type= " + this.e.getLinkedDataType() + ", callback is null.");
                this.k.put(this.e.getLinkedDataType(), d);
            }
            boolean c = d.c(this.e);
            if (c) {
                com.taobao.bootimage.linked.ext.a.a(this.e, true);
            } else {
                this.e = null;
            }
            kej.a("LinkedSplashCooperator", "shouldColdStartShow, data = " + this.e + ",   shouldShow = " + c);
            return c;
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "shouldColdStartShow", th);
            return false;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            d(this.e).b();
            this.h = z;
            kej.a("LinkedSplashCooperator", "shown, currentSplashData = " + this.e);
            a(this.e, z);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "shown", th);
        }
    }

    public boolean a(b.a aVar) {
        LinkedSplashData linkedSplashData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = d(this.e).a(aVar);
            kej.a("LinkedSplashCooperator", "shouldAnimate=" + a2 + ", currentSplashData = " + this.e);
            if (b.a.FROM_CLOSE.equals(aVar.f16704a) && (linkedSplashData = this.e) != null) {
                JSONObject b = linkedSplashData.getSplashJson().b();
                ket.a(b);
                com.taobao.bootimage.linked.ext.b.a(b, this.h);
            }
            return a2;
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "shouldAnimate", th);
            return false;
        }
    }

    public void c(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f89e32", new Object[]{this, linkedSplashData});
        } else {
            this.e = linkedSplashData;
        }
    }

    private void a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6aa624", new Object[]{this, linkedSplashData, new Boolean(z)});
        } else if (linkedSplashData == null) {
        } else {
            i splashJson = linkedSplashData.getSplashJson();
            JSONObject d = z ? splashJson.d() : splashJson.a();
            ket.a(d, z);
            ket.a(d);
            com.taobao.bootimage.linked.ext.b.a(d, z);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            this.f = true;
            d(this.e).c();
            kej.a("LinkedSplashCooperator", "animationStart, currentSplashData = " + this.e);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData == null) {
                return;
            }
            JSONObject c = linkedSplashData.getSplashJson().c();
            ket.a(c);
            com.taobao.bootimage.linked.ext.b.a(c, this.h);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "animationStart", th);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.g = true;
            d(this.e).d();
            kej.a("LinkedSplashCooperator", "animationEnd, currentSplashData = " + this.e);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "animationEnd", th);
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            kej.a("LinkedSplashCooperator", "interactLayerExposure, currentSplashData = " + this.e + ";type=" + i);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData == null) {
                return;
            }
            JSONObject e = linkedSplashData.getSplashJson().e();
            ket.a(e);
            HashMap hashMap = new HashMap();
            hashMap.put("__INTERACT_TYPE__", String.valueOf(i));
            com.taobao.bootimage.linked.ext.b.a(e, z, hashMap);
            if (9 != i || e(this.e) == null) {
                return;
            }
            e(this.e).b();
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "interactExposure", th);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            kej.a("LinkedSplashCooperator", "interactExposure, currentSplashData = " + this.e);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData == null) {
                return;
            }
            JSONObject f = linkedSplashData.getSplashJson().f();
            ket.a(f);
            com.taobao.bootimage.linked.ext.b.a(f, z);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "interactExposure", th);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            kej.a("LinkedSplashCooperator", "interactExposure, currentSplashData = " + this.e);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData == null) {
                return;
            }
            JSONObject c = linkedSplashData.getSplashJson().c();
            ket.a(c);
            com.taobao.bootimage.linked.ext.b.a(c, z);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "interactExposure", th);
        }
    }

    public void b(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            kej.a("LinkedSplashCooperator", "bigPopEndExposure, currentSplashData = " + this.e + ";type=" + i);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData == null) {
                return;
            }
            JSONObject g = linkedSplashData.getSplashJson().g();
            ket.a(g);
            HashMap hashMap = new HashMap();
            hashMap.put("__INTERACT_TYPE__", String.valueOf(i));
            com.taobao.bootimage.linked.ext.b.a(g, z, hashMap);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "bigPopEnd", th);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData != null && TextUtils.equals(com.taobao.mmad.data.b.TYPE_BANNER, linkedSplashData.getLinkedDataType())) {
                kej.a("LinkedSplashCooperator", "terminate, enter topview compat = " + this.e);
                if (!this.f) {
                    kej.a("LinkedSplashCooperator", "terminate, trigger animationStart for topview");
                    e();
                }
                if (!this.g) {
                    kej.a("LinkedSplashCooperator", "terminate, trigger animationEnd for topview");
                    f();
                }
            }
            d(this.e).e();
            kej.a("LinkedSplashCooperator", "terminate, currentSplashData = " + this.e);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "terminate", th);
        }
    }

    private b d(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("49d30fff", new Object[]{this, linkedSplashData});
        }
        if (linkedSplashData == null) {
            kej.a("LinkedSplashCooperator", "peekCallback, currentSplashData is null, this cooperator has been terminated");
            return this.f16705a;
        }
        String linkedDataType = linkedSplashData.getLinkedDataType();
        kej.a("LinkedSplashCooperator", "peekCallback, linkedDataType " + linkedDataType);
        if (TextUtils.isEmpty(linkedDataType)) {
            kej.a("LinkedSplashCooperator", "wtf!!!, peekCallback, linkedSplashType is empty");
            return this.f16705a;
        }
        b bVar = this.b.get(linkedDataType);
        if (bVar != null) {
            return bVar;
        }
        kej.a("LinkedSplashCooperator", "wtf!!!, peekCallback, callback not found, type = " + linkedDataType);
        return this.f16705a;
    }

    /* loaded from: classes6.dex */
    public static final class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1135609701);
            kge.a(924978914);
        }

        @Override // com.taobao.bootimage.linked.b
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "_EmptyCallback_";
        }

        private a() {
        }

        @Override // com.taobao.bootimage.linked.b
        public void a(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
                return;
            }
            kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onReceiveData" + linkedSplashData);
        }

        @Override // com.taobao.bootimage.linked.b
        public boolean b(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue();
            }
            kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.shouldShow" + linkedSplashData);
            return true;
        }

        @Override // com.taobao.bootimage.linked.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onShown");
            }
        }

        @Override // com.taobao.bootimage.linked.b
        public boolean a(b.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
            }
            kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.shouldAnimate");
            return false;
        }

        @Override // com.taobao.bootimage.linked.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onAnimationStart");
            }
        }

        @Override // com.taobao.bootimage.linked.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onAnimationEnd");
            }
        }

        @Override // com.taobao.bootimage.linked.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onTerminate");
            }
        }

        @Override // com.taobao.bootimage.linked.b
        public boolean c(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95f89e36", new Object[]{this, linkedSplashData})).booleanValue();
            }
            kej.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onTerminate");
            return true;
        }
    }

    public List<com.taobao.bootimage.linked.a> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.c;
    }

    public void a(kdz kdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e51cf7", new Object[]{this, kdzVar});
            return;
        }
        try {
            if (this.j == null || kdzVar == null || TextUtils.isEmpty(kdzVar.a())) {
                return;
            }
            kej.a("LinkedSplashCooperator", "addInteractCallback, callback = " + kdzVar);
            this.j.put(kdzVar.a(), kdzVar);
        } catch (Throwable th) {
            kej.a("LinkedSplashCooperator", "addInteractCallback, error = " + th.getMessage());
            th.printStackTrace();
        }
    }

    private kdz e(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdz) ipChange.ipc$dispatch("34191431", new Object[]{this, linkedSplashData});
        }
        if (linkedSplashData != null) {
            try {
                if (this.j != null) {
                    String linkedDataType = linkedSplashData.getLinkedDataType();
                    kej.a("LinkedSplashCooperator", "peekInteractCallback, linkedDataType " + linkedDataType);
                    if (TextUtils.isEmpty(linkedDataType)) {
                        kej.a("LinkedSplashCooperator", "wtf!!!, peekInteractCallback, linkedSplashType is empty");
                        return null;
                    }
                    kdz kdzVar = this.j.get(linkedDataType);
                    if (kdzVar != null) {
                        return kdzVar;
                    }
                    kej.a("LinkedSplashCooperator", "wtf!!!, peekInteractCallback, callback not found, type = " + linkedDataType);
                    return null;
                }
            } catch (Throwable th) {
                kej.a("LinkedSplashCooperator", "peekInteractCallback, error = " + th.getMessage());
                th.printStackTrace();
                return null;
            }
        }
        kej.a("LinkedSplashCooperator", "peekCallback, currentSplashData or interactCallbackMap is null, this cooperator has been terminated");
        return null;
    }
}
