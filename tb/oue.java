package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class oue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends oud>> f32425a;

    static {
        kge.a(2026184600);
        HashMap hashMap = new HashMap();
        f32425a = hashMap;
        hashMap.put(ComponentType.CHANNEL_ITEM.desc, oug.class);
        f32425a.put(ComponentType.CONTACT_ITEM.desc, ouh.class);
    }

    public static ouf a(Context context, int i, boolean z, JSONObject jSONObject) {
        try {
            Class<? extends oud> cls = f32425a.get(ComponentType.getTypeByIndex(i).desc);
            if (cls == null) {
                return null;
            }
            Constructor<? extends oud> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return new ouf(declaredConstructor.newInstance(context), z, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
