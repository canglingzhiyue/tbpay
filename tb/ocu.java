package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.b;
import com.taobao.share.globalmodel.c;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.b;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.nzh;

/* loaded from: classes8.dex */
public class ocu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBPublicMenuItem f31923a;
    private WeakReference<TBPublicMenu> b;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ocu f31932a;

        static {
            kge.a(348559101);
            f31932a = new ocu();
        }

        public static /* synthetic */ ocu a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ocu) ipChange.ipc$dispatch("f089c1d", new Object[0]) : f31932a;
        }
    }

    static {
        kge.a(336675649);
    }

    public static /* synthetic */ TBPublicMenuItem a(ocu ocuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenuItem) ipChange.ipc$dispatch("a964bb2d", new Object[]{ocuVar}) : ocuVar.f31923a;
    }

    public static /* synthetic */ void a(ocu ocuVar, Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715595cc", new Object[]{ocuVar, activity, tBPublicMenu, obj});
        } else {
            ocuVar.b(activity, tBPublicMenu, obj);
        }
    }

    public static /* synthetic */ void a(ocu ocuVar, TBPublicMenu tBPublicMenu, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d33e528", new Object[]{ocuVar, tBPublicMenu, arrayList});
        } else {
            ocuVar.a(tBPublicMenu, arrayList);
        }
    }

    public static /* synthetic */ void a(ocu ocuVar, TBPublicMenuItem tBPublicMenuItem, b bVar, ShareContent shareContent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f940a3", new Object[]{ocuVar, tBPublicMenuItem, bVar, shareContent, new Integer(i)});
        } else {
            ocuVar.a(tBPublicMenuItem, bVar, shareContent, i);
        }
    }

    public static /* synthetic */ void b(ocu ocuVar, Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4115c96b", new Object[]{ocuVar, activity, tBPublicMenu, obj});
        } else {
            ocuVar.a(activity, tBPublicMenu, obj);
        }
    }

    private ocu() {
    }

    public static ocu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ocu) ipChange.ipc$dispatch("f089c1d", new Object[0]) : a.a();
    }

    private ShareContent a(Activity activity, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("8826fd9c", new Object[]{this, activity, shareContent});
        }
        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
            if (shareContent == null) {
                shareContent = new ShareContent();
                shareContent.businessId = "common";
                shareContent.title = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareTitle", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18157));
                shareContent.description = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareDesc", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18161));
                shareContent.url = activity.getIntent().getData().toString();
            }
            e.b().a(new WeakReference<>(activity), nyn.a(JSON.toJSONString((Object) ShareBusiness.parseShareContent(shareContent), true)));
        }
        return shareContent;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            TBPublicMenu.registerInitShareCallBack(new TBPublicMenu.InitShareCallBack() { // from class: tb.ocu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.InitShareCallBack
                public void callBack(Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d45d1617", new Object[]{this, activity, tBPublicMenu, obj});
                    } else if (!com.alibaba.ability.localization.b.b()) {
                        ocu.a(ocu.this, activity, tBPublicMenu, obj);
                    } else {
                        ocu.b(ocu.this, activity, tBPublicMenu, obj);
                    }
                }
            });
        }
    }

    private void b(final Activity activity, final TBPublicMenu tBPublicMenu, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9882623a", new Object[]{this, activity, tBPublicMenu, obj});
        } else if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null || tBPublicMenu == null || !(obj instanceof ShareContent)) {
        } else {
            ShareContent shareContent = (ShareContent) obj;
            if (!shareContent.businessId.startsWith("ShareGlobalNavigation_")) {
                shareContent.businessId = "ShareGlobalNavigation_" + shareContent.businessId;
            }
            if (com.alibaba.ability.localization.b.c() && !com.alibaba.ability.localization.b.b() && shareContent.businessId != null) {
                if (!shareContent.businessId.contains("_" + com.alibaba.ability.localization.b.d())) {
                    shareContent.businessId += "_" + com.alibaba.ability.localization.b.d();
                }
            }
            final ShareContent a2 = a(activity, shareContent);
            TBShareContent j = e.b().j();
            oif oifVar = new oif();
            final c cVar = new c();
            cVar.a(oifVar);
            cVar.a(j);
            final ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            final JSONObject parseObject = JSONObject.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareToolsIconConfig", "{\"copy\":\"https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png\",\"huabao\":\"https://gw.alicdn.com/imgextra/i3/O1CN01fWtPl81wlQtZJjltX_!!6000000006348-2-tps-192-192.png\"}"));
            com.taobao.tao.channel.b.a().a(j, new b.a() { // from class: tb.ocu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.channel.b.a
                public void onConfigData(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, String str, int i, boolean z, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6348df6e", new Object[]{this, tBShareContent, aVar, str, new Integer(i), new Boolean(z), str2, str3, str4});
                        return;
                    }
                    List<com.taobao.share.globalmodel.b> a3 = com.taobao.tao.channel.b.a().a((List<com.taobao.share.globalmodel.a>) aVar.a(), cVar, false);
                    tBPublicMenu.cleanShareMenus();
                    for (com.taobao.share.globalmodel.b bVar : a3) {
                        if (bVar instanceof com.taobao.share.ui.engine.structure.a) {
                            com.taobao.share.ui.engine.structure.a aVar2 = (com.taobao.share.ui.engine.structure.a) bVar;
                            JSONObject jSONObject = parseObject;
                            String string = jSONObject != null ? jSONObject.getString(aVar2.d().c()) : null;
                            if (TextUtils.isEmpty(string)) {
                                string = aVar2.d().b();
                            }
                            TBPublicMenuItem.Builder icon = new TBPublicMenuItem.Builder().setTitle(aVar2.d().d()).setIcon(string);
                            String k = aVar2.d().k();
                            if (!TextUtils.isEmpty(k)) {
                                icon.setImageTipUri(k);
                                icon.setMessageMode(TBPublicMenuItem.MessageMode.IMG_TIPS);
                            }
                            arrayList.add(icon.build());
                            hashMap.put(aVar2.d().d(), aVar2);
                        }
                    }
                    ocu.a(ocu.this, tBPublicMenu, arrayList);
                }
            }, false);
            TBS.Ext.commitEvent("Page_Access", 2201, "Page_Access_more", a2.businessId, (Object) null);
            WeakReference<TBPublicMenu> weakReference = this.b;
            if (weakReference != null && weakReference.get() == tBPublicMenu) {
                if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixMenuNotRefreshIssue", "true"))) {
                    return;
                }
                tBPublicMenu.clearShareMenuListeners();
            }
            this.b = new WeakReference<>(tBPublicMenu);
            tBPublicMenu.setOnShareMenuItemExposedListener(new TBPublicMenu.OnShareMenuItemExposedListener() { // from class: tb.ocu.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.OnShareMenuItemExposedListener
                public void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a494933b", new Object[]{this, tBPublicMenuItem, str});
                    } else {
                        ocu.a(ocu.this, tBPublicMenuItem, (com.taobao.share.globalmodel.b) hashMap.get(tBPublicMenuItem.getTitle()), a2, 2);
                    }
                }
            });
            tBPublicMenu.addOnShareMenuClickListener(new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: tb.ocu.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        return;
                    }
                    com.taobao.share.globalmodel.b bVar = (com.taobao.share.globalmodel.b) hashMap.get(tBPublicMenuItem.getTitle());
                    ocu.a(ocu.this, tBPublicMenuItem, bVar, a2, 1);
                    if (tBPublicMenuItem == ocu.a(ocu.this)) {
                        if (a2.templateParams != null) {
                            a2.templateParams.remove("singleTarget");
                        }
                        ShareBusiness.share(activity, a2);
                        TBS.Ext.commitEvent("Page_Access", 2101, "Page_Access_more", a2.businessId, (Object) null);
                    } else if (bVar == null) {
                    } else {
                        if (a2.templateParams == null) {
                            a2.templateParams = new HashMap();
                        }
                        a2.templateParams.put("singleTarget", bVar.b());
                        ShareBusiness.share(activity, a2);
                    }
                }
            });
        }
    }

    private void a(final Activity activity, final TBPublicMenu tBPublicMenu, Object obj) {
        final HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e11f9b", new Object[]{this, activity, tBPublicMenu, obj});
        } else if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null || tBPublicMenu == null || !(obj instanceof ShareContent)) {
            if (tBPublicMenu == null || obj != null) {
                return;
            }
            tBPublicMenu.cleanShareMenus();
        } else {
            ShareContent shareContent = (ShareContent) obj;
            if (!shareContent.businessId.startsWith("ShareGlobalNavigation_")) {
                shareContent.businessId = "ShareGlobalNavigation_" + shareContent.businessId;
            }
            final ShareContent a2 = a(activity, shareContent);
            TBShareContent j = e.b().j();
            final ArrayList arrayList = new ArrayList();
            List parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareItemList", ""), String.class);
            if (parseArray != null && !parseArray.isEmpty()) {
                arrayList.addAll(parseArray);
            } else {
                arrayList.add(ShareTargetType.Share2Copy.getValue());
                arrayList.add(ShareTargetType.Share2HUABAO.getValue());
                arrayList.add(ShareTargetType.Share2Weixin.getValue());
                arrayList.add(ShareTargetType.Share2QQ.getValue());
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareTYQ", "true"))) {
                    arrayList.add(ShareTargetType.Share2TYQ.getValue());
                }
            }
            oif oifVar = new oif();
            final c cVar = new c();
            cVar.a(oifVar);
            cVar.a(j);
            final ArrayList arrayList2 = new ArrayList();
            final HashMap hashMap2 = new HashMap();
            final JSONObject parseObject = JSONObject.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareToolsIconConfig", "{\"copy\":\"https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png\",\"huabao\":\"https://gw.alicdn.com/imgextra/i3/O1CN01fWtPl81wlQtZJjltX_!!6000000006348-2-tps-192-192.png\"}"));
            com.taobao.tao.channel.b.a().a(j, new b.a() { // from class: tb.ocu.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.channel.b.a
                public void onConfigData(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, String str, int i, boolean z, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6348df6e", new Object[]{this, tBShareContent, aVar, str, new Integer(i), new Boolean(z), str2, str3, str4});
                        return;
                    }
                    List<com.taobao.share.globalmodel.b> a3 = com.taobao.tao.channel.b.a().a((List<com.taobao.share.globalmodel.a>) aVar.a(), cVar, false);
                    tBPublicMenu.cleanShareMenus();
                    for (com.taobao.share.globalmodel.b bVar : a3) {
                        if (bVar instanceof com.taobao.share.ui.engine.structure.a) {
                            com.taobao.share.ui.engine.structure.a aVar2 = (com.taobao.share.ui.engine.structure.a) bVar;
                            if (arrayList.contains(aVar2.d().c())) {
                                JSONObject jSONObject = parseObject;
                                String string = jSONObject != null ? jSONObject.getString(aVar2.d().c()) : null;
                                if (TextUtils.isEmpty(string)) {
                                    string = aVar2.d().b();
                                }
                                TBPublicMenuItem.Builder icon = new TBPublicMenuItem.Builder().setTitle(aVar2.d().d()).setIcon(string);
                                String k = aVar2.d().k();
                                if (!TextUtils.isEmpty(k)) {
                                    icon.setImageTipUri(k);
                                    icon.setMessageMode(TBPublicMenuItem.MessageMode.IMG_TIPS);
                                }
                                arrayList2.add(icon.build());
                                hashMap2.put(aVar2.d().d(), aVar2);
                            }
                        }
                    }
                    ocu.a(ocu.this, tBPublicMenu, arrayList2);
                }
            }, false);
            final nzh contactsInfoProvider = ShareBizAdapter.getInstance().getContactsInfoProvider();
            if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareShowFriends", "true"))) {
                if (contactsInfoProvider != null) {
                    contactsInfoProvider.a();
                }
                hashMap = hashMap2;
                oie.a(null, new nzh.a() { // from class: tb.ocu.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nzh.a
                    public void a(String str) {
                        List parseArray2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        JSONObject parseObject2 = JSONObject.parseObject(str);
                        if (parseObject2 == null || parseObject2.getJSONObject("data") == null || parseObject2.getJSONObject("data").getJSONArray("contacts") == null || parseObject2.getJSONObject("data").getJSONArray("contacts").isEmpty() || (parseArray2 = JSON.parseArray(parseObject2.getJSONObject("data").getString("contacts"), ContactInfo.class)) == null || parseArray2.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < parseArray2.size(); i++) {
                            ContactInfo contactInfo = (ContactInfo) parseArray2.get(i);
                            contactInfo.setPosition(String.valueOf(i));
                            com.taobao.tao.friends.model.a aVar = new com.taobao.tao.friends.model.a();
                            aVar.c = contactInfo;
                            arrayList3.add(aVar);
                            String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareUserDefaultIcon", "https://gw.alicdn.com/imgextra/i1/O1CN014yqM2I26fc1KAMdZc_!!6000000007689-2-tps-144-144.png");
                            if (!TextUtils.isEmpty(contactInfo.getHeadUrl())) {
                                config = contactInfo.getHeadUrl();
                            }
                            arrayList2.add(new TBPublicMenuItem.Builder().setTitle(contactInfo.getDisplayName()).setIcon(config).build());
                            hashMap.put(contactInfo.getDisplayName(), aVar);
                        }
                        if (arrayList3.size() == 0) {
                            return;
                        }
                        ocu.a(ocu.this, tBPublicMenu, arrayList2);
                    }
                });
            } else {
                hashMap = hashMap2;
            }
            TBS.Ext.commitEvent("Page_Access", 2201, "Page_Access_more", a2.businessId, (Object) null);
            WeakReference<TBPublicMenu> weakReference = this.b;
            if (weakReference != null && weakReference.get() == tBPublicMenu) {
                if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixMenuNotRefreshIssue", "true"))) {
                    return;
                }
                tBPublicMenu.clearShareMenuListeners();
            }
            this.b = new WeakReference<>(tBPublicMenu);
            tBPublicMenu.setOnShareMenuItemExposedListener(new TBPublicMenu.OnShareMenuItemExposedListener() { // from class: tb.ocu.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.OnShareMenuItemExposedListener
                public void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a494933b", new Object[]{this, tBPublicMenuItem, str});
                    } else {
                        ocu.a(ocu.this, tBPublicMenuItem, (com.taobao.share.globalmodel.b) hashMap.get(tBPublicMenuItem.getTitle()), a2, 2);
                    }
                }
            });
            tBPublicMenu.addOnShareMenuClickListener(new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: tb.ocu.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        return;
                    }
                    com.taobao.share.globalmodel.b bVar = (com.taobao.share.globalmodel.b) hashMap.get(tBPublicMenuItem.getTitle());
                    ocu.a(ocu.this, tBPublicMenuItem, bVar, a2, 1);
                    nzh nzhVar = contactsInfoProvider;
                    if (nzhVar != null) {
                        nzhVar.a();
                    }
                    if (tBPublicMenuItem == ocu.a(ocu.this)) {
                        if (a2.templateParams != null) {
                            a2.templateParams.remove("singleTarget");
                        }
                        ShareBusiness.share(activity, a2);
                        TBS.Ext.commitEvent("Page_Access", 2101, "Page_Access_more", a2.businessId, (Object) null);
                    } else if (bVar instanceof com.taobao.tao.friends.model.a) {
                        com.taobao.share.ui.engine.friend.b a3 = com.taobao.share.ui.engine.friend.b.a();
                        nyh.a("2");
                        try {
                            a3.a(((com.taobao.tao.friends.model.a) bVar).c);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else if (bVar == null) {
                    } else {
                        if (a2.templateParams == null) {
                            a2.templateParams = new HashMap();
                        }
                        a2.templateParams.put("singleTarget", bVar.b());
                        ShareBusiness.share(activity, a2);
                    }
                }
            });
        }
    }

    private void a(TBPublicMenu tBPublicMenu, ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389b87b9", new Object[]{this, tBPublicMenu, arrayList});
            return;
        }
        tBPublicMenu.cleanShareMenus();
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(c());
        tBPublicMenu.addShareMenus(arrayList2);
        tBPublicMenu.notifyMenuChanged();
    }

    private TBPublicMenuItem c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("8552c400", new Object[]{this});
        }
        if (this.f31923a == null) {
            this.f31923a = new TBPublicMenuItem();
            this.f31923a.setTitle(com.alibaba.ability.localization.b.a(R.string.share_app_more_options));
            this.f31923a.setIconUrl("https://gw.alicdn.com/imgextra/i1/O1CN01D9KDkl21GM66mou9D_!!6000000006957-2-tps-192-192.png");
        }
        return this.f31923a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.uikit.actionbar.TBPublicMenuItem r18, com.taobao.share.globalmodel.b r19, com.ut.share.business.ShareContent r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            com.android.alibaba.ip.runtime.IpChange r5 = tb.ocu.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L2d
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r7] = r0
            r6[r9] = r1
            r6[r8] = r2
            r1 = 3
            r6[r1] = r3
            r1 = 4
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            r6[r1] = r2
            java.lang.String r1 = "32726cb4"
            r5.ipc$dispatch(r1, r6)
            return
        L2d:
            if (r1 != 0) goto L30
            return
        L30:
            com.taobao.uikit.actionbar.TBPublicMenuItem r5 = r0.f31923a
            r6 = 0
            if (r1 != r5) goto L39
            java.lang.String r1 = "more"
        L37:
            r2 = r6
            goto L5e
        L39:
            boolean r1 = r2 instanceof com.taobao.tao.friends.model.a
            if (r1 == 0) goto L55
            r1 = r2
            com.taobao.tao.friends.model.a r1 = (com.taobao.tao.friends.model.a) r1
            com.taobao.share.ui.engine.friend.ContactInfo r2 = r1.c
            if (r2 != 0) goto L46
            r1 = r6
            goto L4c
        L46:
            com.taobao.share.ui.engine.friend.ContactInfo r1 = r1.c
            java.lang.String r1 = r1.getBizSubType()
        L4c:
            java.lang.String r2 = "taoFriend"
            r16 = r2
            r2 = r1
            r1 = r16
            goto L5e
        L55:
            if (r2 != 0) goto L59
            r1 = r6
            goto L37
        L59:
            java.lang.String r1 = r19.b()
            goto L37
        L5e:
            if (r3 != 0) goto L61
            goto L63
        L61:
            java.lang.String r6 = r3.businessId
        L63:
            r13 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "type="
            r3.append(r5)
            java.lang.String r5 = ""
            if (r1 != 0) goto L74
            r1 = r5
        L74:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "bizSubType="
            r3.append(r6)
            if (r2 != 0) goto L88
            r2 = r5
        L88:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            if (r4 == r9) goto La5
            if (r4 == r8) goto L94
            goto La4
        L94:
            r11 = 2201(0x899, float:3.084E-42)
            r14 = 0
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r7] = r1
            r15[r9] = r2
            java.lang.String r10 = "GlobalNavigation"
            java.lang.String r12 = "GlobalNavigation_Button-ExposureItem"
            com.taobao.statistic.TBS.Ext.commitEvent(r10, r11, r12, r13, r14, r15)
        La4:
            return
        La5:
            r11 = 2101(0x835, float:2.944E-42)
            r14 = 0
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r7] = r1
            r15[r9] = r2
            java.lang.String r10 = "GlobalNavigation"
            java.lang.String r12 = "GlobalNavigation_Button-ClickItem"
            com.taobao.statistic.TBS.Ext.commitEvent(r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ocu.a(com.taobao.uikit.actionbar.TBPublicMenuItem, com.taobao.share.globalmodel.b, com.ut.share.business.ShareContent, int):void");
    }
}
