package com.etao.feimagesearch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import java.nio.ByteBuffer;
import tb.com;
import tb.coq;
import tb.cot;
import tb.cuk;
import tb.kge;

/* loaded from: classes3.dex */
public class n implements coq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1005916028);
        kge.a(-1604775248);
    }

    private Bitmap c(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ae09cce2", new Object[]{this, bitmap});
        }
        if (!b.aV() || bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    @Override // tb.coq
    public boolean a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc0f2ca", new Object[]{this, bitmap})).booleanValue();
        }
        try {
            PailitaoCUtil.a();
            Bitmap c = c(bitmap);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c.getByteCount());
            c.copyPixelsToBuffer(allocateDirect);
            if (PailitaoCUtil.a(allocateDirect.array(), c.getWidth(), c.getHeight()) != 0) {
                z = false;
            }
            if (z && com.a()) {
                ad.c("imageWaterMark", new ac() { // from class: com.etao.feimagesearch.n.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            cuk.a(com.b(), "检测到水印", 1);
                        }
                    }
                });
            }
            PailitaoCUtil.b();
            return z;
        } catch (Exception e) {
            cot.a("AutoDetect", "TKWatermarkDetector", "detectWatermark exception: " + e.getMessage());
            return false;
        }
    }

    @Override // tb.coq
    public String b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a8a4cdb", new Object[]{this, bitmap});
        }
        int hashCode = bitmap.hashCode();
        try {
            Bitmap c = c(bitmap);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c.getByteCount());
            c.copyPixelsToBuffer(allocateDirect);
            cot.a("AutoDetect", "TKWatermarkDetector", "before detectVideoWaterMark " + hashCode);
            String b = PailitaoCUtil.b(allocateDirect.array(), c.getWidth(), c.getHeight());
            cot.a("AutoDetect", "TKWatermarkDetector", "after detectVideoWaterMark result " + b + ", " + hashCode);
            if (!TextUtils.isEmpty(b) && com.a()) {
                ad.c("videoWaterMark", new ac() { // from class: com.etao.feimagesearch.n.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            cuk.a(com.b(), "检测到视频水印", 1);
                        }
                    }
                });
            }
            return b;
        } catch (Exception e) {
            cot.a("AutoDetect", "TKWatermarkDetector", "detectVideoWatermark exception: " + e.getMessage());
            return null;
        }
    }
}
