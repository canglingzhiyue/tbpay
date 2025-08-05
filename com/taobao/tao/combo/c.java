package com.taobao.tao.combo;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class c extends com.taobao.tao.combo.ui.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19882a;
    private static final int b;
    private static final int c;
    private static final int d;
    private Context e;
    private ArrayList<String> f;
    private ArrayList<View> g;
    private b h;
    private boolean i = true;
    private boolean j = false;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f19884a;

        static {
            kge.a(1358061062);
            f19884a = false;
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.combo.ui.d
    public int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // com.taobao.tao.combo.ui.d
    public boolean a(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("293f8cca", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    @Override // com.taobao.tao.combo.ui.d
    public Parcelable b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("156a922c", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9ff2f390", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6056543", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.j = z;
        return z;
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : b;
    }

    public static /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : c;
    }

    static {
        kge.a(628832675);
        f19882a = c.class.getSimpleName();
        int a2 = com.taobao.android.shop.utils.f.a(72.0f);
        b = a2;
        c = a2 - com.taobao.android.shop.utils.f.a(48.0f);
        d = com.taobao.android.shop.utils.f.a() - (com.taobao.android.shop.utils.f.a(84.0f) * 2);
    }

    public c(Context context) {
        this.e = context;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9670777", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    public void a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.i = true;
        this.f = arrayList;
        g();
        f();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f != null) {
            this.g = new ArrayList<>();
            int size = this.f.size();
            LayoutInflater from = LayoutInflater.from(this.e);
            for (int i = 0; i < size; i++) {
                this.g.add(from.inflate(R.layout.shop_combo_vertical_view_pager_item, (ViewGroup) null));
            }
        }
    }

    @Override // com.taobao.tao.combo.ui.d
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        ArrayList<String> arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.taobao.tao.combo.ui.d
    public void a(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320b4018", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            viewGroup.removeView(this.g.get(i));
        }
    }

    @Override // com.taobao.tao.combo.ui.d
    public Object a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7fa6cf76", new Object[]{this, viewGroup, new Integer(i)});
        }
        viewGroup.addView(this.g.get(i));
        return this.g.get(i);
    }

    @Override // com.taobao.tao.combo.ui.d
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.i) {
            this.i = false;
            Iterator<String> it = this.f.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                LinearLayout linearLayout = (LinearLayout) this.g.get(i);
                TUrlImageView tUrlImageView = (TUrlImageView) linearLayout.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview);
                tUrlImageView.setStrategyConfig(ImageStrategyConfig.a("shop", 90).a());
                tUrlImageView.setImageUrl(com.taobao.android.shop.utils.e.a(it.next(), d));
                tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(tUrlImageView.getLayoutParams().width, d));
                linearLayout.setTag(false);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else if (c.a(c.this) == null) {
                        } else {
                            view2.setTag(true);
                            if (!a.f19884a) {
                                g.a(view2.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), c.d());
                                a.f19884a = true;
                            } else {
                                g.a(view2.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), c.e());
                                a.f19884a = false;
                            }
                            c.a(c.this, false);
                            c.a(c.this).a();
                        }
                    }
                });
                i = i2;
            }
        } else if (this.j) {
        } else {
            this.j = true;
            c();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int size = this.f.size();
        if (a.f19884a) {
            while (i < size) {
                LinearLayout linearLayout = (LinearLayout) this.g.get(i);
                if (linearLayout != null && (linearLayout.getTag() instanceof Boolean) && !((Boolean) linearLayout.getTag()).booleanValue()) {
                    g.a((TUrlImageView) linearLayout.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), b);
                } else if (linearLayout != null) {
                    linearLayout.setTag(false);
                }
                i++;
            }
            return;
        }
        while (i < size) {
            String str = "setMargin  UNCLICKEDsize---" + size + "i------" + i;
            LinearLayout linearLayout2 = (LinearLayout) this.g.get(i);
            if (linearLayout2 != null && (linearLayout2.getTag() instanceof Boolean) && !((Boolean) linearLayout2.getTag()).booleanValue()) {
                g.a((TUrlImageView) linearLayout2.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), c);
            } else if (linearLayout2 != null) {
                linearLayout2.setTag(false);
            }
            i++;
        }
    }
}
