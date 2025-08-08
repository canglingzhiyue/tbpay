package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogf;
import tb.ogg;
import tb.ogk;
import tb.ogl;
import tb.ohd;
import tb.ohi;

/* loaded from: classes8.dex */
public class EditTextComponent extends TextComponent implements TextWatcher, com.taobao.tao.flexbox.layoutmanager.core.o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isInputMethodShown;
    private String currentText = "";
    private boolean maxLengthSet = false;
    private boolean imeActionSet = false;
    private YogaMeasureFunction measureFunction = new YogaMeasureFunction() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
            if (r6 == com.facebook.yoga.YogaMeasureMode.EXACTLY) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
            if (r8 == com.facebook.yoga.YogaMeasureMode.EXACTLY) goto L22;
         */
        @Override // com.facebook.yoga.YogaMeasureFunction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long measure(com.facebook.yoga.YogaNode r4, float r5, com.facebook.yoga.YogaMeasureMode r6, float r7, com.facebook.yoga.YogaMeasureMode r8) {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.AnonymousClass1.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L32
                r1 = 6
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r2 = 1
                r1[r2] = r4
                r4 = 2
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r5)
                r1[r4] = r2
                r4 = 3
                r1[r4] = r6
                r4 = 4
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r7)
                r1[r4] = r5
                r4 = 5
                r1[r4] = r8
                java.lang.String r4 = "15b3ebfa"
                java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
                java.lang.Number r4 = (java.lang.Number) r4
                long r4 = r4.longValue()
                return r4
            L32:
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.ogl r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$000(r4)
                tb.ogk r0 = (tb.ogk) r0
                r1 = -1
                r4.setupLayoutHelper(r0, r1)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                com.taobao.tao.flexbox.layoutmanager.drawable.e r4 = r4.textLayoutHelper
                r4.a(r6, r5)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                tb.ogl r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$100(r4)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent$a r4 = (com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.a) r4
                java.lang.String r4 = r4.e
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                android.view.View r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$200(r0)
                if (r0 == 0) goto L6a
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                android.view.View r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.access$300(r0)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r0 = r0.getText()
                boolean r1 = android.text.StringUtils.isEmpty(r0)
                if (r1 != 0) goto L6a
                r4 = r0
            L6a:
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                com.taobao.tao.flexbox.layoutmanager.drawable.e r0 = r0.textLayoutHelper
                r0.a(r4)
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r4 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                com.taobao.tao.flexbox.layoutmanager.drawable.e r4 = r4.textLayoutHelper
                int r4 = r4.o()
                com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.this
                com.taobao.tao.flexbox.layoutmanager.drawable.e r0 = r0.textLayoutHelper
                int r0 = r0.p()
                float r4 = (float) r4
                float r0 = (float) r0
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
                if (r6 != r1) goto L88
                goto L97
            L88:
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                if (r6 != r1) goto L92
                float r5 = java.lang.Math.min(r4, r5)
            L90:
                r4 = r5
                goto L97
            L92:
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                if (r6 != r1) goto L97
                goto L90
            L97:
                com.facebook.yoga.YogaMeasureMode r5 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
                if (r8 != r5) goto L9d
            L9b:
                r7 = r0
                goto Laa
            L9d:
                com.facebook.yoga.YogaMeasureMode r5 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                if (r8 != r5) goto La6
                float r7 = java.lang.Math.min(r0, r7)
                goto Laa
            La6:
                com.facebook.yoga.YogaMeasureMode r5 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                if (r8 != r5) goto L9b
            Laa:
                long r4 = com.facebook.yoga.YogaMeasureOutput.make(r4, r7)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.AnonymousClass1.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
        }
    };

    /* loaded from: classes8.dex */
    public interface c {
        void a();
    }

    public static /* synthetic */ Object ipc$super(EditTextComponent editTextComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1732822424) {
            super.applyAttrForView((View) objArr[0], (ogk) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != -362270061) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.updateNeedLayoutOrRender((String) objArr[0]);
            return null;
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ ogl access$000(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c43bd117", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ ogl access$100(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("a22f36f6", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1000(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("430740c8", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1200(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("feee0c86", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1300(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("dd555a71", new Object[]{editTextComponent}) : editTextComponent.node;
    }

    public static /* synthetic */ ogl access$1400(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("bad4d844", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1500(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6f8367af", new Object[]{editTextComponent}) : editTextComponent.node;
    }

    public static /* synthetic */ ogl access$1600(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("76bba402", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ boolean access$1702(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52063e49", new Object[]{new Boolean(z)})).booleanValue();
        }
        isInputMethodShown = z;
        return z;
    }

    public static /* synthetic */ View access$200(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("36d8aaff", new Object[]{editTextComponent}) : editTextComponent.view;
    }

    public static /* synthetic */ View access$300(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fd0333c0", new Object[]{editTextComponent}) : editTextComponent.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$400(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("b3013e1f", new Object[]{editTextComponent}) : editTextComponent.node;
    }

    public static /* synthetic */ ogl access$500(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("19fcce72", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$800(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("d75d589b", new Object[]{editTextComponent}) : editTextComponent.node;
    }

    public static /* synthetic */ ogl access$900(EditTextComponent editTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("91ca65ee", new Object[]{editTextComponent}) : editTextComponent.viewParams;
    }

    static {
        kge.a(-281084725);
        kge.a(1670231405);
        kge.a(1024805516);
        isInputMethodShown = false;
    }

    public static boolean isInputMethodShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af0f705b", new Object[0])).booleanValue() : isInputMethodShown;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this}) : this.measureFunction;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogk mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogk) ipChange.ipc$dispatch("36baa10c", new Object[]{this}) : new a(this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        TNodeEditText tNodeEditText = new TNodeEditText(context);
        tNodeEditText.addTextChangedListener(this);
        return tNodeEditText;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void updateNeedLayoutOrRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea683293", new Object[]{this, str});
            return;
        }
        super.updateNeedLayoutOrRender(str);
        if (!"placeholder".equals(str) || this.view == 0 || !StringUtils.isEmpty(((EditText) this.view).getText())) {
            return;
        }
        this.node.m();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(final View view, final ogk ogkVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b73a68", new Object[]{this, view, ogkVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, ogkVar, map, z);
        boolean z2 = view instanceof EditText;
        if (z2 && !this.maxLengthSet && ogkVar.C != -1) {
            this.maxLengthSet = true;
            b bVar = new b(ogkVar.C);
            bVar.a(new c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ohi.a(view.getContext(), String.format(view.getContext().getString(R.string.at_most_add_word), Integer.valueOf(ogkVar.C)));
                    }
                }
            });
            ((EditText) view).setFilters(new InputFilter[]{bVar});
        }
        if (z2 && !this.imeActionSet) {
            this.imeActionSet = true;
            EditText editText = (EditText) view;
            a aVar = (a) ogkVar;
            editText.setImeOptions(aVar.h);
            if (aVar.h > 0 && !StringUtils.isEmpty(((a) this.viewParams).i)) {
                editText.setInputType(1);
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                        }
                        if (i != ((a) ogkVar).h) {
                            return false;
                        }
                        EditTextComponent editTextComponent = EditTextComponent.this;
                        editTextComponent.sendMessage(EditTextComponent.access$400(editTextComponent), "onreturn", ((a) EditTextComponent.access$500(EditTextComponent.this)).i, null, null);
                        return true;
                    }
                });
            }
        }
        EditText editText2 = (EditText) view;
        a aVar2 = (a) ogkVar;
        if (StringUtils.equals(editText2.getHint(), aVar2.e)) {
            return;
        }
        editText2.setHint(aVar2.e);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String charSequence2 = charSequence.toString();
        if (this.currentText.equals(charSequence2)) {
            return;
        }
        String str = this.currentText;
        this.currentText = charSequence2;
        this.node.u();
        TNodeEditText.access$702((TNodeEditText) this.view, !TNodeEditText.access$600((TNodeEditText) this.view));
        com.taobao.tao.flexbox.layoutmanager.core.aa L = this.node.L();
        this.node.m();
        L.l();
        L.b(this.view.getContext());
        TNodeEditText.access$702((TNodeEditText) this.view, false);
        if (((a) this.viewParams).f == null || TNodeEditText.access$600((TNodeEditText) this.view)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldValue", str);
        hashMap.put("newValue", charSequence2);
        hashMap.put("text", charSequence2);
        sendMessage(this.node, "onchange", ((a) this.viewParams).f, hashMap, null);
    }

    /* loaded from: classes8.dex */
    public static class b implements InputFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f20004a;
        private c b;

        static {
            kge.a(-262975145);
            kge.a(695719296);
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7faf348d", new Object[]{this, cVar});
            } else {
                this.b = cVar;
            }
        }

        public b(int i) {
            this.f20004a = i;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
            }
            int a2 = this.f20004a - (ogf.a(spanned.toString()) - (i4 - i3));
            boolean b = ogf.b(charSequence.toString());
            int a3 = ogf.a(charSequence.toString());
            if (a2 <= 0) {
                c cVar = this.b;
                if (cVar != null) {
                    cVar.a();
                }
                return "";
            } else if ((b && a2 > 0) || a2 >= a3) {
                return null;
            } else {
                int i5 = a2 + i;
                return (!Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) || (i5 = i5 + (-1)) != i) ? charSequence.subSequence(i, i5) : "";
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ogk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private EditTextComponent f20003a;
        public String e;
        public String f;
        public String g;
        public int h;
        public String i;
        public boolean j;
        public boolean k;

        static {
            kge.a(-1991836965);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2079543418) {
                super.a((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            } else if (hashCode != -1185345197) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
        }

        public a(EditTextComponent editTextComponent) {
            this.f20003a = editTextComponent;
        }

        @Override // tb.ogk, tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.e = oec.c(hashMap.get("placeholder"));
            this.f = oec.c(hashMap.get("onchange"));
            this.g = oec.c(hashMap.get("onediting"));
            this.j = oec.a(hashMap.get("keyboard-new-scene"), false);
            this.k = oec.a(hashMap.get("auto-request-focus"), true);
        }

        @Override // tb.ogk, tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            super.a(context, str, obj);
            if (Constants.Name.RETURN_KEY_TYPE.equals(str)) {
                String c = oec.c(obj);
                if (c == null) {
                    return;
                }
                char c2 = 65535;
                switch (c.hashCode()) {
                    case -906336856:
                        if (c.equals("search")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3304:
                        if (c.equals("go")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3089282:
                        if (c.equals(com.taobao.android.weex_framework.util.a.ATOM_done)) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 3377907:
                        if (c.equals("next")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3526536:
                        if (c.equals("send")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    this.h = 2;
                } else if (c2 == 1) {
                    this.h = 5;
                } else if (c2 == 2) {
                    this.h = 3;
                } else if (c2 == 3) {
                    this.h = 4;
                } else if (c2 == 4) {
                    this.h = 6;
                } else {
                    this.h = 0;
                }
            } else if (!"onreturn".equals(str)) {
            } else {
                this.i = oec.c(obj);
            }
        }

        @Override // tb.ogk
        public CharSequence a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("2d0b4348", new Object[]{this, str});
            }
            CharSequence charSequence = "";
            if (this.f20003a.getView() == 0) {
                return str != null ? ogf.a(this.f20003a.getNode().N(), str, (int) this.m) : charSequence;
            } else if (oeb.e()) {
                TNodeEditText tNodeEditText = (TNodeEditText) this.f20003a.getView();
                if (TNodeEditText.access$700(tNodeEditText)) {
                    Editable text = ((EditText) this.f20003a.getView()).getText();
                    EditTextComponent.access$800(this.f20003a).a("text", text);
                    return text;
                }
                if (str != null) {
                    Editable text2 = tNodeEditText.getText();
                    charSequence = ogf.a(this.f20003a.getNode().N(), str, (int) this.m);
                    if (oeb.ck() && StringUtils.equals(text2, str)) {
                        return text2;
                    }
                }
                return charSequence;
            } else {
                return ((EditText) this.f20003a.getView()).getText();
            }
        }
    }

    /* loaded from: classes8.dex */
    public class TNodeEditText extends EditText implements View.OnTouchListener, d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean inputMethodShown;
        private int softInputMode;
        private d softKeyBoardListener;
        private boolean textChangedByCallSetText;
        private boolean userInput;

        static {
            kge.a(-455929644);
            kge.a(-468432129);
            kge.a(-932554534);
        }

        public static /* synthetic */ Object ipc$super(TNodeEditText tNodeEditText, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -369979614:
                    return new Boolean(super.onKeyPreIme(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
                case 358241672:
                    super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
                    return null;
                case 678958088:
                    super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                    return null;
                case 949399698:
                    super.onDetachedFromWindow();
                    return null;
                case 1626033557:
                    super.onAttachedToWindow();
                    return null;
                case 1774009266:
                    return new Boolean(super.performClick());
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public static /* synthetic */ d access$1100(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c6065a98", new Object[]{tNodeEditText}) : tNodeEditText.softKeyBoardListener;
        }

        public static /* synthetic */ d access$1102(TNodeEditText tNodeEditText, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a64beb52", new Object[]{tNodeEditText, dVar});
            }
            tNodeEditText.softKeyBoardListener = dVar;
            return dVar;
        }

        public static /* synthetic */ boolean access$600(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6934385c", new Object[]{tNodeEditText})).booleanValue() : tNodeEditText.textChangedByCallSetText;
        }

        public static /* synthetic */ boolean access$700(TNodeEditText tNodeEditText) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7bb499d", new Object[]{tNodeEditText})).booleanValue() : tNodeEditText.userInput;
        }

        public static /* synthetic */ boolean access$702(TNodeEditText tNodeEditText, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aaf1219d", new Object[]{tNodeEditText, new Boolean(z)})).booleanValue();
            }
            tNodeEditText.userInput = z;
            return z;
        }

        public TNodeEditText(Context context) {
            super(context);
            this.textChangedByCallSetText = false;
            this.inputMethodShown = false;
            this.softInputMode = 48;
            try {
                this.softInputMode = ((Activity) context).getWindow().getAttributes().softInputMode;
            } catch (Exception e) {
                ogg.b(e.getMessage());
            }
            setOnTouchListener(this);
        }

        @Override // android.widget.EditText, android.widget.TextView
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
                return;
            }
            this.textChangedByCallSetText = true;
            super.setText(charSequence, bufferType);
            this.textChangedByCallSetText = false;
        }

        @Override // android.widget.TextView, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            if ((EditTextComponent.access$900(EditTextComponent.this) instanceof a) && ((a) EditTextComponent.access$1000(EditTextComponent.this)).k) {
                requestFocus();
            }
            post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.TNodeEditText.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TNodeEditText.access$1100(TNodeEditText.this) != null) {
                    } else {
                        TNodeEditText tNodeEditText = TNodeEditText.this;
                        TNodeEditText tNodeEditText2 = TNodeEditText.this;
                        TNodeEditText.access$1102(tNodeEditText, new d((Activity) tNodeEditText.getContext(), tNodeEditText2, (ogk) EditTextComponent.access$1200(EditTextComponent.this)));
                    }
                }
            });
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            d dVar = this.softKeyBoardListener;
            if (dVar == null) {
                return;
            }
            dVar.a();
            this.softKeyBoardListener = null;
        }

        private ViewParent findScrollParent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewParent) ipChange.ipc$dispatch("dce31d2f", new Object[]{this});
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa J = EditTextComponent.access$1300(EditTextComponent.this).J();
            while (J != null && !(J.I() instanceof com.taobao.tao.flexbox.layoutmanager.core.z)) {
                J = J.J();
            }
            if (J == null) {
                return null;
            }
            return (ViewParent) J.x();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            ViewParent findScrollParent = findScrollParent();
            if (findScrollParent != null) {
                if (canScrollVertically(-1) || canScrollVertically(1)) {
                    findScrollParent.requestDisallowInterceptTouchEvent(true);
                }
                if (motionEvent.getAction() == 1) {
                    findScrollParent.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (oeb.k() && motionEvent.getAction() == 1 && view == this && (this.softInputMode & 240) == 48 && !this.inputMethodShown) {
                oec.a((View) this);
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
            }
            if ((this.softInputMode & 240) == 48 && !this.inputMethodShown) {
                oec.a((View) this);
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            return super.performClick();
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e9f28f22", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && keyEvent.getAction() == 1 && this.inputMethodShown) {
                this.inputMethodShown = false;
                sendOnEditingMessage(false);
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
                return;
            }
            super.onFocusChanged(z, i, rect);
            if (z || !this.inputMethodShown) {
                return;
            }
            this.inputMethodShown = false;
            sendOnEditingMessage(z);
        }

        private void sendOnEditingMessage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c398ae37", new Object[]{this, new Boolean(z)});
            } else if (((a) EditTextComponent.access$1400(EditTextComponent.this)).g == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("state", Integer.valueOf(z ? 1 : 0));
                EditTextComponent editTextComponent = EditTextComponent.this;
                editTextComponent.sendMessage(EditTextComponent.access$1500(editTextComponent), "onediting", ((a) EditTextComponent.access$1600(EditTextComponent.this)).g, hashMap, null);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.d.a
        public void onKeyBoardShown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1cd0f2", new Object[]{this});
                return;
            }
            if (isFocused() && !this.inputMethodShown) {
                this.inputMethodShown = true;
                sendOnEditingMessage(true);
            }
            EditTextComponent.access$1702(true);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.d.a
        public void onKeyBoardHidden() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b038097", new Object[]{this});
                return;
            }
            if (this.inputMethodShown) {
                this.inputMethodShown = false;
                sendOnEditingMessage(false);
            }
            EditTextComponent.access$1702(false);
        }
    }

    /* loaded from: classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f20005a;
        private int b;
        private a c;
        private int d;
        private ViewTreeObserver.OnGlobalLayoutListener e = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                try {
                    Rect rect = new Rect();
                    d.a(d.this).getWindowVisibleDisplayFrame(rect);
                    int height = rect.height();
                    if (d.b(d.this) == 0) {
                        d.a(d.this, height);
                    } else if (d.b(d.this) == height || Math.abs(d.b(d.this) - height) <= d.c(d.this)) {
                    } else {
                        if (d.b(d.this) > height) {
                            z = true;
                        }
                        if (d.d(d.this) != null) {
                            if (z) {
                                d.d(d.this).onKeyBoardShown();
                            } else {
                                d.d(d.this).onKeyBoardHidden();
                            }
                        }
                        d.a(d.this, height);
                    }
                } catch (Exception e) {
                    ogg.b(e.getMessage());
                }
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes8.dex */
        public interface a {
            void onKeyBoardHidden();

            void onKeyBoardShown();
        }

        static {
            kge.a(1867764798);
        }

        public static /* synthetic */ int a(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7645e78a", new Object[]{dVar, new Integer(i)})).intValue();
            }
            dVar.b = i;
            return i;
        }

        public static /* synthetic */ View a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a3a65e2e", new Object[]{dVar}) : dVar.f20005a;
        }

        public static /* synthetic */ int b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46bb8fe0", new Object[]{dVar})).intValue() : dVar.b;
        }

        public static /* synthetic */ int c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc776e1", new Object[]{dVar})).intValue() : dVar.d;
        }

        public static /* synthetic */ a d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fc2cd1ae", new Object[]{dVar}) : dVar.c;
        }

        public d(Activity activity, a aVar, ogk ogkVar) {
            this.f20005a = activity.getWindow().getDecorView();
            this.c = aVar;
            this.d = ohd.b((Context) activity, 200);
            if ((ogkVar instanceof a) && ((a) ogkVar).j && this.b == 0) {
                Rect rect = new Rect();
                this.f20005a.getWindowVisibleDisplayFrame(rect);
                this.b = rect.height();
            }
            try {
                this.f20005a.getViewTreeObserver().addOnGlobalLayoutListener(this.e);
            } catch (Exception e) {
                ogg.b(e.getMessage());
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                this.f20005a.getViewTreeObserver().removeGlobalOnLayoutListener(this.e);
            } catch (Exception e) {
                ogg.b(e.getMessage());
            }
        }
    }
}
