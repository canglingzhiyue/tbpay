package com.taobao.browser.jsbridge.ui;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.TMCameraPreviewView;
import com.taobao.phenix.intf.b;
import com.taobao.taobao.R;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class CameraController extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TMCameraPreviewView cameraView;
    private Context mCtx;
    private RelativeLayout mLayout;
    private String mPath;

    static {
        kge.a(1277455769);
    }

    public static /* synthetic */ Object ipc$super(CameraController cameraController, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(CameraController cameraController, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6abb378", new Object[]{cameraController, bArr});
        } else {
            cameraController.saveImg(bArr);
        }
    }

    public static /* synthetic */ TMCameraPreviewView access$100(CameraController cameraController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMCameraPreviewView) ipChange.ipc$dispatch("51cc86be", new Object[]{cameraController}) : cameraController.cameraView;
    }

    public static /* synthetic */ Context access$200(CameraController cameraController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4430dea7", new Object[]{cameraController}) : cameraController.mCtx;
    }

    public CameraController(Context context) {
        super(context);
        this.mCtx = null;
        this.mLayout = null;
        this.cameraView = null;
        this.mPath = "";
        this.mCtx = context;
        init();
    }

    public void initData(String str, String str2, String str3, String str4, String str5) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a116f913", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        this.mPath = str;
        if ("front".equalsIgnoreCase(str2)) {
            this.cameraView.setCameraFront(true);
        } else {
            this.cameraView.setCameraFront(false);
        }
        try {
            i = Integer.valueOf(str4).intValue();
        } catch (NumberFormatException unused) {
            i = 0;
        }
        try {
            i3 = Integer.valueOf(str5).intValue();
        } catch (NumberFormatException unused2) {
        }
        String str6 = "width_origin=[" + i + "];height_origin=[" + i3 + riy.ARRAY_END_STR;
        int i4 = this.mCtx.getResources().getDisplayMetrics().widthPixels;
        int i5 = this.mCtx.getResources().getDisplayMetrics().heightPixels;
        float f = i5 / i4;
        if (i == i3) {
            i2 = i4;
        } else {
            if (i > i3) {
                int i6 = i ^ i3;
                i3 ^= i6;
                i = i6 ^ i3;
            }
            float f2 = i3;
            float f3 = i;
            if (f2 / f3 < f) {
                i2 = (int) ((i3 * i4) / f3);
            } else {
                i4 = (int) ((i * i5) / f2);
                i2 = i5;
            }
        }
        String str7 = "width_modify=[" + i4 + "];height_modify=[" + i2 + riy.ARRAY_END_STR;
        ImageView imageView = (ImageView) this.mLayout.findViewById(R.id.iv_mask_picture);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i4;
        imageView.setLayoutParams(layoutParams);
        try {
            b.h().a(str3).into(imageView);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mCtx = null;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mLayout = (RelativeLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.camera, (ViewGroup) null);
        this.cameraView = (TMCameraPreviewView) this.mLayout.findViewById(R.id.sf_carema_preview);
        this.cameraView.hasFlash();
        this.cameraView.setOnCameraStatusListener(new TMCameraPreviewView.OnCameraStatusListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.browser.jsbridge.ui.TMCameraPreviewView.OnCameraStatusListener
            public void onAutoFocus(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7490423", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.taobao.browser.jsbridge.ui.TMCameraPreviewView.OnCameraStatusListener
            public void onCameraStopped(final byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51320017", new Object[]{this, bArr});
                } else {
                    AsyncTask.execute(new Runnable() { // from class: com.taobao.browser.jsbridge.ui.CameraController.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CameraController.access$000(CameraController.this, bArr);
                            }
                        }
                    });
                }
            }
        });
        this.cameraView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).autoFocus();
                }
            }
        });
        this.mLayout.findViewById(R.id.ib_take_picture).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).takePicture();
                }
            }
        });
        this.mLayout.findViewById(R.id.tm_camera_back).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ((Activity) CameraController.access$200(CameraController.this)).setResult(0);
                ((Activity) CameraController.access$200(CameraController.this)).finish();
            }
        });
        this.mLayout.findViewById(R.id.tm_camera_change).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).setCameraFront(!CameraController.access$100(CameraController.this).isFrontCamera());
                }
            }
        });
        addView(this.mLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void saveImg(byte[] r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.browser.jsbridge.ui.CameraController.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r2] = r12
            java.lang.String r12 = "2d722814"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inJustDecodeBounds = r2
            int r1 = r12.length
            android.graphics.BitmapFactory.decodeByteArray(r12, r3, r1, r0)
            int r1 = r0.outWidth
            int r4 = r0.outHeight
            r5 = 720(0x2d0, float:1.009E-42)
            if (r1 > r4) goto L2d
            if (r4 <= r5) goto L31
            int r2 = r4 / 720
            goto L31
        L2d:
            if (r1 <= r5) goto L31
            int r2 = r1 / 720
        L31:
            r0.inSampleSize = r2
            r0.inJustDecodeBounds = r3
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r1
            int r1 = r12.length
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeByteArray(r12, r3, r1, r0)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            com.taobao.browser.jsbridge.ui.TMCameraPreviewView r0 = r11.cameraView
            boolean r0 = r0.isFrontCamera()
            if (r0 == 0) goto L58
            r0 = 1132920832(0x43870000, float:270.0)
            r9.postRotate(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.postScale(r0, r1)
            goto L5d
        L58:
            r0 = 1119092736(0x42b40000, float:90.0)
            r9.postRotate(r0)
        L5d:
            r5 = 0
            r6 = 0
            int r7 = r12.getWidth()
            int r8 = r12.getHeight()
            r10 = 0
            r4 = r12
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            if (r12 == r0) goto L72
            r12.recycle()
        L72:
            r12 = 0
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r11.mPath
            r1.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L93
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L93
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L8d java.lang.Throwable -> Lb3
            r1 = 40
            r0.compress(r12, r1, r2)     // Catch: java.io.IOException -> L8d java.lang.Throwable -> Lb3
            r2.flush()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> Lb3
            r2.close()     // Catch: java.io.IOException -> L9f
            goto La3
        L8d:
            r12 = move-exception
            goto L96
        L8f:
            r0 = move-exception
            r2 = r12
            r12 = r0
            goto Lb4
        L93:
            r0 = move-exception
            r2 = r12
            r12 = r0
        L96:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto La3
            r2.close()     // Catch: java.io.IOException -> L9f
            goto La3
        L9f:
            r12 = move-exception
            r12.printStackTrace()
        La3:
            android.content.Context r12 = r11.mCtx
            android.app.Activity r12 = (android.app.Activity) r12
            r0 = -1
            r12.setResult(r0)
            android.content.Context r12 = r11.mCtx
            android.app.Activity r12 = (android.app.Activity) r12
            r12.finish()
            return
        Lb3:
            r12 = move-exception
        Lb4:
            if (r2 == 0) goto Lbe
            r2.close()     // Catch: java.io.IOException -> Lba
            goto Lbe
        Lba:
            r0 = move-exception
            r0.printStackTrace()
        Lbe:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.jsbridge.ui.CameraController.saveImg(byte[]):void");
    }
}
