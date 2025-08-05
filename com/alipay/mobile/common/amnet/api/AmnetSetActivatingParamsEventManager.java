package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class AmnetSetActivatingParamsEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetSetActivatingParamsEventManager f5352a;
    private List<AmnetSetActivatingParamsListener> b;

    public static final AmnetSetActivatingParamsEventManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetSetActivatingParamsEventManager) ipChange.ipc$dispatch("1d669588", new Object[0]);
        }
        AmnetSetActivatingParamsEventManager amnetSetActivatingParamsEventManager = f5352a;
        if (amnetSetActivatingParamsEventManager != null) {
            return amnetSetActivatingParamsEventManager;
        }
        synchronized (AmnetSetActivatingParamsEventManager.class) {
            if (f5352a != null) {
                return f5352a;
            }
            f5352a = new AmnetSetActivatingParamsEventManager();
            return f5352a;
        }
    }

    public void addListener(AmnetSetActivatingParamsListener amnetSetActivatingParamsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8ee0a9", new Object[]{this, amnetSetActivatingParamsListener});
        } else if (amnetSetActivatingParamsListener == null) {
        } else {
            List<AmnetSetActivatingParamsListener> a2 = a();
            if (a2.contains(amnetSetActivatingParamsListener)) {
                LogCatUtil.info("AmnetSetActivatingParamsEventManager", "[addListener] Do not add , repeated listener = " + amnetSetActivatingParamsListener.getClass().getName());
                return;
            }
            a2.add(amnetSetActivatingParamsListener);
            LogCatUtil.info("AmnetSetActivatingParamsEventManager", "[addListener] index = " + (a2.size() - 1) + ", listener = " + amnetSetActivatingParamsListener.getClass().getName());
        }
    }

    public void onAfterSetActivatingParamsEvent(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade096fe", new Object[]{this, activatingParams});
            return;
        }
        List<AmnetSetActivatingParamsListener> b = b();
        for (int i = 0; i < b.size(); i++) {
            try {
                if (b.get(i) == null) {
                    LogCatUtil.warn("AmnetSetActivatingParamsEventManager", "[onAfter] listener is null,  index = " + i);
                } else {
                    b.get(i).onAfterSetActivatingParamsEvent(activatingParams);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetSetActivatingParamsEventManager", "[onAfter] Exception = " + th.toString());
            }
        }
    }

    private List<AmnetSetActivatingParamsListener> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<AmnetSetActivatingParamsListener> list = this.b;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = new ArrayList(1);
            return this.b;
        }
    }

    private List<AmnetSetActivatingParamsListener> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<AmnetSetActivatingParamsListener> list = this.b;
        return list != null ? list : Collections.emptyList();
    }
}
