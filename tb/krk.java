package tb;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public final class krk extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f30278a;
    public static int b;
    public static int c;
    public static int d;
    private final String e;
    private psw f;
    private long g;
    private int h;
    private int i;
    private String j;
    private boolean k;
    private int l;
    private FluidContext m;

    static {
        kge.a(1341155260);
        f30278a = 0;
        b = 1;
        c = 2;
        d = 3;
    }

    public krk(FluidContext fluidContext, View view) {
        super(view);
        this.e = "https://img.alicdn.com/imgextra/i3/O1CN01YTVEsl1h0WJG5PebB_!!6000000004215-54-tps-117-117.apng";
        this.k = false;
        this.l = -1;
        view.setTag(R.id.fluid_sdk_footer_loading, true);
        this.m = fluidContext;
        ImageView imageView = new ImageView(view.getContext());
        int b2 = ohd.b(view.getContext(), 30);
        int b3 = ohd.b(view.getContext(), 15);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2, 17);
        layoutParams.topMargin = b3;
        layoutParams.bottomMargin = b3;
        imageView.setLayoutParams(layoutParams);
        FluidSDK.getImageAdapter().load("https://img.alicdn.com/imgextra/i3/O1CN01YTVEsl1h0WJG5PebB_!!6000000004215-54-tps-117-117.apng", imageView, null);
        ((ViewGroup) view).addView(imageView);
        spz.c("RecyclerFooterViewHolder", "RecyclerFooterViewHolder init");
    }

    public void a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{this, pswVar});
        } else {
            this.f = pswVar;
        }
    }

    public psw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("f094cca", new Object[]{this}) : this.f;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ogh.a("LoadingviewOnShow");
        this.k = true;
        this.l = getAdapterPosition();
        spz.c("RecyclerFooterViewHolder", "onShow Position = " + this.l + " opacityCard=" + this.f);
        psw pswVar = this.f;
        if (pswVar != null) {
            sme.b(pswVar);
        } else if (sil.e()) {
            smk.a(this.m, "1", null, "0", null, null);
        }
        this.g = SystemClock.elapsedRealtime();
        this.h = getAdapterPosition();
        this.i = b;
        ogh.b();
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.i = i;
        this.j = str;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.k = false;
        spz.c("RecyclerFooterViewHolder", "onHide Position=" + this.l);
        b.a(this.h - 1, this.i, SystemClock.elapsedRealtime() - this.g, this.j);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.k;
    }
}
