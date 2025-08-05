package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.register.b;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/pub/task/PubPermissionMiddleware;", "Lcom/taobao/themis/kernel/ability/invoker/ApiMiddleware;", "meta", "Lcom/taobao/themis/kernel/ability/register/ApiMeta;", "(Lcom/taobao/themis/kernel/ability/register/ApiMeta;)V", "invoke", "", "context", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "args", "", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;[Ljava/lang/Object;Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;)Ljava/lang/Object;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlr extends qpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1945256548);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlr(b meta) {
        super(meta);
        q.d(meta, "meta");
    }

    @Override // tb.qpa
    public Object a(ApiContext context, Object[] args, qox callback) {
        tlq tlqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a905d430", new Object[]{this, context, args, callback});
        }
        q.d(context, "context");
        q.d(args, "args");
        q.d(callback, "callback");
        String str = this.d.f22498a;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            callback.a(qoy.a(String.valueOf(2), "invalid parameter!"), false);
            return null;
        } else if (!n.F()) {
            return this.f33007a.a(context, args, callback);
        } else {
            if (!n.d(str)) {
                return this.f33007a.a(context, args, callback);
            }
            f c = context.c();
            if (c == null || (tlqVar = (tlq) c.a(tlq.class)) == null || !tlqVar.b(str)) {
                callback.a(qoy.a(String.valueOf(4), BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR), false);
                return null;
            }
            return this.f33007a.a(context, args, callback);
        }
    }
}
