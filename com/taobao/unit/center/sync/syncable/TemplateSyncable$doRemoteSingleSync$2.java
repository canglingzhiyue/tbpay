package com.taobao.unit.center.sync.syncable;

import android.util.Log;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.themis.kernel.i;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.TemplateRequest;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/unit/center/sync/syncable/TemplateSyncable$doRemoteSingleSync$2", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "onError", "", q.MSGTYPE_INTERVAL, "", "mtopResponse", "Lmtopsdk/mtop/domain/MtopResponse;", o.b, "", "onSuccess", "baseOutDo", "Lmtopsdk/mtop/domain/BaseOutDo;", "onSystemError", i.CDN_REQUEST_TYPE, "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class TemplateSyncable$doRemoteSingleSync$2 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruw $remoteSingleSyncFunc;
    public final /* synthetic */ TemplateRequest $req;
    public final /* synthetic */ String $templateId;
    public final /* synthetic */ TemplateSyncable this$0;

    public TemplateSyncable$doRemoteSingleSync$2(TemplateSyncable templateSyncable, String str, TemplateRequest templateRequest, ruw ruwVar) {
        this.this$0 = templateSyncable;
        this.$templateId = str;
        this.$req = templateRequest;
        this.$remoteSingleSyncFunc = ruwVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge(SyncConstant.TAG, "requestSingleTemplate onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + mtopResponse + "], o = [" + obj + ']');
        TemplateSyncable templateSyncable = this.this$0;
        synchronized (TemplateSyncable.$ipChange) {
            TemplateSyncable templateSyncable2 = this.this$0;
            TemplateSyncable.$ipChange.remove(this.$templateId);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(final int i, final MtopResponse mtopResponse, final BaseOutDo baseOutDo, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.syncable.TemplateSyncable$doRemoteSingleSync$2$onSuccess$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    Integer templateId;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                        return;
                    }
                    try {
                        TLog.loge(BaseRunnable.TAG, "requestSingleTemplate onSuccess() called with: i = [" + i + "], mtopResponse = [" + mtopResponse + "], baseOutDo = [" + baseOutDo + "], o = [" + obj + ']');
                        MtopResponse mtopResponse2 = mtopResponse;
                        JSONObject dataJsonObject = mtopResponse2 != null ? mtopResponse2.getDataJsonObject() : null;
                        if (dataJsonObject != null && (templateId = TemplateSyncable$doRemoteSingleSync$2.this.$req.getTemplateId()) != null) {
                            TemplateSyncable$doRemoteSingleSync$2.this.$remoteSingleSyncFunc.mo2423invoke(Integer.valueOf(templateId.intValue()), dataJsonObject);
                        }
                    } catch (Throwable th) {
                        TLog.loge(BaseRunnable.TAG, Log.getStackTraceString(th));
                    }
                    TemplateSyncable templateSyncable = TemplateSyncable$doRemoteSingleSync$2.this.this$0;
                    synchronized (TemplateSyncable.$ipChange) {
                        TemplateSyncable templateSyncable2 = TemplateSyncable$doRemoteSingleSync$2.this.this$0;
                        TemplateSyncable.$ipChange.remove(TemplateSyncable$doRemoteSingleSync$2.this.$templateId);
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
        } else {
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.syncable.TemplateSyncable$doRemoteSingleSync$2$onError$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                        return;
                    }
                    TemplateSyncable templateSyncable = TemplateSyncable$doRemoteSingleSync$2.this.this$0;
                    synchronized (TemplateSyncable.$ipChange) {
                        TemplateSyncable templateSyncable2 = TemplateSyncable$doRemoteSingleSync$2.this.this$0;
                        TemplateSyncable.$ipChange.remove(TemplateSyncable$doRemoteSingleSync$2.this.$templateId);
                    }
                }
            });
        }
    }
}
