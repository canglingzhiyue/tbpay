package com.taobao.tao.recommendation;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.wireless.aliprivacyext.recommendation.c;
import com.alibaba.wireless.aliprivacyext.recommendation.d;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TBRecommendPrivacy extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_STATES = "getStatus";
    private static final String SET_STATUS = "setStatus";
    private static final String TAG = "TBRecommendPrivacy";

    public static /* synthetic */ void access$000(TBRecommendPrivacy tBRecommendPrivacy, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f5cfe", new Object[]{tBRecommendPrivacy, str, new Boolean(z), str2});
        } else {
            tBRecommendPrivacy.trackModifyEnd(str, z, str2);
        }
    }

    private boolean getStates(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1572864a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
        }
        if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(this.mContext)) {
            jSONObject.put("content", com.alibaba.wireless.aliprivacyext.recommendation.a.a(this.mContext));
            rVar.a("result", jSONObject);
            wVCallBackContext.success(rVar);
            trackQueryStart(str, com.alibaba.wireless.aliprivacyext.recommendation.e.NO_UID.getStatus());
            return true;
        }
        com.alibaba.wireless.aliprivacyext.recommendation.e a2 = c.a().a("AliPrivacySDK");
        jSONObject.put("content", a2.getRecommendSwitchBooleanStatus());
        rVar.a("result", jSONObject);
        wVCallBackContext.success(rVar);
        trackQueryStart(str, a2.getStatus());
        return true;
    }

    public static /* synthetic */ Object ipc$super(TBRecommendPrivacy tBRecommendPrivacy, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean setStates(final String str, final WVCallBackContext wVCallBackContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef40bb56", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        trackModifyStart(str);
        System.currentTimeMillis();
        r rVar = new r();
        try {
            z = new JSONObject(str).getBoolean("status");
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
            trackModifyEnd(str, false, th.getMessage());
        }
        if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(this.mContext)) {
            com.alibaba.wireless.aliprivacyext.recommendation.a.a(this.mContext, z);
            wVCallBackContext.success();
            trackModifyEnd(str, true, null);
            return true;
        }
        c.a().a(z, true, new d() { // from class: com.taobao.tao.recommendation.TBRecommendPrivacy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                wVCallBackContext.success();
                TBRecommendPrivacy.access$000(TBRecommendPrivacy.this, str, true, null);
            }

            @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                wVCallBackContext.error();
                TBRecommendPrivacy.access$000(TBRecommendPrivacy.this, str, false, str2);
            }
        });
        return true;
    }

    private void trackModifyEnd(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e16d77", new Object[]{this, str, new Boolean(z), str2});
        } else {
            TrackLog.trackModifyRecommendStatusLogEnd(this.mContext, str, "TBJSBridge", z, str2);
        }
    }

    private void trackModifyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f984e", new Object[]{this, str});
        } else {
            TrackLog.trackModifyRecommendStatusLogStart(this.mContext, str, "TBJSBridge");
        }
    }

    private void trackQueryStart(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23b5d40", new Object[]{this, str, str2});
        } else {
            TrackLog.trackQueryRecommendStatusLog(this.mContext, str2, "TBJSBridge", TAG, str);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.alibaba.wireless.aliprivacy.c.a(TAG, "action:" + str + "==>params:" + str2);
        if (GET_STATES.equals(str)) {
            return getStates(str2, wVCallBackContext);
        }
        if (!SET_STATUS.equals(str)) {
            return false;
        }
        return setStates(str2, wVCallBackContext);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }
}
