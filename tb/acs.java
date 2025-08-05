package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.support.v7.view.menu.g;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.taobao.taobao.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class acs extends MenuInflater {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?>[] f25249a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d;
    Context e;
    private Object f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private static final Class<?>[] f25250a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, f25250a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, menuItem)).booleanValue();
                }
                this.c.invoke(this.b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {
        private String A;
        private String B;
        private CharSequence C;
        private CharSequence D;
        private ColorStateList E = null;
        private PorterDuff.Mode F = null;

        /* renamed from: a  reason: collision with root package name */
        ActionProvider f25251a;
        private Menu c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private boolean j;
        private int k;
        private int l;
        private CharSequence m;
        private CharSequence n;
        private int o;
        private char p;
        private int q;
        private char r;
        private int s;
        private int t;
        private boolean u;
        private boolean v;
        private boolean w;
        private int x;
        private int y;
        private String z;

        public b(Menu menu) {
            this.c = menu;
            a();
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = acs.this.e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                String str2 = "Cannot instantiate class: " + str;
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t > 0).setTitleCondensed(this.n).setIcon(this.o);
            int i = this.x;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.B != null) {
                if (acs.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(acs.this.a(), this.B));
            }
            if (this.t >= 2) {
                if (menuItem instanceof g) {
                    ((g) menuItem).a(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).a(true);
                }
            }
            String str = this.z;
            if (str != null) {
                menuItem.setActionView((View) a(str, acs.f25249a, acs.this.c));
                z = true;
            }
            int i2 = this.y;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            ActionProvider actionProvider = this.f25251a;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.C);
            MenuItemCompat.setTooltipText(menuItem, this.D);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.p, this.q);
            MenuItemCompat.setNumericShortcut(menuItem, this.r, this.s);
            PorterDuff.Mode mode = this.F;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.E;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }

        public void a() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = true;
            this.i = true;
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = acs.this.e.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.d = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.f = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.g = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.h = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.i = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void b() {
            this.j = true;
            a(this.c.add(this.d, this.k, this.l, this.m));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = acs.this.e.obtainStyledAttributes(attributeSet, R.styleable.MenuItem);
            this.k = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
            this.l = (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, this.e) & (-65536)) | (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, this.f) & 65535);
            this.m = obtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
            this.n = obtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
            this.o = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.p = a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut));
            this.q = obtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.r = a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut));
            this.s = obtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
            this.t = obtainStyledAttributes.hasValue(R.styleable.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checkable, false) : this.g;
            this.u = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
            this.v = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, this.h);
            this.w = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, this.i);
            this.x = obtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
            this.B = obtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
            this.y = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
            this.z = obtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
            this.A = obtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
            if ((this.A != null) && this.y == 0 && this.z == null) {
                this.f25251a = (ActionProvider) a(this.A, acs.b, acs.this.d);
            } else {
                this.f25251a = null;
            }
            this.C = obtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
            this.D = obtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTintMode)) {
                this.F = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.MenuItem_iconTintMode, -1), this.F);
            } else {
                this.F = null;
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTint)) {
                this.E = obtainStyledAttributes.getColorStateList(R.styleable.MenuItem_iconTint);
            } else {
                this.E = null;
            }
            obtainStyledAttributes.recycle();
            this.j = false;
        }

        public SubMenu c() {
            this.j = true;
            SubMenu addSubMenu = this.c.addSubMenu(this.d, this.k, this.l, this.m);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.j;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f25249a = clsArr;
        b = clsArr;
    }

    public acs(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r6 = r15;
        r8 = null;
        r15 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r15 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r6 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r6 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r6 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        r6 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r6.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r6.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r6.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r0.f25251a == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r0.f25251a.hasSubMenu() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r6.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r7 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        r6 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
        if (r6.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        r0.a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
        if (r6.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
        r0.b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
        if (r6.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
        a(r13, r14, r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
        r8 = r6;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r6 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            tb.acs$b r0 = new tb.acs$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r15
            r8 = r4
            r15 = 0
            r7 = 0
        L41:
            if (r15 != 0) goto Lc8
            if (r6 == r3) goto Lc0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r6 == r1) goto L91
            r11 = 3
            if (r6 == r11) goto L50
            goto Lbb
        L50:
            java.lang.String r6 = r13.getName()
            if (r7 == 0) goto L5f
            boolean r11 = r6.equals(r8)
            if (r11 == 0) goto L5f
            r8 = r4
            r7 = 0
            goto Lbb
        L5f:
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L69
            r0.a()
            goto Lbb
        L69:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L89
            boolean r6 = r0.d()
            if (r6 != 0) goto Lbb
            android.support.v4.view.ActionProvider r6 = r0.f25251a
            if (r6 == 0) goto L85
            android.support.v4.view.ActionProvider r6 = r0.f25251a
            boolean r6 = r6.hasSubMenu()
            if (r6 == 0) goto L85
            r0.c()
            goto Lbb
        L85:
            r0.b()
            goto Lbb
        L89:
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lbb
            r15 = 1
            goto Lbb
        L91:
            if (r7 != 0) goto Lbb
            java.lang.String r6 = r13.getName()
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto La1
            r0.a(r14)
            goto Lbb
        La1:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto Lab
            r0.b(r14)
            goto Lbb
        Lab:
            boolean r9 = r6.equals(r2)
            if (r9 == 0) goto Lb9
            android.view.SubMenu r6 = r0.c()
            r12.a(r13, r14, r6)
            goto Lbb
        Lb9:
            r8 = r6
            r7 = 1
        Lbb:
            int r6 = r13.next()
            goto L41
        Lc0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acs.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object a() {
        if (this.f == null) {
            this.f = a(this.e);
        }
        return this.f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.e.getResources().getLayout(i);
                    a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
