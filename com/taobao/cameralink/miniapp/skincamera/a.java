package com.taobao.cameralink.miniapp.skincamera;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.acennr.downloader.TaskCallBack;
import com.taobao.android.tb3dspace.arskindetect.SkinDetectJni;
import com.taobao.android.tb3dspace.arskindetect.SkinDetectSurfaceView;
import com.taobao.android.tb3dspace.arskindetect.adapter.IJsEventSender;
import com.taobao.android.tb3dspace.util.CameraUtil;
import com.taobao.android.xr_resource.downloader.XRAceDownloader;
import com.taobao.android.xrappos.data.XRImage;
import com.taobao.cameralink.manager.Utils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16901a = "";
    private String b = "";
    private Map<String, String> c = new HashMap();
    private SkinDetectSurfaceView d;
    private XRImage e;
    private XRImage f;
    private volatile SkinDetectJni g;
    private Handler h;
    private Activity i;
    private IJsEventSender j;
    private com.taobao.cameralink.miniapp.skincamera.biz.a k;
    private IEmbedView l;
    private boolean m;

    static {
        kge.a(2071814750);
    }

    public static /* synthetic */ SkinDetectJni a(a aVar, SkinDetectJni skinDetectJni) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinDetectJni) ipChange.ipc$dispatch("17f8aecd", new Object[]{aVar, skinDetectJni});
        }
        aVar.g = skinDetectJni;
        return skinDetectJni;
    }

    public static /* synthetic */ XRImage a(a aVar, XRImage xRImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("f176eab", new Object[]{aVar, xRImage});
        }
        aVar.e = xRImage;
        return xRImage;
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("412b8bf", new Object[]{aVar}) : aVar.f16901a;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b9f275", new Object[]{aVar, str});
        }
        aVar.f16901a = str;
        return str;
    }

    public static /* synthetic */ String a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8866aab", new Object[]{aVar, str, str2}) : aVar.a(str, str2);
    }

    public static /* synthetic */ XRImage b(a aVar, XRImage xRImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("a3367eca", new Object[]{aVar, xRImage});
        }
        aVar.f = xRImage;
        return xRImage;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e4240de", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b950d4", new Object[]{aVar, str});
        }
        aVar.b = str;
        return str;
    }

    public static /* synthetic */ SkinDetectJni c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinDetectJni) ipChange.ipc$dispatch("f4291d52", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ XRImage d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XRImage) ipChange.ipc$dispatch("a10c91a2", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ XRImage e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XRImage) ipChange.ipc$dispatch("8a1456a3", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ Map f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("514f6fbb", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ IJsEventSender g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IJsEventSender) ipChange.ipc$dispatch("5c88a91e", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ com.taobao.cameralink.miniapp.skincamera.biz.a h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.cameralink.miniapp.skincamera.biz.a) ipChange.ipc$dispatch("7394a963", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21dae09", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ Handler j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ec69c67c", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ SkinDetectSurfaceView k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinDetectSurfaceView) ipChange.ipc$dispatch("eda519ad", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ Activity l(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("66f9e1c", new Object[]{aVar}) : aVar.i;
    }

    public a(ViewGroup viewGroup, Activity activity, IJsEventSender iJsEventSender, com.taobao.cameralink.miniapp.skincamera.biz.a aVar) {
        this.c.put("hasFace", "has_face");
        this.c.put("facePercent", "face_percent_state");
        this.c.put("pitch", "face_pitch_state");
        this.c.put("yaw", "face_yaw_state");
        this.c.put("roll", "face_roll_state");
        this.c.put("light", "face_light_state");
        this.c.put("left", "face_left_state");
        this.c.put("right", "face_right_state");
        this.h = new Handler(Looper.getMainLooper());
        this.i = activity;
        this.d = new SkinDetectSurfaceView(activity);
        a(viewGroup, activity);
        this.j = iJsEventSender;
        this.k = aVar;
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ARTry", 19999, "FrontSkinDetectImpl", "", null, null).build());
        } catch (Throwable unused) {
        }
    }

    public void a(IEmbedView iEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8db0252", new Object[]{this, iEmbedView});
        } else {
            this.l = iEmbedView;
        }
    }

    private void a(ViewGroup viewGroup, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813bd0b9", new Object[]{this, viewGroup, activity});
            return;
        }
        this.d = new SkinDetectSurfaceView(activity);
        viewGroup.addView((View) this.d, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        f();
        this.g = new SkinDetectJni();
        this.g.updateCameraState(true);
        this.d.onPreviewDataCallBack(new SkinDetectSurfaceView.OnPreviewDataCallBack() { // from class: com.taobao.cameralink.miniapp.skincamera.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onPreviewData(byte[] bArr, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("514371a1", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                } else if (TextUtils.isEmpty(a.a(a.this)) || TextUtils.isEmpty(a.b(a.this)) || a.c(a.this) == null) {
                } else {
                    if (a.d(a.this) == null) {
                        a.c(a.this).init(a.a(a.this), a.b(a.this));
                        a.a(a.this, new XRImage(i, i2, XRImage.Config.YUV_NV21));
                    }
                    if (a.e(a.this) == null) {
                        a.b(a.this, new XRImage(i2, i, XRImage.Config.RGB));
                    }
                    a.d(a.this).updateImage(bArr);
                    String str = "onPreviewData: data " + bArr + "width " + i + "height" + i2;
                    XRImage.convertYuvToRGBAndRotateClockWise90(a.d(a.this), a.e(a.this), true);
                    boolean process = a.c(a.this).process(a.e(a.this));
                    String resultJsonString = a.c(a.this).getResultJsonString(a.f(a.this));
                    if (a.g(a.this) != null) {
                        a.g(a.this).sendEvent("ARSkinAnalysis.frameDetected", JSONObject.parseObject(resultJsonString));
                    }
                    if (a.h(a.this) != null) {
                        a.h(a.this).a("ARSkinAnalysis.frameDetected", JSONObject.parseObject(resultJsonString));
                    }
                    if (!process) {
                        return;
                    }
                    a.j(a.this).postDelayed(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.i(a.this);
                            }
                        }
                    }, 1000L);
                }
            }
        });
    }

    public SkinDetectSurfaceView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinDetectSurfaceView) ipChange.ipc$dispatch("2f1f3c0a", new Object[]{this}) : this.d;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d.getCameraSession() == null || this.d.getCameraSession().getCamera() == null || this.m) {
        } else {
            this.m = true;
            this.d.getCameraSession().takePhoto($$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(byte[] bArr, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b560a346", new Object[]{bArr, camera});
            return;
        }
        String str = Utils.getDefaultUploadFileName() + ".jpg";
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB1.24GsRr0gK0jSZFnXXbRRXXa.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.skincamera.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onProgress(int i, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                }
            }

            public void onSuccess(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                    return;
                }
                a aVar = a.this;
                a.a(aVar, a.a(aVar, str, str.substring(0, str.lastIndexOf(".")) + "_detection"));
            }

            public void onFailed(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                    return;
                }
                String str2 = "onFailed: i " + i + " s " + str;
            }
        });
        XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB17JtDsNv1gK0jSZFFXXb0sXXa.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.skincamera.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onFailed(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                }
            }

            public void onProgress(int i, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                }
            }

            public void onSuccess(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                    return;
                }
                a aVar = a.this;
                a.b(aVar, a.a(aVar, str, str.substring(0, str.lastIndexOf(".")) + "_points"));
                String str2 = "onSuccess: points_bin_path " + str;
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SkinDetectSurfaceView skinDetectSurfaceView = this.d;
        if (skinDetectSurfaceView == null) {
            return;
        }
        skinDetectSurfaceView.pauseSkinDetect();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.h.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Camera.Size bestPreviewSize = CameraUtil.getBestPreviewSize(a.k(a.this).getCameraSession().getCamera(), (int) SecExceptionCode.SEC_ERROR_MALDETECT, 600);
                    float f = bestPreviewSize.height / bestPreviewSize.width;
                    a aVar = a.this;
                    a.k(a.this).setLayoutParams(aVar.a(a.l(aVar), f));
                }
            });
        }
    }

    public FrameLayout.LayoutParams a(Activity activity, float f) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("84a37e8f", new Object[]{this, activity, new Float(f)});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        int[] screenSize = com.taobao.android.xrappos.utils.Utils.getScreenSize(activity);
        float f2 = (screenSize[0] / screenSize[1]) - f;
        if (f2 > 0.01f) {
            i = screenSize[0];
            i2 = (int) (screenSize[0] / f);
        } else if (f2 < -0.01f) {
            i = (int) (screenSize[1] * f);
            i2 = screenSize[1];
        } else {
            i = screenSize[0];
            i2 = screenSize[1];
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.leftMargin = (-(i - screenSize[0])) / 2;
        layoutParams.topMargin = (-(i2 - screenSize[1])) / 2;
        return layoutParams;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SkinDetectSurfaceView skinDetectSurfaceView = this.d;
        if (skinDetectSurfaceView == null) {
            return;
        }
        skinDetectSurfaceView.onPreviewDataCallBack((SkinDetectSurfaceView.OnPreviewDataCallBack) null);
        this.d.getCameraSession().postOnCameraHandler(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (a.c(a.this) != null) {
                    a.c(a.this).destroy();
                    a.a(a.this, (SkinDetectJni) null);
                }
                if (a.d(a.this) != null) {
                    a.d(a.this).destroy();
                    a.a(a.this, (XRImage) null);
                }
                if (a.e(a.this) == null) {
                    return;
                }
                a.e(a.this).destroy();
                a.b(a.this, (XRImage) null);
            }
        });
        this.d.onDestroy();
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            return "";
        }
        String str3 = "destDir is " + str2;
        try {
            com.taobao.android.xrappos.utils.Utils.unzipToFolder(str, str2);
            return str2 + "/model.mnn";
        } catch (Throwable unused) {
            return "";
        }
    }
}
