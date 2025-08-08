package com.taobao.tao.adapter.biz.friends;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.biz.contacts.ContactsService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.core.IObserver;
import com.taobao.share.core.contacts.mtop.request.ComTaobaoGetContactsMessagesRequest;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponse;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponseData;
import com.taobao.share.core.contacts.mtop.response.RecentContactsModel;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.tao.log.TLog;
import com.taobao.tao.msgcenter.aidl.IMessageBoxService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.android.agoo.common.AgooConstants;
import tb.fjp;
import tb.kge;
import tb.nyl;
import tb.nyy;
import tb.nzi;
import tb.obh;
import tb.oda;

/* loaded from: classes8.dex */
public class c implements nzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f19799a;
    private int b;
    private int c;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static c f19802a;

        static {
            kge.a(191025909);
            f19802a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("819e2c10", new Object[0]) : f19802a;
        }
    }

    static {
        kge.a(-1286099422);
        kge.a(-1556476140);
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2f7a47d", new Object[]{cVar})).intValue() : cVar.b;
    }

    public static /* synthetic */ String a(c cVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1b75c85", new Object[]{cVar, list}) : cVar.b(list);
    }

    public static /* synthetic */ void a(c cVar, List list, nzi.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d89c93", new Object[]{cVar, list, aVar, new Long(j)});
        } else {
            cVar.a(list, aVar, j);
        }
    }

    public static /* synthetic */ int b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e839133e", new Object[]{cVar})).intValue() : cVar.c;
    }

    public static c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9068964e", new Object[0]) : a.a();
    }

    private c() {
        this.f19799a = "TBFriendsProvider";
        this.b = 0;
        this.c = 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.tao.adapter.biz.friends.c$1] */
    @Override // tb.nzi
    public void a(final String str, final int i, final int i2, final String str2, final int i3, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2efb31", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Integer(i3), str3});
            return;
        }
        try {
            new AsyncTask<Void, Void, IMessageBoxService>() { // from class: com.taobao.tao.adapter.biz.friends.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.msgcenter.aidl.IMessageBoxService, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ IMessageBoxService doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(IMessageBoxService iMessageBoxService) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, iMessageBoxService});
                    } else {
                        a(iMessageBoxService);
                    }
                }

                public IMessageBoxService a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (IMessageBoxService) ipChange2.ipc$dispatch("965dd323", new Object[]{this, voidArr}) : Services.get(ShareBizAdapter.getInstance().getAppEnv().c(), (Class<IMessageBoxService>) IMessageBoxService.class);
                }

                public void a(IMessageBoxService iMessageBoxService) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9af90dc9", new Object[]{this, iMessageBoxService});
                    } else if (iMessageBoxService == null) {
                    } else {
                        try {
                            iMessageBoxService.sendImgMessage(str, i, i2, str2, i3, str3);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.execute(new Void[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            String str4 = this.f19799a;
            nyy.c(str4, "sendShareToMsgClient sendImageToMsgClient err: " + th.getMessage());
        }
    }

    @Override // tb.nzi
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : oda.a();
    }

    @Override // tb.nzi
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.tao.adapter.biz.friends.a.a().b();
        }
    }

    @Override // tb.nzi
    public boolean a(String str, TBShareContent tBShareContent, Object obj, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a8fe27d", new Object[]{this, str, tBShareContent, obj, list, list2})).booleanValue();
        }
        try {
            return com.taobao.tao.adapter.biz.friends.a.a().a(str, tBShareContent, (List) obj, list, list2);
        } catch (Exception e) {
            e.printStackTrace();
            String str2 = this.f19799a;
            nyy.c(str2, "sendShareToMsgClient err:" + e.getMessage());
            return false;
        }
    }

    @Override // tb.nzi
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            com.taobao.tao.adapter.biz.friends.a.a().a(activity);
        }
    }

    @Override // tb.nzi
    public void a(@ShareBizAdapter.FriendsType final int i, final nzi.a aVar) {
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f690f271", new Object[]{this, new Integer(i), aVar});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        TBShareContent j = e.b().j();
        String str = j != null ? j.businessId : "";
        if (obh.m()) {
            a2 = new ArrayList<>(obh.n());
        } else {
            a2 = nyl.a(str);
        }
        if (a2 == null || a2.size() <= 0) {
            a2 = new ArrayList<>();
            a2.add("0");
            a2.add(AgooConstants.ACK_PACK_NOBIND);
            a2.add("10001");
            a2.add("10002");
            a2.add("10003");
            a2.add("10004");
            a2.add(fjp.ERROR_CODE_FIRST_302);
        }
        ContactsService contactsService = (ContactsService) GlobalContainer.getInstance().get(ContactsService.class);
        if (contactsService == null) {
            if (i == 0) {
                aVar.onFriendsProvider(null, null, 0, 0);
            } else {
                a(arrayList, aVar, currentTimeMillis);
            }
            TLog.logd(this.f19799a, "getContactsService null");
            return;
        }
        contactsService.getRecentContacts(a2, new IObserver<List<Contacts>>() { // from class: com.taobao.tao.adapter.biz.friends.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.message.kit.core.IObserver
            public /* synthetic */ void onNext(List<Contacts> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, list});
                } else {
                    a(list);
                }
            }

            public void a(List<Contacts> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (list == null) {
                } else {
                    arrayList.addAll(list);
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                } else if (i == 0) {
                    aVar.onFriendsProvider(null, null, 0, 0);
                } else {
                    c.a(c.this, arrayList, aVar, currentTimeMillis);
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else if (i == 0) {
                    aVar.onFriendsProvider(c.a(c.this, arrayList), null, 0, 0);
                } else {
                    com.taobao.tao.adapter.biz.friends.a.a().a(arrayList);
                    c.a(c.this, arrayList, aVar, currentTimeMillis);
                }
            }
        });
    }

    private void a(List<Contacts> list, final nzi.a aVar, final long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe3d9f5", new Object[]{this, list, aVar, new Long(j)});
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && ActivityCompat.checkSelfPermission(com.taobao.tao.config.a.a().getApplicationContext(), "android.permission.READ_CONTACTS") != 0) {
            z = false;
        }
        String b = b(list);
        HashMap hashMap = new HashMap();
        TBShareContent j2 = e.b().j();
        if (j2 != null) {
            hashMap.put("bizid", j2.businessId);
            hashMap.put("url", j2.url);
        }
        hashMap.put("contactMsgs", b);
        hashMap.put("allowContactAccess", Boolean.valueOf(z));
        ComTaobaoGetContactsMessagesRequest comTaobaoGetContactsMessagesRequest = new ComTaobaoGetContactsMessagesRequest();
        comTaobaoGetContactsMessagesRequest.params = hashMap;
        final String str = hashMap.get("bizid") + "," + hashMap.get("url") + "," + ShareBizAdapter.getInstance().getLogin().a();
        ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) comTaobaoGetContactsMessagesRequest, ShareBizAdapter.getInstance().getAppEnv().a()).mo1335useWua().mo1305reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.adapter.biz.friends.TBFriendsProvider$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18156), str);
                aVar.onFriendsProvider(null, null, 0, 0);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                List<com.taobao.tao.friends.model.a> list2;
                BubbleTipsBean bubbleTipsBean;
                TBShareContent j3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    ComTaobaoGetContactsMessageResponseData comTaobaoGetContactsMessageResponseData = (ComTaobaoGetContactsMessageResponseData) baseOutDo.mo2429getData();
                    if (comTaobaoGetContactsMessageResponseData != null) {
                        ComTaobaoGetContactsMessageResponseData.DataBean data = comTaobaoGetContactsMessageResponseData.getData();
                        bubbleTipsBean = data.getTips();
                        String recPicUrl = data.getRecPicUrl();
                        if (!StringUtils.isEmpty(data.abtestParam)) {
                            UTABTest.activateServer(data.abtestParam);
                        }
                        List<ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean> contacts = data.getContacts();
                        if (contacts != null) {
                            list2 = c.this.a(c.this.a(contacts), (contacts.get(0) == null || contacts.get(0).getExtra() == null) ? null : contacts.get(0).getExtra().getGuideSaoHuoData(), recPicUrl, data.pvid, data.scm, comTaobaoGetContactsMessageResponseData.shareTraceId);
                        } else {
                            list2 = null;
                        }
                    } else {
                        list2 = null;
                        bubbleTipsBean = null;
                    }
                    if (e.b().j() != null) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        TBS.Ext.commitEvent("UT", 19999, "Page_Share-ContactsShow", null, null, j3.businessId + "," + j3.templateId + "," + (ShareBizAdapter.getInstance().getLogin().a() != null) + "," + currentTimeMillis);
                    }
                    AppMonitor.Alarm.commitSuccess("share", "taofriendlist", str);
                    aVar.onFriendsProvider(list2, bubbleTipsBean, c.a(c.this), c.b(c.this));
                } catch (Exception e) {
                    e.printStackTrace();
                    AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_ERR", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18164), str);
                    aVar.onFriendsProvider(null, null, 0, 0);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18156), str);
                aVar.onFriendsProvider(null, null, 0, 0);
            }
        }).startRequest(ComTaobaoGetContactsMessageResponse.class);
    }

    private String b(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list);
            int size = arrayList2.size();
            int d = nyl.d();
            if (size > d) {
                size = d;
            }
            for (int i = 0; i < size; i++) {
                Contacts contacts = (Contacts) arrayList2.get(i);
                RecentContactsModel recentContactsModel = new RecentContactsModel();
                recentContactsModel.setLastContactTime(contacts.getLastContactTime());
                String str = "";
                recentContactsModel.setUserId(contacts.getUserId() == null ? str : contacts.getUserId());
                recentContactsModel.setGroupId(contacts.getGroupId() == null ? str : contacts.getGroupId());
                recentContactsModel.setBizType(contacts.getBizType());
                String entityType = contacts.getEntityType();
                if (StringUtils.equals("U", entityType)) {
                    recentContactsModel.setContactType("1");
                    if (contacts.getUserId() != null) {
                        str = contacts.getUserId();
                    }
                    recentContactsModel.setCcode(str);
                } else if (StringUtils.equals("G", entityType)) {
                    if (contacts.getGroupId() != null) {
                        str = contacts.getGroupId();
                    }
                    recentContactsModel.setCcode(str);
                    recentContactsModel.setContactType("2");
                }
                arrayList.add(recentContactsModel);
            }
        }
        return JSONArray.toJSONString(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.contacts.data.member.RecentMember> a(java.util.List<com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean> r10) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.adapter.biz.friends.c.a(java.util.List):java.util.List");
    }

    public List<com.taobao.tao.friends.model.a> a(List<RecentMember> list, ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean.ExtraBean.GuideSaoHuoDataBean guideSaoHuoDataBean, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1862acf1", new Object[]{this, list, guideSaoHuoDataBean, str, str2, str3, str4});
        }
        ArrayList arrayList = new ArrayList();
        this.c = 0;
        if (guideSaoHuoDataBean != null && StringUtils.equals("true", guideSaoHuoDataBean.getIsShow())) {
            com.taobao.tao.friends.model.b bVar = new com.taobao.tao.friends.model.b(guideSaoHuoDataBean.getText(), "https://gw.alicdn.com/tfs/TB1DchCr3mTBuNjy1XbXXaMrVXa-160-160.png", 0, AgooConstants.ACK_PACK_NOBIND);
            com.taobao.tao.friends.model.a aVar = new com.taobao.tao.friends.model.a();
            aVar.f(str);
            bVar.c = ContactType.LINK;
            aVar.e(guideSaoHuoDataBean.getLink());
            aVar.a(ComponentType.CONTACT_ITEM);
            aVar.a(ShareTargetType.Share2Other.getValue());
            aVar.a(bVar);
            aVar.a(SourceType.NONE);
            aVar.c(str2);
            aVar.d(str3);
            aVar.b(str4);
            TLog.logi(this.f19799a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18153) + bVar);
            arrayList.add(aVar);
        }
        int e = nyl.e();
        int i2 = 0;
        while (i2 < e && i2 < list.size()) {
            com.taobao.tao.friends.model.a aVar2 = new com.taobao.tao.friends.model.a();
            aVar2.f(str);
            RecentMember recentMember = list.get(i2);
            aVar2.a(recentMember.isTaoFriend() ? SourceType.RECENT : SourceType.RECOMMEND);
            aVar2.a(ComponentType.CONTACT_ITEM);
            aVar2.a(ShareTargetType.Share2Contact.getValue());
            if (recentMember.isTaoFriend()) {
                this.c += i;
            }
            if (StringUtils.isEmpty(recentMember.getHeadUrl())) {
                recentMember.setHeadUrl("http://gtms03.alicdn.com/tps/i3/TB1ET85IVXXXXaXapXXEBEd5pXX-225-225.png");
            }
            com.taobao.tao.friends.model.b bVar2 = new com.taobao.tao.friends.model.b(recentMember.getName(), recentMember.getHeadUrl(), recentMember.getShareChannel(), recentMember.getBizSubType());
            bVar2.c = ContactType.CONTINGENT;
            aVar2.a(bVar2);
            aVar2.a(recentMember);
            aVar2.c(str2);
            aVar2.d(str3);
            aVar2.b(str4);
            arrayList.add(aVar2);
            i2++;
            i = 1;
        }
        if (!obh.m() && arrayList.size() > 0) {
            com.taobao.tao.friends.model.a aVar3 = new com.taobao.tao.friends.model.a();
            com.taobao.tao.friends.model.b bVar3 = new com.taobao.tao.friends.model.b(com.alibaba.ability.localization.b.a(R.string.share_app_more_options), "", 0);
            bVar3.c = ContactType.MORE_CONTACT;
            bVar3.b = com.taobao.tao.config.a.a().getString(R.string.share_more_icon);
            aVar3.a(ComponentType.CONTACT_ITEM);
            aVar3.a(ShareTargetType.Share2Contact.getValue());
            aVar3.a(bVar3);
            aVar3.a(SourceType.NONE);
            aVar3.c(str2);
            aVar3.d(str3);
            aVar3.b(str4);
            arrayList.add(aVar3);
        }
        return arrayList;
    }
}
