package com.taobao.android.order.core.dinamicX.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import tb.fxe;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXQRCODEIMAGEVIEW_BARCODE = 4691410307390837559L;
    public static final long DXQRCODEIMAGEVIEW_QRCODE = 7665026788792100L;
    public static final long DXQRCODEIMAGEVIEW_QRCODEIMAGEVIEW = -1286778439428491861L;

    /* renamed from: a  reason: collision with root package name */
    private String f14624a;
    private String b;

    static {
        kge.a(757332804);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof c)) {
        } else {
            super.onClone(dXWidgetNode, z);
            c cVar = (c) dXWidgetNode;
            this.f14624a = cVar.f14624a;
            this.b = cVar.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ImageView imageView = (ImageView) view;
        if (!TextUtils.isEmpty(this.f14624a)) {
            setImageScaleType(imageView, getScaleType());
            fxe.a(new a(imageView, true, this.f14624a, getMeasuredWidth(), getMeasuredHeight()), new Void[0]);
        } else if (!TextUtils.isEmpty(this.b)) {
            setImageScaleType(imageView, getScaleType());
            fxe.a(new a(imageView, false, this.b, getMeasuredWidth(), getMeasuredHeight()), new Void[0]);
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXQRCODEIMAGEVIEW_QRCODE) {
            this.f14624a = str;
        } else if (j == DXQRCODEIMAGEVIEW_BARCODE) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14625a;
        private boolean b;
        private WeakReference<ImageView> c;
        private int d;
        private int e;

        static {
            kge.a(-1761387214);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, drawable});
            } else {
                a(drawable);
            }
        }

        public a(ImageView imageView, boolean z, String str, int i, int i2) {
            this.c = new WeakReference<>(imageView);
            this.b = z;
            this.f14625a = str;
            this.d = i;
            this.e = i2;
        }

        public Drawable a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("3d6535e6", new Object[]{this, voidArr}) : a();
        }

        public Drawable a() {
            Bitmap a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("1e792452", new Object[]{this});
            }
            if (this.b) {
                a2 = com.taobao.android.order.core.dinamicX.view.barcode.b.b(this.f14625a, this.d, this.e);
            } else {
                a2 = com.taobao.android.order.core.dinamicX.view.barcode.b.a(this.f14625a, this.d, this.e);
            }
            if (a2 != null) {
                return new BitmapDrawable(a2);
            }
            return null;
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.c.get();
            if (imageView == null) {
                return;
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
