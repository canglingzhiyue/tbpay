package com.taobao.android.weex_uikit.widget.input;

import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.c;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1880518419);
    }

    public static /* synthetic */ void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            b(uINode, str);
        }
    }

    public static void a(String str, String str2, final UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6249e8c", new Object[]{str, str2, uINode});
            return;
        }
        final EditText editText = (EditText) uINode.getMountContent();
        if (editText == null) {
            return;
        }
        c.a(editText.getContext(), editText.getText().toString(), str, str2, new c.a() { // from class: com.taobao.android.weex_uikit.widget.input.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_uikit.widget.input.c.a
            public void a(boolean z, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str3});
                } else if (!z) {
                } else {
                    editText.setText(str3);
                    i.a(uINode, str3);
                }
            }
        }, null);
    }

    private static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else if (!uINode.hasEvent("change")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", (Object) str);
            uINode.fireEvent("change", jSONObject);
        }
    }

    public static void a(final UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{uINode});
            return;
        }
        final EditText editText = (EditText) uINode.getMountContent();
        if (editText == null) {
            return;
        }
        c.a(editText.getContext(), editText.getText().toString(), new c.a() { // from class: com.taobao.android.weex_uikit.widget.input.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_uikit.widget.input.c.a
            public void a(boolean z, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                } else if (!z) {
                } else {
                    editText.setText(str);
                    i.a(uINode, str);
                }
            }
        }, null);
    }
}
