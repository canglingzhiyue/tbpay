package com.taobao.taolive.room.controller2;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class c extends com.taobao.taolive.sdk.controller.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.taolive.sdk.controller.f C;

    /* renamed from: a  reason: collision with root package name */
    public String f21593a;
    public String b;
    public String d;
    public Map<String, Object> e;
    public String f;
    private com.taobao.taolive.room.service.h o;
    private boolean p;
    public List<GoodCardItemTppBean> t_;
    public boolean u;
    private TBLiveRecEngineV2 x;
    public boolean y;
    public boolean z;

    static {
        kge.a(140951857);
    }

    public c(Context context) {
        super(context);
        this.o = new com.taobao.taolive.room.service.h();
        this.p = false;
        this.t_ = new ArrayList();
        this.u = false;
        this.C = new com.taobao.taolive.sdk.controller.f();
        this.y = false;
    }

    public com.taobao.taolive.room.service.h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.room.service.h) ipChange.ipc$dispatch("bf030eb", new Object[]{this}) : this.o;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.p;
    }

    public TBLiveRecEngineV2 w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2) ipChange.ipc$dispatch("c8fe1635", new Object[]{this}) : this.x;
    }

    public void a(TBLiveRecEngineV2 tBLiveRecEngineV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b2361f", new Object[]{this, tBLiveRecEngineV2});
        } else {
            this.x = tBLiveRecEngineV2;
        }
    }
}
