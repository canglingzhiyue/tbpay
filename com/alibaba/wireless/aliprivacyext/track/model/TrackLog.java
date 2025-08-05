package com.alibaba.wireless.aliprivacyext.track.model;

import android.content.Context;
import com.alibaba.security.realidentity.g4;
import com.alibaba.wireless.aliprivacyext.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.tbmainfragment.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.cgd;
import tb.cgh;

/* loaded from: classes.dex */
public class TrackLog implements Serializable, cgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String layer;
    private String method;
    private String msg;
    private String params;
    private String result;
    private String service;
    private List<String> tags;
    private String verifyToken;
    private int code = 0;
    private long ts = System.currentTimeMillis();
    private long rt = 0;

    private static String genLocalNoUidCacheTag(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3ff5f0b", new Object[]{context}) : context == null ? "" : String.valueOf(com.alibaba.wireless.aliprivacyext.recommendation.a.a(context));
    }

    private void initTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8fbd50", new Object[]{this});
        } else if (this.tags != null) {
        } else {
            ArrayList arrayList = new ArrayList(10);
            this.tags = arrayList;
            arrayList.addAll(Arrays.asList("", "", "", "", "", "", "", "", "", ""));
        }
    }

    public static void trackGetRecommendStatusFromServerEnd(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2741368", new Object[]{context, new Boolean(z), str});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "syncRecommendApiEnd";
        trackLog.result = str;
        if (!z) {
            i = -1;
        }
        trackLog.code = i;
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackGetRecommendStatusFromServerStart(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0621e65", new Object[]{context, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY, Boolean.valueOf(z));
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "syncRecommendApiStart";
        trackLog.params = f.a(hashMap);
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackModifyRecommendStatusLogEnd(Context context, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcebb49", new Object[]{context, str, str2, new Boolean(z), str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str3);
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "modifyRecommendSwitchEnd";
        trackLog.params = str;
        trackLog.result = f.a(hashMap);
        if (!z) {
            i = -1;
        }
        trackLog.code = i;
        trackLog.addTag1(str2);
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackModifyRecommendStatusLogStart(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c290ce", new Object[]{context, str, str2});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "modifyRecommendSwitchStart";
        trackLog.params = str;
        trackLog.addTag1(str2);
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackOrangeConfigUpdate(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb832bf", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DxContainerActivity.PARAMS_NAMESPACE, str);
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "orangeConfigUpdate";
        trackLog.params = f.a(hashMap);
        trackLog.result = str2;
        cgh.a(trackLog);
    }

    public static void trackQueryRecommendStatusLog(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae355a76", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("recommendSwitch", str);
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "queryRecommendSwitch";
        trackLog.params = str4;
        trackLog.result = f.a(hashMap);
        trackLog.addTag1(str2);
        trackLog.addTag2(str3);
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackQuerySupportLog(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11af369b", new Object[]{str, new Boolean(z), str2});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "querySupportAuth";
        trackLog.params = str;
        trackLog.msg = str2;
        if (!z) {
            i = -1;
        }
        trackLog.code = i;
        cgh.a(trackLog);
    }

    public static void trackUpdateRecommendStatusEnd(Context context, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a50c68", new Object[]{context, new Boolean(z), str, str2});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "updateRecommendApiEnd";
        trackLog.result = str;
        if (!z) {
            i = -1;
        }
        trackLog.code = i;
        trackLog.msg = str2;
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public static void trackUpdateRecommendStatusStart(Context context, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65a6a3", new Object[]{context, new Boolean(z), new Boolean(z2), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY, Boolean.valueOf(z));
        hashMap.put("recommendSwitch", Boolean.valueOf(z2));
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "updateRecommendApiStart";
        trackLog.params = f.a(hashMap);
        trackLog.msg = str;
        trackLog.addTag3(genLocalNoUidCacheTag(context));
        cgh.a(trackLog);
    }

    public void addTag1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2d80a9", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(0, str);
    }

    public void addTag10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241e73a9", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(9, str);
    }

    public void addTag2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f19ea", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(1, str);
    }

    public void addTag3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d190b32b", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(2, str);
    }

    public void addTag4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc24c6c", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(3, str);
    }

    public void addTag5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f3e5ad", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(4, str);
    }

    public void addTag6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0257eee", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(5, str);
    }

    public void addTag7(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa57182f", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(6, str);
    }

    public void addTag8(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4488b170", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(7, str);
    }

    public void addTag9(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eba4ab1", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.set(8, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }

    public String getLayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e50923e", new Object[]{this}) : this.layer;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.msg;
    }

    public String getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this}) : this.params;
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this}) : this.result;
    }

    public long getRt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e17c4b3", new Object[]{this})).longValue() : this.rt;
    }

    public String getService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afa701da", new Object[]{this}) : this.service;
    }

    public List<String> getTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("248771f1", new Object[]{this}) : this.tags;
    }

    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.ts;
    }

    public String getVerifyToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d908656f", new Object[]{this}) : this.verifyToken;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.code = i;
        }
    }

    public void setLayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389a4b60", new Object[]{this, str});
        } else {
            this.layer = str;
        }
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.msg = str;
        }
    }

    public void setParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else {
            this.params = str;
        }
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.result = str;
        }
    }

    public void setRt(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8529759", new Object[]{this, new Long(j)});
        } else {
            this.rt = j;
        }
    }

    public void setService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3cc244", new Object[]{this, str});
        } else {
            this.service = str;
        }
    }

    public void setTags(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
        } else {
            this.tags = list;
        }
    }

    public void setTs(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706a353c", new Object[]{this, new Long(j)});
        } else {
            this.ts = j;
        }
    }

    public void setVerifyToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbb774f", new Object[]{this, str});
        } else {
            this.verifyToken = str;
        }
    }

    @Override // tb.cgd
    public void trackGetScenePermissionLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87d959", new Object[]{this, str, str2, str3});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "getScenePermissionStatus";
        trackLog.params = str2;
        trackLog.code = 0;
        trackLog.addTag8(str3);
        cgh.a(trackLog);
    }

    @Override // tb.cgd
    public void trackRemoteAuthGrantedLog(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38d3cb0", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "grantSceneAuthStatusByRemote";
        trackLog.params = str2;
        trackLog.code = i;
        trackLog.addTag8(str3);
        cgh.a(trackLog);
    }

    @Override // tb.cgd
    public void trackSetScenePermissionLog(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acaa0ad2", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = AttributionReporter.SYSTEM_PERMISSION;
        trackLog.method = "setScenePermissionStatus";
        trackLog.params = str2;
        trackLog.code = i;
        trackLog.addTag8(str3);
        cgh.a(trackLog);
    }
}
