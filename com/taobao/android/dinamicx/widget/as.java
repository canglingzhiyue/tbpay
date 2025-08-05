package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class as extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID = -911702450770524810L;
    public static final String EVENT = "event";
    public static final String E_OPEN_URL = "openUrl";
    public static final String IMAGE_DESCRIPTION = "description";
    public static final String IMAGE_URL = "imageUrl";
    public static final String STYLE = "style";
    public static final long TAG_SPAN_USE_AP = -2338107240079086442L;
    public static final String TEXT = "text";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_KEY = "type";

    /* renamed from: a  reason: collision with root package name */
    public boolean f12059a;
    public SpannableString e;
    public JSONArray b = new JSONArray();
    public HashMap<String, b> f = new HashMap<>();
    public aq c = new aq();
    public ar d = new ar();

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new as();
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public c f12062a;
        public boolean b = false;
        public boolean c = false;
        public float d = 0.0f;
        public float e = 0.0f;
        public String f = "";
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f12063a;
        public int b;
        public int c = 33;
        public List<Object> d = new ArrayList();
    }

    public static /* synthetic */ Object ipc$super(as asVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new as();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof as)) {
            return;
        }
        as asVar = (as) dXWidgetNode;
        this.b = (JSONArray) asVar.b.clone();
        this.f12059a = asVar.f12059a;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (3234380036921181282L != j) {
            return;
        }
        Spanned spanned = null;
        try {
            spanned = Html.fromHtml(str);
        } catch (Throwable th) {
            Log.e("TBXQRichText", th.toString());
        }
        setText(spanned);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (6166534142713395027L != j) {
            return;
        }
        if (obj instanceof JSONArray) {
            this.b = (JSONArray) obj;
        } else {
            this.b = a(obj.toString());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (TAG_SPAN_USE_AP == j) {
            if (i == 0) {
                z = false;
            }
            this.f12059a = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (TAG_SPAN_USE_AP != j) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    private JSONArray a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        try {
            return JSONObject.parseArray(str);
        } catch (Throwable th) {
            Log.e("TBXQRichText", th.toString());
            return jSONArray;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setText(a(this.b, DXWidgetNode.DXMeasureSpec.b(i)));
        setAccessibilityText(a(this.b));
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        HashMap<String, b> hashMap = this.f;
        if (hashMap == null) {
            return;
        }
        for (final Map.Entry<String, b> entry : hashMap.entrySet()) {
            if (!entry.getValue().b && !entry.getValue().c) {
                try {
                    AliImageInterface a2 = com.taobao.android.k.a().a(getDXRuntimeContext().m());
                    entry.getValue().b = true;
                    a2.a(entry.getKey()).b(new com.taobao.android.i<com.taobao.android.l>() { // from class: com.taobao.android.dinamicx.widget.as.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.i
                        public boolean a(com.taobao.android.l lVar) {
                            BitmapDrawable a3;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                            }
                            if (lVar != null && (a3 = lVar.a()) != null) {
                                a3.setBounds(0, 0, (int) (((b) entry.getValue()).e * ((b) entry.getValue()).d), (int) ((b) entry.getValue()).e);
                                com.taobao.android.dinamicx.widget.c cVar = new com.taobao.android.dinamicx.widget.c(a3, ((b) entry.getValue()).e);
                                ((b) entry.getValue()).f12062a.d.clear();
                                ((b) entry.getValue()).f12062a.d.add(cVar);
                                for (Object obj : ((b) entry.getValue()).f12062a.d) {
                                    as.this.e.setSpan(obj, ((b) entry.getValue()).f12062a.f12063a, ((b) entry.getValue()).f12062a.b, ((b) entry.getValue()).f12062a.c);
                                }
                                View view2 = view;
                                if (view2 instanceof TextView) {
                                    ((TextView) view2).setText(as.this.e);
                                }
                                ((b) entry.getValue()).c = true;
                            }
                            return false;
                        }
                    }).a(new com.taobao.android.i<com.taobao.android.g>() { // from class: com.taobao.android.dinamicx.widget.as.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.i
                        public boolean a(com.taobao.android.g gVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
                            }
                            ((b) entry.getValue()).c = true;
                            return false;
                        }
                    }).a();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        RichTextViewImpl richTextViewImpl = new RichTextViewImpl(context);
        if (richTextViewImpl instanceof TextView) {
            richTextViewImpl.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return richTextViewImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0307, code lost:
        if (r8 < 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x030d, code lost:
        if (r8 >= r14.size()) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x030f, code lost:
        r0 = (com.taobao.android.dinamicx.widget.as.c) r14.get(r8);
        r0.f12063a -= r20;
        r0.b -= r20;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0326, code lost:
        return r26.e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableString a(com.alibaba.fastjson.JSONArray r27, int r28) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.as.a(com.alibaba.fastjson.JSONArray, int):android.text.SpannableString");
    }

    public String a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64292110", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                if ("image".equals(jSONObject.getString("type"))) {
                    String string = jSONObject.getString("description");
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(string);
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        sb.append(string2);
                    }
                }
            }
        }
        return sb.toString();
    }

    public void a(String str, c cVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637ead06", new Object[]{this, str, cVar, new Float(f), new Float(f2)});
        } else if (this.f.get(str) != null) {
            b bVar = this.f.get(str);
            bVar.d = f;
            bVar.f12062a = cVar;
            bVar.e = f2;
        } else {
            b bVar2 = new b();
            bVar2.d = f;
            bVar2.f12062a = cVar;
            bVar2.e = f2;
            this.f.put(str, bVar2);
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("style");
    }

    public JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("event");
    }

    public Object a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f202d417", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new d(string, i);
    }

    public c a(JSONObject jSONObject, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("50234104", new Object[]{this, jSONObject, str, str2, cVar});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject b2 = b(jSONObject);
        c cVar2 = new c();
        cVar2.f12063a = str.indexOf(str2);
        cVar2.b = cVar2.f12063a + str2.length();
        ForegroundColorSpan a2 = a(cVar);
        int textColor = getTextColor();
        if (a2 != null) {
            textColor = a2.getForegroundColor();
        }
        Object a3 = a(b2, textColor);
        if (a3 != null) {
            cVar2.d.add(a3);
        }
        if (cVar2.d.size() <= 0) {
            return null;
        }
        return cVar2;
    }

    private ForegroundColorSpan a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("596e78ab", new Object[]{this, cVar});
        }
        if (cVar != null && cVar.d != null && cVar.d.size() > 0) {
            for (Object obj : cVar.d) {
                if (obj instanceof ForegroundColorSpan) {
                    return (ForegroundColorSpan) obj;
                }
            }
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class d extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f12064a;
        private int b;

        public d(String str, int i) {
            this.f12064a = str;
            this.b = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            textPaint.setColor(this.b);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                com.taobao.android.t.a().a(view.getContext()).a(this.f12064a);
            } catch (Throwable th) {
                Log.e("TBXQRichText", th.toString());
            }
        }
    }
}
