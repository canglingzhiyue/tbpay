package com.taobao.taolive.room.ui.swipeback;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f21732a;
    private SwipeBackLayout b;

    static {
        kge.a(-1241525995);
    }

    public b(Activity activity) {
        this.f21732a = activity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f21732a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f21732a.getWindow().getDecorView().setBackgroundDrawable(null);
        this.b = (SwipeBackLayout) LayoutInflater.from(this.f21732a).inflate(R.layout.taolive_swipeback_layout, (ViewGroup) null);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.attachToActivity(this.f21732a);
        }
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        SwipeBackLayout swipeBackLayout = this.b;
        if (swipeBackLayout == null) {
            return null;
        }
        return swipeBackLayout.findViewById(i);
    }

    public SwipeBackLayout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwipeBackLayout) ipChange.ipc$dispatch("7f13b879", new Object[]{this}) : this.b;
    }
}
