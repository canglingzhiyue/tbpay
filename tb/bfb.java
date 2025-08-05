package tb;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes2.dex */
public class bfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bbz b;
    private PopupWindow c;
    private View d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25844a = false;
    private int e = 0;
    private int f = 0;
    private bmy g = new bmy() { // from class: tb.bfb.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bmy
        public void a(bmz bmzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
            } else if (bmzVar == null) {
            } else {
                int intValue = ((Integer) bmzVar.b(DIConstants.EVENT_NAME_LIFE_CYCLE)).intValue();
                if (intValue == 10002) {
                    if (!bfb.this.f25844a) {
                        return;
                    }
                    bfb bfbVar = bfb.this;
                    bfbVar.a(bfb.a(bfbVar), bfb.b(bfb.this));
                } else if (intValue != 10005) {
                } else {
                    if (bfb.c(bfb.this) == null || !bfb.c(bfb.this).isShowing()) {
                        bfb.this.f25844a = false;
                        return;
                    }
                    bfb bfbVar2 = bfb.this;
                    bfbVar2.f25844a = true;
                    bfbVar2.b();
                }
            }
        }
    };

    static {
        kge.a(-1316195689);
    }

    public static /* synthetic */ int a(bfb bfbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e19ac56d", new Object[]{bfbVar})).intValue() : bfbVar.e;
    }

    public static /* synthetic */ int b(bfb bfbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d01dcbee", new Object[]{bfbVar})).intValue() : bfbVar.f;
    }

    public static /* synthetic */ PopupWindow c(bfb bfbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("d06f24b8", new Object[]{bfbVar}) : bfbVar.c;
    }

    public static /* synthetic */ bbz d(bfb bfbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("1068e1ef", new Object[]{bfbVar}) : bfbVar.b;
    }

    public bfb(bbz bbzVar) {
        this.b = bbzVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b.n().j() || this.b.x().f()) {
        } else {
            int l = bem.l(this.b.n());
            int f = CheckHoldManager.a().f();
            if (f >= l) {
                a(f, l);
            } else {
                b();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.c.dismiss();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.c == null || this.d == null) {
            this.d = View.inflate(this.b.m(), R.layout.icart_promotion_max_count_bubble, null);
            this.c = new PopupWindow(this.d, -2, -2, true);
            this.c.setFocusable(false);
            this.c.setOutsideTouchable(false);
            this.c.setBackgroundDrawable(new BitmapDrawable());
            this.d.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: tb.bfb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    bfb.c(bfb.this).dismiss();
                    bex.a(bfb.d(bfb.this), "Page_ShoppingCart_Submit_OverMaxTipsClose", new String[0]);
                }
            });
            this.b.F().a("cartLifecycle", this.g);
        }
        ((TUrlImageView) this.d.findViewById(R.id.image_bg)).setImageUrl("https://gw.alicdn.com/tfs/TB11JU5xhD1gK0jSZFsXXbldVXa-726-221.png");
        this.e = i;
        this.f = i2;
        String b = b(this.e, i2);
        if (!TextUtils.isEmpty(b)) {
            ((TextView) this.d.findViewById(R.id.tv_content)).setText(b);
        }
        if (!this.c.isShowing()) {
            ViewGroup r = this.b.x().r();
            final ViewGroup c = this.b.x().c();
            final DXRootView a2 = bek.a(r, "submit");
            if (a2 != null) {
                a2.post(new Runnable() { // from class: tb.bfb.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!bfb.d(bfb.this).u().isResumed()) {
                            UnifyLog.d("PromotionManager", "pop return, fragment is not resume");
                        } else if (bfb.d(bfb.this).x().f() || bfb.d(bfb.this).n().j()) {
                        } else {
                            bfb.c(bfb.this).showAtLocation(a2, 0, 0, (c.getMeasuredHeight() - (a2.getMeasuredHeight() * 2)) + 40);
                        }
                    }
                });
            }
        }
        bex.b(this.b, "Page_ShoppingCart_Submit_OverMaxTips_Show", new String[0]);
    }

    private String b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b119b7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == i2) {
            return this.b.m().getResources().getString(R.string.cart_choice_50_quantity, Integer.valueOf(i));
        }
        if (i <= i2) {
            return null;
        }
        String format = String.format(this.b.m().getResources().getString(R.string.cart_choice_max_quantity), String.valueOf(i));
        bed.a("checkOverMax", format);
        return format;
    }
}
