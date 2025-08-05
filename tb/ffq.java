package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class ffq implements j<o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f27903a;

    static {
        kge.a(-1789422457);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, oVar}) : a(oVar);
    }

    public ffq(Context context) {
        if (context instanceof Activity) {
            this.f27903a = (Activity) context;
        }
        emu.a("com.taobao.android.detail.wrapper.newdesc.event.PopPicGallerySubscriber");
    }

    public i a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f495c22c", new Object[]{this, oVar});
        }
        Activity activity = this.f27903a;
        if (activity == null) {
            return a.FAILURE;
        }
        try {
            new GalleryPopupWindow((RelativeLayout) LayoutInflater.from(activity).inflate(R.layout.x_detail_main_gallarybig, (ViewGroup) null), -1, -1, this.f27903a).showGalleryDialog(oVar.f9711a);
            return a.SUCCESS;
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("PopPicGallerySubscriber", "Create pic gallery popup window error: ", th);
            return a.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
