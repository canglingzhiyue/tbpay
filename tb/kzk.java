package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kzk extends kzj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETARROWSPOINT = -212266085137631274L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kyu b = b.b(dXRuntimeContext);
        IPopData c = b.c(dXRuntimeContext);
        if (b == null || c == null) {
            str = "engine or popData is null";
        } else {
            IPopAnchorViewInfo a2 = b.g().a(c);
            if (a2 != null) {
                int screenX = a2.getScreenX() + (a2.getWidth() / 2) + a2.getOffsetX();
                c.b("DXDataParserGetArrowsPoint ", "centerPx=" + screenX + ", iconOffset=" + a2.getOffsetX());
                return Integer.valueOf(gbg.b(dXRuntimeContext.D(), dXRuntimeContext.m(), screenX));
            }
            str = "anchorViewInfo is null";
        }
        c.a("DXDataParserGetArrowsPoint ", str);
        return 0;
    }
}
