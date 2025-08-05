package com.taobao.share.core.services;

import android.os.RemoteException;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.service.AidlService;
import com.taobao.share.aidl.IShareSupplyChannel;
import com.taobao.share.aidl.IShareSupplyChannelCallBack;
import com.taobao.share.globalmodel.a;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareChanelService extends AidlService<IShareSupplyChannel, ShareChanelServiceBinder> {
    public static final String TAG = "ShareChanelService";

    static {
        kge.a(1365921409);
    }

    public ShareChanelService() {
        f.a("com.taobao.clipboard_share", "com.taobao.share.core.services.ShareChanelService");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    /* loaded from: classes8.dex */
    public class ShareChanelServiceBinder extends IShareSupplyChannel.Stub {
        static {
            kge.a(1185060938);
        }

        public ShareChanelServiceBinder() {
        }

        @Override // com.taobao.share.aidl.IShareSupplyChannel
        public void supplyChannel(IShareSupplyChannelCallBack iShareSupplyChannelCallBack) throws RemoteException {
            if (ShareBizAdapter.getInstance().getShareEngine() == null || ShareBizAdapter.getInstance().getShareEngine().getChanelEngine() == null) {
                return;
            }
            ArrayList<a> a2 = ShareBizAdapter.getInstance().getShareEngine().getChanelEngine().a(false);
            ArrayList arrayList = new ArrayList();
            if (a2 != null && a2.size() > 0) {
                Iterator<a> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            }
            if (iShareSupplyChannelCallBack == null) {
                return;
            }
            iShareSupplyChannelCallBack.channelCallBack(arrayList);
        }
    }
}
