package com.taobao.android.tstudio;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f15688a = new a();

    public b(String str) {
        this.f15688a.c = str;
    }

    public a a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f5d667f8", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_api_request";
        aVar.f = obj;
        return aVar;
    }

    public a b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("23af0257", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_dx_visible";
        aVar.f = obj;
        return aVar;
    }

    public a c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("51879cb6", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_dx_main_panorama";
        aVar.f = obj;
        return aVar;
    }

    public a d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7f603715", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_dx_item_Info";
        aVar.f = obj;
        return aVar;
    }

    public a e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad38d174", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_render_error";
        aVar.f = obj;
        return aVar;
    }

    public a f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("db116bd3", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_page_enter";
        aVar.f = obj;
        return aVar;
    }

    public a g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8ea0632", new Object[]{this, obj});
        }
        a aVar = this.f15688a;
        aVar.d = "event_page_exit";
        aVar.f = obj;
        return aVar;
    }
}
