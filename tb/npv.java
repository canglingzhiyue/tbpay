package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import com.taobao.search.common.util.i;
import java.util.HashMap;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public class npv extends npj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-186779825);
    }

    public static /* synthetic */ Object ipc$super(npv npvVar, String str, Object... objArr) {
        if (str.hashCode() == -73738099) {
            super.a((Throwable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public npv() {
        super("suggest");
    }

    @Override // tb.npj, tb.iud
    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        super.a(th);
        HashMap hashMap = new HashMap();
        if (th instanceof ResultException) {
            ResultException resultException = (ResultException) th;
            if (resultException.getError() != null) {
                HashMap hashMap2 = hashMap;
                hashMap2.put("code", String.valueOf(1));
                StringBuilder sb = new StringBuilder();
                ResultError error = resultException.getError();
                q.a((Object) error, "throwable.error");
                sb.append(error.getMtopCode());
                sb.append("::");
                ResultError error2 = resultException.getError();
                q.a((Object) error2, "throwable.error");
                sb.append(error2.getErrorMsg());
                hashMap2.put("msg", sb.toString());
                i.d.a().b(i.d.a().a("failure", hashMap));
            }
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("code", String.valueOf(0));
        hashMap3.put("msg", th != null ? th.getMessage() : null);
        i.d.a().b(i.d.a().a("failure", hashMap));
    }
}
