package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class htg extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ResultMainInfoBean f28775a = new ResultMainInfoBean();

    static {
        kge.a(1887720814);
    }

    public static /* synthetic */ Object ipc$super(htg htgVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 91915241:
                super.b();
                return null;
            case 94685808:
                return new Boolean(super.e());
            case 95609329:
                return new Boolean(super.f());
            case 441941092:
                super.a((a) objArr[0]);
                return null;
            case 771706853:
                super.b((a) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final ResultMainInfoBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultMainInfoBean) ipChange.ipc$dispatch("5403693d", new Object[]{this}) : this.f28775a;
    }

    public final void a(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944c80b7", new Object[]{this, resultMainInfoBean});
            return;
        }
        q.c(resultMainInfoBean, "<set-?>");
        this.f28775a = resultMainInfoBean;
    }

    @Override // com.taobao.android.meta.data.a
    public void a(a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a577c64", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        super.a(combo);
        this.f28775a.page++;
        this.f28775a.totalPage = ((htg) combo).f28775a.totalPage;
        a(combo.o());
    }

    @Override // com.taobao.android.meta.data.a
    public void b(a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff4fe5", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        super.b(combo);
        this.f28775a = ((htg) combo).f28775a;
    }

    @Override // com.taobao.android.meta.data.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.f28775a.style = n();
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f28775a.pageSize;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f28775a.page + 1;
    }

    @Override // com.taobao.android.meta.data.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        boolean e = super.e();
        return StringUtils.equals(this.f28775a.pageName, nne.PAGE_NAME_INSHOP) ? e : e || g() <= 0 || this.f28775a.page >= g();
    }

    @Override // com.taobao.android.meta.data.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : super.f() && !(w().get(0) instanceof SrpStateCell);
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        int i = this.f28775a.totalResult / this.f28775a.pageSize;
        return this.f28775a.totalResult % this.f28775a.pageSize > 0 ? i + 1 : i;
    }

    @Override // com.taobao.android.meta.data.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = this.f28775a;
        resultMainInfoBean.page = 0;
        resultMainInfoBean.pageSize = 10;
        resultMainInfoBean.totalResult = 0;
        a((Boolean) false);
    }

    public void a(BaseCellBean cell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0c273a", new Object[]{this, cell});
            return;
        }
        q.c(cell, "cell");
        x();
        b(cell);
    }
}
