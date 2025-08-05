package com.taobao.homepage.pop.view.container;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kyu;
import tb.lak;
import tb.ldj;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c c;
    private kyu d;
    private boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17265a = true;
    public boolean b = true;

    public d(kyu kyuVar, lak lakVar) {
        this.d = kyuVar;
        this.c = new c(lakVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e(0);
        e(1);
    }

    public void b(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b55f7", new Object[]{this, iPopData});
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null) {
            com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "reTriggerByUCP, popConfig is null");
            com.taobao.homepage.pop.ucp.c.a(com.taobao.homepage.pop.ucp.c.a(this.d), "Error", 3, com.taobao.homepage.pop.ucp.b.ERROR_MSG_NO_POP_DATA);
            return;
        }
        BasePopContainer a2 = a(popConfig.getHierarchy());
        if (a2 == null) {
            com.taobao.homepage.pop.ucp.c.a(com.taobao.homepage.pop.ucp.c.a(this.d), "Error", 3, com.taobao.homepage.pop.ucp.b.ERROR_MSG_NO_POP_DATA);
            com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "reTriggerByUCP, container is null");
            return;
        }
        a2.reTriggerPopByUCP(iPopData);
        com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "reTriggerByUCP");
    }

    public BasePopContainer a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasePopContainer) ipChange.ipc$dispatch("f9db05df", new Object[]{this, new Integer(i)}) : this.c.a(i);
    }

    public IPopAnchorViewInfo a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("878a70aa", new Object[]{this, iPopData});
        }
        BasePopContainer a2 = this.c.a(iPopData.getPopConfig().getHierarchy());
        if (a2 != null) {
            return a2.getAnchorInfo(iPopData);
        }
        return null;
    }

    public void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{this, str, new Float(f)});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.setAlpha(str, f);
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.removePopView(str);
            }
        }
    }

    public BasePopContainer a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasePopContainer) ipChange.ipc$dispatch("8e2854e7", new Object[]{this, context, new Integer(i)}) : this.c.a(context, i, this.d);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        Map<Integer, WeakReference<BasePopContainer>> a2 = this.c.a();
        JSONObject jSONObject = new JSONObject(16);
        for (WeakReference<BasePopContainer> weakReference : a2.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.generateOnScreenBizParams(jSONObject);
            }
        }
        return jSONObject;
    }

    public void a(kyu kyuVar, PopDataViewModel popDataViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a269ce0", new Object[]{this, kyuVar, popDataViewModel});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> a2 = this.c.a();
        com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "refreshData, containerSize=" + a2.size());
        for (WeakReference<BasePopContainer> weakReference : a2.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.refreshData(kyuVar, popDataViewModel);
            }
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onTriggerShow(i, str);
            }
        }
    }

    public boolean a(int i, IPopData<?> iPopData) {
        BasePopContainer basePopContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eddb189", new Object[]{this, new Integer(i), iPopData})).booleanValue();
        }
        if (iPopData == null || iPopData.getPopConfig() == null) {
            com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "popData inValid");
            return false;
        }
        WeakReference<BasePopContainer> weakReference = this.c.a().get(Integer.valueOf(iPopData.getPopConfig().getHierarchy()));
        if (weakReference == null || (basePopContainer = weakReference.get()) == null) {
            return false;
        }
        com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "trigger show by pop data");
        return basePopContainer.onTriggerShowByPopData(i, iPopData);
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.translate(f, f2);
            }
        }
    }

    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        if (i == 0) {
            z = false;
        }
        if (this.e == z) {
            return;
        }
        this.e = z;
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onScrollStateChange(viewGroup, i);
            }
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onIconScroll, offset=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onIconScroll(i);
            }
        }
    }

    public void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "triggerPopViewEvent, eventType=" + i + ", businessId=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.triggerPopViewEvent(i, str);
            }
        }
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "triggerPopMessage, message=" + str + ", businessId=" + str2);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.triggerPopMessage(str, str2, jSONObject);
            }
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (!f(i)) {
            this.f17265a = true;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onInfoFlowEnter, switchType=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onInfoFlowEnter(i);
            }
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        if (!f(i)) {
            this.f17265a = false;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onInfoFlowLeave, switchType=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onInfoFlowLeave(i);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = false;
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onPopLayerShow");
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onPopLayerShow();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = true;
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onPopLayerDismiss");
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onPopLayerDismiss();
            }
        }
    }

    public void a(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7d3361", new Object[]{this, new Integer(i), view, str});
            return;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onCardDetached, sectionBiz=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onCardAttached(i, view, str);
            }
        }
    }

    public void b(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbea222", new Object[]{this, new Integer(i), view, str});
            return;
        }
        com.taobao.homepage.pop.utils.c.b("PopContainerManager ", "onCardDetached, sectionBiz=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onCardDetached(i, view, str);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> a2 = this.c.a();
        for (WeakReference<BasePopContainer> weakReference : a2.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.destroy();
            }
        }
        a2.clear();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f17265a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.d.e().a();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.b;
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> a2 = this.c.a();
        com.taobao.homepage.pop.utils.c.a("PopContainerManager ", "reTriggerPop, triggerType=" + i + ", containerSize=" + a2.size());
        for (WeakReference<BasePopContainer> weakReference : a2.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.reTriggerPop(i);
            }
        }
    }

    private boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a9ceba", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!ldj.a("fixPopTabSwitchLogicEnable", true)) {
            return false;
        }
        return i == 4 || i == 3;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onAppToBackground();
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.c.a().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onAppToForeground();
            }
        }
    }

    public boolean c(IPopData iPopData) {
        BasePopContainer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0886d1a", new Object[]{this, iPopData})).booleanValue();
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null && (a2 = a(popConfig.getHierarchy())) != null) {
            return a2.isUcpPendingTrigger(iPopData);
        }
        return false;
    }

    public void d(IPopData iPopData) {
        BasePopContainer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d758435", new Object[]{this, iPopData});
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null || (a2 = a(popConfig.getHierarchy())) == null) {
            return;
        }
        a2.removeUcpPendingPop(iPopData);
    }
}
