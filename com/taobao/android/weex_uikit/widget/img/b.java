package com.taobao.android.weex_uikit.widget.img;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.util.d;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMG_DISABLE_FLAG = "img_load_disable";
    public static final String KEY_IMG_LOAD_FLAG = "muise:img_load";

    /* renamed from: a  reason: collision with root package name */
    private static d.a<Integer> f16164a;

    public static void a(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cf6693", new Object[]{uINode, uIImageDrawable, str});
        }
    }

    public static /* synthetic */ void a(UINode uINode, MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2a5f32", new Object[]{uINode, mUSDKInstance, obj});
        } else {
            b(uINode, mUSDKInstance, obj);
        }
    }

    public static void a(UINode uINode, m<a> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d9b733", new Object[]{uINode, mVar});
        } else {
            mVar.a(new a());
        }
    }

    public static void a(final UINode uINode, final MUSDKInstance mUSDKInstance, final Object obj, m<p.b> mVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06760b2", new Object[]{uINode, mUSDKInstance, obj, mVar, aVar});
        } else if (TextUtils.equals(mUSDKInstance.getNativeState(KEY_IMG_LOAD_FLAG), IMG_DISABLE_FLAG)) {
            mVar.a(new p.b() { // from class: com.taobao.android.weex_uikit.widget.img.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.p.b
                public void onNativeStateChange(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
                    } else if (a.this.f16163a || TextUtils.equals(str2, b.IMG_DISABLE_FLAG)) {
                    } else {
                        b.a(uINode, mUSDKInstance, obj);
                        a.this.f16163a = true;
                    }
                }
            });
            mUSDKInstance.registerNativeStateListener(KEY_IMG_LOAD_FLAG, mVar.b());
        } else {
            mVar.a(null);
            b(uINode, mUSDKInstance, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.weex_uikit.ui.UINode r18, int r19, int r20, int r21, int r22, int[] r23, com.taobao.android.weex_uikit.widget.img.a r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.img.b.a(com.taobao.android.weex_uikit.ui.UINode, int, int, int, int, int[], com.taobao.android.weex_uikit.widget.img.a):void");
    }

    private static void b(UINode uINode, MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa37133", new Object[]{uINode, mUSDKInstance, obj});
        } else if (!uINode.isMounted()) {
        } else {
            UIImageDrawable uIImageDrawable = (UIImageDrawable) obj;
            Integer num = (Integer) uINode.getAttribute("blurRadius");
            uIImageDrawable.a(uINode, mUSDKInstance, (String) uINode.getAttribute("src"), (String) uINode.getAttribute("placeholder"), (String) uINode.getAttribute("objectFit"), num == null ? 0 : num.intValue(), uINode.getContentWidth(), uINode.getContentHeight(), a(uINode));
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, p.b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5dc04a", new Object[]{uINode, mUSDKInstance, obj, bVar, aVar});
            return;
        }
        aVar.f16163a = false;
        if (bVar != null) {
            mUSDKInstance.unregisterNativeStateListener(KEY_IMG_LOAD_FLAG, bVar);
        }
        ((UIImageDrawable) obj).a(mUSDKInstance);
    }

    public static UIImageDrawable a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UIImageDrawable) ipChange.ipc$dispatch("3b9deb1f", new Object[]{context}) : new UIImageDrawable();
    }

    public static void a(UINode uINode, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde93157", new Object[]{uINode, str, aVar});
            return;
        }
        uINode.setAttribute("src", str);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        aVar.a(0, 0);
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute(MUSConstants.ALT, str);
        uINode.setExtra("ariaLabel", str);
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("quality", str);
        }
    }

    public static void b(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b405b2", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.a(uINode.getInstance(), (String) uINode.getAttribute("src"), a(uINode));
        }
    }

    public static void c(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a698a4d1", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.a(uINode.getInstance(), str, a(uINode));
        }
    }

    public static void d(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97d43f0", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.b(uINode.getInstance(), str, a(uINode));
        }
    }

    public static void c(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f55a2a8", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("objectFit", str);
        }
    }

    public static void e(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c61e30f", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.a(str);
        }
    }

    public static void d(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb6a687", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("blurRadius", Integer.valueOf(a(str)));
        }
    }

    public static void f(UINode uINode, UIImageDrawable uIImageDrawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f46822e", new Object[]{uINode, uIImageDrawable, str});
        } else {
            uIImageDrawable.a(a(str));
        }
    }

    public static void e(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17aa66", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("placeholder", str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.equals("auto") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.weex_framework.adapter.MUSImageQuality a(com.taobao.android.weex_uikit.ui.UINode r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.img.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r6 = "e4159be"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = (com.taobao.android.weex_framework.adapter.MUSImageQuality) r6
            return r6
        L15:
            java.lang.String r0 = "quality"
            java.lang.Object r6 = r6.getAttribute(r0)
            java.lang.String r6 = (java.lang.String) r6
            r0 = -1
            int r1 = r6.hashCode()
            r4 = 3
            r5 = 2
            switch(r1) {
                case -1039745817: goto L51;
                case 107348: goto L47;
                case 3005871: goto L3e;
                case 3202466: goto L34;
                case 1379043793: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r1 = "original"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5b
            r2 = 1
            goto L5c
        L34:
            java.lang.String r1 = "high"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5b
            r2 = 4
            goto L5c
        L3e:
            java.lang.String r1 = "auto"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5b
            goto L5c
        L47:
            java.lang.String r1 = "low"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5b
            r2 = 3
            goto L5c
        L51:
            java.lang.String r1 = "normal"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5b
            r2 = 2
            goto L5c
        L5b:
            r2 = -1
        L5c:
            if (r2 == 0) goto L70
            if (r2 == r3) goto L6d
            if (r2 == r5) goto L6a
            if (r2 == r4) goto L67
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = com.taobao.android.weex_framework.adapter.MUSImageQuality.HIGH
            return r6
        L67:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = com.taobao.android.weex_framework.adapter.MUSImageQuality.LOW
            return r6
        L6a:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = com.taobao.android.weex_framework.adapter.MUSImageQuality.NORMAL
            return r6
        L6d:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = com.taobao.android.weex_framework.adapter.MUSImageQuality.ORIGINAL
            return r6
        L70:
            com.taobao.android.weex_framework.adapter.MUSImageQuality r6 = com.taobao.android.weex_framework.adapter.MUSImageQuality.AUTO
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.img.b.a(com.taobao.android.weex_uikit.ui.UINode):com.taobao.android.weex_framework.adapter.MUSImageQuality");
    }

    static {
        kge.a(1953804727);
        f16164a = new d.a<Integer>() { // from class: com.taobao.android.weex_uikit.widget.img.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
            @Override // com.taobao.android.weex_uikit.util.d.a
            public /* synthetic */ Integer a(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : b(str);
            }

            public Integer b(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78142dda", new Object[]{this, str}) : Integer.valueOf((int) i.a(str));
            }
        };
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            List a2 = new d(str, f16164a).a(Constants.Event.BLUR);
            if (a2 != null && !a2.isEmpty()) {
                return ((Integer) a2.get(0)).intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
