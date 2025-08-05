package com.alibaba.openid.device;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzi;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1509769216);
        kge.a(981749981);
    }

    @Override // tb.bzi
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("device_ids_grndid"));
            }
            query.close();
        }
        return str;
    }
}
