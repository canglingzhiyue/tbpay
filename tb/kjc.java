package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateUnitExchange;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalWithArgs", "", "operationList", "", "runtimeParam", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "exchange", "", "number", "", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_RATEUNITEXCHANGE = 1120268768613412447L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateUnitExchange$Companion;", "", "()V", "DX_PARSER_RATEUNITEXCHANGE", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(kjc kjcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        try {
            if (objArr[0] instanceof String) {
                Object obj = objArr[0];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                return a(Integer.parseInt((String) obj));
            } else if (objArr[0] instanceof Integer) {
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                return a(((Integer) obj2).intValue());
            } else {
                return objArr[0];
            }
        } catch (Throwable unused) {
            return objArr[0];
        }
    }

    private final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        if (i > 100000) {
            return com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_over_100k);
        }
        if (10000 <= i && 100000 >= i) {
            StringBuilder sb = new StringBuilder();
            w wVar = w.INSTANCE;
            Object[] objArr = {Float.valueOf(i / 10000)};
            String format = String.format("%.1f", Arrays.copyOf(objArr, objArr.length));
            q.b(format, "java.lang.String.format(format, *args)");
            sb.append(format);
            sb.append(com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_ten_thousand));
            return n.a(sb.toString(), ",", ".", false, 4, (Object) null);
        } else if (1000 <= i && 9999 >= i) {
            StringBuilder sb2 = new StringBuilder();
            w wVar2 = w.INSTANCE;
            Object[] objArr2 = {Float.valueOf(i / 1000)};
            String format2 = String.format("%.1f", Arrays.copyOf(objArr2, objArr2.length));
            q.b(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
            sb2.append(com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_thousand));
            return n.a(sb2.toString(), ",", ".", false, 4, (Object) null);
        } else {
            return String.valueOf(i);
        }
    }
}
