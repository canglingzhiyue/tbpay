package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXCheckBoxEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.fxe;
import tb.gbd;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int ALREADY_INT_CHECK_IMG;
    public static final int ALREADY_INT_DIS_CHECK_IMG;
    public static final int ALREADY_INT_DIS_UNCHECK_IMG;
    public static final int ALREADY_INT_UNCHECK_IMG;
    public static final int NEED_INT_CHECK_IMG;
    public static final int NEED_INT_DIS_CHECK_IMG;
    public static final int NEED_INT_DIS_UNCHECK_IMG;
    public static final int NEED_INT_UNCHECK_IMG;

    /* renamed from: a */
    private int f12103a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private boolean g = false;
    private boolean h = false;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    public static /* synthetic */ boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4b9d4c", new Object[]{gVar})).booleanValue() : gVar.g;
    }

    static {
        kge.a(-2147201707);
        ALREADY_INT_CHECK_IMG = R.id.already_int_check_img;
        NEED_INT_CHECK_IMG = R.id.need_int_check_img;
        ALREADY_INT_UNCHECK_IMG = R.id.already_int_uncheck_img;
        NEED_INT_UNCHECK_IMG = R.id.need_int_uncheck_img;
        ALREADY_INT_DIS_CHECK_IMG = R.id.already_int_dis_check_img;
        NEED_INT_DIS_CHECK_IMG = R.id.need_int_dis_check_img;
        ALREADY_INT_DIS_UNCHECK_IMG = R.id.already_int_dis_uncheck_img;
        NEED_INT_DIS_UNCHECK_IMG = R.id.need_int_dis_uncheck_img;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(415694636);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
    }

    public g() {
        setAccessibility(1);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 == 1073741824;
        if (a3 != 1073741824) {
            z = false;
        }
        int b2 = z2 ? DXWidgetNode.DXMeasureSpec.b(i) : 0;
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(b2, i3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof g)) {
            return;
        }
        g gVar = (g) dXWidgetNode;
        this.f12103a = gVar.f12103a;
        setEnabled(gVar.getEnabled());
        this.b = gVar.b;
        this.c = gVar.c;
        this.d = gVar.d;
        this.e = gVar.e;
        this.g = gVar.g;
        this.f = gVar.f;
        this.h = gVar.h;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (4729585112602995918L == j) {
            this.f12103a = i;
        }
        if (-273786109416499313L == j) {
            if (i == 0) {
                z = false;
            }
            this.f = z;
        } else if (j == 841016511269201341L) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (-273786109416499313L != j) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (1748192772052832291L == j) {
            this.b = str;
        } else if (-2878833559981654264L == j) {
            this.c = str;
        } else if (-6932240350857271226L == j) {
            this.d = str;
        } else if (1972862905129200737L == j) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : this.h ? new AppCompatCheckBox(context, null, -1) : new AppCompatCheckBox(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof AppCompatCheckBox)) {
        } else {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
            appCompatCheckBox.setClickable(true);
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                a(appCompatCheckBox, getMeasuredWidth(), getMeasuredHeight());
            } else {
                appCompatCheckBox.setButtonDrawable((Drawable) null);
            }
            if (this.f12103a == 1) {
                z = true;
            }
            a(appCompatCheckBox, z);
        }
    }

    public void a(AppCompatCheckBox appCompatCheckBox, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f3bb24", new Object[]{this, appCompatCheckBox, new Boolean(z)});
        } else if (appCompatCheckBox == null) {
        } else {
            this.g = true;
            appCompatCheckBox.setChecked(z);
            this.g = false;
        }
    }

    public void a(AppCompatCheckBox appCompatCheckBox, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c6210", new Object[]{this, appCompatCheckBox, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.b;
        String str2 = (String) appCompatCheckBox.getTag(ALREADY_INT_CHECK_IMG);
        if (str == null) {
            str = "dinamicx_checked";
        }
        String str3 = this.c;
        String str4 = (String) appCompatCheckBox.getTag(ALREADY_INT_UNCHECK_IMG);
        if (str3 == null) {
            str3 = "dinamicx_uncheck";
        }
        String str5 = this.d;
        String str6 = (String) appCompatCheckBox.getTag(ALREADY_INT_DIS_CHECK_IMG);
        if (str5 == null) {
            str5 = "dinamicx_discheck";
        }
        String str7 = this.e;
        String str8 = (String) appCompatCheckBox.getTag(ALREADY_INT_DIS_UNCHECK_IMG);
        if (str7 == null) {
            str7 = "dinamicx_disunchk";
        }
        if (needHandleDark(getDXRuntimeContext())) {
            str = "dark_" + str;
            str3 = "dark_" + str3;
            str5 = "dark_" + str5;
            str7 = "dark_" + str7;
        }
        String str9 = str;
        String str10 = str3;
        String str11 = str7;
        String str12 = str5;
        if (str2 == null && str4 == null && str6 == null && str8 == null) {
            appCompatCheckBox.setButtonDrawable((Drawable) null);
        }
        if (str9.equals(str2) && str10.equals(str4) && str12.equals(str6) && str11.equals(str8)) {
            return;
        }
        b bVar = new b(appCompatCheckBox, str9, str10, str12, str11, i, i2, needHandleDark(getDXRuntimeContext()));
        if (this.f) {
            appCompatCheckBox.setTag(NEED_INT_CHECK_IMG, str9);
            appCompatCheckBox.setTag(NEED_INT_UNCHECK_IMG, str10);
            appCompatCheckBox.setTag(NEED_INT_DIS_CHECK_IMG, str12);
            appCompatCheckBox.setTag(NEED_INT_DIS_UNCHECK_IMG, str11);
            fxe.a(bVar, new Void[0]);
            return;
        }
        Drawable[] a2 = b.a(bVar);
        bVar.a(appCompatCheckBox, a2[0], a2[1], a2[2], a2[3]);
        appCompatCheckBox.setTag(ALREADY_INT_CHECK_IMG, str9);
        appCompatCheckBox.setTag(ALREADY_INT_UNCHECK_IMG, str10);
        appCompatCheckBox.setTag(ALREADY_INT_DIS_CHECK_IMG, str12);
        appCompatCheckBox.setTag(ALREADY_INT_DIS_UNCHECK_IMG, str11);
    }

    /* loaded from: classes5.dex */
    public static class b extends AsyncTask<Void, Void, Drawable[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f12104a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        private Context g;
        private WeakReference<AppCompatCheckBox> h;
        private boolean i;

        static {
            kge.a(1654488792);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ Drawable[] a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable[]) ipChange.ipc$dispatch("e42e75f3", new Object[]{bVar}) : bVar.a();
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable[]] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Drawable[] doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, drawableArr});
            } else {
                a(drawableArr);
            }
        }

        public b(AppCompatCheckBox appCompatCheckBox, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
            this.f12104a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.g = appCompatCheckBox.getContext().getApplicationContext();
            this.f12104a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = i2;
            this.h = new WeakReference<>(appCompatCheckBox);
            this.i = z;
        }

        public Drawable[] a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable[]) ipChange.ipc$dispatch("4cdcb47d", new Object[]{this, voidArr}) : a();
        }

        private Drawable[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("8e469391", new Object[]{this});
            }
            Drawable a2 = a(this.g, this.f12104a);
            if (a2 == null) {
                if (this.i) {
                    a2 = a(this.g, R.drawable.dark_dinamicx_checked);
                } else {
                    a2 = a(this.g, R.drawable.dinamicx_checked);
                }
            }
            Drawable a3 = a(a2, this.g, this.e, this.f);
            Drawable a4 = a(this.g, this.b);
            if (a4 == null) {
                if (this.i) {
                    a4 = a(this.g, R.drawable.dark_dinamicx_uncheck);
                } else {
                    a4 = a(this.g, R.drawable.dinamicx_uncheck);
                }
            }
            Drawable a5 = a(a4, this.g, this.e, this.f);
            Drawable a6 = a(this.g, this.c);
            if (a6 == null) {
                if (this.i) {
                    a6 = a(this.g, R.drawable.dark_dinamicx_discheck);
                } else {
                    a6 = a(this.g, R.drawable.dinamicx_discheck);
                }
            }
            Drawable a7 = a(a6, this.g, this.e, this.f);
            Drawable a8 = a(this.g, this.d);
            if (a8 == null) {
                if (this.i) {
                    a8 = a(this.g, R.drawable.dark_dinamicx_disunchk);
                } else {
                    a8 = a(this.g, R.drawable.dinamicx_disunchk);
                }
            }
            return new Drawable[]{a3, a5, a7, a(a8, this.g, this.e, this.f)};
        }

        public void a(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f1a7d1", new Object[]{this, drawableArr});
                return;
            }
            AppCompatCheckBox appCompatCheckBox = this.h.get();
            if (appCompatCheckBox == null) {
                return;
            }
            String str = (String) appCompatCheckBox.getTag(g.NEED_INT_CHECK_IMG);
            String str2 = (String) appCompatCheckBox.getTag(g.NEED_INT_UNCHECK_IMG);
            String str3 = (String) appCompatCheckBox.getTag(g.NEED_INT_DIS_CHECK_IMG);
            String str4 = (String) appCompatCheckBox.getTag(g.NEED_INT_DIS_UNCHECK_IMG);
            if (!str.equals(this.f12104a) || !str2.equals(this.b) || !str3.equals(this.c) || !str4.equals(this.d)) {
                return;
            }
            a(appCompatCheckBox, drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
            appCompatCheckBox.setTag(g.ALREADY_INT_CHECK_IMG, str);
            appCompatCheckBox.setTag(g.ALREADY_INT_UNCHECK_IMG, str2);
            appCompatCheckBox.setTag(g.ALREADY_INT_DIS_CHECK_IMG, str3);
            appCompatCheckBox.setTag(g.ALREADY_INT_DIS_UNCHECK_IMG, str4);
        }

        private Drawable a(Drawable drawable, Context context, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("de6a2d1e", new Object[]{this, drawable, context, new Integer(i), new Integer(i2)});
            }
            if (!(drawable instanceof BitmapDrawable)) {
                return null;
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, i, i2, true));
            bitmapDrawable.setTargetDensity(bitmap.getDensity());
            return bitmapDrawable;
        }

        public void a(AppCompatCheckBox appCompatCheckBox, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e04e40", new Object[]{this, appCompatCheckBox, drawable, drawable2, drawable3, drawable4});
            } else if (appCompatCheckBox == null) {
            } else {
                appCompatCheckBox.setButtonDrawable(a(drawable, drawable2, drawable3, drawable4));
            }
        }

        private Drawable a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("10bb7350", new Object[]{this, context, str});
            }
            try {
                return context.getResources().getDrawable(context.getResources().getIdentifier(str, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName()));
            } catch (Throwable unused) {
                return null;
            }
        }

        private Drawable a(Context context, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("da293437", new Object[]{this, context, new Integer(i)}) : context.getResources().getDrawable(i);
        }

        private StateListDrawable a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StateListDrawable) ipChange.ipc$dispatch("cbffbe89", new Object[]{this, drawable, drawable2, drawable3, drawable4}) : gbd.a(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (view == null || !(view instanceof AppCompatCheckBox) || j != 5288679823228297259L) {
        } else {
            ((AppCompatCheckBox) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    } else if (g.a(g.this)) {
                    } else {
                        DXCheckBoxEvent dXCheckBoxEvent = new DXCheckBoxEvent(5288679823228297259L);
                        dXCheckBoxEvent.setChecked(z);
                        g.this.postEvent(dXCheckBoxEvent);
                    }
                }
            });
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f12103a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == g.class;
    }
}
