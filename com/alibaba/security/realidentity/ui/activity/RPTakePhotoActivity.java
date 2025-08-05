package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.security.realidentity.b3;
import com.alibaba.security.realidentity.e3;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsgPage;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.entity.ImageData;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.z4;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.taobao.taobao.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class RPTakePhotoActivity extends Activity implements DialogInterface.OnClickListener, SensorEventListener, ActivityCompat.OnRequestPermissionsResultCallback, SurfaceHolder.Callback, View.OnClickListener, e3.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int W = -1;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;
    public static final int b0 = 4;
    public static final int c0 = 5;
    public static final int d0 = 6;
    public static final int e0 = 7;
    public static final int f0 = 8;
    public static final int g0 = 9;
    public static final int h0 = 10;
    public static final int i0 = 11;
    public static final int j0 = 12;
    public static final int k0 = 13;
    public static final int l0 = 14;
    public static final int m0 = -1000;
    public static final int n0 = -100;
    public static final int o0 = 1;
    public static final int p0 = 2;
    public static final int q0 = 3;
    public static final int r0 = 4;
    public static final int s0 = 6;
    public static final int t0 = 100;
    public static final int u0 = 101;
    public static final int v0 = 102;
    public static final int w0 = 103;
    public static final int x0 = 1;
    public static final int y0 = 80;
    public static final int z0 = 50;
    public View A;
    public ViewGroup B;
    public ViewGroup C;
    public TextView D;
    public ImageView E;
    public TextView F;
    public int G;
    public ViewGroup H;
    public ImageView I;
    public ImageView J;
    public TextView K;
    public ImageView L;
    public boolean O;
    public n P;
    public String Q;
    public SensorManager R;
    public boolean S;
    public b3 c;
    public e3 d;
    public WindowManager e;
    public SurfaceView f;
    public SurfaceHolder g;
    public ImageView h;
    public Intent i;
    public int[] n;
    public int o;
    public String[] s;
    public String t;
    public ArrayList<ImageData> u;
    public HashMap<String, String> v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* renamed from: a  reason: collision with root package name */
    public int f3539a = 0;
    public int b = 0;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public String p = "";
    public int q = 1;
    public int r = 0;
    public int M = 0;
    public int N = 0;
    public boolean T = false;
    public boolean U = false;
    public Camera.PictureCallback V = new h();

    /* loaded from: classes3.dex */
    public static class TakePhotoResult implements Serializable {
        public String reason;

        public TakePhotoResult(String str) {
            this.reason = str;
        }

        public /* synthetic */ TakePhotoResult(String str, e eVar) {
            this(str);
        }
    }

    /* loaded from: classes3.dex */
    public static class TakePhotoTrackParams implements Serializable {
        public String action;
        public int cart_type;

        public TakePhotoTrackParams(String str, int i) {
            this.action = str;
            this.cart_type = i;
        }
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3540a;

        public a(boolean z) {
            this.f3540a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RPTakePhotoActivity.a(RPTakePhotoActivity.this, this.f3540a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3541a;

        public b(boolean z) {
            this.f3541a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RPTakePhotoActivity.a(RPTakePhotoActivity.this, this.f3541a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Camera.AutoFocusCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dedbc0d2", new Object[]{this, new Boolean(z), camera});
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RPTakePhotoActivity.this.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AsyncTask<String, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public Void a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("8da1c66", new Object[]{this, strArr});
            }
            String a2 = com.alibaba.security.realidentity.g.a(strArr[0], RPTakePhotoActivity.this);
            if (TextUtils.isEmpty(a2) || RPTakePhotoActivity.a(RPTakePhotoActivity.this) == null) {
                return null;
            }
            RPTakePhotoActivity.a(RPTakePhotoActivity.this).put(strArr[0], a2);
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 1) {
                if (RPTakePhotoActivity.b(RPTakePhotoActivity.this) != 3 || RPTakePhotoActivity.h(RPTakePhotoActivity.this)) {
                    RPTakePhotoActivity.j(RPTakePhotoActivity.this).sendEmptyMessage(6);
                } else {
                    RPTakePhotoActivity.i(RPTakePhotoActivity.this);
                }
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Camera.PictureCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a4928df", new Object[]{this, bArr, camera});
            } else if (bArr == null) {
            } else {
                try {
                    String a2 = com.alibaba.security.realidentity.g.a(bArr, RPTakePhotoActivity.this);
                    Bitmap a3 = RPTakePhotoActivity.k(RPTakePhotoActivity.this) ? com.alibaba.security.realidentity.g.a(a2, 1280, 720) : com.alibaba.security.realidentity.g.a(a2, 800, 480);
                    if (a3 == null) {
                        RPTakePhotoActivity.a(RPTakePhotoActivity.this, RPTakePhotoActivity.b(RPTakePhotoActivity.this), "Camera.PictureCallback bitmap load failed");
                        return;
                    }
                    RPTakePhotoActivity.a(RPTakePhotoActivity.this, com.alibaba.security.realidentity.g.a(com.alibaba.security.realidentity.g.a(RPTakePhotoActivity.a(RPTakePhotoActivity.this, a3, RPTakePhotoActivity.l(RPTakePhotoActivity.this)), RPTakePhotoActivity.k(RPTakePhotoActivity.this) ? 80 : 50), RPTakePhotoActivity.this));
                    if (RPTakePhotoActivity.c(RPTakePhotoActivity.this) == null) {
                        RPTakePhotoActivity.a(RPTakePhotoActivity.this, RPTakePhotoActivity.b(RPTakePhotoActivity.this), "Camera.PictureCallback filePath is null");
                        return;
                    }
                    RPTakePhotoActivity.b(RPTakePhotoActivity.this, BlobManager.BLOB_ELEM_TYPE_CAMERA);
                    RPTakePhotoActivity.j(RPTakePhotoActivity.this).sendEmptyMessage(2);
                } catch (Exception e) {
                    RPTakePhotoActivity.a(RPTakePhotoActivity.this, "Take Photo Camera.PictureCallback", com.alibaba.security.realidentity.d.b(e));
                    RPTakePhotoActivity rPTakePhotoActivity = RPTakePhotoActivity.this;
                    RPTakePhotoActivity.a(rPTakePhotoActivity, RPTakePhotoActivity.b(rPTakePhotoActivity), "Camera.PictureCallback exception");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements z4.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.alibaba.security.realidentity.z4.d
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
    public class j implements z4.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // com.alibaba.security.realidentity.z4.e
        public void a(Dialog dialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                return;
            }
            dialog.dismiss();
            RPTakePhotoActivity.d(RPTakePhotoActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RPTakePhotoActivity.d(RPTakePhotoActivity.this);
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
                RPTakePhotoActivity.d(RPTakePhotoActivity.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class n extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RPTakePhotoActivity f3553a;

        public n(RPTakePhotoActivity rPTakePhotoActivity) {
            super(Looper.getMainLooper());
            this.f3553a = rPTakePhotoActivity;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 2) {
                RPTakePhotoActivity.f(this.f3553a);
            } else if (i == 3) {
                RPTakePhotoActivity.a(this.f3553a, message);
            } else if (i == 4) {
                RPTakePhotoActivity.g(this.f3553a);
            } else if (i != 6) {
            } else {
                RPTakePhotoActivity.e(this.f3553a);
            }
        }
    }

    public static /* synthetic */ HashMap a(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3f28602a", new Object[]{rPTakePhotoActivity}) : rPTakePhotoActivity.v;
    }

    public static /* synthetic */ int b(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2949d359", new Object[]{rPTakePhotoActivity})).intValue() : rPTakePhotoActivity.o;
    }

    public static /* synthetic */ String c(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33985efb", new Object[]{rPTakePhotoActivity}) : rPTakePhotoActivity.t;
    }

    public static /* synthetic */ void d(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddf3d24", new Object[]{rPTakePhotoActivity});
        } else {
            rPTakePhotoActivity.e();
        }
    }

    public static /* synthetic */ void e(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b029f203", new Object[]{rPTakePhotoActivity});
        } else {
            rPTakePhotoActivity.n();
        }
    }

    public static /* synthetic */ void f(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3274a6e2", new Object[]{rPTakePhotoActivity});
        } else {
            rPTakePhotoActivity.v();
        }
    }

    public static /* synthetic */ void g(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bf5bc1", new Object[]{rPTakePhotoActivity});
        } else {
            rPTakePhotoActivity.f();
        }
    }

    public static /* synthetic */ boolean h(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("370a10a4", new Object[]{rPTakePhotoActivity})).booleanValue() : rPTakePhotoActivity.j;
    }

    public static /* synthetic */ void i(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b954c57f", new Object[]{rPTakePhotoActivity});
        } else {
            rPTakePhotoActivity.b();
        }
    }

    public static /* synthetic */ Object ipc$super(RPTakePhotoActivity rPTakePhotoActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ n j(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("d8d5ef73", new Object[]{rPTakePhotoActivity}) : rPTakePhotoActivity.P;
    }

    public static /* synthetic */ boolean k(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdea2f41", new Object[]{rPTakePhotoActivity})).booleanValue() : rPTakePhotoActivity.S;
    }

    public static /* synthetic */ boolean l(RPTakePhotoActivity rPTakePhotoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4034e420", new Object[]{rPTakePhotoActivity})).booleanValue() : rPTakePhotoActivity.U;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        l();
        j();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.h.setEnabled(false);
        SensorManager sensorManager = this.R;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        if (!this.T) {
            return;
        }
        this.T = false;
        if (this.o == 3) {
            this.l = false;
            this.z.setEnabled(false);
        }
        try {
            this.c.b().takePicture(null, null, this.V);
        } catch (Exception e2) {
            a("takePhoto camera exception", e2);
            a(this.i);
            finish();
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.I.setVisibility(0);
        this.y.setVisibility(0);
        if (this.s.length == 1) {
            this.y.setVisibility(8);
        }
        this.A.setVisibility(0);
        this.z.setText(getString(R.string.close_gesture));
        this.j = false;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.D.setEnabled(false);
        this.l = false;
        if (this.o == 3) {
            this.z.setEnabled(true);
        }
        a(this.E);
        this.C.setVisibility(8);
        this.B.setVisibility(0);
        if (this.l) {
            return;
        }
        this.f.setVisibility(0);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.e();
            this.c.a();
            this.c = null;
            this.m = false;
        }
        this.T = false;
    }

    private void r() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        ImageData imageData = new ImageData();
        imageData.b(this.t);
        imageData.a(this.o);
        imageData.c(this.p);
        if (this.o == 3 && (strArr = this.s) != null && strArr.length > 0) {
            imageData.a(strArr[this.r]);
        }
        this.u.add(imageData);
        this.i.putExtra(BaseJsExecutor.NAME_IMAGE_LIST, this.u);
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.s;
            if (i2 >= strArr.length) {
                return;
            }
            String str = this.v.get(strArr[i2]);
            if (!TextUtils.isEmpty(str)) {
                this.I.setImageURI(Uri.fromFile(new File(str)));
                this.I.setBackgroundColor(getResources().getColor(R.color.rpsdk_transparency_65));
                this.I.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.z.setVisibility(0);
                this.r = i2;
                this.q = i2 + 1;
                return;
            }
            if (i2 == this.s.length - 1) {
                a(new TakePhotoTrackParams("exit", this.o), new TakePhotoResult("imgDownloadFail", null));
                Toast.makeText(this, getString(R.string.load_gesture_img_faild), 0).show();
                a(this.i);
                finish();
            }
            i2++;
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        TextView textView = this.K;
        if (!this.O) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.h.setOnTouchListener(new g());
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.f.setVisibility(8);
        this.F.setEnabled(true);
        this.D.setEnabled(true);
        this.l = true;
        this.m = false;
        ViewGroup viewGroup = this.C;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.B;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        this.E.setImageBitmap(BitmapFactory.decodeFile(this.t));
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        int[] iArr = this.n;
        if (iArr.length > 0) {
            int i2 = this.G;
            iArr[i2] = -100;
            if (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                this.o = iArr[i3];
                this.G = i3;
            }
        }
        int[] iArr2 = this.n;
        if (iArr2[iArr2.length - 1] == -100) {
            a(this.i);
            finish();
            return;
        }
        if (!this.l) {
            a(this.o);
            this.f.setVisibility(0);
        }
        this.C.setVisibility(8);
        this.B.setVisibility(0);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<String, String>> it = this.v.entrySet().iterator();
        Set<Map.Entry<String, String>> entrySet = this.v.entrySet();
        int i2 = this.q;
        String[] strArr = this.s;
        if (i2 == strArr.length || i2 > strArr.length) {
            this.q = 0;
        }
        if (entrySet.size() == 1) {
            this.y.setVisibility(8);
            return;
        }
        while (it.hasNext()) {
            String str = this.v.get(this.s[this.q]);
            if (!TextUtils.isEmpty(str)) {
                this.I.setImageURI(Uri.fromFile(new File(str)));
                int i3 = this.q;
                this.r = i3;
                this.q = i3 + 1;
                return;
            }
            int i4 = this.q + 1;
            this.q = i4;
            if (i4 == this.s.length) {
                this.q = 0;
            }
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.height = this.M;
        layoutParams.addRule(10);
        this.A.setLayoutParams(layoutParams);
        this.A.setRotation(0.0f);
        this.A.setTranslationX(0.0f);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
        layoutParams2.leftMargin = 0;
        this.H.setLayoutParams(layoutParams2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i2)});
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Bitmap a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        if (i2 == 101 && i3 == -1) {
            String a3 = com.alibaba.security.realidentity.f.a(this, intent.getData());
            if (this.S) {
                a2 = com.alibaba.security.realidentity.g.a(a3, 1280, 720);
            } else {
                a2 = com.alibaba.security.realidentity.g.a(a3, 800, 480);
            }
            if (a2 == null) {
                a(this.o, "Camera.PictureCallback bitmap load failed");
                return;
            }
            String a4 = com.alibaba.security.realidentity.g.a(com.alibaba.security.realidentity.g.a(a2, this.S ? 80 : 50), this);
            this.t = a4;
            if (a4 != null) {
                this.p = "photoAlbum";
                this.P.sendEmptyMessage(2);
            } else {
                a(this.o, "onActivityResult filePath is null");
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.cancel_text) {
            a(new TakePhotoTrackParams("exit", this.o), new TakePhotoResult("cancel", null));
            this.i.putExtra(BaseJsExecutor.NAME_CANCEL, true);
            a(this.i);
            finish();
        } else if (id == R.id.tv_close_examples) {
            c();
        } else if (id == R.id.tv_switch_gesture) {
            x();
        } else if (id == R.id.reget_button) {
            p();
        } else if (id == R.id.pick_photo_text && this.O) {
            new z4.c(this).c(getResources().getString(R.string.rp_pic_upload_instruction)).b(getResources().getString(R.string.rp_image_standard_requirement)).a(getResources().getString(R.string.rp_image_upload_details)).a(true, false).a(getResources().getString(R.string.rp_continue), new j()).a(getResources().getString(R.string.face_dialog_exit_button_cancel), new i()).a();
        } else if (id == R.id.next_button) {
            this.F.setEnabled(false);
            this.l = false;
            a(this.E);
            a(this.I);
            r();
            w();
        } else if (id != R.id.rp_camera_switch_iv) {
        } else {
            q();
            boolean z = !this.U;
            this.U = z;
            a(z);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.rp_alrealidentity_activity_rp_take_photo);
        this.e = (WindowManager) getApplicationContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.P = new n(this);
        m();
        i();
        h();
        a(this.o);
        a(this.s);
        u();
        this.f.setOnClickListener(new e());
        a();
        com.alibaba.security.realidentity.e.a(getWindow().getDecorView(), false);
        a(new TakePhotoTrackParams(g4.b.i, this.o), (TakePhotoResult) null);
        RPTrack.a((LastExitTrackMsg) null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.R;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.v.clear();
        this.v = null;
        this.u.clear();
        this.u = null;
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.a();
            this.c = null;
        }
        this.i = null;
        this.P.removeCallbacksAndMessages(null);
        this.s = null;
        this.n = null;
        this.V = null;
        this.H.removeAllViews();
        this.C.removeAllViews();
        this.B.removeAllViews();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 == 4) {
            if (this.l) {
                p();
                return true;
            }
            a(new TakePhotoTrackParams("exit", this.o), new TakePhotoResult("album cancel", null));
            this.i.putExtra(BaseJsExecutor.NAME_CANCEL, true);
            a(this.i);
            RPTrack.a(d());
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i2), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 102) {
            a(this.U);
        } else if (i2 != 103) {
        } else {
            e();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.l) {
            return;
        }
        this.f.setVisibility(0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        e3 e3Var = this.d;
        if (e3Var == null) {
            return;
        }
        e3Var.a(sensorEvent);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (this.l) {
            return;
        }
        this.f.setVisibility(8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
        } else if (this.l) {
        } else {
            a(this.U);
            k();
            this.T = true;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
        } else if (this.l) {
        } else {
            SensorManager sensorManager = this.R;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            q();
        }
    }

    public static /* synthetic */ String a(RPTakePhotoActivity rPTakePhotoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7fb342f", new Object[]{rPTakePhotoActivity, str});
        }
        rPTakePhotoActivity.t = str;
        return str;
    }

    public static /* synthetic */ String b(RPTakePhotoActivity rPTakePhotoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38261af0", new Object[]{rPTakePhotoActivity, str});
        }
        rPTakePhotoActivity.p = str;
        return str;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.j) {
            o();
        } else {
            b();
        }
    }

    private LastExitTrackMsg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LastExitTrackMsg) ipChange.ipc$dispatch("25f16a27", new Object[]{this});
        }
        LastExitTrackMsg lastExitTrackMsg = new LastExitTrackMsg();
        lastExitTrackMsg.page = LastExitTrackMsgPage.TAKE_PHOTO.getMsg();
        lastExitTrackMsg.view = "";
        lastExitTrackMsg.params = "";
        return lastExitTrackMsg;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String[] strArr = {(Build.VERSION.SDK_INT < 33 || getApplicationInfo().targetSdkVersion < 33) ? "android.permission.READ_EXTERNAL_STORAGE" : al.READ_MEDIA_IMAGES};
        if (this.b <= 0 && !com.alibaba.security.realidentity.k.a(this, strArr)) {
            this.b++;
            com.alibaba.security.realidentity.k.a(this, strArr, 103, getResources().getString(R.string.rp_camera_auth_gallery_explain), new k(), new l());
        } else if (!com.alibaba.security.realidentity.k.a(this, strArr)) {
            AlertDialog create = new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.rp_album_cannot_open)).setMessage(getResources().getString(R.string.rp_read_album_permission_error)).setPositiveButton(getResources().getString(R.string.face_detect_alert_dialog_msg_ok_text), this).setNeutralButton(getResources().getString(R.string.face_dialog_exit_button_confirm), new m()).create();
            create.setCancelable(false);
            create.show();
        } else {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(intent, 101);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            finish();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.height = this.M;
        layoutParams.addRule(15);
        this.A.setLayoutParams(layoutParams);
        this.A.setRotation(90.0f);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.e.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = this.A.getLayoutParams().height;
        this.A.setTranslationX((displayMetrics.widthPixels - (i2 + (i2 / 2))) / 2.0f);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
        layoutParams2.leftMargin = this.N;
        this.H.setLayoutParams(layoutParams2);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        this.i = intent;
        if (intent != null) {
            this.v = new HashMap<>();
            this.u = new ArrayList<>();
            String stringExtra = this.i.getStringExtra(BaseJsExecutor.NAME_FILTER_NAME);
            this.s = this.i.getStringArrayExtra(BaseJsExecutor.NAME_URL_ARRAY);
            this.O = this.i.getBooleanExtra(BaseJsExecutor.NAME_USE_ALBUM, false);
            this.S = this.i.getBooleanExtra(BaseJsExecutor.NAME_USE_LOSSLESS_IMAGE, true);
            this.i.setAction(stringExtra);
            int[] intArrayExtra = this.i.getIntArrayExtra(BaseJsExecutor.NAME_TYPE_ARRAY);
            this.n = intArrayExtra;
            int a2 = a(intArrayExtra);
            this.o = a2;
            if (a2 == -1000) {
                a(new TakePhotoTrackParams("exit", a2), new TakePhotoResult("NoType", null));
                finish();
            }
            this.Q = this.i.getStringExtra("token");
            return;
        }
        a(new TakePhotoTrackParams("exit", this.o), new TakePhotoResult("Intent is null", null));
        finish();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        SurfaceHolder holder = this.f.getHolder();
        this.g = holder;
        holder.addCallback(this);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.C = (ViewGroup) findViewById(R.id.rp_preview_layout);
        TextView textView = (TextView) findViewById(R.id.reget_button);
        this.D = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.next_button);
        this.F = textView2;
        textView2.setOnClickListener(this);
        this.E = (ImageView) findViewById(R.id.picture);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.R = sensorManager;
        if (sensorManager == null) {
            return;
        }
        this.R.registerListener(this, sensorManager.getDefaultSensor(1), 3);
        this.d = new e3(this);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.B = (ViewGroup) findViewById(R.id.rp_take_photo_layout);
        this.H = (ViewGroup) findViewById(R.id.take_model_parent);
        this.A = findViewById(R.id.detail_parent);
        this.I = (ImageView) findViewById(R.id.take_photo_background_img);
        this.J = (ImageView) findViewById(R.id.take_photo_portrait_img);
        ImageView imageView = (ImageView) findViewById(R.id.rp_camera_switch_iv);
        this.L = imageView;
        imageView.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tv_switch_gesture);
        this.y = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.tv_close_examples);
        this.z = textView2;
        textView2.setOnClickListener(this);
        this.w = (TextView) findViewById(R.id.tv_card_tips);
        this.x = (TextView) findViewById(R.id.tv_take_photo_hint);
        findViewById(R.id.cancel_text).setOnClickListener(this);
        ImageView imageView2 = (ImageView) findViewById(R.id.take_photo);
        this.h = imageView2;
        imageView2.setEnabled(false);
        TextView textView3 = (TextView) findViewById(R.id.pick_photo_text);
        this.K = textView3;
        textView3.setOnClickListener(this);
        this.f = (SurfaceView) findViewById(R.id.my_surfaceView);
        this.M = this.A.getLayoutParams().height;
        this.N = ((RelativeLayout.LayoutParams) this.H.getLayoutParams()).leftMargin;
    }

    public static /* synthetic */ void a(RPTakePhotoActivity rPTakePhotoActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2bdc1b", new Object[]{rPTakePhotoActivity, str, str2});
        } else {
            rPTakePhotoActivity.a(str, str2);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.I.setVisibility(8);
        this.y.setVisibility(8);
        this.A.setVisibility(8);
        this.z.setText(getString(R.string.open_gesture));
        this.j = true;
    }

    public static /* synthetic */ void a(RPTakePhotoActivity rPTakePhotoActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e5652d", new Object[]{rPTakePhotoActivity, new Boolean(z)});
        } else {
            rPTakePhotoActivity.a(z);
        }
    }

    public static /* synthetic */ void a(RPTakePhotoActivity rPTakePhotoActivity, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7065465a", new Object[]{rPTakePhotoActivity, message});
        } else {
            rPTakePhotoActivity.a(message);
        }
    }

    public static /* synthetic */ void a(RPTakePhotoActivity rPTakePhotoActivity, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c63026", new Object[]{rPTakePhotoActivity, new Integer(i2), str});
        } else {
            rPTakePhotoActivity.a(i2, str);
        }
    }

    public static /* synthetic */ Bitmap a(RPTakePhotoActivity rPTakePhotoActivity, Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("7ffb2a0b", new Object[]{rPTakePhotoActivity, bitmap, new Boolean(z)}) : rPTakePhotoActivity.a(bitmap, z);
    }

    private void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr != null) {
            for (String str : strArr) {
                new f().execute(str);
            }
        }
    }

    private void a(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str});
            return;
        }
        a(new TakePhotoTrackParams("exit", i2), new TakePhotoResult(str, null));
        this.i.putExtra("errorMsg", BaseJsExecutor.VALUE_NO_PHOTO);
        a(this.i);
        finish();
    }

    private Bitmap a(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3e605dac", new Object[]{this, bitmap, new Boolean(z)});
        }
        if (Build.MODEL.toLowerCase(Locale.US).replace(" ", "").contains("nexus5x")) {
            return com.alibaba.security.realidentity.g.b(bitmap, 270);
        }
        return com.alibaba.security.realidentity.g.b(bitmap, z ? -90 : 90);
    }

    private int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c198169", new Object[]{this, iArr})).intValue();
        }
        if (iArr != null && iArr.length > 0) {
            return iArr[0];
        }
        return -1000;
    }

    private void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        this.A.setBackgroundResource(R.color.rpsdk_detile_parent_normalbg);
        this.y.setVisibility(8);
        this.z.setVisibility(8);
        this.L.setVisibility(8);
        this.A.setVisibility(0);
        this.J.setVisibility(8);
        this.I.setVisibility(0);
        this.I.setScaleType(ImageView.ScaleType.FIT_XY);
        this.I.setBackgroundResource(0);
        this.z.setText(getString(R.string.close_gesture));
        this.j = false;
        t();
        if (i2 == 0) {
            this.J.setVisibility(0);
            this.L.setVisibility(0);
            this.w.setText(getString(R.string.half_length_portrait_title));
            this.x.setText(getString(R.string.half_length_portrait_hint));
            y();
        } else if (i2 == 1) {
            this.w.setText(getString(R.string.identity_front_title));
            this.x.setText(getString(R.string.identity_hint));
            this.I.setImageResource(R.drawable.rp_frontcardpic);
            g();
        } else if (i2 == 2) {
            this.w.setText(getString(R.string.identity_back_title));
            this.x.setText(getString(R.string.identity_hint));
            this.I.setImageResource(R.drawable.rp_backcardpic);
            g();
        } else if (i2 == 3) {
            this.w.setText(getString(R.string.gesture_tips_title));
            this.x.setText(getString(R.string.gesture_tips_hint));
            this.y.setVisibility(0);
            if (this.s.length == 1) {
                this.y.setVisibility(8);
            }
            this.P.sendEmptyMessageDelayed(3, 300L);
            y();
        } else if (i2 == 4) {
            this.w.setText(getString(R.string.passport_tips_title));
            this.x.setText(getString(R.string.passport_tips_hint));
            this.I.setImageResource(R.drawable.rp_backcardhk);
            y();
        } else if (i2 == 5) {
            this.w.setText(getString(R.string.id_tw_front_title));
            this.x.setText(getString(R.string.taiwan_id_tips_hint));
            this.I.setImageResource(R.drawable.rp_hkpassport_bg);
            g();
        } else if (i2 == 6) {
            this.w.setText(getString(R.string.hk_id_tips_title));
            this.x.setText(getString(R.string.hk_id_tips_hint));
            this.I.setImageResource(R.drawable.rp_hkpassport_bg);
            g();
        } else if (i2 == 7) {
            this.w.setText(getString(R.string.id_tw_back_title));
            this.x.setText(getString(R.string.id_tw_hint));
            this.I.setImageResource(R.drawable.rp_backcardhk);
            g();
        } else if (i2 == 8) {
            this.w.setText(getString(R.string.id_hk_back_title));
            this.x.setText(getString(R.string.id_hk_hint));
            this.I.setImageResource(R.drawable.rp_backcardhk);
            g();
        } else if (i2 == 9) {
            this.w.setText(getString(R.string.identity_fg_front_title));
            this.x.setText(getString(R.string.identity_fg_hint));
            this.I.setImageResource(R.drawable.rp_frontcardpic);
            g();
        } else if (i2 == 10) {
            this.w.setText(getString(R.string.identity_fg_back_title));
            this.x.setText(getString(R.string.identity_fg_hint));
            this.I.setImageResource(R.drawable.rp_backcardpic);
            g();
        } else if (i2 == 11) {
            this.w.setText(getString(R.string.identity_hk_front_title));
            this.x.setText(getString(R.string.identity_hk_hint));
            this.I.setImageResource(R.drawable.rp_frontcardpic);
            g();
        } else if (i2 == 12) {
            this.w.setText(getString(R.string.identity_hk_back_title));
            this.x.setText(getString(R.string.identity_hk_hint));
            this.I.setImageResource(R.drawable.rp_backcardpic);
            g();
        } else if (i2 == 13) {
            this.w.setText(getString(R.string.identity_tw_front_title));
            this.x.setText(getString(R.string.identity_tw_hint));
            this.I.setImageResource(R.drawable.rp_frontcardpic);
            g();
        } else if (i2 == 14) {
            this.w.setText(getString(R.string.identity_tw_back_title));
            this.x.setText(getString(R.string.identity_tw_hint));
            this.I.setImageResource(R.drawable.rp_backcardpic);
            g();
        } else if (i2 == -1) {
            this.I.setVisibility(8);
            this.A.setVisibility(8);
            y();
        } else {
            Context applicationContext = getApplicationContext();
            Toast.makeText(applicationContext, getResources().getString(R.string.rp_no_photo_type_error) + i2, 0).show();
            finish();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
            return;
        }
        this.i.putExtra("errorMsg", "NO_PERMISSION");
        if (i2 != -1) {
            a(this.i);
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", com.alibaba.security.realidentity.j.c(this), null));
        startActivity(intent);
        a(this.i);
        finish();
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            com.alibaba.security.realidentity.h.a(this).a(intent);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.m) {
        } else {
            String[] strArr = {com.taobao.speech.util.e.CAMERA};
            if (this.f3539a <= 0 && !com.alibaba.security.realidentity.k.a(this, strArr)) {
                this.f3539a++;
                com.alibaba.security.realidentity.k.a(this, strArr, 102, getResources().getString(R.string.rp_camera_auth_cert_explain), new a(z), new b(z));
            } else if (!com.alibaba.security.realidentity.k.a(this, strArr)) {
                AlertDialog create = new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.face_detect_camera_no_permission_title)).setMessage(getResources().getString(R.string.face_detect_camera_open_permission_text)).setPositiveButton(getResources().getString(R.string.face_detect_dialog_btn_sure), this).setNeutralButton(getResources().getString(R.string.face_detect_alert_dialog_msg_exit_text), new c()).create();
                create.setCancelable(false);
                create.show();
            } else {
                this.c = null;
                b3 b3Var = new b3(this);
                this.c = b3Var;
                this.c.b(b3Var.a(z));
                try {
                    this.c.a(this.g, this.S);
                    this.m = true;
                    this.c.d();
                    this.h.setEnabled(true);
                    this.T = true;
                } catch (Exception unused) {
                    AlertDialog create2 = new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.face_detect_camera_no_permission_title)).setMessage(getResources().getString(R.string.face_detect_camera_open_permission_text)).setPositiveButton(getResources().getString(R.string.face_detect_dialog_btn_sure), this).setNeutralButton(getResources().getString(R.string.face_detect_alert_dialog_msg_exit_text), this).create();
                    create2.setCancelable(false);
                    create2.show();
                }
            }
        }
    }

    private void a(ImageView imageView) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
        } else if (imageView == null) {
        } else {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                bitmap.recycle();
            }
            imageView.setImageBitmap(null);
            if (drawable == null) {
                return;
            }
            drawable.setCallback(null);
        }
    }

    @Override // com.alibaba.security.realidentity.e3.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b3 b3Var = this.c;
        if (b3Var == null) {
            return;
        }
        try {
            b3Var.a(new d());
        } catch (Exception e2) {
            a("onFocus exception", com.alibaba.security.realidentity.d.b(e2));
        }
    }

    private void a(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00e9594", new Object[]{this, str, exc});
        } else {
            a(TrackLog.createSdkExceptionLog(str, com.alibaba.security.realidentity.d.b(exc), ""));
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TrackLog createSdkExceptionLog = TrackLog.createSdkExceptionLog(str, str2, "");
        createSdkExceptionLog.setCode(-1);
        a(createSdkExceptionLog);
    }

    private void a(TakePhotoTrackParams takePhotoTrackParams, TakePhotoResult takePhotoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929545cc", new Object[]{this, takePhotoTrackParams, takePhotoResult});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod("takePhoto");
        trackLog.setParams(com.alibaba.security.realidentity.b.a(takePhotoTrackParams));
        String str = "";
        trackLog.setMsg(str);
        if (takePhotoResult != null) {
            str = com.alibaba.security.realidentity.b.a(takePhotoResult);
        }
        trackLog.setResult(str);
        a(trackLog);
    }

    private void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
            return;
        }
        trackLog.setVerifyToken(this.Q);
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else if (message.arg1 != 100 && !this.k) {
            if (this.P == null) {
                return;
            }
            this.h.setEnabled(false);
            this.z.setEnabled(false);
            this.y.setText(getResources().getString(R.string.rp_hold_on));
            this.P.sendEmptyMessageDelayed(3, 100L);
        } else if (this.k && message.arg1 == 100) {
        } else {
            this.k = true;
            if (this.o != 3) {
                return;
            }
            this.h.setEnabled(true);
            this.z.setEnabled(true);
            this.y.setText(getResources().getString(R.string.switch_gesture));
            s();
        }
    }
}
