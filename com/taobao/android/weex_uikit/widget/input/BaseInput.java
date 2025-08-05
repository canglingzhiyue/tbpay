package com.taobao.android.weex_uikit.widget.input;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.input.a;
import com.taobao.android.weex_uikit.widget.input.f;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseInput extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public a.C0622a formatter;
    public f.c unregister;
    public d watcher;

    @Override // com.taobao.android.weex_uikit.ui.aa
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    public static /* synthetic */ MUSValue access$000(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("753c417d", new Object[]{baseInput, mUSValueArr, new Integer(i)}) : baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("d9b90c1c", new Object[]{baseInput, mUSValueArr, new Integer(i)}) : baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("3e35d6bb", new Object[]{baseInput, mUSValueArr, new Integer(i)}) : baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("a2b2a15a", new Object[]{baseInput, mUSValueArr, new Integer(i)}) : baseInput.getArgument(mUSValueArr, i);
    }

    static {
        kge.a(-10962559);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("type", "text");
        ATTR_DEF_MAP.put("textAlign", 3);
        ATTR_DEF_MAP.put(Constants.Name.SINGLELINE, true);
        ATTR_DEF_MAP.put("fontSize", Integer.valueOf(com.taobao.android.weex_uikit.widget.input.a.f16175a));
        ATTR_DEF_MAP.put(Constants.Name.RETURN_KEY_TYPE, 0);
        ATTR_DEF_MAP.put(Constants.Name.AUTOFOCUS, false);
        ATTR_DEF_MAP.put(Constants.Name.PLACEHOLDER_COLOR, -6710887);
        ATTR_DEF_MAP.put("color", -16777216);
    }

    public BaseInput(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("acae82d0", new Object[]{this, str}) : ATTR_DEF_MAP.get(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : com.taobao.android.weex_uikit.widget.input.a.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        com.taobao.android.weex_uikit.widget.input.a.a(uINode, mVar);
        if (!mVar.a()) {
            return;
        }
        this.formatter = (a.C0622a) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        com.taobao.android.weex_uikit.widget.input.a.a(this, mUSDKInstance, (EditText) obj, mVar, this.formatter, mVar2);
        if (mVar.a()) {
            this.watcher = (d) mVar.b();
        }
        if (!mVar2.a()) {
            return;
        }
        this.unregister = (f.c) mVar2.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, (EditText) obj, str, obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(this, mUSDKInstance, (EditText) obj, this.watcher, this.unregister);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -862768933:
                if (str.equals("setTextFormatter")) {
                    c = 5;
                    break;
                }
                break;
            case 3027047:
                if (str.equals(Constants.Event.BLUR)) {
                    c = 1;
                    break;
                }
                break;
            case 94746189:
                if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear)) {
                    c = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals(Constants.Event.FOCUS)) {
                    c = 0;
                    break;
                }
                break;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    c = 3;
                    break;
                }
                break;
            case 1863695367:
                if (str.equals("getSelectionRange")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            focus(uINode, mUSValueArr);
        } else if (c == 1) {
            blur(uINode, mUSValueArr);
        } else if (c == 2) {
            clear(uINode, mUSValueArr);
        } else if (c == 3) {
            setSelectionRange(uINode, mUSValueArr);
        } else if (c == 4) {
            getSelectionRange(uINode, mUSValueArr);
        } else if (c != 5) {
        } else {
            setTextFormatter(uINode, mUSValueArr);
        }
    }

    public void focus(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1090659", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.a(uINode);
                    }
                }
            });
        }
    }

    public void blur(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75248528", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.b(uINode);
                    }
                }
            });
        }
    }

    public void clear(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1ea78e", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.c(uINode);
                    }
                }
            });
        }
    }

    public void setSelectionRange(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2499d4", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.a(uINode, ((Integer) k.a(BaseInput.this.getInstance(), null, Integer.TYPE, BaseInput.access$000(BaseInput.this, mUSValueArr, 0))).intValue(), ((Integer) k.a(BaseInput.this.getInstance(), null, Integer.TYPE, BaseInput.access$100(BaseInput.this, mUSValueArr, 1))).intValue());
                    }
                }
            });
        }
    }

    public void getSelectionRange(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc21c8c8", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.a(uINode, (com.taobao.android.weex_framework.bridge.b) k.a(BaseInput.this.getInstance(), null, com.taobao.android.weex_framework.bridge.b.class, BaseInput.access$200(BaseInput.this, mUSValueArr, 0)));
                    }
                }
            });
        }
    }

    public void setTextFormatter(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7c9c", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.input.BaseInput.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.input.a.a(uINode, (JSONObject) k.a(BaseInput.this.getInstance(), null, JSONObject.class, BaseInput.access$300(BaseInput.this, mUSValueArr, 0)), BaseInput.this.formatter);
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r9.equals("value") != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.BaseInput.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    public void setTextAlign(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb01a38", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setType(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ea89d2", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.b(uINode, MUSValue.isNill(mUSValue) ? "text" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setColor(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379fec0d", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.c(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setValue(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e148c5bf", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.d(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setPlaceHolder(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6600b65d", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.e(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setAutoFocus(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981dd0c7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.input.a.a(uINode, z);
    }

    public void setFontSize(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4429d1dc", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.f(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setMaxLength(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4622d6e6", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.g(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setMaxSlashLength(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d5886d", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.h(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setReturnKeyType(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d70d47", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.i(uINode, MUSValue.isNill(mUSValue) ? "default" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setSingleLine(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6a0870", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.input.a.b(uINode, z);
    }

    public void setPlaceHolderColor(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f8f73c", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.j(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setMax(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45f69ac", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.k(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setMin(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64b207e", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.l(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r11.equals("fontSize") != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode r9, java.lang.Object r10, java.lang.String r11, java.lang.Object r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.input.BaseInput.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 5
            if (r1 == 0) goto L1e
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r6] = r8
            r1[r5] = r9
            r1[r4] = r10
            r1[r3] = r11
            r1[r2] = r12
            java.lang.String r9 = "fd3c7823"
            r0.ipc$dispatch(r9, r1)
            return
        L1e:
            r0 = -1
            int r1 = r11.hashCode()
            switch(r1) {
                case -1576785488: goto L70;
                case -1274492040: goto L66;
                case -1065511464: goto L5b;
                case 3575610: goto L50;
                case 94842723: goto L46;
                case 365601008: goto L3d;
                case 598246771: goto L32;
                case 914346044: goto L27;
                default: goto L26;
            }
        L26:
            goto L7b
        L27:
            java.lang.String r1 = "singleline"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 6
            goto L7c
        L32:
            java.lang.String r1 = "placeholder"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 3
            goto L7c
        L3d:
            java.lang.String r1 = "fontSize"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            goto L7c
        L46:
            java.lang.String r1 = "color"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 2
            goto L7c
        L50:
            java.lang.String r1 = "type"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 1
            goto L7c
        L5b:
            java.lang.String r1 = "textAlign"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 0
            goto L7c
        L66:
            java.lang.String r1 = "filter"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 5
            goto L7c
        L70:
            java.lang.String r1 = "placeholderColor"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L7b
            r2 = 7
            goto L7c
        L7b:
            r2 = -1
        L7c:
            switch(r2) {
                case 0: goto L9c;
                case 1: goto L98;
                case 2: goto L94;
                case 3: goto L90;
                case 4: goto L8c;
                case 5: goto L88;
                case 6: goto L84;
                case 7: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L9f
        L80:
            r8.refreshPlaceHolderColor(r9, r10, r12)
            goto L9f
        L84:
            r8.refreshSingleLine(r9, r10, r12)
            return
        L88:
            r8.refreshFilter(r9, r10, r12)
            return
        L8c:
            r8.refreshFontSize(r9, r10, r12)
            return
        L90:
            r8.refreshPlaceHolder(r9, r10, r12)
            return
        L94:
            r8.refreshColor(r9, r10, r12)
            return
        L98:
            r8.refreshType(r9, r10, r12)
            return
        L9c:
            r8.refreshTextAlign(r9, r10, r12)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.BaseInput.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    public void refreshTextAlign(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0d947c", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshType(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff3ac04", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, (EditText) obj, (String) obj2);
        }
    }

    public void refreshColor(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ba8fd1", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.b(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshPlaceHolder(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c881bb61", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.b(uINode, (EditText) obj, (String) obj2);
        }
    }

    public void refreshFontSize(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b2b28e", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.c(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshFilter(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d693e46", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, (EditText) obj, (InputFilter.LengthFilter) obj2);
        }
    }

    public void refreshSingleLine(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91c6f62", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.a(uINode, (EditText) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshPlaceHolderColor(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac26a0ee", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.d(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<BaseInput> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1457150321);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"focus\",\"blur\",\"clear\",\"setSelectionRange\",\"getSelectionRange\",\"setTextFormatter\"]";
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public BaseInput b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseInput) ipChange.ipc$dispatch("2db7e2d2", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            BaseInput baseInput = new BaseInput(i);
            baseInput.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                baseInput.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                baseInput.updateAttrs(mUSProps2);
            }
            return baseInput;
        }
    }
}
