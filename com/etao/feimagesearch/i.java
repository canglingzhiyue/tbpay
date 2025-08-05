package com.etao.feimagesearch;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import tb.com;
import tb.cop;
import tb.cos;
import tb.cox;
import tb.esr;
import tb.kge;
import tb.nia;

/* loaded from: classes3.dex */
public class i implements cop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageStrategyConfig f6683a = a(TaobaoImageUrlStrategy.ImageQuality.q90);

    static {
        kge.a(-1126472909);
        kge.a(-366990514);
    }

    @Override // tb.cop
    public cos a(String str, final int i, int i2, int i3, final int i4, final int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cos) ipChange.ipc$dispatch("cd2fb36e", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        final cos cosVar = new cos();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (i2 == 0 || i3 == 0) {
            i2 = com.p();
            i3 = com.o();
        }
        if (i4 == 0 || i5 == 0 || b.as()) {
            i4 = i2;
            i5 = i3;
        }
        com.taobao.phenix.intf.b.h().a(a(str, i2, i3)).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "8930").releasableDrawable(false).scaleFromLarge(true).preloadWithSmall(false).limitSize(null, i4, i5).bitmapProcessors(new nia() { // from class: com.etao.feimagesearch.i.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nia
            public String getId() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("81e05888", new Object[]{this}) : i.class.getName();
            }

            @Override // tb.nia
            public Bitmap process(String str2, nia.a aVar, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Bitmap) ipChange2.ipc$dispatch("6877629f", new Object[]{this, str2, aVar, bitmap});
                }
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (max <= i5 && min <= i4) {
                    return com.etao.feimagesearch.util.d.a(bitmap, i);
                }
                float min2 = Math.min((i5 * 1.0f) / max, (i4 * 1.0f) / min);
                Matrix matrix = new Matrix();
                matrix.setScale(min2, min2);
                return com.etao.feimagesearch.util.d.a(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false), 0);
            }
        }).succListener(new a<SuccPhenixEvent>() { // from class: com.etao.feimagesearch.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                cosVar.a(succPhenixEvent.getDrawable().getBitmap());
                countDownLatch.countDown();
                return true;
            }
        }).failListener(new a<FailPhenixEvent>() { // from class: com.etao.feimagesearch.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (failPhenixEvent != null) {
                    cosVar.a(String.valueOf(failPhenixEvent.getResultCode()));
                    cos cosVar2 = cosVar;
                    cosVar2.b("DownLoad Error:" + failPhenixEvent.getUrl());
                }
                countDownLatch.countDown();
                return true;
            }
        }).fetch();
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
            if (cosVar.a() == null && !TextUtils.isEmpty(cosVar.b()) && !TextUtils.isEmpty(cosVar.c())) {
                cosVar.a("-10086");
                cosVar.a(true);
                cosVar.b("Download Timeout");
            }
        } catch (Exception unused) {
        }
        try {
            if (cosVar.a() == null) {
                cox.a("getRemoteImageError", new String[0]);
            } else {
                cox.a("getRemoteImageSuccess", new String[0]);
            }
        } catch (Exception unused2) {
        }
        return cosVar;
    }

    private String a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a4672ce", new Object[]{this, str, new Integer(i), new Integer(i2)}) : (str.startsWith("http") && !Pattern.compile("\\.(\\d+)x(\\d+)").matcher(str).find()) ? ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), this.f6683a) : str;
    }

    private ImageStrategyConfig a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("5a652e36", new Object[]{this, imageQuality});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a(ImageStrategyConfig.WEAPP, 70);
        a2.a(imageQuality);
        return a2.a();
    }
}
