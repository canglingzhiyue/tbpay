package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.utils.e;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes7.dex */
public class sto extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HREFRESHIMAGE = -613601828156924633L;

    static {
        kge.a(244548132);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || lVar == null) {
            return null;
        }
        String c = dlhVar.c("userId");
        if (StringUtils.isEmpty(c)) {
            e.e("HRefreshImageAbility", "userId is empty");
            return null;
        }
        String c2 = dlhVar.c("imageUrl");
        if (StringUtils.isEmpty(c2)) {
            e.e("HRefreshImageAbility", "imageUrl is empty");
            return null;
        }
        DXRootView i = lVar.i();
        if (i == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = i.getExpandWidgetNode().queryWidgetNodeByUserId(c);
        if (queryWidgetNodeByUserId == null) {
            e.e("HRefreshImageAbility", "imageNode is null");
            return null;
        }
        View v = queryWidgetNodeByUserId.getDXRuntimeContext().v();
        if (!(v instanceof TUrlImageView)) {
            e.e("HRefreshImageAbility", "nativeView is not TUrlImageView");
            return null;
        }
        ((TUrlImageView) v).setImageUrl(c2);
        e.e("HRefreshImageAbility", "refresh image widgetNode: " + c + " imageUrl: " + c2);
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1916269819);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public sto a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (sto) ipChange.ipc$dispatch("16c0f754", new Object[]{this, obj}) : new sto();
        }
    }
}
