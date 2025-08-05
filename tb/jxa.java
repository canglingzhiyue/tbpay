package tb;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.android.weex_uikit.widget.richtext.a;
import com.taobao.weex.common.Constants;

/* loaded from: classes6.dex */
public class jxa extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String i;
    private String j;

    static {
        kge.a(1683332361);
    }

    public static /* synthetic */ Object ipc$super(jxa jxaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1708636285) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ String a(jxa jxaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39c2861b", new Object[]{jxaVar}) : jxaVar.j;
    }

    public static /* synthetic */ RichText b(jxa jxaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RichText) ipChange.ipc$dispatch("ffdb1a23", new Object[]{jxaVar}) : jxaVar.h;
    }

    public static /* synthetic */ RichText c(jxa jxaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RichText) ipChange.ipc$dispatch("9c491682", new Object[]{jxaVar}) : jxaVar.h;
    }

    public static /* synthetic */ RichText d(jxa jxaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RichText) ipChange.ipc$dispatch("38b712e1", new Object[]{jxaVar}) : jxaVar.h;
    }

    public jxa(RichText richText) {
        super(richText);
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        super.b(str, str2);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3211051) {
            if (hashCode == 877198837 && str.equals("pseudoRef")) {
                c = 1;
            }
        } else if (str.equals(Constants.Name.HREF)) {
            c = 0;
        }
        if (c == 0) {
            this.i = str2;
        } else if (c != 1) {
        } else {
            this.j = str2;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3211051) {
            if (hashCode == 877198837 && str.equals("pseudoRef")) {
                c = 1;
            }
        } else if (str.equals(Constants.Name.HREF)) {
            c = 0;
        }
        if (c == 0) {
            this.i = str2;
        } else if (c != 1) {
        } else {
            this.j = str2;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void a(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1e299", new Object[]{this, spannableString, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(this.i)) {
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: tb.jxa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1038128277) {
                        super.updateDrawState((TextPaint) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pseudoRef", (Object) jxa.a(jxa.this));
                    if (jxa.b(jxa.this).getInstance().isDestroyed()) {
                        return;
                    }
                    jxa.d(jxa.this).getInstance().fireEventOnNode(jxa.c(jxa.this).getNodeId(), "itemclick", jSONObject);
                }
            };
            this.h.addClickSpan(clickableSpan);
            spannableString.setSpan(clickableSpan, i, k().length() + i, 33);
        }
        a(spannableString, i, k().length() + i);
        b(spannableString, i);
    }
}
