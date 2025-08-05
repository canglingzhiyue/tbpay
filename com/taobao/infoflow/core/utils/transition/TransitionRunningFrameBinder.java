package com.taobao.infoflow.core.utils.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import com.taobao.android.task.Coordinator;
import tb.ifl;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class TransitionRunningFrameBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TransitionRunningFrameBinder";
    private volatile Bitmap mRunningBitmap;

    static {
        kge.a(-1328367303);
    }

    public static /* synthetic */ Bitmap access$002(TransitionRunningFrameBinder transitionRunningFrameBinder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d52fd59d", new Object[]{transitionRunningFrameBinder, bitmap});
        }
        transitionRunningFrameBinder.mRunningBitmap = bitmap;
        return bitmap;
    }

    public TransitionRunningFrameBinder(Drawable drawable) {
        super(drawable);
    }

    public void setReuseSupport(final ifl iflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90086765", new Object[]{this, iflVar});
        } else if (iflVar == null) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.infoflow.core.utils.transition.TransitionRunningFrameBinder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TransitionRunningFrameBinder.access$002(TransitionRunningFrameBinder.this, iflVar.f());
                    }
                }
            }, 28);
        }
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.mRunningBitmap == null) {
            ldf.d(TAG, "TikTest anim_item_running_frame , getBitmap is null.");
        } else {
            ldf.d(TAG, "TikTest anim_item_running_frame , getBitmap success.");
        }
        return this.mRunningBitmap;
    }
}
