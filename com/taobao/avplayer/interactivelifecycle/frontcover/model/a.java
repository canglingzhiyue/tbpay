package com.taobao.avplayer.interactivelifecycle.frontcover.model;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWFrontCoverBean f16519a;
    public View b;

    static {
        kge.a(-556583449);
    }

    public void a(DWFrontCoverBean dWFrontCoverBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8802ab00", new Object[]{this, dWFrontCoverBean});
        } else {
            this.f16519a = dWFrontCoverBean;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.b = view;
        }
    }

    public DWFrontCoverBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWFrontCoverBean) ipChange.ipc$dispatch("76a191c6", new Object[]{this}) : this.f16519a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
    }
}
