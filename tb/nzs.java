package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordJudgeRequestI;

/* loaded from: classes8.dex */
public class nzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PasswordJudgeRequestI f31862a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static nzs f31863a;

        static {
            kge.a(200364383);
            f31863a = new nzs();
        }

        public static /* synthetic */ nzs a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (nzs) ipChange.ipc$dispatch("f087dd7", new Object[0]) : f31863a;
        }
    }

    static {
        kge.a(619987084);
    }

    public static nzs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzs) ipChange.ipc$dispatch("f087dd7", new Object[0]) : a.a();
    }

    private nzs() {
    }

    public void a(Context context, String str, nzz nzzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118693ac", new Object[]{this, context, str, nzzVar});
            return;
        }
        this.f31862a = new PasswordJudgeRequestI();
        this.f31862a.request(context, str, nzzVar);
    }
}
