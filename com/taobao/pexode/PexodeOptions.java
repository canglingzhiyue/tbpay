package com.taobao.pexode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.entity.a;
import tb.kge;
import tb.nec;

/* loaded from: classes7.dex */
public class PexodeOptions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Bitmap.Config CONFIG;
    public static boolean sEnabledCancellability;
    public boolean allowDegrade2NoAshmem;
    public boolean allowDegrade2NoInBitmap;
    public boolean allowDegrade2System;
    public volatile boolean cancelled;
    private volatile long cancelledPtr;
    public boolean enableAshmem;
    public boolean forceSkipCache;
    public boolean forceStaticIfAnimation;
    public boolean fromLocal;
    public Bitmap inBitmap;
    public boolean incrementalDecode;
    public boolean justDecodeBounds;
    public int lastSampleSize;
    public a mIncrementalStaging;
    public boolean outAlpha;
    public nec outMimeType;
    public Rect outPadding;
    public TypedValue resourceValue;
    public int sampleSize;
    public byte[] tempHeaderBuffer;
    private BitmapFactory.Options uponSysOptions;
    public int outWidth = -1;
    public int outHeight = -1;
    public boolean outIcc = false;

    private native void nativeRequestCancel(long j);

    static {
        kge.a(1316699618);
        CONFIG = Bitmap.Config.ARGB_8888;
        sEnabledCancellability = true;
    }

    public synchronized void setUponSysOptions(BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a5c2d2", new Object[]{this, options});
        } else {
            this.uponSysOptions = options;
        }
    }

    public synchronized boolean requestCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbda0df4", new Object[]{this})).booleanValue();
        }
        if (sEnabledCancellability) {
            this.cancelled = true;
            if (this.uponSysOptions != null) {
                this.uponSysOptions.requestCancelDecode();
                return true;
            } else if (this.cancelledPtr != 0) {
                nativeRequestCancel(this.cancelledPtr);
                this.cancelledPtr = 0L;
                return true;
            } else if (this.mIncrementalStaging != null) {
                this.mIncrementalStaging.c();
            }
        }
        return false;
    }

    public boolean isSizeAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2948849", new Object[]{this})).booleanValue() : this.outWidth > 0 && this.outHeight > 0;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            if (this.tempHeaderBuffer != null) {
                c.a().a(this.tempHeaderBuffer);
            }
            super.finalize();
        } catch (Throwable unused) {
        }
    }
}
