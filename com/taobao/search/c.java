package com.taobao.search;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.k;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements ViewTreeObserver.OnPreDrawListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int c;
    private boolean b;
    private ViewGroup d;
    private Activity g;
    private View i;
    private View k;
    private int l;

    /* renamed from: a  reason: collision with root package name */
    private boolean f19016a = false;
    private final Set<com.taobao.android.xsearchplugin.muise.e> e = new HashSet();
    private boolean f = false;
    private boolean h = false;
    private final Handler j = new Handler();
    private int m = -1;

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        c = i;
        return i;
    }

    public static /* synthetic */ ViewGroup a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5e17404b", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ void a(c cVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad038ae4", new Object[]{cVar, bitmap});
        } else {
            cVar.a(bitmap);
        }
    }

    public static /* synthetic */ Activity b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("f2fc3c9f", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da45c4cc", new Object[]{cVar})).booleanValue() : cVar.h;
    }

    public static /* synthetic */ void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1f17e7", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    public static /* synthetic */ Handler e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("c6406a00", new Object[]{cVar}) : cVar.j;
    }

    public static /* synthetic */ Set f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a9587554", new Object[]{cVar}) : cVar.e;
    }

    static {
        kge.a(-934011301);
        kge.a(-1854242693);
        c = 0;
    }

    public void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        this.f19016a = k.a(activity);
        this.b = r.cz();
        this.f = z;
        this.g = activity;
        this.i = new View(activity);
        this.i.setBackgroundColor(-1);
    }

    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (this.k != null) {
        } else {
            this.k = view;
            this.l = i;
            this.d = (ViewGroup) this.g.getWindow().getDecorView();
            if (!this.f19016a || !this.b || c != 0) {
                return;
            }
            this.d.addView(this.i, new ViewGroup.LayoutParams(10, 10));
            this.d.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f19016a && this.b && c == 1;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i.setVisibility(8);
        if (!(this.i.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.i.getParent()).removeView(this.i);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception unused) {
            c = -1;
        }
        if (c != 0) {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        if (c()) {
            b();
        } else {
            this.j.post(new Runnable() { // from class: com.taobao.search.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (Build.VERSION.SDK_INT < 29 || c.a(c.this).getWidth() <= 0 || c.a(c.this).getHeight() <= 0) {
                        c.d(c.this);
                        c.a(-1);
                    } else {
                        final Bitmap createBitmap = Bitmap.createBitmap(c.a(c.this).getWidth(), c.a(c.this).getHeight(), Bitmap.Config.RGB_565);
                        try {
                            PixelCopy.request(c.b(c.this).getWindow(), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.taobao.search.c.1.1
                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                public void onPixelCopyFinished(int i) {
                                    if (i == 0) {
                                        if (c.c(c.this)) {
                                            createBitmap.recycle();
                                            return;
                                        }
                                        c.a(c.this, createBitmap);
                                    }
                                    createBitmap.recycle();
                                    c.d(c.this);
                                }
                            }, c.e(c.this));
                        } catch (Exception unused2) {
                            createBitmap.recycle();
                            c.d(c.this);
                        }
                    }
                }
            });
        }
        this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.k.getWidth(), 1, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.translate(0.0f, -this.l);
        this.k.draw(canvas);
        int i = this.m;
        if (i < 0) {
            i = this.k.getWidth() / 2;
        }
        int red = Color.red(createBitmap.getPixel(i, 0));
        TLogTracker.b("tbsearch_dm", "judgeWithDraw color", "red " + red);
        createBitmap.recycle();
        if (red >= 128) {
            return false;
        }
        c = 1;
        if (this.f) {
            ah.a(this.d);
        }
        d();
        return true;
    }

    private void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        b();
        this.h = true;
        int red = Color.red(bitmap.getPixel(0, 0));
        TLogTracker.b("tbsearch_dm", "copy color", "red " + red);
        if (red < 128) {
            c = 1;
            if (this.f) {
                ah.a(this.d);
            }
            d();
            return;
        }
        c = -1;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (com.taobao.android.xsearchplugin.muise.e eVar : this.e) {
            eVar.onHitDarkMode();
        }
    }

    public void a(final com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf8a69d", new Object[]{this, eVar});
        } else {
            this.g.runOnUiThread(new Runnable() { // from class: com.taobao.search.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.f(c.this).add(eVar);
                    }
                }
            });
        }
    }

    public void b(final com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172ccde", new Object[]{this, eVar});
        } else {
            this.g.runOnUiThread(new Runnable() { // from class: com.taobao.search.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.f(c.this).remove(eVar);
                    }
                }
            });
        }
    }
}
