package com.flybird;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import com.alipay.android.app.template.Tracker;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.ImageLoader;
import com.alipay.birdnest.util.BorderHelper;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class FBBorderImg extends ImageView implements IBorderable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BorderHelper f7113a;
    public ImageLoader.IViewAttachedListener b;
    public BirdNestEngine.LogTracer c;
    public String d;

    public FBBorderImg(Context context) {
        super(context);
        this.f7113a = null;
        this.c = null;
        this.d = "";
        this.f7113a = new BorderHelper();
    }

    public static /* synthetic */ Object ipc$super(FBBorderImg fBBorderImg, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void a(BirdNestEngine.LogTracer logTracer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364568e5", new Object[]{this, logTracer, str});
            return;
        }
        this.c = logTracer;
        this.d = str;
    }

    @Override // com.flybird.IBorderable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BorderHelper borderHelper = this.f7113a;
        if (borderHelper != null) {
            borderHelper.a();
        }
        this.f7113a = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        BorderHelper borderHelper = this.f7113a;
        if (borderHelper == null) {
            return;
        }
        borderHelper.b(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ImageLoader.IViewAttachedListener iViewAttachedListener = this.b;
        if (iViewAttachedListener == null) {
            return;
        }
        iViewAttachedListener.viewAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ImageLoader.IViewAttachedListener iViewAttachedListener = this.b;
        if (iViewAttachedListener == null) {
            return;
        }
        iViewAttachedListener.recycleDetachedView();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            BorderHelper borderHelper = this.f7113a;
            if (borderHelper != null) {
                borderHelper.a(canvas);
            }
            super.onDraw(canvas);
        } catch (Exception e) {
            FBLogger.e("FBBorderImg", "onDraw image with exception: " + e.getMessage());
            Tracker.exceptionPoint(this.c, this.d, "onDraw image exception!", e);
        }
    }

    public void setAttachedListener(ImageLoader.IViewAttachedListener iViewAttachedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a894c0c", new Object[]{this, iViewAttachedListener});
        } else {
            this.b = iViewAttachedListener;
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        BorderHelper borderHelper = this.f7113a;
        if (borderHelper == null) {
            return;
        }
        borderHelper.a(i, i2);
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
            return;
        }
        BorderHelper borderHelper = this.f7113a;
        if (borderHelper == null) {
            return;
        }
        borderHelper.d = i;
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadiusArray(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f810ab", new Object[]{this, fArr});
        }
    }
}
