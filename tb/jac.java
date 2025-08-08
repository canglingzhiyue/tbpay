package tb;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class jac extends dlg<dlr> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECKLOCATIONSERVICE = "3520998369804419612";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static Field f29428a;

    static {
        kge.a(864825881);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(jac jacVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-413461983);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, dlr abilityRuntimeContext, dll callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("8e026c4b", new Object[]{this, dlhVar, abilityRuntimeContext, callback});
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(callback, "callback");
        Context a2 = abilityRuntimeContext.a();
        q.b(a2, "abilityRuntimeContext.context");
        dla dlaVar = new dla(a(a2));
        callback.callback("success", dlaVar);
        return dlaVar;
    }

    private final JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        Object systemService = context.getSystemService("location");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        jSONObject.put((JSONObject) "isOpen", a((LocationManager) systemService) ? "true" : "false");
        return jSONObject;
    }

    private final boolean a(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                if (f29428a == null) {
                    f29428a = LocationManager.class.getDeclaredField("mContext");
                }
                Field field = f29428a;
                if (field != null) {
                    field.setAccessible(true);
                    Object obj = field.get(locationManager);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    Context context = (Context) obj;
                    return Build.VERSION.SDK_INT == 19 ? Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0 : !StringUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
                }
            } catch (Throwable unused) {
            }
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
