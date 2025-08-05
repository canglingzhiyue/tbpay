package com.taobao.unit.center.sync.syncable;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyLayoutSyncRequest;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyLayoutSyncResponse;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.LayoutRequest;
import com.taobao.unit.center.sync.model.LayoutResponse;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0004JW\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000226\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00190\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#JB\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00190&2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010'J\u0006\u0010\u0007\u001a\u00020\"J\u0006\u0010\u000f\u001a\u00020\"J\b\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\"H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\"H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\"H\u0016J.\u0010/\u001a\u00020\u00192&\u00100\u001a\"\u0012\u0004\u0012\u000202\u0012\u0006\u0012\u0004\u0018\u00010\"01j\u0010\u0012\u0004\u0012\u000202\u0012\u0006\u0012\u0004\u0018\u00010\"`3R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00065"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Lcom/taobao/unit/center/sync/model/LayoutRequest;", "Lcom/taobao/unit/center/sync/model/LayoutResponse;", "()V", "baseTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getBaseTimeStamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "setBaseTimeStamp", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "curLocalAllTimeStamp", "getCurLocalAllTimeStamp", "setCurLocalAllTimeStamp", "defaultTimeStamp", "getDefaultTimeStamp", "setDefaultTimeStamp", "isSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pageSize", "", "getPageSize", "()I", "doRemoteSingleSync", "", "req", "remoteSingleSyncFunc", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "templateId", InputFrame3.TYPE_RESPONSE, "allTimeStamp", "", "(Lcom/taobao/unit/center/sync/model/LayoutRequest;Lkotlin/jvm/functions/Function2;Ljava/lang/Long;)V", "doRemoteSync", "remoteSyncSuccessFunc", "Lkotlin/Function1;", "(Lcom/taobao/unit/center/sync/model/LayoutRequest;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "getLocalAllTimeStamp", "getLocalIncTimeStamp", "getRemoteAllTimeStamp", "getRemoteIncTimeStamp", "updateLocalAllTimeStamp", "timestamp", "updateLocalIncTimeStamp", "updateTimeStamp", "timestamps", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class LayoutSyncable implements ISyncable<LayoutRequest, LayoutResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;
    private static LayoutSyncable instance;
    private AtomicLong curLocalAllTimeStamp = new AtomicLong(-1);
    private AtomicLong baseTimeStamp = new AtomicLong(-1);
    private AtomicLong defaultTimeStamp = new AtomicLong(-1);
    private final AtomicBoolean isSyncing = new AtomicBoolean(false);
    private final int pageSize = 100;

    static {
        kge.a(2057684711);
        kge.a(1968354774);
        Companion = new Companion(null);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void doRemoteSingleSync(LayoutRequest req, ruw<? super Integer, ? super LayoutResponse, t> remoteSingleSyncFunc, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9430d4", new Object[]{this, req, remoteSingleSyncFunc, l});
            return;
        }
        q.c(req, "req");
        q.c(remoteSingleSyncFunc, "remoteSingleSyncFunc");
    }

    public static final /* synthetic */ LayoutSyncable access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutSyncable) ipChange.ipc$dispatch("5182517", new Object[0]) : instance;
    }

    public static final /* synthetic */ void access$setInstance$cp(LayoutSyncable layoutSyncable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ada3b9", new Object[]{layoutSyncable});
        } else {
            instance = layoutSyncable;
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

    /* renamed from: getBaseTimeStamp  reason: collision with other method in class */
    public final AtomicLong m1577getBaseTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("922cccfc", new Object[]{this}) : this.baseTimeStamp;
    }

    public final void setBaseTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2634206", new Object[]{this, atomicLong});
            return;
        }
        q.c(atomicLong, "<set-?>");
        this.baseTimeStamp = atomicLong;
    }

    /* renamed from: getDefaultTimeStamp  reason: collision with other method in class */
    public final AtomicLong m1578getDefaultTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("1a5355c0", new Object[]{this}) : this.defaultTimeStamp;
    }

    public final void setDefaultTimeStamp(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919a7c5a", new Object[]{this, atomicLong});
            return;
        }
        q.c(atomicLong, "<set-?>");
        this.defaultTimeStamp = atomicLong;
    }

    public final AtomicBoolean isSyncing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4d0be124", new Object[]{this}) : this.isSyncing;
    }

    public final int getPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue() : this.pageSize;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/LayoutSyncable$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-359432849);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final LayoutSyncable getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutSyncable) ipChange.ipc$dispatch("bc867b3c", new Object[]{this});
            }
            if (LayoutSyncable.access$getInstance$cp() == null) {
                synchronized (LayoutSyncable.class) {
                    if (LayoutSyncable.access$getInstance$cp() == null) {
                        LayoutSyncable.access$setInstance$cp(new LayoutSyncable());
                    }
                    t tVar = t.INSTANCE;
                }
            }
            LayoutSyncable access$getInstance$cp = LayoutSyncable.access$getInstance$cp();
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
            this.curLocalAllTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference(SyncConstant.KEY_LAYOUT_ALL_TIMESTAMP, 0L));
        }
        TLog.loge(SyncConstant.TAG, "localLayoutAllTs is " + this.curLocalAllTimeStamp);
        return this.curLocalAllTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteAllTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b0ddac", new Object[]{this})).longValue();
        }
        String timeStamp = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_LAYOUT_ALL_TIMESTAMP, "0");
        TLog.loge(SyncConstant.TAG, "remoteLayoutAllTs is " + timeStamp);
        q.a((Object) timeStamp, "timeStamp");
        return Long.parseLong(timeStamp);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getLocalIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fc1e308", new Object[]{this})).longValue();
        }
        long baseTimeStamp = getBaseTimeStamp();
        long defaultTimeStamp = getDefaultTimeStamp();
        if (baseTimeStamp < defaultTimeStamp) {
            TLog.loge(SyncConstant.TAG, "localLayoutIncTs is " + baseTimeStamp);
            return baseTimeStamp;
        }
        TLog.loge(SyncConstant.TAG, "localLayoutIncTs is " + defaultTimeStamp);
        return defaultTimeStamp;
    }

    public final long getBaseTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("477b5e6a", new Object[]{this})).longValue();
        }
        if (this.baseTimeStamp.get() == -1) {
            this.baseTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference("base_updateTimeV2", 0L));
        }
        TLog.loge(SyncConstant.TAG, "baseTimeStamp is " + this.baseTimeStamp);
        return this.baseTimeStamp.get();
    }

    public final void updateTimeStamp(HashMap<String, Long> timestamps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c984ff", new Object[]{this, timestamps});
            return;
        }
        q.c(timestamps, "timestamps");
        Long it = timestamps.get("base");
        if (it != null) {
            q.a((Object) it, "it");
            SharedPreferencesUtil.addLongSharedPreference("base_updateTimeV2", it.longValue());
            TLog.loge(SyncConstant.TAG, "update baseTimeStamp is " + it);
            this.baseTimeStamp.set(it.longValue());
        }
        Long it2 = timestamps.get("default");
        if (it2 == null) {
            return;
        }
        q.a((Object) it2, "it");
        SharedPreferencesUtil.addLongSharedPreference("default_updateTimeV2", it2.longValue());
        this.defaultTimeStamp.set(it2.longValue());
        TLog.loge(SyncConstant.TAG, "update defaultTimeStamp is " + it2);
    }

    public final long getDefaultTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a95d5a26", new Object[]{this})).longValue();
        }
        if (this.defaultTimeStamp.get() == -1) {
            this.defaultTimeStamp = new AtomicLong(SharedPreferencesUtil.getLongSharedPreference("default_updateTimeV2", 0L));
        }
        TLog.loge(SyncConstant.TAG, "defaultTimeStamp is " + this.defaultTimeStamp);
        return this.defaultTimeStamp.get();
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public long getRemoteIncTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642a8a8f", new Object[]{this})).longValue();
        }
        String timeStamp = ConfigUtil.getValue(SyncConstant.SYNC_TIMESTAMP_NAMESPACE, SyncConstant.REMOTE_KEY_LAYOUT_INC_TIMESTAMP, "1");
        TLog.loge(SyncConstant.TAG, "remoteLayoutIncTs is " + timeStamp);
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
        TLog.loge(SyncConstant.TAG, "updateLocalLayoutAllTs is " + j);
        this.curLocalAllTimeStamp.set(j);
        SharedPreferencesUtil.addLongSharedPreference(SyncConstant.KEY_LAYOUT_ALL_TIMESTAMP, j);
    }

    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void updateLocalIncTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66cb763", new Object[]{this, new Long(j)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "updateLocalLayoutIncTs is " + j);
        if (j != 0) {
            return;
        }
        SharedPreferencesUtil.addLongSharedPreference("base_updateTimeV2", 0L);
        this.baseTimeStamp.set(0L);
        SharedPreferencesUtil.addLongSharedPreference("default_updateTimeV2", 0L);
        this.defaultTimeStamp.set(0L);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v13, types: [T, java.util.HashMap] */
    @Override // com.taobao.unit.center.sync.syncable.ISyncable
    public void doRemoteSync(LayoutRequest req, rul<? super LayoutResponse, t> remoteSyncSuccessFunc, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7126dd67", new Object[]{this, req, remoteSyncSuccessFunc, l});
            return;
        }
        q.c(req, "req");
        q.c(remoteSyncSuccessFunc, "remoteSyncSuccessFunc");
        if (this.isSyncing.get()) {
            TLog.loge(SyncConstant.TAG, "Layout syncing");
            return;
        }
        this.isSyncing.set(true);
        TLog.loge(SyncConstant.TAG, "Layout sync() called");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = req.getGroups();
        if (req.getGroups() == null) {
            objectRef.element = new HashMap();
            ((HashMap) objectRef.element).put("base", Long.valueOf(getBaseTimeStamp()));
            ((HashMap) objectRef.element).put("default", Long.valueOf(getDefaultTimeStamp()));
        } else {
            objectRef.element = req.getGroups();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((HashMap) objectRef.element).entrySet()) {
                jSONObject.put((JSONObject) entry.getKey(), entry.getValue());
            }
            String jSONString = jSONObject.toJSONString();
            q.a((Object) jSONString, "jsonObject.toJSONString()");
            if (TextUtils.isEmpty(jSONString)) {
                return;
            }
            TLog.loge(SyncConstant.TAG, "request groupString is " + jSONString);
            MtopTaobaoAlimpBentleyLayoutSyncRequest mtopTaobaoAlimpBentleyLayoutSyncRequest = new MtopTaobaoAlimpBentleyLayoutSyncRequest();
            mtopTaobaoAlimpBentleyLayoutSyncRequest.setGroups(jSONString);
            mtopTaobaoAlimpBentleyLayoutSyncRequest.setNameSpace(ITemplateSyncService.NAMESPACE);
            mtopTaobaoAlimpBentleyLayoutSyncRequest.setSdkVer(SyncConstant.INSTANCE.getTB_UNIT_CENTER_VERSION());
            mtopTaobaoAlimpBentleyLayoutSyncRequest.setUseNewSyncLogic("true");
            RemoteBusiness build = RemoteBusiness.build(ApplicationUtil.getApplication(), mtopTaobaoAlimpBentleyLayoutSyncRequest, ApplicationUtil.getTTID());
            build.registerListener((IRemoteListener) new LayoutSyncable$doRemoteSync$1(this, remoteSyncSuccessFunc, objectRef, l));
            build.startRequest(MtopTaobaoAlimpBentleyLayoutSyncResponse.class);
        } catch (Throwable th) {
            TLog.loge(SyncConstant.TAG, Log.getStackTraceString(th));
        }
    }
}
