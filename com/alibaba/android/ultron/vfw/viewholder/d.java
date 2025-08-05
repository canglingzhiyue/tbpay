package com.alibaba.android.ultron.vfw.viewholder;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.bny;
import tb.bod;
import tb.bof;
import tb.bog;
import tb.boh;
import tb.boj;
import tb.bpc;
import tb.bpd;
import tb.bpe;
import tb.bpf;
import tb.bpl;
import tb.fxa;
import tb.ifp;
import tb.jpx;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FESTRUE_COMPONT = "componentRender";
    public static final String KEY_FESTRUE_VERSION = "1.0";
    public static final int TAG_COMPONENT;
    public static final String TAG_DINAMICX_VIEW_COMPONENT = "DinamicXComponent";
    public static final String TAG_IS_ADJUST = "isAdjust";
    public static final String TAG_IS_PRERENDER = "isPreRender";

    /* renamed from: a  reason: collision with root package name */
    private final l f2739a;
    private final bny b;
    private ViewGroup c;
    private Handler d;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bny a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("e4bf1708", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ void a(d dVar, DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccbad83", new Object[]{dVar, dinamicXEngine, dXRootView});
        } else {
            dVar.b(dinamicXEngine, dXRootView);
        }
    }

    public static /* synthetic */ void b(d dVar, DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c979622", new Object[]{dVar, dinamicXEngine, dXRootView});
        } else {
            dVar.c(dinamicXEngine, dXRootView);
        }
    }

    static {
        kge.a(-1531268345);
        TAG_COMPONENT = R.id.TAG_COMPONENT;
    }

    public d(bny bnyVar) {
        this(bnyVar, false);
    }

    public d(bny bnyVar, boolean z) {
        this.d = null;
        this.b = bnyVar;
        this.f2739a = new l(bnyVar, z);
        DTemplateManager.a(this.b.o()).a(DTemplateManager.CacheStrategy.STRATEGY_DEFAULT);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.b.e().a(fxa.a("handleDinamicXEvent"), new bog());
            this.b.e().a(fxa.a(boj.DISPATCHER_TAG), new boj());
            this.b.e().a(boh.HANDLE_DINAMICX_EVENT_ONCE, new boh());
            this.b.e().a("handleDinamicXEvent", new bof());
        } catch (DinamicException unused) {
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public int b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73527efe", new Object[]{this, iDMComponent})).intValue() : this.f2739a.a(iDMComponent);
    }

    public DXTemplateItem a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("ec611004", new Object[]{this, new Integer(i)}) : this.f2739a.a(i);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        this.c = viewGroup;
        DXTemplateItem a2 = this.f2739a.a(i);
        if (a2 != null && this.b.E() != null && this.b.E().g() != null) {
            boolean a3 = this.b.E().g().a(a2);
            a2.l = a3;
            if (a3) {
                jqg.a("DinamicXViewHolderProvider", "使用DXButter渲染:", a2.f());
            }
        }
        h a4 = a(viewGroup, a2, this.f2739a.b(i));
        a4.a(viewGroup);
        return a4;
    }

    private h a(ViewGroup viewGroup, DXTemplateItem dXTemplateItem, List<IDMComponent> list) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("238e7ea6", new Object[]{this, viewGroup, dXTemplateItem, list});
        }
        bd a3 = this.b.e().a();
        View view = null;
        String r = this.b.r();
        if (dXTemplateItem != null) {
            try {
                boolean a4 = jqi.a(r, "enableDXPreCreateView", false);
                boolean b = a3.b(dXTemplateItem);
                if (this.b.s() != null) {
                    a2 = this.b.s().a(dXTemplateItem);
                    if (a2 == null) {
                        if ((a4 || this.b.A()) && b) {
                            a2 = a3.a(viewGroup.getContext(), dXTemplateItem);
                        } else {
                            a2 = a3.a(viewGroup.getContext(), viewGroup, dXTemplateItem);
                        }
                    }
                } else if ((a4 || this.b.A()) && b) {
                    a2 = a3.a(viewGroup.getContext(), dXTemplateItem);
                } else {
                    a2 = a3.a(viewGroup.getContext(), viewGroup, dXTemplateItem);
                }
                if (!a2.b()) {
                    DXRootView dXRootView = a2.f11780a;
                    view = (!jpx.a(this.b.k()) || dXRootView == null || this.b.n() != 1001) ? dXRootView : bpe.a(dXRootView, dXTemplateItem);
                    if (jqi.a(r, bpd.KEY_COMPONENT_LIFECYCLE, true)) {
                        a(a3.d(), a2.f11780a);
                    }
                } else {
                    if (!a(dXTemplateItem)) {
                        a(list, true);
                    }
                    jqg.a("DinamicXViewHolderProvider", "模板create错误,模板： ", dXTemplateItem.f11925a + "\n", bpf.a(a2.a()));
                }
            } catch (Exception e) {
                a(list, true);
                jqg.a(r, "createViewHolderInternal exception:", e.getMessage());
            }
        }
        if (view == null) {
            h hVar = new h(bpl.a(viewGroup.getContext()));
            hVar.a(true);
            String[] strArr = new String[2];
            strArr[0] = "DinamicXViewHolderProvider";
            StringBuilder sb = new StringBuilder();
            sb.append("降级显示高度为0的占位View|");
            sb.append(dXTemplateItem == null ? "" : dXTemplateItem.f11925a);
            strArr[1] = sb.toString();
            jqg.a(r, strArr);
            return hVar;
        }
        return new h(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0147 A[Catch: Exception -> 0x01dc, TryCatch #0 {Exception -> 0x01dc, blocks: (B:11:0x0034, B:13:0x0044, B:16:0x0055, B:18:0x007c, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:28:0x00f0, B:29:0x00f6, B:31:0x00fe, B:33:0x0107, B:35:0x010f, B:36:0x0115, B:38:0x011d, B:40:0x0129, B:42:0x0133, B:44:0x013e, B:46:0x0147, B:48:0x018d, B:50:0x0192, B:52:0x0198, B:54:0x01b1, B:55:0x01b5, B:56:0x01cf, B:47:0x0179), top: B:61:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179 A[Catch: Exception -> 0x01dc, TryCatch #0 {Exception -> 0x01dc, blocks: (B:11:0x0034, B:13:0x0044, B:16:0x0055, B:18:0x007c, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:28:0x00f0, B:29:0x00f6, B:31:0x00fe, B:33:0x0107, B:35:0x010f, B:36:0x0115, B:38:0x011d, B:40:0x0129, B:42:0x0133, B:44:0x013e, B:46:0x0147, B:48:0x018d, B:50:0x0192, B:52:0x0198, B:54:0x01b1, B:55:0x01b5, B:56:0x01cf, B:47:0x0179), top: B:61:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1 A[Catch: Exception -> 0x01dc, TryCatch #0 {Exception -> 0x01dc, blocks: (B:11:0x0034, B:13:0x0044, B:16:0x0055, B:18:0x007c, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:28:0x00f0, B:29:0x00f6, B:31:0x00fe, B:33:0x0107, B:35:0x010f, B:36:0x0115, B:38:0x011d, B:40:0x0129, B:42:0x0133, B:44:0x013e, B:46:0x0147, B:48:0x018d, B:50:0x0192, B:52:0x0198, B:54:0x01b1, B:55:0x01b5, B:56:0x01cf, B:47:0x0179), top: B:61:0x0034 }] */
    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.android.ultron.vfw.viewholder.h r19, com.taobao.android.ultron.common.model.IDMComponent r20) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.viewholder.d.a(com.alibaba.android.ultron.vfw.viewholder.h, com.taobao.android.ultron.common.model.IDMComponent):void");
    }

    private void a(IDMComponent iDMComponent, DXRootView dXRootView) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27e416d", new Object[]{this, iDMComponent, dXRootView});
        } else if (!ifp.a(this.b.k()) || !bpc.f26032a) {
        } else {
            dXRootView.setImportantForAccessibility(1);
            if (TextUtils.isEmpty(iDMComponent.getTag())) {
                key = iDMComponent.getId();
            } else {
                key = iDMComponent.getKey();
            }
            dXRootView.setContentDescription(key);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.a
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getContainerInfo() == null || iDMComponent.getData() == null) {
        } else {
            JSONObject data = iDMComponent.getData();
            if (data.getBooleanValue("isPreRender")) {
                return;
            }
            data.put("isPreRender", (Object) true);
            DXTemplateItem a2 = ((com.alibaba.android.ultron.vfw.template.b) ((com.alibaba.android.ultron.vfw.template.f) this.b.a(com.alibaba.android.ultron.vfw.template.f.class)).a(iDMComponent.getContainerType())).a(iDMComponent.getContainerInfo().getString("name"));
            bd a3 = this.b.e().a();
            a3.a(this.b.k(), data, a2);
            a3.a(this.b.k(), a2, data, -1, (DXRenderOptions) null);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f2739a.a();
        }
    }

    private void a(final DinamicXEngine dinamicXEngine, final DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1595861a", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dXRootView == null || dinamicXEngine == null) {
        } else {
            dinamicXEngine.a(dXRootView, new DXRootView.a() { // from class: com.alibaba.android.ultron.vfw.viewholder.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc619e9", new Object[]{this, dXRootView2});
                    } else {
                        d.b(d.this, dinamicXEngine, dXRootView);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void b(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView2});
                    } else {
                        d.a(d.this, dinamicXEngine, dXRootView);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    } else if (i == 0) {
                        d.a(d.this, dinamicXEngine, dXRootView);
                    } else {
                        d.b(d.this, dinamicXEngine, dXRootView);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(DXRootView dXRootView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfd963a", new Object[]{this, dXRootView2, new Integer(i)});
                    } else if (i == 0) {
                        d.a(d.this, dinamicXEngine, dXRootView);
                    } else {
                        d.b(d.this, dinamicXEngine, dXRootView);
                    }
                }
            });
        }
    }

    private void b(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9d4b1b", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dinamicXEngine == null) {
        } else {
            dinamicXEngine.b(dXRootView);
        }
    }

    private void c(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a5101c", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dinamicXEngine == null) {
        } else {
            dinamicXEngine.a(dXRootView);
        }
    }

    private boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (!bpd.b(this.b.k()) || bpe.a(dXTemplateItem) || dXTemplateItem.b == -1 || dXTemplateItem.e) {
            return false;
        }
        String r = this.b.r();
        jqg.a(r, "DinamicXViewHolderProvider", "模板渲染异常，降级到内置：" + dXTemplateItem.f11925a + "_" + dXTemplateItem.b);
        DTemplateManager a2 = DTemplateManager.a(this.b.o());
        if (a2 == null) {
            return false;
        }
        bd a3 = this.b.e().a();
        DXTemplateItem a4 = a3.a(a2.g(a3.c(dXTemplateItem)));
        ((com.alibaba.android.ultron.vfw.template.b) ((com.alibaba.android.ultron.vfw.template.f) this.b.a(com.alibaba.android.ultron.vfw.template.f.class)).a("dinamicx")).b().put(a4.f11925a, a4);
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        } else {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.d.post(new Runnable() { // from class: com.alibaba.android.ultron.vfw.viewholder.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.a(d.this).a(127);
                }
            }
        });
        return true;
    }

    private void a(String str, String str2, String str3, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce43f1fb", new Object[]{this, str, str2, str3, sVar});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.c a2 = this.b.a();
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("componentName", str);
        if (sVar != null) {
            hashMap.put("dxError", sVar);
        }
        a2.a(new UltronError(this.b.r(), str2, str3, "render", hashMap));
    }

    private void a(List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).getExtMap().put(bod.KEY_DOWNGRADE_STATE, Boolean.valueOf(z));
            }
        }
    }
}
