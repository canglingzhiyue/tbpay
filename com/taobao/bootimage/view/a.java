package com.taobao.bootimage.view;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.dvr;
import tb.kdj;
import tb.kdk;
import tb.kdl;
import tb.kdn;
import tb.kdp;
import tb.kdr;
import tb.kds;
import tb.kdt;
import tb.kej;
import tb.kge;
import tb.kpx;

/* loaded from: classes6.dex */
public class a implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f16712a;
    private final kdt b;
    private final kdp c;
    private final kds d;
    private final kdr f;
    private boolean g = false;
    private final kdj e = new kdj();

    static {
        kge.a(1882509208);
        kge.a(-2021598127);
    }

    public a(String str, kdt kdtVar, kds kdsVar, kdr kdrVar) {
        this.f16712a = str;
        this.b = kdtVar;
        this.d = kdsVar;
        this.c = new kdp(str);
        this.f = kdrVar;
    }

    @Override // com.taobao.bootimage.view.j
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("AdViewState", " onShowSuccess");
        this.c.a(this.b);
    }

    @Override // com.taobao.bootimage.view.j
    public void a(String str, View view, View view2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ba6fa2", new Object[]{this, str, view, view2, new Boolean(z)});
            return;
        }
        kdp.a a2 = this.c.a(str, this.b);
        kej.a("AdViewState", " onClose shouldAnimate = " + a2.b + "，options:" + a2.f29987a);
        if (this.b == null) {
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("ItemId", this.b.b.itemId);
        hashMap.put(dvr.ACTION_CLOSE_TYPE_PARAM, str);
        if (view == null || !a2.b || StringUtils.equals(str, com.taobao.bootimage.d.CLOSE_TYPE_SKIP)) {
            kej.a("AdViewState", " onClose exitAdView should not Animate ");
            this.f.f();
            com.taobao.bootimage.linked.h.b(this.f16712a).g();
            return;
        }
        this.d.a(this.b.b.itemId);
        this.d.a(this.b.b.itemId, this.b.b.periodSeconds);
        if (StringUtils.equals(str, com.taobao.bootimage.d.CLOSE_TYPE_SKIP)) {
            kej.a("AdViewState", " onClose exitAdView CLOSE_TYPE_SKIP");
            this.f.f();
            com.taobao.bootimage.linked.h.b(this.f16712a).g();
        } else if (this.g) {
            kej.a("AdViewState", " onClose CancelAnimation");
            com.taobao.bootimage.linked.h.b(this.f16712a).g();
        } else if (z) {
        } else {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.video_container);
            if (viewGroup != null) {
                ImageView imageView = new ImageView(viewGroup.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageDrawable(kpx.a(viewGroup));
                viewGroup.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
            this.e.a(a(view, view2), new kdk(this.f16712a, this.f), new kdl(view, a2.f29987a));
            this.e.a();
        }
    }

    @Override // com.taobao.bootimage.view.j
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("AdViewState", "onShowError:" + i);
        this.c.a(i, this.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = true;
        kej.a("AdViewState", "cancelAnimation");
        this.e.b();
    }

    private kdn a(View view, View view2) {
        long j;
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdn) ipChange.ipc$dispatch("ea30a8c9", new Object[]{this, view, view2});
        }
        if (this.b.b.alphaAnimationDuration <= 0 || this.b.b.scaleAnimationDuration < this.b.b.alphaAnimationDuration) {
            j = 100;
            j2 = 500;
        } else {
            j2 = this.b.b.scaleAnimationDuration;
            j = this.b.b.alphaAnimationDuration;
        }
        LinkedSplashData b = com.taobao.bootimage.linked.h.b(this.f16712a).b();
        if (b == null || !StringUtils.equals(b.getLinkedDataType(), "feeds")) {
            j3 = j2;
        } else {
            j = 100;
            j3 = 500;
        }
        return new kdn(true, j3 - j, true, true, j3, j3, view, view2);
    }
}
