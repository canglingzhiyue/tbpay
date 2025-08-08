package com.taobao.tao.channel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.c;
import com.taobao.tao.channel.mtop.GetNewBizConfigRequest;
import com.taobao.tao.channel.mtop.GetPanelInfoResponse;
import com.taobao.tao.channel.mtop.GetPanelInfoResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nyl;
import tb.nyy;
import tb.obh;
import tb.obk;

/* loaded from: classes8.dex */
public class b implements c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_LIST_KEY = "channelList";
    public static final String TOOL_LIST_KEY = "toolList";

    /* renamed from: a  reason: collision with root package name */
    private List<com.taobao.share.globalmodel.b> f19856a;

    /* loaded from: classes8.dex */
    public interface a {
        void onConfigData(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, String str, int i, boolean z, String str2, String str3, String str4);
    }

    /* renamed from: com.taobao.tao.channel.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0827b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f19859a;

        static {
            kge.a(-386616773);
            f19859a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6b48eb87", new Object[0]) : f19859a;
        }
    }

    static {
        kge.a(1143789928);
        kge.a(40225745);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6b48eb87", new Object[0]) : C0827b.a();
    }

    public void a(TBShareContent tBShareContent, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2128cc33", new Object[]{this, tBShareContent, aVar, new Boolean(z)});
            return;
        }
        com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREPANELGETSHARECONFIGSTART);
        com.taobao.tao.channel.a aVar2 = new com.taobao.tao.channel.a();
        aVar2.a(true);
        if (tBShareContent.templateId == null || StringUtils.isEmpty(tBShareContent.templateId)) {
            tBShareContent.templateId = "common";
        }
        c.a().b();
        c.a().a(this);
        c.a().a(tBShareContent, aVar2, aVar, z);
    }

    public void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, a aVar2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e34e3b", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2)});
        } else if (tBShareContent == null) {
        } else {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.BIZ_CONFIG_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            String b = obh.b(tBShareContent.businessId);
            if (!StringUtils.isEmpty(b)) {
                c.a().a(tBShareContent, aVar, aVar2, z, z2, true, b);
                return;
            }
            boolean a2 = a(tBShareContent.businessId);
            if (nyl.h() && (obh.d() || a2)) {
                if (!SpUtils.getCacheVerison().equals(obh.e())) {
                    Coordinator.execute(new Runnable() { // from class: com.taobao.tao.channel.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                SpUtils.clearMtopCacheData();
                            }
                        }
                    });
                    b(tBShareContent, aVar, aVar2, z, z2);
                    return;
                }
                String cacheDataValidTime = SpUtils.getCacheDataValidTime(tBShareContent.businessId);
                if (!StringUtils.isEmpty(cacheDataValidTime)) {
                    try {
                        if (System.currentTimeMillis() - Long.parseLong(cacheDataValidTime) <= obh.f()) {
                            c(tBShareContent, aVar, aVar2, z, z2);
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            b(tBShareContent, aVar, aVar2, z, z2);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String g = obh.g();
        if (g.contains(",")) {
            for (String str2 : g.split(",")) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        return g.equals(str);
    }

    public void b(final TBShareContent tBShareContent, final com.taobao.tao.channel.a aVar, final a aVar2, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3500b5a", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2)});
            return;
        }
        GetNewBizConfigRequest getNewBizConfigRequest = new GetNewBizConfigRequest();
        if (tBShareContent != null) {
            getNewBizConfigRequest.setBizCode(tBShareContent.businessId);
            getNewBizConfigRequest.setTargetUrl(tBShareContent.url);
        }
        RemoteBusiness.build((IMTOPDataObject) getNewBizConfigRequest, ShareBizAdapter.getInstance().getAppEnv().a()).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.channel.ChannelProvider$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    c.a().a(tBShareContent, aVar, aVar2, z, z2, false, null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    c.a().a(tBShareContent, aVar, aVar2, z, z2, false, mtopResponse.getDataJsonObject() != null ? mtopResponse.getDataJsonObject().toString() : "");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    c.a().a(tBShareContent, aVar, aVar2, z, z2, false, null);
                }
            }
        }).startRequest(GetPanelInfoResponse.class);
    }

    private void c(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, a aVar2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bcc879", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2)});
            return;
        }
        String cacheShareData = SpUtils.getCacheShareData(tBShareContent.businessId);
        if (!StringUtils.isEmpty(cacheShareData)) {
            c.a().a(tBShareContent, aVar, aVar2, z, z2, true, cacheShareData);
        } else {
            b(tBShareContent, aVar, aVar2, z, z2);
        }
    }

    @Override // com.taobao.tao.channel.c.a
    public void a(final TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, a aVar2, boolean z, boolean z2, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f57f45", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2), str});
            return;
        }
        GetPanelInfoResponseData getPanelInfoResponseData = (GetPanelInfoResponseData) JSON.parseObject(str, GetPanelInfoResponseData.class);
        if (tBShareContent == null || getPanelInfoResponseData == null) {
            return;
        }
        aVar.a(tBShareContent);
        e.b().b(e.GETBIZCONFIG, getPanelInfoResponseData.shareDataTrack);
        tBShareContent.templateId = getPanelInfoResponseData.getTemplateId();
        tBShareContent.openMultiTargetUrl = getPanelInfoResponseData.getOpenMultiTargetUrl();
        aVar.a(tBShareContent.markMap, getPanelInfoResponseData.getChannelList(), getPanelInfoResponseData.getToolList(), z);
        aVar2.onConfigData(tBShareContent, aVar, str, getPanelInfoResponseData.getPanelType(), getPanelInfoResponseData.getShowFriend(), getPanelInfoResponseData.getShowFriendType(), getPanelInfoResponseData.getShowChannelType(), getPanelInfoResponseData.getActivityUrl());
        if (z2) {
            AppMonitor.Alarm.commitSuccess("share", "getbizconfigbycache", tBShareContent.businessId);
            return;
        }
        AppMonitor.Alarm.commitSuccess("share", "getbizconfig", tBShareContent.businessId);
        Coordinator.execute(new Runnable() { // from class: com.taobao.tao.channel.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SpUtils.saveCacheData(tBShareContent.businessId, str, String.valueOf(System.currentTimeMillis()));
                SpUtils.saveCacheVerison(obh.e());
            }
        });
    }

    @Override // com.taobao.tao.channel.c.a
    public void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5ca67b", new Object[]{this, tBShareContent, aVar, aVar2});
        } else if (tBShareContent == null) {
        } else {
            aVar.a(tBShareContent);
            tBShareContent.templateId = "common";
            boolean b = com.alibaba.ability.localization.b.b();
            if (!com.alibaba.ability.localization.b.b()) {
                aVar.d();
            }
            aVar2.onConfigData(tBShareContent, aVar, "", 1, b, "2", "2", null);
            AppMonitor.Alarm.commitFail("share", "getbizconfig", "SHARE_GETBIZCONFIG_FAILED", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17870), tBShareContent.businessId);
            nyy.c("ChannelProvider", "GetNewBizConfigRequest onError | onSystemError");
        }
    }

    public List<com.taobao.share.globalmodel.b> a(List<com.taobao.share.globalmodel.a> list, com.taobao.share.globalmodel.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e7ff6036", new Object[]{this, list, cVar});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.share.globalmodel.a aVar : list) {
            com.taobao.share.ui.engine.structure.a aVar2 = new com.taobao.share.ui.engine.structure.a();
            aVar2.a(aVar);
            aVar2.a(cVar);
            aVar2.a(aVar.c());
            aVar2.a(ComponentType.CHANNEL_ITEM);
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    public List<com.taobao.share.globalmodel.b> a(List<com.taobao.share.globalmodel.a> list, com.taobao.share.globalmodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c14ecce4", new Object[]{this, list, cVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<com.taobao.share.globalmodel.b> b = b(list, cVar, z);
        List<com.taobao.share.globalmodel.b> c = c(list, cVar, z);
        if (c != null && c.size() > 0) {
            arrayList.addAll(c);
        }
        if (b != null && b.size() > 0) {
            arrayList.addAll(b);
        }
        return arrayList;
    }

    public List<com.taobao.share.globalmodel.b> b(List<com.taobao.share.globalmodel.a> list, com.taobao.share.globalmodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2a05c65", new Object[]{this, list, cVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        TBShareContent j = e.b().j();
        for (com.taobao.share.globalmodel.a aVar : list) {
            if (!aVar.j()) {
                com.taobao.share.ui.engine.structure.a aVar2 = new com.taobao.share.ui.engine.structure.a();
                aVar2.a(aVar);
                aVar2.a(cVar);
                aVar2.a(aVar.c());
                aVar2.a(ComponentType.CHANNEL_ITEM);
                arrayList.add(aVar2);
                if (z && j != null) {
                    String str = j.businessId;
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Channel_expose", str, null, aVar.c() + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a());
                }
            }
        }
        return arrayList;
    }

    public List<com.taobao.share.globalmodel.b> c(List<com.taobao.share.globalmodel.a> list, com.taobao.share.globalmodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a3f1ebe6", new Object[]{this, list, cVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        TBShareContent j = e.b().j();
        for (com.taobao.share.globalmodel.a aVar : list) {
            if (aVar.j()) {
                com.taobao.share.ui.engine.structure.a aVar2 = new com.taobao.share.ui.engine.structure.a();
                aVar2.a(aVar);
                aVar2.a(cVar);
                aVar2.a(aVar.c());
                aVar2.a(ComponentType.CHANNEL_ITEM);
                if (a(aVar2)) {
                    arrayList.add(aVar2);
                    if (z && j != null) {
                        String str = j.businessId;
                        TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Tool_expose", str, null, aVar.c() + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a());
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean a(com.taobao.share.ui.engine.structure.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ef7c8b", new Object[]{this, aVar})).booleanValue();
        }
        com.taobao.share.globalmodel.a d = aVar.d();
        TBShareContent j = e.b().j();
        if (StringUtils.equals("video", d.c())) {
            return false;
        }
        if (StringUtils.equals("saveVideo", d.c())) {
            if (j != null && j.extraParams != null && StringUtils.equals("true", j.extraParams.get("isMarvelScheme"))) {
                return obk.a().a((com.taobao.share.globalmodel.b) aVar);
            }
            return false;
        }
        return obk.a().a((com.taobao.share.globalmodel.b) aVar);
    }

    public Map<String, List<ChannelInfo>> b(List<com.taobao.share.globalmodel.a> list, com.taobao.share.globalmodel.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90a90627", new Object[]{this, list, cVar});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.taobao.share.globalmodel.a aVar : list) {
            if (!StringUtils.isEmpty(aVar.b())) {
                ChannelInfo channelInfo = new ChannelInfo();
                channelInfo.setType(aVar.c());
                channelInfo.setTitle(aVar.d());
                channelInfo.setIcon(aVar.b());
                channelInfo.setMark(aVar.g());
                if (!aVar.j()) {
                    arrayList.add(channelInfo);
                } else {
                    com.taobao.share.ui.engine.structure.a aVar2 = new com.taobao.share.ui.engine.structure.a();
                    aVar2.a(aVar);
                    aVar2.a(cVar);
                    aVar2.a(aVar.c());
                    aVar2.a(ComponentType.CHANNEL_ITEM);
                    if (a(aVar2)) {
                        arrayList2.add(channelInfo);
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CHANNEL_LIST_KEY, arrayList);
        hashMap.put(TOOL_LIST_KEY, arrayList2);
        return hashMap;
    }

    public void a(List<com.taobao.share.globalmodel.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f19856a = list;
        }
    }

    public List<com.taobao.share.globalmodel.b> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f19856a;
    }
}
