package tb;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.vivid.presenter.a;

/* loaded from: classes7.dex */
public class xkj extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RATELISTUSERHEADPIC = 1177035568722277000L;

    public static /* synthetic */ Object ipc$super(xkj xkjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        if (!xkm.INSTANCE.e()) {
            return objArr[0];
        }
        return a(objArr[0], objArr[1], dXRuntimeContext);
    }

    private String a(Object obj, Object obj2, DXRuntimeContext dXRuntimeContext) {
        RateFeedsFragment a2;
        a detailRatePresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f455a82f", new Object[]{this, obj, obj2, dXRuntimeContext});
        }
        if (!(obj instanceof String) || !(obj2 instanceof String) || dXRuntimeContext == null) {
            return "";
        }
        String str = (String) obj;
        return (!(dXRuntimeContext.m() instanceof FragmentActivity) || (a2 = kqa.INSTANCE.a((FragmentActivity) dXRuntimeContext.m(), dXRuntimeContext.D().l())) == null || a2.getDetailRate() == null || (detailRatePresenter = a2.getDetailRatePresenter()) == null) ? str : detailRatePresenter.a(str, (String) obj2);
    }
}
