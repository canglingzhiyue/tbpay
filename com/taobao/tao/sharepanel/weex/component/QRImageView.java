package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.c;
import com.taobao.tao.handler.worker.c;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kge;
import tb.obj;

/* loaded from: classes8.dex */
public class QRImageView extends WXComponent<ImageView> implements obj.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap mBitmap;
    private obj mDataBinder;

    static {
        kge.a(-385665751);
        kge.a(-1749764196);
    }

    public static /* synthetic */ Object ipc$super(QRImageView qRImageView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ obj access$000(QRImageView qRImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (obj) ipChange.ipc$dispatch("a89c9bf2", new Object[]{qRImageView}) : qRImageView.mDataBinder;
    }

    public static /* synthetic */ Bitmap access$100(QRImageView qRImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6ebf7f3c", new Object[]{qRImageView}) : qRImageView.mBitmap;
    }

    public QRImageView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        c cVar = new c(null);
        String optString = basicComponentData.getAttrs().optString("platform");
        String optString2 = basicComponentData.getAttrs().optString("qrType");
        boolean equals = TextUtils.equals("true", basicComponentData.getAttrs().optString("qr4ScanOnly"));
        if (equals) {
            this.mDataBinder = new obj();
        } else {
            this.mDataBinder = ((com.taobao.tao.sharepanel.weex.a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel()).f21064a;
        }
        this.mDataBinder.a(this);
        cVar.a(optString, optString2, equals, new c.a() { // from class: com.taobao.tao.sharepanel.weex.component.QRImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.qrcode.c.a
            public void a(int i, Bitmap bitmap, boolean z, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7dc551cb", new Object[]{this, new Integer(i), bitmap, new Boolean(z), str});
                } else if (QRImageView.access$000(QRImageView.this) == null) {
                } else {
                    QRImageView.access$000(QRImageView.this).a(bitmap);
                    QRImageView.access$000(QRImageView.this).a(str);
                }
            }
        });
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public ImageView mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a5b11369", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mBitmap = this.mDataBinder.d();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(this.mBitmap);
        }
        return imageView;
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
        final ImageView hostView = mo1286getHostView();
        if (hostView == null || (bitmap2 = this.mBitmap) == null || bitmap2.isRecycled()) {
            return;
        }
        hostView.post(new Runnable() { // from class: com.taobao.tao.sharepanel.weex.component.QRImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hostView.setImageBitmap(QRImageView.access$100(QRImageView.this));
                if (!QRImageView.this.getEvents().contains("qrcodedrawsuccess")) {
                    return;
                }
                QRImageView.this.fireEvent("qrcodedrawsuccess", com.taobao.share.ui.engine.jsbridge.a.EMPTY_EVENT);
            }
        });
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mDataBinder = null;
    }

    /* loaded from: classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1545954193);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new QRImageView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }
}
