package com.taobao.unit.center.sync.syncable;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import kotlin.Metadata;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003JY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0010JD\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\u000fH&J\b\u0010\u0018\u001a\u00020\u000fH&J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH&¨\u0006\u001c"}, d2 = {"Lcom/taobao/unit/center/sync/syncable/ISyncable;", "Request", "Response", "", "doRemoteSingleSync", "", "req", "remoteSingleSyncFunc", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "templateId", InputFrame3.TYPE_RESPONSE, "allTimeStamp", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ljava/lang/Long;)V", "doRemoteSync", "remoteSyncSuccessFunc", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "getLocalAllTimeStamp", "getLocalIncTimeStamp", "getRemoteAllTimeStamp", "getRemoteIncTimeStamp", "updateLocalAllTimeStamp", "timestamp", "updateLocalIncTimeStamp", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public interface ISyncable<Request, Response> {
    void doRemoteSingleSync(Request request, ruw<? super Integer, ? super Response, t> ruwVar, Long l);

    void doRemoteSync(Request request, rul<? super Response, t> rulVar, Long l);

    long getLocalAllTimeStamp();

    long getLocalIncTimeStamp();

    long getRemoteAllTimeStamp();

    long getRemoteIncTimeStamp();

    void updateLocalAllTimeStamp(long j);

    void updateLocalIncTimeStamp(long j);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1260327104);
        }

        public static /* synthetic */ void doRemoteSync$default(ISyncable iSyncable, Object obj, rul rulVar, Long l, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1974074", new Object[]{iSyncable, obj, rulVar, l, new Integer(i), obj2});
            } else if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRemoteSync");
            } else {
                if ((i & 4) != 0) {
                    l = -1L;
                }
                iSyncable.doRemoteSync(obj, rulVar, l);
            }
        }

        public static /* synthetic */ void doRemoteSingleSync$default(ISyncable iSyncable, Object obj, ruw ruwVar, Long l, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6e65997", new Object[]{iSyncable, obj, ruwVar, l, new Integer(i), obj2});
            } else if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRemoteSingleSync");
            } else {
                if ((i & 4) != 0) {
                    l = -1L;
                }
                iSyncable.doRemoteSingleSync(obj, ruwVar, l);
            }
        }
    }
}
