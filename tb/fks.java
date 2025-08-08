package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.b;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f28016a = fky.f(Global.getApplication(), "");

    /* renamed from: tb.fks$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28017a = new int[NewDetailScreenConfig.ScreenType.values().length];

        static {
            try {
                f28017a[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28017a[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28017a[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(206626131);
    }

    public void a(NewDetailScreenConfig.ScreenType screenType) {
        Map<String, ?> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409f76e5", new Object[]{this, screenType});
        } else if (screenType == null) {
            ctu.a();
        } else {
            if (this.f28016a == null) {
                this.f28016a = new HashMap();
            }
            int i = AnonymousClass1.f28017a[screenType.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 || (f = fky.f(Global.getApplication(), NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.getUIStrategyTag())) == null) {
                    return;
                }
                this.f28016a.putAll(f);
                return;
            }
            Map<String, ?> f2 = fky.f(Global.getApplication(), NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.getUIStrategyTag());
            if (f2 != null) {
                this.f28016a.putAll(f2);
            }
            Map<String, ?> f3 = fky.f(Global.getApplication(), NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.getUIStrategyTag());
            if (f3 == null) {
                return;
            }
            this.f28016a.putAll(f3);
        }
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b7e2423c", new Object[]{this, str});
        }
        b bVar = new b();
        if (this.f28016a == null) {
            bVar.f11521a = -1;
            return bVar;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                bVar.f11521a = -1;
                return bVar;
            }
            Map<String, Object> map = this.f28016a;
            Object obj = map.get(str + fky.b);
            if (obj != null) {
                bVar.f11521a = ((Integer) obj).intValue();
            }
            Map<String, Object> map2 = this.f28016a;
            Object obj2 = map2.get(str + fky.f28023a);
            if (obj2 != null) {
                bVar.b = (String) obj2;
            }
            Map<String, Object> map3 = this.f28016a;
            Object obj3 = map3.get(str + fky.c);
            if (obj3 != null) {
                bVar.c = ((Integer) obj3).intValue();
            }
            Map<String, Object> map4 = this.f28016a;
            Object obj4 = map4.get(str + fky.d);
            if (obj4 != null) {
                bVar.d = ((Integer) obj4).intValue();
            }
            Map<String, Object> map5 = this.f28016a;
            Object obj5 = map5.get(str + fky.k);
            if (obj5 != null) {
                bVar.f = ((Integer) obj5).intValue();
            }
            Map<String, Object> map6 = this.f28016a;
            Object obj6 = map6.get(str + fky.l);
            if (obj6 != null) {
                bVar.g = ((Integer) obj6).intValue();
            }
            return bVar;
        } catch (Exception e) {
            fjt.a("new_detail异常", "getPlaceHolderImageModelCache解析类型异常, scene: " + str, e);
            bVar.f11521a = -1;
            return bVar;
        }
    }
}
