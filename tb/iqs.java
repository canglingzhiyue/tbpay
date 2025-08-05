package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.oversea.homepage.common.tschedule.a;

/* loaded from: classes7.dex */
public class iqs extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_PLUSRENDERBUCKET = -6887327006568465774L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONObject parseObject = JSONObject.parseObject(objArr[0].toString());
        String string = parseObject.getString("targetUrl");
        if (TextUtils.isEmpty(string)) {
            return objArr[0];
        }
        Uri.parse(string).buildUpon();
        return TextUtils.isEmpty(a.a().d()) ? objArr[0] : parseObject;
    }
}
