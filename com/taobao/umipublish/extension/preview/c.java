package com.taobao.umipublish.extension.preview;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.android.litecreator.util.q;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.preview.widget.PreviewIndexTabView;
import tb.hen;
import tb.kge;
import tb.tek;

/* loaded from: classes9.dex */
public class c implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final long q;
    private static final int v;
    private static final int w;

    /* renamed from: a  reason: collision with root package name */
    private Activity f23248a;
    private View b;
    private ViewPager c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private View i;
    private TextView j;
    private hen k;
    private PreviewIndexTabView l;
    private PreviewModel m;
    private a p;
    private int o = 0;
    private boolean r = false;
    private int s = 0;
    private final Handler t = new Handler(Looper.getMainLooper());
    private final Runnable u = new Runnable() { // from class: com.taobao.umipublish.extension.preview.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            int count;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (c.b(c.this) || (count = c.c(c.this).getCount()) <= 0) {
            } else {
                c.d(c.this);
                c.f(c.this).setCurrentItem(c.e(c.this) % count);
                c.g(c.this).postDelayed(this, c.g());
            }
        }
    };
    private b n = new b();

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    private String d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ef97628", new Object[]{this, new Integer(i)}) : "";
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    public static /* synthetic */ Activity a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("5a46fbbd", new Object[]{cVar}) : cVar.f23248a;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ee15dae", new Object[]{cVar})).booleanValue() : cVar.r;
    }

    public static /* synthetic */ b c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bfd47a0d", new Object[]{cVar}) : cVar.n;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1276a15b", new Object[]{cVar})).intValue();
        }
        int i = cVar.s;
        cVar.s = i + 1;
        return i;
    }

    public static /* synthetic */ int e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c41433a", new Object[]{cVar})).intValue() : cVar.s;
    }

    public static /* synthetic */ ViewPager f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("11461012", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[0])).longValue() : q;
    }

    public static /* synthetic */ Handler g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("f772f7a1", new Object[]{cVar}) : cVar.t;
    }

    public c(Activity activity) {
        this.f23248a = activity;
        this.b = LayoutInflater.from(activity).inflate(R.layout.activity_umi_preview, (ViewGroup) null, false);
        this.c = (ViewPager) this.b.findViewById(R.id.preview_container);
        this.d = this.b.findViewById(R.id.preview_close);
        this.e = (TextView) this.b.findViewById(R.id.preview_title);
        this.l = (PreviewIndexTabView) this.b.findViewById(R.id.preview_index);
        this.i = this.b.findViewById(R.id.ll_music_bar);
        this.j = (TextView) this.b.findViewById(R.id.tv_music_name);
        this.f = (TextView) this.b.findViewById(R.id.preview_edit);
        this.h = (TextView) this.b.findViewById(R.id.preview_videoedit);
        this.g = (TextView) this.b.findViewById(R.id.preview_delete);
        this.c.setAdapter(this.n);
        this.c.addOnPageChangeListener(this);
        this.n.a(0, new com.taobao.umipublish.extension.preview.image.a());
        this.n.a(1, new com.taobao.umipublish.extension.preview.video.a());
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.a(c.this).finish();
                }
            }
        });
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.f;
        if (textView == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.f.setOnClickListener(onClickListener);
        }
    }

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else {
            this.h.setOnClickListener(onClickListener);
        }
    }

    public void c(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9c8f", new Object[]{this, onClickListener});
        } else {
            this.g.setOnClickListener(onClickListener);
        }
    }

    public PreviewModel.Media a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel.Media) ipChange.ipc$dispatch("44e927d4", new Object[]{this, new Integer(i)});
        }
        if (this.m.e == null || i < 0 || i >= this.m.e.size()) {
            return null;
        }
        PreviewModel.Media remove = this.m.e.remove(i);
        if (this.m.c == 2) {
            this.c.setOffscreenPageLimit(Math.min(this.m.e.size(), 6));
        }
        this.n.c(remove.type);
        this.n.a(this.m.e);
        this.e.setText(d(this.c.getCurrentItem() + 1));
        c(i);
        return remove;
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.l.clearTabs();
        b(this.m);
        int size = this.m.e.size() - 1;
        if (i >= size) {
            i = size;
        }
        this.l.setFocused(i);
    }

    public void d(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8b8d6e", new Object[]{this, onClickListener});
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a97e4d", new Object[]{this, onClickListener});
        } else {
            this.i.setOnClickListener(onClickListener);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792bed2e", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.c.setCurrentItem(i, z);
        onPageSelected(i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.n;
        if (bVar == null || bVar.getCount() <= 1) {
            return;
        }
        this.s = i;
        this.t.postDelayed(this.u, q);
    }

    public PreviewModel.Media a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreviewModel.Media) ipChange.ipc$dispatch("96012ae7", new Object[]{this}) : this.m.e.get(this.o);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.o;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.b;
    }

    public void a(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a6c2c1", new Object[]{this, previewModel});
            return;
        }
        this.m = previewModel;
        this.n.a(previewModel.e);
        this.n.a(previewModel.c);
        if (this.m.c == 2) {
            this.c.setOffscreenPageLimit(Math.min(this.m.e.size(), 6));
        }
        this.e.setText(d(1));
        this.f.setText(previewModel.g);
        b(previewModel);
        c(previewModel);
    }

    static {
        kge.a(-140233160);
        kge.a(1848919473);
        q = tek.d();
        v = f.a(51.0f);
        w = f.a(96.0f);
    }

    private void b(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955c8f82", new Object[]{this, previewModel});
        } else if (previewModel.e == null || previewModel.e.size() <= 1) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            for (int i = 0; i < previewModel.e.size(); i++) {
                this.l.addTab(new PreviewIndexTabView.a(i, previewModel.e.size(), String.valueOf(i)));
            }
        }
    }

    private void c(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6125c43", new Object[]{this, previewModel});
        } else if (previewModel == null || previewModel.f == null) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            a(previewModel.f.name);
            this.k = new hen();
            this.k.a(previewModel.f.path);
            a aVar = this.p;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = " " + str + " ";
        int min = Math.min(w, Math.max(v, (int) this.j.getPaint().measureText(str2)));
        CharSequence a2 = q.a(str2, this.j.getPaint(), f.a(1.0f) + min);
        this.j.setLayoutParams(new LinearLayout.LayoutParams(min, -2));
        this.j.setText(a2);
        this.j.setFocusable(true);
        this.j.setFocusableInTouchMode(true);
        this.j.setEllipsize(StringUtils.TruncateAt.MARQUEE);
        this.j.setMarqueeRepeatLimit(-1);
        this.j.setSelected(true);
        this.j.setSingleLine();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setText(d(i + 1));
        this.o = i;
        int i2 = 4;
        if (this.m.c == 0) {
            boolean z = this.m.d;
            this.f.setEnabled(z);
            TextView textView = this.f;
            if (z) {
                i2 = 0;
            }
            textView.setVisibility(i2);
        } else if (this.m.c == 2) {
            boolean z2 = this.m.d;
            this.f.setEnabled(z2);
            TextView textView2 = this.f;
            if (z2) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            h();
        }
        this.l.setFocused(i);
        a aVar = this.p;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.n.a();
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i != 1) {
        } else {
            this.r = true;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.g;
        if (textView == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        hen henVar = this.k;
        if (henVar != null) {
            henVar.c();
        }
        this.t.removeCallbacksAndMessages(null);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        hen henVar = this.k;
        if (henVar == null) {
            return;
        }
        henVar.b();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        hen henVar = this.k;
        if (henVar == null) {
            return;
        }
        henVar.a();
    }
}
