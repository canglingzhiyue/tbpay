package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.h;
import android.taobao.windvane.util.m;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.litecreator.util.al;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ado;
import tb.kge;

/* loaded from: classes2.dex */
public class WVCamera extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_IMAGE = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=";
    private static final String TAG = "WVCamera";
    public static int maxLength;
    private static String multiActivityClass;
    private static String uploadServiceClass;
    private a mParams;
    private android.taobao.windvane.view.a mPopupController;
    private d uploadService;
    private WVCallBackContext mCallback = null;
    private String mLocalPath = null;
    private long lastAccess = 0;
    private boolean useCN = false;
    private String[] mPopupMenuTags = {"拍照", "从相册选择"};
    public View.OnClickListener popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            WVCamera.access$400(WVCamera.this).a(true);
            r rVar = new r();
            if (WVCamera.access$500(WVCamera.this)[0].equals(view.getTag())) {
                WVCamera.access$600(WVCamera.this);
            } else if (WVCamera.access$500(WVCamera.this)[1].equals(view.getTag())) {
                WVCamera.access$700(WVCamera.this);
            } else {
                rVar.a("msg", "CANCELED_BY_USER");
                m.d(WVCamera.TAG, "take photo cancel, and callback.");
                WVCamera.access$800(WVCamera.this).error(rVar);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(WVCamera wVCamera, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$002(WVCamera wVCamera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3075c942", new Object[]{wVCamera, new Boolean(z)})).booleanValue();
        }
        wVCamera.isAlive = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(WVCamera wVCamera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ca1e83", new Object[]{wVCamera, new Boolean(z)})).booleanValue();
        }
        wVCamera.isAlive = z;
        return z;
    }

    public static /* synthetic */ void access$200(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3f3cd6", new Object[]{wVCamera});
        } else {
            wVCamera.openCamaraInternal();
        }
    }

    public static /* synthetic */ void access$300(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995abb75", new Object[]{wVCamera});
        } else {
            wVCamera.chosePhotoInternal();
        }
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$400(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.view.a) ipChange.ipc$dispatch("f27b1c16", new Object[]{wVCamera}) : wVCamera.mPopupController;
    }

    public static /* synthetic */ String[] access$500(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("8645e5c2", new Object[]{wVCamera}) : wVCamera.mPopupMenuTags;
    }

    public static /* synthetic */ void access$600(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ad3752", new Object[]{wVCamera});
        } else {
            wVCamera.openCamara();
        }
    }

    public static /* synthetic */ void access$700(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b5f1", new Object[]{wVCamera});
        } else {
            wVCamera.chosePhoto();
        }
    }

    public static /* synthetic */ WVCallBackContext access$800(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("ffb61b83", new Object[]{wVCamera}) : wVCamera.mCallback;
    }

    public static /* synthetic */ void access$900(WVCamera wVCamera, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a166e39", new Object[]{wVCamera, str, aVar});
        } else {
            wVCamera.takePhotoSuccess(str, aVar);
        }
    }

    static {
        kge.a(-348561710);
        maxLength = 1024;
        uploadServiceClass = null;
        multiActivityClass = null;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("takePhoto".equals(str)) {
            try {
                if (!j.commonConfig.aZ) {
                    requestCameraPermission(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            WVCamera.access$002(WVCamera.this, true);
                            WVCamera.this.takePhoto(wVCallBackContext, str2);
                        }
                    }, new i(wVCallBackContext, "NO_PERMISSION"));
                } else {
                    this.isAlive = true;
                    initTakePhoto(wVCallBackContext, str2);
                    if (this.mParams.q) {
                        takePhoto(wVCallBackContext, str2);
                    } else {
                        requestCameraPermission(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                WVCamera.access$102(WVCamera.this, true);
                                WVCamera.this.takePhoto(wVCallBackContext, str2);
                            }
                        }, new i(wVCallBackContext, "NO_PERMISSION"));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (!"confirmUploadPhoto".equals(str)) {
            return false;
        } else {
            confirmUploadPhoto(wVCallBackContext, str2);
        }
        return true;
    }

    public void takePhotoPlus(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a031fd", new Object[]{this, wVCallBackContext, str, str2});
        } else if (wVCallBackContext == null || str == null || str2 == null) {
            m.e(TAG, "takePhotoPlus fail, params error");
        } else {
            initTakePhoto(wVCallBackContext, str2);
            this.mLocalPath = str;
            zoomPicAndCallback(str, str, this.mParams);
        }
    }

    public synchronized void takePhoto(WVCallBackContext wVCallBackContext, String str) {
        View peekDecorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa3fb39", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!j.commonConfig.aZ) {
            initTakePhoto(wVCallBackContext, str);
        }
        if ((this.mContext instanceof Activity) && (peekDecorView = ((Activity) this.mContext).getWindow().peekDecorView()) != null) {
            ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
        if (BlobManager.BLOB_ELEM_TYPE_CAMERA.equals(this.mParams.i)) {
            openCamara();
        } else if (com.taobao.taobao.scancode.gateway.util.i.SOURCE_TYPE_PHOTO.equals(this.mParams.i)) {
            chosePhoto();
        } else {
            try {
                if (!android.taobao.windvane.util.e.c() && !this.useCN) {
                    this.mPopupMenuTags[0] = "Take pictures";
                    this.mPopupMenuTags[1] = "Select from album";
                }
                if (this.mPopupController == null) {
                    this.mPopupController = new android.taobao.windvane.view.a(this.mContext, this.mWebView.getView(), this.mPopupMenuTags, this.popupClickListener);
                }
                this.mPopupController.a();
            } catch (Exception e) {
                m.d(TAG, e.getMessage());
            }
        }
    }

    private void openCamara() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77106e12", new Object[]{this});
        } else if (!this.mParams.q || !j.commonConfig.aZ) {
            openCamaraInternal();
        } else {
            requestCameraPermission(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVCamera.access$200(WVCamera.this);
                    }
                }
            }, new i(this.mCallback, "NO_PERMISSION"));
        }
    }

    private void openCamaraInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1f276f", new Object[]{this});
        } else if (!isHasCamaraPermission()) {
            if (this.mCallback == null) {
                return;
            }
            r rVar = new r();
            rVar.a("msg", "NO_PERMISSION");
            this.mCallback.error(rVar);
        } else {
            m.b(TAG, "start to open system camera.");
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            a aVar = this.mParams;
            aVar.b = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
            String a2 = android.taobao.windvane.cache.a.a().a(true);
            if (a2 == null) {
                if (this.mCallback == null) {
                    return;
                }
                r rVar2 = new r();
                rVar2.a("msg", "NO_CACHEDIR");
                rVar2.a("CAMERA_OPEN_ERROR");
                this.mCallback.error(rVar2);
                return;
            }
            File file = new File(a2);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mLocalPath = a2 + File.separator + android.taobao.windvane.util.d.a(this.mParams.b);
            Uri a3 = android.taobao.windvane.file.c.a(this.mContext, new File(this.mLocalPath));
            if (a3 == null) {
                r rVar3 = new r();
                rVar3.a("msg", "image uri is null,check provider auth");
                rVar3.a("CAMERA_OPEN_ERROR");
                this.mCallback.error(rVar3);
                return;
            }
            intent.putExtra(NetConfig.OUPUT_KEY, a3);
            intent.putExtra("from", this.mWebView.hashCode());
            if (this.mContext instanceof Activity) {
                try {
                    ((Activity) this.mContext).startActivityForResult(intent, 4001);
                } catch (ActivityNotFoundException e) {
                    m.e(TAG, "activity not found " + android.taobao.windvane.util.a.a(e));
                }
            }
            Intent intent2 = new Intent("WVCameraFilter");
            intent2.putExtra("from-webview-id", this.mWebView.hashCode());
            LocalBroadcastManager.getInstance(android.taobao.windvane.config.a.f).sendBroadcast(intent2);
        }
    }

    private boolean isHasCamaraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8d10e8b", new Object[]{this})).booleanValue();
        }
        try {
            Camera.open().release();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void chosePhoto() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c90b89d", new Object[]{this});
        } else if (!this.mParams.q || !j.commonConfig.aZ) {
            chosePhotoInternal();
        } else if (j.commonConfig.cB && Build.VERSION.SDK_INT >= 34) {
            m.e(TAG, "don't request any permission above android 14.");
            chosePhotoInternal();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                strArr = new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VIDEO};
            } else {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            }
            android.taobao.windvane.runtimepermission.b.a(this.mContext, strArr).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVCamera.access$300(WVCamera.this);
                    }
                }
            }).b(new i(this.mCallback, "NO_PERMISSION")).b();
        }
    }

    private void chosePhotoInternal() {
        Intent intent;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1addb6fa", new Object[]{this});
            return;
        }
        if (j.commonConfig.cz && this.mWebView != null && this.mParams != null) {
            reportJSAPIParams("takePhoto", this.mWebView.getUrl(), this.mParams.j, this.mParams.i);
        }
        m.b(TAG, "start to pick photo from system album.");
        if ("1".equals(this.mParams.j)) {
            if (j.commonConfig.cC) {
                r rVar = new r();
                rVar.a("msg", "mutipleSelection is disabled.");
                this.mCallback.error(rVar);
                return;
            } else if (!this.mContext.getPackageName().equals("com.taobao.taobao")) {
                r rVar2 = new r();
                rVar2.a("msg", "mutipleSelection only support in taobao!");
                this.mCallback.error(rVar2);
                return;
            } else {
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setPackage(this.mContext.getPackageName());
                intent.setData(Uri.parse("taobao://go/ImgFileListActivity"));
                intent.putExtra("maxSelect", this.mParams.k);
                i = 4003;
            }
        } else {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            i = 4002;
        }
        if (!(this.mContext instanceof Activity)) {
            return;
        }
        try {
            ((Activity) this.mContext).startActivityForResult(intent, i);
            Intent intent2 = new Intent("WVCameraFilter");
            intent2.putExtra("from-webview-id", this.mWebView.hashCode());
            LocalBroadcastManager.getInstance(android.taobao.windvane.config.a.f).sendBroadcast(intent2);
        } catch (Throwable th) {
            th.printStackTrace();
            r rVar3 = new r();
            rVar3.a("ERROR_STARTACTIVITY");
            rVar3.a("msg", "ERROR_STARTACTIVITY");
            this.mCallback.error(rVar3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b5, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d6, code lost:
        if (r0 == null) goto L78;
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVCamera.onActivityResult(int, int, android.content.Intent):void");
    }

    private void zoomPicAndCallback(String str, final String str2, final a aVar) {
        final Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db673532", new Object[]{this, str, str2, aVar});
            return;
        }
        Bitmap bitmap2 = null;
        try {
            try {
                if (this.mParams.m) {
                    int a2 = h.a(str);
                    Bitmap a3 = h.a(str, maxLength);
                    try {
                        if (a3 == null) {
                            m.e(TAG, "bm == null, fail");
                            if (a3 == null || a3.isRecycled()) {
                                return;
                            }
                            a3.recycle();
                            return;
                        }
                        bitmap = h.b(h.a(a3, maxLength), a2);
                    } catch (Exception unused) {
                        bitmap2 = a3;
                        r rVar = new r();
                        rVar.a("reason", "write photo io error.");
                        rVar.a("WRITE_PHOTO_ERROR");
                        this.mCallback.error(rVar);
                        m.e(TAG, "write photo io error.");
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                        }
                        bitmap2.recycle();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bitmap2 = a3;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        throw th;
                    }
                } else {
                    if (!str2.equals(str)) {
                        File file = new File(str2);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        File file2 = new File(str);
                        if (!file2.exists()) {
                            r rVar2 = new r();
                            rVar2.a("msg", "Failed to read file : " + str);
                            rVar2.a("READ_FILE_ERROR");
                            this.mCallback.error(rVar2);
                            return;
                        } else if (!android.taobao.windvane.file.b.a(file2, file)) {
                            r rVar3 = new r();
                            rVar3.a("msg", "Failed to copy file!");
                            rVar3.a("COPY_FILE_ERROR");
                            this.mCallback.error(rVar3);
                            return;
                        }
                    }
                    bitmap = null;
                }
                try {
                    final android.taobao.windvane.cache.c cVar = new android.taobao.windvane.cache.c();
                    cVar.c = android.taobao.windvane.util.d.a(aVar.b);
                    cVar.d = "image/jpeg";
                    cVar.f1551a = System.currentTimeMillis() + android.taobao.windvane.cache.d.DEFAULT_MAX_AGE;
                    if (m.a()) {
                        m.b(TAG, "write pic to file, name: " + cVar.c);
                    }
                    AsyncTask.execute(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVCamera.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            r rVar4 = new r();
                            if (bitmap != null) {
                                android.taobao.windvane.cache.a.a().a(cVar, new byte[]{0});
                                FileOutputStream fileOutputStream = null;
                                try {
                                    try {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(android.taobao.windvane.cache.a.a().a(true), cVar.c));
                                        try {
                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                                            Bitmap bitmap3 = bitmap;
                                            if (bitmap3 != null && !bitmap3.isRecycled()) {
                                                bitmap.recycle();
                                            }
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Exception unused3) {
                                            fileOutputStream = fileOutputStream2;
                                            m.e(WVCamera.TAG, "fail to create bitmap file");
                                            rVar4.a("msg", "fail to create bitmap file");
                                            rVar4.a("CREATE_BITMAP_ERROR");
                                            WVCamera.access$800(WVCamera.this).error(rVar4);
                                            Bitmap bitmap4 = bitmap;
                                            if (bitmap4 != null && !bitmap4.isRecycled()) {
                                                bitmap.recycle();
                                            }
                                            if (fileOutputStream == null) {
                                                return;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                return;
                                            } catch (Exception unused4) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream = fileOutputStream2;
                                            Bitmap bitmap5 = bitmap;
                                            if (bitmap5 != null && !bitmap5.isRecycled()) {
                                                bitmap.recycle();
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception unused5) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused6) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            WVCamera.access$900(WVCamera.this, str2, aVar);
                            rVar4.b();
                            rVar4.a("url", aVar.b);
                            rVar4.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, str2);
                            m.b(WVCamera.TAG, "url:" + aVar.b + " localPath:" + str2);
                            WVCamera.access$800(WVCamera.this).fireEvent("WVPhoto.Event.takePhotoSuccess", rVar4.d());
                        }
                    });
                } catch (Exception unused2) {
                    bitmap2 = bitmap;
                    r rVar4 = new r();
                    rVar4.a("reason", "write photo io error.");
                    rVar4.a("WRITE_PHOTO_ERROR");
                    this.mCallback.error(rVar4);
                    m.e(TAG, "write photo io error.");
                    if (bitmap2 == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public synchronized void confirmUploadPhoto(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e01eaf9f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        this.mCallback = wVCallBackContext;
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("path");
            aVar.h = jSONObject.optString("identifier");
            aVar.d = jSONObject.optString("v");
            aVar.e = jSONObject.optString("bizCode");
            aVar.g = jSONObject.optJSONObject("extraInfo");
            String a2 = android.taobao.windvane.cache.a.a().a(true);
            if (string != null && a2 != null && string.startsWith(a2)) {
                aVar.f1637a = string;
                upload(aVar);
                return;
            }
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
        } catch (Exception e) {
            m.e(TAG, "confirmUploadPhoto fail, params: " + str);
            r rVar = new r();
            rVar.a("HY_PARAM_ERR");
            rVar.a("msg", "PARAM_ERROR :" + e.getMessage());
            wVCallBackContext.error(rVar);
        }
    }

    private void takePhotoSuccess(String str, a aVar) {
        Bitmap a2;
        Bitmap a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99a2f49", new Object[]{this, str, aVar});
        } else if (aVar.c == 1) {
            String a4 = android.taobao.windvane.cache.a.a().a(true);
            if (str != null && a4 != null && str.startsWith(a4)) {
                aVar.f1637a = str;
                upload(aVar);
                return;
            }
            r rVar = new r();
            rVar.a("PIC_PATH_ERROR");
            rVar.a("msg", "PIC_PATH_ERROR");
            this.mCallback.error(rVar);
        } else {
            r rVar2 = new r();
            rVar2.b();
            if ("1".equals(aVar.j)) {
                if (!aVar.l) {
                    return;
                }
                if (aVar.o == null) {
                    rVar2.a("url", aVar.b);
                    rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, str);
                    if (aVar.p && (a3 = h.a(str, 1024)) != null) {
                        rVar2.a("base64Data", ado.b(a3));
                    }
                } else {
                    rVar2.a("images", aVar.o);
                }
                this.mCallback.success(rVar2);
            } else {
                rVar2.a("url", aVar.b);
                rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, str);
                if (aVar.p && (a2 = h.a(str, 1024)) != null) {
                    rVar2.a("base64Data", ado.b(a2));
                }
                m.b(TAG, "url:" + aVar.b + " localPath:" + str);
                this.mCallback.success(rVar2);
            }
            if (!m.a()) {
                return;
            }
            m.b(TAG, "pic not upload and call success, retString: " + rVar2.d());
        }
    }

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1637a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public JSONObject g;
        public String h;
        public String i;
        public String j;
        public int k;
        public boolean l;
        public boolean m;
        public boolean n;
        public JSONArray o;
        public boolean p;
        public boolean q;
        public String r;
        public int s;

        static {
            kge.a(-1160858727);
        }

        public a() {
            this.h = "";
            this.i = "both";
            this.j = "0";
            this.k = 9;
            this.l = true;
            this.m = true;
            this.n = false;
            this.o = null;
            this.p = false;
            this.q = false;
            this.s = 0;
        }

        public a(a aVar) {
            this.h = "";
            this.i = "both";
            this.j = "0";
            this.k = 9;
            this.l = true;
            this.m = true;
            this.n = false;
            this.o = null;
            this.p = false;
            this.q = false;
            this.s = 0;
            this.f1637a = aVar.f1637a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.o = aVar.o;
            this.m = aVar.m;
            this.n = aVar.n;
            this.p = aVar.p;
            this.q = aVar.q;
        }
    }

    public void upload(a aVar) {
        String str;
        if (this.uploadService == null && (str = uploadServiceClass) != null) {
            try {
                Class<?> cls = Class.forName(str);
                if (cls != null && d.class.isAssignableFrom(cls)) {
                    this.uploadService = (d) cls.newInstance();
                    this.uploadService.initialize(this.mContext, this.mWebView);
                }
            } catch (Exception e) {
                m.e(TAG, "create upload service error: " + uploadServiceClass + ". " + e.getMessage());
            }
        }
        d dVar = this.uploadService;
        if (dVar != null) {
            dVar.doUpload(aVar, this.mCallback);
        }
    }

    public static void registerUploadService(Class<? extends d> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdbc6a5", new Object[]{cls});
        } else if (cls == null) {
        } else {
            uploadServiceClass = cls.getName();
        }
    }

    public static void registerMultiActivity(Class<? extends Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a903a131", new Object[]{cls});
        } else if (cls == null) {
        } else {
            multiActivityClass = cls.getName();
        }
    }

    public static void registerMultiActivityName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59368041", new Object[]{str});
        } else if (str == null) {
        } else {
            multiActivityClass = str;
        }
    }

    private void initTakePhoto(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50892409", new Object[]{this, wVCallBackContext, str});
        } else if (!this.isAlive) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastAccess;
            this.lastAccess = currentTimeMillis;
            if (j < 1000) {
                m.d(TAG, "takePhoto, call this method too frequent,  " + j);
                return;
            }
            this.mCallback = wVCallBackContext;
            this.mParams = new a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.mParams.c = jSONObject.optInt("type", 1);
                this.mParams.i = jSONObject.optString("mode");
                this.mParams.d = jSONObject.optString("v");
                this.mParams.e = jSONObject.optString("bizCode");
                this.mParams.f = jSONObject.optString("extraData");
                this.mParams.g = jSONObject.optJSONObject("extraInfo");
                this.mParams.h = jSONObject.optString("identifier");
                this.mParams.k = jSONObject.optInt("maxSelect");
                this.mParams.j = jSONObject.optString("mutipleSelection");
                this.mParams.m = jSONObject.optBoolean("needZoom", true);
                this.mParams.l = true;
                this.mParams.n = jSONObject.optBoolean("needLogin", false);
                this.mParams.p = jSONObject.optBoolean("needBase64", false);
                this.mParams.q = jSONObject.optBoolean("reducePermission", false);
                maxLength = jSONObject.optInt(Constants.Name.MAX_LENGTH, 1024);
                this.useCN = jSONObject.optBoolean(MspGlobalDefine.LANG, false);
                if (!jSONObject.has("localUrl")) {
                    return;
                }
                this.mParams.b = jSONObject.optString("localUrl");
            } catch (Exception unused) {
                m.e(TAG, "takePhoto fail, params: " + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                rVar.a("msg", "PHOTO_INIT_ERROR ,params:" + str);
                this.mCallback.error(rVar);
            }
        }
    }

    private void requestCameraPermission(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c429686", new Object[]{this, runnable, runnable2});
        } else if (runnable == null || runnable2 == null) {
        } else {
            try {
                android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{com.taobao.speech.util.e.CAMERA}).a(runnable).b(runnable2).b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void reportJSAPIParams(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac09dc72", new Object[]{this, str, str2, str3, str4});
        } else if (!j.commonConfig.cz) {
        } else {
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("url", (Object) str2);
            jSONObject.put("apiName", (Object) str);
            jSONObject.put("mode", (Object) str4);
            jSONObject.put("multiSelection", (Object) str3);
            android.taobao.windvane.monitor.a.commitSuccess("takePhoto", jSONObject.toJSONString());
        }
    }
}
