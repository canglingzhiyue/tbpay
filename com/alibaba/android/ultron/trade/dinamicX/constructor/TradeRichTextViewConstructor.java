package com.alibaba.android.ultron.trade.dinamicX.constructor;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fpd;
import tb.kge;

/* loaded from: classes2.dex */
public class TradeRichTextViewConstructor extends DTextViewConstructor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String D_RICH_TEXT = "dRichText";
    private static final String EVENT = "event";
    private static final String E_OPEN_URL = "openUrl";
    private static final String STYLE = "style";
    private static final String S_BOLD = "bold";
    private static final String S_COLOR = "color";
    private static final String S_ITALIC = "italic";
    private static final String S_SIZE = "size";
    private static final String S_STRIKE_THROUGH = "strikeThrough";
    private static final String TEXT = "text";
    private static final String TV_TEXT_COLOR = "dTextColor";
    public static final String VIEW_TAG = "TradeRichTextView";

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2655a;
        public int b;
        public int c = 33;
        public List<Object> d = new ArrayList();

        static {
            kge.a(305415472);
        }
    }

    static {
        kge.a(1609185054);
    }

    public static /* synthetic */ Object ipc$super(TradeRichTextViewConstructor tradeRichTextViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor
    public void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{this, textView, str});
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        TextView textView = new TextView(context, attributeSet);
        setMovement(textView);
        return textView;
    }

    private void setTextInternal(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd1435", new Object[]{this, textView, charSequence});
        } else if (textView == null || charSequence == null) {
        } else {
            textView.setText(charSequence);
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        TextView textView = null;
        if (view instanceof TextView) {
            textView = (TextView) view;
        }
        if (!arrayList.contains(D_RICH_TEXT)) {
            return;
        }
        Object obj = map.get(D_RICH_TEXT);
        if (obj == null) {
            setTextInternal(textView, "");
            return;
        }
        try {
            setTextInternal(textView, getRichText(map, JSONObject.parseArray(obj.toString())));
        } catch (Throwable unused) {
        }
    }

    private void setMovement(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6180d20c", new Object[]{this, textView});
        } else if (textView == null) {
        } else {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private SpannableString getRichText(Map<String, Object> map, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("8ed4dbb1", new Object[]{this, map, jSONArray});
        }
        String str = "";
        if (jSONArray != null) {
            ArrayList<a> arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("text");
                    if (!StringUtils.isEmpty(string)) {
                        str = str + string;
                        a styleSpan = getStyleSpan(map, jSONObject, str, string);
                        if (styleSpan != null) {
                            arrayList.add(styleSpan);
                        }
                        a eventSpan = getEventSpan(map, jSONObject, str, string, styleSpan);
                        if (eventSpan != null) {
                            arrayList.add(eventSpan);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                SpannableString spannableString = new SpannableString(str);
                for (a aVar : arrayList) {
                    for (Object obj : aVar.d) {
                        spannableString.setSpan(obj, aVar.f2655a, aVar.b, aVar.c);
                    }
                }
                return spannableString;
            }
        }
        return new SpannableString(str);
    }

    private JSONObject getStyleObj(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("350a9ced", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("style");
    }

    private Object getColorSpan(JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3901ba60", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (a2 = com.alibaba.android.ultron.trade.utils.b.a(jSONObject.getString("color"), -1)) != -1) {
            return new ForegroundColorSpan(a2);
        }
        return null;
    }

    private Object getSizeSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("54e33caa", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new RelativeSizeSpan(Float.parseFloat(jSONObject.getString("size")));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Object getBoldSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7694aa2e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("bold"))) {
            return null;
        }
        return new StyleSpan(1);
    }

    private Object getItalicSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87b84899", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("italic"))) {
            return null;
        }
        return new StyleSpan(2);
    }

    private Object getStrikeThroughSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7c773b0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString(S_STRIKE_THROUGH))) {
            return null;
        }
        return new StrikethroughSpan();
    }

    private JSONObject getEventObj(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("82e730d6", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("event");
    }

    private Object getOpenUrlSpan(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb8086ff", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        return new b(string, i);
    }

    private a getStyleSpan(Map<String, Object> map, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5dfb2c5f", new Object[]{this, map, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject styleObj = getStyleObj(jSONObject);
        a aVar = new a();
        aVar.f2655a = str.indexOf(str2);
        aVar.b = aVar.f2655a + str2.length();
        Object sizeSpan = getSizeSpan(styleObj);
        if (sizeSpan != null) {
            aVar.d.add(sizeSpan);
        }
        Object colorSpan = getColorSpan(styleObj);
        if (colorSpan != null) {
            aVar.d.add(colorSpan);
        }
        Object boldSpan = getBoldSpan(styleObj);
        if (boldSpan != null) {
            aVar.d.add(boldSpan);
        }
        Object italicSpan = getItalicSpan(styleObj);
        if (italicSpan != null) {
            aVar.d.add(italicSpan);
        }
        Object strikeThroughSpan = getStrikeThroughSpan(styleObj);
        if (strikeThroughSpan != null) {
            aVar.d.add(strikeThroughSpan);
        }
        if (aVar.d.size() <= 0) {
            return null;
        }
        return aVar;
    }

    private a getEventSpan(Map<String, Object> map, JSONObject jSONObject, String str, String str2, a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8656c8e2", new Object[]{this, map, jSONObject, str, str2, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject eventObj = getEventObj(jSONObject);
        a aVar2 = new a();
        aVar2.f2655a = str.indexOf(str2);
        aVar2.b = aVar2.f2655a + str2.length();
        ForegroundColorSpan richTextColor = getRichTextColor(aVar);
        int i = -16776961;
        if (map != null && (obj = map.get("dTextColor")) != null) {
            i = com.alibaba.android.ultron.trade.utils.b.a(obj.toString(), -16776961);
        }
        if (richTextColor != null) {
            i = richTextColor.getForegroundColor();
        }
        Object openUrlSpan = getOpenUrlSpan(eventObj, i);
        if (openUrlSpan != null) {
            aVar2.d.add(openUrlSpan);
        }
        if (aVar2.d.size() <= 0) {
            return null;
        }
        return aVar2;
    }

    private ForegroundColorSpan getRichTextColor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("2d7fda5c", new Object[]{this, aVar});
        }
        if (aVar != null && aVar.d != null && aVar.d.size() > 0) {
            for (Object obj : aVar.d) {
                if (obj instanceof ForegroundColorSpan) {
                    return (ForegroundColorSpan) obj;
                }
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2656a;
        private int b;

        static {
            kge.a(-561643085);
        }

        public b(String str, int i) {
            this.f2656a = str;
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
            } else {
                t.a().a(view.getContext()).a(this.f2656a);
            }
        }
    }
}
