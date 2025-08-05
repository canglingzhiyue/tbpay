package com.taobao.relationship.jsbridge;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.relationship.mtop.isfollow.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONObject;
import tb.kge;
import tb.nmg;

/* loaded from: classes7.dex */
public class AllSparkFollowJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADDFLLOW = "addFollowByParams";
    private static final String ACTION_ISFOLLOW = "hasFollowedByParams";
    private static final String ACTION_LOADIMG = "loadGuideImgsByParams";
    private static final String ACTION_REMOVEFOLLOW = "removeFollowByParams";
    public static final String PAGE = "TBWeitaoFollowServiceJSBridge";

    static {
        kge.a(-562184072);
    }

    public static /* synthetic */ Object ipc$super(AllSparkFollowJsBridge allSparkFollowJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        String[] split;
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
            long j = 0;
            if (!TextUtils.isEmpty(jSONObject.optString("accountId"))) {
                j = Long.parseLong(jSONObject.optString("accountId"));
            } else if (!TextUtils.isEmpty(jSONObject.optString("followedId"))) {
                j = Long.parseLong(jSONObject.optString("followedId"));
            }
            int parseInt = !TextUtils.isEmpty(jSONObject.optString("accountType")) ? Integer.parseInt(jSONObject.optString("accountType")) : 0;
            String optString3 = jSONObject.optString("originBiz");
            String optString4 = jSONObject.optString("originPage");
            String optString5 = jSONObject.optString("originFlag");
            String optString6 = jSONObject.optString("extra");
            String optString7 = jSONObject.optString("origin");
            if (TextUtils.isEmpty(optString7) || (split = optString7.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) == null) {
                str3 = optString3;
            } else {
                str3 = optString3;
                if (split.length >= 2) {
                    String str4 = !TextUtils.isEmpty(split[0]) ? split[0] : str3;
                    if (!TextUtils.isEmpty(split[1])) {
                        optString4 = split[1];
                    }
                    str3 = str4;
                    if (split.length >= 3 && !TextUtils.isEmpty(split[2])) {
                        optString5 = split[2];
                    }
                }
            }
            int optInt = jSONObject.optInt("type", 1);
            int optInt2 = jSONObject.optInt("option", 1);
            com.taobao.relationship.mtop.b bVar = new com.taobao.relationship.mtop.b();
            bVar.b = j;
            bVar.c = parseInt;
            bVar.f = str3;
            bVar.g = optString4;
            bVar.h = optString5;
            bVar.d = optInt;
            bVar.e = optInt2;
            bVar.i = optString6;
            if (ACTION_ISFOLLOW.equals(str)) {
                new a(wVCallBackContext).a(bVar);
                return true;
            } else if (ACTION_ADDFLLOW.equals(str)) {
                String optString8 = jSONObject.optString("showAnimation");
                Activity activity = null;
                if (this.mContext instanceof Activity) {
                    activity = (Activity) this.mContext;
                }
                bVar.f18974a = activity;
                if (TextUtils.equals(optString8, "true")) {
                    String optString9 = jSONObject.optString("guideToastUrl");
                    String optString10 = jSONObject.optString("guideCardUrl");
                    bVar.j = true;
                    bVar.k = optString9;
                    bVar.l = optString10;
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).a(bVar);
                } else {
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).a(bVar);
                }
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", getUTArgs(j, parseInt, optString7));
                return true;
            } else if (!ACTION_REMOVEFOLLOW.equals(str)) {
                return false;
            } else {
                new com.taobao.relationship.mtop.removefollow.a(wVCallBackContext).a(bVar);
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", getUTArgs(j, parseInt, optString7));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getUTArgs(long j, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29da801e", new Object[]{this, new Long(j), new Integer(i), str});
        }
        if (j == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + j);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!str.contains("|")) {
                    return sb.toString();
                }
                String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split != null && split.length >= 2) {
                    if (!TextUtils.isEmpty(split[0])) {
                        sb.append(",Origin=" + split[0]);
                    }
                    if (!TextUtils.isEmpty(split[1])) {
                        sb.append(",Page=" + split[1]);
                    }
                    if (split.length >= 3 && !TextUtils.isEmpty(split[2])) {
                        sb.append(",Extend=" + split[2]);
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return sb.toString();
        }
    }
}
