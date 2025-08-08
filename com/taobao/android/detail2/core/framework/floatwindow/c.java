package com.taobao.android.detail2.core.framework.floatwindow;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.floatwindow.permission.a;
import java.util.HashMap;
import java.util.Map;
import tb.fho;
import tb.fjb;
import tb.fjs;
import tb.fjt;
import tb.fkr;
import tb.fkt;
import tb.flb;
import tb.fld;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NewDetailVideoFloatManager";

    /* renamed from: a  reason: collision with root package name */
    private boolean f11551a;
    private b b;
    private Context c;
    private fmd d;
    private Runnable f;
    private boolean g;
    private flb h;
    private a.InterfaceC0461a i = new a.InterfaceC0461a() { // from class: com.taobao.android.detail2.core.framework.floatwindow.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.a.InterfaceC0461a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            fjt.a(c.TAG, "requestPermission onStartRequest");
            c.a(c.this, "float_request_permission");
        }

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.a.InterfaceC0461a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            fjt.a(c.TAG, "requestPermission onGranted");
            c.a(c.this, z ? "float_permission_request_granted" : "float_permission_has_granted");
            c.a(c.this);
        }

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.a.InterfaceC0461a
        public void b(boolean z) {
            fjb z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
                return;
            }
            fjt.a(c.TAG, "requestPermission onDenied");
            c.a(c.this, z ? "float_permission_request_denied" : "float_permission_timeout_denied");
            if (c.b(c.this) == null || (z2 = c.b(c.this).z()) == null || z2.a() == null) {
                return;
            }
            z2.a().i();
        }
    };
    private com.taobao.android.detail2.core.framework.floatwindow.permission.a e = new com.taobao.android.detail2.core.framework.floatwindow.permission.a();

    static {
        kge.a(952215710);
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f19b19", new Object[]{cVar});
        } else {
            cVar.k();
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4990a3", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb427adb", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.b(z);
        }
    }

    public static /* synthetic */ fmd b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("5bf14ff1", new Object[]{cVar}) : cVar.d;
    }

    public c(Context context, fmd fmdVar) {
        this.c = context;
        this.d = fmdVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f()) {
            c();
        } else {
            l();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Runnable runnable = this.f;
        if (runnable == null || this.g) {
            return;
        }
        this.g = true;
        if (z) {
            return;
        }
        runnable.run();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f == null || !this.g) {
        } else {
            try {
                l();
            } catch (Throwable th) {
                fjt.a(fjt.TAG_INSIDE_DETAIL, "未知异常，视频无法正常恢复。recoverVideo - recoverVideoForPending ", th);
            }
            this.g = false;
        }
    }

    public void a(boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
        } else {
            if (f()) {
                this.f = new Runnable() { // from class: com.taobao.android.detail2.core.framework.floatwindow.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            c.a(c.this, z2);
                        } catch (Throwable th) {
                            fjt.a(fjt.TAG_INSIDE_DETAIL, "未知异常。权限无法正常请求。onPause - requestFloatPermission ", th);
                        }
                    }
                };
            } else {
                b(z2);
            }
        }
    }

    private boolean f() {
        com.taobao.android.detail2.core.framework.data.model.d d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!g()) {
            return false;
        }
        fmd fmdVar = this.d;
        if (fmdVar != null && (d = fmdVar.d()) != null) {
            boolean a2 = fjs.a((Map<String, Object>) d.H(), fho.KEY_FEATURE_ENABLE_INSIDE_DETAIL);
            fjt.b(fjt.TAG_INSIDE_DETAIL, "enableInsideDetailPage: feature enableInsideDetail , enableInsideDetail is " + a2);
            return a2;
        }
        fjt.b(fjt.TAG_INSIDE_DETAIL, "enableInsideDetailPage: mDetailViewEngine is Null, enableInsideDetail is false.");
        return false;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        fkt i = i();
        if (i == null) {
            return false;
        }
        return i.af();
    }

    private fkr h() {
        com.taobao.android.detail2.core.framework.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkr) ipChange.ipc$dispatch("44e0280a", new Object[]{this});
        }
        fmd fmdVar = this.d;
        if (fmdVar != null && (a2 = fmdVar.a()) != null) {
            return a2.h();
        }
        return null;
    }

    private fkt i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkt) ipChange.ipc$dispatch("4c91cda7", new Object[]{this});
        }
        fkr h = h();
        if (h == null) {
            return null;
        }
        return h.b();
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        fjt.a(TAG, "requestPermissionAndShowFloatWindow " + this.f11551a);
        if (!this.f11551a) {
            fmd fmdVar = this.d;
            if (fmdVar == null || fmdVar.z() == null || this.d.z().a() == null || z) {
                return;
            }
            this.d.z().a().i();
            return;
        }
        a("float_check_permission");
        if (f()) {
            fjt.a(TAG, "requestPermissionAndShowFloatWindow mInsideDetail is True");
        } else {
            this.f11551a = false;
        }
        this.e.a(this.c, this.i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!f()) {
        } else {
            fjt.a(TAG, "requestPermissionAndShowFloatWindow mInsideDetail set False");
            this.f11551a = false;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.h = fld.a(this.d.z());
            Pair<Boolean, Map<String, String>> a2 = this.h.a();
            if (a2 == null) {
                return;
            }
            if (((Boolean) a2.first).booleanValue()) {
                this.b = new b(this.c, this.h);
                this.b.a();
                a("float_extract_video_success");
                return;
            }
            a("float_extract_video_fail", (Map) a2.second);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        flb flbVar = this.h;
        if (flbVar == null || !flbVar.b()) {
            return;
        }
        b bVar = this.b;
        if (bVar != null) {
            bVar.b();
            this.b.d();
        }
        this.h.c();
        this.b = null;
        a("float_recover_video");
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        fjt.b(TAG, "setCanShowMiniPlay canShowFloatVideo: " + z);
        this.f11551a = z;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f != null) {
            this.f = null;
        }
        b bVar = this.b;
        if (bVar != null) {
            bVar.e();
        }
        this.b = null;
        this.d = null;
        this.h = null;
        this.f11551a = false;
        this.c = null;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, (Map<String, String>) null);
        }
    }

    private void a(String str, Map<String, String> map) {
        com.taobao.android.detail2.core.framework.data.model.d d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        fmd fmdVar = this.d;
        if (fmdVar == null || (d = fmdVar.d()) == null || StringUtils.isEmpty(str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        this.d.y().a(d.g, str, "", "", map, d);
    }
}
