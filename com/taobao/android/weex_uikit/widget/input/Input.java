package com.taobao.android.weex_uikit.widget.input;

import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.input.BaseInput;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes6.dex */
public class Input extends BaseInput {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String beforeText;
    private boolean ignoreNextOnInputEvent;
    private CharSequence lastValue;
    private InputListenerInfo listenerInfo;

    static {
        kge.a(-516859438);
    }

    public static /* synthetic */ Object ipc$super(Input input, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1680040905:
                return new Integer(super.poolSize());
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -1460428041:
                return super.getNodeType();
            case -379972208:
                return new Boolean(super.isGenerated());
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 1023482609:
                super.onDispatchMethod((UINode) objArr[0], (String) objArr[1], (MUSValue[]) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ CharSequence access$000(Input input) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("b6f49a6", new Object[]{input}) : input.lastValue;
    }

    public static /* synthetic */ CharSequence access$002(Input input, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9ef6b1c0", new Object[]{input, charSequence});
        }
        input.lastValue = charSequence;
        return charSequence;
    }

    public static /* synthetic */ boolean access$100(Input input) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("764aa099", new Object[]{input})).booleanValue() : input.ignoreNextOnInputEvent;
    }

    public static /* synthetic */ boolean access$102(Input input, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5576caa1", new Object[]{input, new Boolean(z)})).booleanValue();
        }
        input.ignoreNextOnInputEvent = z;
        return z;
    }

    public static /* synthetic */ String access$200(Input input) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0dce9ca", new Object[]{input}) : input.beforeText;
    }

    public static /* synthetic */ String access$202(Input input, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31edccfe", new Object[]{input, str});
        }
        input.beforeText = str;
        return str;
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.aa
    public /* bridge */ /* synthetic */ UINodeType getNodeType() {
        return super.getNodeType();
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ boolean isGenerated() {
        return super.isGenerated();
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        super.onDispatchMethod(uINode, str, mUSValueArr);
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.aa
    public /* bridge */ /* synthetic */ int poolSize() {
        return super.poolSize();
    }

    public Input(int i) {
        super(i);
        this.listenerInfo = new InputListenerInfo();
        this.ignoreNextOnInputEvent = false;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        super.addEvent(str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1361636432:
                if (str.equals("change")) {
                    c = 0;
                    break;
                }
                break;
            case -934396624:
                if (str.equals("return")) {
                    c = 2;
                    break;
                }
                break;
            case 3027047:
                if (str.equals(Constants.Event.BLUR)) {
                    c = 4;
                    break;
                }
                break;
            case 97604824:
                if (str.equals(Constants.Event.FOCUS)) {
                    c = 3;
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.listenerInfo.addFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.android.weex_uikit.widget.input.Input.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    } else if (!Input.this.isMounted()) {
                    } else {
                        EditText editText = (EditText) Input.this.getMountContent();
                        if (z) {
                            Input.access$002(Input.this, editText.getText().toString());
                            return;
                        }
                        CharSequence text = editText.getText();
                        if (text == null) {
                            text = "";
                        }
                        if (StringUtils.equals(text, Input.access$000(Input.this))) {
                            return;
                        }
                        Input.this.fireEvent("change", null);
                        Input.access$002(Input.this, editText.getText().toString());
                    }
                }
            });
            this.listenerInfo.addEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.weex_uikit.widget.input.Input.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    Integer num;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (!Input.this.isMounted() || (num = (Integer) Input.this.getExtra(JarvisConstant.KEY_ACTION_ID)) == null) {
                        return false;
                    }
                    EditText editText = (EditText) Input.this.getMountContent();
                    if (i != num.intValue()) {
                        return false;
                    }
                    CharSequence text = editText.getText();
                    if (text == null) {
                        text = "";
                    }
                    if (!text.toString().equals(Input.access$000(Input.this))) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("value", (Object) text.toString());
                        Input.this.fireEvent("change", jSONObject);
                        Input.access$002(Input.this, editText.getText().toString());
                    }
                    com.taobao.android.weex_uikit.widget.input.a.a(textView.getContext(), editText);
                    return true;
                }
            });
        } else if (c == 1) {
            this.listenerInfo.addTextWatcher(new TextWatcher() { // from class: com.taobao.android.weex_uikit.widget.input.Input.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else if (!Input.this.isMounted()) {
                    } else {
                        if (Input.access$100(Input.this)) {
                            Input.access$102(Input.this, false);
                            Input.access$202(Input.this, charSequence.toString());
                        } else if (StringUtils.equals(Input.access$200(Input.this), charSequence)) {
                        } else {
                            Input.access$202(Input.this, charSequence.toString());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("value", (Object) charSequence.toString());
                            Input.this.fireEvent("input", jSONObject);
                        }
                    }
                }
            });
        } else if (c == 2) {
            this.listenerInfo.addEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.weex_uikit.widget.input.Input.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    Integer num;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (!Input.this.isMounted() || (num = (Integer) Input.this.getExtra(JarvisConstant.KEY_ACTION_ID)) == null || i != num.intValue()) {
                        return false;
                    }
                    JSONObject jSONObject = new JSONObject(2);
                    jSONObject.put(Constants.Name.RETURN_KEY_TYPE, Input.this.getAttribute(Constants.Name.RETURN_KEY_TYPE));
                    jSONObject.put("value", (Object) textView.getText().toString());
                    Input.this.fireEvent("return", jSONObject);
                    return true;
                }
            });
        } else if (c != 3 && c != 4) {
        } else {
            this.listenerInfo.addFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.android.weex_uikit.widget.input.Input.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
                    if (z && Input.this.hasEvent(Constants.Event.FOCUS)) {
                        Input.this.fireEvent(Constants.Event.FOCUS, jSONObject);
                    } else if (z || !Input.this.hasEvent(Constants.Event.BLUR)) {
                    } else {
                        Input.this.fireEvent(Constants.Event.BLUR, jSONObject);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        EditText editText = (EditText) obj;
        editText.addTextChangedListener(this.listenerInfo);
        editText.setOnFocusChangeListener(this.listenerInfo);
        editText.setOnEditorActionListener(this.listenerInfo);
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        EditText editText = (EditText) obj;
        editText.removeTextChangedListener(this.listenerInfo);
        editText.setOnFocusChangeListener(null);
    }

    /* loaded from: classes6.dex */
    public static class a extends BaseInput.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-728560512);
        }

        @Override // com.taobao.android.weex_uikit.widget.input.BaseInput.a, com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        @Override // com.taobao.android.weex_uikit.widget.input.BaseInput.a
        public BaseInput b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseInput) ipChange.ipc$dispatch("2db7e2d2", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Input input = new Input(i);
            input.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                input.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                input.updateAttrs(mUSProps2);
            }
            return input;
        }
    }
}
