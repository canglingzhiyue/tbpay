package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.iy;
import java.util.Map;

/* loaded from: classes9.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static a f24635a;

    /* renamed from: a  reason: collision with other field name */
    private static b f915a;

    /* loaded from: classes9.dex */
    public interface a {
        Map<String, String> a(Context context, iy iyVar);

        /* renamed from: a  reason: collision with other method in class */
        void m2268a(Context context, iy iyVar);

        boolean a(Context context, iy iyVar, boolean z);
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a(iy iyVar);

        void a(String str);

        /* renamed from: a  reason: collision with other method in class */
        boolean m2269a(iy iyVar);
    }

    public static Map<String, String> a(Context context, iy iyVar) {
        a aVar = f24635a;
        if (aVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pepa listener or container is null");
            return null;
        }
        return aVar.a(context, iyVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m2266a(Context context, iy iyVar) {
        a aVar = f24635a;
        if (aVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("handle msg wrong");
        } else {
            aVar.m2268a(context, iyVar);
        }
    }

    public static void a(iy iyVar) {
        b bVar = f915a;
        if (bVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pepa clearMessage is null");
        } else {
            bVar.a(iyVar);
        }
    }

    public static void a(String str) {
        b bVar = f915a;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }

    public static boolean a(Context context, iy iyVar, boolean z) {
        a aVar = f24635a;
        if (aVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pepa judement listener or container is null");
            return false;
        }
        return aVar.a(context, iyVar, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2267a(iy iyVar) {
        b bVar = f915a;
        if (bVar == null || iyVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pepa handleReceiveMessage is null");
            return false;
        }
        return bVar.m2269a(iyVar);
    }
}
