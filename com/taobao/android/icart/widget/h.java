package com.taobao.android.icart.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.spk;

/* loaded from: classes5.dex */
public class h extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEXTVIEW_TEXTVIEW = -2672364288628517304L;
    public static final int ELLIPSIZE_CHAR = 4;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f12882a;
    private static boolean b;

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1814733277) {
            if (hashCode != -303753557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        return super.onCreateView((Context) objArr[0]);
    }

    static {
        kge.a(1664883821);
        f12882a = new ConcurrentHashMap();
        b = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b = spk.a("cart_switch", "useEllipsizeTextCache", true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new h();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        String a2 = a(view, this);
        if (a2 == null || !(view instanceof TextView)) {
            return;
        }
        setNativeText((TextView) view, a2);
    }

    public static String a(View view, af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da8f1006", new Object[]{view, afVar});
        }
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (afVar.getLineBreakMode() != 4) {
            return null;
        }
        try {
            String a2 = a(textView, textView.getText().toString(), afVar);
            afVar.setText(a2);
            return a2;
        } catch (Exception unused) {
            UnifyLog.c("DxTextViewBreakWidgetNode", "split char error", new Object[0]);
            return null;
        }
    }

    public static String a(TextView textView, String str, af afVar) {
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba403242", new Object[]{textView, str2, afVar});
        }
        float measuredWidth = (afVar.getMeasuredWidth() - afVar.getPaddingLeft()) - afVar.getPaddingRight();
        if (!StringUtils.isEmpty(str) && measuredWidth > 0.0f) {
            String str3 = measuredWidth + "_" + str2;
            String str4 = f12882a.get(str3);
            if (b && str4 != null) {
                return str4;
            }
            String[] split = str2.replaceAll("\r", "").split("\n");
            StringBuilder sb = new StringBuilder();
            int length = split.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i;
                String str5 = split[i2];
                boolean z = true;
                while (z && i3 < afVar.getMaxLines()) {
                    String str6 = str5;
                    int i4 = i3;
                    int i5 = i2;
                    int breakText = textView.getPaint().breakText(str5, 0, str5.length(), true, measuredWidth, null);
                    if (breakText < str6.length()) {
                        sb.append(str6.substring(0, breakText));
                        str5 = str6.substring(breakText);
                    } else {
                        sb.append(str6);
                        str5 = str6;
                        z = false;
                    }
                    sb.append("\n");
                    i3 = i4 + 1;
                    i2 = i5;
                }
                i2++;
                i = i3;
            }
            if (!str2.endsWith("\n")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            str2 = sb.toString();
            if (b) {
                f12882a.put(str3, str2);
            }
        }
        return str2;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            f12882a.clear();
        }
    }
}
