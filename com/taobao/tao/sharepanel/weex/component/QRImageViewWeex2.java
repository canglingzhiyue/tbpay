package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.c;
import com.taobao.tao.handler.worker.c;
import com.taobao.tao.sharepanel.weex.a;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.kge;
import tb.obj;

/* loaded from: classes8.dex */
public class QRImageViewWeex2 extends WeexPlatformView implements obj.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    private Bitmap mBitmap;
    private obj mDataBinder;
    public ImageView mImageView;
    public String mPlatform;
    public Boolean mQr4ScanOnly;
    public String mQrType;

    static {
        kge.a(-56226648);
        kge.a(-1749764196);
    }

    public static /* synthetic */ obj access$000(QRImageViewWeex2 qRImageViewWeex2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (obj) ipChange.ipc$dispatch("9634b2d", new Object[]{qRImageViewWeex2}) : qRImageViewWeex2.mDataBinder;
    }

    public static /* synthetic */ Bitmap access$100(QRImageViewWeex2 qRImageViewWeex2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("79f03aff", new Object[]{qRImageViewWeex2}) : qRImageViewWeex2.mBitmap;
    }

    public static /* synthetic */ void access$200(QRImageViewWeex2 qRImageViewWeex2, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa5e266", new Object[]{qRImageViewWeex2, str, obj});
        } else {
            qRImageViewWeex2.fireEvent(str, obj);
        }
    }

    public QRImageViewWeex2(Context context, int i) {
        super(context, i);
        this.mQr4ScanOnly = false;
        this.mImageView = null;
        this.context = context;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        c cVar = new c(null);
        if (this.mQr4ScanOnly.booleanValue()) {
            this.mDataBinder = new obj();
        } else {
            this.mDataBinder = ((a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel()).f21064a;
        }
        this.mDataBinder.a(this);
        cVar.a(this.mPlatform, this.mQrType, this.mQr4ScanOnly.booleanValue(), new c.a() { // from class: com.taobao.tao.sharepanel.weex.component.QRImageViewWeex2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.qrcode.c.a
            public void a(int i, Bitmap bitmap, boolean z, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7dc551cb", new Object[]{this, new Integer(i), bitmap, new Boolean(z), str});
                } else if (QRImageViewWeex2.access$000(QRImageViewWeex2.this) == null) {
                } else {
                    QRImageViewWeex2.access$000(QRImageViewWeex2.this).a(bitmap);
                    QRImageViewWeex2.access$000(QRImageViewWeex2.this).a(str);
                }
            }
        });
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.mImageView == null) {
            this.mImageView = new ImageView(this.context);
            this.mImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mBitmap = this.mDataBinder.d();
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.mImageView.setImageBitmap(this.mBitmap);
            }
        }
        return this.mImageView;
    }

    @Override // tb.obj.c
    public void onQrData(Bitmap bitmap) {
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697ac39d", new Object[]{this, bitmap});
            return;
        }
        this.mBitmap = bitmap;
        final ImageView imageView = (ImageView) getView();
        if (imageView == null || (bitmap2 = this.mBitmap) == null || bitmap2.isRecycled()) {
            return;
        }
        imageView.post(new Runnable() { // from class: com.taobao.tao.sharepanel.weex.component.QRImageViewWeex2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                imageView.setImageBitmap(QRImageViewWeex2.access$100(QRImageViewWeex2.this));
                QRImageViewWeex2.access$200(QRImageViewWeex2.this, "qrcodedrawsuccess", com.taobao.share.ui.engine.jsbridge.a.EMPTY_EVENT);
            }
        });
    }

    @WXComponentProp(name = "platform")
    public void setPlatform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3a6bc6", new Object[]{this, str});
        } else {
            this.mPlatform = str;
        }
    }

    @WXComponentProp(name = "qrType")
    public void setQrType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c60dece", new Object[]{this, str});
        } else {
            this.mQrType = str;
        }
    }

    @WXComponentProp(name = "qr4ScanOnly")
    public void setQr4ScanOnly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de07206b", new Object[]{this, str});
        } else if (!"true".equals(str)) {
        } else {
            this.mQr4ScanOnly = true;
        }
    }
}
