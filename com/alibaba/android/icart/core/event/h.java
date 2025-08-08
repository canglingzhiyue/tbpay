package com.alibaba.android.icart.core.event;

import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.event.model.ConfirmDialogModel;
import com.alibaba.android.icart.core.widget.a;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bdx;
import tb.bed;
import tb.bei;
import tb.bek;
import tb.bex;
import tb.bga;
import tb.bmz;
import tb.bpp;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(940782975);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IDMComponent a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("a555ecd1", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ void a(h hVar, bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e42dece", new Object[]{hVar, bmzVar});
        } else {
            hVar.d(bmzVar);
        }
    }

    public static /* synthetic */ bbz b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("70dd2dfe", new Object[]{hVar}) : hVar.f25791a;
    }

    public static /* synthetic */ bcb c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("9eb5c936", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ bbz d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("cc8e62bc", new Object[]{hVar}) : hVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (this.h == null || c(bmzVar)) {
            return;
        }
        d(bmzVar);
    }

    private boolean c(final bmz bmzVar) {
        IDMComponent iDMComponent;
        ConfirmDialogModel confirmDialogModel;
        String message;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf0e5fef", new Object[]{this, bmzVar})).booleanValue();
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null) {
            return false;
        }
        Integer num = -1;
        List<IDMComponent> f = f();
        if (f == null || f.isEmpty()) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21669);
            com.alibaba.android.icart.core.widget.d.a(this.e, a2);
            bed.a(a2);
            return false;
        }
        int size = f.size();
        JSONObject jSONObject = null;
        if (size > 0) {
            iDMComponent = null;
            for (IDMComponent iDMComponent2 : f) {
                Integer num2 = (Integer) bei.a(iDMComponent2, (Class<Object>) Integer.class, "cancelTextPriority");
                if (num2 != null && num2.intValue() > num.intValue()) {
                    iDMComponent = iDMComponent2;
                    num = num2;
                }
            }
        } else {
            iDMComponent = null;
        }
        if (iDMComponent != null && num.intValue() >= 0 && iDMComponent.getEventMap() != null) {
            Iterator<com.taobao.android.ultron.common.model.b> it = iDMComponent.getEventMap().get(this.d.f()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.taobao.android.ultron.common.model.b next = it.next();
                if (next != null && "cartAdjustOperate".equals(next.getType())) {
                    jSONObject = next.getFields().getJSONObject("operateConfirmDialog");
                    break;
                }
            }
        } else {
            jSONObject = b.getFields().getJSONObject("operateConfirmDialog");
        }
        if (jSONObject == null || jSONObject.isEmpty() || (confirmDialogModel = (ConfirmDialogModel) JSONObject.toJavaObject(jSONObject, ConfirmDialogModel.class)) == null) {
            return false;
        }
        com.alibaba.android.icart.core.widget.a aVar = new com.alibaba.android.icart.core.widget.a(this.e);
        try {
            message = String.format(confirmDialogModel.getMessage(), Integer.valueOf(size));
        } catch (Exception unused) {
            message = confirmDialogModel.getMessage();
        }
        if (StringUtils.isEmpty(message) && !StringUtils.isEmpty(confirmDialogModel.getTitle())) {
            message = confirmDialogModel.getTitle();
        }
        String str = message;
        aVar.a((CharSequence) str).a(confirmDialogModel.getTitle()).b((CharSequence) confirmDialogModel.getCancelBtn()).c(confirmDialogModel.getConfirmBtn()).a(new a.InterfaceC0081a() { // from class: com.alibaba.android.icart.core.event.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.icart.core.widget.a.InterfaceC0081a
            public void a(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
                    return;
                }
                com.taobao.android.ultron.common.model.b a3 = bei.a(h.b(h.this).O().b(h.a(h.this).getKey()), bmzVar.f(), bmzVar.b());
                if (a3 != null) {
                    bmzVar.a(a3);
                }
                h.a(h.this, bmzVar);
                dialogInterface.dismiss();
            }

            @Override // com.alibaba.android.icart.core.widget.a.InterfaceC0081a
            public void b(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2228339d", new Object[]{this, dialogInterface});
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).b();
        try {
            bpp.a().commitFeedback("iCart", str, UmTypeKey.DIALOG, "biz", confirmDialogModel.getTitle());
        } catch (Throwable unused2) {
        }
        return true;
    }

    private void d(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad91666c", new Object[]{this, bmzVar});
            return;
        }
        if (FactoryType.TYPE_INVALID.equals(this.h.getTag())) {
            if (bmzVar.f().equals("addFavorClick")) {
                bex.a(this.f25791a, "Page_ShoppingCart_InvalidTitle_AddFavor", new String[0]);
            } else if (bmzVar.f().equals("deleteClick")) {
                bex.a(this.f25791a, "Page_ShoppingCart_InvalidTitle_Clear", new String[0]);
            }
        }
        final List<IDMComponent> f = f();
        List<String> a2 = bek.a(f);
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("operateItems", a2);
        bmzVar.a("operateItems", a2);
        a(b(), hashMap);
        this.f25791a.a(this.h, bmzVar, true, new jnv() { // from class: com.alibaba.android.icart.core.event.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                } else {
                    bga.a.b("iCart", "AdjustOperate", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                for (IDMComponent iDMComponent : f) {
                    h.c(h.this).a(iDMComponent);
                }
                h.d(h.this).r().a();
            }
        }, null);
    }

    private List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        String tag = this.h.getTag();
        HashSet hashSet = new HashSet();
        if ("submit".equals(tag)) {
            List<IDMComponent> c = bei.c(this.g);
            if (c != null) {
                hashSet.addAll(c);
            }
        } else if (FactoryType.TYPE_INVALID.equals(tag)) {
            List<IDMComponent> m = ((com.taobao.android.ultron.datamodel.imp.b) this.g).m();
            if (m != null) {
                for (IDMComponent iDMComponent : m) {
                    if (iDMComponent != null && "invalidItem".equals(iDMComponent.getTag())) {
                        hashSet.add(iDMComponent);
                    }
                }
            }
        } else {
            hashSet.addAll(bei.a(this.h, this.f25791a));
        }
        return new ArrayList(hashSet);
    }
}
