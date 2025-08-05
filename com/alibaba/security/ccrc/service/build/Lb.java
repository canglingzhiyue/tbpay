package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Lb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3258a = "wukong_internal_config";
    public SharedPreferences b;
    public final Context c;

    public Lb(Context context) {
        this.c = context;
    }

    private synchronized SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[]{this});
        }
        if (this.b == null) {
            this.b = this.c.getSharedPreferences(f3258a, 0);
        }
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r0.equals("Integer") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r10, java.lang.Object r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.ccrc.service.build.Lb.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r9
            r1[r4] = r10
            r1[r3] = r11
            java.lang.String r10 = "18567e8f"
            r0.ipc$dispatch(r10, r1)
            return
        L18:
            if (r11 == 0) goto La1
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.SharedPreferences r1 = r9.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r6 = -1
            int r7 = r0.hashCode()
            r8 = 4
            switch(r7) {
                case -1808118735: goto L5b;
                case -672261858: goto L52;
                case 2374300: goto L48;
                case 67973692: goto L3e;
                case 1729365000: goto L34;
                default: goto L33;
            }
        L33:
            goto L65
        L34:
            java.lang.String r2 = "Boolean"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            r2 = 1
            goto L66
        L3e:
            java.lang.String r2 = "Float"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            r2 = 3
            goto L66
        L48:
            java.lang.String r2 = "Long"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            r2 = 4
            goto L66
        L52:
            java.lang.String r7 = "Integer"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L65
            goto L66
        L5b:
            java.lang.String r2 = "String"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            r2 = 2
            goto L66
        L65:
            r2 = -1
        L66:
            if (r2 == 0) goto L95
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L85
            if (r2 == r5) goto L7b
            if (r2 == r8) goto L71
            goto L9e
        L71:
            java.lang.Long r11 = (java.lang.Long) r11
            long r2 = r11.longValue()
            r1.putLong(r10, r2)
            goto L9e
        L7b:
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r1.putFloat(r10, r11)
            goto L9e
        L85:
            java.lang.String r11 = (java.lang.String) r11
            r1.putString(r10, r11)
            goto L9e
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r1.putBoolean(r10, r11)
            goto L9e
        L95:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.putInt(r10, r11)
        L9e:
            r1.apply()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.Lb.b(java.lang.String, java.lang.Object):void");
    }

    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (obj == null) {
            obj = "";
        }
        String simpleName = obj.getClass().getSimpleName();
        char c = 65535;
        int hashCode = simpleName.hashCode();
        if (hashCode != -1808118735) {
            if (hashCode != -672261858) {
                if (hashCode != 67973692) {
                    if (hashCode == 1729365000 && simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_Boolean)) {
                        c = 1;
                    }
                } else if (simpleName.equals("Float")) {
                    c = 3;
                }
            } else if (simpleName.equals("Integer")) {
                c = 0;
            }
        } else if (simpleName.equals(com.taobao.android.weex_framework.util.a.ATOM_String)) {
            c = 2;
        }
        if (c == 0) {
            return Integer.valueOf(a().getInt(str, ((Integer) obj).intValue()));
        }
        if (c == 1) {
            return Boolean.valueOf(a().getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (c == 2) {
            return a().getString(str, (String) obj);
        }
        if (c != 3) {
            if (!"Long".equals(simpleName)) {
                return null;
            }
            return Long.valueOf(a().getLong(str, ((Long) obj).longValue()));
        }
        return Float.valueOf(a().getFloat(str, ((Float) obj).floatValue()));
    }
}
