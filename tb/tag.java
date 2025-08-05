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
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class tag extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_CANSHOWINSINGLELINE;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33984a;
        public int b;
        public int c = 33;
        public List<Object> d = new ArrayList();

        static {
            kge.a(-1458532941);
        }
    }

    public static /* synthetic */ Object ipc$super(tag tagVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(944597179);
        long a2 = fxa.a("canShowInSingleLine");
        DX_EVENT_ID = a2;
        DX_PARSER_CANSHOWINSINGLELINE = a2;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2 || (a2 = a(objArr)) <= 0) {
            return false;
        }
        JSONArray jSONArray = objArr[1] instanceof JSONArray ? (JSONArray) objArr[1] : null;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            return Boolean.valueOf(a(gbg.a(dXRuntimeContext.D(), com.taobao.tao.navigation.a.b(), a2), a(jSONArray, dXRuntimeContext.D())));
        }
        return false;
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
        } catch (Throwable th) {
            i.a("DXDataParserCanShowInSingleLine", "getComponentWidth fail", th);
            return 0;
        }
    }

    private boolean a(int i, SpannableString spannableString) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e61e11a1", new Object[]{this, new Integer(i), spannableString})).booleanValue() : i > 0 && spannableString != null && new DynamicLayout(spannableString, spannableString, new TextPaint(), i, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, true).getLineCount() <= 1;
    }

    private SpannableString a(JSONArray jSONArray, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("762f477", new Object[]{this, jSONArray, dinamicXEngine});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList<a> arrayList = new ArrayList();
        int size = jSONArray.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                if ("image".equals(jSONObject.getString("type"))) {
                    String string = jSONObject.getString("imageUrl");
                    if (!TextUtils.isEmpty(string)) {
                        str = str + string;
                        a a2 = tal.a(jSONObject.getJSONObject("style"), str, string, dinamicXEngine);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        str = str + string2;
                        a a3 = tam.a(jSONObject.getJSONObject("style"), str, string2, dinamicXEngine);
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
        for (a aVar : arrayList) {
            for (Object obj : aVar.d) {
                spannableString.setSpan(obj, aVar.f33984a, aVar.b, aVar.c);
            }
        }
        return spannableString;
    }
}
