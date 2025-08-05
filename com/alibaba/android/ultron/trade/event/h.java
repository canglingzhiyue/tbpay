package com.alibaba.android.ultron.trade.event;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String ITEM_HIDE_DATE = "ItemHideDate";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f2662a;
    private static boolean b;

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        a(this.h);
        this.f.y().n();
        b(this.e, this.h);
    }

    private static void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getData() == null) {
        } else {
            iDMComponent.getData().put("status", "hidden");
        }
    }

    private void b(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ff54b5", new Object[]{this, context, iDMComponent});
        } else if (context == null || iDMComponent == null) {
        } else {
            long j = 0;
            try {
                j = Long.parseLong(b().getFields().getString("hideSeconds"));
            } catch (Exception unused) {
            }
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(new Date().getTime() + (j * 1000)));
            context.getSharedPreferences("HideItem", 0).edit().putString(iDMComponent.getKey(), format).apply();
            f2662a.put(iDMComponent.getKey(), format);
        }
    }

    private static Object c(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d13be37c", new Object[]{context, iDMComponent}) : (context == null || iDMComponent == null) ? "" : f2662a.get(iDMComponent.getKey());
    }

    public static void a(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d837af4", new Object[]{context, iDMComponent});
        } else if (context == null || iDMComponent == null || d(context, iDMComponent)) {
        } else {
            a(iDMComponent);
        }
    }

    static {
        kge.a(1498358987);
        f2662a = new HashMap();
        b = false;
    }

    private static boolean d(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f7083b", new Object[]{context, iDMComponent})).booleanValue();
        }
        if (!b) {
            b = true;
            f2662a.putAll(context.getSharedPreferences("HideItem", 0).getAll());
        }
        Object c = c(context, iDMComponent);
        if (c != null && !"".equals(c)) {
            try {
                return new Date().getTime() > new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse((String) c).getTime();
            } catch (ParseException unused) {
            }
        }
        return true;
    }
}
