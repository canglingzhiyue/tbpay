package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.h;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.u;

/* loaded from: classes8.dex */
public class pot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_QUALITY_SWITCH_TIPS = "com.taobao.taolive.room.quality_switch_tips";

    /* renamed from: a  reason: collision with root package name */
    private PopupWindow f32785a;
    private Context b;

    static {
        kge.a(-1888208166);
    }

    public static /* synthetic */ Context a(pot potVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a9dfc65b", new Object[]{potVar}) : potVar.b;
    }

    public static /* synthetic */ PopupWindow b(pot potVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("9d2dcf50", new Object[]{potVar}) : potVar.f32785a;
    }

    public pot(Context context) {
        TextView textView;
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_quality_switch_tips, (ViewGroup) null);
        this.f32785a = new PopupWindow(context);
        this.f32785a.setContentView(inflate);
        this.f32785a.setWidth(b.a(this.b, 164.0f));
        this.f32785a.setHeight(b.a(this.b, 49.0f));
        this.f32785a.setFocusable(true);
        this.f32785a.setOutsideTouchable(false);
        this.f32785a.setBackgroundDrawable(new ColorDrawable(0));
        if (inflate == null || (textView = (TextView) inflate.findViewById(R.id.tblive_tips_content)) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("在这里调整清晰度哦~");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFCC33")), 3, 8, 33);
        textView.setText(spannableString);
    }

    public void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!u.aA()) {
            n.a(pou.TAG, "show enableShowQualitySwitchTips = false");
        } else if (view == null) {
        } else {
            view.requestLayout();
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.pot.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    view2.removeOnLayoutChangeListener(this);
                    if (pot.a(pot.this) == null || pot.b(pot.this) == null || !(pot.a(pot.this) instanceof Activity) || ((Activity) pot.a(pot.this)).isDestroyed() || ((Activity) pot.a(pot.this)).isFinishing() || Build.VERSION.SDK_INT < 19) {
                        return;
                    }
                    pot.b(pot.this).showAsDropDown(view, ((-b.a(pot.a(pot.this), 164.0f)) / 2) + (view.getWidth() / 2), ((-view.getHeight()) - b.a(pot.a(pot.this), 49.0f)) - b.a(pot.a(pot.this), 10.0f));
                    h.a().a(new Runnable() { // from class: tb.pot.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (pot.b(pot.this) == null) {
                            } else {
                                n.a("QualitySwitchTips", "dismiss");
                                pot.b(pot.this).dismiss();
                            }
                        }
                    }, 3000L);
                }
            });
        }
    }
}
