package com.taobao.android.live.plugin.atype.flexalocal.good;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.e;
import com.taobao.taolive.sdk.goodlist.g;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.goodlist.j;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.goodlist.m;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.hiq;
import tb.his;
import tb.hit;
import tb.kge;
import tb.pmv;
import tb.sfa;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String l;
    private static a z;
    public String c;
    public String d = "预约成功，宝贝开始讲解时会在\n手机淘宝-消息收到提醒";
    public String e = "预约失败，请稍后再试";
    public String f = "取消预约成功";
    public String g = "取消预约失败，请稍后再试";
    private e q;
    private l r;
    private j s;
    private m t;
    private i u;
    private g v;

    static {
        kge.a(-1932462729);
        l = a.class.getSimpleName();
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a8221642", new Object[0]);
        }
        if (z == null) {
            z = new a();
        }
        return z;
    }

    public void a(Context context, TBLiveDataModel tBLiveDataModel, c cVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cc9114", new Object[]{this, context, tBLiveDataModel, cVar, new Boolean(z2)});
            return;
        }
        a((c) null);
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(context);
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            his.b(l, "initParams | videoinfo is null.");
            return;
        }
        sfa.a((Activity) context, cVar);
        his.a(l, "updateTBLiveGoodsSourceData.");
    }

    public b a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("709710a5", new Object[]{this, cVar, str});
        }
        if (cVar == null) {
            hit.a("getListCacheData");
            return null;
        }
        return cVar.c(str);
    }

    public void a(c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180c0097", new Object[]{this, cVar, bVar});
        } else if (cVar == null) {
            hit.a("setListCacheData");
        } else {
            cVar.a(bVar);
        }
    }

    public boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("735816d4", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            hit.a("getFollowState");
            return false;
        }
        return cVar.l.d();
    }

    public void a(c cVar, pmv pmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b19e90", new Object[]{this, cVar, pmvVar, str});
        } else if (cVar == null) {
            hit.a("follow");
        } else {
            hiq.a(cVar, pmvVar, str);
        }
    }

    public int c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5683ca04", new Object[]{this, cVar})).intValue();
        }
        if (cVar == null || cVar.t() == null) {
            hit.a("getVideoStatus");
            return 0;
        }
        return cVar.t().status;
    }

    public String d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f58e858e", new Object[]{this, cVar});
        }
        if (cVar == null) {
            hit.a("getAccountId");
            return "";
        }
        return cVar.m();
    }

    public long e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cdb3087", new Object[]{this, cVar})).longValue();
        }
        if (cVar == null) {
            hit.a("getTopItemId");
            return -1L;
        }
        return cVar.L.b;
    }

    public boolean f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e3d8", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            hit.a("isLandscape");
            return false;
        }
        return cVar.r();
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfeb41f", new Object[]{this, eVar});
        } else {
            this.q = eVar;
        }
    }

    public e i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2f60b4a7", new Object[]{this}) : this.q;
    }

    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc01e2b8", new Object[]{this, lVar});
        } else {
            this.r = lVar;
        }
    }

    public l j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("f861acc1", new Object[]{this}) : this.r;
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc00f9fa", new Object[]{this, jVar});
        } else {
            this.s = jVar;
        }
    }

    public j k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("c162a3c4", new Object[]{this}) : this.s;
    }

    public m l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("8a639b62", new Object[]{this}) : this.t;
    }

    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc025717", new Object[]{this, mVar});
        } else {
            this.t = mVar;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.c;
    }

    public int h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c65e4a49", new Object[]{this, cVar})).intValue();
        }
        if (cVar == null) {
            hit.a("getShopVipEnable");
            return 1;
        }
        return cVar.c.v;
    }

    public boolean i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a989fd9b", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            hit.a("isShowVipEnableServer");
            return true;
        }
        return cVar.c.y;
    }

    public boolean j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb5b0dc", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            hit.a("isShowVipUserAction");
            return true;
        }
        return cVar.c.z;
    }

    public void a(c cVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560c125", new Object[]{this, cVar, new Boolean(z2)});
        } else if (cVar == null) {
        } else {
            cVar.c.z = z2;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c638f", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            cVar.z();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.j();
        }
    }

    public String k(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a60c25a7", new Object[]{this, cVar});
        }
        if (cVar == null) {
            hit.a("getCurrentTabName");
            return "全部";
        }
        return cVar.I;
    }

    public i q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("77686f2b", new Object[]{this}) : this.u;
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc00859b", new Object[]{this, iVar});
        } else {
            this.u = iVar;
        }
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbff9cdd", new Object[]{this, gVar});
        } else {
            this.v = gVar;
        }
    }

    public g r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4069662e", new Object[]{this}) : this.v;
    }
}
