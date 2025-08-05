package com.alipay.zoloz.toyger.workspace.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavTask;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.task.ActionType;
import com.alipay.mobile.security.bio.task.SubTask;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FastBlur;
import com.alipay.mobile.security.faceauth.FaceService;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.upload.UploadManager;
import com.alipay.zoloz.toyger.widget.RoundProgressBar;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerBaseTask implements SubTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView A;

    /* renamed from: a  reason: collision with root package name */
    public ToygerCirclePattern f6371a;
    public BioServiceManager b;
    public Handler c;
    public FaceService d;
    public Context e;
    public RoundProgressBar h;
    public RoundProgressBar i;
    public RoundProgressBar j;
    public TextView k;
    public Handler l;
    public FaceRemoteConfig m;
    public int r;
    public int s;
    public long t;
    public long u;
    public String v;
    public ToygerFrame w;
    public UploadManager x;
    public ToygerRecordService y;
    public ImageView z;
    public int f = Color.parseColor("#44FFFFFF");
    public int g = 10;
    public BisBehavTask n = new BisBehavTask();
    public boolean o = true;
    public String p = "{\"actcnt\":0,\"vidcnt\":%1$d,\"EyeLeftOcclussion\":%2$d,\"EyeRightOcclussion\":%3$d}";
    public int q = 0;

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        }
    }

    public BisBehavTask getBisBehavTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BisBehavTask) ipChange.ipc$dispatch("f0504b23", new Object[]{this}) : this.n;
    }

    public boolean isHasBeHaviorInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7877bfb", new Object[]{this})).booleanValue() : this.o;
    }

    public int getVidcnt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23581428", new Object[]{this})).intValue() : this.q;
    }

    public ToygerBaseTask(BioServiceManager bioServiceManager, ToygerCirclePattern toygerCirclePattern, Handler handler, ToygerCallback toygerCallback) {
        this.c = null;
        this.b = bioServiceManager;
        this.f6371a = toygerCirclePattern;
        this.l = handler;
        this.c = new Handler(Looper.getMainLooper());
        this.d = (FaceService) bioServiceManager.getBioService(FaceService.class);
        this.h = this.f6371a.getRoundProgressBarInner();
        this.i = this.f6371a.getRoundProgressBar();
        this.j = this.f6371a.getOuterBakRoundProgressBar();
        this.z = this.f6371a.getBottomImage();
        this.A = this.f6371a.getBottomTextView();
        this.k = this.f6371a.getTopTip();
        this.e = this.b.getBioApplicationContext();
        this.m = toygerCallback.getRemoteConfig();
        this.y = (ToygerRecordService) bioServiceManager.getBioService(ToygerRecordService.class);
    }

    @Override // com.alipay.mobile.security.bio.task.SubTask
    public int init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fede18a", new Object[]{this})).intValue();
        }
        this.t = System.currentTimeMillis();
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.task.SubTask
    public ActionType action(ActionFrame actionFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionType) ipChange.ipc$dispatch("1a8ae914", new Object[]{this, actionFrame}) : ActionType.RUN;
    }

    @Override // com.alipay.mobile.security.bio.task.SubTask
    public int done() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("452316fc", new Object[]{this})).intValue();
        }
        this.f6371a.getTitleBar().setVisibility(8);
        return 0;
    }

    public void a(Bitmap bitmap) {
        final Bitmap blur;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else if (this.f6371a.isNewGarfieldModel || bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
        } else {
            if ("sys".equals(this.m.getColl().getPreviewStyle())) {
                blur = blurOld(bitmap, 3, 6.0f);
            } else {
                blur = blur(bitmap, 3, 6.0f);
            }
            bitmap.recycle();
            Handler handler = this.c;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ToygerBaseTask.this.f6371a == null) {
                    } else {
                        ToygerBaseTask.this.f6371a.getGuassianBackground().setVisibility(0);
                        ToygerBaseTask.this.f6371a.getGuassianBackground().setBackgroundDrawable(new BitmapDrawable(ToygerBaseTask.this.e.getResources(), blur));
                    }
                }
            });
        }
    }

    public static Bitmap blur(Bitmap bitmap, int i, float f) {
        Bitmap createBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ae2f857b", new Object[]{bitmap, new Integer(i), new Float(f)});
        }
        BioLog.d("blur()...radius:" + i + " scale:" + f);
        if (f <= 0.0f) {
            f = 1.0f;
        }
        Bitmap bitmap2 = null;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= height) {
                createBitmap = Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height);
            } else {
                createBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
            }
            bitmap2 = Bitmap.createBitmap((int) (createBitmap.getWidth() / f), (int) (createBitmap.getHeight() / f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmap2);
            float f2 = 1.0f / f;
            canvas.scale(f2, f2);
            Paint paint = new Paint();
            paint.setFlags(2);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
            createBitmap.recycle();
            return FastBlur.doBlur(bitmap2, i, true);
        } catch (OutOfMemoryError e) {
            BioLog.e(e);
            return bitmap2;
        }
    }

    public static Bitmap blurOld(Bitmap bitmap, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("88c63d82", new Object[]{bitmap, new Integer(i), new Float(f)});
        }
        BioLog.d("blur()...radius:" + i + " scale:" + f);
        if (f <= 0.0f) {
            f = 1.0f;
        }
        Bitmap bitmap2 = null;
        try {
            bitmap2 = Bitmap.createBitmap((int) (bitmap.getWidth() / f), (int) (bitmap.getHeight() / f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmap2);
            float f2 = 1.0f / f;
            canvas.scale(f2, f2);
            Paint paint = new Paint();
            paint.setFlags(2);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return FastBlur.doBlur(bitmap2, i, true);
        } catch (OutOfMemoryError e) {
            BioLog.e(e);
            return bitmap2;
        }
    }

    public void setUploadManager(UploadManager uploadManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1129b8cd", new Object[]{this, uploadManager});
        } else {
            this.x = uploadManager;
        }
    }
}
