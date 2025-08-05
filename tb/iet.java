package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.a;

/* loaded from: classes6.dex */
public class iet extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ier f28982a;

    static {
        kge.a(-1488927473);
    }

    public static /* synthetic */ Object ipc$super(iet ietVar, String str, Object... objArr) {
        if (str.hashCode() == -1507519932) {
            super.a(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(ier ierVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed85e042", new Object[]{this, ierVar});
        } else {
            this.f28982a = ierVar;
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        super.a(obj);
        ier ierVar = this.f28982a;
        if (ierVar == null) {
            return;
        }
        ierVar.a(obj);
    }
}
