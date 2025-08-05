package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.detail.widget.container.a;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.locator.callback.b;
import com.taobao.taobao.R;
import tb.epl;

/* loaded from: classes4.dex */
public class dye extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailDivision";

    /* renamed from: a  reason: collision with root package name */
    private Context f27098a;
    private View b;
    private View c;
    private View d;
    private egz e;
    private boolean f;

    static {
        kge.a(1475728404);
    }

    public static /* synthetic */ Object ipc$super(dye dyeVar, String str, Object... objArr) {
        if (str.hashCode() == -414738562) {
            super.a((epe) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public dye(Context context) {
        super(context);
        this.f = false;
        this.f27098a = context;
        this.b = d.b(context, R.layout.x_detail_container_divider);
        this.c = this.b.findViewById(R.id.textLayout);
        this.d = this.b.findViewById(R.id.highlightLayout);
        emu.a("com.taobao.android.detail.core.detail.controller.DetailDivisionController");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        super.a(epeVar);
        if (!(epeVar instanceof egz)) {
            return;
        }
        this.e = (egz) epeVar;
        b();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.b.getMeasuredHeight();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        egz egzVar = this.e;
        if (egzVar == null) {
            return null;
        }
        return egzVar.mLocatorId;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        egz egzVar = this.e;
        if (egzVar == null) {
            return;
        }
        if ("text".equals(egzVar.f27303a)) {
            TextView textView = (TextView) this.c.findViewById(R.id.divider_text);
            DetailImageView detailImageView = (DetailImageView) this.c.findViewById(R.id.divider_logo);
            textView.setVisibility(0);
            textView.setText(this.e.c);
            String str = this.e.d;
            try {
                if (!TextUtils.isEmpty(str)) {
                    textView.setTextColor(c.a(str));
                }
            } catch (IllegalArgumentException e) {
                i.a("DetailDivision", "parse color error", e);
            }
            String str2 = this.e.b;
            if (!TextUtils.isEmpty(str2)) {
                epj.b().a(str2, detailImageView, new epl.a().a(true).a());
            } else {
                detailImageView.setVisibility(8);
            }
        } else if ("textHighlight".equals(this.e.f27303a)) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.divider_text);
            DetailImageView detailImageView2 = (DetailImageView) this.d.findViewById(R.id.divider_logo);
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(this.e.c);
            View findViewById = this.d.findViewById(R.id.left_line);
            View findViewById2 = this.d.findViewById(R.id.right_line);
            int a2 = c.a(this.e.d);
            if (a2 != 0) {
                textView2.setTextColor(a2);
                findViewById.setBackgroundColor(a2);
                findViewById2.setBackgroundColor(a2);
            }
            String str3 = this.e.b;
            if (!TextUtils.isEmpty(str3)) {
                epj.b().a(str3, detailImageView2, new epl.a().a(true).a());
            } else {
                detailImageView2.setVisibility(8);
            }
        } else if ("gone".equals(this.e.f27303a)) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            if (this.e.e >= 0) {
                View view = new View(this.b.getContext());
                if (this.b instanceof FrameLayout) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, this.e.e));
                    ((FrameLayout) this.b).addView(view);
                }
                if (this.e.f != null) {
                    view.setBackgroundColor(c.a(this.e.f));
                }
            }
        }
        this.f = true;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f) {
        } else {
            a();
        }
    }
}
