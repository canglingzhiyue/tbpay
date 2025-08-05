package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public class lpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1958540844);
    }

    public int a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue() : (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
    }

    public int b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
        }
        return (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public BaseSectionModel<?> a(BaseSectionModel<?> baseSectionModel, Context context, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("fdbe0a62", new Object[]{this, baseSectionModel, context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return baseSectionModel;
        }
        if (z && ext.getBooleanValue("hasProcessed")) {
            return baseSectionModel;
        }
        float f = i2;
        ext.put("hostHeight", (Object) Integer.valueOf(gbg.c(context, f)));
        float f2 = i;
        ext.put("hostWidth", (Object) Integer.valueOf(gbg.c(context, f2)));
        ext.put("nativeHeight", (Object) Integer.valueOf(i2));
        ext.put("nativeWidth", (Object) Integer.valueOf(i));
        float f3 = i3;
        ext.put("offsetX", (Object) Integer.valueOf(gbg.c(context, f3)));
        float f4 = i4;
        ext.put("offsetY", (Object) Integer.valueOf(gbg.c(context, f4)));
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("hostHeight", (Object) Integer.valueOf(gbg.c(context, f)));
        jSONObject2.put("hostWidth", (Object) Integer.valueOf(gbg.c(context, f2)));
        jSONObject2.put("nativeHeight", (Object) Integer.valueOf(i2));
        jSONObject2.put("nativeWidth", (Object) Integer.valueOf(i));
        jSONObject2.put("offsetX", (Object) Integer.valueOf(gbg.c(context, f3)));
        jSONObject2.put("offsetY", (Object) Integer.valueOf(gbg.c(context, f4)));
        ext.put("clientCache", (Object) jSONObject2);
        ext.put("hasProcessed", (Object) true);
        return baseSectionModel;
    }
}
