package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.model.g;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class rli implements rlh<UserTrackDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UTTriggerPattern";

    /* renamed from: a  reason: collision with root package name */
    private final g f33222a;

    static {
        kge.a(-1181907067);
        kge.a(82360998);
    }

    public rli(g gVar) {
        this.f33222a = gVar;
    }

    @Override // tb.rlh
    public TriggerMatchResult a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("8aa62c97", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult a2 = this.f33222a.a(userTrackDO);
        if (!a2.f23726a) {
            return a2;
        }
        if (this.f33222a.c > 1) {
            this.f33222a.d++;
            if (this.f33222a.d >= this.f33222a.c) {
                this.f33222a.d = 0;
                return TriggerMatchResult.a();
            }
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_BATCH_NOT_MATCH, "batch is " + this.f33222a.c + "current is " + this.f33222a.d);
        }
        return TriggerMatchResult.a();
    }

    @Override // tb.rlh
    public ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f33222a.a();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{triggerData:" + this.f33222a + riy.BLOCK_END_STR;
    }
}
