package com.taobao.search.musie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.musie.img.MUSImageView;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.cjn;
import tb.ghi;
import tb.ghm;
import tb.git;
import tb.giu;
import tb.giw;
import tb.gse;
import tb.imn;
import tb.imo;
import tb.iru;
import tb.isr;
import tb.itt;
import tb.iup;
import tb.ius;
import tb.jyx;
import tb.kge;
import tb.nnd;
import tb.nnq;
import tb.noa;
import tb.nty;
import tb.nuc;
import tb.nug;
import tb.nur;
import tb.nye;
import tb.rul;
import tb.shc;

/* loaded from: classes7.dex */
public class MUSXSearchEventModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CARRIED_DATA = "carriedData";
    public static final String KEY_OPEN_URL_EXTRAS = "xsearch:extras";
    public static final String MODULE_NAME = "xsearchEvent";
    private static final String TAG = "XSearchEvent";
    private volatile String mCachedPvFeature;
    private nuc sensorEventListener;

    static {
        kge.a(-606255115);
    }

    public static /* synthetic */ Object ipc$super(MUSXSearchEventModule mUSXSearchEventModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String access$002(MUSXSearchEventModule mUSXSearchEventModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45664ae3", new Object[]{mUSXSearchEventModule, str});
        }
        mUSXSearchEventModule.mCachedPvFeature = str;
        return str;
    }

    public static /* synthetic */ void access$100(MUSXSearchEventModule mUSXSearchEventModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79b1e34", new Object[]{mUSXSearchEventModule});
        } else {
            mUSXSearchEventModule.unregisterGSensorListener();
        }
    }

    public MUSXSearchEventModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void doBizAction(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c721de39", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else if (getInstance().isDestroyed() || (actionPerformer = getActionPerformer()) == null) {
        } else {
            actionPerformer.a(str, jSONObject, aVar, aVar2);
        }
    }

    private void doAction(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a0c216", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else if (getInstance().isDestroyed() || (actionPerformer = getActionPerformer()) == null) {
        } else {
            actionPerformer.b(str, jSONObject, aVar, aVar2);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        imn b = imo.b();
        if (b != null) {
            jSONObject.put("utd_id", (Object) b.a().b());
            jSONObject.put("ttid", (Object) b.a().a());
        } else {
            jSONObject.put("utd_id", (Object) UTDevice.getUtdid(Globals.getApplication()));
            jSONObject.put("ttid", (Object) TaoHelper.getTTID());
        }
        jSONObject.put("sversion", (Object) noa.SERVER_VERSION_VALUE);
        jSONObject.put("client_os", (Object) "Android");
        jSONObject.put("client_os_version", (Object) String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(noa.KEY_GOOD_PRICE, (Object) String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.c()));
        String c = com.taobao.search.mmd.util.g.c();
        if (!TextUtils.isEmpty(c)) {
            jSONObject.put(noa.KEY_COUNTRY_NUM, (Object) c);
        }
        return jSONObject;
    }

    private com.taobao.android.xsearchplugin.weex.weex.h getActionPerformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) ipChange.ipc$dispatch("1f0fdec3", new Object[]{this});
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof com.taobao.android.xsearchplugin.weex.weex.h) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) tag;
        }
        return null;
    }

    @MUSMethod
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
        } else {
            doBizAction("search", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void refreshList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a5cd0", new Object[]{this, jSONObject});
        } else {
            doBizAction("searchOption", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void refreshAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174d61", new Object[]{this, jSONObject});
        } else {
            doBizAction("refreshAuction", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
        } else {
            doBizAction("searchOption", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void searchOptionWithCallback(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527a9aef", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            doAction("searchOptionWithCallback", jSONObject, com.taobao.android.xsearchplugin.muise.n.a(bVar), com.taobao.android.xsearchplugin.muise.n.a(bVar2));
        }
    }

    @MUSMethod
    public void tagSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86792a7", new Object[]{this, jSONObject});
        } else {
            doBizAction("tagSearch", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
        } else {
            doBizAction("goToSrp", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void gotoSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2d7e7b", new Object[]{this, jSONObject});
        } else {
            doBizAction("goToSrp", jSONObject, null, null);
        }
    }

    @MUSMethod
    @Deprecated
    public void openTaobaoExperience(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f8f4e7", new Object[]{this, jSONObject});
        } else {
            doBizAction("openTaobaoExperience", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
        } else {
            doBizAction("jumpToTab", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void clickInShopAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d021bbe9", new Object[]{this, jSONObject});
        } else {
            doBizAction("clickInShopAuction", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
        } else {
            com.taobao.search.sf.o.a(com.taobao.search.sf.j.f19452a).a().a(jSONObject.getString("tItemType"), jSONObject.getString(jyx.DIMENSION_JSVERSION), com.ut.mini.l.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), false);
        }
    }

    @MUSMethod
    @Deprecated
    public void jumpToTimeline(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c25adf", new Object[]{this, jSONObject});
        } else {
            doBizAction("jumpToTimeline", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void reorderList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe1f2b0", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            com.taobao.android.searchbaseframe.util.k.a(TAG, "options参数为空");
        } else if (!jSONObject.containsKey("pageName") || !jSONObject.containsKey("contentList")) {
        } else {
            String string = jSONObject.getString("pageName");
            JSONArray jSONArray = jSONObject.getJSONArray("contentList");
            if (jSONArray == null || jSONArray.size() == 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("args", jSONArray.toString());
            com.taobao.android.jarviswe.a.a().a(string, "reorderList", hashMap, new gse() { // from class: com.taobao.search.musie.MUSXSearchEventModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gse
                public void errorReport(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                    }
                }

                @Override // tb.gse
                public void notify(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("contentList", (Object) str2);
                    MUSXSearchEventModule.this.getInstance().sendInstanceMessage("jarvis_reorderList", jSONObject2);
                }
            });
        }
    }

    @MUSMethod
    public void operateSearchList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c2da7f", new Object[]{this, jSONObject});
        } else {
            doBizAction("operateSearchList", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void utClickLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            com.taobao.android.searchbaseframe.util.k.a(TAG, "options为空");
        } else {
            String string = jSONObject.getString("controlName");
            if (TextUtils.isEmpty(string)) {
                com.taobao.android.searchbaseframe.util.k.a(TAG, "controlName为空");
                return;
            }
            String string2 = jSONObject.getString("spm");
            ArrayMap<String, String> a2 = nye.a(jSONObject, "args");
            String string3 = jSONObject.getString("pageName");
            if (TextUtils.isEmpty(string3)) {
                com.taobao.search.mmd.util.e.a(string, a2, string2);
            } else {
                com.taobao.search.mmd.util.e.a(string3, string, a2, string2);
            }
        }
    }

    @MUSMethod(uiThread = false)
    public void updateVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af89c224", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    nur.a(getInstance().getUIContext(), key, value.toString());
                }
            }
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45e5111", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys");
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                jSONObject2.put(string, (Object) nur.a(getInstance().getUIContext(), string));
            }
        }
        return jSONObject2;
    }

    @MUSMethod(uiThread = false)
    public void removeVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b18329f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys");
            for (int i = 0; i < a2.size(); i++) {
                nur.b(getInstance().getUIContext(), a2.getString(i));
            }
        }
    }

    @MUSMethod
    public void removeDynamicCard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f9495e", new Object[]{this, jSONObject});
        } else {
            doBizAction("removeDynamicCard", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void prepareCompassRequest(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998ffc5", new Object[]{this, jSONObject});
        } else {
            doBizAction("prepareCompassRequest", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void removeSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f16677", new Object[]{this});
        } else {
            doAction("removeSelf", null, null, null);
        }
    }

    @MUSMethod
    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            doAction("setParams", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void addParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else {
            doAction("addParams", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void clearParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else {
            doAction("clearParams", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void removeParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else {
            doAction("removeParams", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getParams() {
        Map<String, String> latestParamsSnapshot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        JSONObject jSONObject = new JSONObject();
        if (actionPerformer instanceof r) {
            latestParamsSnapshot = ((r) actionPerformer).X();
            nnd.a(latestParamsSnapshot);
        } else if (actionPerformer instanceof ius) {
            latestParamsSnapshot = ((com.taobao.search.sf.a) ((ius) actionPerformer).getModel()).d().getLatestParamsSnapshot();
            nnd.a(latestParamsSnapshot);
        } else if (!com.taobao.search.common.util.r.bl()) {
            return null;
        } else {
            latestParamsSnapshot = new c(XslModule.a()) { // from class: com.taobao.search.musie.MUSXSearchEventModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.search.sf.datasource.c
                public com.taobao.android.searchbaseframe.util.e<String, String> a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.taobao.android.searchbaseframe.util.e) ipChange2.ipc$dispatch("3af765d3", new Object[]{this});
                    }
                    return null;
                }
            }.getLatestParamsSnapshot();
        }
        if (latestParamsSnapshot != null) {
            jSONObject.putAll(latestParamsSnapshot);
        }
        return jSONObject;
    }

    @MUSMethod
    public void closeSimilarSame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2900ebe0", new Object[]{this});
            return;
        }
        Context uIContext = getInstance().getUIContext();
        if (!(uIContext instanceof Activity)) {
            return;
        }
        ((Activity) uIContext).onKeyDown(4, null);
    }

    @MUSMethod
    public void jumpToSimilarAndSame(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6119ab", new Object[]{this, new Integer(i), str});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) getInstance();
        UINode uINode = (UINode) mUSDKInstance.findNodeById(i);
        String a2 = com.taobao.android.searchbaseframe.util.r.a(str, "show_header_image", "true");
        if (uINode == null) {
            Nav.from(mUSDKInstance.getUIContext()).toUri(a2);
            return;
        }
        Object mountContent = uINode.getMountContent();
        if (!(mountContent instanceof MUSImageView)) {
            Nav.from(mUSDKInstance.getUIContext()).toUri(a2);
            return;
        }
        MUSImageView mUSImageView = (MUSImageView) mountContent;
        if (!com.taobao.search.common.util.r.Q()) {
            mUSImageView.performHapticFeedback(0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mUSImageView.setTransitionName("similar_activity_transition");
            Nav.from(mUSDKInstance.getUIContext()).withOptions(ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) mUSDKInstance.getUIContext(), mUSImageView, "similar_activity_transition").toBundle()).toUri(a2);
            return;
        }
        Nav.from(mUSDKInstance.getUIContext()).toUri(a2);
    }

    @MUSMethod
    public void closeFilterPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c541d2db", new Object[]{this});
        } else {
            doAction("closeFilterPanel", null, null, null);
        }
    }

    @MUSMethod
    public void commitAuctionClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a50ed", new Object[]{this, jSONObject});
        } else {
            doAction("commitAuctionClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void insertCardClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3114690a", new Object[]{this, jSONObject});
        } else {
            doAction("insertCardClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void commitJarvisClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ec81d", new Object[]{this, jSONObject});
        } else {
            doAction("commitJarvisClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void negativeFeedbackOptionClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aaf410", new Object[]{this, jSONObject});
        } else {
            doBizAction("negativeFeedbackOptionClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void negativeFeedbackPop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77919892", new Object[]{this, jSONObject});
        } else {
            doBizAction("negativeFeedbackPop", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void commitUserBehavior(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae3b5b5", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("behavior");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = jSONObject.getString("itemId");
        String string3 = jSONObject.getString("actionName");
        String string4 = jSONObject.getString("pageName");
        if (TextUtils.isEmpty(string4)) {
            string4 = com.ut.mini.l.getInstance().getCurrentPageName();
        }
        String[] a2 = com.taobao.search.jarvis.c.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "args"));
        View renderRoot = getInstance().getRenderRoot();
        char c = 65535;
        switch (string.hashCode()) {
            case -1411068523:
                if (string.equals("appear")) {
                    c = 1;
                    break;
                }
                break;
            case -177721437:
                if (string.equals("disappear")) {
                    c = 2;
                    break;
                }
                break;
            case 114595:
                if (string.equals(shc.SCENE_TAP)) {
                    c = 0;
                    break;
                }
                break;
            case 96667352:
                if (string.equals(g4.b.i)) {
                    c = 3;
                    break;
                }
                break;
            case 102846135:
                if (string.equals("leave")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            com.taobao.android.behavix.h.a(string4, string3, "", string2, a2);
        } else if (c == 1) {
            com.taobao.android.behavix.h.a(string4, string3, string2, renderRoot, a2);
        } else if (c == 2) {
            com.taobao.android.behavix.h.b(string4, string3, string2, renderRoot, a2);
        } else if (c == 3) {
            com.taobao.android.behavix.h.a(string4, (String) null, getInstance().getUIContext(), new String[0]);
        } else if (c != 4) {
        } else {
            com.taobao.android.behavix.h.b(string4, (String) null, this, new String[0]);
        }
    }

    @MUSMethod
    public void updateLocation(final com.taobao.android.weex_framework.bridge.b bVar, final com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb2dbd3", new Object[]{this, bVar, bVar2});
        } else {
            nnq.a(new nnq.a() { // from class: com.taobao.search.musie.MUSXSearchEventModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nnq.a
                public void a(TBLocationDTO tBLocationDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
                    } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess() || TextUtils.isEmpty(tBLocationDTO.getCityName())) {
                        bVar2.a(new Object[0]);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(noa.KEY_CITY_CODE, (Object) tBLocationDTO.cityCode);
                        jSONObject.put(noa.KEY_CITY_NAME, (Object) tBLocationDTO.cityName);
                        jSONObject.put(noa.KEY_AREA_LBS_CODE, (Object) tBLocationDTO.areaCode);
                        bVar.a(jSONObject);
                    }
                }
            }, getInstance().getUIContext(), false);
        }
    }

    @MUSMethod
    public void requestLocation(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, final com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74496d13", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            nnq.a(new nnq.a() { // from class: com.taobao.search.musie.MUSXSearchEventModule.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nnq.a
                public void a(TBLocationDTO tBLocationDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
                    } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess() || TextUtils.isEmpty(tBLocationDTO.getCityName())) {
                        bVar2.a(new Object[0]);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(noa.KEY_CITY_CODE, (Object) tBLocationDTO.cityCode);
                        jSONObject2.put(noa.KEY_CITY_NAME, (Object) tBLocationDTO.cityName);
                        jSONObject2.put(noa.KEY_AREA_LBS_CODE, (Object) tBLocationDTO.areaCode);
                        bVar.a(jSONObject2);
                    }
                }
            }, getInstance().getUIContext(), jSONObject.getBooleanValue(cjn.HUMMER_FOUNDATION_POSITIVE));
        }
    }

    @MUSMethod
    public void closePreFilterPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694dbee8", new Object[]{this});
        } else {
            doAction(com.taobao.android.xsearchplugin.muise.c.ACTION_CLOSE_PRE_FILTER, null, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getResultData() {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48213684", new Object[]{this});
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (!(actionPerformer instanceof iup)) {
            return null;
        }
        Object model = ((iup) actionPerformer).getModel();
        if ((model instanceof com.taobao.search.sf.a) && (commonSearchResult = (CommonSearchResult) ((com.taobao.search.sf.a) model).d().getTotalSearchResult()) != null) {
            return commonSearchResult.originData;
        }
        return null;
    }

    @MUSMethod
    public void goToSearchDoor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec17b90", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (!(actionPerformer instanceof iup)) {
            return;
        }
        Object model = ((iup) actionPerformer).getModel();
        if (!(model instanceof com.taobao.search.sf.a)) {
            return;
        }
        final String string = jSONObject.getString("q");
        final String string2 = jSONObject.getString("tab");
        final Map<String, String> D = ((com.taobao.search.sf.a) model).d().D();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                D.put(key, value.toString());
            }
        }
        if (BaseResultActivity.a(getInstance().getUIContext())) {
            ((BaseResultActivity) getInstance().getUIContext()).a(new AnimatorListenerAdapter() { // from class: com.taobao.search.musie.MUSXSearchEventModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        com.taobao.search.common.util.p.a(string, string2, D, (Activity) MUSXSearchEventModule.this.getInstance().getUIContext(), "srp");
                    }
                }
            });
        } else {
            com.taobao.search.common.util.p.a(string, string2, D, (Activity) getInstance().getUIContext(), "srp");
        }
    }

    @MUSMethod
    public void getPvFeature(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df05c6", new Object[]{this, jSONObject, bVar});
            return;
        }
        String string = jSONObject.getString("query");
        if (TextUtils.isEmpty(string)) {
            bVar.a(this.mCachedPvFeature);
        }
        long a2 = com.taobao.android.searchbaseframe.util.g.a(jSONObject.getString("timeout"), 50L);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        com.taobao.android.jarviswe.tracker.c.a().a(string, new a(countDownLatch));
        try {
            countDownLatch.await(a2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bVar.a(this.mCachedPvFeature);
    }

    /* loaded from: classes7.dex */
    public class a implements com.taobao.android.jarviswe.tracker.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CountDownLatch b;

        static {
            kge.a(1643664012);
            kge.a(-212829689);
        }

        public a(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // com.taobao.android.jarviswe.tracker.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            MUSXSearchEventModule.access$002(MUSXSearchEventModule.this, str2);
            this.b.countDown();
        }

        @Override // com.taobao.android.jarviswe.tracker.a
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else {
                this.b.countDown();
            }
        }
    }

    @MUSMethod
    public void updateShareContent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867cfe26", new Object[]{this, jSONObject});
        } else if (jSONObject == null || getInstance().isDestroyed() || !(getInstance().getUIContext() instanceof com.taobao.search.sf.f)) {
        } else {
            ((com.taobao.search.sf.f) getInstance().getUIContext()).a_(jSONObject);
        }
    }

    @MUSMethod
    public void getMessageCount(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36aec1dc", new Object[]{this, bVar});
        } else if (bVar == null) {
            com.taobao.android.weex_framework.util.g.d("callback mustn't be null");
        } else if (getInstance().isDestroyed()) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("count", (Object) Integer.valueOf(getUnreadMessageCnt()));
            bVar.a(jSONObject);
        }
    }

    private int getUnreadMessageCnt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6815961", new Object[]{this})).intValue();
        }
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        if (messageBoxService != null && messageBoxService.getUnreadInfo() != null) {
            return messageBoxService.getUnreadInfo().getTipNumber();
        }
        return 0;
    }

    @MUSMethod
    public void gotoSrpWithData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107e54cb", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            Bundle bundle = new Bundle();
            if (jSONArray != null) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                bundle.putString(KEY_CARRIED_DATA, valueOf);
                com.taobao.search.sf.datasource.b.a().a(valueOf, jSONArray);
            }
            Nav.from(getInstance().getUIContext()).withExtras(bundle).toUri(string);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalStorages(JSONArray jSONArray) {
        MuiseCellBean findByLongId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4d3c5c7c", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            long a2 = com.taobao.android.searchbaseframe.util.g.a(string, -1L);
            if (a2 >= 0 && (findByLongId = MuiseCellBean.findByLongId(a2)) != null) {
                jSONObject.put(string, JSON.toJSON(findByLongId.mStorage));
            }
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getTabApi(String str) {
        com.taobao.android.meta.data.a aVar;
        itt.a r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6608ac", new Object[]{this, str});
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if ((actionPerformer instanceof k) && (aVar = ((k) actionPerformer).l().combo) != null && (r = aVar.r()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) r.f29314a);
            jSONObject.put("version", (Object) r.b);
            jSONObject.put("params", (Object) aVar.s());
            return jSONObject;
        }
        SearchApiModel a2 = nty.INSTANCE.a(str);
        if (a2 == null) {
            return new JSONObject();
        }
        return (JSONObject) JSON.toJSON(a2);
    }

    @MUSMethod
    public void loadNextPage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3286921", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        Object obj = null;
        if (actionPerformer != null) {
            actionPerformer.b("loadNextPage", jSONObject, null, null);
        }
        if (!com.taobao.search.common.util.r.ba() || !com.taobao.search.common.util.r.aZ()) {
            return;
        }
        if (actionPerformer instanceof iup) {
            obj = ((iup) actionPerformer).getModel();
        } else if (actionPerformer instanceof com.taobao.android.xsearchplugin.muise.c) {
            obj = ((com.taobao.android.xsearchplugin.muise.c) actionPerformer).j();
        }
        if (!(obj instanceof iru)) {
            return;
        }
        com.taobao.android.searchbaseframe.datasource.impl.a d = ((iru) obj).d();
        if (((d.getTotalSearchResult() instanceof CommonSearchResult) && ((CommonSearchResult) d.getTotalSearchResult()).guideSearch) || jSONObject == null || com.taobao.android.searchbaseframe.util.g.b(jSONObject.getString("currentPage"), -1) != d.getCurrentPage()) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("constParams");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    d.setParam(key, String.valueOf(value));
                }
            }
        }
        if (!"true".equals(jSONObject.getString("needRealLoadNextPage"))) {
            return;
        }
        d.doNextPageSearch();
    }

    @MUSMethod
    public void scrollCellToTop(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc22b0c", new Object[]{this, new Boolean(z), str});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("anim", (Object) Boolean.valueOf(z));
        jSONObject.put("offset", (Object) Float.valueOf(com.taobao.android.weex_framework.util.i.a(str)));
        actionPerformer.b("scrollCellToTop", jSONObject, null, null);
    }

    @MUSMethod
    public void switchToTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84325ea7", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fullData", (Object) Boolean.valueOf(z));
        actionPerformer.b("switchToTab", jSONObject, null, null);
    }

    @MUSMethod
    public void jumpToItemTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1163c800", new Object[]{this});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.b("jumpToItemTab", null, null, null);
    }

    @MUSMethod
    public void setListStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e738142", new Object[]{this, str});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", (Object) str);
        actionPerformer.b("setListStyle", jSONObject, null, null);
    }

    @MUSMethod
    public void refreshCombo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4d27a", new Object[]{this});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.a("refreshCombo", null, null, null);
    }

    @MUSMethod(uiThread = false)
    public JSONObject getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("147a1312", new Object[]{this});
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (!(actionPerformer instanceof k)) {
            return null;
        }
        return ((k) actionPerformer).U();
    }

    @MUSMethod
    public void showPopup(JSONObject jSONObject, JSONObject jSONObject2) {
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbb2936", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || (actionPerformer = getActionPerformer()) == null) {
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("options", (Object) jSONObject);
            jSONObject3.put("data", (Object) jSONObject2);
            actionPerformer.b("showPopup", jSONObject3, null, null);
        }
    }

    @MUSMethod
    public void hidePopup(JSONObject jSONObject) {
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586f4ff", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (actionPerformer = getActionPerformer()) == null) {
        } else {
            actionPerformer.b("hidePopup", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void subscribeMotionGyro(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        int i = 4;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a1f3e8", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (!com.taobao.search.common.util.r.bh() || jSONObject == null || bVar == null) {
        } else {
            boolean booleanValue = jSONObject.getBooleanValue("on");
            final int intValue = jSONObject.getIntValue("type");
            if (!booleanValue) {
                unregisterGSensorListener();
                if (bVar == null) {
                    return;
                }
                bVar.a(new Object[0]);
                return;
            }
            if (this.sensorEventListener != null) {
                unregisterGSensorListener();
            }
            this.sensorEventListener = new nuc(new rul<SensorEvent, kotlin.t>() { // from class: com.taobao.search.musie.MUSXSearchEventModule.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.t, java.lang.Object] */
                @Override // tb.rul
                /* renamed from: invoke */
                public /* synthetic */ kotlin.t mo2421invoke(SensorEvent sensorEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("c9923577", new Object[]{this, sensorEvent}) : a(sensorEvent);
                }

                public kotlin.t a(SensorEvent sensorEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (kotlin.t) ipChange2.ipc$dispatch("ba447d41", new Object[]{this, sensorEvent});
                    }
                    if (bVar != null && sensorEvent != null) {
                        float[] fArr = sensorEvent.values;
                        if (fArr.length >= 3) {
                            JSONObject jSONObject2 = new JSONObject();
                            if (intValue == 0) {
                                jSONObject2.put("x", (Object) Float.valueOf((-fArr[0]) / 10.0f));
                                jSONObject2.put("y", (Object) Float.valueOf((-fArr[1]) / 10.0f));
                                jSONObject2.put(AmnetConstant.VAL_SUPPORT_ZSTD, (Object) Float.valueOf((-fArr[2]) / 10.0f));
                            } else {
                                jSONObject2.put("x", (Object) Float.valueOf(fArr[0]));
                                jSONObject2.put("y", (Object) Float.valueOf(fArr[1]));
                                jSONObject2.put(AmnetConstant.VAL_SUPPORT_ZSTD, (Object) Float.valueOf(fArr[2]));
                            }
                            bVar.b(jSONObject2);
                        }
                    }
                    return null;
                }
            }, null);
            this.sensorEventListener.a(jSONObject.getLongValue("frequency"));
            Context applicationContext = getInstance().getUIContext().getApplicationContext();
            if (intValue == 0) {
                i = 9;
            }
            if (!nug.a(applicationContext, Integer.valueOf(i), this.sensorEventListener)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msg", (Object) "Device Not Support");
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(jSONObject2);
                return;
            }
            getInstance().getRenderRoot().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.search.musie.MUSXSearchEventModule.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    } else {
                        MUSXSearchEventModule.access$100(MUSXSearchEventModule.this);
                    }
                }
            });
        }
    }

    @MUSMethod
    public void getFavoriteStatus(final JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cf08bc", new Object[]{this, jSONObject, bVar});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(giw.class, new AliServiceFindedCallback<giw>() { // from class: com.taobao.search.musie.MUSXSearchEventModule.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, giwVar});
                    } else {
                        a(giwVar);
                    }
                }

                public void a(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea56d2e3", new Object[]{this, giwVar});
                    } else if (giwVar == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorMsg", (Object) "未找到服务");
                        bVar.a(jSONObject2);
                    } else {
                        giwVar.setBizCode("search_app");
                        giwVar.isFavoriteItem(jSONObject.getString("itemId"), new git() { // from class: com.taobao.search.musie.MUSXSearchEventModule.8.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.git
                            public void a(boolean z) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("status", (Object) (z ? "add" : "unadd"));
                                bVar.a(jSONObject3);
                            }

                            @Override // tb.git
                            public void a(String str, String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("errorCode", (Object) str);
                                jSONObject3.put("errorMsg", (Object) str2);
                                bVar.a(jSONObject3);
                            }

                            @Override // tb.git
                            public void b(String str, String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("errorCode", (Object) str);
                                jSONObject3.put("errorMsg", (Object) str2);
                                bVar.a(jSONObject3);
                            }
                        });
                    }
                }
            });
        }
    }

    @MUSMethod
    public void doFavorite(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64ee979", new Object[]{this, jSONObject, bVar});
            return;
        }
        final String string = jSONObject.getString("itemId");
        final String string2 = jSONObject.getString("type");
        AliAdaptServiceManager.getInstance().findAliAdaptService(giw.class, new AliServiceFindedCallback<giw>() { // from class: com.taobao.search.musie.MUSXSearchEventModule.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.adapt.api.AliServiceFindedCallback
            public /* synthetic */ void onServiceFinded(giw giwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, giwVar});
                } else {
                    a(giwVar);
                }
            }

            public void a(giw giwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea56d2e3", new Object[]{this, giwVar});
                } else if (giwVar == null) {
                    com.taobao.search.common.util.q.a(MUSXSearchEventModule.TAG, "favorite service is null");
                } else {
                    giwVar.setBizCode("search_app");
                    giu giuVar = new giu() { // from class: com.taobao.search.musie.MUSXSearchEventModule.9.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.giu
                        public void onFavSuccess(int i, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("status", (Object) "success");
                            bVar.a(jSONObject2);
                        }

                        @Override // tb.giu
                        public void onFavError(int i, String str, String str2, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("errorCode", (Object) str);
                            jSONObject2.put("errorMsg", (Object) str2);
                            jSONObject2.put("status", (Object) "failure");
                            bVar.a(jSONObject2);
                        }

                        @Override // tb.giu
                        public void onFavSystemError(int i, String str, String str2, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("errorCode", (Object) str);
                            jSONObject2.put("errorMsg", (Object) str2);
                            jSONObject2.put("status", (Object) "failure");
                            bVar.a(jSONObject2);
                        }
                    };
                    if ("add".equals(string2)) {
                        giwVar.addFavoriteItem(string, giuVar);
                    } else {
                        giwVar.deleteFavoriteItem(string, giuVar);
                    }
                }
            }
        });
    }

    private void unregisterGSensorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e0b300", new Object[]{this});
        } else if (this.sensorEventListener == null) {
        } else {
            nug.a(getInstance().getUIContext().getApplicationContext(), this.sensorEventListener);
            this.sensorEventListener = null;
        }
    }

    @MUSMethod
    public void openUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b63e0", new Object[]{this, str, str2});
        } else {
            openUrl(getInstance().getUIContext(), str, str2);
        }
    }

    @MUSMethod
    public void getNavigationInfo(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808c0bf6", new Object[]{this, bVar});
            return;
        }
        JSONObject navigationInfo = getNavigationInfo(getInstance().getUIContext());
        if (navigationInfo == null) {
            return;
        }
        bVar.a(navigationInfo);
    }

    public static void openUrl(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b4b90", new Object[]{context, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_OPEN_URL_EXTRAS, str2);
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    public static JSONObject getNavigationInfo(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f110d69", new Object[]{context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        String str = "";
        if (extras != null) {
            str = extras.getString(KEY_OPEN_URL_EXTRAS, str);
        }
        JSONObject jSONObject = new JSONObject();
        if (intent.getData() != null) {
            jSONObject.put("url", (Object) intent.getData().toString());
        }
        try {
            jSONObject.put("params", (Object) JSON.parseObject(str));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @MUSMethod
    public void getXRainbowBucketName(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7cd31", new Object[]{this, str, bVar});
        } else {
            bVar.a(com.taobao.search.rainbow.a.a(str));
        }
    }

    @MUSMethod(uiThread = false)
    public String getXRainbowBucketNameSync(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35b5e12b", new Object[]{this, str}) : com.taobao.search.rainbow.a.a(str);
    }

    @MUSMethod(uiThread = true)
    public void jumpToComboItem(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a24dd1", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.b("jumpToComboItem", jSONObject, null, null);
    }

    @MUSMethod(uiThread = false)
    public boolean isSpecifyVersionCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53791a3", new Object[]{this, str})).booleanValue();
        }
        ghm ghmVar = (ghm) ghi.a(ghm.class);
        if (ghmVar != null) {
            return ghmVar.isSpecifyVersionCode(str);
        }
        return false;
    }

    @MUSMethod(uiThread = true)
    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        Context uIContext = getInstance().getUIContext();
        ((InputMethodManager) uIContext.getSystemService("input_method")).hideSoftInputFromWindow(((Activity) uIContext).getWindow().getDecorView().getWindowToken(), 0);
    }

    @MUSMethod(uiThread = true)
    public void showLeftBar(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16dfda", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.a("showLeftBar", jSONObject, null, null);
    }

    @MUSMethod(uiThread = true)
    public void closeLeftBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7ecffb", new Object[]{this});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.a("closeLeftBar", null, null, null);
    }

    @MUSMethod(uiThread = true)
    public void clearAllParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd07aa41", new Object[]{this});
        } else {
            doAction("clearAllParams", null, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public void reportTitleInfo(final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ac399", new Object[]{this, jSONObject, jSONObject2});
        } else {
            Coordinator.execute(new ac() { // from class: com.taobao.search.musie.MUSXSearchEventModule.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        new v(jSONObject, jSONObject2).a();
                    }
                }
            });
        }
    }
}
