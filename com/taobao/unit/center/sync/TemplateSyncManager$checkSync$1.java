package com.taobao.unit.center.sync;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "curEnv", "", "lastEnv", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class TemplateSyncManager$checkSync$1 extends Lambda implements ruw<Integer, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TemplateSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateSyncManager$checkSync$1(TemplateSyncManager templateSyncManager) {
        super(2);
        this.this$0 = templateSyncManager;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, num2});
        }
        invoke(num.intValue(), num2.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "template reset for env change from " + i2 + " to " + i);
        TemplateSyncManager.access$reset(this.this$0);
    }
}
