package com.taobao.relationship.jsbridge;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.phenix.intf.b;
import com.taobao.relationship.mtop.isfollow.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import org.json.JSONObject;
import tb.kge;
import tb.nmg;

/* loaded from: classes7.dex */
public class AllSparkFollowJsBridgeV3 extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADDFLLOW = "addFollowByParams";
    private static final String ACTION_ISFOLLOW = "hasFollowedByParams";
    private static final String ACTION_LOADIMG = "loadGuideImgsByParams";
    private static final String ACTION_REMOVEFOLLOW = "removeFollowByParams";
    public static final String PAGE = "TBWeitaoFollowServiceJSBridgeV3";

    static {
        kge.a(906988821);
    }

    public static /* synthetic */ Object ipc$super(AllSparkFollowJsBridgeV3 allSparkFollowJsBridgeV3, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        long parseLong;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (ACTION_LOADIMG.equals(str)) {
                String optString = jSONObject.optString("guideToastUrl");
                String optString2 = jSONObject.optString("guideCardUrl");
                if (nmg.a()) {
                    if (!TextUtils.isEmpty(optString)) {
                        b.h().a(optString);
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        b.h().a(optString2);
                    }
                }
                wVCallBackContext.success();
                return true;
            }
            if (!TextUtils.isEmpty(jSONObject.optString("accountId"))) {
                parseLong = Long.parseLong(jSONObject.optString("accountId"));
            } else {
                parseLong = !TextUtils.isEmpty(jSONObject.optString("followedId")) ? Long.parseLong(jSONObject.optString("followedId")) : 0L;
            }
            int parseInt = !TextUtils.isEmpty(jSONObject.optString("accountType")) ? Integer.parseInt(jSONObject.optString("accountType")) : 0;
            String optString3 = jSONObject.optString("originBiz");
            String optString4 = jSONObject.optString("originPage");
            String optString5 = jSONObject.optString("originFlag");
            String optString6 = jSONObject.optString("extra");
            int optInt = jSONObject.optInt("type", 1);
            int optInt2 = jSONObject.optInt("option", 1);
            com.taobao.relationship.mtop.b bVar = new com.taobao.relationship.mtop.b();
            bVar.b = parseLong;
            bVar.c = parseInt;
            bVar.f = optString3;
            bVar.g = optString4;
            bVar.h = optString5;
            bVar.d = optInt;
            bVar.e = optInt2;
            bVar.i = optString6;
            bVar.m = !TextUtils.equals(jSONObject.optString(LoginConstants.SHOW_TOAST), "false");
            if (ACTION_ISFOLLOW.equals(str)) {
                new a(wVCallBackContext).a(bVar);
                return true;
            } else if (ACTION_ADDFLLOW.equals(str)) {
                String optString7 = jSONObject.optString("showAnimation");
                Activity activity = null;
                if (this.mContext instanceof Activity) {
                    activity = (Activity) this.mContext;
                }
                bVar.f18974a = activity;
                if (TextUtils.equals(optString7, "true")) {
                    String optString8 = jSONObject.optString("guideToastUrl");
                    String optString9 = jSONObject.optString("guideCardUrl");
                    bVar.j = true;
                    bVar.k = optString8;
                    bVar.l = optString9;
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).a(bVar);
                } else {
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).a(bVar);
                }
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", getUTArgs(parseLong, optString3, optString4, optString5));
                return true;
            } else if (!ACTION_REMOVEFOLLOW.equals(str)) {
                return false;
            } else {
                new com.taobao.relationship.mtop.removefollow.a(wVCallBackContext).a(bVar);
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", getUTArgs(parseLong, optString3, optString4, optString5));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getUTArgs(long j, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3ceb8b7", new Object[]{this, new Long(j), str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + j);
        sb.append(",Origin=" + str);
        sb.append(",Page=" + str2);
        sb.append(",Extend=" + str3);
        return sb.toString();
    }
}
