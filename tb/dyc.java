package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.c;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ s a(UltronError ultronError) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("cda9f4e", new Object[]{ultronError}) : b(ultronError);
    }

    public static /* synthetic */ void a(dya dyaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57707b6", new Object[]{dyaVar, str});
        } else {
            b(dyaVar, str);
        }
    }

    public static /* synthetic */ boolean a(s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bea7519d", new Object[]{sVar})).booleanValue() : b(sVar);
    }

    public static /* synthetic */ boolean a(s sVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1643548e", new Object[]{sVar, new Integer(i)})).booleanValue() : b(sVar, i);
    }

    public static /* synthetic */ boolean a(s sVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596ea727", new Object[]{sVar, str})).booleanValue() : b(sVar, str);
    }

    static {
        kge.a(1945033761);
        emu.a("com.taobao.android.detail.core.detail.controller.DetailDXErrorHandler");
    }

    public static void a(final dya dyaVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4affcdc3", new Object[]{dyaVar, fVar});
            return;
        }
        final d c = fVar.c();
        c.a(new c() { // from class: tb.dyc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.instance.c
            public void a(UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
                    return;
                }
                s a2 = dyc.a(ultronError);
                if (!dyc.a(a2)) {
                    return;
                }
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    if (a2.b != null) {
                        hashMap.put("containerVersion", Long.valueOf(a2.b.b));
                        hashMap.put("containerName", a2.b.f11925a);
                        hashMap.put("containerUrl", a2.b.c);
                    }
                    eca.a(dya.this.f27083a, a2.toString(), hashMap, eca.TYPE_DETAIL2);
                    String a3 = i.a("dxError", BTags.DxRender);
                    com.taobao.android.detail.core.utils.i.a(a3, "DetailDXErrorHandler: " + a2.toString());
                }
                boolean z = dyc.a(a2, "tb_detail_toolbar") || dyc.a(a2, "tb_detail_toolbar_for_tgc");
                boolean a4 = dyc.a(a2, 80001);
                if (!z || !a4) {
                    return;
                }
                c.a((c) null);
                com.taobao.android.detail.core.utils.i.a(i.a("dxError", BTags.DxRender), "bottomBar dx error 80001");
                dyc.a(dya.this, "bottomBar dx error 80001");
            }
        });
    }

    private static s b(UltronError ultronError) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("6f35b62d", new Object[]{ultronError});
        }
        if (!"render".equals(ultronError.type) || (map = ultronError.extParams) == null) {
            return null;
        }
        Object obj = map.get("dxError");
        if (!(obj instanceof s)) {
            return null;
        }
        return (s) obj;
    }

    private static void b(dya dyaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5fcff7", new Object[]{dyaVar, str});
            return;
        }
        String str2 = dyaVar.f.f27180a;
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        dyaVar.a(str2, egn.NAV_URL_DETAIL[2] + "?id=" + str2 + "&hybrid=true", str);
    }

    private static boolean b(s sVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29eb280f", new Object[]{sVar, new Integer(i)})).booleanValue();
        }
        for (s.a aVar : sVar.c) {
            if (aVar.d == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(s sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("738a25c6", new Object[]{sVar, str})).booleanValue();
        }
        DXTemplateItem dXTemplateItem = sVar.b;
        if (dXTemplateItem != null) {
            return str.equals(dXTemplateItem.f11925a);
        }
        return false;
    }

    private static boolean b(s sVar) {
        List<s.a> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32e689fc", new Object[]{sVar})).booleanValue() : (sVar == null || (list = sVar.c) == null || list.isEmpty()) ? false : true;
    }
}
