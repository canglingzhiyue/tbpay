package com.alibaba.ability.impl.contacts;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bh;
import com.taobao.android.abilityidl.ability.bi;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    static {
        kge.a(-1456591025);
        INSTANCE = new b();
    }

    private b() {
    }

    @JvmStatic
    public static final List<a> a(Context context, String str, String str2, String str3, Object obj) {
        String[] strArr;
        String str4;
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffaed06d", new Object[]{context, str, str2, str3, obj});
        }
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            if (!StringUtils.isEmpty(str)) {
                String[] strArr3 = new String[1];
                strArr3[0] = str == null ? "" : str;
                str4 = "_id= ?";
                strArr2 = strArr3;
            } else if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
                if (!StringUtils.isEmpty(str2)) {
                    strArr = new String[]{WXUtils.PERCENT + str2 + WXUtils.PERCENT};
                    str4 = "display_name like ?";
                } else {
                    strArr = new String[]{WXUtils.PERCENT + str3 + WXUtils.PERCENT};
                    str4 = "data1 like ?";
                }
                strArr2 = strArr;
            } else {
                strArr2 = new String[]{WXUtils.PERCENT + str2 + WXUtils.PERCENT, WXUtils.PERCENT + str3 + WXUtils.PERCENT};
                str4 = "display_name like ? AND data1 like ?";
            }
            Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, c.PHONES_PROJECTION, str4, strArr2, null);
            if (query == null) {
                ErrorResult errorResult = new ErrorResult("UNKNOWN_ERROR", "cursor == null", (Map) null, 4, (o) null);
                if (obj != null && (obj instanceof bh)) {
                    ((bh) obj).a(errorResult);
                } else if (obj != null && (obj instanceof bi)) {
                    ((bi) obj).a(errorResult);
                }
                return null;
            }
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!StringUtils.isEmpty(string) || !StringUtils.isEmpty(string2)) {
                    a aVar = new a();
                    aVar.f1873a = string;
                    aVar.b = string2;
                    arrayList.add(aVar);
                }
            }
            ArrayList arrayList2 = arrayList;
            try {
                query.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return arrayList2;
        } catch (Throwable th2) {
            try {
                ErrorResult errorResult2 = new ErrorResult("UNKNOWN_ERROR", th2.toString(), (Map) null, 4, (o) null);
                if (obj != null && (obj instanceof bh)) {
                    ((bh) obj).a(errorResult2);
                } else if (obj != null && (obj instanceof bi)) {
                    ((bi) obj).a(errorResult2);
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                return arrayList;
            } catch (Throwable th4) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                throw th4;
            }
        }
    }
}
