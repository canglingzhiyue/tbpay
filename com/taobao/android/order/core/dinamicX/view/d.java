package com.taobao.android.order.core.dinamicX.view;

import android.content.Context;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import tb.fxa;
import tb.hzy;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID = 3148926433692722028L;

    /* renamed from: a  reason: collision with root package name */
    private static final long f14626a;
    private static final long b;
    private CharSequence c;
    private CharSequence d;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1352361576);
        f14626a = fxa.a("richText");
        b = fxa.a("price");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        hzy.a("DXRichTextViewWidgetNod", "onClone", "----");
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof d)) {
            return;
        }
        d dVar = (d) dXWidgetNode;
        this.c = dVar.c;
        this.d = dVar.d;
    }

    @Override // com.taobao.android.dinamicx.widget.af
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        if (!StringUtils.isEmpty(this.c)) {
            textView.setText(this.c);
        } else if (StringUtils.isEmpty(this.d)) {
        } else {
            textView.setText(this.d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (!StringUtils.isEmpty(this.c)) {
            textView.setText(this.c);
        } else if (StringUtils.isEmpty(this.d)) {
        } else {
            textView.setText(this.d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (j != b || str == null) {
            return;
        }
        String trim = str.trim();
        int indexOf = trim.indexOf(46);
        SpannableString spannableString = new SpannableString(trim);
        int a2 = a(trim);
        try {
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, a2, 33);
            int length = trim.length();
            if (indexOf < 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(16, true), a2, length, 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(16, true), a2, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(12, true), indexOf, length, 33);
            }
            this.d = spannableString;
        } catch (Exception unused) {
            this.d = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (j != f14626a) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.c = (CharSequence) obj;
        } else {
            this.c = "";
        }
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                return i;
            }
        }
        return 0;
    }
}
