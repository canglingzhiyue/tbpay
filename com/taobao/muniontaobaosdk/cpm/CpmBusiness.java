package com.taobao.muniontaobaosdk.cpm;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.net.pojo.response.P4pCpmInfoResponse;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kfe;
import tb.kge;
import tb.mto;
import tb.riy;

@Deprecated
/* loaded from: classes7.dex */
public class CpmBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f18294a;
    private Bundle b;

    static {
        kge.a(327110361);
    }

    public CpmBusiness(Context context, Bundle bundle) {
        this.f18294a = context;
        this.b = bundle;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Munion CPM clickurl is " + str);
        String str3 = "";
        UserTrackLogs.trackClick(9001, str3, str2);
        try {
            str3 = new mto(this.f18294a, this.b).a(str2);
            TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "[accept] is :" + str3);
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "[traceData] error:" + e.getMessage());
        }
        kfe kfeVar = new kfe((Application) this.f18294a);
        kfeVar.registeListener(new CpmRemoteBusinessListener(str2));
        kfeVar.a(this.f18294a, "", MunionDeviceUtil.getUtdid(), str, "", "", str3, MunionDeviceUtil.getUserAgent());
    }

    /* loaded from: classes7.dex */
    public class CpmRemoteBusinessListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String clickId;

        static {
            kge.a(-1689493361);
            kge.a(-525336021);
        }

        public CpmRemoteBusinessListener(String str) {
            this.clickId = str;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败：" + mtopResponse.getRetCode());
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            Object mo2429getData = ((P4pCpmInfoResponse) baseOutDo).mo2429getData();
            TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求成功！ result is :" + mo2429getData);
            String str = "";
            try {
                JSONObject jSONObject = new JSONObject(mo2429getData.toString());
                if (jSONObject.get("result") != null) {
                    str = jSONObject.get("result").toString();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!b.c(str)) {
                return;
            }
            try {
                String str2 = "redirecturl=" + URLEncoder.encode(str, "UTF-8");
                UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str2, this.clickId);
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "usertrack update is [args=" + str2 + riy.ARRAY_END_STR);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败：" + mtopResponse.getRetCode());
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpm 请求失败");
            }
        }
    }
}
