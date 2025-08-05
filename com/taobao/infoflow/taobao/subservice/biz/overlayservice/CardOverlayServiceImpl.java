package com.taobao.infoflow.taobao.subservice.biz.overlayservice;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lpg;
import tb.lpi;
import tb.lpm;

/* loaded from: classes.dex */
public class CardOverlayServiceImpl implements ICardOverlayService<ViewGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FloatingLayerServiceImpl";
    private final Map<Integer, BaseSectionModel<?>> mCardDataMap = new HashMap(4);
    private lpg mCardOverlayWaiter;
    private lpi mDeleteHostCardHelper;
    private lpm.a mOverlayRenderListener;

    static {
        kge.a(-1839121046);
        kge.a(-1089679393);
    }

    public static /* synthetic */ Map access$000(CardOverlayServiceImpl cardOverlayServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bb9a73b5", new Object[]{cardOverlayServiceImpl}) : cardOverlayServiceImpl.mCardDataMap;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mCardOverlayWaiter = new lpg(ljsVar);
        this.mDeleteHostCardHelper = new lpi(ljsVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mCardOverlayWaiter = null;
        this.mDeleteHostCardHelper = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void showOverlay(String str, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffe6fb6", new Object[]{this, str, view, baseSectionModel});
            return;
        }
        lpg lpgVar = this.mCardOverlayWaiter;
        if (lpgVar == null) {
            ldf.d(TAG, "show overlay,mOverlayWaiter == null");
        } else {
            lpgVar.a(str, view, baseSectionModel, getOverlayRenderListener());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void showOverlayWithOverlayData(String str, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96184e2", new Object[]{this, str, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        lpg lpgVar = this.mCardOverlayWaiter;
        if (lpgVar == null) {
            ldf.d(TAG, "show overlay with overlay data,mOverlayWaiter == null");
        } else {
            lpgVar.a(str, view, baseSectionModel, baseSectionModel2, getOverlayRenderListener(), view2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        lpg lpgVar = this.mCardOverlayWaiter;
        if (lpgVar == null) {
            ldf.d(TAG, "hide overlay,mOverlayWaiter == null");
        } else {
            lpgVar.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void deleteOverlayHostCard(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db416c", new Object[]{this, baseSectionModel});
            return;
        }
        BaseSectionModel<?> findHostCard = findHostCard(baseSectionModel);
        if (findHostCard == null) {
            return;
        }
        int identityHashCode = System.identityHashCode(baseSectionModel);
        this.mDeleteHostCardHelper.a(findHostCard);
        this.mCardDataMap.remove(Integer.valueOf(identityHashCode));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public BaseSectionModel<?> findHostCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("e6e849de", new Object[]{this, baseSectionModel});
        }
        if (this.mDeleteHostCardHelper != null && !this.mCardDataMap.isEmpty()) {
            return this.mCardDataMap.get(Integer.valueOf(System.identityHashCode(baseSectionModel)));
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void removeOverlayView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a4dd0", new Object[]{this, str, view});
        } else if (view == null) {
        } else {
            this.mCardOverlayWaiter.a(str, view);
        }
    }

    private lpm.a getOverlayRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpm.a) ipChange.ipc$dispatch("5f0c0d55", new Object[]{this});
        }
        if (this.mOverlayRenderListener == null) {
            this.mOverlayRenderListener = createOverlayRenderListener();
        }
        return this.mOverlayRenderListener;
    }

    private lpm.a createOverlayRenderListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lpm.a) ipChange.ipc$dispatch("4ab8357b", new Object[]{this}) : new lpm.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lpm.a
            public void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3224caf8", new Object[]{this, baseSectionModel, baseSectionModel2});
                } else {
                    CardOverlayServiceImpl.access$000(CardOverlayServiceImpl.this).put(Integer.valueOf(System.identityHashCode(baseSectionModel)), baseSectionModel2);
                }
            }
        };
    }
}
