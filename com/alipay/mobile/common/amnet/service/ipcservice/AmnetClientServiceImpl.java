package com.alipay.mobile.common.amnet.service.ipcservice;

import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService;
import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class AmnetClientServiceImpl implements AmnetClientService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AmnetClientService b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5384a = false;

    public static final AmnetClientService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetClientService) ipChange.ipc$dispatch("e6c53830", new Object[0]);
        }
        AmnetClientService amnetClientService = b;
        if (amnetClientService != null) {
            return amnetClientService;
        }
        synchronized (AmnetClientService.class) {
            if (b != null) {
                return b;
            }
            b = new AmnetClientServiceImpl();
            return b;
        }
    }

    private AmnetClientServiceImpl() {
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    @Deprecated
    public void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{this, amnetPost});
            return;
        }
        try {
            LogCatUtil.info("AmnetClientService", "Accept post from main process. amnetPost=[channel" + ((int) amnetPost.channel) + riy.ARRAY_END_STR);
            amnetPost.ipcM2p = System.currentTimeMillis() - amnetPost.ipcM2p;
            AmnetManagerFactory.getInstance().post(amnetPost);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetClientService", "post exception", th);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    public int getConnState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3cf11709", new Object[]{this})).intValue() : AmnetManagerFactory.getInstance().getAmnetGeneralEventManager().getLatestConnState();
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    public boolean isAmnetActiveted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f6345b1", new Object[]{this})).booleanValue() : this.f5384a;
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    public void setAmnetActiveted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8056f88f", new Object[]{this, new Boolean(z)});
        } else {
            this.f5384a = z;
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    public void notifyResultFeedback(ResultFeedback resultFeedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c4f226", new Object[]{this, resultFeedback});
            return;
        }
        try {
            AmnetManagerFactory.getInstance().notifyResultFeedback(resultFeedback);
        } catch (Exception e) {
            LogCatUtil.error("AmnetClientService", "notifyResultFeedback", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService
    public Map<String, String> postWithResult(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e060064", new Object[]{this, amnetPost});
        }
        try {
            LogCatUtil.info("AmnetClientService", "Accept post from main process. amnetPost=[channel" + ((int) amnetPost.channel) + riy.ARRAY_END_STR);
            amnetPost.ipcM2p = System.currentTimeMillis() - amnetPost.ipcM2p;
            return AmnetManagerFactory.getInstance().postWithResult(amnetPost);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetClientService", "post exception", th);
            return null;
        }
    }
}
