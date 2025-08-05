package com.alipay.zoloz.hardware.camera.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class FaceRegion {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    private RectDrawer f6243a = new RectDrawer();

    public FaceRegion(Context context) {
    }

    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
        } else if (!this.b) {
        } else {
            this.f6243a.draw();
        }
    }

    public void update(List<RectF> list, Rect rect, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557fb878", new Object[]{this, list, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.f6243a == null) {
        } else {
            if (list == null || list.isEmpty() || (1 == list.size() && list.get(0).isEmpty())) {
                this.f6243a.update(null, rect, i, i2, i3, i4);
                this.b = false;
                return;
            }
            this.f6243a.update(list, rect, i, i2, i3, i4);
            this.b = true;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Log.d("FaceRegion", "release()");
        RectDrawer rectDrawer = this.f6243a;
        if (rectDrawer == null) {
            return;
        }
        rectDrawer.release();
        this.f6243a = null;
        this.b = false;
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.f6243a.stop();
        }
    }
}
