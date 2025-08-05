package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.d;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ffv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseFrame f27910a;
    private Context b;
    private Runnable c;
    private Runnable d;
    private Handler e = new Handler(Looper.getMainLooper());
    private PopupWindow f;
    private a g;

    static {
        kge.a(1219788406);
    }

    public static /* synthetic */ Context a(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("10f4185a", new Object[]{ffvVar}) : ffvVar.b;
    }

    public static /* synthetic */ BaseFrame b(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("2fedecdd", new Object[]{ffvVar}) : ffvVar.f27910a;
    }

    public static /* synthetic */ PopupWindow c(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("69fdb9d0", new Object[]{ffvVar}) : ffvVar.f;
    }

    public static /* synthetic */ a d(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8a87d61a", new Object[]{ffvVar}) : ffvVar.g;
    }

    public static /* synthetic */ Runnable e(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4902166e", new Object[]{ffvVar}) : ffvVar.d;
    }

    public static /* synthetic */ Handler f(ffv ffvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("eba35f7f", new Object[]{ffvVar}) : ffvVar.e;
    }

    public ffv(Context context, BaseFrame baseFrame, a aVar) {
        this.b = context;
        this.f27910a = baseFrame;
        this.g = aVar;
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_more_switch_tip_layout, (ViewGroup) null, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_more_switch_tip_image);
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01XfVozo1SikKy11ZcW_!!6000000002281-2-tps-435-108.png");
            this.f = new PopupWindow(this.b);
            this.f.setContentView(inflate);
            this.f.setAnimationStyle(R.style.taolive_switch_pop_anim_style);
            this.f.setBackgroundDrawable(null);
            this.f.setWidth(-2);
            this.f.setHeight(-2);
        }
        this.c = new Runnable() { // from class: tb.ffv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (ffv.a(ffv.this) != null && ffv.b(ffv.this) != null) {
                        View viewByName = ffv.b(ffv.this).getViewByName("more");
                        if (viewByName != null && ffv.c(ffv.this) != null) {
                            ffv.c(ffv.this).showAsDropDown(viewByName, -d.a(ffv.a(ffv.this), 148.0f), -viewByName.getHeight());
                        }
                        ai.a(ffv.d(ffv.this), "Show-BottomToast_Definition", (HashMap<String, String>) null);
                        ffv.f(ffv.this).postDelayed(ffv.e(ffv.this), aa.ci() * 1000);
                        ab.c("MoreSwitchGuideTip", "real show");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.d = new Runnable() { // from class: tb.ffv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (ffv.c(ffv.this) != null) {
                        ffv.c(ffv.this).dismiss();
                    }
                    ab.c("MoreSwitchGuideTip", "dismiss");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ab.c("MoreSwitchGuideTip", "show");
        ai.a(this.g, "Show-DefinitionTip_Switch", (HashMap<String, String>) null);
        this.e.postDelayed(this.c, 3200L);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ab.c("MoreSwitchGuideTip", DMComponent.RESET);
        this.e.removeCallbacks(this.c);
        this.e.removeCallbacks(this.d);
    }
}
