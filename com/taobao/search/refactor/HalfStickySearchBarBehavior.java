package com.taobao.search.refactor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import tb.imk;
import tb.kge;
import tb.nom;

/* loaded from: classes7.dex */
public class HalfStickySearchBarBehavior extends com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(433735848);
    }

    public static /* synthetic */ Object ipc$super(HalfStickySearchBarBehavior halfStickySearchBarBehavior, String str, Object... objArr) {
        if (str.hashCode() == -1474197416) {
            super.a(((Number) objArr[0]).floatValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HalfStickySearchBarBehavior(View view, boolean z, int i) {
        super(view, z, i, new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(3000, 1000, 2000));
        c(imk.d);
        j().setBackgroundColor(-1);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b
    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context}) : new StatusBarClipView(context);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        super.a(f);
        b(f);
    }

    private void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        int measuredHeight = j().getMeasuredHeight();
        int i = i();
        float min = Math.min(Math.max(((measuredHeight * f) - i) / (measuredHeight - i), 0.0f), 1.0f);
        int i2 = (int) ((1.0f - min) * 255.0f);
        StatusBarClipView statusBarClipView = (StatusBarClipView) d();
        Drawable background = j().getBackground();
        if (background != null) {
            background.mutate().setAlpha(i2);
        }
        StatusBarClipView.access$000(statusBarClipView).getBackground().mutate().setAlpha(i2);
        c(min);
    }

    private void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else if (!TextUtils.equals(FestivalMgr.a().d("global", nom.KEY_NAVI_STYLE), "0") || Build.VERSION.SDK_INT < 23) {
        } else {
            View decorView = ((Activity) d().getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(((double) f) <= 0.5d ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* loaded from: classes7.dex */
    public class StatusBarClipView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View statusForeground;

        static {
            kge.a(192712410);
        }

        public static /* synthetic */ Object ipc$super(StatusBarClipView statusBarClipView, String str, Object... objArr) {
            if (str.hashCode() == -1952076612) {
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ View access$000(StatusBarClipView statusBarClipView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("770bf8ce", new Object[]{statusBarClipView}) : statusBarClipView.statusForeground;
        }

        public StatusBarClipView(Context context) {
            super(context);
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.statusForeground = new View(context);
            this.statusForeground.setBackgroundColor(-1);
            addView(this.statusForeground, -1, imk.d);
        }

        @Override // android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
            }
            if (view == this.statusForeground) {
                return super.drawChild(canvas, view, j);
            }
            int save = canvas.save();
            canvas.clipRect(0, imk.d, canvas.getWidth(), canvas.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return drawChild;
        }
    }
}
