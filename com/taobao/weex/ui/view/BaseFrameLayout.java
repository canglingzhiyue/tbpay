package com.taobao.weex.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.flat.widget.Widget;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class BaseFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Widget> mWidgets;

    static {
        kge.a(-1574839268);
    }

    public static /* synthetic */ Object ipc$super(BaseFrameLayout baseFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1894755994) {
            if (hashCode != 623593120) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
    }

    public BaseFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            dispatchDrawInterval(canvas);
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
    }

    public void dispatchDrawInterval(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dca81db", new Object[]{this, canvas});
        } else if (this.mWidgets != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (Widget widget : this.mWidgets) {
                widget.draw(canvas);
            }
            canvas.restore();
        } else {
            WXViewInnerUtils.clipCanvasWithinBorderBox(this, canvas);
            super.dispatchDraw(canvas);
        }
    }

    public void mountFlatGUI(List<Widget> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2229a1", new Object[]{this, list});
            return;
        }
        this.mWidgets = list;
        if (this.mWidgets != null) {
            setWillNotDraw(true);
        }
        invalidate();
    }

    public void unmountFlatGUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8cb949", new Object[]{this});
            return;
        }
        this.mWidgets = null;
        setWillNotDraw(false);
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : this.mWidgets != null || super.verifyDrawable(drawable);
    }
}
