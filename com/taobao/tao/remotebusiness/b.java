package com.taobao.tao.remotebusiness;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.ryl;
import tb.ryq;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.RequestPool";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<MtopBusiness>> f21015a = new HashMap();
    private Lock b = new ReentrantLock();

    static {
        kge.a(-2141572574);
    }

    public void a(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879b48e9", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop, str);
            List<MtopBusiness> list = this.f21015a.get(b);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(mtopBusiness);
            this.f21015a.put(b, list);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(b);
                sb.append(" [addToRequestPool] add mtopBuilder to RequestPool.");
                TBSdkLog.e(TAG, mtopBusiness.getMtopContext() != null ? mtopBusiness.getMtopContext().h : null, sb.toString());
            }
        } finally {
            this.b.unlock();
        }
    }

    public void a(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295a608b", new Object[]{this, mtop, str});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop, str);
            List<MtopBusiness> remove = this.f21015a.remove(b);
            if (remove != null && !remove.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(b);
                    sb.append(" [retryAllRequest] retry all request,current size=");
                    sb.append(remove.size());
                    TBSdkLog.e(TAG, sb.toString());
                }
                for (MtopBusiness mtopBusiness : remove) {
                    if (mtopBusiness.listener instanceof IInteractingListener) {
                        ((IInteractingListener) mtopBusiness.listener).onInteract(InteractOption.INTERACT_FINISH);
                    }
                    if (!mtopBusiness.isTaskCanceled()) {
                        mtopBusiness.retryRequest();
                    }
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public void b(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc5d1aa", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop, str);
            List<MtopBusiness> list = this.f21015a.get(b);
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(b);
                sb.append(" [retrySingleRequest] retry single request.");
                TBSdkLog.e(TAG, mtopBusiness.getMtopContext() != null ? mtopBusiness.getMtopContext().h : null, sb.toString());
                if (!mtopBusiness.isTaskCanceled() && list.contains(mtopBusiness)) {
                    mtopBusiness.retryRequest();
                    list.remove(mtopBusiness);
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public void c(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f05a6b", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop, str);
            List<MtopBusiness> list = this.f21015a.get(b);
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(b);
                sb.append(" [removeRequest] remove single request.");
                TBSdkLog.e(TAG, mtopBusiness.getMtopContext() != null ? mtopBusiness.getMtopContext().h : null, sb.toString());
                list.remove(mtopBusiness);
            }
        } finally {
            this.b.unlock();
        }
    }

    public void a(Mtop mtop, String str, String str2, String str3) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02d6c1f", new Object[]{this, mtop, str, str2, str3});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop, str);
            List<MtopBusiness> remove = this.f21015a.remove(b);
            if (remove != null && !remove.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(b);
                    sb.append(" [failAllRequest]fail all request,current size=");
                    sb.append(remove.size());
                    TBSdkLog.e(TAG, sb.toString());
                }
                for (MtopBusiness mtopBusiness : remove) {
                    if (mtopBusiness.request != null) {
                        mtopResponse = new MtopResponse(mtopBusiness.request.getApiName(), mtopBusiness.request.getVersion(), str2, str3);
                    } else {
                        mtopResponse = new MtopResponse(str2, str3);
                    }
                    mtopsdk.framework.domain.a mtopContext = mtopBusiness.getMtopContext();
                    if (mtopContext == null) {
                        mtopContext = mtopBusiness.createMtopContext(mtopBusiness.listener);
                    }
                    mtopContext.c = mtopResponse;
                    try {
                        ryl.prefetchDuplexFilter.a(mtopContext);
                        ryl.errorCodeMappingAfterFilter.a(mtopContext);
                    } catch (Exception e) {
                        TBSdkLog.e(TAG, "[failAllRequest] do ErrorCode Mapping error.apiKey=" + mtopResponse.getFullKey(), e);
                    }
                    HandlerParam a2 = com.taobao.tao.remotebusiness.handler.a.a(null, null, mtopBusiness);
                    a2.mtopResponse = mtopResponse;
                    if (mtopBusiness.mtopProp != null && mtopBusiness.mtopProp.streamMode) {
                        if (a2.mtopResponse.getStreamModeData() == null) {
                            ryq ryqVar = new ryq();
                            ryqVar.b = 0;
                            ryqVar.h = 0;
                            a2.mtopResponse.setStreamModeData(ryqVar);
                        }
                        com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(11, a2).sendToTarget();
                    } else {
                        com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(3, a2).sendToTarget();
                    }
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    private String b(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad825f54", new Object[]{this, mtop, str});
        }
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return StringUtils.concatStr(mtop.getInstanceId(), str);
    }
}
