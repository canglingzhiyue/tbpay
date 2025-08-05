package com.taobao.android.detail.wrapper.ext.video;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import tb.dya;
import tb.eif;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements j<o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11392a;

    static {
        kge.a(92095960);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, oVar}) : a(oVar);
    }

    public e(DetailCoreActivity detailCoreActivity) {
        this.f11392a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.video.PopPicGallerySubscriber");
    }

    public i a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f495c22c", new Object[]{this, oVar});
        }
        dya y = this.f11392a.y();
        eif o = y.o();
        if (o == null) {
            try {
                y.a(new GalleryPopupWindow((RelativeLayout) LayoutInflater.from(this.f11392a).inflate(R.layout.x_detail_main_gallarybig, (ViewGroup) null), -1, -1, this.f11392a));
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("PopPicGallerySubscriber", "Create pic gallery popup window error: ", th);
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
        }
        ((GalleryPopupWindow) o).showGalleryDialog(oVar.f9711a);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
