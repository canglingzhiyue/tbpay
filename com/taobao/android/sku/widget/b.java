package com.taobao.android.sku.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.presenter.e;
import com.taobao.android.sku.utils.n;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0583b f15238a;
    private boolean b = n.a("is_enable_fragment_dialog");

    /* renamed from: com.taobao.android.sku.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0583b {
        void a(int i);

        void a(int i, int i2, int i3, int i4, int i5, int i6);

        void a(DialogInterface.OnDismissListener onDismissListener);

        void a(View view);

        void a(c.a aVar);

        void a(e eVar);

        boolean a();

        void b();

        void c();
    }

    static {
        kge.a(1849098996);
    }

    public b(Context context) {
        if ((context instanceof FragmentActivity) && this.b) {
            if (com.taobao.android.sku.pad.b.INSTANCE.a(context)) {
                this.f15238a = new com.taobao.android.sku.pad.a(context);
                return;
            } else {
                this.f15238a = new a((FragmentActivity) context);
                return;
            }
        }
        this.f15238a = new c(context);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f15238a.a();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f15238a.a(i);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f15238a.a(view);
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            this.f15238a.a(i, i2, i3, i4, i5, i6);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f15238a.b();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f15238a.c();
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564309e3", new Object[]{this, onDismissListener});
        } else {
            this.f15238a.a(onDismissListener);
        }
    }

    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adbbec3", new Object[]{this, aVar});
        } else {
            this.f15238a.a(aVar);
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
        } else {
            this.f15238a.a(eVar);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements InterfaceC0583b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private FragmentActivity f15239a;
        private SkuDialogFragment b = new SkuDialogFragment();

        static {
            kge.a(-1523530872);
            kge.a(-811237844);
        }

        public a(FragmentActivity fragmentActivity) {
            this.f15239a = fragmentActivity;
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.isShowing();
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b.setStyle(0, i);
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                this.b.setContentView(view);
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(int i, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            } else {
                this.b.initWindow(i, i2, i3, i4, i5, i6);
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b.show(this.f15239a.getSupportFragmentManager(), "fragment_tag");
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.b.dismissAllowingStateLoss();
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(DialogInterface.OnDismissListener onDismissListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("564309e3", new Object[]{this, onDismissListener});
            } else {
                this.b.setOnDismissListener(onDismissListener);
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(c.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6adbbec3", new Object[]{this, aVar});
            } else {
                this.b.setOnBackPressedListener(aVar);
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
            } else {
                this.b.setPresenterLifecycleCallback(eVar);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class c implements InterfaceC0583b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f15240a;
        private com.taobao.android.sku.widget.a b;
        private int c;
        private View d;
        private DialogInterface.OnDismissListener e;
        private c.a f;
        private boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        static {
            kge.a(690013407);
            kge.a(-811237844);
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
            }
        }

        public static /* synthetic */ c.a a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("7447c93", new Object[]{cVar}) : cVar.f;
        }

        public c(Context context) {
            this.f15240a = context;
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            com.taobao.android.sku.widget.a aVar = this.b;
            return aVar != null && aVar.isShowing();
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                this.d = view;
            }
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(int i, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                return;
            }
            this.g = true;
            this.h = i;
            this.i = i2;
            this.j = i3;
            this.k = i4;
            this.l = i5;
            this.m = i6;
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.b = d();
            if (this.g) {
                this.b.getWindow().setSoftInputMode(51);
                this.b.a(this.d, this.h, this.i, this.j, this.k, this.l, this.m);
            } else {
                this.b.setContentView(this.d);
                this.b.getWindow().setSoftInputMode(51);
                this.b.show();
            }
            this.b.setOnDismissListener(this.e);
        }

        private com.taobao.android.sku.widget.a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.sku.widget.a) ipChange.ipc$dispatch("622be421", new Object[]{this}) : new com.taobao.android.sku.widget.a(this.f15240a, this.c) { // from class: com.taobao.android.sku.widget.b.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 143326307) {
                        super.onBackPressed();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.app.Dialog
                public void onBackPressed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88afc63", new Object[]{this});
                    } else if (c.a(c.this) != null && c.a(c.this).a()) {
                    } else {
                        super.onBackPressed();
                    }
                }
            };
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            com.taobao.android.sku.widget.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.dismiss();
            this.b = null;
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(DialogInterface.OnDismissListener onDismissListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("564309e3", new Object[]{this, onDismissListener});
                return;
            }
            this.e = onDismissListener;
            com.taobao.android.sku.widget.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.setOnDismissListener(onDismissListener);
        }

        @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
        public void a(c.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6adbbec3", new Object[]{this, aVar});
            } else {
                this.f = aVar;
            }
        }
    }
}
