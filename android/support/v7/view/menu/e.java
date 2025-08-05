package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class e implements SupportMenu {
    private static final int[] d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1369a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ContextMenu.ContextMenuInfo q;
    private g y;
    private boolean z;
    private int p = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<g> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> x = new CopyOnWriteArrayList<>();
    private ArrayList<g> j = new ArrayList<>();
    private ArrayList<g> k = new ArrayList<>();
    private boolean l = true;
    private ArrayList<g> m = new ArrayList<>();
    private ArrayList<g> n = new ArrayList<>();
    private boolean o = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        boolean a(e eVar, MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean invokeItem(g gVar);
    }

    public e(Context context) {
        this.e = context;
        this.f = context.getResources();
        e(true);
    }

    private static int a(ArrayList<g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).b() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private g a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new g(this, i, i2, i3, i4, charSequence, i5);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d2 = d();
        if (view != null) {
            this.c = view;
            this.f1369a = null;
            this.b = null;
        } else {
            if (i > 0) {
                this.f1369a = d2.getText(i);
            } else if (charSequence != null) {
                this.f1369a = charSequence;
            }
            if (i2 > 0) {
                this.b = ContextCompat.getDrawable(e(), i2);
            } else if (drawable != null) {
                this.b = drawable;
            }
            this.c = null;
        }
        a(false);
    }

    private void a(int i, boolean z) {
        if (i < 0 || i >= this.j.size()) {
            return;
        }
        this.j.remove(i);
        if (!z) {
            return;
        }
        a(true);
    }

    private boolean a(o oVar, j jVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.onSubMenuSelected(oVar);
        }
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.x.remove(next);
            } else if (!z) {
                z = jVar2.onSubMenuSelected(oVar);
            }
        }
        return z;
    }

    private void d(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        g();
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.x.remove(next);
            } else {
                jVar.updateMenuView(z);
            }
        }
        h();
    }

    private void e(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.x.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.x.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (onSaveInstanceState = jVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private void e(boolean z) {
        boolean z2 = true;
        if (!z || this.f.getConfiguration().keyboard == 1 || !this.f.getBoolean(R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.h = z2;
    }

    private static int f(int i) {
        int i2 = i >> 16;
        if (i2 >= 0) {
            int[] iArr = d;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.x.isEmpty()) {
            return;
        }
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.x.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public e a(int i) {
        this.p = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    g a(int i, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.w;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean b2 = b();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            char alphabeticShortcut = b2 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b2 && alphabeticShortcut == '\b' && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int f = f(i3);
        g a2 = a(i, i2, i3, f, charSequence, this.p);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.q;
        if (contextMenuInfo != null) {
            a2.a(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.j;
        arrayList.add(a(arrayList, f), a2);
        a(true);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public void a(Bundle bundle) {
        e(bundle);
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar) {
        this.l = true;
        a(true);
    }

    public void a(j jVar) {
        a(jVar, this.e);
    }

    public void a(j jVar, Context context) {
        this.x.add(new WeakReference<>(jVar));
        jVar.initForMenu(context, this);
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        g();
        for (int i = 0; i < size; i++) {
            g gVar = this.j.get(i);
            if (gVar.getGroupId() == groupId && gVar.f() && gVar.isCheckable()) {
                gVar.b(gVar == menuItem);
            }
        }
        h();
    }

    void a(List<g> list, int i, KeyEvent keyEvent) {
        boolean b2 = b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.j.get(i2);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b2 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((b2 ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b2 && alphabeticShortcut == '\b' && i == 67)) && gVar.isEnabled())) {
                    list.add(gVar);
                }
            }
        }
    }

    public void a(boolean z) {
        if (!this.r) {
            if (z) {
                this.l = true;
                this.o = true;
            }
            d(z);
            return;
        }
        this.s = true;
        if (!z) {
            return;
        }
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(e eVar, MenuItem menuItem) {
        a aVar = this.i;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (j) null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        b(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MenuItem r7, android.support.v7.view.menu.j r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.g r7 = (android.support.v7.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.a()
            android.support.v4.view.ActionProvider r2 = r7.getSupportActionProvider()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.hasSubMenu()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.b(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.b(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            android.support.v7.view.menu.o r9 = new android.support.v7.view.menu.o
            android.content.Context r0 = r6.e()
            r9.<init>(r0, r6, r7)
            r7.a(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.o r7 = (android.support.v7.view.menu.o) r7
            if (r4 == 0) goto L63
            r2.onPrepareSubMenu(r7)
        L63:
            boolean r7 = r6.a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.e.a(android.view.MenuItem, android.support.v7.view.menu.j, int):boolean");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        g gVar = (g) a(i, i2, i3, charSequence);
        o oVar = new o(this.e, this, gVar);
        gVar.a(oVar);
        return oVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void b(Bundle bundle) {
        f(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(g gVar) {
        this.o = true;
        a(true);
    }

    public void b(j jVar) {
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.x.remove(next);
            }
        }
    }

    public final void b(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.x.remove(next);
            } else {
                jVar.onCloseMenu(this, z);
            }
        }
        this.v = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.g;
    }

    public int c(int i) {
        return a(i, 0);
    }

    public void c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public void c(boolean z) {
        this.z = z;
    }

    public boolean c() {
        return this.h;
    }

    public boolean c(g gVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        g();
        Iterator<WeakReference<j>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar != null) {
                z = jVar.expandItemActionView(this, gVar);
                if (z) {
                    break;
                }
            } else {
                this.x.remove(next);
            }
        }
        h();
        if (z) {
            this.y = gVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.y;
        if (gVar != null) {
            d(gVar);
        }
        this.j.clear();
        a(true);
    }

    public void clearHeader() {
        this.b = null;
        this.f1369a = null;
        this.c = null;
        a(false);
    }

    @Override // android.view.Menu
    public void close() {
        b(true);
    }

    Resources d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e d(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    public void d(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((o) item.getSubMenu()).d(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public boolean d(g gVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.y == gVar) {
            g();
            Iterator<WeakReference<j>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar != null) {
                    z = jVar.collapseItemActionView(this, gVar);
                    if (z) {
                        break;
                    }
                } else {
                    this.x.remove(next);
                }
            }
            h();
            if (z) {
                this.y = null;
            }
        }
        return z;
    }

    public Context e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e e(int i) {
        a(0, null, i, null, null);
        return this;
    }

    public void f() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.j.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g() {
        if (!this.r) {
            this.r = true;
            this.s = false;
            this.t = false;
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.j.get(i);
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            a(this.t);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<g> i() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.j.get(i);
            if (gVar.isVisible()) {
                this.k.add(gVar);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void j() {
        ArrayList<g> i = i();
        if (!this.o) {
            return;
        }
        Iterator<WeakReference<j>> it = this.x.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.x.remove(next);
            } else {
                z |= jVar.flagActionItems();
            }
        }
        if (z) {
            this.m.clear();
            this.n.clear();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = i.get(i2);
                (gVar.i() ? this.m : this.n).add(gVar);
            }
        } else {
            this.m.clear();
            this.n.clear();
            this.n.addAll(i());
        }
        this.o = false;
    }

    public ArrayList<g> k() {
        j();
        return this.m;
    }

    public ArrayList<g> l() {
        j();
        return this.n;
    }

    public CharSequence m() {
        return this.f1369a;
    }

    public Drawable n() {
        return this.b;
    }

    public View o() {
        return this.c;
    }

    public e p() {
        return this;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        g a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, i2) : false;
        if ((i2 & 2) != 0) {
            b(true);
        }
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.u;
    }

    public g r() {
        return this.y;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int c = c(i);
        if (c >= 0) {
            int size = this.j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.j.get(c).getGroupId() != i) {
                    break;
                }
                a(c, false);
                i2 = i3;
            }
            a(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        a(b(i), true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.j.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.a(z2);
                gVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.j.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.j.get(i2);
            if (gVar.getGroupId() == i && gVar.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            a(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.g = z;
        a(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.j.size();
    }
}
