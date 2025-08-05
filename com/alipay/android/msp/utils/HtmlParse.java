package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HtmlParse implements HtmlLite.UrlSpanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;

    public static /* synthetic */ Context access$000(HtmlParse htmlParse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("504c25b0", new Object[]{htmlParse}) : htmlParse.mContext;
    }

    public HtmlParse(Context context) {
        this.mContext = context;
    }

    @Override // com.alipay.android.app.template.HtmlLite.UrlSpanFactory
    public URLSpan createInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URLSpan) ipChange.ipc$dispatch("9360f5ca", new Object[]{this, str}) : new MyURLSpan(str);
    }

    /* loaded from: classes3.dex */
    public class MyURLSpan extends URLSpan {
        public MyURLSpan(String str) {
            super(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            String url = getURL();
            LogUtil.record(2, "MyURLSpan:openUrl", "url=".concat(String.valueOf(url)));
            Intent intent = new Intent(HtmlParse.access$000(HtmlParse.this), MspWebActivity.class);
            intent.putExtra("url", url);
            HtmlParse.access$000(HtmlParse.this).startActivity(intent);
        }
    }

    public static Spannable parseHtml(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spannable) ipChange.ipc$dispatch("e229699c", new Object[]{context, str});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            return HtmlLite.fromHtml(context, context.getResources().getDisplayMetrics().density, str, new HtmlParse(context), null, 0);
        }
        return null;
    }
}
