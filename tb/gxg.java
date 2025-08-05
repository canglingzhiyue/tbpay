package tb;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.navigation.a;
import java.util.ArrayList;
import tb.dxh;

/* loaded from: classes4.dex */
public class gxg extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID;

    public static /* synthetic */ Object ipc$super(gxg gxgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1434101981);
        DX_PARSER_ID = fxa.a("richTextLine");
    }

    public gxg() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.title.DxDataParserRichTextLine");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2 || (a2 = a(objArr)) <= 0) {
            return 0;
        }
        JSONArray jSONArray = objArr[1] instanceof JSONArray ? (JSONArray) objArr[1] : null;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            return Integer.valueOf(a(gbg.a(dXRuntimeContext.D(), a.b(), a2), a(jSONArray, dXRuntimeContext.D())));
        }
        return 0;
    }

    private int a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63135bc", new Object[]{this, objArr})).intValue();
        }
        if (!(objArr[0] instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) objArr[0]);
        } catch (Exception e) {
            i.a("DxDataParserRichTextLine", "getComponentWidth fail", e);
            return 0;
        }
    }

    private int a(int i, SpannableString spannableString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e61e1190", new Object[]{this, new Integer(i), spannableString})).intValue();
        }
        if (i > 0 && spannableString != null) {
            return new DynamicLayout(spannableString, spannableString, new TextPaint(), i, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, true).getLineCount();
        }
        return 0;
    }

    private SpannableString a(JSONArray jSONArray, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("762f477", new Object[]{this, jSONArray, dinamicXEngine});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList<dxh.a> arrayList = new ArrayList();
        int size = jSONArray.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                if ("image".equals(jSONObject.getString("type"))) {
                    String string = jSONObject.getString("imageUrl");
                    if (!TextUtils.isEmpty(string)) {
                        str = str + string;
                        dxh.a a2 = dxi.a(jSONObject.getJSONObject("style"), str, string, dinamicXEngine);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        str = str + string2;
                        dxh.a a3 = dxj.a(jSONObject.getJSONObject("style"), str, string2, dinamicXEngine);
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        for (dxh.a aVar : arrayList) {
            for (Object obj : aVar.d) {
                spannableString.setSpan(obj, aVar.f27062a, aVar.b, aVar.c);
            }
        }
        return spannableString;
    }
}
