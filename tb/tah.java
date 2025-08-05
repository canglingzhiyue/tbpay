package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import tb.tah;

/* loaded from: classes5.dex */
public class tah extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID;

    public static /* synthetic */ Object ipc$super(tah tahVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(360684626);
        DX_PARSER_ID = fxa.a("detailGetImageRadio");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0) {
            return 0;
        }
        String str = null;
        if (objArr[0] instanceof String) {
            str = (String) objArr[0];
        }
        float a2 = tal.a(str);
        if (a2 <= 0.0f) {
            a(dXRuntimeContext, str);
        }
        return Float.valueOf(a2);
    }

    private void a(DXRuntimeContext dXRuntimeContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d039b63", new Object[]{this, dXRuntimeContext, str});
        } else if (dXRuntimeContext == null || dXRuntimeContext.m() == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                final String v = ((TTDetailBaseActivity) dXRuntimeContext.m()).j().v();
                ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.transfer.handler.DXDataParserDetailGetImageRadio$1
                    {
                        tah.this = this;
                        put("itemId", v);
                        put("imageUrl", str);
                    }
                }, -800007, "image ratio culculate error");
            } catch (Exception e) {
                i.a("DXDataParserDetailGetImageRadio", "image ratio culculate error", e);
            }
        }
    }
}
