package com.taobao.mediaplay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MediaContext f18019a;
    private FrameLayout b;
    private ImageView c;
    private ImageView.ScaleType d = ImageView.ScaleType.FIT_CENTER;

    static {
        kge.a(375051628);
    }

    public f(MediaContext mediaContext) {
        this.f18019a = mediaContext;
        this.b = new FrameLayout(this.f18019a.getContext());
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

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }
}
