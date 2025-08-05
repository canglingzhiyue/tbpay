package com.taobao.tao.welcome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.kge;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b;
    private final int c;

    static {
        kge.a(-942130756);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(Context context, String str, int[] iArr, int[] iArr2) {
        this(context, str, 0, 0, iArr, iArr2);
    }

    public c(Context context, String str, int i, int i2, int[] iArr, int[] iArr2) {
        super(context, str, iArr, iArr2);
        this.b = i;
        this.c = i2;
    }

    @Override // com.taobao.tao.welcome.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        TextView textView = (TextView) a(R.id.provision_title_text);
        int i = this.b;
        if (i != 0) {
            textView.setText(i);
        }
        TextView textView2 = (TextView) a(R.id.provision_content_text);
        int i2 = this.c;
        if (i2 != 0) {
            textView2.setText(i2);
        }
        CharSequence text = textView2.getText();
        String charSequence = text.toString();
        String string = getContext().getString(R.string.privacy_anchor_tag);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int indexOf = charSequence.indexOf(string);
        if (indexOf < 0) {
            return;
        }
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.taobao.tao.welcome.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1038128277) {
                    super.updateDrawState((TextPaint) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    Uri build = Uri.parse(view.getResources().getString(R.string.privacy_url_protocol)).buildUpon().appendQueryParameter(MspGlobalDefine.LANG, Locale.getDefault().getLanguage()).build();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("viewMode", true);
                    c.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://privacypolicy.m.taobao.com/index.htm")).setPackage(TaoHelper.getPackageName()).putExtra("params", bundle).putExtra("url", build.toString()).addFlags(268435456));
                } catch (Exception unused) {
                    Toast.makeText(c.this.getContext(), R.string.toast_browser_not_installed, 1).show();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                    return;
                }
                super.updateDrawState(textPaint);
                textPaint.setColor(-45056);
                textPaint.setUnderlineText(false);
            }
        }, indexOf, string.length() + indexOf, 33);
        TextView textView3 = (TextView) a(R.id.provision_content_text);
        textView3.setText(spannableStringBuilder);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
