package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.share.taopassword.genpassword.model.a;
import com.taobao.taobao.R;
import com.ut.share.ShareResponse;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class oim implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private oak f32096a = new oak() { // from class: tb.oim.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.oak
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            ShareBizAdapter.getInstance().getAppEnv().b(str);
            oup.a(2);
        }

        @Override // tb.oak
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                Toast.makeText(nym.a().getApplicationContext(), b.a(R.string.taobao_app_1010_1_17849), 0).show();
            }
        }

        @Override // tb.oak
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                com.taobao.share.taopassword.b.a(ShareTargetType.Share2Copy.getValue());
            }
        }
    };

    static {
        kge.a(732261072);
        kge.a(-2068678803);
    }

    public static /* synthetic */ oak a(oim oimVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oak) ipChange.ipc$dispatch("f3193508", new Object[]{oimVar}) : oimVar.f32096a;
    }

    public static /* synthetic */ void a(oim oimVar, String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c651c1e", new Object[]{oimVar, str, tBShareContent});
        } else {
            oimVar.a(str, tBShareContent);
        }
    }

    @Override // tb.oiq
    public void a(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null) {
            return;
        }
        TaoPasswordShareType taoPasswordShareType = null;
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            taoPasswordShareType = TaoPasswordShareType.ShareTypeCopy;
            str2 = "Copy";
        } else if (ShareTargetType.Share2SMS.getValue().equals(str)) {
            taoPasswordShareType = TaoPasswordShareType.ShareTypeSMS;
            str2 = "taopassword-sms";
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(j, taoPasswordShareType, str2);
    }

    private void a(TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3603bcb", new Object[]{this, tBShareContent, taoPasswordShareType, str});
            return;
        }
        String str2 = tBShareContent.description;
        f g = e.b().g();
        if (g != null && !TextUtils.isEmpty(g.f19632a)) {
            str2 = g.f19632a + " " + str2;
        }
        a aVar = new a();
        aVar.f19662a = tBShareContent.businessId;
        aVar.c = str2;
        aVar.d = ShareServiceApi.urlBackFlow(tBShareContent.businessId, str, tBShareContent.url);
        aVar.e = tBShareContent.imageUrl;
        aVar.f = tBShareContent.shareScene;
        aVar.j = tBShareContent.extraParams;
        aVar.b = tBShareContent.title;
        if (!TextUtils.isEmpty(str)) {
            aVar.m = str.toLowerCase();
        } else {
            aVar.m = "other";
        }
        aVar.k = tBShareContent.popType.name;
        aVar.l = tBShareContent.popUrl;
        if (tBShareContent.disableBackToClient) {
            aVar.n = 0;
        }
        if (TaoPasswordShareType.ShareTypeCopy.getValue().equals(taoPasswordShareType.getValue())) {
            aVar.g = "copy";
            a(aVar);
        } else if (!TaoPasswordShareType.ShareTypeSMS.getValue().equals(taoPasswordShareType.getValue())) {
        } else {
            aVar.g = "sms";
            a(aVar, tBShareContent, taoPasswordShareType);
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7580095", new Object[]{this, aVar});
            return;
        }
        oai.a(true);
        try {
            oah.a().a(nym.a().getApplicationContext(), aVar, TPAction.COPY, new oal() { // from class: tb.oim.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oal
                public void a(obd obdVar, com.taobao.share.taopassword.busniess.model.e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dbeaf3eb", new Object[]{this, obdVar, eVar});
                    } else if (eVar == null) {
                    } else {
                        String str = eVar.b;
                        if (TextUtils.isEmpty(str)) {
                            String str2 = aVar.c;
                            str = com.taobao.share.taopassword.b.c(TextUtils.isEmpty(str2) ? aVar.d : str2.concat(" ").concat(aVar.d));
                            oah.a(nym.a().getApplicationContext(), aVar.d);
                        }
                        obdVar.a(nym.a().getApplicationContext(), TPTargetType.COPY, str, oim.a(oim.this));
                    }
                }
            }, ShareBizAdapter.getInstance().getAppEnv().a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [tb.oim$3] */
    public void a(final a aVar, final TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48d272e", new Object[]{this, aVar, tBShareContent, taoPasswordShareType});
            return;
        }
        oai.a(false);
        try {
            if (!TextUtils.isEmpty(tBShareContent.smsTemplate)) {
                new AsyncTask<Void, Void, String>() { // from class: tb.oim.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
                    @Override // android.os.AsyncTask
                    public /* synthetic */ String doInBackground(Void[] voidArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                    }

                    @Override // android.os.AsyncTask
                    public /* synthetic */ void onPostExecute(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b105c779", new Object[]{this, str});
                        } else {
                            a(str);
                        }
                    }

                    public String a(Void... voidArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr}) : new nzp().shortenURL(aVar.d);
                    }

                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else {
                            oim.a(oim.this, tBShareContent.smsTemplate.replace("{url}", str), tBShareContent);
                        }
                    }
                }.execute(new Void[0]);
            } else {
                oah.a().a(nym.a().getApplicationContext(), aVar, TPAction.SMS, new oal() { // from class: tb.oim.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.oal
                    public void a(obd obdVar, com.taobao.share.taopassword.busniess.model.e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dbeaf3eb", new Object[]{this, obdVar, eVar});
                        } else if (eVar == null) {
                        } else {
                            String str = eVar.b;
                            if (TextUtils.isEmpty(str)) {
                                str = TextUtils.isEmpty(aVar.c) ? aVar.d : aVar.c;
                            }
                            oim.a(oim.this, str, tBShareContent);
                        }
                    }
                }, ShareBizAdapter.getInstance().getAppEnv().a());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c169bf7b", new Object[]{this, str, tBShareContent});
            return;
        }
        ShareData shareData = new ShareData();
        shareData.setText(str);
        if (tBShareContent.phoneNumberList != null && tBShareContent.phoneNumberList.size() > 0) {
            if (shareData.getUserInfo() == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("phoneNumbers", a(tBShareContent.phoneNumberList, ";"));
                shareData.setUserInfo(hashMap);
            } else {
                shareData.getUserInfo().put("phoneNumbers", a(tBShareContent.phoneNumberList, ";"));
            }
        }
        com.taobao.share.taopassword.b.a(nym.a().getApplicationContext(), ShareTargetType.Share2SMS.getValue(), shareData, new ShareListener() { // from class: tb.oim.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.inter.ShareListener
            public void onResponse(ShareResponse shareResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5dc66e8", new Object[]{this, shareResponse});
                }
            }
        });
    }

    public static String a(List<String> list, String str) {
        Iterator<String> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{list, str});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        String str2 = "";
        while (list.iterator().hasNext()) {
            str2 = str2 + it.next() + str;
        }
        return str2.substring(0, str2.length() - 1);
    }
}
