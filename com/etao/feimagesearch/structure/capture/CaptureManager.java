package com.etao.feimagesearch.structure.capture;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.cot;
import tb.cpe;
import tb.cqe;
import tb.ctg;
import tb.cth;
import tb.jqt;
import tb.kge;

/* loaded from: classes3.dex */
public class CaptureManager implements ctg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean n;
    private volatile ExecutorService G;
    private cqe S;
    private jqt T;
    private boolean Y;

    /* renamed from: a  reason: collision with root package name */
    private b f6984a;
    private Size aa;
    private Size ab;
    private d b;
    private g d;
    private i e;
    private f f;
    private h g;
    private ViewGroup h;
    private boolean m;
    private final Set<cth> i = new HashSet(2);
    private int j = 1;
    private String k = "";
    private volatile boolean l = false;
    private volatile boolean o = true;
    private Boolean c = null;
    private Boolean p = null;
    private boolean r = false;
    private a s = null;
    private RealtimeModelLoadListener t = null;
    private final List<ctg> u = new ArrayList(5);
    private boolean F = false;
    private volatile boolean v = false;
    private Boolean q = null;
    private Integer w = null;
    private Boolean x = null;
    private boolean A = false;
    private Boolean z = null;
    private Boolean B = null;
    private Boolean R = null;
    private Boolean C = null;
    private String D = null;
    private Long E = null;
    private Boolean H = null;
    private Boolean y = null;
    private Boolean I = null;
    private Boolean U = null;
    private final com.etao.feimagesearch.album.a J = new com.etao.feimagesearch.album.a();
    private final com.etao.feimagesearch.capture.dynamic.bottom.album.g L = new com.etao.feimagesearch.capture.dynamic.bottom.album.g();
    private Boolean M = null;
    private boolean N = false;
    private c O = null;
    private Float P = null;
    private Boolean V = null;
    private Boolean ac = null;
    private Boolean K = null;
    private boolean W = false;
    private boolean X = false;
    private boolean Z = false;
    public com.etao.feimagesearch.mnn.autodetect.d Q = new com.etao.feimagesearch.mnn.autodetect.d();
    private Boolean ad = null;
    private Boolean ae = null;
    private Boolean af = null;

    /* loaded from: classes3.dex */
    public interface RealtimeModelLoadListener {

        /* loaded from: classes3.dex */
        public enum LoadState {
            BUILD_SUCCESS,
            BUILD_FAILED,
            DESTROYED
        }

        void a(LoadState loadState);
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, boolean z);
    }

    public static /* synthetic */ g a(CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7d1b6bd4", new Object[]{captureManager}) : captureManager.d;
    }

    public static /* synthetic */ ViewGroup b(CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6d0b9fb8", new Object[]{captureManager}) : captureManager.h;
    }

    static {
        kge.a(478211419);
        kge.a(1206774849);
        n = true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.v;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.p == null) {
            this.p = Boolean.valueOf(com.etao.feimagesearch.config.b.aE());
        }
        return this.p.booleanValue();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.c = Boolean.valueOf(com.etao.feimagesearch.config.b.cC());
        }
        return this.c.booleanValue();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.o && k();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g gVar = this.d;
        if (gVar == null) {
            return;
        }
        gVar.a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        g gVar = this.d;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        g gVar = this.d;
        if (gVar == null) {
            return;
        }
        gVar.e();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cot.c("CaptureManager", "releaseObjectDetector");
        g gVar = this.d;
        if (gVar == null) {
            return;
        }
        this.A = false;
        this.h.removeView(gVar.d());
        this.d.c();
        this.d = null;
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9e4042", new Object[]{this, iVar});
        } else if (iVar == null) {
        } else {
            this.e = iVar;
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.h = viewGroup;
        }
    }

    public void a(Context context) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (p() == 2 || this.d != null || (iVar = this.e) == null) {
        } else {
            this.d = iVar.a(context);
            ad.c("addView", new ac() { // from class: com.etao.feimagesearch.structure.capture.CaptureManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (CaptureManager.a(CaptureManager.this) == null) {
                    } else {
                        CaptureManager.b(CaptureManager.this).addView(CaptureManager.a(CaptureManager.this).d());
                    }
                }
            });
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.r = z;
        if (this.d == null || !this.p.booleanValue()) {
            return;
        }
        a(this.j, z);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.r;
    }

    public g i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("aa04aa42", new Object[]{this}) : this.d;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.q == null) {
            this.q = Boolean.valueOf(com.etao.feimagesearch.config.b.cb());
        }
        return this.q.booleanValue();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        if (this.w == null) {
            this.w = Integer.valueOf(com.etao.feimagesearch.config.b.aA());
        }
        return this.w.intValue();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (this.x == null) {
            if (n) {
                this.x = Boolean.valueOf(com.etao.feimagesearch.config.b.ea());
            } else {
                this.x = true;
            }
        }
        return this.x.booleanValue();
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
        }
        if (this.H == null) {
            this.H = Boolean.valueOf(com.etao.feimagesearch.config.b.bp());
        }
        return this.H.booleanValue();
    }

    public b n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("caf9d302", new Object[]{this}) : this.f6984a;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9b11a9", new Object[]{this, bVar});
        } else {
            this.f6984a = bVar;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.j;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        a(this.j, this.r);
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.k;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public d r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b2245abc", new Object[]{this}) : this.b;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9bfa67", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        if (this.M == null) {
            this.M = Boolean.valueOf(com.etao.feimagesearch.config.b.be());
        }
        return this.M.booleanValue();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (this.ac == null) {
            this.ac = Boolean.valueOf(com.etao.feimagesearch.config.b.ap());
        }
        return this.ac.booleanValue();
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9b8608", new Object[]{this, cVar});
        } else if (this.N) {
            cVar.a();
        } else {
            this.O = cVar;
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        this.N = true;
        c cVar = this.O;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    public Set<cth> s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("161251e9", new Object[]{this}) : this.i;
    }

    public void a(cth cthVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e417a161", new Object[]{this, cthVar});
        } else {
            this.i.add(cthVar);
        }
    }

    public void b(cth cthVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29aa7e2", new Object[]{this, cthVar});
        } else {
            this.i.remove(cthVar);
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        if (this.z == null) {
            this.z = Boolean.valueOf(com.etao.feimagesearch.config.b.dP());
        }
        return this.z.booleanValue();
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (this.B == null) {
            this.B = Boolean.valueOf(com.etao.feimagesearch.config.b.cH());
        }
        return this.B.booleanValue();
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue();
        }
        if (this.R == null) {
            this.R = Boolean.valueOf(com.etao.feimagesearch.config.b.ba());
        }
        return this.R.booleanValue();
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        if (this.C == null) {
            this.C = Boolean.valueOf(com.etao.feimagesearch.config.b.cR());
        }
        return this.C.booleanValue();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        if (this.U == null) {
            this.U = Boolean.valueOf(com.etao.feimagesearch.config.b.ca());
        }
        return this.U.booleanValue();
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        if (this.K == null) {
            this.K = Boolean.valueOf(com.etao.feimagesearch.config.b.Q());
        }
        return this.K.booleanValue();
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        if (this.D == null) {
            this.D = com.etao.feimagesearch.config.b.dX();
        }
        return this.D;
    }

    public long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eff1c1", new Object[]{this})).longValue();
        }
        if (this.E == null) {
            this.E = Long.valueOf(com.etao.feimagesearch.config.b.ec());
        }
        return this.E.longValue();
    }

    public float M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529644", new Object[]{this})).floatValue();
        }
        if (this.P == null) {
            this.P = Float.valueOf(com.etao.feimagesearch.config.b.Y());
        }
        return this.P.floatValue();
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        if (this.V == null) {
            this.V = Boolean.valueOf(com.etao.feimagesearch.config.b.cm());
        }
        return this.V.booleanValue();
    }

    public synchronized boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        } else if (this.l) {
            return false;
        } else {
            this.l = true;
            return true;
        }
    }

    public synchronized void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.l = false;
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.m;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b5cec1", new Object[]{this, aVar});
        } else {
            this.s = aVar;
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            this.s = null;
        }
    }

    private void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.nn.f.Companion.a().a(i);
        a aVar = this.s;
        if (aVar == null) {
            return;
        }
        aVar.a(i, z);
    }

    public void a(ctg ctgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4172d02", new Object[]{this, ctgVar});
        } else {
            this.u.add(ctgVar);
        }
    }

    public void b(ctg ctgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a3383", new Object[]{this, ctgVar});
        } else {
            this.u.remove(ctgVar);
        }
    }

    public com.etao.feimagesearch.album.a B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.album.a) ipChange.ipc$dispatch("f19cd6aa", new Object[]{this}) : this.J;
    }

    public void a(RealtimeModelLoadListener realtimeModelLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb3668a", new Object[]{this, realtimeModelLoadListener});
        } else {
            this.t = realtimeModelLoadListener;
        }
    }

    public void a(RealtimeModelLoadListener.LoadState loadState) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b148e323", new Object[]{this, loadState});
            return;
        }
        if (loadState != RealtimeModelLoadListener.LoadState.BUILD_SUCCESS) {
            z = false;
        }
        this.A = z;
        RealtimeModelLoadListener realtimeModelLoadListener = this.t;
        if (realtimeModelLoadListener == null) {
            return;
        }
        realtimeModelLoadListener.a(loadState);
    }

    @Override // tb.ctg
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (ctg ctgVar : this.u) {
            ctgVar.e();
        }
    }

    public h y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("46aec851", new Object[]{this}) : this.g;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9dcbe3", new Object[]{this, hVar});
        } else {
            this.g = hVar;
        }
    }

    public f z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("807969f2", new Object[]{this}) : this.f;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9ce325", new Object[]{this, fVar});
        } else {
            this.f = fVar;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar = this.d;
        if (gVar == null || i != 3) {
            return;
        }
        gVar.e();
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.X;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.W = true;
        if (!z) {
            return;
        }
        this.X = true;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.Z;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        this.Y = true;
        this.Z = z;
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        this.X = false;
        this.W = false;
        this.Y = false;
        this.Z = false;
    }

    public Size R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Size) ipChange.ipc$dispatch("8495419c", new Object[]{this}) : this.aa;
    }

    public void a(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c5f8eb", new Object[]{this, size});
        } else {
            this.aa = size;
        }
    }

    public void b(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c787ca", new Object[]{this, size});
        } else {
            this.ab = this.aa;
        }
    }

    public cqe S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqe) ipChange.ipc$dispatch("a34c4f15", new Object[]{this}) : this.S;
    }

    public void a(cqe cqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ebfdc1", new Object[]{this, cqeVar});
        } else {
            this.S = cqeVar;
        }
    }

    public Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{this, runnable});
        }
        if (this.F) {
            return null;
        }
        if (this.G == null) {
            this.G = new ThreadPoolExecutor(3, 5, 4L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.etao.feimagesearch.structure.capture.CaptureManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f6985a = 0;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2});
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("plt_capture_");
                    int i = this.f6985a;
                    this.f6985a = i + 1;
                    sb.append(i);
                    Thread thread = new Thread(runnable2, sb.toString());
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
        return this.G.submit(runnable);
    }

    public jqt T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqt) ipChange.ipc$dispatch("ab0124de", new Object[]{this}) : this.T;
    }

    public void a(jqt jqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe4bbab", new Object[]{this, jqtVar});
        } else {
            this.T = jqtVar;
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        cot.c("CaptureManager", MessageID.onDestroy);
        this.F = true;
        if (this.G != null) {
            this.G.shutdownNow();
        }
        this.L.a();
    }

    public Map<String, String> a(com.etao.feimagesearch.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac25a23f", new Object[]{this, bVar});
        }
        HashMap hashMap = new HashMap();
        com.etao.feimagesearch.mnn.autodetect.d dVar = this.Q;
        if (dVar != null) {
            Map<String, String> a2 = dVar.a(this.X, this.W, this.Y, this.Z, true);
            if (!a2.isEmpty()) {
                hashMap.putAll(a2);
            }
        }
        hashMap.put("isreshoot", String.valueOf(bVar.isFromNoFrontRetake(true)));
        hashMap.put("lst_unvalid", cpe.e());
        return hashMap;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.ad;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.ad = Boolean.valueOf(com.etao.feimagesearch.config.b.L());
        return this.ad.booleanValue();
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.ae;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.ae = Boolean.valueOf(com.etao.feimagesearch.config.b.dU());
        return this.ae.booleanValue();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.af;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.af = Boolean.valueOf(com.etao.feimagesearch.config.b.bU());
        return this.af.booleanValue();
    }
}
