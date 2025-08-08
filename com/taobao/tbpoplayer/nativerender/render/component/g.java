package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.poplayer.utils.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.TextModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.TextStyleModel;
import com.taobao.tbpoplayer.nativerender.p;
import tb.kge;
import tb.qnu;

/* loaded from: classes8.dex */
public class g extends c<TextModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1184264374);
    }

    public g(com.taobao.tbpoplayer.nativerender.e eVar, TextModel textModel, boolean z) {
        super(eVar, textModel, z);
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public StyleModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("815a627d", new Object[]{this});
        }
        if (this.b == 0) {
            return null;
        }
        return ((TextModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        i l = this.f22246a.l();
        TextStyleModel textStyleModel = ((TextModel) this.b).style;
        a(textView, ((TextModel) this.b).style);
        String a2 = p.a(this.f22246a, ((TextModel) this.b).text, !((TextModel) this.b).enableEmpty);
        if (!qnu.a(a2, ((TextModel) this.b).enableEmpty)) {
            com.taobao.tbpoplayer.nativerender.e eVar = this.f22246a;
            eVar.a("TEXT_CONTENT_INVALID", "id=" + ((TextModel) this.b).id + ".text=" + a2);
            return textView;
        }
        if (a2 == null) {
            a2 = "";
        }
        textView.setText(a2);
        textView.setIncludeFontPadding(false);
        try {
            textView.setTextSize(0, l.a(this.f22246a.a().a(), Float.parseFloat(textStyleModel.fontSize)));
            if (!StringUtils.isEmpty(textStyleModel.color)) {
                try {
                    textView.setTextColor(Color.parseColor(p.a(this.f22246a, textStyleModel.color, false)));
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopTextComponent.parseColor.textColor.error.", th);
                    com.taobao.tbpoplayer.nativerender.e eVar2 = this.f22246a;
                    eVar2.a("TEXT_COLOR_INVALID.ID=" + ((TextModel) this.b).id, String.valueOf(th.getMessage()));
                    return textView;
                }
            }
            int parseInt = !StringUtils.isEmpty(textStyleModel.maxLines) ? Integer.parseInt(textStyleModel.maxLines) : 1;
            if (parseInt > 1) {
                textView.setMaxLines(parseInt);
            } else {
                textView.setSingleLine();
            }
            float parseFloat = !StringUtils.isEmpty(textStyleModel.lineSpace) ? Float.parseFloat(textStyleModel.lineSpace) : 0.0f;
            if (parseFloat > 0.0f) {
                textView.setLineSpacing(l.a(context, parseFloat), 1.0f);
            } else {
                float parseFloat2 = !StringUtils.isEmpty(textStyleModel.lineHeight) ? Float.parseFloat(textStyleModel.lineHeight) : 0.0f;
                if (parseFloat2 > 0.0f && Build.VERSION.SDK_INT >= 28) {
                    textView.setLineHeight((int) l.a(context, parseFloat2));
                }
            }
            textView.setEllipsize(StringUtils.TruncateAt.END);
            if ("bold".equals(textStyleModel.fontWeight) || "bolder".equals(textStyleModel.fontWeight)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            textView.setGravity(17);
            if (Build.VERSION.SDK_INT >= 17) {
                if ("left".equals(textStyleModel.textAlign)) {
                    textView.setGravity(19);
                } else if ("right".equals(textStyleModel.textAlign)) {
                    textView.setGravity(21);
                }
            }
            textView.setHorizontallyScrolling(false);
            return textView;
        } catch (Throwable th2) {
            com.alibaba.poplayer.utils.c.a("PopTextComponent.parseFontSize.error.", th2);
            com.taobao.tbpoplayer.nativerender.e eVar3 = this.f22246a;
            eVar3.a("TEXT_SIZE_INVALID.ID=" + ((TextModel) this.b).id, String.valueOf(th2.getMessage()));
            return textView;
        }
    }
}
