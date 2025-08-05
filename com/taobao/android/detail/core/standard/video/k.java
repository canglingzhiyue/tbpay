package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.taobao.R;
import tb.bay;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class k extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout g;
    private FrameLayout h;

    static {
        kge.a(1080299769);
    }

    public k(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoMiniWindow");
        if (!(activity instanceof DetailCoreActivity)) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) activity;
        if (detailCoreActivity.b == null || detailCoreActivity.b.y() == null) {
            return;
        }
        detailCoreActivity.b.y().a(new com.taobao.android.detail.core.detail.content.e() { // from class: com.taobao.android.detail.core.standard.video.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                } else if (f <= 0.1f || !k.this.e()) {
                } else {
                    k.this.d();
                }
            }
        });
    }

    @Override // com.taobao.android.detail.core.standard.video.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = View.inflate(this.f9865a, R.layout.pic_gallery_video_min_window, null);
        this.g = (FrameLayout) this.c.findViewById(R.id.videoContainer);
        this.h = (FrameLayout) this.c.findViewById(R.id.closeView);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.video.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                k.this.d();
                if (k.this.f == null) {
                    return;
                }
                k.this.f.b();
            }
        });
        if (this.b != null) {
            this.b.addView(this.c, new ViewGroup.LayoutParams(-2, -2));
            this.b.bringToFront();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.g.setOutlineProvider(new a());
        this.g.setClipToOutline(true);
    }

    @Override // com.taobao.android.detail.core.standard.video.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.setVisibility(0);
        if (this.f == null) {
            return;
        }
        int a2 = bay.a(125.0f);
        int a3 = bay.a((int) (125.0f / this.f.n().d()));
        this.f.a(a2, a3);
        View o = this.f.o();
        ViewParent parent = o.getParent();
        if (parent == this.g) {
            return;
        }
        this.d = (ViewGroup) parent;
        if (this.d != null) {
            this.d.removeView(o);
        }
        this.e = o.getLayoutParams();
        o.setLayoutParams(new FrameLayout.LayoutParams(a2, a3));
        this.g.addView(o);
    }

    @Override // com.taobao.android.detail.core.standard.video.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c.setVisibility(8);
        if (this.f == null) {
            return;
        }
        this.f.a(bay.b());
        View o = this.f.o();
        if (this.e == null) {
            int b = bay.b();
            this.e = new ViewGroup.LayoutParams(b, (int) (b / this.f.n().d()));
        }
        o.setLayoutParams(this.e);
        ViewGroup viewGroup = (ViewGroup) o.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(o);
        }
        if (this.d == null) {
            return;
        }
        this.d.addView(o);
    }

    @Override // com.taobao.android.detail.core.standard.video.b
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c.getVisibility() == 0;
    }

    /* loaded from: classes4.dex */
    public static class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-675295709);
        }

        private a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), bay.a(12.0f));
        }
    }
}
