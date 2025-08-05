package com.taobao.bootimage.arch.flow.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f16672a;
    private ViewGroup b;
    private View c;
    private View d;
    private View e;

    static {
        kge.a(286697646);
    }

    public c() {
    }

    public c(ImageView imageView, ViewGroup viewGroup, View view, View view2, View view3) {
        this.f16672a = imageView;
        this.b = viewGroup;
        this.d = view;
        this.c = view2;
        this.e = view3;
    }

    public ImageView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3a195828", new Object[]{this}) : this.f16672a;
    }

    public ViewGroup b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7d42400c", new Object[]{this}) : this.b;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f16672a == null || this.b == null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.c;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
