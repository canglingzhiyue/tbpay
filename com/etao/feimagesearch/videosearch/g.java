package com.etao.feimagesearch.videosearch;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f7052a;
    private TextureView b;
    private List<h> c = new ArrayList(2);
    private int d;
    private boolean e;
    private a f;
    private int g;
    private m h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Bitmap bitmap, long j);
    }

    static {
        kge.a(1061085700);
    }

    public g(m mVar, int i, a aVar) {
        this.h = mVar;
        this.b = mVar.b();
        this.f = aVar;
        TextureView textureView = this.b;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new l(textureView.getSurfaceTextureListener(), this));
        }
        this.g = (i / com.etao.feimagesearch.config.b.k()) / 2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c.isEmpty()) {
            this.f7052a = true;
        } else {
            h remove = this.c.remove(0);
            this.f.a(remove.f7053a, remove.b);
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c.size() >= 2) {
        } else {
            this.h.g();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.d == 0 && !this.e) {
            this.e = true;
            Bitmap bitmap = this.b.getBitmap();
            this.e = false;
            a(bitmap);
        }
        if (this.e) {
            return;
        }
        this.d++;
        if (this.d < this.g) {
            return;
        }
        this.d = 0;
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else if (this.f7052a) {
            this.f7052a = false;
            this.f.a(bitmap, this.h.d());
            c();
        } else {
            this.c.add(new h(bitmap, this.h.d()));
            if (this.c.size() < 2) {
                return;
            }
            this.h.h();
        }
    }
}
