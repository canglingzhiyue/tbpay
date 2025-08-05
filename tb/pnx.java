package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taolive.room.utils.aw;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class pnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(439612834);
    }

    public static /* synthetic */ Map a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("55f10be5", new Object[]{baseSectionModel}) : b(baseSectionModel);
    }

    public static void a(final String str, poo pooVar, RRichTextView rRichTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70337939", new Object[]{str, pooVar, rRichTextView});
            return;
        }
        final BaseSectionModel<?> a2 = pooVar.a();
        if (a2 == null || a2.containsKey("isTitleTracked")) {
            return;
        }
        a2.put("isTitleTracked", (Object) true);
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", (Object) (rRichTextView.getTextSize() + "px"));
        jSONObject.put("iconWidth", (Object) (rRichTextView.getIconWidth() + "px"));
        jSONObject.put("titleWidth", (Object) (rRichTextView.getFirstLineTextWidth() + "px"));
        jSONObject.put("width", (Object) (rRichTextView.getMeasuredWidth() + "px"));
        jSONObject.put("actualLines", (Object) Integer.valueOf(rRichTextView.getTitleDisplayLineCount()));
        jSONObject.put("lines", (Object) Integer.valueOf(rRichTextView.getTitleLineCount()));
        Application a3 = lcz.a();
        if (a3 != null) {
            jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(gbg.b(a3)));
            jSONObject.put("screenHeight", (Object) Integer.valueOf(gbg.c(a3)));
            jSONObject.put("density", (Object) Float.valueOf(a3.getResources().getDisplayMetrics().density));
        }
        final String originalText = rRichTextView.getOriginalText();
        final String displayText = rRichTextView.getDisplayText();
        ljd.a().d(new Runnable() { // from class: tb.pnx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    JSONObject.this.put("title", (Object) URLEncoder.encode(originalText, "UTF-8"));
                    JSONObject.this.put("displayTitle", (Object) URLEncoder.encode(displayText, "UTF-8"));
                    JSONObject.this.putAll(pnx.a(a2));
                } catch (UnsupportedEncodingException e) {
                    ldf.a("TitleInfoUserTraceReporter", "title 或 displayTitle 编码出错", e);
                }
                ldl.a(str, 2201, "InfoFlowItemTitleExpose", null, null, ljh.a((String) null, JSONObject.this));
                ldf.d("TitleInfoUserTraceReporter", "report:" + JSONObject.this.toString());
            }
        });
    }

    private static Map<String, String> b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4781d26", new Object[]{baseSectionModel});
        }
        JSONObject args = baseSectionModel.getArgs();
        HashMap hashMap = new HashMap();
        if (args != null) {
            hashMap.put(aw.PARAM_PVID, args.getString(aw.PARAM_PVID));
            JSONObject a2 = a(args);
            if (a2 != null) {
                hashMap.put(kox.X_OBJECT_ID, a2.getString(kox.X_OBJECT_ID));
                hashMap.put("x_item_ids", a2.getString("x_item_ids"));
                hashMap.put("x_object_type", a2.getString("x_object_type"));
            }
        }
        return hashMap;
    }

    private static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("utLogMapEdge");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        String string = jSONObject.getString("utLogMap");
        try {
            return !TextUtils.isEmpty(string) ? JSON.parseObject(URLDecoder.decode(string, "utf-8")) : jSONObject2;
        } catch (UnsupportedEncodingException e) {
            ldf.a("TitleInfoUserTraceReporter", "getAlgorithmParams error", e);
            return jSONObject2;
        }
    }
}
