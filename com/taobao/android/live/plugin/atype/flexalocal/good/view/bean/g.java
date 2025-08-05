package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kuj;

/* loaded from: classes6.dex */
public class g extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13848a;
    private Object b;
    private String c;
    private kuj d;

    static {
        kge.a(-365721047);
    }

    public g(View view) {
        super(view);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f13848a = z;
        }
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.b;
    }

    public kuj d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kuj) ipChange.ipc$dispatch("261bfcfb", new Object[]{this}) : this.d;
    }

    public void a(kuj kujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd6698", new Object[]{this, kujVar});
        } else {
            this.d = kujVar;
        }
    }
}
