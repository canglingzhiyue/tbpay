package com.taobao.android.themis.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvas;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener;
import com.taobao.android.fcanvas.integration.adapter.a;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.themis.graphics.d;

/* loaded from: classes6.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FCanvas f15546a;
    private FCanvasInstance b;
    private final Context c;
    private final String d;

    public b(String str, Context context, ExternalAdapterImageProvider externalAdapterImageProvider) {
        this.c = context;
        this.d = str;
        this.f15546a = new FCanvas.a().a(externalAdapterImageProvider).a(new a() { // from class: com.taobao.android.themis.graphics.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fcanvas.integration.adapter.a
            public void a(int i, String str2, String str3, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ecdd4026", new Object[]{this, new Integer(i), str2, str3, th});
                    return;
                }
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis:renderer", str2 + " | " + str3);
            }
        }).a();
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.b == null) {
        } else {
            FCanvasInstance.c cVar = new FCanvasInstance.c();
            cVar.f12322a = z;
            cVar.b = z2;
            this.b.a(cVar);
        }
    }

    @Override // com.taobao.android.themis.graphics.d
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            return null;
        }
        return fCanvasInstance.h();
    }

    @Override // com.taobao.android.themis.graphics.d
    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this});
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "make snapshot failed because of invalid state");
            return null;
        }
        try {
            return fCanvasInstance.d();
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel, "themis:renderer", "make snapshot failed because of " + th.getMessage());
            return null;
        }
    }

    @Override // com.taobao.android.themis.graphics.d
    public void a(int i, int i2, float f, FCanvasInstance.RenderMode renderMode, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd972c3c", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), renderMode, aVar});
            return;
        }
        d.b bVar = new d.b();
        bVar.f15557a = i;
        bVar.b = i2;
        bVar.c = f;
        bVar.d = renderMode;
        bVar.e = aVar;
        bVar.g = false;
        a(bVar);
    }

    @Override // com.taobao.android.themis.graphics.d
    public void a(final d.b bVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49276f83", new Object[]{this, bVar});
        } else if (bVar == null) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "invalid params");
        } else {
            FCanvasInstance.b f = new FCanvasInstance.b(bVar.f15557a, bVar.b, bVar.c).b(true).a(false).a(FCanvasInstance.ContainerType.MiniGame).c(false).a(bVar.d == null ? FCanvasInstance.RenderMode.surface : bVar.d).e(false).a(new OnCanvasErrorListener() { // from class: com.taobao.android.themis.graphics.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener
                public void onCanvasError(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6935094c", new Object[]{this, str2, str3});
                        return;
                    }
                    RVLLevel rVLLevel = RVLLevel.Error;
                    com.taobao.android.riverlogger.e.a(rVLLevel, "themis:renderer", str2 + " | " + str3);
                }
            }).a(new com.taobao.android.fcanvas.integration.adapter.b() { // from class: com.taobao.android.themis.graphics.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fcanvas.integration.adapter.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (bVar.e != null) {
                        bVar.e.a();
                    }
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "notify that first frame called");
                }
            }).f(bVar.g);
            if (TextUtils.isEmpty(this.d)) {
                str = "default";
            } else {
                str = this.d + "_default";
            }
            this.b = this.f15546a.createInstance(this.c, str, bVar.f, f.a());
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "themis canvas renderer (" + str + ") create success, is fixed frame rate:" + bVar.g);
        }
    }

    @Override // com.taobao.android.themis.graphics.d
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            return;
        }
        fCanvasInstance.a(i, i2, i3, i4);
    }

    @Override // com.taobao.android.themis.graphics.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            return;
        }
        fCanvasInstance.e();
    }

    @Override // com.taobao.android.themis.graphics.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            return;
        }
        fCanvasInstance.f();
    }

    @Override // com.taobao.android.themis.graphics.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.g();
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "themis canvas renderer destroyed success");
    }

    @Override // com.taobao.android.themis.graphics.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            return;
        }
        fCanvasInstance.setFixedFrameRate(z);
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis:renderer", "themis canvas renderer set fixed frame rate success");
    }
}
