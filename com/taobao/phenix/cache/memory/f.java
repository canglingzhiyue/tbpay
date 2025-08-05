package com.taobao.phenix.cache.memory;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class f extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f18882a;
    private WeakReference<Drawable.Callback> b;
    private boolean c;

    static {
        kge.a(-1601900838);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 970940412) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.k();
        }
    }

    public f(Resources resources, Bitmap bitmap, Rect rect, String str, String str2, int i, int i2) {
        super(resources, bitmap, rect, str, str2, i, i2);
    }

    public synchronized void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185b0545", new Object[]{this, gVar});
        } else {
            this.f18882a = gVar;
        }
    }

    @Override // com.taobao.phenix.cache.memory.e
    public NinePatchDrawable k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NinePatchDrawable) ipChange.ipc$dispatch("39df5ffc", new Object[]{this});
        }
        NinePatchDrawable k = super.k();
        synchronized (this) {
            if (k != null) {
                if (this.f18882a != null) {
                    this.f18882a.b(this);
                }
            }
        }
        return k;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f18882a != null) {
            this.f18882a.b(this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        setCallback(null);
        this.c = true;
        synchronized (this) {
            if (this.f18882a != null) {
                this.f18882a.a(this);
            }
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.c) {
            throw new RuntimeException("ReleasableBitmapDrawable has been released before drawing!");
        } else {
            super.draw(canvas);
            Drawable.Callback callback = getCallback();
            Drawable.Callback callback2 = null;
            WeakReference<Drawable.Callback> weakReference = this.b;
            if (weakReference != null && (callback2 = weakReference.get()) == callback) {
                return;
            }
            synchronized (this) {
                if (callback2 != null) {
                    if (this.f18882a != null) {
                        this.f18882a.b(this);
                    }
                }
            }
            this.b = new WeakReference<>(callback);
        }
    }
}
