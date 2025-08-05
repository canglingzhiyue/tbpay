package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.l;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes5.dex */
public class hgy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CALLFUN = 4728576668438119884L;

    static {
        kge.a(-533494065);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null && objArr.length != 0) {
            if ("enableNewTimeMove".equals(objArr[0]) && objArr.length >= 2 && objArr[1] != null) {
                if (a.a().i() != null) {
                    return Boolean.valueOf(a.a().i().b(null, (LiveItem) JSONObject.parseObject(objArr[1].toString(), LiveItem.class)));
                }
                return false;
            }
            if ("getWidthFromUrl".equals(objArr[0]) && objArr.length >= 3 && objArr[1] != null && objArr[2] != null) {
                try {
                    obj = objArr[1].toString();
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(obj)) {
                    int lastIndexOf = obj.lastIndexOf("-", obj.lastIndexOf("-") - 1) + 1;
                    int lastIndexOf2 = obj.lastIndexOf(".");
                    String[] split = ((lastIndexOf == 0 || lastIndexOf2 == -1) ? "0" : obj.substring(lastIndexOf, lastIndexOf2)).split("-");
                    if (split.length == 2 && Integer.parseInt(objArr[2].toString()) > 0 && Integer.parseInt(split[0]) > 0 && Integer.parseInt(split[1]) > 0) {
                        if (Integer.parseInt(split[1]) > 0) {
                            return Integer.valueOf((int) (Integer.parseInt(split[0]) / (Integer.parseInt(split[1]) / Integer.parseInt(objArr[2].toString()))));
                        }
                    }
                    return 0;
                }
            }
            if ("getFormatTime".equals(objArr[0])) {
                long b = objArr.length > 1 ? l.b((String) objArr[1]) : 0L;
                if (objArr.length > 2) {
                    str = (String) objArr[2];
                }
                return (b <= 0 || TextUtils.isEmpty(str)) ? "" : new SimpleDateFormat(str).format(new Date(b));
            } else if ("isDebugTBLive".equals(objArr[0])) {
                if (dXRuntimeContext == null) {
                    return true;
                }
                return Boolean.valueOf(b.d(dXRuntimeContext.m()));
            }
        }
        return null;
    }
}
