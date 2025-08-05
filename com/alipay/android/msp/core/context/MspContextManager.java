package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.callback.PayProgressCallback;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class MspContextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile MspContextManager f4536a;
    public static volatile long lastContextRemoveTime;
    private final Map<Integer, MspContext> b;
    private final Map<Integer, Integer> c;
    private final Map<String, PayProgressCallback> d;
    private final Map<Integer, IRemoteServiceCallback> e;
    private final Map<Integer, IAlipayCallback> f;

    public static /* synthetic */ Map a(MspContextManager mspContextManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7d24c1ba", new Object[]{mspContextManager}) : mspContextManager.b;
    }

    private MspContextManager() {
        PhoneCashierMspEngine.getMspWallet().registerCutPoint();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = new ConcurrentHashMap();
        this.b = Collections.synchronizedMap(linkedHashMap);
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public static MspContextManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContextManager) ipChange.ipc$dispatch("15204ef", new Object[0]);
        }
        if (f4536a == null) {
            synchronized (MspContextManager.class) {
                if (f4536a == null) {
                    f4536a = new MspContextManager();
                }
            }
        }
        return f4536a;
    }

    public void addRawBizId(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafd67ee", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.c.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void removeRawBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6771eab2", new Object[]{this, new Integer(i)});
        } else {
            this.c.remove(Integer.valueOf(i));
        }
    }

    public int getBizIdByRaw(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2217eb96", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.c.containsKey(Integer.valueOf(i))) {
            return -1;
        }
        return this.c.get(Integer.valueOf(i)).intValue();
    }

    public PayProgressCallback getPayProgressCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayProgressCallback) ipChange.ipc$dispatch("3e98b333", new Object[]{this, str});
        }
        if (!this.d.containsKey(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public void setPayProgressCallback(String str, PayProgressCallback payProgressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54342bc5", new Object[]{this, str, payProgressCallback});
            return;
        }
        LogUtil.record(2, "MspContextManager:setPayProgressCallback", "order:" + str + " ，cb=" + payProgressCallback);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, payProgressCallback);
    }

    public void removePayProgressCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cab1547", new Object[]{this, str});
            return;
        }
        LogUtil.record(2, "MspContextManager:removePayProgressCallback", "order:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.remove(str);
    }

    public void addMspContext(int i, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b674a4c", new Object[]{this, new Integer(i), mspContext});
            return;
        }
        LogUtil.record(2, "MspContextManager:addMspContext", "bizId:" + i + " ctx=" + mspContext + " ,size=" + this.b.size());
        if (i != 0) {
            this.b.put(Integer.valueOf(i), mspContext);
        }
        if (this.b.size() >= 4) {
            StatisticInfo statisticInfo = mspContext.getStatisticInfo();
            statisticInfo.addError(ErrorType.WARNING, "MspContextTooMuch", i + "-" + this.b.size());
        }
        if (this.b.size() != 1) {
            return;
        }
        StatisticCollector.setOnErrorListener(new StatisticCollector.OnAddErrorListener() { // from class: com.alipay.android.msp.core.context.MspContextManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.safepaylogv2.api.StatisticCollector.OnAddErrorListener
            public void onAddError(String str, String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5803595", new Object[]{this, str, str2, str3, str4});
                } else {
                    AlertIntelligenceEngine.onAddGlobalError(str, str2);
                }
            }
        });
        PhoneCashierMspEngine.getMspWallet().registerAppBgListener(mspContext.getContext());
    }

    public Map<Integer, MspContext> getMspContextMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("944558dd", new Object[]{this}) : this.b;
    }

    public void removeMspContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9882574e", new Object[]{this, new Integer(i)});
            return;
        }
        LogUtil.record(2, "MspContextManager:removeMspContextByBizId", "bizId:" + i + " ,size=" + this.b.size());
        MspContext remove = this.b.remove(Integer.valueOf(i));
        if (remove != null && this.b.size() == 0) {
            StatisticCollector.setOnErrorListener(null);
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContextManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MspContextManager.a(MspContextManager.this).size() != 0) {
                    } else {
                        MspDbManager.getDbManager().closeDBHelper();
                    }
                }
            }, 15000L);
            Context context = GlobalHelper.getInstance().getContext();
            if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 15000L, TaskHelper.ThreadName.UI_CONTEXT);
            } else {
                TaskHelper.execute(monitorRunnable, 15000L);
            }
            PhoneCashierMspEngine.getMspWallet().unRegisterAppBgListener(remove.getContext());
        }
        ActionsCreator.removeActionsCreator(i);
    }

    public int getPayContextSum() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3c952a8", new Object[]{this})).intValue();
        }
        for (Integer num : this.b.keySet()) {
            MspContext mspContext = this.b.get(Integer.valueOf(num.intValue()));
            if ((mspContext instanceof MspTradeContext) && ((MspTradeContext) mspContext).getCurSubContext() == MspTradeContext.SubTradeContext.pay) {
                i++;
            }
        }
        return i;
    }

    public int getTradeContextSum() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("688cefe4", new Object[]{this})).intValue();
        }
        for (Integer num : this.b.keySet()) {
            if (this.b.get(Integer.valueOf(num.intValue())) instanceof MspTradeContext) {
                i++;
            }
        }
        return i;
    }

    public MspContext getMspContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("8fe4276c", new Object[]{this, new Integer(i)});
        }
        if (!this.b.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.b.get(Integer.valueOf(i));
    }

    public MspTradeContext getTradeContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("bd716256", new Object[]{this, new Integer(i)});
        }
        MspContext mspContextByBizId = getMspContextByBizId(i);
        if (!(mspContextByBizId instanceof MspTradeContext)) {
            return null;
        }
        return (MspTradeContext) mspContextByBizId;
    }

    public MspContainerContext getRenderContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerContext) ipChange.ipc$dispatch("f8aab9d5", new Object[]{this, new Integer(i)});
        }
        MspContext mspContextByBizId = getMspContextByBizId(i);
        if (!(mspContextByBizId instanceof MspContainerContext)) {
            return null;
        }
        return (MspContainerContext) mspContextByBizId;
    }

    public MspTradeContext getTradeContextByPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("e49c36f9", new Object[]{this, new Integer(i)});
        }
        for (Integer num : this.b.keySet()) {
            MspContext mspContext = this.b.get(Integer.valueOf(num.intValue()));
            if ((mspContext instanceof MspTradeContext) && mspContext.getCallingPid() == i) {
                return (MspTradeContext) mspContext;
            }
        }
        return null;
    }

    public MspTradeContext getTradeContextByOrderInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("44ea2f05", new Object[]{this, str});
        }
        for (Integer num : this.b.keySet()) {
            MspContext mspContext = this.b.get(Integer.valueOf(num.intValue()));
            if (mspContext instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                if (TextUtils.equals(str, mspTradeContext.getOrderInfo())) {
                    return mspTradeContext;
                }
            }
        }
        return null;
    }

    public synchronized void clearFingerPayTask(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d0f49e", new Object[]{this, mspContext, str});
            return;
        }
        for (Integer num : this.b.keySet()) {
            MspContext mspContext2 = this.b.get(Integer.valueOf(num.intValue()));
            if (mspContext2 instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext2;
                if (mspContext.getBizId() != mspTradeContext.getBizId() && mspTradeContext.isFingerPay()) {
                    String orderInfo = ((MspTradeContext) mspContext2).getOrderInfo();
                    CashierSceneDictionary.MspSchemePayContext mspSchemePayContext = CashierSceneDictionary.getInstance().getMspSchemePayContext(orderInfo);
                    if (mspSchemePayContext != null && !TextUtils.equals(str, orderInfo)) {
                        mspSchemePayContext.isExitByPay = true;
                    }
                    mspTradeContext.exit(0);
                }
            }
        }
    }

    public void registerRemoteCallbackByOrderInfo(IRemoteServiceCallback iRemoteServiceCallback, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a5847d", new Object[]{this, iRemoteServiceCallback, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Binder.getCallingPid());
        sb.append(" , order is null ? ");
        if (str == null) {
            z = true;
        }
        sb.append(z);
        LogUtil.record(1, "MspContextManager", "registerRemoteCallbackByOrderInfo", sb.toString());
        if (str != null) {
            this.e.put(Integer.valueOf(str.hashCode()), iRemoteServiceCallback);
        } else {
            this.e.put(Integer.valueOf(Binder.getCallingPid()), iRemoteServiceCallback);
        }
    }

    public void removeRemoteCallback(IRemoteServiceCallback iRemoteServiceCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ba439b", new Object[]{this, iRemoteServiceCallback});
        } else if (iRemoteServiceCallback != null && this.e.containsValue(iRemoteServiceCallback)) {
            for (Map.Entry<Integer, IRemoteServiceCallback> entry : this.e.entrySet()) {
                if (entry.getValue() == iRemoteServiceCallback) {
                    LogUtil.record(4, "MspContextManager", "removeRemoteCallback", "entry.getValue():" + entry.getValue());
                    this.e.remove(entry.getKey());
                }
            }
        }
    }

    public IRemoteServiceCallback getRemoteCallbackById(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteServiceCallback) ipChange.ipc$dispatch("f87a23db", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (this.e.containsKey(Integer.valueOf(i))) {
            return this.e.get(Integer.valueOf(i));
        }
        return this.e.get(Integer.valueOf(i2));
    }

    public void registerCallback(IAlipayCallback iAlipayCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b12d4b", new Object[]{this, iAlipayCallback, str});
        } else if (str != null) {
            this.f.put(Integer.valueOf(str.hashCode()), iAlipayCallback);
        } else {
            this.f.put(Integer.valueOf(Binder.getCallingPid()), iAlipayCallback);
        }
    }

    public void unregisterAlipayCallback(IAlipayCallback iAlipayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8176b1e", new Object[]{this, iAlipayCallback});
        } else if (iAlipayCallback != null && this.f.containsValue(iAlipayCallback)) {
            for (Map.Entry<Integer, IAlipayCallback> entry : this.f.entrySet()) {
                if (entry.getValue() == iAlipayCallback) {
                    LogUtil.record(4, "MspContextManager", "removeRemoteCallback", "entry.getValue():" + entry.getValue());
                    this.f.remove(entry.getKey());
                }
            }
        }
    }

    public IAlipayCallback a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayCallback) ipChange.ipc$dispatch("c6282568", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (this.f.containsKey(Integer.valueOf(i))) {
            return this.f.get(Integer.valueOf(i));
        }
        if (!this.f.containsKey(Integer.valueOf(i2))) {
            return null;
        }
        return this.f.get(Integer.valueOf(i2));
    }

    public synchronized void clearAllTradeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bde22e6", new Object[]{this});
            return;
        }
        for (Integer num : this.b.keySet()) {
            MspContext mspContext = this.b.get(Integer.valueOf(num.intValue()));
            if (mspContext instanceof MspTradeContext) {
                mspContext.exit(0);
            }
        }
    }

    public int getLatestBizId() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f55850b", new Object[]{this})).intValue();
        }
        for (Integer num : this.b.keySet()) {
            i = num.intValue();
        }
        LogUtil.record(1, "getLatestBizId", "getLatestBizId = ".concat(String.valueOf(i)));
        return i;
    }
}
