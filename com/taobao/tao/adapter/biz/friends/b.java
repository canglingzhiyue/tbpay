package com.taobao.tao.adapter.biz.friends;

import android.os.Build;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.biz.contacts.ContactsService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.core.IObserver;
import com.taobao.share.core.contacts.mtop.request.ContactsInfoRequest;
import com.taobao.share.core.contacts.mtop.response.RecentContactsModel;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.android.agoo.common.AgooConstants;
import tb.fjp;
import tb.kge;
import tb.nyl;
import tb.nys;
import tb.nyy;
import tb.nzh;
import tb.obh;
import tb.oup;

/* loaded from: classes8.dex */
public class b implements nzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f19796a;
    private AtomicBoolean b;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static b f19798a;

        static {
            kge.a(246184841);
            f19798a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("819e2bf1", new Object[0]) : f19798a;
        }
    }

    static {
        kge.a(151846582);
        kge.a(614163716);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1209bfd5", new Object[]{bVar}) : bVar.c();
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("441a00b", new Object[]{bVar, str});
        }
        bVar.f19796a = str;
        return str;
    }

    public static /* synthetic */ void a(b bVar, List list, nzh.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b099911", new Object[]{bVar, list, aVar, new Long(j)});
        } else {
            bVar.a(list, aVar, j);
        }
    }

    public static /* synthetic */ void a(b bVar, nzh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7034262", new Object[]{bVar, aVar});
        } else {
            bVar.c(aVar);
        }
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("180d8b34", new Object[]{bVar}) : bVar.f19796a;
    }

    private b() {
        this.b = new AtomicBoolean(false);
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("89036110", new Object[0]) : a.a();
    }

    @Override // tb.nzh
    public synchronized void a(nzh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9c165f", new Object[]{this, aVar});
        } else if (nyl.l() && aVar == null) {
        } else {
            if (this.b.compareAndSet(false, true)) {
                b(aVar);
            }
        }
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String a2 = nys.a("TBContactsInfo" + ShareBizAdapter.getInstance().getLogin().a());
        return a2 == null ? "" : a2;
    }

    private void b(final nzh.a aVar) {
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497780a0", new Object[]{this, aVar});
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
            TLog.logd("TBContactsInfoProvider", "getContactsService null");
            a(arrayList, aVar, currentTimeMillis);
            return;
        }
        contactsService.getRecentContacts(a2, new IObserver<List<Contacts>>() { // from class: com.taobao.tao.adapter.biz.friends.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
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
                } else {
                    b.a(b.this, arrayList, aVar, currentTimeMillis);
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    return;
                }
                com.taobao.tao.adapter.biz.friends.a.a().a(arrayList);
                b.a(b.this, arrayList, aVar, currentTimeMillis);
            }
        });
    }

    private void a(List<Contacts> list, final nzh.a aVar, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fd9eb4", new Object[]{this, list, aVar, new Long(j)});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.CC_LIST_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        if (Build.VERSION.SDK_INT >= 23 && ActivityCompat.checkSelfPermission(com.taobao.tao.config.a.a().getApplicationContext(), "android.permission.READ_CONTACTS") != 0) {
            z = false;
        }
        String a2 = a(list);
        HashMap hashMap = new HashMap();
        TBShareContent j2 = e.b().j();
        if (j2 != null) {
            hashMap.put("bizid", j2.businessId);
            hashMap.put("url", j2.url);
        }
        hashMap.put("contactMsgs", a2);
        hashMap.put("allowContactAccess", Boolean.valueOf(z));
        ContactsInfoRequest contactsInfoRequest = new ContactsInfoRequest();
        contactsInfoRequest.params = hashMap;
        final String str = hashMap.get("bizid") + "," + hashMap.get("url") + "," + ShareBizAdapter.getInstance().getLogin().a();
        ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) contactsInfoRequest, ShareBizAdapter.getInstance().getAppEnv().a()).mo1335useWua().mo1305reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18156), str);
                b bVar = b.this;
                b.a(bVar, b.a(bVar));
                b.a(b.this, aVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    b.a(b.this, mtopResponse.getDataJsonObject().toString());
                    nys.a("TBContactsInfo" + ShareBizAdapter.getInstance().getLogin().a(), b.b(b.this));
                    AppMonitor.Alarm.commitSuccess("share", "taofriendlist", str);
                    b.a(b.this, aVar);
                } catch (Exception e) {
                    e.printStackTrace();
                    AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_ERR", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18164), str);
                    b bVar = b.this;
                    b.a(bVar, b.a(bVar));
                    b.a(b.this, aVar);
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
                b bVar = b.this;
                b.a(bVar, b.a(bVar));
                b.a(b.this, aVar);
            }
        }).startRequest();
    }

    private String a(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
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

    private void c(nzh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352eae1", new Object[]{this, aVar});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.CC_LIST_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        com.taobao.share.ui.engine.jsbridge.a.a().b();
        nyy.c("TIMECOST", "cc_list_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        if (aVar != null) {
            aVar.a(this.f19796a);
        } else {
            oup.b(this.f19796a);
        }
    }

    @Override // tb.nzh
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.set(false);
        }
    }
}
