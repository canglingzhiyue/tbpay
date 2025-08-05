package com.taobao.share.core.share;

import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.service.AidlService;
import com.taobao.android.share.resource.a;
import com.taobao.share.aidl.IShareBusiness;
import com.taobao.share.core.share.interceptor.LoginInterceptor;
import com.taobao.share.core.share.interceptor.c;
import com.taobao.share.core.share.interceptor.d;
import com.taobao.share.core.share.interceptor.e;
import com.taobao.share.core.share.interceptor.g;
import com.taobao.share.core.share.mtop.a;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.acg;
import tb.jqm;
import tb.kge;
import tb.nyl;
import tb.nyn;
import tb.nyt;
import tb.nyu;
import tb.nyx;
import tb.nyy;
import tb.nzd;

/* loaded from: classes8.dex */
public class ShareBusinessService extends AidlService<IShareBusiness, ShareBusinessBinder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareBusinessService";

    static {
        kge.a(-987683533);
    }

    public ShareBusinessService() {
        f.a("com.taobao.clipboard_share", "com.taobao.share.core.share.ShareBusinessService");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    /* loaded from: classes8.dex */
    public class ShareBusinessBinder extends IShareBusiness.Stub {
        static {
            kge.a(975427128);
        }

        public ShareBusinessBinder() {
        }

        @Override // com.taobao.share.aidl.IShareBusiness
        public boolean share(List<String> list, String str) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            a a2 = a.a();
            a2.a(a.KEY_SHAREPANELBUSINESSSERVICESTART);
            try {
                TBShareContent a3 = nyn.a(str);
                ShareBusinessService.a(new ArrayList(list), a3);
                TBS.Ext.commitEvent("Share_Exception", 19999, "sharedata", "info", b.a(R.string.taobao_app_1010_1_18274), JSON.toJSONString(a3));
                a2.a(a.KEY_SHAREPANELBUSINESSSERVICEEND);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                nyy.c(ShareBusinessService.TAG, "ShareBusinessService.share err:" + th.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("error", th.getMessage());
                hashMap.put("shareContentJson", str);
                nyx.a("ShareBusinessService#share", "ENTER_SHARE_EXCEPTION", hashMap);
                return false;
            }
        }
    }

    public static void a(final ArrayList<String> arrayList, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4122a76b", new Object[]{arrayList, tBShareContent});
            return;
        }
        final a a2 = a.a();
        a2.a(a.KEY_SHAREPANELDOSHARESTART);
        String a3 = nyt.a();
        ShareBizAdapter.getInstance().initShareAdapter();
        if (new d(arrayList, tBShareContent, a3).a((c) new com.taobao.share.core.share.interceptor.f()).a(new LoginInterceptor()).a(new e()).a((c) new com.taobao.share.core.share.interceptor.a()).a(new g()).a()) {
            nyy.a(TAG, "return doShared : isHasIntercept true");
            return;
        }
        if (tBShareContent != null) {
            String str = tBShareContent.businessId;
            String str2 = tBShareContent.detailSharePosition;
            TBS.Ext.commitEvent("Page_Share", 19999, "PrepareShare", str, str2, tBShareContent.businessId + "," + tBShareContent.templateId + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + com.taobao.share.globalmodel.e.b().m() + ",suId=" + tBShareContent.suId);
        }
        final nzd shareEngine = ShareBizAdapter.getInstance().getShareEngine();
        boolean h = nyl.h();
        a2.a(a.KEY_SHAREPANELDOSHAREEND);
        if (!h) {
            new com.taobao.share.core.share.mtop.a().a(new a.InterfaceC0805a() { // from class: com.taobao.share.core.share.ShareBusinessService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.core.share.mtop.a.InterfaceC0805a
                public void a(TBShareContent tBShareContent2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent2});
                        return;
                    }
                    com.taobao.android.share.resource.a.this.a(com.taobao.android.share.resource.a.KEY_SHAREPANELRENDERPANELACTIVITYINFOSTART);
                    shareEngine.getSharePanel().renderSharePanel(arrayList, tBShareContent2);
                    com.taobao.android.share.resource.a.this.a(com.taobao.android.share.resource.a.KEY_SHAREPANELRENDERPANELACTIVITYINFOEND);
                }
            }, tBShareContent);
        } else {
            a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELRENDERPANELSTART);
            shareEngine.getSharePanel().renderSharePanel(arrayList, tBShareContent);
            a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELRENDERPANELEND);
        }
        if (!jqm.a()) {
            return;
        }
        nyu.a(acg.a(), b.a(h ? R.string.taobao_app_1010_1_18285 : R.string.taobao_app_1010_1_18291));
    }
}
