package com.taobao.android.artry.tblife;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.WebViewContainer;
import com.taobao.android.artry.dycontainer.b;
import com.taobao.android.artry.resource.e;
import com.taobao.android.artry.utils.d;
import com.taobao.android.litecreator.util.al;
import com.taobao.android.nav.Nav;
import com.taobao.android.tb3dspace.arskindetect.artryImpl.Person3DTakePhotoImpl;
import com.taobao.android.tb3dspace.arskindetect.artryImpl.RealPersonTakePhotoImpl;
import com.taobao.android.tb3dspace.camera.BasicCameraSession;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.runtimepermission.f;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cal;
import tb.kge;

/* loaded from: classes4.dex */
public class WVARCameraView extends BaseEmbedView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AR_CAMERA_WV_PLUGIN_TYPE = "WVARCamera";
    public static final String AR_CAMERA_WV_VIEW_TYPE = "wvarcamera";
    private static final String INIT_ACTIVE_KEY = "active";
    private static final String INIT_BIZID_KEY = "bizid";
    private static final String INIT_CONFIG_KEY = "config";
    private static final String INIT_DEVICE_POSITION = "devicePosition";
    private static final int REQUEST_CODE_GET_ALBUM_4_DECODE = 1;
    private static final String TAG = "WVARCameraView";
    private Activity mActivity;
    private int mCameraId;
    private boolean mIsCreateAREngine;
    private boolean mIsInAlbumMode;
    private JSONObject mPendingConfigJson;
    private Person3DTakePhotoImpl mPerson3DTakePhoto;
    private Bitmap mPictureFromAlbum;
    private RealPersonTakePhotoImpl mRealPersonTakePhoto;
    private FrameLayout mRootView;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private WebViewContainer mWebViewContainer;
    private boolean mIsFrontCamera = true;
    private String mCurrentType = "";

    static {
        kge.a(138629639);
        kge.a(302583095);
    }

    public static /* synthetic */ Object ipc$super(WVARCameraView wVARCameraView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : AR_CAMERA_WV_VIEW_TYPE;
    }

    public static /* synthetic */ void access$000(WVARCameraView wVARCameraView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dbd7f", new Object[]{wVARCameraView, new Boolean(z), new Boolean(z2)});
        } else {
            wVARCameraView.realSetUpEnglne(z, z2);
        }
    }

    public static /* synthetic */ void access$100(WVARCameraView wVARCameraView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c578703", new Object[]{wVARCameraView, new Integer(i)});
        } else {
            wVARCameraView.sendPreloadEvent(i);
        }
    }

    public static /* synthetic */ boolean access$1000(WVARCameraView wVARCameraView, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3743d12", new Object[]{wVARCameraView, strArr, strArr2})).booleanValue() : wVARCameraView.checkChangedParam(strArr, strArr2);
    }

    public static /* synthetic */ void access$200(WVARCameraView wVARCameraView, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523d639d", new Object[]{wVARCameraView, new Boolean(z), jSONObject});
        } else {
            wVARCameraView.sendSetupAREngineResult(z, jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$300(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("731339a2", new Object[]{wVARCameraView}) : wVARCameraView.mPendingConfigJson;
    }

    public static /* synthetic */ JSONObject access$302(WVARCameraView wVARCameraView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7489fd0c", new Object[]{wVARCameraView, jSONObject});
        }
        wVARCameraView.mPendingConfigJson = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Activity access$400(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("be8a76c5", new Object[]{wVARCameraView}) : wVARCameraView.mActivity;
    }

    public static /* synthetic */ void access$600(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11c1645", new Object[]{wVARCameraView});
        } else {
            wVARCameraView.notifyFailedToOpenAlbum();
        }
    }

    public static /* synthetic */ Bitmap access$702(WVARCameraView wVARCameraView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6467184", new Object[]{wVARCameraView, bitmap});
        }
        wVARCameraView.mPictureFromAlbum = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$800(WVARCameraView wVARCameraView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ae0587", new Object[]{wVARCameraView, new Boolean(z), new Boolean(z2)});
        } else {
            wVARCameraView.setupAREngine(z, z2);
        }
    }

    public static /* synthetic */ boolean access$902(WVARCameraView wVARCameraView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a415b0e", new Object[]{wVARCameraView, new Boolean(z)})).booleanValue();
        }
        wVARCameraView.mIsInAlbumMode = z;
        return z;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        this.mActivity = (Activity) context;
        this.mRootView = new FrameLayout(this.mActivity);
        this.mWebViewContainer = new WebViewContainer(this.webView);
        this.mWebViewContainer.a(this);
        WVStandardEventCenter.postNotificationToJS(this.webView, "ARCamera_Mounted", new JSONObject().toJSONString());
        return this.mRootView;
    }

    private void setupAREngine(final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e39d097", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (d.c()) {
            realSetUpEnglne(z, z2);
        } else if (this.mTb3dSpaceInstallReceiver != null) {
        } else {
            this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.android.artry.tblife.WVARCameraView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null) {
                    } else {
                        WVARCameraView.access$000(WVARCameraView.this, z, z2);
                    }
                }
            };
            LocalBroadcastManager.getInstance(this.mActivity).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            Nav.from(this.mActivity).toUri("https://go/installxrspace3d");
        }
    }

    private void realSetUpEnglne(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        final boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c519044b", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mIsInAlbumMode = z;
        if (this.params == null || this.params.mObjectParam == null) {
            return;
        }
        Object obj = this.params.mObjectParam.get("active");
        Object obj2 = this.params.mObjectParam.get(INIT_DEVICE_POSITION);
        if (obj2 == null || !StringUtils.equals(obj2.toString(), "back")) {
            z3 = true;
        }
        StringUtils.isEmpty(this.mCurrentType);
        final Object obj3 = this.params.mObjectParam.get("config");
        try {
            this.mCurrentType = (String) obj3;
        } catch (Throwable unused) {
        }
        if ("0".equals(obj)) {
            this.mCurrentType = null;
            Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
            if (person3DTakePhotoImpl != null) {
                person3DTakePhotoImpl.pause();
            }
            RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
            if (realPersonTakePhotoImpl != null) {
                realPersonTakePhotoImpl.pause();
            }
        }
        if ("facedetection2d".equals(this.mCurrentType)) {
            TB3DSpace.initSkinDetect(new cal() { // from class: com.taobao.android.artry.tblife.-$$Lambda$WVARCameraView$sjEyIItKg3x1cKxIx5L_6fCc1Oo
                @Override // tb.cal
                public final void onComplete(boolean z4, org.json.JSONObject jSONObject) {
                    WVARCameraView.this.lambda$realSetUpEnglne$1$WVARCameraView(obj3, z3, z4, jSONObject);
                }
            });
        } else if ("facedetection3d".equals(this.mCurrentType)) {
            TB3DSpace.initSkinDetect(new cal() { // from class: com.taobao.android.artry.tblife.-$$Lambda$WVARCameraView$CDlOX2_339E2MZiAGueIHimT-CU
                @Override // tb.cal
                public final void onComplete(boolean z4, org.json.JSONObject jSONObject) {
                    WVARCameraView.this.lambda$realSetUpEnglne$3$WVARCameraView(z3, z4, jSONObject);
                }
            });
        }
        this.mIsCreateAREngine = true;
        this.mIsFrontCamera = z3;
        this.mRootView.post(new Runnable() { // from class: com.taobao.android.artry.tblife.WVARCameraView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WVARCameraView.access$100(WVARCameraView.this, 0);
                WVARCameraView.access$100(WVARCameraView.this, 100);
                WVARCameraView.access$200(WVARCameraView.this, true, new JSONObject());
            }
        });
    }

    public /* synthetic */ void lambda$realSetUpEnglne$1$WVARCameraView(final Object obj, final boolean z, boolean z2, org.json.JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1123cdc7", new Object[]{this, obj, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (!z2 || (frameLayout = this.mRootView) == null) {
        } else {
            frameLayout.post(new Runnable() { // from class: com.taobao.android.artry.tblife.-$$Lambda$WVARCameraView$UaAIVQ49DGiA5QETcqvR-l9zU04
                {
                    WVARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WVARCameraView.this.lambda$null$0$WVARCameraView(obj, z);
                }
            });
        }
    }

    public /* synthetic */ void lambda$null$0$WVARCameraView(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf8f4c1", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        if (this.mRealPersonTakePhoto == null) {
            Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
            if (person3DTakePhotoImpl != null) {
                person3DTakePhotoImpl.onDestroy();
                this.mPerson3DTakePhoto = null;
            }
            this.mRealPersonTakePhoto = new RealPersonTakePhotoImpl(this.mActivity);
            this.mRealPersonTakePhoto.initSkinDetectView(this.mRootView);
            this.mRealPersonTakePhoto.setWebView(this.webView);
            this.mRealPersonTakePhoto.setCurrentType(obj.toString());
        }
        this.mCameraId = z ? 1 : 0;
        this.mRealPersonTakePhoto.resumeCamera(this.mCameraId);
    }

    public /* synthetic */ void lambda$realSetUpEnglne$3$WVARCameraView(final boolean z, boolean z2, org.json.JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70390321", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (!z2 || (frameLayout = this.mRootView) == null) {
        } else {
            frameLayout.post(new Runnable() { // from class: com.taobao.android.artry.tblife.-$$Lambda$WVARCameraView$OgvTl413dBC15HFY3oVlyu2_uVE
                {
                    WVARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WVARCameraView.this.lambda$null$2$WVARCameraView(z);
                }
            });
        }
    }

    public /* synthetic */ void lambda$null$2$WVARCameraView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6647ca9b", new Object[]{this, new Boolean(z)});
            return;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            realPersonTakePhotoImpl.destroy();
            this.mRealPersonTakePhoto = null;
        }
        if (this.mPerson3DTakePhoto == null) {
            this.mPerson3DTakePhoto = new Person3DTakePhotoImpl(this.mRootView, this.mActivity);
            this.mPerson3DTakePhoto.mWebView = this.webView;
        }
        this.mCameraId = z ? 1 : 0;
        this.mPerson3DTakePhoto.resumeCamera(this.mCameraId);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        } else {
            checkChangedParam(strArr, strArr2);
        }
    }

    private boolean checkChangedParam(String[] strArr, String[] strArr2) {
        String[] strArr3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38b4370c", new Object[]{this, strArr, strArr2})).booleanValue();
        }
        if (strArr == null || strArr2 == null) {
            return false;
        }
        boolean z = false;
        for (String str : new String[]{INIT_DEVICE_POSITION, "active", "config", "bizid"}) {
            int paramIndex = getParamIndex(str, strArr);
            if (paramIndex >= 0 && paramIndex < strArr2.length) {
                this.params.mObjectParam.put(str, strArr2[paramIndex]);
                z = true;
            }
        }
        if (z) {
            setupAREngine(this.mIsInAlbumMode, false);
        }
        return z;
    }

    private int getParamIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7e54d06", new Object[]{this, str, strArr})).intValue();
        }
        if (!StringUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            int i = -1;
            for (String str2 : strArr) {
                i++;
                if (StringUtils.equals(str2, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.taobao.android.artry.dycontainer.b
    public boolean onAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5683d51", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, "preloadResource")) {
            setupAREngine(this.mIsInAlbumMode, true);
            return true;
        } else if (!this.mIsCreateAREngine) {
            return false;
        } else {
            final JSONObject jSONObject = null;
            try {
                jSONObject = JSONObject.parseObject(str2);
            } catch (Throwable unused) {
            }
            if (StringUtils.equals(str, "takePhoto")) {
                innerTakePicture(jSONObject);
                return true;
            } else if (StringUtils.equals(str, "snapshot") && jSONObject != null) {
                innerTakePicture(jSONObject);
                return true;
            } else if (!StringUtils.equals(str, "choosePhotoLibrary")) {
                return false;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    strArr = new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VIDEO};
                } else {
                    strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
                }
                f.a(this.webView.getContext(), strArr).a("当您使用相册时需要用到读取权限").a(new Runnable() { // from class: com.taobao.android.artry.tblife.WVARCameraView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            WVARCameraView.access$302(WVARCameraView.this, jSONObject);
                        }
                    }
                }).b(new Runnable() { // from class: com.taobao.android.artry.tblife.WVARCameraView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(WVARCameraView.this.getContext(), "请打开相册权限...", 0).show();
                        }
                    }
                }).a();
                return true;
            }
        }
    }

    private void innerTakePicture(JSONObject jSONObject) {
        BasicCameraSession cameraSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8895a8", new Object[]{this, jSONObject});
            return;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            cameraSession = realPersonTakePhotoImpl.getFaceDetect2DGlSurfaceView().getCameraSession();
        } else {
            cameraSession = this.mPerson3DTakePhoto.getFaceDetect2DGlSurfaceView().getCameraSession();
        }
        if (cameraSession == null) {
            return;
        }
        cameraSession.takePhoto(new Camera.PictureCallback() { // from class: com.taobao.android.artry.tblife.WVARCameraView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a4928df", new Object[]{this, bArr, camera});
                } else if (bArr == null) {
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    Bitmap a2 = d.a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -90);
                    jSONObject2.put("base64", (Object) d.a(a2));
                    HashMap hashMap = new HashMap();
                    hashMap.put("output_video", a2);
                    List<e> a3 = d.a(false, false, "tblife", WVARCameraView.access$400(WVARCameraView.this), hashMap);
                    if (!d.a(a3)) {
                        String d = a3.get(0).d();
                        String e = a3.get(0).e();
                        if (d.a(d)) {
                            jSONObject2.put("url", (Object) d);
                            jSONObject2.put("frame_oss_key", (Object) e);
                        }
                    }
                    WVStandardEventCenter.postNotificationToJS(WVARCameraView.this.webView, "ARCamera_TakePhoto", jSONObject2.toString());
                    a2.recycle();
                }
            }
        });
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 1) {
        } else {
            if (i2 != -1) {
                notifyFailedToOpenAlbum();
                return;
            }
            new a().execute(d.a(this.mActivity, intent.getData()));
        }
    }

    private void notifyFailedToOpenAlbum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37933cb", new Object[]{this});
        } else {
            Toast.makeText(this.mActivity.getApplicationContext(), "从相册读取照片失败...", 0).show();
        }
    }

    private void sendSetupAREngineResult(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6ba888", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = z ? "ARCamera_Init" : "ARCamera_Error";
        if (!z) {
            jSONObject2.putAll(jSONObject);
        }
        WVStandardEventCenter.postNotificationToJS(this.webView, str, jSONObject2.toString());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.resumeCamera(this.mCameraId);
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl == null) {
            return;
        }
        realPersonTakePhotoImpl.resumeCamera(this.mCameraId);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.pause();
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl == null) {
            return;
        }
        realPersonTakePhotoImpl.pause();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCurrentType = "";
        LocalBroadcastManager.getInstance(this.mActivity).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        WebViewContainer webViewContainer = this.mWebViewContainer;
        if (webViewContainer != null) {
            webViewContainer.e();
        }
        this.mActivity = null;
        Bitmap bitmap = this.mPictureFromAlbum;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mPictureFromAlbum.recycle();
            this.mPictureFromAlbum = null;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.onDestroy();
            this.mPerson3DTakePhoto = null;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl == null) {
            return;
        }
        realPersonTakePhotoImpl.destroy();
        this.mRealPersonTakePhoto = null;
    }

    /* loaded from: classes4.dex */
    public class a extends AsyncTask<Pair<String, Integer>, Void, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1679836986);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.Bitmap, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Bitmap doInBackground(Pair<String, Integer>[] pairArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, pairArr}) : a(pairArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bitmap});
            } else {
                a(bitmap);
            }
        }

        public Bitmap a(Pair<String, Integer>... pairArr) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("c89e06b", new Object[]{this, pairArr});
            }
            if (pairArr != null && pairArr.length > 0) {
                String str = (String) pairArr[0].first;
                if (!StringUtils.isEmpty(str) && new File(str).exists()) {
                    try {
                        int attributeInt = new ExifInterface(str).getAttributeInt(android.support.media.ExifInterface.TAG_ORIENTATION, 1);
                        if (attributeInt == 3) {
                            i = 180;
                        } else if (attributeInt == 6) {
                            i = 90;
                        } else if (attributeInt == 8) {
                            i = 270;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, null);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                    if (createBitmap != decodeFile && !decodeFile.isRecycled()) {
                        decodeFile.recycle();
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(960.0f / createBitmap.getWidth(), 1280.0f / createBitmap.getHeight());
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, true);
                    if (createBitmap != createBitmap2 && !createBitmap.isRecycled()) {
                        createBitmap.recycle();
                    }
                    return createBitmap2;
                }
            }
            return null;
        }

        public void a(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                return;
            }
            if (bitmap == null) {
                WVARCameraView.access$600(WVARCameraView.this);
            }
            WVARCameraView.access$702(WVARCameraView.this, bitmap);
            if (d.a((Map) WVARCameraView.access$300(WVARCameraView.this))) {
                WVARCameraView.access$800(WVARCameraView.this, true, false);
                return;
            }
            try {
                String[] strArr = new String[WVARCameraView.access$300(WVARCameraView.this).size()];
                String[] strArr2 = new String[strArr.length];
                int i = 0;
                for (String str : WVARCameraView.access$300(WVARCameraView.this).keySet()) {
                    strArr[i] = str;
                    Object obj = WVARCameraView.access$300(WVARCameraView.this).get(str);
                    strArr2[i] = obj == null ? null : obj.toString();
                    i++;
                }
                WVARCameraView.access$902(WVARCameraView.this, true);
                if (WVARCameraView.access$1000(WVARCameraView.this, strArr, strArr2)) {
                    return;
                }
                WVARCameraView.access$800(WVARCameraView.this, true, false);
            } catch (Throwable unused) {
                WVARCameraView.access$800(WVARCameraView.this, true, false);
            }
        }
    }

    private void sendPreloadEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60c2143", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("progress", (Object) Float.valueOf(i / 100.0f));
        jSONObject.put("completion", (Object) true);
        WVStandardEventCenter.postNotificationToJS(this.webView, "ARCamera_PreloadResource", jSONObject.toString());
    }
}
