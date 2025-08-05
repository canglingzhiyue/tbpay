package com.taobao.android.weex_uikit.widget.img;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_uikit.ui.UINode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.jwy;
import tb.kge;

/* loaded from: classes6.dex */
public class UIImageDrawable extends jwy implements Drawable.Callback, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable b;
    private Object c;
    private int d;
    private int e;
    private String f;
    private UIImageDrawable g;
    private Matrix h;
    private boolean i;
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    private final Rect l = new Rect();
    private int m;
    private int n;
    private UINode o;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ResizeMode {
    }

    static {
        kge.a(1458224710);
        kge.a(-983160102);
        kge.a(-1139115842);
    }

    public static /* synthetic */ Object ipc$super(UIImageDrawable uIImageDrawable, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        } else if (hashCode != -1417457359) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Rect) objArr[0]);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else if (getCallback() == null) {
        } else {
            getCallback().invalidateDrawable(drawable);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
        } else if (getCallback() == null) {
        } else {
            getCallback().scheduleDrawable(drawable, runnable, j);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
        } else if (getCallback() == null) {
        } else {
            getCallback().unscheduleDrawable(drawable, runnable);
            invalidateSelf();
        }
    }

    public void a(UINode uINode, MUSDKInstance mUSDKInstance, String str, String str2, String str3, int i, int i2, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd2551a", new Object[]{this, uINode, mUSDKInstance, str, str2, str3, new Integer(i), new Integer(i2), mUSImageQuality});
            return;
        }
        this.o = uINode;
        if (!TextUtils.isEmpty(str2)) {
            k();
            this.g.a(this.f29841a);
            this.g.a(mUSDKInstance, str2, str3, 0, i, i2, mUSImageQuality);
        }
        a(mUSDKInstance, str, str3, 0, i, i2, mUSImageQuality);
    }

    public void a(UINode uINode, MUSDKInstance mUSDKInstance, String str, String str2, String str3, int i, int i2, int i3, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5a7ddf", new Object[]{this, uINode, mUSDKInstance, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3), mUSImageQuality});
            return;
        }
        this.o = uINode;
        if (!TextUtils.isEmpty(str2)) {
            k();
            this.g.a(this.f29841a);
            this.g.a(mUSDKInstance, str2, str3, i, i2, i3, mUSImageQuality);
        }
        a(mUSDKInstance, str, str3, i, i2, i3, mUSImageQuality);
    }

    public void a(MUSDKInstance mUSDKInstance, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec99b56", new Object[]{this, mUSDKInstance, str, mUSImageQuality});
        } else if (mUSDKInstance.getImageAdapter() == null) {
        } else {
            b(mUSDKInstance);
            this.f = str;
            if (!TextUtils.isEmpty(str)) {
                mUSDKInstance.getImageAdapter().a(mUSDKInstance.getContext().a(), str, this, mUSImageQuality);
            }
            invalidateSelf();
        }
    }

    public void b(MUSDKInstance mUSDKInstance, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8c8f17", new Object[]{this, mUSDKInstance, str, mUSImageQuality});
        } else if (mUSDKInstance.getImageAdapter() == null) {
        } else {
            k();
            this.g.a(mUSDKInstance, str, mUSImageQuality);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.d = b(str);
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.a(str);
        }
        this.h = null;
        invalidateSelf();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    @Override // tb.jwy
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        super.a(rect);
        this.h = null;
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.a(rect);
    }

    private void b(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663b5d2d", new Object[]{this, mUSDKInstance});
        } else if (TextUtils.isEmpty(this.f)) {
        } else {
            mUSDKInstance.getImageAdapter().a(this.f, this);
            if (this.b != null) {
                mUSDKInstance.getImageAdapter().a(this.b, this);
            }
            this.b = null;
        }
    }

    public void a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1fde8e", new Object[]{this, mUSDKInstance});
            return;
        }
        this.o = null;
        c(mUSDKInstance);
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.c(mUSDKInstance);
            this.g.d(mUSDKInstance);
        }
        d(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else if (!j.a()) {
            throw new RuntimeException("should call this method from UI thread");
        } else {
            this.b = drawable;
            this.b.setCallback(this);
            this.h = null;
            invalidateSelf();
            UINode uINode = this.o;
            if (uINode == null) {
                return;
            }
            if ((uINode instanceof Image) && ((Image) uINode).mountState.a(this.b.getIntrinsicWidth(), this.b.getIntrinsicHeight())) {
                this.o.notifyEngineRelayout();
            }
            i();
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!j.a()) {
            throw new RuntimeException("should call this method from UI thread");
        } else {
            if (this.o == null) {
                return;
            }
            j();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        UINode uINode = this.o;
        if (uINode == null) {
            return;
        }
        if (uINode.mo1035getAttachedView() != null) {
            this.o.mo1035getAttachedView().markImageLoaded();
        }
        if (this.o.getInstance() == null || !this.o.getNodeInfo().k("load")) {
            return;
        }
        JSONObject jSONObject = null;
        if (this.b != null) {
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", (Object) String.valueOf(this.b.getIntrinsicWidth()));
            jSONObject2.put("height", (Object) String.valueOf(this.b.getIntrinsicHeight()));
            jSONObject.put("size", (Object) jSONObject2);
        }
        this.o.getInstance().fireEventOnNode(this.o.getNodeId(), "load", jSONObject);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        UINode uINode = this.o;
        if (uINode == null || uINode.getInstance() == null || !this.o.getNodeInfo().k("fail")) {
            return;
        }
        this.o.getInstance().fireEventOnNode(this.o.getNodeId(), "fail", null);
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.m;
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.n;
    }

    @Override // tb.jwy
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (this.b == null) {
            UIImageDrawable uIImageDrawable = this.g;
            if (uIImageDrawable == null) {
                return;
            }
            if (uIImageDrawable.getBounds().width() != width || this.g.getBounds().height() != height) {
                this.g.setBounds(0, 0, width, height);
            }
            try {
                this.g.a(canvas);
                return;
            } catch (Throwable th) {
                g.a(th);
                return;
            }
        }
        l();
        int i = -1;
        if (this.i) {
            i = canvas.save();
            canvas.concat(this.h);
        }
        if (!this.b.getBounds().equals(this.l)) {
            this.b.setBounds(this.l);
        }
        try {
            this.b.draw(canvas);
        } catch (Throwable th2) {
            g.a(th2);
        }
        if (!this.i) {
            return;
        }
        canvas.restoreToCount(i);
    }

    private void a(MUSDKInstance mUSDKInstance, String str, String str2, int i, int i2, int i3, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d977cd", new Object[]{this, mUSDKInstance, str, str2, new Integer(i), new Integer(i2), new Integer(i3), mUSImageQuality});
            return;
        }
        this.d = b(str2);
        this.f = str;
        this.e = i;
        this.m = i2;
        this.n = i3;
        if (mUSDKInstance.getImageAdapter() == null) {
            g.d("UIImageDrawable", "image Adapter is null");
        } else if (TextUtils.isEmpty(this.f)) {
        } else {
            mUSDKInstance.getImageAdapter().a(mUSDKInstance.getContext().a(), this.f, this, mUSImageQuality);
        }
    }

    private void c(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8056dbcc", new Object[]{this, mUSDKInstance});
        } else if (TextUtils.isEmpty(this.f) || mUSDKInstance.getImageAdapter() == null) {
        } else {
            mUSDKInstance.getImageAdapter().a(this.f, this);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.g != null) {
        } else {
            this.g = new UIImageDrawable();
            this.g.setCallback(this);
        }
    }

    private void d(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a725a6b", new Object[]{this, mUSDKInstance});
            return;
        }
        this.f = null;
        this.f29841a = null;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setCallback(null);
            if (mUSDKInstance.getImageAdapter() != null) {
                mUSDKInstance.getImageAdapter().a(this.b, this);
            }
            this.b = null;
        }
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.h = null;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.h != null) {
        } else {
            this.h = new Matrix();
            int intrinsicWidth = this.b.getIntrinsicWidth();
            int intrinsicHeight = this.b.getIntrinsicHeight();
            int width = (getBounds().width() - e()) - h();
            int height = (getBounds().height() - f()) - g();
            boolean z = (intrinsicWidth < 0 || width == intrinsicWidth) && (intrinsicHeight < 0 || height == intrinsicHeight);
            int i = this.d;
            if (i == 1) {
                this.b.setBounds(e(), f(), e() + intrinsicWidth, f() + intrinsicHeight);
                this.l.set(this.b.getBounds());
                if (z) {
                    this.i = false;
                    return;
                }
                a(this.h, intrinsicWidth, intrinsicHeight, width, height);
            } else if (i == 2) {
                this.b.setBounds(e(), f(), e() + intrinsicWidth, f() + intrinsicHeight);
                this.l.set(this.b.getBounds());
                if (z) {
                    this.i = false;
                    return;
                }
                b(this.h, intrinsicWidth, intrinsicHeight, width, height);
            } else if (i == 3) {
                this.i = false;
                this.b.setBounds(e(), f(), e() + width, f() + height);
            }
            this.l.set(this.b.getBounds());
        }
    }

    private void a(Matrix matrix, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889479b4", new Object[]{this, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float f3 = 0.0f;
        if (i * i4 > i3 * i2) {
            float f4 = i4 / i2;
            f3 = (i3 - (i * f4)) * 0.5f;
            f = f4;
            f2 = 0.0f;
        } else {
            f = i3 / i;
            f2 = (i4 - (i2 * f)) * 0.5f;
        }
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f3), Math.round(f2));
        this.i = true;
    }

    private void b(Matrix matrix, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b43dd3", new Object[]{this, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.j.set(0.0f, 0.0f, i, i2);
        this.k.set(0.0f, 0.0f, i3, i4);
        matrix.setRectToRect(this.j, this.k, Matrix.ScaleToFit.CENTER);
        this.i = true;
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3143043) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    c = 0;
                }
            } else if (str.equals("cover")) {
                c = 2;
            }
        } else if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
            c = 1;
        }
        if (c == 0) {
            return 2;
        }
        return (c == 1 || c != 2) ? 3 : 1;
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.setAlpha(i);
    }
}
