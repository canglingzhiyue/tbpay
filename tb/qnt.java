package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.BlockModel;
import com.taobao.tbpoplayer.nativerender.dsl.CounterModel;
import com.taobao.tbpoplayer.nativerender.dsl.HotSpotModel;
import com.taobao.tbpoplayer.nativerender.dsl.ImageModel;
import com.taobao.tbpoplayer.nativerender.dsl.TextModel;
import com.taobao.tbpoplayer.nativerender.dsl.VideoModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.render.component.a;
import com.taobao.tbpoplayer.nativerender.render.component.c;
import com.taobao.tbpoplayer.nativerender.render.component.d;
import com.taobao.tbpoplayer.nativerender.render.component.f;
import com.taobao.tbpoplayer.nativerender.render.component.g;
import com.taobao.tbpoplayer.nativerender.render.component.h;

/* loaded from: classes8.dex */
public class qnt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_BLOCK = "Block";
    public static final String TYPE_CLOSE_BTN = "CloseBtn";
    public static final String TYPE_COUNTER = "Counter";
    public static final String TYPE_HOTSPOT = "HotSpot";
    public static final String TYPE_IMAGE = "Image";
    public static final String TYPE_TEXT = "Text";
    public static final String TYPE_VIDEO = "Video";

    static {
        kge.a(1568000761);
    }

    public static c a(JSONObject jSONObject, e eVar, boolean z, boolean z2) {
        String string;
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("96d0404b", new Object[]{jSONObject, eVar, new Boolean(z), new Boolean(z2)});
        }
        try {
            string = jSONObject.getString("type");
            c = eVar.a().c();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopComponentFactory.createPopComponent.error", th);
            eVar.a("CreatePopComponentError", "");
        }
        if (!a(string, c)) {
            com.alibaba.poplayer.utils.c.a("PopComponentFactory.createPopComponent.isComponentTypeMatchField=false.type=" + string + ".engineField=" + c, new Object[0]);
            return null;
        } else if (TYPE_IMAGE.equals(string)) {
            return new f(eVar, (ImageModel) jSONObject.toJavaObject(ImageModel.class), z2);
        } else {
            if (TYPE_TEXT.equals(string)) {
                return new g(eVar, (TextModel) jSONObject.toJavaObject(TextModel.class), z2);
            }
            if (TYPE_COUNTER.equals(string)) {
                return new d(eVar, (CounterModel) jSONObject.toJavaObject(CounterModel.class), z2);
            }
            if (TYPE_BLOCK.equals(string)) {
                return new a(eVar, (BlockModel) jSONObject.toJavaObject(BlockModel.class), z2);
            }
            if ("Video".equals(string)) {
                return new h(eVar, (VideoModel) jSONObject.toJavaObject(VideoModel.class), z2);
            }
            if (!z && TYPE_HOTSPOT.equals(string)) {
                return new com.taobao.tbpoplayer.nativerender.render.component.e(eVar, (HotSpotModel) jSONObject.toJavaObject(HotSpotModel.class));
            }
            return null;
        }
    }

    private static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue() : i != 1 || !"Video".equals(str);
    }
}
