package com.alipay.zoloz.toyger.upload;

import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class NineShootManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ToygerFaceService f6294a;
    private FaceRemoteConfig b;
    private volatile boolean e;
    private volatile boolean d = false;
    private int f = 0;
    private CameraRawData g = new CameraRawData();
    private Handler c = new Handler(Looper.myLooper());

    /* loaded from: classes3.dex */
    public static class CameraRawData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[] data = null;
        public int width = 0;
        public int height = 0;
        public int rotation = 90;

        public void recycle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
            } else {
                this.data = null;
            }
        }
    }

    public static /* synthetic */ CameraRawData a(NineShootManager nineShootManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraRawData) ipChange.ipc$dispatch("4c656af", new Object[]{nineShootManager}) : nineShootManager.g;
    }

    public static /* synthetic */ boolean a(NineShootManager nineShootManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a2588d8", new Object[]{nineShootManager, new Boolean(z)})).booleanValue();
        }
        nineShootManager.e = z;
        return z;
    }

    public static /* synthetic */ int b(NineShootManager nineShootManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed03e892", new Object[]{nineShootManager})).intValue() : nineShootManager.f;
    }

    public NineShootManager(ToygerFaceService toygerFaceService, FaceRemoteConfig faceRemoteConfig) {
        this.f6294a = toygerFaceService;
        this.b = faceRemoteConfig;
    }

    public boolean needShootToygerFrameNow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("475bf793", new Object[]{this})).booleanValue() : this.b.getColl().getUploadMonitorPic() == 1 && !this.e && !this.d;
    }

    public void shootToygerFrame(final ToygerFrame toygerFrame) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c40df81", new Object[]{this, toygerFrame});
            return;
        }
        try {
            if (this.b.getColl().getUploadMonitorPic() == 1 && toygerFrame != null && !this.d) {
                if (!this.e) {
                    this.e = true;
                    this.c.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.upload.NineShootManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                NineShootManager.a(NineShootManager.this, false);
                            }
                        }
                    }, 1000L);
                    BioLog.i("shootFaceFrame");
                    final boolean rawCameraFrameUpload = this.b.getColl().getRawCameraFrameUpload();
                    if (this.f >= 10) {
                        this.d = true;
                    } else {
                        final TGFrame tGFrame = toygerFrame.tgFrame;
                        this.f++;
                        try {
                            new Thread(new Runnable() { // from class: com.alipay.zoloz.toyger.upload.NineShootManager.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    boolean z3 = false;
                                    try {
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        if (NineShootManager.this.f6294a != null) {
                                            ToygerFaceService toygerFaceService = NineShootManager.this.f6294a;
                                            TGFrame tGFrame2 = tGFrame;
                                            if (!rawCameraFrameUpload) {
                                                z3 = true;
                                            }
                                            toygerFaceService.addMonitorImage(tGFrame2, z3);
                                        }
                                        if (rawCameraFrameUpload) {
                                            if (tGFrame.data == null) {
                                                tGFrame.byteBuffer.clear();
                                                tGFrame.data = new byte[tGFrame.byteBuffer.remaining()];
                                                tGFrame.byteBuffer.get(tGFrame.data);
                                            }
                                            NineShootManager.a(NineShootManager.this).data = Arrays.copyOf(tGFrame.data, tGFrame.data.length);
                                            NineShootManager.a(NineShootManager.this).width = tGFrame.width;
                                            NineShootManager.a(NineShootManager.this).height = tGFrame.height;
                                            NineShootManager.a(NineShootManager.this).rotation = tGFrame.rotation;
                                        }
                                        tGFrame.recycle();
                                    } catch (Exception e) {
                                        BioLog.w(e);
                                    } finally {
                                        BioLog.d("TOYGER_FLOW_ANDROID", "NineShootManager.addMonitoryFrame() : " + toygerFrame + ", count=" + NineShootManager.b(NineShootManager.this));
                                    }
                                }
                            }, "shootToygerFrame").start();
                            if (!z || toygerFrame == null || toygerFrame.tgFrame == null) {
                                return;
                            }
                            toygerFrame.tgFrame.recycle();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z2 = false;
                            if (z2 && toygerFrame != null && toygerFrame.tgFrame != null) {
                                toygerFrame.tgFrame.recycle();
                            }
                            throw th;
                        }
                    }
                } else if (toygerFrame == null || toygerFrame.tgFrame == null) {
                    return;
                } else {
                    toygerFrame.tgFrame.recycle();
                    return;
                }
            }
            z = true;
            if (!z) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean isNeedUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6858530c", new Object[]{this})).booleanValue() : this.b.getColl().getUploadMonitorPic() == 1;
    }

    public boolean needUploadYuv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95741e2e", new Object[]{this})).booleanValue() : this.b.getColl().getUploadMonitorPic() == 1 && this.b.getColl().getRawCameraFrameUpload();
    }

    public CameraRawData getFinalRawFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraRawData) ipChange.ipc$dispatch("acec7fbb", new Object[]{this}) : this.g;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = false;
        this.f = 0;
        this.g.recycle();
        this.g = null;
    }
}
