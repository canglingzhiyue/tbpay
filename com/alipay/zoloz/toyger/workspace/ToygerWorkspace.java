package com.alipay.zoloz.toyger.workspace;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.biometrics.ui.widget.AlgorithmInfo;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.config.bean.Algorithm;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.bio.config.bean.SwitchAuthCfg;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.service.local.automation.AutomationService;
import com.alipay.mobile.security.bio.service.local.download.BioDownloadService;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DeviceUtil;
import com.alipay.mobile.security.bio.utils.RotateBitmapHelper;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.alipay.mobile.security.faceauth.InvokeType;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.hardware.camera.CameraParams;
import com.alipay.zoloz.hardware.camera.ColorFrameData;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.preview.CameraTextureRender;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.TGSensorFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.bean.FrameType;
import com.alipay.zoloz.toyger.bean.GuidType;
import com.alipay.zoloz.toyger.bean.ToygerError;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.alipay.zoloz.toyger.extservice.ToygerIspService;
import com.alipay.zoloz.toyger.extservice.record.TimeRecord;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.toyger.face.ToygerFaceCallback;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.alipay.zoloz.toyger.face.ToygerFaceState;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.sensors.SensorCollector;
import com.alipay.zoloz.toyger.sensors.SensorCollectorListener;
import com.alipay.zoloz.toyger.upload.NineShootManager;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.alipay.zoloz.toyger.upload.UploadManager;
import com.alipay.zoloz.toyger.util.EnvCheck;
import com.alipay.zoloz.toyger.util.EnvErrorType;
import com.alipay.zoloz.toyger.util.ObjectUtil;
import com.alipay.zoloz.toyger.util.PoseUtil;
import com.alipay.zoloz.toyger.util.SoundUtils;
import com.alipay.zoloz.toyger.util.ToygerFrameUtil;
import com.alipay.zoloz.toyger.widget.CameraSurfaceViewWrapper;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.alipay.zoloz.toyger.workspace.alert.AlertHelper;
import com.alipay.zoloz.toyger.workspace.alert.AlertType;
import com.alipay.zoloz.toyger.workspace.assist.WorkState;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class ToygerWorkspace implements BioUploadCallBack, ICameraCallback, ToygerFaceCallback, SensorCollectorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int L = 400;
    private static int M = 700;
    public static final int WHAT_START_UPLOAD = 1;
    public static final int WHAT_START_UPLOAD_PAGE = 2;
    private static int w = 100;
    private ToygerIspService A;
    private SensorManager B;
    private boolean C;
    private CameraSurfaceViewWrapper E;
    private ICameraInterface F;
    private WorkState G;
    private boolean K;
    private Bitmap P;
    private ToygerFaceAttr Q;
    private HashMap<String, Object> R;

    /* renamed from: a  reason: collision with root package name */
    public ToygerRecordService f6338a;
    private boolean ab;
    private SensorCollector aj;
    public Context c;
    public BioDownloadService d;
    public GuidType f;
    private BioServiceManager g;
    private ToygerCallback h;
    private ToygerCirclePattern i;
    private ToygerTaskManager j;
    private Handler k;
    private AlertHelper l;
    private DetectTimerTask m;
    private AutomationService n;
    private PoseUtil r;
    private BioUploadService u;
    private UploadManager v;
    private DetectTimerTask x;
    private boolean y;
    public boolean b = false;
    private boolean o = false;
    private boolean p = false;
    private volatile boolean q = false;
    private ToygerFrame s = null;
    private TGFrame t = null;
    private ToygerFaceService z = new ToygerFaceService();
    private float D = -1.0f;
    private AtomicBoolean H = new AtomicBoolean(false);
    private DeviceSetting I = null;
    private int J = 270;
    private boolean N = false;
    private boolean O = false;
    private boolean S = false;
    private boolean T = false;
    private int U = 0;
    private String V = "0";
    private long W = SystemClock.elapsedRealtime();
    private long X = 0;
    private ArrayList<Long> Y = new ArrayList<>();
    private ArrayList<Float> Z = new ArrayList<>();
    public long e = -1;
    private SensorEventListener aa = new SensorEventListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (sensorEvent == null || sensorEvent.sensor == null || sensorEvent.sensor.getType() != 5 || sensorEvent.values == null) {
            } else {
                ToygerWorkspace.a(ToygerWorkspace.this, sensorEvent.values[0]);
            }
        }
    };
    private boolean ac = false;
    private boolean ad = true;
    private boolean ae = true;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    private int ai = 0;
    private boolean ak = false;

    /* renamed from: com.alipay.zoloz.toyger.workspace.ToygerWorkspace$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements DialogCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // com.alipay.zoloz.toyger.interfaces.DialogCallback
        public void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
                return;
            }
            ToygerWorkspace.a(ToygerWorkspace.this).clearUp();
            ToygerWorkspace.this.alertClickRecord("timeout", "image_upload");
            ToygerWorkspace.b(ToygerWorkspace.this);
        }
    }

    /* loaded from: classes3.dex */
    public class WorkspaceHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public WorkspaceHandler(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(WorkspaceHandler workspaceHandler, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                ToygerWorkspace.a(ToygerWorkspace.this, WorkState.UPLOADING);
                ToygerWorkspace.this.b = true;
            } else if (i != 2) {
            } else {
                ToygerWorkspace toygerWorkspace = ToygerWorkspace.this;
                toygerWorkspace.b = true;
                toygerWorkspace.stopTimerTask();
            }
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onColorFrame(ColorFrameData colorFrameData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9ed816", new Object[]{this, colorFrameData});
        }
    }

    public static /* synthetic */ float a(ToygerWorkspace toygerWorkspace, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ef21b47", new Object[]{toygerWorkspace, new Float(f)})).floatValue();
        }
        toygerWorkspace.D = f;
        return f;
    }

    public static /* synthetic */ AlgorithmInfo a(ToygerWorkspace toygerWorkspace, TGFaceAttr tGFaceAttr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgorithmInfo) ipChange.ipc$dispatch("bc8a4f63", new Object[]{toygerWorkspace, tGFaceAttr}) : toygerWorkspace.a(tGFaceAttr);
    }

    public static /* synthetic */ BioUploadService a(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioUploadService) ipChange.ipc$dispatch("6683f5f4", new Object[]{toygerWorkspace}) : toygerWorkspace.u;
    }

    public static /* synthetic */ DetectTimerTask a(ToygerWorkspace toygerWorkspace, DetectTimerTask detectTimerTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectTimerTask) ipChange.ipc$dispatch("d155b2e9", new Object[]{toygerWorkspace, detectTimerTask});
        }
        toygerWorkspace.m = detectTimerTask;
        return detectTimerTask;
    }

    public static /* synthetic */ WorkState a(ToygerWorkspace toygerWorkspace, WorkState workState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WorkState) ipChange.ipc$dispatch("42257dad", new Object[]{toygerWorkspace, workState});
        }
        toygerWorkspace.G = workState;
        return workState;
    }

    public static /* synthetic */ void a(ToygerWorkspace toygerWorkspace, ActionFrame actionFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1020b0b", new Object[]{toygerWorkspace, actionFrame});
        } else {
            toygerWorkspace.b(actionFrame);
        }
    }

    public static /* synthetic */ void a(ToygerWorkspace toygerWorkspace, ToygerFrame toygerFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263ccbcb", new Object[]{toygerWorkspace, toygerFrame});
        } else {
            toygerWorkspace.a(toygerFrame);
        }
    }

    public static /* synthetic */ boolean a(ToygerWorkspace toygerWorkspace, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ef2666f", new Object[]{toygerWorkspace, new Boolean(z)})).booleanValue();
        }
        toygerWorkspace.y = z;
        return z;
    }

    public static /* synthetic */ DetectTimerTask b(ToygerWorkspace toygerWorkspace, DetectTimerTask detectTimerTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectTimerTask) ipChange.ipc$dispatch("e10d656a", new Object[]{toygerWorkspace, detectTimerTask});
        }
        toygerWorkspace.x = detectTimerTask;
        return detectTimerTask;
    }

    public static /* synthetic */ void b(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc045068", new Object[]{toygerWorkspace});
        } else {
            toygerWorkspace.i();
        }
    }

    public static /* synthetic */ boolean b(ToygerWorkspace toygerWorkspace, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84866f70", new Object[]{toygerWorkspace, new Boolean(z)})).booleanValue();
        }
        toygerWorkspace.ak = z;
        return z;
    }

    public static /* synthetic */ Button c(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("67fa117b", new Object[]{toygerWorkspace}) : toygerWorkspace.a();
    }

    public static /* synthetic */ boolean c(ToygerWorkspace toygerWorkspace, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1a7871", new Object[]{toygerWorkspace, new Boolean(z)})).booleanValue();
        }
        toygerWorkspace.ac = z;
        return z;
    }

    public static /* synthetic */ WorkState d(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WorkState) ipChange.ipc$dispatch("e2132a96", new Object[]{toygerWorkspace}) : toygerWorkspace.G;
    }

    public static /* synthetic */ AlertHelper e(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertHelper) ipChange.ipc$dispatch("da91186e", new Object[]{toygerWorkspace}) : toygerWorkspace.l;
    }

    public static /* synthetic */ ToygerCirclePattern f(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCirclePattern) ipChange.ipc$dispatch("3070a8cd", new Object[]{toygerWorkspace}) : toygerWorkspace.i;
    }

    public static /* synthetic */ ToygerCallback g(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("f746b1d9", new Object[]{toygerWorkspace}) : toygerWorkspace.h;
    }

    public static /* synthetic */ BioServiceManager h(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioServiceManager) ipChange.ipc$dispatch("88299afd", new Object[]{toygerWorkspace}) : toygerWorkspace.g;
    }

    public static /* synthetic */ DetectTimerTask i(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectTimerTask) ipChange.ipc$dispatch("67001062", new Object[]{toygerWorkspace}) : toygerWorkspace.m;
    }

    public static /* synthetic */ boolean j(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b6e764", new Object[]{toygerWorkspace})).booleanValue() : toygerWorkspace.q;
    }

    public static /* synthetic */ Handler k(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("602bf627", new Object[]{toygerWorkspace}) : toygerWorkspace.k;
    }

    public static /* synthetic */ ToygerFrame l(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerFrame) ipChange.ipc$dispatch("5d73b5fa", new Object[]{toygerWorkspace}) : toygerWorkspace.s;
    }

    public static /* synthetic */ boolean m(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("959e001", new Object[]{toygerWorkspace})).booleanValue() : toygerWorkspace.y;
    }

    public static /* synthetic */ boolean n(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9032e0", new Object[]{toygerWorkspace})).booleanValue() : toygerWorkspace.ab;
    }

    public static /* synthetic */ boolean o(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc685bf", new Object[]{toygerWorkspace})).booleanValue() : toygerWorkspace.ac;
    }

    public static /* synthetic */ ToygerFaceService p(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerFaceService) ipChange.ipc$dispatch("49210f66", new Object[]{toygerWorkspace}) : toygerWorkspace.z;
    }

    public static /* synthetic */ DetectTimerTask q(ToygerWorkspace toygerWorkspace) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectTimerTask) ipChange.ipc$dispatch("4449815a", new Object[]{toygerWorkspace}) : toygerWorkspace.x;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public /* bridge */ /* synthetic */ boolean onStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr, Map map) {
        return onStateUpdated2(toygerFaceState, toygerFaceAttr, (Map<String, Object>) map);
    }

    public ToygerWorkspace(BioServiceManager bioServiceManager, ToygerCallback toygerCallback, ToygerCirclePattern toygerCirclePattern) {
        TextView verifyText;
        Algorithm algorithm;
        ToygerCameraConfig toygerCameraConfig;
        BioAppDescription appDescription;
        this.K = false;
        this.d = null;
        this.f = GuidType.NONE;
        this.ab = false;
        boolean z = true;
        BioLog.i("zolozTime", "smiletopay view end");
        this.c = bioServiceManager.getBioApplicationContext();
        this.B = (SensorManager) this.c.getSystemService("sensor");
        this.C = c();
        if (this.C) {
            d();
        }
        FaceRemoteConfig remoteConfig = toygerCallback.getRemoteConfig();
        this.r = new PoseUtil(remoteConfig, this.c.getResources());
        this.ab = !"normal".equals(remoteConfig.getVerifyMode());
        BioLog.i("IFAAMETA : isIfaaMod " + remoteConfig.getVerifyMode());
        this.g = bioServiceManager;
        this.h = toygerCallback;
        Map<String, String> extProperty = this.h.getAppDescription().getExtProperty();
        if (extProperty != null && !extProperty.isEmpty() && extProperty.containsKey(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND)) {
            this.K = Boolean.parseBoolean(extProperty.get(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND));
        } else {
            this.K = false;
        }
        this.i = toygerCirclePattern;
        this.E = this.i.getCameraSurfaceViewWrapper();
        String topText = this.r.getTopText();
        if (!TextUtils.isEmpty(topText)) {
            this.i.setTopTipViewsetVisibility(0);
            this.i.getTopTip().setText(topText);
        }
        if (DeviceUtil.isDebug(this.c)) {
            this.i.getAlgorithmInfoPattern().setVisibility(8);
        }
        boolean z2 = extProperty != null && "true".equalsIgnoreCase(extProperty.get(BioDetector.EXT_KEY_HAS_OTHERS));
        boolean z3 = (remoteConfig.getFaceTips() == null || remoteConfig.getFaceTips().getSwitchAuthCfg() == null || !remoteConfig.getFaceTips().getSwitchAuthCfg().getEnable()) ? false : true;
        BioLog.d("hasOthers:" + z2 + " enableSwitchAuth:" + z3);
        if (z2 || z3) {
            if (!this.i.isGarfieldFaceless) {
                verifyText = this.i.getOtherIdentifyTxt();
            } else {
                ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment = (ToygerGarfieldCaptureFragment) this.i.getGarfieldCaptureFragment();
                verifyText = toygerGarfieldCaptureFragment != null ? toygerGarfieldCaptureFragment.getVerifyText() : null;
            }
            a(z2, remoteConfig.getFaceTips().getSwitchAuthCfg(), verifyText);
        }
        this.f6338a = (ToygerRecordService) this.g.getBioService(ToygerRecordService.class);
        this.u = (BioUploadService) this.g.getBioService(BioUploadService.class);
        this.u.addCallBack(this);
        this.n = (AutomationService) this.g.getBioService(AutomationService.class);
        this.A = (ToygerIspService) this.g.getBioService(ToygerIspService.class);
        this.R = new HashMap<>();
        if (this.h.getAppDescription() != null && (appDescription = this.h.getAppDescription()) != null) {
            this.R.putAll(appDescription.getExtMetaInfo());
        }
        this.d = (BioDownloadService) this.g.getBioService(BioDownloadService.class);
        try {
            algorithm = (Algorithm) JSON.parseObject(remoteConfig.getAlgorithm().toJSONString(), Algorithm.class);
        } catch (Exception unused) {
            BioLog.e("algorism_param_parse_error:" + remoteConfig.getAlgorithm().toJSONString());
            algorithm = null;
        }
        String str = "";
        if (this.d != null && algorithm != null && algorithm.getUseGrayModel() && !algorithm.getGrayModelCloudID().isEmpty() && !algorithm.getModelPath().isEmpty()) {
            BioLog.e("ToygerDownloadService_functioning");
            String checkModelsExist = this.d.checkModelsExist(algorithm.getGrayModelCloudID(), algorithm.getModelPath());
            if (checkModelsExist != str) {
                this.R.put(ToygerBaseService.KEY_GrayModel_BasePath, checkModelsExist);
                if (algorithm.getToyger_liveness() != str) {
                    this.R.put(ToygerBaseService.KEY_GrayModel_Liveness, algorithm.getToyger_liveness());
                }
                if (algorithm.getToyger_detect() != str) {
                    this.R.put(ToygerBaseService.KEY_GrayModel_Detect, algorithm.getToyger_detect());
                }
            }
        }
        this.k = new WorkspaceHandler(Looper.getMainLooper());
        this.v = new UploadManager(this, this.g, this.h);
        this.j = new ToygerTaskManager(this.g, this.i, this.k, this.h, this.v);
        this.l = new AlertHelper(this.c, this, toygerCallback);
        this.l.setAuthInBackground(false);
        this.R.put(ToygerBaseService.KEY_PUBLIC_KEY, UploadManager.getPublicKey(this.c, remoteConfig));
        if (extProperty != null && !extProperty.isEmpty() && extProperty.containsKey("meta_serializer")) {
            this.R.put("meta_serializer", extProperty.get("meta_serializer"));
        }
        BioLog.i("zolozTime", "camera call");
        this.F = this.E.getCameraImpl(this.c);
        b();
        this.E.setCameraCallback(this);
        ICameraInterface iCameraInterface = this.F;
        if (iCameraInterface != null) {
            iCameraInterface.addCallback(this);
            DeviceSetting[] a2 = a(this.h.getRemoteConfig().getDeviceSettings(), this.h.getRemoteConfig().getColl());
            if (a2 != null && a2.length > 0) {
                this.F.initCamera(a2[0]);
            }
        }
        if (this.ab) {
            this.R.put(ToygerBaseService.KEY_LOCAL_MATCHING_COMMAND, remoteConfig.getVerifyMode());
            Map<String, String> extProperty2 = toygerCallback.getAppDescription().getExtProperty();
            if (extProperty2.containsKey("USER_ID")) {
                this.R.put("USER_ID", extProperty2.get("USER_ID"));
                BioLog.i("IFAATAG : uid is " + ((Object) extProperty2.get("USER_ID")));
            }
            BioLog.i("IFAATAG : mode is " + remoteConfig.getVerifyMode());
            this.R.put(ToygerBaseService.KEY_TOKEN, this.h.getAppDescription().getBistoken());
        }
        str = remoteConfig.getUpload() != null ? remoteConfig.getUpload().toJSONString() : str;
        if (!this.z.init(this.c, this.ab, (ToygerFaceCallback) this)) {
            this.l.alert(AlertType.ALERT_SYSTEM_ERROR, ZcodeConstants.ZCODE_INIT_TOYGER_ERROR);
            return;
        }
        this.R.put(ToygerBaseService.KEY_ALGORITHM_CONFIG, remoteConfig.getAlgorithm().toJSONString());
        this.R.put(ToygerBaseService.KEY_UPLOAD_CONFIG, str);
        this.R.put(ToygerBaseService.KEY_ENABLE_ENCUP, Boolean.valueOf(remoteConfig.getColl() != null ? remoteConfig.getColl().isEncUp() : z));
        if (!this.ab) {
            ICameraInterface iCameraInterface2 = this.F;
            if (iCameraInterface2 != null) {
                this.R.put(ToygerBaseService.KEY_IS_MIRROR, Boolean.toString(iCameraInterface2.isMirror()));
                toygerCameraConfig = new ToygerCameraConfig();
                CameraParams cameraParams = this.F.getCameraParams();
                if (cameraParams != null) {
                    toygerCameraConfig.colorIntrin = cameraParams.color_intrin;
                    toygerCameraConfig.depthIntrin = cameraParams.depth_intrin;
                    toygerCameraConfig.color2depthExtrin = cameraParams.extrin;
                    toygerCameraConfig.isAligned = cameraParams.isAligned;
                }
                toygerCameraConfig.roiRect = null;
            } else {
                toygerCameraConfig = null;
            }
            BioLog.i("toygerCameraConfig=" + toygerCameraConfig);
            if (toygerCameraConfig != null) {
                this.R.put(ToygerBaseService.KEY_CAMERA_CONFIG, toygerCameraConfig);
            }
        }
        this.f6338a.write(ToygerRecordService.TOYGER_CONFIG_START);
        this.z.config(this.R);
        this.i.getTitleBar().setBackButtonListener(this.l);
        this.G = WorkState.FACE_CAPTURING;
        boolean guideAnimation = this.h.getRemoteConfig().getColl().getGuideAnimation();
        if (this.h.getRemoteConfig().getColl().isShowFace() && !this.ab) {
            this.f = GuidType.SHOWFACE;
        } else if (!guideAnimation) {
        } else {
            this.f = GuidType.PHONEUPDOWN;
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.i.isGarfieldFaceless) {
        } else {
            this.k.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Button c = ToygerWorkspace.c(ToygerWorkspace.this);
                    if ((ToygerWorkspace.d(ToygerWorkspace.this) != WorkState.FACE_CAPTURING && ToygerWorkspace.d(ToygerWorkspace.this) != WorkState.FACE_CAPTURING_DARK) || c == null) {
                        return;
                    }
                    c.setVisibility(0);
                    c.setOnClickListener(ToygerWorkspace.e(ToygerWorkspace.this));
                }
            }, i * 1000);
        }
    }

    private Button a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("4723dbdc", new Object[]{this});
        }
        if (!this.i.isGarfieldFaceless) {
            return null;
        }
        return ((ToygerGarfieldCaptureFragment) this.i.getGarfieldCaptureFragment()).getBackButton();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DeviceSetting[] a2 = a(this.h.getRemoteConfig().getDeviceSettings(), this.h.getRemoteConfig().getColl());
        if (a2 != null && a2.length > 0) {
            this.I = a2[0];
        } else {
            this.I = new DeviceSetting();
        }
        l();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<Sensor> sensorList = this.B.getSensorList(-1);
        if (sensorList != null && sensorList.size() > 0) {
            for (Sensor sensor : sensorList) {
                if (5 == sensor.getType()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void d() {
        Sensor defaultSensor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.B;
        if (sensorManager == null || !this.C || (defaultSensor = sensorManager.getDefaultSensor(5)) == null) {
            return;
        }
        this.B.registerListener(this.aa, defaultSensor, 3);
    }

    private void e() {
        SensorEventListener sensorEventListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.B;
        if (sensorManager == null || (sensorEventListener = this.aa) == null) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
    }

    private void a(final ActionFrame<ToygerFrame> actionFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164d120c", new Object[]{this, actionFrame});
        } else if (this.k == null) {
        } else {
            BioLog.d("TOYGER_FLOW_ANDROID", "ToygerWorkspace.sendActionFrame() : " + actionFrame.getObject());
            this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ToygerWorkspace.a(ToygerWorkspace.this, actionFrame);
                    }
                }
            });
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            if (this.l == null || this.l.isAlertRunning() || this.m == null) {
                return false;
            }
            return !this.m.isTimeOut();
        } catch (NullPointerException e) {
            BioLog.i("checkUIRunning error:" + e.toString());
            return false;
        }
    }

    private void b(ActionFrame actionFrame) {
        DetectTimerTask detectTimerTask;
        BioServiceManager bioServiceManager;
        UploadManager uploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306890ab", new Object[]{this, actionFrame});
            return;
        }
        final ToygerFrame toygerFrame = (ToygerFrame) actionFrame.getObject();
        if (toygerFrame.frameType == FrameType.CAMERA && (uploadManager = this.v) != null) {
            NineShootManager nineShootManager = uploadManager.getNineShootManager();
            if (nineShootManager == null) {
                return;
            }
            nineShootManager.shootToygerFrame(toygerFrame);
            return;
        }
        AlertHelper alertHelper = this.l;
        if ((alertHelper != null && alertHelper.isAlertRunning()) || ((this.o && !this.K) || ((detectTimerTask = this.m) != null && detectTimerTask.isTimeOut()))) {
            BioLog.i("ToygerWorkspace.onDoAction() return. => isPaused=" + this.o + ", mIsProgressCallback=" + this.K);
        } else if (toygerFrame.frameType == FrameType.ERROR) {
            if (toygerFrame.error == ToygerError.CAMERA_ERROR) {
                this.l.alert(AlertType.ALERT_NO_PERMISSION_OF_CAMERA, ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE);
            } else if (toygerFrame.error == ToygerError.ALGORITHM_ERROR) {
                stopTimerTask();
                responseWithCode(300, ZcodeConstants.ZCODE_IFAA_ERROR);
            } else if (toygerFrame.error != ToygerError.LIVENESS_FAIL) {
            } else {
                BioLog.i("zolozTime", "liveness fail!");
                BioLog.i("LIVENESS_FAILED 1");
                BioLog.i("LIVENESS_FAILED 4");
                if (this.l == null) {
                    return;
                }
                BioLog.i("LIVENESS_FAILED 5");
                this.l.alert(AlertType.ALERT_FACE_FAIL, ZcodeConstants.ZCODE_LIVENESS_ERROR);
            }
        } else {
            if (this.j != null) {
                BioLog.i("TOYGER_FLOW_ANDROID", "ToygerTaskManager.action() : " + toygerFrame.frameType);
                this.j.action(actionFrame);
                if (toygerFrame.frameType == FrameType.FRAME || toygerFrame.frameType == FrameType.STATE || toygerFrame.frameType == FrameType.COMPLETED) {
                    this.s = toygerFrame;
                }
            }
            if (this.o || (bioServiceManager = this.g) == null || !DeviceUtil.isDebug(bioServiceManager.getBioApplicationContext()) || toygerFrame == null || toygerFrame.frameType == FrameType.COMPLETED) {
                return;
            }
            this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ToygerWorkspace.f(ToygerWorkspace.this) == null) {
                    } else {
                        ToygerWorkspace.f(ToygerWorkspace.this).getAlgorithmInfoPattern().showInfo(ToygerWorkspace.a(ToygerWorkspace.this, toygerFrame.tgFaceAttr));
                    }
                }
            });
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        j();
        if (this.F != null && !this.ab) {
            BioLog.d("CameraInterface: startCamera called in init");
            this.F.startCamera();
        }
        if (this.N || this.ab) {
            startTimerTask();
        }
        this.j.resetTask();
    }

    private AlgorithmInfo a(TGFaceAttr tGFaceAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgorithmInfo) ipChange.ipc$dispatch("902d51c2", new Object[]{this, tGFaceAttr});
        }
        AlgorithmInfo algorithmInfo = new AlgorithmInfo();
        if (tGFaceAttr != null) {
            algorithmInfo.setBrightness(tGFaceAttr.brightness);
            algorithmInfo.setHasFace(tGFaceAttr.hasFace);
            algorithmInfo.setEyeBlink(tGFaceAttr.eyeBlink);
            algorithmInfo.setFaceRegion(tGFaceAttr.faceRegion);
            algorithmInfo.setQuality(tGFaceAttr.quality);
            algorithmInfo.setYaw(tGFaceAttr.yaw);
            algorithmInfo.setPitch(tGFaceAttr.pitch);
            algorithmInfo.setGaussian(tGFaceAttr.gaussian);
            algorithmInfo.setIntegrity(tGFaceAttr.integrity);
            algorithmInfo.setLeftEyeBlinkRatio(tGFaceAttr.leftEyeBlinkRatio);
            algorithmInfo.setRightEyeBlinkRatio(tGFaceAttr.rightEyeBlinkRatio);
            algorithmInfo.setDistance(tGFaceAttr.distance);
        }
        return algorithmInfo;
    }

    public void resume() {
        Map<String, String> extProperty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        BioLog.d("ToygerWorkspace.resume()");
        if (!g()) {
            this.h.finishActivity(false);
            return;
        }
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService != null) {
            toygerFaceService.resume();
        }
        ToygerCallback toygerCallback = this.h;
        boolean parseBoolean = (toygerCallback == null || (extProperty = toygerCallback.getAppDescription().getExtProperty()) == null || extProperty.isEmpty() || !extProperty.containsKey("dynamic")) ? false : Boolean.parseBoolean(extProperty.get("dynamic"));
        if (this.h.haveCameraPermission()) {
            BioLog.d("ToygerWorkspace.resume() setcamera visible");
            setCameraVisible(true);
            BioLog.d("ToygerWorkspace.resume() setcamera visible end");
            if (this.o && !this.K && !parseBoolean) {
                if (!this.b && !this.i.isGarfieldFaceless) {
                    this.l.alert(AlertType.ALERT_INTERRUPT_RESUME, ZcodeConstants.ZCODE_INTERUPT_RESUME);
                }
                this.o = false;
            }
            if (this.o && (this.K || parseBoolean)) {
                startTimerTask();
                this.o = false;
            }
        }
        BioLog.d("ToygerWorkspace.resume() end");
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService != null && toygerFaceService.isStale()) {
            return false;
        }
        ToygerCallback toygerCallback = this.h;
        return toygerCallback == null || !toygerCallback.isStale();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        BioLog.d("ToygerWorkspace.pause()");
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService != null) {
            toygerFaceService.pause();
        }
        if (!this.h.haveCameraPermission()) {
            return;
        }
        if (!this.K) {
            setCameraVisible(false);
        }
        if (!this.b) {
            this.o = true;
        }
        stopTimerTask();
    }

    public void stop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54686b", new Object[]{this, new Boolean(z)});
            return;
        }
        BioLog.d("ToygerWorkspace.stop()...finish:" + z);
        if (!z && !this.b && !this.K && this.i.isGarfieldFaceless) {
            responseWithCode(300, ZcodeConstants.ZCODE_INTERUPT_RESUME);
        }
        if (!this.h.haveCameraPermission()) {
        }
    }

    public void commandFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d256e4", new Object[]{this});
            return;
        }
        BioLog.d("ToygerWorkspace.commandFinished(), mWorkState=" + this.G);
        if (this.F != null) {
            if (TextUtils.equals("Android", this.E.getCameraName())) {
                this.F.closeCamera();
                ToygerCirclePattern toygerCirclePattern = this.i;
                if (toygerCirclePattern != null && toygerCirclePattern.isGarfieldFaceless) {
                    this.F.stopCamera();
                }
                this.F.removeCallback(this);
            } else {
                this.F.stopCamera();
            }
            this.F = null;
        }
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService != null) {
            toygerFaceService.release(this.k);
            this.z = null;
        }
        AlertHelper alertHelper = this.l;
        if (alertHelper == null) {
            return;
        }
        alertHelper.dismissAlert();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BioLog.d("ToygerWorkspace.destroy(), mWorkState=" + this.G);
        commandFinished();
        stopTimerTask();
        ToygerCirclePattern toygerCirclePattern = this.i;
        if (toygerCirclePattern != null) {
            toygerCirclePattern.pause();
            this.i.destroy();
            this.i = null;
        }
        SensorCollector sensorCollector = this.aj;
        if (sensorCollector != null) {
            sensorCollector.releaseSensorCollector();
            this.aj = null;
        }
        this.g = null;
        this.h = null;
        ToygerTaskManager toygerTaskManager = this.j;
        if (toygerTaskManager != null) {
            toygerTaskManager.destroy();
            this.j = null;
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.k = null;
        }
        UploadManager uploadManager = this.v;
        if (uploadManager != null) {
            uploadManager.destroy();
            this.v = null;
        }
        e();
        this.u = null;
        this.t = null;
        this.r = null;
        this.l = null;
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        this.s = null;
        this.f6338a.retry();
        synchronized (this.Y) {
            this.Y.clear();
        }
        synchronized (this.Z) {
            this.Z.clear();
        }
        this.e = -1L;
        this.z.reset();
        this.G = WorkState.FACE_CAPTURING;
        this.T = false;
        ToygerTaskManager toygerTaskManager = this.j;
        if (toygerTaskManager != null) {
            toygerTaskManager.resetTask();
        }
        this.i.getCircleUploadPattern().setVisibility(8);
        this.i.getRoundProgressBar().setVisibility(0);
        this.i.getTitleBar().setVisibility(0);
        this.i.getTitleBar().setCloseButtonVisible(0);
        this.i.onProcessReset();
        a(0);
        this.b = false;
        startTimerTask();
        if (this.F != null && !isIfaaMode()) {
            this.F.startCamera();
        }
        this.H.set(false);
        this.ae = true;
        this.ai = 0;
        this.ah = 0;
        this.ag = 0;
        this.af = 0;
    }

    public boolean isIfaaMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea348415", new Object[]{this})).booleanValue() : this.ab;
    }

    public void setCameraVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38b1c2", new Object[]{this, new Boolean(z)});
            return;
        }
        if (isIfaaMode()) {
            z = false;
        }
        ToygerCirclePattern toygerCirclePattern = this.i;
        if (toygerCirclePattern == null) {
            return;
        }
        toygerCirclePattern.setCameraVisible(z);
    }

    public void alertCameraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4903ecd7", new Object[]{this});
        } else {
            this.l.alert(AlertType.ALERT_NO_PERMISSION_OF_CAMERA, ZcodeConstants.ZCODE_NO_CAMERA_PERMISSION);
        }
    }

    public void alertFirstLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e7af1c", new Object[]{this});
        } else {
            this.l.alert(AlertType.ALERT_FIRST_LOGIN, ZcodeConstants.ZCODE_FIRST_LOGIN);
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onSurfaceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a0fcc1", new Object[]{this});
            return;
        }
        BioLog.w("Toyger", "onSurfaceCreated()");
        if (this.F == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cameraParam", this.F.getColorWidth() + "," + this.F.getColorHeight() + "," + this.F.getColorMode());
        if (TimeRecord.getInstance() != null && TimeRecord.getInstance().getEnterDetectionEndTime() > 0) {
            hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - TimeRecord.getInstance().getEnterDetectionEndTime()));
        }
        if (!this.i.isGarfieldFaceless) {
            boolean isBeauty = this.h.getRemoteConfig().getColl().isBeauty();
            hashMap.put("useBeautyCam", isBeauty ? "true" : "false");
            if (isBeauty) {
                hashMap.put("beautyCamLevel", CameraTextureRender.BEAUTY_LEVEL + "");
            }
        }
        float f = this.D;
        hashMap.put("backBrightness", f > 0.0f ? String.valueOf(f) : "NULL");
        TimeRecord.getInstance().setImageCaptureStartTime(System.currentTimeMillis());
        this.f6338a.write(ToygerRecordService.IMAGE_CAPTURE_START, hashMap);
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onSurfaceChanged(final double d, final double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641eb30d", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ToygerWorkspace.f(ToygerWorkspace.this) == null) {
                } else {
                    ToygerWorkspace.f(ToygerWorkspace.this).onPreviewChanged(d, d2);
                }
            }
        });
        l();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onSurfaceDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931706f2", new Object[]{this});
        } else {
            BioLog.w("Toyger", "onSurfaceDestroyed()");
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        BioLog.w(new RuntimeException("ICameraCallback.onError(error=" + i + riy.BRACKET_END_STR));
        ToygerCallback toygerCallback = this.h;
        if (toygerCallback == null || !toygerCallback.haveCameraPermission()) {
            return;
        }
        if (i != 201) {
            switch (i) {
                case 100:
                    this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_INIT_CAMERA_ERROR, ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE);
                            }
                        }
                    });
                    return;
                case 101:
                    this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_INIT_CAMERA_ERROR, ZcodeConstants.ZCODE_ERROR_CAMERA_OPEN_FAILED);
                            }
                        }
                    });
                    return;
                case 102:
                    this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.11
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_INIT_CAMERA_ERROR, ZcodeConstants.ZCODE_ERROR_CAMERA_STREAM_ERROR);
                            }
                        }
                    });
                    return;
                default:
                    return;
            }
        } else if (this.h.isRequestingCameraPermission()) {
        } else {
            this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_INIT_CAMERA_ERROR, ZcodeConstants.ZCODE_NO_CAMERA_PERMISSION);
                    }
                }
            });
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraCallback
    public void onPreviewFrame(CameraData cameraData) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc360bc0", new Object[]{this, cameraData});
            return;
        }
        if (this.ad) {
            ToygerCaptureFragment.sendTimeRecordBroadCast(this.c, "firstFrame");
            this.ad = false;
        }
        ToygerCirclePattern toygerCirclePattern = this.i;
        if (toygerCirclePattern != null && !toygerCirclePattern.isGarfieldFaceless && this.O) {
            a(cameraData);
            this.O = false;
        }
        if (!this.A.isInitialized()) {
            this.A.init(cameraData.getColorHeight(), cameraData.getColorWidth(), cameraData.getColorHeight(), cameraData.getColorWidth(), cameraData.getColorFrameMode());
        }
        if (this.G != WorkState.FACE_CAPTURING && this.G != WorkState.FACE_CAPTURING_DARK) {
            return;
        }
        this.af++;
        if (this.H.getAndSet(true)) {
            this.ah++;
            BioLog.e("Toyger", "Lost Frame => isAlgorithRunning = true");
            return;
        }
        try {
            int i = this.G == WorkState.FACE_CAPTURING ? 0 : 1;
            BioLog.i("Toyger", "mToygerFaceService.processImage(cameraData, colorFrameMode=" + cameraData.getColorFrameMode() + ", type=" + i + ", mAlgorithmAngle=" + this.J + ",resolution = " + cameraData.getColorWidth() + "," + cameraData.getColorHeight() + riy.BRACKET_END_STR);
            ByteBuffer colorData = cameraData.getColorData();
            TGDepthFrame tGDepthFrame = null;
            if (colorData != null) {
                arrayList = new ArrayList();
                arrayList.add(new TGFrame(colorData, cameraData.getColorWidth(), cameraData.getColorHeight(), this.J, cameraData.getColorFrameMode(), i));
            } else {
                arrayList = null;
            }
            ByteBuffer depthData = cameraData.getDepthData();
            if (depthData != null) {
                tGDepthFrame = new TGDepthFrame(depthData, cameraData.getDepthWidth(), cameraData.getDepthHeight(), this.J);
            }
            if (this.z == null) {
                return;
            }
            if (this.n != null && this.n.enable() && arrayList.size() > 0) {
                BioLog.d("Toyger", "AutomationService_enable");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((TGFrame) it.next());
                }
                if (this.n.processFrame(this.c, arrayList2, tGDepthFrame, "face")) {
                    TGFrame tGFrame = (TGFrame) arrayList2.get(0);
                    BioLog.d("Toyger", "AutomationService_functioning:" + tGFrame.width + "," + tGFrame.height + "," + tGFrame.rotation + "," + tGFrame.byteBuffer.array().length + "," + tGFrame.frameMode);
                    arrayList.set(0, (TGFrame) arrayList2.get(0));
                }
            }
            boolean processImage = this.z.processImage(arrayList, tGDepthFrame);
            this.H.set(false);
            if (processImage) {
                if (arrayList != null && arrayList.size() > 0) {
                    onProcessOneImageFinish((TGFrame) arrayList.get(0));
                }
                this.ai++;
                if (!this.ae) {
                    return;
                }
                this.ae = false;
                this.f6338a.write(ToygerRecordService.PROCESS_IMAGE_START);
                return;
            }
            BioLog.e("Toyger", "Lost Frame => PreviewDataQueue.offer() = false");
            if (this.ae) {
                this.ag++;
            } else {
                this.ah++;
            }
        } catch (Exception e) {
            BioLog.e("Toyger", e);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioUploadCallBack
    public boolean onResponse(BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c3fce", new Object[]{this, bioUploadResult})).booleanValue();
        }
        BioLog.i("ToygerWorkspace.onResponse() : " + bioUploadResult);
        int i = bioUploadResult.productRetCode;
        if (i == 1001) {
            BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
            bioFragmentResponse.isSucess = bioUploadResult.productRetCode == 1001;
            bioFragmentResponse.suggest = bioUploadResult.productRetCode;
            bioFragmentResponse.errorCode = 500;
            bioFragmentResponse.resultMessage = bioUploadResult.subMsg;
            bioFragmentResponse.ext.put(BioDetector.EXT_KEY_UPLOAD_RESPONSE, JSON.toJSONString(bioUploadResult));
            ToygerCallback toygerCallback = this.h;
            if (toygerCallback != null) {
                bioFragmentResponse.token = toygerCallback.getAppDescription().getBistoken();
                this.h.sendResponse(bioFragmentResponse);
                this.h.finishActivity(true);
            }
        } else if (i == 2002) {
            i();
        } else if (i == 3001 || i == 3002) {
            h();
        } else {
            AlertHelper alertHelper = this.l;
            if (alertHelper != null) {
                if (this.K) {
                    responseWithCode(alertHelper.getAlertReturnCode(AlertType.ALERT_REMOTE_COMMAND_FAIL), bioUploadResult.subCode, bioUploadResult.subMsg);
                } else if (!this.o) {
                    BioFragmentResponse bioFragmentResponse2 = new BioFragmentResponse();
                    bioFragmentResponse2.isSucess = false;
                    bioFragmentResponse2.suggest = bioUploadResult.productRetCode;
                    bioFragmentResponse2.errorCode = 208;
                    bioFragmentResponse2.resultMessage = bioUploadResult.subMsg;
                    bioFragmentResponse2.subCode = bioUploadResult.subCode;
                    bioFragmentResponse2.subMsg = bioUploadResult.subMsg;
                    bioFragmentResponse2.ext.put(BioDetector.EXT_KEY_UPLOAD_RESPONSE, JSON.toJSONString(bioUploadResult));
                    ToygerCallback toygerCallback2 = this.h;
                    if (toygerCallback2 != null) {
                        bioFragmentResponse2.token = toygerCallback2.getAppDescription().getBistoken();
                        this.h.sendResponse(bioFragmentResponse2);
                        this.h.finishActivity(false);
                    }
                }
            }
        }
        return false;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        AlertHelper alertHelper = this.l;
        if (alertHelper == null) {
            return;
        }
        if (this.K) {
            responseWithCode(alertHelper.getAlertReturnCode(AlertType.ALERT_REMOTE_NETWORK_ERROR), ZcodeConstants.ZCODE_NETWORK_ERROR);
        } else if (this.o) {
        } else {
            alertHelper.alert(AlertType.ALERT_REMOTE_NETWORK_ERROR, ZcodeConstants.ZCODE_NETWORK_ERROR);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        AlertHelper alertHelper = this.l;
        if (alertHelper == null) {
            return;
        }
        if (this.K) {
            responseWithCode(alertHelper.getAlertReturnCode(AlertType.ALERT_REMOTE_COMMAND_FAIL_RETRY), ZcodeConstants.ZCODE_RETRY_ALERT);
        } else if (this.o) {
        } else {
            alertHelper.alert(AlertType.ALERT_REMOTE_COMMAND_FAIL_RETRY, ZcodeConstants.ZCODE_RETRY_ALERT);
        }
    }

    public boolean onProcessOneImageFinish(TGFrame tGFrame) {
        NineShootManager nineShootManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fae74501", new Object[]{this, tGFrame})).booleanValue();
        }
        if (!this.i.isGarfieldFaceless) {
            this.t = tGFrame;
        }
        UploadManager uploadManager = this.v;
        if (uploadManager != null && (nineShootManager = uploadManager.getNineShootManager()) != null && nineShootManager.needShootToygerFrameNow()) {
            ToygerFrame toygerFrame = new ToygerFrame();
            toygerFrame.frameType = FrameType.CAMERA;
            toygerFrame.tgFrame = tGFrame.deepCopy();
            a(new ActionFrame<>(toygerFrame));
        }
        return true;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onComplete(int i, byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ff8126", new Object[]{this, new Integer(i), bArr, bArr2, new Boolean(z)})).booleanValue();
        }
        stopTimerTask();
        return a(i, bArr, bArr2, z);
    }

    private boolean a(int i, byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d59ce0f", new Object[]{this, new Integer(i), bArr, bArr2, new Boolean(z)})).booleanValue();
        }
        if (bArr != null) {
            this.U = bArr.length;
        }
        BioLog.i("zolozTime", "liveness end!");
        AlertHelper alertHelper = this.l;
        if (alertHelper != null) {
            alertHelper.setAuthInBackground(this.K);
        }
        BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
        bioFragmentResponse.token = this.h.getAppDescription().getBistoken();
        BioLog.w("ToygerWorkspace", "mToygerCallback.sendProgressResponse()");
        this.h.sendProgressResponse(bioFragmentResponse);
        this.G = WorkState.FACE_COMPLETED;
        StringBuilder sb = new StringBuilder();
        sb.append("onComplete(result=");
        sb.append(i);
        sb.append(", content=");
        String str = "***";
        sb.append(bArr == null ? str : "null");
        sb.append(", key=");
        if (bArr2 != null) {
            str = "null";
        }
        sb.append(str);
        sb.append(", isUTF8=");
        sb.append(z);
        sb.append(riy.BRACKET_END_STR);
        BioLog.i("TOYGER_FLOW_ANDROID", sb.toString());
        if (this.s == null) {
            this.s = new ToygerFrame();
        }
        a(this.s, true, false, this.T);
        ToygerFrame toygerFrame = new ToygerFrame();
        toygerFrame.frameType = FrameType.COMPLETED;
        try {
            if (this.s != null) {
                toygerFrame.tgFrame = this.s.tgFrame;
                toygerFrame.tgFaceAttr = this.s.tgFaceAttr;
            }
        } catch (NullPointerException unused) {
            BioLog.d("mCurrentToygerFrame is null");
        }
        toygerFrame.bestBitmap = this.P;
        toygerFrame.uploadContent = new UploadContent(bArr, bArr2, z);
        a(new ActionFrame<>(toygerFrame));
        this.s = toygerFrame;
        uploadFaceInfo();
        return true;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public void onAsyncUpload(int i, byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f15a8", new Object[]{this, new Integer(i), bArr, bArr2, new Boolean(z)});
            return;
        }
        BioLog.i("IFAATAG onAsyncUpload");
        if (i == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("content", bArr);
            hashMap.put("key", bArr2);
            hashMap.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(z));
            this.v.setBlob(hashMap);
        } else if (-200 != i) {
            if (-300 != i) {
                return;
            }
            this.v.setIFAAContent(bArr, bArr2, z);
        } else {
            BioLog.i("set blob: onAsyncUpload");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("content", bArr);
            hashMap2.put("key", bArr2);
            hashMap2.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(z));
            this.v.setBlob(hashMap2);
            UploadManager uploadManager = this.v;
            if (uploadManager == null) {
                return;
            }
            uploadManager.uploadAsyncBlob(false);
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onHighQualityFrame(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d24a6c", new Object[]{this, bitmap, toygerFaceAttr})).booleanValue();
        }
        BioLog.i("TOYGER_FLOW_ANDROID", "mWorkState = FACE_CAPTURED,qualityscore:" + toygerFaceAttr.quality);
        this.P = bitmap;
        if (m()) {
            this.P = BitmapHelper.flipBitmap(this.P, 0);
        }
        this.Q = toygerFaceAttr;
        BioLog.i("zolozTime", "scan face end!");
        ToygerFrame toygerFrame = new ToygerFrame();
        toygerFrame.frameType = FrameType.FRAME;
        toygerFrame.tgFaceAttr = toygerFaceAttr;
        a(new ActionFrame<>(toygerFrame));
        this.q = true;
        b(toygerFrame);
        this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Button c = ToygerWorkspace.c(ToygerWorkspace.this);
                if (c == null) {
                    return;
                }
                c.setVisibility(4);
            }
        });
        this.f6338a.write(ToygerRecordService.LIVEBODY_START);
        return true;
    }

    /* renamed from: onStateUpdated  reason: avoid collision after fix types in other method */
    public boolean onStateUpdated2(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbb8c27", new Object[]{this, toygerFaceState, toygerFaceAttr, map})).booleanValue();
        }
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService != null) {
            if (this.e == -1) {
                this.e = toygerFaceService.getCurrentProcessFrame();
                synchronized (this.Y) {
                    this.Y.add(Long.valueOf(SystemClock.elapsedRealtime()));
                }
                synchronized (this.Z) {
                    this.Z.add(Float.valueOf(toygerFaceAttr.quality));
                }
            } else {
                Long valueOf = Long.valueOf(toygerFaceService.getCurrentProcessFrame());
                if (this.e != valueOf.longValue()) {
                    synchronized (this.Y) {
                        this.Y.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    synchronized (this.Z) {
                        this.Z.add(Float.valueOf(toygerFaceAttr.quality));
                    }
                    this.e = valueOf.longValue();
                }
            }
        }
        this.A.adjustIsp((TGFrame) map.remove(ToygerFaceService.KEY_TOYGER_FRAME), (TGDepthFrame) map.remove(ToygerFaceService.KEY_TOYGER_DEPTH_FRAME), toygerFaceState, toygerFaceAttr);
        ToygerFrame toygerFrame = new ToygerFrame();
        toygerFrame.frameType = FrameType.STATE;
        toygerFrame.tgFaceState = toygerFaceState;
        toygerFrame.tgFaceAttr = toygerFaceAttr;
        toygerFrame.extInfo = map;
        a(new ActionFrame<>(toygerFrame));
        if (!this.T) {
            this.T = toygerFaceAttr.eyeBlink();
        }
        return true;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onEvent(int i, Map<String, Object> map) {
        Handler handler;
        UploadManager uploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f16fb528", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        if (i == -100) {
            BioLog.i("EVENT_CODE_INIT_SUCESS");
            this.X = SystemClock.elapsedRealtime();
            this.f6338a.write(ToygerRecordService.TOYGER_CONFIG_END);
            return true;
        }
        if (i == -16) {
            this.V = (String) map.get(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS);
            if (f()) {
                HashMap hashMap = new HashMap();
                if (TimeRecord.getInstance() != null && TimeRecord.getInstance().getFaceImageDetectEndTime() > 0) {
                    hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - TimeRecord.getInstance().getFaceImageDetectEndTime()));
                }
                this.f6338a.write(ToygerRecordService.LIVEBODY_END, hashMap);
                TimeRecord.getInstance().setLivebodyEndTime(System.currentTimeMillis());
            }
        } else if (i != -14) {
            if (i == -12) {
                BioLog.d("EVENT_CODE_LOCAL_MATCHING_ERROR_RETRY");
                Handler handler2 = this.k;
                if (handler2 == null || this.l == null) {
                    return true;
                }
                handler2.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_REMOTE_COMMAND_FAIL_RETRY, ZcodeConstants.ZCODE_IFAA_ERROR);
                        }
                    }
                });
                return true;
            } else if (i == -51) {
                if (map == null || this.f6338a == null) {
                    return true;
                }
                String jSONObject = new JSONObject(map).toString();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("modelVerList", jSONObject);
                this.f6338a.write(ToygerRecordService.LOAD_LIVEBODY_GRAY_MODEL, hashMap2);
                return true;
            } else if (i == -50) {
                if (map == null || this.f6338a == null) {
                    return true;
                }
                String jSONObject2 = new JSONObject(map).toString();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("modelVerList", jSONObject2);
                this.f6338a.write(ToygerRecordService.LOAD_DETECT_GRAY_MODEL, hashMap3);
                return true;
            } else if (i == -31) {
                this.f6338a.write(ToygerRecordService.FACE_REDETECT_END);
            } else if (i != -30) {
                if (i == -4) {
                    BioLog.i("EVENT_CODE_INIT_FAIL");
                    this.f6338a.write(ToygerRecordService.TOYGER_CONFIG_END);
                    if (this.i.isGarfieldFaceless && (handler = this.k) != null) {
                        handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.14
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_FACE_FAIL_NO_RETRY, ZcodeConstants.ZCODE_INIT_TOYGER_ERROR);
                                }
                            }
                        });
                        return true;
                    }
                    stopTimerTask();
                    responseWithCode(300, ZcodeConstants.ZCODE_INIT_TOYGER_ERROR);
                    return true;
                } else if (i == -3) {
                    this.S = true;
                    BioLog.i("LIVENESS_FAILED");
                    ToygerFrame toygerFrame = new ToygerFrame();
                    toygerFrame.frameType = FrameType.ERROR;
                    toygerFrame.error = ToygerError.LIVENESS_FAIL;
                    a(new ActionFrame<>(toygerFrame));
                    this.G = WorkState.FAILED;
                    return true;
                } else if (i == -2) {
                    stopTimerTask();
                    responseWithCode(205, ZcodeConstants.ZCODE_MODEL_LOAD_ERROR);
                    return true;
                } else if (i == -1) {
                    ToygerFrame toygerFrame2 = new ToygerFrame();
                    toygerFrame2.frameType = FrameType.DARK;
                    a(new ActionFrame<>(toygerFrame2));
                    this.G = WorkState.FACE_CAPTURING_DARK;
                    return true;
                } else {
                    switch (i) {
                        case -10:
                            if (Build.VERSION.SDK_INT < 21) {
                                return true;
                            }
                            k();
                            return true;
                        case -8:
                            BioLog.d(getClass().getSimpleName() + ".onEvent() : " + StringUtil.map2String(map));
                            return true;
                        case -7:
                            BioLog.i("IFAATAG EVENT_CODE_LOCAL_MATCHING_ERROR");
                            if (map != null && map.containsKey("error")) {
                                BioLog.i("IFAATAG ERROR: " + map.get("error"));
                            }
                            if (this.ab && (uploadManager = this.v) != null) {
                                uploadManager.uploadIFAAContent();
                            }
                            Handler handler3 = this.k;
                            if (handler3 == null) {
                                return true;
                            }
                            handler3.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.13
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        ToygerWorkspace.e(ToygerWorkspace.this).alert(AlertType.ALERT_FACE_FAIL_NO_RETRY, ZcodeConstants.ZCODE_IFAA_ERROR);
                                    }
                                }
                            });
                            return true;
                    }
                }
            } else {
                this.f6338a.write(ToygerRecordService.FACE_REDETECT_START);
            }
        } else if (f()) {
            this.f6338a.write(ToygerRecordService.CUT_NANO_END);
        }
        return false;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public PointF onAlignDepthPoint(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("dc04eb24", new Object[]{this, pointF});
        }
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        ICameraInterface iCameraInterface = this.F;
        if (iCameraInterface != null) {
            int colorWidth = iCameraInterface.getColorWidth();
            int colorHeight = this.F.getColorHeight();
            int depthWidth = this.F.getDepthWidth();
            int depthHeight = this.F.getDepthHeight();
            PointF pointF3 = new PointF();
            pointF3.x = pointF.x * colorWidth;
            pointF3.y = pointF.y * colorHeight;
            PointF colorToDepth = this.F.colorToDepth(pointF3);
            pointF2.x = colorToDepth.x / depthWidth;
            pointF2.y = colorToDepth.y / depthHeight;
        }
        return pointF2;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        EnvErrorType check = new EnvCheck().check(this.ab);
        if (check == EnvErrorType.ENV_ERROR_INVALID) {
            return;
        }
        if (check == EnvErrorType.ENV_ERROR_LOW_OS) {
            this.l.alert(AlertType.ALERT_ANDROID_VERSION_LOW, ZcodeConstants.ZCODE_OS_VERSION_LOW);
        } else if (check == EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA) {
            this.l.alert(AlertType.ALERT_NO_FRONT_CAMERA, ZcodeConstants.ZCODE_NO_FRANT_CAMERA);
        } else if (check == EnvErrorType.ENV_ERROR_NO_PERMISSION_OF_CAMERA) {
            this.l.alert(AlertType.ALERT_NO_PERMISSION_OF_CAMERA, ZcodeConstants.ZCODE_NO_CAMERA_PERMISSION);
        } else if (check != EnvErrorType.ENV_ERROR_UNSUPPORTED_CPU) {
        } else {
            this.l.alert(AlertType.ALERT_UNSUPPORTED_CPU, ZcodeConstants.ZCODE_UNSUPPORTED_CPU);
        }
    }

    public void responseWithCode(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ace39bc", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        BioLog.w("ToygerWorkspace", "responseWithCode(error=" + i + riy.BRACKET_END_STR);
        ToygerFrame toygerFrame = this.s;
        if (toygerFrame != null) {
            a(toygerFrame, false, this.S, this.T);
        } else {
            a((ToygerFrame) null, false, false, this.T);
        }
        UploadManager uploadManager = this.v;
        if (uploadManager != null) {
            if (i == 203) {
                uploadManager.uploadNineShoot(InvokeType.TIMEOUT, false);
            } else if (i == 202) {
                uploadManager.uploadNineShoot(InvokeType.CANCEL, false);
            } else {
                uploadManager.uploadNineShoot(InvokeType.INTERRUPT, false);
            }
        }
        Button a2 = a();
        if (a2 != null) {
            a2.setClickable(false);
        }
        commandFinished();
        ToygerCallback toygerCallback = this.h;
        if (toygerCallback == null) {
            return;
        }
        toygerCallback.finishActivity(false);
        this.h.sendResponse(i, str, str2);
    }

    public void responseWithCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fb8872", new Object[]{this, new Integer(i), str});
        } else {
            responseWithCode(i, str, "");
        }
    }

    public boolean ontActivityEvent(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e35f93a", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return false;
        }
        if (this.b || this.k.hasMessages(2) || this.k.hasMessages(1)) {
            z = true;
        }
        if (!z) {
            this.l.alert(AlertType.ALERT_BACK, ZcodeConstants.ZCODE_USER_BACK);
            SoundUtils.stop();
        }
        return true;
    }

    public void pauseToygerFaceService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e329b3", new Object[]{this});
            return;
        }
        this.G = WorkState.PAUSE;
        this.O = true;
    }

    private void a(CameraData cameraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bc2303", new Object[]{this, cameraData});
        } else if (this.t == null || cameraData == null) {
        } else {
            final Bitmap bytes2Bitmap = BitmapHelper.bytes2Bitmap(cameraData.getColorData().array(), this.t.width, this.t.height, this.t.frameMode);
            Bitmap bitmap = null;
            if (this.t.rotation == 0) {
                ICameraInterface iCameraInterface = this.F;
                if (iCameraInterface != null && iCameraInterface.isMirror()) {
                    BioLog.d("showLastFrame(), isMirror=true");
                } else {
                    BioLog.d("showLastFrame(), call reverseBitmap(bitmap, 0)");
                    bitmap = BitmapHelper.flipBitmap(bytes2Bitmap, 0);
                }
            } else {
                BioLog.d("showLastFrame(), call getVerticalRotateBitmap(bitmap, " + this.t.rotation + riy.BRACKET_END_STR);
                bitmap = RotateBitmapHelper.getVerticalRotateBitmap(bytes2Bitmap, (float) this.t.rotation);
            }
            if (bitmap != null) {
                bytes2Bitmap = bitmap;
            }
            Handler handler = this.k;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Bitmap createBitmap;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (ToygerWorkspace.f(ToygerWorkspace.this) == null || bytes2Bitmap == null) {
                            return;
                        }
                        if (ToygerWorkspace.g(ToygerWorkspace.this) == null || ToygerWorkspace.g(ToygerWorkspace.this).getRemoteConfig() == null || ToygerWorkspace.g(ToygerWorkspace.this).getRemoteConfig().getColl() == null || !"sys".equals(ToygerWorkspace.g(ToygerWorkspace.this).getRemoteConfig().getColl().getPreviewStyle())) {
                            createBitmap = Bitmap.createBitmap(bytes2Bitmap, 0, (bytes2Bitmap.getHeight() - bytes2Bitmap.getWidth()) / 2, bytes2Bitmap.getWidth(), bytes2Bitmap.getWidth());
                            bytes2Bitmap.recycle();
                        } else {
                            createBitmap = bytes2Bitmap;
                        }
                        ToygerWorkspace.f(ToygerWorkspace.this).getGuassianBackground().setVisibility(0);
                        ToygerWorkspace.f(ToygerWorkspace.this).getGuassianBackground().setBackgroundDrawable(new BitmapDrawable(ToygerWorkspace.h(ToygerWorkspace.this).getBioApplicationContext().getResources(), createBitmap));
                    } catch (Throwable th) {
                        BioLog.e(th);
                    }
                }
            });
        }
    }

    public void alertRecord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae15f9e", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f6338a.write(ToygerRecordService.ALERT_APPEAR, hashMap);
    }

    public void alertClickRecord(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcce8618", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str2);
        hashMap.put("choose", str);
        this.f6338a.write(ToygerRecordService.ALERT_CHOOSE, hashMap);
    }

    public void showFaceStatus(ToygerFrame toygerFrame) {
        String topText_no_face;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bced7d5", new Object[]{this, toygerFrame});
        } else if (toygerFrame == null || toygerFrame.frameType != FrameType.STATE) {
        } else {
            String charSequence = this.i.getFaceTopTip().getText().toString();
            if (toygerFrame.tgFaceState.staticMessage == 1) {
                this.i.getFaceTopTip().setText(this.c.getString(R.string.top_tip_blink));
            } else {
                this.i.getFaceTopTip().setText(this.c.getString(R.string.top_tip_normal));
            }
            String charSequence2 = this.i.getFaceTopTip().getText().toString();
            if (charSequence != charSequence2 && a(this.c)) {
                Toast.makeText(this.c, charSequence2, 0).show();
            }
            this.i.setTopTipViewsetVisibility(0);
            this.i.setMaskViewsetVisibility(0);
            int i = toygerFrame.tgFaceState.messageCode;
            switch (i) {
                case 1:
                    topText_no_face = this.r.getTopText_no_face();
                    break;
                case 2:
                    topText_no_face = this.r.getTopText_distance_too_far();
                    break;
                case 3:
                    topText_no_face = this.r.getTopText_distance_too_close();
                    break;
                case 4:
                    topText_no_face = this.r.getTopText_face_not_in_center();
                    break;
                case 5:
                    topText_no_face = this.r.getTopText_bad_pitch();
                    break;
                case 6:
                    topText_no_face = this.r.getTopText_bad_yaw();
                    break;
                case 7:
                    topText_no_face = this.r.getTopText_is_moving();
                    break;
                case 8:
                    topText_no_face = this.r.getTopText_bad_brightness();
                    break;
                case 9:
                    topText_no_face = this.r.getTopText_bad_quality();
                    break;
                case 10:
                    topText_no_face = this.r.getTopText_bad_eye_openness();
                    break;
                case 11:
                    topText_no_face = this.r.getTopText_blink_openness();
                    break;
                case 12:
                    topText_no_face = this.r.getTopText_stack_time();
                    break;
                default:
                    topText_no_face = this.r.getTopText();
                    break;
            }
            BioLog.d("TOYGER_FLOW_ANDROID", "prompt=" + topText_no_face + ", messageCode=" + i);
            if (toygerFrame.tgFaceState.hasFace && !this.p) {
                this.p = true;
                this.f6338a.write(ToygerRecordService.DETECT_COND_END, ToygerFrameUtil.getFaceParam(toygerFrame.tgFaceAttr));
            }
            if (TextUtils.isEmpty(topText_no_face)) {
                this.i.setTopTipViewsetVisibility(4);
                this.i.setMaskViewsetVisibility(4);
                this.i.getTopTip().setText("");
            } else if (this.i.getTopTip().getText() != topText_no_face) {
                if (a(this.c)) {
                    Toast.makeText(this.c, topText_no_face, 0).show();
                }
                this.i.getTopTip().setText(topText_no_face);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("content", topText_no_face);
            HashMap<String, String> objectToStringMap = ObjectUtil.objectToStringMap(toygerFrame.tgFaceAttr);
            if (objectToStringMap != null && !objectToStringMap.isEmpty()) {
                hashMap.putAll(objectToStringMap);
            }
            this.f6338a.write("actionPrompt", hashMap);
        }
    }

    private boolean a(Context context) {
        AccessibilityManager accessibilityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } catch (Exception unused) {
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public void startTimerTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fee0af", new Object[]{this});
            return;
        }
        BioLog.i("ToygerAndroid startTimerTask");
        this.y = true;
        this.ak = false;
        this.q = false;
        if (this.ab && this.ac) {
            this.z.handleLocalMatchingEvent(2);
            this.ac = false;
        }
        int i = 20;
        final FaceRemoteConfig remoteConfig = this.h.getRemoteConfig();
        if (remoteConfig != null && remoteConfig.getColl() != null) {
            i = remoteConfig.getColl().getTime();
            a((int) remoteConfig.getColl().getQuitTime());
        }
        int i2 = i * 1000;
        this.m = new DetectTimerTask(i2);
        this.m.setTimerTaskListener(new DetectTimerTask.TimerListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
            @Override // com.alipay.mobile.security.faceauth.model.DetectTimerTask.TimerListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void countdown(final int r8) {
                /*
                    Method dump skipped, instructions count: 270
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.AnonymousClass17.countdown(int):void");
            }
        });
        this.x = new DetectTimerTask(i2, 0, w);
        this.x.setTimerTaskListener(new DetectTimerTask.TimerListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.18
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b = 0;

            @Override // com.alipay.mobile.security.faceauth.model.DetectTimerTask.TimerListener
            public void countdown(int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e055fcb", new Object[]{this, new Integer(i3)});
                } else if (i3 <= 0) {
                } else {
                    if (ToygerWorkspace.l(ToygerWorkspace.this) != null && this.b % 5 == 0) {
                        ToygerWorkspace toygerWorkspace = ToygerWorkspace.this;
                        ToygerWorkspace.a(toygerWorkspace, ToygerWorkspace.l(toygerWorkspace));
                    }
                    this.b++;
                }
            }
        });
        this.m.start();
        this.x.start();
    }

    private void a(ToygerFrame toygerFrame) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf133ea", new Object[]{this, toygerFrame});
            return;
        }
        if (this.X != 0) {
            str = (this.X - this.W) + "";
            TimeRecord.getInstance().setAlgoInitTime(this.X - this.W);
        } else {
            str = "";
        }
        synchronized (this.Y) {
            int min = Math.min(this.Y.size() - 1, 100);
            str2 = "";
            int i = 0;
            while (i < min) {
                int i2 = i + 1;
                if (this.Y.size() > i2 && this.Y.get(i2).longValue() - this.Y.get(i).longValue() < 5000) {
                    str2 = str2 + (this.Y.get(i2).longValue() - this.Y.get(i).longValue()) + "";
                    if (i != min - 1) {
                        str2 = str2 + ",";
                    }
                }
                i = i2;
            }
            this.Y.clear();
        }
        synchronized (this.Z) {
            int min2 = Math.min(this.Z.size(), 100);
            str3 = "";
            for (int i3 = 0; i3 < min2; i3++) {
                str3 = str3 + this.Z.get(i3) + "";
                if (i3 != min2 - 1) {
                    str3 = str3 + ",";
                }
            }
            this.Z.clear();
        }
        this.e = -1L;
        Map<String, String> faceParam = ToygerFrameUtil.getFaceParam(toygerFrame, str, str2, str3);
        BioLog.i("ToygerAndroidadasstopTimerTask:" + str2);
        this.f6338a.write(ToygerRecordService.FACE_SLICE, faceParam);
    }

    private void a(ToygerFrame toygerFrame, boolean z, boolean z2, boolean z3) {
        Map<String, String> hashMap;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbdf42a", new Object[]{this, toygerFrame, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (z && !f()) {
        } else {
            if (toygerFrame != null) {
                hashMap = ToygerFrameUtil.getFaceParam(toygerFrame);
            } else {
                hashMap = new HashMap<>();
            }
            hashMap.put("toygerResult", Boolean.toString(z));
            if (z) {
                i = 0;
            } else if (!z2) {
                i = 1;
            }
            hashMap.put("result", Integer.toString(i));
            hashMap.put("hasBlined", Boolean.toString(z3));
            hashMap.put("livebodyScore", this.V);
            hashMap.put("synUploadBlobSize", "" + this.U);
            if (TimeRecord.getInstance() != null && TimeRecord.getInstance().getLivebodyEndTime() > 0) {
                hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - TimeRecord.getInstance().getLivebodyEndTime()));
            }
            float f = this.D;
            hashMap.put("backBrightness", f > 0.0f ? String.valueOf(f) : "NULL");
            hashMap.put("frameTotal", this.af + "");
            hashMap.put("frameMissInit", this.ag + "");
            hashMap.put("frameMissProcess", this.ah + "");
            hashMap.put("frameHitProcess", this.ai + "");
            this.f6338a.write(ToygerRecordService.IMAGE_CAPTURE_END, hashMap);
        }
    }

    private void b(ToygerFrame toygerFrame) {
        Map<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526b5a2b", new Object[]{this, toygerFrame});
        } else if (!f()) {
        } else {
            if (toygerFrame != null) {
                hashMap = ToygerFrameUtil.getFaceParam(toygerFrame);
            } else {
                hashMap = new HashMap<>();
            }
            if (TimeRecord.getInstance() != null && TimeRecord.getInstance().getAlgoInitTime() > 0 && TimeRecord.getInstance().getImageCaptureStartTime() > 0) {
                hashMap.put("elapsedTime", "" + ((System.currentTimeMillis() - TimeRecord.getInstance().getImageCaptureStartTime()) - TimeRecord.getInstance().getAlgoInitTime()));
            }
            TimeRecord.getInstance().setFaceImageDetectEndTime(System.currentTimeMillis());
            this.f6338a.write(ToygerRecordService.FACE_DETECT_END, hashMap);
        }
    }

    public void stopTimerTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96810f", new Object[]{this});
        } else {
            this.k.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioLog.i("ToygerAndroid stopTimerTask");
                    ToygerWorkspace.b(ToygerWorkspace.this, true);
                    if (ToygerWorkspace.n(ToygerWorkspace.this) && !ToygerWorkspace.o(ToygerWorkspace.this) && ToygerWorkspace.p(ToygerWorkspace.this) != null) {
                        ToygerWorkspace.p(ToygerWorkspace.this).handleLocalMatchingEvent(1);
                        ToygerWorkspace.c(ToygerWorkspace.this, true);
                    }
                    try {
                        if (ToygerWorkspace.i(ToygerWorkspace.this) != null) {
                            ToygerWorkspace.i(ToygerWorkspace.this).setTimerTaskListener(null);
                            ToygerWorkspace.i(ToygerWorkspace.this).stop();
                            ToygerWorkspace.a(ToygerWorkspace.this, (DetectTimerTask) null);
                        }
                        if (ToygerWorkspace.q(ToygerWorkspace.this) == null) {
                            return;
                        }
                        ToygerWorkspace.q(ToygerWorkspace.this).setTimerTaskListener(null);
                        ToygerWorkspace.q(ToygerWorkspace.this).stop();
                        ToygerWorkspace.b(ToygerWorkspace.this, (DetectTimerTask) null);
                    } catch (Exception e) {
                        BioLog.w(e);
                    }
                }
            });
        }
    }

    public ToygerFaceService getToygerFaceService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerFaceService) ipChange.ipc$dispatch("3517268d", new Object[]{this}) : this.z;
    }

    public void setHasCameraPermissionFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1816ed5", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public GuidType getGuidType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GuidType) ipChange.ipc$dispatch("2d6fa84", new Object[]{this}) : this.f;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.aj = new SensorCollector(this.c);
        this.aj.setSensorCollectorListener(this);
    }

    @Override // com.alipay.zoloz.toyger.sensors.SensorCollectorListener
    public void onSensorChanged(int i, float[] fArr, long j) {
        TGSensorFrame tGSensorFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2321fa78", new Object[]{this, new Integer(i), fArr, new Long(j)});
            return;
        }
        if (i == 0) {
            tGSensorFrame = new TGSensorFrame(fArr, null, null, j / 1000);
        } else {
            tGSensorFrame = i != 1 ? null : new TGSensorFrame(null, null, fArr, 0L);
        }
        ToygerFaceService toygerFaceService = this.z;
        if (toygerFaceService == null || tGSensorFrame == null || this.ak) {
            return;
        }
        toygerFaceService.processSensorData(tGSensorFrame);
    }

    public void uploadFaceInfo() {
        ToygerFrame toygerFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6d853", new Object[]{this});
            return;
        }
        UploadManager uploadManager = this.v;
        if (uploadManager == null || (toygerFrame = this.s) == null) {
            return;
        }
        uploadManager.uploadFaceInfo(toygerFrame);
    }

    private void a(boolean z, SwitchAuthCfg switchAuthCfg, TextView textView) {
        IpChange ipChange = $ipChange;
        final boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4e6bf", new Object[]{this, new Boolean(z), switchAuthCfg, textView});
        } else if (textView == null) {
        } else {
            if (z || switchAuthCfg == null) {
                z2 = false;
            }
            if (z2) {
                String message = switchAuthCfg.getMessage();
                if (TextUtils.isEmpty(message)) {
                    message = this.c.getResources().getString(R.string.face_eye_other_auth);
                }
                textView.setText(message);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerWorkspace.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    BioLog.w("ToygerWorkspace", "enableOtherMode--Choose other manner");
                    if (ToygerWorkspace.this.f6338a != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("content", z2 ? "换个方式登录" : "选择其他验证方式");
                        ToygerWorkspace.this.f6338a.write("clickButton", hashMap);
                    }
                    ToygerWorkspace.this.responseWithCode(z2 ? 305 : 303, ZcodeConstants.ZCODE_USER_BACK);
                }
            });
            textView.setVisibility(0);
        }
    }

    private DeviceSetting[] a(com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting[] deviceSettingArr, Coll coll) {
        DeviceSetting[] deviceSettingArr2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (DeviceSetting[]) ipChange.ipc$dispatch("6610606b", new Object[]{this, deviceSettingArr, coll});
        }
        if (deviceSettingArr != null && deviceSettingArr.length > 0) {
            deviceSettingArr2 = new DeviceSetting[deviceSettingArr.length];
            for (int i = 0; i < deviceSettingArr.length; i++) {
                DeviceSetting deviceSetting = new DeviceSetting();
                deviceSetting.setAlgorithmAngle(deviceSettingArr[i].getAlgorithmAngle());
                deviceSetting.setAlgorithmAuto(deviceSettingArr[i].isAlgorithmAuto());
                deviceSetting.setCameraAuto(deviceSettingArr[i].isCameraAuto());
                deviceSetting.setCameraID(deviceSettingArr[i].getCameraID());
                deviceSetting.setDisplayAngle(deviceSettingArr[i].getDisplayAngle());
                deviceSetting.setDisplayAuto(deviceSettingArr[i].isDisplayAuto());
                deviceSetting.setMaxApiLevel(deviceSettingArr[i].getMaxApiLevel());
                deviceSetting.setMinApiLevel(deviceSettingArr[i].getMinApiLevel());
                deviceSetting.setAutoFaceFocus(coll.isUseAutoFaceFocus());
                deviceSetting.setCameraRatio(coll.getCameraRatio());
                deviceSetting.setWidthAuto(coll.getCameraResolution() == 0);
                deviceSetting.setWidth(coll.getCameraResolution());
                deviceSetting.setBeauty(coll.isBeauty());
                deviceSetting.setHookCheck(coll.checkHook());
                deviceSettingArr2[i] = deviceSetting;
            }
        } else {
            deviceSettingArr2 = new DeviceSetting[]{new DeviceSetting()};
            DeviceSetting deviceSetting2 = deviceSettingArr2[0];
            if (coll.getCameraResolution() != 0) {
                z = false;
            }
            deviceSetting2.setWidthAuto(z);
            deviceSettingArr2[0].setWidth(coll.getCameraResolution());
            deviceSettingArr2[0].setBeauty(coll.isBeauty());
            deviceSettingArr2[0].setAutoFaceFocus(coll.isUseAutoFaceFocus());
            deviceSettingArr2[0].setCameraRatio(coll.getCameraRatio());
            deviceSettingArr2[0].setHookCheck(coll.checkHook());
        }
        return deviceSettingArr2;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.I.isAlgorithmAuto()) {
            ICameraInterface iCameraInterface = this.F;
            if (iCameraInterface != null) {
                i = iCameraInterface.getCameraViewRotation();
                BioLog.w("calculateAlgorithAngle() : mCameraInterface.getCameraViewRotation()=" + i);
                if (!m()) {
                    i = (360 - i) % 360;
                }
            }
            this.J = i;
            BioLog.w("calculateAlgorithAngle() : mAlgorithAngle=" + this.J);
        } else {
            this.J = this.I.getAlgorithmAngle();
            BioLog.w("calculateAlgorithAngle() : mAlgorithAngle=" + this.J);
        }
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        DeviceSetting deviceSetting = this.I;
        if (deviceSetting == null || deviceSetting.isCameraAuto() || this.I.getCameraID() != 0) {
            z = false;
        }
        BioLog.w("checkIsBackCamera() : backCamera=" + z);
        return z;
    }
}
