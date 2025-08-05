package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.icart.widget.touch.tips.DragTips;

/* loaded from: classes5.dex */
public class goe implements goi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1235047831);
        kge.a(1332052928);
    }

    @Override // tb.goi
    public gon a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gon) ipChange.ipc$dispatch("303000a2", new Object[]{this, bbzVar}) : new gpf(bbzVar);
    }

    @Override // tb.goi
    public goj b(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (goj) ipChange.ipc$dispatch("17d1d685", new Object[]{this, bbzVar}) : new gop();
    }

    @Override // tb.goi
    public gol a(bbz bbzVar, RecyclerView recyclerView, TipsLineFollower tipsLineFollower, DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gol) ipChange.ipc$dispatch("9601558f", new Object[]{this, bbzVar, recyclerView, tipsLineFollower, dragFloatLayer}) : new DragTips(recyclerView, tipsLineFollower, dragFloatLayer);
    }

    @Override // tb.goi
    public gok c(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gok) ipChange.ipc$dispatch("ff73ad03", new Object[]{this, bbzVar}) : new goy(bbzVar);
    }
}
