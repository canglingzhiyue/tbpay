package com.etao.feimagesearch.result;

import android.content.Context;
import android.graphics.RectF;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.ut.device.UTDevice;
import java.util.Iterator;
import tb.cot;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public class IrpJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "IrpJsBridge";
    public static final String NAME = "TBSImageSearchBridge";

    static {
        kge.a(2063126678);
    }

    public static /* synthetic */ Object ipc$super(IrpJsBridge irpJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final void onUTCtrlClicked(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecefe6b", new Object[]{this, jSONObject});
            return;
        }
        try {
            String jSONObject2 = jSONObject.toString();
            cot.d(LOG_TAG, "UTCtrlClicked: " + jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject2);
            String optString = jSONObject3.optString(UMLLCons.FEATURE_TYPE_PAGE);
            String optString2 = jSONObject3.optString("Ctrl");
            org.json.JSONObject optJSONObject = jSONObject3.optJSONObject("Args");
            if (StringUtils.isEmpty(optString)) {
                optString = StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName();
            }
            if (StringUtils.isEmpty(optString2)) {
                optString2 = "unknown";
            }
            String parseUTArgs = parseUTArgs(optJSONObject);
            if ("ItemClick".equals(optString2) && (this.mContext instanceof b)) {
                utItemClick("," + parseUTArgs, "ItemClick", ((b) this.mContext).d());
            } else if (!StringUtils.isEmpty(parseUTArgs)) {
                cox.d(optString, optString2, parseUTArgs);
            } else {
                cox.d(optString, optString2, new String[0]);
            }
        } catch (Exception unused) {
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
        return (StringUtils.isEmpty(sb2) || sb2.length() <= 1) ? "" : sb2.substring(1);
    }

    private void utItemClick(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffde5fb", new Object[]{this, str, str2, str3});
            return;
        }
        StringBuilder sb = new StringBuilder("pssource=" + str3);
        sb.append(",utdid=" + UTDevice.getUtdid(this.mContext));
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
        }
        cox.d(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), str2, sb.toString());
    }

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

    public void backHandled(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdffbc14", new Object[]{this, jSONObject});
        } else if (c() == null) {
        } else {
            if (jSONObject != null && jSONObject.containsKey("status")) {
                z = jSONObject.getBooleanValue("status");
            }
            if (z) {
                return;
            }
            cot.d(LOG_TAG, "backHandled");
        }
    }

    public void contentReachTop(JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42f7dae", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "contentReachTop");
        if (jSONObject != null && jSONObject.containsKey("status") && (bool = jSONObject.getBoolean("status")) != null) {
            z = bool.booleanValue();
        }
        c.b(z);
    }

    public void loadFinished(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4f4ad1", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        c.a(jSONObject == null ? "" : jSONObject.toJSONString(), false);
    }

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

    public void initSearchParams(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a72b348", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "initSearchParams");
        JSONObject dV_ = c.dV_();
        wVCallBackContext.success(dV_ == null ? "" : dV_.toString());
    }

    public void scrollTo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8119ea21", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "scrollTo");
        c.a(jSONObject.getString("position"));
    }

    public void updateTopbarStyle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5961cc5f", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null) {
            return;
        }
        cot.d(LOG_TAG, "updateTopbarStyle");
        c.b(jSONObject.getString("style"));
    }

    public void updateContext(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e06263", new Object[]{this, jSONObject});
            return;
        }
        com.etao.feimagesearch.newresult.base.b c = c();
        if (c == null || jSONObject == null) {
            return;
        }
        cot.d(LOG_TAG, "updateContext " + jSONObject.toJSONString());
        String string = jSONObject.getString("region");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        String[] split = string.split(",");
        if (split.length != 4) {
            return;
        }
        try {
            c.a(new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3])));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private com.etao.feimagesearch.newresult.base.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.base.b) ipChange.ipc$dispatch("79858356", new Object[]{this});
        }
        Context context = this.mContext;
        if (!(context instanceof b)) {
            return null;
        }
        return ((b) context).f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r8.equals("loadFinished") != false) goto L19;
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.result.IrpJsBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
