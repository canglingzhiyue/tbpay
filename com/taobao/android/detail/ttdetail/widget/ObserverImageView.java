package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes5.dex */
public class ObserverImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnSizeChangedListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(1760664658);
    }

    public static /* synthetic */ Object ipc$super(ObserverImageView observerImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public ObserverImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ObserverImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObserverImageView(Context context) {
        super(context);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) Math.ceil((size * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth()));
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 == 0 || i2 == i4 || (aVar = this.mOnSizeChangedListener) == null) {
            return;
        }
        aVar.a(i2);
    }

    public void setOnSizeChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0b8e45", new Object[]{this, aVar});
            return;
        }
        int height = getHeight();
        this.mOnSizeChangedListener = aVar;
        a aVar2 = this.mOnSizeChangedListener;
        if (aVar2 == null || height <= 0) {
            return;
        }
        aVar2.a(height);
    }
}
