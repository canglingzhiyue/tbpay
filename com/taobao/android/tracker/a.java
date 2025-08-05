package com.taobao.android.tracker;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.f;
import com.taobao.android.tracker.util.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.jiu;
import tb.jiv;
import tb.jiw;
import tb.jiy;
import tb.jjh;
import tb.jji;
import tb.jjj;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f15573a;
    private jjj d;
    private jji e;
    private jiv b = null;
    private List<jjh> c = new ArrayList();
    private jiw f = new jiw() { // from class: com.taobao.android.tracker.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jiw
        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            } else if (message == null) {
            } else {
                int i = message.what;
                if (i == 1) {
                    a.a(a.this);
                } else if (i != 2) {
                } else {
                    a.b(a.this);
                }
            }
        }
    };
    private jiy g = new jiy() { // from class: com.taobao.android.tracker.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jiy
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a.a(a.this, 2, null);
            }
        }
    };
    private com.ut.mini.internal.a h = new com.ut.mini.internal.a() { // from class: com.taobao.android.tracker.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.mini.internal.a
        public boolean isExposureView(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
            }
            try {
                jjh a2 = a.a(a.this, view);
                if (a2 == null) {
                    return false;
                }
                return a2.isExposureView(str, view);
            } catch (Exception e) {
                e.printStackTrace();
                jiu.a("catch_crash", "DynamicTracker.isExposureView", "-999", e.getMessage());
                return false;
            }
        }

        @Override // com.ut.mini.internal.a
        public com.ut.mini.internal.b getExposureViewTag(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.ut.mini.internal.b) ipChange.ipc$dispatch("5d54bfd6", new Object[]{this, str, view});
            }
            try {
                jjh a2 = a.a(a.this, view);
                if (a2 == null) {
                    return null;
                }
                return a2.getExposureViewTag(str, view);
            } catch (Exception e) {
                jiu.a("catch_crash", "DynamicTracker.getExposureViewTag", "-999", e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.ut.mini.internal.a
        public Map<String, String> getExposureViewProperties(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
            }
            try {
                jjh a2 = a.a(a.this, view);
                if (a2 == null) {
                    return null;
                }
                return a2.getExposureViewProperties(str, view);
            } catch (Exception e) {
                e.printStackTrace();
                jiu.a("catch_crash", "DynamicTracker.getExposureViewProperties", "-999", e.getMessage());
                return null;
            }
        }
    };

    static {
        kge.a(827232355);
    }

    public static /* synthetic */ jjh a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jjh) ipChange.ipc$dispatch("dd96c4ec", new Object[]{aVar, view}) : aVar.a(view);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69955a0", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ void a(a aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52474e7f", new Object[]{aVar, new Integer(i), obj});
        } else {
            aVar.a(i, obj);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d721561", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("661d6da6", new Object[0]);
        }
        if (f15573a == null) {
            f15573a = new a();
        }
        return f15573a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f.a();
        f.a("DynamicTracker::init");
        e();
        f();
        a(1, (Object) null);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = new jjj();
        this.c.add(this.d);
        this.e = new jji();
        this.c.add(this.e);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        f.a("DynamicTracker::initThread");
        this.b = new jiv(Looper.getMainLooper());
        this.b.a(this.f);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        h();
        i();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        f.a("DynamicTracker::initConfig");
        if (this.c == null) {
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a(this.g);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        f.a("DynamicTracker::checkUTIntercept");
        if (c()) {
            j();
        } else {
            k();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        f.a("DynamicTracker::registerUTIntercept");
        com.ut.mini.internal.f fVar = com.ut.mini.internal.f.getInstance();
        if (fVar == null) {
            return;
        }
        fVar.registerExposureViewHandler(this.h);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        f.a("DynamicTracker::unRegisterUTIntercept");
        com.ut.mini.internal.f fVar = com.ut.mini.internal.f.getInstance();
        if (fVar == null) {
            return;
        }
        fVar.unRegisterExposureViewHandler(this.h);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            i();
        }
    }

    public boolean c() {
        jjh jjhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<jjh> list = this.c;
        if (list == null || list.size() == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.c.size() && ((jjhVar = this.c.get(i)) == null || !((z = z | jjhVar.a()))); i++) {
        }
        return z;
    }

    public jjj d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jjj) ipChange.ipc$dispatch("261b5f51", new Object[]{this}) : this.d;
    }

    private void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        jiv jivVar = this.b;
        if (jivVar == null) {
            return;
        }
        jivVar.a(i, obj);
    }

    public void a(String str, Message message) {
        jjj jjjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30dff085", new Object[]{this, str, message});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1385554566) {
                if (hashCode == 1000227998 && str.equals("action_weex_uninit")) {
                    c = 1;
                }
            } else if (str.equals("weex_update_page_config")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1 || (jjjVar = this.d) == null) {
                    return;
                }
                jjjVar.a(message);
                return;
            }
            jjj jjjVar2 = this.d;
            if (jjjVar2 == null) {
                return;
            }
            jjjVar2.b(message);
        }
    }

    private jjh a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjh) ipChange.ipc$dispatch("396f71b4", new Object[]{this, view});
        }
        if (view != null && i.b(view) != null) {
            return this.d;
        }
        return null;
    }
}
