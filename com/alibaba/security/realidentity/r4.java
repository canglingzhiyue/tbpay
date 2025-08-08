package com.alibaba.security.realidentity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABImageResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.DazzleCollectDataConfig;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.dynamic.model.WukongConfig;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.plugin.wukong.entity.WukongUploadData;
import com.alibaba.security.realidentity.service.media.audio.RPMediaPlayManager;
import com.alibaba.security.realidentity.service.sensor.model.SensorInfo;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsgPage;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.entity.DazzleCollectDataUIConfigItem;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alibaba.security.realidentity.y4;
import com.alibaba.security.realidentity.z2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public class r4 implements i0, t4, u4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K = "ALBiometricsPresenter";
    public static final String L = "https://cdnrefresh.ctdidcii.cn/w1/WHClient_H5/Install/InstallGuide.html";
    public static final int M = 1010;
    public static final int N = 12;
    public static final int O = 40;
    public static final long P = 500;
    public SensorInfo A;
    public SensorInfo B;
    public final RPMediaPlayManager C;
    public r3 E;
    public t2 F;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f3491a;
    public z2 b;
    public q c;
    public RPBizConfig d;
    public boolean e;
    public n4 f;
    public int i;
    public ABDetectType j;
    public int k;
    public String l;
    public List<DazzleCollectDataUIConfigItem> m;
    public ALBiometricsResult n;
    public boolean o;
    public String p;
    public int q;
    public long r;
    public boolean s;
    public x4 t;
    public SurfaceTexture u;
    public ALBiometricsActivityParentView v;
    public y4 w;
    public List<Integer> x;
    public a0 y;
    public s3 z;
    public int g = 0;
    public int h = 0;
    public final ALBiometricsActivityParentView.d G = new c();
    public final GLSurfaceView.Renderer H = new d();
    public final q4 I = new e();
    public final View.OnClickListener J = new f();
    public final s4 D = new s4();

    /* loaded from: classes3.dex */
    public class a implements p4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.alibaba.security.realidentity.r4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0123a implements q2 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0123a() {
            }

            @Override // com.alibaba.security.realidentity.q2
            public void a(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                    return;
                }
                r4.a(r4.this, str);
                r4.a(r4.this, i);
                r4 r4Var = r4.this;
                r4.a(r4Var, r4.g(r4Var));
            }
        }

        public a() {
        }

        @Override // com.alibaba.security.realidentity.p4
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                r4.b(r4.this, "开始录制炫彩视频");
            }
        }

        @Override // com.alibaba.security.realidentity.p4
        public void a(DazzleCollectDataUIConfigItem dazzleCollectDataUIConfigItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba3f9368", new Object[]{this, dazzleCollectDataUIConfigItem});
            }
        }

        @Override // com.alibaba.security.realidentity.p4
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            r4 r4Var = r4.this;
            r4.a(r4Var, new SensorInfo(r4.e(r4Var).b(), r4.e(r4.this).c()));
            r4.a(r4.this, false);
            r4.a(r4.this, new C0123a(), false, "停止录制并保存炫彩视频-炫彩闪屏结束");
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (r4.i(r4.this) == null) {
            } else {
                r4.i(r4.this).f();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements GLSurfaceView.Renderer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public class a implements SurfaceTexture.OnFrameAvailableListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
                } else {
                    r4.o(r4.this).l();
                }
            }
        }

        public d() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d186971d", new Object[]{this, gl10});
            } else {
                r4.i(r4.this).onDrawFrame(gl10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("893091d9", new Object[]{this, gl10, new Integer(i), new Integer(i2)});
            } else {
                r4.i(r4.this).onSurfaceChanged(gl10, i, i2);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2ea8368", new Object[]{this, gl10, eGLConfig});
                return;
            }
            r4.i(r4.this).onSurfaceCreated(gl10, eGLConfig);
            r4 r4Var = r4.this;
            r4.a(r4Var, r4.i(r4Var).e());
            r4.b(r4.this).a(r4.n(r4.this));
            r4.n(r4.this).setOnFrameAvailableListener(new a());
        }
    }

    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (r4.w(r4.this) != null && !r4.w(r4.this).getRpConfig().getBiometricsConfig().isShouldAlertOnExit()) {
                z = false;
            }
            r4.this.a(z);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements y4.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.alibaba.security.realidentity.y4.d
        public void a(Dialog dialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
            } else {
                dialog.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements y4.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.alibaba.security.realidentity.y4.e
        public void a(Dialog dialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                return;
            }
            if (dialog != null) {
                dialog.dismiss();
            }
            r4.a(r4.this);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3504a;

        public k(boolean z) {
            this.f3504a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!r4.b(r4.this).d()) {
            } else {
                r4.d(r4.this, this.f3504a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r4.c(r4.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r4.d(r4.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements q2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ALBiometricsResult f3507a;

        public n(ALBiometricsResult aLBiometricsResult) {
            this.f3507a = aLBiometricsResult;
        }

        @Override // com.alibaba.security.realidentity.q2
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            ALBiometricsResult aLBiometricsResult = this.f3507a;
            aLBiometricsResult.successfulVideoPath = str;
            r4.a(r4.this, aLBiometricsResult);
        }
    }

    /* loaded from: classes3.dex */
    public class o implements q2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ALBiometricsResult f3508a;
        public final /* synthetic */ Bundle b;

        public o(ALBiometricsResult aLBiometricsResult, Bundle bundle) {
            this.f3508a = aLBiometricsResult;
            this.b = bundle;
        }

        @Override // com.alibaba.security.realidentity.q2
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            this.f3508a.failedVideoPath = str;
            r4.a(r4.this, this.b.getInt(u.b), this.b);
        }
    }

    public r4(Activity activity) {
        this.f3491a = activity;
        this.C = new RPMediaPlayManager(activity, this);
    }

    public static /* synthetic */ int A(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb125863", new Object[]{r4Var})).intValue() : r4Var.g;
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : e0.a(this.d.getBiometricsType());
    }

    private boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (B()) {
            return false;
        }
        return this.d.getBiometricsConfig().needSuccessVideo || this.d.getBiometricsConfig().needFailVideo;
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : v() == 0;
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        n4 n4Var = this.f;
        if (n4Var == null) {
            return;
        }
        n4Var.j();
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            b(e2.i, "CameraPermissionComponent ERROR_DEVICE_CAMERA_NO_PERMISSION", (String) null);
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            c(false);
        }
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        b(v());
        I();
        u();
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        if (this.d.getBiometricsConfig().bioSteps != null) {
            this.x = new ArrayList(this.d.getBiometricsConfig().bioSteps);
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        if (!this.x.isEmpty()) {
            return;
        }
        this.x.add(1);
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        int i2 = this.g + 1;
        this.g = i2;
        if (i2 > 5) {
            a(e2.s, "retryThreshold");
            return;
        }
        com.alibaba.security.realidentity.o.b().a(20, (Map<String, Object>) null);
        M();
        c(true);
        o();
        S();
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (B()) {
            this.d.getBiometricsConfig().timeOut = 12;
        } else {
            this.d.getBiometricsConfig().timeOut = 40;
        }
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        String string = this.f3491a.getResources().getString(R.string.face_detect_action_mirror);
        ALBiometricsActivityParentView aLBiometricsActivityParentView = this.v;
        if (aLBiometricsActivityParentView == null) {
            return;
        }
        aLBiometricsActivityParentView.a(string);
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        } else {
            this.C.c();
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else {
            this.E.f();
        }
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else {
            R();
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        U();
        q qVar = this.c;
        if (qVar == null) {
            return;
        }
        qVar.d();
    }

    private void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else {
            this.C.e();
        }
    }

    private void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else {
            this.E.g();
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
        } else {
            V();
        }
    }

    public static /* synthetic */ void a(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3403090", new Object[]{r4Var});
        } else {
            r4Var.H();
        }
    }

    public static /* synthetic */ z2 b(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z2) ipChange.ipc$dispatch("2958ba17", new Object[]{r4Var}) : r4Var.b;
    }

    private int c(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i2)})).intValue() : (i2 < 4000 || i2 >= 5000) ? i2 : e2.y;
    }

    public static /* synthetic */ void c(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc30e12", new Object[]{r4Var});
        } else {
            r4Var.G();
        }
    }

    public static /* synthetic */ void d(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53047cd3", new Object[]{r4Var});
        } else {
            r4Var.F();
        }
    }

    public static /* synthetic */ s3 e(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s3) ipChange.ipc$dispatch("c332d18c", new Object[]{r4Var}) : r4Var.z;
    }

    public static /* synthetic */ int f(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d875a48", new Object[]{r4Var})).intValue() : r4Var.h;
    }

    public static /* synthetic */ ALBiometricsResult g(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ALBiometricsResult) ipChange.ipc$dispatch("9b11e68b", new Object[]{r4Var}) : r4Var.n;
    }

    public static /* synthetic */ int h(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80a37ca", new Object[]{r4Var})).intValue();
        }
        int i2 = r4Var.h;
        r4Var.h = i2 + 1;
        return i2;
    }

    public static /* synthetic */ x4 i(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x4) ipChange.ipc$dispatch("3b007bec", new Object[]{r4Var}) : r4Var.t;
    }

    public static /* synthetic */ boolean j(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b28d155d", new Object[]{r4Var})).booleanValue() : r4Var.e;
    }

    public static /* synthetic */ boolean k(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97ce841e", new Object[]{r4Var})).booleanValue() : r4Var.B();
    }

    public static /* synthetic */ void l(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0ff2db", new Object[]{r4Var});
        } else {
            r4Var.P();
        }
    }

    public static /* synthetic */ ABDetectType m(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABDetectType) ipChange.ipc$dispatch("ebbbe3df", new Object[]{r4Var}) : r4Var.j;
    }

    public static /* synthetic */ SurfaceTexture n(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("9675469c", new Object[]{r4Var}) : r4Var.u;
    }

    public static /* synthetic */ ALBiometricsActivityParentView o(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ALBiometricsActivityParentView) ipChange.ipc$dispatch("430d53cf", new Object[]{r4Var}) : r4Var.v;
    }

    public static /* synthetic */ void p(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1215addf", new Object[]{r4Var});
        } else {
            r4Var.N();
        }
    }

    public static /* synthetic */ void q(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7571ca0", new Object[]{r4Var});
        } else {
            r4Var.u();
        }
    }

    public static /* synthetic */ Activity r(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("41a7e5e7", new Object[]{r4Var}) : r4Var.f3491a;
    }

    public static /* synthetic */ void s(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d9fa22", new Object[]{r4Var});
        } else {
            r4Var.E();
        }
    }

    public static /* synthetic */ n4 t(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n4) ipChange.ipc$dispatch("c475b6f7", new Object[]{r4Var}) : r4Var.f;
    }

    public static /* synthetic */ void u(r4 r4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5cd7a4", new Object[]{r4Var});
        } else {
            r4Var.q();
        }
    }

    public static /* synthetic */ String v(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8bea4db", new Object[]{r4Var}) : r4Var.x();
    }

    public static /* synthetic */ RPBizConfig w(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("c092ffd4", new Object[]{r4Var}) : r4Var.d;
    }

    public static /* synthetic */ int x(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c2123da", new Object[]{r4Var})).intValue() : r4Var.i;
    }

    public static /* synthetic */ q y(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("3aa6ed6d", new Object[]{r4Var}) : r4Var.c;
    }

    public static /* synthetic */ t2 z(r4 r4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t2) ipChange.ipc$dispatch("f82a3079", new Object[]{r4Var}) : r4Var.F;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        this.e = false;
        this.g = 0;
        j(false);
        ALBiometricsActivityParentView aLBiometricsActivityParentView = this.v;
        if (aLBiometricsActivityParentView != null) {
            aLBiometricsActivityParentView.i();
        }
        q qVar = this.c;
        if (qVar != null) {
            qVar.d();
        }
        t2 t2Var = this.F;
        if (t2Var != null) {
            t2Var.release();
        }
        y4 y4Var = this.w;
        if (y4Var != null && y4Var.b()) {
            this.w.a();
        }
        ALBiometricsActivityParentView aLBiometricsActivityParentView2 = this.v;
        if (aLBiometricsActivityParentView2 != null) {
            aLBiometricsActivityParentView2.a(new b());
        }
        n4 n4Var = this.f;
        if (n4Var != null) {
            n4Var.a(this.k);
        }
        s3 s3Var = this.z;
        if (s3Var != null) {
            s3Var.d();
        }
        this.C.b();
        return true;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        V();
        int i2 = this.i;
        if (i2 != 0 && i2 != 6 && i2 != 7 && i2 != 8) {
            a(e2.t, "onPause");
        }
        return true;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        ALBiometricsActivityParentView aLBiometricsActivityParentView = this.v;
        if (aLBiometricsActivityParentView != null) {
            aLBiometricsActivityParentView.k();
        }
        R();
        return true;
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            this.g = 0;
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
        } else {
            j(true);
        }
    }

    @Override // com.alibaba.security.realidentity.i0
    public void a(ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464d2639", new Object[]{this, aBImageResult});
        }
    }

    @Override // com.alibaba.security.realidentity.i0
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.u4
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.u4
    public RPEventListener h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPEventListener) ipChange.ipc$dispatch("6c891b35", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.i0
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    /* loaded from: classes3.dex */
    public class e implements q4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.security.realidentity.q4
        public void a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (i2 == 0) {
                a(i, true, i3);
            } else if (i2 != 1) {
            } else {
                a(i, false, i3);
            }
        }

        private void a(int i, boolean z, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2621338a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
                return;
            }
            if (i != 10002 && i != 10004) {
                if (i != 10005) {
                    if (i != 10009) {
                        if (i != 10010) {
                            if (i == 10012) {
                                if (z) {
                                    com.alibaba.security.realidentity.l.f(r4.r(r4.this));
                                }
                                r4.q(r4.this);
                                r4.c(r4.this, i2);
                                return;
                            } else if (i != 10013) {
                                switch (i) {
                                    case 20002:
                                    case 20003:
                                        break;
                                    case 20004:
                                        if (!z) {
                                            return;
                                        }
                                        if (r4.o(r4.this) != null) {
                                            r4.o(r4.this).e();
                                        }
                                        r4.p(r4.this);
                                        return;
                                    case 20005:
                                    case 20007:
                                        if (!z) {
                                            return;
                                        }
                                        r4.p(r4.this);
                                        return;
                                    case 20006:
                                        break;
                                    case 20008:
                                        if (!z) {
                                            return;
                                        }
                                        r4.q(r4.this);
                                        r4.s(r4.this);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                }
                r4.q(r4.this);
                r4.c(r4.this, i2);
                return;
            }
            if (z) {
                r4.p(r4.this);
                return;
            }
            r4.q(r4.this);
            r4.c(r4.this, i2);
        }

        @Override // com.alibaba.security.realidentity.q4
        public void a(k0 k0Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56be3b17", new Object[]{this, k0Var, str});
            } else if (r4.t(r4.this) == null) {
            } else {
                r4.t(r4.this).a(k0Var, str, r4.v(r4.this));
            }
        }

        @Override // com.alibaba.security.realidentity.q4
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            try {
                r4.r(r4.this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(r4.L)));
                hashMap.put("isSuccess", Boolean.TRUE);
                hashMap.put("errorMsg", "");
            } catch (Exception e) {
                hashMap.put("isSuccess", Boolean.FALSE);
                hashMap.put("errorMsg", e.getMessage());
            }
            r4.a(r4.this, TrackLog.createCtidVisitLog(com.alibaba.security.realidentity.b.b(hashMap)));
        }
    }

    /* loaded from: classes3.dex */
    public class i implements s2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3502a;

        public i(String str) {
            this.f3502a = str;
        }

        @Override // com.alibaba.security.realidentity.s2
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                r4.a(r4.this, TrackLog.createWukongInitLog(true, "", this.f3502a));
            }
        }

        @Override // com.alibaba.security.realidentity.s2
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                r4.a(r4.this, TrackLog.createWukongInitLog(false, str2, this.f3502a));
            }
        }

        @Override // com.alibaba.security.realidentity.s2
        public void a(String str, boolean z, boolean z2, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2852237c", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2});
                return;
            }
            com.alibaba.security.realidentity.a.a(r4.K, "Wukong detect result: pid: " + str + ", isSuccess: " + z + ", isRisk: " + z2 + ", errorMsg: " + str2);
        }
    }

    private boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        y4 y4Var = this.w;
        return y4Var != null && y4Var.b();
    }

    public static /* synthetic */ void a(r4 r4Var, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43835bd", new Object[]{r4Var, trackLog});
        } else {
            r4Var.a(trackLog);
        }
    }

    public static /* synthetic */ int b(r4 r4Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87b2bdc5", new Object[]{r4Var, new Integer(i2)})).intValue();
        }
        r4Var.h = i2;
        return i2;
    }

    public static /* synthetic */ void c(r4 r4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1b975c", new Object[]{r4Var, str});
        } else {
            r4Var.a(str);
        }
    }

    public static /* synthetic */ void d(r4 r4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bd061", new Object[]{r4Var, new Boolean(z)});
        } else {
            r4Var.b(z);
        }
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        int b2 = this.D.b(this.f3491a, this.d);
        if (b2 != 0) {
            b(b2, "preCheck", (String) null);
        } else if (this.d.getBiometricsConfig().reachBusinessRetryLimit) {
            a(e2.s, "reachBusinessRetryLimit");
        } else {
            int i2 = this.d.getCtidConfig() == null ? -2 : this.d.getCtidConfig().ctidCode;
            if (i2 != -2 && i2 != 0) {
                a(i2, "Error on CTID auth, code: " + i2);
            } else if (this.s) {
                a("view");
                this.v.b(this.d.getBiometricsConfig().userName);
            } else {
                this.b.a(new j(z));
                SurfaceTexture surfaceTexture = this.u;
                if (surfaceTexture != null) {
                    this.b.a(surfaceTexture);
                }
                this.v.b(new k(z));
            }
        }
    }

    private void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.security.realidentity.e.a(this.f3491a, 255);
        this.x.remove((Object) 1);
        this.d.setBiometricsType(1);
        f(z);
    }

    private void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.x.size() == 1 && this.x.contains(2)) {
            this.d.getBiometricsConfig().actionCount = 0;
            this.d.getBiometricsConfig().stepAdjust = true;
            this.x.add(0, 1);
        }
        if (this.x.indexOf(2) == 0 && this.l != null) {
            i(z);
        } else {
            g(z);
        }
    }

    private void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        this.x.remove((Object) 2);
        if (this.l == null) {
            com.alibaba.security.realidentity.a.b(K, "mDazzleBizConfig is null");
            return;
        }
        this.v.e();
        com.alibaba.security.realidentity.e.a(this.f3491a, 255);
        List<DazzleCollectDataUIConfigItem> a2 = com.alibaba.security.realidentity.b.a(this.l, DazzleCollectDataUIConfigItem.class);
        if (a2 == null) {
            com.alibaba.security.realidentity.a.b(K, "mDazzleBizConfig is not json:\n" + this.l);
            return;
        }
        for (DazzleCollectDataUIConfigItem dazzleCollectDataUIConfigItem : a2) {
            dazzleCollectDataUIConfigItem.setTitle(this.f3491a.getResources().getString(R.string.rp_dazzle_detecting));
        }
        this.m = a2;
        this.d.setBiometricsType(2);
        O();
        f(z);
        d(false);
    }

    private void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        T();
        if (this.b.d()) {
            p();
            this.b.f();
        }
        this.e = false;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        WukongConfig wukongConfig = this.d.getWukongConfig();
        if (wukongConfig == null) {
            return;
        }
        String str = wukongConfig.pid;
        this.F.a(str, new i(str));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!com.alibaba.security.realidentity.k.a(this.f3491a, com.taobao.speech.util.e.CAMERA)) {
            Activity activity = this.f3491a;
            com.alibaba.security.realidentity.k.a(activity, new String[]{com.taobao.speech.util.e.CAMERA}, 1010, activity.getResources().getString(R.string.rp_camera_auth_request_explain), new l(), new m());
        } else {
            c(false);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            n();
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        z2 z2Var = this.b;
        if (z2Var == null) {
            return;
        }
        a(TrackLog.createFinishCameraParametersLog(z2Var.g()));
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        z2 z2Var = this.b;
        if (z2Var == null) {
            return;
        }
        a(TrackLog.createStartCameraParametersLog(z2Var.h()));
    }

    private DazzleCollectDataUIConfigItem r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DazzleCollectDataUIConfigItem) ipChange.ipc$dispatch("bfa40d79", new Object[]{this});
        }
        DazzleCollectDataUIConfigItem dazzleCollectDataUIConfigItem = new DazzleCollectDataUIConfigItem();
        dazzleCollectDataUIConfigItem.setTitle(this.f3491a.getResources().getString(R.string.rp_dazzle_detecting));
        dazzleCollectDataUIConfigItem.screenLight = 1.0f;
        dazzleCollectDataUIConfigItem.color = "#FFFFFF";
        dazzleCollectDataUIConfigItem.textColor = "#333333";
        dazzleCollectDataUIConfigItem.duration = 1.0f;
        return dazzleCollectDataUIConfigItem;
    }

    private LastExitTrackMsg s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LastExitTrackMsg) ipChange.ipc$dispatch("54d12b8", new Object[]{this});
        }
        if (this.v == null) {
            return null;
        }
        LastExitTrackMsg lastExitTrackMsg = new LastExitTrackMsg();
        lastExitTrackMsg.page = LastExitTrackMsgPage.BIO.getMsg();
        lastExitTrackMsg.view = this.v.getCurrentShowView();
        lastExitTrackMsg.params = com.alibaba.security.realidentity.b.a((Object) t());
        return lastExitTrackMsg;
    }

    private String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("step", Integer.valueOf(this.i));
        hashMap.put("errorCode", Integer.valueOf(this.k));
        hashMap.put("retryCounts", Integer.valueOf(this.g));
        return com.alibaba.security.realidentity.b.a((Object) hashMap);
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.i = 8;
        Activity activity = this.f3491a;
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
        }
        ALBiometricsActivityParentView aLBiometricsActivityParentView = this.v;
        if (aLBiometricsActivityParentView != null && aLBiometricsActivityParentView.h()) {
            return this.v.getDetectResultErrorCode();
        }
        return -1;
    }

    private String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.E.b();
    }

    private String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        byte[] c2 = r.a().c(w());
        if (c2 == null) {
            return null;
        }
        o();
        return com.alibaba.security.realidentity.c.a(c2);
    }

    private String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        WukongUploadData wukongUploadData = new WukongUploadData();
        WukongConfig wukongConfig = this.d.getWukongConfig();
        if (wukongConfig == null) {
            return null;
        }
        wukongUploadData.pid = wukongConfig.pid;
        byte[] c2 = r.a().c(com.alibaba.security.realidentity.b.a(wukongUploadData));
        if (c2 != null) {
            return com.alibaba.security.realidentity.c.a(c2);
        }
        return null;
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.E = new r3(this.f3491a, this.d, this);
        }
    }

    @Override // com.alibaba.security.realidentity.i0
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!C()) {
        } else {
            d("开始录制活体视频");
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.E.a();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ALBiometricsActivityParentView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView.d
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            r4.b(r4.this, false);
            r4.c(r4.this, z ? "startClick" : "autoDismiss");
            r4.c(r4.this, false);
        }

        @Override // com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!r4.j(r4.this) || r4.k(r4.this)) {
            } else {
                if (r4.x(r4.this) == 3) {
                    r4.l(r4.this);
                } else if (r4.x(r4.this) != 4) {
                } else {
                    r4 r4Var = r4.this;
                    r4.a(r4Var, r4.m(r4Var));
                }
            }
        }
    }

    public static /* synthetic */ void a(r4 r4Var, ALBiometricsResult aLBiometricsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686a5775", new Object[]{r4Var, aLBiometricsResult});
        } else {
            r4Var.b(aLBiometricsResult);
        }
    }

    public static /* synthetic */ void b(r4 r4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a5f6db", new Object[]{r4Var, str});
        } else {
            r4Var.d(str);
        }
    }

    public static /* synthetic */ void c(r4 r4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9f6702", new Object[]{r4Var, new Boolean(z)});
        } else {
            r4Var.c(z);
        }
    }

    public static /* synthetic */ int d(r4 r4Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8b9083", new Object[]{r4Var, new Integer(i2)})).intValue();
        }
        r4Var.i = i2;
        return i2;
    }

    public static /* synthetic */ void a(r4 r4Var, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a7dd81", new Object[]{r4Var, new Integer(i2), bundle});
        } else {
            r4Var.d(i2, bundle);
        }
    }

    public static /* synthetic */ boolean b(r4 r4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b2fda7", new Object[]{r4Var, new Boolean(z)})).booleanValue();
        }
        r4Var.s = z;
        return z;
    }

    public static /* synthetic */ void c(r4 r4Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9f2731", new Object[]{r4Var, new Integer(i2)});
        } else {
            r4Var.b(i2);
        }
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        List<DazzleCollectDataUIConfigItem> list = this.m;
        if (list == null || this.o) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, r());
        if (z) {
            this.g++;
        }
        if (this.g > 5) {
            a(e2.s, "dazzle retryThreshold");
            return;
        }
        a(TrackLog.startShowDazzleView(com.alibaba.security.realidentity.b.a(this.m), com.alibaba.security.realidentity.b.a(arrayList), "开始炫彩闪屏"));
        this.o = true;
        U();
        this.c.a(12);
        this.A = new SensorInfo(this.z.b(), this.z.c());
        this.v.a(arrayList, new a());
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        q qVar = new q(this.f3491a, this.d, this, this);
        this.c = qVar;
        if (z) {
            qVar.e();
        } else {
            qVar.f();
        }
    }

    public static /* synthetic */ SensorInfo a(r4 r4Var, SensorInfo sensorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorInfo) ipChange.ipc$dispatch("75845a9a", new Object[]{r4Var, sensorInfo});
        }
        r4Var.B = sensorInfo;
        return sensorInfo;
    }

    private String c(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 18 || StringUtils.isEmpty(str) || (a2 = com.alibaba.security.realidentity.c.a(str)) == null) {
            return null;
        }
        String a3 = r.a().a(a2);
        if (!StringUtils.isEmpty(a3)) {
            return a3;
        }
        return null;
    }

    public void b(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6a38c0", new Object[]{this, aLBiometricsActivityParentView});
            return;
        }
        this.v = aLBiometricsActivityParentView;
        a(aLBiometricsActivityParentView);
        m();
    }

    /* loaded from: classes3.dex */
    public class j implements z2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3503a;

        public j(boolean z) {
            this.f3503a = z;
        }

        @Override // com.alibaba.security.realidentity.z2.a
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            r4.b(r4.this, 0);
            r4.a(r4.this, i, str);
            r4.u(r4.this);
        }

        @Override // com.alibaba.security.realidentity.z2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            r4.b(r4.this, 0);
            r4.d(r4.this, this.f3503a);
            r4.u(r4.this);
        }

        @Override // com.alibaba.security.realidentity.z2.a
        public void a(byte[] bArr, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ecb514", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (r4.x(r4.this) == 1) {
                r4.d(r4.this, 2);
            }
            if (r4.y(r4.this) != null) {
                r4.y(r4.this).a(bArr, i, i2, i3);
                if (r4.z(r4.this) != null) {
                    r4.z(r4.this).a(bArr, i, i2, i3, r4.f(r4.this), r4.f(r4.this), r4.A(r4.this));
                }
            }
            r4.h(r4.this);
        }
    }

    public static /* synthetic */ boolean a(r4 r4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c69448", new Object[]{r4Var, new Boolean(z)})).booleanValue();
        }
        r4Var.o = z;
        return z;
    }

    @Override // com.alibaba.security.realidentity.t4
    public ABDetectType g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABDetectType) ipChange.ipc$dispatch("5eacc0b1", new Object[]{this}) : this.j;
    }

    public static /* synthetic */ String a(r4 r4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5449dd86", new Object[]{r4Var, str});
        }
        r4Var.p = str;
        return str;
    }

    public static /* synthetic */ int a(r4 r4Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c65466", new Object[]{r4Var, new Integer(i2)})).intValue();
        }
        r4Var.q = i2;
        return i2;
    }

    public static /* synthetic */ void a(r4 r4Var, q2 q2Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb84c85", new Object[]{r4Var, q2Var, new Boolean(z), str});
        } else {
            r4Var.a(q2Var, z, str);
        }
    }

    public void b(int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88798c4e", new Object[]{this, new Integer(i2), str, str2});
            return;
        }
        e("活体认证结束:" + i2 + ":" + str);
        this.e = false;
        if (i2 == 0) {
            this.i = 7;
        } else {
            this.i = 6;
        }
        j(true);
        this.k = c(i2);
        if (this.g > 5 && (i2 == -10204 || i2 == -10205)) {
            i2 = e2.s;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("algoResult", com.alibaba.security.realidentity.b.a(this.y));
        hashMap.put("errorCode", Integer.valueOf(i2));
        hashMap.put("errorMsg", str);
        com.alibaba.security.realidentity.o.b().a(19, (Map<String, Object>) hashMap);
        this.v.a(i2, str2, com.alibaba.security.realidentity.o.b().a());
        W();
    }

    public static /* synthetic */ void a(r4 r4Var, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da8677d", new Object[]{r4Var, new Integer(i2), str});
        } else {
            r4Var.a(i2, str);
        }
    }

    public static /* synthetic */ void a(r4 r4Var, ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a70043", new Object[]{r4Var, aBDetectType});
        } else {
            r4Var.a(aBDetectType);
        }
    }

    public static /* synthetic */ SurfaceTexture a(r4 r4Var, SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTexture) ipChange.ipc$dispatch("a2ffdfe", new Object[]{r4Var, surfaceTexture});
        }
        r4Var.u = surfaceTexture;
        return surfaceTexture;
    }

    public boolean a(Activity activity, RPBizConfig rPBizConfig, n4 n4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3328d2c6", new Object[]{this, activity, rPBizConfig, n4Var})).booleanValue();
        }
        this.f = n4Var;
        this.d = rPBizConfig;
        y2 y2Var = new y2(activity, rPBizConfig);
        this.b = y2Var;
        this.t = new x4(activity, y2Var, rPBizConfig);
        this.i = 0;
        this.k = e2.f3386a;
        this.s = rPBizConfig.getBiometricsConfig().stepNav;
        this.F = new u2(this.d.getDegradeConfig().isWukongEnabled);
        O();
        M();
        this.l = this.x.contains(2) ? c(this.d.getBiometricsConfig().bizConf) : null;
        s3 s3Var = new s3(activity);
        this.z = s3Var;
        s3Var.b((y3) null);
        this.C.a();
        z();
        l();
        return true;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!com.alibaba.security.realidentity.k.a(this.f3491a, com.taobao.speech.util.e.CAMERA)) {
        } else {
            e(z);
        }
    }

    @Override // com.alibaba.security.realidentity.i0
    public void c(int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd8575b", new Object[]{this, new Integer(i2), bundle});
            return;
        }
        ALBiometricsResult aLBiometricsResult = (ALBiometricsResult) bundle.getSerializable(u.f3525a);
        this.k = i2;
        this.n = aLBiometricsResult;
        if (i2 == 0) {
            com.alibaba.security.realidentity.o.b().a(18, this.y);
            if (C()) {
                a((q2) new n(aLBiometricsResult), false, "算法检测成功,停止录制活体视频");
            } else {
                b(aLBiometricsResult);
            }
        } else if (C()) {
            a((q2) new o(aLBiometricsResult, bundle), false, "算法检测失败，停止录制活体视频");
        } else {
            d(bundle.getInt(u.b), bundle);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        com.alibaba.security.realidentity.a.a(K, str);
        a(TrackLog.startRecordVideo(str, Log.getStackTraceString(new Throwable()), String.valueOf(this.b.j())));
        this.b.b();
    }

    @Override // com.alibaba.security.realidentity.t4
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.e;
    }

    private void d(int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5408a45c", new Object[]{this, new Integer(i2), bundle});
            return;
        }
        if (i2 == -10211 || i2 == -10210 || i2 == -10209) {
            com.alibaba.security.realidentity.e.a(this.f3491a, 255);
        }
        String string = bundle.getString(u.c, "");
        a(TrackLog.createBioMonitorExpLog(i2, string));
        a(i2, string);
    }

    private void a(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441567f", new Object[]{this, aLBiometricsActivityParentView});
            return;
        }
        aLBiometricsActivityParentView.setOnButtonClickListener(this.G);
        aLBiometricsActivityParentView.setOnCloseListener(this.J);
        aLBiometricsActivityParentView.setOnDetectActionResultListener(this.I);
        aLBiometricsActivityParentView.setRenderer(this.H);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.e) {
        } else {
            this.e = true;
            this.k = e2.f3386a;
            this.v.p();
            Point e2 = this.b.e();
            if (e2 == null) {
                com.alibaba.security.realidentity.a.b(K, "getCameraPreviewSize is null");
                return;
            }
            this.v.a(e2.x, e2.y);
            this.i = 1;
            com.alibaba.security.realidentity.o.b().a(2, this.b.i());
            h(z);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", str);
        a(TrackLog.createBioGuidePageLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (D()) {
            u();
            E();
        } else if (this.v.a()) {
            this.v.b();
        } else if (z) {
            if (B()) {
                e("弹出确认对话框（退出活体认证）");
            }
            if (this.w == null) {
                this.w = new y4.c(this.f3491a).a(this.f3491a.getResources().getString(R.string.face_dialog_exit_message)).a(true, false).a(this.f3491a.getResources().getString(R.string.face_dialog_exit_button_confirm), new h()).a(this.f3491a.getResources().getString(R.string.face_dialog_exit_button_cancel), new g()).a();
            }
            this.w.c();
        } else {
            H();
        }
    }

    private void c(ALBiometricsResult aLBiometricsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58278bdb", new Object[]{this, aLBiometricsResult});
            return;
        }
        this.i = 7;
        this.e = false;
        j(false);
        this.v.n();
        aLBiometricsResult.bh = com.alibaba.security.realidentity.o.b().a();
        n4 n4Var = this.f;
        if (n4Var == null) {
            return;
        }
        n4Var.a(aLBiometricsResult);
    }

    @Override // com.alibaba.security.realidentity.i0
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = 3;
        com.alibaba.security.realidentity.o.b().a(10, (Map<String, Object>) null);
        a(b("willAdjust"));
        P();
    }

    private TrackLog b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("481fefb0", new Object[]{this, str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("adjust");
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        trackLog.setParams(com.alibaba.security.realidentity.b.b(hashMap));
        return trackLog;
    }

    @Override // com.alibaba.security.realidentity.i0
    public void b(ABDetectType aBDetectType, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222136a", new Object[]{this, aBDetectType, new Integer(i2), new Integer(i3)});
            return;
        }
        this.i = 4;
        this.j = aBDetectType;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i2));
        hashMap.put("actionType", com.alibaba.security.realidentity.b.a(aBDetectType));
        com.alibaba.security.realidentity.o.b().a(12, (Map<String, Object>) hashMap);
        a(a(RVConstants.EXTRA_PREPARE_START_ACTION, aBDetectType.getValue(), i2));
        a(aBDetectType);
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (!this.o) {
        } else {
            a(TrackLog.stopShowDazzleView("停止炫彩闪屏", com.alibaba.security.realidentity.b.a(this.m)));
            this.o = false;
            if (this.b.j()) {
                a((q2) null, true, "停止录制并删除炫彩视频-" + str);
            }
            this.v.s();
        }
    }

    private void b(ALBiometricsResult aLBiometricsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1286493c", new Object[]{this, aLBiometricsResult});
        } else if (this.x.contains(1)) {
            g(false);
        } else if (this.x.contains(2) && this.l != null) {
            i(false);
        } else if (aLBiometricsResult == null) {
            com.alibaba.security.realidentity.a.b(K, "bio result is null");
        } else {
            aLBiometricsResult.dazzleVideoPath = this.p;
            aLBiometricsResult.setDazzleCollectRotate(this.q);
            aLBiometricsResult.addDazzleCollectConfigs(this.m);
            DazzleCollectDataConfig dazzleCollectDataConfig = aLBiometricsResult.dazzleDataConfigs;
            dazzleCollectDataConfig.lastSensorInfo = this.B;
            dazzleCollectDataConfig.firstSensorInfo = this.A;
            aLBiometricsResult.collectedData = x();
            aLBiometricsResult.wukongData = y();
            c(aLBiometricsResult);
        }
    }

    private void a(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str});
        } else {
            b(i2, str, (String) null);
        }
    }

    public void a(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{this, new Integer(i2), strArr, iArr});
        } else if (i2 != 1010) {
        } else {
            if ((iArr.length > 0 ? iArr[0] : -1) != 0) {
                F();
            } else {
                G();
            }
        }
    }

    private void a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e7836b", new Object[]{this, aBDetectType});
        } else if (aBDetectType == null || aBDetectType == ABDetectType.AIMLESS) {
        } else {
            this.C.b(aBDetectType);
            Q();
            ALBiometricsActivityParentView aLBiometricsActivityParentView = this.v;
            if (aLBiometricsActivityParentView == null) {
                return;
            }
            aLBiometricsActivityParentView.a(aBDetectType);
        }
    }

    private TrackLog a(String str, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("dd9e9531", new Object[]{this, str, new Integer(i2), new Integer(i3)});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("action");
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(i2));
        hashMap.put("index", Integer.valueOf(i3));
        hashMap.put("action", str);
        trackLog.setParams(com.alibaba.security.realidentity.b.b(hashMap));
        return trackLog;
    }

    private void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
            return;
        }
        RPTrack.a(s());
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i2));
        com.alibaba.security.realidentity.o.b().a(21, (Map<String, Object>) hashMap);
        if (this.f == null) {
            return;
        }
        this.f.a(i2, com.alibaba.security.realidentity.o.b().a(), x());
    }

    @Override // com.alibaba.security.realidentity.i0
    public void a(ABDetectType aBDetectType, int i2, int i3) {
        ALBiometricsActivityParentView aLBiometricsActivityParentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da22b50b", new Object[]{this, aBDetectType, new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i2));
        hashMap.put("actionType", com.alibaba.security.realidentity.b.a(aBDetectType));
        com.alibaba.security.realidentity.o.b().a(13, (Map<String, Object>) hashMap);
        a(a("finishAction", aBDetectType.getValue(), i2));
        if (aBDetectType == ABDetectType.AIMLESS || (aLBiometricsActivityParentView = this.v) == null) {
            return;
        }
        aLBiometricsActivityParentView.d();
    }

    @Override // com.alibaba.security.realidentity.i0
    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43f9bc4", new Object[]{this, zVar});
        } else if (zVar == null || this.v == null || !this.e) {
        } else {
            this.y = zVar.g();
            if (System.currentTimeMillis() - this.r < 500) {
                return;
            }
            this.r = System.currentTimeMillis();
            this.v.a(zVar.f());
            if (!zVar.f()) {
                this.v.a(1002);
            }
            if (B()) {
                if (A()) {
                    return;
                }
                if (zVar.f() && !this.o) {
                    d(true);
                }
                if (!zVar.f()) {
                    e("人脸不在框内");
                }
            }
            n4 n4Var = this.f;
            if (n4Var == null) {
                return;
            }
            n4Var.a(zVar.h(), zVar.e(), zVar.d());
        }
    }

    @Override // com.alibaba.security.realidentity.i0
    public void a(int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i2), bundle});
        } else if (!this.e || this.v == null) {
        } else {
            if (i2 == -10213 || i2 == -10214 || i2 == -10215 || i2 == -10219) {
                String str = "";
                if (bundle != null) {
                    str = bundle.getString(u.c, str);
                }
                a(TrackLog.createBioMonitorExpLog(i2, str));
            }
            if (B()) {
                return;
            }
            this.v.a(i2);
        }
    }

    private void a(q2 q2Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736bf3ad", new Object[]{this, q2Var, new Boolean(z), str});
            return;
        }
        a(TrackLog.stopRecordVideo(str, Log.getStackTraceString(new Throwable()), String.valueOf(this.b.j())));
        this.b.a(q2Var, z);
    }

    private void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            a(this.d.getBasicsConfig().verifyToken, trackLog);
        }
    }

    @Override // com.alibaba.security.realidentity.c4
    public void a(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
            return;
        }
        n4 n4Var = this.f;
        if (n4Var == null) {
            return;
        }
        n4Var.a(str, trackLog);
    }

    @Override // com.alibaba.security.realidentity.i0
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.security.realidentity.o.b().a(11, (Map<String, Object>) null);
        a(b("didAdjust"));
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 != 4) {
            return true;
        }
        RPBizConfig rPBizConfig = this.d;
        if (rPBizConfig != null && !rPBizConfig.getRpConfig().getBiometricsConfig().isShouldAlertOnExit()) {
            z = false;
        }
        a(z);
        return false;
    }
}
