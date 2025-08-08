package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;

/* loaded from: classes8.dex */
public class oiu extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(98809982);
    }

    public oiu(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue() : bVar != null && (StringUtils.equals(ShareTargetType.Share2QRCode.getValue(), bVar.b()) || StringUtils.equals(ShareTargetType.Share2ScanCode.getValue(), bVar.b()));
    }

    @Override // tb.oio
    public void c(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
        } else if (bVar.b() == null) {
        } else {
            oig.a(bVar.b(), null);
            AnalyticsUtil.traceViewClickOthers(bVar, null);
        }
    }
}
