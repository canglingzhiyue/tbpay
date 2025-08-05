package com.alipay.zoloz.toyger.extservice;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.hardware.isp.IspService;
import com.alipay.zoloz.isp.IspResult;
import com.alipay.zoloz.isp.ToygerIsp;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceState;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.face.FaceBlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ToygerIspService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ToygerIsp f6272a;
    private HandlerThread c;
    private Handler d;
    private IspService f;
    private boolean b = false;
    private boolean g = false;
    private final long h = TimeUnit.SECONDS.toMillis(1);
    private long i = 0;

    public static /* synthetic */ Object ipc$super(ToygerIspService toygerIspService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 548948747) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ Handler a(ToygerIspService toygerIspService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d6113bf8", new Object[]{toygerIspService}) : toygerIspService.d;
    }

    public static /* synthetic */ void a(ToygerIspService toygerIspService, Rect rect, byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b4d19", new Object[]{toygerIspService, rect, bArr, bArr2});
        } else {
            toygerIspService.a(rect, bArr, bArr2);
        }
    }

    public static /* synthetic */ boolean a(ToygerIspService toygerIspService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8971888a", new Object[]{toygerIspService, new Boolean(z)})).booleanValue();
        }
        toygerIspService.b = z;
        return z;
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
        } else {
            super.onCreate(bioServiceManager);
        }
    }

    public void init(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b01e70c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (this.e != null) {
            this.f = (IspService) this.e.getBioService(IspService.class);
        }
        IspService ispService = this.f;
        if (ispService != null) {
            float[] colorTemperature = ispService.getColorTemperature();
            float[][][] awbTable = this.f.getAwbTable();
            this.c = new HandlerThread("adjustIsp");
            this.c.start();
            this.d = new Handler(this.c.getLooper());
            this.f6272a = new ToygerIsp();
            this.f6272a.init(i, i2, i3, i4, i5, colorTemperature, awbTable);
        }
        this.g = true;
        this.i = System.currentTimeMillis();
    }

    private boolean a(RectF rectF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4ec137d", new Object[]{this, rectF})).booleanValue() : rectF == null || (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f);
    }

    public void adjustIsp(final TGFrame tGFrame, final TGDepthFrame tGDepthFrame, TGFaceState tGFaceState, TGFaceAttr tGFaceAttr) {
        RectF rectF;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f5c273", new Object[]{this, tGFrame, tGDepthFrame, tGFaceState, tGFaceAttr});
        } else if (this.f == null || System.currentTimeMillis() - this.i < this.h) {
        } else {
            if (tGFaceState.hasFace) {
                rectF = tGFaceAttr.faceRegion;
                z = tGFaceAttr.brightness < 0.3f || tGFaceAttr.brightness > 0.7f;
                BioLog.i("ZFaceIspService", "adjustIsp() : attr.brightness=" + tGFaceAttr.brightness + ", badBrightness=" + z);
            } else {
                float f = 240.0f / tGFrame.width;
                float f2 = 120.0f / tGFrame.height;
                BioLog.i("toyger width:" + tGFrame.width + "height:" + tGFrame.height);
                rectF = new RectF(0.5f - f, 0.5f - f2, f + 0.5f, f2 + 0.5f);
                z = true;
            }
            if (!z || !a(rectF)) {
                return;
            }
            final Rect convertFaceRegion = FaceBlobManager.convertFaceRegion(rectF, tGFrame.width, tGFrame.height, tGFrame.rotation, false);
            synchronized (this) {
                if (this.b) {
                    BioLog.e("ZFaceIspService", "adjustIsp begin: but ispRunning==true, give up.");
                } else {
                    this.b = true;
                    this.d.post(new Runnable() { // from class: com.alipay.zoloz.toyger.extservice.ToygerIspService.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ToygerIspService.a(ToygerIspService.this, convertFaceRegion, tGFrame.data, tGDepthFrame.data);
                            ToygerIspService.a(ToygerIspService.this).postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.extservice.ToygerIspService.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    synchronized (ToygerIspService.this) {
                                        ToygerIspService.a(ToygerIspService.this, false);
                                    }
                                }
                            }, 200L);
                        }
                    });
                }
            }
        }
    }

    private void a(Rect rect, byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe88247f", new Object[]{this, rect, bArr, bArr2});
            return;
        }
        IspService ispService = this.f;
        if (ispService == null) {
            return;
        }
        int aEMode = ispService.getAEMode();
        BioLog.w("ZFaceIspService", "adjustIsp begin: getAEMode()=" + aEMode);
        if (aEMode == -1) {
            return;
        }
        if (aEMode == 1) {
            this.f.setAEMode(0);
        }
        try {
            IspResult adjustIsp = this.f6272a.adjustIsp(bArr, bArr2, rect, this.f.getExposureTime(), this.f.getISO());
            if (adjustIsp != null) {
                BioLog.d("ZFaceIspService", "result.needSet=" + adjustIsp.isNeedSet() + ", result.exposureTime=" + adjustIsp.getExposureTime() + ", result.ISO=" + adjustIsp.getIso());
                if (adjustIsp.isNeedSet()) {
                    this.f.setExposureTime(adjustIsp.getExposureTime());
                    this.f.setISO(adjustIsp.getIso());
                }
            }
        } catch (Throwable th) {
            try {
                BioLog.w("ZFaceIspService", th);
            } finally {
                BioLog.w("ZFaceIspService", "adjustIsp end.");
            }
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ToygerIsp toygerIsp = this.f6272a;
        if (toygerIsp != null) {
            toygerIsp.release();
        }
        if (this.c != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.c.quitSafely();
            } else {
                this.c.quit();
            }
            this.c = null;
            this.d = null;
        }
        this.b = false;
        this.f = null;
        super.onDestroy();
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue() : this.g;
    }
}
