package com.taobao.avplayer.player;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class DWTextureView extends TextureView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mCallback;
    private com.taobao.taobaoavsdk.widget.media.b mMeasureHelper;
    private String mTag;

    /* loaded from: classes6.dex */
    public interface a {
        void T();

        void U();

        void g(int i);
    }

    static {
        kge.a(537652453);
    }

    public static /* synthetic */ Object ipc$super(DWTextureView dWTextureView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DWTextureView(Context context, com.taobao.taobaoavsdk.widget.media.b bVar, a aVar) {
        super(context);
        this.mTag = "DWTextureView";
        init(bVar, aVar);
    }

    public DWTextureView(Context context, AttributeSet attributeSet, com.taobao.taobaoavsdk.widget.media.b bVar, a aVar) {
        super(context, attributeSet);
        this.mTag = "DWTextureView";
        init(bVar, aVar);
    }

    public DWTextureView(Context context, AttributeSet attributeSet, int i, com.taobao.taobaoavsdk.widget.media.b bVar, a aVar) {
        super(context, attributeSet, i);
        this.mTag = "DWTextureView";
        init(bVar, aVar);
    }

    public void init(com.taobao.taobaoavsdk.widget.media.b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad613a00", new Object[]{this, bVar, aVar});
            return;
        }
        this.mMeasureHelper = bVar;
        this.mCallback = aVar;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onMeasure " + i + ", " + i2);
        com.taobao.taobaoavsdk.widget.media.b bVar = this.mMeasureHelper;
        if (bVar != null) {
            bVar.c(i, i2);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onMeasure set " + this.mMeasureHelper.b() + ", " + this.mMeasureHelper.c());
            setMeasuredDimension(this.mMeasureHelper.b(), this.mMeasureHelper.c());
        }
        if (!kck.a()) {
            return;
        }
        String str = this.mTag;
        com.taobao.taobaoavsdk.util.c.a(str, "onMeasure >>> mMeasureHelper.getMeasuredWidth() : " + this.mMeasureHelper.b() + ", mMeasureHelper.getMeasuredHeight(): " + this.mMeasureHelper.c());
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (Build.VERSION.SDK_INT >= 24 || drawable == null) {
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.g(i);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.T();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.U();
    }
}
