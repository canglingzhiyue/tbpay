package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ogg;
import tb.ogl;

/* loaded from: classes8.dex */
public class BlurViewGroup extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean blurCreated;
    private int blurRadius;
    private Drawable originBackground;
    private int scaleRadius;
    private View targetBlurView;
    private ogl viewPrams;

    static {
        kge.a(-195789518);
    }

    public static /* synthetic */ Object ipc$super(BlurViewGroup blurViewGroup, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BlurViewGroup(Context context) {
        super(context);
        this.blurRadius = 25;
        this.scaleRadius = 10;
        this.blurCreated = false;
    }

    public void setBlurRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0 || i > 25) {
            ogg.b("blur radius 不正确:" + i);
            i = 25;
        }
        this.blurRadius = i;
    }

    public void setTargetBlurView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb96e8ac", new Object[]{this, view});
        } else {
            this.targetBlurView = view;
        }
    }

    public View getTargetBlurView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("45486e1c", new Object[]{this}) : this.targetBlurView;
    }

    public void setOriginBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe2a7a1", new Object[]{this, drawable});
        } else {
            this.originBackground = drawable;
        }
    }

    public void setViewParams(ogl oglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0d5cf0", new Object[]{this, oglVar});
        } else {
            this.viewPrams = oglVar;
        }
    }

    public void refreshBG() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768fa4e7", new Object[]{this});
        } else if (this.blurCreated || (view = this.targetBlurView) == null) {
        } else {
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            Bitmap bitmap = null;
            try {
                bitmap = getBitmap(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (bitmap != null) {
                Bitmap blurBitmap = blurBitmap(bitmap, this.blurRadius);
                if (blurBitmap != null) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(getResources(), blurBitmap);
                    create.setCornerRadius(this.viewPrams.aJ);
                    create.setBounds(0, 0, getWidth(), getHeight());
                    Drawable drawable = this.originBackground;
                    if (drawable == null) {
                        setBackgroundDrawable(create);
                    } else {
                        setBackgroundDrawable(new LayerDrawable(new Drawable[]{create, drawable}));
                    }
                }
                this.blurCreated = true;
            }
            view.setDrawingCacheEnabled(false);
        }
    }

    private Bitmap getBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("260c9004", new Object[]{this, view});
        }
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return drawingCache;
        }
        int width = drawingCache.getWidth();
        int height = drawingCache.getHeight();
        int i = this.scaleRadius;
        return Bitmap.createScaledBitmap(drawingCache, width / i, height / i, false);
    }

    private Bitmap blurBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7f202330", new Object[]{this, bitmap, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                RenderScript create = RenderScript.create(getContext().getApplicationContext());
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(i);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                create.destroy();
                bitmap.recycle();
                return createBitmap;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void setScaleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d9e6e2", new Object[]{this, new Integer(i)});
        } else {
            this.scaleRadius = i;
        }
    }
}
