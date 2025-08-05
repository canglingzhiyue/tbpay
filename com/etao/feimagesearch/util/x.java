package com.etao.feimagesearch.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.ByteArrayOutputStream;
import tb.cox;
import tb.kge;

/* loaded from: classes4.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RenderScript f7037a;
    private ScriptIntrinsicYuvToRGB b;
    private Type.Builder c;
    private Type.Builder d;
    private Type e;
    private Type f;
    private Allocation g;
    private Allocation h;
    private int i = 0;
    private int j = 0;
    private boolean k = true;
    private boolean l = false;

    static {
        kge.a(2410959);
    }

    public x(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f7037a = RenderScript.create(context);
            RenderScript renderScript = this.f7037a;
            this.b = ScriptIntrinsicYuvToRGB.create(renderScript, Element.U8_4(renderScript));
        }
    }

    private Bitmap b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ac4805ae", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(bArr, 17, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        if (!this.l) {
            this.l = true;
            Bitmap.Config config = decodeByteArray.getConfig();
            cox.a("Page_PhotoSearchTake", "BitmapConfig", 19999, OConstant.DIMEN_CONFIG_NAME, config == null ? "EMPTY" : config.name());
        }
        return decodeByteArray;
    }

    public synchronized Bitmap a(byte[] bArr, int i, int i2) {
        Bitmap b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2e7049ad", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        try {
            if (this.k && Build.VERSION.SDK_INT >= 17) {
                if (this.i != i || this.j != i2 || this.c == null) {
                    a();
                    this.c = new Type.Builder(this.f7037a, Element.U8(this.f7037a)).setX(bArr.length);
                    RenderScript renderScript = this.f7037a;
                    Type create = this.c.create();
                    this.e = create;
                    this.g = Allocation.createTyped(renderScript, create, 1);
                    this.d = new Type.Builder(this.f7037a, Element.RGBA_8888(this.f7037a)).setX(i).setY(i2);
                    RenderScript renderScript2 = this.f7037a;
                    Type create2 = this.d.create();
                    this.f = create2;
                    this.h = Allocation.createTyped(renderScript2, create2, 1);
                    this.i = i;
                    this.j = i2;
                }
                this.g.copyFrom(bArr);
                this.b.setInput(this.g);
                this.b.forEach(this.h);
                b = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.h.copyTo(b);
            } else {
                b = b(bArr, i, i2);
            }
        } catch (Exception unused) {
            b = b(bArr, i, i2);
        }
        return b;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Allocation allocation = this.g;
        if (allocation != null) {
            allocation.destroy();
            this.g = null;
        }
        Allocation allocation2 = this.h;
        if (allocation2 != null) {
            allocation2.destroy();
            this.h = null;
        }
        Type type = this.f;
        if (type != null) {
            type.destroy();
        }
        Type type2 = this.e;
        if (type2 == null) {
            return;
        }
        type2.destroy();
    }
}
