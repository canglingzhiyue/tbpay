package com.taobao.alimama;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.utils.Global;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.kge;
import tb.kuh;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f8434a = {-2, -2};
    private final String[] b = new String[2];
    private final String[] c = {"alimama_tksid", "alimama_tksid2"};

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f8435a;

        static {
            kge.a(-938699353);
            f8435a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("449c715", new Object[0]) : f8435a;
        }
    }

    static {
        kge.a(-42920748);
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : str == null ? "" : str;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("449c715", new Object[0]) : a.a();
    }

    private long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -2L;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length >= 2) {
                return Long.parseLong(split[1]);
            }
            return -2L;
        } catch (Throwable unused) {
            return -2L;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String d = d(parse.getQueryParameter("tkSid"));
            String d2 = d(parse.getQueryParameter("tkSid2"));
            String d3 = d(parse.getQueryParameter(kuh.ALI_TRACK_ID));
            if (!TextUtils.isEmpty(d)) {
                this.b[0] = d;
                this.f8434a[0] = b(d);
                if (this.f8434a[0] != 0) {
                    SharedPreferencesUtils.putString(this.c[0], d);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("alitrackid", d3);
                hashMap.put("tkSidInSDK", d);
                UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Handle_TkSid", "", "", hashMap);
            }
            if (TextUtils.isEmpty(d2)) {
                return;
            }
            this.b[1] = d2;
            this.f8434a[1] = b(d2);
            if (this.f8434a[1] != 0) {
                SharedPreferencesUtils.putString(this.c[1], d2);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("alitrackid", d3);
            hashMap2.put("tkSid2InSDK", d2);
            UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Handle_TkSid2", "", "", hashMap2);
        } catch (Throwable unused) {
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if ("tkSid".equals(str)) {
            return a(0);
        }
        return "tkSid2".equals(str) ? a(1) : "";
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        long j = this.f8434a[i];
        if (j == -2) {
            j = b(SharedPreferencesUtils.getString(this.c[i], ""));
        }
        if (j == -2) {
            return "";
        }
        if (j == 0) {
            return this.b[i];
        }
        if (j == -1) {
            this.b[i] = SharedPreferencesUtils.getString(this.c[i], "");
            return this.b[i];
        }
        if (System.currentTimeMillis() / 1000 < j) {
            this.b[i] = SharedPreferencesUtils.getString(this.c[i], "");
        } else {
            SharedPreferencesUtils.putString(this.c[i], "");
            this.b[i] = "";
        }
        return this.b[i];
    }

    public String a(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("444bba08", new Object[]{this, str, str2, str3, new Boolean(z), str4});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            String d = d(parse.getQueryParameter("tkSid"));
            String d2 = d(parse.getQueryParameter("tkSid2"));
            String d3 = d(parse.getQueryParameter(kuh.ALI_TRACK_ID));
            String d4 = d(c("tkSid"));
            String d5 = d(c("tkSid2"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemid", (Object) str3);
            jSONObject.put("sellerid", (Object) str2);
            jSONObject.put("ismall", (Object) Integer.valueOf(z ? 1 : 0));
            jSONObject.put("alitrackid", (Object) d3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("ext", (Object) str4);
            }
            if (!TextUtils.isEmpty(d4) || !TextUtils.isEmpty(d)) {
                jSONObject.put("tkSidInUrl", (Object) d);
                jSONObject.put("tkSidInSDK", (Object) d4);
                a("mtop.alimama.union.trace", jSONObject, str);
            }
            if (!TextUtils.isEmpty(d5) || !TextUtils.isEmpty(d2)) {
                jSONObject.put("tkSid2InUrl", (Object) d2);
                jSONObject.put("tkSid2InSDK", (Object) d5);
                a("mtop.alimama.union.trace2", jSONObject, str);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private void a(final String str, final JSONObject jSONObject, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490e348", new Object[]{this, str, jSONObject, str2});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            mtopRequest.setData(jSONObject.toJSONString());
            Application application = Global.getApplication();
            if (application == null) {
                return;
            }
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), mtopRequest);
            build.mo1312setConnectionTimeoutMilliSecond(3000);
            build.mo1326setSocketTimeoutMilliSecond(5000);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.alimama.TKNewCPSManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    char c = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        try {
                            if ("true".equals(mtopResponse.getDataJsonObject().getString("clearSession"))) {
                                if (!"mtop.alimama.union.trace".equals(str)) {
                                    c = "mtop.alimama.union.trace2".equals(str) ? (char) 1 : (char) 65535;
                                }
                                if (c != 65535) {
                                    d dVar = d.this;
                                    d.$ipChange[c] = "";
                                    d dVar2 = d.this;
                                    SharedPreferencesUtils.putString(d.$ipChange[c], "");
                                }
                            }
                            reportResult(true, str2);
                        } catch (JSONException e) {
                            String str3 = "onSuccess: get data params error " + e;
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        String str3 = "onError: i " + i + " mtopResponse " + mtopResponse.getDataJsonObject();
                        reportResult(false, str2);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        String str3 = "onSystemError: i " + i + " o " + obj + "mtopResponse" + mtopResponse.getDataJsonObject();
                        reportResult(false, str2);
                    }
                }

                private void reportResult(boolean z, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8a6d626", new Object[]{this, new Boolean(z), str3});
                        return;
                    }
                    try {
                        jSONObject.put("isSuccess", (Object) Boolean.valueOf(z));
                        if (!z) {
                            jSONObject.put("url", (Object) str3);
                        }
                        HashMap hashMap = new HashMap();
                        for (String str4 : jSONObject.keySet()) {
                            hashMap.put(str4, String.valueOf(jSONObject.get(str4)));
                        }
                        if ("mtop.alimama.union.trace".equals(str)) {
                            UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Upload_TkSid", "", "", hashMap);
                        } else if ("mtop.alimama.union.trace2".equals(str)) {
                            UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Upload_TkSid2", "", "", hashMap);
                        }
                    } catch (Throwable th) {
                        String str5 = "reportResult: " + th;
                    }
                }
            });
            build.startRequest();
        }
    }
}
