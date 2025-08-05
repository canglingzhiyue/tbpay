package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.b;
import com.taobao.infoflow.protocol.engine.invoke.biz.d;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.f;
import com.taobao.infoflow.protocol.engine.invoke.biz.g;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.a;
import com.taobao.tao.topmultitab.protocol.c;
import java.util.Map;
import tb.lcv;

/* loaded from: classes7.dex */
public abstract class ncv extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lcu f31362a;
    public ljt b;
    public lkl c;
    public lkm d;
    public lkj e;
    public h f;
    public j g;
    public l h;
    public e i;
    public b j;
    private final String k;
    private d l;
    private f m;
    private g o;

    public abstract lcu a(c cVar, String str);

    public ncv(c cVar, String str) {
        super(cVar);
        this.k = "TmgBaseInfoFlow";
        b(cVar, str);
    }

    private void b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86114218", new Object[]{this, cVar, str});
            return;
        }
        llp.a(new lcv.a(new lls()));
        this.f31362a = a(cVar, str);
        lcu lcuVar = this.f31362a;
        if (lcuVar == null) {
            return;
        }
        this.b = lcuVar.b();
        this.c = this.b.a();
        this.d = this.b.b();
        this.e = this.b.c();
        this.f = this.e.getPullDownRefreshInvoker();
        this.g = this.e.getRocketInvoker();
        this.h = this.e.getUtInvoker();
        this.g = this.e.getRocketInvoker();
        this.j = this.e.getContainerInvoker();
        this.i = this.e.getNaviBarInvoker();
        this.l = this.e.getMulticlassTabInvoker();
        this.m = this.e.getOutLinkInvoker();
        this.o = this.e.getPopInvoker();
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        ljt ljtVar = this.b;
        return ljtVar == null ? new View(context) : ljtVar.a(context);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        lkl lklVar = this.c;
        if (lklVar == null) {
            return;
        }
        lklVar.onResume();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        lkl lklVar = this.c;
        if (lklVar == null) {
            return;
        }
        lklVar.onPause();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        lkl lklVar = this.c;
        if (lklVar == null || this.f31362a == null) {
            return;
        }
        lklVar.onDestroy();
        this.f31362a.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        lkm lkmVar = this.d;
        if (lkmVar != null) {
            lkmVar.onPageSelected();
        }
        g gVar = this.o;
        if (gVar == null) {
            return;
        }
        gVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        lkm lkmVar = this.d;
        if (lkmVar != null) {
            lkmVar.onPageUnSelected();
        }
        g gVar = this.o;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        h hVar = this.f;
        if (hVar == null) {
            return true;
        }
        return hVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        h hVar = this.f;
        if (hVar == null) {
            return false;
        }
        return hVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        j jVar = this.g;
        if (jVar == null) {
            return;
        }
        jVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        j jVar = this.g;
        if (jVar == null) {
            return false;
        }
        return jVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        l lVar = this.h;
        if (lVar == null) {
            return null;
        }
        return lVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        l lVar = this.h;
        if (lVar == null) {
            return null;
        }
        return lVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        l lVar = this.h;
        if (lVar == null) {
            return null;
        }
        return lVar.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        b bVar = this.j;
        if (bVar == null) {
            return true;
        }
        return bVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return eVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void setSubPageChangeListener(final IHomeSubTabController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81efd6ac", new Object[]{this, aVar});
            return;
        }
        d dVar = this.l;
        if (dVar == null) {
            return;
        }
        if (aVar == null) {
            dVar.a(null);
        } else {
            dVar.a(new IMulticlassTabService.a() { // from class: tb.ncv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
                public void a(llm llmVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    } else {
                        aVar.a(llmVar.a());
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        b bVar = this.j;
        if (bVar == null) {
            return false;
        }
        return bVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        b bVar = this.j;
        if (bVar == null) {
            return 0;
        }
        return bVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        lkl lklVar = this.c;
        if (lklVar == null) {
            return;
        }
        lklVar.onWillExit();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        f fVar = this.m;
        if (fVar == null) {
            return;
        }
        fVar.a(intent, str);
    }
}
