package com.taobao.android.tschedule.task;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.i;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.MtopTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.jkq;
import tb.jlv;
import tb.jlw;
import tb.jlx;
import tb.jmc;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.jmj;
import tb.kge;
import tb.mfk;

/* loaded from: classes6.dex */
public class MtopScheduleTask extends ScheduleTask<MtopTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long COMMIT_FAILURE_TIME_OUT = 3000;
    private static final String TAG = "TS.mtop";
    private long lastFailureCommit;

    static {
        kge.a(-144502569);
    }

    public static /* synthetic */ Object ipc$super(MtopScheduleTask mtopScheduleTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ long access$000(MtopScheduleTask mtopScheduleTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("306946e3", new Object[]{mtopScheduleTask})).longValue() : mtopScheduleTask.lastFailureCommit;
    }

    public static /* synthetic */ long access$002(MtopScheduleTask mtopScheduleTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f69a3be7", new Object[]{mtopScheduleTask, new Long(j)})).longValue();
        }
        mtopScheduleTask.lastFailureCommit = j;
        return j;
    }

    public static /* synthetic */ String access$100(MtopScheduleTask mtopScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("108f2666", new Object[]{mtopScheduleTask, str}) : mtopScheduleTask.getUCode(str);
    }

    public static /* synthetic */ ScheduleProtocolCallback.ScheduleProtocolCallbackType access$200(MtopScheduleTask mtopScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleProtocolCallback.ScheduleProtocolCallbackType) ipChange.ipc$dispatch("2198322b", new Object[]{mtopScheduleTask, str}) : mtopScheduleTask.getCallbackType(str);
    }

    public MtopScheduleTask(String str, MtopTaskContext mtopTaskContext) {
        super(str, mtopTaskContext);
        this.lastFailureCommit = 0L;
        init();
    }

    public MtopScheduleTask(String str, MtopTaskContext mtopTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, mtopTaskContext, scheduleProtocolCallback);
        this.lastFailureCommit = 0L;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.taskContext == 0 || ((MtopTaskContext) this.taskContext).params == null) {
        } else {
            MtopTaskContext.MtopTaskParams mtopTaskParams = ((MtopTaskContext) this.taskContext).params;
            if (mtopTaskParams.apiParams != null) {
                prepareTaskParams(((MtopTaskContext) this.taskContext).params.apiParams);
            }
            if (mtopTaskParams.mtopIgnore == null) {
                mtopTaskParams.mtopIgnore = new ArrayList(1);
            }
            mtopTaskParams.mtopIgnore.add("prefetch");
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(final String str, Object... objArr) {
        String str2;
        String str3;
        String str4;
        String str5;
        JsonTypeEnum jsonType;
        JSONObject parseTaskParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f156e9", new Object[]{this, str, objArr});
            return;
        }
        final MtopTaskContext.MtopTaskParams mtopTaskParams = ((MtopTaskContext) this.taskContext).params;
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(mtopTaskParams.api);
            mtopRequest.setVersion(mtopTaskParams.version);
            mtopRequest.setNeedSession(mtopTaskParams.needSession);
            mtopRequest.setNeedEcode(mtopTaskParams.needEcode);
            Intent intent = null;
            if (mtopTaskParams.apiParams == null || mtopTaskParams.apiParams.isEmpty()) {
                str3 = "url";
                str4 = null;
            } else {
                Intent intent2 = (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Intent)) ? null : (Intent) objArr[0];
                if (mtopTaskParams.parseUrlFirst) {
                    str3 = "url";
                    parseTaskParams = parseKangarooTaskParams(str, mtopTaskParams.apiParams, mtopTaskParams.queryBlackList, intent2, mtopTaskParams.timeContent);
                    str4 = parseTaskParams.getString(str3);
                } else {
                    str3 = "url";
                    parseTaskParams = parseTaskParams(str, mtopTaskParams.apiParams, mtopTaskParams.queryBlackList, intent2, mtopTaskParams.timeContent);
                    str4 = null;
                }
                if (parseTaskParams != null) {
                    parseTaskParams.put("prefetch", "true");
                    mtopRequest.setData(JSONObject.toJSONString(parseTaskParams));
                }
            }
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, e.b()), mtopRequest, e.c());
            if (!TextUtils.isEmpty(mtopTaskParams.requestType)) {
                build.mo1305reqMethod("post".equalsIgnoreCase(mtopTaskParams.requestType) ? MethodEnum.POST : MethodEnum.GET);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.unit)) {
                build.mo1328setUnitStrategy(mtopTaskParams.unit);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.jsonType) && (jsonType = getJsonType(mtopTaskParams.jsonType)) != null) {
                build.mo1315setJsonType(jsonType);
            }
            if (mtopTaskParams.headers != null && !mtopTaskParams.headers.isEmpty()) {
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = (Intent) objArr[0];
                }
                Intent intent3 = intent;
                if (mtopTaskParams.parseUrlFirst && str4 != null) {
                    build.mo1297headers(parseTaskHeaders(str4, mtopTaskParams.headers, mtopTaskParams.queryBlackList, intent3));
                } else {
                    build.mo1297headers(parseTaskHeaders(str, mtopTaskParams.headers, mtopTaskParams.queryBlackList, intent3));
                }
            }
            if (!TextUtils.isEmpty(mtopTaskParams.openBizCode)) {
                build.setOpenBiz(mtopTaskParams.openBizCode);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.openBizData)) {
                build.setOpenBizData(mtopTaskParams.openBizData);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.miniAppkey)) {
                build.setMiniAppKey(mtopTaskParams.miniAppkey);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.requestAppkey)) {
                build.mtopProp.requestSourceAppKey = mtopTaskParams.requestAppkey;
            }
            if (!TextUtils.isEmpty(mtopTaskParams.openAppKey)) {
                build.mtopProp.isInnerOpen = true;
                build.mo1292addOpenApiParams(mtopTaskParams.openAppKey, mtopTaskParams.authCode);
            }
            if (!TextUtils.isEmpty(mtopTaskParams.customHost)) {
                build.mo1313setCustomDomain(mtopTaskParams.customHost);
            }
            if (jmi.b()) {
                jmj.a().a(build);
            }
            final jlv jlxVar = mtopTaskParams.urlSoftMatch ? new jlx(mtopTaskParams.urlSoftMatchKey, mtopTaskParams.urlSoftMatchWhitelistKey) : new jlw();
            String uuid = UUID.randomUUID().toString();
            final TScheduleMtopListener tScheduleMtopListener = new TScheduleMtopListener(str, uuid);
            String str6 = str3;
            try {
                MtopPrefetch.IPrefetchCallback iPrefetchCallback = new MtopPrefetch.IPrefetchCallback() { // from class: com.taobao.android.tschedule.task.MtopScheduleTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
                        if (r21.equals("TYPE_MISS") != false) goto L19;
                     */
                    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void onPrefetch(java.lang.String r21, java.util.HashMap<java.lang.String, java.lang.String> r22) {
                        /*
                            Method dump skipped, instructions count: 534
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.MtopScheduleTask.AnonymousClass1.onPrefetch(java.lang.String, java.util.HashMap):void");
                    }
                };
                if (mtopTaskParams.asyncCallback) {
                    build.mo1296handler(i.b().a());
                }
                build.mo1301prefetchComparator((MtopPrefetch.IPrefetchComparator) jlxVar).registerListener((IRemoteListener) tScheduleMtopListener).mo1299prefetch(mtopTaskParams.timeout, mtopTaskParams.mtopIgnore, iPrefetchCallback).startRequest();
                HashMap hashMap = new HashMap();
                hashMap.put(str6, jmi.a(str));
                hashMap.put("fullUrl", str);
                hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, uuid);
                hashMap.put("data", mtopRequest.getData());
                jmc.a("downgrade", mtopTaskParams.api, mtopTaskParams.version, "TSchedule", mfk.MTOP_REQUEST, hashMap);
                str5 = "start request Mtop。api = " + mtopTaskParams.api;
                str2 = TAG;
            } catch (Throwable th) {
                th = th;
                str2 = TAG;
            }
            try {
                jkq.a(str2, str5);
            } catch (Throwable th2) {
                th = th2;
                jkq.a(str2, "execute ScheduleTask error, type=" + ((MtopTaskContext) this.taskContext).type, th);
                jmc.a("downgrade", mtopTaskParams.api, mtopTaskParams.version, "TSchedule", ((MtopTaskContext) this.taskContext).type, null, "TS_MTOP_EXCEPTION", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = TAG;
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this}) : ScheduleTask.THREAD_TYPE.getType(((MtopTaskContext) this.taskContext).params.workThread);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        if (this.taskContext == 0 || ((MtopTaskContext) this.taskContext).params == null || !jmh.a(jmg.SWITCH_KEY_ENABLE_TASK_MTOP, false) || TextUtils.isEmpty(((MtopTaskContext) this.taskContext).params.api) || TextUtils.isEmpty(((MtopTaskContext) this.taskContext).params.version) || TextUtils.isEmpty(str) || str.contains("hybrid=true")) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", jmi.a(str));
        hashMap.put("fullUrl", str);
        if (z) {
            jmc.a("downgrade", ((MtopTaskContext) this.taskContext).params.api, ((MtopTaskContext) this.taskContext).params.version, "TSchedule", "mtop_validate", hashMap);
        } else if (this.taskContext == 0 || ((MtopTaskContext) this.taskContext).params == null) {
            jmc.a("downgrade", "", "", "TSchedule", "mtop_validate", hashMap, "TS_MTOP_INVALIDATE", null);
        } else {
            jmc.a("downgrade", ((MtopTaskContext) this.taskContext).params.api, ((MtopTaskContext) this.taskContext).params.version, "TSchedule", "mtop_validate", hashMap, "TS_MTOP_INVALIDATE", null);
        }
        return z;
    }

    private ScheduleProtocolCallback.ScheduleProtocolCallbackType getCallbackType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleProtocolCallback.ScheduleProtocolCallbackType) ipChange.ipc$dispatch("fb0616e0", new Object[]{this, str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -959856524:
                if (str.equals("TYPE_FULL")) {
                    c = 4;
                    break;
                }
                break;
            case -959659295:
                if (str.equals("TYPE_MISS")) {
                    c = 1;
                    break;
                }
                break;
            case 107585774:
                if (str.equals("TYPE_HIT")) {
                    c = 0;
                    break;
                }
                break;
            case 306173160:
                if (str.equals(MtopPrefetch.IPrefetchCallback.PrefetchCallbackType.TYPE_CLEAR)) {
                    c = 2;
                    break;
                }
                break;
            case 970109380:
                if (str.equals("TYPE_EXPIRE")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT;
        }
        if (c == 1) {
            return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS;
        }
        if (c == 2) {
            return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_CLEAR;
        }
        if (c == 3) {
            return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_EXPIRE;
        }
        if (c == 4) {
            return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_FULL;
        }
        return ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS;
    }

    private String getUCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3a54a63", new Object[]{this, str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -959856524:
                if (str.equals("TYPE_FULL")) {
                    c = 4;
                    break;
                }
                break;
            case -959659295:
                if (str.equals("TYPE_MISS")) {
                    c = 1;
                    break;
                }
                break;
            case 107585774:
                if (str.equals("TYPE_HIT")) {
                    c = 0;
                    break;
                }
                break;
            case 306173160:
                if (str.equals(MtopPrefetch.IPrefetchCallback.PrefetchCallbackType.TYPE_CLEAR)) {
                    c = 2;
                    break;
                }
                break;
            case 315212499:
                if (str.equals("TYPE_MERGE")) {
                    c = 5;
                    break;
                }
                break;
            case 970109380:
                if (str.equals("TYPE_EXPIRE")) {
                    c = 3;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? "TS_MTOP_OTHER" : "TS_MTOP_MERGE" : "TS_MTOP_FULL" : "TS_MTOP_EXPIRE" : "TS_MTOP_CLEAR" : "TS_MTOP_MISS" : "TS_MTOP_HIT";
    }

    private JsonTypeEnum getJsonType(String str) {
        JsonTypeEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonTypeEnum) ipChange.ipc$dispatch("a20c6738", new Object[]{this, str});
        }
        for (JsonTypeEnum jsonTypeEnum : JsonTypeEnum.values()) {
            if (TextUtils.equals(str, jsonTypeEnum.getJsonType())) {
                return jsonTypeEnum;
            }
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public class TScheduleMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long mtopFinishTime = -1;
        public String requestId;
        public String targetUrl;

        static {
            kge.a(964079930);
            kge.a(-525336021);
        }

        public TScheduleMtopListener(String str, String str2) {
            this.targetUrl = str;
            this.requestId = str2;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", jmi.a(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, this.requestId);
            jmc.a("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap, "onSystemError", null);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", jmi.a(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, this.requestId);
            jmc.a("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", jmi.a(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, this.requestId);
            jmc.a("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap, "onError", null);
        }
    }
}
