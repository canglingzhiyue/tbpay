package com.taobao.tao.adapter.biz.friends;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.service.Services;
import com.taobao.contacts.data.member.ShareResultMember;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.biz.share.ShareGoodsParams;
import com.taobao.message.biz.share.ShareMessageService;
import com.taobao.message.biz.share.ShareType;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.AmpUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.msgcenter.aidl.IMessageBoxService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nym;
import tb.nyy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String TAG = "SendMsgBridge";

    /* renamed from: a  reason: collision with root package name */
    private List<Contacts> f19793a;
    private Contacts b;

    /* renamed from: com.taobao.tao.adapter.biz.friends.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0823a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f19795a;

        static {
            kge.a(-861491905);
            f19795a = new a(null);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("819e2bd2", new Object[0]) : f19795a;
        }
    }

    static {
        kge.a(-660775828);
    }

    public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        this();
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("819e2bd2", new Object[0]) : C0823a.a();
    }

    public void a(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f19793a = list;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<Contacts> list = this.f19793a;
        if (list == null) {
            return;
        }
        list.clear();
    }

    private List<Contacts> a(String str) {
        List<Contacts> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (list = this.f19793a) != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Contacts contacts : this.f19793a) {
                if (str.equals(contacts.getUserId())) {
                    this.b = contacts;
                    arrayList.add(contacts);
                } else if (str.equals(AmpUtil.getOldGroupCcodeFromGroupId(contacts.getGroupId()))) {
                    this.b = contacts;
                    arrayList.add(contacts);
                }
            }
            if (arrayList.size() == 1) {
                return arrayList;
            }
        }
        return null;
    }

    private boolean a(List<ShareResultMember> list, List<String> list2, List<String> list3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f509d3f", new Object[]{this, list, list2, list3})).booleanValue();
        }
        if (list.size() != 0 || ((list2.size() != 1 && list3.size() != 1) || (list2.size() == 1 && list3.size() == 1))) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isSendToMsgClient", "true"));
    }

    public boolean a(String str, TBShareContent tBShareContent, List<ShareResultMember> list, List<String> list2, List<String> list3) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1725e52", new Object[]{this, str, tBShareContent, list, list2, list3})).booleanValue();
        }
        try {
            if (tBShareContent == null) {
                nyy.a(TAG, "content: null");
                return false;
            } else if (!a(list, list2, list3)) {
                nyy.a(TAG, "isNeedSendToMsgClient: false");
                return false;
            } else {
                String str3 = "";
                if (tBShareContent.extraParams != null) {
                    String str4 = tBShareContent.extraParams.get("price");
                    if (str4.contains("-")) {
                        str4 = str4.split("-")[0];
                    }
                    str2 = str4;
                } else {
                    str2 = str3;
                }
                String f = e.b().f();
                if (StringUtils.isEmpty(f)) {
                    nyy.a(TAG, "itemId : null");
                    return false;
                }
                if (list2.size() == 1) {
                    str3 = list2.get(0);
                } else if (list3.size() == 1) {
                    str3 = list3.get(0);
                }
                List<Contacts> a2 = a(str3);
                if (a2 == null) {
                    nyy.a(TAG, "getRecentContactById err: null");
                    return false;
                } else if (StringUtils.isEmpty(str2)) {
                    nyy.a(TAG, "price : null");
                    return false;
                } else {
                    ShareGoodsParams shareGoodsParams = new ShareGoodsParams(a2, tBShareContent.url, f, tBShareContent.imageUrl, str2, tBShareContent.description);
                    shareGoodsParams.setShareRemark(str);
                    return ((ShareMessageService) GlobalContainer.getInstance().get(ShareMessageService.class)).sendShareMessage(ShareType.GOODS, shareGoodsParams);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c(TAG, "sendShareToMsgClient err: " + th.getMessage());
            return false;
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (this.b == null) {
            nyy.a(TAG, "goChatWithContacts err:null");
        } else {
            TBS.Page.ctrlClicked(CT.Button, "GotoChat");
            Bundle bundle = new Bundle();
            if (StringUtils.equals("G", this.b.getEntityType())) {
                bundle.putString("conversation_code", AmpUtil.getOldGroupCcodeFromGroupId(this.b.getGroupId()));
            } else {
                bundle.putLong("amp_uid", Long.valueOf(this.b.getUserId()).longValue());
                bundle.putString("amp_displayname", this.b.getDisplayName());
            }
            Nav.from(nym.a()).withExtras(bundle).toUri(ShareBizAdapter.getInstance().getFriendsProvider().a());
            if (activity != null) {
                activity.finish();
            } else {
                AppMonitor.Alarm.commitSuccess("share", "Share");
            }
        }
    }

    /* renamed from: com.taobao.tao.adapter.biz.friends.a$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends AsyncTask<Void, Void, IMessageBoxService> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19794a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.msgcenter.aidl.IMessageBoxService, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ IMessageBoxService doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(IMessageBoxService iMessageBoxService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, iMessageBoxService});
            } else {
                a(iMessageBoxService);
            }
        }

        public IMessageBoxService a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMessageBoxService) ipChange.ipc$dispatch("965dd323", new Object[]{this, voidArr}) : Services.get(ShareBizAdapter.getInstance().getAppEnv().c(), (Class<IMessageBoxService>) IMessageBoxService.class);
        }

        public void a(IMessageBoxService iMessageBoxService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9af90dc9", new Object[]{this, iMessageBoxService});
            } else if (iMessageBoxService == null) {
            } else {
                try {
                    iMessageBoxService.sendImgMessage(this.f19794a, this.b, this.c, this.d, this.e, this.f);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
