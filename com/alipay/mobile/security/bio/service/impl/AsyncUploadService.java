package com.alipay.mobile.security.bio.service.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchJsonGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class AsyncUploadService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AsyncUploadService f5807a;
    private Context b;
    private LocalBroadcastManager c;
    private BioRPCService d;
    private Queue<AsyncUploadItem> e;
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.alipay.mobile.security.bio.service.impl.AsyncUploadService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"KExitMiniPayViewNotification".equals(intent.getAction())) {
            } else {
                new Thread(new Runnable() { // from class: com.alipay.mobile.security.bio.service.impl.AsyncUploadService.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AsyncUploadService.a(AsyncUploadService.this);
                        }
                    }
                }).start();
            }
        }
    };

    /* loaded from: classes3.dex */
    public static class AsyncUploadItem {
        public Map<String, Object> params;
        public String zimData;
        public String zimId;
    }

    public static /* synthetic */ void a(AsyncUploadService asyncUploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45149a8a", new Object[]{asyncUploadService});
        } else {
            asyncUploadService.a();
        }
    }

    private AsyncUploadService(Context context) {
        if (context != null) {
            this.b = context.getApplicationContext();
            this.c = LocalBroadcastManager.getInstance(this.b);
            this.d = (BioRPCService) BioServiceManager.getLocalService(this.b, BioRPCService.class);
            this.e = new ConcurrentLinkedQueue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("KExitMiniPayViewNotification");
            this.c.registerReceiver(this.f, intentFilter);
        }
    }

    public static AsyncUploadService getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncUploadService) ipChange.ipc$dispatch("12cea802", new Object[]{context});
        }
        if (f5807a == null) {
            f5807a = new AsyncUploadService(context);
        }
        return f5807a;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.unregisterReceiver(this.f);
        }
    }

    public void addAsyncUploadItem(AsyncUploadItem asyncUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f58c", new Object[]{this, asyncUploadItem});
            return;
        }
        Queue<AsyncUploadItem> queue = this.e;
        if (queue != null && queue.size() < 10) {
            try {
                this.e.offer(asyncUploadItem);
                return;
            } catch (Exception e) {
                BioLog.w("addAsyncUploadItem error: " + e);
                return;
            }
        }
        BioLog.w("addAsyncUploadItem failed");
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.e != null && !this.e.isEmpty()) {
            while (true) {
                try {
                    AsyncUploadItem poll = this.e.poll();
                    if (poll == null) {
                        return;
                    }
                    ZimDispatchJsonGwFacade zimDispatchJsonGwFacade = (ZimDispatchJsonGwFacade) this.d.getRpcProxy(ZimDispatchJsonGwFacade.class);
                    if (poll.params != null && poll.params.containsKey(ZimPlatform.KYE_REMOTESERVER)) {
                        String obj = poll.params.get(ZimPlatform.KYE_REMOTESERVER).toString();
                        BioLog.d("Remote Server Change:" + obj);
                        if (obj.equals("iPay")) {
                            zimDispatchJsonGwFacade = (ZimDispatchJsonGwFacade) this.d.getRpcProxy(ZimDispatchJsonGwFacade.class);
                            this.d.setRegion(zimDispatchJsonGwFacade, "MO");
                        }
                    }
                    ZimValidateJsonGwRequest zimValidateJsonGwRequest = new ZimValidateJsonGwRequest();
                    zimValidateJsonGwRequest.zimId = poll.zimId;
                    zimValidateJsonGwRequest.zimData = poll.zimData;
                    BioLog.e("asyncUpload(): request= " + zimValidateJsonGwRequest);
                    ZimValidateGwResponse validateStandard = zimDispatchJsonGwFacade.validateStandard(zimValidateJsonGwRequest);
                    BioLog.e("asyncUpload(): response= " + validateStandard);
                } catch (Exception e) {
                    BioLog.w("asyncUpload error: " + e);
                }
            }
        }
    }
}
