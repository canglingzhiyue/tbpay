package com.taobao.android.opencart.check;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.hvi;

/* loaded from: classes6.dex */
public class CheckHoldManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BADGE_NUMBER_EXCEEDED = "99+";
    public static final int CART_NAVIGATION_TAB = 3;
    public static final int KEEP_CHECK_ACTION_TYPE_ADD_CART = 3;
    public static final int KEEP_CHECK_ACTION_TYPE_CHECK = 0;
    public static final int KEEP_CHECK_ACTION_TYPE_REPLACE = 2;
    public static final int KEEP_CHECK_ACTION_TYPE_UNCHECK = 1;

    /* renamed from: a  reason: collision with root package name */
    private static final CheckHoldManager f14489a = new CheckHoldManager();
    private static final Handler g = new Handler(Looper.getMainLooper());
    private Set<String> b = new HashSet();
    private Set<String> c = new HashSet();
    private List<Object> d = new ArrayList();
    private boolean e;
    private String f;

    /* loaded from: classes6.dex */
    public @interface ActionType {
    }

    public static /* synthetic */ void a(CheckHoldManager checkHoldManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945170eb", new Object[]{checkHoldManager, new Integer(i)});
        } else {
            checkHoldManager.a(i);
        }
    }

    private CheckHoldManager() {
    }

    public static CheckHoldManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CheckHoldManager) ipChange.ipc$dispatch("41ed3ade", new Object[0]) : f14489a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r7 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r7, java.util.Set<java.lang.String> r8, java.util.Set<java.lang.String> r9, boolean r10) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.opencart.check.CheckHoldManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r6
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r7)
            r1[r4] = r5
            r1[r3] = r8
            r1[r2] = r9
            r7 = 4
            java.lang.Boolean r8 = new java.lang.Boolean
            r8.<init>(r10)
            r1[r7] = r8
            java.lang.String r7 = "7b87e5b9"
            r0.ipc$dispatch(r7, r1)
            return
        L28:
            if (r8 != 0) goto L2f
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
        L2f:
            if (r9 != 0) goto L36
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
        L36:
            if (r7 == 0) goto L80
            if (r7 == r4) goto L54
            if (r7 == r3) goto L3f
            if (r7 == r2) goto L80
            goto L8a
        L3f:
            java.util.Set<java.lang.String> r7 = r6.b
            r7.clear()
            java.util.Set<java.lang.String> r7 = r6.c
            r7.clear()
            java.util.Set<java.lang.String> r7 = r6.b
            r7.addAll(r8)
            java.util.Set<java.lang.String> r7 = r6.c
            r7.addAll(r9)
            goto L8a
        L54:
            java.util.Iterator r7 = r8.iterator()
        L58:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Set<java.lang.String> r0 = r6.b
            r0.remove(r8)
            goto L58
        L6a:
            java.util.Iterator r7 = r9.iterator()
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Set<java.lang.String> r9 = r6.c
            r9.remove(r8)
            goto L6e
        L80:
            java.util.Set<java.lang.String> r7 = r6.b
            r7.addAll(r8)
            java.util.Set<java.lang.String> r7 = r6.c
            r7.addAll(r9)
        L8a:
            if (r10 == 0) goto L8f
            r6.h()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.opencart.check.CheckHoldManager.a(int, java.util.Set, java.util.Set, boolean):void");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        d(jSONObject);
        h();
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        e(jSONObject);
        h();
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            if (z) {
                a(jSONObject);
            } else {
                b(jSONObject);
            }
        }
    }

    public Set<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this}) : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.b) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.c) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.b.size() + this.c.size();
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return jSONObject.getBooleanValue("isRepeatBuy");
        }
        return false;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        final int f = f();
        Iterator<Object> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (hvi.c()) {
            g.postDelayed(new Runnable() { // from class: com.taobao.android.opencart.check.CheckHoldManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        CheckHoldManager.a(CheckHoldManager.this, f);
                    }
                }
            }, 100L);
        } else {
            a(f);
        }
        this.e = true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String valueOf = String.valueOf(i);
        String str = null;
        g b = e.b(3);
        if (b != null) {
            str = b.m();
        }
        if (valueOf.equals(str)) {
            return;
        }
        e.a("cart", NavigationTabMsgMode.DEFAULT, valueOf);
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("cartId");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (c(jSONObject)) {
                this.c.add(string);
            } else {
                this.b.add(string);
            }
        }
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("cartId");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (c(jSONObject)) {
                this.c.remove(string);
            } else {
                this.b.remove(string);
            }
        }
    }
}
