package com.taobao.taolive.room.business.mess;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.g;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.common.UserLevelAvatar;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.dds;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.poy;
import tb.tkg;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class e implements com.taobao.taolive.sdk.adapter.network.d, b.a, dds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static e b;

    /* renamed from: a  reason: collision with root package name */
    private LiveDetailMessinfoResponseData f21537a;
    private boolean c;
    private boolean d;
    private boolean e;
    private c f;
    private List<com.taobao.taolive.sdk.adapter.network.d> g = new ArrayList();
    private NetResponse h;
    private NetBaseOutDo i;
    private Object j;
    private com.taobao.alilive.aliliveframework.frame.a k;

    static {
        kge.a(1085013620);
        kge.a(-797454141);
        kge.a(-1546492136);
        kge.a(-169985304);
    }

    @Override // tb.dds
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    @Override // tb.dds
    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (!this.c) {
            if (tki.a()) {
                if ((this.k instanceof h) && ((h) this.k).O() != null) {
                    ((h) this.k).O().a(this);
                }
            } else {
                b(str, str2);
            }
            this.c = true;
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.f == null) {
                this.f = new c(this);
            }
            this.f.a(str, str2, this.k);
        }
    }

    @Override // tb.dds
    public synchronized void a(com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af73bd", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            if (this.d) {
                if (this.e) {
                    dVar.onSuccess(0, this.h, this.i, this.j);
                    return;
                } else {
                    dVar.onError(0, this.h, this.j);
                    return;
                }
            }
            this.g.add(dVar);
        }
    }

    @Override // tb.dds
    public synchronized void b(com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82999fe", new Object[]{this, dVar});
            return;
        }
        if (this.g != null) {
            this.g.remove(dVar);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            return;
        }
        LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = (LiveDetailMessinfoResponseData) tkg.a(unImportantLiveInfoResponseData.messData, LiveDetailMessinfoResponseData.class);
        if (liveDetailMessinfoResponseData == null) {
            return;
        }
        LiveDetailMessinfoResponse liveDetailMessinfoResponse = new LiveDetailMessinfoResponse();
        liveDetailMessinfoResponse.setData(liveDetailMessinfoResponseData);
        a(i, netResponse, liveDetailMessinfoResponse, obj);
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (!(obj instanceof c)) {
        } else {
            a(i, netResponse, netBaseOutDo, obj);
        }
    }

    private void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        LiveDetailMessinfoResponseData mo1437getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943cf852", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        LiveDetailMessinfoResponse liveDetailMessinfoResponse = (LiveDetailMessinfoResponse) netBaseOutDo;
        if (liveDetailMessinfoResponse != null && (mo1437getData = liveDetailMessinfoResponse.mo1437getData()) != null) {
            this.f21537a = mo1437getData;
            b();
            if (mo1437getData.visitorIdentity != null) {
                com.taobao.taolive.room.ui.fanslevel.a.a().b(mo1437getData.visitorIdentity.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER));
            }
            if (mo1437getData.activity != null) {
                poy.d(mo1437getData.activity.bizData, this.k);
            } else {
                poy.d((String) null, this.k);
            }
        }
        this.h = netResponse;
        this.i = netBaseOutDo;
        this.j = obj;
        this.e = true;
        this.d = true;
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.g.get(i2).onSuccess(i, netResponse, netBaseOutDo, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (netResponse != null) {
            if (k.b(netResponse.getRetCode())) {
                ddw.a().a(xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW);
            }
            this.f21537a = null;
            b();
            this.h = netResponse;
            this.j = obj;
            this.e = false;
            this.d = true;
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.get(i2).onError(i, netResponse, obj);
            }
            if (pmd.a().n() == null) {
                return;
            }
            pmd.a().n().a("taolive", netResponse.getApi(), netResponse.getRetCode(), netResponse.getRetMsg());
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

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(this.k);
        if (u == null || u.broadCaster == null || TextUtils.isEmpty(u.topic) || pmd.a().q() == null) {
            return;
        }
        UserLevelAvatar userLevelAvatar = new UserLevelAvatar();
        userLevelAvatar.userid = pmd.a().q().a();
        userLevelAvatar.nick = pmd.a().q().b();
        LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = this.f21537a;
        if (liveDetailMessinfoResponseData != null && liveDetailMessinfoResponseData.visitorIdentity != null) {
            userLevelAvatar.identify = this.f21537a.visitorIdentity;
        } else if (u.visitorIdentity != null) {
            userLevelAvatar.identify = u.visitorIdentity;
        }
        userLevelAvatar.isMember = u.shopVip;
        userLevelAvatar.flowSource = c();
        g.a(u.liveId, u.broadCaster.accountId, u.topic, 10031, JSON.toJSONString(userLevelAvatar), null, null, j.e(this.k));
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        Map<String, String> aa = poy.aa(this.k);
        return (aa == null || aa.isEmpty()) ? "" : aa.get(aw.PARAM_FLOW_SOURCE);
    }

    @Override // tb.dds
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        this.g.clear();
        b = null;
        this.c = false;
        this.d = false;
        this.f21537a = null;
        this.k = null;
    }

    @Override // tb.dds
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f21537a != null;
    }

    @Override // tb.dds
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f21537a.snsNick;
    }

    @Override // tb.dds
    public LiveDetailMessinfoResponseData f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData) ipChange.ipc$dispatch("daa137c2", new Object[]{this}) : this.f21537a;
    }
}
