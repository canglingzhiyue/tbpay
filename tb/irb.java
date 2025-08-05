package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class irb extends iuf<TabLayout, ird> implements TabLayout.b, ire {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29244a;
    public TabLayout b;
    public int c;
    public int d;

    static {
        kge.a(1946356627);
        kge.a(-2053650166);
        kge.a(-1918434938);
    }

    public static /* synthetic */ Object ipc$super(irb irbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabReselected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.design.widget.TabLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ TabLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.support.design.widget.TabLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ TabLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    public TabLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("511bdd2b", new Object[]{this, context, viewGroup});
        }
        this.c = context.getResources().getColor(R.color.libsf_black);
        this.d = context.getResources().getColor(R.color.libsf_tab_selected);
        this.b = (TabLayout) LayoutInflater.from(context).inflate(R.layout.libsf_srp_tab, viewGroup, false);
        return this.b;
    }

    public TabLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabLayout) ipChange.ipc$dispatch("98141bf4", new Object[]{this}) : this.b;
    }

    @Override // tb.ire
    public void a(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50fce40", new Object[]{this, viewPager, new Boolean(z)});
            return;
        }
        TabLayout a2 = a();
        if (z) {
            a2.setTabMode(0);
        }
        a2.addOnTabSelectedListener(this);
        a2.setupWithViewPager(viewPager);
    }

    @Override // tb.ire
    public void cZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed4f6f", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    @Override // tb.ire
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // tb.ire
    public void e() {
        TabBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.b.getContext());
        if (from == null) {
            return;
        }
        final int i = 0;
        for (int i2 = 0; i2 < this.b.getTabCount(); i2++) {
            TabLayout.d tabAt = this.b.getTabAt(i2);
            if (tabAt != null && (a2 = q().a(tabAt)) != null) {
                a aVar = new a(from);
                tabAt.a(aVar);
                tabAt.a((View) aVar.f29246a);
                if ("img".equals(a2.showType)) {
                    a(a2, aVar);
                } else {
                    aVar.a(a2.showText, a2.isSelected ? this.d : this.c);
                    if (a2.isSelected) {
                        i = i2;
                    }
                }
            }
        }
        this.b.post(new Runnable() { // from class: tb.irb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TabLayout.d tabAt2 = irb.this.b.getTabAt(i);
                if (tabAt2 == null) {
                    return;
                }
                tabAt2.f();
            }
        });
    }

    private void a(TabBean tabBean, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c02bfa", new Object[]{this, tabBean, aVar});
            return;
        }
        aVar.a(tabBean.showText, tabBean.isSelected ? this.d : this.c);
        String str = tabBean.isSelected ? tabBean.activeImage : tabBean.normalImage;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aVar.a(str);
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabSelected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
            return;
        }
        TabBean a2 = q().a(dVar);
        if (a2 == null) {
            p().b().b("MySrpTabView", "onTabSelected: fail to get tab bean");
            return;
        }
        a2.isSelected = true;
        this.f29244a = a2.param;
        TextUtils.isEmpty(a2.bizName);
        a aVar = (a) dVar.a();
        if (aVar == null) {
            return;
        }
        if ("text".equals(a2.showType)) {
            aVar.a(a2.showText, this.d);
        } else {
            a(a2, aVar);
        }
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabUnselected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
            return;
        }
        TabBean a2 = q().a(dVar);
        if (a2 == null) {
            p().b().b("MySrpTabView", "onTabUnselected: fail to get tab bean");
            return;
        }
        a2.isSelected = false;
        a aVar = (a) dVar.a();
        if (aVar == null) {
            return;
        }
        if ("text".equals(a2.showType)) {
            aVar.a(a2.showText, this.c);
        } else {
            a(a2, aVar);
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public FrameLayout f29246a;
        public TextView b;
        public ImageView c;
        public c d;

        static {
            kge.a(457378303);
        }

        public a(LayoutInflater layoutInflater) {
            this.f29246a = (FrameLayout) layoutInflater.inflate(R.layout.libsf_custom_tab, (ViewGroup) null);
            this.b = (TextView) this.f29246a.findViewById(R.id.libsf_tab_text);
            this.c = (ImageView) this.f29246a.findViewById(R.id.libsf_tab_icon);
        }

        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            TextView textView = this.b;
            if (textView == null) {
                return;
            }
            textView.setText(str);
            this.b.setTextColor(i);
            this.b.setVisibility(0);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            c cVar = this.d;
            if (cVar != null && !cVar.a()) {
                this.d.b();
            }
            this.d = b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.irb.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && !succPhenixEvent.isIntermediate()) {
                        a.this.a(drawable);
                    }
                    c ticket = succPhenixEvent.getTicket();
                    if (ticket != null && !ticket.a()) {
                        ticket.a(true);
                    }
                    return true;
                }
            }).fetch();
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                this.c.setVisibility(0);
            }
            TextView textView = this.b;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }
}
