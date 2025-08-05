package com.alibaba.security.ccrc.service;

import android.util.Pair;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.Ka;
import com.alibaba.security.ccrc.service.build.Oa;
import com.alibaba.security.ccrc.service.build.W;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class CcrcOffClientService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CCRC_TAOBAO_OFF_CLIENT_RISK = "ccrc_taobao_off_client_risk";
    public static final String TAG = "CcrcOffClientService";
    public final CcrcService mCcrcService;
    public final ThreadPoolExecutor mThreadPoolExecutor;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static final CcrcOffClientService f3226a = new CcrcOffClientService();
    }

    public static /* synthetic */ void a(String str, Pair pair, Map map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5bdb1d", new Object[]{str, pair, map});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(CCRC_TAOBAO_OFF_CLIENT_RISK).setPhase(Ba.b.e).setOperation(Ba.a.s);
        if (!((Boolean) pair.second).booleanValue()) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("inputParams", JsonUtils.toJSONString(map)).addParam("isSuccess", Boolean.valueOf(((RiskShowCustomizedResult) pair.first).isSuccess())).addParam("errorMsg", ((RiskShowCustomizedResult) pair.first).getErrorMsg()).build());
        TrackManager.uploadOnce();
    }

    public static synchronized CcrcOffClientService getService() {
        synchronized (CcrcOffClientService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcOffClientService) ipChange.ipc$dispatch("1c410149", new Object[0]);
            }
            return a.f3226a;
        }
    }

    private void trackDetect(final String str, final Pair<RiskShowCustomizedResult, Boolean> pair, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665c4f8a", new Object[]{this, str, pair, map});
        } else {
            this.mThreadPoolExecutor.submit(new Runnable() { // from class: com.alibaba.security.ccrc.service.-$$Lambda$b5TAlMS-j9egYa1RJrJdFxucvU0
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcOffClientService.a(str, pair, map);
                }
            });
        }
    }

    public RiskShowCustomizedResult detectWithActivate(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskShowCustomizedResult) ipChange.ipc$dispatch("bc4642ef", new Object[]{this, map});
        }
        if (this.mCcrcService == null) {
            return W.a("CCRC service instance is null");
        }
        if (map != null && !map.isEmpty()) {
            Oa oa = new Oa(this.mCcrcService, map);
            this.mThreadPoolExecutor.submit(oa);
            Pair<RiskShowCustomizedResult, Boolean> a2 = oa.a(20L);
            trackDetect(this.mCcrcService.getCcrcServiceManager().e(), a2, map);
            return (RiskShowCustomizedResult) a2.first;
        }
        return W.a("CCRC params error");
    }

    public CcrcOffClientService() {
        this.mCcrcService = CcrcService.getService(CCRC_TAOBAO_OFF_CLIENT_RISK);
        this.mThreadPoolExecutor = new ThreadPoolExecutor(1, 1, 20L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Ka("wukong_off_client"));
        this.mThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
