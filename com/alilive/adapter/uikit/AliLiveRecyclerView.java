package com.alilive.adapter.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.alilive.adapter.uikit.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class AliLiveRecyclerView extends RecyclerView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mAdapter;
    private int mDrawHeight;
    private LinearGradient mLinearGradient;
    private Paint mPaint;
    private boolean needCustomDraw;

    static {
        kge.a(1558564686);
        kge.a(-982786186);
    }

    public static /* synthetic */ Object ipc$super(AliLiveRecyclerView aliLiveRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public static void setUrlImageViewImpl(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f450c485", new Object[]{bVar});
        }
    }

    public AliLiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawHeight = 0;
    }

    public AliLiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mDrawHeight = 0;
    }

    public AliLiveRecyclerView(Context context) {
        this(context, null);
    }

    public void setCustomDraw(Paint paint, LinearGradient linearGradient, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b7e584", new Object[]{this, paint, linearGradient, new Boolean(z), new Integer(i)});
            return;
        }
        this.mPaint = paint;
        this.needCustomDraw = z;
        this.mLinearGradient = linearGradient;
        this.mDrawHeight = i;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        if (!this.needCustomDraw || this.mPaint == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.mDrawHeight, this.mPaint);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        LinearGradient linearGradient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.needCustomDraw || (paint = this.mPaint) == null || (linearGradient = this.mLinearGradient) == null) {
            return;
        }
        paint.setShader(linearGradient);
    }

    @Override // com.alilive.adapter.uikit.b
    public void setOnItemClickListener(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd85553", new Object[]{this, aVar});
            return;
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.setOnItemClickListener(aVar);
    }

    @Override // com.alilive.adapter.uikit.b
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return 0;
        }
        return bVar.getItemCount();
    }

    @Override // com.alilive.adapter.uikit.b
    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
            return;
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.addHeaderView(view);
    }

    @Override // com.alilive.adapter.uikit.b
    public boolean addFeature(a<? super RecyclerView> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("904f0d88", new Object[]{this, aVar})).booleanValue();
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return false;
        }
        return bVar.addFeature(aVar);
    }

    @Override // com.alilive.adapter.uikit.b
    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
            return;
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.clearFeatures();
    }

    @Override // com.alilive.adapter.uikit.b
    public int getHeaderViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643b079e", new Object[]{this})).intValue();
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return 0;
        }
        return bVar.getHeaderViewsCount();
    }

    @Override // com.alilive.adapter.uikit.b
    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
            return;
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.addFooterView(view);
    }

    @Override // android.support.v7.widget.RecyclerView, com.alilive.adapter.uikit.b
    public RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("e3f89c80", new Object[]{this, new Integer(i)});
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return null;
        }
        bVar.findViewHolderForAdapterPosition(i);
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView, com.alilive.adapter.uikit.b
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d87d0d3", new Object[]{this, onScrollListener});
            return;
        }
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.removeOnScrollListener(onScrollListener);
    }
}
