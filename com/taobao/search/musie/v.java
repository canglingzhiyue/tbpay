package com.taobao.search.musie;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ImageSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.text.TextLayoutBuilder;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public final class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f19288a;
    private final JSONObject b;

    static {
        kge.a(-2058866076);
    }

    public v(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f19288a = jSONObject;
        this.b = jSONObject2;
    }

    private final CharSequence a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f6c0212e", new Object[]{this, charSequence});
        }
        StringBuilder sb = new StringBuilder(charSequence.length() << 1);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt < 56320) {
                sb.append(charAt);
            } else {
                sb.append(charAt);
                sb.append("\u200b");
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.q.a((Object) sb2, "result.toString()");
        return sb2;
    }

    public final void a() {
        Object value;
        Object value2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f19288a;
        if (jSONObject == null || this.b == null) {
            return;
        }
        try {
            String a2 = a(jSONObject.getString("fontSize"));
            boolean booleanValue = this.f19288a.getBooleanValue("isBold");
            CharSequence a3 = a((CharSequence) a(this.f19288a.getString("title")));
            String a4 = a(this.f19288a.getString("width"));
            String string = this.f19288a.getString("iconWidth");
            int a5 = StringUtils.isEmpty(string) ? 0 : (int) com.taobao.android.weex_framework.util.i.a(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(new a(a5)), 0, 1, 33);
            spannableStringBuilder.append(a3);
            int intValue = this.f19288a.getIntValue("lines");
            Layout a6 = a(com.taobao.android.weex_framework.util.i.a(a4), spannableStringBuilder, com.taobao.android.weex_framework.util.i.a(a2), booleanValue, true);
            Layout a7 = a(Integer.MAX_VALUE, spannableStringBuilder, com.taobao.android.weex_framework.util.i.a(a2), booleanValue, false);
            HashMap hashMap = new HashMap();
            hashMap.put("lines", String.valueOf(intValue));
            hashMap.put("actualLines", String.valueOf(a6 != null ? Integer.valueOf(a6.getLineCount()) : null));
            HashMap hashMap2 = hashMap;
            StringBuilder sb = new StringBuilder();
            if (a7 != null) {
                i = a7.getWidth();
            }
            sb.append(String.valueOf(com.taobao.search.common.util.l.b(i)));
            sb.append("px");
            hashMap2.put("totalWidth", sb.toString());
            for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                String key = entry.getKey();
                if (key != null && (value2 = entry.getValue()) != null) {
                    hashMap.put(key, value2.toString());
                }
            }
            for (Map.Entry<String, Object> entry2 : this.f19288a.entrySet()) {
                String key2 = entry2.getKey();
                if (key2 != null && (value = entry2.getValue()) != null) {
                    hashMap.put(key2, value.toString());
                }
            }
            com.taobao.search.mmd.util.e.b("SearchItemTitleExpose", hashMap);
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes7.dex */
    public static final class a extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f19289a;

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }

        public a(int i) {
            this.f19289a = i;
            setBounds(0, 0, i, 1);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.f19289a;
        }
    }

    private final Layout a(float f, CharSequence charSequence, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("14d409a9", new Object[]{this, new Float(f), charSequence, new Float(f2), new Boolean(z), new Boolean(z2)});
        }
        TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
        textLayoutBuilder.c(false);
        if (z2) {
            i = 1;
        }
        Application application = Globals.getApplication();
        kotlin.jvm.internal.q.a((Object) application, "Globals.getApplication()");
        Resources resources = application.getResources();
        kotlin.jvm.internal.q.a((Object) resources, "Globals.getApplication().resources");
        TextLayoutBuilder f3 = textLayoutBuilder.d(resources.getDisplayMetrics().density).a((StringUtils.TruncateAt) null).e(100).a(0.0f, 0.0f, 0.0f, 0).b(false).a(charSequence).a((int) f2).a((int) f, i).a(true).a(0.0f).b(1.0f).a(Layout.Alignment.ALIGN_NORMAL).c(0).f(0);
        kotlin.jvm.internal.q.a((Object) f3, "layoutBuilder\n          …     .setBreakStrategy(0)");
        f3.g(0);
        if (Build.VERSION.SDK_INT >= 26) {
            textLayoutBuilder.l(0);
        }
        textLayoutBuilder.a(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        return textLayoutBuilder.b();
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            throw new RuntimeException("invalid value");
        }
        if (str == null) {
            kotlin.jvm.internal.q.a();
        }
        return str;
    }
}
