package com.taobao.tao.navigation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class IconForegroundImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHAPE_CIRCLE = 12;
    public static final int SHAPE_DEFAULT = 11;
    private final float density;
    public boolean isClip;
    private final Path path;

    public static /* synthetic */ Object ipc$super(IconForegroundImageView iconForegroundImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode != -1117127205) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
    }

    public IconForegroundImageView(Context context) {
        super(context);
        this.isClip = false;
        this.path = new Path();
        this.density = getContext().getResources().getDisplayMetrics().density;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.isClip) {
            this.path.reset();
            this.path.addCircle(getPivotX(), getPivotY(), this.density * 18.0f, Path.Direction.CW);
            canvas.clipPath(this.path);
        }
        super.onDraw(canvas);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            setImageDrawable(drawable, 12);
        }
    }

    public void setImageDrawable(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29e6041", new Object[]{this, drawable, new Integer(i)});
            return;
        }
        if (i != 12) {
            z = false;
        }
        this.isClip = z;
        super.setImageDrawable(drawable);
    }
}
