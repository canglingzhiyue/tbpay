package com.alibaba.triver.triver_shop;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.kit.api.utils.m;
import com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp;
import com.alibaba.triver.triver_shop.c;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.alibaba.triver.triver_shop.newShop.ext.j;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.login4android.activity.LoginProxyActivity;
import com.taobao.mtop.wvplugin.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import tb.ccu;
import tb.ceg;
import tb.cen;
import tb.hyt;
import tb.kge;
import tb.rrv;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* loaded from: classes3.dex */
    public static final class a implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f3757a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f;
        public final /* synthetic */ String g;
        public final /* synthetic */ App h;
        public final /* synthetic */ Boolean i;

        public a(Activity activity, String str, String str2, String str3, String str4, com.alibaba.triver.triver_shop.newShop.data.d dVar, String str5, App app, Boolean bool) {
            this.f3757a = activity;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = dVar;
            this.g = str5;
            this.h = app;
            this.i = bool;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            d.a bb;
            ruk<t> f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            switch (tBPublicMenuItem.getId()) {
                case 101:
                    String str = this.b;
                    q.a((Object) str);
                    String str2 = this.c;
                    q.a((Object) str2);
                    String str3 = this.d;
                    q.a((Object) str3);
                    String str4 = this.e;
                    q.a((Object) str4);
                    d.a(d.INSTANCE, this.f3757a, str, str2, str3, str4);
                    j.b(this.f);
                    return;
                case 102:
                    d.a(d.INSTANCE, this.f3757a, this.c, this.g);
                    return;
                case 103:
                    d.a(d.INSTANCE, new com.alibaba.triver.app.d(this.h));
                    return;
                case 104:
                    Boolean bool = this.i;
                    if (bool == null) {
                        return;
                    }
                    Activity activity = this.f3757a;
                    String str5 = this.c;
                    com.alibaba.triver.triver_shop.newShop.data.d dVar = this.f;
                    bool.booleanValue();
                    boolean booleanValue = bool.booleanValue();
                    q.a(dVar);
                    d.INSTANCE.a(activity, str5, booleanValue, dVar);
                    return;
                case 105:
                    com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.f;
                    if (dVar2 == null || (bb = dVar2.bb()) == null || (f = bb.f()) == null) {
                        return;
                    }
                    f.mo2427invoke();
                    return;
                default:
                    return;
            }
        }
    }

    static {
        kge.a(1409659390);
        INSTANCE = new d();
    }

    private d() {
    }

    public static final /* synthetic */ void a(d dVar, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4e6761", new Object[]{dVar, context, str, str2});
        } else {
            dVar.a(context, str, str2);
        }
    }

    public static final /* synthetic */ void a(d dVar, Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26613ff5", new Object[]{dVar, context, str, str2, str3, str4});
        } else {
            dVar.a(context, str, str2, str3, str4);
        }
    }

    public static final /* synthetic */ void a(d dVar, ccu ccuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efc8e96", new Object[]{dVar, ccuVar});
        } else {
            dVar.a(ccuVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (r8 != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.app.Activity r16, com.alibaba.triver.triver_shop.newShop.data.d r17, java.lang.String r18, java.lang.String r19, java.lang.Boolean r20, java.lang.Boolean r21, com.alibaba.ariver.app.api.App r22) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.d.a(android.app.Activity, com.alibaba.triver.triver_shop.newShop.data.d, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.alibaba.ariver.app.api.App):void");
    }

    /* loaded from: classes3.dex */
    public static final class b implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f3758a;

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        public b(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f3758a = dVar;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putString("from", "shopDetail");
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.f3758a;
            bundle2.putString("subjectId", dVar == null ? null : dVar.T());
            bundle2.putString("subjectType", "SHOP");
            bundle.putBundle(hyt.ZZB_BUNDLE_KEY, bundle2);
            return bundle;
        }
    }

    public final void a(Context context, String str, boolean z, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f50137", new Object[]{this, context, str, new Boolean(z), shopData});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        Intent intent = new Intent();
        intent.setAction("SHOP_ACTION_SHOP_REQUEST");
        Bundle bundle = new Bundle();
        bundle.putBoolean("star", !z);
        bundle.putString("sellerId", str);
        bundle.putBoolean("changeToFollow", shopData.aB());
        intent.putExtras(bundle);
        intent.setComponent(new ComponentName(context, "com.alibaba.triver.triver_shop.receiver.ShopRequestReceiver"));
        context.sendBroadcast(intent);
    }

    private final void a(ccu ccuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32dfaa3", new Object[]{this, ccuVar});
        } else if (ccuVar == null) {
        } else {
            ccuVar.a(Uri.parse(m.e()).buildUpon().appendQueryParameter("appId", ccuVar.d()).appendQueryParameter("frameTempType", "pubArea").build().toString(), (Bundle) null);
            String d = ccuVar.d();
            q.b(d, "homePageApp.getAppId()");
            new HashMap().put("miniapp_id", d);
        }
    }

    private final void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str, str2)) {
        } else {
            Uri.Builder buildUpon = Uri.parse("poplayer://SmsAuthorization").buildUpon();
            buildUpon.appendQueryParameter("seller_id", str);
            buildUpon.appendQueryParameter("shop_name", str2);
            if (context == null) {
                return;
            }
            l.a(context, buildUpon.toString());
        }
    }

    private final void a(final Context context, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{this, context, str, str2, str3, str4});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        HashMap hashMap = new HashMap();
        mtopRequest.setApiName("mtop.taobao.wireless.shop.share.get");
        mtopRequest.setVersion("1.0");
        HashMap hashMap2 = hashMap;
        hashMap2.put("sellerId", str2);
        hashMap2.put("shopId", str);
        mtopRequest.dataParams = hashMap2;
        mtopRequest.setData(JSONObject.toJSONString(hashMap));
        MtopBusiness mo1305reqMethod = MtopBusiness.build(mtopRequest, Mtop.instance(Mtop.Id.INNER, context).getMtopConfig().ttid).mo1305reqMethod(MethodEnum.GET);
        mo1305reqMethod.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$doShare$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null || !mtopResponse.isApiSuccess()) {
                } else {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        q.b(bytedata, "response.bytedata");
                        String str5 = new String(bytedata, kotlin.text.d.UTF_8);
                        ceg.Companion.c(str5);
                        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str5);
                        if (a2 == null || (jSONObject = a2.getJSONObject("data")) == null || jSONObject.getJSONObject("result") == null) {
                            return;
                        }
                        Context context2 = context;
                        d dVar = d.INSTANCE;
                        String str6 = str;
                        String str7 = str2;
                        String str8 = str3;
                        String str9 = str4;
                        e.a(context2, d.$ipChange, "");
                    } catch (Exception e) {
                        e.printStackTrace();
                        ceg.Companion.b(q.a("share mtop system error : ", (Object) e.getMessage()));
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ceg.Companion.c(q.a("share mtop system error : ", (Object) Integer.valueOf(i)));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ceg.Companion.c(q.a("share mtop error : ", (Object) Integer.valueOf(i)));
                }
            }
        });
        mo1305reqMethod.asyncRequest();
    }

    private final ShareContent a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("91b24b5e", new Object[]{this, jSONObject, str, str2, str3, str4});
        }
        String string = jSONObject.getString("shopName");
        String string2 = jSONObject.getString("shopLogo");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(new Object[]{jSONObject.get("fansCountStr"), jSONObject.get("buyerCouponBonus"), jSONObject.get("sellerGoodPercent")});
        JSONObject jSONObject2 = jSONObject.getJSONObject("rankImage");
        String string3 = jSONObject2 == null ? null : jSONObject2.getString("url");
        Object obj = jSONObject.get("hotSoldPicUrls");
        HashMap hashMap = new HashMap();
        hashMap.put("title", string);
        hashMap.put("brandIcon", string2);
        hashMap.put("tags", jSONArray);
        hashMap.put("levelIcon", string3);
        hashMap.put("images", obj);
        ShareContent shareContent = new ShareContent();
        shareContent.title = string;
        shareContent.imageUrl = string2;
        shareContent.businessId = "shop";
        shareContent.templateId = "shop";
        shareContent.templateParams = hashMap;
        shareContent.extendParams = ai.a(kotlin.j.a("sellerId", str2), kotlin.j.a("targetId", str));
        if (cen.Companion.ax()) {
            shareContent.url = "https://shop" + str + ".taobao.com?weexShopTab=" + str3 + "&weexShopSubTab=" + str4 + "&shopFrameworkType=native";
        } else {
            shareContent.url = "https://shop" + str + ".m.taobao.com?weexShopTab=" + str3 + "&weexShopSubTab=" + str4 + "&shopFrameworkType=native";
        }
        return shareContent;
    }

    public final void a(Context context, String str, String str2, String str3, String str4, String str5, boolean z, String str6, Uri uri, JSONObject jSONObject, final rul<? super JSONObject, t> rulVar) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59fcfdc", new Object[]{this, context, str, str2, str3, str4, str5, new Boolean(z), str6, uri, jSONObject, rulVar});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str, str4, str5)) {
            if (rulVar == null) {
                return;
            }
            rulVar.mo2421invoke(null);
        } else {
            JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("firstMediaId", str2), kotlin.j.a("firstMediaScene", str3), kotlin.j.a("pvUuid", str6));
            if (jSONObject != null) {
                Map<String, Object> innerMap = jSONObject.getInnerMap();
                q.b(innerMap, "it.innerMap");
                a2.putAll(ai.b(innerMap));
            }
            if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
                for (String str7 : queryParameterNames) {
                    if (!q.a((Object) str7, (Object) "loftData")) {
                        a2.put((JSONObject) str7, uri.getQueryParameter(str7));
                    }
                }
            }
            MtopRequest a3 = com.alibaba.triver.triver_shop.newShop.ext.a.a(z ? "mtop.taobao.minishop.material.feeds.list" : "mtop.taobao.ppp.shop.media.feeds.list", "1.0", ai.c(kotlin.j.a("seller_id", str), kotlin.j.a("page_no", str4), kotlin.j.a("page_size", str5), kotlin.j.a("first_media_id", str2), kotlin.j.a("first_media_scene", str3), kotlin.j.a(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, "shopSecondFloorFlow"), kotlin.j.a("sellerId", str), kotlin.j.a(rrv.PAGE_NUMBER, str4), kotlin.j.a("pageSize", str5), kotlin.j.a("bizParams", a2.toJSONString())), false, false, 24, null);
            q.a(context);
            MtopBusiness a4 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, a3, "POST");
            a4.mo1289addHttpQueryParameter("type", "originaljson");
            a4.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$contentListFeedsRequest$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$contentListFeedsRequest$3 shopMoreUtils$contentListFeedsRequest$3, String str8, Object... objArr) {
                    int hashCode = str8.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode != 2057952281) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str8));
                    } else {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject a5 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(a5);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }
            });
            a4.startRequest();
        }
    }

    public final void a(Context context, String str, boolean z, final rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24806f31", new Object[]{this, context, str, new Boolean(z), rulVar});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str)) {
            if (rulVar == null) {
                return;
            }
            rulVar.mo2421invoke(null);
        } else {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = kotlin.j.a("relation", "STAR");
            pairArr[1] = kotlin.j.a(LoginProxyActivity.ACTION_TYPE_OPERATION, z ? "BIND" : "UNBIND");
            pairArr[2] = kotlin.j.a("accountId", str);
            pairArr[3] = kotlin.j.a("accountType", "ACCOUNT");
            pairArr[4] = kotlin.j.a("source", "shopMore");
            MtopRequest a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.regera.feed.follow.manage", "1.0", ai.c(pairArr), false, false, 24, null);
            q.a(context);
            MtopBusiness a3 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, a2, (String) null, 4, (Object) null);
            a3.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$startShopRequest$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$startShopRequest$1 shopMoreUtils$startShopRequest$1, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode != 2057952281) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    } else {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject a4 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(a4);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }
            });
            a3.startRequest();
        }
    }

    public final void a(Context context, String str, final rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180d2371", new Object[]{this, context, str, rulVar});
        } else if (context == null || str == null) {
        } else {
            MtopBusiness a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.taobao.saipan.auths.get", "1.0", ai.c(kotlin.j.a("source", "shop"), kotlin.j.a("sellerId", str), kotlin.j.a("flagShip", "0")), false, false, 24, null), (String) null, 4, (Object) null);
            a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestSmsInfo$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestSmsInfo$1 shopMoreUtils$requestSmsInfo$1, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode != 2057952281) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    } else {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject a3 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(a3);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }
            });
            a2.startRequest();
        }
    }

    public final void a(Context context, String str, String str2, final rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649ecbb", new Object[]{this, context, str, str2, rulVar});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str, str2, rulVar)) {
        } else {
            MtopRequest a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.taobao.wireless.shop.search.word.get", "1.0", ai.c(kotlin.j.a("seller_id", str2), kotlin.j.a("shop_id", str)), false, false, 24, null);
            q.a(context);
            MtopBusiness a3 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, a2, (String) null, 4, (Object) null);
            a3.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestShopSearchBarHintText$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestShopSearchBarHintText$1 shopMoreUtils$requestShopSearchBarHintText$1, String str3, Object... objArr) {
                    int hashCode = str3.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode != 2057952281) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                    } else {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject;
                    rul<JSONObject, t> rulVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject a4 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (a4 == null || (jSONObject = a4.getJSONObject("data")) == null || (rulVar2 = rulVar) == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(jSONObject);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(null);
                }
            });
            a3.startRequest();
        }
    }

    public final void b(Context context, String str, String str2, final rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bae5da", new Object[]{this, context, str, str2, rulVar});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str, str2, rulVar)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "sellerId", str2);
            jSONObject2.put((JSONObject) "shopId", str);
            MtopRequest a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.taobao.regera.recall.shop", "1.0", ai.c(kotlin.j.a("recallType", "SHOP_DYNAMIC"), kotlin.j.a("params", jSONObject.toJSONString())), false, false, 24, null);
            q.a(context);
            MtopBusiness a3 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, a2, (String) null, 4, (Object) null);
            a3.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestShopDynamicRedDotData$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestShopDynamicRedDotData$1 shopMoreUtils$requestShopDynamicRedDotData$1, String str3, Object... objArr) {
                    if (str3.hashCode() == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject jSONObject4 = null;
                    JSONObject a4 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (a4 != null && (jSONObject3 = a4.getJSONObject("data")) != null) {
                        jSONObject4 = jSONObject3.getJSONObject("data");
                    }
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(jSONObject4);
                }
            });
            a3.startRequest();
        }
    }

    public final void b(Context context, String str, rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19437650", new Object[]{this, context, str, rulVar});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(context, str, rulVar)) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.regera.feed.follow.manage", "1.0", ai.c(kotlin.j.a("accountType", "ACCOUNT"), kotlin.j.a("source", "shopMore"), kotlin.j.a("relation", "STAR"), kotlin.j.a(LoginProxyActivity.ACTION_TYPE_OPERATION, MtopParamType.QUERY), kotlin.j.a("accountId", str)), new ShopMoreUtils$requestShopStarInfo$1(rulVar), new ShopMoreUtils$requestShopStarInfo$2(rulVar), false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
        }
    }

    public final void a(final Context context, String str, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea7e8e1", new Object[]{this, context, str, aVar});
            return;
        }
        ceg.a aVar2 = ceg.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("addFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context == null || str == null || aVar == null) {
            return;
        }
        MtopBusiness a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.taobao.social.follow.weitao.add", "3.2", ai.b(kotlin.j.a("followedId", str), kotlin.j.a("type", "1"), kotlin.j.a("originBiz", "shop"), kotlin.j.a("originFlag", "Page_newShop")), false, false, 24, null), (String) null, 4, (Object) null);
        a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$addFollowWithSellerId$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopMoreUtils$addFollowWithSellerId$1 shopMoreUtils$addFollowWithSellerId$1, String str2, Object... objArr) {
                int hashCode = str2.hashCode();
                if (hashCode == -662674828) {
                    super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                    return null;
                } else if (hashCode != 2057952281) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                } else {
                    super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                    return null;
                }
            }

            @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
                Pair<String, String> parseMTopError = parseMTopError(mtopResponse);
                if (parseMTopError != null) {
                    b.b(context, parseMTopError.getSecond());
                } else {
                    aVar.a(true);
                }
            }

            @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                super.onError(i, mtopResponse, obj);
                Pair<String, String> parseMTopError = parseMTopError(mtopResponse);
                if (parseMTopError == null) {
                    return;
                }
                b.b(context, parseMTopError.getSecond());
            }

            private final Pair<String, String> parseMTopError(MtopResponse mtopResponse) {
                JSONArray jSONArray;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Pair) ipChange2.ipc$dispatch("3c2b9402", new Object[]{this, mtopResponse});
                }
                JSONObject a3 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                if (a3 == null || (jSONArray = a3.getJSONArray(a.RESULT_KEY)) == null) {
                    return null;
                }
                Object a4 = p.a((List<? extends Object>) jSONArray, 0);
                String obj = a4 == null ? null : a4.toString();
                List b2 = obj == null ? null : n.b((CharSequence) obj, new String[]{"::"}, false, 0, 6, (Object) null);
                String str2 = b2 == null ? null : (String) p.a((List<? extends Object>) b2, 0);
                String str3 = b2 == null ? null : (String) p.a((List<? extends Object>) b2, 1);
                if (!q.a((Object) str2, (Object) "SUCCESS") && str2 != null && str3 != null) {
                    return new Pair<>(str2, str3);
                }
                return null;
            }
        });
        a2.startRequest();
    }

    public final void b(Context context, String str, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a74740", new Object[]{this, context, str, aVar});
            return;
        }
        ceg.a aVar2 = ceg.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("checkFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context == null || str == null || aVar == null) {
            return;
        }
        MtopBusiness a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.cybertron.follow.detail", "3.0", ai.b(kotlin.j.a("followedId", str), kotlin.j.a("type", "1"), kotlin.j.a("originBiz", "shop"), kotlin.j.a("originFlag", "Page_newShop")), false, false, 24, null), (String) null, 4, (Object) null);
        a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$checkFollowWithSellerId$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopMoreUtils$checkFollowWithSellerId$1 shopMoreUtils$checkFollowWithSellerId$1, String str2, Object... objArr) {
                if (str2.hashCode() == 2057952281) {
                    super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
                c.a aVar3 = c.a.this;
                String str2 = null;
                JSONObject a3 = com.alibaba.triver.triver_shop.newShop.ext.d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                if (a3 != null && (jSONObject = a3.getJSONObject("data")) != null) {
                    str2 = jSONObject.getString("follow");
                }
                aVar3.a(q.a((Object) str2, (Object) "true"));
            }
        });
        a2.startRequest();
    }

    public final void c(Context context, String str, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea6a59f", new Object[]{this, context, str, aVar});
            return;
        }
        ceg.a aVar2 = ceg.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("removeFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context == null || str == null || aVar == null) {
            return;
        }
        MtopBusiness a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a(context, com.alibaba.triver.triver_shop.newShop.ext.a.a("mtop.taobao.weitao.follow.remove", "3.2", ai.b(kotlin.j.a("followedId", str), kotlin.j.a("type", "1"), kotlin.j.a("originBiz", "shop"), kotlin.j.a("originFlag", "Page_newShop")), false, false, 24, null), (String) null, 4, (Object) null);
        a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$removeFollowWithSellerId$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopMoreUtils$removeFollowWithSellerId$1 shopMoreUtils$removeFollowWithSellerId$1, String str2, Object... objArr) {
                if (str2.hashCode() == 2057952281) {
                    super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
                c.a.this.a(false);
            }
        });
        a2.startRequest();
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, shopData});
            return;
        }
        q.d(shopData, "shopData");
        com.alibaba.triver.triver_shop.newShop.ext.b.a("request2022FrameworkSwipeBigCardListData", new ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1(shopData));
    }

    public final void a(Context context, String targetId, String str, rul<? super String, t> rulVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94861195", new Object[]{this, context, targetId, str, rulVar, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(targetId, "targetId");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("targetId", targetId);
        pairArr[1] = kotlin.j.a("feature", str);
        pairArr[2] = kotlin.j.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString());
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.minishop.like.like", "1.0", ai.b(pairArr), new ShopMoreUtils$shopLoftLike$1(rulVar), null, true, false, false, null, false, null, 3968, null);
    }

    public final void b(Context context, String targetId, String str, rul<? super String, t> rulVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b0f856", new Object[]{this, context, targetId, str, rulVar, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(targetId, "targetId");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("targetId", targetId);
        pairArr[1] = kotlin.j.a("feature", str);
        pairArr[2] = kotlin.j.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString());
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.minishop.like.removeLike", "1.0", ai.b(pairArr), new ShopMoreUtils$shopLoftRemoveLike$1(rulVar), null, true, false, false, null, false, null, 3968, null);
    }

    public final void c(Context context, String targetId, String str, rul<? super String, t> rulVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dbdf17", new Object[]{this, context, targetId, str, rulVar, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(targetId, "targetId");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("targetId", targetId);
        pairArr[1] = kotlin.j.a("feature", str);
        pairArr[2] = kotlin.j.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString());
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.minishop.collection.collection", "1.0", ai.b(pairArr), new ShopMoreUtils$shopLoftCollection$1(rulVar), null, true, false, false, null, false, null, 3968, null);
    }

    public final void d(Context context, String targetId, String str, rul<? super String, t> rulVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5506c5d8", new Object[]{this, context, targetId, str, rulVar, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(targetId, "targetId");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("targetId", targetId);
        pairArr[1] = kotlin.j.a("feature", str);
        pairArr[2] = kotlin.j.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString());
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.minishop.collection.removeCollection", "1.0", ai.b(pairArr), new ShopMoreUtils$shopLoftRemoveCollection$1(rulVar), null, true, false, false, null, false, null, 3968, null);
    }
}
