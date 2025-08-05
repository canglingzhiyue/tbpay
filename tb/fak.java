package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.open.j;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fak extends b<fbb> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private LinearLayout l;
    private ArrayList<epf> m;
    private String n;
    private String o;
    private TextView p;
    private LinearLayout q;

    static {
        kge.a(1255020786);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(fak fakVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(fbb fbbVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6b8d077", new Object[]{this, fbbVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbbVar})).booleanValue() : b2(fbbVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbbVar}) : a2(fbbVar);
    }

    public fak(Activity activity) {
        super(activity);
        this.m = new ArrayList<>();
        this.k = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_containerstyle4, null);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.CompositeContainerViewHolder");
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private void c2(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53bd6f4", new Object[]{this, fbbVar});
            return;
        }
        this.l = (LinearLayout) this.k.findViewById(R.id.childrenContainer);
        String str = fbbVar.f27732a;
        if (!rjq.a(str)) {
            this.o = str;
        }
        this.q = (LinearLayout) this.k.findViewById(R.id.btnMore);
        if (TextUtils.isEmpty(this.o)) {
            this.o = this.i.getString(R.string.detail_desc_see_more);
        }
        if (this.m.size() <= 0) {
            return;
        }
        a(this.o, this);
        this.q.addView(this.p);
        a(this.m.get(0), false);
        if (this.m.size() > 1) {
            a(true);
        } else {
            a(false);
        }
    }

    private void a(epf epfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba2297", new Object[]{this, epfVar, new Boolean(z)});
            return;
        }
        b a2 = j.a(this.g, epfVar);
        View d = a2.d((b) epfVar);
        a2.e((b) epfVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.topMargin = (int) (epo.f27511a * 15.0f);
        }
        this.l.addView(d, layoutParams);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int childCount = this.l.getChildCount();
        if (childCount == 1) {
            dzh.d(this.g, ((fbb) this.c).y, ((fbb) this.c).z);
            this.p.setText(this.i.getString(R.string.detail_desc_pack_up));
            if (1 >= this.m.size()) {
                return;
            }
            for (int i = 1; i < this.m.size(); i++) {
                a(this.m.get(i), false);
            }
        } else if (childCount > 1) {
            dzh.e(this.g, ((fbb) this.c).y, ((fbb) this.c).z);
            this.p.setText(this.o);
            for (int i2 = childCount - 1; i2 >= 1; i2--) {
                this.l.removeViewAt(i2);
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4489b4", new Object[]{this, fbbVar});
        }
        this.m = fbbVar.d();
        this.n = fbbVar.t;
        c2(fbbVar);
        return this.k;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.g);
        }
        if (this.p == null) {
            this.p = new TextView(this.g);
            this.p.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.p.setBackgroundColor(this.i.getColor(R.color.detail_white));
            this.p.setPadding(0, epo.b(10), 0, epo.b(10));
            this.p.setGravity(17);
            this.p.setTextColor(this.i.getColor(R.color.detail_gray));
            this.p.setTextSize(1, 14.0f);
        }
        this.p.setText(str);
        this.p.setOnClickListener(onClickListener);
        return this.p;
    }
}
