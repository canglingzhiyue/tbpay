package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f9865a;
    public ViewGroup b;
    public View c;
    public ViewGroup d;
    public ViewGroup.LayoutParams e;
    public AbsPicGalleryVideoPlayer f;

    static {
        kge.a(-677007983);
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    public b(Activity activity, ViewGroup viewGroup) {
        this.f9865a = activity;
        this.b = viewGroup;
        b();
    }

    public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de199934", new Object[]{this, absPicGalleryVideoPlayer});
        } else {
            this.f = absPicGalleryVideoPlayer;
        }
    }

    public AbsPicGalleryVideoPlayer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("f2e71e7a", new Object[]{this}) : this.f;
    }
}
