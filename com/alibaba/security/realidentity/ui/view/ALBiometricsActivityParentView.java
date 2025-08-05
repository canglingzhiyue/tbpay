package com.alibaba.security.realidentity.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.p4;
import com.alibaba.security.realidentity.q4;
import com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity;
import com.alibaba.security.realidentity.ui.entity.DazzleCollectDataUIConfigItem;
import com.alibaba.security.realidentity.ui.widgets.CameraActivityWidgetParent;
import com.alibaba.security.realidentity.ui.widgets.DetectActionResultWidget;
import com.alibaba.security.realidentity.ui.widgets.DetectActionWidget;
import com.alibaba.security.realidentity.ui.widgets.GuideWidget;
import com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView;
import com.alibaba.security.realidentity.ui.widgets.TitleBarWidget;
import com.alibaba.security.realidentity.w;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes3.dex */
public class ALBiometricsActivityParentView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String k = "ALBiometricsActivityParentView";
    public static final long l = 350;
    public static final String m = "";
    public static final String n = "guide";
    public static final String o = "privacy";
    public static final String p = "bio";
    public static final String q = "result";

    /* renamed from: a  reason: collision with root package name */
    public View f3569a;
    public CameraActivityWidgetParent b;
    public TitleBarWidget c;
    public GuideWidget d;
    public DetectActionWidget e;
    public DetectActionResultWidget f;
    public BaseAlBioActivity g;
    public String h;
    public String i;
    public RPBizConfig j;

    /* loaded from: classes3.dex */
    public class a implements DetectActionWidget.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3570a;
        public final /* synthetic */ p4 b;
        public final /* synthetic */ List c;

        public a(int i, p4 p4Var, List list) {
            this.f3570a = i;
            this.b = p4Var;
            this.c = list;
        }

        @Override // com.alibaba.security.realidentity.ui.widgets.DetectActionWidget.b
        public DazzleCollectDataUIConfigItem a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DazzleCollectDataUIConfigItem) ipChange.ipc$dispatch("7697f29b", new Object[]{this, new Integer(i)});
            }
            if (i >= this.f3570a) {
                this.b.b();
                return null;
            }
            if (i == 1) {
                this.b.a();
            }
            DazzleCollectDataUIConfigItem dazzleCollectDataUIConfigItem = (DazzleCollectDataUIConfigItem) this.c.get(i);
            this.b.a(dazzleCollectDataUIConfigItem);
            return dazzleCollectDataUIConfigItem;
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
                return;
            }
            ALBiometricsActivityParentView.a(ALBiometricsActivityParentView.this);
            ALBiometricsActivityParentView.b(ALBiometricsActivityParentView.this);
            ALBiometricsActivityParentView.this.d();
            ALBiometricsActivityParentView.c(ALBiometricsActivityParentView.this).setVisibility(8);
            ALBiometricsActivityParentView.d(ALBiometricsActivityParentView.this).setVisibility(0);
            if (ALBiometricsActivityParentView.e(ALBiometricsActivityParentView.this) == null) {
                return;
            }
            ALBiometricsActivityParentView.e(ALBiometricsActivityParentView.this).setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements RPDetectCoreView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f3572a;

        public c(Runnable runnable) {
            this.f3572a = runnable;
        }

        @Override // com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f3572a.run();
            }
        }

        @Override // com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a();

        void a(boolean z);
    }

    public ALBiometricsActivityParentView(Context context, RPBizConfig rPBizConfig) {
        super(context);
        this.h = "";
        this.i = "";
        this.j = rPBizConfig;
        this.g = (BaseAlBioActivity) context;
        a(context);
    }

    public static /* synthetic */ void a(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441567f", new Object[]{aLBiometricsActivityParentView});
        } else {
            aLBiometricsActivityParentView.c();
        }
    }

    public static /* synthetic */ void b(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6a38c0", new Object[]{aLBiometricsActivityParentView});
        } else {
            aLBiometricsActivityParentView.r();
        }
    }

    public static /* synthetic */ DetectActionWidget c(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectActionWidget) ipChange.ipc$dispatch("25fcde5f", new Object[]{aLBiometricsActivityParentView}) : aLBiometricsActivityParentView.e;
    }

    public static /* synthetic */ DetectActionResultWidget d(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectActionResultWidget) ipChange.ipc$dispatch("eb4f1b03", new Object[]{aLBiometricsActivityParentView}) : aLBiometricsActivityParentView.f;
    }

    public static /* synthetic */ GuideWidget e(ALBiometricsActivityParentView aLBiometricsActivityParentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GuideWidget) ipChange.ipc$dispatch("a8d307d8", new Object[]{aLBiometricsActivityParentView}) : aLBiometricsActivityParentView.d;
    }

    public static /* synthetic */ Object ipc$super(ALBiometricsActivityParentView aLBiometricsActivityParentView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.setVisibility(0);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget != null) {
            detectActionResultWidget.b(new String[0]);
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget != null && !detectActionWidget.c(new String[0])) {
            this.e.a(new String[0]);
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget == null) {
            return;
        }
        titleBarWidget.setTitle(null);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget == null) {
            return;
        }
        titleBarWidget.a(new String[0]);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget == null) {
            return;
        }
        titleBarWidget.b(new String[0]);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.b = (CameraActivityWidgetParent) this.f3569a.findViewById(R.id.abfl_widget_camera);
        this.c = (TitleBarWidget) this.f3569a.findViewById(R.id.widget_title_bar);
        this.e = (DetectActionWidget) this.f3569a.findViewById(R.id.widget_abfl_detectaction);
        this.f = (DetectActionResultWidget) this.f3569a.findViewById(R.id.widget_abfl_detectactionresult);
        this.d = (GuideWidget) this.f3569a.findViewById(R.id.widget_abfl_guide);
        this.e.setActivity(this.g);
    }

    public String getCurrentShowView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c086a74", new Object[]{this}) : this.h;
    }

    public int getDetectResultErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30855e99", new Object[]{this})).intValue();
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget == null) {
            return 0;
        }
        return detectActionResultWidget.getDetectResultErrorCode();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : "result".equals(this.h);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent != null) {
            cameraActivityWidgetParent.a();
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget != null) {
            titleBarWidget.b();
        }
        GuideWidget guideWidget = this.d;
        if (guideWidget != null) {
            guideWidget.b();
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget != null) {
            detectActionWidget.b();
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget == null) {
            return;
        }
        detectActionResultWidget.b();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent != null) {
            cameraActivityWidgetParent.c();
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget != null) {
            titleBarWidget.e();
        }
        GuideWidget guideWidget = this.d;
        if (guideWidget != null) {
            guideWidget.e();
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget != null) {
            detectActionWidget.e();
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget == null) {
            return;
        }
        detectActionResultWidget.e();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.d();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null || detectActionWidget.getVisibility() != 0) {
            return;
        }
        this.e.m();
        r();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        r();
        m();
        o();
        this.i = this.h;
        this.h = p;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget != null) {
            detectActionResultWidget.g();
        }
        this.i = this.h;
        this.h = "result";
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.e.n();
        }
    }

    public void setOnButtonClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1bc447", new Object[]{this, dVar});
            return;
        }
        TitleBarWidget titleBarWidget = this.c;
        if (titleBarWidget != null) {
            titleBarWidget.setOnBioMainHandlerListener(dVar);
        }
        GuideWidget guideWidget = this.d;
        if (guideWidget != null) {
            guideWidget.setOnBioMainHandlerListener(dVar);
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.setOnBioMainHandlerListener(dVar);
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdc8587", new Object[]{this, onClickListener});
        } else {
            this.c.setOnCloseListener(onClickListener);
        }
    }

    public void setOnDetectActionResultListener(q4 q4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59f61f9", new Object[]{this, q4Var});
        } else {
            this.f.setOnDetectActionResultListener(q4Var);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f3255b", new Object[]{this, renderer});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.setRenderer(renderer);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f3569a = LayoutInflater.from(context).inflate(R.layout.rp_face_liveness_activity, this);
        g();
        this.h = "";
        this.i = "";
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.setVisibility(8);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        GuideWidget guideWidget = this.d;
        if (guideWidget != null) {
            guideWidget.a(str);
        }
        r();
        this.c.setTitle(getContext().getString(R.string.rp_guide_title));
        this.i = this.h;
        this.h = n;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.k();
        this.e.j();
        this.e.b();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        CameraActivityWidgetParent cameraActivityWidgetParent = this.b;
        if (cameraActivityWidgetParent == null) {
            return;
        }
        cameraActivityWidgetParent.a(runnable);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.a(z);
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.a(2.5f, 1.0f, 350L, new c(runnable));
    }

    public void a(List<DazzleCollectDataUIConfigItem> list, p4 p4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623881bf", new Object[]{this, list, p4Var});
        } else if (this.e == null || list == null || list.isEmpty()) {
        } else {
            r();
            this.e.a(list.get(0), new a(list.size(), p4Var, list), 0);
        }
    }

    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        DetectActionResultWidget detectActionResultWidget = this.f;
        if (detectActionResultWidget != null) {
            detectActionResultWidget.a(i, new b(), this.j, str2, str);
        }
        this.i = this.h;
        this.h = "result";
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.b == null) {
        } else {
            this.b.a(i, i2, this.e.getMaskCircleDisplayY());
        }
    }

    public void a(int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.e == null) {
        } else {
            Resources resources = getContext().getResources();
            if (i == -10219) {
                string = resources.getString(R.string.face_liveness_action_fail_tip_common);
            } else if (i == 1004) {
                string = resources.getString(R.string.face_detect_toast_too_shake);
            } else if (i == 1013) {
                string = resources.getString(R.string.face_detect_toast_pitch_angle_not_suitable);
            } else if (i == 1060) {
                string = resources.getString(R.string.face_liveness_env_too_bright);
            } else if (i == 1001) {
                string = resources.getString(R.string.face_detect_toast_too_dark);
            } else if (i == 1002) {
                string = resources.getString(R.string.face_detect_toast_not_in_region);
            } else {
                switch (i) {
                    case e2.S /* -10215 */:
                        string = resources.getString(R.string.face_liveness_action_fail_tip_occlusion);
                        break;
                    case e2.R /* -10214 */:
                        string = resources.getString(R.string.face_liveness_action_fail_tip_face_error);
                        break;
                    case e2.Q /* -10213 */:
                        string = resources.getString(R.string.face_liveness_action_fail_tip_action_wrong);
                        break;
                    default:
                        switch (i) {
                            case 1006:
                                string = resources.getString(R.string.face_detect_toast_no_dectect_action);
                                break;
                            case 1007:
                                string = resources.getString(R.string.face_detect_toast_too_close);
                                break;
                            case 1008:
                                string = resources.getString(R.string.face_detect_toast_too_far);
                                break;
                            default:
                                switch (i) {
                                    case 1053:
                                        string = resources.getString(R.string.face_detect_toast_action_too_small);
                                        break;
                                    case w.m /* 1054 */:
                                        string = resources.getString(R.string.face_detect_toast_raise_phone);
                                        break;
                                    case 1055:
                                        string = resources.getString(R.string.face_detect_toast_face_light);
                                        break;
                                    default:
                                        string = "";
                                        break;
                                }
                        }
                }
            }
            this.e.a(string);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.a(str, this.j);
    }

    public void a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e7836b", new Object[]{this, aBDetectType});
            return;
        }
        DetectActionWidget detectActionWidget = this.e;
        if (detectActionWidget == null) {
            return;
        }
        detectActionWidget.setVisibility(0);
        this.e.a(aBDetectType, this.j);
    }
}
