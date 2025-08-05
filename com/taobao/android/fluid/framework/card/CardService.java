package com.taobao.android.fluid.framework.card;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;
import tb.kge;
import tb.psw;
import tb.shl;
import tb.shm;
import tb.shw;
import tb.shx;
import tb.sjt;
import tb.snp;
import tb.spz;

/* loaded from: classes5.dex */
public class CardService implements ICardService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_PREFIX = "[Card Lifecycle]卡片：";
    private static final String TAG = "CardService";
    private psw mActiveCard;
    private final shl mCardLifecycleManager;
    private long mCardPrivateViewForegroundTime;
    private final sjt mCardServiceConfig = new sjt();
    private int mCurrentActiveCellPosition;
    private final FluidContext mFluidContext;
    private final shx mSessionManager;

    static {
        kge.a(191466255);
        kge.a(392480018);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public CardService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mCardLifecycleManager = new shl(this.mFluidContext);
        this.mSessionManager = new shx(this.mFluidContext);
    }

    public void addCardLifecycleListener(shm shmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf267ac", new Object[]{this, shmVar});
        } else {
            this.mCardLifecycleManager.a(shmVar);
        }
    }

    public void removeCardLifecycleListener(shm shmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163fb029", new Object[]{this, shmVar});
        } else {
            this.mCardLifecycleManager.b(shmVar);
        }
    }

    @Override // tb.sho
    public void addCardLifecycleListener(shm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cc24cf", new Object[]{this, aVar});
        } else {
            this.mCardLifecycleManager.addCardLifecycleListener(aVar);
        }
    }

    public void removeCardLifecycleListener(shm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e9420c", new Object[]{this, aVar});
        } else {
            this.mCardLifecycleManager.removeCardLifecycleListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public sjt getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjt) ipChange.ipc$dispatch("febca58a", new Object[]{this}) : this.mCardServiceConfig;
    }

    @Override // tb.shv
    public shw getSessionIdRecorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shw) ipChange.ipc$dispatch("d727084", new Object[]{this}) : this.mSessionManager.getSessionIdRecorder();
    }

    @Override // tb.shv
    public void incrementSessionId(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1778f1", new Object[]{this, aVar, new Boolean(z)});
        } else {
            this.mSessionManager.incrementSessionId(aVar, z);
        }
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onCreateView 回调");
        this.mCardLifecycleManager.onCreateView(pswVar, snpVar);
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onBindData 回调");
        this.mCardLifecycleManager.onBindData(pswVar, aVar, i);
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onBindData payloads 回调");
        this.mCardLifecycleManager.onBindData(pswVar, aVar, i, list);
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onAppear 回调");
        this.mCardLifecycleManager.onAppear(pswVar);
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onDisAppear 回调");
        this.mCardLifecycleManager.onDisAppear(pswVar);
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onWillActive 回调");
        this.mCardLifecycleManager.onWillActive(pswVar);
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onWillDisActive 回调");
        this.mCardLifecycleManager.onWillDisActive(pswVar);
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onActive 回调");
        this.mCardLifecycleManager.onActive(pswVar);
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onDisActive 回调");
        this.mCardLifecycleManager.onDisActive(pswVar);
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        spz.c(TAG, LOG_PREFIX + pswVar + "触发 onRecycle 回调");
        this.mCardLifecycleManager.onRecycle(pswVar);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setActiveCard(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23b51db", new Object[]{this, pswVar});
            return;
        }
        this.mActiveCard = pswVar;
        spz.c(TAG, "当前 Active 卡片更新: " + pswVar);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public psw getActiveCard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("d906fd1f", new Object[]{this}) : this.mActiveCard;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public long getCardPrivateViewForegroundTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1367ba2d", new Object[]{this})).longValue() : this.mCardPrivateViewForegroundTime;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setCardPrivateViewForegroundTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456dedb7", new Object[]{this, new Long(j)});
        } else {
            this.mCardPrivateViewForegroundTime = j;
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public a.c getActiveCardMediaDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("7cf341ed", new Object[]{this});
        }
        psw activeCard = getActiveCard();
        if (activeCard != null) {
            return activeCard.D();
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public a getActiveCardMediaSetData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c596b77", new Object[]{this});
        }
        psw activeCard = getActiveCard();
        if (activeCard != null) {
            return activeCard.E();
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public int getCurrentActiveCellPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6ef33ee", new Object[]{this})).intValue() : this.mCurrentActiveCellPosition;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setCurrentActiveCellPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed148e74", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentActiveCellPosition = i;
        }
    }
}
