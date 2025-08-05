package com.alilive.adapter.uikit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cgn;
import tb.kge;

/* loaded from: classes3.dex */
public class AliUrlImageView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a mAliUrlImageView;

    /* loaded from: classes3.dex */
    public interface a {
        void asyncSetImageUrl(String str);

        Drawable getDrawable();

        String getLoadingUrl();

        void initAttr(Context context, AttributeSet attributeSet);

        void pause();

        void resume();

        void setAutoRelease(boolean z);

        void setBlur(Context context, int i, int i2);

        void setCircleView();

        void setCropCircleView(float f, int i);

        void setImageDrawable(Drawable drawable);

        void setImageUrl(String str);

        void setLoadListener(c cVar);

        void setMaxLoopCount(int i);

        void setPlaceHolder(int i);

        void setPriorityModuleName(String str);

        void setRoundeCornerView(int i, int i2, int i3, int i4, int i5);

        void setScaleType(ImageView.ScaleType scaleType);

        void setSkipAutoSize(boolean z);

        void setStrategyConfig(Object obj);

        void setVisibility(int i);
    }

    static {
        kge.a(-1892303441);
    }

    public static /* synthetic */ Object ipc$super(AliUrlImageView aliUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AliUrlImageView(Context context) {
        this(context, null);
    }

    public AliUrlImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AliUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e a2 = cgn.a();
        if (a2 != null) {
            this.mAliUrlImageView = a2.a(context, attributeSet, i);
        }
        this.mAliUrlImageView.initAttr(context, attributeSet);
        addView((View) this.mAliUrlImageView, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setMaxLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742ebb3", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setMaxLoopCount(i);
    }

    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setImageDrawable(drawable);
    }

    public void setSkipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683ef35c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setSkipAutoSize(z);
    }

    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setPriorityModuleName(str);
    }

    public String getLoadingUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8098410", new Object[]{this});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return null;
        }
        return aVar.getLoadingUrl();
    }

    public void asyncSetImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec7c38b", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.asyncSetImageUrl(str);
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setStrategyConfig(obj);
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setImageUrl(str);
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.resume();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.pause();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setScaleType(scaleType);
    }

    public AliUrlImageView setImageLoadListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("c5e5fc86", new Object[]{this, cVar});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar != null) {
            aVar.setLoadListener(cVar);
        }
        return this;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setVisibility(i);
    }

    public void setCircleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda86a9e", new Object[]{this});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setCircleView();
    }

    public void setCropCircleView(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5b0c11", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setCropCircleView(f, i);
    }

    public void setBlur(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71dc38", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setBlur(context, i, i2);
    }

    public void setRoundeCornerView(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd52869", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setRoundeCornerView(i, i2, i3, i4, i5);
    }

    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return null;
        }
        return aVar.getDrawable();
    }

    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setAutoRelease(z);
    }

    public void setPlaceHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffa0e2b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAliUrlImageView;
        if (aVar == null) {
            return;
        }
        aVar.setPlaceHolder(i);
    }
}
