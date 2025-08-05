package com.taobao.umipublish.monitor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.litecreator.util.at;
import com.taobao.statistic.TBS;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.hfi;
import tb.ios;
import tb.kge;
import tb.tek;

/* loaded from: classes9.dex */
public class PerformanceMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "PublishPerformanceMonitor";

    /* renamed from: a  reason: collision with root package name */
    public PerformanceTracker f23360a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Rate {
        public static final String FAIL = "0";
        public static final String START = "-1";
        public static final String SUCCESS = "1";
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static PerformanceMonitor f23361a;

        static {
            kge.a(-1255480839);
            f23361a = new PerformanceMonitor();
        }

        public static /* synthetic */ PerformanceMonitor a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PerformanceMonitor) ipChange.ipc$dispatch("fd172600", new Object[0]) : f23361a;
        }
    }

    static {
        kge.a(1800377661);
    }

    private PerformanceMonitor() {
    }

    public static PerformanceMonitor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PerformanceMonitor) ipChange.ipc$dispatch("fd172600", new Object[0]) : a.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f23360a = new PerformanceTracker(tek.e() ? hfi.b() : ios.a(str).a());
        }
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else {
            a(str, str2, "time", String.valueOf(j), (JSONObject) null);
        }
    }

    public void a(String str, String str2, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd77db28", new Object[]{this, str, str2, new Long(j), jSONObject});
        } else {
            a(str, str2, "time", String.valueOf(j), jSONObject);
        }
    }

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            a(str, str2, RateNode.TAG, String.valueOf(z ? 1 : 0), (JSONObject) null);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(str, str2, RateNode.TAG, str3, (JSONObject) null);
        }
    }

    public void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfaf3e", new Object[]{this, str, str2, str3, new Long(j)});
            return;
        }
        a(str, str2, RateNode.TAG, str3, (JSONObject) null);
        a(str, str2, "time", String.valueOf(j), (JSONObject) null);
    }

    public void a(String str, String str2, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216b6118", new Object[]{this, str, str2, new Boolean(z), jSONObject});
        } else {
            a(str, str2, RateNode.TAG, String.valueOf(z ? 1 : 0), jSONObject);
        }
    }

    public void b(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c839ac9", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            a(str, str2, RateNode.TAG, str3, jSONObject);
        }
    }

    public void a(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59de7dec", new Object[]{this, str, str2, new Boolean(z), str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            jSONObject.put(str3, (Object) str4);
        }
        a(str, str2, RateNode.TAG, String.valueOf(z ? 1 : 0), jSONObject);
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            a(str, str2, SPManager.FPS_KEY, str3, (JSONObject) null);
        }
    }

    public void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            a(str, str2, SPManager.FPS_KEY, str3, jSONObject);
        }
    }

    public void a(String str, String str2, long j, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc49964", new Object[]{this, str, str2, new Long(j), new Boolean(z), jSONObject});
            return;
        }
        a(str, str2, RateNode.TAG, String.valueOf(z ? 1 : 0), jSONObject);
        a(str, str2, "time", String.valueOf(j), jSONObject);
    }

    public void a(String str, String str2, long j, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9431d6", new Object[]{this, str, str2, new Long(j), new Boolean(z), str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("extra", (Object) str3);
        }
        a(str, str2, j, z, jSONObject);
    }

    private synchronized void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05860", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else if (this.f23360a == null) {
        } else {
            this.f23360a.location = str;
            this.f23360a.extra_infos = jSONObject;
            TBS.Ext.commitEvent(UT_PAGE_NAME, 19999, str2, str3, str4, this.f23360a.toInfoString());
        }
    }

    /* loaded from: classes9.dex */
    public static class PerformanceTracker implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject biz_infos;
        public JSONObject extra_infos;
        public String location;
        public Map<String, String> urlParams;

        static {
            kge.a(-253975601);
            kge.a(1028243835);
        }

        public PerformanceTracker(Map<String, String> map) {
            this.urlParams = map;
            this.biz_infos = (JSONObject) JSONObject.toJSON(map);
        }

        public String toInfoString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("920813ff", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("location", this.location);
            try {
                hashMap.put(ios.KEY_BIZ_LINE, this.urlParams.get(ios.KEY_BIZ_LINE));
                hashMap.put("biz_scene", this.urlParams.get("biz_scene"));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, this.urlParams.get(ios.KEY_ONIOLN_FITTING_ROOM_SCENE));
                hashMap.put("umi_pub_session", this.urlParams.get("umi_pub_session"));
                hashMap.put("biz_infos", URLEncoder.encode(this.biz_infos.toJSONString(), "UTF-8"));
                if (this.extra_infos != null) {
                    hashMap.put("extra_infos", URLEncoder.encode(this.extra_infos.toJSONString(), "UTF-8"));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return at.a(hashMap, "=", ",");
        }
    }
}
