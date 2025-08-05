package com.taobao.tao.flexbox.layoutmanager.container;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static k f20263a;
    private List<WeakReference<View>> b;

    private k() {
    }

    static {
        kge.a(-710450610);
        f20263a = new k();
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("716c58a9", new Object[0]) : f20263a;
    }

    public void a(List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b = new ArrayList();
        if (list == null) {
            return;
        }
        for (Pair<View, String> pair : list) {
            this.b.add(new WeakReference<>(pair.first));
        }
    }

    public List<View> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<WeakReference<View>> list = this.b;
        if (list != null) {
            for (WeakReference<View> weakReference : list) {
                View view = weakReference.get();
                if (view != null && (view.getContext() instanceof Activity) && !((Activity) view.getContext()).isFinishing()) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }
}
