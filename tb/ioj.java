package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class ioj extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFALUT_COLOR = "";
    public static final int DEFAULT_ALPHA = 255;
    public static final long DX_EVENT_ID;

    static {
        kge.a(-485187855);
        DX_EVENT_ID = fxa.a("rgb2hex");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher((String) objArr[0]);
            if (!matcher.find()) {
                return "";
            }
            String[] split = matcher.group(1).split(",");
            if (split.length < 3) {
                return "";
            }
            int parseInt = Integer.parseInt(split[0].trim());
            int parseInt2 = Integer.parseInt(split[1].trim());
            int parseInt3 = Integer.parseInt(split[2].trim());
            int i = 255;
            if (split.length == 4) {
                i = 255 - ((int) (Float.parseFloat(split[3]) * 255.0f));
            }
            return String.format("#%02X%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3));
        } catch (Exception e) {
            i.a("DXDataParserRgb2hex", "rgb2hex parse error", e);
            return "";
        }
    }
}
