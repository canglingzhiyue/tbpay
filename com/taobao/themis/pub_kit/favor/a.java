package com.taobao.themis.pub_kit.favor;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.b;
import com.taobao.themis.pub_kit.favor.AddFavorClient;
import com.taobao.themis.pub_kit.favor.CheckFavorClient;
import com.taobao.themis.pub_kit.favor.RemoveFavorClient;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_UPDATE_FAVOR = "tms_broadcast_update_favor";

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Boolean> f22782a;

    static {
        kge.a(1037146325);
        f22782a = new HashMap<>();
    }

    public static void a(String str, b<Boolean, Boolean> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef863bc", new Object[]{str, bVar});
        } else {
            new CheckFavorClient(new CheckFavorClient.CheckFavorRequestParams(str), bVar).a();
        }
    }

    public static void a(String str, String str2, boolean z, b<Boolean, Boolean> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163c1162", new Object[]{str, str2, new Boolean(z), bVar});
        } else {
            new AddFavorClient(new AddFavorClient.AddFavorParam(str, str2, z), bVar).a();
        }
    }

    public static void b(String str, String str2, boolean z, b<Boolean, Boolean> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3d6301", new Object[]{str, str2, new Boolean(z), bVar});
        } else {
            new RemoveFavorClient(new RemoveFavorClient.RemoveFavorParam(str, str2, z), bVar).a();
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (f22782a.containsKey(str)) {
            return f22782a.get(str).booleanValue();
        }
        return false;
    }

    public static void a(String str, Boolean bool, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccde64d", new Object[]{str, bool, context});
            return;
        }
        try {
            a(str, bool.booleanValue(), context);
            f22782a.put(str, bool);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79678126", new Object[]{str, new Boolean(z), context});
            return;
        }
        Intent intent = new Intent(BROADCAST_UPDATE_FAVOR);
        intent.putExtra("appId", str);
        intent.putExtra("isFavored", z);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{str, new Boolean(z)}) : z ? "light".equals(str) ? "https://gw.alicdn.com/imgextra/i4/O1CN01qn1s5w1gbmluhohF5_!!6000000004161-2-tps-90-90.png" : "https://gw.alicdn.com/imgextra/i4/O1CN01JA3zsK1wtDhcluMIo_!!6000000006365-2-tps-90-90.png" : "light".equals(str) ? "https://gw.alicdn.com/imgextra/i3/O1CN01EzzeTS1gWkPiqTOfC_!!6000000004150-2-tps-90-90.png" : "https://gw.alicdn.com/imgextra/i3/O1CN01F7301W26qbb9nRDRu_!!6000000007713-2-tps-90-90.png";
    }
}
