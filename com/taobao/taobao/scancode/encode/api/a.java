package com.taobao.taobao.scancode.encode.api;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.k;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponse;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponseData;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oxz;
import tb.oya;
import tb.oyb;
import tb.oyj;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile Bitmap c;
    private volatile String d;
    private volatile String e;
    private volatile boolean b = false;
    private volatile boolean f = true;

    /* renamed from: a  reason: collision with root package name */
    public final int f21244a = 1;

    static {
        kge.a(-678388078);
    }

    public static /* synthetic */ Bitmap a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("918e2ed", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("71dc09dd", new Object[]{aVar, bitmap});
        }
        aVar.c = bitmap;
        return bitmap;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2bff4a7", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b827c3a9", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3394aa8", new Object[]{aVar, str});
        }
        aVar.e = str;
        return str;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8b29eb2", new Object[]{aVar})).booleanValue() : aVar.b;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2da1e9ea", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f = z;
        return z;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("330e4bf3", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ba1b9f0", new Object[]{aVar})).booleanValue() : aVar.f;
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2d5475", new Object[]{aVar}) : aVar.e;
    }

    public void a(final String str, final String str2, final int i, final MaSizeType maSizeType, boolean z, final EncodeCallback encodeCallback) {
        String str3;
        boolean z2;
        String decideUrl;
        final CountDownLatch countDownLatch;
        Bitmap a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16314541", new Object[]{this, str, str2, new Integer(i), maSizeType, new Boolean(z), encodeCallback});
        } else if (encodeCallback == null) {
        } else {
            if (StringUtils.isEmpty(str2)) {
                try {
                    encodeCallback.onError(new EncodeError(-3));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (!StringUtils.isEmpty(str) && (a2 = oyb.a(str, str2)) != null) {
                try {
                    encodeCallback.onSuccess(new BitmapHolder(a2));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                this.d = str2;
                this.e = str2;
                this.f = !z;
                if (str.contains(k.HTTP_PREFIX) || str.contains(k.HTTPS_PREFIX)) {
                    str3 = (maSizeType.size == 0 || (decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(maSizeType.size), Integer.valueOf(maSizeType.size), ImageStrategyConfig.a("default", 51).a())) == null) ? str : decideUrl;
                    z2 = true;
                } else {
                    str3 = str;
                    z2 = false;
                }
                if (z2 && z) {
                    countDownLatch = new CountDownLatch(2);
                } else if (!z2 && !z) {
                    countDownLatch = new CountDownLatch(0);
                } else {
                    countDownLatch = new CountDownLatch(1);
                }
                if (!z2) {
                    this.c = oxz.a(str3);
                    if (this.c != null) {
                        this.b = true;
                    } else {
                        BitmapHolder a3 = oxz.a(str2, Integer.valueOf(maSizeType.size));
                        if (a3 != null && a3.encodeResult != null) {
                            try {
                                encodeCallback.onSuccess(a3);
                                return;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                return;
                            }
                        }
                        try {
                            encodeCallback.onError(new EncodeError(-3));
                            return;
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            return;
                        }
                    }
                } else {
                    b.h().a(Globals.getApplication()).a(str3).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.taobao.scancode.encode.api.a.2
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
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            if (drawable == null || drawable.getBitmap() == null) {
                                return false;
                            }
                            try {
                                a.a(a.this, oxz.a(drawable));
                                if (a.a(a.this) != null) {
                                    a.a(a.this, true);
                                }
                                return true;
                            } finally {
                                countDownLatch.countDown();
                            }
                        }
                    }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.taobao.scancode.encode.api.a.1
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
                            Versions.isDebug();
                            countDownLatch.countDown();
                            return false;
                        }
                    }).fetch();
                }
                if (z) {
                    new oya().a(str2, new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.encode.api.EncodeSyncApi$3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            if (Versions.isDebug()) {
                                String str4 = "mtop system false~~~~~~~~~" + mtopResponse.toString();
                            }
                            countDownLatch.countDown();
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            if (mtopResponse != null && Versions.isDebug()) {
                                String str4 = "shorturl mtopResponse success" + mtopResponse.toString();
                            }
                            if (baseOutDo != null && Versions.isDebug()) {
                                String str5 = "shorturl baseOutDo success" + baseOutDo.toString();
                            }
                            if (baseOutDo == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            ComTaobaoXcodeQrcodeCreateResponseData mo2429getData = ((ComTaobaoXcodeQrcodeCreateResponse) baseOutDo).mo2429getData();
                            if (!StringUtils.isEmpty(mo2429getData.shortUrl)) {
                                a.b(a.this, true);
                                a.a(a.this, mo2429getData.shortUrl);
                                a.b(a.this, mo2429getData.shortUrl);
                            }
                            if (!StringUtils.isEmpty(mo2429getData.shortName) && i == 3) {
                                a.a(a.this, mo2429getData.shortName);
                            }
                            if (Versions.isDebug()) {
                                String str6 = "shorturl success" + mtopResponse.toString();
                            }
                            countDownLatch.countDown();
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            if (Versions.isDebug()) {
                                String str4 = "mtop false~~~~~~~~~" + mtopResponse.toString();
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
                Coordinator.postTask(new Coordinator.TaggedRunnable("scanCode") { // from class: com.taobao.taobao.scancode.encode.api.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            countDownLatch.await(60L, TimeUnit.SECONDS);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        try {
                            if (!a.b(a.this) || a.a(a.this) == null || a.c(a.this) == null || (!a.d(a.this) && i == 3)) {
                                Versions.isDebug();
                                BitmapHolder a4 = oxz.a(a.e(a.this), Integer.valueOf(maSizeType.size));
                                Versions.isDebug();
                                if (a4 == null || a4.encodeResult == null) {
                                    encodeCallback.onError(new EncodeError(-2));
                                } else {
                                    oyb.a(a4.encodeResult, str, str2);
                                    encodeCallback.onSuccess(a4);
                                }
                            } else {
                                if (a.a(a.this).getWidth() < maSizeType.size) {
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(maSizeType.size / a.a(a.this).getWidth(), maSizeType.size / a.a(a.this).getHeight());
                                    if (!a.a(a.this).isRecycled()) {
                                        try {
                                            a.a(a.this, Bitmap.createBitmap(a.a(a.this), 0, 0, a.a(a.this).getWidth(), a.a(a.this).getHeight(), matrix, true));
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                }
                                Versions.isDebug();
                                try {
                                    if (i == 0) {
                                        BitmapHolder a5 = oxz.a(a.e(a.this), Integer.valueOf(maSizeType.size));
                                        Versions.isDebug();
                                        if (a5 == null || a5.encodeResult == null) {
                                            encodeCallback.onError(new EncodeError(-1));
                                        } else {
                                            oyb.a(a5.encodeResult, str, str2);
                                            encodeCallback.onSuccess(a5);
                                        }
                                        if (a.a(a.this) == null || a.a(a.this).isRecycled()) {
                                            return;
                                        }
                                        a.a(a.this).recycle();
                                        a.a(a.this, (Bitmap) null);
                                        return;
                                    }
                                } catch (Exception e7) {
                                    e7.printStackTrace();
                                }
                                char c = '0';
                                if (!StringUtils.isEmpty(a.c(a.this))) {
                                    c = a.c(a.this).charAt(0);
                                }
                                if (i == 3) {
                                    a aVar = a.this;
                                    a.a(aVar, a.c(aVar).substring(1, a.c(a.this).length()));
                                }
                                Bitmap a6 = i == 3 ? oyj.a(a.c(a.this), a.a(a.this), 2, c, 4) : null;
                                if (a6 != null) {
                                    oyb.a(a6, str, str2);
                                    encodeCallback.onSuccess(new BitmapHolder(a6));
                                } else {
                                    BitmapHolder a7 = oxz.a(a.e(a.this), Integer.valueOf(maSizeType.size));
                                    if (a7 == null || a7.encodeResult == null) {
                                        encodeCallback.onError(new EncodeError(-1));
                                    } else {
                                        oyb.a(a7.encodeResult, str, str2);
                                        encodeCallback.onSuccess(a7);
                                    }
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (a.a(a.this) == null || a.a(a.this).isRecycled()) {
                            return;
                        }
                        a.a(a.this).recycle();
                        a.a(a.this, (Bitmap) null);
                    }
                });
            }
        }
    }
}
