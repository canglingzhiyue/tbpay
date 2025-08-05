package com.taobao.tao.longpic;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.b;
import com.taobao.share.taopassword.busniess.model.e;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.tao.longpic.ShareNewQRCodeView;
import com.taobao.tao.util.UriUtil;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import java.util.List;
import tb.kge;
import tb.nym;
import tb.nzf;
import tb.oah;
import tb.oal;
import tb.obd;

/* loaded from: classes8.dex */
public class a implements nzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(354846077);
        kge.a(1038276412);
    }

    @Override // tb.nzf
    public void a(TBShareContent tBShareContent, ShareData shareData, List<String> list, String str, JSONObject jSONObject, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2e9f1", new Object[]{this, tBShareContent, shareData, list, str, jSONObject, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
            return;
        }
        ShareNewQRCodeView shareNewQRCodeView = new ShareNewQRCodeView(nym.a().getApplicationContext());
        shareNewQRCodeView.showSnapshotDialog(list, shareData, str, jSONObject, str2, z, z2, tBShareContent, z3, new ShareNewQRCodeView.a() { // from class: com.taobao.tao.longpic.a.1
        });
        new AnonymousClass2(shareData, str3, tBShareContent, shareNewQRCodeView).execute(new Void[0]);
    }

    /* renamed from: com.taobao.tao.longpic.a$2  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f20743a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TBShareContent c;
        public final /* synthetic */ ShareNewQRCodeView d;

        public AnonymousClass2(ShareData shareData, String str, TBShareContent tBShareContent, ShareNewQRCodeView shareNewQRCodeView) {
            this.f20743a = shareData;
            this.b = str;
            this.c = tBShareContent;
            this.d = shareNewQRCodeView;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            final String link = this.f20743a.getLink();
            String urlBackFlow = ShareServiceApi.urlBackFlow(this.f20743a.getBusinessId(), nym.TYPE_GEN3_CODE.equals(this.b) ? "QRCodeAnti" : "QRCode", this.f20743a.getLink());
            if (!TextUtils.isEmpty(urlBackFlow)) {
                b.a(ShareTargetType.Share2QRCode.getValue());
                if (!TextUtils.isEmpty(urlBackFlow) && !link.equals(urlBackFlow)) {
                    link = urlBackFlow;
                }
            }
            com.taobao.share.taopassword.genpassword.model.a a2 = a.a(this.c);
            a2.d = link;
            try {
                a2.m = "qrcode";
                oah.a().a(nym.a().getApplicationContext(), a2, TPAction.COPY, new oal() { // from class: com.taobao.tao.longpic.a.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.oal
                    public void a(obd obdVar, e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dbeaf3eb", new Object[]{this, obdVar, eVar});
                            return;
                        }
                        final String d = b.d((eVar == null || TextUtils.isEmpty(eVar.d)) ? link : nym.TYPE_GEN3_CODE.equals(AnonymousClass2.this.b) ? UriUtil.appendQueryParameter(link, DispatchConstants.CONFIG_VERSION, UriUtil.getValue(Uri.parse(eVar.d), DispatchConstants.CONFIG_VERSION)).toString() : eVar.d);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.tao.longpic.a.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AnonymousClass2.this.d.createQrcode(d, AnonymousClass2.this.b, -957150);
                                }
                            }
                        });
                    }
                }, ShareBizAdapter.getInstance().getAppEnv().a());
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static com.taobao.share.taopassword.genpassword.model.a a(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.taopassword.genpassword.model.a) ipChange.ipc$dispatch("b895595e", new Object[]{tBShareContent});
        }
        if (tBShareContent == null) {
            return null;
        }
        com.taobao.share.taopassword.genpassword.model.a aVar = new com.taobao.share.taopassword.genpassword.model.a();
        aVar.f19662a = tBShareContent.businessId;
        aVar.c = tBShareContent.description;
        aVar.d = tBShareContent.url;
        aVar.e = tBShareContent.imageUrl;
        aVar.f = tBShareContent.shareScene;
        aVar.j = tBShareContent.extraParams;
        aVar.b = tBShareContent.title;
        if (tBShareContent.disableBackToClient) {
            aVar.n = 0;
        }
        aVar.g = "copy";
        aVar.k = tBShareContent.popType.name;
        aVar.l = tBShareContent.popUrl;
        return aVar;
    }
}
