package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.auth.b;
import com.taobao.themis.open.permission.check.PermissionResult;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/permission/PermissionMiddleware;", "Lcom/taobao/themis/kernel/ability/invoker/ApiMiddleware;", "meta", "Lcom/taobao/themis/kernel/ability/register/ApiMeta;", "originParams", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/taobao/themis/kernel/ability/register/ApiMeta;Lcom/alibaba/fastjson/JSONObject;)V", "invoke", "", "context", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "args", "", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;[Ljava/lang/Object;Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;)Ljava/lang/Object;", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlo extends qpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private final JSONObject b;

    static {
        kge.a(1817187698);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlo(com.taobao.themis.kernel.ability.register.b meta, JSONObject originParams) {
        super(meta);
        q.d(meta, "meta");
        q.d(originParams, "originParams");
        this.b = originParams;
    }

    @Override // tb.qpa
    public Object a(ApiContext context, Object[] args, qox callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a905d430", new Object[]{this, context, args, callback});
        }
        q.d(context, "context");
        q.d(args, "args");
        q.d(callback, "callback");
        TMSLogger.b("PermissionMiddleware", "check permission for method : [" + this.d.f22498a + riy.ARRAY_END_STR);
        TMSPermissionManager tMSPermissionManager = TMSPermissionManager.INSTANCE;
        f c = context.c();
        String str = this.d.f22498a;
        q.b(str, "apiMeta.apiName");
        if (!tMSPermissionManager.a(c, str, this.b) || !context.e()) {
            z = false;
        }
        if (!z) {
            TMSLogger.b("PermissionMiddleware", "not need to check permission");
            return this.f33007a.a(context, args, callback);
        }
        PermissionResult a2 = TMSPermissionManager.INSTANCE.a(this.d.f22498a, this.b, context);
        TMSLogger.b("PermissionMiddleware", "checkPermission result : " + a2);
        if (a2 != PermissionResult.IGNORE && a2 != PermissionResult.ALLOW) {
            callback.a(qoy.a(String.valueOf(4), BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR, a2.getSignature()), false);
            return null;
        } else if (AuthUtils.INSTANCE.a(context.c())) {
            TMSLogger.b("PermissionMiddleware", riy.ARRAY_START_STR + this.d.f22498a + "] need local auth");
            com.taobao.themis.open.permission.auth.b bVar = com.taobao.themis.open.permission.auth.b.INSTANCE;
            String str2 = this.d.f22498a;
            q.b(str2, "apiMeta.apiName");
            bVar.a(str2, this.b, context, new b(context, args, callback));
            return null;
        } else {
            return this.f33007a.a(context, args, callback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/open/permission/PermissionMiddleware$invoke$1", "Lcom/taobao/themis/open/permission/auth/LocalAuthManager$PermissionCallback;", "onFail", "", "onSuccess", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ApiContext b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ qox d;

        public b(ApiContext apiContext, Object[] objArr, qox qoxVar) {
            this.b = apiContext;
            this.c = objArr;
            this.d = qoxVar;
        }

        @Override // com.taobao.themis.open.permission.auth.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                tlo.this.f33007a.a(this.b, this.c, this.d);
            }
        }

        @Override // com.taobao.themis.open.permission.auth.b.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.d.a(qoy.a(String.valueOf(2001), BridgeResponse.ERROR_MSG_NOT_GRANT_ERROR), false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/permission/PermissionMiddleware$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-698262982);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
