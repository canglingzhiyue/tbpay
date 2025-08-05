package com.alibaba.android.icart.core.event;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.event.y;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bed;
import tb.bei;
import tb.bex;
import tb.bmi;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class y extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String k;
    private static final String l;
    private a c;

    public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6010a2bc", new Object[]{yVar}) : yVar.c();
    }

    public static /* synthetic */ void a(y yVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81170538", new Object[]{yVar, iDMComponent});
        } else {
            yVar.a(iDMComponent);
        }
    }

    public static /* synthetic */ void a(y yVar, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec1e51a", new Object[]{yVar, jnvVar});
        } else {
            yVar.a(jnvVar);
        }
    }

    public static /* synthetic */ IDMComponent b(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("e9a8a1a1", new Object[]{yVar}) : yVar.h;
    }

    public static /* synthetic */ bcb c(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("81e5a807", new Object[]{yVar}) : yVar.b;
    }

    public static /* synthetic */ IDMComponent d(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("491709a3", new Object[]{yVar}) : yVar.h;
    }

    public static /* synthetic */ bbz e(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("dd96dbec", new Object[]{yVar}) : yVar.f25791a;
    }

    public static /* synthetic */ IDMComponent f(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("a88571a5", new Object[]{yVar}) : yVar.h;
    }

    public static /* synthetic */ bbz g(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("394810aa", new Object[]{yVar}) : yVar.f25791a;
    }

    public static /* synthetic */ void h(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21cb923", new Object[]{yVar});
        } else {
            yVar.h();
        }
    }

    public static /* synthetic */ bbz i(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("94f94568", new Object[]{yVar}) : yVar.f25791a;
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : l;
    }

    public static /* synthetic */ String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : k;
    }

    static {
        kge.a(-307260141);
        k = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21662);
        l = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21655);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if ("settlementClick".equals(this.d.f())) {
            f();
        } else {
            final String valueOf = String.valueOf(c().getString("type"));
            b(valueOf);
            char c = 65535;
            int hashCode = valueOf.hashCode();
            if (hashCode != -374200710) {
                if (hashCode == -46830912 && valueOf.equals("editGroupName")) {
                    c = 1;
                }
            } else if (valueOf.equals("createAndJoinIntoGroup")) {
                c = 0;
            }
            if (c == 0) {
                g();
            } else if (c == 1) {
                if (this.c == null) {
                    this.c = new a(this.f25791a.m());
                }
                final String c2 = c(bmzVar);
                this.c.a(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.event.y.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        y.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!(view instanceof EditText)) {
                        } else {
                            String obj = ((EditText) view).getText().toString();
                            JSONObject a2 = y.a(y.this);
                            a2.clear();
                            a2.put("type", (Object) valueOf);
                            a2.put("name", (Object) obj);
                            a2.put("fromBundleId", (Object) bei.g(y.b(y.this)));
                            DataBizContext.CartGroupContext d = y.c(y.this).o().d();
                            if (d != null) {
                                d.setName(obj);
                            }
                            if (!bei.r(y.d(y.this))) {
                                y.e(y.this).x().n();
                            } else {
                                y.a(y.this, new jnv() { // from class: com.alibaba.android.icart.core.event.y.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // tb.joc
                                    public void a(int i, MtopResponse mtopResponse, Object obj2, jny jnyVar, Map<String, ?> map) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj2, jnyVar, map});
                                        }
                                    }

                                    {
                                        AnonymousClass1.this = this;
                                    }

                                    @Override // tb.joc
                                    public void a(int i, MtopResponse mtopResponse, Object obj2, boolean z, Map<String, ?> map) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj2, new Boolean(z), map});
                                            return;
                                        }
                                        y.f(y.this).getFields().put("title", (Object) c2);
                                        y.g(y.this).x().n();
                                    }
                                });
                            }
                        }
                    }
                });
                this.c.a(c2);
            } else {
                a((jnv) null);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<IDMComponent> c = bei.c(this.g);
        if (c == null || c.isEmpty()) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21645);
            com.alibaba.android.icart.core.widget.d.a(this.e, a2);
            bed.a(a2);
            return;
        }
        c().put("to", (Object) bei.a(c));
        a((jnv) null);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            a(new jnv() { // from class: com.alibaba.android.icart.core.event.y.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    }
                }

                {
                    y.this = this;
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    } else {
                        y.h(y.this);
                    }
                }
            });
        }
    }

    private void h() {
        IDMComponent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        String g = bei.g(this.g.b(this.h.getKey()));
        if (g == null || (b = bei.b(this.g, g)) == null) {
            return;
        }
        String str = "editGroup";
        boolean containsKey = b.getEventMap().containsKey(str);
        if (containsKey) {
            b.getExtMap().put("type", 0);
        }
        if (!containsKey) {
            str = "addItemToGroup";
        }
        bei.a(this.f25791a, b.getKey(), str);
    }

    private String c(bmz bmzVar) {
        IDMComponent c;
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cc00815", new Object[]{this, bmzVar});
        }
        if (bmzVar == null || (c = bmzVar.c()) == null || (fields = c.getFields()) == null) {
            return null;
        }
        String string = fields.getString("title");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        DataBizContext.CartGroupContext d = this.b.o().d();
        if (d == null) {
            return null;
        }
        return d.getName();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        JSONObject c = c();
        String c2 = c(str);
        String g = bei.g(this.h);
        if (!TextUtils.isEmpty(c2)) {
            c.put("from", (Object) c2);
        }
        c.put("fromBundleId", (Object) g);
        if ("joinIntoGroup".equals(str)) {
            return;
        }
        c.put("toBundleId", (Object) g);
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if ("item".equals(this.h.getTag())) {
            return bei.h(this.h);
        }
        return "cancelGroup".equals(str) ? bei.a(bei.q(this.h)) : "";
    }

    private void a(final jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbb5de6", new Object[]{this, jnvVar});
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.h != null ? this.h.getTag() : "";
        String format = String.format("Page_ShoppingCart_%s_reorderClick", objArr);
        JSONObject c = c();
        bex.a(this.f25791a, format, bex.a(c));
        String string = c.getString("type");
        final IDMComponent iDMComponent = null;
        if ("topGroup".equals(string)) {
            iDMComponent = j();
        } else if ("addItemToGroup".equals(string)) {
            iDMComponent = this.h;
        } else if ("editGroup".equals(string) || "resetGroup".equals(string)) {
            iDMComponent = i();
        }
        this.f25791a.b(this.h, this.d, true, new jnv() { // from class: com.alibaba.android.icart.core.event.y.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                y.this = this;
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 == null) {
                    return;
                }
                jnvVar2.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
                }
                y.a(y.this, iDMComponent);
            }
        }, null);
    }

    private void a(IDMComponent iDMComponent) {
        bmi x;
        IpChange ipChange = $ipChange;
        final int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || (x = this.f25791a.n().x()) == null) {
        } else {
            List<IDMComponent> b = x.b();
            while (true) {
                if (i >= b.size()) {
                    i = -1;
                    break;
                }
                IDMComponent iDMComponent2 = b.get(i);
                if (iDMComponent2 != null && iDMComponent2.getKey() != null && iDMComponent != null && iDMComponent2.getKey().equals(iDMComponent.getKey())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return;
            }
            final RecyclerView recyclerView = (RecyclerView) this.f25791a.x().s();
            recyclerView.post(new Runnable() { // from class: com.alibaba.android.icart.core.event.y.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    y.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    int a2 = y.i(y.this).x().a();
                    int measuredHeight = recyclerView.getMeasuredHeight() / 3;
                    UnifyLog.d("CartReorderClickSubscriber", "scrollToLastPositionMiddle scrollY=" + a2 + ",offset=" + measuredHeight);
                    if (a2 < measuredHeight) {
                        return;
                    }
                    linearLayoutManager.scrollToPositionWithOffset(i, measuredHeight);
                }
            });
        }
    }

    private IDMComponent i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d9522c74", new Object[]{this});
        }
        String string = c().getString("from");
        List<IDMComponent> a2 = this.f25791a.x().p().l().a();
        int indexOf = a2.indexOf(this.h);
        if (indexOf <= 0) {
            return null;
        }
        for (int i = indexOf - 1; i >= 0; i--) {
            IDMComponent iDMComponent = a2.get(i);
            if (iDMComponent != null && "item".equals(iDMComponent.getTag()) && !string.contains(iDMComponent.getFields().getString("cartId"))) {
                return a2.get(i);
            }
        }
        return null;
    }

    private IDMComponent j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fee63575", new Object[]{this});
        }
        List<IDMComponent> a2 = this.f25791a.x().p().l().a();
        int indexOf = a2.indexOf(this.h);
        if (indexOf <= 0) {
            return null;
        }
        for (int i = indexOf - 1; i >= 0; i--) {
            IDMComponent iDMComponent = a2.get(i);
            if (iDMComponent != null && "item".equals(iDMComponent.getTag())) {
                return a2.get(i);
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class a extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private EditText f2352a;
        private View.OnClickListener b;

        static {
            kge.a(564018049);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            } else if (hashCode != -340027132) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.show();
                return null;
            }
        }

        public static /* synthetic */ View.OnClickListener a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("5b10ac68", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ EditText b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("d6d7d72f", new Object[]{aVar}) : aVar.f2352a;
        }

        public void a(View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            } else {
                this.b = onClickListener;
            }
        }

        public a(Activity activity) {
            super(activity, R.style.CartICartEditGroupNameDialog);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            super.show();
            b(str);
            a();
        }

        @Override // android.app.Dialog
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else {
                a("");
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.icart_alert_input, (ViewGroup) null);
            setContentView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.event.y.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.clearFlags(131080);
            window.setSoftInputMode(18);
            this.f2352a = (EditText) inflate.findViewById(R.id.edit_text);
            this.f2352a.setHint(y.k());
            this.f2352a.setInputType(1);
            this.f2352a.setImeOptions(4);
            inflate.findViewById(R.id.close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.event.y.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.this.dismiss();
                    }
                }
            });
            this.f2352a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alibaba.android.icart.core.event.CartReorderClickSubscriber$InputDialog$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 4) {
                        return false;
                    }
                    if (TextUtils.isEmpty(textView.getText().toString().trim())) {
                        com.alibaba.android.icart.core.widget.d.a(y.a.this.getContext(), y.l());
                        bed.a(y.l());
                        return true;
                    }
                    y.a.this.dismiss();
                    if (y.a.a(y.a.this) != null) {
                        y.a.a(y.a.this).onClick(textView);
                    }
                    return true;
                }
            });
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.event.y.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.this.dismiss();
                    }
                }
            });
            a();
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f2352a.postDelayed(new Runnable() { // from class: com.alibaba.android.icart.core.event.y.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a.b(a.this).requestFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) a.this.getContext().getSystemService("input_method");
                        if (inputMethodManager == null) {
                            return;
                        }
                        inputMethodManager.toggleSoftInput(1, 2);
                    }
                }, 200L);
            }
        }

        private void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else if (this.f2352a == null) {
            } else {
                if (!TextUtils.isEmpty(str)) {
                    this.f2352a.setText(str);
                    this.f2352a.setSelection(str.length());
                    return;
                }
                this.f2352a.setText("");
            }
        }
    }
}
