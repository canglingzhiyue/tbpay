package com.alibaba.security.realidentity.service.track.model;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.ui.webview.jsbridge.LivenessApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public class TrackLog implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String layer;
    public String method;
    public String msg;
    public String params;
    public String result;
    public String service;
    public List<String> tags;
    public String verifyToken;
    public int code = 0;
    public long ts = System.currentTimeMillis();
    public long rt = 0;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f3522a = 0;
        public static final int b = -1;
        public static final int c = -2;
    }

    public static TrackLog create(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("63284364", new Object[]{str, str2, str3, str4, str5, str6});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = str2;
        trackLog.method = str3;
        trackLog.msg = str4;
        trackLog.params = str5;
        trackLog.result = str6;
        return trackLog;
    }

    public static TrackLog createBioActivityEnterLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("cee22021", new Object[]{str, str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.i);
        trackLog.setParams(str);
        trackLog.setMsg(str2);
        return trackLog;
    }

    public static TrackLog createBioActivityExitLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f2de0487", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("exit");
        trackLog.setMsg(str);
        return trackLog;
    }

    public static TrackLog createBioGuidePageLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("630537cd", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.m);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createBioMonitorAlgoStartLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f0da234f", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.b);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createBioMonitorExpLog(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("3b7db5b2", new Object[]{new Integer(i), str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("exception");
        trackLog.addTag1(String.valueOf(i));
        trackLog.setMsg(str);
        return trackLog;
    }

    public static TrackLog createBioMonitorStartLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("8fff5d2c", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("start");
        return trackLog;
    }

    public static TrackLog createBioMonitorUploadFinishLog(CommonTrackResult commonTrackResult, boolean z, long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("69c0c06f", new Object[]{commonTrackResult, new Boolean(z), new Long(j)});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.d);
        trackLog.setResult(b.a(commonTrackResult));
        if (!z) {
            i = -1;
        }
        trackLog.setCode(i);
        trackLog.setRt(j);
        return trackLog;
    }

    public static TrackLog createBioMonitorUploadStartLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("436a3eeb", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("uploadStart");
        return trackLog;
    }

    public static TrackLog createBioPrivacyPageLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("701fc959", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.n);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createClassInvokedMonitor(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f1b604fe", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("className", str);
        hashMap.put(FluidException.METHOD_NAME, str2);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.a0);
        trackLog.setParams(b.a((Object) hashMap));
        return trackLog;
    }

    public static TrackLog createCollectSensorEndLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("78372701", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityName", str);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.e0);
        trackLog.setResult(b.b(hashMap));
        return trackLog;
    }

    public static TrackLog createCollectSensorStartLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("71eee788", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityName", str);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.d0);
        trackLog.setCode(0);
        trackLog.setParams(b.b(hashMap));
        return trackLog;
    }

    public static TrackLog createCtidAppEndLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("3ae0d9b0", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.V;
        trackLog.result = str;
        return trackLog;
    }

    public static TrackLog createCtidAppStartLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("30f6aa77", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.U;
        trackLog.params = str;
        return trackLog;
    }

    public static TrackLog createCtidVisitLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("dfb0f6f1", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.W);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createDataCollectionExceptionLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("dd7c9bd9", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("exception");
        trackLog.setMethod(g4.b.M);
        trackLog.setMsg(str);
        return trackLog;
    }

    public static TrackLog createDynamicBegin(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("46142bb8", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.B;
        trackLog.msg = str;
        trackLog.params = str2;
        trackLog.result = str3;
        return trackLog;
    }

    public static TrackLog createDynamicEnd(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("89a77486", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.C;
        trackLog.msg = str;
        trackLog.params = str2;
        trackLog.result = str3;
        return trackLog;
    }

    public static TrackLog createFinishCameraParametersLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("4ed5a1ec", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.r);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createMagicWindowLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("3c04b48f", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.j);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createNetWorkCostMonitor(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("9ceeef41", new Object[]{str, new Long(j), str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api", str);
        hashMap.put("costTime", Long.valueOf(j));
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("netWork");
        trackLog.setMethod("costTime");
        trackLog.setRt(j);
        trackLog.setMsg(str2);
        trackLog.setParams(b.a((Object) hashMap));
        return trackLog;
    }

    public static TrackLog createOssUploadFileBeginLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("82e5e1c7", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.R;
        trackLog.msg = "";
        trackLog.params = str;
        trackLog.result = "";
        return trackLog;
    }

    public static TrackLog createOssUploadFileEndLog(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7086b1d3", new Object[]{str, str2, new Long(j)});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.S;
        trackLog.msg = "";
        trackLog.params = str;
        trackLog.result = str2;
        trackLog.setRt(j);
        return trackLog;
    }

    public static TrackLog createRemoteModelBeginLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("964ee0e6", new Object[]{str, str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = "remote";
        trackLog.method = g4.b.y;
        trackLog.params = str2;
        return trackLog;
    }

    public static TrackLog createRemoteModelEndLog(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("800bbb57", new Object[]{str, new Integer(i), str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.code = i;
        trackLog.layer = str;
        trackLog.service = "remote";
        trackLog.method = g4.b.z;
        trackLog.result = str2;
        return trackLog;
    }

    public static TrackLog createRemoteSoBeginLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("c7145a19", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = str;
        trackLog.service = "remote";
        trackLog.method = g4.b.w;
        return trackLog;
    }

    public static TrackLog createRemoteSoEndLog(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("836fd8e", new Object[]{str, new Integer(i), str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.code = i;
        trackLog.layer = str;
        trackLog.service = "remote";
        trackLog.method = g4.b.x;
        trackLog.result = str2;
        return trackLog;
    }

    public static TrackLog createRiskEndLog(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("bc24f643", new Object[]{new Integer(i), new Boolean(z), str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isNetworkError", Boolean.valueOf(z));
        hashMap.put("errorCode", str);
        hashMap.put("errorMsg", str2);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.c0);
        trackLog.setCode(i);
        trackLog.setResult(b.b(hashMap));
        return trackLog;
    }

    public static TrackLog createRiskStartLog(boolean z, List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("88eafee8", new Object[]{new Boolean(z), list, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isSessionless", Boolean.valueOf(z));
        hashMap.put("actionLogKeys", b.a(list));
        hashMap.put("eventCode", str);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.b0);
        trackLog.setCode(0);
        trackLog.setParams(b.b(hashMap));
        return trackLog;
    }

    public static TrackLog createSdkExceptionLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("3f70b1eb", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "exception";
        trackLog.method = "exception";
        trackLog.msg = str;
        trackLog.params = str2;
        trackLog.result = str3;
        return trackLog;
    }

    public static TrackLog createSdkH5Log(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("be6b19a5", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = "h5";
        trackLog.service = g4.c.h;
        trackLog.method = str;
        trackLog.msg = str2;
        trackLog.params = str3;
        return trackLog;
    }

    public static TrackLog createSdkLoadingEnterLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("83e47e8", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "remote";
        trackLog.method = g4.b.u;
        trackLog.params = str;
        return trackLog;
    }

    public static TrackLog createSdkLoadingExitLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f4a25b74", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "remote";
        trackLog.method = g4.b.v;
        return trackLog;
    }

    public static TrackLog createSdkWebViewEnterLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7fb9ca2b", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "webview";
        trackLog.method = g4.b.i;
        trackLog.params = str;
        return trackLog;
    }

    public static TrackLog createSdkWebViewErrorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("4c7df1c7", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "webview";
        trackLog.method = "error";
        trackLog.msg = str;
        trackLog.params = str2;
        trackLog.result = str3;
        return trackLog;
    }

    public static TrackLog createSdkWebViewExitLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7f7f9211", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "webview";
        trackLog.method = "exit";
        return trackLog;
    }

    public static TrackLog createSdkWebViewLoadLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("a02385bb", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "webview";
        trackLog.method = "load";
        trackLog.msg = str;
        trackLog.params = str2;
        trackLog.result = str3;
        return trackLog;
    }

    public static TrackLog createSimpleSdk(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("20a859b2", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("class", str);
        hashMap.put("method", str2);
        hashMap.put("extras", str3);
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = g4.c.f;
        trackLog.method = "";
        trackLog.msg = "";
        trackLog.params = b.a((Object) hashMap);
        trackLog.result = "";
        return trackLog;
    }

    public static TrackLog createSoundClickLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("b97b3b03", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = g4.c.d;
        trackLog.method = g4.b.f;
        trackLog.msg = "";
        trackLog.params = str;
        trackLog.result = "";
        return trackLog;
    }

    public static TrackLog createStartBeginLog(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("31e4fc0b", new Object[]{str, str2, new Boolean(z)});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.s);
        HashMap hashMap = new HashMap();
        hashMap.put("startType", str);
        hashMap.put("fromSouce", str2);
        hashMap.put("isCustomUi", Integer.valueOf(z ? 1 : 0));
        trackLog.setParams(b.b(hashMap));
        trackLog.setMsg("call start");
        trackLog.setResult("");
        trackLog.addTag1(str);
        return trackLog;
    }

    public static TrackLog createStartCameraParametersLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("2be4b03", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.q);
        trackLog.setParams(str);
        return trackLog;
    }

    public static TrackLog createStartEndLog(String str, String str2, long j, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("346b520b", new Object[]{str, str2, new Long(j), str3, str4, str5});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("identity");
        trackLog.setMethod(g4.b.t);
        trackLog.setParams("{\"startType\":" + str + riy.BLOCK_END_STR);
        trackLog.setMsg(str2);
        HashMap hashMap = new HashMap();
        hashMap.put(LivenessApi.NAME_EXIT_INFO, RPTrack.a());
        hashMap.put("state", str3);
        hashMap.put("errorCode", str4);
        hashMap.put("subCode", str5);
        hashMap.put("message", str2);
        trackLog.setResult(b.a((Object) hashMap));
        trackLog.setRt(System.currentTimeMillis() - j);
        trackLog.addTag1(str);
        trackLog.addTag2(str3);
        trackLog.addTag3(str4);
        return trackLog;
    }

    public static TrackLog createTakePhotoFinishLog(CommonTrackResult commonTrackResult, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("e80138b3", new Object[]{commonTrackResult, new Boolean(z)});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("takePhoto");
        trackLog.setMethod("finish");
        trackLog.setResult(b.a(commonTrackResult));
        if (!z) {
            i = -1;
        }
        trackLog.setCode(i);
        return trackLog;
    }

    public static TrackLog createTakePhotoStartLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("65628b8b", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("takePhoto");
        trackLog.setMethod("start");
        return trackLog;
    }

    public static TrackLog createTakePhotoUploadLog(CommonTrackResult commonTrackResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("c1c2d51", new Object[]{commonTrackResult});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService("takePhoto");
        trackLog.setMethod(g4.b.d);
        return trackLog;
    }

    public static TrackLog createTryAgainLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("1db7eb39", new Object[0]);
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "remote";
        trackLog.method = g4.b.A;
        return trackLog;
    }

    public static TrackLog createVmEncryptLog(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("dbca58e5", new Object[]{new Integer(i), str, str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "identity";
        trackLog.method = g4.b.T;
        trackLog.code = i;
        trackLog.msg = str;
        trackLog.result = str2;
        return trackLog;
    }

    public static TrackLog createWukongInitLog(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("c56ca29f", new Object[]{new Boolean(z), str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(z));
        hashMap.put("message", str);
        hashMap.put("processID", str2);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.i);
        trackLog.setMethod(g4.b.f0);
        trackLog.setResult(b.b(hashMap));
        return trackLog;
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

    public static TrackLog recordException(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f446970f", new Object[]{new Boolean(z), new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isEmpty", Boolean.toString(z));
        hashMap.put("size", Integer.toString(i));
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod("exception");
        trackLog.setMsg("record exception");
        trackLog.setParams(b.b(hashMap));
        return trackLog;
    }

    public static TrackLog startRecordVideo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7c07ebd6", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stackTrace", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isRecording", str3);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.Y);
        trackLog.setMsg(str);
        trackLog.setParams(b.b(hashMap));
        trackLog.setResult(b.b(hashMap2));
        return trackLog;
    }

    public static TrackLog startShowDazzleView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("12bf8aa4", new Object[]{str, str2, str3});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.o);
        trackLog.setMsg(str3);
        trackLog.setParams(str);
        trackLog.setResult(str2);
        return trackLog;
    }

    public static TrackLog stopRecordVideo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7e4e5f76", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stackTrace", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isRecording", str3);
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.Z);
        trackLog.setMsg(str);
        trackLog.setParams(b.b(hashMap));
        trackLog.setResult(b.b(hashMap2));
        return trackLog;
    }

    public static TrackLog stopShowDazzleView(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("7bf64ace", new Object[]{str, str2});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.setLayer(g4.a.f3423a);
        trackLog.setService(g4.c.d);
        trackLog.setMethod(g4.b.p);
        trackLog.setParams(str2);
        trackLog.setMsg(str);
        return trackLog;
    }

    public void addTag1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2d80a9", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(0, str);
    }

    public void addTag10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241e73a9", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(9, str);
    }

    public void addTag2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f19ea", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(1, str);
    }

    public void addTag3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d190b32b", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(2, str);
    }

    public void addTag4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc24c6c", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(3, str);
    }

    public void addTag5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f3e5ad", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(4, str);
    }

    public void addTag6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0257eee", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(5, str);
    }

    public void addTag7(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa57182f", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(6, str);
    }

    public void addTag8(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4488b170", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(7, str);
    }

    public void addTag9(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eba4ab1", new Object[]{this, str});
            return;
        }
        initTags();
        this.tags.add(8, str);
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

    public static TrackLog createSdkExceptionLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackLog) ipChange.ipc$dispatch("f019877f", new Object[]{str});
        }
        TrackLog trackLog = new TrackLog();
        trackLog.layer = g4.a.f3423a;
        trackLog.service = "exception";
        trackLog.method = "exception";
        trackLog.msg = "";
        trackLog.params = str;
        trackLog.result = "";
        return trackLog;
    }
}
