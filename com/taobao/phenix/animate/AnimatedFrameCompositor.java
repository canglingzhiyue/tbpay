package com.taobao.phenix.animate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;
import tb.kge;
import tb.nib;
import tb.niw;

/* loaded from: classes7.dex */
public class AnimatedFrameCompositor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.pexode.animate.a f18857a;
    private final int b;
    private final int c;
    private final a d;
    private final Paint e = new Paint();
    private final AnimatedDrawableFrameInfo[] f;
    private Bitmap g;
    private String h;

    /* renamed from: com.taobao.phenix.animate.AnimatedFrameCompositor$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18858a = new int[CompositedFrameRenderingType.values().length];

        static {
            try {
                f18858a[CompositedFrameRenderingType.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18858a[CompositedFrameRenderingType.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18858a[CompositedFrameRenderingType.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18858a[CompositedFrameRenderingType.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public enum CompositedFrameRenderingType {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    static {
        kge.a(-1332225199);
    }

    public AnimatedFrameCompositor(com.taobao.pexode.animate.a aVar, a aVar2, String str) {
        this.f18857a = aVar;
        this.h = str;
        this.b = this.f18857a.getWidth();
        this.c = this.f18857a.getHeight();
        this.d = aVar2;
        this.e.setColor(0);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f = new AnimatedDrawableFrameInfo[this.f18857a.getFrameCount()];
        for (int i = 0; i < this.f18857a.getFrameCount(); i++) {
            com.taobao.pexode.animate.b mo1201getFrame = this.f18857a.mo1201getFrame(i);
            try {
                this.f[i] = mo1201getFrame.getFrameInfo();
                mo1201getFrame.dispose();
            } catch (Throwable th) {
                mo1201getFrame.dispose();
                throw th;
            }
        }
    }

    public AnimatedDrawableFrameInfo a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatedDrawableFrameInfo) ipChange.ipc$dispatch("8009168f", new Object[]{this, new Integer(i)}) : this.f[i];
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.g = null;
        }
    }

    public void a(int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a13af3", new Object[]{this, new Integer(i), bitmap});
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int b = c(i) ? i : b(i - 1, canvas); b < i; b++) {
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[b];
            AnimatedDrawableFrameInfo.DisposalMode disposalMode = animatedDrawableFrameInfo.f;
            if (disposalMode != AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS) {
                if (animatedDrawableFrameInfo.g == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND) {
                    a(canvas, animatedDrawableFrameInfo);
                }
                a(b, canvas);
                if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
                    a(canvas, animatedDrawableFrameInfo);
                }
            }
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = this.f[i];
        if (animatedDrawableFrameInfo2.g == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND) {
            a(canvas, animatedDrawableFrameInfo2);
        }
        a(i, canvas);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null) {
            this.g = nib.a().a(this.b, this.c, Bitmap.Config.ARGB_8888);
        } else {
            bitmap.eraseColor(0);
        }
    }

    private void a(int i, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d3da2a", new Object[]{this, new Integer(i), canvas});
            return;
        }
        com.taobao.pexode.animate.b mo1201getFrame = this.f18857a.mo1201getFrame(i);
        try {
            synchronized (this) {
                b();
                mo1201getFrame.renderFrame(mo1201getFrame.getWidth(), mo1201getFrame.getHeight(), this.g);
                canvas.save();
                canvas.translate(mo1201getFrame.getXOffset(), mo1201getFrame.getYOffset());
                canvas.drawBitmap(this.g, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            }
        } catch (Throwable th) {
            try {
                niw.d("AnimatedImage", "%s compositor render frame[%d] error=%s", this.h, Integer.valueOf(i), th);
            } finally {
                mo1201getFrame.dispose();
            }
        }
    }

    private int b(int i, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5bca25e", new Object[]{this, new Integer(i), canvas})).intValue();
        }
        while (i >= 0) {
            int i2 = AnonymousClass1.f18858a[b(i).ordinal()];
            if (i2 == 1) {
                AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[i];
                Bitmap a2 = this.d.a(i);
                if (a2 != null) {
                    canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
                    this.d.a(a2);
                    if (animatedDrawableFrameInfo.f == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
                        a(canvas, animatedDrawableFrameInfo);
                    }
                    return i + 1;
                } else if (c(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    private CompositedFrameRenderingType b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompositedFrameRenderingType) ipChange.ipc$dispatch("523bd182", new Object[]{this, new Integer(i)});
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[i];
        AnimatedDrawableFrameInfo.DisposalMode disposalMode = animatedDrawableFrameInfo.f;
        if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT) {
            return CompositedFrameRenderingType.REQUIRED;
        }
        if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
            if (a(animatedDrawableFrameInfo)) {
                return CompositedFrameRenderingType.NOT_REQUIRED;
            }
            return CompositedFrameRenderingType.REQUIRED;
        } else if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS) {
            return CompositedFrameRenderingType.SKIP;
        } else {
            return CompositedFrameRenderingType.ABORT;
        }
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo[] animatedDrawableFrameInfoArr = this.f;
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo = animatedDrawableFrameInfoArr[i];
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = animatedDrawableFrameInfoArr[i - 1];
        return (animatedDrawableFrameInfo.g == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND && a(animatedDrawableFrameInfo)) || (animatedDrawableFrameInfo2.f == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND && a(animatedDrawableFrameInfo2));
    }

    private boolean a(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2f9ba60", new Object[]{this, animatedDrawableFrameInfo})).booleanValue() : animatedDrawableFrameInfo.b == 0 && animatedDrawableFrameInfo.c == 0 && animatedDrawableFrameInfo.d == this.b && animatedDrawableFrameInfo.e == this.c;
    }

    private void a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62067e7", new Object[]{this, canvas, animatedDrawableFrameInfo});
        } else {
            canvas.drawRect(animatedDrawableFrameInfo.b, animatedDrawableFrameInfo.c, animatedDrawableFrameInfo.b + animatedDrawableFrameInfo.d, animatedDrawableFrameInfo.c + animatedDrawableFrameInfo.e, this.e);
        }
    }
}
