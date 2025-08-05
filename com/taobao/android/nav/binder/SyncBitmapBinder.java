package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class SyncBitmapBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-426482630);
    }

    public SyncBitmapBinder(View view) {
        super(view);
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        View view = this.sourceView.get();
        if (view != null) {
            return screenshotOnView(view);
        }
        return null;
    }
}
