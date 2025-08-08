package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLabelSpanUtil$ClickMoreListener;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.view.TextViewWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;

/* loaded from: classes4.dex */
public class FBLabel extends FBView implements HtmlLite.UrlSpanFactory, FBLabelSpanUtil$ClickMoreListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;

    /* loaded from: classes4.dex */
    public class MyURLSpan extends URLSpan {
        public MyURLSpan(String str) {
            super(str);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            if (FBLabel.this.isDestroyed()) {
                return;
            }
            try {
                Selection.setSelection((Spannable) ((FBBorderText) view).getText(), 0, 0);
            } catch (ClassCastException e) {
                FBLogger.e("FBLabel", e);
            }
            if (FBView.nativePlatformInvokeCallback(FBLabel.this.mNode, "onlink", getURL())) {
                return;
            }
            try {
                FBLabel.this.getFBDocument().openUrl(getURL());
            } catch (Throwable th) {
                super.onClick(view);
                LogCatLog.e("FBLabel", th);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public FBLabel(Context context, View view, FBDocument fBDocument) {
        super(context, view == null ? a(context) : view, fBDocument);
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = Color.parseColor("#333333");
        TextView textView = (TextView) this.mView;
        this.A = textView;
        this.B = textView instanceof FBBorderText;
        textView.setGravity(16);
        this.A.setTextColor(this.L);
    }

    public static TextView a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("56ecd4", new Object[]{context}) : new FBBorderText(context);
    }

    public static /* synthetic */ Object ipc$super(FBLabel fBLabel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1305055009:
                super.onLoadFinish();
                return null;
            case -1022301035:
                super.updateCSS((String) objArr[0], (String) objArr[1]);
                return null;
            case 663633004:
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        if (!this.B) {
            return;
        }
        FBBorderText fBBorderText = (FBBorderText) this.A;
        fBBorderText.setSupportEmoji(z);
        fBBorderText.setEmojiProvider(this.mDoc.getEngine().getConfig().getEmojiProvider());
    }

    @Override // com.alipay.android.app.template.HtmlLite.UrlSpanFactory
    public URLSpan createInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URLSpan) ipChange.ipc$dispatch("9360f5ca", new Object[]{this, str}) : new MyURLSpan(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.TextView] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:39:0x00be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00aa -> B:39:0x00be). Please submit an issue!!! */
    public void d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c(this.I);
        String str = this.H;
        SpannableStringBuilder spannableStringBuilder = null;
        String str2 = str;
        if (this.I) {
            TextView textView = this.A;
            str2 = str;
            if (textView instanceof TextViewWrapper) {
                TextViewWrapper textViewWrapper = (TextViewWrapper) textView;
                str2 = str;
                str2 = str;
                if (textViewWrapper.f5275a && str != null) {
                    str2 = textViewWrapper.e.prepareContent(str);
                }
            }
        }
        if (str2.contains("<font ") || HtmlLite.hasHtmlEntityChar(str2)) {
            z = true;
        }
        boolean contains = str2.contains("<a ");
        if (!z && !contains) {
            this.A.setText(str2);
        } else {
            try {
                spannableStringBuilder = HtmlLite.fromHtml(this.mDoc.k, FBDocumentAssistor.getDp(), str2, this, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping);
                if (contains) {
                    this.A.setMovementMethod(LinkMovementMethod.getInstance());
                    this.A.setText(spannableStringBuilder);
                    updateA12yNodeInfo();
                    str2 = str2;
                } else {
                    this.A.setText(spannableStringBuilder);
                    str2 = str2;
                }
            } catch (Throwable th) {
                FBLogger.e("FBLabel", "HtmlLite.fromHtml exception:" + th);
                try {
                    ?? r2 = this.A;
                    ?? fromHtml = Html.fromHtml(str2);
                    r2.setText(fromHtml);
                    str2 = fromHtml;
                } catch (Throwable th2) {
                    String str3 = "com.alipay.tag.html.Html.fromHtml exception:" + th2;
                    FBLogger.e("FBLabel", str3);
                    str2 = str3;
                }
            }
        }
        if (!this.K) {
            return;
        }
        ConnectionUtils.a(this.A, this.H, spannableStringBuilder, this);
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        super.doDestroy();
        this.mDoc = null;
        this.A = null;
        this.B = false;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.D.equals("hidden")) {
        } else {
            if (this.C.equals("ellipsis")) {
                this.A.setEllipsize(StringUtils.TruncateAt.END);
            } else if (!this.C.equals("marquee")) {
            } else {
                TextView textView = this.A;
                if (textView instanceof FBBorderText) {
                    ((FBBorderText) textView).setForceFocus(true);
                }
                this.A.setEllipsize(StringUtils.TruncateAt.MARQUEE);
                this.A.setSelected(true);
                this.A.setFocusable(true);
                this.A.setGravity(19);
                this.A.setHorizontallyScrolling(true);
                this.A.setMarqueeRepeatLimit(-1);
                this.A.setFocusableInTouchMode(true);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.F.equals("vertical") || !this.G.equals("-webkit-box")) {
        } else {
            if (this.E.length() > 0) {
                this.A.setMaxLines(Integer.parseInt(this.E));
                this.A.setEllipsize(StringUtils.TruncateAt.END);
                return;
            }
            this.A.setMaxLines(100000);
            this.A.setEllipsize(null);
        }
    }

    @Override // com.flybird.FBView
    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            super.onLoadFinish();
            d();
            if (!this.mTag.equals("marquee")) {
                return;
            }
            this.A.postDelayed(new Runnable() { // from class: com.flybird.FBLabel.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FBLabel.this.mDoc == null || FBLabel.this.mDoc.k == null) {
                    } else {
                        FBLabel fBLabel = FBLabel.this;
                        if (fBLabel.A == null) {
                            return;
                        }
                        if ((fBLabel.mDoc.k instanceof Activity) && ((Activity) FBLabel.this.mDoc.k).isFinishing()) {
                            return;
                        }
                        TextView textView = FBLabel.this.A;
                        if (textView instanceof FBBorderText) {
                            ((FBBorderText) textView).setForceFocus(true);
                        }
                        FBLabel.this.A.setEllipsize(StringUtils.TruncateAt.MARQUEE);
                        FBLabel.this.A.setSelected(true);
                        FBLabel.this.A.setFocusable(true);
                        FBLabel.this.A.setGravity(19);
                        FBLabel.this.A.setHorizontallyScrolling(true);
                        FBLabel.this.A.setFocusableInTouchMode(true);
                        FBLabel.this.A.setMarqueeRepeatLimit(-1);
                        FBLabel.this.A.requestFocus();
                    }
                }
            }, 100L);
        }
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
            return;
        }
        super.updateAttr(str, str2);
        if (str == null) {
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3556653) {
            if (hashCode != 96632902) {
                if (hashCode == 520188719 && str.equals("highlightcolor")) {
                    c = 2;
                }
            } else if (str.equals(ChatInputConstant.PANEL_ID_EMOJI)) {
                c = 1;
            }
        } else if (str.equals("text")) {
            c = 0;
        }
        if (c == 0) {
            putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_PROP, str, str2);
            String str3 = Platform.f5257a;
            this.H = str2;
            if (this.mDoc == null || !this.mDoc.isOnloadFinish()) {
                return;
            }
            d();
        } else if (c == 1) {
            this.I = Boolean.parseBoolean(str2);
        } else if (c != 2) {
        } else {
            putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_PROP, str, str2);
            if (this.A == null || StringUtils.isEmpty(str2)) {
                return;
            }
            try {
                this.A.setHighlightColor(Color.parseColor(str2));
            } catch (Throwable th) {
                FBLogger.e("FBLabel", th);
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -2006495646:
                    if (str.equals(a.ATOM_EXT_UDL_white_space)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1833570065:
                    if (str.equals("font-auto-adjust")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1655575466:
                    if (str.equals("selectable")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1586082113:
                    if (str.equals(a.ATOM_EXT_UDL_font_size)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1215680224:
                    if (str.equals(a.ATOM_EXT_UDL_line_height)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1165266359:
                    if (str.equals("line-height-v2")) {
                        c = 5;
                        break;
                    }
                    break;
                case -944750090:
                    if (str.equals("text-overflow-all")) {
                        c = 6;
                        break;
                    }
                    break;
                case -930515806:
                    if (str.equals(a.ATOM_EXT_UDL_text_overflow)) {
                        c = 7;
                        break;
                    }
                    break;
                case -453378651:
                    if (str.equals("-webkit-box-orient")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 108532386:
                    if (str.equals(a.ATOM_EXT_UDL_font_family)) {
                        c = '\n';
                        break;
                    }
                    break;
                case 140318912:
                    if (str.equals("-webkit-line-clamp")) {
                        c = 11;
                        break;
                    }
                    break;
                case 431477072:
                    if (str.equals(a.ATOM_EXT_UDL_text_decoration)) {
                        c = '\f';
                        break;
                    }
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 598800822:
                    if (str.equals(a.ATOM_EXT_UDL_font_weight)) {
                        c = 14;
                        break;
                    }
                    break;
                case 746232421:
                    if (str.equals(a.ATOM_EXT_UDL_text_align)) {
                        c = 15;
                        break;
                    }
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (str2.equals("nowrap")) {
                        this.A.setSingleLine(true);
                        return;
                    }
                    this.A.setMaxLines(10000);
                    this.A.setSingleLine(false);
                    return;
                case 1:
                    if (!(this.A instanceof FBBorderText) || !StringUtils.equals("true", str2)) {
                        return;
                    }
                    ((FBBorderText) this.A).h = true;
                    return;
                case 2:
                    boolean parseBoolean = Boolean.parseBoolean(str2);
                    this.J = parseBoolean;
                    this.A.setTextIsSelectable(parseBoolean);
                    return;
                case 3:
                    this.A.setTextSize(Platform.f, FBView.parseFontSize(str2));
                    return;
                case 4:
                    float parseFontSize = FBView.parseFontSize(str2);
                    if (!this.mDoc.configRemScaled() && !FBView.nativePlatformIsStableNode(this.mNode) && this.mDoc.s) {
                        parseFontSize *= this.mDoc.getRemScale();
                    }
                    this.A.setLineSpacing(parseFontSize, 1.0f);
                    return;
                case 5:
                    float parseFontSize2 = FBView.parseFontSize(str2);
                    if (!this.mDoc.configRemScaled() && !FBView.nativePlatformIsStableNode(this.mNode) && this.mDoc.s) {
                        parseFontSize2 *= this.mDoc.getRemScale();
                    }
                    FBDocumentAssistor.a(this.mDoc, (TextView) getInnerView(), parseFontSize2);
                    return;
                case 6:
                    try {
                        z = getFBDocument().getEngine().getConfig().getSettingProvider().getSwitch("bn_birdnest_enable_label_text_overflow_all", false);
                    } catch (Throwable unused) {
                        z = false;
                    }
                    if (!Boolean.parseBoolean(str2) || !z) {
                        z2 = false;
                    }
                    this.K = z2;
                    return;
                case 7:
                    this.C = str2;
                    e();
                    return;
                case '\b':
                    this.F = str2;
                    f();
                    return;
                case '\t':
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.A.setTextColor(FBTools.parseColor(str2, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
                    return;
                case '\n':
                    Typeface typeface = FontCache.getTypeface(this.mDoc.k, str2);
                    if (typeface != null) {
                        this.A.setTypeface(typeface);
                        return;
                    }
                    FBLogger.e("FBLabel", "typeface: " + str2 + " is not found!");
                    return;
                case 11:
                    this.E = str2;
                    f();
                    return;
                case '\f':
                    if (str2.equals("line-through")) {
                        this.A.getPaint().setFlags(this.A.getPaint().getFlags() | 16);
                        return;
                    } else if (!str2.equals("underline")) {
                        return;
                    } else {
                        this.A.getPaint().setFlags(this.A.getPaint().getFlags() | 8);
                        return;
                    }
                case '\r':
                    this.D = str2;
                    e();
                    return;
                case 14:
                    this.A.getPaint().setFakeBoldText("bold".equals(str2));
                    return;
                case 15:
                    if (str2.equals("center")) {
                        this.A.setGravity(17);
                        return;
                    } else if (str2.equals("right")) {
                        this.A.setGravity(21);
                        return;
                    } else {
                        this.A.setGravity(19);
                        return;
                    }
                case 16:
                    this.G = str2;
                    f();
                    return;
                default:
                    super.updateCSS(str, str2);
                    return;
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (this.mDoc == null || !str.equals("event") || str2 == null || !str2.equals("onclickmore") || !(this.mView instanceof FBBorderText)) {
            return;
        }
        FBView.nativePlatformValidateEvent(this.mNode, str2);
    }
}
