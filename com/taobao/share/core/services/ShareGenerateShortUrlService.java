package com.taobao.share.core.services;

import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.service.AidlService;
import com.taobao.share.aidl.IShareGenerateShortUrl;
import com.taobao.share.aidl.IShareGenerateShortUrlCallBack;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.b;
import com.taobao.share.taopassword.busniess.model.e;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.genpassword.model.a;
import com.taobao.tao.TaobaoApplication;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import java.util.Map;
import tb.kge;
import tb.nym;
import tb.oah;
import tb.oal;
import tb.obc;
import tb.obd;

/* loaded from: classes8.dex */
public class ShareGenerateShortUrlService extends AidlService<IShareGenerateShortUrl, ShareGenerateShortUrlBinder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareGenerateShortUrl";

    static {
        kge.a(-1682597646);
    }

    public static /* synthetic */ Object ipc$super(ShareGenerateShortUrlService shareGenerateShortUrlService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ShareGenerateShortUrlService() {
        f.a("com.taobao.clipboard_share", "com.taobao.share.core.services.ShareGenerateShortUrlService");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ a a(ShareGenerateShortUrlService shareGenerateShortUrlService, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("db625932", new Object[]{shareGenerateShortUrlService, str}) : shareGenerateShortUrlService.a(str);
    }

    /* loaded from: classes8.dex */
    public class ShareGenerateShortUrlBinder extends IShareGenerateShortUrl.Stub {
        static {
            kge.a(1596069279);
        }

        public ShareGenerateShortUrlBinder() {
        }

        @Override // com.taobao.share.aidl.IShareGenerateShortUrl
        public void generateShorUrl(String str, final IShareGenerateShortUrlCallBack iShareGenerateShortUrlCallBack) throws RemoteException {
            a a2 = ShareGenerateShortUrlService.a(ShareGenerateShortUrlService.this, str);
            if (a2 == null) {
                if (iShareGenerateShortUrlCallBack == null) {
                    return;
                }
                iShareGenerateShortUrlCallBack.callBack(null);
                return;
            }
            final String str2 = a2.d;
            String urlBackFlow = ShareServiceApi.urlBackFlow(a2.f19662a, "QRCode", a2.d);
            if (!TextUtils.isEmpty(urlBackFlow)) {
                b.a(ShareTargetType.Share2QRCode.getValue());
                if (!TextUtils.isEmpty(urlBackFlow) && !str2.equals(urlBackFlow)) {
                    str2 = urlBackFlow;
                }
            }
            a2.d = str2;
            a2.m = "qrcode";
            try {
                oah.a().a(nym.a().getApplicationContext(), a2, TPAction.COPY, new oal() { // from class: com.taobao.share.core.services.ShareGenerateShortUrlService.ShareGenerateShortUrlBinder.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.oal
                    public void a(obd obdVar, e eVar) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("dbeaf3eb", new Object[]{this, obdVar, eVar});
                            return;
                        }
                        String d = b.d((eVar == null || TextUtils.isEmpty(eVar.d)) ? str2 : eVar.d);
                        if (!TextUtils.isEmpty(d)) {
                            obc.a(nym.a(), obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, d);
                        }
                        IShareGenerateShortUrlCallBack iShareGenerateShortUrlCallBack2 = iShareGenerateShortUrlCallBack;
                        if (iShareGenerateShortUrlCallBack2 == null) {
                            return;
                        }
                        try {
                            iShareGenerateShortUrlCallBack2.callBack(d);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }, ShareBizAdapter.getInstance().getAppEnv().a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f2d85fd1", new Object[]{this, str});
        }
        a aVar = null;
        try {
            Map map = (Map) JSON.parse(str);
            a aVar2 = new a();
            try {
                aVar2.f19662a = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID);
                aVar2.c = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_DESP);
                aVar2.d = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_URL);
                aVar2.e = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_IMAGE_URL);
                aVar2.f = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_CONTENTTYPE);
                String str2 = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_PARAMS);
                if (!TextUtils.isEmpty(str2)) {
                    aVar2.j = (Map) JSON.parse(str2);
                }
                aVar2.b = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_TITLE);
                if (Boolean.parseBoolean(((String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_CLIENT)).toString())) {
                    aVar2.n = 0;
                }
                aVar2.g = "copy";
                Object obj = map.get(ShareBusiness.SHARE_INTENT_EXTAR_POPTYPE);
                if (obj != null) {
                    aVar2.k = TBShareContent.TaoPasswordPopType.findType(obj.toString()).name;
                    aVar2.l = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_POPURL);
                }
                return aVar2;
            } catch (Exception e) {
                e = e;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
