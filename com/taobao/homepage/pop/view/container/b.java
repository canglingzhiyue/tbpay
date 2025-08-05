package com.taobao.homepage.pop.view.container;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import com.taobao.homepage.pop.utils.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;
import tb.kyu;
import tb.lah;
import tb.lak;

/* loaded from: classes7.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BasePopContainer c;
    public lak d;
    public com.taobao.homepage.pop.view.container.a e;
    public kyu f;

    /* renamed from: a  reason: collision with root package name */
    public Handler f17261a = new Handler(Looper.getMainLooper());
    public final Map<Integer, Map<String, com.taobao.homepage.pop.viewmodel.b>> b = new ConcurrentHashMap(32);
    public final Map<String, com.taobao.homepage.pop.viewmodel.b> g = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public interface a {
        void a(boolean z, String str);
    }

    public abstract void a(com.taobao.homepage.pop.viewmodel.b bVar, a aVar);

    public static /* synthetic */ void a(b bVar, com.taobao.homepage.pop.viewmodel.b bVar2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d159109", new Object[]{bVar, bVar2, new Boolean(z), str});
        } else {
            bVar.a(bVar2, z, str);
        }
    }

    public b(BasePopContainer basePopContainer, lak lakVar, kyu kyuVar) {
        this.c = basePopContainer;
        this.d = lakVar;
        this.f = kyuVar;
    }

    public void a(a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d89ccba", new Object[]{this, aVar, new Boolean(z), str});
        } else if (aVar == null) {
        } else {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "notifyTriggerResult, result=" + z);
            aVar.a(z, str);
        }
    }

    public void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ec7ef0", new Object[]{this, aVar, new Boolean(z)});
        } else if (aVar == null) {
        } else {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "notifyTriggerResult, result=" + z);
            aVar.a(z, null);
        }
    }

    public void a(List<IPopData> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (list != null) {
            i = list.size();
        }
        com.taobao.homepage.pop.utils.c.b("BaseContainerTrigger ", "doDataRefreshTrigger, dataSize=" + i);
        if (i == 0) {
            return;
        }
        for (IPopData iPopData : list) {
            if (iPopData != null) {
                a(new com.taobao.homepage.pop.viewmodel.b(iPopData));
            }
        }
    }

    public void b(List<IPopData> list) {
        IPopConfig popConfig;
        IPopPoint point;
        kyu kyuVar;
        int a2;
        View b;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (list != null) {
            i = list.size();
        }
        com.taobao.homepage.pop.utils.c.b("BaseContainerTrigger ", "doDataRefreshTrigger, dataSize=" + i);
        if (i == 0) {
            return;
        }
        for (IPopData iPopData : list) {
            if (iPopData != null && iPopData.valid() && (popConfig = iPopData.getPopConfig()) != null && popConfig.getHierarchy() == 2 && (point = popConfig.getPoint()) != null && !TextUtils.isEmpty(point.getSectionBizCode()) && (kyuVar = this.f) != null && (a2 = kyuVar.d().a(point.getSectionBizCode())) >= 0 && (b = this.f.d().b(a2)) != null) {
                a(new com.taobao.homepage.pop.viewmodel.b(iPopData, a2, b));
            }
        }
    }

    public final void a(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84264ee", new Object[]{this, bVar});
            return;
        }
        com.taobao.homepage.pop.utils.d.a("PopTargetCardAttach", bVar.a());
        a(bVar, false);
    }

    public final void b(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa79a0d", new Object[]{this, bVar});
            return;
        }
        com.taobao.homepage.pop.utils.d.a("PopTargetCardReTrigger", bVar.a());
        a(bVar, true);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, com.taobao.homepage.pop.viewmodel.b> map = this.b.get(Integer.valueOf(i));
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList<com.taobao.homepage.pop.viewmodel.b> arrayList = new ArrayList(map.values());
        map.clear();
        for (com.taobao.homepage.pop.viewmodel.b bVar : arrayList) {
            a(bVar, true);
        }
    }

    public void a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
            return;
        }
        com.taobao.homepage.pop.viewmodel.b remove = this.g.remove(iPopData.getBusinessID());
        if (remove == null) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "reTriggerPopByUCP, pending is null");
            com.taobao.homepage.pop.ucp.c.a(com.taobao.homepage.pop.ucp.c.a(this.f), "Error", 3, com.taobao.homepage.pop.ucp.b.ERROR_OTHER_ERROR);
            return;
        }
        f(remove);
        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "reTriggerPopByUCP");
    }

    private void f(final com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3c6e89", new Object[]{this, bVar});
            return;
        }
        IPopData a2 = bVar.a();
        g(bVar);
        if (!(com.taobao.homepage.pop.ucp.c.a(a2) && bVar.d() != null && bVar.d().a(a2))) {
            com.taobao.homepage.pop.ucp.c.a(com.taobao.homepage.pop.ucp.c.a(this.f), "Error", 3, com.taobao.homepage.pop.ucp.b.ERROR_MSG_NO_POP_DATA);
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "doTriggerByUCP, ucp pop without a ucp signal or ucp signal not match");
        } else if (!this.f.b()) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "doTriggerByUCP, first frame not finish, save to pending");
            e(bVar);
        } else {
            boolean c = c(bVar);
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "doTrigger, canTrigger=" + c + ", bizId=" + bVar.a().getBusinessID());
            if (!c) {
                com.taobao.homepage.pop.ucp.c.a(bVar.d(), "Error", 3, com.taobao.homepage.pop.ucp.b.ERROR_MSG_TARGET_VIEW_ERROR);
                return;
            }
            com.taobao.homepage.pop.utils.d.a("PopUCPShowPass", bVar.a());
            if (bVar.d() == null) {
                z = false;
            }
            f.a("UcpTriggerPopShow", AgooConstants.ACK_PACK_NOBIND, z, a2.getBusinessID());
            b(bVar, new a() { // from class: com.taobao.homepage.pop.view.container.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.pop.view.container.b.a
                public void a(boolean z2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z2), str});
                    } else {
                        b.a(b.this, bVar, z2, str);
                    }
                }
            });
        }
    }

    private void a(com.taobao.homepage.pop.viewmodel.b bVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2886b7f0", new Object[]{this, bVar, new Boolean(z), str});
            return;
        }
        IPopData a2 = bVar.a();
        if (!com.taobao.homepage.pop.ucp.c.a(bVar.a())) {
            return;
        }
        f.a("UcpTriggerPopShow", z ? "12" : AgooConstants.ACK_FLAG_NULL, true, a2.getBusinessID());
        if (z) {
            com.taobao.homepage.pop.ucp.c.a(bVar.d(), "Expose", 0, str);
        } else {
            com.taobao.homepage.pop.ucp.c.a(bVar.d(), "Error", 3, str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f17261a.removeCallbacksAndMessages(null);
        this.b.clear();
        this.g.clear();
    }

    public IPopAnchorViewInfo a(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopAnchorViewInfo) ipChange.ipc$dispatch("a9b221bd", new Object[]{this, iPopData, new Integer(i)}) : this.e.a(iPopData, i);
    }

    public boolean c(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ccf30", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkTriggerValid failed, triggerModel invalid");
            return false;
        } else if (!this.f.b()) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkTriggerValid failed, renderFinish false");
            return false;
        } else {
            BasePopContainer basePopContainer = this.c;
            if (basePopContainer == null) {
                com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkTriggerValid failed, container is null");
                return false;
            } else if (a((View) basePopContainer) && !a(this.c)) {
                com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkTriggerValid failed, container is not attach");
                return false;
            } else {
                int trigger = bVar.a().getPopConfig().getTrigger();
                if (trigger != 0 && (trigger == 1 ? bVar.c() == null : trigger != 3 && trigger != 5)) {
                    z = false;
                }
                com.taobao.homepage.pop.utils.c.b("BaseContainerTrigger ", "checkTriggerValid success, canDoTrigger=" + z);
                return z;
            }
        }
    }

    public boolean d(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72044f", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkReTriggerValid failed, triggerModel invalid");
            return false;
        } else if (this.f.b()) {
            return true;
        } else {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "checkReTriggerValid failed, renderFinish false");
            return false;
        }
    }

    private void a(final com.taobao.homepage.pop.viewmodel.b bVar, boolean z) {
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100aeba6", new Object[]{this, bVar, new Boolean(z)});
        } else if (bVar == null) {
            f.a("UcpTriggerPopShow", "-1", false, "");
        } else {
            IPopData a2 = bVar.a();
            if (com.taobao.homepage.pop.ucp.c.a(a2)) {
                if (z) {
                    f(bVar);
                    return;
                }
                this.g.put(a2.getBusinessID(), bVar);
                com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "ucp pop pending to trigger, key=" + a2.getBusinessID());
                return;
            }
            if (z) {
                c = d(bVar);
            } else {
                c = c(bVar);
            }
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "doTrigger, canTrigger=" + c + ", bizId=" + bVar.a().getBusinessID());
            if (!c) {
                e(bVar);
            } else {
                b(bVar, new a() { // from class: com.taobao.homepage.pop.view.container.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.homepage.pop.view.container.b.a
                    public void a(boolean z2, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z2), str});
                            return;
                        }
                        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "pop show success: " + z2 + " msg: " + str);
                        b.a(b.this, bVar, z2, str);
                    }
                });
            }
        }
    }

    private void g(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a1a3a8", new Object[]{this, bVar});
            return;
        }
        IPopData a2 = bVar.a();
        com.taobao.homepage.pop.ucp.b a3 = com.taobao.homepage.pop.ucp.c.a(this.f);
        if (a3 == null) {
            bVar.a(null);
            return;
        }
        if (!com.taobao.homepage.pop.ucp.c.a(a2) || !a3.a(a2)) {
            z = false;
        }
        if (!z) {
            return;
        }
        bVar.a(a3);
        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "tryBindUCPSignal success.");
    }

    private void b(final com.taobao.homepage.pop.viewmodel.b bVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb254a89", new Object[]{this, bVar, aVar});
        } else {
            lah.a().b(new Runnable() { // from class: com.taobao.homepage.pop.view.container.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.this.a(bVar, aVar);
                    }
                }
            });
        }
    }

    public void e(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d7396a", new Object[]{this, bVar});
            return;
        }
        IPopData a2 = bVar == null ? null : bVar.a();
        if (a2 == null || !a2.valid()) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveToPending faild, pop invalid, key=");
            sb.append(a2 == null ? "null" : a2.getBusinessID());
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", sb.toString());
            return;
        }
        int trigger = a2.getPopConfig().getTrigger();
        Map<String, com.taobao.homepage.pop.viewmodel.b> map = this.b.get(Integer.valueOf(trigger));
        if (map == null) {
            map = new ConcurrentHashMap<>(16);
            this.b.put(Integer.valueOf(trigger), map);
        }
        map.put(a2.getBusinessID(), bVar);
        com.taobao.homepage.pop.utils.c.b("BaseContainerTrigger ", "saveToPending, key=" + a2.getBusinessID());
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view.getParent() == null) {
            com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "========= isParentNotOnScreen=true, parent is null");
            return true;
        }
        boolean z = !((ViewGroup) view.getParent()).isShown();
        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "=======isParentNotOnScreen=" + z);
        return z;
    }

    private boolean a(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1ff5b0", new Object[]{this, basePopContainer})).booleanValue();
        }
        if (basePopContainer.getParent() != null) {
            ((ViewGroup) basePopContainer.getParent()).removeView(basePopContainer);
        }
        int hierarchy = basePopContainer.getHierarchy();
        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "try to reAttach container, hierarchy=" + hierarchy);
        return this.f.b(hierarchy).a(basePopContainer);
    }

    public boolean b(IPopData iPopData) {
        Map<String, com.taobao.homepage.pop.viewmodel.b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539b55fb", new Object[]{this, iPopData})).booleanValue();
        }
        String businessID = iPopData.getBusinessID();
        if (this.g.containsKey(businessID)) {
            return true;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null && (map = this.b.get(Integer.valueOf(popConfig.getTrigger()))) != null) {
            return map.containsKey(businessID);
        }
        return false;
    }

    public void c(IPopData iPopData) {
        Map<String, com.taobao.homepage.pop.viewmodel.b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0886d16", new Object[]{this, iPopData});
            return;
        }
        String businessID = iPopData.getBusinessID();
        if (this.g.containsKey(businessID)) {
            this.g.remove(businessID);
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null || (map = this.b.get(Integer.valueOf(popConfig.getTrigger()))) == null) {
            return;
        }
        map.remove(businessID);
        com.taobao.homepage.pop.utils.c.a("BaseContainerTrigger ", "removeUcpPendingPop, key=" + businessID);
    }
}
