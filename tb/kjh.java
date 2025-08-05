package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserTBOrange;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalWithArgs", "", "operationList", "", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "getReallyNormalOrangeConfig", "", DxContainerActivity.PARAMS_NAMESPACE, "nameKey", "default", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_TBORANGE = 3917203473981811130L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserTBOrange$Companion;", "", "()V", "DX_PARSER_TBORANGE", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(kjh kjhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    @Override // tb.fuf, tb.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r6, com.taobao.android.dinamicx.DXRuntimeContext r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kjh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "ccd8bd96"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            return r6
        L19:
            if (r6 == 0) goto L26
            int r7 = r6.length
            if (r7 != 0) goto L20
            r7 = 1
            goto L21
        L20:
            r7 = 0
        L21:
            if (r7 == 0) goto L24
            goto L26
        L24:
            r7 = 0
            goto L27
        L26:
            r7 = 1
        L27:
            r0 = 0
            if (r7 == 0) goto L2b
            return r0
        L2b:
            int r7 = r6.length
            java.lang.String r1 = ""
            if (r7 <= r2) goto L4c
            r7 = r6[r4]
            boolean r7 = r7 instanceof java.lang.String
            if (r7 == 0) goto L49
            r7 = r6[r3]
            boolean r7 = r7 instanceof java.lang.String
            if (r7 != 0) goto L3d
            goto L49
        L3d:
            r7 = r6[r2]
            boolean r2 = r7 instanceof java.lang.String
            if (r2 != 0) goto L44
            r7 = r0
        L44:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4d
            goto L4c
        L49:
            r6 = r6[r2]
            return r6
        L4c:
            r7 = r1
        L4d:
            r2 = r6[r4]
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L54
            r2 = r0
        L54:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L59
            r2 = r1
        L59:
            r6 = r6[r3]
            boolean r3 = r6 instanceof java.lang.String
            if (r3 != 0) goto L60
            r6 = r0
        L60:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L65
            r6 = r1
        L65:
            java.lang.String r6 = r5.a(r2, r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kjh.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }

    private final String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
