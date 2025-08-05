package com.taobao.android.litecreator.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "LiteCreator";

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f13513a;

    static {
        kge.a(1165611841);
        f13513a = g.a();
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!f13513a) {
        } else {
            e(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else if (!f13513a) {
        } else {
            e(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
        } else if (!f13513a) {
        } else {
            e(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else {
            TLog.loge(MODULE_NAME, str, e(str, objArr));
        }
    }

    public static String e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21be5fc5", new Object[]{str, objArr});
        }
        if (objArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str + ResponseProtocolType.COMMENT);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    sb.append(riy.BLOCK_START_STR);
                    sb.append(entry.getKey());
                    sb.append(":");
                    sb.append(entry.getValue());
                    sb.append(riy.BLOCK_END_STR);
                }
            } else {
                sb.append(objArr[i]);
            }
            if (i < length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
