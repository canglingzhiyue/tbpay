package tb;

import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmImpl;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001J2\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J2\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/taobao/taolive/lpm_android/api/MessageActionObserver;", "", "()V", "onDispatch", "", "bizID", "", "tLiveMsg", "Lcom/taobao/taolive/sdk/model/message/TLiveMsg;", "onError", q.MSGTYPE_INTERVAL, "", o.b, "onSubscribe", "errCode", "bizCode", "topic", "from", "onUnSubscribe", "lpm-android_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pco {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a(String bizID, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956b0157", new Object[]{this, bizID, tLiveMsg});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().i.a(bizID, tLiveMsg);
        } catch (Exception unused) {
        }
    }

    public final void a(String bizID, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a006daad", new Object[]{this, bizID, new Integer(i), obj});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().i.a(bizID, i, obj);
        } catch (Exception unused) {
        }
    }

    public final void a(String bizID, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26e7c26", new Object[]{this, bizID, new Integer(i), new Integer(i2), str, str2});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().i.a(bizID, i, i2, str, str2);
        } catch (Exception unused) {
        }
    }

    public final void b(String bizID, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce41ca7", new Object[]{this, bizID, new Integer(i), new Integer(i2), str, str2});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().i.b(bizID, i, i2, str, str2);
        } catch (Exception unused) {
        }
    }
}
