package com.taobao.tbliveinteractive.componentlist;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qne;
import tb.qnh;

/* loaded from: classes8.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22108a;
    private List<c> b = new ArrayList();
    private com.taobao.tbliveinteractive.componentlist.a c;
    private NetResponse d;
    private NetBaseOutDo e;
    private Object f;
    private boolean g;
    private boolean h;
    private boolean i;
    private com.taobao.tbliveinteractive.c j;
    private JSONObject k;

    /* loaded from: classes8.dex */
    public interface a {
        void a(c cVar);
    }

    static {
        kge.a(22794971);
        kge.a(1975106370);
    }

    public b(Context context, com.taobao.tbliveinteractive.c cVar) {
        this.f22108a = context;
        this.j = cVar;
    }

    public synchronized void a(com.taobao.alilive.aliliveframework.frame.a aVar, VideoInfo videoInfo, String str, String str2, String str3, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671c7c2c", new Object[]{this, aVar, videoInfo, str, str2, str3, aVar2});
            return;
        }
        Log.e("TaoLiveRoomTest", "getComponentList start:" + System.currentTimeMillis());
        if (!this.g) {
            if (videoInfo == null) {
                return;
            }
            if (aVar2 != null && qne.v()) {
                aVar2.a(this);
            } else {
                a(videoInfo, str, str2, str3);
            }
            this.g = true;
        }
    }

    private void a(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f9d83", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.tbliveinteractive.componentlist.a(this);
        }
        this.c.a(videoInfo.liveId, str3, str, str2, videoInfo.roomType, videoInfo.newRoomType);
    }

    public synchronized void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12657be2", new Object[]{this, cVar});
        } else {
            a(cVar, false);
        }
    }

    public synchronized void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4ab332", new Object[]{this, cVar, new Boolean(z)});
        } else if (cVar == null) {
            qnh.a("getComponentList_track", "errorCode=listener is null");
        } else if (!this.h) {
            if (z) {
                this.b.add(0, cVar);
            } else {
                this.b.add(cVar);
            }
        } else if (this.i) {
            if (this.k == null) {
                cVar.onSuccess(0, this.d, this.e, this.f);
            } else {
                cVar.a(this.k);
            }
        } else {
            cVar.onError(0, this.d, this.f);
        }
    }

    public synchronized void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82999fe", new Object[]{this, dVar});
            return;
        }
        if (this.b != null) {
            this.b.remove(dVar);
        }
    }

    @Override // com.taobao.tbliveinteractive.componentlist.c
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        qnh.a("TaoLiveRoomTest", "smartlanding getComponentList end:" + System.currentTimeMillis());
        com.taobao.tbliveinteractive.c cVar = this.j;
        if (cVar != null) {
            cVar.a(true);
        }
        this.k = jSONObject;
        this.i = true;
        this.h = true;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i) != null) {
                this.b.get(i).a(jSONObject);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            a(i, netResponse, netBaseOutDo, obj);
        }
    }

    private void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943cf852", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        qnh.a("TaoLiveRoomTest", "getComponentList end:" + System.currentTimeMillis());
        com.taobao.tbliveinteractive.c cVar = this.j;
        if (cVar != null) {
            cVar.a(true);
        }
        this.d = netResponse;
        this.e = netBaseOutDo;
        this.f = obj;
        this.i = true;
        this.h = true;
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.get(i2) != null) {
                this.b.get(i2).onSuccess(i, netResponse, netBaseOutDo, obj);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        qnh.a("TaoLiveRoomTest", "getComponentList end onError:" + System.currentTimeMillis() + " type " + i);
        com.taobao.tbliveinteractive.c cVar = this.j;
        if (cVar != null) {
            cVar.a(false);
        }
        this.d = netResponse;
        this.f = obj;
        this.i = false;
        this.h = true;
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.get(i2) != null) {
                this.b.get(i2).onError(i, netResponse, obj);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!this.h) {
            qnh.a("getComponentList_track", "errorCode=destroy_" + this.g + "_" + this.i + "_" + this.h);
        }
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.a();
            this.c = null;
        }
        this.j = null;
    }
}
