package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderStickyFloatShowType;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.arc;

/* loaded from: classes2.dex */
public class aty {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a l;

    /* renamed from: a  reason: collision with root package name */
    private final String f25599a = "AURAStickyLayoutDelegate";
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private final List<aut> c = new ArrayList();
    private final List<aut> d = new ArrayList();
    private final aug b = new aug(this.c, this.d);

    /* loaded from: classes2.dex */
    public interface a {
        String a(String str, String str2);
    }

    static {
        kge.a(-1390302859);
    }

    public static /* synthetic */ aug a(aty atyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aug) ipChange.ipc$dispatch("37434381", new Object[]{atyVar}) : atyVar.b;
    }

    public static /* synthetic */ void a(aty atyVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39564520", new Object[]{atyVar, view});
        } else {
            atyVar.a(view);
        }
    }

    public static /* synthetic */ void a(aty atyVar, aut autVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296a2170", new Object[]{atyVar, autVar, view});
        } else {
            atyVar.a(autVar, view);
        }
    }

    public static /* synthetic */ void b(aty atyVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18684ff", new Object[]{atyVar, view});
        } else {
            atyVar.b(view);
        }
    }

    public static /* synthetic */ void b(aty atyVar, aut autVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8088124f", new Object[]{atyVar, autVar, view});
        } else {
            atyVar.b(autVar, view);
        }
    }

    public aty(a aVar) {
        this.l = aVar;
    }

    public bln a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bln) ipChange.ipc$dispatch("f02d43a", new Object[]{this});
        }
        String a2 = this.l.a("position", "top");
        int c = c();
        String a3 = this.l.a("marginTop", "0");
        char c2 = 65535;
        int hashCode = a2.hashCode();
        if (hashCode != -1026807403) {
            if (hashCode != 2002678695) {
                if (hashCode == 2010102105 && a2.equals("floatTop")) {
                    c2 = 0;
                }
            } else if (a2.equals("floatBottom")) {
                c2 = 2;
            }
        } else if (a2.equals("floatRightCenter")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return a(c, 0, 0, a(a3));
        }
        if (c2 == 1) {
            return a(c, 4, a(this.l.a("marginRight", "0")), a(a3));
        }
        if (c2 == 2) {
            String a4 = this.l.a("marginBottom", "0");
            String a5 = this.l.a("showOnce", "false");
            String a6 = this.l.a("stayTime", "0");
            aus a7 = a(c, 2, 0, a(a4));
            if (a5 != null) {
                a7.a(Boolean.parseBoolean(a5));
            }
            if (a6 != null) {
                a7.a(bbi.a(a6, -1L));
            }
            return a7;
        }
        boolean z = !"bottom".equals(a2);
        aut autVar = new aut(z) { // from class: tb.aty.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 3962124) {
                    super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (e) objArr[5]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.bly, tb.bln, com.alibaba.android.ultron.ext.vlayout.c
            public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
                    return;
                }
                super.a(recycler, state, i, i2, i3, eVar);
                View b = b();
                aty.a(aty.this, b);
                aty.a(aty.this, this, b);
                aty.b(aty.this, this, b);
                aty.b(aty.this, b);
                aty.a(aty.this).a(b);
            }
        };
        a(z, autVar);
        return autVar;
    }

    private aus a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aus) ipChange.ipc$dispatch("73a7f57f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        aus ausVar = new aus(i2, i3, i4) { // from class: tb.aty.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 3962124) {
                    super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (e) objArr[5]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.aup, tb.bln, com.alibaba.android.ultron.ext.vlayout.c
            public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i5, int i6, int i7, e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i5), new Integer(i6), new Integer(i7), eVar});
                    return;
                }
                super.a(recycler, state, i5, i6, i7, eVar);
                View b = b();
                aty.a(aty.this, b);
                aty.a(aty.this).a(b);
            }
        };
        ausVar.c(i);
        return ausVar;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return bay.a(Integer.parseInt(str));
        } catch (Exception unused) {
            arc.a().a("convertDPToPX#marginBottomInDp不是数字类型！", arc.a.a().b("AURAStickyLayoutDelegate").a("marginBottomInDp", str).b());
            return 0;
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        String a2 = this.l.a("showType", AURARenderStickyFloatShowType.showOnLeave);
        char c = 65535;
        switch (a2.hashCode()) {
            case -1470396265:
                if (a2.equals(AURARenderStickyFloatShowType.hideOnEnter)) {
                    c = 3;
                    break;
                }
                break;
            case -961826180:
                if (a2.equals(AURARenderStickyFloatShowType.showOnEnter)) {
                    c = 1;
                    break;
                }
                break;
            case -955647397:
                if (a2.equals(AURARenderStickyFloatShowType.showOnLeave)) {
                    c = 0;
                    break;
                }
                break;
            case 260532076:
                if (a2.equals(AURARenderStickyFloatShowType.showAlways)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 0;
        }
        return c != 3 ? 2 : 3;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(R.id.skip_view_tag_for_pager_snap, "sticky");
        }
    }

    private void a(boolean z, aut autVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8319f1c", new Object[]{this, new Boolean(z), autVar});
        } else if (z) {
            this.c.add(autVar);
        } else {
            this.d.add(autVar);
        }
    }

    private void b(final View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (!this.g && ((this.e || this.i >= this.c.size()) && ((this.f || this.k >= this.d.size()) && (this.c.size() > 1 || this.d.size() > 1)))) {
                z = true;
            }
            if (!z) {
                return;
            }
            this.g = true;
            view.post(new Runnable() { // from class: tb.aty.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view2 = view;
                    if (view2 == null) {
                        return;
                    }
                    view2.requestLayout();
                }
            });
        }
    }

    private void a(aut autVar, View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25fd5ba", new Object[]{this, autVar, view});
        } else if (!this.e) {
            int size = this.c.size();
            if (size <= 1) {
                this.e = true;
                return;
            }
            int indexOf = this.c.indexOf(autVar);
            if (-1 == indexOf || indexOf == size - 1) {
                return;
            }
            if (view == null) {
                if (autVar.r()) {
                    return;
                }
                this.i++;
                return;
            }
            for (int i2 = indexOf + 1; i2 < size; i2++) {
                aut autVar2 = this.c.get(i2);
                autVar2.b(autVar2.d() + view.getHeight());
            }
            this.h++;
            if (this.h < i) {
                return;
            }
            this.e = true;
        }
    }

    private void b(aut autVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a901599", new Object[]{this, autVar, view});
        } else if (!this.f) {
            int size = this.d.size();
            if (size <= 1) {
                this.f = true;
                return;
            }
            int indexOf = this.d.indexOf(autVar);
            if (indexOf == -1 || indexOf == 0) {
                return;
            }
            if (view == null) {
                if (autVar.r()) {
                    return;
                }
                this.k++;
                return;
            }
            for (int i = 0; i < indexOf; i++) {
                aut autVar2 = this.d.get(i);
                autVar2.b(autVar2.d() + view.getHeight());
            }
            this.j++;
            if (this.j < size - 1) {
                return;
            }
            this.f = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = false;
        this.i = 0;
        this.k = 0;
        this.h = 0;
        this.j = 0;
        this.e = false;
        this.f = false;
        this.c.clear();
        this.d.clear();
    }
}
