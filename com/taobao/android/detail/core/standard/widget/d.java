package com.taobao.android.detail.core.standard.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import tb.emu;
import tb.fwk;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes4.dex */
public class d extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f9894a = 250;
    private final int b = 650;
    private final int c = 380;
    private final int d = 100;
    private final int e = 80;
    private final int f = 430;
    private final int g = 200;
    private final int h = 35;
    private final int i = 30;
    private final int j = 320;
    private final int k = 50;
    private final int l = 20;
    private final int m = 30;
    private final int n = 40;
    private final int o = 60;
    private final int p = 40;
    private final int q = 18;
    private Paint r = a(Color.rgb(255, 248, 245));
    private Paint s = a(Color.rgb((int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH));
    private Paint t = a(-1);
    private RectF u = new RectF();
    private int v;
    private int w;

    static {
        kge.a(-2034913412);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.core.standard.widget.DetailPresetDesktopTransmitDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.w = rect.height();
        this.v = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(Color.rgb((int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH, (int) ArtcParams.SD244pVideoParams.WIDTH));
        canvas.drawRoundRect(a(20, 20, IMediaPlayer.MEDIA_INFO_NETWORK_SHAKE, fwk.DEFAULT_EXPIRED_TIME), 40.0f, 40.0f, this.t);
        int b = (this.w - b(405)) + b(80);
        RectF a2 = a(20, 405, IMediaPlayer.MEDIA_INFO_NETWORK_SHAKE, b);
        a2.bottom = b(405) + b;
        canvas.drawRoundRect(a2, 40.0f, 40.0f, this.t);
        canvas.save();
        canvas.translate(b(50), b(60));
        canvas.drawRoundRect(a(0, 0, 320, 50), 18.0f, 18.0f, this.r);
        canvas.translate(0.0f, b(70));
        canvas.drawRoundRect(a(0, 0, 250, 35), 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(55));
        canvas.drawRoundRect(a(0, 0, 650, 35), 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(55));
        canvas.drawRoundRect(a(0, 0, 380, 35), 18.0f, 18.0f, this.s);
        canvas.translate(b(30), b(75));
        RectF a3 = a(0, 0, 100, 30);
        canvas.drawRoundRect(a3, 18.0f, 18.0f, this.s);
        canvas.translate(b(245), 0.0f);
        canvas.drawRoundRect(a3, 18.0f, 18.0f, this.s);
        canvas.translate(b(245), 0.0f);
        canvas.drawRoundRect(a3, 18.0f, 18.0f, this.s);
        canvas.restore();
        canvas.save();
        canvas.translate(b(50), b(445));
        RectF a4 = a(0, 0, 80, 30);
        canvas.drawRoundRect(a4, 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(160));
        canvas.drawRoundRect(a4, 18.0f, 18.0f, this.s);
        canvas.restore();
        canvas.save();
        canvas.translate(b(160), b(445));
        canvas.drawRoundRect(a(0, 0, 430, 30), 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(70));
        canvas.drawRoundRect(a(0, 0, 380, 30), 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(90));
        canvas.drawRoundRect(a(0, 0, 200, 30), 18.0f, 18.0f, this.s);
        canvas.translate(0.0f, b(70));
        canvas.drawRoundRect(a(0, 0, 380, 30), 18.0f, 18.0f, this.s);
        canvas.restore();
    }

    private Paint a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("86f68170", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    private RectF a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ebae6b3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.u.set(b(i), b(i2), b(i3 + i), b(i4 + i2));
        return this.u;
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : (int) (((this.v / 750.0f) * i) + 0.5f);
    }
}
