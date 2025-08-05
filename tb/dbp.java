package tb;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class dbp {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, dbq> f26665a = new LruCache<>(1000);

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final dbp f26666a;

        static {
            kge.a(-1249692109);
            f26666a = new dbp();
        }
    }

    static {
        kge.a(476911350);
    }

    public dbp() {
        new AtomicBoolean(false);
    }

    public Bundle a(Context context, String str, String str2, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr) {
        r0 = "dispatch:" + str + ", targetClassName:" + str2 + ", methodId:" + i;
        dbq dbqVar = this.f26665a.get(str2);
        if (dbqVar != null) {
            try {
                return dbqVar.a(context, str, iBridgeTargetIdentify, i, objArr);
            } catch (Exception e) {
                String str3 = "dispatcher:" + dbqVar.getClass().getName();
                dby.e.a(str2, str, 101008, e.getMessage());
                return com.opos.process.bridge.provider.a.a(101008, "targetClassName:" + str2);
            }
        }
        String str4 = "com.opos.process.bridge.dispatch." + str2.substring(str2.lastIndexOf(".") + 1) + "$Dispatcher";
        try {
            Class<?> cls = Class.forName(str4);
            if (!dbq.class.isAssignableFrom(cls)) {
                return com.opos.process.bridge.provider.a.a(101007, "dispatch");
            }
            dbq dbqVar2 = (dbq) cls.newInstance();
            this.f26665a.put(str2, dbqVar2);
            return dbqVar2.a(context, str, iBridgeTargetIdentify, i, objArr);
        } catch (ClassNotFoundException e2) {
            String str5 = "dispatcher:" + str4;
            dby.e.a(str2, str, 102001, e2.getMessage());
            return com.opos.process.bridge.provider.a.a(102001, "targetClassName:" + str2);
        } catch (Exception e3) {
            String str6 = "dispatcher:" + str4;
            dby.e.a(str2, str, 101008, e3.getMessage());
            return com.opos.process.bridge.provider.a.a(101008, "targetClassName:" + str2);
        }
    }
}
