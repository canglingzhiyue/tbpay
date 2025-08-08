package com.taobao.share.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.c;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.ut.share.utils.ShareUtils;
import tb.ipu;
import tb.kge;
import tb.nyg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f19649a = new Handler(Looper.getMainLooper());
    private Context b;

    /* renamed from: com.taobao.share.qrcode.c$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19650a;
        public final /* synthetic */ a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public AnonymousClass1(String str, a aVar, boolean z, Bitmap bitmap, int i, int i2) {
            this.f19650a = str;
            this.b = aVar;
            this.c = z;
            this.d = bitmap;
            this.e = i;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                final long currentTimeMillis = System.currentTimeMillis();
                if (StringUtils.isEmpty(this.f19650a)) {
                    c.b(c.this).post(new Runnable() { // from class: com.taobao.share.qrcode.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ipu.a(c.a(c.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18124));
                            if (AnonymousClass1.this.b == null) {
                                return;
                            }
                            AnonymousClass1.this.b.a(17, null, AnonymousClass1.this.c, AnonymousClass1.this.f19650a);
                        }
                    });
                    return;
                }
                EncodeCallback encodeCallback = new EncodeCallback() { // from class: com.taobao.share.qrcode.ShareQRCodeTask$1$2
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
                        return null;
                    }

                    @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
                    public void onError(EncodeError encodeError) {
                        TBS.Ext.commitEvent("Share_Exception", 19999, "qrcode", "err", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18132), encodeError.errorMessage);
                        c.b(c.this).post(new Runnable() { // from class: com.taobao.share.qrcode.ShareQRCodeTask$1$2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ipu.a(c.a(c.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18124));
                                if (c.AnonymousClass1.this.b == null) {
                                    return;
                                }
                                c.AnonymousClass1.this.b.a(17, null, c.AnonymousClass1.this.c, c.AnonymousClass1.this.f19650a);
                            }
                        });
                    }

                    @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
                    public void onSuccess(final BitmapHolder bitmapHolder) throws RemoteException {
                        TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                        c.b(c.this).post(new Runnable() { // from class: com.taobao.share.qrcode.ShareQRCodeTask$1$2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                BitmapHolder bitmapHolder2 = bitmapHolder;
                                boolean z = bitmapHolder2 == null || bitmapHolder2.encodeResult == null;
                                if (z) {
                                    ipu.a(c.a(c.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18124));
                                }
                                if (c.AnonymousClass1.this.b == null) {
                                    return;
                                }
                                if (z) {
                                    c.AnonymousClass1.this.b.a(17, null, c.AnonymousClass1.this.c, c.AnonymousClass1.this.f19650a);
                                    return;
                                }
                                TBS.Ext.commitEvent("Share_Exception", 19999, "qrcode", "info", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18121));
                                c.AnonymousClass1.this.b.a(16, bitmapHolder.encodeResult, c.AnonymousClass1.this.c, c.AnonymousClass1.this.f19650a);
                                TBShareContent j = e.b().j();
                                if (j == null) {
                                    return;
                                }
                                int i = c.AnonymousClass1.this.c ? 0 : 3;
                                TBS.Ext.commitEvent("Page_Share", 19999, "QRCodeShow", null, null, j.businessId + "," + j.templateId + "," + c.AnonymousClass1.this.f19650a + "," + i + "," + ShareBizAdapter.getInstance().getLogin().a());
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                StringBuilder sb = new StringBuilder();
                                sb.append(j.businessId);
                                sb.append(",");
                                sb.append(j.templateId);
                                sb.append(",");
                                sb.append(currentTimeMillis2);
                                sb.append(",");
                                sb.append(z);
                                TBS.Ext.commitEvent("UT", 19999, "Page_Share-QRCodeShow", null, null, sb.toString());
                            }
                        });
                    }
                };
                if (this.c) {
                    if (this.d != null) {
                        com.taobao.taobao.scancode.encode.aidlservice.c.a(c.a(c.this)).a(1, ShareUtils.bmpToByteArray(this.d, false), this.d.getWidth(), this.d.getHeight(), this.f19650a, this.d.getRowBytes(), 0, c.this.a(c.a(c.this), this.e), 'Q', 0, encodeCallback, this.f);
                        return;
                    } else {
                        com.taobao.taobao.scancode.encode.aidlservice.b.a(c.a(c.this)).a(nyg.a(true), this.f19650a, 0, new MaSizeType(0, 0, c.this.a(c.a(c.this), this.e)), false, encodeCallback);
                        return;
                    }
                }
                int i = 132;
                if (c.this.a(c.a(c.this), 50.0f) > 132) {
                    i = c.this.a(c.a(c.this), 50.0f);
                }
                com.taobao.taobao.scancode.encode.aidlservice.b.a(c.a(c.this)).a(nyg.a(false), this.f19650a, 3, new MaSizeType(0, 0, i), true, encodeCallback);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, Bitmap bitmap, boolean z, String str);
    }

    static {
        kge.a(-963791180);
    }

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("13a022ac", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ Handler b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("f2448853", new Object[]{cVar}) : cVar.f19649a;
    }

    public c(Context context) {
        this.b = context;
    }

    public void a(String str, int i, int i2, Bitmap bitmap, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c7cdd1", new Object[]{this, str, new Integer(i), new Integer(i2), bitmap, aVar, new Boolean(z)});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new AnonymousClass1(str, aVar, z, bitmap, i2, i));
        }
    }

    public int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
