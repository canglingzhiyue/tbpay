package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.j;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VideoInfo f21459a;
    public String b;
    private int c = 0;
    private int d = 10;
    private com.taobao.taolive.movehighlight.bundle.timeshiftContent.a e;
    private TBLiveDataModel f;
    private String g;
    private com.taobao.alilive.aliliveframework.frame.a h;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(NetResponse netResponse);
    }

    static {
        kge.a(1824213101);
    }

    public b(TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f = tBLiveDataModel;
        this.h = aVar;
        this.e = new com.taobao.taolive.movehighlight.bundle.timeshiftContent.a(this.h);
        b();
        this.f21459a = k.a(tBLiveDataModel);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.f;
        if (tBLiveDataModel == null || tBLiveDataModel.mInitParams == null) {
            return;
        }
        this.g = this.f.mInitParams.get(aw.PARAM_TRANSPARENT_PARAMS);
        this.g = j.a(this.g, this.f.mInitParams.get("timeMovingPcmIdParam"));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!StringUtils.isEmpty(this.b)) {
            this.c = (this.c + i) - 1;
        } else {
            this.c += i;
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52089840", new Object[]{this, str, aVar});
            return;
        }
        this.c = 0;
        this.d = 10;
        this.b = str;
        this.e.a(this.f21459a.liveId, this.b, this.c, this.d, this.g, aVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1c9df6", new Object[]{this, aVar});
            return;
        }
        this.d = 15;
        this.e.a(this.f21459a.liveId, this.b, this.c, this.d, this.g, aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bundle.timeshiftContent.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
