package com.taobao.unit.center.sync.syncable;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyTemplateSyncRequest;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyTemplateSyncResponse;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.TemplateRequest;
import com.taobao.unit.center.sync.mtop.MtopTaobaoAlimpBentleyTemplateSingleRequest;
import com.taobao.unit.center.sync.mtop.MtopTaobaoAlimpBentleyTemplateSingleResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import org.json.JSONObject;
import tb.kge;
import tb.rul;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0004JW\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000226\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00180\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#JB\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00180&2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\"H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Lcom/taobao/unit/center/sync/model/TemplateRequest;", "Lorg/json/JSONObject;", "()V", "curLocalAllTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getCurLocalAllTimeStamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "setCurLocalAllTimeStamp", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "curLocalIncTimeStamp", "getCurLocalIncTimeStamp", "setCurLocalIncTimeStamp", "isSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "taskExcuteCount", "Ljava/util/HashMap;", "", "Ljava/lang/Integer;", "taskSet", "Ljava/util/HashSet;", "doRemoteSingleSync", "", "req", "remoteSingleSyncFunc", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "templateId", InputFrame3.TYPE_RESPONSE, "allTimeStamp", "", "(Lcom/taobao/unit/center/sync/model/TemplateRequest;Lkotlin/jvm/functions/Function2;Ljava/lang/Long;)V", "doRemoteSync", "remoteSyncSuccessFunc", "Lkotlin/Function1;", "(Lcom/taobao/unit/center/sync/model/TemplateRequest;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "getLocalAllTimeStamp", "getLocalIncTimeStamp", "getRemoteAllTimeStamp", "getRemoteIncTimeStamp", "updateLocalAllTimeStamp", "timestamp", "updateLocalIncTimeStamp", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class TemplateSyncable implements ISyncable<TemplateRequest, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;
    private static TemplateSyncable instance;
    private AtomicLong curLocalAllTimeStamp = new AtomicLong(-1);
    private AtomicLong curLocalIncTimeStamp = new AtomicLong(-1);
    private final AtomicBoolean isSyncing = new AtomicBoolean(false);
    private final HashSet<String> taskSet = new HashSet<>();
    private final HashMap<String, Integer> taskExcuteCount = new HashMap<>();

    static {
        kge.a(2006064695);
        kge.a(1968354774);
        Companion = new Companion(null);
    }

    public static final /* synthetic */ TemplateSyncable access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateSyncable) ipChange.ipc$dispatch("f8ae8b07", new Object[0]) : instance;
    }

    public static final /* synthetic */ void access$setInstance$cp(TemplateSyncable templateSyncable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f235dc69", new Object[]{templateSyncable});
        } else {
            instance = templateSyncable;
        }
    }

    public final AtomicLong getCurLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("5c780695", new Object[]{this}) : this.curLocalAllTimeStamp;
    }

    public final void setCurLocalAllTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76638025", new Object[]{this, atomicLong});
            return;
        }
        q.c(atomicLong, "<set-?>");
        this.curLocalAllTimeStamp = atomicLong;
    }

    public final AtomicLong getCurLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("e4417052", new Object[]{this}) : this.curLocalIncTimeStamp;
    }

    public final void setCurLocalIncTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c74e08", new Object[]{this, atomicLong});
            return;
        }
        q.c(atomicLong, "<set-?>");
        this.curLocalIncTimeStamp = atomicLong;
    }

    public final AtomicBoolean isSyncing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4d0be124", new Object[]{this}) : this.isSyncing;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/TemplateSyncable$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-256446273);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final TemplateSyncable getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateSyncable) ipChange.ipc$dispatch("8ddfebec", new Object[]{this});
            }
            if (TemplateSyncable.access$getInstance$cp() == null) {
                synchronized (TemplateSyncable.class) {
                    if (TemplateSyncable.access$getInstance$cp() == null) {
                        TemplateSyncable.access$setInstance$cp(new TemplateSyncable());
                    }
                    t tVar = t.INSTANCE;
                }
            }
            TemplateSyncable access$getInstance$cp = TemplateSyncable.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                q.a();
            }
            return access$getInstance$cp;
        }
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70483625", new Object[]{this})).longValue();
        }
        if (this.curLocalAllTimeStamp.get() == -1) {
            this.curLocalAllTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_TEMPLATE_ALL_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localTemplateAllTs is " + this.curLocalAllTimeStamp);
        return this.curLocalAllTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b0ddac", new Object[]{this})).longValue();
        }
        String timeStamp = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_TEMPLATE_ALL_TIMESTAMP, "0");
        TLog.loge(SyncConstant.TAG, "remoteTemplateAllTs is " + timeStamp);
        q.a((Object) timeStamp, "timeStamp");
        return Long.parseLong(timeStamp);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fc1e308", new Object[]{this})).longValue();
        }
        if (this.curLocalIncTimeStamp.get() == -1) {
            this.curLocalIncTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_TEMPLATE_INC_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localTemplateIncTs is " + this.curLocalIncTimeStamp);
        return this.curLocalIncTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642a8a8f", new Object[]{this})).longValue();
        }
        String timeStamp = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_TEMPLATE_INC_TIMESTAMP, "1");
        TLog.loge(SyncConstant.TAG, "remoteTemplateIncTs is " + timeStamp);
        q.a((Object) timeStamp, "timeStamp");
        return Long.parseLong(timeStamp);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalAllTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b0c7e6", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalTemplateAllTs is " + j);
        this.curLocalAllTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_TEMPLATE_ALL_TIMESTAMP, j);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalIncTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66cb763", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalTemplateIncTs is " + j + ", called stack is " + Log.getStackTraceString(new Throwable()));
        this.curLocalIncTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_TEMPLATE_INC_TIMESTAMP, j);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void doRemoteSync(TemplateRequest req, rul<? super JSONObject, t> remoteSyncSuccessFunc, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a614337", new Object[]{this, req, remoteSyncSuccessFunc, l});
            return;
        }
        q.c(req, "req");
        q.c(remoteSyncSuccessFunc, "remoteSyncSuccessFunc");
        if (this.isSyncing.get()) {
            TLog.loge(SyncConstant.TAG, "Template syncing");
            return;
        }
        this.isSyncing.set(true);
        MtopTaobaoAlimpBentleyTemplateSyncRequest mtopTaobaoAlimpBentleyTemplateSyncRequest = new MtopTaobaoAlimpBentleyTemplateSyncRequest();
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setCount(req.getPageSize());
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setTimestamp(getLocalIncTimeStamp());
        mtopTaobaoAlimpBentleyTemplateSyncRequest.setUseNewSyncLogic("true");
        RemoteBusiness.build(ApplicationUtil.getApplication(), mtopTaobaoAlimpBentleyTemplateSyncRequest, ApplicationUtil.getTTID()).registerListener((IRemoteListener) new TemplateSyncable$doRemoteSync$1(this, remoteSyncSuccessFunc, l)).mo1340setBizId(72).startRequest(MtopTaobaoAlimpBentleyTemplateSyncResponse.class);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void doRemoteSingleSync(TemplateRequest req, ruw<? super Integer, ? super JSONObject, t> remoteSingleSyncFunc, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afca0a4", new Object[]{this, req, remoteSingleSyncFunc, l});
            return;
        }
        q.c(req, "req");
        q.c(remoteSingleSyncFunc, "remoteSingleSyncFunc");
        String valueOf = String.valueOf(req.getTemplateId());
        if (StringUtils.isEmpty(valueOf)) {
            TLog.loge(SyncConstant.TAG, "requestSingleTemplate 空templateId");
            return;
        }
        synchronized (this.taskSet) {
            if (this.taskSet.contains(valueOf)) {
                TLog.loge(SyncConstant.TAG, "requestSingleTemplate 重复请求 templateId=" + valueOf);
                return;
            }
            this.taskSet.add(valueOf);
            if (this.taskExcuteCount.containsKey(valueOf)) {
                if (q.a(this.taskExcuteCount.get(valueOf), new Integer(1))) {
                    this.taskExcuteCount.put(valueOf, new Integer(2));
                } else {
                    this.taskSet.remove(valueOf);
                    TLog.loge(SyncConstant.TAG, "补偿次数已到达2，不再请求补偿 templateId=" + valueOf);
                    return;
                }
            } else {
                this.taskExcuteCount.put(valueOf, new Integer(1));
            }
            t tVar = t.INSTANCE;
            TLog.loge(SyncConstant.TAG, "requestSingleTemplate called with: templateId = [" + valueOf + ']');
            MtopTaobaoAlimpBentleyTemplateSingleRequest mtopTaobaoAlimpBentleyTemplateSingleRequest = new MtopTaobaoAlimpBentleyTemplateSingleRequest();
            mtopTaobaoAlimpBentleyTemplateSingleRequest.setTemplateIds(valueOf);
            RemoteBusiness build = RemoteBusiness.build(ApplicationUtil.getApplication(), mtopTaobaoAlimpBentleyTemplateSingleRequest, ApplicationUtil.getTTID());
            build.registerListener((IRemoteListener) new TemplateSyncable$doRemoteSingleSync$2(this, valueOf, req, remoteSingleSyncFunc));
            build.startRequest(MtopTaobaoAlimpBentleyTemplateSingleResponse.class);
        }
    }
}
