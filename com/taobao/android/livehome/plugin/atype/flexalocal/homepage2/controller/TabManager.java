package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2PrefetchCacheModule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.business.TabMenuRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.j;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.m;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.p;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.themis.kernel.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mfg;
import tb.mfj;
import tb.mfn;
import tb.pqj;
import tb.sqt;

/* loaded from: classes6.dex */
public class TabManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String d;
    private static TabManager h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14189a = true;
    private List<TabBottom> e;
    private List<TabMarketing> f;
    private boolean g;

    /* loaded from: classes6.dex */
    public static class JSONDataNew implements IMTOPDataObject {
        public JSONTabNew data;

        static {
            kge.a(-143456355);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes6.dex */
    public static class JSONTabNew implements IMTOPDataObject {
        public List<TabBottom> bottomTab;
        public boolean hideBottomNavigation;
        public List<TabMarketing> marketingTab;

        static {
            kge.a(-1486777628);
            kge.a(-350052935);
        }
    }

    /* loaded from: classes6.dex */
    public static class RightTopEntryInfo implements Serializable, IMTOPDataObject {
        public String iconUrl;
        public String isOpen;
        public String jumpUrl;

        static {
            kge.a(-1367676074);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    public static /* synthetic */ JSONDataNew a(TabManager tabManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONDataNew) ipChange.ipc$dispatch("d46e0644", new Object[]{tabManager, str}) : tabManager.a(str);
    }

    public static /* synthetic */ TabUp a(TabManager tabManager, JSONDataNew jSONDataNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabUp) ipChange.ipc$dispatch("b9cfe8d0", new Object[]{tabManager, jSONDataNew}) : tabManager.a(jSONDataNew);
    }

    public static /* synthetic */ boolean a(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8739ebb", new Object[]{tabManager, list})).booleanValue() : tabManager.b(list);
    }

    public static /* synthetic */ List b(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b8738fb1", new Object[]{tabManager, list});
        }
        tabManager.f = list;
        return list;
    }

    public static /* synthetic */ boolean c(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e34d18f9", new Object[]{tabManager, list})).booleanValue() : tabManager.c(list);
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : d;
    }

    static {
        kge.a(625931059);
        d = TabManager.class.getSimpleName();
        h = null;
    }

    /* loaded from: classes6.dex */
    public static class TabMarketing implements IMTOPDataObject {
        public String androidBackGroundPic;
        public String androidSelectedGroundPic;
        public String endTime;
        public boolean hideNaviBarBG;
        public boolean jumpOut;
        public String jumpUrl;
        public String startTime;
        public JSONObject tabUT;

        static {
            kge.a(776550402);
            kge.a(-350052935);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                TabMarketing tabMarketing = (TabMarketing) obj;
                if (mfn.a(this.androidBackGroundPic, tabMarketing.androidBackGroundPic) && mfn.a(this.jumpUrl, tabMarketing.jumpUrl) && mfn.a(this.androidSelectedGroundPic, tabMarketing.androidSelectedGroundPic) && mfn.a(Boolean.valueOf(this.hideNaviBarBG), Boolean.valueOf(tabMarketing.hideNaviBarBG)) && mfn.a(Boolean.valueOf(this.jumpOut), Boolean.valueOf(tabMarketing.jumpOut)) && mfn.a(this.startTime, tabMarketing.startTime) && mfn.a(this.endTime, tabMarketing.endTime)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static class TabBottom implements Serializable, IMTOPDataObject {
        public String androidNormalColor;
        public String androidNormalIcon;
        public String androidPressedColor;
        public String androidPressedIcon;
        public int channelId;
        public String channelType;
        public boolean containerToBottom;
        public boolean containerToTop;
        public boolean hideTextOnPressed;
        public boolean isSelected;
        public boolean jumpOut;
        public String jumpUrl;
        public String layoutBackgroundColor;
        public String name;
        public String pageName;
        public String pageType;
        public boolean rightBottomEntryShow;
        public RightTopEntryInfo rightTopEntry;
        public String spm;
        public JSONObject subscriptInfo;
        public JSONObject tabPic;
        public JSONObject tabUT;
        public List<TabUp> topTab;

        static {
            kge.a(792353231);
            kge.a(-350052935);
            kge.a(1028243835);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                TabBottom tabBottom = (TabBottom) obj;
                if (this.channelId == tabBottom.channelId && this.hideTextOnPressed == tabBottom.hideTextOnPressed && this.rightBottomEntryShow == tabBottom.rightBottomEntryShow && this.containerToTop == tabBottom.containerToTop && this.containerToBottom == tabBottom.containerToBottom && this.jumpOut == tabBottom.jumpOut && mfn.a(this.channelType, tabBottom.channelType) && mfn.a(this.name, tabBottom.name) && mfn.a(this.androidNormalIcon, tabBottom.androidNormalIcon) && mfn.a(this.androidPressedIcon, tabBottom.androidPressedIcon) && mfn.a(this.androidNormalColor, tabBottom.androidNormalColor) && mfn.a(this.androidPressedColor, tabBottom.androidPressedColor) && mfn.a(this.topTab, tabBottom.topTab) && mfn.a(this.rightTopEntry, tabBottom.rightTopEntry) && mfn.a(this.pageType, tabBottom.pageType) && mfn.a(this.spm, tabBottom.spm) && mfn.a(this.pageName, tabBottom.pageName) && mfn.a(this.layoutBackgroundColor, tabBottom.layoutBackgroundColor) && mfn.a(this.jumpUrl, tabBottom.jumpUrl) && mfn.a(this.tabPic, tabBottom.tabPic) && mfn.a(this.subscriptInfo, tabBottom.subscriptInfo)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void a(TabUp tabUp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed03147a", new Object[]{this, tabUp});
            return;
        }
        List<TabBottom> list = this.e;
        if (list == null || list.size() <= 0 || this.e.get(0) == null || this.e.get(0).topTab == null || this.e.get(0).topTab.size() <= 0) {
            return;
        }
        int size = this.e.get(0).topTab.size();
        for (int i = 0; i < size; i++) {
            if (d.TAB_FOLLOW.equals(tabUp.channelType)) {
                this.e.get(0).topTab.set(i, tabUp);
                return;
            }
        }
    }

    public TabUp g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabUp) ipChange.ipc$dispatch("7902ec40", new Object[]{this});
        }
        List<TabBottom> list = this.e;
        if (list == null || list.size() <= 0 || this.e.get(0) == null || this.e.get(0).topTab == null || this.e.get(0).topTab.size() <= 0) {
            return null;
        }
        int size = this.e.get(0).topTab.size();
        for (int i = 0; i < size; i++) {
            if (d.TAB_FOLLOW.equals(this.e.get(0).topTab.get(i).channelType)) {
                return this.e.get(0).topTab.get(i);
            }
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public static class TabUp implements Serializable, IMTOPDataObject {
        public int channelId;
        public String channelType;
        public JSONObject container;
        public boolean containerToBottom;
        public boolean containerToTop;
        public String endTime;
        public boolean jumpOut;
        public String jumpUrl;
        public String layoutBackgroundColor;
        public String name;
        public String pageName;
        public String pageType;
        public String popLayer;
        public boolean rightBottomEntryShow;
        public boolean rightTopEntryShow;
        public JSONObject sjsdParam;
        public String spm;
        public JSONObject subscript;
        public String tabBubbleText;
        public JSONObject tabMiddle;
        public JSONObject tabPic;
        public JSONObject tabUT;
        public String zcache;

        static {
            kge.a(-920240065);
            kge.a(-350052935);
            kge.a(1028243835);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabUp)) {
                return false;
            }
            TabUp tabUp = (TabUp) obj;
            return this.channelId == tabUp.channelId && this.rightTopEntryShow == tabUp.rightTopEntryShow && this.rightBottomEntryShow == tabUp.rightBottomEntryShow && this.containerToTop == tabUp.containerToTop && this.containerToBottom == tabUp.containerToBottom && this.jumpOut == tabUp.jumpOut && mfn.a(this.channelType, tabUp.channelType) && mfn.a(this.name, tabUp.name) && mfn.a(this.tabBubbleText, tabUp.tabBubbleText) && mfn.a(this.pageType, tabUp.pageType) && mfn.a(this.spm, tabUp.spm) && mfn.a(this.pageName, tabUp.pageName) && mfn.a(this.layoutBackgroundColor, tabUp.layoutBackgroundColor) && mfn.a(this.jumpUrl, tabUp.jumpUrl) && mfn.a(this.tabPic, tabUp.tabPic) && mfn.a(this.endTime, tabUp.endTime) && mfn.a(this.zcache, tabUp.zcache) && mfn.a(this.tabUT, tabUp.tabUT) && mfn.a(this.container, tabUp.container) && mfn.a(this.tabMiddle, tabUp.tabMiddle) && mfn.a(this.subscript, tabUp.subscript);
        }
    }

    public static TabManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabManager) ipChange.ipc$dispatch("82fe14c6", new Object[0]);
        }
        if (h == null) {
            h = new TabManager();
        }
        return h;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            h = null;
        }
    }

    public void a(String str, Uri uri, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e7a32f", new Object[]{this, str, uri, sqtVar});
        } else {
            b(str, uri, sqtVar);
        }
    }

    public List<TabBottom> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        if (this.g) {
            ArrayList arrayList = new ArrayList();
            List<TabBottom> list = this.e;
            if (list == null || list.size() <= 0) {
                return arrayList;
            }
            arrayList.add(this.e.get(0));
            return arrayList;
        }
        return this.e;
    }

    public void a(List<TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public List<TabMarketing> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    private void b(String str, Uri uri, final sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2450e", new Object[]{this, str, uri, sqtVar});
            return;
        }
        BaseDetailBusiness baseDetailBusiness = new BaseDetailBusiness(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String f = TabManager.f();
                StringBuilder sb = new StringBuilder();
                sb.append("tabMenu Mtop response fail,onSystemError. MTOP: ");
                sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
                mfj.c(f, sb.toString());
                k.a("requestError", "firstRequest", mtopResponse, sqtVar);
                mfg.a().a("com.taobao.taolive.tab.menu.response", null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                } else {
                    final String str2 = new String(mtopResponse.getBytedata());
                    if (!l.a((CharSequence) str2)) {
                        try {
                            final JSONDataNew a2 = TabManager.a(TabManager.this, str2);
                            if (a2 != null && a2.data != null) {
                                mfg.a().a("com.taobao.taolive.menu.request.success");
                                if (TabManager.a(TabManager.this, a2.data.marketingTab)) {
                                    TabManager.b(TabManager.this, a2.data.marketingTab);
                                    mfg.a().a("com.taobao.taolive.marking.tab.update");
                                }
                                TabUp a3 = TabManager.a(TabManager.this, a2);
                                if (a3 != null) {
                                    mfg.a().a("com.taobao.taolive.follow.number.changed", a3);
                                }
                                String f = TabManager.f();
                                mfj.b(f, "tabMenu Mtop response success,onSuccess:" + mtopResponse.getApi());
                                k.a("RequestSuccess", "firstRequest", mtopResponse, sqtVar);
                                AsyncTask.execute(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("action", (Object) UltronWeex2PrefetchCacheModule.MODULE_NAME);
                                        jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
                                        jSONObject.put(i.CDN_REQUEST_TYPE, (Object) "firstRequest");
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("apiName", (Object) mtopResponse.getApi());
                                        jSONObject2.put("apiVersion", (Object) mtopResponse.getV());
                                        if (mtopResponse.getHeaderFields() != null && mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2) != null && mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).size() > 0) {
                                            jSONObject2.put("traceID", (Object) mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
                                        }
                                        jSONObject.put("traceInfo", (Object) jSONObject2);
                                        p.a(d.CACHE_KEY_HOME_TABS_EVENT, jSONObject.toJSONString());
                                        p.a(d.CACHE_KEY_HOME_TABS, str2);
                                        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.B()) {
                                            mfg.a().a("com.taobao.taolive.update.bottom.update", str2);
                                        }
                                        if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.N() || !TabManager.c(TabManager.this, a2.data.bottomTab)) {
                                            return;
                                        }
                                        mfg.a().a("com.taobao.taolive.update.tab.subscript", str2);
                                    }
                                });
                            }
                        } catch (Exception e) {
                            mfj.a(TabManager.f(), "tabMenu Mtop response success, onSuccess exp", e);
                        }
                    }
                    mfg.a().a("com.taobao.taolive.tab.menu.response", "success");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String f = TabManager.f();
                StringBuilder sb = new StringBuilder();
                sb.append("getFromNetwork onError. MTOP: ");
                sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
                mfj.c(f, sb.toString());
                k.a("requestError", "firstRequest", mtopResponse, sqtVar);
                mfg.a().a("com.taobao.taolive.tab.menu.response", null);
                if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.B()) {
                    return;
                }
                mfg.a().a("com.taobao.taolive.update.bottom.resfailed");
            }
        });
        TabMenuRequest tabMenuRequest = new TabMenuRequest(sqtVar.D);
        tabMenuRequest.enableAddH5Tab = com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.l();
        tabMenuRequest.channelType = str;
        if (sqtVar.f()) {
            tabMenuRequest.singleStream = "false";
        } else {
            tabMenuRequest.singleStream = Boolean.toString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.k());
        }
        if (uri != null) {
            tabMenuRequest.tabSpm = uri.getQueryParameter("tabSpm");
            tabMenuRequest.liveHomePageType = uri.getQueryParameter(d.LIVE_HOME_PAGE_TYPE);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("livesourcePre", (Object) uri.getQueryParameter("livesource"));
            jSONObject.put(com.taobao.tao.homepage.launcher.b.LAUNCHER_TYPE, (Object) uri.getQueryParameter(com.taobao.tao.homepage.launcher.b.LAUNCHER_TYPE));
            jSONObject.put("entityId", (Object) uri.getQueryParameter("entityId"));
            jSONObject.put("isPad", (Object) Boolean.valueOf(sqtVar.f()));
            tabMenuRequest.extendParams = jSONObject.toJSONString();
            String a2 = j.a(d.TAO_LIVE_FOLLOW_ICON_SJSD_PARAM);
            if (!TextUtils.isEmpty(a2)) {
                JSONArray c = pqj.c(a2);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    JSONObject jSONObject2 = c.getJSONObject(i);
                    if (m.a(jSONObject2.getLongValue("cacheTime"))) {
                        jSONArray.add(jSONObject2);
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sjsdParams", (Object) jSONArray);
                tabMenuRequest.recReasonClkList = jSONObject3.toJSONString();
            }
        }
        String str2 = d;
        mfj.b(str2, "tabMenu Mtop request start, requestInfo:" + tabMenuRequest.toString());
        baseDetailBusiness.a(true);
        baseDetailBusiness.a(10, tabMenuRequest, null);
        k.a("requestStart", "firstRequest", tabMenuRequest.API_NAME, tabMenuRequest.VERSION, sqtVar);
    }

    private TabUp a(JSONDataNew jSONDataNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabUp) ipChange.ipc$dispatch("1326ecee", new Object[]{this, jSONDataNew});
        }
        if (jSONDataNew == null || jSONDataNew.data == null || jSONDataNew.data.bottomTab == null || jSONDataNew.data.bottomTab.size() <= 0 || jSONDataNew.data.bottomTab.get(0).topTab == null) {
            return null;
        }
        int size = jSONDataNew.data.bottomTab.get(0).topTab.size();
        for (int i = 0; i < size; i++) {
            TabUp tabUp = jSONDataNew.data.bottomTab.get(0).topTab.get(i);
            if (d.TAB_FOLLOW.equals(tabUp.channelType)) {
                return tabUp;
            }
        }
        return null;
    }

    private JSONDataNew a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONDataNew) ipChange.ipc$dispatch("7aa45866", new Object[]{this, str}) : (JSONDataNew) JSON.parseObject(str, JSONDataNew.class);
    }

    private boolean b(List<TabMarketing> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        if (this.f == null && list != null) {
            return true;
        }
        if (this.f != null && list != null) {
            if (list.size() != this.f.size()) {
                return true;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!mfn.a(list.get(i), this.f.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c(List<TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{this, list})).booleanValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).subscriptInfo != null) {
                return true;
            }
        }
        return false;
    }
}
