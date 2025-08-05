package com.etao.feimagesearch.result;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.pipline.c;
import com.etao.feimagesearch.util.ah;
import com.etao.feimagesearch.util.o;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.com;
import tb.cot;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public class IrpMuiseModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IRP_USER_DATA = "IrpUserData";
    private static final String LOG_TAG = "IrpMuiseModule";
    public static final String NAME = "TBSImageSearchModule";

    static {
        kge.a(201464123);
    }

    public static /* synthetic */ Object ipc$super(IrpMuiseModule irpMuiseModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @MUSMethod(uiThread = false)
    public void finishMonitor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc02662", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod(uiThread = false)
    public void startMonitor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238823b1", new Object[]{this, jSONObject});
        }
    }

    public IrpMuiseModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void recordPageOperated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213c4287", new Object[]{this});
        } else if (getInstance() == null || getInstance().isDestroyed()) {
        } else {
            Context uIContext = getInstance().getUIContext();
            if (!(uIContext instanceof b)) {
                return;
            }
            b bVar = (b) uIContext;
            if (bVar.f() == null) {
                return;
            }
            bVar.f().f();
        }
    }

    @MUSMethod(uiThread = true)
    public void utCtrlClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e50b80b", new Object[]{this, jSONObject});
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.toString());
            String optString = jSONObject2.optString(UMLLCons.FEATURE_TYPE_PAGE);
            String optString2 = jSONObject2.optString("Ctrl");
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("Args");
            if (TextUtils.isEmpty(optString)) {
                optString = StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName();
            }
            if (TextUtils.isEmpty(optString2)) {
                optString2 = "unknown";
            }
            String parseUTArgs = parseUTArgs(optJSONObject);
            if ("ItemClick".equals(optString2) && (getInstance().getUIContext() instanceof b)) {
                utItemClick("," + parseUTArgs, "ItemClick", ((b) getInstance().getContext()).d());
            } else if (!TextUtils.isEmpty(parseUTArgs)) {
                cox.d(optString, optString2, parseUTArgs);
            } else {
                cox.d(optString, optString2, new String[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MUSMethod(uiThread = false)
    public final void getOrangeConfig(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95dba31", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            String string = jSONObject.getString("group");
            String string2 = jSONObject.getString("config");
            String string3 = jSONObject.getString("default");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                String a2 = com.etao.feimagesearch.config.b.a(string, string2, string3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) a2);
                bVar.a(jSONObject2);
                return;
            }
            bVar2.a(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String parseUTArgs(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e1d6bb8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        Iterator<String> keys = jSONObject.keys();
        StringBuilder sb = new StringBuilder();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            sb.append(",");
            sb.append(next);
            sb.append("=");
            sb.append(optString);
        }
        String sb2 = sb.toString();
        return (TextUtils.isEmpty(sb2) || sb2.length() <= 1) ? "" : sb2.substring(1);
    }

    private void utItemClick(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffde5fb", new Object[]{this, str, str2, str3});
            return;
        }
        StringBuilder sb = new StringBuilder("pssource=" + str3);
        sb.append(",utdid=" + UTDevice.getUtdid(getInstance().getUIContext()));
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        cox.d(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), str2, sb.toString());
    }

    @MUSMethod(uiThread = true)
    public void hideKeyboard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d86d9a0", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, MspEventTypes.ACTION_STRING_HIDE_KEYBOARD);
        c.ap_();
    }

    @MUSMethod(uiThread = true)
    public void backHandled(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdffbc14", new Object[]{this, jSONObject});
        } else if (c() == null) {
        } else {
            cot.d(LOG_TAG, "backHandled");
            if (jSONObject == null || !jSONObject.containsKey("status")) {
                return;
            }
            jSONObject.getBooleanValue("status");
        }
    }

    @MUSMethod(uiThread = true)
    public void loadFinished(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c7409", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "loadFinish");
        c.a(str, true);
    }

    @MUSMethod(uiThread = true)
    public void updateTextSearchStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25b5cd9", new Object[]{this, jSONObject});
        } else if (c() == null) {
        } else {
            cot.d(LOG_TAG, "updateTextSearchStatus");
            if (jSONObject == null || !jSONObject.containsKey("status")) {
                return;
            }
            jSONObject.getBooleanValue("status");
        }
    }

    @MUSMethod(uiThread = true)
    public void stickyToTop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be763978", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "stickyToTop");
        if (jSONObject != null && jSONObject.containsKey("sticky")) {
            z = jSONObject.getBooleanValue("sticky");
        }
        c.a(z);
    }

    @MUSMethod(uiThread = true)
    public void initSearchParams(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bddc39", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "initSearchParams");
        bVar.a(c.dV_());
    }

    @MUSMethod(uiThread = true)
    public void initSearchResult(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        Map<String, Object> ec_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3916dd02", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || (ec_ = c.ec_()) == null) {
            return;
        }
        bVar.a(ec_);
    }

    @MUSMethod(uiThread = true)
    public void scrollTo(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e6c8cf", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "scrollTo");
        c.a(jSONObject.getString("position"));
    }

    @MUSMethod(uiThread = true)
    public void updateTopbarStyle(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afa610d", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        String a2 = a.a(jSONObject, "action", "");
        if (TextUtils.isEmpty(a2)) {
            String a3 = a.a(jSONObject, "style", "");
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            c.b(a3);
        }
        if (TextUtils.equals("showListHeaderBg", a2)) {
            String a4 = a.a(a.b(jSONObject, "config"), "bgImgUrl", "");
            if (TextUtils.isEmpty(a4)) {
                return;
            }
            c.a(true, a4);
        } else if (!TextUtils.equals("hideListHeaderBg", a2)) {
        } else {
            c.a(false, "");
        }
    }

    @MUSMethod(uiThread = true)
    public void updateContext(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de060b11", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        if (c() == null || jSONObject == null) {
        }
    }

    private RectF parseRemoteRegion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("f6b117a9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 4) {
            return null;
        }
        try {
            return new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3]));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<RectF> parseRemoteRegionArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5811ea", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        ArrayList arrayList = new ArrayList();
        if (split.length == 0) {
            return null;
        }
        for (String str2 : split) {
            try {
                String[] split2 = str2.split(",");
                if (split2.length < 4) {
                    return null;
                }
                arrayList.add(new RectF(Float.parseFloat(split2[0]), Float.parseFloat(split2[2]), Float.parseFloat(split2[1]), Float.parseFloat(split2[3])));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }
        return arrayList;
    }

    private com.etao.feimagesearch.newresult.base.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.base.b) ipChange.ipc$dispatch("79858356", new Object[]{this});
        }
        Context uIContext = getInstance().getUIContext();
        if (!(uIContext instanceof b)) {
            return null;
        }
        return ((b) uIContext).f();
    }

    @MUSMethod(uiThread = false)
    public void tLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738db19", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                f.a("irpLog", jSONObject.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    @MUSMethod(uiThread = false)
    public void reportError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{this, str});
        } else {
            f.a("irpLog", str);
        }
    }

    @MUSMethod(uiThread = true)
    public void showSettingPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18d9d38", new Object[]{this});
        } else if (getInstance() == null || getInstance().isDestroyed() || getInstance().getUIContext() == null) {
        } else {
            ah.a(getInstance().getUIContext());
        }
    }

    @MUSMethod(uiThread = true)
    public void userClickedResultViewHeader(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d080824c", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (jSONObject == null) {
        } else {
            try {
                int parseInt = Integer.parseInt(jSONObject.getString("index"));
                com.etao.feimagesearch.newresult.base.b c = c();
                if (c == null) {
                    return;
                }
                c.a(parseInt);
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.c("userClickedResultViewHeader", e);
            }
        }
    }

    @MUSMethod
    public void setQueryText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        c.d(str);
    }

    @MUSMethod
    public void getCurrentObject(com.taobao.android.weex_framework.bridge.b bVar) {
        com.etao.feimagesearch.newresult.base.b c;
        Bitmap e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1cd480", new Object[]{this, bVar});
        } else if (bVar == null || (c = c()) == null || (e = c.e()) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) ("data:image/base64," + com.etao.feimagesearch.util.d.a(e, Bitmap.CompressFormat.JPEG, 100)));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public void setQueryTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        c.c(str);
    }

    @MUSMethod
    public void switchMultiObject(JSONObject jSONObject) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8703d7c5", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || (b = com.taobao.android.searchbaseframe.util.g.b(jSONObject.getString("imageId"), -1)) < 0) {
            return;
        }
        c.a(b);
    }

    @MUSMethod
    public void getDebugInfo(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e7309", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, (Object) Boolean.valueOf(com.a()));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public void storageRegionPageData(JSONObject jSONObject) {
        int a2;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb487701", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || (a2 = a.a(jSONObject, "regionIndex", -1)) < 0 || (b = a.b(jSONObject, "data")) == null) {
            return;
        }
        c.g().a(Integer.valueOf(a2), b);
    }

    @MUSMethod
    public void deleteRegionPageData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4441e4", new Object[]{this, new Integer(i)});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        c.g().b(Integer.valueOf(i));
    }

    @MUSMethod
    public void notifyUserRetainPop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff74791", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || TextUtils.isEmpty(a.a(jSONObject, "popLayerUrl", ""))) {
            return;
        }
        c.a(jSONObject);
    }

    @MUSMethod
    public void closeIrpPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f48c05", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        c.h();
    }

    @MUSMethod
    public void storageIrpUserParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368e3b2c", new Object[]{this, jSONObject});
        } else if (c() == null) {
        } else {
            String a2 = a.a(jSONObject, "params", "");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            k.a(com.b(), KEY_IRP_USER_DATA, a2);
        }
    }

    @MUSMethod
    public void clearIrpUserParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d82b2", new Object[]{this});
        } else if (c() == null) {
        } else {
            k.a(com.b(), KEY_IRP_USER_DATA);
        }
    }

    @MUSMethod
    public void getIrpUserParams(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea2f360", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            String b = k.b(com.b(), KEY_IRP_USER_DATA);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) b);
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public void updateUserAllowanceState(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b827d8d3", new Object[]{this, jSONObject, bVar});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || !a.a(jSONObject, "hasAllowance", false)) {
            return;
        }
        c.c(jSONObject);
    }

    @MUSMethod
    public void cropIrpSrcImage(String str, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d1e456", new Object[]{this, str, bVar});
        } else if (bVar == null) {
        } else {
            com.etao.feimagesearch.newresult.base.b c = c();
            if (c == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", (Object) false);
                jSONObject.put("errMsg", (Object) "native context is null");
                bVar.a(jSONObject);
                return;
            }
            RectF e = c.e(str);
            if (e == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isSuccess", (Object) false);
                jSONObject2.put("errMsg", (Object) "region is invalid");
                bVar.a(jSONObject2);
                return;
            }
            Bitmap ed_ = c.ed_();
            if (ed_ == null || ed_.isRecycled()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("isSuccess", (Object) false);
                jSONObject3.put("errMsg", (Object) "src img is null");
                bVar.a(jSONObject3);
                return;
            }
            final Bitmap a2 = com.etao.feimagesearch.util.d.a(ed_, e);
            if (a2 == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("isSuccess", (Object) false);
                jSONObject4.put("errMsg", (Object) "crop exception");
                bVar.a(jSONObject4);
                return;
            }
            c.a(new Runnable() { // from class: com.etao.feimagesearch.result.IrpMuiseModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("isSuccess", (Object) true);
                    jSONObject5.put(o.KEY_IMG, (Object) com.etao.feimagesearch.util.d.a(a2, Bitmap.CompressFormat.JPEG, 100));
                    bVar.a(jSONObject5);
                    a2.recycle();
                }
            });
        }
    }

    @MUSMethod
    public void getIrpSrcImage(final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261e9c46", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            com.etao.feimagesearch.newresult.base.b c = c();
            if (c == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", (Object) false);
                jSONObject.put("errMsg", (Object) "native context is null");
                bVar.a(jSONObject);
                return;
            }
            final Bitmap ed_ = c.ed_();
            if (ed_ == null || ed_.isRecycled()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isSuccess", (Object) false);
                jSONObject2.put("errMsg", (Object) "src img is null");
                bVar.a(jSONObject2);
                return;
            }
            c.a(new Runnable() { // from class: com.etao.feimagesearch.result.IrpMuiseModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = com.etao.feimagesearch.util.d.a(ed_, Bitmap.CompressFormat.JPEG, 100);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("isSuccess", (Object) true);
                    jSONObject3.put(o.KEY_IMG, (Object) a2);
                    bVar.a(jSONObject3);
                }
            });
        }
    }
}
