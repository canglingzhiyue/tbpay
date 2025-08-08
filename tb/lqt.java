package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.homepage.pop.model.pop.PopData;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import java.util.List;

/* loaded from: classes7.dex */
public class lqt extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DELETEHOSTCARD = -8809784351616054887L;

    static {
        kge.a(-364192269);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        lad d;
        List<PopSectionModel> sections;
        PopSectionModel popSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return null;
        }
        kyu b = b.b(h);
        IPopData c = b.c(h);
        if (b == null || !(c instanceof PopData) || (d = b.d()) == null || (sections = ((PopData) c).getSections()) == null || sections.isEmpty() || (popSectionModel = sections.get(0)) == null) {
            return null;
        }
        String string = popSectionModel.getExt().getString("sectionBizCode");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        d.b(string);
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-575008310);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lqt a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lqt) ipChange.ipc$dispatch("16bdbe13", new Object[]{this, obj}) : new lqt();
        }
    }
}
