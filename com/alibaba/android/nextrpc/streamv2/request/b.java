package com.alibaba.android.nextrpc.streamv2.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MtopRequest;
import tb.bfo;
import tb.eau;
import tb.nfc;
import tb.riy;
import tb.xif;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0014JL\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "", "mtopRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "mtopBusiness", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, "Lcom/alibaba/android/nextrpc/streamv2/performance/Performance;", "allTimeOutSeconds", "", "reqId", "", bfo.sParamsKeyDisableJSONParse, "", "(Lmtopsdk/mtop/domain/MtopRequest;Lcom/taobao/tao/remotebusiness/MtopBusiness;Lcom/alibaba/android/nextrpc/streamv2/performance/Performance;ILjava/lang/String;Ljava/lang/Boolean;)V", "getAllTimeOutSeconds", "()I", "setAllTimeOutSeconds", "(I)V", "getDisableJSONParse", "()Ljava/lang/Boolean;", "setDisableJSONParse", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMtopBusiness", "()Lcom/taobao/tao/remotebusiness/MtopBusiness;", "getMtopRequest", "()Lmtopsdk/mtop/domain/MtopRequest;", "getPerformance", "()Lcom/alibaba/android/nextrpc/streamv2/performance/Performance;", "setPerformance", "(Lcom/alibaba/android/nextrpc/streamv2/performance/Performance;)V", "getReqId", "()Ljava/lang/String;", "setReqId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lmtopsdk/mtop/domain/MtopRequest;Lcom/taobao/tao/remotebusiness/MtopBusiness;Lcom/alibaba/android/nextrpc/streamv2/performance/Performance;ILjava/lang/String;Ljava/lang/Boolean;)Lcom/alibaba/android/nextrpc/streamv2/request/Request;", eau.PARSER_TAG, "other", "hashCode", "toString", "Companion", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final MtopRequest f2401a;
    private final MtopBusiness b;
    private xif c;
    private int d;
    private String e;
    private Boolean f;

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a(this.f2401a, bVar.f2401a) || !q.a(this.b, bVar.b) || !q.a(this.c, bVar.c) || this.d != bVar.d || !q.a((Object) this.e, (Object) bVar.e) || !q.a(this.f, bVar.f)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        MtopRequest mtopRequest = this.f2401a;
        int hashCode = (mtopRequest != null ? mtopRequest.hashCode() : 0) * 31;
        MtopBusiness mtopBusiness = this.b;
        int hashCode2 = (hashCode + (mtopBusiness != null ? mtopBusiness.hashCode() : 0)) * 31;
        xif xifVar = this.c;
        int hashCode3 = (((hashCode2 + (xifVar != null ? xifVar.hashCode() : 0)) * 31) + this.d) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Request(mtopRequest=" + this.f2401a + ", mtopBusiness=" + this.b + ", performance=" + this.c + ", allTimeOutSeconds=" + this.d + ", reqId=" + this.e + ", disableJSONParse=" + this.f + riy.BRACKET_END_STR;
    }

    public b(MtopRequest mtopRequest, MtopBusiness mtopBusiness, xif performance, int i, String reqId, Boolean bool) {
        q.d(mtopRequest, "mtopRequest");
        q.d(mtopBusiness, "mtopBusiness");
        q.d(performance, "performance");
        q.d(reqId, "reqId");
        this.f2401a = mtopRequest;
        this.b = mtopBusiness;
        this.c = performance;
        this.d = i;
        this.e = reqId;
        this.f = bool;
    }

    public final MtopRequest a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("d9d4d093", new Object[]{this}) : this.f2401a;
    }

    public final MtopBusiness b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("6702b6b", new Object[]{this}) : this.b;
    }

    public /* synthetic */ b(MtopRequest mtopRequest, MtopBusiness mtopBusiness, xif xifVar, int i, String str, Boolean bool, int i2, o oVar) {
        this(mtopRequest, mtopBusiness, (i2 & 4) != 0 ? new xif() : xifVar, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? null : bool);
    }

    public final void a(xif xifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7517b23", new Object[]{this, xifVar});
            return;
        }
        q.d(xifVar, "<set-?>");
        this.c = xifVar;
    }

    public final xif c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xif) ipChange.ipc$dispatch("1e7012e7", new Object[]{this}) : this.c;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.e = str;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final Boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ce72322a", new Object[]{this}) : this.f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/Request$Companion;", "", "()V", "create", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "mtopRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "mtopBusiness", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final b a(MtopRequest mtopRequest, MtopBusiness mtopBusiness) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cbb1f8a7", new Object[]{this, mtopRequest, mtopBusiness});
            }
            q.d(mtopRequest, "mtopRequest");
            q.d(mtopBusiness, "mtopBusiness");
            return new b(mtopRequest, mtopBusiness, null, 0, null, null, 60, null);
        }
    }
}
