package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.augecore.data.CrowdResponse;
import com.taobao.augecore.data.CrowdResponseData;
import com.taobao.augecore.data.GroupData;
import com.taobao.augecore.network.NetworkRequest;
import com.taobao.augecore.network.NetworkResponse;
import com.taobao.augecore.network.c;
import com.taobao.login4android.api.Login;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.cew;

/* loaded from: classes6.dex */
public class kbb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID_TOKEN = "dT1jcm93ZC1hbmRyb2lk";
    public static final String GROUP_DATA = "group_data";
    public static final String GROUP_DATA_EXPIRE_TIME = "group_data_expire_time";

    /* renamed from: a  reason: collision with root package name */
    public List<GroupData> f29942a;
    public boolean b;
    private String c;
    private long d;
    private String e;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static kbb f29944a = new kbb();

        public static /* synthetic */ kbb a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kbb) ipChange.ipc$dispatch("f06c493", new Object[0]) : f29944a;
        }
    }

    public static /* synthetic */ String a(kbb kbbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10f0b33", new Object[]{kbbVar}) : kbbVar.c;
    }

    public static /* synthetic */ String a(kbb kbbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b3a0fe9", new Object[]{kbbVar, str});
        }
        kbbVar.c = str;
        return str;
    }

    public static kbb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbb) ipChange.ipc$dispatch("f06c493", new Object[0]) : a.a();
    }

    private kbb() {
        this.f29942a = new ArrayList();
        this.b = false;
        this.d = 0L;
    }

    public void a(final kba kbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bd90ae", new Object[]{this, kbaVar});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (System.currentTimeMillis() - this.d <= cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT && this.e == userId) {
                kbd.a(kaw.LOG_TAG, "三分钟之内，不重复请求，返回上一次请求结果:groupDataList=" + this.f29942a + "  mExpireTime=" + this.c);
                kbaVar.a(this.f29942a, this.c);
                return;
            }
            this.b = true;
            this.d = System.currentTimeMillis();
            this.e = userId;
            HashMap hashMap = new HashMap();
            hashMap.put("imei", kbc.a(kaw.a().f29925a));
            hashMap.put("imsi", kbc.b(kaw.a().f29925a));
            hashMap.put("userid", userId);
            hashMap.put("utdid", UTDevice.getUtdid(kaw.a().f29925a));
            hashMap.put("bizCode", kbc.d());
            NetworkRequest networkRequest = new NetworkRequest();
            networkRequest.setParams(JSON.toJSONString(hashMap));
            networkRequest.setToken(ANDROID_TOKEN);
            kbd.a(kaw.LOG_TAG, "requestData === 请求参数 === " + networkRequest.getParams() + "  token = " + ANDROID_TOKEN);
            com.taobao.augecore.network.a.a().a(new c() { // from class: tb.kbb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.augecore.network.c
                public void a(NetworkResponse networkResponse) {
                    CrowdResponseData crowdResponseData;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee7e6096", new Object[]{this, networkResponse});
                        return;
                    }
                    kbd.a(kaw.LOG_TAG, "response data === " + networkResponse.jsonData);
                    if (networkResponse.pojo != null && (crowdResponseData = (CrowdResponseData) networkResponse.pojo.mo2429getData()) != null) {
                        kbb.this.f29942a = crowdResponseData.getCrowds();
                        kbb.a(kbb.this, crowdResponseData.getExpireTime());
                    }
                    kay.a().b(kbb.this.f29942a);
                    kbaVar.a(kbb.this.f29942a, kbb.a(kbb.this));
                    kay.a().a(kbb.this.f29942a, kbb.a(kbb.this));
                    kbb.this.b = false;
                }

                @Override // com.taobao.augecore.network.c
                public void b(NetworkResponse networkResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e02806b5", new Object[]{this, networkResponse});
                        return;
                    }
                    kbd.b(kaw.LOG_TAG, "response: 错误信息 === " + networkResponse.errorMsg);
                    kbaVar.a(new ArrayList(), "");
                    kbb.this.b = false;
                }
            }, networkRequest, kaw.a().b(), CrowdResponse.class);
            kbc.c(kbc.AUGE_LOCAL_BIZ_CODE);
        } catch (Exception unused) {
            this.b = false;
        }
    }
}
