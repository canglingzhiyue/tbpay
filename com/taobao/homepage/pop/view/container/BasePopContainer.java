package com.taobao.homepage.pop.view.container;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.g;
import com.taobao.homepage.pop.view.popview.BasePopView;
import com.taobao.homepage.pop.view.popview.UcpPopView;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kyu;
import tb.kzz;
import tb.lah;
import tb.laj;
import tb.lak;

/* loaded from: classes7.dex */
public class BasePopContainer extends FrameLayout implements IPopMessageListener, IPopViewEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BasePopContainer ";
    public int iconScrollOffset;
    public final com.taobao.homepage.pop.viewmodel.a mContainerVM;
    private boolean mIsDestroyed;
    public kzz mListenerRegister;
    private final Map<String, IPopData<?>> mPopDataOnScreen;
    public kyu mPopEngine;
    public b mPopTrigger;
    public final Map<String, BasePopView> mPopViewsOnScreen;
    public final lak mViewProviderFactory;

    public static /* synthetic */ Object ipc$super(BasePopContainer basePopContainer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void translate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    public static /* synthetic */ boolean access$000(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbb1581", new Object[]{basePopContainer})).booleanValue() : basePopContainer.mIsDestroyed;
    }

    public static /* synthetic */ laj.a access$100(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (laj.a) ipChange.ipc$dispatch("2643ab18", new Object[]{basePopContainer}) : basePopContainer.getPopDownloadListener();
    }

    public BasePopContainer(Context context, lak lakVar, int i, kyu kyuVar) {
        super(context);
        this.mPopViewsOnScreen = new ConcurrentHashMap();
        this.mIsDestroyed = false;
        this.mPopDataOnScreen = new ConcurrentHashMap();
        this.mViewProviderFactory = lakVar;
        this.mContainerVM = new com.taobao.homepage.pop.viewmodel.a(i);
        this.mPopEngine = kyuVar;
        setVisibility(8);
    }

    public int getHierarchy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eed9b079", new Object[]{this})).intValue() : this.mContainerVM.a();
    }

    public void setAlpha(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8026db3", new Object[]{this, str, new Float(f)});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView == null) {
            return;
        }
        basePopView.setAlpha(f);
    }

    public BasePopView createPopView(IPopData iPopData, laj lajVar, View view, IPopAnchorViewInfo iPopAnchorViewInfo, a aVar, com.taobao.homepage.pop.viewmodel.b bVar) {
        BasePopView ucpPopView;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopView) ipChange.ipc$dispatch("40c9cec5", new Object[]{this, iPopData, lajVar, view, iPopAnchorViewInfo, aVar, bVar});
        }
        String businessID = iPopData.getBusinessID();
        if (iPopData.isFirstShow()) {
            triggerInvalidPopRemove(businessID);
        } else if (this.mPopViewsOnScreen.containsKey(businessID)) {
            com.taobao.homepage.pop.utils.d.a("PopTargetCardValid", iPopData, "sameBizCodeExist", "");
            return null;
        }
        com.taobao.homepage.pop.utils.d.a("PopTargetPosVisible", iPopData);
        if (lajVar == null || getContext() == null) {
            com.taobao.homepage.pop.utils.d.a("PopViewFirstVisible", iPopData, "popViewCreateFailed", "");
            com.taobao.homepage.pop.utils.c.a(TAG, "create pop error, viewProvider is empty");
            return null;
        }
        com.taobao.homepage.pop.ucp.b d = bVar.d();
        if (d == null) {
            ucpPopView = new BasePopView(getContext(), iPopData, lajVar, aVar, this.mPopEngine);
            str = TAG;
            str2 = businessID;
        } else {
            Context context = getContext();
            kyu kyuVar = this.mPopEngine;
            str = TAG;
            str2 = businessID;
            ucpPopView = new UcpPopView(context, iPopData, lajVar, aVar, kyuVar, d);
        }
        String str3 = str2;
        String str4 = str;
        if (!ucpPopView.initPopView(view, iPopAnchorViewInfo, this.iconScrollOffset, this, this)) {
            com.taobao.homepage.pop.utils.c.a(str4, "create pop error, wrap view is empty");
            return null;
        }
        setVisibility(0);
        this.mPopViewsOnScreen.put(str3, ucpPopView);
        this.mPopDataOnScreen.put(str3, iPopData);
        addView(ucpPopView, new FrameLayout.LayoutParams(-2, -2));
        iPopData.recordShow();
        ucpPopView.requestLayout();
        notifyAddPopView(ucpPopView, iPopData);
        return ucpPopView;
    }

    public void setPopListenerRegister(kzz kzzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31dd652", new Object[]{this, kzzVar});
        } else {
            this.mListenerRegister = kzzVar;
        }
    }

    public void refreshData(kyu kyuVar, PopDataViewModel popDataViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55868da4", new Object[]{this, kyuVar, popDataViewModel});
            return;
        }
        this.mContainerVM.a(popDataViewModel.getAllPopData());
        com.taobao.homepage.pop.utils.c.b(TAG, "refreshData, hierarchy=" + this.mContainerVM.a() + ", size=" + this.mContainerVM.b());
        preloadData(kyuVar);
        this.mPopTrigger.a();
        removeInvalidPopView();
        lah.a().a(new Runnable() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                    com.taobao.homepage.pop.utils.c.a(BasePopContainer.TAG, "container is destroyed, skip refreshData trigger");
                } else {
                    BasePopContainer.this.mPopTrigger.a(BasePopContainer.this.mContainerVM.a(0));
                    BasePopContainer.this.mPopTrigger.b(BasePopContainer.this.mContainerVM.a(1));
                }
            }
        }, 0L);
    }

    public boolean onTriggerShowByPopData(int i, final IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a213bb56", new Object[]{this, new Integer(i), iPopData})).booleanValue();
        }
        if (iPopData == null || !iPopData.isAllowShow() || iPopData.getPopConfig() == null || iPopData.getPopConfig().getTrigger() != i) {
            com.taobao.homepage.pop.utils.c.a(TAG, "onTriggerShowByPopData popData is inValid");
            return false;
        }
        lah.a().a(new Runnable() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                laj a2 = BasePopContainer.this.mViewProviderFactory.a(iPopData.getPopConfig().getPopContentType());
                if (a2 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(iPopData);
                a2.a(BasePopContainer.this.mPopEngine, arrayList, BasePopContainer.access$100(BasePopContainer.this));
            }
        });
        this.mPopTrigger.a(new com.taobao.homepage.pop.viewmodel.b(iPopData));
        com.taobao.homepage.pop.utils.c.a(TAG, "onTriggerShowByPopData doTrigger");
        return true;
    }

    public void onTriggerShow(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352733f0", new Object[]{this, new Integer(i), str});
            return;
        }
        IPopData a2 = this.mContainerVM.a(str);
        if (a2 == null || !a2.isAllowShow() || a2.getPopConfig().getTrigger() != i) {
            return;
        }
        this.mPopTrigger.a(new com.taobao.homepage.pop.viewmodel.b(a2));
    }

    public IPopAnchorViewInfo getAnchorInfo(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("59da7512", new Object[]{this, iPopData});
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(iPopData.getBusinessID());
        if (basePopView != null) {
            return basePopView.getOriginViewInfo();
        }
        return this.mPopTrigger.a(iPopData, this.iconScrollOffset);
    }

    public void onInfoFlowEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onInfoFlowEnter(i);
        }
        reTriggerPop(0);
    }

    public void onInfoFlowLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onInfoFlowLeave(i);
        }
    }

    public void onPopLayerShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onPopLayerShow();
        }
    }

    public void onPopLayerDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onPopLayerDismiss();
        }
    }

    public void onScrollStateChange(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0bc1a8", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onScrollStateChange(viewGroup, i);
        }
    }

    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else {
            this.iconScrollOffset = i;
        }
    }

    public void onCardAttached(final int i, final View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
            return;
        }
        final List<IPopData> a2 = this.mContainerVM.a(1, str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        lah.a().a(new Runnable() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                    com.taobao.homepage.pop.utils.c.a(BasePopContainer.TAG, "container is destroyed, skip onCardAttached trigger");
                } else {
                    for (IPopData iPopData : a2) {
                        if (iPopData.isAllowShow()) {
                            BasePopContainer.this.mPopTrigger.a(new com.taobao.homepage.pop.viewmodel.b(iPopData, i, view));
                        }
                    }
                }
            }
        }, 0L);
    }

    public void onCardDetached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
            return;
        }
        List<IPopData> a2 = this.mContainerVM.a(2, str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (IPopData iPopData : a2) {
            this.mPopTrigger.a(new com.taobao.homepage.pop.viewmodel.b(iPopData, i, view));
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroyed = true;
        this.mPopViewsOnScreen.clear();
        this.mPopDataOnScreen.clear();
        this.mContainerVM.d();
        this.mPopTrigger.a();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "pop view onDestroy, remove all, hierarchy=" + getHierarchy());
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
            return;
        }
        if (g.a(i)) {
            removePopView(iPopData.getBusinessID());
        }
        kzz kzzVar = this.mListenerRegister;
        if (kzzVar == null) {
            return;
        }
        kzzVar.onEvent(i, iPopData);
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
            return;
        }
        if ("removePop".equals(str) || "other".equals(str)) {
            removePopView(iPopData.getBusinessID());
        }
        kzz kzzVar = this.mListenerRegister;
        if (kzzVar == null) {
            return;
        }
        kzzVar.onMessage(str, iPopData, jSONObject);
    }

    public void triggerPopViewEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708e292a", new Object[]{this, new Integer(i), str});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView == null) {
            return;
        }
        basePopView.triggerPopViewEvent(i, str);
    }

    public void triggerPopMessage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf50ba7", new Object[]{this, str, str2, jSONObject});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str2);
        if (basePopView == null) {
            return;
        }
        basePopView.triggerPopMessage(str, str2, jSONObject);
    }

    public void generateOnScreenBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f32a50", new Object[]{this, jSONObject});
            return;
        }
        for (String str : this.mPopViewsOnScreen.keySet()) {
            BasePopView basePopView = this.mPopViewsOnScreen.get(str);
            if (basePopView != null) {
                jSONObject.put(str, (Object) basePopView.getPopReqParams());
            }
        }
    }

    public void reTriggerPop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e36d0", new Object[]{this, new Integer(i)});
        } else {
            this.mPopTrigger.a(i);
        }
    }

    public void removePopView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9cc83", new Object[]{this, str});
            return;
        }
        BasePopView remove = this.mPopViewsOnScreen.remove(str);
        if (remove != null) {
            removeView(remove);
        }
        notifyRemovePopView(remove, str);
        if (!this.mPopViewsOnScreen.isEmpty()) {
            return;
        }
        setVisibility(8);
    }

    private void notifyAddPopView(BasePopView basePopView, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4090eba", new Object[]{this, basePopView, iPopData});
            return;
        }
        kzz kzzVar = this.mListenerRegister;
        if (kzzVar == null || basePopView == null) {
            return;
        }
        kzzVar.a(basePopView, iPopData);
    }

    private void notifyRemovePopView(BasePopView basePopView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3036b25b", new Object[]{this, basePopView, str});
        } else if (this.mListenerRegister == null || basePopView == null) {
        } else {
            this.mListenerRegister.b(basePopView, this.mPopDataOnScreen.remove(str));
        }
    }

    private void preloadData(final kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79cd8ea3", new Object[]{this, kyuVar});
            return;
        }
        final Map<Integer, List<IPopData>> c = this.mContainerVM.c();
        if (c.isEmpty()) {
            return;
        }
        lah.a().a(new Runnable() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                List list;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (Integer num : c.keySet()) {
                    laj a2 = BasePopContainer.this.mViewProviderFactory.a(num.intValue());
                    if (a2 != null && (list = (List) c.get(num)) != null && !list.isEmpty()) {
                        a2.a(kyuVar, new ArrayList(list), BasePopContainer.access$100(BasePopContainer.this));
                    }
                }
            }
        });
    }

    private void removeInvalidPopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b50db4a", new Object[]{this});
            return;
        }
        for (String str : this.mPopViewsOnScreen.keySet()) {
            if (this.mContainerVM.a(str) == null) {
                triggerInvalidPopRemove(str);
            }
        }
    }

    private void triggerInvalidPopRemove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52889e7", new Object[]{this, str});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView == null) {
            return;
        }
        basePopView.triggerInvalidPopRemove();
    }

    private laj.a getPopDownloadListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (laj.a) ipChange.ipc$dispatch("c78ad316", new Object[]{this}) : new laj.a() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.laj.a
            public void a(List<IPopData> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (list != null && !list.isEmpty()) {
                    com.taobao.homepage.pop.utils.c.a(BasePopContainer.TAG, "template download success");
                    for (IPopData iPopData : list) {
                        BasePopView basePopView = BasePopContainer.this.mPopViewsOnScreen.get(iPopData.getBusinessID());
                        if (iPopData.isAllowShow() || basePopView == null || basePopView.checkReRender()) {
                            iPopData.resetShowCount();
                            BasePopContainer.this.mPopTrigger.b(new com.taobao.homepage.pop.viewmodel.b(iPopData));
                        }
                    }
                }
            }
        };
    }

    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onAppToBackground();
        }
    }

    public void onAppToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onAppToForeground();
        }
    }

    public void reTriggerPopByUCP(final IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abc19da", new Object[]{this, iPopData});
        } else {
            lah.a().a(new Runnable() { // from class: com.taobao.homepage.pop.view.container.BasePopContainer.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                        com.taobao.homepage.pop.utils.c.a(BasePopContainer.TAG, "container is destroyed, skip reTriggerPopByUCP");
                    } else {
                        BasePopContainer.this.mPopTrigger.a(iPopData);
                    }
                }
            }, 0L);
        }
    }

    public boolean isUcpPendingTrigger(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe7d1e4", new Object[]{this, iPopData})).booleanValue() : this.mPopTrigger.b(iPopData);
    }

    public void removeUcpPendingPop(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41f8ec1", new Object[]{this, iPopData});
        } else {
            this.mPopTrigger.c(iPopData);
        }
    }
}
