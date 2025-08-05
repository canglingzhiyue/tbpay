package com.taobao.unit.center.sync.syncable;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.syncable.ISyncable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0002\u0010\u000fJm\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/SyncHandler;", "", "()V", "doCheckSync", "", "Request", "Response", "request", "syncable", "Lcom/taobao/unit/center/sync/syncable/ISyncable;", "successFunc", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "(Ljava/lang/Object;Lcom/taobao/unit/center/sync/syncable/ISyncable;Lkotlin/jvm/functions/Function1;)V", "doRemoteSyncSingle", "Lkotlin/Function2;", "", "templateId", "(Ljava/lang/Object;Lcom/taobao/unit/center/sync/syncable/ISyncable;Lkotlin/jvm/functions/Function2;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class SyncHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SyncHandler INSTANCE;

    static {
        kge.a(370280967);
        INSTANCE = new SyncHandler();
    }

    private SyncHandler() {
    }

    public final <Request, Response> void doCheckSync(Request request, ISyncable<Request, Response> syncable, rul<? super Response, t> successFunc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c3167b", new Object[]{this, request, syncable, successFunc});
            return;
        }
        q.c(syncable, "syncable");
        q.c(successFunc, "successFunc");
        long remoteAllTimeStamp = syncable.getRemoteAllTimeStamp();
        if (syncable.getLocalAllTimeStamp() < remoteAllTimeStamp) {
            TLog.loge(SyncConstant.TAG, "local all smaller, " + syncable.getLocalAllTimeStamp() + "<" + remoteAllTimeStamp);
            syncable.updateLocalIncTimeStamp(0L);
            syncable.doRemoteSync(request, successFunc, Long.valueOf(remoteAllTimeStamp));
        } else if (syncable.getLocalIncTimeStamp() < syncable.getRemoteIncTimeStamp()) {
            TLog.loge(SyncConstant.TAG, "local inc smaller, " + syncable.getLocalIncTimeStamp() + " < " + syncable.getRemoteIncTimeStamp());
            ISyncable.DefaultImpls.doRemoteSync$default(syncable, request, successFunc, null, 4, null);
        } else {
            TLog.loge(SyncConstant.TAG, "do nothing: " + syncable.getLocalIncTimeStamp() + " >= " + syncable.getRemoteIncTimeStamp());
        }
    }

    public final <Request, Response> void doRemoteSyncSingle(Request request, ISyncable<Request, Response> syncable, ruw<? super Integer, ? super Response, t> successFunc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3244d06c", new Object[]{this, request, syncable, successFunc});
            return;
        }
        q.c(syncable, "syncable");
        q.c(successFunc, "successFunc");
        ISyncable.DefaultImpls.doRemoteSingleSync$default(syncable, request, successFunc, null, 4, null);
    }
}
