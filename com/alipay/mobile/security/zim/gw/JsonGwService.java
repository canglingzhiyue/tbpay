package com.alipay.mobile.security.zim.gw;

import android.os.Handler;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchJsonGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class JsonGwService extends BaseGwService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonGwService(GwListener gwListener) {
        super(gwListener, "zim-json-upload");
        this.f5848a.start();
        this.b = new Handler(this.f5848a.getLooper());
    }

    @Override // com.alipay.mobile.security.zim.gw.BaseGwService
    public void init(final ZimInitGwRequest zimInitGwRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7357f6", new Object[]{this, zimInitGwRequest});
        } else {
            this.b.post(new Runnable() { // from class: com.alipay.mobile.security.zim.gw.JsonGwService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    final ZimInitGwResponse zimInitGwResponse;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioLog.d("" + zimInitGwRequest);
                    try {
                        zimInitGwResponse = ((ZimDispatchJsonGwFacade) ((BioRPCService) BioServiceManager.getCurrentInstance().getBioService(BioRPCService.class)).getRpcProxy(ZimDispatchJsonGwFacade.class)).initStandard(zimInitGwRequest);
                    } catch (Throwable th) {
                        BioLog.w(th);
                        ZimInitGwResponse zimInitGwResponse2 = new ZimInitGwResponse();
                        if (th instanceof IRpcException) {
                            zimInitGwResponse2.retCode = 2002;
                        } else {
                            zimInitGwResponse2.retCode = 1001;
                        }
                        zimInitGwResponse = zimInitGwResponse2;
                    }
                    if (zimInitGwResponse == null) {
                        zimInitGwResponse = new ZimInitGwResponse();
                        zimInitGwResponse.retCode = 1001;
                    }
                    BioLog.d("" + zimInitGwResponse);
                    if (JsonGwService.this.c == null) {
                        return;
                    }
                    JsonGwService.this.c.post(new Runnable() { // from class: com.alipay.mobile.security.zim.gw.JsonGwService.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (JsonGwService.this.d == null) {
                            } else {
                                JsonGwService.this.d.onInit(zimInitGwResponse);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.alipay.mobile.security.zim.gw.BaseGwService
    public ZimInitGwResponse convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimInitGwResponse) ipChange.ipc$dispatch("37ab9195", new Object[]{this, str});
        }
        ZimInitGwResponse zimInitGwResponse = (ZimInitGwResponse) JSON.parseObject(Base64.decode(str.getBytes(), 10), ZimInitGwResponse.class, new Feature[0]);
        BioLog.d("converted response is " + zimInitGwResponse);
        return zimInitGwResponse;
    }
}
