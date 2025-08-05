package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.j;

/* loaded from: classes.dex */
public class ojm extends lma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(740971985);
    }

    public static /* synthetic */ Object ipc$super(ojm ojmVar, String str, Object... objArr) {
        if (str.hashCode() == 1639331374) {
            return new Boolean(super.a((Context) objArr[0], (String) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean a(ojm ojmVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c770a430", new Object[]{ojmVar, context, str})).booleanValue() : super.a(context, str);
    }

    @Override // tb.lma, com.taobao.infoflow.core.engine.env.protocol.h
    public boolean a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        j.a(context, new j.a() { // from class: tb.ojm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.homepage.utils.j.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ojm.a(ojm.this, context, str);
                }
            }
        });
        return true;
    }
}
