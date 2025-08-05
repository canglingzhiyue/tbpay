package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.register.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public class qpd extends qpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Class<? extends Annotation>> b;
    public JSONObject c;

    static {
        kge.a(-2138781626);
    }

    public static /* synthetic */ Object ipc$super(qpd qpdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public qpd(b bVar, JSONObject jSONObject) {
        super(bVar);
        this.b = Arrays.asList(BindingParam.class, BindingCallback.class, BindingRequest.class, BindingApiContext.class);
        this.c = jSONObject;
    }

    @Override // tb.qpa
    public Object a(ApiContext apiContext, Object[] objArr, qox qoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a905d430", new Object[]{this, apiContext, objArr, qoxVar});
        }
        TMSLogger.b("ParamBindMiddleware", "bind params for method [" + this.d.c.getName() + riy.ARRAY_END_STR);
        int length = this.d.f.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            try {
                objArr2[i] = a(a(i, this.d), this.c, this.d.f[i], qoxVar, apiContext);
            } catch (Throwable th) {
                TMSLogger.b("ParamBindMiddleware", "bind error with originParams :" + this.c.toJSONString(), th);
                qoxVar.a(qoy.a("6", Arrays.toString(th.getStackTrace())), false);
                return null;
            }
        }
        TMSLogger.b("ParamBindMiddleware", "bind params finish. method: [" + this.d.c.getName() + "], args:" + Arrays.toString(objArr2) + "");
        return this.f33007a.a(apiContext, objArr2, qoxVar);
    }

    private Annotation a(int i, b bVar) {
        Annotation[] annotationArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Annotation) ipChange.ipc$dispatch("f0b19f25", new Object[]{this, new Integer(i), bVar});
        }
        if (bVar.g.length <= i) {
            return null;
        }
        for (Annotation annotation : bVar.g[i]) {
            if (annotation != null && annotation.annotationType() != null && this.b.contains(annotation.annotationType())) {
                return annotation;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(java.lang.annotation.Annotation r4, com.alibaba.fastjson.JSONObject r5, java.lang.Class<?> r6, tb.qox r7, com.taobao.themis.kernel.ability.base.ApiContext r8) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.qpd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L22
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            r4 = 4
            r1[r4] = r7
            r4 = 5
            r1[r4] = r8
            java.lang.String r4 = "c757ca34"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            return r4
        L22:
            if (r4 != 0) goto L29
            java.lang.Object r4 = r3.a(r6)
            return r4
        L29:
            boolean r0 = r4 instanceof com.taobao.themis.kernel.ability.base.annotation.BindingParam
            r1 = 0
            if (r0 == 0) goto L35
            com.taobao.themis.kernel.ability.invoker.binder.d r7 = new com.taobao.themis.kernel.ability.invoker.binder.d
            r7.<init>(r5)
        L33:
            r5 = r7
            goto L54
        L35:
            boolean r0 = r4 instanceof com.taobao.themis.kernel.ability.base.annotation.BindingRequest
            if (r0 == 0) goto L3f
            com.taobao.themis.kernel.ability.invoker.binder.e r7 = new com.taobao.themis.kernel.ability.invoker.binder.e
            r7.<init>(r5)
            goto L33
        L3f:
            boolean r5 = r4 instanceof com.taobao.themis.kernel.ability.base.annotation.BindingCallback
            if (r5 == 0) goto L49
            com.taobao.themis.kernel.ability.invoker.binder.c r5 = new com.taobao.themis.kernel.ability.invoker.binder.c
            r5.<init>(r7)
            goto L54
        L49:
            boolean r5 = r4 instanceof com.taobao.themis.kernel.ability.base.annotation.BindingApiContext
            if (r5 == 0) goto L53
            com.taobao.themis.kernel.ability.invoker.binder.a r5 = new com.taobao.themis.kernel.ability.invoker.binder.a
            r5.<init>(r8)
            goto L54
        L53:
            r5 = r1
        L54:
            if (r5 == 0) goto L5a
            java.lang.Object r1 = r5.a(r6, r4)
        L5a:
            if (r1 == 0) goto L5d
            return r1
        L5d:
            java.lang.Object r4 = r3.a(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qpd.a(java.lang.annotation.Annotation, com.alibaba.fastjson.JSONObject, java.lang.Class, tb.qox, com.taobao.themis.kernel.ability.base.ApiContext):java.lang.Object");
    }

    private Object a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls}) : cls.isPrimitive() ? 0 : null;
    }
}
