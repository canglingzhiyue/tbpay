package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public abstract class jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPLIT = ".";
    public static final String TAG = "TS.expression";

    /* renamed from: a  reason: collision with root package name */
    public String f29616a;

    static {
        kge.a(-559934728);
    }

    public abstract Object a(a aVar);

    public static jku a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jku) ipChange.ipc$dispatch("e2d7e313", new Object[]{str, objArr});
        }
        if (str == null || str == "") {
            return null;
        }
        jku b = com.taobao.android.tschedule.parser.expr.location.a.b(str, objArr);
        if (b == null) {
            b = com.taobao.android.tschedule.parser.expr.login.a.b(str, objArr);
        }
        if (b == null) {
            b = jkv.b(str, objArr);
        }
        if (b == null) {
            b = jkw.b(str, objArr);
        }
        if (b == null) {
            b = com.taobao.android.tschedule.parser.expr.edition.a.b(str, objArr);
        }
        if (b == null) {
            b = jlo.b(str, objArr);
        }
        if (b == null) {
            b = jlk.b(str, objArr);
        }
        if (b == null) {
            b = jlf.b(str, objArr);
        }
        if (b == null) {
            b = jld.b(str, objArr);
        }
        if (b == null) {
            b = jle.b(str, objArr);
        }
        if (b == null) {
            b = jlh.b(str, objArr);
        }
        if (b == null) {
            b = jlg.b(str, objArr);
        }
        if (b == null) {
            b = jln.b(str, objArr);
        }
        if (b == null) {
            b = jlm.b(str, objArr);
        }
        if (b == null) {
            b = jkz.b(str, objArr);
        }
        if (b == null) {
            b = jli.b(str, objArr);
        }
        if (b == null) {
            b = jlc.b(str, objArr);
        }
        if (b == null) {
            b = jll.b(str, objArr);
        }
        if (b == null) {
            b = jky.b(str, objArr);
        }
        if (b == null) {
            b = jkx.b(str, objArr);
        }
        if (b == null) {
            b = jlj.b(str, objArr);
        }
        if (b == null) {
            b = jla.b(str, objArr);
        }
        return b == null ? jlb.b(str, objArr) : b;
    }
}
