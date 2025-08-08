package com.taobao.android.tschedule.task;

import android.content.Intent;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Network;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.entity.StringParam;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.cache.TScheduleHttpCache;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.HttpTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.android.tscheduleprotocol.TScheduleHTTPProtocol;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import java.util.ArrayList;
import java.util.Map;
import tb.jmc;
import tb.jmg;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class HttpScheduleTask extends ScheduleTask<HttpTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.http";
    private static TScheduleHttpCache cache;
    public Network network;

    public static /* synthetic */ Object ipc$super(HttpScheduleTask httpScheduleTask, String str, Object... objArr) {
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

    public static /* synthetic */ Response access$000(HttpScheduleTask httpScheduleTask, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Response) ipChange.ipc$dispatch("bf59abda", new Object[]{httpScheduleTask, str, objArr}) : httpScheduleTask.syncReq(str, objArr);
    }

    public static /* synthetic */ TScheduleHttpCache access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TScheduleHttpCache) ipChange.ipc$dispatch("f2791176", new Object[0]) : cache;
    }

    static {
        kge.a(-119624809);
        cache = new TScheduleHttpCache();
    }

    public static void fetchData(Object obj, ScheduleCacheCallBack scheduleCacheCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4707b345", new Object[]{obj, scheduleCacheCallBack});
        } else {
            cache.fetch(obj, scheduleCacheCallBack, new Object[0]);
        }
    }

    public HttpScheduleTask(String str, HttpTaskContext httpTaskContext) {
        super(str, httpTaskContext);
        this.network = new DegradableNetwork(e.b());
        init();
    }

    public HttpScheduleTask(String str, HttpTaskContext httpTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, httpTaskContext, scheduleProtocolCallback);
        this.network = new DegradableNetwork(e.b());
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.taskContext == 0 || ((HttpTaskContext) this.taskContext).params == null || ((HttpTaskContext) this.taskContext).params.apiParams == null) {
        } else {
            prepareTaskParams(((HttpTaskContext) this.taskContext).params.apiParams);
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(final String str, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f156e9", new Object[]{this, str, objArr});
            return;
        }
        AsyncTask asyncTask = new AsyncTask() { // from class: com.taobao.android.tschedule.task.HttpScheduleTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.AsyncTask
            public /* synthetic */ Object doInBackground(Object[] objArr2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr2}) : a(objArr2);
            }

            public Void a(Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("f8783014", new Object[]{this, objArr2});
                }
                String str2 = ((HttpTaskContext) HttpScheduleTask.this.taskContext).params.url;
                try {
                    HttpScheduleTask.access$100().finish((Object) str2, HttpScheduleTask.access$000(HttpScheduleTask.this, str, objArr), Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
                } catch (Throwable th) {
                    try {
                        jmc.a("downgrade", str2, "1.0", "TSchedule", ((HttpTaskContext) HttpScheduleTask.this.taskContext).type, null, "TS_HTTP_EXCEPTION", th.getMessage());
                        HttpScheduleTask.access$100().finish((Object) str2, (Response) null, Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
                    } catch (Throwable th2) {
                        HttpScheduleTask.access$100().finish((Object) str2, (Response) null, Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
                        throw th2;
                    }
                }
                return null;
            }
        };
        cache.prefetch((Object) ((HttpTaskContext) this.taskContext).params.url, asyncTask, this.taskCallback);
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this}) : ScheduleTask.THREAD_TYPE.CURRENT;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue() : (this.taskContext == 0 || ((HttpTaskContext) this.taskContext).params == null || ((HttpTaskContext) this.taskContext).params.url == null || ((HttpTaskContext) this.taskContext).params.url == "" || !jmh.a(jmg.SWITCH_KEY_ENABLE_TASK_HTTP, false)) ? false : true;
    }

    private Response syncReq(String str, Object... objArr) {
        Map<String, String> headers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("aa63499f", new Object[]{this, str, objArr});
        }
        HttpTaskContext.HttpParams httpParams = ((HttpTaskContext) this.taskContext).params;
        if (StringUtils.equals(((HttpTaskContext) this.taskContext).bizCode, "miniApp")) {
            TScheduleHTTPProtocol c = b.a().c();
            if (c == null || (headers = c.getHeaders(e.b(), e.c(), e.d())) == null || headers.isEmpty()) {
                return null;
            }
            try {
                TBLocationDTO b = TBLocationClient.b();
                headers.put("X-Shard", "loc=" + b.longitude + "," + b.latitude);
            } catch (Throwable unused) {
            }
        }
        RequestImpl requestImpl = new RequestImpl(httpParams.url);
        if (httpParams.header != null && !httpParams.header.isEmpty()) {
            for (Map.Entry<String, String> entry : httpParams.header.entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (httpParams.apiParams != null && !httpParams.apiParams.isEmpty()) {
            JSONObject parseTaskParams = parseTaskParams(str, httpParams.apiParams, httpParams.queryBlackList, (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Intent)) ? null : (Intent) objArr[0]);
            if (parseTaskParams != null) {
                parseTaskParams.put("prefetch", "true");
                ArrayList arrayList = new ArrayList();
                for (String str2 : parseTaskParams.keySet()) {
                    arrayList.add(new StringParam(str2, parseTaskParams.getString(str2)));
                }
                requestImpl.setParams(arrayList);
            }
        }
        requestImpl.setMethod(httpParams.requestType);
        requestImpl.setCharset(httpParams.charset);
        requestImpl.setFollowRedirects(httpParams.followRedirects);
        requestImpl.setRetryTime(httpParams.retryTime);
        cache.saveReqData(httpParams.url, requestImpl);
        return this.network.syncSend(requestImpl, null);
    }
}
