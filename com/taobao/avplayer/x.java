package com.taobao.avplayer;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16621a;
    private FrameLayout b;
    private ImageView c;
    private ImageView.ScaleType d = ImageView.ScaleType.FIT_CENTER;
    private com.taobao.avplayer.common.z e;

    static {
        kge.a(-1262854291);
    }

    public static /* synthetic */ com.taobao.avplayer.common.z a(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.z) ipChange.ipc$dispatch("302ca0e2", new Object[]{xVar}) : xVar.e;
    }

    public x(DWContext dWContext) {
        this.f16621a = dWContext;
        this.b = new FrameLayout(this.f16621a.getActivity());
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.x.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (x.a(x.this) == null) {
                } else {
                    x.a(x.this).hook();
                }
            }
        });
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.c == null) {
            this.c = new ImageView(this.f16621a.getActivity());
            this.c.setScaleType(this.d);
            this.b.removeAllViews();
            this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        DWContext dWContext = this.f16621a;
        if (dWContext == null || dWContext.mDWImageAdapter == null) {
            return;
        }
        this.f16621a.mDWImageAdapter.a(str, this.c);
    }

    public void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
            return;
        }
        this.c = imageView;
        this.b.removeAllViews();
        this.b.setVisibility(0);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bcf1c2", new Object[]{this, scaleType});
            return;
        }
        this.d = scaleType;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    public void a(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
        } else {
            this.e = zVar;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f16621a;
        if (dWContext == null || dWContext.mDWImageAdapter == null) {
            return;
        }
        this.b.removeAllViews();
        this.f16621a.mDWImageAdapter.a((String) null, this.c);
    }
}
