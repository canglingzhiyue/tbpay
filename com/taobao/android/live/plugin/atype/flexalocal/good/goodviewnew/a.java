package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hgv;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a<T extends hgv> extends b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f13769a;
    public ViewGroup b;

    static {
        kge.a(174360888);
    }

    public abstract View a(ViewGroup viewGroup);

    public a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ViewGroup viewGroup) {
        super(cVar);
        this.f13769a = viewGroup;
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            a(this.f13769a);
        }
    }

    public Animation a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("367601ae", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("97c89e4d", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }
}
