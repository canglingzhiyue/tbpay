package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.kge;

/* loaded from: classes6.dex */
public class AsyncBitmapBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile Bitmap bitmap;

    static {
        kge.a(2116413135);
    }

    public static /* synthetic */ Bitmap access$000(AsyncBitmapBinder asyncBitmapBinder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("fd1c77d9", new Object[]{asyncBitmapBinder}) : asyncBitmapBinder.bitmap;
    }

    public static /* synthetic */ Bitmap access$002(AsyncBitmapBinder asyncBitmapBinder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d66c74f3", new Object[]{asyncBitmapBinder, bitmap});
        }
        asyncBitmapBinder.bitmap = bitmap;
        return bitmap;
    }

    public AsyncBitmapBinder(View view) {
        super(view);
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.nav.binder.AsyncBitmapBinder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view2 = AsyncBitmapBinder.this.sourceView.get();
                if (view2 == null || AsyncBitmapBinder.access$000(AsyncBitmapBinder.this) != null) {
                    return;
                }
                synchronized (AsyncBitmapBinder.this) {
                    if (AsyncBitmapBinder.access$000(AsyncBitmapBinder.this) != null) {
                        return;
                    }
                    AsyncBitmapBinder.access$002(AsyncBitmapBinder.this, AsyncBitmapBinder.this.screenshotOnView(view2));
                }
            }
        }, 28);
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.bitmap == null) {
            synchronized (this) {
                if (this.bitmap == null) {
                    this.bitmap = screenshotOnView(this.sourceView.get());
                }
            }
        }
        return this.bitmap;
    }
}
