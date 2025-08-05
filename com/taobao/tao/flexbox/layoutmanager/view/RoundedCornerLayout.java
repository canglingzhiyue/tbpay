package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class RoundedCornerLayout extends FrameLayout implements b.C0848b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Path path;
    private List<FlatViewGroup.d> sizeChangedCallbacks;
    private List<FlatViewGroup.e> visibilityChangedCallbacks;

    static {
        kge.a(-844122901);
        kge.a(434200724);
    }

    public static /* synthetic */ Object ipc$super(RoundedCornerLayout roundedCornerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public RoundedCornerLayout(Context context) {
        super(context);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        removeAllViews();
        Path path = this.path;
        if (path == null) {
            return;
        }
        path.reset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Path path = this.path;
        if (path != null && !path.isEmpty()) {
            canvas.clipPath(this.path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        Drawable background = getBackground();
        if (background == null || !(background instanceof b.C0848b) || getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            return;
        }
        this.path = ((b.C0848b) background).a(this.path, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.drawable.b.C0848b.a
    public void onBoundChanged(b.C0848b c0848b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebe4aad", new Object[]{this, c0848b});
        } else if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || c0848b != getBackground()) {
        } else {
            this.path = c0848b.a(this.path, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        List<FlatViewGroup.e> list = this.visibilityChangedCallbacks;
        if (list == null) {
            return;
        }
        for (FlatViewGroup.e eVar : list) {
            eVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        List<FlatViewGroup.d> list = this.sizeChangedCallbacks;
        if (list == null) {
            return;
        }
        for (FlatViewGroup.d dVar : list) {
            dVar.a(i, i2, i3, i4);
        }
    }

    public void addVisibilityChangedCallback(FlatViewGroup.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0b5613", new Object[]{this, eVar});
            return;
        }
        if (this.visibilityChangedCallbacks == null) {
            this.visibilityChangedCallbacks = new ArrayList();
        }
        if (this.visibilityChangedCallbacks.contains(eVar)) {
            return;
        }
        this.visibilityChangedCallbacks.add(eVar);
    }

    public void removeVisibilityChangedCallback(FlatViewGroup.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf384f6", new Object[]{this, eVar});
            return;
        }
        List<FlatViewGroup.e> list = this.visibilityChangedCallbacks;
        if (list == null) {
            return;
        }
        list.remove(eVar);
    }

    public void addSizeChangedCallback(FlatViewGroup.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbd3d23", new Object[]{this, dVar});
            return;
        }
        if (this.sizeChangedCallbacks == null) {
            this.sizeChangedCallbacks = new ArrayList();
        }
        if (this.sizeChangedCallbacks.contains(dVar)) {
            return;
        }
        this.sizeChangedCallbacks.add(dVar);
    }

    public void removeSizeChangedCallback(FlatViewGroup.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09f1246", new Object[]{this, dVar});
            return;
        }
        List<FlatViewGroup.d> list = this.sizeChangedCallbacks;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }
}
