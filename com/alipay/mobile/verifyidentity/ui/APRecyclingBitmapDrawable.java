package com.alipay.mobile.verifyidentity.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APRecyclingBitmapDrawable extends BitmapDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CountingBitmapDrawable";

    /* renamed from: a  reason: collision with root package name */
    private int f6076a;
    private int b;
    private boolean c;

    public static /* synthetic */ Object ipc$super(APRecyclingBitmapDrawable aPRecyclingBitmapDrawable, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public APRecyclingBitmapDrawable(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.f6076a = 0;
        this.b = 0;
    }

    public void setIsDisplayed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2a2b38", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            if (z) {
                this.b++;
                this.c = true;
            } else {
                this.b--;
            }
        }
        a();
    }

    public void setIsCached(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3676a27f", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            if (z) {
                this.f6076a++;
            } else {
                this.f6076a--;
            }
        }
        a();
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f6076a <= 0 && this.b <= 0 && this.c && b()) {
            new StringBuilder("No longer being used or cached so recycling. ").append(toString());
            getBitmap().recycle();
        }
    }

    private synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Bitmap bitmap = getBitmap();
        return bitmap != null && !bitmap.isRecycled();
    }
}
