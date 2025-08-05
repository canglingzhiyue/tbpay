package com.alibaba.android.nextrpc;

import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.android.nextrpc.streamv2.request.c;
import com.alibaba.android.nextrpc.streamv2.request.d;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsNextRPCAbility;
import com.taobao.android.abilityidl.ability.NextRPCAttachedResponse;
import com.taobao.android.abilityidl.ability.NextRPCErrorInfo;
import com.taobao.android.abilityidl.ability.NextRPCFinishResult;
import com.taobao.android.abilityidl.ability.NextRPCMtopResponse;
import com.taobao.android.abilityidl.ability.NextRPCReceiveDataResult;
import com.taobao.android.abilityidl.ability.NextRPCRequest;
import com.taobao.android.abilityidl.ability.es;
import com.taobao.android.abilityidl.ability.et;
import com.taobao.android.abilityidl.ability.eu;
import com.taobao.android.abilityidl.ability.ev;
import com.taobao.android.abilityidl.ability.ew;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ada;
import tb.als;
import tb.bfo;
import tb.gml;
import tb.xif;
import tb.xih;
import tb.xii;
import tb.xij;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020 H\u0002J\u001f\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0006H\u0016J \u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020)H\u0016J \u0010*\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/alibaba/android/nextrpc/NextRPCAbility;", "Lcom/taobao/android/abilityidl/ability/AbsNextRPCAbility;", "()V", "mClient", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient;", com.taobao.android.weex_framework.util.a.ATOM_EXT_bind, "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "Lcom/taobao/android/abilityidl/ability/NextRPCBindParams;", "callback", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "cancel", "Lcom/taobao/android/abilityidl/ability/NextRPCCancelParams;", "convertMap", "", "", "map", "", "getAttachedResponses", "", "Lcom/taobao/android/abilityidl/ability/NextRPCAttachedResponse;", "attachedResponses", "Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", bfo.sParamsKeyDisableJSONParse, "", "(Ljava/util/List;Ljava/lang/Boolean;)Ljava/util/List;", "getMtopBusiness", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "mtopRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "Lcom/taobao/android/abilityidl/ability/NextRPCRequestParams;", "getMtopRequest", "getMtopResponse", "Lcom/taobao/android/abilityidl/ability/NextRPCMtopResponse;", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "(Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;Ljava/lang/Boolean;)Lcom/taobao/android/abilityidl/ability/NextRPCMtopResponse;", MessageID.onDestroy, "request", "Lcom/taobao/android/abilityidl/ability/INextRPCRequestNextRPCEvents;", "unbind", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public class NextRPCAbility extends AbsNextRPCAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f2380a;

    public static /* synthetic */ Object ipc$super(NextRPCAbility nextRPCAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ List access$getAttachedResponses(NextRPCAbility nextRPCAbility, List list, Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("49a76083", new Object[]{nextRPCAbility, list, bool}) : nextRPCAbility.a(list, bool);
    }

    public static final /* synthetic */ NextRPCMtopResponse access$getMtopResponse(NextRPCAbility nextRPCAbility, xij xijVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NextRPCMtopResponse) ipChange.ipc$dispatch("54fe9fa7", new Object[]{nextRPCAbility, xijVar, bool}) : nextRPCAbility.a(xijVar, bool);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void bind(als context, et params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb5f63c", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (this.f2380a != null) {
            return;
        }
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_CREATE_CLIENT);
        this.f2380a = c.Companion.a(params.f8851a);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_CREATE_CLIENT);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void cancel(als context, eu params, gml callback) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c10a918", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        List<String> list = params.f8852a;
        if (list == null || (cVar = this.f2380a) == null) {
            return;
        }
        cVar.a(list);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, tb.xif] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.alibaba.android.nextrpc.streamv2.request.b, T] */
    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void request(als context, ew params, es callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ae1ce8", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_CREATE_REQUEST);
        objectRef.element = new xif();
        ((xif) objectRef.element).b();
        objectRef2.element = new NextRPCAbility$request$$inlined$run$lambda$1(this, objectRef, params, objectRef2).mo2427invoke();
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_CREATE_REQUEST);
        c cVar = this.f2380a;
        if (cVar == null) {
            return;
        }
        cVar.a((b) objectRef2.element, new a(callback, objectRef2, params, objectRef));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"com/alibaba/android/nextrpc/NextRPCAbility$request$2", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestResultCallback;", "onCreateRequest", "", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "onFailure", "errorResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainErrorResponse;", "onFinish", "finishResult", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishResult;", "onReceiveAttachedResponse", "attachedResponses", "", "Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_IS_FINISH, "", "onReceiveData", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ es b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ ew d;
        public final /* synthetic */ Ref.ObjectRef e;

        public a(es esVar, Ref.ObjectRef objectRef, ew ewVar, Ref.ObjectRef objectRef2) {
            this.b = esVar;
            this.c = objectRef;
            this.d = ewVar;
            this.e = objectRef2;
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(b request) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6431ca", new Object[]{this, request});
                return;
            }
            q.d(request, "request");
            es esVar = this.b;
            NextRPCRequest nextRPCRequest = new NextRPCRequest();
            nextRPCRequest.requestID = request.e();
            t tVar = t.INSTANCE;
            esVar.a(nextRPCRequest);
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(xij mainResponse, List<xih> attachedResponses, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41ad6944", new Object[]{this, mainResponse, attachedResponses, new Boolean(z)});
                return;
            }
            q.d(mainResponse, "mainResponse");
            q.d(attachedResponses, "attachedResponses");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            nextRPCReceiveDataResult.mtopResponse = NextRPCAbility.access$getMtopResponse(NextRPCAbility.this, mainResponse, ((b) this.c.element).f());
            nextRPCReceiveDataResult.attachedResponses = NextRPCAbility.access$getAttachedResponses(NextRPCAbility.this, attachedResponses, Boolean.valueOf(this.d.d));
            ((xif) this.e.element).a(mainResponse.f());
            this.b.a(nextRPCReceiveDataResult);
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(List<xih> attachedResponses, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a0b49b", new Object[]{this, attachedResponses, new Boolean(z)});
                return;
            }
            q.d(attachedResponses, "attachedResponses");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            nextRPCReceiveDataResult.attachedResponses = NextRPCAbility.access$getAttachedResponses(NextRPCAbility.this, attachedResponses, Boolean.valueOf(this.d.d));
            this.b.b(nextRPCReceiveDataResult);
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(xii errorResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("752d840", new Object[]{this, errorResponse});
                return;
            }
            q.d(errorResponse, "errorResponse");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            NextRPCMtopResponse nextRPCMtopResponse = new NextRPCMtopResponse();
            NextRPCErrorInfo nextRPCErrorInfo = new NextRPCErrorInfo();
            nextRPCErrorInfo.errorMsg = errorResponse.c();
            nextRPCErrorInfo.retCode = errorResponse.b();
            nextRPCErrorInfo.responseCode = String.valueOf(errorResponse.d());
            nextRPCErrorInfo.mappingCode = errorResponse.e();
            t tVar = t.INSTANCE;
            nextRPCMtopResponse.errorInfo = nextRPCErrorInfo;
            nextRPCReceiveDataResult.mtopResponse = nextRPCMtopResponse;
            ((xif) this.e.element).a(errorResponse.a());
            this.b.c(nextRPCReceiveDataResult);
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(com.alibaba.android.nextrpc.streamv2.request.a finishResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd63bd6b", new Object[]{this, finishResult});
                return;
            }
            q.d(finishResult, "finishResult");
            NextRPCFinishResult nextRPCFinishResult = new NextRPCFinishResult();
            nextRPCFinishResult.errorType = finishResult.b().name();
            nextRPCFinishResult.isSuccess = Boolean.valueOf(finishResult.a());
            nextRPCFinishResult.performance = ((xif) this.e.element).a();
            this.b.a(nextRPCFinishResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void unbind(als context, et params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d7a95", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        c cVar = this.f2380a;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.f2380a;
        if (cVar != null) {
            cVar.a();
        }
        ada.a("NextRPCAbility", "NextRPC能力销毁了", 0L, null, 12, null);
    }

    private final NextRPCMtopResponse a(xij xijVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRPCMtopResponse) ipChange.ipc$dispatch("d479371e", new Object[]{this, xijVar, bool});
        }
        NextRPCMtopResponse nextRPCMtopResponse = new NextRPCMtopResponse();
        nextRPCMtopResponse.responseHeader = xijVar.b();
        if (q.a((Object) bool, (Object) true)) {
            nextRPCMtopResponse.strBody = xijVar.d();
        } else {
            nextRPCMtopResponse.data = xijVar.c();
        }
        nextRPCMtopResponse.currentId = xijVar.a().f;
        return nextRPCMtopResponse;
    }

    private final List<NextRPCAttachedResponse> a(List<xih> list, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38a37273", new Object[]{this, list, bool});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (xih xihVar : list) {
                NextRPCAttachedResponse nextRPCAttachedResponse = new NextRPCAttachedResponse();
                nextRPCAttachedResponse.header = xihVar.a();
                if (q.a((Object) bool, (Object) true)) {
                    nextRPCAttachedResponse.strBody = xihVar.c();
                } else {
                    nextRPCAttachedResponse.body = xihVar.b();
                }
                arrayList.add(nextRPCAttachedResponse);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
        if (kotlin.jvm.internal.q.a((java.lang.Object) (r0 != null ? r0.q : null), (java.lang.Object) "originaljson") != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.tao.remotebusiness.MtopBusiness a(mtopsdk.mtop.domain.MtopRequest r5, com.taobao.android.abilityidl.ability.ew r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.nextrpc.NextRPCAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "3694c93e"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.taobao.tao.remotebusiness.MtopBusiness r5 = (com.taobao.tao.remotebusiness.MtopBusiness) r5
            return r5
        L1b:
            com.taobao.tao.remotebusiness.MtopBusiness r5 = com.taobao.tao.remotebusiness.MtopBusiness.build(r5)
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.d
            goto L28
        L27:
            r0 = r1
        L28:
            java.lang.String r3 = "POST"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r3)
            if (r0 == 0) goto L36
            mtopsdk.mtop.domain.MethodEnum r0 = mtopsdk.mtop.domain.MethodEnum.POST
            r5.mo1305reqMethod(r0)
            goto L3b
        L36:
            mtopsdk.mtop.domain.MethodEnum r0 = mtopsdk.mtop.domain.MethodEnum.GET
            r5.mo1305reqMethod(r0)
        L3b:
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L42
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r0.l
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L5b
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L4d
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r0.l
            if (r0 != 0) goto L54
        L4d:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
        L54:
            java.util.Map r0 = r4.a(r0)
            r5.mo1297headers(r0)
        L5b:
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.f
            goto L63
        L62:
            r0 = r1
        L63:
            java.lang.String r3 = "UNIT_GUIDE"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r3)
            if (r0 == 0) goto L6f
            r5.mo1328setUnitStrategy(r3)
            goto L74
        L6f:
            java.lang.String r0 = "UNIT_TRADE"
            r5.mo1328setUnitStrategy(r0)
        L74:
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L80
            java.lang.Boolean r0 = r0.t
            if (r0 == 0) goto L80
            boolean r2 = r0.booleanValue()
        L80:
            r5.mo1333upstreamCompress(r2)
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.q
            goto L8b
        L8a:
            r0 = r1
        L8b:
            java.lang.String r2 = "json"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r2)
            if (r0 != 0) goto La3
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto L9a
            java.lang.String r0 = r0.q
            goto L9b
        L9a:
            r0 = r1
        L9b:
            java.lang.String r2 = "originaljson"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r2)
            if (r0 == 0) goto Lb3
        La3:
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto La9
            java.lang.String r1 = r0.q
        La9:
            kotlin.jvm.internal.q.a(r1)
            mtopsdk.mtop.domain.JsonTypeEnum r0 = mtopsdk.mtop.domain.JsonTypeEnum.valueOf(r1)
            r5.mo1315setJsonType(r0)
        Lb3:
            com.taobao.android.abilityidl.ability.ev r0 = r6.c
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.o
            if (r0 == 0) goto Lbe
            r5.mo1310setBizTopic(r0)
        Lbe:
            com.taobao.android.abilityidl.ability.ev r6 = r6.c
            if (r6 == 0) goto Lc9
            java.lang.String r6 = r6.r
            if (r6 == 0) goto Lc9
            r5.mo1313setCustomDomain(r6)
        Lc9:
            java.lang.String r6 = "mtopBusiness"
            kotlin.jvm.internal.q.b(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.NextRPCAbility.a(mtopsdk.mtop.domain.MtopRequest, com.taobao.android.abilityidl.ability.ew):com.taobao.tao.remotebusiness.MtopBusiness");
    }

    private final MtopRequest b(ew ewVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("1b28deb7", new Object[]{this, ewVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        ev evVar = ewVar.c;
        Map<String, ? extends Object> map = null;
        mtopRequest.setApiName(evVar != null ? evVar.f8853a : null);
        ev evVar2 = ewVar.c;
        mtopRequest.setVersion(evVar2 != null ? evVar2.b : null);
        ev evVar3 = ewVar.c;
        if (evVar3 != null) {
            z = evVar3.h;
        }
        mtopRequest.setNeedEcode(z);
        mtopRequest.setNeedSession(true);
        ev evVar4 = ewVar.c;
        if (evVar4 != null) {
            map = evVar4.c;
        }
        if (map != null) {
            mtopRequest.setData(map.toString());
        }
        return mtopRequest;
    }

    private final Map<String, String> a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Map c = ai.c(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ai.a(c.size()));
        for (Map.Entry entry : c.entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }
}
