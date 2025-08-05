package com.taobao.android.behavix;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.bhxbridge.BHXCXXActionBridge;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.sku.utils.o;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dro;
import tb.drs;
import tb.dru;
import tb.dsb;
import tb.dsc;
import tb.dsi;
import tb.dsk;
import tb.kge;
import tb.shc;

/* loaded from: classes.dex */
public class h extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1846213711);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ String[] a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("e9f57a3c", new Object[]{str, strArr}) : b(str, strArr);
    }

    public static void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{str, str2, obj, strArr});
        } else {
            a(str, str2, obj, (Map<String, String>) null, strArr);
        }
    }

    public static void a(final String str, final String str2, Object obj, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7abe9d2", new Object[]{str, str2, obj, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final WeakReference weakReference = new WeakReference(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 272
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.behavix.h.AnonymousClass1.run():void");
                }
            }, str, "pv", str, strArr);
        }
    }

    private static String[] b(String str, String[] strArr) {
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eff9459b", new Object[]{str, strArr});
        }
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        if (strArr == null || strArr.length == 0) {
            strArr2 = new String[1];
        } else {
            strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : !"taobao".equals(d.c()) ? "" : TextUtils.equals(str, "Page_Home") ? "a2141.1" : TextUtils.equals(str, "Page_MyTaobao") ? "a2141.7631743" : TextUtils.equals(str, "Page_MiniDetail") ? "a218fy.minidetail" : "";
    }

    public static void b(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef4f166", new Object[]{str, str2, obj, strArr});
        } else {
            a(str, str2, (String) null, obj, strArr);
        }
    }

    public static void a(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601333d", new Object[]{str, str2, str3, obj, strArr});
        } else {
            a(str, str2, str3, obj, (Map<String, String>) null, strArr);
        }
    }

    public static void a(final String str, final String str2, final String str3, Object obj, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a23b9c", new Object[]{str, str2, str3, obj, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final WeakReference weakReference = new WeakReference(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        String e = dro.e(str);
                        if (TextUtils.equals(e, o.PAGE_NAME) && !a.a("enableSKUPV", false)) {
                            return;
                        }
                        String source = i.getSource(hashMap, strArr);
                        Object obj2 = weakReference.get();
                        if (obj2 == null || TextUtils.isEmpty(e)) {
                            TLog.loge("behavix_track", i.TAG, "commitLeave context or scene empty");
                            return;
                        }
                        BHXCXXActionBridge.commitLeave(source, e, str2, str3, currentTimeMillis, obj2.hashCode() + e, dru.a(obj2), hashMap, strArr);
                    }
                }
            }, str, "leave", str, strArr);
        }
    }

    public static void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{str, str2, str3, strArr});
        } else {
            a(str, str2, "", str3, (Map<String, String>) null, strArr);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65212840", new Object[]{str, str2, str3, map, strArr});
        } else {
            a(str, str2, "", str3, map, strArr);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e010a68f", new Object[]{str, str2, str3, str4, strArr});
        } else {
            a(str, str2, "", str4, (Map<String, String>) null, strArr);
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5177a0a", new Object[]{str, str2, str3, str4, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitTap(i.getSource(hashMap, strArr), dro.e(str), str2, str3, str4, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, shc.SCENE_TAP, str2, strArr);
        }
    }

    public static void b(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690464b8", new Object[]{str, str2, str3, strArr});
        } else {
            b(str, str2, str3, (Map<String, String>) null, strArr);
        }
    }

    public static void b(final String str, final String str2, final String str3, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acc84c1", new Object[]{str, str2, str3, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        String e = dro.e(str);
                        String source = i.getSource(hashMap, strArr);
                        if (!TextUtils.equals(source, BHRTaskConfigBase.TYPE_CONFIG_UT)) {
                            return;
                        }
                        BHXCXXActionBridge.commitCustom(source, e, str2, str3, hashMap, strArr);
                    }
                }
            }, str, "custom", str2, strArr);
        }
    }

    public static void a(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6e40c3", new Object[]{str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            a(str, str2, i, i2, (Map<String, String>) null, strArr);
        }
    }

    public static void a(final String str, final String str2, final int i, final int i2, final List<com.taobao.android.external.e> list, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0188a07", new Object[]{str, str2, new Integer(i), new Integer(i2), list, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitScroll(i.getSource(hashMap, strArr), dro.e(str), "scrollStart", str2, i, i2, list, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, "scroll", str2, strArr);
        }
    }

    public static void a(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b0c878", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            a(str, str2, (int) f, (int) f2, list, map, null);
        }
    }

    public static void b(final String str, final String str2, final int i, final int i2, final List<com.taobao.android.external.e> list, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c3e688", new Object[]{str, str2, new Integer(i), new Integer(i2), list, map, strArr});
        } else if (a()) {
        } else {
            float d = dsi.d();
            float e = dsi.e();
            if (Math.abs(BHXCXXActionBridge.lastOffsetX - i) < d && Math.abs(BHXCXXActionBridge.lastOffsetY - i2) < e) {
                return;
            }
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitScroll(i.getSource(hashMap, strArr), dro.e(str), com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING, str2, i, i2, list, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, "scroll", str2, strArr);
        }
    }

    public static void b(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c197", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            b(str, str2, (int) f, (int) f2, list, map, null);
        }
    }

    public static void c(final String str, final String str2, final int i, final int i2, final List<com.taobao.android.external.e> list, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6f4309", new Object[]{str, str2, new Integer(i), new Integer(i2), list, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitScroll("", dro.e(str), "scrollEnd", str2, i, i2, list, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, "scroll", str2, strArr);
        }
    }

    public static void c(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2892bab6", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            c(str, str2, (int) f, (int) f2, list, map, null);
        }
    }

    public static void a(String str, String str2, int i, int i2, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d233b156", new Object[]{str, str2, new Integer(i), new Integer(i2), map, strArr});
        } else {
            a(str, str2, i, i2, null, map, strArr);
        }
    }

    public static void b(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acb062", new Object[]{str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            b(str, str2, i, i2, (Map<String, String>) null, strArr);
        }
    }

    public static void b(String str, String str2, int i, int i2, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3022fd7", new Object[]{str, str2, new Integer(i), new Integer(i2), map, strArr});
        } else {
            c(str, str2, i, i2, null, null, strArr);
        }
    }

    public static void a(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd09d2d3", new Object[]{str, str2, str3, view, strArr});
        } else {
            a(str, str2, str3, view, (Map<String, String>) null, strArr);
        }
    }

    public static void a(final String str, final String str2, final String str3, final View view, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dfbd46", new Object[]{str, str2, str3, view, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitExposeStart(i.getSource(hashMap, strArr), dro.e(str), str2, str3, view, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, "expose", str2, strArr);
        }
    }

    public static void b(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc106d4", new Object[]{str, str2, str3, view, strArr});
        } else {
            b(str, str2, str3, view, (Map<String, String>) null, strArr);
        }
    }

    public static void b(final String str, final String str2, final String str3, final View view, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ebe725", new Object[]{str, str2, str3, view, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitExposeEnd(dro.e(str), str2, str3, view, currentTimeMillis, null, hashMap, strArr);
                    }
                }
            }, str, "expose", str2, strArr);
        }
    }

    public static void c(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8205b657", new Object[]{str, str2, str3, strArr});
        } else {
            c(str, str2, str3, null, strArr);
        }
    }

    public static void c(final String str, final String str2, final String str3, Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3077e142", new Object[]{str, str2, str3, map, strArr});
        } else if (a()) {
        } else {
            final HashMap hashMap = map != null ? new HashMap(map) : null;
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitRequest(NativeDelegate.SETTING_BIZ, dro.e(str), str2, str3, currentTimeMillis, hashMap, strArr);
                    }
                }
            }, str, "request", str2, strArr);
        }
    }

    public static void a(final String str, final List<BHXVisualCenterItem> list, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739d2211", new Object[]{str, list, new Boolean(z)});
        } else if (a() || TextUtils.isEmpty(str) || com.taobao.android.behavix.utils.g.a(list)) {
        } else {
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        BHXCXXActionBridge.commitVisualCenter(dro.e(str), list, z);
                    }
                }
            }, str, "visualCenterExpose", (String) null, new String[0]);
        }
    }

    public static void a(final String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (a()) {
        } else {
            final WeakReference weakReference = new WeakReference(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        g.a("initConfig");
                        Object obj2 = weakReference.get();
                        if (obj2 == null || TextUtils.isEmpty(str)) {
                            TLog.loge("behavix_track", i.TAG, "commitAppIn context or scene empty");
                            dsb.b("logic", str, null, "logic_error", "commitAppIn context or scene empty");
                            return;
                        }
                        BHXCXXActionBridge.commitAppIn(str, obj2.hashCode() + str, currentTimeMillis);
                        dsk.c();
                        com.taobao.android.behavix.feature.c.a().d();
                    }
                }
            }, str, "appIn", str, new String[0]);
        }
    }

    public static void b(final String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{str, obj});
        } else if (a()) {
        } else {
            final WeakReference weakReference = new WeakReference(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        Object obj2 = weakReference.get();
                        if (obj2 == null || TextUtils.isEmpty(str)) {
                            TLog.loge("behavix_track", i.TAG, "commitAppOut context or scene empty");
                            dsb.b("logic", str, null, "logic_error", "commitAppOut context or scene empty");
                            return;
                        }
                        BHXCXXActionBridge.commitAppOut(str, obj2.hashCode() + str, currentTimeMillis);
                        com.taobao.android.behavix.feature.c.a().e();
                    }
                }
            }, str, "appOut", str, new String[0]);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a.a() && !a.b() && !a.c();
    }

    public static void a(final String str, Object obj, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b43a37", new Object[]{str, obj, map});
        } else if (map == null || a()) {
        } else {
            final WeakReference weakReference = new WeakReference(obj);
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.h.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Object obj2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b()) {
                    } else {
                        String e = dro.e(str);
                        if (weakReference.get() == null || TextUtils.isEmpty(e)) {
                            TLog.loge("behavix_track", i.TAG, "updateSceneBizArgs context or scene empty");
                            return;
                        }
                        Map map2 = map;
                        BHXCXXActionBridge.updateEnterEvent(e, obj2.hashCode() + e, map2, j.c(map2));
                    }
                }
            }, str, "pvUpdate", "pvUpdate", new String[0]);
        }
    }

    public static void a(String str, String str2, drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26281827", new Object[]{str, str2, drsVar});
            return;
        }
        if (currentSceneExposeNode.get(str) == null) {
            currentSceneExposeNode.put(str, new HashMap());
        }
        Map<String, drs> map = currentSceneExposeNode.get(str);
        if (map == null) {
            return;
        }
        if (map.size() > a.a("exposeMaxRecordCount", 15)) {
            map.clear();
        }
        map.put(str2, drsVar);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        Map<String, drs> map = currentSceneExposeNode.get(str);
        if (map == null) {
            return;
        }
        map.remove(str2);
    }

    public static drs b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drs) ipChange.ipc$dispatch("cf03b664", new Object[]{str, str2});
        }
        Map<String, drs> map = currentSceneExposeNode.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}
