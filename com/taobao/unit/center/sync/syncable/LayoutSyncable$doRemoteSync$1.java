package com.taobao.unit.center.sync.syncable;

import android.util.Log;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.themis.kernel.i;
import com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyLayoutSyncResponseData;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.LayoutResponse;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/unit/center/sync/syncable/LayoutSyncable$doRemoteSync$1", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "onError", "", q.MSGTYPE_INTERVAL, "", "mtopResponse", "Lmtopsdk/mtop/domain/MtopResponse;", o.b, "", "onSuccess", "baseOutDo", "Lmtopsdk/mtop/domain/BaseOutDo;", "onSystemError", i.CDN_REQUEST_TYPE, "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class LayoutSyncable$doRemoteSync$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Long $allTimeStamp;
    public final /* synthetic */ Ref.ObjectRef $groups;
    public final /* synthetic */ rul $remoteSyncSuccessFunc;
    public final /* synthetic */ LayoutSyncable this$0;

    public LayoutSyncable$doRemoteSync$1(LayoutSyncable layoutSyncable, rul rulVar, Ref.ObjectRef objectRef, Long l) {
        this.this$0 = layoutSyncable;
        this.$remoteSyncSuccessFunc = rulVar;
        this.$groups = objectRef;
        this.$allTimeStamp = l;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge(SyncConstant.TAG, "Layout onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + mtopResponse + "], o = [" + obj + ']');
        this.this$0.isSyncing().set(false);
        String str = null;
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        AppMonitor.Alarm.commitFail(Monitor.MODULE_COMFRM, "syncLayoutInfo", retCode, str);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(final int i, final MtopResponse mtopResponse, final BaseOutDo baseOutDo, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.syncable.LayoutSyncable$doRemoteSync$1$onSuccess$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                        return;
                    }
                    try {
                        TLog.loge(SyncConstant.TAG, "Layout onSuccess() called with: i = [" + i + "], mtopResponse = [" + mtopResponse + "], baseOutDo = [" + baseOutDo + "], o = [" + obj + ']');
                        BaseOutDo baseOutDo2 = baseOutDo;
                        if ((baseOutDo2 != null ? baseOutDo2.mo2429getData() : null) instanceof MtopTaobaoAlimpBentleyLayoutSyncResponseData) {
                            Object mo2429getData = baseOutDo.mo2429getData();
                            if (mo2429getData == null) {
                                throw new TypeCastException("null cannot be cast to non-null type com.taobao.unit.center.mtop.sync.MtopTaobaoAlimpBentleyLayoutSyncResponseData");
                            }
                            MtopTaobaoAlimpBentleyLayoutSyncResponseData mtopTaobaoAlimpBentleyLayoutSyncResponseData = (MtopTaobaoAlimpBentleyLayoutSyncResponseData) mo2429getData;
                            if (mtopTaobaoAlimpBentleyLayoutSyncResponseData.model != null) {
                                LayoutSyncable$doRemoteSync$1.this.$remoteSyncSuccessFunc.mo2421invoke(new LayoutResponse((HashMap) LayoutSyncable$doRemoteSync$1.this.$groups.element, mtopTaobaoAlimpBentleyLayoutSyncResponseData.model, null, 4, null));
                                Long l = LayoutSyncable$doRemoteSync$1.this.$allTimeStamp;
                                if (l != null) {
                                    l.longValue();
                                    if (LayoutSyncable$doRemoteSync$1.this.$allTimeStamp.longValue() > -1) {
                                        LayoutSyncable$doRemoteSync$1.this.this$0.updateLocalAllTimeStamp(LayoutSyncable$doRemoteSync$1.this.$allTimeStamp.longValue());
                                    }
                                }
                            }
                        }
                        LayoutSyncable$doRemoteSync$1.this.this$0.isSyncing().compareAndSet(true, false);
                        AppMonitor.Alarm.commitSuccess(Monitor.MODULE_COMFRM, "syncLayoutInfo");
                    } catch (Throwable th) {
                        TLog.loge(SyncConstant.TAG, Log.getStackTraceString(th));
                        LayoutSyncable$doRemoteSync$1.this.this$0.isSyncing().set(false);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge(SyncConstant.TAG, "Layout onError() called with: i = [" + i + "], mtopResponse = [" + mtopResponse + "], o = [" + obj + ']');
        this.this$0.isSyncing().set(false);
        String str = null;
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        AppMonitor.Alarm.commitFail(Monitor.MODULE_COMFRM, "syncLayoutInfo", retCode, str);
    }
}
